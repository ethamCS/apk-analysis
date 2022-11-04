package j$.util.stream;

import j$.util.C0508g;
import j$.util.C0512k;
import j$.util.function.AbstractC0501c;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.BinaryOperator;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.Predicate;
import j$.util.function.ToLongFunction;
import java.util.LinkedHashSet;
import java.util.Objects;
/* renamed from: j$.util.stream.l */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0575l implements j$.util.function.I, BiConsumer, j$.util.function.D, AbstractC0501c, j$.util.function.q, Predicate, j$.util.function.E, j$.util.function.m, j$.util.function.F, j$.util.function.v, BinaryOperator, j$.util.function.y, ToLongFunction, Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C0575l f13718a = new C0575l();

    /* renamed from: b */
    public static final /* synthetic */ C0575l f13719b = new C0575l();

    /* renamed from: c */
    public static final /* synthetic */ C0575l f13720c = new C0575l();

    /* renamed from: d */
    public static final /* synthetic */ C0575l f13721d = new C0575l();

    /* renamed from: e */
    public static final /* synthetic */ C0575l f13722e = new C0575l();

    /* renamed from: f */
    public static final /* synthetic */ C0575l f13723f = new C0575l();

    /* renamed from: g */
    public static final /* synthetic */ C0575l f13724g = new C0575l();

    /* renamed from: h */
    public static final /* synthetic */ C0575l f13725h = new C0575l();

    /* renamed from: i */
    public static final /* synthetic */ C0575l f13726i = new C0575l();

    /* renamed from: j */
    public static final /* synthetic */ C0575l f13727j = new C0575l();

    /* renamed from: k */
    public static final /* synthetic */ C0575l f13728k = new C0575l();

    /* renamed from: l */
    public static final /* synthetic */ C0575l f13729l = new C0575l();

    /* renamed from: m */
    public static final /* synthetic */ C0575l f13730m = new C0575l();

    /* renamed from: n */
    public static final /* synthetic */ C0575l f13731n = new C0575l();

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return Objects.requireNonNull(predicate);
    }

    @Override // j$.util.function.BiFunction
    public /* synthetic */ BiFunction andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new W0((J0) obj, (J0) obj2);
    }

    @Override // j$.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        int i10 = AbstractC0563i2.f13705t;
        return 1L;
    }

    @Override // j$.util.function.D
    public void b(Object obj, double d10) {
        double[] dArr = (double[]) obj;
        int i10 = G.f13452t;
        dArr[2] = dArr[2] + 1.0d;
        Collectors.b(dArr, d10);
        dArr[3] = dArr[3] + d10;
    }

    @Override // j$.util.function.m
    public int e(int i10, int i11) {
        return Math.max(i10, i11);
    }

    @Override // j$.util.function.v
    public long f(long j10, long j11) {
        return Math.max(j10, j11);
    }

    @Override // j$.util.function.AbstractC0501c
    public double g(double d10, double d11) {
        return Math.min(d10, d11);
    }

    @Override // j$.util.function.I
    public Object get() {
        return new C0508g();
    }

    @Override // j$.util.function.Consumer
    public void h(Object obj) {
    }

    @Override // j$.util.function.E
    public void i(Object obj, int i10) {
        long[] jArr = (long[]) obj;
        int i11 = AbstractC0571k0.f13713t;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + i10;
    }

    @Override // j$.util.function.F
    public void j(Object obj, long j10) {
        long[] jArr = (long[]) obj;
        int i10 = AbstractC0608s0.f13780t;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j10;
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.q
    public Object o(int i10) {
        int i11 = G.f13452t;
        return new Double[i10];
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        return Objects.requireNonNull(predicate);
    }

    @Override // j$.util.function.y
    public Object p(long j10) {
        return D0.t0(j10);
    }

    @Override // j$.util.function.Predicate
    public boolean test(Object obj) {
        return ((C0512k) obj).c();
    }

    @Override // j$.util.function.BiConsumer
    public void w(Object obj, Object obj2) {
        ((LinkedHashSet) obj).add(obj2);
    }
}
