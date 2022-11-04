package gg;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class q extends a0 {

    /* renamed from: q */
    static final o0 f10873q = new a(q.class, 2);

    /* renamed from: c */
    private final byte[] f10874c;

    /* renamed from: d */
    private final int f10875d;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 d(t1 t1Var) {
            return q.C(t1Var.F());
        }
    }

    public q(long j10) {
        this.f10874c = BigInteger.valueOf(j10).toByteArray();
        this.f10875d = 0;
    }

    public q(BigInteger bigInteger) {
        this.f10874c = bigInteger.toByteArray();
        this.f10875d = 0;
    }

    q(byte[] bArr, boolean z10) {
        if (!N(bArr)) {
            this.f10874c = z10 ? ak.a.h(bArr) : bArr;
            this.f10875d = Q(bArr);
            return;
        }
        throw new IllegalArgumentException("malformed integer");
    }

    public static q C(byte[] bArr) {
        return new q(bArr, false);
    }

    public static q D(j0 j0Var, boolean z10) {
        return (q) f10873q.e(j0Var, z10);
    }

    public static q E(Object obj) {
        if (obj == null || (obj instanceof q)) {
            return (q) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (q) f10873q.b((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e10.toString());
        }
    }

    public static int L(byte[] bArr, int i10, int i11) {
        int length = bArr.length;
        int max = Math.max(i10, length - 4);
        int i12 = i11 & bArr[max];
        while (true) {
            max++;
            if (max < length) {
                i12 = (i12 << 8) | (bArr[max] & 255);
            } else {
                return i12;
            }
        }
    }

    public static boolean N(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            if (length == 1) {
                return false;
            }
            return bArr[0] == (bArr[1] >> 7) && !ak.m.c("org.bouncycastle.asn1.allow_unsafe_integer");
        }
        return true;
    }

    static long O(byte[] bArr, int i10, int i11) {
        int length = bArr.length;
        int max = Math.max(i10, length - 8);
        long j10 = i11 & bArr[max];
        while (true) {
            max++;
            if (max < length) {
                j10 = (j10 << 8) | (bArr[max] & 255);
            } else {
                return j10;
            }
        }
    }

    public static int Q(byte[] bArr) {
        int length = bArr.length - 1;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            if (bArr[i10] != (bArr[i11] >> 7)) {
                break;
            }
            i10 = i11;
        }
        return i10;
    }

    public BigInteger F() {
        return new BigInteger(1, this.f10874c);
    }

    public BigInteger G() {
        return new BigInteger(this.f10874c);
    }

    public boolean H(int i10) {
        byte[] bArr = this.f10874c;
        int length = bArr.length;
        int i11 = this.f10875d;
        return length - i11 <= 4 && L(bArr, i11, -1) == i10;
    }

    public boolean J(BigInteger bigInteger) {
        return bigInteger != null && L(this.f10874c, this.f10875d, -1) == bigInteger.intValue() && G().equals(bigInteger);
    }

    public int K() {
        byte[] bArr = this.f10874c;
        int length = bArr.length;
        int i10 = this.f10875d;
        int i11 = length - i10;
        if (i11 > 4 || (i11 == 4 && (bArr[i10] & 128) != 0)) {
            throw new ArithmeticException("ASN.1 Integer out of positive int range");
        }
        return L(bArr, i10, 255);
    }

    public int M() {
        byte[] bArr = this.f10874c;
        int length = bArr.length;
        int i10 = this.f10875d;
        if (length - i10 <= 4) {
            return L(bArr, i10, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    public long P() {
        byte[] bArr = this.f10874c;
        int length = bArr.length;
        int i10 = this.f10875d;
        if (length - i10 <= 8) {
            return O(bArr, i10, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of long range");
    }

    @Override // gg.a0, gg.t
    public int hashCode() {
        return ak.a.F(this.f10874c);
    }

    @Override // gg.a0
    public boolean l(a0 a0Var) {
        if (!(a0Var instanceof q)) {
            return false;
        }
        return ak.a.c(this.f10874c, ((q) a0Var).f10874c);
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        yVar.o(z10, 2, this.f10874c);
    }

    @Override // gg.a0
    public boolean n() {
        return false;
    }

    @Override // gg.a0
    public int q(boolean z10) {
        return y.g(z10, this.f10874c.length);
    }

    public String toString() {
        return G().toString();
    }
}
