package b.a.a.a.b0;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a */
    private final float f1169a;

    public a(float f) {
        this.f1169a = f;
    }

    @Override // b.a.a.a.b0.c
    public float a(RectF rectF) {
        return this.f1169a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f1169a == ((a) obj).f1169a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1169a)});
    }
}
