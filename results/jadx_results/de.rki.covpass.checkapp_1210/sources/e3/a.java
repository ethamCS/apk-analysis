package e3;

import c4.q;
/* loaded from: classes.dex */
public class a<T extends q<T>> {

    /* renamed from: a */
    Class<T> f9350a;

    /* renamed from: b */
    protected a3.b f9351b = new a3.b();

    /* renamed from: c */
    protected m3.d f9352c;

    public a(Class<T> cls) {
        this.f9350a = cls;
        this.f9352c = m3.b.a(cls);
    }

    public void a(T t10) {
        this.f9352c.c(t10);
        this.f9351b.c(this.f9352c);
    }
}
