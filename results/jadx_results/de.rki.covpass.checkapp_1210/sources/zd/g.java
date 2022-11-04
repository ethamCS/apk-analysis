package zd;

import bf.x;
import hc.k0;
import hc.t;
import hc.v;
import hc.y;
import java.lang.reflect.Field;
import java.util.Set;
import oe.e0;
import ub.y0;
import xc.j1;
import zd.b;
import zd.c;
import zd.f;
/* loaded from: classes3.dex */
public final class g implements f {
    static final /* synthetic */ oc.k<Object>[] X = {k0.e(new y(k0.b(g.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), k0.e(new y(k0.b(g.class), "withDefinedIn", "getWithDefinedIn()Z")), k0.e(new y(k0.b(g.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), k0.e(new y(k0.b(g.class), "modifiers", "getModifiers()Ljava/util/Set;")), k0.e(new y(k0.b(g.class), "startFromName", "getStartFromName()Z")), k0.e(new y(k0.b(g.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), k0.e(new y(k0.b(g.class), "debugMode", "getDebugMode()Z")), k0.e(new y(k0.b(g.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), k0.e(new y(k0.b(g.class), "verbose", "getVerbose()Z")), k0.e(new y(k0.b(g.class), "unitReturnType", "getUnitReturnType()Z")), k0.e(new y(k0.b(g.class), "withoutReturnType", "getWithoutReturnType()Z")), k0.e(new y(k0.b(g.class), "enhancedTypes", "getEnhancedTypes()Z")), k0.e(new y(k0.b(g.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), k0.e(new y(k0.b(g.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), k0.e(new y(k0.b(g.class), "renderDefaultModality", "getRenderDefaultModality()Z")), k0.e(new y(k0.b(g.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), k0.e(new y(k0.b(g.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), k0.e(new y(k0.b(g.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), k0.e(new y(k0.b(g.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), k0.e(new y(k0.b(g.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), k0.e(new y(k0.b(g.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), k0.e(new y(k0.b(g.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), k0.e(new y(k0.b(g.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), k0.e(new y(k0.b(g.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), k0.e(new y(k0.b(g.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), k0.e(new y(k0.b(g.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), k0.e(new y(k0.b(g.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), k0.e(new y(k0.b(g.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), k0.e(new y(k0.b(g.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), k0.e(new y(k0.b(g.class), "receiverAfterName", "getReceiverAfterName()Z")), k0.e(new y(k0.b(g.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), k0.e(new y(k0.b(g.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), k0.e(new y(k0.b(g.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), k0.e(new y(k0.b(g.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), k0.e(new y(k0.b(g.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), k0.e(new y(k0.b(g.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), k0.e(new y(k0.b(g.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), k0.e(new y(k0.b(g.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), k0.e(new y(k0.b(g.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), k0.e(new y(k0.b(g.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), k0.e(new y(k0.b(g.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), k0.e(new y(k0.b(g.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), k0.e(new y(k0.b(g.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), k0.e(new y(k0.b(g.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), k0.e(new y(k0.b(g.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), k0.e(new y(k0.b(g.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), k0.e(new y(k0.b(g.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), k0.e(new y(k0.b(g.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    private final kc.d E;
    private final kc.d F;
    private final kc.d H;
    private final kc.d I;
    private final kc.d J;
    private final kc.d N;
    private final kc.d O;
    private final kc.d P;
    private final kc.d Q;
    private final kc.d R;
    private final kc.d S;
    private final kc.d T;
    private final kc.d U;
    private final kc.d V;
    private final kc.d W;

    /* renamed from: a */
    private boolean f26662a;

    /* renamed from: c */
    private final kc.d f26664c;

    /* renamed from: d */
    private final kc.d f26665d;

    /* renamed from: f */
    private final kc.d f26667f;

    /* renamed from: g */
    private final kc.d f26668g;

    /* renamed from: h */
    private final kc.d f26669h;

    /* renamed from: i */
    private final kc.d f26670i;

    /* renamed from: j */
    private final kc.d f26671j;

    /* renamed from: k */
    private final kc.d f26672k;

    /* renamed from: l */
    private final kc.d f26673l;

    /* renamed from: m */
    private final kc.d f26674m;

    /* renamed from: n */
    private final kc.d f26675n;

    /* renamed from: o */
    private final kc.d f26676o;

    /* renamed from: p */
    private final kc.d f26677p;

    /* renamed from: q */
    private final kc.d f26678q;

    /* renamed from: r */
    private final kc.d f26679r;

    /* renamed from: s */
    private final kc.d f26680s;

    /* renamed from: t */
    private final kc.d f26681t;

    /* renamed from: u */
    private final kc.d f26682u;

    /* renamed from: v */
    private final kc.d f26683v;

    /* renamed from: w */
    private final kc.d f26684w;

    /* renamed from: z */
    private final kc.d f26687z;

    /* renamed from: b */
    private final kc.d f26663b = m0(b.c.f26614a);

    /* renamed from: e */
    private final kc.d f26666e = m0(e.f26653d);

    /* renamed from: x */
    private final kc.d f26685x = m0(c.f26690c);

    /* renamed from: y */
    private final kc.d f26686y = m0(a.f26688c);
    private final kc.d A = m0(j.RENDER_OPEN);
    private final kc.d B = m0(c.l.a.f26636a);
    private final kc.d C = m0(m.PLAIN);
    private final kc.d D = m0(k.ALL);
    private final kc.d G = m0(l.DEBUG);
    private final kc.d K = m0(h.f26691a.a());
    private final kc.d L = m0(null);
    private final kc.d M = m0(zd.a.NO_ARGUMENTS);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends v implements gc.l<j1, String> {

        /* renamed from: c */
        public static final a f26688c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final String invoke(j1 j1Var) {
            t.e(j1Var, "it");
            return "...";
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends kc.b<T> {

        /* renamed from: b */
        final /* synthetic */ g f26689b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, g gVar) {
            super(obj);
            this.f26689b = gVar;
        }

        @Override // kc.b
        protected boolean d(oc.k<?> kVar, T t10, T t11) {
            t.e(kVar, "property");
            if (!this.f26689b.k0()) {
                return true;
            }
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c extends v implements gc.l<e0, e0> {

        /* renamed from: c */
        public static final c f26690c = new c();

        c() {
            super(1);
        }

        /* renamed from: b */
        public final e0 invoke(e0 e0Var) {
            t.e(e0Var, "it");
            return e0Var;
        }
    }

    public g() {
        Set b10;
        Boolean bool = Boolean.TRUE;
        this.f26664c = m0(bool);
        this.f26665d = m0(bool);
        Boolean bool2 = Boolean.FALSE;
        this.f26667f = m0(bool2);
        this.f26668g = m0(bool2);
        this.f26669h = m0(bool2);
        this.f26670i = m0(bool2);
        this.f26671j = m0(bool2);
        this.f26672k = m0(bool);
        this.f26673l = m0(bool2);
        this.f26674m = m0(bool2);
        this.f26675n = m0(bool2);
        this.f26676o = m0(bool);
        this.f26677p = m0(bool);
        this.f26678q = m0(bool2);
        this.f26679r = m0(bool2);
        this.f26680s = m0(bool2);
        this.f26681t = m0(bool2);
        this.f26682u = m0(bool2);
        this.f26683v = m0(bool2);
        this.f26684w = m0(bool2);
        this.f26687z = m0(bool);
        this.E = m0(bool2);
        this.F = m0(bool2);
        this.H = m0(bool2);
        this.I = m0(bool2);
        b10 = y0.b();
        this.J = m0(b10);
        this.N = m0(bool2);
        this.O = m0(bool);
        this.P = m0(bool);
        this.Q = m0(bool2);
        this.R = m0(bool);
        this.S = m0(bool);
        this.T = m0(bool2);
        this.U = m0(bool2);
        this.V = m0(bool2);
        this.W = m0(bool);
    }

    private final <T> kc.d<g, T> m0(T t10) {
        kc.a aVar = kc.a.f14870a;
        return new b(t10, this);
    }

    public boolean A() {
        return ((Boolean) this.R.a(this, X[42])).booleanValue();
    }

    public boolean B() {
        return f.a.a(this);
    }

    public boolean C() {
        return f.a.b(this);
    }

    public boolean D() {
        return ((Boolean) this.f26682u.a(this, X[19])).booleanValue();
    }

    public boolean E() {
        return ((Boolean) this.W.a(this, X[47])).booleanValue();
    }

    public Set<e> F() {
        return (Set) this.f26666e.a(this, X[3]);
    }

    public boolean G() {
        return ((Boolean) this.f26675n.a(this, X[12])).booleanValue();
    }

    public j H() {
        return (j) this.A.a(this, X[25]);
    }

    public k I() {
        return (k) this.D.a(this, X[28]);
    }

    public boolean J() {
        return ((Boolean) this.S.a(this, X[43])).booleanValue();
    }

    public boolean K() {
        return ((Boolean) this.U.a(this, X[45])).booleanValue();
    }

    public l L() {
        return (l) this.G.a(this, X[31]);
    }

    public boolean M() {
        return ((Boolean) this.E.a(this, X[29])).booleanValue();
    }

    public boolean N() {
        return ((Boolean) this.F.a(this, X[30])).booleanValue();
    }

    public boolean O() {
        return ((Boolean) this.f26678q.a(this, X[15])).booleanValue();
    }

    public boolean P() {
        return ((Boolean) this.O.a(this, X[39])).booleanValue();
    }

    public boolean Q() {
        return ((Boolean) this.H.a(this, X[32])).booleanValue();
    }

    public boolean R() {
        return ((Boolean) this.f26677p.a(this, X[14])).booleanValue();
    }

    public boolean S() {
        return ((Boolean) this.f26676o.a(this, X[13])).booleanValue();
    }

    public boolean T() {
        return ((Boolean) this.f26679r.a(this, X[16])).booleanValue();
    }

    public boolean U() {
        return ((Boolean) this.Q.a(this, X[41])).booleanValue();
    }

    public boolean V() {
        return ((Boolean) this.P.a(this, X[40])).booleanValue();
    }

    public boolean W() {
        return ((Boolean) this.f26687z.a(this, X[24])).booleanValue();
    }

    public boolean X() {
        return ((Boolean) this.f26668g.a(this, X[5])).booleanValue();
    }

    public boolean Y() {
        return ((Boolean) this.f26667f.a(this, X[4])).booleanValue();
    }

    public m Z() {
        return (m) this.C.a(this, X[27]);
    }

    @Override // zd.f
    public void a(boolean z10) {
        this.f26669h.b(this, X[6], Boolean.valueOf(z10));
    }

    public gc.l<e0, e0> a0() {
        return (gc.l) this.f26685x.a(this, X[22]);
    }

    @Override // zd.f
    public void b(boolean z10) {
        this.F.b(this, X[30], Boolean.valueOf(z10));
    }

    public boolean b0() {
        return ((Boolean) this.f26681t.a(this, X[18])).booleanValue();
    }

    @Override // zd.f
    public void c(boolean z10) {
        this.E.b(this, X[29], Boolean.valueOf(z10));
    }

    public boolean c0() {
        return ((Boolean) this.f26672k.a(this, X[9])).booleanValue();
    }

    @Override // zd.f
    public void d(zd.b bVar) {
        t.e(bVar, "<set-?>");
        this.f26663b.b(this, X[0], bVar);
    }

    public c.l d0() {
        return (c.l) this.B.a(this, X[26]);
    }

    @Override // zd.f
    public void e(Set<wd.c> set) {
        t.e(set, "<set-?>");
        this.K.b(this, X[35], set);
    }

    public boolean e0() {
        return ((Boolean) this.f26671j.a(this, X[8])).booleanValue();
    }

    @Override // zd.f
    public void f(m mVar) {
        t.e(mVar, "<set-?>");
        this.C.b(this, X[27], mVar);
    }

    public boolean f0() {
        return ((Boolean) this.f26664c.a(this, X[1])).booleanValue();
    }

    @Override // zd.f
    public void g(boolean z10) {
        this.f26667f.b(this, X[4], Boolean.valueOf(z10));
    }

    public boolean g0() {
        return ((Boolean) this.f26665d.a(this, X[2])).booleanValue();
    }

    @Override // zd.f
    public void h(Set<? extends e> set) {
        t.e(set, "<set-?>");
        this.f26666e.b(this, X[3], set);
    }

    public boolean h0() {
        return ((Boolean) this.f26673l.a(this, X[10])).booleanValue();
    }

    @Override // zd.f
    public void i(boolean z10) {
        this.f26664c.b(this, X[1], Boolean.valueOf(z10));
    }

    public boolean i0() {
        return ((Boolean) this.f26684w.a(this, X[21])).booleanValue();
    }

    @Override // zd.f
    public void j(k kVar) {
        t.e(kVar, "<set-?>");
        this.D.b(this, X[28], kVar);
    }

    public boolean j0() {
        return ((Boolean) this.f26683v.a(this, X[20])).booleanValue();
    }

    @Override // zd.f
    public boolean k() {
        return ((Boolean) this.f26674m.a(this, X[11])).booleanValue();
    }

    public final boolean k0() {
        return this.f26662a;
    }

    @Override // zd.f
    public Set<wd.c> l() {
        return (Set) this.K.a(this, X[35]);
    }

    public final void l0() {
        this.f26662a = true;
    }

    @Override // zd.f
    public boolean m() {
        return ((Boolean) this.f26669h.a(this, X[6])).booleanValue();
    }

    @Override // zd.f
    public zd.a n() {
        return (zd.a) this.M.a(this, X[37]);
    }

    @Override // zd.f
    public void o(boolean z10) {
        this.f26683v.b(this, X[20], Boolean.valueOf(z10));
    }

    @Override // zd.f
    public void p(boolean z10) {
        this.f26684w.b(this, X[21], Boolean.valueOf(z10));
    }

    public final g q() {
        g gVar = new g();
        Field[] declaredFields = g.class.getDeclaredFields();
        t.d(declaredFields, "this::class.java.declaredFields");
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                kc.b bVar = obj instanceof kc.b ? (kc.b) obj : null;
                if (bVar != null) {
                    String name = field.getName();
                    t.d(name, "field.name");
                    x.I(name, "is", false, 2, null);
                    oc.d b10 = k0.b(g.class);
                    String name2 = field.getName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("get");
                    String name3 = field.getName();
                    t.d(name3, "field.name");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String substring = name3.substring(1);
                        t.d(substring, "this as java.lang.String).substring(startIndex)");
                        name3 = upperCase + substring;
                    }
                    sb2.append(name3);
                    field.set(gVar, gVar.m0(bVar.a(this, new hc.e0(b10, name2, sb2.toString()))));
                }
            }
        }
        return gVar;
    }

    public boolean r() {
        return ((Boolean) this.f26680s.a(this, X[17])).booleanValue();
    }

    public boolean s() {
        return ((Boolean) this.N.a(this, X[38])).booleanValue();
    }

    public gc.l<yc.c, Boolean> t() {
        return (gc.l) this.L.a(this, X[36]);
    }

    public boolean u() {
        return ((Boolean) this.V.a(this, X[46])).booleanValue();
    }

    public boolean v() {
        return ((Boolean) this.f26670i.a(this, X[7])).booleanValue();
    }

    public zd.b w() {
        return (zd.b) this.f26663b.a(this, X[0]);
    }

    public gc.l<j1, String> x() {
        return (gc.l) this.f26686y.a(this, X[23]);
    }

    public boolean y() {
        return ((Boolean) this.I.a(this, X[33])).booleanValue();
    }

    public Set<wd.c> z() {
        return (Set) this.J.a(this, X[34]);
    }
}
