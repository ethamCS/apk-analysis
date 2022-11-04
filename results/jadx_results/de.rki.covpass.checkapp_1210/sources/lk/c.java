package lk;

import ik.b;
import java.util.List;
import jk.d;
import jk.e;
import jk.f;
import jk.g;
import jk.h;
import jk.j;
import jk.k;
/* loaded from: classes3.dex */
public class c<P> implements ik.b<P> {

    /* renamed from: a */
    e f16090a;

    /* renamed from: b */
    f<P> f16091b;

    /* renamed from: c */
    j<P> f16092c;

    /* renamed from: d */
    k<P> f16093d;

    /* renamed from: e */
    jk.c<P> f16094e;

    /* renamed from: f */
    h<P> f16095f;

    /* loaded from: classes3.dex */
    private class a extends b<P> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j<P> jVar, k<P> kVar) {
            super(jVar, kVar);
            c.this = r1;
        }

        @Override // lk.b
        void b() {
            this.f16087a.b(c.this.f16090a);
            this.f16088b.b(c.this.f16090a);
        }
    }

    public c(g<P> gVar) {
        this(new kk.a(gVar), new kk.b(gVar), new d(gVar));
    }

    public c(j<P> jVar, k<P> kVar, jk.c<P> cVar) {
        h<P> hVar = new h<>();
        this.f16095f = hVar;
        this.f16092c = jVar;
        this.f16093d = kVar;
        this.f16094e = cVar;
        this.f16091b = new f<>(hVar, cVar);
    }

    @Override // ik.b
    public void a(List<P> list, boolean z10) {
        e eVar = this.f16090a;
        if (eVar != null) {
            this.f16095f.b(eVar);
        }
        this.f16090a = this.f16091b.c(list, z10);
    }

    @Override // ik.b
    public b.a<P> b() {
        return new a(this.f16092c.a(), this.f16093d.a());
    }
}
