package b.a.a.a.b0;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a */
    private final c f1170a;

    /* renamed from: b */
    private final float f1171b;

    public b(float f, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f1170a;
            f += ((b) cVar).f1171b;
        }
        this.f1170a = cVar;
        this.f1171b = f;
    }

    @Override // b.a.a.a.b0.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f1170a.a(rectF) + this.f1171b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1170a.equals(bVar.f1170a) && this.f1171b == bVar.f1171b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1170a, Float.valueOf(this.f1171b)});
    }
}
