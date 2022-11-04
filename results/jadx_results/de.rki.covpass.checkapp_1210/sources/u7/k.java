package u7;
/* loaded from: classes.dex */
class k<T> implements n<T> {

    /* renamed from: a */
    private final r<T> f23243a;

    /* renamed from: b */
    private final s<T> f23244b;

    public k(o<T> oVar) {
        r<T> rVar = new r<>(oVar);
        this.f23243a = rVar;
        this.f23244b = new s<>(rVar);
    }

    @Override // u7.n
    public T a(T t10, c cVar) {
        return (cVar == null || !cVar.F()) ? this.f23243a.a(t10, cVar) : this.f23244b.a(t10, cVar);
    }

    @Override // u7.n
    public T b(T t10, c cVar) {
        return (cVar == null || !cVar.F()) ? this.f23243a.b(t10, cVar) : this.f23244b.b(t10, cVar);
    }

    @Override // u7.n
    public T c(T t10, T t11, c cVar) {
        return (cVar == null || !cVar.F()) ? this.f23243a.c(t10, t11, cVar) : this.f23244b.c(t10, t11, cVar);
    }

    @Override // u7.n
    public T d(T t10, T t11, c cVar) {
        return (cVar == null || !cVar.F()) ? this.f23243a.d(t10, t11, cVar) : this.f23244b.d(t10, t11, cVar);
    }

    @Override // u7.n
    public int e(T t10, T t11) {
        return this.f23243a.e(t10, t11);
    }

    @Override // u7.n
    public T f(T t10, c cVar) {
        return (cVar == null || !cVar.F()) ? this.f23243a.f(t10, cVar) : this.f23244b.f(t10, cVar);
    }

    @Override // u7.n
    public T g(c cVar, boolean z10) {
        return (cVar == null || !cVar.F()) ? this.f23243a.g(cVar, z10) : this.f23244b.g(cVar, z10);
    }

    @Override // u7.n
    public o<T> h() {
        return this.f23243a.h();
    }

    @Override // u7.n
    public T i(T t10, T t11, c cVar, boolean z10) {
        return (cVar == null || !cVar.F()) ? this.f23243a.i(t10, t11, cVar, z10) : this.f23244b.i(t10, t11, cVar, z10);
    }
}
