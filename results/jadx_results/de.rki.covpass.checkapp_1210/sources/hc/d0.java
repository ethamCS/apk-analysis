package hc;

import oc.m;
/* loaded from: classes.dex */
public abstract class d0 extends f0 implements oc.m {
    public d0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // hc.h
    protected oc.c c0() {
        return k0.g(this);
    }

    @Override // oc.k, oc.l
    public m.a i() {
        return ((oc.m) f0()).i();
    }

    @Override // gc.l
    public Object invoke(Object obj) {
        return get(obj);
    }
}
