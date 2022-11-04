package io.noties.markwon.html;

import java.io.IOException;
/* loaded from: classes2.dex */
abstract class AppendableUtils {
    public static void appendQuietly(Appendable appendable, char c) {
        try {
            appendable.append(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void appendQuietly(Appendable appendable, CharSequence charSequence) {
        try {
            appendable.append(charSequence);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void appendQuietly(Appendable appendable, CharSequence charSequence, int i, int i2) {
        try {
            appendable.append(charSequence, i, i2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private AppendableUtils() {
    }
}
