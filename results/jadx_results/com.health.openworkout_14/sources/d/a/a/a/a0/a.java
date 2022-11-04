package d.a.a.a.a0;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a */
    private final float f3545a;

    public a(float f2) {
        this.f3545a = f2;
    }

    @Override // d.a.a.a.a0.c
    public float a(RectF rectF) {
        return this.f3545a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f3545a == ((a) obj).f3545a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3545a)});
    }
}
