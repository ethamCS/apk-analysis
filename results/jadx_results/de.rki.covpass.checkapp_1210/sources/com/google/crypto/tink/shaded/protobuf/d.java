package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
final class d {

    /* renamed from: a */
    private static final Class<?> f7832a = a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f7833b;

    static {
        f7833b = a("org.robolectric.Robolectric") != null;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> b() {
        return f7832a;
    }

    public static boolean c() {
        return f7832a != null && !f7833b;
    }
}
