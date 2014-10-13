package na.okutane.api.cfg;

/**
 * @author <a href="mailto:dmitriy.g.matveev@gmail.com">Dmitriy Matveev</a>
 */
public class TypedValue implements RValue {
    protected final Type type;

    public TypedValue(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
