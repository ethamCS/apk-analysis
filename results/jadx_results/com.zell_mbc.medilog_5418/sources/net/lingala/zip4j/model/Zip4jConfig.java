package net.lingala.zip4j.model;

import java.nio.charset.Charset;
/* loaded from: classes2.dex */
public class Zip4jConfig {
    private final int bufferSize;
    private final Charset charset;

    public Zip4jConfig(Charset charset, int i) {
        this.charset = charset;
        this.bufferSize = i;
    }

    public Charset getCharset() {
        return this.charset;
    }

    public int getBufferSize() {
        return this.bufferSize;
    }
}
