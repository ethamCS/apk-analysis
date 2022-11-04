package z5;

import com.google.crypto.tink.shaded.protobuf.q;
import f6.g0;
import f6.h0;
import f6.y;
import g6.w;
import y5.h;
import y5.n;
import y5.r;
/* loaded from: classes.dex */
public class k extends y5.h<g0> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h.b<y5.a, g0> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public y5.a a(g0 g0Var) {
            String Q = g0Var.Q().Q();
            return new j(g0Var.Q().P(), n.a(Q).b(Q));
        }
    }

    /* loaded from: classes.dex */
    class b extends h.a<h0, g0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Class cls) {
            super(cls);
            k.this = r1;
        }

        /* renamed from: e */
        public g0 a(h0 h0Var) {
            return g0.S().B(h0Var).C(k.this.j()).b();
        }

        /* renamed from: f */
        public h0 c(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return h0.R(iVar, q.b());
        }

        /* renamed from: g */
        public void d(h0 h0Var) {
        }
    }

    public k() {
        super(g0.class, new a(y5.a.class));
    }

    public static void l(boolean z10) {
        r.q(new k(), z10);
    }

    @Override // y5.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // y5.h
    public h.a<?, g0> e() {
        return new b(h0.class);
    }

    @Override // y5.h
    public y.c f() {
        return y.c.REMOTE;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public g0 g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return g0.T(iVar, q.b());
    }

    /* renamed from: m */
    public void i(g0 g0Var) {
        w.c(g0Var.R(), j());
    }
}
