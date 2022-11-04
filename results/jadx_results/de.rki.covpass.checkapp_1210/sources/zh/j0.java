package zh;

import java.security.SecureRandom;
/* loaded from: classes3.dex */
public final class j0 extends b {

    /* renamed from: d */
    private final byte[] f26945d;

    /* renamed from: q */
    private k0 f26946q;

    public j0(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[57];
        this.f26945d = bArr;
        zi.b.t(secureRandom, bArr);
    }

    public j0(byte[] bArr) {
        this(d(bArr), 0);
    }

    public j0(byte[] bArr, int i10) {
        super(true);
        byte[] bArr2 = new byte[57];
        this.f26945d = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 57);
    }

    private static byte[] d(byte[] bArr) {
        if (bArr.length == 57) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 57");
    }

    public k0 b() {
        k0 k0Var;
        synchronized (this.f26945d) {
            if (this.f26946q == null) {
                byte[] bArr = new byte[57];
                zi.b.u(this.f26945d, 0, bArr, 0);
                this.f26946q = new k0(bArr, 0);
            }
            k0Var = this.f26946q;
        }
        return k0Var;
    }

    public void c(int i10, byte[] bArr, byte[] bArr2, int i11, int i12, byte[] bArr3, int i13) {
        byte[] bArr4 = new byte[57];
        b().b(bArr4, 0);
        if (i10 == 0) {
            zi.b.P(this.f26945d, 0, bArr4, 0, bArr, bArr2, i11, i12, bArr3, i13);
        } else if (i10 != 1) {
            throw new IllegalArgumentException("algorithm");
        } else {
            if (64 != i12) {
                throw new IllegalArgumentException("msgLen");
            }
            zi.b.Q(this.f26945d, 0, bArr4, 0, bArr, bArr2, i11, bArr3, i13);
        }
    }

    public byte[] getEncoded() {
        return ak.a.h(this.f26945d);
    }
}
