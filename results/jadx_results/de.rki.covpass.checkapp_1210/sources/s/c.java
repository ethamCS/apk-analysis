package s;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.core.util.h;
import java.util.Objects;
/* loaded from: classes.dex */
public class c extends f {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final OutputConfiguration f21329a;

        /* renamed from: b */
        String f21330b;

        /* renamed from: c */
        boolean f21331c;

        a(OutputConfiguration outputConfiguration) {
            this.f21329a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f21329a, aVar.f21329a) && this.f21331c == aVar.f21331c && Objects.equals(this.f21330b, aVar.f21330b);
        }

        public int hashCode() {
            int hashCode = this.f21329a.hashCode() ^ 31;
            int i10 = (this.f21331c ? 1 : 0) ^ ((hashCode << 5) - hashCode);
            int i11 = (i10 << 5) - i10;
            String str = this.f21330b;
            return (str == null ? 0 : str.hashCode()) ^ i11;
        }
    }

    public c(Surface surface) {
        this(new a(new OutputConfiguration(surface)));
    }

    public c(Object obj) {
        super(obj);
    }

    public static c a(OutputConfiguration outputConfiguration) {
        return new c(new a(outputConfiguration));
    }

    @Override // s.f, s.b.a
    public Surface b() {
        return ((OutputConfiguration) d()).getSurface();
    }

    @Override // s.f, s.b.a
    public String c() {
        return ((a) this.f21334a).f21330b;
    }

    @Override // s.f, s.b.a
    public Object d() {
        h.a(this.f21334a instanceof a);
        return ((a) this.f21334a).f21329a;
    }

    @Override // s.f, s.b.a
    public void e(String str) {
        ((a) this.f21334a).f21330b = str;
    }
}
