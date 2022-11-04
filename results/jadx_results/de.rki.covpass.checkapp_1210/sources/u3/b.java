package u3;

import java.io.Serializable;
/* loaded from: classes.dex */
public class b implements Serializable {

    /* renamed from: c */
    public boolean f23119c = false;

    /* renamed from: d */
    public x3.c f23120d = x3.c.FOUR;

    /* renamed from: q */
    public k2.a f23121q = new k2.b();

    /* renamed from: x */
    public double f23122x = 6.0d;

    /* renamed from: y */
    public double f23123y = 2.5d;
    public x3.b U3 = x3.b.i(0.05d, 4.0d);
    public boolean V3 = true;

    public b(int i10, int i11) {
        k2.a aVar = this.f23121q;
        aVar.f14573d = i10;
        aVar.f14574q = i11;
    }

    public void b() {
        this.U3.b();
    }

    public String toString() {
        k2.a aVar = this.f23121q;
        double d10 = this.f23122x;
        double d11 = this.f23123y;
        x3.b bVar = this.U3;
        boolean z10 = this.V3;
        return "ConfigPolygonFromContour{ contourToPoly=" + aVar + ", minimumEdgeIntensity=" + d10 + ", tangentEdgeIntensity=" + d11 + ", minimumContour=" + bVar + ", clockwise=" + z10 + "}";
    }
}
