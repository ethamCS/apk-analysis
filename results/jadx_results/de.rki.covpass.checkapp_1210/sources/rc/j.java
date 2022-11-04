package rc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import rc.d0;
import ub.p0;
import xc.u0;
@Metadata(bv = {}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u0001:\u0003=>?B\u0007¢\u0006\u0004\b;\u0010<JG\u0010\u000b\u001a\u0004\u0018\u00010\n*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\r\u001a\u0004\u0018\u00010\n*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010*\u0006\u0012\u0002\b\u00030\u00022\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000fH\u0002J*\u0010\u0017\u001a\u00020\u00162\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\bH\u0002J\u001a\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J$\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002J\u0014\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0004\u001a\u00020\u001eH&J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001f2\u0006\u0010\u0004\u001a\u00020\u001eH&J\u0012\u0010%\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020\u0019H&J\"\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0\u001f2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0004J\u0016\u0010-\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003J\u0016\u0010.\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003J\u0018\u0010/\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003J \u00101\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u00100\u001a\u00020\bJ\u0014\u00102\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0003J\u0014\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0003R\u0018\u00106\u001a\u0006\u0012\u0002\b\u00030\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002070\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006@"}, d2 = {"Lrc/j;", "Lhc/j;", "Ljava/lang/Class;", BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "parameterTypes", "returnType", BuildConfig.FLAVOR, "isStaticDefault", "Ljava/lang/reflect/Method;", "M", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "Q", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", BuildConfig.FLAVOR, "Ljava/lang/reflect/Constructor;", "P", BuildConfig.FLAVOR, "result", "desc", "isConstructor", "Ltb/e0;", "l", "K", BuildConfig.FLAVOR, "begin", "end", "O", "L", "Lwd/f;", BuildConfig.FLAVOR, "Lxc/u0;", "J", "Lxc/y;", "D", "index", "E", "Lhe/h;", "scope", "Lrc/j$c;", "belonginess", "Lrc/f;", "F", "signature", "u", "r", "s", "isMember", "q", "m", "o", "H", "()Ljava/lang/Class;", "methodOwner", "Lxc/l;", "C", "()Ljava/util/Collection;", "constructorDescriptors", "<init>", "()V", "a", "b", "c", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class j implements hc.j {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static final Class<?> f20686c = DefaultConstructorMarker.class;

    /* renamed from: d */
    private static final bf.k f20687d = new bf.k("<v#(\\d+)>");

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\t\u001a\u0012\u0012\u0002\b\u0003 \b*\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lrc/j$a;", BuildConfig.FLAVOR, "Lbf/k;", "LOCAL_PROPERTY_SIGNATURE", "Lbf/k;", "a", "()Lbf/k;", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final bf.k a() {
            return j.f20687d;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrc/j$b;", BuildConfig.FLAVOR, "<init>", "(Lrc/j;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public abstract class b {

        /* renamed from: c */
        static final /* synthetic */ oc.k<Object>[] f20688c = {hc.k0.g(new hc.e0(hc.k0.b(b.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* renamed from: a */
        private final d0.a f20689a;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcd/k;", "kotlin.jvm.PlatformType", "b", "()Lcd/k;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class a extends hc.v implements gc.a<cd.k> {

            /* renamed from: c */
            final /* synthetic */ j f20691c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar) {
                super(0);
                this.f20691c = jVar;
            }

            /* renamed from: b */
            public final cd.k invoke() {
                return c0.a(this.f20691c.a());
            }
        }

        public b() {
            j.this = r2;
            this.f20689a = d0.c(new a(r2));
        }

        public final cd.k a() {
            T b10 = this.f20689a.b(this, f20688c[0]);
            hc.t.d(b10, "<get-moduleData>(...)");
            return (cd.k) b10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0084\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lrc/j$c;", BuildConfig.FLAVOR, "Lxc/b;", "member", BuildConfig.FLAVOR, "g", "<init>", "(Ljava/lang/String;I)V", "DECLARED", "INHERITED", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public enum c {
        DECLARED,
        INHERITED;

        public final boolean g(xc.b bVar) {
            hc.t.e(bVar, "member");
            return bVar.h().b() == (this == DECLARED);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxc/y;", "descriptor", BuildConfig.FLAVOR, "b", "(Lxc/y;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends hc.v implements gc.l<xc.y, CharSequence> {

        /* renamed from: c */
        public static final d f20695c = new d();

        d() {
            super(1);
        }

        /* renamed from: b */
        public final CharSequence invoke(xc.y yVar) {
            hc.t.e(yVar, "descriptor");
            return zd.c.f26623i.q(yVar) + " | " + g0.f20633a.g(yVar).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxc/u0;", "descriptor", BuildConfig.FLAVOR, "b", "(Lxc/u0;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends hc.v implements gc.l<u0, CharSequence> {

        /* renamed from: c */
        public static final e f20696c = new e();

        e() {
            super(1);
        }

        /* renamed from: b */
        public final CharSequence invoke(u0 u0Var) {
            hc.t.e(u0Var, "descriptor");
            return zd.c.f26623i.q(u0Var) + " | " + g0.f20633a.f(u0Var).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxc/u;", "kotlin.jvm.PlatformType", "first", "second", BuildConfig.FLAVOR, "a", "(Lxc/u;Lxc/u;)I"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class f<T> implements Comparator {

        /* renamed from: c */
        public static final f<T> f20697c = new f<>();

        f() {
        }

        /* renamed from: a */
        public final int compare(xc.u uVar, xc.u uVar2) {
            Integer d10 = xc.t.d(uVar, uVar2);
            if (d10 == null) {
                return 0;
            }
            return d10.intValue();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"rc/j$g", "Lrc/a;", "Lxc/l;", "descriptor", "Ltb/e0;", "data", "Lrc/f;", "visitConstructorDescriptor", "(Lorg/jetbrains/kotlin/descriptors/ConstructorDescriptor;Ltb/e0;)Lrc/f;", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class g extends rc.a {
        g(j jVar) {
            super(jVar);
        }

        /* renamed from: r */
        public rc.f<?> b(xc.l lVar, tb.e0 e0Var) {
            hc.t.e(lVar, "descriptor");
            hc.t.e(e0Var, "data");
            throw new IllegalStateException("No constructors should appear here: " + lVar);
        }
    }

    private final List<Class<?>> K(String str) {
        boolean M;
        int i10;
        int Z;
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        while (str.charAt(i11) != ')') {
            int i12 = i11;
            while (str.charAt(i12) == '[') {
                i12++;
            }
            char charAt = str.charAt(i12);
            M = bf.y.M("VZCBSIFJD", charAt, false, 2, null);
            if (M) {
                i10 = i12 + 1;
            } else if (charAt != 'L') {
                throw new b0("Unknown type prefix in the method signature: " + str);
            } else {
                Z = bf.y.Z(str, ';', i11, false, 4, null);
                i10 = Z + 1;
            }
            arrayList.add(O(str, i11, i10));
            i11 = i10;
        }
        return arrayList;
    }

    private final Class<?> L(String str) {
        int Z;
        Z = bf.y.Z(str, ')', 0, false, 6, null);
        return O(str, Z + 1, str.length());
    }

    private final Method M(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z10) {
        Method M;
        if (z10) {
            clsArr[0] = cls;
        }
        Method Q = Q(cls, str, clsArr, cls2);
        if (Q != null) {
            return Q;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && (M = M(superclass, str, clsArr, cls2, z10)) != null) {
            return M;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        hc.t.d(interfaces, "interfaces");
        for (Class<?> cls3 : interfaces) {
            hc.t.d(cls3, "superInterface");
            Method M2 = M(cls3, str, clsArr, cls2, z10);
            if (M2 != null) {
                return M2;
            }
            if (z10) {
                Class<?> a10 = cd.e.a(dd.d.f(cls3), cls3.getName() + "$DefaultImpls");
                if (a10 != null) {
                    clsArr[0] = cls3;
                    Method Q2 = Q(a10, str, clsArr, cls2);
                    if (Q2 != null) {
                        return Q2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private final Class<?> O(String str, int i10, int i11) {
        Class<?> cls;
        String str2;
        String D;
        char charAt = str.charAt(i10);
        if (charAt == 'L') {
            ClassLoader f10 = dd.d.f(a());
            String substring = str.substring(i10 + 1, i11 - 1);
            hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            D = bf.x.D(substring, '/', '.', false, 4, null);
            cls = f10.loadClass(D);
            str2 = "jClass.safeClassLoader.l…d - 1).replace('/', '.'))";
        } else if (charAt == '[') {
            return j0.f(O(str, i10 + 1, i11));
        } else {
            if (charAt != 'V') {
                if (charAt == 'Z') {
                    return Boolean.TYPE;
                }
                if (charAt == 'C') {
                    return Character.TYPE;
                }
                if (charAt == 'B') {
                    return Byte.TYPE;
                }
                if (charAt == 'S') {
                    return Short.TYPE;
                }
                if (charAt == 'I') {
                    return Integer.TYPE;
                }
                if (charAt == 'F') {
                    return Float.TYPE;
                }
                if (charAt == 'J') {
                    return Long.TYPE;
                }
                if (charAt == 'D') {
                    return Double.TYPE;
                }
                throw new b0("Unknown type prefix in the method signature: " + str);
            }
            cls = Void.TYPE;
            str2 = "TYPE";
        }
        hc.t.d(cls, str2);
        return cls;
    }

    private final Constructor<?> P(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Object[] array = list.toArray(new Class[0]);
            hc.t.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Class[] clsArr = (Class[]) array;
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final Method Q(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (hc.t.a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            hc.t.d(declaredMethods, "declaredMethods");
            for (Method method : declaredMethods) {
                if (hc.t.a(method.getName(), str) && hc.t.a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final void l(List<Class<?>> list, String str, boolean z10) {
        Class<?> cls;
        List<Class<?>> K = K(str);
        list.addAll(K);
        int size = ((K.size() + 32) - 1) / 32;
        for (int i10 = 0; i10 < size; i10++) {
            Class<?> cls2 = Integer.TYPE;
            hc.t.d(cls2, "TYPE");
            list.add(cls2);
        }
        if (z10) {
            cls = f20686c;
            list.remove(cls);
            hc.t.d(cls, "DEFAULT_CONSTRUCTOR_MARKER");
        } else {
            cls = Object.class;
        }
        list.add(cls);
    }

    public abstract Collection<xc.l> C();

    public abstract Collection<xc.y> D(wd.f fVar);

    public abstract u0 E(int i10);

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x001e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection<rc.f<?>> F(he.h r8, rc.j.c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            hc.t.e(r8, r0)
            java.lang.String r0 = "belonginess"
            hc.t.e(r9, r0)
            rc.j$g r0 = new rc.j$g
            r0.<init>(r7)
            r1 = 0
            r2 = 3
            java.util.Collection r8 = he.k.a.a(r8, r1, r1, r2, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L1e:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L53
            java.lang.Object r3 = r8.next()
            xc.m r3 = (xc.m) r3
            boolean r4 = r3 instanceof xc.b
            if (r4 == 0) goto L4c
            r4 = r3
            xc.b r4 = (xc.b) r4
            xc.u r5 = r4.g()
            xc.u r6 = xc.t.f25584h
            boolean r5 = hc.t.a(r5, r6)
            if (r5 != 0) goto L4c
            boolean r4 = r9.g(r4)
            if (r4 == 0) goto L4c
            tb.e0 r4 = tb.e0.f22152a
            java.lang.Object r3 = r3.g0(r0, r4)
            rc.f r3 = (rc.f) r3
            goto L4d
        L4c:
            r3 = r1
        L4d:
            if (r3 == 0) goto L1e
            r2.add(r3)
            goto L1e
        L53:
            java.util.List r8 = ub.s.F0(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.j.F(he.h, rc.j$c):java.util.Collection");
    }

    protected Class<?> H() {
        Class<?> g10 = dd.d.g(a());
        return g10 == null ? a() : g10;
    }

    public abstract Collection<u0> J(wd.f fVar);

    public final Constructor<?> m(String str) {
        hc.t.e(str, "desc");
        return P(a(), K(str));
    }

    public final Constructor<?> o(String str) {
        hc.t.e(str, "desc");
        Class<?> a10 = a();
        ArrayList arrayList = new ArrayList();
        l(arrayList, str, true);
        tb.e0 e0Var = tb.e0.f22152a;
        return P(a10, arrayList);
    }

    public final Method q(String str, String str2, boolean z10) {
        hc.t.e(str, "name");
        hc.t.e(str2, "desc");
        if (hc.t.a(str, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z10) {
            arrayList.add(a());
        }
        l(arrayList, str2, false);
        Class<?> H = H();
        String str3 = str + "$default";
        Object[] array = arrayList.toArray(new Class[0]);
        hc.t.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return M(H, str3, (Class[]) array, L(str2), z10);
    }

    public final xc.y r(String str, String str2) {
        Collection<xc.y> collection;
        Object s02;
        String e02;
        hc.t.e(str, "name");
        hc.t.e(str2, "signature");
        if (hc.t.a(str, "<init>")) {
            collection = ub.c0.F0(C());
        } else {
            wd.f j10 = wd.f.j(str);
            hc.t.d(j10, "identifier(name)");
            collection = D(j10);
        }
        Collection<xc.y> collection2 = collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection2) {
            if (hc.t.a(g0.f20633a.g((xc.y) obj).a(), str2)) {
                arrayList.add(obj);
            }
        }
        boolean z10 = true;
        if (arrayList.size() == 1) {
            s02 = ub.c0.s0(arrayList);
            return (xc.y) s02;
        }
        e02 = ub.c0.e0(collection2, "\n", null, null, 0, null, d.f20695c, 30, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Function '");
        sb2.append(str);
        sb2.append("' (JVM signature: ");
        sb2.append(str2);
        sb2.append(") not resolved in ");
        sb2.append(this);
        sb2.append(':');
        if (e02.length() != 0) {
            z10 = false;
        }
        sb2.append(z10 ? " no members found" : '\n' + e02);
        throw new b0(sb2.toString());
    }

    public final Method s(String str, String str2) {
        Method M;
        hc.t.e(str, "name");
        hc.t.e(str2, "desc");
        if (hc.t.a(str, "<init>")) {
            return null;
        }
        Object[] array = K(str2).toArray(new Class[0]);
        hc.t.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Class<?>[] clsArr = (Class[]) array;
        Class<?> L = L(str2);
        Method M2 = M(H(), str, clsArr, L, false);
        if (M2 != null) {
            return M2;
        }
        if (H().isInterface() && (M = M(Object.class, str, clsArr, L, false)) != null) {
            return M;
        }
        return null;
    }

    public final u0 u(String str, String str2) {
        Object s02;
        SortedMap g10;
        Object f02;
        String e02;
        hc.t.e(str, "name");
        hc.t.e(str2, "signature");
        bf.i g11 = f20687d.g(str2);
        boolean z10 = true;
        if (g11 != null) {
            String str3 = g11.b().a().a().get(1);
            u0 E = E(Integer.parseInt(str3));
            if (E != null) {
                return E;
            }
            throw new b0("Local property #" + str3 + " not found in " + a());
        }
        wd.f j10 = wd.f.j(str);
        hc.t.d(j10, "identifier(name)");
        Collection<u0> J = J(j10);
        ArrayList arrayList = new ArrayList();
        for (Object obj : J) {
            if (hc.t.a(g0.f20633a.f((u0) obj).a(), str2)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new b0("Property '" + str + "' (JVM signature: " + str2 + ") not resolved in " + this);
        }
        if (arrayList.size() != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : arrayList) {
                xc.u g12 = ((u0) obj2).g();
                Object obj3 = linkedHashMap.get(g12);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap.put(g12, obj3);
                }
                ((List) obj3).add(obj2);
            }
            g10 = p0.g(linkedHashMap, f.f20697c);
            Collection values = g10.values();
            hc.t.d(values, "properties\n             …\n                }.values");
            f02 = ub.c0.f0(values);
            List list = (List) f02;
            if (list.size() != 1) {
                wd.f j11 = wd.f.j(str);
                hc.t.d(j11, "identifier(name)");
                e02 = ub.c0.e0(J(j11), "\n", null, null, 0, null, e.f20696c, 30, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Property '");
                sb2.append(str);
                sb2.append("' (JVM signature: ");
                sb2.append(str2);
                sb2.append(") not resolved in ");
                sb2.append(this);
                sb2.append(':');
                if (e02.length() != 0) {
                    z10 = false;
                }
                sb2.append(z10 ? " no members found" : '\n' + e02);
                throw new b0(sb2.toString());
            }
            hc.t.d(list, "mostVisibleProperties");
            s02 = ub.c0.V(list);
        } else {
            s02 = ub.c0.s0(arrayList);
        }
        return (u0) s02;
    }
}
