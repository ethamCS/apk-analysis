package t5;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class i implements c {

    /* renamed from: a */
    private final float f21856a;

    public i(float f10) {
        this.f21856a = f10;
    }

    @Override // t5.c
    public float a(RectF rectF) {
        return this.f21856a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f21856a == ((i) obj).f21856a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f21856a)});
    }
}
