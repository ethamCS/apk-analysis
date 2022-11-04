package net.lingala.zip4j.exception;

import java.io.IOException;
/* loaded from: classes2.dex */
public class ZipException extends IOException {
    private static final long serialVersionUID = 1;
    private Type type;

    /* loaded from: classes2.dex */
    public enum Type {
        WRONG_PASSWORD,
        TASK_CANCELLED_EXCEPTION,
        CHECKSUM_MISMATCH,
        UNKNOWN_COMPRESSION_METHOD,
        FILE_NOT_FOUND,
        UNSUPPORTED_ENCRYPTION,
        UNKNOWN
    }

    public ZipException(String str) {
        super(str);
        this.type = Type.UNKNOWN;
    }

    public ZipException(Exception exc) {
        super(exc);
        this.type = Type.UNKNOWN;
    }

    public ZipException(String str, Exception exc) {
        super(str, exc);
        this.type = Type.UNKNOWN;
    }

    public ZipException(String str, Type type) {
        super(str);
        Type type2 = Type.UNKNOWN;
        this.type = type;
    }

    public ZipException(String str, Throwable th, Type type) {
        super(str, th);
        Type type2 = Type.UNKNOWN;
        this.type = type;
    }

    public Type getType() {
        return this.type;
    }
}
