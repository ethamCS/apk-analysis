package zh;

import java.security.SecureRandom;
/* loaded from: classes3.dex */
public final class g0 extends b {

    /* renamed from: d */
    private final byte[] f26928d;

    /* renamed from: q */
    private h0 f26929q;

    public g0(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.f26928d = bArr;
        zi.a.s(secureRandom, bArr);
    }

    public g0(byte[] bArr) {
        this(d(bArr), 0);
    }

    public g0(byte[] bArr, int i10) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.f26928d = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 32);
    }

    private static byte[] d(byte[] bArr) {
        if (bArr.length == 32) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 32");
    }

    public h0 b() {
        h0 h0Var;
        synchronized (this.f26928d) {
            if (this.f26929q == null) {
                byte[] bArr = new byte[32];
                zi.a.t(this.f26928d, 0, bArr, 0);
                this.f26929q = new h0(bArr, 0);
            }
            h0Var = this.f26929q;
        }
        return h0Var;
    }

    public void c(int i10, byte[] bArr, byte[] bArr2, int i11, int i12, byte[] bArr3, int i13) {
        byte[] bArr4 = new byte[32];
        b().b(bArr4, 0);
        if (i10 == 0) {
            if (bArr != null) {
                throw new IllegalArgumentException("ctx");
            }
            zi.a.T(this.f26928d, 0, bArr4, 0, bArr2, i11, i12, bArr3, i13);
        } else if (i10 == 1) {
            zi.a.U(this.f26928d, 0, bArr4, 0, bArr, bArr2, i11, i12, bArr3, i13);
        } else if (i10 != 2) {
            throw new IllegalArgumentException("algorithm");
        } else {
            if (64 != i12) {
                throw new IllegalArgumentException("msgLen");
            }
            zi.a.V(this.f26928d, 0, bArr4, 0, bArr, bArr2, i11, bArr3, i13);
        }
    }

    public byte[] getEncoded() {
        return ak.a.h(this.f26928d);
    }
}
