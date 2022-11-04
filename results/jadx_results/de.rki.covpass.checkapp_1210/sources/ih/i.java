package ih;

import gg.a0;
import gg.d0;
import gg.q;
import gg.t;
import gg.w;
import gg.x1;
import java.math.BigInteger;
/* loaded from: classes3.dex */
public class i extends t implements o {
    private static final BigInteger V3 = BigInteger.valueOf(1);
    private byte[] U3;

    /* renamed from: c */
    private m f12664c;

    /* renamed from: d */
    private ti.e f12665d;

    /* renamed from: q */
    private k f12666q;

    /* renamed from: x */
    private BigInteger f12667x;

    /* renamed from: y */
    private BigInteger f12668y;

    private i(d0 d0Var) {
        if (!(d0Var.G(0) instanceof q) || !((q) d0Var.G(0)).H(1)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        this.f12667x = ((q) d0Var.G(4)).G();
        if (d0Var.size() == 6) {
            this.f12668y = ((q) d0Var.G(5)).G();
        }
        h hVar = new h(m.m(d0Var.G(1)), this.f12667x, this.f12668y, d0.F(d0Var.G(2)));
        this.f12665d = hVar.l();
        gg.g G = d0Var.G(3);
        if (G instanceof k) {
            this.f12666q = (k) G;
        } else {
            this.f12666q = new k(this.f12665d, (w) G);
        }
        this.U3 = hVar.m();
    }

    public i(ti.e eVar, k kVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eVar, kVar, bigInteger, bigInteger2, null);
    }

    public i(ti.e eVar, k kVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        m mVar;
        this.f12665d = eVar;
        this.f12666q = kVar;
        this.f12667x = bigInteger;
        this.f12668y = bigInteger2;
        this.U3 = ak.a.h(bArr);
        if (ti.c.n(eVar)) {
            mVar = new m(eVar.s().c());
        } else if (!ti.c.l(eVar)) {
            throw new IllegalArgumentException("'curve' is of an unsupported type");
        } else {
            int[] a10 = ((aj.f) eVar.s()).a().a();
            if (a10.length == 3) {
                mVar = new m(a10[2], a10[1]);
            } else if (a10.length != 5) {
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            } else {
                mVar = new m(a10[4], a10[1], a10[2], a10[3]);
            }
        }
        this.f12664c = mVar;
    }

    public static i o(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj == null) {
            return null;
        }
        return new i(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(6);
        hVar.a(new q(V3));
        hVar.a(this.f12664c);
        hVar.a(new h(this.f12665d, this.U3));
        hVar.a(this.f12666q);
        hVar.a(new q(this.f12667x));
        if (this.f12668y != null) {
            hVar.a(new q(this.f12668y));
        }
        return new x1(hVar);
    }

    public ti.e l() {
        return this.f12665d;
    }

    public ti.i m() {
        return this.f12666q.l();
    }

    public BigInteger n() {
        return this.f12668y;
    }

    public BigInteger q() {
        return this.f12667x;
    }

    public byte[] r() {
        return ak.a.h(this.U3);
    }
}
