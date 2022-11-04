package d.a.a.a.t;

import android.content.Context;
import android.graphics.Color;
import d.a.a.a.x.b;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private final boolean f3681a;

    /* renamed from: b */
    private final int f3682b;

    /* renamed from: c */
    private final int f3683c;

    /* renamed from: d */
    private final float f3684d;

    public a(Context context) {
        this.f3681a = b.b(context, d.a.a.a.b.o_res_0x7f040132, false);
        this.f3682b = d.a.a.a.q.a.a(context, d.a.a.a.b.n_res_0x7f040131, 0);
        this.f3683c = d.a.a.a.q.a.a(context, d.a.a.a.b.l_res_0x7f0400c4, 0);
        this.f3684d = context.getResources().getDisplayMetrics().density;
    }

    private boolean e(int i) {
        return b.g.e.a.d(i, 255) == this.f3683c;
    }

    public float a(float f2) {
        float f3 = this.f3684d;
        if (f3 <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f2 / f3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i, float f2) {
        float a2 = a(f2);
        return b.g.e.a.d(d.a.a.a.q.a.f(b.g.e.a.d(i, 255), this.f3682b, a2), Color.alpha(i));
    }

    public int c(int i, float f2) {
        return (!this.f3681a || !e(i)) ? i : b(i, f2);
    }

    public boolean d() {
        return this.f3681a;
    }
}
