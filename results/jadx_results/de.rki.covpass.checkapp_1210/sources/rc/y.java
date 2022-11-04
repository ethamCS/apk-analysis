package rc;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.g1;
import oe.n1;
import oe.r1;
import org.conscrypt.BuildConfig;
import rc.d0;
import xc.e1;
import xc.f1;
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006%²\u0006\u0012\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00178\nX\u008a\u0084\u0002"}, d2 = {"Lrc/y;", "Lhc/u;", "Loe/e0;", "type", "Loc/e;", "d", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", "Ljava/lang/reflect/Type;", "W", "()Ljava/lang/reflect/Type;", "javaType", "classifier$delegate", "Lrc/d0$a;", "f", "()Loc/e;", "classifier", BuildConfig.FLAVOR, "Loc/p;", "arguments$delegate", "c", "()Ljava/util/List;", "arguments", "t", "()Z", "isMarkedNullable", "Lkotlin/Function0;", "computeJavaType", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Lgc/a;)V", "parameterizedTypeArguments", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class y implements hc.u {

    /* renamed from: y */
    static final /* synthetic */ oc.k<Object>[] f20760y = {hc.k0.g(new hc.e0(hc.k0.b(y.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), hc.k0.g(new hc.e0(hc.k0.b(y.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* renamed from: c */
    private final oe.e0 f20761c;

    /* renamed from: d */
    private final d0.a<Type> f20762d;

    /* renamed from: q */
    private final d0.a f20763q;

    /* renamed from: x */
    private final d0.a f20764x;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "Loc/p;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.a<List<? extends oc.p>> {

        /* renamed from: d */
        final /* synthetic */ gc.a<Type> f20766d;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/reflect/Type;", "b", "()Ljava/lang/reflect/Type;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: rc.y$a$a */
        /* loaded from: classes.dex */
        public static final class C0338a extends hc.v implements gc.a<Type> {

            /* renamed from: c */
            final /* synthetic */ y f20767c;

            /* renamed from: d */
            final /* synthetic */ int f20768d;

            /* renamed from: q */
            final /* synthetic */ Lazy<List<Type>> f20769q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0338a(y yVar, int i10, Lazy<? extends List<? extends Type>> lazy) {
                super(0);
                this.f20767c = yVar;
                this.f20768d = i10;
                this.f20769q = lazy;
            }

            /* renamed from: b */
            public final Type invoke() {
                Class cls;
                Object B;
                Object A;
                Type W = this.f20767c.W();
                if (W instanceof Class) {
                    Class cls2 = (Class) W;
                    cls = cls2.isArray() ? cls2.getComponentType() : Object.class;
                } else if (W instanceof GenericArrayType) {
                    if (this.f20768d != 0) {
                        throw new b0("Array type has been queried for a non-0th argument: " + this.f20767c);
                    }
                    cls = ((GenericArrayType) W).getGenericComponentType();
                } else if (!(W instanceof ParameterizedType)) {
                    throw new b0("Non-generic type has been queried for arguments: " + this.f20767c);
                } else {
                    cls = (Type) a.c(this.f20769q).get(this.f20768d);
                    if (cls instanceof WildcardType) {
                        WildcardType wildcardType = (WildcardType) cls;
                        Type[] lowerBounds = wildcardType.getLowerBounds();
                        hc.t.d(lowerBounds, "argument.lowerBounds");
                        B = ub.m.B(lowerBounds);
                        Type type = (Type) B;
                        if (type == null) {
                            Type[] upperBounds = wildcardType.getUpperBounds();
                            hc.t.d(upperBounds, "argument.upperBounds");
                            A = ub.m.A(upperBounds);
                            cls = (Type) A;
                        } else {
                            cls = type;
                        }
                    }
                }
                hc.t.d(cls, "{\n                      …                        }");
                return cls;
            }
        }

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* loaded from: classes.dex */
        public /* synthetic */ class b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f20770a;

            static {
                int[] iArr = new int[r1.values().length];
                iArr[r1.INVARIANT.ordinal()] = 1;
                iArr[r1.IN_VARIANCE.ordinal()] = 2;
                iArr[r1.OUT_VARIANCE.ordinal()] = 3;
                f20770a = iArr;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Ljava/lang/reflect/Type;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class c extends hc.v implements gc.a<List<? extends Type>> {

            /* renamed from: c */
            final /* synthetic */ y f20771c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(y yVar) {
                super(0);
                this.f20771c = yVar;
            }

            @Override // gc.a
            public final List<? extends Type> invoke() {
                Type W = this.f20771c.W();
                hc.t.b(W);
                return dd.d.d(W);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(gc.a<? extends Type> aVar) {
            super(0);
            y.this = r1;
            this.f20766d = aVar;
        }

        public static final List<Type> c(Lazy<? extends List<? extends Type>> lazy) {
            return (List) lazy.getValue();
        }

        @Override // gc.a
        public final List<? extends oc.p> invoke() {
            Lazy b10;
            int s10;
            oc.p pVar;
            List<? extends oc.p> h10;
            List<g1> U0 = y.this.l().U0();
            if (U0.isEmpty()) {
                h10 = ub.u.h();
                return h10;
            }
            b10 = tb.m.b(tb.o.PUBLICATION, new c(y.this));
            gc.a<Type> aVar = this.f20766d;
            y yVar = y.this;
            s10 = ub.v.s(U0, 10);
            ArrayList arrayList = new ArrayList(s10);
            int i10 = 0;
            for (Object obj : U0) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    ub.u.r();
                }
                g1 g1Var = (g1) obj;
                if (g1Var.c()) {
                    pVar = oc.p.Companion.c();
                } else {
                    oe.e0 type = g1Var.getType();
                    hc.t.d(type, "typeProjection.type");
                    y yVar2 = new y(type, aVar == null ? null : new C0338a(yVar, i10, b10));
                    int i12 = b.f20770a[g1Var.b().ordinal()];
                    if (i12 == 1) {
                        pVar = oc.p.Companion.d(yVar2);
                    } else if (i12 == 2) {
                        pVar = oc.p.Companion.a(yVar2);
                    } else if (i12 != 3) {
                        throw new tb.p();
                    } else {
                        pVar = oc.p.Companion.b(yVar2);
                    }
                }
                arrayList.add(pVar);
                i10 = i11;
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loc/e;", "b", "()Loc/e;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.a<oc.e> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            y.this = r1;
        }

        /* renamed from: b */
        public final oc.e invoke() {
            y yVar = y.this;
            return yVar.d(yVar.l());
        }
    }

    public y(oe.e0 e0Var, gc.a<? extends Type> aVar) {
        hc.t.e(e0Var, "type");
        this.f20761c = e0Var;
        d0.a<Type> aVar2 = null;
        d0.a<Type> aVar3 = aVar instanceof d0.a ? (d0.a) aVar : null;
        if (aVar3 != null) {
            aVar2 = aVar3;
        } else if (aVar != null) {
            aVar2 = d0.c(aVar);
        }
        this.f20762d = aVar2;
        this.f20763q = d0.c(new b());
        this.f20764x = d0.c(new a(aVar));
    }

    public /* synthetic */ y(oe.e0 e0Var, gc.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(e0Var, (i10 & 2) != 0 ? null : aVar);
    }

    public final oc.e d(oe.e0 e0Var) {
        Object u02;
        oe.e0 type;
        xc.h z10 = e0Var.W0().z();
        if (!(z10 instanceof xc.e)) {
            if (z10 instanceof f1) {
                return new z(null, (f1) z10);
            }
            if (!(z10 instanceof e1)) {
                return null;
            }
            throw new tb.q("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        Class<?> p10 = j0.p((xc.e) z10);
        if (p10 == null) {
            return null;
        }
        if (!p10.isArray()) {
            if (n1.l(e0Var)) {
                return new h(p10);
            }
            Class<?> e10 = dd.d.e(p10);
            if (e10 != null) {
                p10 = e10;
            }
            return new h(p10);
        }
        u02 = ub.c0.u0(e0Var.U0());
        g1 g1Var = (g1) u02;
        if (g1Var == null || (type = g1Var.getType()) == null) {
            return new h(p10);
        }
        oc.e d10 = d(type);
        if (d10 != null) {
            return new h(j0.f(fc.a.b(qc.b.a(d10))));
        }
        throw new b0("Cannot determine classifier for array element type: " + this);
    }

    @Override // hc.u
    public Type W() {
        d0.a<Type> aVar = this.f20762d;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    @Override // oc.n
    public List<oc.p> c() {
        T b10 = this.f20764x.b(this, f20760y[1]);
        hc.t.d(b10, "<get-arguments>(...)");
        return (List) b10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && hc.t.a(this.f20761c, ((y) obj).f20761c);
    }

    @Override // oc.n
    public oc.e f() {
        return (oc.e) this.f20763q.b(this, f20760y[0]);
    }

    public int hashCode() {
        return this.f20761c.hashCode();
    }

    public final oe.e0 l() {
        return this.f20761c;
    }

    @Override // oc.n
    public boolean t() {
        return this.f20761c.X0();
    }

    public String toString() {
        return f0.f20627a.h(this.f20761c);
    }
}
