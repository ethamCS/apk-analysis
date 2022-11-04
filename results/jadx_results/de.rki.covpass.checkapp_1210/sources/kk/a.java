package kk;

import jk.e;
import jk.g;
import jk.j;
/* loaded from: classes3.dex */
public class a<P> implements j<P> {

    /* renamed from: a */
    private e f15290a;

    /* renamed from: b */
    private double f15291b = Double.MAX_VALUE;

    /* renamed from: c */
    g<P> f15292c;

    public a(g<P> gVar) {
        this.f15292c = gVar;
    }

    @Override // jk.j
    public j<P> a() {
        return new a(this.f15292c);
    }

    @Override // jk.j
    public void b(Object obj) {
        this.f15290a = (e) obj;
    }
}
