package ru.urururu.sanity.api;

import java.io.File;
import java.util.List;

/**
 * @author <a href="mailto:dmitriy.g.matveev@gmail.com">Dmitry Matveev</a>
 */
public interface BytecodeParser {
    List<Cfg> parse(File file);
}
