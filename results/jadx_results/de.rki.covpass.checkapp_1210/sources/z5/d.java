package z5;

import com.google.crypto.tink.shaded.protobuf.q;
import f6.y;
import g6.p;
import g6.u;
import g6.w;
import java.security.GeneralSecurityException;
import y5.h;
/* loaded from: classes.dex */
public class d extends y5.h<f6.f> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h.b<p, f6.f> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public p a(f6.f fVar) {
            return new g6.a(fVar.S().b0(), fVar.T().P());
        }
    }

    /* loaded from: classes.dex */
    public class b extends h.a<f6.g, f6.f> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Class cls) {
            super(cls);
            d.this = r1;
        }

        /* renamed from: e */
        public f6.f a(f6.g gVar) {
            return f6.f.V().C(gVar.Q()).B(com.google.crypto.tink.shaded.protobuf.i.i(u.c(gVar.P()))).D(d.this.k()).b();
        }

        /* renamed from: f */
        public f6.g c(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return f6.g.R(iVar, q.b());
        }

        /* renamed from: g */
        public void d(f6.g gVar) {
            w.a(gVar.P());
            d.this.n(gVar.Q());
        }
    }

    public d() {
        super(f6.f.class, new a(p.class));
    }

    public void n(f6.h hVar) {
        if (hVar.P() < 12 || hVar.P() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // y5.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // y5.h
    public h.a<?, f6.f> e() {
        return new b(f6.g.class);
    }

    @Override // y5.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public f6.f g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return f6.f.W(iVar, q.b());
    }

    /* renamed from: m */
    public void i(f6.f fVar) {
        w.c(fVar.U(), k());
        w.a(fVar.S().size());
        n(fVar.T());
    }
}
