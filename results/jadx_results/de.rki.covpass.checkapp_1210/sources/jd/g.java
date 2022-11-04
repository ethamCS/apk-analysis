package jd;

import gd.x;
import hc.t;
import kotlin.Lazy;
import ne.n;
import xc.h0;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    private final b f14323a;

    /* renamed from: b */
    private final k f14324b;

    /* renamed from: c */
    private final Lazy<x> f14325c;

    /* renamed from: d */
    private final Lazy f14326d;

    /* renamed from: e */
    private final ld.c f14327e;

    public g(b bVar, k kVar, Lazy<x> lazy) {
        t.e(bVar, "components");
        t.e(kVar, "typeParameterResolver");
        t.e(lazy, "delegateForDefaultTypeQualifiers");
        this.f14323a = bVar;
        this.f14324b = kVar;
        this.f14325c = lazy;
        this.f14326d = lazy;
        this.f14327e = new ld.c(this, kVar);
    }

    public final b a() {
        return this.f14323a;
    }

    public final x b() {
        return (x) this.f14326d.getValue();
    }

    public final Lazy<x> c() {
        return this.f14325c;
    }

    public final h0 d() {
        return this.f14323a.m();
    }

    public final n e() {
        return this.f14323a.u();
    }

    public final k f() {
        return this.f14324b;
    }

    public final ld.c g() {
        return this.f14327e;
    }
}
