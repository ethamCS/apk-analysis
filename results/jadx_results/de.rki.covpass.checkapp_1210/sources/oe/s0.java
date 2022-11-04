package oe;

import kotlin.Lazy;
/* loaded from: classes3.dex */
public final class s0 extends h1 {

    /* renamed from: a */
    private final xc.f1 f18043a;

    /* renamed from: b */
    private final Lazy f18044b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends hc.v implements gc.a<e0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            s0.this = r1;
        }

        /* renamed from: b */
        public final e0 invoke() {
            return t0.b(s0.this.f18043a);
        }
    }

    public s0(xc.f1 f1Var) {
        Lazy b10;
        hc.t.e(f1Var, "typeParameter");
        this.f18043a = f1Var;
        b10 = tb.m.b(tb.o.PUBLICATION, new a());
        this.f18044b = b10;
    }

    private final e0 e() {
        return (e0) this.f18044b.getValue();
    }

    @Override // oe.g1
    public g1 a(pe.g gVar) {
        hc.t.e(gVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // oe.g1
    public r1 b() {
        return r1.OUT_VARIANCE;
    }

    @Override // oe.g1
    public boolean c() {
        return true;
    }

    @Override // oe.g1
    public e0 getType() {
        return e();
    }
}
