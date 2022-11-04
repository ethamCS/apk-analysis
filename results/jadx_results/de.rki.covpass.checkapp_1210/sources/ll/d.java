package ll;

import java.lang.reflect.Array;
import ll.b;
/* loaded from: classes3.dex */
public class d<D> {

    /* renamed from: a */
    b.a<D> f16102a;

    /* renamed from: b */
    b.AbstractC0242b<D> f16103b;

    /* renamed from: c */
    Class<D> f16104c;

    /* renamed from: d */
    D[] f16105d;

    /* renamed from: e */
    int f16106e;

    public d(b.a<D> aVar) {
        this(aVar, c.f16101a);
    }

    public d(b.a<D> aVar, b.AbstractC0242b<D> abstractC0242b) {
        this(aVar, abstractC0242b, aVar.a().getClass());
    }

    public d(b.a<D> aVar, b.AbstractC0242b<D> abstractC0242b, Class<D> cls) {
        this.f16102a = aVar;
        this.f16103b = abstractC0242b;
        this.f16104c = cls;
        this.f16105d = b(0);
        this.f16106e = 0;
    }

    private D[] b(int i10) {
        return (D[]) ((Object[]) Array.newInstance((Class<?>) this.f16104c, i10));
    }

    public static /* synthetic */ void e(Object obj) {
    }

    public D c(int i10) {
        return this.f16105d[i10];
    }

    public D d() {
        int i10 = this.f16106e;
        if (i10 == this.f16105d.length) {
            D[] b10 = b(Math.max(10, i10 < 1000 ? i10 * 2 : (i10 * 5) / 3));
            D[] dArr = this.f16105d;
            System.arraycopy(dArr, 0, b10, 0, dArr.length);
            for (int length = this.f16105d.length; length < b10.length; length++) {
                b10[length] = this.f16102a.a();
            }
            this.f16105d = b10;
        }
        D[] dArr2 = this.f16105d;
        int i11 = this.f16106e;
        this.f16106e = i11 + 1;
        D d10 = dArr2[i11];
        this.f16103b.a(d10);
        return d10;
    }

    public void f() {
        this.f16106e = 0;
    }

    public void g(int i10) {
        if (i10 >= this.f16105d.length) {
            D[] b10 = b(i10);
            D[] dArr = this.f16105d;
            System.arraycopy(dArr, 0, b10, 0, dArr.length);
            for (int length = this.f16105d.length; length < b10.length; length++) {
                b10[length] = this.f16102a.a();
            }
            this.f16105d = b10;
        }
        for (int i11 = this.f16106e; i11 < i10; i11++) {
            this.f16103b.a(this.f16105d[i11]);
        }
        this.f16106e = i10;
    }

    public int h() {
        return this.f16106e;
    }
}
