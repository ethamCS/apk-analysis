package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
final class t {

    /* renamed from: a */
    private static final r<?> f8007a = new s();

    /* renamed from: b */
    private static final r<?> f8008b = c();

    public static r<?> a() {
        r<?> rVar = f8008b;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static r<?> b() {
        return f8007a;
    }

    private static r<?> c() {
        try {
            return (r) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
