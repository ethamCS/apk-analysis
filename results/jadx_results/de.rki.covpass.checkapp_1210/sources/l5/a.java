package l5;

import android.content.Context;
import android.graphics.Color;
import q5.b;
/* loaded from: classes.dex */
public class a {

    /* renamed from: f */
    private static final int f15823f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a */
    private final boolean f15824a;

    /* renamed from: b */
    private final int f15825b;

    /* renamed from: c */
    private final int f15826c;

    /* renamed from: d */
    private final int f15827d;

    /* renamed from: e */
    private final float f15828e;

    public a(Context context) {
        this(b.b(context, b5.b.q_res_0x7f03016c, false), i5.a.b(context, b5.b.f5462p, 0), i5.a.b(context, b5.b.o_res_0x7f03016a, 0), i5.a.b(context, b5.b.m_res_0x7f0300fb, 0), context.getResources().getDisplayMetrics().density);
    }

    public a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f15824a = z10;
        this.f15825b = i10;
        this.f15826c = i11;
        this.f15827d = i12;
        this.f15828e = f10;
    }

    private boolean e(int i10) {
        return androidx.core.graphics.a.j(i10, 255) == this.f15827d;
    }

    public float a(float f10) {
        float f11 = this.f15828e;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / f11)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float a10 = a(f10);
        int alpha = Color.alpha(i10);
        int h10 = i5.a.h(androidx.core.graphics.a.j(i10, 255), this.f15825b, a10);
        if (a10 > 0.0f && (i11 = this.f15826c) != 0) {
            h10 = i5.a.g(h10, androidx.core.graphics.a.j(i11, f15823f));
        }
        return androidx.core.graphics.a.j(h10, alpha);
    }

    public int c(int i10, float f10) {
        return (!this.f15824a || !e(i10)) ? i10 : b(i10, f10);
    }

    public boolean d() {
        return this.f15824a;
    }
}
