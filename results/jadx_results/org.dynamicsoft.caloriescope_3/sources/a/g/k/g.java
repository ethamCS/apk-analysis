package a.g.k;
/* loaded from: classes.dex */
public class g<T> extends f<T> {

    /* renamed from: c */
    private final Object f249c = new Object();

    public g(int i) {
        super(i);
    }

    @Override // a.g.k.f, a.g.k.e
    public T a() {
        T t;
        synchronized (this.f249c) {
            t = (T) super.a();
        }
        return t;
    }

    @Override // a.g.k.f, a.g.k.e
    public boolean a(T t) {
        boolean a2;
        synchronized (this.f249c) {
            a2 = super.a(t);
        }
        return a2;
    }
}
