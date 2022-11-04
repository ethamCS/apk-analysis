package od;

import hc.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oe.a1;
import oe.b0;
import oe.b1;
import oe.e0;
import oe.e1;
import oe.f0;
import oe.g1;
import oe.m0;
import oe.n1;
import oe.q0;
import oe.q1;
import oe.r1;
import ub.u;
import ub.v;
import xc.f1;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    private final jd.c f17827a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final e0 f17828a;

        /* renamed from: b */
        private final int f17829b;

        public a(e0 e0Var, int i10) {
            this.f17828a = e0Var;
            this.f17829b = i10;
        }

        public final int a() {
            return this.f17829b;
        }

        public final e0 b() {
            return this.f17828a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final m0 f17830a;

        /* renamed from: b */
        private final int f17831b;

        /* renamed from: c */
        private final boolean f17832c;

        public b(m0 m0Var, int i10, boolean z10) {
            this.f17830a = m0Var;
            this.f17831b = i10;
            this.f17832c = z10;
        }

        public final boolean a() {
            return this.f17832c;
        }

        public final int b() {
            return this.f17831b;
        }

        public final m0 c() {
            return this.f17830a;
        }
    }

    public d(jd.c cVar) {
        t.e(cVar, "javaResolverSettings");
        this.f17827a = cVar;
    }

    private final b b(m0 m0Var, gc.l<? super Integer, e> lVar, int i10, o oVar, boolean z10, boolean z11) {
        xc.h z12;
        xc.h g10;
        Boolean h10;
        e1 e1Var;
        int s10;
        int s11;
        c cVar;
        c cVar2;
        List m10;
        yc.g f10;
        int s12;
        int s13;
        boolean z13;
        boolean z14;
        boolean z15;
        a aVar;
        g1 g1Var;
        e0 type;
        gc.l<? super Integer, e> lVar2 = lVar;
        boolean a10 = p.a(oVar);
        boolean z16 = !z11 || !z10;
        e0 e0Var = null;
        if ((a10 || !m0Var.U0().isEmpty()) && (z12 = m0Var.W0().z()) != null) {
            e invoke = lVar2.invoke(Integer.valueOf(i10));
            g10 = r.g(z12, invoke, oVar);
            h10 = r.h(invoke, oVar);
            if (g10 == null || (e1Var = g10.r()) == null) {
                e1Var = m0Var.W0();
            }
            e1 e1Var2 = e1Var;
            t.d(e1Var2, "enhancedClassifier?.typeConstructor ?: constructor");
            int i11 = i10 + 1;
            List<g1> U0 = m0Var.U0();
            List<f1> parameters = e1Var2.getParameters();
            t.d(parameters, "typeConstructor.parameters");
            Iterator<T> it = U0.iterator();
            Iterator<T> it2 = parameters.iterator();
            s10 = v.s(U0, 10);
            s11 = v.s(parameters, 10);
            ArrayList<g1> arrayList = new ArrayList(Math.min(s10, s11));
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                f1 f1Var = (f1) it2.next();
                g1 g1Var2 = (g1) next;
                if (!z16) {
                    z15 = z16;
                    aVar = new a(e0Var, 0);
                } else {
                    z15 = z16;
                    if (!g1Var2.c()) {
                        aVar = d(g1Var2.getType().Z0(), lVar2, i11, z11);
                    } else if (lVar2.invoke(Integer.valueOf(i11)).d() == h.FORCE_FLEXIBILITY) {
                        q1 Z0 = g1Var2.getType().Z0();
                        aVar = new a(f0.d(b0.c(Z0).d1(false), b0.d(Z0).d1(true)), 1);
                    } else {
                        aVar = new a(null, 1);
                    }
                }
                i11 += aVar.a();
                if (aVar.b() != null) {
                    type = aVar.b();
                } else if (g10 == null || g1Var2.c()) {
                    g1Var = g10 != null ? n1.s(f1Var) : null;
                    arrayList.add(g1Var);
                    lVar2 = lVar;
                    z16 = z15;
                    e0Var = null;
                } else {
                    type = g1Var2.getType();
                    t.d(type, "arg.type");
                }
                r1 b10 = g1Var2.b();
                t.d(b10, "arg.projectionKind");
                g1Var = te.a.e(type, b10, f1Var);
                arrayList.add(g1Var);
                lVar2 = lVar;
                z16 = z15;
                e0Var = null;
            }
            int i12 = i11 - i10;
            if (g10 == null && h10 == null) {
                if (!arrayList.isEmpty()) {
                    for (g1 g1Var3 : arrayList) {
                        if (g1Var3 == null) {
                            z14 = true;
                            continue;
                        } else {
                            z14 = false;
                            continue;
                        }
                        if (!z14) {
                            z13 = false;
                            break;
                        }
                    }
                }
                z13 = true;
                if (z13) {
                    return new b(null, i12, false);
                }
            }
            yc.g[] gVarArr = new yc.g[3];
            gVarArr[0] = m0Var.j();
            cVar = r.f17912b;
            if (!(g10 != null)) {
                cVar = null;
            }
            gVarArr[1] = cVar;
            cVar2 = r.f17911a;
            if (!(h10 != null)) {
                cVar2 = null;
            }
            gVarArr[2] = cVar2;
            m10 = u.m(gVarArr);
            f10 = r.f(m10);
            a1 b11 = b1.b(f10);
            List<g1> U02 = m0Var.U0();
            Iterator it3 = arrayList.iterator();
            Iterator<T> it4 = U02.iterator();
            s12 = v.s(arrayList, 10);
            s13 = v.s(U02, 10);
            ArrayList arrayList2 = new ArrayList(Math.min(s12, s13));
            while (it3.hasNext() && it4.hasNext()) {
                Object next2 = it3.next();
                g1 g1Var4 = (g1) it4.next();
                g1 g1Var5 = (g1) next2;
                if (g1Var5 != null) {
                    g1Var4 = g1Var5;
                }
                arrayList2.add(g1Var4);
            }
            m0 i13 = f0.i(b11, e1Var2, arrayList2, h10 != null ? h10.booleanValue() : m0Var.X0(), null, 16, null);
            if (invoke.b()) {
                i13 = e(i13);
            }
            return new b(i13, i12, h10 != null && invoke.e());
        }
        return new b(null, 1, false);
    }

    static /* synthetic */ b c(d dVar, m0 m0Var, gc.l lVar, int i10, o oVar, boolean z10, boolean z11, int i11, Object obj) {
        return dVar.b(m0Var, lVar, i10, oVar, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? false : z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
        if (r13 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final od.d.a d(oe.q1 r12, gc.l<? super java.lang.Integer, od.e> r13, int r14, boolean r15) {
        /*
            r11 = this;
            boolean r0 = oe.g0.a(r12)
            r1 = 0
            if (r0 == 0) goto Le
            od.d$a r12 = new od.d$a
            r13 = 1
            r12.<init>(r1, r13)
            return r12
        Le:
            boolean r0 = r12 instanceof oe.y
            if (r0 == 0) goto Lad
            boolean r0 = r12 instanceof oe.l0
            r9 = r12
            oe.y r9 = (oe.y) r9
            oe.m0 r3 = r9.e1()
            od.o r6 = od.o.FLEXIBLE_LOWER
            r2 = r11
            r4 = r13
            r5 = r14
            r7 = r0
            r8 = r15
            od.d$b r10 = r2.b(r3, r4, r5, r6, r7, r8)
            oe.m0 r3 = r9.f1()
            od.o r6 = od.o.FLEXIBLE_UPPER
            od.d$b r13 = r2.b(r3, r4, r5, r6, r7, r8)
            r10.b()
            r13.b()
            oe.m0 r14 = r10.c()
            if (r14 != 0) goto L43
            oe.m0 r14 = r13.c()
            if (r14 != 0) goto L43
            goto La3
        L43:
            boolean r14 = r10.a()
            if (r14 != 0) goto L85
            boolean r14 = r13.a()
            if (r14 == 0) goto L50
            goto L85
        L50:
            if (r0 == 0) goto L6c
            ld.f r1 = new ld.f
            oe.m0 r12 = r10.c()
            if (r12 != 0) goto L5e
            oe.m0 r12 = r9.e1()
        L5e:
            oe.m0 r13 = r13.c()
            if (r13 != 0) goto L68
            oe.m0 r13 = r9.f1()
        L68:
            r1.<init>(r12, r13)
            goto La3
        L6c:
            oe.m0 r12 = r10.c()
            if (r12 != 0) goto L76
            oe.m0 r12 = r9.e1()
        L76:
            oe.m0 r13 = r13.c()
            if (r13 != 0) goto L80
            oe.m0 r13 = r9.f1()
        L80:
            oe.q1 r1 = oe.f0.d(r12, r13)
            goto La3
        L85:
            oe.m0 r13 = r13.c()
            if (r13 == 0) goto L98
            oe.m0 r14 = r10.c()
            if (r14 != 0) goto L92
            r14 = r13
        L92:
            oe.q1 r13 = oe.f0.d(r14, r13)
            if (r13 != 0) goto L9f
        L98:
            oe.m0 r13 = r10.c()
            hc.t.b(r13)
        L9f:
            oe.q1 r1 = oe.p1.d(r12, r13)
        La3:
            od.d$a r12 = new od.d$a
            int r13 = r10.b()
            r12.<init>(r1, r13)
            goto Ldf
        Lad:
            boolean r0 = r12 instanceof oe.m0
            if (r0 == 0) goto Le0
            r2 = r12
            oe.m0 r2 = (oe.m0) r2
            od.o r5 = od.o.INFLEXIBLE
            r6 = 0
            r8 = 8
            r9 = 0
            r1 = r11
            r3 = r13
            r4 = r14
            r7 = r15
            od.d$b r13 = c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            od.d$a r14 = new od.d$a
            boolean r15 = r13.a()
            if (r15 == 0) goto Ld3
            oe.m0 r15 = r13.c()
            oe.q1 r12 = oe.p1.d(r12, r15)
            goto Ld7
        Ld3:
            oe.m0 r12 = r13.c()
        Ld7:
            int r13 = r13.b()
            r14.<init>(r12, r13)
            r12 = r14
        Ldf:
            return r12
        Le0:
            tb.p r12 = new tb.p
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: od.d.d(oe.q1, gc.l, int, boolean):od.d$a");
    }

    private final m0 e(m0 m0Var) {
        return this.f17827a.a() ? q0.h(m0Var, true) : new g(m0Var);
    }

    public final e0 a(e0 e0Var, gc.l<? super Integer, e> lVar, boolean z10) {
        t.e(e0Var, "<this>");
        t.e(lVar, "qualifiers");
        return d(e0Var.Z0(), lVar, 0, z10).b();
    }
}
