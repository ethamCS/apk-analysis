package u3;
@Deprecated
/* loaded from: classes.dex */
public class d extends k2.a {

    /* renamed from: y */
    public double f23129y = 0.05d;
    public int U3 = 10;
    public int V3 = 20;
    public double W3 = 2.0d;
    public x3.b X3 = x3.b.i(0.025d, 10.0d);
    public boolean Y3 = true;

    public void b() {
        this.X3.b();
    }

    public String toString() {
        double d10 = this.f23129y;
        int i10 = this.U3;
        x3.b bVar = this.X3;
        boolean z10 = this.Y3;
        return "ConfigSplitMergeLineFit{splitFraction=" + d10 + ", iterations=" + i10 + ", minimumSide=" + bVar + ", loop=" + z10 + "}";
    }
}
