package net.lingala.zip4j.model;

import net.lingala.zip4j.headers.HeaderSignature;
/* loaded from: classes2.dex */
public abstract class ZipHeader {
    private HeaderSignature signature;

    public HeaderSignature getSignature() {
        return this.signature;
    }

    public void setSignature(HeaderSignature headerSignature) {
        this.signature = headerSignature;
    }
}
