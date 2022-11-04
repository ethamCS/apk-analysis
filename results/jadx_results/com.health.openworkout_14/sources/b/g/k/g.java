package b.g.k;
/* loaded from: classes.dex */
public class g<T> extends f<T> {

    /* renamed from: c */
    private final Object f2497c = new Object();

    public g(int i) {
        super(i);
    }

    @Override // b.g.k.f, b.g.k.e
    public boolean a(T t) {
        boolean a2;
        synchronized (this.f2497c) {
            a2 = super.a(t);
        }
        return a2;
    }

    @Override // b.g.k.f, b.g.k.e
    public T b() {
        T t;
        synchronized (this.f2497c) {
            t = (T) super.b();
        }
        return t;
    }
}
