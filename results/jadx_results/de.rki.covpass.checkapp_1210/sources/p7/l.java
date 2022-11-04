package p7;

import android.graphics.Rect;
import android.util.Log;
/* loaded from: classes.dex */
public class l extends q {

    /* renamed from: b */
    private static final String f18988b = "l";

    @Override // p7.q
    protected float c(o7.q qVar, o7.q qVar2) {
        if (qVar.f17644c <= 0 || qVar.f17645d <= 0) {
            return 0.0f;
        }
        o7.q d10 = qVar.d(qVar2);
        float f10 = (d10.f17644c * 1.0f) / qVar.f17644c;
        if (f10 > 1.0f) {
            f10 = (float) Math.pow(1.0f / f10, 1.1d);
        }
        float f11 = ((d10.f17644c * 1.0f) / qVar2.f17644c) + ((d10.f17645d * 1.0f) / qVar2.f17645d);
        return f10 * ((1.0f / f11) / f11);
    }

    @Override // p7.q
    public Rect d(o7.q qVar, o7.q qVar2) {
        o7.q d10 = qVar.d(qVar2);
        String str = f18988b;
        Log.i(str, "Preview: " + qVar + "; Scaled: " + d10 + "; Want: " + qVar2);
        int i10 = (d10.f17644c - qVar2.f17644c) / 2;
        int i11 = (d10.f17645d - qVar2.f17645d) / 2;
        return new Rect(-i10, -i11, d10.f17644c - i10, d10.f17645d - i11);
    }
}
