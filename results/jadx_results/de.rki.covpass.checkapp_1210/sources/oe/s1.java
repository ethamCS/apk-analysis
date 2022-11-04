package oe;

import java.util.List;
/* loaded from: classes3.dex */
public abstract class s1 extends e0 {
    public s1() {
        super(null);
    }

    @Override // oe.e0
    public List<g1> U0() {
        return a1().U0();
    }

    @Override // oe.e0
    public a1 V0() {
        return a1().V0();
    }

    @Override // oe.e0
    public e1 W0() {
        return a1().W0();
    }

    @Override // oe.e0
    public boolean X0() {
        return a1().X0();
    }

    @Override // oe.e0
    public final q1 Z0() {
        e0 a12 = a1();
        while (a12 instanceof s1) {
            a12 = ((s1) a12).a1();
        }
        hc.t.c(a12, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (q1) a12;
    }

    protected abstract e0 a1();

    public boolean b1() {
        return true;
    }

    public String toString() {
        return b1() ? a1().toString() : "<Not computed yet>";
    }

    @Override // oe.e0
    public he.h z() {
        return a1().z();
    }
}
