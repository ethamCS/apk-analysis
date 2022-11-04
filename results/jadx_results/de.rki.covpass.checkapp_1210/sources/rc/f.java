package rc;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import oc.j;
import org.conscrypt.BuildConfig;
import rc.d0;
import xc.f1;
import xc.j1;
import xc.r0;
import xc.x0;
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b5\u00106J%\u0010\b\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J'\u0010\u0010\u001a\u00028\u00002\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u000f\"\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\tJ3\u0010\u0015\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0014\u0010.\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020!8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b/\u0010#R\u0014\u00104\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lrc/f;", "R", "Loc/c;", "Lrc/a0;", BuildConfig.FLAVOR, "Loc/j;", BuildConfig.FLAVOR, "args", "l", "(Ljava/util/Map;)Ljava/lang/Object;", "Loc/n;", "type", "o", "Ljava/lang/reflect/Type;", "q", BuildConfig.FLAVOR, "g", "([Ljava/lang/Object;)Ljava/lang/Object;", "p", "Lxb/d;", "continuationArgument", "m", "(Ljava/util/Map;Lxb/d;)Ljava/lang/Object;", "Lsc/d;", "w", "()Lsc/d;", "caller", "D", "defaultCaller", "Lrc/j;", "C", "()Lrc/j;", "container", BuildConfig.FLAVOR, "H", "()Z", "isBound", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "j", "()Ljava/util/List;", "annotations", "getParameters", "parameters", "e", "()Loc/n;", "returnType", "F", "isAnnotationConstructor", "Lxc/b;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class f<R> implements oc.c<R>, a0 {

    /* renamed from: c */
    private final d0.a<List<Annotation>> f20614c;

    /* renamed from: d */
    private final d0.a<ArrayList<oc.j>> f20615d;

    /* renamed from: q */
    private final d0.a<y> f20616q;

    /* renamed from: x */
    private final d0.a<List<z>> f20617x;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "kotlin.jvm.PlatformType", "R", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.a<List<? extends Annotation>> {

        /* renamed from: c */
        final /* synthetic */ f<R> f20618c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(f<? extends R> fVar) {
            super(0);
            this.f20618c = fVar;
        }

        @Override // gc.a
        public final List<? extends Annotation> invoke() {
            return j0.e(this.f20618c.E());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "Ljava/util/ArrayList;", "Loc/j;", "kotlin.jvm.PlatformType", "b", "()Ljava/util/ArrayList;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.a<ArrayList<oc.j>> {

        /* renamed from: c */
        final /* synthetic */ f<R> f20619c;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lxc/r0;", "b", "()Lxc/r0;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class a extends hc.v implements gc.a<r0> {

            /* renamed from: c */
            final /* synthetic */ x0 f20620c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x0 x0Var) {
                super(0);
                this.f20620c = x0Var;
            }

            /* renamed from: b */
            public final r0 invoke() {
                return this.f20620c;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lxc/r0;", "b", "()Lxc/r0;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: rc.f$b$b */
        /* loaded from: classes.dex */
        public static final class C0333b extends hc.v implements gc.a<r0> {

            /* renamed from: c */
            final /* synthetic */ x0 f20621c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0333b(x0 x0Var) {
                super(0);
                this.f20621c = x0Var;
            }

            /* renamed from: b */
            public final r0 invoke() {
                return this.f20621c;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lxc/r0;", "b", "()Lxc/r0;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class c extends hc.v implements gc.a<r0> {

            /* renamed from: c */
            final /* synthetic */ xc.b f20622c;

            /* renamed from: d */
            final /* synthetic */ int f20623d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(xc.b bVar, int i10) {
                super(0);
                this.f20622c = bVar;
                this.f20623d = i10;
            }

            /* renamed from: b */
            public final r0 invoke() {
                j1 j1Var = this.f20622c.o().get(this.f20623d);
                hc.t.d(j1Var, "descriptor.valueParameters[i]");
                return j1Var;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", BuildConfig.FLAVOR, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class d<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                int a10;
                a10 = wb.b.a(((oc.j) t10).getName(), ((oc.j) t11).getName());
                return a10;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(f<? extends R> fVar) {
            super(0);
            this.f20619c = fVar;
        }

        /* renamed from: b */
        public final ArrayList<oc.j> invoke() {
            int i10;
            xc.b E = this.f20619c.E();
            ArrayList<oc.j> arrayList = new ArrayList<>();
            int i11 = 0;
            if (!this.f20619c.H()) {
                x0 i12 = j0.i(E);
                if (i12 != null) {
                    arrayList.add(new q(this.f20619c, 0, j.a.INSTANCE, new a(i12)));
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                x0 U = E.U();
                if (U != null) {
                    arrayList.add(new q(this.f20619c, i10, j.a.EXTENSION_RECEIVER, new C0333b(U)));
                    i10++;
                }
            } else {
                i10 = 0;
            }
            int size = E.o().size();
            while (i11 < size) {
                arrayList.add(new q(this.f20619c, i10, j.a.VALUE, new c(E, i11)));
                i11++;
                i10++;
            }
            if (this.f20619c.F() && (E instanceof id.a) && arrayList.size() > 1) {
                ub.y.w(arrayList, new d());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lrc/y;", "kotlin.jvm.PlatformType", "b", "()Lrc/y;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends hc.v implements gc.a<y> {

        /* renamed from: c */
        final /* synthetic */ f<R> f20624c;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Ljava/lang/reflect/Type;", "b", "()Ljava/lang/reflect/Type;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class a extends hc.v implements gc.a<Type> {

            /* renamed from: c */
            final /* synthetic */ f<R> f20625c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(f<? extends R> fVar) {
                super(0);
                this.f20625c = fVar;
            }

            /* renamed from: b */
            public final Type invoke() {
                Type q10 = this.f20625c.q();
                return q10 == null ? this.f20625c.w().e() : q10;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(f<? extends R> fVar) {
            super(0);
            this.f20624c = fVar;
        }

        /* renamed from: b */
        public final y invoke() {
            oe.e0 e10 = this.f20624c.E().e();
            hc.t.b(e10);
            return new y(e10, new a(this.f20624c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", BuildConfig.FLAVOR, "Lrc/z;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends hc.v implements gc.a<List<? extends z>> {

        /* renamed from: c */
        final /* synthetic */ f<R> f20626c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(f<? extends R> fVar) {
            super(0);
            this.f20626c = fVar;
        }

        @Override // gc.a
        public final List<? extends z> invoke() {
            int s10;
            List<f1> p10 = this.f20626c.E().p();
            hc.t.d(p10, "descriptor.typeParameters");
            f<R> fVar = this.f20626c;
            s10 = ub.v.s(p10, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (f1 f1Var : p10) {
                hc.t.d(f1Var, "descriptor");
                arrayList.add(new z(fVar, f1Var));
            }
            return arrayList;
        }
    }

    public f() {
        d0.a<List<Annotation>> c10 = d0.c(new a(this));
        hc.t.d(c10, "lazySoft { descriptor.computeAnnotations() }");
        this.f20614c = c10;
        d0.a<ArrayList<oc.j>> c11 = d0.c(new b(this));
        hc.t.d(c11, "lazySoft {\n        val d…ze()\n        result\n    }");
        this.f20615d = c11;
        d0.a<y> c12 = d0.c(new c(this));
        hc.t.d(c12, "lazySoft {\n        KType…eturnType\n        }\n    }");
        this.f20616q = c12;
        d0.a<List<z>> c13 = d0.c(new d(this));
        hc.t.d(c13, "lazySoft {\n        descr…this, descriptor) }\n    }");
        this.f20617x = c13;
    }

    private final R l(Map<oc.j, ? extends Object> map) {
        int s10;
        Object obj;
        List<oc.j> parameters = getParameters();
        s10 = ub.v.s(parameters, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (oc.j jVar : parameters) {
            if (map.containsKey(jVar)) {
                obj = map.get(jVar);
                if (obj == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + jVar + ')');
                }
            } else if (jVar.N()) {
                obj = null;
            } else if (!jVar.b()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + jVar);
            } else {
                obj = o(jVar.getType());
            }
            arrayList.add(obj);
        }
        sc.d<?> D = D();
        if (D == null) {
            throw new b0("This callable does not support a default call: " + E());
        }
        try {
            Object[] array = arrayList.toArray(new Object[0]);
            hc.t.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (R) D.g(array);
        } catch (IllegalAccessException e10) {
            throw new pc.a(e10);
        }
    }

    private final Object o(oc.n nVar) {
        Class b10 = fc.a.b(qc.b.b(nVar));
        if (b10.isArray()) {
            Object newInstance = Array.newInstance(b10.getComponentType(), 0);
            hc.t.d(newInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return newInstance;
        }
        throw new b0("Cannot instantiate the default empty array of type " + b10.getSimpleName() + ", because it is not an array type");
    }

    public final Type q() {
        Object i02;
        Object U;
        Type[] lowerBounds;
        Object A;
        xc.b E = E();
        xc.y yVar = E instanceof xc.y ? (xc.y) E : null;
        boolean z10 = true;
        if (yVar == null || !yVar.s0()) {
            z10 = false;
        }
        if (z10) {
            i02 = ub.c0.i0(w().a());
            ParameterizedType parameterizedType = i02 instanceof ParameterizedType ? (ParameterizedType) i02 : null;
            if (!hc.t.a(parameterizedType != null ? parameterizedType.getRawType() : null, xb.d.class)) {
                return null;
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            hc.t.d(actualTypeArguments, "continuationType.actualTypeArguments");
            U = ub.m.U(actualTypeArguments);
            WildcardType wildcardType = U instanceof WildcardType ? (WildcardType) U : null;
            if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
                return null;
            }
            A = ub.m.A(lowerBounds);
            return (Type) A;
        }
        return null;
    }

    public abstract j C();

    public abstract sc.d<?> D();

    public abstract xc.b E();

    public final boolean F() {
        return hc.t.a(getName(), "<init>") && C().a().isAnnotation();
    }

    public abstract boolean H();

    @Override // oc.c
    public oc.n e() {
        y invoke = this.f20616q.invoke();
        hc.t.d(invoke, "_returnType()");
        return invoke;
    }

    @Override // oc.c
    public R g(Object... objArr) {
        hc.t.e(objArr, "args");
        try {
            return (R) w().g(objArr);
        } catch (IllegalAccessException e10) {
            throw new pc.a(e10);
        }
    }

    @Override // oc.c
    public List<oc.j> getParameters() {
        ArrayList<oc.j> invoke = this.f20615d.invoke();
        hc.t.d(invoke, "_parameters()");
        return invoke;
    }

    @Override // oc.b
    public List<Annotation> j() {
        List<Annotation> invoke = this.f20614c.invoke();
        hc.t.d(invoke, "_annotations()");
        return invoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0020 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final R m(java.util.Map<oc.j, ? extends java.lang.Object> r12, xb.d<?> r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.f.m(java.util.Map, xb.d):java.lang.Object");
    }

    @Override // oc.c
    public R p(Map<oc.j, ? extends Object> map) {
        hc.t.e(map, "args");
        return F() ? l(map) : m(map, null);
    }

    public abstract sc.d<?> w();
}
