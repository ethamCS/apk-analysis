package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.List;
/* loaded from: classes2.dex */
final class d implements PrivilegedAction {

    /* renamed from: a */
    final /* synthetic */ List f13224a;

    public d(List list) {
        this.f13224a = list;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property == null) {
            f.e(new e());
            return null;
        }
        try {
            f fVar = (f) f.class.cast(Class.forName(property, true, f.class.getClassLoader()).newInstance());
            f.e(fVar);
            this.f13224a.add(fVar);
            return null;
        } catch (Exception e10) {
            throw new Error(e10);
        }
    }
}
