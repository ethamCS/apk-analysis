package a.e.a.j;

import a.e.a.j.f;
/* loaded from: classes.dex */
public class k {

    /* renamed from: a */
    static boolean[] f145a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c6, code lost:
        r4.a(r2, 1, r17.l());
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cf, code lost:
        r4.a(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e0, code lost:
        if (r6 != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
        if (r6 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
        if (r6 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
        if (r6 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e9, code lost:
        if (r6 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00eb, code lost:
        r3.a(r1, 1, r17.m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f4, code lost:
        r7 = r17.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f8, code lost:
        r3.a(r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010f, code lost:
        if (r6 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c4, code lost:
        if (r6 != false) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(int r16, a.e.a.j.f r17) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.j.k.a(int, a.e.a.j.f):void");
    }

    public static void a(f fVar, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        fVar.A[i3].d().f = fVar.k().s.d();
        fVar.A[i3].d().g = i2;
        fVar.A[i3].d().f149b = 1;
        fVar.A[i4].d().f = fVar.A[i3].d();
        fVar.A[i4].d().g = fVar.d(i);
        fVar.A[i4].d().f149b = 1;
    }

    public static void a(g gVar, a.e.a.e eVar, f fVar) {
        if (gVar.C[0] != f.b.WRAP_CONTENT && fVar.C[0] == f.b.MATCH_PARENT) {
            int i = fVar.s.e;
            int s = gVar.s() - fVar.u.e;
            e eVar2 = fVar.s;
            eVar2.i = eVar.a(eVar2);
            e eVar3 = fVar.u;
            eVar3.i = eVar.a(eVar3);
            eVar.a(fVar.s.i, i);
            eVar.a(fVar.u.i, s);
            fVar.f134a = 2;
            fVar.a(i, s);
        }
        if (gVar.C[1] == f.b.WRAP_CONTENT || fVar.C[1] != f.b.MATCH_PARENT) {
            return;
        }
        int i2 = fVar.t.e;
        int i3 = gVar.i() - fVar.v.e;
        e eVar4 = fVar.t;
        eVar4.i = eVar.a(eVar4);
        e eVar5 = fVar.v;
        eVar5.i = eVar.a(eVar5);
        eVar.a(fVar.t.i, i2);
        eVar.a(fVar.v.i, i3);
        if (fVar.Q > 0 || fVar.r() == 8) {
            e eVar6 = fVar.w;
            eVar6.i = eVar.a(eVar6);
            eVar.a(fVar.w.i, fVar.Q + i2);
        }
        fVar.f135b = 2;
        fVar.e(i2, i3);
    }

    private static boolean a(f fVar, int i) {
        f.b[] bVarArr = fVar.C;
        if (bVarArr[i] != f.b.MATCH_CONSTRAINT) {
            return false;
        }
        char c2 = 1;
        if (fVar.G != 0.0f) {
            if (i != 0) {
                c2 = 0;
            }
            f.b bVar = bVarArr[c2];
            f.b bVar2 = f.b.MATCH_CONSTRAINT;
            return false;
        }
        if (i == 0) {
            if (fVar.e != 0 || fVar.h != 0 || fVar.i != 0) {
                return false;
            }
        } else if (fVar.f != 0 || fVar.k != 0 || fVar.l != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r7.e0 == 2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r7.f0 == 2) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0104 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(a.e.a.j.g r24, a.e.a.e r25, int r26, int r27, a.e.a.j.d r28) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.j.k.a(a.e.a.j.g, a.e.a.e, int, int, a.e.a.j.d):boolean");
    }
}
