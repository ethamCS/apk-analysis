package dd;

import dd.h;
import dd.v;
import hc.k0;
import hc.o0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import nd.d0;
import xc.n1;
/* loaded from: classes.dex */
public final class l extends p implements dd.h, v, nd.g {

    /* renamed from: a */
    private final Class<?> f8504a;

    /* loaded from: classes.dex */
    public /* synthetic */ class a extends hc.p implements gc.l<Member, Boolean> {
        public static final a Y3 = new a();

        a() {
            super(1);
        }

        @Override // hc.h
        public final oc.f e0() {
            return k0.b(Member.class);
        }

        @Override // hc.h
        public final String g0() {
            return "isSynthetic()Z";
        }

        @Override // hc.h, oc.c
        public final String getName() {
            return "isSynthetic";
        }

        /* renamed from: i0 */
        public final Boolean invoke(Member member) {
            hc.t.e(member, "p0");
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b extends hc.p implements gc.l<Constructor<?>, o> {
        public static final b Y3 = new b();

        b() {
            super(1);
        }

        @Override // hc.h
        public final oc.f e0() {
            return k0.b(o.class);
        }

        @Override // hc.h
        public final String g0() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }

        @Override // hc.h, oc.c
        public final String getName() {
            return "<init>";
        }

        /* renamed from: i0 */
        public final o invoke(Constructor<?> constructor) {
            hc.t.e(constructor, "p0");
            return new o(constructor);
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class c extends hc.p implements gc.l<Member, Boolean> {
        public static final c Y3 = new c();

        c() {
            super(1);
        }

        @Override // hc.h
        public final oc.f e0() {
            return k0.b(Member.class);
        }

        @Override // hc.h
        public final String g0() {
            return "isSynthetic()Z";
        }

        @Override // hc.h, oc.c
        public final String getName() {
            return "isSynthetic";
        }

        /* renamed from: i0 */
        public final Boolean invoke(Member member) {
            hc.t.e(member, "p0");
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class d extends hc.p implements gc.l<Field, r> {
        public static final d Y3 = new d();

        d() {
            super(1);
        }

        @Override // hc.h
        public final oc.f e0() {
            return k0.b(r.class);
        }

        @Override // hc.h
        public final String g0() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }

        @Override // hc.h, oc.c
        public final String getName() {
            return "<init>";
        }

        /* renamed from: i0 */
        public final r invoke(Field field) {
            hc.t.e(field, "p0");
            return new r(field);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends hc.v implements gc.l<Class<?>, Boolean> {

        /* renamed from: c */
        public static final e f8505c = new e();

        e() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            hc.t.d(simpleName, "it.simpleName");
            return Boolean.valueOf(simpleName.length() == 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends hc.v implements gc.l<Class<?>, wd.f> {

        /* renamed from: c */
        public static final f f8506c = new f();

        f() {
            super(1);
        }

        /* renamed from: b */
        public final wd.f invoke(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            if (!wd.f.m(simpleName)) {
                simpleName = null;
            }
            if (simpleName != null) {
                return wd.f.j(simpleName);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends hc.v implements gc.l<Method, Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g() {
            super(1);
            l.this = r1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
            if (r0.g0(r5) == false) goto L9;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(java.lang.reflect.Method r5) {
            /*
                r4 = this;
                boolean r0 = r5.isSynthetic()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto La
            L8:
                r1 = r2
                goto L1f
            La:
                dd.l r0 = dd.l.this
                boolean r0 = r0.s()
                if (r0 == 0) goto L1f
                dd.l r0 = dd.l.this
                java.lang.String r3 = "method"
                hc.t.d(r5, r3)
                boolean r5 = dd.l.X(r0, r5)
                if (r5 != 0) goto L8
            L1f:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: dd.l.g.invoke(java.lang.reflect.Method):java.lang.Boolean");
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class h extends hc.p implements gc.l<Method, u> {
        public static final h Y3 = new h();

        h() {
            super(1);
        }

        @Override // hc.h
        public final oc.f e0() {
            return k0.b(u.class);
        }

        @Override // hc.h
        public final String g0() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }

        @Override // hc.h, oc.c
        public final String getName() {
            return "<init>";
        }

        /* renamed from: i0 */
        public final u invoke(Method method) {
            hc.t.e(method, "p0");
            return new u(method);
        }
    }

    public l(Class<?> cls) {
        hc.t.e(cls, "klass");
        this.f8504a = cls;
    }

    public final boolean g0(Method method) {
        String name = method.getName();
        if (hc.t.a(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            hc.t.d(parameterTypes, "method.parameterTypes");
            if (parameterTypes.length == 0) {
                return true;
            }
        } else if (hc.t.a(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // nd.s
    public boolean B() {
        return v.a.c(this);
    }

    @Override // nd.g
    public boolean E() {
        return this.f8504a.isAnnotation();
    }

    @Override // nd.g
    public boolean H() {
        return this.f8504a.isInterface();
    }

    @Override // nd.s
    public boolean I() {
        return v.a.b(this);
    }

    @Override // nd.g
    public d0 J() {
        return null;
    }

    @Override // nd.g
    public boolean L() {
        Boolean e10 = dd.b.f8472a.e(this.f8504a);
        if (e10 != null) {
            return e10.booleanValue();
        }
        return false;
    }

    @Override // nd.g
    public boolean P() {
        return false;
    }

    @Override // nd.g
    public Collection<nd.j> Q() {
        List h10;
        Class<?>[] c10 = dd.b.f8472a.c(this.f8504a);
        if (c10 == null) {
            h10 = ub.u.h();
            return h10;
        }
        ArrayList arrayList = new ArrayList(c10.length);
        for (Class<?> cls : c10) {
            arrayList.add(new n(cls));
        }
        return arrayList;
    }

    /* renamed from: Y */
    public dd.e h(wd.c cVar) {
        return h.a.a(this, cVar);
    }

    /* renamed from: Z */
    public List<dd.e> j() {
        return h.a.b(this);
    }

    /* renamed from: a0 */
    public List<o> k() {
        af.h t10;
        af.h r10;
        af.h z10;
        List<o> F;
        Constructor<?>[] declaredConstructors = this.f8504a.getDeclaredConstructors();
        hc.t.d(declaredConstructors, "klass.declaredConstructors");
        t10 = ub.m.t(declaredConstructors);
        r10 = af.p.r(t10, a.Y3);
        z10 = af.p.z(r10, b.Y3);
        F = af.p.F(z10);
        return F;
    }

    /* renamed from: b0 */
    public Class<?> U() {
        return this.f8504a;
    }

    /* renamed from: c0 */
    public List<r> x() {
        af.h t10;
        af.h r10;
        af.h z10;
        List<r> F;
        Field[] declaredFields = this.f8504a.getDeclaredFields();
        hc.t.d(declaredFields, "klass.declaredFields");
        t10 = ub.m.t(declaredFields);
        r10 = af.p.r(t10, c.Y3);
        z10 = af.p.z(r10, d.Y3);
        F = af.p.F(z10);
        return F;
    }

    @Override // nd.g
    public wd.c d() {
        wd.c b10 = dd.d.a(this.f8504a).b();
        hc.t.d(b10, "klass.classId.asSingleFqName()");
        return b10;
    }

    /* renamed from: d0 */
    public List<wd.f> M() {
        af.h t10;
        af.h r10;
        af.h A;
        List<wd.f> F;
        Class<?>[] declaredClasses = this.f8504a.getDeclaredClasses();
        hc.t.d(declaredClasses, "klass.declaredClasses");
        t10 = ub.m.t(declaredClasses);
        r10 = af.p.r(t10, e.f8505c);
        A = af.p.A(r10, f.f8506c);
        F = af.p.F(A);
        return F;
    }

    /* renamed from: e0 */
    public List<u> O() {
        af.h t10;
        af.h q10;
        af.h z10;
        List<u> F;
        Method[] declaredMethods = this.f8504a.getDeclaredMethods();
        hc.t.d(declaredMethods, "klass.declaredMethods");
        t10 = ub.m.t(declaredMethods);
        q10 = af.p.q(t10, new g());
        z10 = af.p.z(q10, h.Y3);
        F = af.p.F(z10);
        return F;
    }

    public boolean equals(Object obj) {
        return (obj instanceof l) && hc.t.a(this.f8504a, ((l) obj).f8504a);
    }

    /* renamed from: f0 */
    public l q() {
        Class<?> declaringClass = this.f8504a.getDeclaringClass();
        if (declaringClass != null) {
            return new l(declaringClass);
        }
        return null;
    }

    @Override // nd.s
    public n1 g() {
        return v.a.a(this);
    }

    @Override // nd.t
    public wd.f getName() {
        wd.f j10 = wd.f.j(this.f8504a.getSimpleName());
        hc.t.d(j10, "identifier(klass.simpleName)");
        return j10;
    }

    public int hashCode() {
        return this.f8504a.hashCode();
    }

    @Override // nd.g
    public Collection<nd.j> l() {
        List<Type> k10;
        int s10;
        List h10;
        Object obj = Object.class;
        if (hc.t.a(this.f8504a, obj)) {
            h10 = ub.u.h();
            return h10;
        }
        o0 o0Var = new o0(2);
        Object genericSuperclass = this.f8504a.getGenericSuperclass();
        if (genericSuperclass != null) {
            obj = genericSuperclass;
        }
        o0Var.a(obj);
        Type[] genericInterfaces = this.f8504a.getGenericInterfaces();
        hc.t.d(genericInterfaces, "klass.genericInterfaces");
        o0Var.b(genericInterfaces);
        k10 = ub.u.k(o0Var.d(new Type[o0Var.c()]));
        s10 = ub.v.s(k10, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (Type type : k10) {
            arrayList.add(new n(type));
        }
        return arrayList;
    }

    @Override // nd.s
    public boolean m() {
        return v.a.d(this);
    }

    @Override // nd.z
    public List<a0> p() {
        TypeVariable<Class<?>>[] typeParameters = this.f8504a.getTypeParameters();
        hc.t.d(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new a0(typeVariable));
        }
        return arrayList;
    }

    @Override // nd.g
    public boolean s() {
        return this.f8504a.isEnum();
    }

    public String toString() {
        return l.class.getName() + ": " + this.f8504a;
    }

    @Override // nd.g
    public Collection<nd.w> u() {
        Object[] d10 = dd.b.f8472a.d(this.f8504a);
        if (d10 == null) {
            d10 = new Object[0];
        }
        ArrayList arrayList = new ArrayList(d10.length);
        for (Object obj : d10) {
            arrayList.add(new y(obj));
        }
        return arrayList;
    }

    @Override // nd.d
    public boolean v() {
        return h.a.c(this);
    }

    @Override // dd.v
    public int y() {
        return this.f8504a.getModifiers();
    }

    @Override // nd.g
    public boolean z() {
        Boolean f10 = dd.b.f8472a.f(this.f8504a);
        if (f10 != null) {
            return f10.booleanValue();
        }
        return false;
    }
}
