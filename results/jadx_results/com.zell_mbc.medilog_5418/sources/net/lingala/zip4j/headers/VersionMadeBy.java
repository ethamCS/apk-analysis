package net.lingala.zip4j.headers;
/* loaded from: classes2.dex */
public enum VersionMadeBy {
    SPECIFICATION_VERSION((byte) 51),
    WINDOWS((byte) 0),
    UNIX((byte) 3);
    
    private final byte code;

    VersionMadeBy(byte b) {
        this.code = b;
    }

    public byte getCode() {
        return this.code;
    }
}
