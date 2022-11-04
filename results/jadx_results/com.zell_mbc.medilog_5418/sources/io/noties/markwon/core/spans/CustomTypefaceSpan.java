package io.noties.markwon.core.spans;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* loaded from: classes2.dex */
public class CustomTypefaceSpan extends MetricAffectingSpan {
    private final boolean mergeStyles;
    private final Typeface typeface;

    public static CustomTypefaceSpan create(Typeface typeface) {
        return create(typeface, false);
    }

    public static CustomTypefaceSpan create(Typeface typeface, boolean z) {
        return new CustomTypefaceSpan(typeface, z);
    }

    @Deprecated
    public CustomTypefaceSpan(Typeface typeface) {
        this(typeface, false);
    }

    CustomTypefaceSpan(Typeface typeface, boolean z) {
        this.typeface = typeface;
        this.mergeStyles = z;
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        updatePaint(textPaint);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        updatePaint(textPaint);
    }

    private void updatePaint(TextPaint textPaint) {
        Typeface typeface = textPaint.getTypeface();
        if (!this.mergeStyles || typeface == null || typeface.getStyle() == 0) {
            textPaint.setTypeface(this.typeface);
            return;
        }
        textPaint.setTypeface(Typeface.create(this.typeface, typeface.getStyle() | this.typeface.getStyle()));
    }
}
