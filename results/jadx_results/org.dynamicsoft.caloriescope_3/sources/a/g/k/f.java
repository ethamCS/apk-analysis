package a.g.k;
/* loaded from: classes.dex */
public class f<T> implements e<T> {

    /* renamed from: a */
    private final Object[] f247a;

    /* renamed from: b */
    private int f248b;

    public f(int i) {
        if (i > 0) {
            this.f247a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private boolean b(T t) {
        for (int i = 0; i < this.f248b; i++) {
            if (this.f247a[i] == t) {
                return true;
            }
        }
        return false;
    }

    @Override // a.g.k.e
    public T a() {
        int i = this.f248b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f247a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f248b = i - 1;
            return t;
        }
        return null;
    }

    @Override // a.g.k.e
    public boolean a(T t) {
        if (!b(t)) {
            int i = this.f248b;
            Object[] objArr = this.f247a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f248b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
