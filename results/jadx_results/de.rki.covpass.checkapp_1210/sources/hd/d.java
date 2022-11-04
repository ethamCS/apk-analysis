package hd;

import gc.l;
import hc.t;
import hc.v;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oe.e0;
import tb.x;
import ub.q0;
import ub.y0;
import ub.z;
import uc.k;
import xc.h0;
import xc.j1;
import yc.m;
import yc.n;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final d f11804a = new d();

    /* renamed from: b */
    private static final Map<String, EnumSet<n>> f11805b;

    /* renamed from: c */
    private static final Map<String, m> f11806c;

    /* loaded from: classes.dex */
    public static final class a extends v implements l<h0, e0> {

        /* renamed from: c */
        public static final a f11807c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final e0 invoke(h0 h0Var) {
            t.e(h0Var, "module");
            j1 b10 = hd.a.b(c.f11799a.d(), h0Var.x().o(k.a.H));
            e0 type = b10 != null ? b10.getType() : null;
            return type == null ? qe.k.d(qe.j.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
        }
    }

    static {
        Map<String, EnumSet<n>> k10;
        Map<String, m> k11;
        k10 = q0.k(x.a("PACKAGE", EnumSet.noneOf(n.class)), x.a("TYPE", EnumSet.of(n.CLASS, n.FILE)), x.a("ANNOTATION_TYPE", EnumSet.of(n.ANNOTATION_CLASS)), x.a("TYPE_PARAMETER", EnumSet.of(n.TYPE_PARAMETER)), x.a("FIELD", EnumSet.of(n.FIELD)), x.a("LOCAL_VARIABLE", EnumSet.of(n.LOCAL_VARIABLE)), x.a("PARAMETER", EnumSet.of(n.VALUE_PARAMETER)), x.a("CONSTRUCTOR", EnumSet.of(n.CONSTRUCTOR)), x.a("METHOD", EnumSet.of(n.FUNCTION, n.PROPERTY_GETTER, n.PROPERTY_SETTER)), x.a("TYPE_USE", EnumSet.of(n.TYPE)));
        f11805b = k10;
        k11 = q0.k(x.a("RUNTIME", m.RUNTIME), x.a("CLASS", m.BINARY), x.a("SOURCE", m.SOURCE));
        f11806c = k11;
    }

    private d() {
    }

    public final ce.g<?> a(nd.b bVar) {
        nd.m mVar = bVar instanceof nd.m ? (nd.m) bVar : null;
        if (mVar != null) {
            Map<String, m> map = f11806c;
            wd.f a10 = mVar.a();
            m mVar2 = map.get(a10 != null ? a10.b() : null);
            if (mVar2 == null) {
                return null;
            }
            wd.b m10 = wd.b.m(k.a.K);
            t.d(m10, "topLevel(StandardNames.F…ames.annotationRetention)");
            wd.f j10 = wd.f.j(mVar2.name());
            t.d(j10, "identifier(retention.name)");
            return new ce.j(m10, j10);
        }
        return null;
    }

    public final Set<n> b(String str) {
        Set<n> b10;
        EnumSet<n> enumSet = f11805b.get(str);
        if (enumSet != null) {
            return enumSet;
        }
        b10 = y0.b();
        return b10;
    }

    public final ce.g<?> c(List<? extends nd.b> list) {
        int s10;
        t.e(list, "arguments");
        ArrayList<nd.m> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof nd.m) {
                arrayList.add(obj);
            }
        }
        ArrayList<n> arrayList2 = new ArrayList();
        for (nd.m mVar : arrayList) {
            d dVar = f11804a;
            wd.f a10 = mVar.a();
            z.x(arrayList2, dVar.b(a10 != null ? a10.b() : null));
        }
        s10 = ub.v.s(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(s10);
        for (n nVar : arrayList2) {
            wd.b m10 = wd.b.m(k.a.J);
            t.d(m10, "topLevel(StandardNames.FqNames.annotationTarget)");
            wd.f j10 = wd.f.j(nVar.name());
            t.d(j10, "identifier(kotlinTarget.name)");
            arrayList3.add(new ce.j(m10, j10));
        }
        return new ce.b(arrayList3, a.f11807c);
    }
}
