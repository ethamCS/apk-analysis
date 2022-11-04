package sc;

import hc.t;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import rc.j0;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0011B%\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lsc/g;", "Ljava/lang/reflect/Member;", "M", "Lsc/d;", BuildConfig.FLAVOR, "args", BuildConfig.FLAVOR, "g", "([Ljava/lang/Object;)Ljava/lang/Object;", "getMember", "()Ljava/lang/reflect/Member;", "member", "Ljava/lang/reflect/Type;", "e", "()Ljava/lang/reflect/Type;", "returnType", BuildConfig.FLAVOR, "a", "()Ljava/util/List;", "parameterTypes", "Lxc/b;", "descriptor", "caller", BuildConfig.FLAVOR, "isDefault", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lsc/d;Z)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class g<M extends Member> implements d<M> {

    /* renamed from: a */
    private final d<M> f21645a;

    /* renamed from: b */
    private final boolean f21646b;

    /* renamed from: c */
    private final a f21647c;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0086\u0002¨\u0006\u000e"}, d2 = {"Lsc/g$a;", BuildConfig.FLAVOR, "Lnc/g;", "a", BuildConfig.FLAVOR, "Ljava/lang/reflect/Method;", "b", "()[Ljava/lang/reflect/Method;", "c", "argumentRange", "unbox", "box", "<init>", "(Lnc/g;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final nc.g f21648a;

        /* renamed from: b */
        private final Method[] f21649b;

        /* renamed from: c */
        private final Method f21650c;

        public a(nc.g gVar, Method[] methodArr, Method method) {
            t.e(gVar, "argumentRange");
            t.e(methodArr, "unbox");
            this.f21648a = gVar;
            this.f21649b = methodArr;
            this.f21650c = method;
        }

        public final nc.g a() {
            return this.f21648a;
        }

        public final Method[] b() {
            return this.f21649b;
        }

        public final Method c() {
            return this.f21650c;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        if ((r12 instanceof sc.c) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ca, code lost:
        if (ae.f.b(r2) != false) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e0 A[LOOP:0: B:49:0x00da->B:51:0x00e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(xc.b r11, sc.d<? extends M> r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.g.<init>(xc.b, sc.d, boolean):void");
    }

    @Override // sc.d
    public List<Type> a() {
        return this.f21645a.a();
    }

    @Override // sc.d
    public Type e() {
        return this.f21645a.e();
    }

    @Override // sc.d
    public Object g(Object[] objArr) {
        Object invoke;
        t.e(objArr, "args");
        a aVar = this.f21647c;
        nc.g a10 = aVar.a();
        Method[] b10 = aVar.b();
        Method c10 = aVar.c();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        t.d(copyOf, "copyOf(this, size)");
        t.c(copyOf, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        int a11 = a10.a();
        int b11 = a10.b();
        if (a11 <= b11) {
            while (true) {
                Method method = b10[a11];
                Object obj = objArr[a11];
                if (method != null) {
                    if (obj != null) {
                        obj = method.invoke(obj, new Object[0]);
                    } else {
                        Class<?> returnType = method.getReturnType();
                        t.d(returnType, "method.returnType");
                        obj = j0.g(returnType);
                    }
                }
                copyOf[a11] = obj;
                if (a11 == b11) {
                    break;
                }
                a11++;
            }
        }
        Object g10 = this.f21645a.g(copyOf);
        return (c10 == null || (invoke = c10.invoke(null, g10)) == null) ? g10 : invoke;
    }

    @Override // sc.d
    public M getMember() {
        return this.f21645a.getMember();
    }
}
