package d.a.a.a.a0;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class i implements c {

    /* renamed from: a */
    private final float f3566a;

    public i(float f2) {
        this.f3566a = f2;
    }

    @Override // d.a.a.a.a0.c
    public float a(RectF rectF) {
        return this.f3566a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f3566a == ((i) obj).f3566a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3566a)});
    }
}
