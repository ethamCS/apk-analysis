package ok;

import java.io.Serializable;
/* loaded from: classes3.dex */
public abstract class l<T> implements Serializable {

    /* renamed from: c */
    public T[] f18622c;

    /* renamed from: d */
    public int f18623d;

    /* renamed from: q */
    public final Class<T> f18624q;

    public l(Class<T> cls) {
        this.f18624q = cls;
    }

    public boolean b(Object obj) {
        for (int i10 = 0; i10 < this.f18623d; i10++) {
            if (this.f18622c[i10].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public T c(int i10) {
        if (i10 < 0 || i10 >= this.f18623d) {
            throw new IllegalArgumentException("Out of bounds. index=" + i10 + " max size " + this.f18623d);
        }
        return this.f18622c[i10];
    }

    public T e() {
        return this.f18622c[this.f18623d - 1];
    }

    public int f(T t10) {
        for (int i10 = 0; i10 < this.f18623d; i10++) {
            if (this.f18622c[i10].equals(t10)) {
                return i10;
            }
        }
        return -1;
    }

    public int g() {
        return this.f18623d;
    }
}
