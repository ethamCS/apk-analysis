package org.junit.internal;

import java.util.Objects;
/* loaded from: classes2.dex */
public final class Checks {
    private Checks() {
    }

    public static <T> T notNull(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static <T> T notNull(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
