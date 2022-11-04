package i7;

import h6.m;
import h6.s;
import h6.t;
import h7.j;
import java.util.Map;
import o6.g;
import o6.i;
import o6.k;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    private final o6.b f12329a;

    /* renamed from: b */
    private t f12330b;

    public c(o6.b bVar) {
        this.f12329a = bVar;
    }

    private float b(s sVar, s sVar2) {
        float j10 = j((int) sVar.c(), (int) sVar.d(), (int) sVar2.c(), (int) sVar2.d());
        float j11 = j((int) sVar2.c(), (int) sVar2.d(), (int) sVar.c(), (int) sVar.d());
        return Float.isNaN(j10) ? j11 / 7.0f : Float.isNaN(j11) ? j10 / 7.0f : (j10 + j11) / 14.0f;
    }

    private static int c(s sVar, s sVar2, s sVar3, float f10) {
        int c10 = ((p6.a.c(s.b(sVar, sVar2) / f10) + p6.a.c(s.b(sVar, sVar3) / f10)) / 2) + 7;
        int i10 = c10 & 3;
        if (i10 != 0) {
            if (i10 == 2) {
                return c10 - 1;
            }
            if (i10 == 3) {
                throw m.b();
            }
            return c10;
        }
        return c10 + 1;
    }

    private static k d(s sVar, s sVar2, s sVar3, s sVar4, int i10) {
        float f10;
        float f11;
        float f12;
        float f13 = i10 - 3.5f;
        if (sVar4 != null) {
            f11 = sVar4.c();
            f10 = sVar4.d();
            f12 = f13 - 3.0f;
        } else {
            f11 = (sVar2.c() - sVar.c()) + sVar3.c();
            f10 = (sVar2.d() - sVar.d()) + sVar3.d();
            f12 = f13;
        }
        return k.b(3.5f, 3.5f, f13, 3.5f, f12, f12, 3.5f, f13, sVar.c(), sVar.d(), sVar2.c(), sVar2.d(), f11, f10, sVar3.c(), sVar3.d());
    }

    private static o6.b h(o6.b bVar, k kVar, int i10) {
        return i.b().d(bVar, i10, i10, kVar);
    }

    private float i(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z10;
        c cVar;
        boolean z11;
        boolean z12 = true;
        boolean z13 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z13) {
            i16 = i10;
            i17 = i11;
            i14 = i12;
            i15 = i13;
        } else {
            i17 = i10;
            i16 = i11;
            i15 = i12;
            i14 = i13;
        }
        int abs = Math.abs(i15 - i17);
        int abs2 = Math.abs(i14 - i16);
        int i20 = 2;
        int i21 = (-abs) / 2;
        int i22 = -1;
        int i23 = i17 < i15 ? 1 : -1;
        if (i16 < i14) {
            i22 = 1;
        }
        int i24 = i15 + i23;
        int i25 = i17;
        int i26 = i16;
        int i27 = 0;
        while (true) {
            if (i25 == i24) {
                i18 = i24;
                i19 = i20;
                break;
            }
            int i28 = z13 ? i26 : i25;
            int i29 = z13 ? i25 : i26;
            if (i27 == z12) {
                z10 = z13;
                z11 = z12;
                i18 = i24;
                cVar = this;
            } else {
                cVar = this;
                z10 = z13;
                i18 = i24;
                z11 = false;
            }
            if (z11 == cVar.f12329a.f(i28, i29)) {
                if (i27 == 2) {
                    return p6.a.b(i25, i26, i17, i16);
                }
                i27++;
            }
            i21 += abs2;
            if (i21 > 0) {
                if (i26 == i14) {
                    i19 = 2;
                    break;
                }
                i26 += i22;
                i21 -= abs;
            }
            i25 += i23;
            i24 = i18;
            z13 = z10;
            z12 = true;
            i20 = 2;
        }
        if (i27 == i19) {
            return p6.a.b(i18, i14, i17, i16);
        }
        return Float.NaN;
    }

    private float j(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float i14 = i(i10, i11, i12, i13);
        int i15 = i10 - (i12 - i10);
        int i16 = 0;
        if (i15 < 0) {
            f10 = i10 / (i10 - i15);
            i15 = 0;
        } else if (i15 >= this.f12329a.l()) {
            f10 = ((this.f12329a.l() - 1) - i10) / (i15 - i10);
            i15 = this.f12329a.l() - 1;
        } else {
            f10 = 1.0f;
        }
        float f12 = i11;
        int i17 = (int) (f12 - ((i13 - i11) * f10));
        if (i17 < 0) {
            f11 = f12 / (i11 - i17);
        } else if (i17 >= this.f12329a.i()) {
            f11 = ((this.f12329a.i() - 1) - i11) / (i17 - i11);
            i16 = this.f12329a.i() - 1;
        } else {
            i16 = i17;
            f11 = 1.0f;
        }
        return (i14 + i(i10, i11, (int) (i10 + ((i15 - i10) * f11)), i16)) - 1.0f;
    }

    protected final float a(s sVar, s sVar2, s sVar3) {
        return (b(sVar, sVar2) + b(sVar, sVar3)) / 2.0f;
    }

    public final g e(Map<h6.e, ?> map) {
        this.f12330b = map == null ? null : (t) map.get(h6.e.NEED_RESULT_POINT_CALLBACK);
        return g(new e(this.f12329a, this.f12330b).g(map));
    }

    protected final a f(float f10, int i10, int i11, float f11) {
        int i12 = (int) (f11 * f10);
        int max = Math.max(0, i10 - i12);
        int min = Math.min(this.f12329a.l() - 1, i10 + i12) - max;
        float f12 = 3.0f * f10;
        if (min >= f12) {
            int max2 = Math.max(0, i11 - i12);
            int min2 = Math.min(this.f12329a.i() - 1, i11 + i12) - max2;
            if (min2 < f12) {
                throw m.b();
            }
            return new b(this.f12329a, max, max2, min, min2, f10, this.f12330b).c();
        }
        throw m.b();
    }

    protected final g g(f fVar) {
        d b10 = fVar.b();
        d c10 = fVar.c();
        d a10 = fVar.a();
        float a11 = a(b10, c10, a10);
        if (a11 >= 1.0f) {
            int c11 = c(b10, c10, a10, a11);
            j g10 = j.g(c11);
            int e10 = g10.e() - 7;
            a aVar = null;
            if (g10.d().length > 0) {
                float c12 = (c10.c() - b10.c()) + a10.c();
                float d10 = (c10.d() - b10.d()) + a10.d();
                float f10 = 1.0f - (3.0f / e10);
                int c13 = (int) (b10.c() + ((c12 - b10.c()) * f10));
                int d11 = (int) (b10.d() + (f10 * (d10 - b10.d())));
                for (int i10 = 4; i10 <= 16; i10 <<= 1) {
                    try {
                        aVar = f(a11, c13, d11, i10);
                        break;
                    } catch (m unused) {
                    }
                }
            }
            return new g(h(this.f12329a, d(b10, c10, a10, aVar, c11), c11), aVar == null ? new s[]{a10, b10, c10} : new s[]{a10, b10, c10, aVar});
        }
        throw m.b();
    }
}
