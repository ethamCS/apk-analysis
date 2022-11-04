package b.g.k;
/* loaded from: classes.dex */
public class f<T> implements e<T> {

    /* renamed from: a */
    private final Object[] f2495a;

    /* renamed from: b */
    private int f2496b;

    public f(int i) {
        if (i > 0) {
            this.f2495a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private boolean c(T t) {
        for (int i = 0; i < this.f2496b; i++) {
            if (this.f2495a[i] == t) {
                return true;
            }
        }
        return false;
    }

    @Override // b.g.k.e
    public boolean a(T t) {
        if (!c(t)) {
            int i = this.f2496b;
            Object[] objArr = this.f2495a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f2496b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override // b.g.k.e
    public T b() {
        int i = this.f2496b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f2495a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f2496b = i - 1;
            return t;
        }
        return null;
    }
}
