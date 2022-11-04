package g4;

import android.graphics.Path;
import android.graphics.PointF;
import h4.a;
import java.util.List;
import l4.j;
import l4.s;
/* loaded from: classes.dex */
public class n implements m, a.b, k {

    /* renamed from: b */
    private final String f10472b;

    /* renamed from: c */
    private final com.airbnb.lottie.n f10473c;

    /* renamed from: d */
    private final j.a f10474d;

    /* renamed from: e */
    private final boolean f10475e;

    /* renamed from: f */
    private final boolean f10476f;

    /* renamed from: g */
    private final h4.a<?, Float> f10477g;

    /* renamed from: h */
    private final h4.a<?, PointF> f10478h;

    /* renamed from: i */
    private final h4.a<?, Float> f10479i;

    /* renamed from: j */
    private final h4.a<?, Float> f10480j;

    /* renamed from: k */
    private final h4.a<?, Float> f10481k;

    /* renamed from: l */
    private final h4.a<?, Float> f10482l;

    /* renamed from: m */
    private final h4.a<?, Float> f10483m;

    /* renamed from: o */
    private boolean f10485o;

    /* renamed from: a */
    private final Path f10471a = new Path();

    /* renamed from: n */
    private final b f10484n = new b();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10486a;

        static {
            int[] iArr = new int[j.a.values().length];
            f10486a = iArr;
            try {
                iArr[j.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10486a[j.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n(com.airbnb.lottie.n nVar, m4.b bVar, l4.j jVar) {
        h4.a<Float, Float> aVar;
        this.f10473c = nVar;
        this.f10472b = jVar.d();
        j.a j10 = jVar.j();
        this.f10474d = j10;
        this.f10475e = jVar.k();
        this.f10476f = jVar.l();
        h4.a<Float, Float> n10 = jVar.g().n();
        this.f10477g = n10;
        h4.a<PointF, PointF> n11 = jVar.h().n();
        this.f10478h = n11;
        h4.a<Float, Float> n12 = jVar.i().n();
        this.f10479i = n12;
        h4.a<Float, Float> n13 = jVar.e().n();
        this.f10481k = n13;
        h4.a<Float, Float> n14 = jVar.f().n();
        this.f10483m = n14;
        j.a aVar2 = j.a.STAR;
        if (j10 == aVar2) {
            this.f10480j = jVar.b().n();
            aVar = jVar.c().n();
        } else {
            aVar = null;
            this.f10480j = null;
        }
        this.f10482l = aVar;
        bVar.i(n10);
        bVar.i(n11);
        bVar.i(n12);
        bVar.i(n13);
        bVar.i(n14);
        if (j10 == aVar2) {
            bVar.i(this.f10480j);
            bVar.i(this.f10482l);
        }
        n10.a(this);
        n11.a(this);
        n12.a(this);
        n13.a(this);
        n14.a(this);
        if (j10 == aVar2) {
            this.f10480j.a(this);
            this.f10482l.a(this);
        }
    }

    private void d() {
        h4.a<?, Float> aVar;
        double d10;
        double d11;
        double d12;
        int i10;
        int floor = (int) Math.floor(this.f10477g.h().floatValue());
        double radians = Math.toRadians((this.f10479i == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d13 = floor;
        float floatValue = this.f10483m.h().floatValue() / 100.0f;
        float floatValue2 = this.f10481k.h().floatValue();
        double d14 = floatValue2;
        float cos = (float) (Math.cos(radians) * d14);
        float sin = (float) (Math.sin(radians) * d14);
        this.f10471a.moveTo(cos, sin);
        double d15 = (float) (6.283185307179586d / d13);
        double d16 = radians + d15;
        double ceil = Math.ceil(d13);
        int i11 = 0;
        while (i11 < ceil) {
            float cos2 = (float) (Math.cos(d16) * d14);
            double d17 = ceil;
            float sin2 = (float) (d14 * Math.sin(d16));
            if (floatValue != 0.0f) {
                d12 = d14;
                i10 = i11;
                d11 = d16;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                d10 = d15;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f10 = floatValue2 * floatValue * 0.25f;
                this.f10471a.cubicTo(cos - (cos3 * f10), sin - (((float) Math.sin(atan2)) * f10), cos2 + (((float) Math.cos(atan22)) * f10), sin2 + (f10 * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                d11 = d16;
                d12 = d14;
                d10 = d15;
                i10 = i11;
                this.f10471a.lineTo(cos2, sin2);
            }
            d16 = d11 + d10;
            i11 = i10 + 1;
            sin = sin2;
            cos = cos2;
            ceil = d17;
            d14 = d12;
            d15 = d10;
        }
        PointF h10 = this.f10478h.h();
        this.f10471a.offset(h10.x, h10.y);
        this.f10471a.close();
    }

    private void i() {
        h4.a<?, Float> aVar;
        double d10;
        int i10;
        float f10;
        float f11;
        float f12;
        double d11;
        float f13;
        float f14;
        double d12;
        float f15;
        float f16;
        float f17;
        float f18;
        float floatValue = this.f10477g.h().floatValue();
        double radians = Math.toRadians((this.f10479i == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d13 = floatValue;
        float f19 = (float) (6.283185307179586d / d13);
        if (this.f10476f) {
            f19 *= -1.0f;
        }
        float f20 = f19 / 2.0f;
        float f21 = floatValue - ((int) floatValue);
        int i11 = (f21 > 0.0f ? 1 : (f21 == 0.0f ? 0 : -1));
        if (i11 != 0) {
            radians += (1.0f - f21) * f20;
        }
        float floatValue2 = this.f10481k.h().floatValue();
        float floatValue3 = this.f10480j.h().floatValue();
        h4.a<?, Float> aVar2 = this.f10482l;
        float floatValue4 = aVar2 != null ? aVar2.h().floatValue() / 100.0f : 0.0f;
        h4.a<?, Float> aVar3 = this.f10483m;
        float floatValue5 = aVar3 != null ? aVar3.h().floatValue() / 100.0f : 0.0f;
        if (i11 != 0) {
            f10 = ((floatValue2 - floatValue3) * f21) + floatValue3;
            i10 = i11;
            double d14 = f10;
            d10 = d13;
            f12 = (float) (d14 * Math.cos(radians));
            f11 = (float) (d14 * Math.sin(radians));
            this.f10471a.moveTo(f12, f11);
            d11 = radians + ((f19 * f21) / 2.0f);
        } else {
            d10 = d13;
            i10 = i11;
            double d15 = floatValue2;
            float cos = (float) (Math.cos(radians) * d15);
            float sin = (float) (d15 * Math.sin(radians));
            this.f10471a.moveTo(cos, sin);
            d11 = radians + f20;
            f12 = cos;
            f11 = sin;
            f10 = 0.0f;
        }
        double ceil = Math.ceil(d10) * 2.0d;
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            double d16 = i12;
            if (d16 >= ceil) {
                PointF h10 = this.f10478h.h();
                this.f10471a.offset(h10.x, h10.y);
                this.f10471a.close();
                return;
            }
            float f22 = z10 ? floatValue2 : floatValue3;
            int i13 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i13 == 0 || d16 != ceil - 2.0d) {
                f13 = f19;
                f14 = f20;
            } else {
                f13 = f19;
                f14 = (f19 * f21) / 2.0f;
            }
            if (i13 == 0 || d16 != ceil - 1.0d) {
                f15 = f20;
                d12 = d16;
                f16 = f22;
            } else {
                f15 = f20;
                d12 = d16;
                f16 = f10;
            }
            double d17 = f16;
            double d18 = ceil;
            float cos2 = (float) (d17 * Math.cos(d11));
            float sin2 = (float) (d17 * Math.sin(d11));
            if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                this.f10471a.lineTo(cos2, sin2);
                f18 = floatValue4;
                f17 = f10;
            } else {
                f18 = floatValue4;
                f17 = f10;
                double atan2 = (float) (Math.atan2(f11, f12) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float cos4 = (float) Math.cos(atan22);
                float sin4 = (float) Math.sin(atan22);
                float f23 = z10 ? f18 : floatValue5;
                float f24 = z10 ? floatValue5 : f18;
                float f25 = (z10 ? floatValue3 : floatValue2) * f23 * 0.47829f;
                float f26 = cos3 * f25;
                float f27 = f25 * sin3;
                float f28 = (z10 ? floatValue2 : floatValue3) * f24 * 0.47829f;
                float f29 = cos4 * f28;
                float f30 = f28 * sin4;
                if (i10 != 0) {
                    if (i12 == 0) {
                        f26 *= f21;
                        f27 *= f21;
                    } else if (d12 == d18 - 1.0d) {
                        f29 *= f21;
                        f30 *= f21;
                    }
                }
                this.f10471a.cubicTo(f12 - f26, f11 - f27, cos2 + f29, sin2 + f30, cos2, sin2);
            }
            d11 += f14;
            z10 = !z10;
            i12++;
            f12 = cos2;
            f11 = sin2;
            floatValue4 = f18;
            f10 = f17;
            f20 = f15;
            f19 = f13;
            ceil = d18;
        }
    }

    private void j() {
        this.f10485o = false;
        this.f10473c.invalidateSelf();
    }

    @Override // h4.a.b
    public void b() {
        j();
    }

    @Override // g4.c
    public void c(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == s.a.SIMULTANEOUSLY) {
                    this.f10484n.a(uVar);
                    uVar.d(this);
                }
            }
        }
    }

    @Override // j4.f
    public <T> void e(T t10, r4.c<T> cVar) {
        h4.a aVar;
        h4.a<?, Float> aVar2;
        if (t10 == e4.u.f9456w) {
            aVar = this.f10477g;
        } else if (t10 == e4.u.f9457x) {
            aVar = this.f10479i;
        } else if (t10 != e4.u.f9447n) {
            if (t10 != e4.u.f9458y || (aVar2 = this.f10480j) == null) {
                if (t10 == e4.u.f9459z) {
                    aVar = this.f10481k;
                } else if (t10 != e4.u.A || (aVar2 = this.f10482l) == null) {
                    if (t10 != e4.u.B) {
                        return;
                    }
                    aVar = this.f10483m;
                }
            }
            aVar2.n(cVar);
            return;
        } else {
            aVar = this.f10478h;
        }
        aVar.n(cVar);
    }

    @Override // g4.c
    public String getName() {
        return this.f10472b;
    }

    @Override // j4.f
    public void h(j4.e eVar, int i10, List<j4.e> list, j4.e eVar2) {
        q4.g.k(eVar, i10, list, eVar2, this);
    }

    @Override // g4.m
    public Path l() {
        if (this.f10485o) {
            return this.f10471a;
        }
        this.f10471a.reset();
        if (!this.f10475e) {
            int i10 = a.f10486a[this.f10474d.ordinal()];
            if (i10 == 1) {
                i();
            } else if (i10 == 2) {
                d();
            }
            this.f10471a.close();
            this.f10484n.b(this.f10471a);
        }
        this.f10485o = true;
        return this.f10471a;
    }
}
