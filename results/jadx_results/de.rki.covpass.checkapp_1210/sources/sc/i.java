package sc;

import hc.t;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import sc.d;
import sc.e;
import ub.l;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\r\u0007B\u001f\b\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0002\u0019\u001a¨\u0006\u001b"}, d2 = {"Lsc/i;", "Lsc/d;", "Ljava/lang/reflect/Method;", BuildConfig.FLAVOR, "instance", BuildConfig.FLAVOR, "args", "b", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", BuildConfig.FLAVOR, "Ljava/lang/reflect/Type;", "parameterTypes", "Ljava/util/List;", "a", "()Ljava/util/List;", "d", "()Ljava/lang/reflect/Method;", "member", "returnType", "Ljava/lang/reflect/Type;", "e", "()Ljava/lang/reflect/Type;", "unboxMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/util/List;)V", "Lsc/i$a;", "Lsc/i$b;", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class i implements d<Method> {

    /* renamed from: a */
    private final Method f21651a;

    /* renamed from: b */
    private final List<Type> f21652b;

    /* renamed from: c */
    private final Type f21653c;

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lsc/i$a;", "Lsc/i;", "Lsc/c;", BuildConfig.FLAVOR, "args", BuildConfig.FLAVOR, "g", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "unboxMethod", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends i implements c {

        /* renamed from: d */
        private final Object f21654d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(java.lang.reflect.Method r3, java.lang.Object r4) {
            /*
                r2 = this;
                java.lang.String r0 = "unboxMethod"
                hc.t.e(r3, r0)
                java.util.List r0 = ub.s.h()
                r1 = 0
                r2.<init>(r3, r0, r1)
                r2.f21654d = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sc.i.a.<init>(java.lang.reflect.Method, java.lang.Object):void");
        }

        @Override // sc.d
        public Object g(Object[] objArr) {
            t.e(objArr, "args");
            c(objArr);
            return b(this.f21654d, objArr);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lsc/i$b;", "Lsc/i;", BuildConfig.FLAVOR, "args", BuildConfig.FLAVOR, "g", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "unboxMethod", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends i {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(java.lang.reflect.Method r3) {
            /*
                r2 = this;
                java.lang.String r0 = "unboxMethod"
                hc.t.e(r3, r0)
                java.lang.Class r0 = r3.getDeclaringClass()
                java.util.List r0 = ub.s.d(r0)
                r1 = 0
                r2.<init>(r3, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sc.i.b.<init>(java.lang.reflect.Method):void");
        }

        @Override // sc.d
        public Object g(Object[] objArr) {
            Object[] objArr2;
            t.e(objArr, "args");
            c(objArr);
            Object obj = objArr[0];
            e.d dVar = e.Companion;
            if (objArr.length <= 1) {
                objArr2 = new Object[0];
            } else {
                objArr2 = l.j(objArr, 1, objArr.length);
                t.c(objArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.jvm.internal.calls.CallerImpl.Companion.dropFirst>");
            }
            return b(obj, objArr2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private i(Method method, List<? extends Type> list) {
        this.f21651a = method;
        this.f21652b = list;
        Class<?> returnType = method.getReturnType();
        t.d(returnType, "unboxMethod.returnType");
        this.f21653c = returnType;
    }

    public /* synthetic */ i(Method method, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(method, list);
    }

    @Override // sc.d
    public final List<Type> a() {
        return this.f21652b;
    }

    protected final Object b(Object obj, Object[] objArr) {
        t.e(objArr, "args");
        return this.f21651a.invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    public void c(Object[] objArr) {
        d.a.a(this, objArr);
    }

    /* renamed from: d */
    public final Method getMember() {
        return null;
    }

    @Override // sc.d
    public final Type e() {
        return this.f21653c;
    }
}
