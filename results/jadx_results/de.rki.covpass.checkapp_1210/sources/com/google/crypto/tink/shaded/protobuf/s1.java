package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
final class s1 {

    /* renamed from: i */
    static final long f7990i;

    /* renamed from: w */
    private static final int f8004w;

    /* renamed from: x */
    static final boolean f8005x;

    /* renamed from: a */
    private static final Logger f7982a = Logger.getLogger(s1.class.getName());

    /* renamed from: b */
    private static final Unsafe f7983b = B();

    /* renamed from: c */
    private static final Class<?> f7984c = com.google.crypto.tink.shaded.protobuf.d.b();

    /* renamed from: d */
    private static final boolean f7985d = m(Long.TYPE);

    /* renamed from: e */
    private static final boolean f7986e = m(Integer.TYPE);

    /* renamed from: f */
    private static final e f7987f = z();

    /* renamed from: g */
    private static final boolean f7988g = Q();

    /* renamed from: h */
    private static final boolean f7989h = P();

    /* renamed from: j */
    private static final long f7991j = j(boolean[].class);

    /* renamed from: k */
    private static final long f7992k = k(boolean[].class);

    /* renamed from: l */
    private static final long f7993l = j(int[].class);

    /* renamed from: m */
    private static final long f7994m = k(int[].class);

    /* renamed from: n */
    private static final long f7995n = j(long[].class);

    /* renamed from: o */
    private static final long f7996o = k(long[].class);

    /* renamed from: p */
    private static final long f7997p = j(float[].class);

    /* renamed from: q */
    private static final long f7998q = k(float[].class);

    /* renamed from: r */
    private static final long f7999r = j(double[].class);

    /* renamed from: s */
    private static final long f8000s = k(double[].class);

    /* renamed from: t */
    private static final long f8001t = j(Object[].class);

    /* renamed from: u */
    private static final long f8002u = k(Object[].class);

    /* renamed from: v */
    private static final long f8003v = o(l());

    /* loaded from: classes.dex */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        /* renamed from: a */
        public Unsafe run() {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public boolean c(Object obj, long j10) {
            return s1.f8005x ? s1.q(obj, j10) : s1.r(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public byte d(Object obj, long j10) {
            return s1.f8005x ? s1.t(obj, j10) : s1.u(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public void k(Object obj, long j10, boolean z10) {
            if (s1.f8005x) {
                s1.F(obj, j10, z10);
            } else {
                s1.G(obj, j10, z10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public void l(Object obj, long j10, byte b10) {
            if (s1.f8005x) {
                s1.I(obj, j10, b10);
            } else {
                s1.J(obj, j10, b10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public boolean c(Object obj, long j10) {
            return s1.f8005x ? s1.q(obj, j10) : s1.r(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public byte d(Object obj, long j10) {
            return s1.f8005x ? s1.t(obj, j10) : s1.u(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public void k(Object obj, long j10, boolean z10) {
            if (s1.f8005x) {
                s1.F(obj, j10, z10);
            } else {
                s1.G(obj, j10, z10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public void l(Object obj, long j10, byte b10) {
            if (s1.f8005x) {
                s1.I(obj, j10, b10);
            } else {
                s1.J(obj, j10, b10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public boolean c(Object obj, long j10) {
            return this.f8006a.getBoolean(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public byte d(Object obj, long j10) {
            return this.f8006a.getByte(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public double e(Object obj, long j10) {
            return this.f8006a.getDouble(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public float f(Object obj, long j10) {
            return this.f8006a.getFloat(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public void k(Object obj, long j10, boolean z10) {
            this.f8006a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public void l(Object obj, long j10, byte b10) {
            this.f8006a.putByte(obj, j10, b10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public void m(Object obj, long j10, double d10) {
            this.f8006a.putDouble(obj, j10, d10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.e
        public void n(Object obj, long j10, float f10) {
            this.f8006a.putFloat(obj, j10, f10);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a */
        Unsafe f8006a;

        e(Unsafe unsafe) {
            this.f8006a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f8006a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f8006a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public final int g(Object obj, long j10) {
            return this.f8006a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f8006a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f8006a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f8006a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final void o(Object obj, long j10, int i10) {
            this.f8006a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f8006a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f8006a.putObject(obj, j10, obj2);
        }
    }

    static {
        long j10 = j(byte[].class);
        f7990i = j10;
        f8004w = (int) (7 & j10);
        f8005x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private s1() {
    }

    public static Object A(Object obj, long j10) {
        return f7987f.i(obj, j10);
    }

    public static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean C() {
        return f7989h;
    }

    public static boolean D() {
        return f7988g;
    }

    public static void E(Object obj, long j10, boolean z10) {
        f7987f.k(obj, j10, z10);
    }

    public static void F(Object obj, long j10, boolean z10) {
        I(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    public static void G(Object obj, long j10, boolean z10) {
        J(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    public static void H(byte[] bArr, long j10, byte b10) {
        f7987f.l(bArr, f7990i + j10, b10);
    }

    public static void I(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int x10 = x(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (x10 & (~(255 << i10))));
    }

    public static void J(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (x(obj, j11) & (~(255 << i10))));
    }

    public static void K(Object obj, long j10, double d10) {
        f7987f.m(obj, j10, d10);
    }

    public static void L(Object obj, long j10, float f10) {
        f7987f.n(obj, j10, f10);
    }

    public static void M(Object obj, long j10, int i10) {
        f7987f.o(obj, j10, i10);
    }

    public static void N(Object obj, long j10, long j11) {
        f7987f.p(obj, j10, j11);
    }

    public static void O(Object obj, long j10, Object obj2) {
        f7987f.q(obj, j10, obj2);
    }

    private static boolean P() {
        Unsafe unsafe = f7983b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (com.google.crypto.tink.shaded.protobuf.d.c()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            Logger logger = f7982a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    private static boolean Q() {
        Unsafe unsafe = f7983b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (l() == null) {
                return false;
            }
            if (com.google.crypto.tink.shaded.protobuf.d.c()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th2) {
            Logger logger = f7982a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    public static <T> T i(Class<T> cls) {
        try {
            return (T) f7983b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int j(Class<?> cls) {
        if (f7989h) {
            return f7987f.a(cls);
        }
        return -1;
    }

    private static int k(Class<?> cls) {
        if (f7989h) {
            return f7987f.b(cls);
        }
        return -1;
    }

    private static Field l() {
        Field n10;
        if (!com.google.crypto.tink.shaded.protobuf.d.c() || (n10 = n(Buffer.class, "effectiveDirectAddress")) == null) {
            Field n11 = n(Buffer.class, "address");
            if (n11 != null && n11.getType() == Long.TYPE) {
                return n11;
            }
            return null;
        }
        return n10;
    }

    private static boolean m(Class<?> cls) {
        if (!com.google.crypto.tink.shaded.protobuf.d.c()) {
            return false;
        }
        try {
            Class<?> cls2 = f7984c;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f7987f) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    public static boolean p(Object obj, long j10) {
        return f7987f.c(obj, j10);
    }

    public static boolean q(Object obj, long j10) {
        return t(obj, j10) != 0;
    }

    public static boolean r(Object obj, long j10) {
        return u(obj, j10) != 0;
    }

    public static byte s(byte[] bArr, long j10) {
        return f7987f.d(bArr, f7990i + j10);
    }

    public static byte t(Object obj, long j10) {
        return (byte) ((x(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte u(Object obj, long j10) {
        return (byte) ((x(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static double v(Object obj, long j10) {
        return f7987f.e(obj, j10);
    }

    public static float w(Object obj, long j10) {
        return f7987f.f(obj, j10);
    }

    public static int x(Object obj, long j10) {
        return f7987f.g(obj, j10);
    }

    public static long y(Object obj, long j10) {
        return f7987f.h(obj, j10);
    }

    private static e z() {
        Unsafe unsafe = f7983b;
        if (unsafe == null) {
            return null;
        }
        if (!com.google.crypto.tink.shaded.protobuf.d.c()) {
            return new d(unsafe);
        }
        if (f7985d) {
            return new c(unsafe);
        }
        if (!f7986e) {
            return null;
        }
        return new b(unsafe);
    }
}
