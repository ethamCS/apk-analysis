package q2;
/* loaded from: classes.dex */
public class e {

    /* renamed from: c */
    private int f19507c;

    /* renamed from: d */
    private int f19508d;

    /* renamed from: e */
    private a f19509e;

    /* renamed from: a */
    private int f19505a = Integer.MAX_VALUE;

    /* renamed from: b */
    private int f19506b = 0;

    /* renamed from: f */
    private final x3.g f19510f = new x3.g();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: j */
        public int f19511j = Integer.MAX_VALUE;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x3.c cVar) {
            super(cVar);
            e.this = r1;
        }

        private void d() {
            int i10 = this.f19502g + this.f19503h[this.f19501f];
            this.f19502g = i10;
            c4.l lVar = this.f19498c;
            int i11 = i10 - lVar.f6218c;
            int i12 = lVar.f6219d;
            this.f19499d = i11 % i12;
            this.f19500e = i11 / i12;
        }

        private boolean e() {
            byte[] bArr = this.f19498c.V3;
            int i10 = this.f19502g;
            int[] iArr = this.f19503h;
            int i11 = this.f19501f;
            if (bArr[iArr[i11] + i10] != 0) {
                return true;
            }
            int i12 = (i11 + 1) % 4;
            this.f19501f = i12;
            if (bArr[iArr[i12] + i10] != 0) {
                return true;
            }
            int i13 = (i12 + 1) % 4;
            this.f19501f = i13;
            if (bArr[iArr[i13] + i10] != 0) {
                return true;
            }
            int i14 = (i13 + 1) % 4;
            this.f19501f = i14;
            if (bArr[i10 + iArr[i14]] != 0) {
                return true;
            }
            this.f19501f = (i14 + 1) % 4;
            return false;
        }

        private boolean f() {
            byte[] bArr = this.f19498c.V3;
            int i10 = this.f19502g;
            int[] iArr = this.f19503h;
            int i11 = this.f19501f;
            if (bArr[iArr[i11] + i10] != 0) {
                return true;
            }
            int i12 = (i11 + 1) % 8;
            this.f19501f = i12;
            if (bArr[iArr[i12] + i10] != 0) {
                return true;
            }
            int i13 = (i12 + 1) % 8;
            this.f19501f = i13;
            if (bArr[iArr[i13] + i10] != 0) {
                return true;
            }
            int i14 = (i13 + 1) % 8;
            this.f19501f = i14;
            if (bArr[iArr[i14] + i10] != 0) {
                return true;
            }
            int i15 = (i14 + 1) % 8;
            this.f19501f = i15;
            if (bArr[iArr[i15] + i10] != 0) {
                return true;
            }
            int i16 = (i15 + 1) % 8;
            this.f19501f = i16;
            if (bArr[iArr[i16] + i10] != 0) {
                return true;
            }
            int i17 = (i16 + 1) % 8;
            this.f19501f = i17;
            if (bArr[iArr[i17] + i10] != 0) {
                return true;
            }
            int i18 = (i17 + 1) % 8;
            this.f19501f = i18;
            if (bArr[i10 + iArr[i18]] != 0) {
                return true;
            }
            this.f19501f = (i18 + 1) % 8;
            return false;
        }

        private boolean g() {
            return this.f19497b == 4 ? e() : f();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
            if (r5[r4 + r6[7]] == 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
            if (r8.f19498c.V3[r4 + r8.f19503h[3]] != 0) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean h(int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 255
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: q2.e.a.h(int, int, boolean):boolean");
        }
    }

    public e(x3.c cVar) {
        this.f19509e = new a(cVar);
    }

    static int e(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] == 0) {
            i10++;
        }
        return i10;
    }

    static int f(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 0) {
            i10++;
        }
        return i10;
    }

    public x3.g g() {
        return this.f19510f;
    }

    public void h(c4.l lVar, int i10, int i11) {
        int i12;
        this.f19507c = i10;
        this.f19508d = i11;
        this.f19510f.g();
        c3.d.b(lVar, 0, 1);
        this.f19509e.a(lVar);
        byte[] bArr = lVar.V3;
        for (int i13 = 1; i13 < lVar.f6221x - 1; i13++) {
            int i14 = lVar.f6218c + (lVar.f6219d * i13) + 1;
            int i15 = (lVar.f6220q + i14) - 2;
            int i16 = 1;
            while (true) {
                int e10 = e(bArr, i14, i15) - i14;
                int i17 = i14 + e10;
                if (i17 == i15) {
                    break;
                }
                int i18 = i16 + e10;
                if (bArr[i17] == 1 && (!this.f19509e.h(i18, i13, true) || (i12 = this.f19510f.i()) < this.f19506b || i12 >= this.f19505a)) {
                    this.f19510f.f();
                }
                int f10 = f(bArr, i17, i15) - i17;
                i14 = i17 + f10;
                if (i14 == i15) {
                    break;
                }
                i16 = i18 + f10;
                int i19 = i14 - 1;
                if (bArr[i19] == 1) {
                    this.f19509e.h(i16 - 1, i13, false);
                    this.f19510f.f();
                } else {
                    bArr[i19] = -2;
                }
            }
        }
    }

    public void i(x3.c cVar) {
        this.f19509e = new a(cVar);
    }

    public void j(int i10) {
        this.f19505a = i10;
    }

    public void k(int i10) {
        this.f19506b = i10;
    }
}
