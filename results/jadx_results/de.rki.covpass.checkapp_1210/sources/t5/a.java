package t5;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a */
    private final float f21808a;

    public a(float f10) {
        this.f21808a = f10;
    }

    @Override // t5.c
    public float a(RectF rectF) {
        return this.f21808a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f21808a == ((a) obj).f21808a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f21808a)});
    }
}
