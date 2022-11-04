package dd;

import dd.z;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
/* loaded from: classes.dex */
public final class r extends t implements nd.n {

    /* renamed from: a */
    private final Field f8513a;

    public r(Field field) {
        hc.t.e(field, "member");
        this.f8513a = field;
    }

    @Override // nd.n
    public boolean C() {
        return a0().isEnumConstant();
    }

    @Override // nd.n
    public boolean R() {
        return false;
    }

    /* renamed from: c0 */
    public Field a0() {
        return this.f8513a;
    }

    /* renamed from: d0 */
    public z getType() {
        z.a aVar = z.f8521a;
        Type genericType = a0().getGenericType();
        hc.t.d(genericType, "member.genericType");
        return aVar.a(genericType);
    }
}
