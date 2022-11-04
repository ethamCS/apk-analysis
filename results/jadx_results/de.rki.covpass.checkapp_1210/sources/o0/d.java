package o0;

import android.view.View;
import k0.f;
/* loaded from: classes.dex */
public abstract class d extends f {

    /* loaded from: classes.dex */
    public static class a extends d {
        @Override // o0.d
        public boolean b(View view, float f10, long j10, k0.c cVar) {
            return this.f14559h;
        }

        public boolean c(View view, k0.c cVar, float f10, long j10, double d10, double d11) {
            view.setRotation(a(f10, j10, view, cVar) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
            return this.f14559h;
        }
    }

    public float a(float f10, long j10, View view, k0.c cVar) {
        this.f14552a.c(f10, this.f14558g);
        float[] fArr = this.f14558g;
        float f11 = fArr[1];
        if (f11 == 0.0f) {
            this.f14559h = false;
            return fArr[2];
        } else if (Float.isNaN(this.f14561j)) {
            throw null;
        } else {
            this.f14561j = (float) ((this.f14561j + (((j10 - this.f14560i) * 1.0E-9d) * f11)) % 1.0d);
            throw null;
        }
    }

    public abstract boolean b(View view, float f10, long j10, k0.c cVar);
}
