package rc;

import hc.r0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import oe.r1;
import org.conscrypt.BuildConfig;
import rc.d0;
import xc.f1;
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004*\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007*\u00020\u0006H\u0002J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0013\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006%"}, d2 = {"Lrc/z;", "Loc/o;", "Lrc/i;", "Lxc/e;", "Lrc/h;", "c", "Lme/g;", "Ljava/lang/Class;", "a", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", "getName", "()Ljava/lang/String;", "name", BuildConfig.FLAVOR, "Loc/n;", "upperBounds$delegate", "Lrc/d0$a;", "getUpperBounds", "()Ljava/util/List;", "upperBounds", "Loc/q;", "w", "()Loc/q;", "variance", "Lrc/a0;", "container", "Lxc/f1;", "descriptor", "<init>", "(Lrc/a0;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class z implements oc.o, i {

    /* renamed from: x */
    static final /* synthetic */ oc.k<Object>[] f20773x = {hc.k0.g(new hc.e0(hc.k0.b(z.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: c */
    private final f1 f20774c;

    /* renamed from: d */
    private final d0.a f20775d = d0.c(new b());

    /* renamed from: q */
    private final a0 f20776q;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20777a;

        static {
            int[] iArr = new int[r1.values().length];
            iArr[r1.INVARIANT.ordinal()] = 1;
            iArr[r1.IN_VARIANCE.ordinal()] = 2;
            iArr[r1.OUT_VARIANCE.ordinal()] = 3;
            f20777a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "Lrc/y;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.a<List<? extends y>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            z.this = r1;
        }

        @Override // gc.a
        public final List<? extends y> invoke() {
            int s10;
            List<oe.e0> upperBounds = z.this.getDescriptor().getUpperBounds();
            hc.t.d(upperBounds, "descriptor.upperBounds");
            s10 = ub.v.s(upperBounds, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (oe.e0 e0Var : upperBounds) {
                arrayList.add(new y(e0Var, null, 2, null));
            }
            return arrayList;
        }
    }

    public z(a0 a0Var, f1 f1Var) {
        Object obj;
        h<?> hVar;
        hc.t.e(f1Var, "descriptor");
        this.f20774c = f1Var;
        if (a0Var == null) {
            xc.m b10 = getDescriptor().b();
            hc.t.d(b10, "descriptor.containingDeclaration");
            if (b10 instanceof xc.e) {
                obj = c((xc.e) b10);
            } else if (!(b10 instanceof xc.b)) {
                throw new b0("Unknown type parameter container: " + b10);
            } else {
                xc.m b11 = ((xc.b) b10).b();
                hc.t.d(b11, "declaration.containingDeclaration");
                if (b11 instanceof xc.e) {
                    hVar = c((xc.e) b11);
                } else {
                    me.g gVar = b10 instanceof me.g ? (me.g) b10 : null;
                    if (gVar == null) {
                        throw new b0("Non-class callable descriptor must be deserialized: " + b10);
                    }
                    oc.d e10 = fc.a.e(a(gVar));
                    hc.t.c(e10, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    hVar = (h) e10;
                }
                obj = b10.g0(new rc.a(hVar), tb.e0.f22152a);
            }
            hc.t.d(obj, "when (val declaration = … $declaration\")\n        }");
            a0Var = (a0) obj;
        }
        this.f20776q = a0Var;
    }

    private final Class<?> a(me.g gVar) {
        Class<?> e10;
        me.f E = gVar.E();
        cd.f fVar = null;
        if (!(E instanceof pd.k)) {
            E = null;
        }
        pd.k kVar = (pd.k) E;
        pd.q g10 = kVar != null ? kVar.g() : null;
        if (g10 instanceof cd.f) {
            fVar = g10;
        }
        cd.f fVar2 = fVar;
        if (fVar2 == null || (e10 = fVar2.e()) == null) {
            throw new b0("Container of deserialized member is not resolved: " + gVar);
        }
        return e10;
    }

    private final h<?> c(xc.e eVar) {
        Class<?> p10 = j0.p(eVar);
        h<?> hVar = (h) (p10 != null ? fc.a.e(p10) : null);
        if (hVar != null) {
            return hVar;
        }
        throw new b0("Type parameter container is not resolved: " + eVar.b());
    }

    /* renamed from: b */
    public f1 getDescriptor() {
        return this.f20774c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (hc.t.a(this.f20776q, zVar.f20776q) && hc.t.a(getName(), zVar.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // oc.o
    public String getName() {
        String b10 = getDescriptor().getName().b();
        hc.t.d(b10, "descriptor.name.asString()");
        return b10;
    }

    @Override // oc.o
    public List<oc.n> getUpperBounds() {
        T b10 = this.f20775d.b(this, f20773x[0]);
        hc.t.d(b10, "<get-upperBounds>(...)");
        return (List) b10;
    }

    public int hashCode() {
        return (this.f20776q.hashCode() * 31) + getName().hashCode();
    }

    public String toString() {
        return r0.Companion.a(this);
    }

    @Override // oc.o
    public oc.q w() {
        int i10 = a.f20777a[getDescriptor().w().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return oc.q.IN;
            }
            if (i10 != 3) {
                throw new tb.p();
            }
            return oc.q.OUT;
        }
        return oc.q.INVARIANT;
    }
}
