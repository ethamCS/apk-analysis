package hh;

import gg.t1;
import gg.x1;
import java.io.IOException;
/* loaded from: classes3.dex */
public class u extends gg.t {

    /* renamed from: c */
    private gg.v f12071c;

    /* renamed from: d */
    private boolean f12072d;

    /* renamed from: q */
    private gg.w f12073q;

    /* renamed from: x */
    public static final gg.v f12068x = new gg.v("2.5.29.9").L();

    /* renamed from: y */
    public static final gg.v f12070y = new gg.v("2.5.29.14").L();
    public static final gg.v U3 = new gg.v("2.5.29.15").L();
    public static final gg.v V3 = new gg.v("2.5.29.16").L();
    public static final gg.v W3 = new gg.v("2.5.29.17").L();
    public static final gg.v X3 = new gg.v("2.5.29.18").L();
    public static final gg.v Y3 = new gg.v("2.5.29.19").L();
    public static final gg.v Z3 = new gg.v("2.5.29.20").L();

    /* renamed from: a4 */
    public static final gg.v f12045a4 = new gg.v("2.5.29.21").L();

    /* renamed from: b4 */
    public static final gg.v f12046b4 = new gg.v("2.5.29.23").L();

    /* renamed from: c4 */
    public static final gg.v f12047c4 = new gg.v("2.5.29.24").L();

    /* renamed from: d4 */
    public static final gg.v f12048d4 = new gg.v("2.5.29.27").L();

    /* renamed from: e4 */
    public static final gg.v f12049e4 = new gg.v("2.5.29.28").L();

    /* renamed from: f4 */
    public static final gg.v f12050f4 = new gg.v("2.5.29.29").L();

    /* renamed from: g4 */
    public static final gg.v f12051g4 = new gg.v("2.5.29.30").L();

    /* renamed from: h4 */
    public static final gg.v f12052h4 = new gg.v("2.5.29.31").L();

    /* renamed from: i4 */
    public static final gg.v f12053i4 = new gg.v("2.5.29.32").L();

    /* renamed from: j4 */
    public static final gg.v f12054j4 = new gg.v("2.5.29.33").L();

    /* renamed from: k4 */
    public static final gg.v f12055k4 = new gg.v("2.5.29.35").L();

    /* renamed from: l4 */
    public static final gg.v f12056l4 = new gg.v("2.5.29.36").L();

    /* renamed from: m4 */
    public static final gg.v f12057m4 = new gg.v("2.5.29.37").L();

    /* renamed from: n4 */
    public static final gg.v f12058n4 = new gg.v("2.5.29.46").L();

    /* renamed from: o4 */
    public static final gg.v f12059o4 = new gg.v("2.5.29.54").L();

    /* renamed from: p4 */
    public static final gg.v f12060p4 = new gg.v("1.3.6.1.5.5.7.1.1").L();

    /* renamed from: q4 */
    public static final gg.v f12061q4 = new gg.v("1.3.6.1.5.5.7.1.11").L();

    /* renamed from: r4 */
    public static final gg.v f12062r4 = new gg.v("1.3.6.1.5.5.7.1.12").L();

    /* renamed from: s4 */
    public static final gg.v f12063s4 = new gg.v("1.3.6.1.5.5.7.1.2").L();

    /* renamed from: t4 */
    public static final gg.v f12064t4 = new gg.v("1.3.6.1.5.5.7.1.3").L();

    /* renamed from: u4 */
    public static final gg.v f12065u4 = new gg.v("1.3.6.1.5.5.7.1.4").L();

    /* renamed from: v4 */
    public static final gg.v f12066v4 = new gg.v("2.5.29.56").L();

    /* renamed from: w4 */
    public static final gg.v f12067w4 = new gg.v("2.5.29.55").L();

    /* renamed from: x4 */
    public static final gg.v f12069x4 = new gg.v("2.5.29.60").L();

    private u(gg.d0 d0Var) {
        gg.g G;
        if (d0Var.size() == 2) {
            this.f12071c = gg.v.K(d0Var.G(0));
            this.f12072d = false;
            G = d0Var.G(1);
        } else if (d0Var.size() != 3) {
            throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
        } else {
            this.f12071c = gg.v.K(d0Var.G(0));
            this.f12072d = gg.e.E(d0Var.G(1)).G();
            G = d0Var.G(2);
        }
        this.f12073q = gg.w.E(G);
    }

    public u(gg.v vVar, boolean z10, gg.w wVar) {
        this.f12071c = vVar;
        this.f12072d = z10;
        this.f12073q = wVar;
    }

    public u(gg.v vVar, boolean z10, byte[] bArr) {
        this(vVar, z10, new t1(bArr));
    }

    private static gg.a0 l(u uVar) {
        try {
            return gg.a0.u(uVar.n().F());
        } catch (IOException e10) {
            throw new IllegalArgumentException("can't convert extension: " + e10);
        }
    }

    public static u o(Object obj) {
        if (obj instanceof u) {
            return (u) obj;
        }
        if (obj == null) {
            return null;
        }
        return new u(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(3);
        hVar.a(this.f12071c);
        if (this.f12072d) {
            hVar.a(gg.e.F(true));
        }
        hVar.a(this.f12073q);
        return new x1(hVar);
    }

    @Override // gg.t
    public boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return uVar.m().s(m()) && uVar.n().s(n()) && uVar.r() == r();
    }

    @Override // gg.t
    public int hashCode() {
        return r() ? n().hashCode() ^ m().hashCode() : ~(n().hashCode() ^ m().hashCode());
    }

    public gg.v m() {
        return this.f12071c;
    }

    public gg.w n() {
        return this.f12073q;
    }

    public gg.g q() {
        return l(this);
    }

    public boolean r() {
        return this.f12072d;
    }
}
