package r4;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import e4.h;
/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a */
    private final h f20442a;

    /* renamed from: b */
    public final T f20443b;

    /* renamed from: c */
    public T f20444c;

    /* renamed from: d */
    public final Interpolator f20445d;

    /* renamed from: e */
    public final Interpolator f20446e;

    /* renamed from: f */
    public final Interpolator f20447f;

    /* renamed from: g */
    public final float f20448g;

    /* renamed from: h */
    public Float f20449h;

    /* renamed from: i */
    private float f20450i;

    /* renamed from: j */
    private float f20451j;

    /* renamed from: k */
    private int f20452k;

    /* renamed from: l */
    private int f20453l;

    /* renamed from: m */
    private float f20454m;

    /* renamed from: n */
    private float f20455n;

    /* renamed from: o */
    public PointF f20456o;

    /* renamed from: p */
    public PointF f20457p;

    public a(h hVar, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.f20450i = -3987645.8f;
        this.f20451j = -3987645.8f;
        this.f20452k = 784923401;
        this.f20453l = 784923401;
        this.f20454m = Float.MIN_VALUE;
        this.f20455n = Float.MIN_VALUE;
        this.f20456o = null;
        this.f20457p = null;
        this.f20442a = hVar;
        this.f20443b = t10;
        this.f20444c = t11;
        this.f20445d = interpolator;
        this.f20446e = null;
        this.f20447f = null;
        this.f20448g = f10;
        this.f20449h = f11;
    }

    public a(h hVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.f20450i = -3987645.8f;
        this.f20451j = -3987645.8f;
        this.f20452k = 784923401;
        this.f20453l = 784923401;
        this.f20454m = Float.MIN_VALUE;
        this.f20455n = Float.MIN_VALUE;
        this.f20456o = null;
        this.f20457p = null;
        this.f20442a = hVar;
        this.f20443b = t10;
        this.f20444c = t11;
        this.f20445d = null;
        this.f20446e = interpolator;
        this.f20447f = interpolator2;
        this.f20448g = f10;
        this.f20449h = f11;
    }

    public a(h hVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f20450i = -3987645.8f;
        this.f20451j = -3987645.8f;
        this.f20452k = 784923401;
        this.f20453l = 784923401;
        this.f20454m = Float.MIN_VALUE;
        this.f20455n = Float.MIN_VALUE;
        this.f20456o = null;
        this.f20457p = null;
        this.f20442a = hVar;
        this.f20443b = t10;
        this.f20444c = t11;
        this.f20445d = interpolator;
        this.f20446e = interpolator2;
        this.f20447f = interpolator3;
        this.f20448g = f10;
        this.f20449h = f11;
    }

    public a(T t10) {
        this.f20450i = -3987645.8f;
        this.f20451j = -3987645.8f;
        this.f20452k = 784923401;
        this.f20453l = 784923401;
        this.f20454m = Float.MIN_VALUE;
        this.f20455n = Float.MIN_VALUE;
        this.f20456o = null;
        this.f20457p = null;
        this.f20442a = null;
        this.f20443b = t10;
        this.f20444c = t10;
        this.f20445d = null;
        this.f20446e = null;
        this.f20447f = null;
        this.f20448g = Float.MIN_VALUE;
        this.f20449h = Float.valueOf(Float.MAX_VALUE);
    }

    public boolean a(float f10) {
        return f10 >= e() && f10 < b();
    }

    public float b() {
        if (this.f20442a == null) {
            return 1.0f;
        }
        if (this.f20455n == Float.MIN_VALUE) {
            if (this.f20449h == null) {
                this.f20455n = 1.0f;
            } else {
                this.f20455n = e() + ((this.f20449h.floatValue() - this.f20448g) / this.f20442a.e());
            }
        }
        return this.f20455n;
    }

    public float c() {
        if (this.f20451j == -3987645.8f) {
            this.f20451j = ((Float) this.f20444c).floatValue();
        }
        return this.f20451j;
    }

    public int d() {
        if (this.f20453l == 784923401) {
            this.f20453l = ((Integer) this.f20444c).intValue();
        }
        return this.f20453l;
    }

    public float e() {
        h hVar = this.f20442a;
        if (hVar == null) {
            return 0.0f;
        }
        if (this.f20454m == Float.MIN_VALUE) {
            this.f20454m = (this.f20448g - hVar.p()) / this.f20442a.e();
        }
        return this.f20454m;
    }

    public float f() {
        if (this.f20450i == -3987645.8f) {
            this.f20450i = ((Float) this.f20443b).floatValue();
        }
        return this.f20450i;
    }

    public int g() {
        if (this.f20452k == 784923401) {
            this.f20452k = ((Integer) this.f20443b).intValue();
        }
        return this.f20452k;
    }

    public boolean h() {
        return this.f20445d == null && this.f20446e == null && this.f20447f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f20443b + ", endValue=" + this.f20444c + ", startFrame=" + this.f20448g + ", endFrame=" + this.f20449h + ", interpolator=" + this.f20445d + '}';
    }
}
