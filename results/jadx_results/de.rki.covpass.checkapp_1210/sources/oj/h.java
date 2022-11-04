package oj;

import java.util.Objects;
import org.bouncycastle.crypto.j0;
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a */
    private final org.bouncycastle.crypto.r f18504a;

    /* renamed from: b */
    private final int f18505b;

    public h(gg.v vVar, int i10) {
        Objects.requireNonNull(vVar, "digest == null");
        this.f18504a = f.a(vVar);
        this.f18505b = i10;
    }

    private byte[] d(int i10, byte[] bArr, byte[] bArr2) {
        byte[] q10 = a0.q(i10, this.f18505b);
        this.f18504a.update(q10, 0, q10.length);
        this.f18504a.update(bArr, 0, bArr.length);
        this.f18504a.update(bArr2, 0, bArr2.length);
        int i11 = this.f18505b;
        byte[] bArr3 = new byte[i11];
        org.bouncycastle.crypto.r rVar = this.f18504a;
        if (rVar instanceof j0) {
            ((j0) rVar).c(bArr3, 0, i11);
        } else {
            rVar.doFinal(bArr3, 0);
        }
        return bArr3;
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f18505b;
        if (length == i10) {
            if (bArr2.length != i10) {
                throw new IllegalArgumentException("wrong in length");
            }
            return d(0, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong key length");
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f18505b;
        if (length == i10) {
            if (bArr2.length != i10 * 2) {
                throw new IllegalArgumentException("wrong in length");
            }
            return d(1, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong key length");
    }

    public byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length == this.f18505b) {
            if (bArr2.length != 32) {
                throw new IllegalArgumentException("wrong address length");
            }
            return d(3, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong key length");
    }
}
