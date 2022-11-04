package b6;

import com.google.crypto.tink.shaded.protobuf.i;
import f6.p;
import f6.q;
import f6.y;
import g6.u;
import g6.w;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import y5.d;
import y5.g;
import y5.h;
import y5.r;
/* loaded from: classes.dex */
public final class a extends h<p> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b6.a$a */
    /* loaded from: classes.dex */
    public class C0076a extends h.b<d, p> {
        C0076a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public d a(p pVar) {
            return new g6.d(pVar.Q().b0());
        }
    }

    /* loaded from: classes.dex */
    class b extends h.a<q, p> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Class cls) {
            super(cls);
            a.this = r1;
        }

        /* renamed from: e */
        public p a(q qVar) {
            return p.S().B(i.i(u.c(qVar.P()))).C(a.this.l()).b();
        }

        /* renamed from: f */
        public q c(i iVar) {
            return q.R(iVar, com.google.crypto.tink.shaded.protobuf.q.b());
        }

        /* renamed from: g */
        public void d(q qVar) {
            if (qVar.P() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + qVar.P() + ". Valid keys must have 64 bytes.");
        }
    }

    public a() {
        super(p.class, new C0076a(d.class));
    }

    public static final g j() {
        return k(64, g.b.TINK);
    }

    private static g k(int i10, g.b bVar) {
        return g.a(new a().c(), q.Q().B(i10).b().j(), bVar);
    }

    public static void n(boolean z10) {
        r.q(new a(), z10);
    }

    @Override // y5.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // y5.h
    public h.a<?, p> e() {
        return new b(q.class);
    }

    @Override // y5.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    /* renamed from: m */
    public p g(i iVar) {
        return p.T(iVar, com.google.crypto.tink.shaded.protobuf.q.b());
    }

    /* renamed from: o */
    public void i(p pVar) {
        w.c(pVar.R(), l());
        if (pVar.Q().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + pVar.Q().size() + ". Valid keys must have 64 bytes.");
    }
}
