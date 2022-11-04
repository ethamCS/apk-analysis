package ad;

import ad.l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import oe.l1;
import oe.r1;
import xc.a;
import xc.a1;
import xc.b;
import xc.f1;
import xc.j1;
import xc.k1;
import xc.x0;
import xc.y;
/* loaded from: classes.dex */
public abstract class p extends k implements xc.y {
    private List<j1> U3;
    private oe.e0 V3;
    private List<x0> W3;
    private x0 X3;
    private x0 Y3;
    private xc.e0 Z3;

    /* renamed from: a4 */
    private xc.u f344a4;

    /* renamed from: b4 */
    private boolean f345b4;

    /* renamed from: c4 */
    private boolean f346c4;

    /* renamed from: d4 */
    private boolean f347d4;

    /* renamed from: e4 */
    private boolean f348e4;

    /* renamed from: f4 */
    private boolean f349f4;

    /* renamed from: g4 */
    private boolean f350g4;

    /* renamed from: h4 */
    private boolean f351h4;

    /* renamed from: i4 */
    private boolean f352i4;

    /* renamed from: j4 */
    private boolean f353j4;

    /* renamed from: k4 */
    private boolean f354k4;

    /* renamed from: l4 */
    private boolean f355l4;

    /* renamed from: m4 */
    private boolean f356m4;

    /* renamed from: n4 */
    private Collection<? extends xc.y> f357n4;

    /* renamed from: o4 */
    private volatile gc.a<Collection<xc.y>> f358o4;

    /* renamed from: p4 */
    private final xc.y f359p4;

    /* renamed from: q4 */
    private final b.a f360q4;

    /* renamed from: r4 */
    private xc.y f361r4;

    /* renamed from: s4 */
    protected Map<a.AbstractC0451a<?>, Object> f362s4;

    /* renamed from: y */
    private List<f1> f363y;

    /* loaded from: classes.dex */
    public class a implements gc.a<Collection<xc.y>> {

        /* renamed from: c */
        final /* synthetic */ l1 f364c;

        a(l1 l1Var) {
            p.this = r1;
            this.f364c = l1Var;
        }

        /* renamed from: a */
        public Collection<xc.y> invoke() {
            ye.e eVar = new ye.e();
            for (xc.y yVar : p.this.f()) {
                eVar.add(yVar.c(this.f364c));
            }
            return eVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements gc.a<List<k1>> {

        /* renamed from: c */
        final /* synthetic */ List f366c;

        b(List list) {
            this.f366c = list;
        }

        /* renamed from: a */
        public List<k1> invoke() {
            return this.f366c;
        }
    }

    /* loaded from: classes.dex */
    public class c implements y.a<xc.y> {

        /* renamed from: a */
        protected oe.j1 f367a;

        /* renamed from: b */
        protected xc.m f368b;

        /* renamed from: c */
        protected xc.e0 f369c;

        /* renamed from: d */
        protected xc.u f370d;

        /* renamed from: e */
        protected xc.y f371e;

        /* renamed from: f */
        protected b.a f372f;

        /* renamed from: g */
        protected List<j1> f373g;

        /* renamed from: h */
        protected List<x0> f374h;

        /* renamed from: i */
        protected x0 f375i;

        /* renamed from: j */
        protected x0 f376j;

        /* renamed from: k */
        protected oe.e0 f377k;

        /* renamed from: l */
        protected wd.f f378l;

        /* renamed from: m */
        protected boolean f379m;

        /* renamed from: n */
        protected boolean f380n;

        /* renamed from: o */
        protected boolean f381o;

        /* renamed from: p */
        protected boolean f382p;

        /* renamed from: q */
        private boolean f383q;

        /* renamed from: r */
        private List<f1> f384r;

        /* renamed from: s */
        private yc.g f385s;

        /* renamed from: t */
        private boolean f386t;

        /* renamed from: u */
        private Map<a.AbstractC0451a<?>, Object> f387u;

        /* renamed from: v */
        private Boolean f388v;

        /* renamed from: w */
        protected boolean f389w;

        /* renamed from: x */
        final /* synthetic */ p f390x;

        public c(p pVar, oe.j1 j1Var, xc.m mVar, xc.e0 e0Var, xc.u uVar, b.a aVar, List<j1> list, List<x0> list2, x0 x0Var, oe.e0 e0Var2, wd.f fVar) {
            if (j1Var == null) {
                v(0);
            }
            if (mVar == null) {
                v(1);
            }
            if (e0Var == null) {
                v(2);
            }
            if (uVar == null) {
                v(3);
            }
            if (aVar == null) {
                v(4);
            }
            if (list == null) {
                v(5);
            }
            if (list2 == null) {
                v(6);
            }
            if (e0Var2 == null) {
                v(7);
            }
            this.f390x = pVar;
            this.f371e = null;
            this.f376j = pVar.Y3;
            this.f379m = true;
            this.f380n = false;
            this.f381o = false;
            this.f382p = false;
            this.f383q = pVar.r0();
            this.f384r = null;
            this.f385s = null;
            this.f386t = pVar.G0();
            this.f387u = new LinkedHashMap();
            this.f388v = null;
            this.f389w = false;
            this.f367a = j1Var;
            this.f368b = mVar;
            this.f369c = e0Var;
            this.f370d = uVar;
            this.f372f = aVar;
            this.f373g = list;
            this.f374h = list2;
            this.f375i = x0Var;
            this.f377k = e0Var2;
            this.f378l = fVar;
        }

        private static /* synthetic */ void v(int i10) {
            String str;
            int i11;
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i11 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i11 = 3;
                    break;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i10) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i10) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(format);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(format);
            }
        }

        /* renamed from: C */
        public c c(yc.g gVar) {
            if (gVar == null) {
                v(35);
            }
            this.f385s = gVar;
            return this;
        }

        /* renamed from: D */
        public c q(boolean z10) {
            this.f379m = z10;
            return this;
        }

        /* renamed from: E */
        public c m(x0 x0Var) {
            this.f376j = x0Var;
            return this;
        }

        /* renamed from: F */
        public c a() {
            this.f382p = true;
            return this;
        }

        /* renamed from: G */
        public c s(x0 x0Var) {
            this.f375i = x0Var;
            return this;
        }

        public c H(boolean z10) {
            this.f388v = Boolean.valueOf(z10);
            return this;
        }

        /* renamed from: I */
        public c p() {
            this.f386t = true;
            return this;
        }

        /* renamed from: J */
        public c j() {
            this.f383q = true;
            return this;
        }

        public c K(boolean z10) {
            this.f389w = z10;
            return this;
        }

        /* renamed from: L */
        public c e(b.a aVar) {
            if (aVar == null) {
                v(14);
            }
            this.f372f = aVar;
            return this;
        }

        /* renamed from: M */
        public c t(xc.e0 e0Var) {
            if (e0Var == null) {
                v(10);
            }
            this.f369c = e0Var;
            return this;
        }

        /* renamed from: N */
        public c n(wd.f fVar) {
            if (fVar == null) {
                v(17);
            }
            this.f378l = fVar;
            return this;
        }

        /* renamed from: O */
        public c k(xc.b bVar) {
            this.f371e = (xc.y) bVar;
            return this;
        }

        /* renamed from: P */
        public c g(xc.m mVar) {
            if (mVar == null) {
                v(8);
            }
            this.f368b = mVar;
            return this;
        }

        /* renamed from: Q */
        public c l() {
            this.f381o = true;
            return this;
        }

        /* renamed from: R */
        public c r(oe.e0 e0Var) {
            if (e0Var == null) {
                v(23);
            }
            this.f377k = e0Var;
            return this;
        }

        /* renamed from: S */
        public c u() {
            this.f380n = true;
            return this;
        }

        /* renamed from: T */
        public c i(oe.j1 j1Var) {
            if (j1Var == null) {
                v(37);
            }
            this.f367a = j1Var;
            return this;
        }

        /* renamed from: U */
        public c h(List<f1> list) {
            if (list == null) {
                v(21);
            }
            this.f384r = list;
            return this;
        }

        /* renamed from: V */
        public c f(List<j1> list) {
            if (list == null) {
                v(19);
            }
            this.f373g = list;
            return this;
        }

        /* renamed from: W */
        public c o(xc.u uVar) {
            if (uVar == null) {
                v(12);
            }
            this.f370d = uVar;
            return this;
        }

        @Override // xc.y.a
        public xc.y b() {
            return this.f390x.V0(this);
        }

        @Override // xc.y.a
        public <V> y.a<xc.y> d(a.AbstractC0451a<V> abstractC0451a, V v10) {
            if (abstractC0451a == null) {
                v(39);
            }
            this.f387u.put(abstractC0451a, v10);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(xc.m mVar, xc.y yVar, yc.g gVar, wd.f fVar, b.a aVar, a1 a1Var) {
        super(mVar, gVar, fVar, a1Var);
        if (mVar == null) {
            e0(0);
        }
        if (gVar == null) {
            e0(1);
        }
        if (fVar == null) {
            e0(2);
        }
        if (aVar == null) {
            e0(3);
        }
        if (a1Var == null) {
            e0(4);
        }
        this.f344a4 = xc.t.f25585i;
        this.f345b4 = false;
        this.f346c4 = false;
        this.f347d4 = false;
        this.f348e4 = false;
        this.f349f4 = false;
        this.f350g4 = false;
        this.f351h4 = false;
        this.f352i4 = false;
        this.f353j4 = false;
        this.f354k4 = false;
        this.f355l4 = true;
        this.f356m4 = false;
        this.f357n4 = null;
        this.f358o4 = null;
        this.f361r4 = null;
        this.f362s4 = null;
        this.f359p4 = yVar == null ? this : yVar;
        this.f360q4 = aVar;
    }

    private a1 W0(boolean z10, xc.y yVar) {
        a1 a1Var;
        if (z10) {
            if (yVar == null) {
                yVar = z0();
            }
            a1Var = yVar.m();
        } else {
            a1Var = a1.f25519a;
        }
        if (a1Var == null) {
            e0(27);
        }
        return a1Var;
    }

    public static List<j1> X0(xc.y yVar, List<j1> list, l1 l1Var) {
        if (list == null) {
            e0(28);
        }
        if (l1Var == null) {
            e0(29);
        }
        return Y0(yVar, list, l1Var, false, false, null);
    }

    public static List<j1> Y0(xc.y yVar, List<j1> list, l1 l1Var, boolean z10, boolean z11, boolean[] zArr) {
        if (list == null) {
            e0(30);
        }
        if (l1Var == null) {
            e0(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (j1 j1Var : list) {
            oe.e0 type = j1Var.getType();
            r1 r1Var = r1.IN_VARIANCE;
            oe.e0 p10 = l1Var.p(type, r1Var);
            oe.e0 R = j1Var.R();
            oe.e0 p11 = R == null ? null : l1Var.p(R, r1Var);
            if (p10 == null) {
                return null;
            }
            if ((p10 != j1Var.getType() || R != p11) && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(l0.T0(yVar, z10 ? null : j1Var, j1Var.l(), j1Var.j(), j1Var.getName(), p10, j1Var.k0(), j1Var.C(), j1Var.K0(), p11, z11 ? j1Var.m() : a1.f25519a, j1Var instanceof l0.b ? new b(((l0.b) j1Var).W0()) : null));
        }
        return arrayList;
    }

    private void c1() {
        gc.a<Collection<xc.y>> aVar = this.f358o4;
        if (aVar != null) {
            this.f357n4 = aVar.invoke();
            this.f358o4 = null;
        }
    }

    private static /* synthetic */ void e0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i11 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(format);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    private void j1(boolean z10) {
        this.f353j4 = z10;
    }

    private void k1(boolean z10) {
        this.f352i4 = z10;
    }

    private void m1(xc.y yVar) {
        this.f361r4 = yVar;
    }

    @Override // xc.a
    public <V> V D(a.AbstractC0451a<V> abstractC0451a) {
        Map<a.AbstractC0451a<?>, Object> map = this.f362s4;
        if (map == null) {
            return null;
        }
        return (V) map.get(abstractC0451a);
    }

    @Override // xc.y
    public xc.y G() {
        return this.f361r4;
    }

    @Override // xc.y
    public boolean G0() {
        return this.f353j4;
    }

    @Override // xc.d0
    public boolean H() {
        return this.f347d4;
    }

    @Override // xc.a
    public x0 J() {
        return this.Y3;
    }

    @Override // xc.d0
    public boolean L0() {
        return this.f351h4;
    }

    @Override // xc.y
    public boolean P0() {
        if (this.f346c4) {
            return true;
        }
        for (xc.y yVar : z0().f()) {
            if (yVar.P0()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: T0 */
    public xc.y n0(xc.m mVar, xc.e0 e0Var, xc.u uVar, b.a aVar, boolean z10) {
        xc.y b10 = y().g(mVar).t(e0Var).o(uVar).e(aVar).q(z10).b();
        if (b10 == null) {
            e0(26);
        }
        return b10;
    }

    @Override // xc.a
    public x0 U() {
        return this.X3;
    }

    protected abstract p U0(xc.m mVar, xc.y yVar, b.a aVar, wd.f fVar, yc.g gVar, a1 a1Var);

    public xc.y V0(c cVar) {
        f0 f0Var;
        x0 x0Var;
        oe.e0 p10;
        gc.a<Collection<xc.y>> aVar;
        if (cVar == null) {
            e0(25);
        }
        boolean[] zArr = new boolean[1];
        yc.g a10 = cVar.f385s != null ? yc.i.a(j(), cVar.f385s) : j();
        xc.m mVar = cVar.f368b;
        xc.y yVar = cVar.f371e;
        p U0 = U0(mVar, yVar, cVar.f372f, cVar.f378l, a10, W0(cVar.f381o, yVar));
        List<f1> p11 = cVar.f384r == null ? p() : cVar.f384r;
        zArr[0] = zArr[0] | (!p11.isEmpty());
        ArrayList arrayList = new ArrayList(p11.size());
        l1 c10 = oe.t.c(p11, cVar.f367a, U0, arrayList, zArr);
        if (c10 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!cVar.f374h.isEmpty()) {
            for (x0 x0Var2 : cVar.f374h) {
                oe.e0 p12 = c10.p(x0Var2.getType(), r1.IN_VARIANCE);
                if (p12 == null) {
                    return null;
                }
                arrayList2.add(ae.c.b(U0, p12, x0Var2.j()));
                zArr[0] = (p12 != x0Var2.getType()) | zArr[0];
            }
        }
        x0 x0Var3 = cVar.f375i;
        if (x0Var3 != null) {
            oe.e0 p13 = c10.p(x0Var3.getType(), r1.IN_VARIANCE);
            if (p13 == null) {
                return null;
            }
            f0 f0Var2 = new f0(U0, new ie.d(U0, p13, cVar.f375i.getValue()), cVar.f375i.j());
            zArr[0] = (p13 != cVar.f375i.getType()) | zArr[0];
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        x0 x0Var4 = cVar.f376j;
        if (x0Var4 != null) {
            x0 c11 = x0Var4.c(c10);
            if (c11 == null) {
                return null;
            }
            zArr[0] = zArr[0] | (c11 != cVar.f376j);
            x0Var = c11;
        } else {
            x0Var = null;
        }
        List<j1> Y0 = Y0(U0, cVar.f373g, c10, cVar.f382p, cVar.f381o, zArr);
        if (Y0 == null || (p10 = c10.p(cVar.f377k, r1.OUT_VARIANCE)) == null) {
            return null;
        }
        zArr[0] = zArr[0] | (p10 != cVar.f377k);
        if (!zArr[0] && cVar.f389w) {
            return this;
        }
        U0.a1(f0Var, x0Var, arrayList2, arrayList, Y0, p10, cVar.f369c, cVar.f370d);
        U0.o1(this.f345b4);
        U0.l1(this.f346c4);
        U0.g1(this.f347d4);
        U0.n1(this.f348e4);
        U0.r1(this.f349f4);
        U0.q1(this.f354k4);
        U0.f1(this.f350g4);
        U0.e1(this.f351h4);
        U0.h1(this.f355l4);
        U0.k1(cVar.f383q);
        U0.j1(cVar.f386t);
        U0.i1(cVar.f388v != null ? cVar.f388v.booleanValue() : this.f356m4);
        if (!cVar.f387u.isEmpty() || this.f362s4 != null) {
            Map<a.AbstractC0451a<?>, Object> map = cVar.f387u;
            Map<a.AbstractC0451a<?>, Object> map2 = this.f362s4;
            if (map2 != null) {
                for (Map.Entry<a.AbstractC0451a<?>, Object> entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                map = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            }
            U0.f362s4 = map;
        }
        if (cVar.f380n || G() != null) {
            U0.m1((G() != null ? G() : this).c(c10));
        }
        if (cVar.f379m && !z0().f().isEmpty()) {
            if (cVar.f367a.f()) {
                aVar = this.f358o4;
                if (aVar == null) {
                    U0.t0(f());
                }
            } else {
                aVar = new a(c10);
            }
            U0.f358o4 = aVar;
        }
        return U0;
    }

    public boolean Z0() {
        return this.f355l4;
    }

    @Override // ad.k, ad.j, xc.m, xc.h
    /* renamed from: a */
    public xc.y z0() {
        xc.y yVar = this.f359p4;
        xc.y a10 = yVar == this ? this : yVar.a();
        if (a10 == null) {
            e0(20);
        }
        return a10;
    }

    public p a1(x0 x0Var, x0 x0Var2, List<x0> list, List<? extends f1> list2, List<j1> list3, oe.e0 e0Var, xc.e0 e0Var2, xc.u uVar) {
        List<f1> F0;
        List<j1> F02;
        if (list == null) {
            e0(5);
        }
        if (list2 == null) {
            e0(6);
        }
        if (list3 == null) {
            e0(7);
        }
        if (uVar == null) {
            e0(8);
        }
        F0 = ub.c0.F0(list2);
        this.f363y = F0;
        F02 = ub.c0.F0(list3);
        this.U3 = F02;
        this.V3 = e0Var;
        this.Z3 = e0Var2;
        this.f344a4 = uVar;
        this.X3 = x0Var;
        this.Y3 = x0Var2;
        this.W3 = list;
        for (int i10 = 0; i10 < list2.size(); i10++) {
            f1 f1Var = list2.get(i10);
            if (f1Var.l() != i10) {
                throw new IllegalStateException(f1Var + " index is " + f1Var.l() + " but position is " + i10);
            }
        }
        for (int i11 = 0; i11 < list3.size(); i11++) {
            j1 j1Var = list3.get(i11);
            if (j1Var.l() != i11 + 0) {
                throw new IllegalStateException(j1Var + "index is " + j1Var.l() + " but position is " + i11);
            }
        }
        return this;
    }

    @Override // xc.a
    public boolean b0() {
        return this.f356m4;
    }

    public c b1(l1 l1Var) {
        if (l1Var == null) {
            e0(24);
        }
        return new c(this, l1Var.j(), b(), s(), g(), h(), o(), d0(), U(), e(), null);
    }

    @Override // xc.y, xc.c1
    public xc.y c(l1 l1Var) {
        if (l1Var == null) {
            e0(22);
        }
        return l1Var.k() ? this : b1(l1Var).k(z0()).l().K(true).b();
    }

    @Override // xc.a
    public List<x0> d0() {
        List<x0> list = this.W3;
        if (list == null) {
            e0(13);
        }
        return list;
    }

    public <V> void d1(a.AbstractC0451a<V> abstractC0451a, Object obj) {
        if (this.f362s4 == null) {
            this.f362s4 = new LinkedHashMap();
        }
        this.f362s4.put(abstractC0451a, obj);
    }

    public oe.e0 e() {
        return this.V3;
    }

    public void e1(boolean z10) {
        this.f351h4 = z10;
    }

    public Collection<? extends xc.y> f() {
        c1();
        Collection<? extends xc.y> collection = this.f357n4;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            e0(14);
        }
        return collection;
    }

    public void f1(boolean z10) {
        this.f350g4 = z10;
    }

    @Override // xc.q, xc.d0
    public xc.u g() {
        xc.u uVar = this.f344a4;
        if (uVar == null) {
            e0(16);
        }
        return uVar;
    }

    public <R, D> R g0(xc.o<R, D> oVar, D d10) {
        return oVar.g(this, d10);
    }

    public void g1(boolean z10) {
        this.f347d4 = z10;
    }

    @Override // xc.b
    public b.a h() {
        b.a aVar = this.f360q4;
        if (aVar == null) {
            e0(21);
        }
        return aVar;
    }

    public void h1(boolean z10) {
        this.f355l4 = z10;
    }

    public void i1(boolean z10) {
        this.f356m4 = z10;
    }

    @Override // xc.y
    public boolean isInline() {
        return this.f348e4;
    }

    @Override // xc.d0
    public boolean l0() {
        return this.f350g4;
    }

    public void l1(boolean z10) {
        this.f346c4 = z10;
    }

    public void n1(boolean z10) {
        this.f348e4 = z10;
    }

    @Override // xc.a
    public List<j1> o() {
        List<j1> list = this.U3;
        if (list == null) {
            e0(19);
        }
        return list;
    }

    public void o1(boolean z10) {
        this.f345b4 = z10;
    }

    @Override // xc.a
    public List<f1> p() {
        List<f1> list = this.f363y;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    public void p1(oe.e0 e0Var) {
        if (e0Var == null) {
            e0(11);
        }
        this.V3 = e0Var;
    }

    public void q1(boolean z10) {
        this.f354k4 = z10;
    }

    @Override // xc.y
    public boolean r0() {
        return this.f352i4;
    }

    public void r1(boolean z10) {
        this.f349f4 = z10;
    }

    @Override // xc.d0
    public xc.e0 s() {
        xc.e0 e0Var = this.Z3;
        if (e0Var == null) {
            e0(15);
        }
        return e0Var;
    }

    @Override // xc.y
    public boolean s0() {
        return this.f354k4;
    }

    public void s1(xc.u uVar) {
        if (uVar == null) {
            e0(10);
        }
        this.f344a4 = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void t0(Collection<? extends xc.b> collection) {
        if (collection == 0) {
            e0(17);
        }
        this.f357n4 = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((xc.y) it.next()).G0()) {
                this.f353j4 = true;
                return;
            }
        }
    }

    @Override // xc.y
    public boolean u0() {
        return this.f349f4;
    }

    @Override // xc.y
    public boolean v0() {
        if (this.f345b4) {
            return true;
        }
        for (xc.y yVar : z0().f()) {
            if (yVar.v0()) {
                return true;
            }
        }
        return false;
    }

    public y.a<? extends xc.y> y() {
        c b12 = b1(l1.f18012b);
        if (b12 == null) {
            e0(23);
        }
        return b12;
    }
}
