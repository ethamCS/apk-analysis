package ae;

import ad.b0;
import ae.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import oe.d1;
import oe.e0;
import oe.e1;
import oe.g0;
import pe.e;
import pe.f;
import pe.g;
import tb.r;
import ub.c0;
import xc.b;
import xc.d0;
import xc.f1;
import xc.j1;
import xc.q;
import xc.t;
import xc.t0;
import xc.u;
import xc.u0;
import xc.x0;
import xc.y;
/* loaded from: classes3.dex */
public class j {

    /* renamed from: e */
    private static final List<ae.e> f443e;

    /* renamed from: f */
    public static final j f444f;

    /* renamed from: g */
    private static final e.a f445g;

    /* renamed from: a */
    private final pe.g f446a;

    /* renamed from: b */
    private final pe.f f447b;

    /* renamed from: c */
    private final e.a f448c;

    /* renamed from: d */
    private final gc.p<e0, e0, Boolean> f449d;

    /* loaded from: classes3.dex */
    static class a implements e.a {
        a() {
        }

        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // pe.e.a
        public boolean a(e1 e1Var, e1 e1Var2) {
            if (e1Var == null) {
                b(0);
            }
            if (e1Var2 == null) {
                b(1);
            }
            return e1Var.equals(e1Var2);
        }
    }

    /* loaded from: classes3.dex */
    public static class b implements gc.p<D, D, r<xc.a, xc.a>> {
        b() {
        }

        /* renamed from: a */
        public r u(xc.a aVar, xc.a aVar2) {
            return new r(aVar, aVar2);
        }
    }

    /* loaded from: classes3.dex */
    public static class c implements gc.l<xc.b, Boolean> {

        /* renamed from: c */
        final /* synthetic */ xc.m f450c;

        c(xc.m mVar) {
            this.f450c = mVar;
        }

        /* renamed from: a */
        public Boolean invoke(xc.b bVar) {
            return Boolean.valueOf(bVar.b() == this.f450c);
        }
    }

    /* loaded from: classes3.dex */
    public static class d implements gc.l<xc.b, xc.a> {
        d() {
        }

        /* renamed from: a */
        public xc.b invoke(xc.b bVar) {
            return bVar;
        }
    }

    /* loaded from: classes3.dex */
    public static class e implements gc.l<xc.b, Boolean> {

        /* renamed from: c */
        final /* synthetic */ xc.e f451c;

        e(xc.e eVar) {
            this.f451c = eVar;
        }

        /* renamed from: a */
        public Boolean invoke(xc.b bVar) {
            boolean z10 = false;
            if (!t.g(bVar.g()) && t.h(bVar, this.f451c, false)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* loaded from: classes3.dex */
    public static class f implements gc.l<xc.b, xc.a> {
        f() {
        }

        /* renamed from: a */
        public xc.a invoke(xc.b bVar) {
            return bVar;
        }
    }

    /* loaded from: classes3.dex */
    public static class g implements gc.l<xc.b, tb.e0> {

        /* renamed from: c */
        final /* synthetic */ ae.i f452c;

        /* renamed from: d */
        final /* synthetic */ xc.b f453d;

        g(ae.i iVar, xc.b bVar) {
            this.f452c = iVar;
            this.f453d = bVar;
        }

        /* renamed from: a */
        public tb.e0 invoke(xc.b bVar) {
            this.f452c.b(this.f453d, bVar);
            return tb.e0.f22152a;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class h {

        /* renamed from: a */
        static final /* synthetic */ int[] f454a;

        /* renamed from: b */
        static final /* synthetic */ int[] f455b;

        /* renamed from: c */
        static final /* synthetic */ int[] f456c;

        static {
            int[] iArr = new int[xc.e0.values().length];
            f456c = iArr;
            try {
                iArr[xc.e0.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f456c[xc.e0.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f456c[xc.e0.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f456c[xc.e0.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i.a.values().length];
            f455b = iArr2;
            try {
                iArr2[i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f455b[i.a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f455b[i.a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[e.b.values().length];
            f454a = iArr3;
            try {
                iArr3[e.b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f454a[e.b.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f454a[e.b.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f454a[e.b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class i {

        /* renamed from: c */
        private static final i f457c = new i(a.OVERRIDABLE, "SUCCESS");

        /* renamed from: a */
        private final a f458a;

        /* renamed from: b */
        private final String f459b;

        /* loaded from: classes3.dex */
        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public i(a aVar, String str) {
            if (aVar == null) {
                a(3);
            }
            if (str == null) {
                a(4);
            }
            this.f458a = aVar;
            this.f459b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ void a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = r2
                goto L1c
            L1b:
                r5 = r1
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ae.j.i.a(int):void");
        }

        public static i b(String str) {
            if (str == null) {
                a(2);
            }
            return new i(a.CONFLICT, str);
        }

        public static i d(String str) {
            if (str == null) {
                a(1);
            }
            return new i(a.INCOMPATIBLE, str);
        }

        public static i e() {
            i iVar = f457c;
            if (iVar == null) {
                a(0);
            }
            return iVar;
        }

        public a c() {
            a aVar = this.f458a;
            if (aVar == null) {
                a(5);
            }
            return aVar;
        }
    }

    static {
        List<ae.e> F0;
        F0 = c0.F0(ServiceLoader.load(ae.e.class, ae.e.class.getClassLoader()));
        f443e = F0;
        a aVar = new a();
        f445g = aVar;
        f444f = new j(aVar, g.a.f19148a, f.a.f19147a, null);
    }

    private j(e.a aVar, pe.g gVar, pe.f fVar, gc.p<e0, e0, Boolean> pVar) {
        if (aVar == null) {
            a(5);
        }
        if (gVar == null) {
            a(6);
        }
        if (fVar == null) {
            a(7);
        }
        this.f448c = aVar;
        this.f446a = gVar;
        this.f447b = fVar;
        this.f449d = pVar;
    }

    private static boolean A(t0 t0Var, t0 t0Var2) {
        if (t0Var == null || t0Var2 == null) {
            return true;
        }
        return H(t0Var, t0Var2);
    }

    public static boolean B(xc.a aVar, xc.a aVar2) {
        if (aVar == null) {
            a(67);
        }
        if (aVar2 == null) {
            a(68);
        }
        e0 e10 = aVar.e();
        e0 e11 = aVar2.e();
        if (!H(aVar, aVar2)) {
            return false;
        }
        d1 l10 = f444f.l(aVar.p(), aVar2.p());
        if (aVar instanceof y) {
            return G(aVar, e10, aVar2, e11, l10);
        }
        if (!(aVar instanceof u0)) {
            throw new IllegalArgumentException("Unexpected callable: " + aVar.getClass());
        }
        u0 u0Var = (u0) aVar;
        u0 u0Var2 = (u0) aVar2;
        if (!A(u0Var.n(), u0Var2.n())) {
            return false;
        }
        return (!u0Var.Q() || !u0Var2.Q()) ? (u0Var.Q() || !u0Var2.Q()) && G(aVar, e10, aVar2, e11, l10) : oe.f.f17953a.k(l10, e10.Z0(), e11.Z0());
    }

    private static boolean C(xc.a aVar, Collection<xc.a> collection) {
        if (aVar == null) {
            a(71);
        }
        if (collection == null) {
            a(72);
        }
        for (xc.a aVar2 : collection) {
            if (!B(aVar, aVar2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean G(xc.a aVar, e0 e0Var, xc.a aVar2, e0 e0Var2, d1 d1Var) {
        if (aVar == null) {
            a(73);
        }
        if (e0Var == null) {
            a(74);
        }
        if (aVar2 == null) {
            a(75);
        }
        if (e0Var2 == null) {
            a(76);
        }
        if (d1Var == null) {
            a(77);
        }
        return oe.f.f17953a.r(d1Var, e0Var.Z0(), e0Var2.Z0());
    }

    private static boolean H(q qVar, q qVar2) {
        if (qVar == null) {
            a(69);
        }
        if (qVar2 == null) {
            a(70);
        }
        Integer d10 = t.d(qVar.g(), qVar2.g());
        return d10 == null || d10.intValue() >= 0;
    }

    public static boolean I(d0 d0Var, d0 d0Var2, boolean z10) {
        if (d0Var == null) {
            a(57);
        }
        if (d0Var2 == null) {
            a(58);
        }
        return !t.g(d0Var2.g()) && t.h(d0Var2, d0Var, z10);
    }

    public static <D extends xc.a> boolean J(D d10, D d11, boolean z10, boolean z11) {
        if (d10 == null) {
            a(13);
        }
        if (d11 == null) {
            a(14);
        }
        if (d10.equals(d11) || !ae.b.f422a.d(d10.a(), d11.a(), z10, z11)) {
            xc.a a10 = d11.a();
            for (xc.a aVar : ae.d.d(d10)) {
                if (ae.b.f422a.d(a10, aVar, z10, z11)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static void K(xc.b bVar, gc.l<xc.b, tb.e0> lVar) {
        u uVar;
        if (bVar == null) {
            a(107);
        }
        for (xc.b bVar2 : bVar.f()) {
            if (bVar2.g() == t.f25583g) {
                K(bVar2, lVar);
            }
        }
        if (bVar.g() != t.f25583g) {
            return;
        }
        u h10 = h(bVar);
        if (h10 == null) {
            if (lVar != null) {
                lVar.invoke(bVar);
            }
            uVar = t.f25581e;
        } else {
            uVar = h10;
        }
        if (bVar instanceof ad.c0) {
            ((ad.c0) bVar).l1(uVar);
            for (t0 t0Var : ((u0) bVar).B()) {
                K(t0Var, h10 == null ? null : lVar);
            }
        } else if (bVar instanceof ad.p) {
            ((ad.p) bVar).s1(uVar);
        } else {
            b0 b0Var = (b0) bVar;
            b0Var.X0(uVar);
            if (uVar == b0Var.C0().g()) {
                return;
            }
            b0Var.V0(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <H> H L(Collection<H> collection, gc.l<H, xc.a> lVar) {
        List j02;
        Object U;
        Object U2;
        Object U3;
        Object U4;
        if (collection == null) {
            a(78);
        }
        if (lVar == 0) {
            a(79);
        }
        if (collection.size() == 1) {
            U4 = c0.U(collection);
            H h10 = (H) U4;
            if (h10 == null) {
                a(80);
            }
            return h10;
        }
        ArrayList arrayList = new ArrayList(2);
        j02 = c0.j0(collection, lVar);
        U = c0.U(collection);
        H h11 = (H) U;
        xc.a aVar = (xc.a) lVar.invoke(h11);
        for (H h12 : collection) {
            xc.a aVar2 = (xc.a) lVar.invoke(h12);
            if (C(aVar2, j02)) {
                arrayList.add(h12);
            }
            if (B(aVar2, aVar) && !B(aVar, aVar2)) {
                h11 = h12;
            }
        }
        if (arrayList.isEmpty()) {
            if (h11 == null) {
                a(81);
            }
            return h11;
        } else if (arrayList.size() == 1) {
            U3 = c0.U(arrayList);
            H h13 = (H) U3;
            if (h13 == null) {
                a(82);
            }
            return h13;
        } else {
            H h14 = null;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!oe.b0.b(((xc.a) lVar.invoke(next)).e())) {
                    h14 = next;
                    break;
                }
            }
            if (h14 != null) {
                return h14;
            }
            U2 = c0.U(arrayList);
            H h15 = (H) U2;
            if (h15 == null) {
                a(84);
            }
            return h15;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.j.a(int):void");
    }

    private static boolean b(Collection<xc.b> collection) {
        boolean L;
        if (collection == null) {
            a(63);
        }
        if (collection.size() < 2) {
            return true;
        }
        L = c0.L(collection, new c(collection.iterator().next().b()));
        return L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean c(xc.f1 r4, xc.f1 r5, oe.d1 r6) {
        /*
            if (r4 != 0) goto L7
            r0 = 49
            a(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 50
            a(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 51
            a(r0)
        L15:
            java.util.List r4 = r4.getUpperBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.getUpperBounds()
            r0.<init>(r5)
            int r5 = r4.size()
            int r1 = r0.size()
            r2 = 0
            if (r5 == r1) goto L2e
            return r2
        L2e:
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            oe.e0 r5 = (oe.e0) r5
            java.util.ListIterator r1 = r0.listIterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r1.next()
            oe.e0 r3 = (oe.e0) r3
            boolean r3 = d(r5, r3, r6)
            if (r3 == 0) goto L42
            r1.remove()
            goto L32
        L58:
            return r2
        L59:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.j.c(xc.f1, xc.f1, oe.d1):boolean");
    }

    private static boolean d(e0 e0Var, e0 e0Var2, d1 d1Var) {
        if (e0Var == null) {
            a(46);
        }
        if (e0Var2 == null) {
            a(47);
        }
        if (d1Var == null) {
            a(48);
        }
        if (g0.a(e0Var) && g0.a(e0Var2)) {
            return true;
        }
        return oe.f.f17953a.k(d1Var, e0Var.Z0(), e0Var2.Z0());
    }

    private static i e(xc.a aVar, xc.a aVar2) {
        String str;
        boolean z10 = true;
        boolean z11 = aVar.U() == null;
        if (aVar2.U() != null) {
            z10 = false;
        }
        if (z11 != z10) {
            str = "Receiver presence mismatch";
        } else if (aVar.o().size() == aVar2.o().size()) {
            return null;
        } else {
            str = "Value parameter number mismatch";
        }
        return i.d(str);
    }

    private static void f(xc.b bVar, Set<xc.b> set) {
        if (bVar == null) {
            a(17);
        }
        if (set == null) {
            a(18);
        }
        if (bVar.h().b()) {
            set.add(bVar);
        } else if (bVar.f().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + bVar);
        } else {
            for (xc.b bVar2 : bVar.f()) {
                f(bVar2, set);
            }
        }
    }

    private static List<e0> g(xc.a aVar) {
        x0 U = aVar.U();
        ArrayList arrayList = new ArrayList();
        if (U != null) {
            arrayList.add(U.getType());
        }
        for (j1 j1Var : aVar.o()) {
            arrayList.add(j1Var.getType());
        }
        return arrayList;
    }

    private static u h(xc.b bVar) {
        if (bVar == null) {
            a(108);
        }
        Collection<? extends xc.b> f10 = bVar.f();
        u u10 = u(f10);
        if (u10 == null) {
            return null;
        }
        if (bVar.h() != b.a.FAKE_OVERRIDE) {
            return u10.f();
        }
        for (xc.b bVar2 : f10) {
            if (bVar2.s() != xc.e0.ABSTRACT && !bVar2.g().equals(u10)) {
                return null;
            }
        }
        return u10;
    }

    public static j i(pe.g gVar, e.a aVar) {
        if (gVar == null) {
            a(3);
        }
        if (aVar == null) {
            a(4);
        }
        return new j(aVar, gVar, f.a.f19147a, null);
    }

    private static void j(Collection<xc.b> collection, xc.e eVar, ae.i iVar) {
        if (collection == null) {
            a(85);
        }
        if (eVar == null) {
            a(86);
        }
        if (iVar == null) {
            a(87);
        }
        Collection<xc.b> t10 = t(eVar, collection);
        boolean isEmpty = t10.isEmpty();
        if (!isEmpty) {
            collection = t10;
        }
        xc.b n02 = ((xc.b) L(collection, new d())).n0(eVar, n(collection, eVar), isEmpty ? t.f25584h : t.f25583g, b.a.FAKE_OVERRIDE, false);
        iVar.d(n02, collection);
        iVar.a(n02);
    }

    private static void k(xc.e eVar, Collection<xc.b> collection, ae.i iVar) {
        if (eVar == null) {
            a(64);
        }
        if (collection == null) {
            a(65);
        }
        if (iVar == null) {
            a(66);
        }
        if (b(collection)) {
            for (xc.b bVar : collection) {
                j(Collections.singleton(bVar), eVar, iVar);
            }
            return;
        }
        LinkedList linkedList = new LinkedList(collection);
        while (!linkedList.isEmpty()) {
            j(q(p.a(linkedList), linkedList, iVar), eVar, iVar);
        }
    }

    private d1 l(List<f1> list, List<f1> list2) {
        if (list == null) {
            a(42);
        }
        if (list2 == null) {
            a(43);
        }
        if (list.isEmpty()) {
            d1 H0 = new k(null, this.f448c, this.f446a, this.f447b, this.f449d).H0(true, true);
            if (H0 == null) {
                a(44);
            }
            return H0;
        }
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashMap.put(list.get(i10).r(), list2.get(i10).r());
        }
        d1 H02 = new k(hashMap, this.f448c, this.f446a, this.f447b, this.f449d).H0(true, true);
        if (H02 == null) {
            a(45);
        }
        return H02;
    }

    public static j m(pe.g gVar) {
        if (gVar == null) {
            a(0);
        }
        return new j(f445g, gVar, f.a.f19147a, null);
    }

    private static xc.e0 n(Collection<xc.b> collection, xc.e eVar) {
        if (collection == null) {
            a(88);
        }
        if (eVar == null) {
            a(89);
        }
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (xc.b bVar : collection) {
            int i10 = h.f456c[bVar.s().ordinal()];
            if (i10 == 1) {
                xc.e0 e0Var = xc.e0.FINAL;
                if (e0Var == null) {
                    a(90);
                }
                return e0Var;
            } else if (i10 == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + bVar);
            } else if (i10 == 3) {
                z11 = true;
            } else if (i10 == 4) {
                z12 = true;
            }
        }
        if (eVar.l0() && eVar.s() != xc.e0.ABSTRACT && eVar.s() != xc.e0.SEALED) {
            z10 = true;
        }
        if (z11 && !z12) {
            xc.e0 e0Var2 = xc.e0.OPEN;
            if (e0Var2 == null) {
                a(91);
            }
            return e0Var2;
        } else if (!z11 && z12) {
            xc.e0 s10 = z10 ? eVar.s() : xc.e0.ABSTRACT;
            if (s10 == null) {
                a(92);
            }
            return s10;
        } else {
            HashSet hashSet = new HashSet();
            for (xc.b bVar2 : collection) {
                hashSet.addAll(z(bVar2));
            }
            return y(r(hashSet), z10, eVar.s());
        }
    }

    private Collection<xc.b> o(xc.b bVar, Collection<? extends xc.b> collection, xc.e eVar, ae.i iVar) {
        if (bVar == null) {
            a(59);
        }
        if (collection == null) {
            a(60);
        }
        if (eVar == null) {
            a(61);
        }
        if (iVar == null) {
            a(62);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        ye.f a10 = ye.f.a();
        for (xc.b bVar2 : collection) {
            i.a c10 = D(bVar2, bVar, eVar).c();
            boolean I = I(bVar, bVar2, false);
            int i10 = h.f455b[c10.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    if (I) {
                        iVar.c(bVar2, bVar);
                    }
                }
            } else if (I) {
                a10.add(bVar2);
            }
            arrayList.add(bVar2);
        }
        iVar.d(bVar, a10);
        return arrayList;
    }

    public static <H> Collection<H> p(H h10, Collection<H> collection, gc.l<H, xc.a> lVar, gc.l<H, tb.e0> lVar2) {
        if (h10 == null) {
            a(99);
        }
        if (collection == null) {
            a(100);
        }
        if (lVar == null) {
            a(101);
        }
        if (lVar2 == null) {
            a(102);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h10);
        xc.a invoke = lVar.invoke(h10);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            xc.a invoke2 = lVar.invoke(next);
            if (h10 != next) {
                i.a x10 = x(invoke, invoke2);
                if (x10 == i.a.OVERRIDABLE) {
                    arrayList.add(next);
                } else if (x10 == i.a.CONFLICT) {
                    lVar2.invoke(next);
                }
            }
            it.remove();
        }
        return arrayList;
    }

    private static Collection<xc.b> q(xc.b bVar, Queue<xc.b> queue, ae.i iVar) {
        if (bVar == null) {
            a(104);
        }
        if (queue == null) {
            a(105);
        }
        if (iVar == null) {
            a(106);
        }
        return p(bVar, queue, new f(), new g(iVar, bVar));
    }

    public static <D extends xc.a> Set<D> r(Set<D> set) {
        if (set == null) {
            a(8);
        }
        return s(set, !set.isEmpty() && ee.a.q(ee.a.l(set.iterator().next())), null, new b());
    }

    public static <D> Set<D> s(Set<D> set, boolean z10, gc.a<?> aVar, gc.p<? super D, ? super D, r<xc.a, xc.a>> pVar) {
        if (set == null) {
            a(9);
        }
        if (pVar == null) {
            a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (aVar != null) {
                aVar.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                r<xc.a, xc.a> u10 = pVar.u(obj, (Object) it.next());
                xc.a b10 = u10.b();
                xc.a c10 = u10.c();
                if (J(b10, c10, z10, true)) {
                    it.remove();
                } else if (J(c10, b10, z10, true)) {
                    break;
                }
            }
        }
        return linkedHashSet;
    }

    private static Collection<xc.b> t(xc.e eVar, Collection<xc.b> collection) {
        List R;
        if (eVar == null) {
            a(96);
        }
        if (collection == null) {
            a(97);
        }
        R = c0.R(collection, new e(eVar));
        if (R == null) {
            a(98);
        }
        return R;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static xc.u u(java.util.Collection<? extends xc.b> r5) {
        /*
            if (r5 != 0) goto L7
            r0 = 109(0x6d, float:1.53E-43)
            a(r0)
        L7:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L10
            xc.u r5 = xc.t.f25588l
            return r5
        L10:
            java.util.Iterator r0 = r5.iterator()
            r1 = 0
        L15:
            r2 = r1
        L16:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r3 = r0.next()
            xc.b r3 = (xc.b) r3
            xc.u r3 = r3.g()
            if (r2 != 0) goto L2a
        L28:
            r2 = r3
            goto L16
        L2a:
            java.lang.Integer r4 = xc.t.d(r3, r2)
            if (r4 != 0) goto L31
            goto L15
        L31:
            int r4 = r4.intValue()
            if (r4 <= 0) goto L16
            goto L28
        L38:
            if (r2 != 0) goto L3b
            return r1
        L3b:
            java.util.Iterator r5 = r5.iterator()
        L3f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r5.next()
            xc.b r0 = (xc.b) r0
            xc.u r0 = r0.g()
            java.lang.Integer r0 = xc.t.d(r2, r0)
            if (r0 == 0) goto L5b
            int r0 = r0.intValue()
            if (r0 >= 0) goto L3f
        L5b:
            return r1
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.j.u(java.util.Collection):xc.u");
    }

    public static i w(xc.a aVar, xc.a aVar2) {
        String str;
        boolean z10;
        if (aVar == null) {
            a(40);
        }
        if (aVar2 == null) {
            a(41);
        }
        boolean z11 = aVar instanceof y;
        if ((z11 && !(aVar2 instanceof y)) || (((z10 = aVar instanceof u0)) && !(aVar2 instanceof u0))) {
            str = "Member kind mismatch";
        } else if (!z11 && !z10) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + aVar);
        } else if (aVar.getName().equals(aVar2.getName())) {
            i e10 = e(aVar, aVar2);
            if (e10 == null) {
                return null;
            }
            return e10;
        } else {
            str = "Name mismatch";
        }
        return i.d(str);
    }

    public static i.a x(xc.a aVar, xc.a aVar2) {
        j jVar = f444f;
        i.a c10 = jVar.D(aVar2, aVar, null).c();
        i.a c11 = jVar.D(aVar, aVar2, null).c();
        i.a aVar3 = i.a.OVERRIDABLE;
        if (c10 == aVar3 && c11 == aVar3) {
            return aVar3;
        }
        i.a aVar4 = i.a.CONFLICT;
        return (c10 == aVar4 || c11 == aVar4) ? aVar4 : i.a.INCOMPATIBLE;
    }

    private static xc.e0 y(Collection<xc.b> collection, boolean z10, xc.e0 e0Var) {
        if (collection == null) {
            a(93);
        }
        if (e0Var == null) {
            a(94);
        }
        xc.e0 e0Var2 = xc.e0.ABSTRACT;
        for (xc.b bVar : collection) {
            xc.e0 s10 = (!z10 || bVar.s() != xc.e0.ABSTRACT) ? bVar.s() : e0Var;
            if (s10.compareTo(e0Var2) < 0) {
                e0Var2 = s10;
            }
        }
        if (e0Var2 == null) {
            a(95);
        }
        return e0Var2;
    }

    public static Set<xc.b> z(xc.b bVar) {
        if (bVar == null) {
            a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f(bVar, linkedHashSet);
        return linkedHashSet;
    }

    public i D(xc.a aVar, xc.a aVar2, xc.e eVar) {
        if (aVar == null) {
            a(19);
        }
        if (aVar2 == null) {
            a(20);
        }
        i E = E(aVar, aVar2, eVar, false);
        if (E == null) {
            a(21);
        }
        return E;
    }

    public i E(xc.a aVar, xc.a aVar2, xc.e eVar, boolean z10) {
        if (aVar == null) {
            a(22);
        }
        if (aVar2 == null) {
            a(23);
        }
        i F = F(aVar, aVar2, z10);
        boolean z11 = F.c() == i.a.OVERRIDABLE;
        for (ae.e eVar2 : f443e) {
            if (eVar2.b() != e.a.CONFLICTS_ONLY && (!z11 || eVar2.b() != e.a.SUCCESS_ONLY)) {
                int i10 = h.f454a[eVar2.a(aVar, aVar2, eVar).ordinal()];
                if (i10 == 1) {
                    z11 = true;
                } else if (i10 == 2) {
                    i b10 = i.b("External condition failed");
                    if (b10 == null) {
                        a(24);
                    }
                    return b10;
                } else if (i10 == 3) {
                    i d10 = i.d("External condition");
                    if (d10 == null) {
                        a(25);
                    }
                    return d10;
                }
            }
        }
        if (!z11) {
            return F;
        }
        for (ae.e eVar3 : f443e) {
            if (eVar3.b() == e.a.CONFLICTS_ONLY) {
                int i11 = h.f454a[eVar3.a(aVar, aVar2, eVar).ordinal()];
                if (i11 == 1) {
                    throw new IllegalStateException("Contract violation in " + eVar3.getClass().getName() + " condition. It's not supposed to end with success");
                } else if (i11 == 2) {
                    i b11 = i.b("External condition failed");
                    if (b11 == null) {
                        a(27);
                    }
                    return b11;
                } else if (i11 == 3) {
                    i d11 = i.d("External condition");
                    if (d11 == null) {
                        a(28);
                    }
                    return d11;
                }
            }
        }
        i e10 = i.e();
        if (e10 == null) {
            a(29);
        }
        return e10;
    }

    public i F(xc.a aVar, xc.a aVar2, boolean z10) {
        if (aVar == null) {
            a(30);
        }
        if (aVar2 == null) {
            a(31);
        }
        i w9 = w(aVar, aVar2);
        if (w9 != null) {
            return w9;
        }
        List<e0> g10 = g(aVar);
        List<e0> g11 = g(aVar2);
        List<f1> p10 = aVar.p();
        List<f1> p11 = aVar2.p();
        int i10 = 0;
        if (p10.size() != p11.size()) {
            while (i10 < g10.size()) {
                if (!pe.e.f19146a.b(g10.get(i10), g11.get(i10))) {
                    i d10 = i.d("Type parameter number mismatch");
                    if (d10 == null) {
                        a(33);
                    }
                    return d10;
                }
                i10++;
            }
            i b10 = i.b("Type parameter number mismatch");
            if (b10 == null) {
                a(34);
            }
            return b10;
        }
        d1 l10 = l(p10, p11);
        for (int i11 = 0; i11 < p10.size(); i11++) {
            if (!c(p10.get(i11), p11.get(i11), l10)) {
                i d11 = i.d("Type parameter bounds mismatch");
                if (d11 == null) {
                    a(35);
                }
                return d11;
            }
        }
        for (int i12 = 0; i12 < g10.size(); i12++) {
            if (!d(g10.get(i12), g11.get(i12), l10)) {
                i d12 = i.d("Value parameter type mismatch");
                if (d12 == null) {
                    a(36);
                }
                return d12;
            }
        }
        if ((aVar instanceof y) && (aVar2 instanceof y) && ((y) aVar).s0() != ((y) aVar2).s0()) {
            i b11 = i.b("Incompatible suspendability");
            if (b11 == null) {
                a(37);
            }
            return b11;
        }
        if (z10) {
            e0 e10 = aVar.e();
            e0 e11 = aVar2.e();
            if (e10 != null && e11 != null) {
                if (g0.a(e11) && g0.a(e10)) {
                    i10 = 1;
                }
                if (i10 == 0 && !oe.f.f17953a.r(l10, e11.Z0(), e10.Z0())) {
                    i b12 = i.b("Return type mismatch");
                    if (b12 == null) {
                        a(38);
                    }
                    return b12;
                }
            }
        }
        i e12 = i.e();
        if (e12 == null) {
            a(39);
        }
        return e12;
    }

    public void v(wd.f fVar, Collection<? extends xc.b> collection, Collection<? extends xc.b> collection2, xc.e eVar, ae.i iVar) {
        if (fVar == null) {
            a(52);
        }
        if (collection == null) {
            a(53);
        }
        if (collection2 == null) {
            a(54);
        }
        if (eVar == null) {
            a(55);
        }
        if (iVar == null) {
            a(56);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        for (xc.b bVar : collection2) {
            linkedHashSet.removeAll(o(bVar, collection, eVar, iVar));
        }
        k(eVar, linkedHashSet, iVar);
    }
}
