package org.javarosa.core.log;
/* loaded from: classes.dex */
public class FatalException extends WrappedException {
    public FatalException() {
        this("");
    }

    public FatalException(String str) {
        super(str);
    }

    public FatalException(Exception exc) {
        super(exc);
    }

    public FatalException(String str, Exception exc) {
        super(str, exc);
    }
}
