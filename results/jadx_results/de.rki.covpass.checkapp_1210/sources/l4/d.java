package l4;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    private final float[] f15706a;

    /* renamed from: b */
    private final int[] f15707b;

    public d(float[] fArr, int[] iArr) {
        this.f15706a = fArr;
        this.f15707b = iArr;
    }

    public int[] a() {
        return this.f15707b;
    }

    public float[] b() {
        return this.f15706a;
    }

    public int c() {
        return this.f15707b.length;
    }

    public void d(d dVar, d dVar2, float f10) {
        if (dVar.f15707b.length == dVar2.f15707b.length) {
            for (int i10 = 0; i10 < dVar.f15707b.length; i10++) {
                this.f15706a[i10] = q4.g.i(dVar.f15706a[i10], dVar2.f15706a[i10], f10);
                this.f15707b[i10] = q4.b.c(f10, dVar.f15707b[i10], dVar2.f15707b[i10]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f15707b.length + " vs " + dVar2.f15707b.length + ")");
    }
}
