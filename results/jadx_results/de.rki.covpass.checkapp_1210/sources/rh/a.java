package rh;

import ak.l;
import org.bouncycastle.crypto.a0;
import org.bouncycastle.crypto.e;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.o;
import zh.q0;
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a */
    protected final e f21211a;

    /* renamed from: b */
    protected boolean f21212b;

    /* renamed from: c */
    protected q0 f21213c;

    public a(e eVar) {
        this.f21211a = eVar;
    }

    public static byte[] f(short[] sArr) {
        byte[] bArr = new byte[sArr.length * 2];
        for (int i10 = 0; i10 != sArr.length; i10++) {
            l.A(sArr[i10], bArr, i10 * 2);
        }
        return bArr;
    }

    public static short[] g(byte[] bArr) {
        if ((bArr.length & 1) == 0) {
            int length = bArr.length / 2;
            short[] sArr = new short[length];
            for (int i10 = 0; i10 != length; i10++) {
                sArr[i10] = l.e(bArr, i10 * 2);
            }
            return sArr;
        }
        throw new IllegalArgumentException("data must be an even number of bytes for a wide radix");
    }

    protected abstract int a(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);

    protected abstract int b(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);

    public abstract String c();

    public abstract void d(boolean z10, i iVar);

    public int e(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (this.f21213c != null) {
            if (i11 < 0) {
                throw new IllegalArgumentException("input length cannot be negative");
            }
            if (bArr == null || bArr2 == null) {
                throw new NullPointerException("buffer value is null");
            }
            if (bArr.length < i10 + i11) {
                throw new o("input buffer too short");
            }
            if (bArr2.length < i12 + i11) {
                throw new a0("output buffer too short");
            }
            return this.f21212b ? b(bArr, i10, i11, bArr2, i12) : a(bArr, i10, i11, bArr2, i12);
        }
        throw new IllegalStateException("FPE engine not initialized");
    }
}
