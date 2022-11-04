package p7;

import android.graphics.Rect;
/* loaded from: classes.dex */
public class o extends q {
    private static float e(float f10) {
        return f10 < 1.0f ? 1.0f / f10 : f10;
    }

    @Override // p7.q
    protected float c(o7.q qVar, o7.q qVar2) {
        int i10 = qVar.f17644c;
        if (i10 <= 0 || qVar.f17645d <= 0) {
            return 0.0f;
        }
        float e10 = (1.0f / e((i10 * 1.0f) / qVar2.f17644c)) / e((qVar.f17645d * 1.0f) / qVar2.f17645d);
        float e11 = e(((qVar.f17644c * 1.0f) / qVar.f17645d) / ((qVar2.f17644c * 1.0f) / qVar2.f17645d));
        return e10 * (((1.0f / e11) / e11) / e11);
    }

    @Override // p7.q
    public Rect d(o7.q qVar, o7.q qVar2) {
        return new Rect(0, 0, qVar2.f17644c, qVar2.f17645d);
    }
}
