package com.google.crypto.tink.shaded.protobuf;

import org.conscrypt.BuildConfig;
/* JADX WARN: Init of enum a4 can be incorrect */
/* JADX WARN: Init of enum y can be incorrect */
/* loaded from: classes.dex */
public enum d0 {
    VOID(Void.class, Void.class, null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, BuildConfig.FLAVOR),
    BYTE_STRING(i.class, i.class, i.f7878d),
    ENUM(r1, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    

    /* renamed from: c */
    private final Class<?> f7839c;

    /* renamed from: d */
    private final Class<?> f7840d;

    /* renamed from: q */
    private final Object f7841q;

    static {
        Class cls = Integer.TYPE;
    }

    d0(Class cls, Class cls2, Object obj) {
        this.f7839c = cls;
        this.f7840d = cls2;
        this.f7841q = obj;
    }

    public Class<?> b() {
        return this.f7840d;
    }
}
