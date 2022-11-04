package y6;

import h6.m;
import x6.r;
/* loaded from: classes.dex */
public abstract class a extends r {

    /* renamed from: b */
    private final int[] f25845b;

    /* renamed from: e */
    private final int[] f25848e;

    /* renamed from: f */
    private final int[] f25849f;

    /* renamed from: a */
    private final int[] f25844a = new int[4];

    /* renamed from: c */
    private final float[] f25846c = new float[4];

    /* renamed from: d */
    private final float[] f25847d = new float[4];

    public a() {
        int[] iArr = new int[8];
        this.f25845b = iArr;
        this.f25848e = new int[iArr.length / 2];
        this.f25849f = new int[iArr.length / 2];
    }

    public static void h(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            if (fArr[i11] < f10) {
                f10 = fArr[i11];
                i10 = i11;
            }
        }
        iArr[i10] = iArr[i10] - 1;
    }

    public static void o(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            if (fArr[i11] > f10) {
                f10 = fArr[i11];
                i10 = i11;
            }
        }
        iArr[i10] = iArr[i10] + 1;
    }

    public static boolean p(int[] iArr) {
        int i10;
        float f10 = (iArr[0] + iArr[1]) / ((iArr[2] + i10) + iArr[3]);
        if (f10 >= 0.7916667f && f10 <= 0.89285713f) {
            int i11 = Integer.MAX_VALUE;
            int i12 = Integer.MIN_VALUE;
            for (int i13 : iArr) {
                if (i13 > i12) {
                    i12 = i13;
                }
                if (i13 < i11) {
                    i11 = i13;
                }
            }
            if (i12 < i11 * 10) {
                return true;
            }
        }
        return false;
    }

    public static int q(int[] iArr, int[][] iArr2) {
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            if (r.e(iArr, iArr2[i10], 0.45f) < 0.2f) {
                return i10;
            }
        }
        throw m.b();
    }

    public final int[] i() {
        return this.f25845b;
    }

    public final int[] j() {
        return this.f25844a;
    }

    public final int[] k() {
        return this.f25849f;
    }

    public final float[] l() {
        return this.f25847d;
    }

    public final int[] m() {
        return this.f25848e;
    }

    public final float[] n() {
        return this.f25846c;
    }
}
