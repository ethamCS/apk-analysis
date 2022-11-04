package wc;

import bf.w;
import bf.y;
import hc.t;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import org.conscrypt.BuildConfig;
import ub.u;
import uc.k;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public static final c f24707a;

    /* renamed from: b */
    private static final String f24708b;

    /* renamed from: c */
    private static final String f24709c;

    /* renamed from: d */
    private static final String f24710d;

    /* renamed from: e */
    private static final String f24711e;

    /* renamed from: f */
    private static final wd.b f24712f;

    /* renamed from: g */
    private static final wd.c f24713g;

    /* renamed from: h */
    private static final wd.b f24714h;

    /* renamed from: i */
    private static final wd.b f24715i;

    /* renamed from: j */
    private static final wd.b f24716j;

    /* renamed from: k */
    private static final HashMap<wd.d, wd.b> f24717k = new HashMap<>();

    /* renamed from: l */
    private static final HashMap<wd.d, wd.b> f24718l = new HashMap<>();

    /* renamed from: m */
    private static final HashMap<wd.d, wd.c> f24719m = new HashMap<>();

    /* renamed from: n */
    private static final HashMap<wd.d, wd.c> f24720n = new HashMap<>();

    /* renamed from: o */
    private static final HashMap<wd.b, wd.b> f24721o = new HashMap<>();

    /* renamed from: p */
    private static final HashMap<wd.b, wd.b> f24722p = new HashMap<>();

    /* renamed from: q */
    private static final List<a> f24723q;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final wd.b f24724a;

        /* renamed from: b */
        private final wd.b f24725b;

        /* renamed from: c */
        private final wd.b f24726c;

        public a(wd.b bVar, wd.b bVar2, wd.b bVar3) {
            t.e(bVar, "javaClass");
            t.e(bVar2, "kotlinReadOnly");
            t.e(bVar3, "kotlinMutable");
            this.f24724a = bVar;
            this.f24725b = bVar2;
            this.f24726c = bVar3;
        }

        public final wd.b a() {
            return this.f24724a;
        }

        public final wd.b b() {
            return this.f24725b;
        }

        public final wd.b c() {
            return this.f24726c;
        }

        public final wd.b d() {
            return this.f24724a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return t.a(this.f24724a, aVar.f24724a) && t.a(this.f24725b, aVar.f24725b) && t.a(this.f24726c, aVar.f24726c);
        }

        public int hashCode() {
            return (((this.f24724a.hashCode() * 31) + this.f24725b.hashCode()) * 31) + this.f24726c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f24724a + ", kotlinReadOnly=" + this.f24725b + ", kotlinMutable=" + this.f24726c + ')';
        }
    }

    static {
        List<a> k10;
        fe.e[] values;
        c cVar = new c();
        f24707a = cVar;
        StringBuilder sb2 = new StringBuilder();
        vc.c cVar2 = vc.c.Function;
        sb2.append(cVar2.h().toString());
        sb2.append('.');
        sb2.append(cVar2.g());
        f24708b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        vc.c cVar3 = vc.c.KFunction;
        sb3.append(cVar3.h().toString());
        sb3.append('.');
        sb3.append(cVar3.g());
        f24709c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        vc.c cVar4 = vc.c.SuspendFunction;
        sb4.append(cVar4.h().toString());
        sb4.append('.');
        sb4.append(cVar4.g());
        f24710d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        vc.c cVar5 = vc.c.KSuspendFunction;
        sb5.append(cVar5.h().toString());
        sb5.append('.');
        sb5.append(cVar5.g());
        f24711e = sb5.toString();
        wd.b m10 = wd.b.m(new wd.c("kotlin.jvm.functions.FunctionN"));
        t.d(m10, "topLevel(FqName(\"kotlin.jvm.functions.FunctionN\"))");
        f24712f = m10;
        wd.c b10 = m10.b();
        t.d(b10, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f24713g = b10;
        wd.i iVar = wd.i.f24825a;
        f24714h = iVar.i();
        f24715i = iVar.h();
        f24716j = cVar.g(Class.class);
        wd.b m11 = wd.b.m(k.a.T);
        t.d(m11, "topLevel(FqNames.iterable)");
        wd.c cVar6 = k.a.f23468b0;
        wd.c h10 = m11.h();
        wd.c h11 = m11.h();
        t.d(h11, "kotlinReadOnly.packageFqName");
        wd.c g10 = wd.e.g(cVar6, h11);
        wd.b bVar = new wd.b(h10, g10, false);
        wd.b m12 = wd.b.m(k.a.S);
        t.d(m12, "topLevel(FqNames.iterator)");
        wd.c cVar7 = k.a.f23466a0;
        wd.c h12 = m12.h();
        wd.c h13 = m12.h();
        t.d(h13, "kotlinReadOnly.packageFqName");
        wd.b bVar2 = new wd.b(h12, wd.e.g(cVar7, h13), false);
        wd.b m13 = wd.b.m(k.a.U);
        t.d(m13, "topLevel(FqNames.collection)");
        wd.c cVar8 = k.a.f23470c0;
        wd.c h14 = m13.h();
        wd.c h15 = m13.h();
        t.d(h15, "kotlinReadOnly.packageFqName");
        wd.b bVar3 = new wd.b(h14, wd.e.g(cVar8, h15), false);
        wd.b m14 = wd.b.m(k.a.V);
        t.d(m14, "topLevel(FqNames.list)");
        wd.c cVar9 = k.a.f23472d0;
        wd.c h16 = m14.h();
        wd.c h17 = m14.h();
        t.d(h17, "kotlinReadOnly.packageFqName");
        wd.b bVar4 = new wd.b(h16, wd.e.g(cVar9, h17), false);
        wd.b m15 = wd.b.m(k.a.X);
        t.d(m15, "topLevel(FqNames.set)");
        wd.c cVar10 = k.a.f23476f0;
        wd.c h18 = m15.h();
        wd.c h19 = m15.h();
        t.d(h19, "kotlinReadOnly.packageFqName");
        wd.b bVar5 = new wd.b(h18, wd.e.g(cVar10, h19), false);
        wd.b m16 = wd.b.m(k.a.W);
        t.d(m16, "topLevel(FqNames.listIterator)");
        wd.c cVar11 = k.a.f23474e0;
        wd.c h20 = m16.h();
        wd.c h21 = m16.h();
        t.d(h21, "kotlinReadOnly.packageFqName");
        wd.b bVar6 = new wd.b(h20, wd.e.g(cVar11, h21), false);
        wd.c cVar12 = k.a.Y;
        wd.b m17 = wd.b.m(cVar12);
        t.d(m17, "topLevel(FqNames.map)");
        wd.c cVar13 = k.a.f23478g0;
        wd.c h22 = m17.h();
        wd.c h23 = m17.h();
        t.d(h23, "kotlinReadOnly.packageFqName");
        wd.b bVar7 = new wd.b(h22, wd.e.g(cVar13, h23), false);
        wd.b d10 = wd.b.m(cVar12).d(k.a.Z.g());
        t.d(d10, "topLevel(FqNames.map).cr…mes.mapEntry.shortName())");
        wd.c cVar14 = k.a.f23480h0;
        wd.c h24 = d10.h();
        wd.c h25 = d10.h();
        t.d(h25, "kotlinReadOnly.packageFqName");
        k10 = u.k(new a(cVar.g(Iterable.class), m11, bVar), new a(cVar.g(Iterator.class), m12, bVar2), new a(cVar.g(Collection.class), m13, bVar3), new a(cVar.g(List.class), m14, bVar4), new a(cVar.g(Set.class), m15, bVar5), new a(cVar.g(ListIterator.class), m16, bVar6), new a(cVar.g(Map.class), m17, bVar7), new a(cVar.g(Map.Entry.class), d10, new wd.b(h24, wd.e.g(cVar14, h25), false)));
        f24723q = k10;
        cVar.f(Object.class, k.a.f23467b);
        cVar.f(String.class, k.a.f23479h);
        cVar.f(CharSequence.class, k.a.f23477g);
        cVar.e(Throwable.class, k.a.f23505u);
        cVar.f(Cloneable.class, k.a.f23471d);
        cVar.f(Number.class, k.a.f23499r);
        cVar.e(Comparable.class, k.a.f23507v);
        cVar.f(Enum.class, k.a.f23501s);
        cVar.e(Annotation.class, k.a.G);
        for (a aVar : k10) {
            f24707a.d(aVar);
        }
        for (fe.e eVar : fe.e.values()) {
            c cVar15 = f24707a;
            wd.b m18 = wd.b.m(eVar.s());
            t.d(m18, "topLevel(jvmType.wrapperFqName)");
            uc.i r10 = eVar.r();
            t.d(r10, "jvmType.primitiveType");
            wd.b m19 = wd.b.m(k.c(r10));
            t.d(m19, "topLevel(StandardNames.g…e(jvmType.primitiveType))");
            cVar15.a(m18, m19);
        }
        for (wd.b bVar8 : uc.c.f23400a.a()) {
            c cVar16 = f24707a;
            wd.b m20 = wd.b.m(new wd.c("kotlin.jvm.internal." + bVar8.j().b() + "CompanionObject"));
            t.d(m20, "topLevel(FqName(\"kotlin.…g() + \"CompanionObject\"))");
            wd.b d11 = bVar8.d(wd.h.f24814d);
            t.d(d11, "classId.createNestedClas…AME_FOR_COMPANION_OBJECT)");
            cVar16.a(m20, d11);
        }
        for (int i10 = 0; i10 < 23; i10++) {
            c cVar17 = f24707a;
            wd.b m21 = wd.b.m(new wd.c("kotlin.jvm.functions.Function" + i10));
            t.d(m21, "topLevel(FqName(\"kotlin.…m.functions.Function$i\"))");
            cVar17.a(m21, k.a(i10));
            cVar17.c(new wd.c(f24709c + i10), f24714h);
        }
        for (int i11 = 0; i11 < 22; i11++) {
            vc.c cVar18 = vc.c.KSuspendFunction;
            f24707a.c(new wd.c((cVar18.h().toString() + '.' + cVar18.g()) + i11), f24714h);
        }
        c cVar19 = f24707a;
        wd.c l10 = k.a.f23469c.l();
        t.d(l10, "nothing.toSafe()");
        cVar19.c(l10, cVar19.g(Void.class));
    }

    private c() {
    }

    private final void a(wd.b bVar, wd.b bVar2) {
        b(bVar, bVar2);
        wd.c b10 = bVar2.b();
        t.d(b10, "kotlinClassId.asSingleFqName()");
        c(b10, bVar);
    }

    private final void b(wd.b bVar, wd.b bVar2) {
        HashMap<wd.d, wd.b> hashMap = f24717k;
        wd.d j10 = bVar.b().j();
        t.d(j10, "javaClassId.asSingleFqName().toUnsafe()");
        hashMap.put(j10, bVar2);
    }

    private final void c(wd.c cVar, wd.b bVar) {
        HashMap<wd.d, wd.b> hashMap = f24718l;
        wd.d j10 = cVar.j();
        t.d(j10, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap.put(j10, bVar);
    }

    private final void d(a aVar) {
        wd.b a10 = aVar.a();
        wd.b b10 = aVar.b();
        wd.b c10 = aVar.c();
        a(a10, b10);
        wd.c b11 = c10.b();
        t.d(b11, "mutableClassId.asSingleFqName()");
        c(b11, a10);
        f24721o.put(c10, b10);
        f24722p.put(b10, c10);
        wd.c b12 = b10.b();
        t.d(b12, "readOnlyClassId.asSingleFqName()");
        wd.c b13 = c10.b();
        t.d(b13, "mutableClassId.asSingleFqName()");
        HashMap<wd.d, wd.c> hashMap = f24719m;
        wd.d j10 = c10.b().j();
        t.d(j10, "mutableClassId.asSingleFqName().toUnsafe()");
        hashMap.put(j10, b12);
        HashMap<wd.d, wd.c> hashMap2 = f24720n;
        wd.d j11 = b12.j();
        t.d(j11, "readOnlyFqName.toUnsafe()");
        hashMap2.put(j11, b13);
    }

    private final void e(Class<?> cls, wd.c cVar) {
        wd.b g10 = g(cls);
        wd.b m10 = wd.b.m(cVar);
        t.d(m10, "topLevel(kotlinFqName)");
        a(g10, m10);
    }

    private final void f(Class<?> cls, wd.d dVar) {
        wd.c l10 = dVar.l();
        t.d(l10, "kotlinFqName.toSafe()");
        e(cls, l10);
    }

    private final wd.b g(Class<?> cls) {
        wd.b bVar;
        String str;
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            bVar = wd.b.m(new wd.c(cls.getCanonicalName()));
            str = "topLevel(FqName(clazz.canonicalName))";
        } else {
            bVar = g(declaringClass).d(wd.f.j(cls.getSimpleName()));
            str = "classId(outer).createNes…tifier(clazz.simpleName))";
        }
        t.d(bVar, str);
        return bVar;
    }

    private final boolean j(wd.d dVar, String str) {
        String H0;
        boolean D0;
        Integer l10;
        String b10 = dVar.b();
        t.d(b10, "kotlinFqName.asString()");
        H0 = y.H0(b10, str, BuildConfig.FLAVOR);
        if (H0.length() > 0) {
            D0 = y.D0(H0, '0', false, 2, null);
            if (!D0) {
                l10 = w.l(H0);
                return l10 != null && l10.intValue() >= 23;
            }
        }
        return false;
    }

    public final wd.c h() {
        return f24713g;
    }

    public final List<a> i() {
        return f24723q;
    }

    public final boolean k(wd.d dVar) {
        return f24719m.containsKey(dVar);
    }

    public final boolean l(wd.d dVar) {
        return f24720n.containsKey(dVar);
    }

    public final wd.b m(wd.c cVar) {
        t.e(cVar, "fqName");
        return f24717k.get(cVar.j());
    }

    public final wd.b n(wd.d dVar) {
        t.e(dVar, "kotlinFqName");
        return (!j(dVar, f24708b) && !j(dVar, f24710d)) ? (!j(dVar, f24709c) && !j(dVar, f24711e)) ? f24718l.get(dVar) : f24714h : f24712f;
    }

    public final wd.c o(wd.d dVar) {
        return f24719m.get(dVar);
    }

    public final wd.c p(wd.d dVar) {
        return f24720n.get(dVar);
    }
}
