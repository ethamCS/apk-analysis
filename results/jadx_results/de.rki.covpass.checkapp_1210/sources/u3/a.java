package u3;

import java.io.Serializable;
/* loaded from: classes.dex */
public class a implements Serializable {

    /* renamed from: c */
    public b f23114c = new b(3, 10000);

    /* renamed from: d */
    public double f23115d = 6.0d;

    /* renamed from: q */
    public boolean f23116q = false;

    /* renamed from: x */
    public boolean f23117x = true;

    /* renamed from: y */
    public c f23118y = new c();

    public void b() {
    }

    public String toString() {
        b bVar = this.f23114c;
        double d10 = this.f23115d;
        boolean z10 = this.f23116q;
        c cVar = this.f23118y;
        return "ConfigPolygonDetector{detector=" + bVar + ", minimumEdgeIntensity=" + d10 + ", refineContour=" + z10 + ", refineGray=" + cVar + "}";
    }
}
