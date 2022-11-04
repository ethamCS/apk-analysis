package io.noties.markwon.image;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import io.noties.markwon.core.MarkwonTheme;
import io.noties.markwon.utils.SpanUtils;
/* loaded from: classes2.dex */
public class AsyncDrawableSpan extends ReplacementSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    private final int alignment;
    private final AsyncDrawable drawable;
    private final boolean replacementTextIsLink;
    private final MarkwonTheme theme;

    public AsyncDrawableSpan(MarkwonTheme markwonTheme, AsyncDrawable asyncDrawable, int i, boolean z) {
        this.theme = markwonTheme;
        this.drawable = asyncDrawable;
        this.alignment = i;
        this.replacementTextIsLink = z;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (this.drawable.hasResult()) {
            Rect bounds = this.drawable.getBounds();
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = -bounds.bottom;
                fontMetricsInt.descent = 0;
                fontMetricsInt.top = fontMetricsInt.ascent;
                fontMetricsInt.bottom = 0;
            }
            return bounds.right;
        }
        if (this.replacementTextIsLink) {
            this.theme.applyLinkStyle(paint);
        }
        return (int) (paint.measureText(charSequence, i, i2) + 0.5f);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        this.drawable.initWithKnownDimensions(SpanUtils.width(canvas, charSequence), paint.getTextSize());
        AsyncDrawable asyncDrawable = this.drawable;
        if (asyncDrawable.hasResult()) {
            int i7 = i5 - asyncDrawable.getBounds().bottom;
            int save = canvas.save();
            try {
                int i8 = this.alignment;
                if (2 == i8) {
                    i6 = ((i5 - i3) - asyncDrawable.getBounds().height()) / 2;
                } else {
                    if (1 == i8) {
                        i6 = paint.getFontMetricsInt().descent;
                    }
                    canvas.translate(f, i7);
                    asyncDrawable.draw(canvas);
                    return;
                }
                i7 -= i6;
                canvas.translate(f, i7);
                asyncDrawable.draw(canvas);
                return;
            } finally {
                canvas.restoreToCount(save);
            }
        }
        float textCenterY = textCenterY(i3, i5, paint);
        if (this.replacementTextIsLink) {
            this.theme.applyLinkStyle(paint);
        }
        canvas.drawText(charSequence, i, i2, f, textCenterY, paint);
    }

    public AsyncDrawable getDrawable() {
        return this.drawable;
    }

    private static float textCenterY(int i, int i2, Paint paint) {
        return (int) ((i + ((i2 - i) / 2)) - (((paint.descent() + paint.ascent()) / 2.0f) + 0.5f));
    }
}
