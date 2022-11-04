package z5;

import com.google.crypto.tink.shaded.protobuf.q;
import f6.y;
import g6.u;
import g6.w;
import java.security.GeneralSecurityException;
import y5.h;
import y5.r;
/* loaded from: classes.dex */
public final class e extends y5.h<f6.i> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h.b<y5.a, f6.i> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public y5.a a(f6.i iVar) {
            return new g6.b(iVar.R().b0(), iVar.S().P());
        }
    }

    /* loaded from: classes.dex */
    class b extends h.a<f6.j, f6.i> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Class cls) {
            super(cls);
            e.this = r1;
        }

        /* renamed from: e */
        public f6.i a(f6.j jVar) {
            return f6.i.U().B(com.google.crypto.tink.shaded.protobuf.i.i(u.c(jVar.O()))).C(jVar.P()).D(e.this.j()).b();
        }

        /* renamed from: f */
        public f6.j c(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return f6.j.Q(iVar, q.b());
        }

        /* renamed from: g */
        public void d(f6.j jVar) {
            w.a(jVar.O());
            if (jVar.P().P() == 12 || jVar.P().P() == 16) {
                return;
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    public e() {
        super(f6.i.class, new a(y5.a.class));
    }

    public static void l(boolean z10) {
        r.q(new e(), z10);
    }

    @Override // y5.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // y5.h
    public h.a<?, f6.i> e() {
        return new b(f6.j.class);
    }

    @Override // y5.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public f6.i g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return f6.i.V(iVar, q.b());
    }

    /* renamed from: m */
    public void i(f6.i iVar) {
        w.c(iVar.T(), j());
        w.a(iVar.R().size());
        if (iVar.S().P() == 12 || iVar.S().P() == 16) {
            return;
        }
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }
}
