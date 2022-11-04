package h2;

import c4.l;
import c4.q;
import c4.t;
/* loaded from: classes.dex */
public class g<T extends q<T>> implements h<T> {

    /* renamed from: a */
    t<T> f11180a;

    /* renamed from: b */
    double f11181b;

    /* renamed from: c */
    boolean f11182c;

    public g(double d10, boolean z10, t<T> tVar) {
        this.f11181b = d10;
        this.f11182c = z10;
        this.f11180a = tVar;
    }

    /* renamed from: b */
    public void a(T t10, l lVar) {
        q2.d.k(t10, lVar, this.f11181b, this.f11182c);
    }

    @Override // h2.h
    public t<T> getInputType() {
        return this.f11180a;
    }
}
