package rc;

import java.lang.reflect.Method;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljava/lang/reflect/Method;", BuildConfig.FLAVOR, "b", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "signature", "kotlin-reflection"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class h0 {

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Class;", "kotlin.jvm.PlatformType", "it", BuildConfig.FLAVOR, "b", "(Ljava/lang/Class;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<Class<?>, CharSequence> {

        /* renamed from: c */
        public static final a f20685c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final CharSequence invoke(Class<?> cls) {
            hc.t.d(cls, "it");
            return dd.d.b(cls);
        }
    }

    public static final String b(Method method) {
        String P;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        hc.t.d(parameterTypes, "parameterTypes");
        P = ub.m.P(parameterTypes, BuildConfig.FLAVOR, "(", ")", 0, null, a.f20685c, 24, null);
        sb2.append(P);
        Class<?> returnType = method.getReturnType();
        hc.t.d(returnType, "returnType");
        sb2.append(dd.d.b(returnType));
        return sb2.toString();
    }
}
