package r4;
/* loaded from: classes.dex */
public class c<T> {

    /* renamed from: a */
    private final b<T> f20465a;

    /* renamed from: b */
    private h4.a<?, ?> f20466b;

    /* renamed from: c */
    protected T f20467c;

    public c() {
        this.f20465a = new b<>();
        this.f20467c = null;
    }

    public c(T t10) {
        this.f20465a = new b<>();
        this.f20467c = t10;
    }

    public T a(b<T> bVar) {
        return this.f20467c;
    }

    public final T b(float f10, float f11, T t10, T t11, float f12, float f13, float f14) {
        return a(this.f20465a.h(f10, f11, t10, t11, f12, f13, f14));
    }

    public final void c(h4.a<?, ?> aVar) {
        this.f20466b = aVar;
    }
}
