package z5;

import com.google.crypto.tink.shaded.protobuf.q;
import f6.y;
import g6.p;
import g6.w;
import y5.h;
import y5.o;
import y5.r;
/* loaded from: classes.dex */
public final class c extends y5.h<f6.d> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h.b<y5.a, f6.d> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public y5.a a(f6.d dVar) {
            return new g6.l((p) new d().d(dVar.R(), p.class), (o) new d6.b().d(dVar.S(), o.class), dVar.S().T().Q());
        }
    }

    /* loaded from: classes.dex */
    class b extends h.a<f6.e, f6.d> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Class cls) {
            super(cls);
            c.this = r1;
        }

        /* renamed from: e */
        public f6.d a(f6.e eVar) {
            return f6.d.U().B(new d().e().a(eVar.O())).C(new d6.b().e().a(eVar.P())).D(c.this.j()).b();
        }

        /* renamed from: f */
        public f6.e c(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return f6.e.Q(iVar, q.b());
        }

        /* renamed from: g */
        public void d(f6.e eVar) {
            new d().e().d(eVar.O());
            new d6.b().e().d(eVar.P());
            w.a(eVar.O().P());
        }
    }

    public c() {
        super(f6.d.class, new a(y5.a.class));
    }

    public static void l(boolean z10) {
        r.q(new c(), z10);
    }

    @Override // y5.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // y5.h
    public h.a<?, f6.d> e() {
        return new b(f6.e.class);
    }

    @Override // y5.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public f6.d g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return f6.d.V(iVar, q.b());
    }

    /* renamed from: m */
    public void i(f6.d dVar) {
        w.c(dVar.T(), j());
        new d().i(dVar.R());
        new d6.b().i(dVar.S());
    }
}
