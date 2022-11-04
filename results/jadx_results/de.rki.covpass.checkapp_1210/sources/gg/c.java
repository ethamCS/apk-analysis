package gg;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* loaded from: classes3.dex */
public abstract class c extends a0 implements g0, d {

    /* renamed from: d */
    static final o0 f10788d = new a(c.class, 3);

    /* renamed from: q */
    private static final char[] f10789q = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: c */
    final byte[] f10790c;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 c(d0 d0Var) {
            return d0Var.J();
        }

        @Override // gg.o0
        public a0 d(t1 t1Var) {
            return c.C(t1Var.F());
        }
    }

    public c(byte[] bArr, int i10) {
        Objects.requireNonNull(bArr, "'data' cannot be null");
        if (bArr.length != 0 || i10 == 0) {
            if (i10 > 7 || i10 < 0) {
                throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
            }
            this.f10790c = ak.a.P(bArr, (byte) i10);
            return;
        }
        throw new IllegalArgumentException("zero length data with non-zero pad bits");
    }

    public c(byte[] bArr, boolean z10) {
        if (z10) {
            Objects.requireNonNull(bArr, "'contents' cannot be null");
            if (bArr.length < 1) {
                throw new IllegalArgumentException("'contents' cannot be empty");
            }
            int i10 = bArr[0] & 255;
            if (i10 > 0) {
                if (bArr.length < 2) {
                    throw new IllegalArgumentException("zero length data with non-zero pad bits");
                }
                if (i10 > 7) {
                    throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
                }
            }
        }
        this.f10790c = bArr;
    }

    public static c C(byte[] bArr) {
        int length = bArr.length;
        if (length >= 1) {
            int i10 = bArr[0] & 255;
            if (i10 > 0) {
                if (i10 > 7 || length < 2) {
                    throw new IllegalArgumentException("invalid pad bits detected");
                }
                byte b10 = bArr[length - 1];
                if (b10 != ((byte) ((255 << i10) & b10))) {
                    return new g2(bArr, false);
                }
            }
            return new k1(bArr, false);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    public static c E(j0 j0Var, boolean z10) {
        return (c) f10788d.e(j0Var, z10);
    }

    public static c F(Object obj) {
        if (obj == null || (obj instanceof c)) {
            return (c) obj;
        }
        if (obj instanceof g) {
            a0 b10 = ((g) obj).b();
            if (b10 instanceof c) {
                return (c) b10;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (c) f10788d.b((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct BIT STRING from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public byte[] D() {
        byte[] bArr = this.f10790c;
        if (bArr.length == 1) {
            return w.f10909q;
        }
        byte[] w9 = ak.a.w(bArr, 1, bArr.length);
        int length = w9.length - 1;
        w9[length] = (byte) (((byte) (255 << (bArr[0] & 255))) & w9[length]);
        return w9;
    }

    public byte[] G() {
        byte[] bArr = this.f10790c;
        if (bArr[0] == 0) {
            return ak.a.w(bArr, 1, bArr.length);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public int H() {
        int min = Math.min(5, this.f10790c.length - 1);
        int i10 = 0;
        for (int i11 = 1; i11 < min; i11++) {
            i10 |= (255 & this.f10790c[i11]) << ((i11 - 1) * 8);
        }
        if (1 > min || min >= 5) {
            return i10;
        }
        byte[] bArr = this.f10790c;
        return i10 | ((((byte) (bArr[min] & (255 << (bArr[0] & 255)))) & 255) << ((min - 1) * 8));
    }

    @Override // gg.g0
    public String c() {
        try {
            byte[] encoded = getEncoded();
            StringBuffer stringBuffer = new StringBuffer((encoded.length * 2) + 1);
            stringBuffer.append('#');
            for (int i10 = 0; i10 != encoded.length; i10++) {
                byte b10 = encoded[i10];
                char[] cArr = f10789q;
                stringBuffer.append(cArr[(b10 >>> 4) & 15]);
                stringBuffer.append(cArr[b10 & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e10) {
            throw new z("Internal error encoding BitString: " + e10.getMessage(), e10);
        }
    }

    @Override // gg.d
    public int d() {
        return this.f10790c[0] & 255;
    }

    @Override // gg.t2
    public a0 e() {
        return b();
    }

    @Override // gg.d
    public InputStream f() {
        byte[] bArr = this.f10790c;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    @Override // gg.a0, gg.t
    public int hashCode() {
        byte[] bArr = this.f10790c;
        if (bArr.length < 2) {
            return 1;
        }
        int length = bArr.length - 1;
        return (ak.a.G(bArr, 0, length) * 257) ^ ((byte) (bArr[length] & (255 << (bArr[0] & 255))));
    }

    @Override // gg.a0
    public boolean l(a0 a0Var) {
        if (!(a0Var instanceof c)) {
            return false;
        }
        byte[] bArr = this.f10790c;
        byte[] bArr2 = ((c) a0Var).f10790c;
        int length = bArr.length;
        if (bArr2.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i10 = length - 1;
        for (int i11 = 0; i11 < i10; i11++) {
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
        }
        int i12 = 255 << (bArr[0] & 255);
        return ((byte) (bArr[i10] & i12)) == ((byte) (bArr2[i10] & i12));
    }

    public String toString() {
        return c();
    }

    @Override // gg.a0
    public a0 w() {
        return new k1(this.f10790c, false);
    }

    @Override // gg.a0
    public a0 z() {
        return new g2(this.f10790c, false);
    }
}
