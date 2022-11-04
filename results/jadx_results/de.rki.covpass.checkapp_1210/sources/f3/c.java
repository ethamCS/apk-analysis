package f3;

import c4.q;
import java.util.List;
/* loaded from: classes.dex */
public class c<T extends q<T>> {

    /* renamed from: a */
    private final int f9731a;

    /* renamed from: b */
    private final int f9732b;

    /* renamed from: c */
    private final float f9733c;

    /* renamed from: d */
    private final a3.d<T> f9734d;

    /* renamed from: e */
    private int f9735e;

    /* renamed from: f */
    private int f9736f;

    /* renamed from: g */
    private float f9737g;

    /* renamed from: h */
    private float f9738h;

    public c(int i10, int i11, double d10, Class<T> cls) {
        this.f9731a = i10;
        this.f9732b = i11;
        this.f9733c = (float) d10;
        this.f9734d = t3.a.a(cls, y3.b.EXTENDED);
    }

    public float a() {
        return this.f9737g;
    }

    public float b() {
        return this.f9738h;
    }

    public void c(List<ka.c> list, boolean z10) {
        int i10;
        if (this.f9735e != 0) {
            int i11 = 1;
            int size = list.size() <= this.f9731a ? 1 : list.size() / this.f9731a;
            int max = Math.max(1, Math.min(size / 2, 5));
            float f10 = 0.0f;
            this.f9737g = 0.0f;
            this.f9738h = 0.0f;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < list.size()) {
                ka.c cVar = list.get(i12);
                ka.c cVar2 = list.get((i12 + max) % list.size());
                float f11 = cVar2.f14865c - cVar.f14865c;
                float f12 = cVar2.f14866d - cVar.f14866d;
                float sqrt = (float) Math.sqrt((f11 * f11) + (f12 * f12));
                float f13 = f11 / sqrt;
                float f14 = f12 / sqrt;
                int i15 = 0;
                while (i15 < this.f9732b) {
                    i15++;
                    float f15 = i15 * this.f9733c;
                    float f16 = f15 * f14;
                    float f17 = cVar.f14865c + f16;
                    float f18 = f15 * f13;
                    float f19 = cVar.f14866d - f18;
                    if (f17 >= f10 && f19 >= f10 && f17 <= this.f9735e - i11 && f19 <= this.f9736f - i11) {
                        this.f9738h += this.f9734d.b(f17, f19);
                        i13++;
                    }
                    float f20 = cVar.f14865c - f16;
                    float f21 = cVar.f14866d + f18;
                    if (f20 < 0.0f || f21 < 0.0f) {
                        i10 = 1;
                    } else {
                        i10 = 1;
                        if (f20 <= this.f9735e - 1 && f21 <= this.f9736f - 1) {
                            this.f9737g += this.f9734d.b(f20, f21);
                            i14++;
                        }
                    }
                    i11 = i10;
                    f10 = 0.0f;
                }
                i12 += size;
                f10 = 0.0f;
            }
            float f22 = this.f9738h / i13;
            this.f9738h = f22;
            float f23 = this.f9737g / i14;
            this.f9737g = f23;
            if (z10) {
                return;
            }
            this.f9738h = f23;
            this.f9737g = f22;
            return;
        }
        throw new RuntimeException("You didn't call setImage()");
    }

    public void d(T t10) {
        this.f9734d.c(t10);
        this.f9735e = t10.f6220q;
        this.f9736f = t10.f6221x;
    }
}
