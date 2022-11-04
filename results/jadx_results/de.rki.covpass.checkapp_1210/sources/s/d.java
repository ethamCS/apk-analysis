package s;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.core.util.h;
import java.util.Objects;
/* loaded from: classes.dex */
public class d extends c {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final OutputConfiguration f21332a;

        /* renamed from: b */
        String f21333b;

        a(OutputConfiguration outputConfiguration) {
            this.f21332a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f21332a, aVar.f21332a) && Objects.equals(this.f21333b, aVar.f21333b);
        }

        public int hashCode() {
            int hashCode = this.f21332a.hashCode() ^ 31;
            int i10 = (hashCode << 5) - hashCode;
            String str = this.f21333b;
            return (str == null ? 0 : str.hashCode()) ^ i10;
        }
    }

    public d(Surface surface) {
        this(new a(new OutputConfiguration(surface)));
    }

    public d(Object obj) {
        super(obj);
    }

    public static d f(OutputConfiguration outputConfiguration) {
        return new d(new a(outputConfiguration));
    }

    @Override // s.c, s.f, s.b.a
    public String c() {
        return ((a) this.f21334a).f21333b;
    }

    @Override // s.c, s.f, s.b.a
    public Object d() {
        h.a(this.f21334a instanceof a);
        return ((a) this.f21334a).f21332a;
    }

    @Override // s.c, s.f, s.b.a
    public void e(String str) {
        ((a) this.f21334a).f21333b = str;
    }
}
