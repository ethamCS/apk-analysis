package a3;

import c4.q;
import y3.h;
/* loaded from: classes.dex */
public abstract class e<T extends q<T>> implements d<T> {

    /* renamed from: a */
    protected h<T> f186a;

    /* renamed from: b */
    protected T f187b;

    /* renamed from: c */
    protected int f188c;

    /* renamed from: d */
    protected int f189d;

    /* renamed from: e */
    protected int f190e;

    @Override // a3.c
    public void a(h<T> hVar) {
        this.f186a = hVar;
    }

    public void d(T t10) {
        h<T> hVar = this.f186a;
        if (hVar != null) {
            hVar.a(t10);
        }
        this.f187b = t10;
        this.f188c = t10.k();
        this.f189d = this.f187b.p();
        this.f190e = this.f187b.g();
    }
}
