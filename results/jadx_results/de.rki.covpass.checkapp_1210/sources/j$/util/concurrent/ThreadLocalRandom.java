package j$.util.concurrent;

import j$.util.stream.C0576l0;
import j$.util.stream.C0612t0;
import j$.util.stream.D0;
import j$.util.stream.H;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
/* loaded from: classes2.dex */
public class ThreadLocalRandom extends Random {

    /* renamed from: d */
    private static final AtomicInteger f13295d = new AtomicInteger();

    /* renamed from: e */
    private static final AtomicLong f13296e;

    /* renamed from: f */
    private static final ThreadLocal f13297f;

    /* renamed from: g */
    private static final ThreadLocal f13298g;

    /* renamed from: a */
    long f13299a;

    /* renamed from: b */
    int f13300b;

    /* renamed from: c */
    boolean f13301c = true;

    static {
        long j10;
        if (((Boolean) AccessController.doPrivileged(new x())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            j10 = seed[0] & 255;
            for (int i10 = 1; i10 < 8; i10++) {
                j10 = (j10 << 8) | (seed[i10] & 255);
            }
        } else {
            j10 = h(System.nanoTime()) ^ h(System.currentTimeMillis());
        }
        f13296e = new AtomicLong(j10);
        f13297f = new ThreadLocal();
        f13298g = new y();
        new ObjectStreamField("rnd", Long.TYPE);
        new ObjectStreamField("initialized", Boolean.TYPE);
    }

    public static final int a(int i10) {
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >>> 17);
        int i13 = i12 ^ (i12 << 5);
        ((ThreadLocalRandom) f13298g.get()).f13300b = i13;
        return i13;
    }

    public static final int b() {
        return ((ThreadLocalRandom) f13298g.get()).f13300b;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f13298g.get();
        if (threadLocalRandom.f13300b == 0) {
            f();
        }
        return threadLocalRandom;
    }

    public static final void f() {
        int addAndGet = f13295d.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long h10 = h(f13296e.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f13298g.get();
        threadLocalRandom.f13299a = h10;
        threadLocalRandom.f13300b = addAndGet;
    }

    private static int g(long j10) {
        long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
        return (int) (((j11 ^ (j11 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    private static long h(long j10) {
        long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
        long j12 = (j11 ^ (j11 >>> 33)) * (-4265267296055464877L);
        return j12 ^ (j12 >>> 33);
    }

    public final double c(double d10, double d11) {
        double nextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d10 < d11) {
            double d12 = ((d11 - d10) * nextLong) + d10;
            return d12 >= d11 ? Double.longBitsToDouble(Double.doubleToLongBits(d11) - 1) : d12;
        }
        return nextLong;
    }

    public final int d(int i10, int i11) {
        int i12;
        int g10 = g(i());
        if (i10 < i11) {
            int i13 = i11 - i10;
            int i14 = i13 - 1;
            if ((i13 & i14) == 0) {
                i12 = g10 & i14;
            } else if (i13 > 0) {
                int i15 = g10 >>> 1;
                while (true) {
                    int i16 = i15 + i14;
                    i12 = i15 % i13;
                    if (i16 - i12 >= 0) {
                        break;
                    }
                    i15 = g(i()) >>> 1;
                }
            } else {
                while (true) {
                    if (g10 >= i10 && g10 < i11) {
                        return g10;
                    }
                    g10 = g(i());
                }
            }
            return i12 + i10;
        }
        return g10;
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        return H.I(D0.u0(new z(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d)));
    }

    public final long e(long j10, long j11) {
        long h10 = h(i());
        if (j10 < j11) {
            long j12 = j11 - j10;
            long j13 = j12 - 1;
            if ((j12 & j13) == 0) {
                return (h10 & j13) + j10;
            }
            if (j12 > 0) {
                while (true) {
                    long j14 = h10 >>> 1;
                    long j15 = j14 + j13;
                    long j16 = j14 % j12;
                    if (j15 - j16 >= 0) {
                        return j16 + j10;
                    }
                    h10 = h(i());
                }
            } else {
                while (true) {
                    if (h10 >= j10 && h10 < j11) {
                        return h10;
                    }
                    h10 = h(i());
                }
            }
        } else {
            return h10;
        }
    }

    final long i() {
        long j10 = this.f13299a - 7046029254386353131L;
        this.f13299a = j10;
        return j10;
    }

    @Override // java.util.Random
    public final IntStream ints() {
        return C0576l0.I(D0.G0(new A(0L, Long.MAX_VALUE, Integer.MAX_VALUE, 0)));
    }

    @Override // java.util.Random
    public final LongStream longs() {
        return C0612t0.I(D0.I0(new B(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L)));
    }

    @Override // java.util.Random
    protected final int next(int i10) {
        return (int) (h(i()) >>> (64 - i10));
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return g(i()) < 0;
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (h(i()) >>> 11) * 1.1102230246251565E-16d;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (g(i()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = f13297f;
        Double d10 = (Double) threadLocal.get();
        if (d10 != null) {
            threadLocal.set(null);
            return d10.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d11 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d11 < 1.0d && d11 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d11) * (-2.0d)) / d11);
                f13297f.set(new Double(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    @Override // java.util.Random
    public final int nextInt() {
        return g(i());
    }

    @Override // java.util.Random
    public final int nextInt(int i10) {
        if (i10 > 0) {
            int g10 = g(i());
            int i11 = i10 - 1;
            if ((i10 & i11) == 0) {
                return g10 & i11;
            }
            while (true) {
                int i12 = g10 >>> 1;
                int i13 = i12 + i11;
                int i14 = i12 % i10;
                if (i13 - i14 >= 0) {
                    return i14;
                }
                g10 = g(i());
            }
        } else {
            throw new IllegalArgumentException("bound must be positive");
        }
    }

    @Override // java.util.Random
    public final long nextLong() {
        return h(i());
    }

    @Override // java.util.Random
    public final void setSeed(long j10) {
        if (!this.f13301c) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d10, double d11) {
        if (d10 < d11) {
            return H.I(D0.u0(new z(0L, Long.MAX_VALUE, d10, d11)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final IntStream ints(int i10, int i11) {
        if (i10 < i11) {
            return C0576l0.I(D0.G0(new A(0L, Long.MAX_VALUE, i10, i11)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs(long j10) {
        if (j10 >= 0) {
            return C0612t0.I(D0.I0(new B(0L, j10, Long.MAX_VALUE, 0L)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j10) {
        if (j10 >= 0) {
            return H.I(D0.u0(new z(0L, j10, Double.MAX_VALUE, 0.0d)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final IntStream ints(long j10) {
        if (j10 >= 0) {
            return C0576l0.I(D0.G0(new A(0L, j10, Integer.MAX_VALUE, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final LongStream longs(long j10, long j11) {
        if (j10 < j11) {
            return C0612t0.I(D0.I0(new B(0L, Long.MAX_VALUE, j10, j11)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j10, double d10, double d11) {
        if (j10 >= 0) {
            if (d10 < d11) {
                return H.I(D0.u0(new z(0L, j10, d10, d11)));
            }
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final IntStream ints(long j10, int i10, int i11) {
        if (j10 >= 0) {
            if (i10 < i11) {
                return C0576l0.I(D0.G0(new A(0L, j10, i10, i11)));
            }
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final LongStream longs(long j10, long j11, long j12) {
        if (j10 >= 0) {
            if (j11 < j12) {
                return C0612t0.I(D0.I0(new B(0L, j10, j11, j12)));
            }
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        throw new IllegalArgumentException("size must be non-negative");
    }
}
