package rc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import rc.c;
import rc.d;
import rc.d0;
import sc.a;
import sc.e;
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B\u0019\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b3\u00104B7\b\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010&\u001a\u00020\u0017\u0012\u0006\u00105\u001a\u00020\u0017\u0012\b\u00106\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b3\u00108B+\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010&\u001a\u00020\u0017\u0012\u0006\u00105\u001a\u00020\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b3\u00109J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J.\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u00112\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0013\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001f\u0010,\u001a\u0006\u0012\u0002\b\u00030'8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R!\u0010/\u001a\b\u0012\u0002\b\u0003\u0018\u00010'8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R\u0014\u00102\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006:"}, d2 = {"Lrc/k;", "Lrc/f;", BuildConfig.FLAVOR, "Loc/g;", "Lhc/o;", "Lrc/c;", "Ljava/lang/reflect/Method;", "member", "Lsc/e$h;", "T", "S", "R", "Ljava/lang/reflect/Constructor;", "Lxc/y;", "descriptor", BuildConfig.FLAVOR, "isDefault", "Lsc/e;", "Q", "other", "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", "U", "()Ljava/lang/Object;", "boundReceiver", "Lrc/j;", "container", "Lrc/j;", "C", "()Lrc/j;", "H", "()Z", "isBound", "getName", "()Ljava/lang/String;", "name", "Lsc/d;", "caller$delegate", "Lrc/d0$b;", "w", "()Lsc/d;", "caller", "defaultCaller$delegate", "D", "defaultCaller", "getArity", "()I", "arity", "<init>", "(Lrc/j;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "signature", "descriptorInitialValue", "rawBoundReceiver", "(Lrc/j;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "(Lrc/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class k extends f<Object> implements hc.o<Object>, oc.g<Object>, rc.c {
    static final /* synthetic */ oc.k<Object>[] Z3 = {hc.k0.g(new hc.e0(hc.k0.b(k.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), hc.k0.g(new hc.e0(hc.k0.b(k.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), hc.k0.g(new hc.e0(hc.k0.b(k.class), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
    private final String U3;
    private final Object V3;
    private final d0.a W3;
    private final d0.b X3;
    private final d0.b Y3;

    /* renamed from: y */
    private final j f20700y;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsc/d;", "kotlin.jvm.PlatformType", "b", "()Lsc/d;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.a<sc.d<? extends Member>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            k.this = r1;
        }

        /* renamed from: b */
        public final sc.d<Member> invoke() {
            Object obj;
            sc.d dVar;
            int s10;
            int s11;
            d g10 = g0.f20633a.g(k.this.E());
            if (g10 instanceof d.C0332d) {
                if (k.this.F()) {
                    Class<?> a10 = k.this.C().a();
                    List<oc.j> parameters = k.this.getParameters();
                    s11 = ub.v.s(parameters, 10);
                    ArrayList arrayList = new ArrayList(s11);
                    for (oc.j jVar : parameters) {
                        String name = jVar.getName();
                        hc.t.b(name);
                        arrayList.add(name);
                    }
                    return new sc.a(a10, arrayList, a.EnumC0363a.POSITIONAL_CALL, a.b.KOTLIN, null, 16, null);
                }
                obj = k.this.C().m(((d.C0332d) g10).b());
            } else if (g10 instanceof d.e) {
                d.e eVar = (d.e) g10;
                obj = k.this.C().s(eVar.c(), eVar.b());
            } else if (g10 instanceof d.c) {
                obj = ((d.c) g10).b();
            } else if (!(g10 instanceof d.b)) {
                if (!(g10 instanceof d.a)) {
                    throw new tb.p();
                }
                List<Method> b10 = ((d.a) g10).b();
                Class<?> a11 = k.this.C().a();
                s10 = ub.v.s(b10, 10);
                ArrayList arrayList2 = new ArrayList(s10);
                for (Method method : b10) {
                    arrayList2.add(method.getName());
                }
                return new sc.a(a11, arrayList2, a.EnumC0363a.POSITIONAL_CALL, a.b.JAVA, b10);
            } else {
                obj = ((d.b) g10).b();
            }
            if (obj instanceof Constructor) {
                k kVar = k.this;
                dVar = kVar.Q((Constructor) obj, kVar.E(), false);
            } else if (!(obj instanceof Method)) {
                throw new b0("Could not compute caller for function: " + k.this.E() + " (member = " + obj + ')');
            } else {
                Method method2 = (Method) obj;
                dVar = !Modifier.isStatic(method2.getModifiers()) ? k.this.R(method2) : k.this.E().j().h(j0.j()) != null ? k.this.S(method2) : k.this.T(method2);
            }
            return sc.h.c(dVar, k.this.E(), false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsc/d;", "b", "()Lsc/d;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.a<sc.d<? extends Member>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            k.this = r1;
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.reflect.Member, java.lang.Object] */
        /* renamed from: b */
        public final sc.d<Member> invoke() {
            Object obj;
            sc.d dVar;
            int s10;
            int s11;
            ?? member;
            d g10 = g0.f20633a.g(k.this.E());
            if (g10 instanceof d.e) {
                j C = k.this.C();
                d.e eVar = (d.e) g10;
                String c10 = eVar.c();
                String b10 = eVar.b();
                hc.t.b(k.this.w().getMember());
                obj = C.q(c10, b10, !Modifier.isStatic(member.getModifiers()));
            } else if (g10 instanceof d.C0332d) {
                if (k.this.F()) {
                    Class<?> a10 = k.this.C().a();
                    List<oc.j> parameters = k.this.getParameters();
                    s11 = ub.v.s(parameters, 10);
                    ArrayList arrayList = new ArrayList(s11);
                    for (oc.j jVar : parameters) {
                        String name = jVar.getName();
                        hc.t.b(name);
                        arrayList.add(name);
                    }
                    return new sc.a(a10, arrayList, a.EnumC0363a.CALL_BY_NAME, a.b.KOTLIN, null, 16, null);
                }
                obj = k.this.C().o(((d.C0332d) g10).b());
            } else if (g10 instanceof d.a) {
                List<Method> b11 = ((d.a) g10).b();
                Class<?> a11 = k.this.C().a();
                s10 = ub.v.s(b11, 10);
                ArrayList arrayList2 = new ArrayList(s10);
                for (Method method : b11) {
                    arrayList2.add(method.getName());
                }
                return new sc.a(a11, arrayList2, a.EnumC0363a.CALL_BY_NAME, a.b.JAVA, b11);
            } else {
                obj = null;
            }
            if (obj instanceof Constructor) {
                k kVar = k.this;
                dVar = kVar.Q((Constructor) obj, kVar.E(), true);
            } else if (obj instanceof Method) {
                if (k.this.E().j().h(j0.j()) != null) {
                    xc.m b12 = k.this.E().b();
                    hc.t.c(b12, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (!((xc.e) b12).N()) {
                        dVar = k.this.S((Method) obj);
                    }
                }
                dVar = k.this.T((Method) obj);
            } else {
                dVar = null;
            }
            if (dVar != null) {
                return sc.h.b(dVar, k.this.E(), true);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxc/y;", "kotlin.jvm.PlatformType", "b", "()Lxc/y;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends hc.v implements gc.a<xc.y> {

        /* renamed from: d */
        final /* synthetic */ String f20704d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            k.this = r1;
            this.f20704d = str;
        }

        /* renamed from: b */
        public final xc.y invoke() {
            return k.this.C().r(this.f20704d, k.this.U3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(j jVar, String str, String str2, Object obj) {
        this(jVar, str, str2, null, obj);
        hc.t.e(jVar, "container");
        hc.t.e(str, "name");
        hc.t.e(str2, "signature");
    }

    private k(j jVar, String str, String str2, xc.y yVar, Object obj) {
        this.f20700y = jVar;
        this.U3 = str2;
        this.V3 = obj;
        this.W3 = d0.d(yVar, new c(str));
        this.X3 = d0.b(new a());
        this.Y3 = d0.b(new b());
    }

    /* synthetic */ k(j jVar, String str, String str2, xc.y yVar, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, str, str2, yVar, (i10 & 16) != 0 ? hc.h.V3 : obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(rc.j r10, xc.y r11) {
        /*
            r9 = this;
            java.lang.String r0 = "container"
            hc.t.e(r10, r0)
            java.lang.String r0 = "descriptor"
            hc.t.e(r11, r0)
            wd.f r0 = r11.getName()
            java.lang.String r3 = r0.b()
            java.lang.String r0 = "descriptor.name.asString()"
            hc.t.d(r3, r0)
            rc.g0 r0 = rc.g0.f20633a
            rc.d r0 = r0.g(r11)
            java.lang.String r4 = r0.a()
            r6 = 0
            r7 = 16
            r8 = 0
            r1 = r9
            r2 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.k.<init>(rc.j, xc.y):void");
    }

    public final sc.e<Constructor<?>> Q(Constructor<?> constructor, xc.y yVar, boolean z10) {
        return (z10 || !fe.b.f(yVar)) ? H() ? new e.c(constructor, U()) : new e.C0365e(constructor) : H() ? new e.a(constructor, U()) : new e.b(constructor);
    }

    public final e.h R(Method method) {
        return H() ? new e.h.a(method, U()) : new e.h.d(method);
    }

    public final e.h S(Method method) {
        return H() ? new e.h.b(method) : new e.h.C0368e(method);
    }

    public final e.h T(Method method) {
        return H() ? new e.h.c(method, U()) : new e.h.f(method);
    }

    private final Object U() {
        return sc.h.a(this.V3, E());
    }

    @Override // rc.f
    public j C() {
        return this.f20700y;
    }

    @Override // rc.f
    public sc.d<?> D() {
        return (sc.d) this.Y3.b(this, Z3[2]);
    }

    @Override // rc.f
    public boolean H() {
        return !hc.t.a(this.V3, hc.h.V3);
    }

    @Override // gc.r
    public Object M(Object obj, Object obj2, Object obj3, Object obj4) {
        return c.a.e(this, obj, obj2, obj3, obj4);
    }

    /* renamed from: X */
    public xc.y E() {
        T b10 = this.W3.b(this, Z3[0]);
        hc.t.d(b10, "<get-descriptor>(...)");
        return (xc.y) b10;
    }

    public boolean equals(Object obj) {
        k c10 = j0.c(obj);
        return c10 != null && hc.t.a(C(), c10.C()) && hc.t.a(getName(), c10.getName()) && hc.t.a(this.U3, c10.U3) && hc.t.a(this.V3, c10.V3);
    }

    @Override // hc.o
    public int getArity() {
        return sc.f.a(w());
    }

    @Override // oc.c
    public String getName() {
        String b10 = E().getName().b();
        hc.t.d(b10, "descriptor.name.asString()");
        return b10;
    }

    public int hashCode() {
        return (((C().hashCode() * 31) + getName().hashCode()) * 31) + this.U3.hashCode();
    }

    @Override // gc.a
    public Object invoke() {
        return c.a.a(this);
    }

    @Override // gc.l
    public Object invoke(Object obj) {
        return c.a.b(this, obj);
    }

    @Override // gc.q
    public Object s(Object obj, Object obj2, Object obj3) {
        return c.a.d(this, obj, obj2, obj3);
    }

    public String toString() {
        return f0.f20627a.d(E());
    }

    @Override // gc.p
    public Object u(Object obj, Object obj2) {
        return c.a.c(this, obj, obj2);
    }

    @Override // rc.f
    public sc.d<?> w() {
        T b10 = this.X3.b(this, Z3[1]);
        hc.t.d(b10, "<get-caller>(...)");
        return (sc.d) b10;
    }
}
