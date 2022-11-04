package ue;

import hc.t;
import oe.e0;
import pe.e;
import xc.f1;
/* loaded from: classes3.dex */
final class c {

    /* renamed from: a */
    private final f1 f23600a;

    /* renamed from: b */
    private final e0 f23601b;

    /* renamed from: c */
    private final e0 f23602c;

    public c(f1 f1Var, e0 e0Var, e0 e0Var2) {
        t.e(f1Var, "typeParameter");
        t.e(e0Var, "inProjection");
        t.e(e0Var2, "outProjection");
        this.f23600a = f1Var;
        this.f23601b = e0Var;
        this.f23602c = e0Var2;
    }

    public final e0 a() {
        return this.f23601b;
    }

    public final e0 b() {
        return this.f23602c;
    }

    public final f1 c() {
        return this.f23600a;
    }

    public final boolean d() {
        return e.f19146a.d(this.f23601b, this.f23602c);
    }
}
