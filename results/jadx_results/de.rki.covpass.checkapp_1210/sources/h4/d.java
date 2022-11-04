package h4;

import java.util.List;
/* loaded from: classes.dex */
public class d extends g<Float> {
    public d(List<r4.a<Float>> list) {
        super(list);
    }

    public float p() {
        return q(b(), d());
    }

    float q(r4.a<Float> aVar, float f10) {
        Float f11;
        if (aVar.f20443b == null || aVar.f20444c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        r4.c<A> cVar = this.f11252e;
        return (cVar == 0 || (f11 = (Float) cVar.b(aVar.f20448g, aVar.f20449h.floatValue(), aVar.f20443b, aVar.f20444c, f10, e(), f())) == null) ? q4.g.i(aVar.f(), aVar.c(), f10) : f11.floatValue();
    }

    /* renamed from: r */
    public Float i(r4.a<Float> aVar, float f10) {
        return Float.valueOf(q(aVar, f10));
    }
}
