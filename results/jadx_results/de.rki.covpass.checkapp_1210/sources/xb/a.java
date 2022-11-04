package xb;

import gc.p;
import hc.t;
import kotlin.Metadata;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lxb/a;", "Lxb/g$b;", "Lxb/g$c;", "key", "Lxb/g$c;", "getKey", "()Lxb/g$c;", "<init>", "(Lxb/g$c;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class a implements g.b {

    /* renamed from: c */
    private final g.c<?> f25508c;

    public a(g.c<?> cVar) {
        t.e(cVar, "key");
        this.f25508c = cVar;
    }

    @Override // xb.g
    public g B(g gVar) {
        return g.b.a.d(this, gVar);
    }

    @Override // xb.g.b, xb.g
    public <R> R f(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r10, pVar);
    }

    @Override // xb.g.b
    public g.c<?> getKey() {
        return this.f25508c;
    }

    @Override // xb.g.b, xb.g
    public <E extends g.b> E i(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // xb.g.b, xb.g
    public g s(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }
}
