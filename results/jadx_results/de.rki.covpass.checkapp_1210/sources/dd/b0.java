package dd;

import java.lang.annotation.Annotation;
import java.util.List;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public final class b0 extends p implements nd.b0 {

    /* renamed from: a */
    private final z f8478a;

    /* renamed from: b */
    private final Annotation[] f8479b;

    /* renamed from: c */
    private final String f8480c;

    /* renamed from: d */
    private final boolean f8481d;

    public b0(z zVar, Annotation[] annotationArr, String str, boolean z10) {
        hc.t.e(zVar, "type");
        hc.t.e(annotationArr, "reflectAnnotations");
        this.f8478a = zVar;
        this.f8479b = annotationArr;
        this.f8480c = str;
        this.f8481d = z10;
    }

    /* renamed from: X */
    public e h(wd.c cVar) {
        hc.t.e(cVar, "fqName");
        return i.a(this.f8479b, cVar);
    }

    /* renamed from: Y */
    public List<e> j() {
        return i.b(this.f8479b);
    }

    /* renamed from: Z */
    public z getType() {
        return this.f8478a;
    }

    @Override // nd.b0
    public boolean b() {
        return this.f8481d;
    }

    @Override // nd.b0
    public wd.f getName() {
        String str = this.f8480c;
        if (str != null) {
            return wd.f.h(str);
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b0.class.getName());
        sb2.append(": ");
        sb2.append(b() ? "vararg " : BuildConfig.FLAVOR);
        sb2.append(getName());
        sb2.append(": ");
        sb2.append(getType());
        return sb2.toString();
    }

    @Override // nd.d
    public boolean v() {
        return false;
    }
}
