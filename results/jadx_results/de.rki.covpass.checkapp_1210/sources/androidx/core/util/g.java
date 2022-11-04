package androidx.core.util;
/* loaded from: classes.dex */
public class g<T> extends f<T> {

    /* renamed from: c */
    private final Object f3600c = new Object();

    public g(int i10) {
        super(i10);
    }

    @Override // androidx.core.util.f, androidx.core.util.e
    public boolean a(T t10) {
        boolean a10;
        synchronized (this.f3600c) {
            a10 = super.a(t10);
        }
        return a10;
    }

    @Override // androidx.core.util.f, androidx.core.util.e
    public T b() {
        T t10;
        synchronized (this.f3600c) {
            t10 = (T) super.b();
        }
        return t10;
    }
}
