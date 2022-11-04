package io.noties.markwon.html.jsoup.helper;

import java.util.Locale;
/* loaded from: classes2.dex */
public final class Normalizer {
    public static String lowerCase(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static String normalize(String str) {
        return lowerCase(str).trim();
    }
}
