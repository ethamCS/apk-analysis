package cd;

import hc.t;
import java.lang.annotation.Annotation;
import xc.a1;
import xc.b1;
/* loaded from: classes.dex */
public final class b implements a1 {

    /* renamed from: b */
    private final Annotation f6431b;

    public b(Annotation annotation) {
        t.e(annotation, "annotation");
        this.f6431b = annotation;
    }

    @Override // xc.a1
    public b1 a() {
        b1 b1Var = b1.f25526a;
        t.d(b1Var, "NO_SOURCE_FILE");
        return b1Var;
    }

    public final Annotation d() {
        return this.f6431b;
    }
}
