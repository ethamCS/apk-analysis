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
public class k extends t {
    private final byte[] U3;
    private final byte[] V3;
    private final byte[] W3;

    /* renamed from: c */
    private final int f10298c;

    /* renamed from: d */
    private final long f10299d;

    /* renamed from: q */
    private final long f10300q;

    /* renamed from: x */
    private final byte[] f10301x;

    /* renamed from: y */
    private final byte[] f10302y;

    public k(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f10298c = 0;
        this.f10299d = j10;
        this.f10301x = ak.a.h(bArr);
        this.f10302y = ak.a.h(bArr2);
        this.U3 = ak.a.h(bArr3);
        this.V3 = ak.a.h(bArr4);
        this.W3 = ak.a.h(bArr5);
        this.f10300q = -1L;
    }

    public k(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j11) {
        this.f10298c = 1;
        this.f10299d = j10;
        this.f10301x = ak.a.h(bArr);
        this.f10302y = ak.a.h(bArr2);
        this.U3 = ak.a.h(bArr3);
        this.V3 = ak.a.h(bArr4);
        this.W3 = ak.a.h(bArr5);
        this.f10300q = j11;
    }

    private k(d0 d0Var) {
        long j10;
        q E = q.E(d0Var.G(0));
        if (E.H(0) || E.H(1)) {
            this.f10298c = E.M();
            if (d0Var.size() != 2 && d0Var.size() != 3) {
                throw new IllegalArgumentException("key sequence wrong size");
            }
            d0 F = d0.F(d0Var.G(1));
            this.f10299d = q.E(F.G(0)).P();
            this.f10301x = ak.a.h(w.E(F.G(1)).F());
            this.f10302y = ak.a.h(w.E(F.G(2)).F());
            this.U3 = ak.a.h(w.E(F.G(3)).F());
            this.V3 = ak.a.h(w.E(F.G(4)).F());
            if (F.size() == 6) {
                j0 N = j0.N(F.G(5));
                if (N.Q() != 0) {
                    throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
                }
                j10 = q.D(N, false).P();
            } else if (F.size() != 5) {
                throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
            } else {
                j10 = -1;
            }
            this.f10300q = j10;
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

    public static k n(Object obj) {
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
        gg.h hVar = new gg.h();
        hVar.a(this.f10300q >= 0 ? new q(1L) : new q(0L));
        gg.h hVar2 = new gg.h();
        hVar2.a(new q(this.f10299d));
        hVar2.a(new t1(this.f10301x));
        hVar2.a(new t1(this.f10302y));
        hVar2.a(new t1(this.U3));
        hVar2.a(new t1(this.V3));
        if (this.f10300q >= 0) {
            hVar2.a(new a2(false, 0, new q(this.f10300q)));
        }
        hVar.a(new x1(hVar2));
        hVar.a(new a2(true, 0, new t1(this.W3)));
        return new x1(hVar);
    }

    public byte[] l() {
        return ak.a.h(this.W3);
    }

    public long m() {
        return this.f10299d;
    }

    public long o() {
        return this.f10300q;
    }

    public byte[] q() {
        return ak.a.h(this.U3);
    }

    public byte[] r() {
        return ak.a.h(this.V3);
    }

    public byte[] s() {
        return ak.a.h(this.f10302y);
    }

    public byte[] u() {
        return ak.a.h(this.f10301x);
    }

    public int w() {
        return this.f10298c;
    }
}
