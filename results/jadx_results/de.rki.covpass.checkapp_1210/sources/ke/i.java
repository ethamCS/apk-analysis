package ke;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ub.x0;
import uc.k;
/* loaded from: classes3.dex */
public final class i {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private static final Set<wd.b> f15052c;

    /* renamed from: a */
    private final k f15053a;

    /* renamed from: b */
    private final gc.l<a, xc.e> f15054b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final wd.b f15055a;

        /* renamed from: b */
        private final g f15056b;

        public a(wd.b bVar, g gVar) {
            hc.t.e(bVar, "classId");
            this.f15055a = bVar;
            this.f15056b = gVar;
        }

        public final g a() {
            return this.f15056b;
        }

        public final wd.b b() {
            return this.f15055a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && hc.t.a(this.f15055a, ((a) obj).f15055a);
        }

        public int hashCode() {
            return this.f15055a.hashCode();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<wd.b> a() {
            return i.f15052c;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends hc.v implements gc.l<a, xc.e> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(1);
            i.this = r1;
        }

        /* renamed from: b */
        public final xc.e invoke(a aVar) {
            hc.t.e(aVar, "key");
            return i.this.c(aVar);
        }
    }

    static {
        Set<wd.b> a10;
        a10 = x0.a(wd.b.m(k.a.f23471d.l()));
        f15052c = a10;
    }

    public i(k kVar) {
        hc.t.e(kVar, "components");
        this.f15053a = kVar;
        this.f15054b = kVar.u().i(new c());
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8 A[EDGE_INSN: B:47:0x00b8->B:39:0x00b8 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final xc.e c(ke.i.a r13) {
        /*
            r12 = this;
            wd.b r0 = r13.b()
            ke.k r1 = r12.f15053a
            java.lang.Iterable r1 = r1.k()
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            zc.b r2 = (zc.b) r2
            xc.e r2 = r2.a(r0)
            if (r2 == 0) goto Le
            return r2
        L21:
            java.util.Set<wd.b> r1 = ke.i.f15052c
            boolean r1 = r1.contains(r0)
            r2 = 0
            if (r1 == 0) goto L2b
            return r2
        L2b:
            ke.g r13 = r13.a()
            if (r13 != 0) goto L3e
            ke.k r13 = r12.f15053a
            ke.h r13 = r13.e()
            ke.g r13 = r13.a(r0)
            if (r13 != 0) goto L3e
            return r2
        L3e:
            td.c r1 = r13.a()
            rd.c r10 = r13.b()
            td.a r11 = r13.c()
            xc.a1 r13 = r13.d()
            wd.b r3 = r0.g()
            java.lang.String r4 = "classId.shortClassName"
            if (r3 == 0) goto L79
            r5 = 2
            xc.e r3 = e(r12, r3, r2, r5, r2)
            boolean r5 = r3 instanceof me.d
            if (r5 == 0) goto L62
            me.d r3 = (me.d) r3
            goto L63
        L62:
            r3 = r2
        L63:
            if (r3 != 0) goto L66
            return r2
        L66:
            wd.f r0 = r0.j()
            hc.t.d(r0, r4)
            boolean r0 = r3.p1(r0)
            if (r0 != 0) goto L74
            return r2
        L74:
            ke.m r0 = r3.j1()
            goto Le4
        L79:
            ke.k r3 = r12.f15053a
            xc.m0 r3 = r3.r()
            wd.c r5 = r0.h()
            java.lang.String r6 = "classId.packageFqName"
            hc.t.d(r5, r6)
            java.util.List r3 = xc.o0.c(r3, r5)
            java.util.Iterator r3 = r3.iterator()
        L90:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lb7
            java.lang.Object r5 = r3.next()
            r6 = r5
            xc.l0 r6 = (xc.l0) r6
            boolean r7 = r6 instanceof ke.p
            if (r7 == 0) goto Lb3
            ke.p r6 = (ke.p) r6
            wd.f r7 = r0.j()
            hc.t.d(r7, r4)
            boolean r6 = r6.T0(r7)
            if (r6 == 0) goto Lb1
            goto Lb3
        Lb1:
            r6 = 0
            goto Lb4
        Lb3:
            r6 = 1
        Lb4:
            if (r6 == 0) goto L90
            goto Lb8
        Lb7:
            r5 = r2
        Lb8:
            r4 = r5
            xc.l0 r4 = (xc.l0) r4
            if (r4 != 0) goto Lbe
            return r2
        Lbe:
            ke.k r3 = r12.f15053a
            td.g r6 = new td.g
            rd.t r0 = r10.J1()
            java.lang.String r2 = "classProto.typeTable"
            hc.t.d(r0, r2)
            r6.<init>(r0)
            td.h$a r0 = td.h.Companion
            rd.w r2 = r10.L1()
            java.lang.String r5 = "classProto.versionRequirementTable"
            hc.t.d(r2, r5)
            td.h r7 = r0.a(r2)
            r9 = 0
            r5 = r1
            r8 = r11
            ke.m r0 = r3.a(r4, r5, r6, r7, r8, r9)
        Le4:
            r4 = r0
            me.d r0 = new me.d
            r3 = r0
            r5 = r10
            r6 = r1
            r7 = r11
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.i.c(ke.i$a):xc.e");
    }

    public static /* synthetic */ xc.e e(i iVar, wd.b bVar, g gVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            gVar = null;
        }
        return iVar.d(bVar, gVar);
    }

    public final xc.e d(wd.b bVar, g gVar) {
        hc.t.e(bVar, "classId");
        return this.f15054b.invoke(new a(bVar, gVar));
    }
}
