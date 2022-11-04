package h4;

import java.util.List;
/* loaded from: classes.dex */
public class b extends g<Integer> {
    public b(List<r4.a<Integer>> list) {
        super(list);
    }

    public int p() {
        return q(b(), d());
    }

    public int q(r4.a<Integer> aVar, float f10) {
        Integer num;
        if (aVar.f20443b == null || aVar.f20444c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        r4.c<A> cVar = this.f11252e;
        return (cVar == 0 || (num = (Integer) cVar.b(aVar.f20448g, aVar.f20449h.floatValue(), aVar.f20443b, aVar.f20444c, f10, e(), f())) == null) ? q4.b.c(q4.g.b(f10, 0.0f, 1.0f), aVar.f20443b.intValue(), aVar.f20444c.intValue()) : num.intValue();
    }

    /* renamed from: r */
    public Integer i(r4.a<Integer> aVar, float f10) {
        return Integer.valueOf(q(aVar, f10));
    }
}
