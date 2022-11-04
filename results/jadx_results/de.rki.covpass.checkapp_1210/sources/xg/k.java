package xg;

import gg.a0;
import gg.a2;
import gg.d0;
import gg.j0;
import gg.q;
import gg.t;
import gg.x1;
import hh.v;
/* loaded from: classes3.dex */
public class k extends t {
    private static final q V3 = new q(0);
    private v U3;

    /* renamed from: c */
    private boolean f25637c;

    /* renamed from: d */
    private q f25638d;

    /* renamed from: q */
    private i f25639q;

    /* renamed from: x */
    private gg.m f25640x;

    /* renamed from: y */
    private d0 f25641y;

    private k(d0 d0Var) {
        int i10 = 0;
        if (!(d0Var.G(0) instanceof j0) || ((j0) d0Var.G(0)).Q() != 0) {
            this.f25638d = V3;
        } else {
            this.f25637c = true;
            this.f25638d = q.D((j0) d0Var.G(0), true);
            i10 = 1;
        }
        int i11 = i10 + 1;
        this.f25639q = i.l(d0Var.G(i10));
        int i12 = i11 + 1;
        this.f25640x = gg.m.J(d0Var.G(i11));
        int i13 = i12 + 1;
        this.f25641y = (d0) d0Var.G(i12);
        if (d0Var.size() > i13) {
            this.U3 = v.m((j0) d0Var.G(i13), true);
        }
    }

    public static k l(Object obj) {
        if (obj instanceof k) {
            return (k) obj;
        }
        if (obj == null) {
            return null;
        }
        return new k(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(5);
        if (this.f25637c || !this.f25638d.s(V3)) {
            hVar.a(new a2(true, 0, this.f25638d));
        }
        hVar.a(this.f25639q);
        hVar.a(this.f25640x);
        hVar.a(this.f25641y);
        v vVar = this.U3;
        if (vVar != null) {
            hVar.a(new a2(true, 1, vVar));
        }
        return new x1(hVar);
    }

    public i m() {
        return this.f25639q;
    }

    public v n() {
        return this.U3;
    }

    public d0 o() {
        return this.f25641y;
    }
}
