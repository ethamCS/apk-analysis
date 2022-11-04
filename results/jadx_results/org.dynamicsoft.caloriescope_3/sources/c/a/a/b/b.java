package c.a.a.b;

import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.appcompat.app.e;
/* loaded from: classes.dex */
public class b extends e {
    private c B;
    private final float[] t = new float[50];
    private final float[] u = new float[50];
    private final float[] v = new float[50];
    private final float[] w = new float[10];
    private int x = 0;
    private int y = 0;
    private long z = 0;
    private float A = 0.0f;

    public void a(long j, float f, float f2, float f3, float f4) {
        float[] fArr = {f, f2, f3};
        int i = this.x + 1;
        this.x = i;
        float[] fArr2 = this.t;
        fArr2[i % 50] = fArr[0];
        this.u[i % 50] = fArr[1];
        this.v[i % 50] = fArr[2];
        float[] fArr3 = {a.b(fArr2) / Math.min(this.x, 50), a.b(this.u) / Math.min(this.x, 50), a.b(this.v) / Math.min(this.x, 50)};
        float a2 = a.a(fArr3);
        fArr3[0] = fArr3[0] / a2;
        fArr3[1] = fArr3[1] / a2;
        fArr3[2] = fArr3[2] / a2;
        int i2 = this.y + 1;
        this.y = i2;
        float[] fArr4 = this.w;
        fArr4[i2 % 10] = a.a(fArr3, fArr) - a2;
        float b2 = a.b(fArr4);
        if (b2 > f4 && this.A <= f4 && j - this.z > 250000000) {
            this.B.a(j);
            this.z = j;
        }
        this.A = b2;
    }

    public void a(c cVar) {
        this.B = cVar;
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PreferenceManager.getDefaultSharedPreferences(this).getFloat("CurrentSensitivityValue", 30.0f);
    }
}
