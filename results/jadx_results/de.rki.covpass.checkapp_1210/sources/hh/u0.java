package hh;

import java.text.ParseException;
import java.util.Date;
/* loaded from: classes3.dex */
public class u0 extends gg.t implements gg.f {

    /* renamed from: c */
    gg.a0 f12074c;

    public u0(gg.a0 a0Var) {
        if ((a0Var instanceof gg.l0) || (a0Var instanceof gg.m)) {
            this.f12074c = a0Var;
            return;
        }
        throw new IllegalArgumentException("unknown object passed to Time");
    }

    public static u0 m(Object obj) {
        if (obj == null || (obj instanceof u0)) {
            return (u0) obj;
        }
        if (obj instanceof gg.l0) {
            return new u0((gg.l0) obj);
        }
        if (obj instanceof gg.m) {
            return new u0((gg.m) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        return this.f12074c;
    }

    public Date l() {
        try {
            gg.a0 a0Var = this.f12074c;
            return a0Var instanceof gg.l0 ? ((gg.l0) a0Var).D() : ((gg.m) a0Var).G();
        } catch (ParseException e10) {
            throw new IllegalStateException("invalid date string: " + e10.getMessage());
        }
    }

    public String n() {
        gg.a0 a0Var = this.f12074c;
        return a0Var instanceof gg.l0 ? ((gg.l0) a0Var).E() : ((gg.m) a0Var).K();
    }

    public String toString() {
        return n();
    }
}
