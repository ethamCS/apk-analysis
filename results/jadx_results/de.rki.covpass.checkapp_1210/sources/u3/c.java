package u3;

import java.io.Serializable;
/* loaded from: classes.dex */
public class c implements Serializable {

    /* renamed from: c */
    public double f23124c = 1.0d;

    /* renamed from: d */
    public int f23125d = 30;

    /* renamed from: q */
    public int f23126q = 1;

    /* renamed from: x */
    public int f23127x = 10;

    /* renamed from: y */
    public double f23128y = 0.2d;
    public double U3 = 2.0d;

    public String toString() {
        String simpleName = getClass().getSimpleName();
        double d10 = this.f23124c;
        int i10 = this.f23125d;
        int i11 = this.f23126q;
        int i12 = this.f23127x;
        double d11 = this.f23128y;
        double d12 = this.U3;
        return simpleName + "{cornerOffset=" + d10 + ", lineSamples=" + i10 + ", sampleRadius=" + i11 + ", maxIterations=" + i12 + ", convergeTolPixels=" + d11 + ", maxCornerChangePixel=" + d12 + "}";
    }
}
