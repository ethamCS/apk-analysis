package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
final class z0 {

    /* renamed from: a */
    private static final x0 f8124a = c();

    /* renamed from: b */
    private static final x0 f8125b = new y0();

    public static x0 a() {
        return f8124a;
    }

    public static x0 b() {
        return f8125b;
    }

    private static x0 c() {
        try {
            return (x0) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
