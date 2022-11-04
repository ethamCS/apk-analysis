package rc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import vd.d;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0003\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lrc/d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", "<init>", "()V", "b", "c", "d", "e", "Lrc/d$a;", "Lrc/d$b;", "Lrc/d$c;", "Lrc/d$d;", "Lrc/d$e;", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class d {

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R%\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lrc/d$a;", "Lrc/d;", BuildConfig.FLAVOR, "a", BuildConfig.FLAVOR, "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "methods", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends d {

        /* renamed from: a */
        private final Class<?> f20588a;

        /* renamed from: b */
        private final List<Method> f20589b;

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "it", BuildConfig.FLAVOR, "b", "(Ljava/lang/reflect/Method;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: rc.d$a$a */
        /* loaded from: classes.dex */
        static final class C0331a extends hc.v implements gc.l<Method, CharSequence> {

            /* renamed from: c */
            public static final C0331a f20590c = new C0331a();

            C0331a() {
                super(1);
            }

            /* renamed from: b */
            public final CharSequence invoke(Method method) {
                Class<?> returnType = method.getReturnType();
                hc.t.d(returnType, "it.returnType");
                return dd.d.b(returnType);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", BuildConfig.FLAVOR, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class b<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                int a10;
                a10 = wb.b.a(((Method) t10).getName(), ((Method) t11).getName());
                return a10;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<?> cls) {
            super(null);
            List<Method> Y;
            hc.t.e(cls, "jClass");
            this.f20588a = cls;
            Method[] declaredMethods = cls.getDeclaredMethods();
            hc.t.d(declaredMethods, "jClass.declaredMethods");
            Y = ub.m.Y(declaredMethods, new b());
            this.f20589b = Y;
        }

        @Override // rc.d
        public String a() {
            String e02;
            e02 = ub.c0.e0(this.f20589b, BuildConfig.FLAVOR, "<init>(", ")V", 0, null, C0331a.f20590c, 24, null);
            return e02;
        }

        public final List<Method> b() {
            return this.f20589b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lrc/d$b;", "Lrc/d;", BuildConfig.FLAVOR, "a", "Ljava/lang/reflect/Constructor;", "constructor", "Ljava/lang/reflect/Constructor;", "b", "()Ljava/lang/reflect/Constructor;", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends d {

        /* renamed from: a */
        private final Constructor<?> f20591a;

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Class;", "kotlin.jvm.PlatformType", "it", BuildConfig.FLAVOR, "b", "(Ljava/lang/Class;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        static final class a extends hc.v implements gc.l<Class<?>, CharSequence> {

            /* renamed from: c */
            public static final a f20592c = new a();

            a() {
                super(1);
            }

            /* renamed from: b */
            public final CharSequence invoke(Class<?> cls) {
                hc.t.d(cls, "it");
                return dd.d.b(cls);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor<?> constructor) {
            super(null);
            hc.t.e(constructor, "constructor");
            this.f20591a = constructor;
        }

        @Override // rc.d
        public String a() {
            String P;
            Class<?>[] parameterTypes = this.f20591a.getParameterTypes();
            hc.t.d(parameterTypes, "constructor.parameterTypes");
            P = ub.m.P(parameterTypes, BuildConfig.FLAVOR, "<init>(", ")V", 0, null, a.f20592c, 24, null);
            return P;
        }

        public final Constructor<?> b() {
            return this.f20591a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lrc/d$c;", "Lrc/d;", BuildConfig.FLAVOR, "a", "Ljava/lang/reflect/Method;", "method", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends d {

        /* renamed from: a */
        private final Method f20593a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Method method) {
            super(null);
            hc.t.e(method, "method");
            this.f20593a = method;
        }

        @Override // rc.d
        public String a() {
            String b10;
            b10 = h0.b(this.f20593a);
            return b10;
        }

        public final Method b() {
            return this.f20593a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0011\u0010\u0006\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lrc/d$d;", "Lrc/d;", BuildConfig.FLAVOR, "a", "b", "()Ljava/lang/String;", "constructorDesc", "Lvd/d$b;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* renamed from: rc.d$d */
    /* loaded from: classes.dex */
    public static final class C0332d extends d {

        /* renamed from: a */
        private final d.b f20594a;

        /* renamed from: b */
        private final String f20595b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0332d(d.b bVar) {
            super(null);
            hc.t.e(bVar, "signature");
            this.f20594a = bVar;
            this.f20595b = bVar.a();
        }

        @Override // rc.d
        public String a() {
            return this.f20595b;
        }

        public final String b() {
            return this.f20594a.b();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0011\u0010\u0006\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\r"}, d2 = {"Lrc/d$e;", "Lrc/d;", BuildConfig.FLAVOR, "a", "c", "()Ljava/lang/String;", "methodName", "b", "methodDesc", "Lvd/d$b;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends d {

        /* renamed from: a */
        private final d.b f20596a;

        /* renamed from: b */
        private final String f20597b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d.b bVar) {
            super(null);
            hc.t.e(bVar, "signature");
            this.f20596a = bVar;
            this.f20597b = bVar.a();
        }

        @Override // rc.d
        public String a() {
            return this.f20597b;
        }

        public final String b() {
            return this.f20596a.b();
        }

        public final String c() {
            return this.f20596a.c();
        }
    }

    private d() {
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();
}
