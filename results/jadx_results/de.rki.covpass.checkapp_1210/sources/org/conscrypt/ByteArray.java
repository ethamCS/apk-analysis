package org.conscrypt;

import java.util.Arrays;
/* loaded from: classes3.dex */
final class ByteArray {
    private final byte[] bytes;
    private final int hashCode;

    public ByteArray(byte[] bArr) {
        this.bytes = bArr;
        this.hashCode = Arrays.hashCode(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ByteArray)) {
            return false;
        }
        return Arrays.equals(this.bytes, ((ByteArray) obj).bytes);
    }

    public int hashCode() {
        return this.hashCode;
    }
}
