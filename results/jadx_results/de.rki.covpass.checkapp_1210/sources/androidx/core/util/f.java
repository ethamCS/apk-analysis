package androidx.core.util;
/* loaded from: classes.dex */
public class f<T> implements e<T> {

    /* renamed from: a */
    private final Object[] f3598a;

    /* renamed from: b */
    private int f3599b;

    public f(int i10) {
        if (i10 > 0) {
            this.f3598a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private boolean c(T t10) {
        for (int i10 = 0; i10 < this.f3599b; i10++) {
            if (this.f3598a[i10] == t10) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.util.e
    public boolean a(T t10) {
        if (!c(t10)) {
            int i10 = this.f3599b;
            Object[] objArr = this.f3598a;
            if (i10 >= objArr.length) {
                return false;
            }
            objArr[i10] = t10;
            this.f3599b = i10 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override // androidx.core.util.e
    public T b() {
        int i10 = this.f3599b;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = this.f3598a;
            T t10 = (T) objArr[i11];
            objArr[i11] = null;
            this.f3599b = i10 - 1;
            return t10;
        }
        return null;
    }
}
