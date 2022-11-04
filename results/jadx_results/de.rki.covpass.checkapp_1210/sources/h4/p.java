package h4;

import android.graphics.Matrix;
import android.graphics.PointF;
import e4.u;
import h4.a;
import java.util.Collections;
/* loaded from: classes.dex */
public class p {

    /* renamed from: a */
    private final Matrix f11296a = new Matrix();

    /* renamed from: b */
    private final Matrix f11297b;

    /* renamed from: c */
    private final Matrix f11298c;

    /* renamed from: d */
    private final Matrix f11299d;

    /* renamed from: e */
    private final float[] f11300e;

    /* renamed from: f */
    private a<PointF, PointF> f11301f;

    /* renamed from: g */
    private a<?, PointF> f11302g;

    /* renamed from: h */
    private a<r4.d, r4.d> f11303h;

    /* renamed from: i */
    private a<Float, Float> f11304i;

    /* renamed from: j */
    private a<Integer, Integer> f11305j;

    /* renamed from: k */
    private d f11306k;

    /* renamed from: l */
    private d f11307l;

    /* renamed from: m */
    private a<?, Float> f11308m;

    /* renamed from: n */
    private a<?, Float> f11309n;

    public p(k4.l lVar) {
        this.f11301f = lVar.c() == null ? null : lVar.c().n();
        this.f11302g = lVar.f() == null ? null : lVar.f().n();
        this.f11303h = lVar.h() == null ? null : lVar.h().n();
        this.f11304i = lVar.g() == null ? null : lVar.g().n();
        d dVar = lVar.i() == null ? null : (d) lVar.i().n();
        this.f11306k = dVar;
        if (dVar != null) {
            this.f11297b = new Matrix();
            this.f11298c = new Matrix();
            this.f11299d = new Matrix();
            this.f11300e = new float[9];
        } else {
            this.f11297b = null;
            this.f11298c = null;
            this.f11299d = null;
            this.f11300e = null;
        }
        this.f11307l = lVar.j() == null ? null : (d) lVar.j().n();
        if (lVar.e() != null) {
            this.f11305j = lVar.e().n();
        }
        if (lVar.k() != null) {
            this.f11308m = lVar.k().n();
        } else {
            this.f11308m = null;
        }
        if (lVar.d() != null) {
            this.f11309n = lVar.d().n();
        } else {
            this.f11309n = null;
        }
    }

    private void d() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f11300e[i10] = 0.0f;
        }
    }

    public void a(m4.b bVar) {
        bVar.i(this.f11305j);
        bVar.i(this.f11308m);
        bVar.i(this.f11309n);
        bVar.i(this.f11301f);
        bVar.i(this.f11302g);
        bVar.i(this.f11303h);
        bVar.i(this.f11304i);
        bVar.i(this.f11306k);
        bVar.i(this.f11307l);
    }

    public void b(a.b bVar) {
        a<Integer, Integer> aVar = this.f11305j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a<?, Float> aVar2 = this.f11308m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a<?, Float> aVar3 = this.f11309n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a<PointF, PointF> aVar4 = this.f11301f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a<?, PointF> aVar5 = this.f11302g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a<r4.d, r4.d> aVar6 = this.f11303h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a<Float, Float> aVar7 = this.f11304i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f11306k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f11307l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public <T> boolean c(T t10, r4.c<T> cVar) {
        a aVar;
        if (t10 == u.f9439f) {
            aVar = this.f11301f;
            if (aVar == null) {
                this.f11301f = new q(cVar, new PointF());
                return true;
            }
        } else if (t10 == u.f9440g) {
            aVar = this.f11302g;
            if (aVar == null) {
                this.f11302g = new q(cVar, new PointF());
                return true;
            }
        } else {
            if (t10 == u.f9441h) {
                a<?, PointF> aVar2 = this.f11302g;
                if (aVar2 instanceof n) {
                    ((n) aVar2).r(cVar);
                    return true;
                }
            }
            if (t10 == u.f9442i) {
                a<?, PointF> aVar3 = this.f11302g;
                if (aVar3 instanceof n) {
                    ((n) aVar3).s(cVar);
                    return true;
                }
            }
            if (t10 == u.f9448o) {
                aVar = this.f11303h;
                if (aVar == null) {
                    this.f11303h = new q(cVar, new r4.d());
                    return true;
                }
            } else if (t10 == u.f9449p) {
                aVar = this.f11304i;
                if (aVar == null) {
                    this.f11304i = new q(cVar, Float.valueOf(0.0f));
                    return true;
                }
            } else if (t10 == u.f9436c) {
                aVar = this.f11305j;
                if (aVar == null) {
                    this.f11305j = new q(cVar, 100);
                    return true;
                }
            } else if (t10 == u.C) {
                aVar = this.f11308m;
                if (aVar == null) {
                    this.f11308m = new q(cVar, Float.valueOf(100.0f));
                    return true;
                }
            } else if (t10 == u.D) {
                aVar = this.f11309n;
                if (aVar == null) {
                    this.f11309n = new q(cVar, Float.valueOf(100.0f));
                    return true;
                }
            } else if (t10 == u.f9450q) {
                if (this.f11306k == null) {
                    this.f11306k = new d(Collections.singletonList(new r4.a(Float.valueOf(0.0f))));
                }
                aVar = this.f11306k;
            } else if (t10 != u.f9451r) {
                return false;
            } else {
                if (this.f11307l == null) {
                    this.f11307l = new d(Collections.singletonList(new r4.a(Float.valueOf(0.0f))));
                }
                aVar = this.f11307l;
            }
        }
        aVar.n(cVar);
        return true;
    }

    public a<?, Float> e() {
        return this.f11309n;
    }

    public Matrix f() {
        PointF h10;
        this.f11296a.reset();
        a<?, PointF> aVar = this.f11302g;
        if (aVar != null && (h10 = aVar.h()) != null) {
            float f10 = h10.x;
            if (f10 != 0.0f || h10.y != 0.0f) {
                this.f11296a.preTranslate(f10, h10.y);
            }
        }
        a<Float, Float> aVar2 = this.f11304i;
        if (aVar2 != null) {
            float floatValue = aVar2 instanceof q ? aVar2.h().floatValue() : ((d) aVar2).p();
            if (floatValue != 0.0f) {
                this.f11296a.preRotate(floatValue);
            }
        }
        d dVar = this.f11306k;
        if (dVar != null) {
            d dVar2 = this.f11307l;
            float cos = dVar2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-dVar2.p()) + 90.0f));
            d dVar3 = this.f11307l;
            float sin = dVar3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-dVar3.p()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(dVar.p()));
            d();
            float[] fArr = this.f11300e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f11 = -sin;
            fArr[3] = f11;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f11297b.setValues(fArr);
            d();
            float[] fArr2 = this.f11300e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f11298c.setValues(fArr2);
            d();
            float[] fArr3 = this.f11300e;
            fArr3[0] = cos;
            fArr3[1] = f11;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f11299d.setValues(fArr3);
            this.f11298c.preConcat(this.f11297b);
            this.f11299d.preConcat(this.f11298c);
            this.f11296a.preConcat(this.f11299d);
        }
        a<r4.d, r4.d> aVar3 = this.f11303h;
        if (aVar3 != null) {
            r4.d h11 = aVar3.h();
            if (h11.b() != 1.0f || h11.c() != 1.0f) {
                this.f11296a.preScale(h11.b(), h11.c());
            }
        }
        a<PointF, PointF> aVar4 = this.f11301f;
        if (aVar4 != null) {
            PointF h12 = aVar4.h();
            float f12 = h12.x;
            if (f12 != 0.0f || h12.y != 0.0f) {
                this.f11296a.preTranslate(-f12, -h12.y);
            }
        }
        return this.f11296a;
    }

    public Matrix g(float f10) {
        a<?, PointF> aVar = this.f11302g;
        PointF pointF = null;
        PointF h10 = aVar == null ? null : aVar.h();
        a<r4.d, r4.d> aVar2 = this.f11303h;
        r4.d h11 = aVar2 == null ? null : aVar2.h();
        this.f11296a.reset();
        if (h10 != null) {
            this.f11296a.preTranslate(h10.x * f10, h10.y * f10);
        }
        if (h11 != null) {
            double d10 = f10;
            this.f11296a.preScale((float) Math.pow(h11.b(), d10), (float) Math.pow(h11.c(), d10));
        }
        a<Float, Float> aVar3 = this.f11304i;
        if (aVar3 != null) {
            float floatValue = aVar3.h().floatValue();
            a<PointF, PointF> aVar4 = this.f11301f;
            if (aVar4 != null) {
                pointF = aVar4.h();
            }
            Matrix matrix = this.f11296a;
            float f11 = floatValue * f10;
            float f12 = 0.0f;
            float f13 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f12 = pointF.y;
            }
            matrix.preRotate(f11, f13, f12);
        }
        return this.f11296a;
    }

    public a<?, Integer> h() {
        return this.f11305j;
    }

    public a<?, Float> i() {
        return this.f11308m;
    }

    public void j(float f10) {
        a<Integer, Integer> aVar = this.f11305j;
        if (aVar != null) {
            aVar.m(f10);
        }
        a<?, Float> aVar2 = this.f11308m;
        if (aVar2 != null) {
            aVar2.m(f10);
        }
        a<?, Float> aVar3 = this.f11309n;
        if (aVar3 != null) {
            aVar3.m(f10);
        }
        a<PointF, PointF> aVar4 = this.f11301f;
        if (aVar4 != null) {
            aVar4.m(f10);
        }
        a<?, PointF> aVar5 = this.f11302g;
        if (aVar5 != null) {
            aVar5.m(f10);
        }
        a<r4.d, r4.d> aVar6 = this.f11303h;
        if (aVar6 != null) {
            aVar6.m(f10);
        }
        a<Float, Float> aVar7 = this.f11304i;
        if (aVar7 != null) {
            aVar7.m(f10);
        }
        d dVar = this.f11306k;
        if (dVar != null) {
            dVar.m(f10);
        }
        d dVar2 = this.f11307l;
        if (dVar2 != null) {
            dVar2.m(f10);
        }
    }
}
