package c.a.a.b;
/* loaded from: classes.dex */
class a {
    public static float a(float[] fArr) {
        float f = 0.0f;
        for (float f2 : fArr) {
            f += f2 * f2;
        }
        return (float) Math.sqrt(f);
    }

    public static float a(float[] fArr, float[] fArr2) {
        return (fArr[0] * fArr2[0]) + (fArr[1] * fArr2[1]) + (fArr[2] * fArr2[2]);
    }

    public static float b(float[] fArr) {
        float f = 0.0f;
        for (float f2 : fArr) {
            f += f2;
        }
        return f;
    }
}
