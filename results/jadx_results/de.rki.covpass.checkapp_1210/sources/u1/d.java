package u1;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    private final Set<a> f22545a = new HashSet();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final Uri f22546a;

        /* renamed from: b */
        private final boolean f22547b;

        a(Uri uri, boolean z10) {
            this.f22546a = uri;
            this.f22547b = z10;
        }

        public Uri a() {
            return this.f22546a;
        }

        public boolean b() {
            return this.f22547b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f22547b == aVar.f22547b && this.f22546a.equals(aVar.f22546a);
        }

        public int hashCode() {
            return (this.f22546a.hashCode() * 31) + (this.f22547b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z10) {
        this.f22545a.add(new a(uri, z10));
    }

    public Set<a> b() {
        return this.f22545a;
    }

    public int c() {
        return this.f22545a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return this.f22545a.equals(((d) obj).f22545a);
        }
        return false;
    }

    public int hashCode() {
        return this.f22545a.hashCode();
    }
}
