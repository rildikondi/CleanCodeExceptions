package refactorystep4;

import java.util.Iterator;

public interface ArgumentMarshaler {
    public abstract void set(Iterator<String> currentArgument)
            throws ArgsException;

    Object get();
}


