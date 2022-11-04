package androidx.camera.camera2.internal;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Size;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class a1 implements w.z {

    /* renamed from: a */
    private final Map<String, n2> f1603a;

    /* renamed from: b */
    private final c f1604b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c {
        a() {
        }

        @Override // androidx.camera.camera2.internal.c
        public CamcorderProfile d(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        @Override // androidx.camera.camera2.internal.c
        public boolean e(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    a1(Context context, c cVar, Object obj, Set<String> set) {
        this.f1603a = new HashMap();
        androidx.core.util.h.g(cVar);
        this.f1604b = cVar;
        c(context, obj instanceof r.m0 ? (r.m0) obj : r.m0.a(context), set);
    }

    public a1(Context context, Object obj, Set<String> set) {
        this(context, new a(), obj, set);
    }

    private void c(Context context, r.m0 m0Var, Set<String> set) {
        androidx.core.util.h.g(context);
        for (String str : set) {
            this.f1603a.put(str, new n2(context, str, m0Var, this.f1604b));
        }
    }

    @Override // w.z
    public w.h2 a(String str, int i10, Size size) {
        n2 n2Var = this.f1603a.get(str);
        if (n2Var != null) {
            return n2Var.L(i10, size);
        }
        return null;
    }

    @Override // w.z
    public Map<w.o2<?>, Size> b(String str, List<w.h2> list, List<w.o2<?>> list2) {
        androidx.core.util.h.b(!list2.isEmpty(), "No new use cases to be bound.");
        n2 n2Var = this.f1603a.get(str);
        if (n2Var != null) {
            return n2Var.y(list, list2);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }
}
