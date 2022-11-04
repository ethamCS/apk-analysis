package androidx.camera.camera2;

import android.content.Context;
import androidx.camera.camera2.internal.a1;
import androidx.camera.camera2.internal.d1;
import androidx.camera.core.r1;
import androidx.camera.core.u;
import androidx.camera.core.z;
import java.util.Set;
import p.a;
import p.b;
import p.c;
import w.p2;
/* loaded from: classes.dex */
public final class Camera2Config {

    /* loaded from: classes.dex */
    public static final class DefaultProvider implements z.b {
        @Override // androidx.camera.core.z.b
        public z getCameraXConfig() {
            return Camera2Config.c();
        }
    }

    public static z c() {
        b bVar = b.f18706a;
        a aVar = a.f18705a;
        return new z.a().c(bVar).d(aVar).g(c.f18707a).a();
    }

    public static /* synthetic */ w.z d(Context context, Object obj, Set set) {
        try {
            return new a1(context, obj, set);
        } catch (u e10) {
            throw new r1(e10);
        }
    }

    public static /* synthetic */ p2 e(Context context) {
        return new d1(context);
    }
}
