package dh;

import gg.a0;
import gg.d0;
import gg.g;
import gg.h;
import gg.t;
import gg.t1;
import gg.v;
import gg.w;
import gg.x1;
/* loaded from: classes3.dex */
public class d extends t {

    /* renamed from: x */
    private static final byte[] f9054x = {-87, -42, -21, 69, -15, 60, 112, -126, Byte.MIN_VALUE, -60, -106, 123, 35, 31, 94, -83, -10, 88, -21, -92, -64, 55, 41, 29, 56, -39, 107, -16, 37, -54, 78, 23, -8, -23, 114, 13, -58, 21, -76, 58, 40, -105, 95, 11, -63, -34, -93, 100, 56, -75, 100, -22, 44, 23, -97, -48, 18, 62, 109, -72, -6, -59, 121, 4};

    /* renamed from: c */
    private v f9055c;

    /* renamed from: d */
    private b f9056d;

    /* renamed from: q */
    private byte[] f9057q = f9054x;

    public d(b bVar) {
        this.f9056d = bVar;
    }

    public d(v vVar) {
        this.f9055c = vVar;
    }

    public static byte[] m() {
        return ak.a.h(f9054x);
    }

    public static d o(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj == null) {
            throw new IllegalArgumentException("object parse error");
        }
        d0 F = d0.F(obj);
        d dVar = F.G(0) instanceof v ? new d(v.K(F.G(0))) : new d(b.q(F.G(0)));
        if (F.size() == 2) {
            byte[] F2 = w.E(F.G(1)).F();
            dVar.f9057q = F2;
            if (F2.length != f9054x.length) {
                throw new IllegalArgumentException("object parse error");
            }
        }
        return dVar;
    }

    @Override // gg.t, gg.g
    public a0 b() {
        h hVar = new h(2);
        g gVar = this.f9055c;
        if (gVar == null) {
            gVar = this.f9056d;
        }
        hVar.a(gVar);
        if (!ak.a.c(this.f9057q, f9054x)) {
            hVar.a(new t1(this.f9057q));
        }
        return new x1(hVar);
    }

    public byte[] l() {
        return ak.a.h(this.f9057q);
    }

    public b n() {
        return this.f9056d;
    }

    public v q() {
        return this.f9055c;
    }

    public boolean r() {
        return this.f9055c != null;
    }
}
