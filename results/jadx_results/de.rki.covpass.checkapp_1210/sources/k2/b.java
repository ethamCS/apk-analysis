package k2;
/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: y */
    public int f14577y = 2;
    public x3.b U3 = x3.b.i(1.0d, 0.0d);
    public double V3 = 0.025d;
    public double W3 = 0.2d;
    public int X3 = 50;
    public double Y3 = 2.5d;
    public x3.b Z3 = x3.b.i(0.05d, 3.0d);

    /* renamed from: a4 */
    public int f14576a4 = 10;

    public void b() {
        this.U3.b();
    }

    public String toString() {
        int i10 = this.f14577y;
        x3.b bVar = this.U3;
        double d10 = this.V3;
        double d11 = this.W3;
        int i11 = this.X3;
        double d12 = this.Y3;
        x3.b bVar2 = this.Z3;
        int i12 = this.f14576a4;
        boolean z10 = this.f14572c;
        int i13 = this.f14573d;
        int i14 = this.f14574q;
        boolean z11 = this.f14575x;
        return "ConfigPolylineSplitMerge{minimumSideLength=" + i10 + ", extraConsider=" + bVar + ", cornerScorePenalty=" + d10 + ", thresholdSideSplitScore=" + d11 + ", maxNumberOfSideSamples=" + i11 + ", convexTest=" + d12 + ", maxSideError=" + bVar2 + ", refineIterations=" + i12 + ", loops=" + z10 + ", minimumSides=" + i13 + ", maximumSides=" + i14 + ", convex=" + z11 + "}";
    }
}
