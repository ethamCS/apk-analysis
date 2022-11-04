package d.a.a.a.a0;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a */
    private final c f3546a;

    /* renamed from: b */
    private final float f3547b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f3546a;
            f2 += ((b) cVar).f3547b;
        }
        this.f3546a = cVar;
        this.f3547b = f2;
    }

    @Override // d.a.a.a.a0.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f3546a.a(rectF) + this.f3547b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3546a.equals(bVar.f3546a) && this.f3547b == bVar.f3547b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3546a, Float.valueOf(this.f3547b)});
    }
}
