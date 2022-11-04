package le;

import bf.x;
import hc.t;
/* loaded from: classes3.dex */
public final class a extends je.a {

    /* renamed from: n */
    public static final a f15958n = new a();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private a() {
        /*
            r14 = this;
            yd.g r1 = yd.g.d()
            sd.b.a(r1)
            java.lang.String r0 = "newInstance().apply(Buil…f::registerAllExtensions)"
            hc.t.d(r1, r0)
            yd.i$f<rd.l, java.lang.Integer> r2 = sd.b.f21658a
            java.lang.String r0 = "packageFqName"
            hc.t.d(r2, r0)
            yd.i$f<rd.d, java.util.List<rd.b>> r3 = sd.b.f21660c
            java.lang.String r0 = "constructorAnnotation"
            hc.t.d(r3, r0)
            yd.i$f<rd.c, java.util.List<rd.b>> r4 = sd.b.f21659b
            java.lang.String r0 = "classAnnotation"
            hc.t.d(r4, r0)
            yd.i$f<rd.i, java.util.List<rd.b>> r5 = sd.b.f21661d
            java.lang.String r0 = "functionAnnotation"
            hc.t.d(r5, r0)
            yd.i$f<rd.n, java.util.List<rd.b>> r6 = sd.b.f21662e
            java.lang.String r0 = "propertyAnnotation"
            hc.t.d(r6, r0)
            yd.i$f<rd.n, java.util.List<rd.b>> r7 = sd.b.f21663f
            java.lang.String r0 = "propertyGetterAnnotation"
            hc.t.d(r7, r0)
            yd.i$f<rd.n, java.util.List<rd.b>> r8 = sd.b.f21664g
            java.lang.String r0 = "propertySetterAnnotation"
            hc.t.d(r8, r0)
            yd.i$f<rd.g, java.util.List<rd.b>> r9 = sd.b.f21666i
            java.lang.String r0 = "enumEntryAnnotation"
            hc.t.d(r9, r0)
            yd.i$f<rd.n, rd.b$b$c> r10 = sd.b.f21665h
            java.lang.String r0 = "compileTimeValue"
            hc.t.d(r10, r0)
            yd.i$f<rd.u, java.util.List<rd.b>> r11 = sd.b.f21667j
            java.lang.String r0 = "parameterAnnotation"
            hc.t.d(r11, r0)
            yd.i$f<rd.q, java.util.List<rd.b>> r12 = sd.b.f21668k
            java.lang.String r0 = "typeAnnotation"
            hc.t.d(r12, r0)
            yd.i$f<rd.s, java.util.List<rd.b>> r13 = sd.b.f21669l
            java.lang.String r0 = "typeParameterAnnotation"
            hc.t.d(r13, r0)
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: le.a.<init>():void");
    }

    private final String o(wd.c cVar) {
        if (cVar.d()) {
            return "default-package";
        }
        String b10 = cVar.g().b();
        t.d(b10, "fqName.shortName().asString()");
        return b10;
    }

    public final String m(wd.c cVar) {
        t.e(cVar, "fqName");
        return o(cVar) + ".kotlin_builtins";
    }

    public final String n(wd.c cVar) {
        String D;
        t.e(cVar, "fqName");
        StringBuilder sb2 = new StringBuilder();
        String b10 = cVar.b();
        t.d(b10, "fqName.asString()");
        D = x.D(b10, '.', '/', false, 4, null);
        sb2.append(D);
        sb2.append('/');
        sb2.append(m(cVar));
        return sb2.toString();
    }
}
