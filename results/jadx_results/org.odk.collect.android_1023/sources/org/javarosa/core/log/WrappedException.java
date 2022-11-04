package org.javarosa.core.log;
/* loaded from: classes.dex */
public class WrappedException extends RuntimeException {
    Exception child;
    String message;

    public WrappedException(String str) {
        this(str, null);
    }

    public WrappedException(Exception exc) {
        this(null, exc);
    }

    public WrappedException(String str, Exception exc) {
        super(constructMessage(str, exc));
        this.message = str;
        this.child = exc;
    }

    public static String constructMessage(String str, Exception exc) {
        String str2 = "";
        if (str != null) {
            str2 = str2 + str;
        }
        if (exc != null) {
            str2 = str2 + (str != null ? " => " : "") + printException(exc);
        }
        if (str2.equals("")) {
            return "[exception]";
        }
        return str2;
    }

    public static String printException(Exception exc) {
        if (exc instanceof WrappedException) {
            return (exc instanceof FatalException ? "FATAL: " : "") + exc.getMessage();
        }
        return exc.getClass().getName() + "[" + exc.getMessage() + "]";
    }
}
