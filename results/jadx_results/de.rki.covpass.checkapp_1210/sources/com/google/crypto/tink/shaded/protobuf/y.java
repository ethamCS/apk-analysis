package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
class y implements r0 {

    /* renamed from: a */
    private static final y f8107a = new y();

    private y() {
    }

    public static y c() {
        return f8107a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public q0 a(Class<?> cls) {
        if (!z.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (q0) z.y(cls.asSubclass(z.class)).q();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public boolean b(Class<?> cls) {
        return z.class.isAssignableFrom(cls);
    }
}
