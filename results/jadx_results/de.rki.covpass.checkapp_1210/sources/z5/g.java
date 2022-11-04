package z5;

import com.google.crypto.tink.shaded.protobuf.q;
import f6.n;
import f6.o;
import f6.y;
import g6.u;
import g6.w;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import y5.h;
import y5.r;
/* loaded from: classes.dex */
public final class g extends y5.h<n> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h.b<y5.a, n> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public y5.a a(n nVar) {
            return new a6.a(nVar.Q().b0());
        }
    }

    /* loaded from: classes.dex */
    class b extends h.a<o, n> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Class cls) {
            super(cls);
            g.this = r1;
        }

        /* renamed from: e */
        public n a(o oVar) {
            return n.S().B(com.google.crypto.tink.shaded.protobuf.i.i(u.c(oVar.O()))).C(g.this.k()).b();
        }

        /* renamed from: f */
        public o c(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return o.P(iVar, q.b());
        }

        /* renamed from: g */
        public void d(o oVar) {
            w.a(oVar.O());
        }
    }

    public g() {
        super(n.class, new a(y5.a.class));
    }

    private static boolean j() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public static void m(boolean z10) {
        if (j()) {
            r.q(new g(), z10);
        }
    }

    @Override // y5.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // y5.h
    public h.a<?, n> e() {
        return new b(o.class);
    }

    @Override // y5.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public n g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return n.T(iVar, q.b());
    }

    /* renamed from: n */
    public void i(n nVar) {
        w.c(nVar.R(), k());
        w.a(nVar.Q().size());
    }
}
