package dd;

import java.lang.annotation.Annotation;
/* loaded from: classes.dex */
public final class g extends f implements nd.c {

    /* renamed from: c */
    private final Annotation f8498c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(wd.f fVar, Annotation annotation) {
        super(fVar, null);
        hc.t.e(annotation, "annotation");
        this.f8498c = annotation;
    }

    @Override // nd.c
    public nd.a b() {
        return new e(this.f8498c);
    }
}
