package jd;

import af.p;
import gc.l;
import hc.t;
import hc.v;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ub.c0;
import uc.k;
import yc.g;
/* loaded from: classes.dex */
public final class d implements yc.g {

    /* renamed from: c */
    private final g f14314c;

    /* renamed from: d */
    private final nd.d f14315d;

    /* renamed from: q */
    private final boolean f14316q;

    /* renamed from: x */
    private final ne.h<nd.a, yc.c> f14317x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends v implements l<nd.a, yc.c> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(1);
            d.this = r1;
        }

        /* renamed from: b */
        public final yc.c invoke(nd.a aVar) {
            t.e(aVar, "annotation");
            return hd.c.f11799a.e(aVar, d.this.f14314c, d.this.f14316q);
        }
    }

    public d(g gVar, nd.d dVar, boolean z10) {
        t.e(gVar, "c");
        t.e(dVar, "annotationOwner");
        this.f14314c = gVar;
        this.f14315d = dVar;
        this.f14316q = z10;
        this.f14317x = gVar.a().u().i(new a());
    }

    public /* synthetic */ d(g gVar, nd.d dVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, dVar, (i10 & 4) != 0 ? false : z10);
    }

    @Override // yc.g
    public boolean B(wd.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // yc.g
    public yc.c h(wd.c cVar) {
        yc.c invoke;
        t.e(cVar, "fqName");
        nd.a h10 = this.f14315d.h(cVar);
        return (h10 == null || (invoke = this.f14317x.invoke(h10)) == null) ? hd.c.f11799a.a(cVar, this.f14315d, this.f14314c) : invoke;
    }

    @Override // yc.g
    public boolean isEmpty() {
        return this.f14315d.j().isEmpty() && !this.f14315d.v();
    }

    @Override // java.lang.Iterable
    public Iterator<yc.c> iterator() {
        af.h M;
        af.h z10;
        af.h C;
        af.h s10;
        M = c0.M(this.f14315d.j());
        z10 = p.z(M, this.f14317x);
        C = p.C(z10, hd.c.f11799a.a(k.a.f23513y, this.f14315d, this.f14314c));
        s10 = p.s(C);
        return s10.iterator();
    }
}
