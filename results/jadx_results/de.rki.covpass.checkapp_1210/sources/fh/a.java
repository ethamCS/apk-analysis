package fh;

import gg.a0;
import gg.d0;
import gg.g;
import gg.h;
import gg.t;
import gg.v;
import gg.x1;
/* loaded from: classes3.dex */
public class a extends t {

    /* renamed from: c */
    private v f10200c;

    /* renamed from: d */
    private g f10201d;

    private a(d0 d0Var) {
        this.f10200c = (v) d0Var.G(0);
        this.f10201d = d0Var.G(1);
    }

    public a(v vVar, g gVar) {
        this.f10200c = vVar;
        this.f10201d = gVar;
    }

    public static a l(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj == null) {
            throw new IllegalArgumentException("null value in getInstance()");
        }
        return new a(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        h hVar = new h(2);
        hVar.a(this.f10200c);
        hVar.a(this.f10201d);
        return new x1(hVar);
    }

    public v m() {
        return this.f10200c;
    }

    public g n() {
        return this.f10201d;
    }
}
