package g;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    private final Method f4519a;

    /* renamed from: b */
    private final List<?> f4520b;

    public l(Method method, List<?> list) {
        this.f4519a = method;
        this.f4520b = Collections.unmodifiableList(list);
    }

    public Method a() {
        return this.f4519a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f4519a.getDeclaringClass().getName(), this.f4519a.getName(), this.f4520b);
    }
}
