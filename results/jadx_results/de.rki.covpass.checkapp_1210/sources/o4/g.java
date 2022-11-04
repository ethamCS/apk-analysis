package o4;

import android.graphics.Color;
import p4.c;
/* loaded from: classes.dex */
public class g implements n0<Integer> {

    /* renamed from: a */
    public static final g f17494a = new g();

    private g() {
    }

    /* renamed from: b */
    public Integer a(p4.c cVar, float f10) {
        boolean z10 = cVar.B() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.e();
        }
        double p10 = cVar.p();
        double p11 = cVar.p();
        double p12 = cVar.p();
        double p13 = cVar.B() == c.b.NUMBER ? cVar.p() : 1.0d;
        if (z10) {
            cVar.h();
        }
        if (p10 <= 1.0d && p11 <= 1.0d && p12 <= 1.0d) {
            p10 *= 255.0d;
            p11 *= 255.0d;
            p12 *= 255.0d;
            if (p13 <= 1.0d) {
                p13 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) p13, (int) p10, (int) p11, (int) p12));
    }
}
