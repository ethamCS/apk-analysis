package a3;

import c4.q;
import y3.h;
/* loaded from: classes.dex */
public abstract class a<T extends q<T>> implements d<T> {

    /* renamed from: a */
    protected h<T> f179a;

    /* renamed from: b */
    protected T f180b;

    /* renamed from: c */
    protected int f181c;

    /* renamed from: d */
    protected int f182d;

    /* renamed from: e */
    protected int f183e;

    @Override // a3.c
    public void a(h<T> hVar) {
        this.f179a = hVar;
    }

    /* renamed from: d */
    public void c(T t10) {
        h<T> hVar = this.f179a;
        if (hVar != null) {
            hVar.a(t10);
        }
        this.f180b = t10;
        this.f181c = t10.k();
        this.f182d = this.f180b.p();
        this.f183e = this.f180b.g();
    }
}
