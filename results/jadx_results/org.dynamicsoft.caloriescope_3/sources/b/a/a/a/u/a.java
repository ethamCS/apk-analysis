package b.a.a.a.u;

import android.content.Context;
import android.graphics.Color;
import b.a.a.a.y.b;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private final boolean f1242a;

    /* renamed from: b */
    private final int f1243b;

    /* renamed from: c */
    private final int f1244c;
    private final float d;

    public a(Context context) {
        this.f1242a = b.a(context, b.a.a.a.b.elevationOverlayEnabled, false);
        this.f1243b = b.a.a.a.s.a.a(context, b.a.a.a.b.elevationOverlayColor, 0);
        this.f1244c = b.a.a.a.s.a.a(context, b.a.a.a.b.colorSurface, 0);
        this.d = context.getResources().getDisplayMetrics().density;
    }

    private boolean a(int i) {
        return a.g.e.a.c(i, 255) == this.f1244c;
    }

    public float a(float f) {
        float f2 = this.d;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int a(int i, float f) {
        float a2 = a(f);
        return a.g.e.a.c(b.a.a.a.s.a.a(a.g.e.a.c(i, 255), this.f1243b, a2), Color.alpha(i));
    }

    public boolean a() {
        return this.f1242a;
    }

    public int b(int i, float f) {
        return (!this.f1242a || !a(i)) ? i : a(i, f);
    }
}
