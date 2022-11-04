package p2;

import java.util.Objects;
import p2.g;
/* loaded from: classes.dex */
public class o {

    /* renamed from: a */
    a0 f18828a = new a0(8, 285);

    /* renamed from: b */
    ok.i f18829b = new ok.i();

    /* renamed from: c */
    ok.i f18830c = new ok.i();

    /* renamed from: d */
    String f18831d;

    /* renamed from: e */
    final n f18832e;

    /* renamed from: f */
    int f18833f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18834a;

        static {
            int[] iArr = new int[g.e.values().length];
            f18834a = iArr;
            try {
                iArr[g.e.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18834a[g.e.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18834a[g.e.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18834a[g.e.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18834a[g.e.ECI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18834a[g.e.FNC1_FIRST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18834a[g.e.FNC1_SECOND.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public o(String str, String str2) {
        this.f18832e = new n(str, str2);
    }

    public static int a(int i10) {
        return i10 + ((8 - (i10 % 8)) % 8);
    }

    private void d(byte[] bArr, ok.i iVar, ok.i iVar2, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < iVar.f18614b; i13++) {
            iVar.f18613a[i13] = bArr[(i13 * i11) + i10];
        }
        for (int i14 = 0; i14 < iVar2.f18614b; i14++) {
            iVar2.f18613a[i14] = bArr[(i14 * i11) + i10 + i12];
        }
    }

    private int e(g gVar, d dVar, int i10) {
        return this.f18832e.a(dVar, i10, s.b(gVar.W3));
    }

    private boolean f(g gVar, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f18829b.f(i10);
        for (int i16 = 0; i16 < i11; i16++) {
            d(gVar.f18751c4, this.f18829b, this.f18830c, i13 + i16, i15, i14);
            n.f(this.f18829b);
            n.f(this.f18830c);
            if (!this.f18828a.b(this.f18829b, this.f18830c)) {
                return false;
            }
            this.f18833f += this.f18828a.h();
            n.f(this.f18829b);
            ok.i iVar = this.f18829b;
            System.arraycopy(iVar.f18613a, 0, gVar.f18753d4, i12, iVar.f18614b);
            i12 += this.f18829b.f18614b;
        }
        return true;
    }

    private int g(g gVar, d dVar, int i10) {
        int c10 = s.c(gVar.W3);
        n nVar = this.f18832e;
        nVar.f18825e = this.f18831d;
        return nVar.b(dVar, i10, c10);
    }

    private int i(g gVar, d dVar, int i10) {
        return this.f18832e.c(dVar, i10, s.d(gVar.W3));
    }

    private int k(g gVar, d dVar, int i10) {
        return this.f18832e.d(dVar, i10, s.e(gVar.W3));
    }

    private g.e l(g.e eVar, g.e eVar2) {
        return eVar == eVar2 ? eVar : eVar == g.e.UNKNOWN ? eVar2 : g.e.MIXED;
    }

    public boolean b(g gVar) {
        g.f fVar = g.f18746k4[gVar.W3];
        g.b bVar = fVar.f18790c.get(gVar.X3);
        Objects.requireNonNull(bVar);
        int i10 = bVar.f18767a;
        int i11 = bVar.f18768b;
        int i12 = i10 - i11;
        int i13 = bVar.f18769c;
        int i14 = i11 + 1;
        int i15 = (fVar.f18788a - (i10 * i13)) / (i10 + 1);
        int i16 = i13 + i15;
        int i17 = i11 * i13;
        int i18 = i17 + (i14 * i15);
        gVar.f18753d4 = new byte[i18];
        this.f18830c.f(i12);
        this.f18828a.g(i12);
        this.f18833f = 0;
        if (f(gVar, i11, i13, 0, 0, i18, i16) && f(gVar, i14, i15, i17, i13, i18, i16)) {
            gVar.f18758i4 = this.f18833f;
            return true;
        }
        return false;
    }

    boolean c(g gVar, int i10) {
        boolean z10 = true;
        while (true) {
            byte[] bArr = gVar.f18753d4;
            if (i10 < bArr.length) {
                if (z10) {
                    if (55 != (bArr[i10] & 255)) {
                        return false;
                    }
                } else if (136 == (bArr[i10] & 255)) {
                    continue;
                } else if (55 != (bArr[i10] & 255)) {
                    return false;
                } else {
                    z10 = true;
                }
                z10 = !z10;
                i10++;
            } else {
                return true;
            }
        }
    }

    int h(d dVar, int i10) {
        int c10 = dVar.c(i10, 8, true);
        int i11 = i10 + 8;
        int i12 = 1;
        while (((1 << (7 - i12)) & c10) != 0) {
            i12++;
        }
        if (i12 > 1) {
            int i13 = i12 - 1;
            c10 = (c10 << i13) >> i13;
        }
        for (int i14 = 1; i14 < i12; i14++) {
            c10 = (c10 << 8) | dVar.c(i11, 8, true);
            i11 += 8;
        }
        this.f18831d = p2.a.a(c10);
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
        if (c(r8, a(r2) / 8) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
        r0 = p2.g.d.READING_PADDING;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
        r8.f18749b4 = r0;
        r8.f18754e4 = r7.f18832e.f18822b.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j(p2.g r8) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            r8.f18749b4 = r0
            r1 = 0
            r7.f18831d = r1
            p2.d r1 = new p2.d
            r1.<init>()
            byte[] r2 = r8.f18753d4
            r1.f18742a = r2
            int r2 = r2.length
            int r2 = r2 * 8
            r1.f18743b = r2
            p2.n r2 = r7.f18832e
            java.lang.StringBuilder r2 = r2.f18822b
            r3 = 0
            r2.setLength(r3)
            r2 = r3
        L1e:
            int r4 = r2 + 4
            int r5 = r1.f18743b
            r6 = 1
            if (r4 > r5) goto L75
            r5 = 4
            int r2 = r1.c(r2, r5, r6)
            if (r2 != 0) goto L2e
            r2 = r4
            goto L75
        L2e:
            p2.g$e r2 = p2.g.e.g(r2)
            p2.g$e r5 = r8.f18748a4
            p2.g$e r5 = r7.l(r5, r2)
            r8.f18748a4 = r5
            int[] r5 = p2.o.a.f18834a
            int r2 = r2.ordinal()
            r2 = r5[r2]
            switch(r2) {
                case 1: goto L6a;
                case 2: goto L65;
                case 3: goto L56;
                case 4: goto L51;
                case 5: goto L4c;
                case 6: goto L4a;
                case 7: goto L4a;
                default: goto L45;
            }
        L45:
            p2.g$d r0 = p2.g.d.UNKNOWN_MODE
        L47:
            r8.f18755f4 = r0
            return r3
        L4a:
            r2 = r4
            goto L6e
        L4c:
            int r2 = r7.h(r1, r4)
            goto L6e
        L51:
            int r2 = r7.i(r8, r1, r4)
            goto L6e
        L56:
            int r2 = r7.g(r8, r1, r4)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L6e
            p2.n r0 = r7.f18832e
            java.lang.String r0 = r0.f18823c
            goto L6e
        L65:
            int r2 = r7.e(r8, r1, r4)
            goto L6e
        L6a:
            int r2 = r7.k(r8, r1, r4)
        L6e:
            if (r2 >= 0) goto L1e
            p2.n r0 = r7.f18832e
            p2.g$d r0 = r0.f18821a
            goto L47
        L75:
            int r1 = a(r2)
            int r1 = r1 / 8
            boolean r1 = r7.c(r8, r1)
            if (r1 != 0) goto L84
            p2.g$d r0 = p2.g.d.READING_PADDING
            goto L47
        L84:
            r8.f18749b4 = r0
            p2.n r0 = r7.f18832e
            java.lang.StringBuilder r0 = r0.f18822b
            java.lang.String r0 = r0.toString()
            r8.f18754e4 = r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.o.j(p2.g):boolean");
    }
}
