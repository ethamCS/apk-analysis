package o4;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;
import p4.c;
/* loaded from: classes.dex */
class t {

    /* renamed from: b */
    private static i0.h<WeakReference<Interpolator>> f17533b;

    /* renamed from: a */
    private static final Interpolator f17532a = new LinearInterpolator();

    /* renamed from: c */
    static c.a f17534c = c.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d */
    static c.a f17535d = c.a.a("x", "y");

    t() {
    }

    private static WeakReference<Interpolator> a(int i10) {
        WeakReference<Interpolator> f10;
        synchronized (t.class) {
            f10 = g().f(i10);
        }
        return f10;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator interpolator;
        pointF.x = q4.g.b(pointF.x, -1.0f, 1.0f);
        pointF.y = q4.g.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = q4.g.b(pointF2.x, -1.0f, 1.0f);
        float b10 = q4.g.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b10;
        int i10 = q4.h.i(pointF.x, pointF.y, pointF2.x, b10);
        WeakReference<Interpolator> a10 = a(i10);
        Interpolator interpolator2 = a10 != null ? a10.get() : null;
        if (a10 == null || interpolator2 == null) {
            try {
                interpolator = androidx.core.view.animation.a.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e10) {
                interpolator = "The Path cannot loop back on itself.".equals(e10.getMessage()) ? androidx.core.view.animation.a.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator2 = interpolator;
            try {
                h(i10, new WeakReference(interpolator2));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator2;
    }

    public static <T> r4.a<T> c(p4.c cVar, e4.h hVar, float f10, n0<T> n0Var, boolean z10, boolean z11) {
        return (!z10 || !z11) ? z10 ? d(hVar, cVar, f10, n0Var) : f(cVar, f10, n0Var) : e(hVar, cVar, f10, n0Var);
    }

    private static <T> r4.a<T> d(e4.h hVar, p4.c cVar, float f10, n0<T> n0Var) {
        Interpolator interpolator;
        T t10;
        cVar.f();
        PointF pointF = null;
        boolean z10 = false;
        T t11 = null;
        T t12 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f11 = 0.0f;
        PointF pointF4 = null;
        while (cVar.j()) {
            switch (cVar.M(f17534c)) {
                case 0:
                    f11 = (float) cVar.p();
                    break;
                case 1:
                    t12 = n0Var.a(cVar, f10);
                    break;
                case 2:
                    t11 = n0Var.a(cVar, f10);
                    break;
                case 3:
                    pointF = s.e(cVar, 1.0f);
                    break;
                case 4:
                    pointF4 = s.e(cVar, 1.0f);
                    break;
                case 5:
                    if (cVar.r() != 1) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                case 6:
                    pointF2 = s.e(cVar, f10);
                    break;
                case 7:
                    pointF3 = s.e(cVar, f10);
                    break;
                default:
                    cVar.W();
                    break;
            }
        }
        cVar.i();
        if (z10) {
            interpolator = f17532a;
            t10 = t12;
        } else {
            interpolator = (pointF == null || pointF4 == null) ? f17532a : b(pointF, pointF4);
            t10 = t11;
        }
        r4.a<T> aVar = new r4.a<>(hVar, t12, t10, interpolator, f11, null);
        aVar.f20456o = pointF2;
        aVar.f20457p = pointF3;
        return aVar;
    }

    private static <T> r4.a<T> e(e4.h hVar, p4.c cVar, float f10, n0<T> n0Var) {
        Interpolator interpolator;
        Interpolator interpolator2;
        T t10;
        Interpolator interpolator3;
        PointF pointF;
        r4.a<T> aVar;
        PointF pointF2;
        float f11;
        cVar.f();
        PointF pointF3 = null;
        boolean z10 = false;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        T t11 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        float f12 = 0.0f;
        PointF pointF10 = null;
        T t12 = null;
        while (cVar.j()) {
            switch (cVar.M(f17534c)) {
                case 0:
                    pointF2 = pointF3;
                    f12 = (float) cVar.p();
                    break;
                case 1:
                    pointF2 = pointF3;
                    t11 = n0Var.a(cVar, f10);
                    break;
                case 2:
                    pointF2 = pointF3;
                    t12 = n0Var.a(cVar, f10);
                    break;
                case 3:
                    pointF2 = pointF3;
                    f11 = f12;
                    PointF pointF11 = pointF10;
                    if (cVar.B() != c.b.BEGIN_OBJECT) {
                        pointF4 = s.e(cVar, f10);
                        f12 = f11;
                        pointF10 = pointF11;
                        break;
                    } else {
                        cVar.f();
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        float f15 = 0.0f;
                        float f16 = 0.0f;
                        while (cVar.j()) {
                            int M = cVar.M(f17535d);
                            if (M == 0) {
                                c.b B = cVar.B();
                                c.b bVar = c.b.NUMBER;
                                if (B == bVar) {
                                    f15 = (float) cVar.p();
                                    f13 = f15;
                                } else {
                                    cVar.e();
                                    f13 = (float) cVar.p();
                                    f15 = cVar.B() == bVar ? (float) cVar.p() : f13;
                                    cVar.h();
                                }
                            } else if (M != 1) {
                                cVar.W();
                            } else {
                                c.b B2 = cVar.B();
                                c.b bVar2 = c.b.NUMBER;
                                if (B2 == bVar2) {
                                    f16 = (float) cVar.p();
                                    f14 = f16;
                                } else {
                                    cVar.e();
                                    f14 = (float) cVar.p();
                                    f16 = cVar.B() == bVar2 ? (float) cVar.p() : f14;
                                    cVar.h();
                                }
                            }
                        }
                        PointF pointF12 = new PointF(f13, f14);
                        PointF pointF13 = new PointF(f15, f16);
                        cVar.i();
                        pointF7 = pointF13;
                        pointF6 = pointF12;
                        pointF10 = pointF11;
                        f12 = f11;
                        break;
                    }
                case 4:
                    if (cVar.B() != c.b.BEGIN_OBJECT) {
                        pointF2 = pointF3;
                        pointF5 = s.e(cVar, f10);
                        break;
                    } else {
                        cVar.f();
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        float f19 = 0.0f;
                        float f20 = 0.0f;
                        while (cVar.j()) {
                            PointF pointF14 = pointF10;
                            int M2 = cVar.M(f17535d);
                            PointF pointF15 = pointF3;
                            if (M2 == 0) {
                                float f21 = f12;
                                c.b B3 = cVar.B();
                                c.b bVar3 = c.b.NUMBER;
                                if (B3 == bVar3) {
                                    f19 = (float) cVar.p();
                                    f12 = f21;
                                    f17 = f19;
                                } else {
                                    cVar.e();
                                    f17 = (float) cVar.p();
                                    f19 = cVar.B() == bVar3 ? (float) cVar.p() : f17;
                                    cVar.h();
                                    f12 = f21;
                                }
                            } else if (M2 != 1) {
                                cVar.W();
                            } else {
                                c.b B4 = cVar.B();
                                c.b bVar4 = c.b.NUMBER;
                                if (B4 == bVar4) {
                                    f20 = (float) cVar.p();
                                    f12 = f12;
                                    f18 = f20;
                                } else {
                                    float f22 = f12;
                                    cVar.e();
                                    float p10 = (float) cVar.p();
                                    float p11 = cVar.B() == bVar4 ? (float) cVar.p() : p10;
                                    cVar.h();
                                    f12 = f22;
                                    pointF10 = pointF14;
                                    pointF3 = pointF15;
                                    f20 = p11;
                                    f18 = p10;
                                }
                            }
                            pointF10 = pointF14;
                            pointF3 = pointF15;
                        }
                        pointF2 = pointF3;
                        f11 = f12;
                        PointF pointF16 = new PointF(f17, f18);
                        PointF pointF17 = new PointF(f19, f20);
                        cVar.i();
                        pointF9 = pointF17;
                        pointF8 = pointF16;
                        f12 = f11;
                        break;
                    }
                case 5:
                    if (cVar.r() == 1) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                    }
                case 6:
                    pointF10 = s.e(cVar, f10);
                    continue;
                case 7:
                    pointF3 = s.e(cVar, f10);
                    continue;
                default:
                    pointF2 = pointF3;
                    cVar.W();
                    break;
            }
            pointF3 = pointF2;
        }
        PointF pointF18 = pointF3;
        float f23 = f12;
        PointF pointF19 = pointF10;
        cVar.i();
        if (z10) {
            interpolator3 = f17532a;
            t10 = t11;
        } else {
            if (pointF4 != null && pointF5 != null) {
                interpolator3 = b(pointF4, pointF5);
            } else if (pointF6 != null && pointF7 != null && pointF8 != null && pointF9 != null) {
                interpolator2 = b(pointF6, pointF8);
                interpolator = b(pointF7, pointF9);
                t10 = t12;
                interpolator3 = null;
                if (interpolator2 != null || interpolator == null) {
                    pointF = pointF19;
                    aVar = new r4.a<>(hVar, t11, t10, interpolator3, f23, null);
                } else {
                    pointF = pointF19;
                    aVar = new r4.a<>(hVar, t11, t10, interpolator2, interpolator, f23, null);
                }
                aVar.f20456o = pointF;
                aVar.f20457p = pointF18;
                return aVar;
            } else {
                interpolator3 = f17532a;
            }
            t10 = t12;
        }
        interpolator2 = null;
        interpolator = null;
        if (interpolator2 != null) {
        }
        pointF = pointF19;
        aVar = new r4.a<>(hVar, t11, t10, interpolator3, f23, null);
        aVar.f20456o = pointF;
        aVar.f20457p = pointF18;
        return aVar;
    }

    private static <T> r4.a<T> f(p4.c cVar, float f10, n0<T> n0Var) {
        return new r4.a<>(n0Var.a(cVar, f10));
    }

    private static i0.h<WeakReference<Interpolator>> g() {
        if (f17533b == null) {
            f17533b = new i0.h<>();
        }
        return f17533b;
    }

    private static void h(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (t.class) {
            f17533b.j(i10, weakReference);
        }
    }
}
