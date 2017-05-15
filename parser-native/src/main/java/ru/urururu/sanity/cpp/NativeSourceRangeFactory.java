package ru.urururu.sanity.cpp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ru.urururu.sanity.api.SourceRangeFactory;
import ru.urururu.sanity.api.cfg.SourceRange;
import ru.urururu.sanity.cpp.llvm.SWIGTYPE_p_LLVMOpaqueModule;
import ru.urururu.sanity.cpp.llvm.SWIGTYPE_p_LLVMOpaqueValue;
import ru.urururu.sanity.cpp.llvm.bitreader;
import ru.urururu.util.Coverage;

import java.io.File;

/**
 * @author <a href="mailto:dmitriy.g.matveev@gmail.com">Dmitry Matveev</a>
 */
@Component
public class NativeSourceRangeFactory extends SourceRangeFactory<SWIGTYPE_p_LLVMOpaqueValue> implements ParserListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(NativeSourceRangeFactory.class);

    private static final int DW_TAG_file_type = 786473;
    private static final int DW_TAG_lexical_block = 786443;

    private Long debugVersion;
    private Byte versionByte;

    public SourceRange getSourceRange(SWIGTYPE_p_LLVMOpaqueValue instruction) {
        int line = bitreader.SAGetInstructionDebugLocLine(instruction);
        if (versionByte == 3) {
            if (line != -1) {
                String filename = bitreader.SAGetInstructionDebugLocScopeFile(instruction);
                return getSourceRange(filename, line);
            }

            return null;
        }

        long id = bitreader.LLVMGetMDKindID("dbg", 3);
        SWIGTYPE_p_LLVMOpaqueValue node = bitreader.LLVMGetMetadata(instruction, id);

        if (node != null) {
            //deepDump(node);

            SWIGTYPE_p_LLVMOpaqueValue pair = getPair(node);

            if (pair != null) {
                String filename = bitreader.getMDString(bitreader.LLVMGetOperand(pair, 0));
                String directory = bitreader.getMDString(bitreader.LLVMGetOperand(pair, 1));
                if (new File(filename).isAbsolute()) {
                    return getSourceRange(filename, line);
                }
                return getSourceRange(new File(directory, filename).getAbsolutePath(), line);
            }
        }

        return null;
    }

    private SourceRange getSourceRange(String filename, int line) {
        if (!new File(filename).exists()) {
            return null;
        }

        Coverage.markAsCode(filename, line);
        return new SourceRange(filename, line);
    }

    private SWIGTYPE_p_LLVMOpaqueValue getPair(SWIGTYPE_p_LLVMOpaqueValue node) {
        int count = bitreader.LLVMGetNumOperands(node);
        if (count == 1) {
            return getPair(bitreader.LLVMGetOperand(node, 0));
        }

        if (LlvmUtils.checkTag(node, "0x29", DW_TAG_file_type, DW_TAG_lexical_block)) {
            return bitreader.LLVMGetOperand(node, 1);
        } else {
            return getPair(bitreader.LLVMGetOperand(node, 2));
        }
    }

    @Override
    public void onModuleStarted(SWIGTYPE_p_LLVMOpaqueModule module) {
        debugVersion = bitreader.SAGetDebugMetadataVersionFromModule(module);
        versionByte = debugVersion.byteValue();

        LOGGER.info("debugVersion = {}", Long.toHexString(debugVersion));
        LOGGER.info("versionByte = {}", versionByte);
    }

    @Override
    public void onModuleFinished(SWIGTYPE_p_LLVMOpaqueModule module) {
        debugVersion = null;
        versionByte = null;
    }
}
