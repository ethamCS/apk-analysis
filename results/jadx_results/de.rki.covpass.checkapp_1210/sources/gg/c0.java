package gg;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
/* loaded from: classes3.dex */
public class c0 extends a0 {

    /* renamed from: q */
    static final o0 f10791q = new a(c0.class, 13);

    /* renamed from: c */
    private final String f10792c;

    /* renamed from: d */
    private byte[] f10793d;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 d(t1 t1Var) {
            return c0.C(t1Var.F(), false);
        }
    }

    private c0(byte[] bArr, boolean z10) {
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z11 = true;
        long j10 = 0;
        BigInteger bigInteger = null;
        for (int i10 = 0; i10 != bArr2.length; i10++) {
            int i11 = bArr2[i10] & 255;
            if (j10 <= 72057594037927808L) {
                long j11 = j10 + (i11 & 127);
                if ((i11 & 128) == 0) {
                    if (z11) {
                        z11 = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(j11);
                    j10 = 0;
                } else {
                    j10 = j11 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j10) : bigInteger).or(BigInteger.valueOf(i11 & 127));
                if ((i11 & 128) == 0) {
                    if (z11) {
                        z11 = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(or);
                    j10 = 0;
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.f10792c = stringBuffer.toString();
        this.f10793d = z10 ? ak.a.h(bArr) : bArr2;
    }

    public static c0 C(byte[] bArr, boolean z10) {
        return new c0(bArr, z10);
    }

    private void D(ByteArrayOutputStream byteArrayOutputStream) {
        y2 y2Var = new y2(this.f10792c);
        while (y2Var.a()) {
            String b10 = y2Var.b();
            if (b10.length() <= 18) {
                H(byteArrayOutputStream, Long.parseLong(b10));
            } else {
                J(byteArrayOutputStream, new BigInteger(b10));
            }
        }
    }

    private synchronized byte[] E() {
        if (this.f10793d == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            D(byteArrayOutputStream);
            this.f10793d = byteArrayOutputStream.toByteArray();
        }
        return this.f10793d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r7.charAt(r0 + 1) != '0') goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r2 == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r2 <= 1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean G(java.lang.String r7, int r8) {
        /*
            int r0 = r7.length()
            r1 = 0
        L5:
            r2 = r1
        L6:
            int r0 = r0 + (-1)
            r3 = 48
            r4 = 1
            if (r0 < r8) goto L2c
            char r5 = r7.charAt(r0)
            r6 = 46
            if (r5 != r6) goto L22
            if (r2 == 0) goto L21
            if (r2 <= r4) goto L5
            int r2 = r0 + 1
            char r2 = r7.charAt(r2)
            if (r2 != r3) goto L5
        L21:
            return r1
        L22:
            if (r3 > r5) goto L2b
            r3 = 57
            if (r5 > r3) goto L2b
            int r2 = r2 + 1
            goto L6
        L2b:
            return r1
        L2c:
            if (r2 == 0) goto L39
            if (r2 <= r4) goto L38
            int r0 = r0 + r4
            char r7 = r7.charAt(r0)
            if (r7 != r3) goto L38
            goto L39
        L38:
            return r4
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.c0.G(java.lang.String, int):boolean");
    }

    public static void H(ByteArrayOutputStream byteArrayOutputStream, long j10) {
        byte[] bArr = new byte[9];
        int i10 = 8;
        bArr[8] = (byte) (((int) j10) & 127);
        while (j10 >= 128) {
            j10 >>= 7;
            i10--;
            bArr[i10] = (byte) (((int) j10) | 128);
        }
        byteArrayOutputStream.write(bArr, i10, 9 - i10);
    }

    public static void J(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i10 = bitLength - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            bArr[i11] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i10] = (byte) (bArr[i10] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    public String F() {
        return this.f10792c;
    }

    @Override // gg.a0, gg.t
    public int hashCode() {
        return this.f10792c.hashCode();
    }

    @Override // gg.a0
    public boolean l(a0 a0Var) {
        if (this == a0Var) {
            return true;
        }
        if (a0Var instanceof c0) {
            return this.f10792c.equals(((c0) a0Var).f10792c);
        }
        return false;
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        yVar.o(z10, 13, E());
    }

    @Override // gg.a0
    public boolean n() {
        return false;
    }

    @Override // gg.a0
    public int q(boolean z10) {
        return y.g(z10, E().length);
    }

    public String toString() {
        return F();
    }
}
