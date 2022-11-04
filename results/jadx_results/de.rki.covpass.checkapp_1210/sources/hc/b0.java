package hc;

import oc.l;
/* loaded from: classes.dex */
public abstract class b0 extends f0 implements oc.l {
    public b0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // hc.h
    protected oc.c c0() {
        return k0.f(this);
    }

    @Override // oc.k, oc.l
    public l.a i() {
        return ((oc.l) f0()).i();
    }

    @Override // gc.a
    public Object invoke() {
        return get();
    }
}
