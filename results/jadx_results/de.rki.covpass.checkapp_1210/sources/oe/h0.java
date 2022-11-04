package oe;
/* loaded from: classes3.dex */
public final class h0 extends s1 {

    /* renamed from: d */
    private final ne.n f17997d;

    /* renamed from: q */
    private final gc.a<e0> f17998q;

    /* renamed from: x */
    private final ne.i<e0> f17999x;

    /* loaded from: classes3.dex */
    public static final class a extends hc.v implements gc.a<e0> {

        /* renamed from: c */
        final /* synthetic */ pe.g f18000c;

        /* renamed from: d */
        final /* synthetic */ h0 f18001d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(pe.g gVar, h0 h0Var) {
            super(0);
            this.f18000c = gVar;
            this.f18001d = h0Var;
        }

        /* renamed from: b */
        public final e0 invoke() {
            return this.f18000c.h((se.i) this.f18001d.f17998q.invoke());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h0(ne.n nVar, gc.a<? extends e0> aVar) {
        hc.t.e(nVar, "storageManager");
        hc.t.e(aVar, "computation");
        this.f17997d = nVar;
        this.f17998q = aVar;
        this.f17999x = nVar.d(aVar);
    }

    @Override // oe.s1
    protected e0 a1() {
        return this.f17999x.invoke();
    }

    @Override // oe.s1
    public boolean b1() {
        return this.f17999x.r();
    }

    /* renamed from: d1 */
    public h0 Y0(pe.g gVar) {
        hc.t.e(gVar, "kotlinTypeRefiner");
        return new h0(this.f17997d, new a(gVar, this));
    }
}
