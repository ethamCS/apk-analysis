package com.google.crypto.tink.shaded.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: c */
    private static final d1 f7842c = new d1();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, h1<?>> f7844b = new ConcurrentHashMap();

    /* renamed from: a */
    private final i1 f7843a = new k0();

    private d1() {
    }

    public static d1 a() {
        return f7842c;
    }

    public <T> void b(T t10, g1 g1Var, q qVar) {
        e(t10).e(t10, g1Var, qVar);
    }

    public h1<?> c(Class<?> cls, h1<?> h1Var) {
        b0.b(cls, "messageType");
        b0.b(h1Var, "schema");
        return this.f7844b.putIfAbsent(cls, h1Var);
    }

    public <T> h1<T> d(Class<T> cls) {
        b0.b(cls, "messageType");
        h1<T> h1Var = (h1<T>) this.f7844b.get(cls);
        if (h1Var == null) {
            h1<T> a10 = this.f7843a.a(cls);
            h1<T> h1Var2 = (h1<T>) c(cls, a10);
            return h1Var2 != null ? h1Var2 : a10;
        }
        return h1Var;
    }

    public <T> h1<T> e(T t10) {
        return d(t10.getClass());
    }
}
