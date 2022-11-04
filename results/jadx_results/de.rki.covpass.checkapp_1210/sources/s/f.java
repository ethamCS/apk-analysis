package s;

import android.annotation.SuppressLint;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.s1;
import androidx.core.util.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import s.b;
/* loaded from: classes.dex */
public class f implements b.a {

    /* renamed from: a */
    final Object f21334a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final List<Surface> f21335a;

        /* renamed from: b */
        final Size f21336b;

        /* renamed from: c */
        final int f21337c;

        /* renamed from: d */
        final int f21338d;

        /* renamed from: e */
        String f21339e;

        /* renamed from: f */
        boolean f21340f = false;

        a(Surface surface) {
            h.h(surface, "Surface must not be null");
            this.f21335a = Collections.singletonList(surface);
            this.f21336b = c(surface);
            this.f21337c = a(surface);
            this.f21338d = b(surface);
        }

        @SuppressLint({"BlockedPrivateApi"})
        private static int a(Surface surface) {
            try {
                return ((Integer) Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", Surface.class).invoke(null, surface)).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                s1.d("OutputConfigCompat", "Unable to retrieve surface format.", e10);
                return 0;
            }
        }

        @SuppressLint({"SoonBlockedPrivateApi"})
        private static int b(Surface surface) {
            try {
                return ((Integer) Surface.class.getDeclaredMethod("getGenerationId", new Class[0]).invoke(surface, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                s1.d("OutputConfigCompat", "Unable to retrieve surface generation id.", e10);
                return -1;
            }
        }

        @SuppressLint({"BlockedPrivateApi"})
        private static Size c(Surface surface) {
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", Surface.class);
                declaredMethod.setAccessible(true);
                return (Size) declaredMethod.invoke(null, surface);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                s1.d("OutputConfigCompat", "Unable to retrieve surface size.", e10);
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f21336b.equals(aVar.f21336b) || this.f21337c != aVar.f21337c || this.f21338d != aVar.f21338d || this.f21340f != aVar.f21340f || !Objects.equals(this.f21339e, aVar.f21339e)) {
                return false;
            }
            int min = Math.min(this.f21335a.size(), aVar.f21335a.size());
            for (int i10 = 0; i10 < min; i10++) {
                if (this.f21335a.get(i10) != aVar.f21335a.get(i10)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f21335a.hashCode() ^ 31;
            int i10 = this.f21338d ^ ((hashCode << 5) - hashCode);
            int hashCode2 = this.f21336b.hashCode() ^ ((i10 << 5) - i10);
            int i11 = this.f21337c ^ ((hashCode2 << 5) - hashCode2);
            int i12 = (this.f21340f ? 1 : 0) ^ ((i11 << 5) - i11);
            int i13 = (i12 << 5) - i12;
            String str = this.f21339e;
            return (str == null ? 0 : str.hashCode()) ^ i13;
        }
    }

    public f(Surface surface) {
        this.f21334a = new a(surface);
    }

    public f(Object obj) {
        this.f21334a = obj;
    }

    @Override // s.b.a
    public Surface b() {
        List<Surface> list = ((a) this.f21334a).f21335a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    @Override // s.b.a
    public String c() {
        return ((a) this.f21334a).f21339e;
    }

    @Override // s.b.a
    public Object d() {
        return null;
    }

    @Override // s.b.a
    public void e(String str) {
        ((a) this.f21334a).f21339e = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        return Objects.equals(this.f21334a, ((f) obj).f21334a);
    }

    public int hashCode() {
        return this.f21334a.hashCode();
    }
}
