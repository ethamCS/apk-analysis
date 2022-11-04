package a.e.a;
/* loaded from: classes.dex */
class h<T> implements g<T> {

    /* renamed from: a */
    private final Object[] f114a;

    /* renamed from: b */
    private int f115b;

    public h(int i) {
        if (i > 0) {
            this.f114a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // a.e.a.g
    public T a() {
        int i = this.f115b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f114a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f115b = i - 1;
            return t;
        }
        return null;
    }

    @Override // a.e.a.g
    public void a(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f115b;
            Object[] objArr = this.f114a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f115b = i3 + 1;
            }
        }
    }

    @Override // a.e.a.g
    public boolean a(T t) {
        int i = this.f115b;
        Object[] objArr = this.f114a;
        if (i < objArr.length) {
            objArr[i] = t;
            this.f115b = i + 1;
            return true;
        }
        return false;
    }
}
