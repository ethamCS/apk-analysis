package kd;

import hc.t;
import hc.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nd.n;
import nd.p;
import nd.q;
import nd.r;
import nd.w;
import ub.c0;
import ub.p0;
import ub.u;
/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a */
    private final nd.g f14872a;

    /* renamed from: b */
    private final gc.l<q, Boolean> f14873b;

    /* renamed from: c */
    private final gc.l<r, Boolean> f14874c;

    /* renamed from: d */
    private final Map<wd.f, List<r>> f14875d;

    /* renamed from: e */
    private final Map<wd.f, n> f14876e;

    /* renamed from: f */
    private final Map<wd.f, w> f14877f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kd.a$a */
    /* loaded from: classes.dex */
    public static final class C0218a extends v implements gc.l<r, Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0218a() {
            super(1);
            a.this = r1;
        }

        /* renamed from: b */
        public final Boolean invoke(r rVar) {
            t.e(rVar, "m");
            return Boolean.valueOf(((Boolean) a.this.f14873b.invoke(rVar)).booleanValue() && !p.c(rVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(nd.g gVar, gc.l<? super q, Boolean> lVar) {
        af.h M;
        af.h q10;
        af.h M2;
        af.h q11;
        int s10;
        int d10;
        int b10;
        t.e(gVar, "jClass");
        t.e(lVar, "memberFilter");
        this.f14872a = gVar;
        this.f14873b = lVar;
        C0218a c0218a = new C0218a();
        this.f14874c = c0218a;
        M = c0.M(gVar.O());
        q10 = af.p.q(M, c0218a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : q10) {
            wd.f name = ((r) obj).getName();
            Object obj2 = linkedHashMap.get(name);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(name, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f14875d = linkedHashMap;
        M2 = c0.M(this.f14872a.x());
        q11 = af.p.q(M2, this.f14873b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : q11) {
            linkedHashMap2.put(((n) obj3).getName(), obj3);
        }
        this.f14876e = linkedHashMap2;
        Collection<w> u10 = this.f14872a.u();
        gc.l<q, Boolean> lVar2 = this.f14873b;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : u10) {
            if (((Boolean) lVar2.invoke(obj4)).booleanValue()) {
                arrayList.add(obj4);
            }
        }
        s10 = ub.v.s(arrayList, 10);
        d10 = p0.d(s10);
        b10 = nc.m.b(d10, 16);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(b10);
        for (Object obj5 : arrayList) {
            linkedHashMap3.put(((w) obj5).getName(), obj5);
        }
        this.f14877f = linkedHashMap3;
    }

    @Override // kd.b
    public Collection<r> a(wd.f fVar) {
        List h10;
        t.e(fVar, "name");
        List<r> list = this.f14875d.get(fVar);
        if (list != null) {
            return list;
        }
        h10 = u.h();
        return h10;
    }

    @Override // kd.b
    public n b(wd.f fVar) {
        t.e(fVar, "name");
        return this.f14876e.get(fVar);
    }

    @Override // kd.b
    public Set<wd.f> c() {
        af.h M;
        af.h<r> q10;
        M = c0.M(this.f14872a.O());
        q10 = af.p.q(M, this.f14874c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (r rVar : q10) {
            linkedHashSet.add(rVar.getName());
        }
        return linkedHashSet;
    }

    @Override // kd.b
    public w d(wd.f fVar) {
        t.e(fVar, "name");
        return this.f14877f.get(fVar);
    }

    @Override // kd.b
    public Set<wd.f> e() {
        return this.f14877f.keySet();
    }

    @Override // kd.b
    public Set<wd.f> f() {
        af.h M;
        af.h<n> q10;
        M = c0.M(this.f14872a.x());
        q10 = af.p.q(M, this.f14873b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar : q10) {
            linkedHashSet.add(nVar.getName());
        }
        return linkedHashSet;
    }
}
