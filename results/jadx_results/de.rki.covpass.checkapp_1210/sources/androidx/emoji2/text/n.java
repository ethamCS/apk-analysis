package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
/* loaded from: classes.dex */
public final class n extends h {
    private static Paint U3;

    public n(f fVar) {
        super(fVar);
    }

    private static Paint c() {
        if (U3 == null) {
            TextPaint textPaint = new TextPaint();
            U3 = textPaint;
            textPaint.setColor(d.b().c());
            U3.setStyle(Paint.Style.FILL);
        }
        return U3;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        if (d.b().i()) {
            canvas.drawRect(f10, i12, f10 + b(), i14, c());
        }
        a().a(canvas, f10, i13, paint);
    }
}
