package ok;

import java.lang.reflect.Array;
import java.util.List;
import ok.a;
/* loaded from: classes3.dex */
public class b<T> extends l<T> {
    private a<T> U3 = new a.C0293a();
    private final c<T> V3 = new c<>(this);

    /* renamed from: x */
    private k<T> f18598x;

    /* renamed from: y */
    private a<T> f18599y;

    public b(int i10, k<T> kVar) {
        super(kVar.a().getClass());
        j(i10, kVar);
    }

    public b(Class<T> cls, k<T> kVar) {
        super(cls);
        j(10, kVar);
    }

    public b(k<T> kVar) {
        super(kVar.a().getClass());
        j(10, kVar);
    }

    public b(k<T> kVar, a<T> aVar) {
        super(kVar.a().getClass());
        this.f18599y = aVar;
        j(10, kVar);
    }

    protected T h() {
        T a10 = this.f18598x.a();
        this.U3.b(a10);
        this.f18599y.b(a10);
        return a10;
    }

    public T i() {
        int i10 = this.f18623d;
        T[] tArr = this.f18622c;
        if (i10 < tArr.length) {
            this.f18623d = i10 + 1;
            T t10 = tArr[i10];
            this.f18599y.b(t10);
            return t10;
        }
        p((tArr.length + 1) * 2);
        T[] tArr2 = this.f18622c;
        int i11 = this.f18623d;
        this.f18623d = i11 + 1;
        return tArr2[i11];
    }

    protected void j(int i10, k<T> kVar) {
        this.f18623d = 0;
        this.f18598x = kVar;
        if (this.f18599y == null) {
            this.f18599y = new a.C0293a();
        }
        this.f18622c = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f18624q, i10));
        if (kVar != null) {
            for (int i11 = 0; i11 < i10; i11++) {
                try {
                    this.f18622c[i11] = h();
                } catch (RuntimeException unused) {
                    throw new RuntimeException("declareInstances is true, but createInstance() can't create a new instance.  Maybe override createInstance()?");
                }
            }
        }
    }

    public T k(int i10) {
        T t10 = this.f18622c[i10];
        while (true) {
            i10++;
            int i11 = this.f18623d;
            if (i10 >= i11) {
                this.f18622c[i11 - 1] = t10;
                this.f18623d = i11 - 1;
                return t10;
            }
            T[] tArr = this.f18622c;
            tArr[i10 - 1] = tArr[i10];
        }
    }

    public T n() {
        int i10 = this.f18623d;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.f18623d = i11;
            return this.f18622c[i11];
        }
        throw new IllegalArgumentException("Size is already zero");
    }

    public void p(int i10) {
        if (this.f18622c.length >= i10) {
            return;
        }
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f18624q, i10));
        T[] tArr2 = this.f18622c;
        System.arraycopy(tArr2, 0, tArr, 0, tArr2.length);
        if (this.f18598x != null) {
            for (int length = this.f18622c.length; length < i10; length++) {
                tArr[length] = h();
            }
        }
        this.f18622c = tArr;
    }

    public void r() {
        this.f18623d = 0;
    }

    public void s(int i10) {
        p(i10);
        for (int i11 = this.f18623d; i11 < i10; i11++) {
            this.f18599y.b(this.f18622c[i11]);
        }
        this.f18623d = i10;
    }

    public List<T> t() {
        return this.V3;
    }
}
