package gd;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ub.z0;
import uc.k;
/* loaded from: classes.dex */
public abstract class a<TAnnotation> {
    private static final C0160a Companion = new C0160a(null);
    @Deprecated

    /* renamed from: c */
    private static final Map<String, gd.b> f10628c;

    /* renamed from: a */
    private final w f10629a;

    /* renamed from: b */
    private final ConcurrentHashMap<Object, TAnnotation> f10630b = new ConcurrentHashMap<>();

    /* renamed from: gd.a$a */
    /* loaded from: classes.dex */
    private static final class C0160a {
        private C0160a() {
        }

        public /* synthetic */ C0160a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.l<TAnnotation, Boolean> {

        /* renamed from: c */
        public static final b f10631c = new b();

        b() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(TAnnotation tannotation) {
            hc.t.e(tannotation, "$this$extractNullability");
            return Boolean.FALSE;
        }
    }

    static {
        gd.b[] values;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (gd.b bVar : gd.b.values()) {
            String g10 = bVar.g();
            if (linkedHashMap.get(g10) == null) {
                linkedHashMap.put(g10, bVar);
            }
        }
        f10628c = linkedHashMap;
    }

    public a(w wVar) {
        hc.t.e(wVar, "javaTypeEnhancementState");
        this.f10629a = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Set<gd.b> a(Set<? extends gd.b> set) {
        Set u02;
        Set g10;
        Set<gd.b> h10;
        if (set.contains(gd.b.TYPE_USE)) {
            u02 = ub.m.u0(gd.b.values());
            g10 = z0.g(u02, gd.b.TYPE_PARAMETER_BOUNDS);
            h10 = z0.h(g10, set);
            return h10;
        }
        return set;
    }

    private final q d(TAnnotation tannotation) {
        od.i g10;
        q r10 = r(tannotation);
        if (r10 != null) {
            return r10;
        }
        tb.r<TAnnotation, Set<gd.b>> t10 = t(tannotation);
        if (t10 == null) {
            return null;
        }
        TAnnotation b10 = t10.b();
        Set<gd.b> c10 = t10.c();
        f0 q10 = q(tannotation);
        if (q10 == null) {
            q10 = p(b10);
        }
        if (q10.h() || (g10 = g(b10, b.f10631c)) == null) {
            return null;
        }
        return new q(od.i.b(g10, null, q10.j(), 1, null), c10, false, 4, null);
    }

    private final od.i g(TAnnotation tannotation, gc.l<? super TAnnotation, Boolean> lVar) {
        od.i n10;
        od.i n11 = n(tannotation, lVar.invoke(tannotation).booleanValue());
        if (n11 != null) {
            return n11;
        }
        TAnnotation s10 = s(tannotation);
        if (s10 == null) {
            return null;
        }
        f0 p10 = p(tannotation);
        if (p10.h() || (n10 = n(s10, lVar.invoke(s10).booleanValue())) == null) {
            return null;
        }
        return od.i.b(n10, null, p10.j(), 1, null);
    }

    private final TAnnotation h(TAnnotation tannotation, wd.c cVar) {
        for (TAnnotation tannotation2 : k(tannotation)) {
            if (hc.t.a(i(tannotation2), cVar)) {
                return tannotation2;
            }
        }
        return null;
    }

    private final boolean l(TAnnotation tannotation, wd.c cVar) {
        Iterable<TAnnotation> k10 = k(tannotation);
        if (!(k10 instanceof Collection) || !((Collection) k10).isEmpty()) {
            for (TAnnotation tannotation2 : k10) {
                if (hc.t.a(i(tannotation2), cVar)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
        if (r6.equals("ALWAYS") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r6.equals("UNKNOWN") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
        if (r6.equals("NEVER") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
        if (r6.equals("MAYBE") == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final od.i n(TAnnotation r6, boolean r7) {
        /*
            r5 = this;
            wd.c r0 = r5.i(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            gd.w r2 = r5.f10629a
            gc.l r2 = r2.c()
            java.lang.Object r2 = r2.invoke(r0)
            gd.f0 r2 = (gd.f0) r2
            boolean r3 = r2.h()
            if (r3 == 0) goto L1b
            return r1
        L1b:
            java.util.List r3 = gd.b0.l()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L2a
        L26:
            od.h r6 = od.h.NULLABLE
            goto Lc0
        L2a:
            java.util.List r3 = gd.b0.k()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L38
        L34:
            od.h r6 = od.h.NOT_NULL
            goto Lc0
        L38:
            wd.c r3 = gd.b0.g()
            boolean r3 = hc.t.a(r0, r3)
            if (r3 == 0) goto L43
            goto L26
        L43:
            wd.c r3 = gd.b0.h()
            boolean r3 = hc.t.a(r0, r3)
            if (r3 == 0) goto L51
        L4d:
            od.h r6 = od.h.FORCE_FLEXIBILITY
            goto Lc0
        L51:
            wd.c r3 = gd.b0.f()
            boolean r3 = hc.t.a(r0, r3)
            if (r3 == 0) goto L93
            java.lang.Iterable r6 = r5.b(r6, r4)
            java.lang.Object r6 = ub.s.W(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L34
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L8a;
                case 74175084: goto L81;
                case 433141802: goto L78;
                case 1933739535: goto L6f;
                default: goto L6e;
            }
        L6e:
            goto L92
        L6f:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L92
            goto L34
        L78:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L4d
            goto L92
        L81:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L26
            goto L92
        L8a:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L26
        L92:
            return r1
        L93:
            wd.c r6 = gd.b0.d()
            boolean r6 = hc.t.a(r0, r6)
            if (r6 == 0) goto L9e
            goto L26
        L9e:
            wd.c r6 = gd.b0.c()
            boolean r6 = hc.t.a(r0, r6)
            if (r6 == 0) goto La9
            goto L34
        La9:
            wd.c r6 = gd.b0.a()
            boolean r6 = hc.t.a(r0, r6)
            if (r6 == 0) goto Lb4
            goto L34
        Lb4:
            wd.c r6 = gd.b0.b()
            boolean r6 = hc.t.a(r0, r6)
            if (r6 == 0) goto Lcf
            goto L26
        Lc0:
            od.i r0 = new od.i
            boolean r1 = r2.j()
            if (r1 != 0) goto Lca
            if (r7 == 0) goto Lcb
        Lca:
            r4 = 1
        Lcb:
            r0.<init>(r6, r4)
            return r0
        Lcf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.a.n(java.lang.Object, boolean):od.i");
    }

    private final f0 o(TAnnotation tannotation) {
        wd.c i10 = i(tannotation);
        return (i10 == null || !c.c().containsKey(i10)) ? p(tannotation) : this.f10629a.c().invoke(i10);
    }

    private final f0 p(TAnnotation tannotation) {
        f0 q10 = q(tannotation);
        return q10 != null ? q10 : this.f10629a.d().a();
    }

    private final f0 q(TAnnotation tannotation) {
        Iterable<String> b10;
        Object W;
        f0 f0Var = this.f10629a.d().c().get(i(tannotation));
        if (f0Var != null) {
            return f0Var;
        }
        TAnnotation h10 = h(tannotation, c.d());
        if (h10 == null || (b10 = b(h10, false)) == null) {
            return null;
        }
        W = ub.c0.W(b10);
        String str = (String) W;
        if (str == null) {
            return null;
        }
        f0 b11 = this.f10629a.d().b();
        if (b11 != null) {
            return b11;
        }
        int hashCode = str.hashCode();
        if (hashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return f0.IGNORE;
            }
            return null;
        } else if (hashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return f0.STRICT;
            }
            return null;
        } else if (hashCode != 2656902 || !str.equals("WARN")) {
            return null;
        } else {
            return f0.WARN;
        }
    }

    private final q r(TAnnotation tannotation) {
        q qVar;
        if (!this.f10629a.b() && (qVar = c.a().get(i(tannotation))) != null) {
            f0 o10 = o(tannotation);
            if (!(o10 != f0.IGNORE)) {
                o10 = null;
            }
            if (o10 != null) {
                return q.b(qVar, od.i.b(qVar.d(), null, o10.j(), 1, null), null, false, 6, null);
            }
            return null;
        }
        return null;
    }

    private final tb.r<TAnnotation, Set<gd.b>> t(TAnnotation tannotation) {
        TAnnotation h10;
        TAnnotation tannotation2;
        boolean z10;
        if (!this.f10629a.d().d() && (h10 = h(tannotation, c.e())) != null) {
            Iterator<TAnnotation> it = k(tannotation).iterator();
            while (true) {
                if (!it.hasNext()) {
                    tannotation2 = null;
                    break;
                }
                tannotation2 = it.next();
                if (s(tannotation2) != null) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            if (tannotation2 == null) {
                return null;
            }
            Iterable<String> b10 = b(h10, true);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (String str : b10) {
                gd.b bVar = f10628c.get(str);
                if (bVar != null) {
                    linkedHashSet.add(bVar);
                }
            }
            return new tb.r<>(tannotation2, a(linkedHashSet));
        }
        return null;
    }

    protected abstract Iterable<String> b(TAnnotation tannotation, boolean z10);

    public final x c(x xVar, Iterable<? extends TAnnotation> iterable) {
        EnumMap<gd.b, q> b10;
        hc.t.e(iterable, "annotations");
        if (this.f10629a.b()) {
            return xVar;
        }
        ArrayList<q> arrayList = new ArrayList();
        for (TAnnotation tannotation : iterable) {
            q d10 = d(tannotation);
            if (d10 != null) {
                arrayList.add(d10);
            }
        }
        if (arrayList.isEmpty()) {
            return xVar;
        }
        EnumMap enumMap = (xVar == null || (b10 = xVar.b()) == null) ? new EnumMap(gd.b.class) : new EnumMap((EnumMap) b10);
        boolean z10 = false;
        for (q qVar : arrayList) {
            for (gd.b bVar : qVar.e()) {
                enumMap.put((EnumMap) bVar, (gd.b) qVar);
                z10 = true;
            }
        }
        return !z10 ? xVar : new x(enumMap);
    }

    public final od.f e(Iterable<? extends TAnnotation> iterable) {
        od.f fVar;
        hc.t.e(iterable, "annotations");
        od.f fVar2 = null;
        for (TAnnotation tannotation : iterable) {
            wd.c i10 = i(tannotation);
            if (b0.m().contains(i10)) {
                fVar = od.f.READ_ONLY;
            } else if (b0.j().contains(i10)) {
                fVar = od.f.MUTABLE;
            } else {
                continue;
            }
            if (fVar2 != null && fVar2 != fVar) {
                return null;
            }
            fVar2 = fVar;
        }
        return fVar2;
    }

    public final od.i f(Iterable<? extends TAnnotation> iterable, gc.l<? super TAnnotation, Boolean> lVar) {
        hc.t.e(iterable, "annotations");
        hc.t.e(lVar, "forceWarning");
        od.i iVar = null;
        for (TAnnotation tannotation : iterable) {
            od.i g10 = g(tannotation, lVar);
            if (iVar != null) {
                if (g10 != null && !hc.t.a(g10, iVar) && (!g10.d() || iVar.d())) {
                    if (g10.d() || !iVar.d()) {
                        return null;
                    }
                }
            }
            iVar = g10;
        }
        return iVar;
    }

    protected abstract wd.c i(TAnnotation tannotation);

    protected abstract Object j(TAnnotation tannotation);

    protected abstract Iterable<TAnnotation> k(TAnnotation tannotation);

    public final boolean m(TAnnotation tannotation) {
        hc.t.e(tannotation, "annotation");
        TAnnotation h10 = h(tannotation, k.a.H);
        if (h10 == null) {
            return false;
        }
        Iterable<String> b10 = b(h10, false);
        if ((b10 instanceof Collection) && ((Collection) b10).isEmpty()) {
            return false;
        }
        for (String str : b10) {
            if (hc.t.a(str, yc.n.TYPE.name())) {
                return true;
            }
        }
        return false;
    }

    public final TAnnotation s(TAnnotation tannotation) {
        boolean N;
        TAnnotation tannotation2;
        hc.t.e(tannotation, "annotation");
        if (this.f10629a.d().d()) {
            return null;
        }
        N = ub.c0.N(c.b(), i(tannotation));
        if (N || l(tannotation, c.f())) {
            return tannotation;
        }
        if (!l(tannotation, c.g())) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f10630b;
        Object j10 = j(tannotation);
        TAnnotation tannotation3 = concurrentHashMap.get(j10);
        if (tannotation3 != null) {
            return tannotation3;
        }
        Iterator<TAnnotation> it = k(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotation2 = null;
                break;
            }
            tannotation2 = s(it.next());
            if (tannotation2 != null) {
                break;
            }
        }
        if (tannotation2 == null) {
            return null;
        }
        TAnnotation putIfAbsent = concurrentHashMap.putIfAbsent(j10, tannotation2);
        return putIfAbsent == null ? tannotation2 : putIfAbsent;
    }
}
