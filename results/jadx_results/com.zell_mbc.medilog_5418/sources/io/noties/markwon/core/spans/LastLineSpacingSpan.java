package io.noties.markwon.core.spans;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
/* loaded from: classes2.dex */
public class LastLineSpacingSpan implements LineHeightSpan {
    private final int spacing;

    public static LastLineSpacingSpan create(int i) {
        return new LastLineSpacingSpan(i);
    }

    public LastLineSpacingSpan(int i) {
        this.spacing = i;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (selfEnd(i2, charSequence, this)) {
            fontMetricsInt.descent += this.spacing;
            fontMetricsInt.bottom += this.spacing;
        }
    }

    private static boolean selfEnd(int i, CharSequence charSequence, Object obj) {
        int spanEnd = ((Spanned) charSequence).getSpanEnd(obj);
        return spanEnd == i || spanEnd == i - 1;
    }
}
