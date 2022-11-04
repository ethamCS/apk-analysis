package p7;

import android.graphics.Rect;
import android.util.Log;
/* loaded from: classes.dex */
public class n extends q {

    /* renamed from: b */
    private static final String f18993b = "n";

    @Override // p7.q
    protected float c(o7.q qVar, o7.q qVar2) {
        if (qVar.f17644c <= 0 || qVar.f17645d <= 0) {
            return 0.0f;
        }
        o7.q g10 = qVar.g(qVar2);
        float f10 = (g10.f17644c * 1.0f) / qVar.f17644c;
        if (f10 > 1.0f) {
            f10 = (float) Math.pow(1.0f / f10, 1.1d);
        }
        float f11 = ((qVar2.f17644c * 1.0f) / g10.f17644c) * ((qVar2.f17645d * 1.0f) / g10.f17645d);
        return f10 * (((1.0f / f11) / f11) / f11);
    }

    @Override // p7.q
    public Rect d(o7.q qVar, o7.q qVar2) {
        o7.q g10 = qVar.g(qVar2);
        String str = f18993b;
        Log.i(str, "Preview: " + qVar + "; Scaled: " + g10 + "; Want: " + qVar2);
        int i10 = (g10.f17644c - qVar2.f17644c) / 2;
        int i11 = (g10.f17645d - qVar2.f17645d) / 2;
        return new Rect(-i10, -i11, g10.f17644c - i10, g10.f17645d - i11);
    }
}
