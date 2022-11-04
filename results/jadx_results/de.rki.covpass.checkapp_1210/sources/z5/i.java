package z5;

import com.google.crypto.tink.shaded.protobuf.q;
import f6.e0;
import f6.f0;
import f6.y;
import g6.w;
import y5.h;
import y5.n;
import y5.r;
/* loaded from: classes.dex */
public class i extends y5.h<e0> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h.b<y5.a, e0> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public y5.a a(e0 e0Var) {
            String P = e0Var.Q().P();
            return n.a(P).b(P);
        }
    }

    /* loaded from: classes.dex */
    class b extends h.a<f0, e0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Class cls) {
            super(cls);
            i.this = r1;
        }

        /* renamed from: e */
        public e0 a(f0 f0Var) {
            return e0.S().B(f0Var).C(i.this.j()).b();
        }

        /* renamed from: f */
        public f0 c(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return f0.Q(iVar, q.b());
        }

        /* renamed from: g */
        public void d(f0 f0Var) {
        }
    }

    public i() {
        super(e0.class, new a(y5.a.class));
    }

    public static void l(boolean z10) {
        r.q(new i(), z10);
    }

    @Override // y5.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // y5.h
    public h.a<?, e0> e() {
        return new b(f0.class);
    }

    @Override // y5.h
    public y.c f() {
        return y.c.REMOTE;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public e0 g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return e0.T(iVar, q.b());
    }

    /* renamed from: m */
    public void i(e0 e0Var) {
        w.c(e0Var.R(), j());
    }
}
