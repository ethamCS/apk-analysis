package p2;

import c4.q;
import p2.g;
/* loaded from: classes.dex */
public class h<T extends c4.q<T>> {

    /* renamed from: b */
    i<T> f18792b;

    /* renamed from: e */
    g f18795e;

    /* renamed from: f */
    float f18796f;

    /* renamed from: a */
    private final ok.m<g.a> f18791a = new ok.m<>(g.a.class);

    /* renamed from: c */
    float[] f18793c = new float[12];

    /* renamed from: d */
    float[] f18794d = new float[12];

    /* renamed from: g */
    float[] f18797g = new float[9];

    public h(Class<T> cls) {
        this.f18792b = new i<>(cls);
    }

    boolean a(g.a aVar, float f10, float f11) {
        double d10;
        double d11;
        float f12 = 1.0f;
        int i10 = 0;
        float f13 = f10;
        float f14 = f11;
        float f15 = f14;
        float f16 = 1.0f;
        int i11 = 0;
        float f17 = Float.MAX_VALUE;
        float f18 = f13;
        while (i11 < 10) {
            int i12 = i10;
            while (true) {
                if (i12 >= 3) {
                    break;
                }
                float f19 = (f18 - f12) + i12;
                int i13 = i10;
                for (int i14 = 3; i13 < i14; i14 = 3) {
                    this.f18797g[(i12 * 3) + i13] = this.f18792b.d(f19, (f14 - f12) + i13);
                    i13++;
                    f12 = 1.0f;
                }
                i12++;
                f12 = 1.0f;
            }
            float[] fArr = this.f18797g;
            float f20 = ((fArr[2] + fArr[5]) + fArr[8]) - ((fArr[i10] + fArr[3]) + fArr[6]);
            float f21 = ((fArr[6] + fArr[7]) + fArr[8]) - ((fArr[i10] + fArr[1]) + fArr[2]);
            float f22 = f18;
            float sqrt = (float) Math.sqrt((f20 * f20) + (f21 * f21));
            if (f17 > sqrt) {
                f13 = f22;
                f17 = sqrt;
                f15 = f14;
            } else {
                f16 *= 0.75f;
            }
            if (sqrt <= 0.0f) {
                break;
            }
            f14 = f15 + ((f20 * f16) / sqrt);
            f18 = f13 + ((f21 * f16) / sqrt);
            i11++;
            f12 = 1.0f;
            i10 = 0;
        }
        ka.b bVar = aVar.f18766d;
        bVar.f10622c = f15;
        bVar.f10623d = f13;
        this.f18792b.b((float) d11, (float) d10, aVar.f18763a);
        return true;
    }

    void b(g gVar) {
        int[] iArr = g.f18746k4[gVar.W3].f18789b;
        gVar.Z3.r();
        this.f18791a.k();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            for (int i11 = 0; i11 < iArr.length; i11++) {
                boolean z10 = true;
                if ((i10 != 0 || i11 != 0) && ((i10 != 0 || i11 != iArr.length - 1) && (i10 != iArr.length - 1 || i11 != 0))) {
                    z10 = false;
                }
                if (z10) {
                    this.f18791a.h(null);
                } else {
                    g.a i12 = gVar.Z3.i();
                    i12.f18764b = iArr[i11];
                    i12.f18765c = iArr[i10];
                    this.f18791a.h(i12);
                }
            }
        }
    }

    boolean c(int[] iArr) {
        g.a c10;
        g.a c11;
        int length = iArr.length;
        int i10 = 0;
        while (i10 < length) {
            for (int i11 = 0; i11 < length; i11++) {
                int i12 = (i10 * length) + i11;
                g.a c12 = this.f18791a.c(i12);
                if (c12 != null) {
                    double d10 = 0.0d;
                    double d11 = (i10 <= 0 || (c11 = this.f18791a.c(((i10 + (-1)) * length) + i11)) == null) ? 0.0d : (c11.f18765c + 0.5d) - c11.f18766d.f10623d;
                    if (i11 > 0 && (c10 = this.f18791a.c(i12 - 1)) != null) {
                        d10 = (c10.f18764b + 0.5d) - c10.f18766d.f10622c;
                    }
                    if (!a(c12, (float) (c12.f18765c + 0.5d + d11), (float) (c12.f18764b + 0.5d + d10))) {
                        return false;
                    }
                    ka.b bVar = c12.f18766d;
                    if (!d(c12, (float) bVar.f10623d, (float) bVar.f10622c)) {
                        return false;
                    }
                }
            }
            i10++;
        }
        return true;
    }

    boolean d(g.a aVar, float f10, float f11) {
        double d10;
        double d11;
        g.a aVar2 = aVar;
        float f12 = f11;
        float f13 = 1.0f;
        int i10 = 0;
        float f14 = f10;
        while (i10 < 10) {
            float f15 = 0.0f;
            float f16 = 0.0f;
            float f17 = 0.0f;
            int i11 = 0;
            while (true) {
                int i12 = 8;
                if (i11 < 8) {
                    float f18 = 3.0f;
                    float f19 = 7.0f;
                    float f20 = ((i11 * 3.0f) / 7.0f) - 1.5f;
                    float f21 = f14 + f20;
                    int i13 = 0;
                    while (i13 < i12) {
                        float f22 = ((i13 * f18) / f19) - 1.5f;
                        float d12 = this.f18792b.d(f21, f12 + f22);
                        float f23 = f21;
                        float f24 = f14;
                        float max = Math.max(-10.0f, ((double) ((float) Math.sqrt((double) ((f22 * f22) + (f20 * f20))))) > 0.5d ? d12 - this.f18796f : this.f18796f - d12);
                        f16 += Math.abs(max);
                        f15 += f22 * max;
                        f17 += max * f20;
                        i13++;
                        f14 = f24;
                        f21 = f23;
                        i12 = 8;
                        f18 = 3.0f;
                        f19 = 7.0f;
                    }
                    i11++;
                }
            }
            f12 += (f15 * f13) / f16;
            f14 += (f17 * f13) / f16;
            f13 *= 0.7f;
            i10++;
            aVar2 = aVar;
        }
        float f25 = f14;
        ka.b bVar = aVar2.f18766d;
        bVar.f10622c = f12;
        bVar.f10623d = f25;
        this.f18792b.b((float) d11, (float) d10, aVar2.f18763a);
        return true;
    }

    public boolean e(T t10, g gVar) {
        this.f18795e = gVar;
        gVar.Z3.r();
        this.f18792b.g(t10);
        this.f18792b.h(gVar);
        this.f18796f = (float) gVar.f18762y;
        b(gVar);
        int i10 = gVar.W3;
        if (i10 <= 1) {
            return true;
        }
        return c(g.f18746k4[i10].f18789b);
    }
}
