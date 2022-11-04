package t5;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a */
    private final c f21809a;

    /* renamed from: b */
    private final float f21810b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f21809a;
            f10 += ((b) cVar).f21810b;
        }
        this.f21809a = cVar;
        this.f21810b = f10;
    }

    @Override // t5.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f21809a.a(rectF) + this.f21810b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f21809a.equals(bVar.f21809a) && this.f21810b == bVar.f21810b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21809a, Float.valueOf(this.f21810b)});
    }
}
