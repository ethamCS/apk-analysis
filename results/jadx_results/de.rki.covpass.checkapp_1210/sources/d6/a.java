package d6;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.q;
import f6.y;
import g6.r;
import g6.t;
import g6.u;
import g6.w;
import java.security.GeneralSecurityException;
import y5.h;
import y5.o;
/* loaded from: classes.dex */
public final class a extends h<f6.a> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d6.a$a */
    /* loaded from: classes.dex */
    public class C0122a extends h.b<o, f6.a> {
        C0122a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public o a(f6.a aVar) {
            return new t(new r(aVar.R().b0()), aVar.S().P());
        }
    }

    /* loaded from: classes.dex */
    class b extends h.a<f6.b, f6.a> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Class cls) {
            super(cls);
            a.this = r1;
        }

        /* renamed from: e */
        public f6.a a(f6.b bVar) {
            return f6.a.U().D(0).B(i.i(u.c(bVar.O()))).C(bVar.P()).b();
        }

        /* renamed from: f */
        public f6.b c(i iVar) {
            return f6.b.Q(iVar, q.b());
        }

        /* renamed from: g */
        public void d(f6.b bVar) {
            a.p(bVar.P());
            a.q(bVar.O());
        }
    }

    a() {
        super(f6.a.class, new C0122a(o.class));
    }

    public static void n(boolean z10) {
        y5.r.q(new a(), z10);
    }

    public static void p(f6.c cVar) {
        if (cVar.P() >= 10) {
            if (cVar.P() > 16) {
                throw new GeneralSecurityException("tag size too long");
            }
            return;
        }
        throw new GeneralSecurityException("tag size too short");
    }

    public static void q(int i10) {
        if (i10 == 32) {
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }

    @Override // y5.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // y5.h
    public h.a<?, f6.a> e() {
        return new b(f6.b.class);
    }

    @Override // y5.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    /* renamed from: m */
    public f6.a g(i iVar) {
        return f6.a.V(iVar, q.b());
    }

    /* renamed from: o */
    public void i(f6.a aVar) {
        w.c(aVar.T(), l());
        q(aVar.R().size());
        p(aVar.S());
    }
}
