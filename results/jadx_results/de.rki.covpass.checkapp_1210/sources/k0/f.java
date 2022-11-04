package k0;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a */
    protected a f14552a;

    /* renamed from: e */
    protected int f14556e;

    /* renamed from: f */
    protected String f14557f;

    /* renamed from: i */
    protected long f14560i;

    /* renamed from: b */
    protected int f14553b = 0;

    /* renamed from: c */
    protected int[] f14554c = new int[10];

    /* renamed from: d */
    protected float[][] f14555d = (float[][]) Array.newInstance(float.class, 10, 3);

    /* renamed from: g */
    protected float[] f14558g = new float[3];

    /* renamed from: h */
    protected boolean f14559h = false;

    /* renamed from: j */
    protected float f14561j = Float.NaN;

    public String toString() {
        String str = this.f14557f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f14556e; i10++) {
            str = str + "[" + this.f14554c[i10] + " , " + decimalFormat.format(this.f14555d[i10]) + "] ";
        }
        return str;
    }
}
