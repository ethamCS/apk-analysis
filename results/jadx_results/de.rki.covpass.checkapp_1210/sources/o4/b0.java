package o4;

import android.graphics.PointF;
import p4.c;
/* loaded from: classes.dex */
public class b0 implements n0<PointF> {

    /* renamed from: a */
    public static final b0 f17484a = new b0();

    private b0() {
    }

    /* renamed from: b */
    public PointF a(p4.c cVar, float f10) {
        c.b B = cVar.B();
        if (B != c.b.BEGIN_ARRAY && B != c.b.BEGIN_OBJECT) {
            if (B == c.b.NUMBER) {
                PointF pointF = new PointF(((float) cVar.p()) * f10, ((float) cVar.p()) * f10);
                while (cVar.j()) {
                    cVar.W();
                }
                return pointF;
            }
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + B);
        }
        return s.e(cVar, f10);
    }
}
