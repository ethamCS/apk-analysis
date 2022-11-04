package q3;

import java.io.Serializable;
/* loaded from: classes.dex */
public class b implements Serializable {

    /* renamed from: c */
    public g f19612c;

    /* renamed from: d */
    public double f19613d;

    /* renamed from: q */
    public double f19614q = 1.0d;

    /* renamed from: x */
    public boolean f19615x = true;

    /* renamed from: y */
    public x3.b f19616y = x3.b.g(11.0d);
    public float U3 = 0.3f;
    public float V3 = -0.2f;
    public int W3 = 0;
    public int X3 = 255;
    public boolean Y3 = true;

    public static <T extends b> T c(g gVar, int i10) {
        return (T) e(gVar, x3.b.g(i10));
    }

    public static <T extends b> T e(g gVar, x3.b bVar) {
        if (gVar.g()) {
            if (gVar.h()) {
                throw new IllegalArgumentException("Type must be local");
            }
            d cVar = gVar == g.BLOCK_MIN_MAX ? new c(bVar, 10.0d, true) : gVar == g.BLOCK_OTSU ? new d() : (T) new b();
            cVar.f19614q = 0.95d;
            cVar.f19612c = gVar;
            cVar.f19616y = bVar;
            return cVar;
        }
        throw new IllegalArgumentException("Type must be adaptive");
    }

    public void b() {
    }

    public String toString() {
        g gVar = this.f19612c;
        double d10 = this.f19613d;
        double d11 = this.f19614q;
        boolean z10 = this.f19615x;
        x3.b bVar = this.f19616y;
        float f10 = this.U3;
        int i10 = this.W3;
        int i11 = this.X3;
        return "ConfigThreshold{type=" + gVar + ", fixedThreshold=" + d10 + ", scale=" + d11 + ", down=" + z10 + ", width=" + bVar + ", savolaK=" + f10 + ", minPixelValue=" + i10 + ", maxPixelValue=" + i11 + "}";
    }
}
