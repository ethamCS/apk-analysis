package ve;

import hc.v;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.e0;
import ub.u;
import ve.k;
import ve.r;
import ve.t;
import xc.e1;
import xc.x;
import xc.x0;
import xc.y;
/* loaded from: classes3.dex */
public final class p extends ve.b {

    /* renamed from: a */
    public static final p f24052a = new p();

    /* renamed from: b */
    private static final List<h> f24053b;

    /* loaded from: classes3.dex */
    static final class a extends v implements gc.l<y, String> {

        /* renamed from: c */
        public static final a f24054c = new a();

        a() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
            if ((!ee.a.a(r4) && r4.R() == null) == true) goto L12;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String invoke(xc.y r4) {
            /*
                r3 = this;
                java.lang.String r0 = "$this$$receiver"
                hc.t.e(r4, r0)
                java.util.List r4 = r4.o()
                java.lang.String r0 = "valueParameters"
                hc.t.d(r4, r0)
                java.lang.Object r4 = ub.s.i0(r4)
                xc.j1 r4 = (xc.j1) r4
                r0 = 1
                r1 = 0
                if (r4 == 0) goto L2a
                boolean r2 = ee.a.a(r4)
                if (r2 != 0) goto L26
                oe.e0 r4 = r4.R()
                if (r4 != 0) goto L26
                r4 = r0
                goto L27
            L26:
                r4 = r1
            L27:
                if (r4 != r0) goto L2a
                goto L2b
            L2a:
                r0 = r1
            L2b:
                ve.p r4 = ve.p.f24052a
                if (r0 != 0) goto L32
                java.lang.String r4 = "last parameter should not have a default value or be a vararg"
                goto L33
            L32:
                r4 = 0
            L33:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: ve.p.a.invoke(xc.y):java.lang.String");
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends v implements gc.l<y, String> {

        /* renamed from: c */
        public static final b f24055c = new b();

        b() {
            super(1);
        }

        private static final boolean c(xc.m mVar) {
            return (mVar instanceof xc.e) && uc.h.a0((xc.e) mVar);
        }

        /* renamed from: b */
        public final String invoke(y yVar) {
            boolean z10;
            hc.t.e(yVar, "$this$$receiver");
            p pVar = p.f24052a;
            xc.m b10 = yVar.b();
            hc.t.d(b10, "containingDeclaration");
            boolean z11 = true;
            if (!c(b10)) {
                Collection<? extends y> f10 = yVar.f();
                hc.t.d(f10, "overriddenDescriptors");
                if (!f10.isEmpty()) {
                    for (y yVar2 : f10) {
                        xc.m b11 = yVar2.b();
                        hc.t.d(b11, "it.containingDeclaration");
                        if (c(b11)) {
                            z10 = true;
                            break;
                        }
                    }
                }
                z10 = false;
                if (!z10) {
                    z11 = false;
                }
            }
            if (!z11) {
                return "must override ''equals()'' in Any";
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends v implements gc.l<y, String> {

        /* renamed from: c */
        public static final c f24056c = new c();

        c() {
            super(1);
        }

        /* renamed from: b */
        public final String invoke(y yVar) {
            boolean z10;
            hc.t.e(yVar, "$this$$receiver");
            x0 J = yVar.J();
            if (J == null) {
                J = yVar.U();
            }
            p pVar = p.f24052a;
            boolean z11 = false;
            if (J != null) {
                e0 e10 = yVar.e();
                if (e10 != null) {
                    e0 type = J.getType();
                    hc.t.d(type, "receiver.type");
                    z10 = te.a.o(e10, type);
                } else {
                    z10 = false;
                }
                if (z10 || pVar.d(yVar, J)) {
                    z11 = true;
                }
            }
            if (!z11) {
                return "receiver must be a supertype of the return type";
            }
            return null;
        }
    }

    static {
        List k10;
        List<h> k11;
        wd.f fVar = q.f24067k;
        k.b bVar = k.b.f24044b;
        f[] fVarArr = {bVar, new t.a(1)};
        wd.f fVar2 = q.f24068l;
        f[] fVarArr2 = {bVar, new t.a(2)};
        wd.f fVar3 = q.f24058b;
        m mVar = m.f24046a;
        j jVar = j.f24040a;
        wd.f fVar4 = q.f24064h;
        t.d dVar = t.d.f24099b;
        r.a aVar = r.a.f24086d;
        wd.f fVar5 = q.f24066j;
        t.c cVar = t.c.f24098b;
        k10 = u.k(q.f24080x, q.f24081y);
        k11 = u.k(new h(fVar, fVarArr, (gc.l) null, 4, (DefaultConstructorMarker) null), new h(fVar2, fVarArr2, a.f24054c), new h(fVar3, new f[]{bVar, mVar, new t.a(2), jVar}, (gc.l) null, 4, (DefaultConstructorMarker) null), new h(q.f24059c, new f[]{bVar, mVar, new t.a(3), jVar}, (gc.l) null, 4, (DefaultConstructorMarker) null), new h(q.f24060d, new f[]{bVar, mVar, new t.b(2), jVar}, (gc.l) null, 4, (DefaultConstructorMarker) null), new h(q.f24065i, new f[]{bVar}, (gc.l) null, 4, (DefaultConstructorMarker) null), new h(fVar4, new f[]{bVar, dVar, mVar, aVar}, (gc.l) null, 4, (DefaultConstructorMarker) null), new h(fVar5, new f[]{bVar, cVar}, (gc.l) null, 4, (DefaultConstructorMarker) null), new h(q.f24069m, new f[]{bVar, cVar}, (gc.l) null, 4, (DefaultConstructorMarker) null), new h(q.f24070n, new f[]{bVar, cVar, aVar}, (gc.l) null, 4, (DefaultConstructorMarker) null), new h(q.I, new f[]{bVar, dVar, mVar}, (gc.l) null, 4, (DefaultConstructorMarker) null), new h(q.f24061e, new f[]{k.a.f24043b}, b.f24055c), new h(q.f24063g, new f[]{bVar, r.b.f24088d, dVar, mVar}, (gc.l) null, 4, (DefaultConstructorMarker) null), new h(q.R, new f[]{bVar, dVar, mVar}, (gc.l) null, 4, (DefaultConstructorMarker) null), new h(q.Q, new f[]{bVar, cVar}, (gc.l) null, 4, (DefaultConstructorMarker) null), new h(k10, new f[]{bVar}, c.f24056c), new h(q.S, new f[]{bVar, r.c.f24090d, dVar, mVar}, (gc.l) null, 4, (DefaultConstructorMarker) null), new h(q.f24072p, new f[]{bVar, cVar}, (gc.l) null, 4, (DefaultConstructorMarker) null));
        f24053b = k11;
    }

    private p() {
    }

    public final boolean d(y yVar, x0 x0Var) {
        wd.b g10;
        e0 e10;
        ie.f value = x0Var.getValue();
        hc.t.d(value, "receiver.value");
        if (!(value instanceof ie.e)) {
            return false;
        }
        xc.e q10 = ((ie.e) value).q();
        if (!q10.l0() || (g10 = ee.a.g(q10)) == null) {
            return false;
        }
        xc.h b10 = x.b(ee.a.l(q10), g10);
        if (!(b10 instanceof e1)) {
            b10 = null;
        }
        e1 e1Var = (e1) b10;
        if (e1Var != null && (e10 = yVar.e()) != null) {
            return te.a.o(e10, e1Var.H0());
        }
        return false;
    }

    @Override // ve.b
    public List<h> b() {
        return f24053b;
    }
}
