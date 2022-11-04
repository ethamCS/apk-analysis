package s;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private final a f21328a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        Surface b();

        String c();

        Object d();

        void e(String str);
    }

    public b(Surface surface) {
        int i10 = Build.VERSION.SDK_INT;
        this.f21328a = i10 >= 28 ? new e(surface) : i10 >= 26 ? new d(surface) : i10 >= 24 ? new c(surface) : new f(surface);
    }

    private b(a aVar) {
        this.f21328a = aVar;
    }

    public static b e(Object obj) {
        if (obj == null) {
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        a g10 = i10 >= 28 ? e.g((OutputConfiguration) obj) : i10 >= 26 ? d.f((OutputConfiguration) obj) : i10 >= 24 ? c.a((OutputConfiguration) obj) : null;
        if (g10 != null) {
            return new b(g10);
        }
        return null;
    }

    public String a() {
        return this.f21328a.c();
    }

    public Surface b() {
        return this.f21328a.b();
    }

    public void c(String str) {
        this.f21328a.e(str);
    }

    public Object d() {
        return this.f21328a.d();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f21328a.equals(((b) obj).f21328a);
    }

    public int hashCode() {
        return this.f21328a.hashCode();
    }
}
