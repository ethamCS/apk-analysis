package j0;
/* loaded from: classes.dex */
class g<T> implements f<T> {

    /* renamed from: a */
    private final Object[] f13897a;

    /* renamed from: b */
    private int f13898b;

    public g(int i10) {
        if (i10 > 0) {
            this.f13897a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // j0.f
    public boolean a(T t10) {
        int i10 = this.f13898b;
        Object[] objArr = this.f13897a;
        if (i10 < objArr.length) {
            objArr[i10] = t10;
            this.f13898b = i10 + 1;
            return true;
        }
        return false;
    }

    @Override // j0.f
    public T b() {
        int i10 = this.f13898b;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = this.f13897a;
            T t10 = (T) objArr[i11];
            objArr[i11] = null;
            this.f13898b = i10 - 1;
            return t10;
        }
        return null;
    }

    @Override // j0.f
    public void c(T[] tArr, int i10) {
        if (i10 > tArr.length) {
            i10 = tArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            T t10 = tArr[i11];
            int i12 = this.f13898b;
            Object[] objArr = this.f13897a;
            if (i12 < objArr.length) {
                objArr[i12] = t10;
                this.f13898b = i12 + 1;
            }
        }
    }
}
