package z5;

import com.google.crypto.tink.shaded.protobuf.q;
import f6.m;
import f6.y;
import g6.u;
import g6.w;
import y5.g;
import y5.h;
import y5.r;
/* loaded from: classes.dex */
public final class f extends y5.h<f6.l> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h.b<y5.a, f6.l> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public y5.a a(f6.l lVar) {
            return new g6.c(lVar.Q().b0());
        }
    }

    /* loaded from: classes.dex */
    class b extends h.a<m, f6.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Class cls) {
            super(cls);
            f.this = r1;
        }

        /* renamed from: e */
        public f6.l a(m mVar) {
            return f6.l.S().B(com.google.crypto.tink.shaded.protobuf.i.i(u.c(mVar.P()))).C(f.this.l()).b();
        }

        /* renamed from: f */
        public m c(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return m.R(iVar, q.b());
        }

        /* renamed from: g */
        public void d(m mVar) {
            w.a(mVar.P());
        }
    }

    public f() {
        super(f6.l.class, new a(y5.a.class));
    }

    public static final y5.g j() {
        return k(32, g.b.TINK);
    }

    private static y5.g k(int i10, g.b bVar) {
        return y5.g.a(new f().c(), m.Q().B(i10).b().j(), bVar);
    }

    public static void n(boolean z10) {
        r.q(new f(), z10);
    }

    @Override // y5.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // y5.h
    public h.a<?, f6.l> e() {
        return new b(m.class);
    }

    @Override // y5.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    /* renamed from: m */
    public f6.l g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return f6.l.T(iVar, q.b());
    }

    /* renamed from: o */
    public void i(f6.l lVar) {
        w.c(lVar.R(), l());
        w.a(lVar.Q().size());
    }
}
