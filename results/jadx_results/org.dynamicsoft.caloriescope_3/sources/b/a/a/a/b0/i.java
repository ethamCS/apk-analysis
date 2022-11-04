package b.a.a.a.b0;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class i implements c {

    /* renamed from: a */
    private final float f1180a;

    public i(float f) {
        this.f1180a = f;
    }

    @Override // b.a.a.a.b0.c
    public float a(RectF rectF) {
        return this.f1180a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f1180a == ((i) obj).f1180a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1180a)});
    }
}
