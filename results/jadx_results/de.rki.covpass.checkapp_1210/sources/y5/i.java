package y5;

import f6.c0;
import f6.d0;
import f6.t;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    private final c0 f25823a;

    private i(c0 c0Var) {
        this.f25823a = c0Var;
    }

    public static void a(t tVar) {
        if (tVar == null || tVar.Q().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static void b(c0 c0Var) {
        if (c0Var == null || c0Var.T() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static c0 c(t tVar, a aVar) {
        try {
            c0 X = c0.X(aVar.b(tVar.Q().b0(), new byte[0]), com.google.crypto.tink.shaded.protobuf.q.b());
            b(X);
            return X;
        } catch (com.google.crypto.tink.shaded.protobuf.c0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static t d(c0 c0Var, a aVar) {
        byte[] a10 = aVar.a(c0Var.j(), new byte[0]);
        try {
            if (c0.X(aVar.b(a10, new byte[0]), com.google.crypto.tink.shaded.protobuf.q.b()).equals(c0Var)) {
                return t.R().B(com.google.crypto.tink.shaded.protobuf.i.i(a10)).C(s.b(c0Var)).b();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (com.google.crypto.tink.shaded.protobuf.c0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public static final i e(c0 c0Var) {
        b(c0Var);
        return new i(c0Var);
    }

    private <B, P> P i(Class<P> cls, Class<B> cls2) {
        return (P) r.t(r.k(this, cls2), cls);
    }

    public static final i j(k kVar, a aVar) {
        t a10 = kVar.a();
        a(a10);
        return new i(c(a10, aVar));
    }

    public c0 f() {
        return this.f25823a;
    }

    public d0 g() {
        return s.b(this.f25823a);
    }

    public <P> P h(Class<P> cls) {
        Class<?> e10 = r.e(cls);
        if (e10 != null) {
            return (P) i(cls, e10);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public void k(l lVar, a aVar) {
        lVar.a(d(this.f25823a, aVar));
    }

    public String toString() {
        return g().toString();
    }
}
