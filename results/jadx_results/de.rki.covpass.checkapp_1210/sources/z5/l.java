package z5;

import com.google.crypto.tink.shaded.protobuf.q;
import f6.k0;
import f6.l0;
import f6.y;
import g6.u;
import g6.w;
import g6.y;
import java.security.GeneralSecurityException;
import y5.h;
import y5.r;
/* loaded from: classes.dex */
public class l extends y5.h<k0> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h.b<y5.a, k0> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public y5.a a(k0 k0Var) {
            return new y(k0Var.Q().b0());
        }
    }

    /* loaded from: classes.dex */
    class b extends h.a<l0, k0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Class cls) {
            super(cls);
            l.this = r1;
        }

        /* renamed from: e */
        public k0 a(l0 l0Var) {
            return k0.S().C(l.this.j()).B(com.google.crypto.tink.shaded.protobuf.i.i(u.c(32))).b();
        }

        /* renamed from: f */
        public l0 c(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return l0.O(iVar, q.b());
        }

        /* renamed from: g */
        public void d(l0 l0Var) {
        }
    }

    public l() {
        super(k0.class, new a(y5.a.class));
    }

    public static void l(boolean z10) {
        r.q(new l(), z10);
    }

    @Override // y5.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // y5.h
    public h.a<?, k0> e() {
        return new b(l0.class);
    }

    @Override // y5.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public k0 g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return k0.T(iVar, q.b());
    }

    /* renamed from: m */
    public void i(k0 k0Var) {
        w.c(k0Var.R(), j());
        if (k0Var.Q().size() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
    }
}
