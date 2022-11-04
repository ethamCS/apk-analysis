package zh;

import java.security.SecureRandom;
/* loaded from: classes3.dex */
public final class v1 extends b {

    /* renamed from: d */
    private final byte[] f27012d;

    public v1(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[56];
        this.f27012d = bArr;
        yi.c.d(secureRandom, bArr);
    }

    public v1(byte[] bArr) {
        this(d(bArr), 0);
    }

    public v1(byte[] bArr, int i10) {
        super(true);
        byte[] bArr2 = new byte[56];
        this.f27012d = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 56);
    }

    private static byte[] d(byte[] bArr) {
        if (bArr.length == 56) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 56");
    }

    public w1 b() {
        byte[] bArr = new byte[56];
        yi.c.e(this.f27012d, 0, bArr, 0);
        return new w1(bArr, 0);
    }

    public void c(w1 w1Var, byte[] bArr, int i10) {
        byte[] bArr2 = new byte[56];
        w1Var.b(bArr2, 0);
        if (yi.c.a(this.f27012d, 0, bArr2, 0, bArr, i10)) {
            return;
        }
        throw new IllegalStateException("X448 agreement failed");
    }

    public byte[] getEncoded() {
        return ak.a.h(this.f27012d);
    }
}
