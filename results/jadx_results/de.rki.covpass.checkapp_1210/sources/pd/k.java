package pd;

import xc.b1;
import yd.i;
/* loaded from: classes.dex */
public final class k implements me.f {

    /* renamed from: b */
    private final fe.d f19111b;

    /* renamed from: c */
    private final fe.d f19112c;

    /* renamed from: d */
    private final ke.t<vd.e> f19113d;

    /* renamed from: e */
    private final boolean f19114e;

    /* renamed from: f */
    private final me.e f19115f;

    /* renamed from: g */
    private final q f19116g;

    /* renamed from: h */
    private final String f19117h;

    public k(fe.d dVar, fe.d dVar2, rd.l lVar, td.c cVar, ke.t<vd.e> tVar, boolean z10, me.e eVar, q qVar) {
        String str;
        hc.t.e(dVar, "className");
        hc.t.e(lVar, "packageProto");
        hc.t.e(cVar, "nameResolver");
        hc.t.e(eVar, "abiStability");
        this.f19111b = dVar;
        this.f19112c = dVar2;
        this.f19113d = tVar;
        this.f19114e = z10;
        this.f19115f = eVar;
        this.f19116g = qVar;
        i.f<rd.l, Integer> fVar = ud.a.f23547m;
        hc.t.d(fVar, "packageModuleName");
        Integer num = (Integer) td.e.a(lVar, fVar);
        this.f19117h = (num == null || (str = cVar.getString(num.intValue())) == null) ? "main" : str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(pd.q r11, rd.l r12, td.c r13, ke.t<vd.e> r14, boolean r15, me.e r16) {
        /*
            r10 = this;
            java.lang.String r0 = "kotlinClass"
            r9 = r11
            hc.t.e(r11, r0)
            java.lang.String r0 = "packageProto"
            r4 = r12
            hc.t.e(r12, r0)
            java.lang.String r0 = "nameResolver"
            r5 = r13
            hc.t.e(r13, r0)
            java.lang.String r0 = "abiStability"
            r8 = r16
            hc.t.e(r8, r0)
            wd.b r0 = r11.i()
            fe.d r2 = fe.d.b(r0)
            java.lang.String r0 = "byClassId(kotlinClass.classId)"
            hc.t.d(r2, r0)
            qd.a r0 = r11.a()
            java.lang.String r0 = r0.e()
            r1 = 0
            if (r0 == 0) goto L40
            int r3 = r0.length()
            if (r3 <= 0) goto L39
            r3 = 1
            goto L3a
        L39:
            r3 = 0
        L3a:
            if (r3 == 0) goto L40
            fe.d r1 = fe.d.d(r0)
        L40:
            r3 = r1
            r1 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.k.<init>(pd.q, rd.l, td.c, ke.t, boolean, me.e):void");
    }

    @Override // xc.a1
    public b1 a() {
        b1 b1Var = b1.f25526a;
        hc.t.d(b1Var, "NO_SOURCE_FILE");
        return b1Var;
    }

    @Override // me.f
    public String c() {
        return "Class '" + d().b().b() + '\'';
    }

    public final wd.b d() {
        return new wd.b(e().g(), h());
    }

    public fe.d e() {
        return this.f19111b;
    }

    public fe.d f() {
        return this.f19112c;
    }

    public final q g() {
        return this.f19116g;
    }

    public final wd.f h() {
        String L0;
        String f10 = e().f();
        hc.t.d(f10, "className.internalName");
        L0 = bf.y.L0(f10, '/', null, 2, null);
        wd.f j10 = wd.f.j(L0);
        hc.t.d(j10, "identifier(className.int….substringAfterLast('/'))");
        return j10;
    }

    public String toString() {
        return k.class.getSimpleName() + ": " + e();
    }
}
