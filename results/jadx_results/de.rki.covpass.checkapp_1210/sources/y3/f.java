package y3;

import c4.f;
/* loaded from: classes.dex */
public class f<T extends c4.f<T>> extends k<T> {

    /* renamed from: b */
    a f25791b;

    /* renamed from: c */
    a f25792c;

    public f(c cVar) {
        this.f25791b = cVar.a();
        this.f25792c = cVar.a();
    }

    @Override // y3.k
    public int c(int i10, int i11) {
        return ((c4.f) this.f25795a).c0(this.f25792c.a(i10), this.f25791b.a(i11));
    }

    /* renamed from: d */
    public void a(T t10) {
        super.a(t10);
        this.f25792c.b(t10.f6220q);
        this.f25791b.b(t10.f6221x);
    }
}
