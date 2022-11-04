package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
public final class k0 implements i1 {

    /* renamed from: b */
    private static final r0 f7916b = new a();

    /* renamed from: a */
    private final r0 f7917a;

    /* loaded from: classes.dex */
    class a implements r0 {
        a() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r0
        public q0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r0
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements r0 {

        /* renamed from: a */
        private r0[] f7918a;

        b(r0... r0VarArr) {
            this.f7918a = r0VarArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r0
        public q0 a(Class<?> cls) {
            r0[] r0VarArr;
            for (r0 r0Var : this.f7918a) {
                if (r0Var.b(cls)) {
                    return r0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r0
        public boolean b(Class<?> cls) {
            for (r0 r0Var : this.f7918a) {
                if (r0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public k0() {
        this(b());
    }

    private k0(r0 r0Var) {
        this.f7917a = (r0) b0.b(r0Var, "messageInfoFactory");
    }

    private static r0 b() {
        return new b(y.c(), c());
    }

    private static r0 c() {
        try {
            return (r0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f7916b;
        }
    }

    private static boolean d(q0 q0Var) {
        return q0Var.b() == c1.PROTO2;
    }

    private static <T> h1<T> e(Class<T> cls, q0 q0Var) {
        return z.class.isAssignableFrom(cls) ? d(q0Var) ? v0.Q(cls, q0Var, z0.b(), i0.b(), j1.M(), t.b(), p0.b()) : v0.Q(cls, q0Var, z0.b(), i0.b(), j1.M(), null, p0.b()) : d(q0Var) ? v0.Q(cls, q0Var, z0.a(), i0.a(), j1.H(), t.a(), p0.a()) : v0.Q(cls, q0Var, z0.a(), i0.a(), j1.I(), null, p0.a());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i1
    public <T> h1<T> a(Class<T> cls) {
        o1<?, ?> H;
        r<?> a10;
        j1.J(cls);
        q0 a11 = this.f7917a.a(cls);
        if (a11.a()) {
            if (z.class.isAssignableFrom(cls)) {
                H = j1.M();
                a10 = t.b();
            } else {
                H = j1.H();
                a10 = t.a();
            }
            return w0.m(H, a10, a11.c());
        }
        return e(cls, a11);
    }
}
