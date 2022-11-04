package fj;

import gg.a0;
import gg.a2;
import gg.d0;
import gg.j0;
import gg.q;
import gg.t;
import gg.t1;
import gg.w;
import gg.x1;
/* loaded from: classes3.dex */
public class m extends t {
    private final byte[] U3;
    private final int V3;
    private final byte[] W3;

    /* renamed from: c */
    private final int f10305c;

    /* renamed from: d */
    private final int f10306d;

    /* renamed from: q */
    private final byte[] f10307q;

    /* renamed from: x */
    private final byte[] f10308x;

    /* renamed from: y */
    private final byte[] f10309y;

    public m(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f10305c = 0;
        this.f10306d = i10;
        this.f10307q = ak.a.h(bArr);
        this.f10308x = ak.a.h(bArr2);
        this.f10309y = ak.a.h(bArr3);
        this.U3 = ak.a.h(bArr4);
        this.W3 = ak.a.h(bArr5);
        this.V3 = -1;
    }

    public m(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i11) {
        this.f10305c = 1;
        this.f10306d = i10;
        this.f10307q = ak.a.h(bArr);
        this.f10308x = ak.a.h(bArr2);
        this.f10309y = ak.a.h(bArr3);
        this.U3 = ak.a.h(bArr4);
        this.W3 = ak.a.h(bArr5);
        this.V3 = i11;
    }

    private m(d0 d0Var) {
        int i10;
        q E = q.E(d0Var.G(0));
        if (E.H(0) || E.H(1)) {
            this.f10305c = E.M();
            if (d0Var.size() != 2 && d0Var.size() != 3) {
                throw new IllegalArgumentException("key sequence wrong size");
            }
            d0 F = d0.F(d0Var.G(1));
            this.f10306d = q.E(F.G(0)).M();
            this.f10307q = ak.a.h(w.E(F.G(1)).F());
            this.f10308x = ak.a.h(w.E(F.G(2)).F());
            this.f10309y = ak.a.h(w.E(F.G(3)).F());
            this.U3 = ak.a.h(w.E(F.G(4)).F());
            if (F.size() == 6) {
                j0 N = j0.N(F.G(5));
                if (N.Q() != 0) {
                    throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
                }
                i10 = q.D(N, false).M();
            } else if (F.size() != 5) {
                throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
            } else {
                i10 = -1;
            }
            this.V3 = i10;
            if (d0Var.size() == 3) {
                this.W3 = ak.a.h(w.D(j0.N(d0Var.G(2)), true).F());
                return;
            } else {
                this.W3 = null;
                return;
            }
        }
        throw new IllegalArgumentException("unknown version of sequence");
    }

    public static m n(Object obj) {
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj == null) {
            return null;
        }
        return new m(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h();
        hVar.a(this.V3 >= 0 ? new q(1L) : new q(0L));
        gg.h hVar2 = new gg.h();
        hVar2.a(new q(this.f10306d));
        hVar2.a(new t1(this.f10307q));
        hVar2.a(new t1(this.f10308x));
        hVar2.a(new t1(this.f10309y));
        hVar2.a(new t1(this.U3));
        if (this.V3 >= 0) {
            hVar2.a(new a2(false, 0, new q(this.V3)));
        }
        hVar.a(new x1(hVar2));
        hVar.a(new a2(true, 0, new t1(this.W3)));
        return new x1(hVar);
    }

    public byte[] l() {
        return ak.a.h(this.W3);
    }

    public int m() {
        return this.f10306d;
    }

    public int o() {
        return this.V3;
    }

    public byte[] q() {
        return ak.a.h(this.f10309y);
    }

    public byte[] r() {
        return ak.a.h(this.U3);
    }

    public byte[] s() {
        return ak.a.h(this.f10308x);
    }

    public byte[] u() {
        return ak.a.h(this.f10307q);
    }

    public int w() {
        return this.f10305c;
    }
}
