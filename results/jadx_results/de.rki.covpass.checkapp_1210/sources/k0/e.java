package k0;

import java.text.DecimalFormat;
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a */
    protected a f14547a;

    /* renamed from: b */
    protected int[] f14548b = new int[10];

    /* renamed from: c */
    protected float[] f14549c = new float[10];

    /* renamed from: d */
    private int f14550d;

    /* renamed from: e */
    private String f14551e;

    public float a(float f10) {
        return (float) this.f14547a.a(f10, 0);
    }

    public String toString() {
        String str = this.f14551e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f14550d; i10++) {
            str = str + "[" + this.f14548b[i10] + " , " + decimalFormat.format(this.f14549c[i10]) + "] ";
        }
        return str;
    }
}
