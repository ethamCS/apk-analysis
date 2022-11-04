package b.e.b;
/* loaded from: classes.dex */
class g<T> implements f<T> {

    /* renamed from: a */
    private final Object[] f2207a;

    /* renamed from: b */
    private int f2208b;

    public g(int i) {
        if (i > 0) {
            this.f2207a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // b.e.b.f
    public boolean a(T t) {
        int i = this.f2208b;
        Object[] objArr = this.f2207a;
        if (i < objArr.length) {
            objArr[i] = t;
            this.f2208b = i + 1;
            return true;
        }
        return false;
    }

    @Override // b.e.b.f
    public T b() {
        int i = this.f2208b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f2207a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f2208b = i - 1;
            return t;
        }
        return null;
    }

    @Override // b.e.b.f
    public void c(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f2208b;
            Object[] objArr = this.f2207a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f2208b = i3 + 1;
            }
        }
    }
}
