package z5;

import com.google.crypto.tink.shaded.protobuf.q;
import f6.r;
import f6.s;
import f6.y;
import g6.u;
import g6.w;
import java.security.GeneralSecurityException;
import y5.h;
/* loaded from: classes.dex */
public class h extends y5.h<r> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h.b<y5.a, r> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public y5.a a(r rVar) {
            return new g6.j(rVar.Q().b0());
        }
    }

    /* loaded from: classes.dex */
    class b extends h.a<s, r> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Class cls) {
            super(cls);
            h.this = r1;
        }

        /* renamed from: e */
        public r a(s sVar) {
            return r.S().C(h.this.j()).B(com.google.crypto.tink.shaded.protobuf.i.i(u.c(32))).b();
        }

        /* renamed from: f */
        public s c(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return s.O(iVar, q.b());
        }

        /* renamed from: g */
        public void d(s sVar) {
        }
    }

    public h() {
        super(r.class, new a(y5.a.class));
    }

    public static void l(boolean z10) {
        y5.r.q(new h(), z10);
    }

    @Override // y5.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // y5.h
    public h.a<?, r> e() {
        return new b(s.class);
    }

    @Override // y5.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public r g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return r.T(iVar, q.b());
    }

    /* renamed from: m */
    public void i(r rVar) {
        w.c(rVar.R(), j());
        if (rVar.Q().size() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
    }
}
