package e3;

import c4.q;
import ok.f;
/* loaded from: classes.dex */
public class e<T extends q<T>> extends a<T> {

    /* renamed from: d */
    protected int f9365d;

    /* renamed from: e */
    protected int f9366e;

    /* renamed from: f */
    private final ja.d f9367f = new ja.d();

    /* renamed from: g */
    protected f f9368g = new f();

    /* renamed from: h */
    protected ok.b<ka.b> f9369h = new ok.b<>(d.f9364a);

    /* renamed from: i */
    protected ka.b f9370i = new ka.b();

    /* renamed from: j */
    protected double f9371j;

    public e(int i10, int i11, Class<T> cls) {
        super(cls);
        if (i11 >= 1) {
            this.f9365d = i10;
            this.f9366e = i11;
            return;
        }
        throw new IllegalArgumentException("Tangential samples must be >= 1 or else it won't work");
    }

    protected void b(double d10, double d11, double d12, double d13, double d14, double d15) {
        int i10;
        double d16;
        double d17;
        int i11;
        double d18;
        double d19;
        this.f9369h.r();
        this.f9368g.d();
        int i12 = (this.f9366e * 2) + 2;
        int i13 = i12 - 1;
        double d20 = i12;
        double d21 = d20 * d14;
        double d22 = d20 * d15;
        int i14 = 0;
        while (true) {
            if (i14 < this.f9365d) {
                double d23 = i14 / (i10 - 1);
                double d24 = (d12 + (d10 * d23)) - (d21 / 2.0d);
                double d25 = (d13 + (d11 * d23)) - (d22 / 2.0d);
                if (this.f9351b.b(d24, d25)) {
                    int i15 = i13;
                    if (!this.f9351b.b(d24 + d21, d25 + d22)) {
                        d16 = d22;
                        d17 = d21;
                        i11 = i15;
                        i14++;
                        i13 = i11;
                        d21 = d17;
                        d22 = d16;
                    } else {
                        double d26 = d24 + d14;
                        double d27 = d25 + d15;
                        double a10 = this.f9351b.a(d24, d25, d26, d27);
                        i11 = i15;
                        int i16 = 0;
                        while (i16 < i11) {
                            if (i16 == i11 - 1) {
                                d16 = d22;
                                if (!this.f9351b.b(d26 + d14, d27 + d15)) {
                                    break;
                                }
                            } else {
                                d16 = d22;
                            }
                            double d28 = d26 + d14;
                            double d29 = d27 + d15;
                            double a11 = this.f9351b.a(d26, d27, d28, d29);
                            double d30 = a10 - a11;
                            if (d30 < 0.0d) {
                                d30 = -d30;
                            }
                            if (d30 > 0.0d) {
                                this.f9368g.a(d30);
                                ka.b bVar = this.f9370i;
                                d19 = a11;
                                double d31 = d26 - bVar.f10622c;
                                double d32 = this.f9371j;
                                d18 = d21;
                                this.f9369h.i().i(d31 / d32, (d27 - bVar.f10623d) / d32);
                            } else {
                                d19 = a11;
                                d18 = d21;
                            }
                            i16++;
                            d26 = d28;
                            a10 = d19;
                            d21 = d18;
                            d22 = d16;
                            d27 = d29;
                        }
                    }
                } else {
                    i11 = i13;
                }
                d16 = d22;
                d17 = d21;
                i14++;
                i13 = i11;
                d21 = d17;
                d22 = d16;
            } else {
                return;
            }
        }
    }

    protected void c(ja.b bVar) {
        double d10 = this.f9371j * bVar.f14235q;
        ka.b bVar2 = this.f9370i;
        bVar.f14235q = (d10 - (bVar2.f10622c * bVar.f14233c)) - (bVar2.f10623d * bVar.f14234d);
    }

    public boolean d(ka.b bVar, ka.b bVar2, ja.b bVar3) {
        ka.b bVar4 = this.f9370i;
        bVar4.f10622c = (bVar.f10622c + bVar2.f10622c) / 2.0d;
        bVar4.f10623d = (bVar.f10623d + bVar2.f10623d) / 2.0d;
        this.f9371j = bVar.c(bVar4);
        double d10 = bVar2.f10622c - bVar.f10622c;
        double d11 = bVar2.f10623d - bVar.f10623d;
        double sqrt = Math.sqrt((d10 * d10) + (d11 * d11));
        b(d10, d11, bVar.f10622c, bVar.f10623d, d11 / sqrt, (-d10) / sqrt);
        if (this.f9369h.g() >= 4) {
            if (ca.a.b(this.f9369h.t(), this.f9368g.f18607a, this.f9367f) == null) {
                throw new RuntimeException("All weights were zero, bug some place");
            }
            da.c.a(this.f9367f, bVar3);
            c(bVar3);
            return true;
        }
        return false;
    }
}
