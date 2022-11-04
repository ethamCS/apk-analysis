package oe;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes3.dex */
public abstract class e0 implements yc.a, se.i {

    /* renamed from: c */
    private int f17952c;

    private e0() {
    }

    public /* synthetic */ e0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int T0() {
        return g0.a(this) ? super.hashCode() : (((W0().hashCode() * 31) + U0().hashCode()) * 31) + (X0() ? 1 : 0);
    }

    public abstract List<g1> U0();

    public abstract a1 V0();

    public abstract e1 W0();

    public abstract boolean X0();

    public abstract e0 Y0(pe.g gVar);

    public abstract q1 Z0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return X0() == e0Var.X0() && pe.r.f19173a.a(Z0(), e0Var.Z0());
    }

    public final int hashCode() {
        int i10 = this.f17952c;
        if (i10 != 0) {
            return i10;
        }
        int T0 = T0();
        this.f17952c = T0;
        return T0;
    }

    @Override // yc.a
    public yc.g j() {
        return k.a(V0());
    }

    public abstract he.h z();
}
