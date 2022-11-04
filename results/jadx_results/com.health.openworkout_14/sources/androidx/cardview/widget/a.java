package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.cardview.widget.g;
/* loaded from: classes.dex */
class a extends c {

    /* renamed from: androidx.cardview.widget.a$a */
    /* loaded from: classes.dex */
    class C0011a implements g.a {
        C0011a(a aVar) {
        }

        @Override // androidx.cardview.widget.g.a
        public void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    @Override // androidx.cardview.widget.c, androidx.cardview.widget.e
    public void n() {
        g.r = new C0011a(this);
    }
}
