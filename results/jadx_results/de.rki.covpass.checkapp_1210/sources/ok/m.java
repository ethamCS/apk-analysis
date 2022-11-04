package ok;

import java.lang.reflect.Array;
/* loaded from: classes3.dex */
public class m<T> extends l<T> {

    /* renamed from: x */
    private final n<T> f18625x;

    public m(Class<T> cls) {
        this(cls, 10);
    }

    public m(Class<T> cls, int i10) {
        super(cls);
        this.f18625x = new n<>(this);
        this.f18623d = 0;
        this.f18622c = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i10));
    }

    public void h(T t10) {
        int i10 = this.f18623d;
        T[] tArr = this.f18622c;
        if (i10 >= tArr.length) {
            i((tArr.length + 1) * 2);
        }
        T[] tArr2 = this.f18622c;
        int i11 = this.f18623d;
        this.f18623d = i11 + 1;
        tArr2[i11] = t10;
    }

    public void i(int i10) {
        j(i10, true);
    }

    public void j(int i10, boolean z10) {
        if (this.f18622c.length >= i10) {
            return;
        }
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f18624q, i10));
        if (z10) {
            System.arraycopy(this.f18622c, 0, tArr, 0, this.f18623d);
        }
        this.f18622c = tArr;
    }

    public void k() {
        this.f18623d = 0;
    }
}
