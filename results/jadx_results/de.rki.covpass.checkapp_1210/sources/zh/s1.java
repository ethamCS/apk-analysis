package zh;

import java.security.SecureRandom;
/* loaded from: classes3.dex */
public final class s1 extends b {

    /* renamed from: d */
    private final byte[] f26997d;

    public s1(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.f26997d = bArr;
        yi.a.d(secureRandom, bArr);
    }

    public s1(byte[] bArr) {
        this(d(bArr), 0);
    }

    public s1(byte[] bArr, int i10) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.f26997d = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 32);
    }

    private static byte[] d(byte[] bArr) {
        if (bArr.length == 32) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 32");
    }

    public t1 b() {
        byte[] bArr = new byte[32];
        yi.a.e(this.f26997d, 0, bArr, 0);
        return new t1(bArr, 0);
    }

    public void c(t1 t1Var, byte[] bArr, int i10) {
        byte[] bArr2 = new byte[32];
        t1Var.b(bArr2, 0);
        if (yi.a.a(this.f26997d, 0, bArr2, 0, bArr, i10)) {
            return;
        }
        throw new IllegalStateException("X25519 agreement failed");
    }

    public byte[] getEncoded() {
        return ak.a.h(this.f26997d);
    }
}
