package io.noties.markwon.utils;

import android.text.Spanned;
/* loaded from: classes2.dex */
public abstract class LeadingMarginUtils {
    public static boolean selfStart(int i, CharSequence charSequence, Object obj) {
        return (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(obj) == i;
    }

    public static boolean selfEnd(int i, CharSequence charSequence, Object obj) {
        return (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(obj) == i;
    }

    private LeadingMarginUtils() {
    }
}
