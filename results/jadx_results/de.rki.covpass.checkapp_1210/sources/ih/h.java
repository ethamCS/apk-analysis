package ih;

import gg.d0;
import gg.k1;
import gg.q;
import gg.t;
import gg.v;
import gg.w;
import java.math.BigInteger;
import ti.e;
/* loaded from: classes3.dex */
public class h extends t implements o {

    /* renamed from: c */
    private ti.e f12661c;

    /* renamed from: d */
    private byte[] f12662d;

    /* renamed from: q */
    private v f12663q;

    public h(m mVar, BigInteger bigInteger, BigInteger bigInteger2, d0 d0Var) {
        int i10;
        int i11;
        int i12;
        ti.e c0394e;
        this.f12663q = null;
        v l10 = mVar.l();
        this.f12663q = l10;
        if (l10.s(o.I)) {
            c0394e = new e.f(((q) mVar.n()).G(), new BigInteger(1, w.E(d0Var.G(0)).F()), new BigInteger(1, w.E(d0Var.G(1)).F()), bigInteger, bigInteger2);
        } else if (!this.f12663q.s(o.J)) {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        } else {
            d0 F = d0.F(mVar.n());
            int M = ((q) F.G(0)).M();
            v vVar = (v) F.G(1);
            if (vVar.s(o.L)) {
                i12 = q.E(F.G(2)).M();
                i11 = 0;
                i10 = 0;
            } else if (!vVar.s(o.M)) {
                throw new IllegalArgumentException("This type of EC basis is not implemented");
            } else {
                d0 F2 = d0.F(F.G(2));
                int M2 = q.E(F2.G(0)).M();
                int M3 = q.E(F2.G(1)).M();
                i10 = q.E(F2.G(2)).M();
                i12 = M2;
                i11 = M3;
            }
            c0394e = new e.C0394e(M, i12, i11, i10, new BigInteger(1, w.E(d0Var.G(0)).F()), new BigInteger(1, w.E(d0Var.G(1)).F()), bigInteger, bigInteger2);
        }
        this.f12661c = c0394e;
        if (d0Var.size() == 3) {
            this.f12662d = ((k1) d0Var.G(2)).D();
        }
    }

    public h(ti.e eVar, byte[] bArr) {
        this.f12663q = null;
        this.f12661c = eVar;
        this.f12662d = ak.a.h(bArr);
        n();
    }

    private void n() {
        v vVar;
        if (ti.c.n(this.f12661c)) {
            vVar = o.I;
        } else if (!ti.c.l(this.f12661c)) {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        } else {
            vVar = o.J;
        }
        this.f12663q = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    @Override // gg.t, gg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public gg.a0 b() {
        /*
            r3 = this;
            gg.h r0 = new gg.h
            r1 = 3
            r0.<init>(r1)
            gg.v r1 = r3.f12663q
            gg.v r2 = ih.o.I
            boolean r1 = r1.s(r2)
            if (r1 == 0) goto L35
            ih.l r1 = new ih.l
            ti.e r2 = r3.f12661c
            ti.f r2 = r2.n()
            r1.<init>(r2)
            gg.a0 r1 = r1.b()
            r0.a(r1)
            ih.l r1 = new ih.l
            ti.e r2 = r3.f12661c
            ti.f r2 = r2.o()
            r1.<init>(r2)
        L2d:
            gg.a0 r1 = r1.b()
            r0.a(r1)
            goto L5d
        L35:
            gg.v r1 = r3.f12663q
            gg.v r2 = ih.o.J
            boolean r1 = r1.s(r2)
            if (r1 == 0) goto L5d
            ih.l r1 = new ih.l
            ti.e r2 = r3.f12661c
            ti.f r2 = r2.n()
            r1.<init>(r2)
            gg.a0 r1 = r1.b()
            r0.a(r1)
            ih.l r1 = new ih.l
            ti.e r2 = r3.f12661c
            ti.f r2 = r2.o()
            r1.<init>(r2)
            goto L2d
        L5d:
            byte[] r1 = r3.f12662d
            if (r1 == 0) goto L6b
            gg.k1 r1 = new gg.k1
            byte[] r2 = r3.f12662d
            r1.<init>(r2)
            r0.a(r1)
        L6b:
            gg.x1 r1 = new gg.x1
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ih.h.b():gg.a0");
    }

    public ti.e l() {
        return this.f12661c;
    }

    public byte[] m() {
        return ak.a.h(this.f12662d);
    }
}
