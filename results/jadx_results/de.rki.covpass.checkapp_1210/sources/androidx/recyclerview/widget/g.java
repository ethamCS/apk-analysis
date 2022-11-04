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

    /* renamed from: k */
    protected PointF f4784k;

    /* renamed from: l */
    private final DisplayMetrics f4785l;

    /* renamed from: n */
    private float f4787n;

    /* renamed from: i */
    protected final LinearInterpolator f4782i = new LinearInterpolator();

    /* renamed from: j */
    protected final DecelerateInterpolator f4783j = new DecelerateInterpolator();

    /* renamed from: m */
    private boolean f4786m = false;

    /* renamed from: o */
    protected int f4788o = 0;

    /* renamed from: p */
    protected int f4789p = 0;

    public g(Context context) {
        this.f4785l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.f4786m) {
            this.f4787n = v(this.f4785l);
            this.f4786m = true;
        }
        return this.f4787n;
    }

    private int y(int i10, int i11) {
        int i12 = i10 - i11;
        if (i10 * i12 <= 0) {
            return 0;
        }
        return i12;
    }

    protected int B() {
        PointF pointF = this.f4784k;
        if (pointF != null) {
            float f10 = pointF.y;
            if (f10 != 0.0f) {
                return f10 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    protected void C(RecyclerView.z.a aVar) {
        PointF a10 = a(f());
        if (a10 == null || (a10.x == 0.0f && a10.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(a10);
        this.f4784k = a10;
        this.f4788o = (int) (a10.x * 10000.0f);
        this.f4789p = (int) (a10.y * 10000.0f);
        aVar.d((int) (this.f4788o * 1.2f), (int) (this.f4789p * 1.2f), (int) (x(10000) * 1.2f), this.f4782i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void l(int i10, int i11, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f4788o = y(this.f4788o, i10);
        int y10 = y(this.f4789p, i11);
        this.f4789p = y10;
        if (this.f4788o != 0 || y10 != 0) {
            return;
        }
        C(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void n() {
        this.f4789p = 0;
        this.f4788o = 0;
        this.f4784k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        int t10 = t(view, z());
        int u10 = u(view, B());
        int w9 = w((int) Math.sqrt((t10 * t10) + (u10 * u10)));
        if (w9 > 0) {
            aVar.d(-t10, -u10, w9, this.f4783j);
        }
    }

    public int s(int i10, int i11, int i12, int i13, int i14) {
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 != 1) {
                    throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
                }
                return i13 - i11;
            }
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 >= 0) {
                return 0;
            }
            return i16;
        }
        return i12 - i10;
    }

    public int t(View view, int i10) {
        RecyclerView.o e10 = e();
        if (e10 == null || !e10.k()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(e10.Q(view) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, e10.T(view) + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, e10.e0(), e10.o0() - e10.f0(), i10);
    }

    public int u(View view, int i10) {
        RecyclerView.o e10 = e();
        if (e10 == null || !e10.l()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(e10.U(view) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, e10.O(view) + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin, e10.g0(), e10.W() - e10.d0(), i10);
    }

    protected float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int w(int i10) {
        return (int) Math.ceil(x(i10) / 0.3356d);
    }

    public int x(int i10) {
        return (int) Math.ceil(Math.abs(i10) * A());
    }

    protected int z() {
        PointF pointF = this.f4784k;
        if (pointF != null) {
            float f10 = pointF.x;
            if (f10 != 0.0f) {
                return f10 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
