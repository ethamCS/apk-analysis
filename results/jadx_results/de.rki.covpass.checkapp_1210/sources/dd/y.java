package dd;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class y extends t implements nd.w {

    /* renamed from: a */
    private final Object f8520a;

    public y(Object obj) {
        hc.t.e(obj, "recordComponent");
        this.f8520a = obj;
    }

    @Override // dd.t
    public Member a0() {
        Method c10 = a.f8467a.c(this.f8520a);
        if (c10 != null) {
            return c10;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // nd.w
    public boolean b() {
        return false;
    }

    @Override // nd.w
    public nd.x getType() {
        Class<?> d10 = a.f8467a.d(this.f8520a);
        if (d10 != null) {
            return new n(d10);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
