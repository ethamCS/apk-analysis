package h4;

import java.util.Collections;
/* loaded from: classes.dex */
public class q<K, A> extends a<K, A> {

    /* renamed from: i */
    private final A f11310i;

    public q(r4.c<A> cVar) {
        this(cVar, null);
    }

    public q(r4.c<A> cVar, A a10) {
        super(Collections.emptyList());
        n(cVar);
        this.f11310i = a10;
    }

    @Override // h4.a
    float c() {
        return 1.0f;
    }

    @Override // h4.a
    public A h() {
        r4.c<A> cVar = this.f11252e;
        A a10 = this.f11310i;
        return cVar.b(0.0f, 0.0f, a10, a10, f(), f(), f());
    }

    @Override // h4.a
    A i(r4.a<K> aVar, float f10) {
        return h();
    }

    @Override // h4.a
    public void k() {
        if (this.f11252e != null) {
            super.k();
        }
    }

    @Override // h4.a
    public void m(float f10) {
        this.f11251d = f10;
    }
}
