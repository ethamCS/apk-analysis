package oj;

import java.util.Objects;
/* loaded from: classes3.dex */
final class n {

    /* renamed from: a */
    private final byte[][] f18532a;

    public n(m mVar, byte[][] bArr) {
        Objects.requireNonNull(mVar, "params == null");
        Objects.requireNonNull(bArr, "publicKey == null");
        if (!a0.k(bArr)) {
            if (bArr.length != mVar.a()) {
                throw new IllegalArgumentException("wrong publicKey size");
            }
            for (byte[] bArr2 : bArr) {
                if (bArr2.length != mVar.c()) {
                    throw new IllegalArgumentException("wrong publicKey format");
                }
            }
            this.f18532a = a0.d(bArr);
            return;
        }
        throw new NullPointerException("publicKey byte array == null");
    }

    public byte[][] a() {
        return a0.d(this.f18532a);
    }
}
