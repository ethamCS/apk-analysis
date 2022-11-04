package ti;

import java.math.BigInteger;
import ti.e;
import ti.i;
/* loaded from: classes3.dex */
public class t {

    /* renamed from: a */
    private static final BigInteger f22426a;

    /* renamed from: c */
    private static final BigInteger f22428c;

    /* renamed from: d */
    public static final a0[] f22429d;

    /* renamed from: f */
    public static final a0[] f22431f;

    /* renamed from: b */
    private static final BigInteger f22427b = d.f22361c.negate();

    /* renamed from: e */
    public static final byte[][] f22430e = {null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};

    /* renamed from: g */
    public static final byte[][] f22432g = {null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};

    static {
        BigInteger bigInteger = d.f22360b;
        BigInteger negate = bigInteger.negate();
        f22426a = negate;
        BigInteger negate2 = d.f22362d.negate();
        f22428c = negate2;
        BigInteger bigInteger2 = d.f22359a;
        f22429d = new a0[]{null, new a0(bigInteger, bigInteger2), null, new a0(negate2, negate), null, new a0(negate, negate), null, new a0(bigInteger, negate), null};
        f22431f = new a0[]{null, new a0(bigInteger, bigInteger2), null, new a0(negate2, bigInteger), null, new a0(negate, bigInteger), null, new a0(bigInteger, bigInteger), null};
    }

    public static s a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b10, int i10, int i11) {
        int i12 = ((i10 + 5) / 2) + i11;
        BigInteger multiply = bigInteger2.multiply(bigInteger.shiftRight(((i10 - i12) - 2) + b10));
        BigInteger add = multiply.add(bigInteger3.multiply(multiply.shiftRight(i10)));
        int i13 = i12 - i11;
        BigInteger shiftRight = add.shiftRight(i13);
        if (add.testBit(i13 - 1)) {
            shiftRight = shiftRight.add(d.f22360b);
        }
        return new s(shiftRight, i11);
    }

    public static BigInteger[] b(byte b10, int i10, boolean z10) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (b10 == 1 || b10 == -1) {
            if (z10) {
                bigInteger = d.f22361c;
                bigInteger2 = BigInteger.valueOf(b10);
            } else {
                bigInteger = d.f22359a;
                bigInteger2 = d.f22360b;
            }
            int i11 = 1;
            while (i11 < i10) {
                i11++;
                BigInteger bigInteger3 = bigInteger2;
                bigInteger2 = (b10 == 1 ? bigInteger2 : bigInteger2.negate()).subtract(bigInteger.shiftLeft(1));
                bigInteger = bigInteger3;
            }
            return new BigInteger[]{bigInteger, bigInteger2};
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    public static byte c(int i10) {
        return (byte) (i10 == 0 ? -1 : 1);
    }

    public static i.b[] d(i.b bVar, byte b10) {
        byte[][] bArr = b10 == 0 ? f22430e : f22432g;
        i.b[] bVarArr = new i.b[(bArr.length + 1) >>> 1];
        bVarArr[0] = bVar;
        int length = bArr.length;
        for (int i10 = 3; i10 < length; i10 += 2) {
            bVarArr[i10 >>> 1] = h(bVar, bArr[i10]);
        }
        bVar.i().z(bVarArr);
        return bVarArr;
    }

    protected static int e(BigInteger bigInteger) {
        if (bigInteger != null) {
            if (bigInteger.equals(d.f22361c)) {
                return 1;
            }
            if (bigInteger.equals(d.f22363e)) {
                return 2;
            }
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    public static BigInteger[] f(e.b bVar) {
        if (bVar.I()) {
            int t10 = bVar.t();
            int intValue = bVar.n().t().intValue();
            byte c10 = c(intValue);
            int e10 = e(bVar.p());
            BigInteger[] b10 = b(c10, (t10 + 3) - intValue, false);
            if (c10 == 1) {
                b10[0] = b10[0].negate();
                b10[1] = b10[1].negate();
            }
            BigInteger bigInteger = d.f22360b;
            return new BigInteger[]{bigInteger.add(b10[1]).shiftRight(e10), bigInteger.add(b10[0]).shiftRight(e10).negate()};
        }
        throw new IllegalArgumentException("si is defined for Koblitz curves only");
    }

    public static BigInteger g(byte b10, int i10) {
        if (i10 == 4) {
            return b10 == 1 ? BigInteger.valueOf(6L) : BigInteger.valueOf(10L);
        }
        BigInteger[] b11 = b(b10, i10, false);
        BigInteger bit = d.f22359a.setBit(i10);
        return d.f22361c.multiply(b11[0]).multiply(b11[1].modInverse(bit)).mod(bit);
    }

    public static i.b h(i.b bVar, byte[] bArr) {
        i.b bVar2 = (i.b) bVar.i().u();
        i.b bVar3 = (i.b) bVar.z();
        int i10 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i10++;
            byte b10 = bArr[length];
            if (b10 != 0) {
                bVar2 = (i.b) bVar2.L(i10).a(b10 > 0 ? bVar : bVar3);
                i10 = 0;
            }
        }
        return i10 > 0 ? bVar2.L(i10) : bVar2;
    }

    public static BigInteger i(byte b10, a0 a0Var) {
        BigInteger subtract;
        BigInteger bigInteger = a0Var.f22357a;
        BigInteger multiply = bigInteger.multiply(bigInteger);
        BigInteger multiply2 = a0Var.f22357a.multiply(a0Var.f22358b);
        BigInteger bigInteger2 = a0Var.f22358b;
        BigInteger shiftLeft = bigInteger2.multiply(bigInteger2).shiftLeft(1);
        if (b10 == 1) {
            subtract = multiply.add(multiply2);
        } else if (b10 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        } else {
            subtract = multiply.subtract(multiply2);
        }
        return subtract.add(shiftLeft);
    }

    public static a0 j(BigInteger bigInteger, int i10, byte b10, BigInteger[] bigIntegerArr, byte b11, byte b12) {
        BigInteger add = b11 == 1 ? bigIntegerArr[0].add(bigIntegerArr[1]) : bigIntegerArr[0].subtract(bigIntegerArr[1]);
        BigInteger bigInteger2 = b(b11, i10, true)[1];
        a0 k10 = k(a(bigInteger, bigIntegerArr[0], bigInteger2, b10, i10, b12), a(bigInteger, bigIntegerArr[1], bigInteger2, b10, i10, b12), b11);
        return new a0(bigInteger.subtract(add.multiply(k10.f22357a)).subtract(BigInteger.valueOf(2L).multiply(bigIntegerArr[1]).multiply(k10.f22358b)), bigIntegerArr[1].multiply(k10.f22357a).subtract(bigIntegerArr[0].multiply(k10.f22358b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
        if (r5.d(ti.t.f22426a) < 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
        if (r5.d(r9) >= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
        if (r8.d(ti.t.f22427b) < 0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ti.a0 k(ti.s r8, ti.s r9, byte r10) {
        /*
            int r0 = r8.f()
            int r1 = r9.f()
            if (r1 != r0) goto La7
            r0 = -1
            r1 = 1
            if (r10 == r1) goto L19
            if (r10 != r0) goto L11
            goto L19
        L11:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "mu must be 1 or -1"
            r8.<init>(r9)
            throw r8
        L19:
            java.math.BigInteger r2 = r8.h()
            java.math.BigInteger r3 = r9.h()
            ti.s r8 = r8.i(r2)
            ti.s r9 = r9.i(r3)
            ti.s r4 = r8.a(r8)
            if (r10 != r1) goto L34
            ti.s r4 = r4.a(r9)
            goto L38
        L34:
            ti.s r4 = r4.j(r9)
        L38:
            ti.s r5 = r9.a(r9)
            ti.s r5 = r5.a(r9)
            ti.s r9 = r5.a(r9)
            if (r10 != r1) goto L4f
            ti.s r5 = r8.j(r5)
            ti.s r8 = r8.a(r9)
            goto L57
        L4f:
            ti.s r5 = r8.a(r5)
            ti.s r8 = r8.j(r9)
        L57:
            java.math.BigInteger r9 = ti.d.f22360b
            int r6 = r4.d(r9)
            r7 = 0
            if (r6 < 0) goto L69
            java.math.BigInteger r6 = ti.t.f22426a
            int r6 = r5.d(r6)
            if (r6 >= 0) goto L75
            goto L71
        L69:
            java.math.BigInteger r1 = ti.d.f22361c
            int r1 = r8.d(r1)
            if (r1 < 0) goto L74
        L71:
            r1 = r7
            r7 = r10
            goto L75
        L74:
            r1 = r7
        L75:
            java.math.BigInteger r6 = ti.t.f22426a
            int r4 = r4.d(r6)
            if (r4 >= 0) goto L84
            int r8 = r5.d(r9)
            if (r8 < 0) goto L8f
            goto L8c
        L84:
            java.math.BigInteger r9 = ti.t.f22427b
            int r8 = r8.d(r9)
            if (r8 >= 0) goto L8e
        L8c:
            int r8 = -r10
            byte r7 = (byte) r8
        L8e:
            r0 = r1
        L8f:
            long r8 = (long) r0
            java.math.BigInteger r8 = java.math.BigInteger.valueOf(r8)
            java.math.BigInteger r8 = r2.add(r8)
            long r9 = (long) r7
            java.math.BigInteger r9 = java.math.BigInteger.valueOf(r9)
            java.math.BigInteger r9 = r3.add(r9)
            ti.a0 r10 = new ti.a0
            r10.<init>(r8, r9)
            return r10
        La7:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "lambda0 and lambda1 do not have same scale"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.t.k(ti.s, ti.s, byte):ti.a0");
    }

    public static byte[] l(byte b10, a0 a0Var, byte b11, BigInteger bigInteger, BigInteger bigInteger2, a0[] a0VarArr) {
        boolean z10;
        if (b10 == 1 || b10 == -1) {
            int bitLength = i(b10, a0Var).bitLength();
            byte[] bArr = new byte[bitLength > 30 ? bitLength + 4 + b11 : b11 + 34];
            BigInteger shiftRight = bigInteger.shiftRight(1);
            BigInteger bigInteger3 = a0Var.f22357a;
            BigInteger bigInteger4 = a0Var.f22358b;
            int i10 = 0;
            while (true) {
                BigInteger bigInteger5 = d.f22359a;
                if (bigInteger3.equals(bigInteger5) && bigInteger4.equals(bigInteger5)) {
                    return bArr;
                }
                if (bigInteger3.testBit(0)) {
                    BigInteger mod = bigInteger3.add(bigInteger4.multiply(bigInteger2)).mod(bigInteger);
                    if (mod.compareTo(shiftRight) >= 0) {
                        mod = mod.subtract(bigInteger);
                    }
                    byte intValue = (byte) mod.intValue();
                    bArr[i10] = intValue;
                    if (intValue < 0) {
                        intValue = (byte) (-intValue);
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        bigInteger3 = bigInteger3.subtract(a0VarArr[intValue].f22357a);
                        bigInteger4 = bigInteger4.subtract(a0VarArr[intValue].f22358b);
                    } else {
                        bigInteger3 = bigInteger3.add(a0VarArr[intValue].f22357a);
                        bigInteger4 = bigInteger4.add(a0VarArr[intValue].f22358b);
                    }
                } else {
                    bArr[i10] = 0;
                }
                BigInteger shiftRight2 = bigInteger3.shiftRight(1);
                BigInteger add = b10 == 1 ? bigInteger4.add(shiftRight2) : bigInteger4.subtract(shiftRight2);
                BigInteger negate = bigInteger3.shiftRight(1).negate();
                i10++;
                bigInteger3 = add;
                bigInteger4 = negate;
            }
        } else {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
    }
}
