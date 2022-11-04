package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
final class p0 {

    /* renamed from: a */
    private static final n0 f7961a = c();

    /* renamed from: b */
    private static final n0 f7962b = new o0();

    public static n0 a() {
        return f7961a;
    }

    public static n0 b() {
        return f7962b;
    }

    private static n0 c() {
        try {
            return (n0) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
