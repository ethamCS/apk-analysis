package hc;

import oc.i;
import oc.m;
/* loaded from: classes.dex */
public abstract class x extends z implements oc.i {
    public x(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // hc.h
    protected oc.c c0() {
        return k0.e(this);
    }

    @Override // oc.k, oc.l
    public m.a i() {
        return ((oc.i) f0()).i();
    }

    @Override // gc.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // oc.h, oc.i
    public i.a n() {
        return ((oc.i) f0()).n();
    }
}
