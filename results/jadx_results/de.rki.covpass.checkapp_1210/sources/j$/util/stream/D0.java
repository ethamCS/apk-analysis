package j$.util.stream;

import j$.time.AbstractC0484a;
import j$.util.Spliterator;
import j$.util.function.AbstractC0503e;
import j$.util.function.AbstractC0505g;
import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.IntConsumer;
import j$.util.function.Predicate;
import java.util.Objects;
/* loaded from: classes2.dex */
public abstract /* synthetic */ class D0 {

    /* renamed from: a */
    private static final C0557h1 f13431a = new C0557h1();

    /* renamed from: b */
    private static final L0 f13432b = new C0547f1();

    /* renamed from: c */
    private static final N0 f13433c = new C0552g1();

    /* renamed from: d */
    private static final J0 f13434d = new C0542e1();

    /* renamed from: e */
    private static final int[] f13435e = new int[0];

    /* renamed from: f */
    private static final long[] f13436f = new long[0];

    /* renamed from: g */
    private static final double[] f13437g = new double[0];

    public static J0 A0(J0 j02) {
        if (j02.p() > 0) {
            long count = j02.count();
            if (count < 2147483639) {
                double[] dArr = new double[(int) count];
                new C1(j02, dArr).invoke();
                return new C0527b1(dArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return j02;
    }

    public static L0 B0(L0 l02) {
        if (l02.p() > 0) {
            long count = l02.count();
            if (count < 2147483639) {
                int[] iArr = new int[(int) count];
                new C1(l02, iArr).invoke();
                return new C0572k1(iArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return l02;
    }

    public static N0 C0(N0 n02) {
        if (n02.p() > 0) {
            long count = n02.count();
            if (count < 2147483639) {
                long[] jArr = new long[(int) count];
                new C1(n02, jArr).invoke();
                return new C0613t1(jArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return n02;
    }

    public static F0 F0(long j10) {
        return (j10 < 0 || j10 >= 2147483639) ? new C0582m1() : new C0577l1(j10);
    }

    public static IntStream G0(j$.util.B b10) {
        return new C0556h0(b10, EnumC0539d3.f(b10));
    }

    public static G0 H0(long j10) {
        return (j10 < 0 || j10 >= 2147483639) ? new C0621v1() : new C0617u1(j10);
    }

    public static void I() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static AbstractC0616u0 I0(j$.util.D d10) {
        return new C0596p0(d10, EnumC0539d3.f(d10));
    }

    public static void J(AbstractC0588n2 abstractC0588n2, Double d10) {
        if (!P3.f13527a) {
            abstractC0588n2.c(d10.doubleValue());
        } else {
            P3.a(abstractC0588n2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
    }

    public static I J0(AbstractC0530c abstractC0530c, long j10, long j11) {
        if (j10 >= 0) {
            return new C0634y2(abstractC0530c, 4, y0(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static M3 K0(AbstractC0505g abstractC0505g, A0 a02) {
        Objects.requireNonNull(abstractC0505g);
        Objects.requireNonNull(a02);
        return new B0(4, a02, new C0590o(a02, abstractC0505g, 1));
    }

    public static void L(AbstractC0593o2 abstractC0593o2, Integer num) {
        if (!P3.f13527a) {
            abstractC0593o2.accept(num.intValue());
        } else {
            P3.a(abstractC0593o2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
    }

    public static IntStream L0(AbstractC0530c abstractC0530c, long j10, long j11) {
        if (j10 >= 0) {
            return new C0618u2(abstractC0530c, 2, y0(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static M3 M0(j$.util.function.r rVar, A0 a02) {
        Objects.requireNonNull(rVar);
        Objects.requireNonNull(a02);
        return new B0(2, a02, new C0590o(a02, rVar, 2));
    }

    public static void N(AbstractC0598p2 abstractC0598p2, Long l10) {
        if (!P3.f13527a) {
            abstractC0598p2.d(l10.longValue());
        } else {
            P3.a(abstractC0598p2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
    }

    public static AbstractC0616u0 N0(AbstractC0530c abstractC0530c, long j10, long j11) {
        if (j10 >= 0) {
            return new C0626w2(abstractC0530c, 3, y0(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static M3 O0(j$.util.function.z zVar, A0 a02) {
        Objects.requireNonNull(zVar);
        Objects.requireNonNull(a02);
        return new B0(3, a02, new C0590o(a02, zVar, 3));
    }

    public static void P() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void Q() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Stream Q0(AbstractC0530c abstractC0530c, long j10, long j11) {
        if (j10 >= 0) {
            return new C0610s2(abstractC0530c, 1, y0(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static Object[] R(O0 o02, j$.util.function.q qVar) {
        if (P3.f13527a) {
            P3.a(o02.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        } else if (o02.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            Object[] objArr = (Object[]) qVar.o((int) o02.count());
            o02.m(objArr, 0);
            return objArr;
        }
    }

    public static M3 R0(Predicate predicate, A0 a02) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(a02);
        return new B0(1, a02, new C0590o(a02, predicate, 4));
    }

    public static void S(J0 j02, Double[] dArr, int i10) {
        if (P3.f13527a) {
            P3.a(j02.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) j02.i();
        for (int i11 = 0; i11 < dArr2.length; i11++) {
            dArr[i10 + i11] = Double.valueOf(dArr2[i11]);
        }
    }

    public static M3 S0(j$.util.function.I i10, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(i10);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return new F1(1, biConsumer2, biConsumer, i10, 3);
    }

    public static Stream T0(Spliterator spliterator, boolean z10) {
        Objects.requireNonNull(spliterator);
        return new C0548f2(spliterator, EnumC0539d3.f(spliterator), z10);
    }

    public static void U(L0 l02, Integer[] numArr, int i10) {
        if (P3.f13527a) {
            P3.a(l02.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) l02.i();
        for (int i11 = 0; i11 < iArr.length; i11++) {
            numArr[i10 + i11] = Integer.valueOf(iArr[i11]);
        }
    }

    public static void W(N0 n02, Long[] lArr, int i10) {
        if (P3.f13527a) {
            P3.a(n02.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) n02.i();
        for (int i11 = 0; i11 < jArr.length; i11++) {
            lArr[i10 + i11] = Long.valueOf(jArr[i11]);
        }
    }

    public static void Y(J0 j02, Consumer consumer) {
        if (consumer instanceof AbstractC0503e) {
            j02.j((AbstractC0503e) consumer);
        } else if (!P3.f13527a) {
            ((j$.util.z) j02.mo21spliterator()).forEachRemaining(consumer);
        } else {
            P3.a(j02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public static void Z(L0 l02, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            l02.j((IntConsumer) consumer);
        } else if (!P3.f13527a) {
            ((j$.util.B) l02.mo21spliterator()).forEachRemaining(consumer);
        } else {
            P3.a(l02.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public static void a0(N0 n02, Consumer consumer) {
        if (consumer instanceof j$.util.function.x) {
            n02.j((j$.util.function.x) consumer);
        } else if (!P3.f13527a) {
            ((j$.util.D) n02.mo21spliterator()).forEachRemaining(consumer);
        } else {
            P3.a(n02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public static J0 b0(J0 j02, long j10, long j11) {
        if (j10 == 0 && j11 == j02.count()) {
            return j02;
        }
        long j12 = j11 - j10;
        j$.util.z zVar = (j$.util.z) j02.mo21spliterator();
        E0 t02 = t0(j12);
        t02.u(j12);
        for (int i10 = 0; i10 < j10 && zVar.j(I0.f13466a); i10++) {
        }
        for (int i11 = 0; i11 < j12 && zVar.j(t02); i11++) {
        }
        t02.t();
        return t02.mo22a();
    }

    public static L0 c0(L0 l02, long j10, long j11) {
        if (j10 == 0 && j11 == l02.count()) {
            return l02;
        }
        long j12 = j11 - j10;
        j$.util.B b10 = (j$.util.B) l02.mo21spliterator();
        F0 F0 = F0(j12);
        F0.u(j12);
        for (int i10 = 0; i10 < j10 && b10.e(K0.f13480a); i10++) {
        }
        for (int i11 = 0; i11 < j12 && b10.e(F0); i11++) {
        }
        F0.t();
        return F0.mo22a();
    }

    public static N0 d0(N0 n02, long j10, long j11) {
        if (j10 == 0 && j11 == n02.count()) {
            return n02;
        }
        long j12 = j11 - j10;
        j$.util.D d10 = (j$.util.D) n02.mo21spliterator();
        G0 H0 = H0(j12);
        H0.u(j12);
        for (int i10 = 0; i10 < j10 && d10.i(M0.f13500a); i10++) {
        }
        for (int i11 = 0; i11 < j12 && d10.i(H0); i11++) {
        }
        H0.t();
        return H0.mo22a();
    }

    public static P0 e0(P0 p02, long j10, long j11, j$.util.function.q qVar) {
        if (j10 == 0 && j11 == p02.count()) {
            return p02;
        }
        Spliterator mo21spliterator = p02.mo21spliterator();
        long j12 = j11 - j10;
        H0 l02 = l0(j12, qVar);
        l02.u(j12);
        for (int i10 = 0; i10 < j10 && mo21spliterator.b(C0520a.f13610u); i10++) {
        }
        for (int i11 = 0; i11 < j12 && mo21spliterator.b(l02); i11++) {
        }
        l02.t();
        return l02.mo22a();
    }

    public static long f0(long j10, long j11) {
        long j12 = j11 >= 0 ? j10 + j11 : Long.MAX_VALUE;
        if (j12 >= 0) {
            return j12;
        }
        return Long.MAX_VALUE;
    }

    public static Spliterator g0(int i10, Spliterator spliterator, long j10, long j11) {
        long j12 = j11 >= 0 ? j10 + j11 : Long.MAX_VALUE;
        long j13 = j12 >= 0 ? j12 : Long.MAX_VALUE;
        int[] iArr = AbstractC0638z2.f13843a;
        if (i10 != 0) {
            int i11 = iArr[i10 - 1];
            if (i11 == 1) {
                return new A3(spliterator, j10, j13);
            }
            if (i11 == 2) {
                return new w3((j$.util.B) spliterator, j10, j13);
            }
            if (i11 == 3) {
                return new y3((j$.util.D) spliterator, j10, j13);
            }
            if (i11 == 4) {
                return new u3((j$.util.z) spliterator, j10, j13);
            }
            StringBuilder b10 = AbstractC0484a.b("Unknown shape ");
            b10.append(AbstractC0544e3.b(i10));
            throw new IllegalStateException(b10.toString());
        }
        throw null;
    }

    public static long h0(long j10, long j11, long j12) {
        if (j10 >= 0) {
            return Math.max(-1L, Math.min(j10 - j11, j12));
        }
        return -1L;
    }

    public static H0 l0(long j10, j$.util.function.q qVar) {
        return (j10 < 0 || j10 >= 2147483639) ? new B1() : new C0567j1(j10, qVar);
    }

    public static P0 m0(D0 d02, Spliterator spliterator, boolean z10, j$.util.function.q qVar) {
        long x02 = d02.x0(spliterator);
        if (x02 < 0 || !spliterator.hasCharacteristics(16384)) {
            P0 p02 = (P0) new U0(d02, qVar, spliterator).invoke();
            return z10 ? z0(p02, qVar) : p02;
        } else if (x02 < 2147483639) {
            Object[] objArr = (Object[]) qVar.o((int) x02);
            new C0637z1(spliterator, d02, objArr).invoke();
            return new S0(objArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static J0 n0(D0 d02, Spliterator spliterator, boolean z10) {
        long x02 = d02.x0(spliterator);
        if (x02 < 0 || !spliterator.hasCharacteristics(16384)) {
            J0 j02 = (J0) new U0(d02, spliterator, 0).invoke();
            return z10 ? A0(j02) : j02;
        } else if (x02 < 2147483639) {
            double[] dArr = new double[(int) x02];
            new C0625w1(spliterator, d02, dArr).invoke();
            return new C0527b1(dArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static L0 o0(D0 d02, Spliterator spliterator, boolean z10) {
        long x02 = d02.x0(spliterator);
        if (x02 < 0 || !spliterator.hasCharacteristics(16384)) {
            L0 l02 = (L0) new U0(d02, spliterator, 1).invoke();
            return z10 ? B0(l02) : l02;
        } else if (x02 < 2147483639) {
            int[] iArr = new int[(int) x02];
            new C0629x1(spliterator, d02, iArr).invoke();
            return new C0572k1(iArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static N0 p0(D0 d02, Spliterator spliterator, boolean z10) {
        long x02 = d02.x0(spliterator);
        if (x02 < 0 || !spliterator.hasCharacteristics(16384)) {
            N0 n02 = (N0) new U0(d02, spliterator, 2).invoke();
            return z10 ? C0(n02) : n02;
        } else if (x02 < 2147483639) {
            long[] jArr = new long[(int) x02];
            new C0633y1(spliterator, d02, jArr).invoke();
            return new C0613t1(jArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static P0 q0(int i10, P0 p02, P0 p03) {
        int[] iArr = Q0.f13528a;
        if (i10 != 0) {
            int i11 = iArr[i10 - 1];
            if (i11 == 1) {
                return new C0522a1(p02, p03);
            }
            if (i11 == 2) {
                return new X0((L0) p02, (L0) p03);
            }
            if (i11 == 3) {
                return new Y0((N0) p02, (N0) p03);
            }
            if (i11 == 4) {
                return new W0((J0) p02, (J0) p03);
            }
            StringBuilder b10 = AbstractC0484a.b("Unknown shape ");
            b10.append(AbstractC0544e3.b(i10));
            throw new IllegalStateException(b10.toString());
        }
        throw null;
    }

    public static E0 t0(long j10) {
        return (j10 < 0 || j10 >= 2147483639) ? new C0537d1() : new C0532c1(j10);
    }

    public static I u0(j$.util.z zVar) {
        return new D(zVar, EnumC0539d3.f(zVar));
    }

    public static P0 v0(int i10) {
        int[] iArr = Q0.f13528a;
        if (i10 != 0) {
            int i11 = iArr[i10 - 1];
            if (i11 == 1) {
                return f13431a;
            }
            if (i11 == 2) {
                return f13432b;
            }
            if (i11 == 3) {
                return f13433c;
            }
            if (i11 == 4) {
                return f13434d;
            }
            StringBuilder b10 = AbstractC0484a.b("Unknown shape ");
            b10.append(AbstractC0544e3.b(i10));
            throw new IllegalStateException(b10.toString());
        }
        throw null;
    }

    private static int y0(long j10) {
        return (j10 != -1 ? EnumC0539d3.f13668u : 0) | EnumC0539d3.f13667t;
    }

    public static P0 z0(P0 p02, j$.util.function.q qVar) {
        if (p02.p() > 0) {
            long count = p02.count();
            if (count < 2147483639) {
                Object[] objArr = (Object[]) qVar.o((int) count);
                new D1(p02, objArr).invoke();
                return new S0(objArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return p02;
    }

    public abstract int D0();

    public abstract int E0();

    public abstract H0 P0(long j10, j$.util.function.q qVar);

    public abstract AbstractC0603q2 U0(AbstractC0603q2 abstractC0603q2, Spliterator spliterator);

    public abstract AbstractC0603q2 V0(AbstractC0603q2 abstractC0603q2);

    public abstract Spliterator W0(Spliterator spliterator);

    public abstract void r0(AbstractC0603q2 abstractC0603q2, Spliterator spliterator);

    public abstract void s0(AbstractC0603q2 abstractC0603q2, Spliterator spliterator);

    public abstract P0 w0(Spliterator spliterator, boolean z10, j$.util.function.q qVar);

    public abstract long x0(Spliterator spliterator);
}
