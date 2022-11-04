package ti;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public abstract class x {

    /* renamed from: a */
    private static final int[] f22442a = {13, 41, 121, 337, 897, 2305};

    /* renamed from: b */
    private static final byte[] f22443b = new byte[0];

    /* renamed from: c */
    private static final int[] f22444c = new int[0];

    /* renamed from: d */
    private static final i[] f22445d = new i[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a implements p {

        /* renamed from: a */
        final /* synthetic */ int f22446a;

        a(int i10) {
            this.f22446a = i10;
        }

        @Override // ti.p
        public q a(q qVar) {
            w wVar = qVar instanceof w ? (w) qVar : null;
            if (wVar != null && wVar.b() == this.f22446a) {
                wVar.l(0);
                return wVar;
            }
            w wVar2 = new w();
            wVar2.l(0);
            wVar2.i(this.f22446a);
            if (wVar != null) {
                wVar2.j(wVar.c());
                wVar2.k(wVar.d());
                wVar2.m(wVar.f());
                wVar2.n(wVar.g());
            }
            return wVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b implements p {

        /* renamed from: a */
        final /* synthetic */ int f22447a;

        /* renamed from: b */
        final /* synthetic */ boolean f22448b;

        /* renamed from: c */
        final /* synthetic */ i f22449c;

        /* renamed from: d */
        final /* synthetic */ e f22450d;

        b(int i10, boolean z10, i iVar, e eVar) {
            this.f22447a = i10;
            this.f22448b = z10;
            this.f22449c = iVar;
            this.f22450d = eVar;
        }

        private boolean b(w wVar, int i10, int i11, boolean z10) {
            return wVar != null && wVar.g() >= Math.max(wVar.b(), i10) && c(wVar.c(), i11) && (!z10 || c(wVar.d(), i11));
        }

        private boolean c(i[] iVarArr, int i10) {
            return iVarArr != null && iVarArr.length >= i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x00f2 A[LOOP:0: B:45:0x00f0->B:46:0x00f2, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0117 A[LOOP:1: B:56:0x0115->B:57:0x0117, LOOP_END] */
        @Override // ti.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ti.q a(ti.q r14) {
            /*
                Method dump skipped, instructions count: 303
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ti.x.b.a(ti.q):ti.q");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class c implements p {

        /* renamed from: a */
        final /* synthetic */ w f22451a;

        /* renamed from: b */
        final /* synthetic */ boolean f22452b;

        /* renamed from: c */
        final /* synthetic */ j f22453c;

        c(w wVar, boolean z10, j jVar) {
            this.f22451a = wVar;
            this.f22452b = z10;
            this.f22453c = jVar;
        }

        private boolean b(w wVar, int i10, int i11, boolean z10) {
            return wVar != null && wVar.g() >= i10 && c(wVar.c(), i11) && (!z10 || c(wVar.d(), i11));
        }

        private boolean c(i[] iVarArr, int i10) {
            return iVarArr != null && iVarArr.length >= i10;
        }

        @Override // ti.p
        public q a(q qVar) {
            w wVar = qVar instanceof w ? (w) qVar : null;
            int g10 = this.f22451a.g();
            if (b(wVar, g10, this.f22451a.c().length, this.f22452b)) {
                wVar.a();
                return wVar;
            }
            w wVar2 = new w();
            wVar2.l(this.f22451a.e());
            i f10 = this.f22451a.f();
            if (f10 != null) {
                wVar2.m(this.f22453c.a(f10));
            }
            i[] c10 = this.f22451a.c();
            int length = c10.length;
            i[] iVarArr = new i[length];
            for (int i10 = 0; i10 < c10.length; i10++) {
                iVarArr[i10] = this.f22453c.a(c10[i10]);
            }
            wVar2.j(iVarArr);
            wVar2.n(g10);
            if (this.f22452b) {
                i[] iVarArr2 = new i[length];
                for (int i11 = 0; i11 < length; i11++) {
                    iVarArr2[i11] = iVarArr[i11].z();
                }
                wVar2.k(iVarArr2);
            }
            return wVar2;
        }
    }

    public static void c(i iVar) {
        e i10 = iVar.i();
        if (i10 == null) {
            return;
        }
        BigInteger w9 = i10.w();
        i10.B(iVar, "bc_wnaf", new a(Math.min(16, i(w9 == null ? i10.t() + 1 : w9.bitLength()) + 3)));
    }

    public static int[] d(BigInteger bigInteger) {
        if ((bigInteger.bitLength() >>> 16) == 0) {
            if (bigInteger.signum() == 0) {
                return f22444c;
            }
            BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
            int bitLength = add.bitLength();
            int i10 = bitLength >> 1;
            int[] iArr = new int[i10];
            BigInteger xor = add.xor(bigInteger);
            int i11 = bitLength - 1;
            int i12 = 0;
            int i13 = 1;
            int i14 = 0;
            while (i13 < i11) {
                if (!xor.testBit(i13)) {
                    i14++;
                } else {
                    iArr[i12] = i14 | ((bigInteger.testBit(i13) ? -1 : 1) << 16);
                    i13++;
                    i14 = 1;
                    i12++;
                }
                i13++;
            }
            int i15 = i12 + 1;
            iArr[i12] = 65536 | i14;
            return i10 > i15 ? p(iArr, i15) : iArr;
        }
        throw new IllegalArgumentException("'k' must have bitlength < 2^16");
    }

    public static int[] e(int i10, BigInteger bigInteger) {
        if (i10 == 2) {
            return d(bigInteger);
        }
        if (i10 < 2 || i10 > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        }
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return f22444c;
        }
        int bitLength = (bigInteger.bitLength() / i10) + 1;
        int[] iArr = new int[bitLength];
        int i11 = 1 << i10;
        int i12 = i11 - 1;
        int i13 = i11 >>> 1;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (i14 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i14) == z10) {
                i14++;
            } else {
                bigInteger = bigInteger.shiftRight(i14);
                int intValue = bigInteger.intValue() & i12;
                if (z10) {
                    intValue++;
                }
                z10 = (intValue & i13) != 0;
                if (z10) {
                    intValue -= i11;
                }
                if (i15 > 0) {
                    i14--;
                }
                iArr[i15] = i14 | (intValue << 16);
                i14 = i10;
                i15++;
            }
        }
        return bitLength > i15 ? p(iArr, i15) : iArr;
    }

    public static byte[] f(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return f22443b;
        }
        BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
        int bitLength = add.bitLength() - 1;
        byte[] bArr = new byte[bitLength];
        BigInteger xor = add.xor(bigInteger);
        int i10 = 1;
        while (i10 < bitLength) {
            if (xor.testBit(i10)) {
                bArr[i10 - 1] = (byte) (bigInteger.testBit(i10) ? -1 : 1);
                i10++;
            }
            i10++;
        }
        bArr[bitLength - 1] = 1;
        return bArr;
    }

    public static byte[] g(int i10, BigInteger bigInteger) {
        if (i10 == 2) {
            return f(bigInteger);
        }
        if (i10 < 2 || i10 > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        }
        if (bigInteger.signum() == 0) {
            return f22443b;
        }
        int bitLength = bigInteger.bitLength() + 1;
        byte[] bArr = new byte[bitLength];
        int i11 = 1 << i10;
        int i12 = i11 - 1;
        int i13 = i11 >>> 1;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (i14 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i14) == z10) {
                i14++;
            } else {
                bigInteger = bigInteger.shiftRight(i14);
                int intValue = bigInteger.intValue() & i12;
                if (z10) {
                    intValue++;
                }
                z10 = (intValue & i13) != 0;
                if (z10) {
                    intValue -= i11;
                }
                if (i15 > 0) {
                    i14--;
                }
                int i16 = i15 + i14;
                bArr[i16] = (byte) intValue;
                i15 = i16 + 1;
                i14 = i10;
            }
        }
        return bitLength > i15 ? o(bArr, i15) : bArr;
    }

    public static int h(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    public static int i(int i10) {
        return k(i10, f22442a, 16);
    }

    public static int j(int i10, int i11) {
        return k(i10, f22442a, i11);
    }

    public static int k(int i10, int[] iArr, int i11) {
        int i12 = 0;
        while (i12 < iArr.length && i10 >= iArr[i12]) {
            i12++;
        }
        return Math.max(2, Math.min(i11, i12 + 2));
    }

    public static w l(i iVar, int i10, boolean z10) {
        e i11 = iVar.i();
        return (w) i11.B(iVar, "bc_wnaf", new b(i10, z10, iVar, i11));
    }

    public static w m(i iVar, j jVar, w wVar, boolean z10) {
        return (w) iVar.i().B(iVar, "bc_wnaf", new c(wVar, z10, jVar));
    }

    public static i[] n(i[] iVarArr, int i10) {
        i[] iVarArr2 = new i[i10];
        System.arraycopy(iVarArr, 0, iVarArr2, 0, iVarArr.length);
        return iVarArr2;
    }

    private static byte[] o(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    private static int[] p(int[] iArr, int i10) {
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, 0, iArr2, 0, i10);
        return iArr2;
    }
}
