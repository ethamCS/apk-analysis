package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class g extends RecyclerView.z {
    protected PointF k;
    private final DisplayMetrics l;
    private float n;
    protected final LinearInterpolator i = new LinearInterpolator();
    protected final DecelerateInterpolator j = new DecelerateInterpolator();
    private boolean m = false;
    protected int o = 0;
    protected int p = 0;

    public g(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    private int b(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    private float k() {
        if (!this.m) {
            this.n = a(this.l);
            this.m = true;
        }
        return this.n;
    }

    protected float a(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
                }
                return i4 - i2;
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 >= 0) {
                return 0;
            }
            return i7;
        }
        return i3 - i;
    }

    public int a(View view, int i) {
        RecyclerView.o b2 = b();
        if (b2 == null || !b2.a()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return a(b2.f(view) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, b2.i(view) + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, b2.o(), b2.r() - b2.p(), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void a(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        if (a() == 0) {
            h();
            return;
        }
        this.o = b(this.o, i);
        int b2 = b(this.p, i2);
        this.p = b2;
        if (this.o != 0 || b2 != 0) {
            return;
        }
        a(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void a(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        int a2 = a(view, i());
        int b2 = b(view, j());
        int d = d((int) Math.sqrt((a2 * a2) + (b2 * b2)));
        if (d > 0) {
            aVar.a(-a2, -b2, d, this.j);
        }
    }

    protected void a(RecyclerView.z.a aVar) {
        PointF a2 = a(c());
        if (a2 == null || (a2.x == 0.0f && a2.y == 0.0f)) {
            aVar.a(c());
            h();
            return;
        }
        a(a2);
        this.k = a2;
        this.o = (int) (a2.x * 10000.0f);
        this.p = (int) (a2.y * 10000.0f);
        aVar.a((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (e(10000) * 1.2f), this.i);
    }

    public int b(View view, int i) {
        RecyclerView.o b2 = b();
        if (b2 == null || !b2.b()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return a(b2.j(view) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, b2.e(view) + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin, b2.q(), b2.h() - b2.n(), i);
    }

    public int d(int i) {
        double e = e(i);
        Double.isNaN(e);
        return (int) Math.ceil(e / 0.3356d);
    }

    protected int e(int i) {
        return (int) Math.ceil(Math.abs(i) * k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void f() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void g() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    protected int i() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    protected int j() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
