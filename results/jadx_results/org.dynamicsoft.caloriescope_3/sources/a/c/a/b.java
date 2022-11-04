package a.c.a;

import a.c.a.h;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
/* loaded from: classes.dex */
class b extends d {

    /* loaded from: classes.dex */
    class a implements h.a {
        a(b bVar) {
        }

        @Override // a.c.a.h.a
        public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // a.c.a.d, a.c.a.f
    public void a() {
        h.r = new a(this);
    }
}
