package u7;
/* loaded from: classes.dex */
class t<T> implements n<T> {

    /* renamed from: a */
    private final n<T> f23285a;

    public t(n<T> nVar) {
        this.f23285a = nVar;
    }

    @Override // u7.n
    public T a(T t10, c cVar) {
        c f10 = cVar == null ? cVar : cVar.f();
        T a10 = this.f23285a.a(t10, f10);
        return cVar == null ? a10 : (T) cVar.g(a10, f10);
    }

    @Override // u7.n
    public T b(T t10, c cVar) {
        c f10 = cVar == null ? cVar : cVar.f();
        T b10 = this.f23285a.b(t10, f10);
        return cVar == null ? b10 : (T) cVar.g(b10, f10);
    }

    @Override // u7.n
    public T c(T t10, T t11, c cVar) {
        c f10 = cVar == null ? cVar : cVar.f();
        T c10 = this.f23285a.c(t10, t11, f10);
        return cVar == null ? c10 : (T) cVar.g(c10, f10);
    }

    @Override // u7.n
    public T d(T t10, T t11, c cVar) {
        c f10 = cVar == null ? cVar : cVar.f();
        T d10 = this.f23285a.d(t10, t11, f10);
        return cVar == null ? d10 : (T) cVar.g(d10, f10);
    }

    @Override // u7.n
    public int e(T t10, T t11) {
        return this.f23285a.e(t10, t11);
    }

    @Override // u7.n
    public T f(T t10, c cVar) {
        c f10 = cVar == null ? cVar : cVar.f();
        T f11 = this.f23285a.f(t10, f10);
        return cVar == null ? f11 : (T) cVar.g(f11, f10);
    }

    @Override // u7.n
    public T g(c cVar, boolean z10) {
        c f10 = cVar == null ? cVar : cVar.f();
        T g10 = this.f23285a.g(f10, z10);
        return cVar == null ? g10 : (T) cVar.g(g10, f10);
    }

    @Override // u7.n
    public o<T> h() {
        return this.f23285a.h();
    }

    @Override // u7.n
    public T i(T t10, T t11, c cVar, boolean z10) {
        c f10 = cVar == null ? cVar : cVar.f();
        T i10 = this.f23285a.i(t10, t11, cVar, z10);
        return cVar == null ? i10 : (T) cVar.g(i10, f10);
    }
}
