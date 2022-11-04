package j$.util.stream;

import j$.util.C0498f;
import j$.util.C0508g;
import j$.util.C0509h;
import j$.util.C0510i;
import j$.util.function.AbstractC0501c;
import j$.util.function.AbstractC0504f;
import j$.util.function.AbstractC0507i;
import j$.util.function.BiConsumer;
import j$.util.function.BinaryOperator;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.Predicate;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.Objects;
/* renamed from: j$.util.stream.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0520a implements j$.util.function.q, BiConsumer, BinaryOperator, Function, j$.util.function.I, j$.util.function.D, ToDoubleFunction, AbstractC0501c, AbstractC0504f, AbstractC0507i, Predicate, j$.util.function.E, ToIntFunction, j$.util.function.m, j$.util.function.t, j$.util.function.F, ToLongFunction, j$.util.function.v, j$.util.function.y, j$.util.function.C, Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C0520a f13590a = new C0520a();

    /* renamed from: b */
    public static final /* synthetic */ C0520a f13591b = new C0520a();

    /* renamed from: c */
    public static final /* synthetic */ C0520a f13592c = new C0520a();

    /* renamed from: d */
    public static final /* synthetic */ C0520a f13593d = new C0520a();

    /* renamed from: e */
    public static final /* synthetic */ C0520a f13594e = new C0520a();

    /* renamed from: f */
    public static final /* synthetic */ C0520a f13595f = new C0520a();

    /* renamed from: g */
    public static final /* synthetic */ C0520a f13596g = new C0520a();

    /* renamed from: h */
    public static final /* synthetic */ C0520a f13597h = new C0520a();

    /* renamed from: i */
    public static final /* synthetic */ C0520a f13598i = new C0520a();

    /* renamed from: j */
    public static final /* synthetic */ C0520a f13599j = new C0520a();

    /* renamed from: k */
    public static final /* synthetic */ C0520a f13600k = new C0520a();

    /* renamed from: l */
    public static final /* synthetic */ C0520a f13601l = new C0520a();

    /* renamed from: m */
    public static final /* synthetic */ C0520a f13602m = new C0520a();

    /* renamed from: n */
    public static final /* synthetic */ C0520a f13603n = new C0520a();

    /* renamed from: o */
    public static final /* synthetic */ C0520a f13604o = new C0520a();

    /* renamed from: p */
    public static final /* synthetic */ C0520a f13605p = new C0520a();

    /* renamed from: q */
    public static final /* synthetic */ C0520a f13606q = new C0520a();

    /* renamed from: r */
    public static final /* synthetic */ C0520a f13607r = new C0520a();

    /* renamed from: s */
    public static final /* synthetic */ C0520a f13608s = new C0520a();

    /* renamed from: t */
    public static final /* synthetic */ C0520a f13609t = new C0520a();

    /* renamed from: u */
    public static final /* synthetic */ C0520a f13610u = new C0520a();

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return Objects.requireNonNull(predicate);
    }

    @Override // j$.util.function.Function
    public Object apply(Object obj) {
        return ((j$.util.V) obj).toString();
    }

    @Override // j$.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        j$.util.V v10 = (j$.util.V) obj;
        v10.b((j$.util.V) obj2);
        return v10;
    }

    @Override // j$.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        int i10 = AbstractC0571k0.f13713t;
        return ((Integer) obj).intValue();
    }

    @Override // j$.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        int i10 = AbstractC0608s0.f13780t;
        return ((Long) obj).longValue();
    }

    @Override // j$.util.function.D
    public void b(Object obj, double d10) {
        ((C0498f) obj).c(d10);
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.m
    public int e(int i10, int i11) {
        return i10 + i11;
    }

    @Override // j$.util.function.v
    public long f(long j10, long j11) {
        return j10 + j11;
    }

    @Override // j$.util.function.AbstractC0501c
    public double g(double d10, double d11) {
        return Math.max(d10, d11);
    }

    @Override // j$.util.function.I
    public Object get() {
        return new C0498f();
    }

    @Override // j$.util.function.Consumer
    public void h(Object obj) {
    }

    @Override // j$.util.function.E
    public void i(Object obj, int i10) {
        ((C0508g) obj).accept(i10);
    }

    @Override // j$.util.function.F
    public void j(Object obj, long j10) {
        ((C0509h) obj).d(j10);
    }

    @Override // j$.util.function.AbstractC0507i
    public long k(double d10) {
        int i10 = G.f13452t;
        return 1L;
    }

    @Override // j$.util.function.ToDoubleFunction
    public double m(Object obj) {
        int i10 = G.f13452t;
        return ((Double) obj).doubleValue();
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.q
    public Object o(int i10) {
        int i11 = AbstractC0530c.f13632s;
        return new Object[i10];
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        return Objects.requireNonNull(predicate);
    }

    @Override // j$.util.function.y
    public Object p(long j10) {
        return Long.valueOf(j10);
    }

    @Override // j$.util.function.C
    public long q(long j10) {
        int i10 = AbstractC0608s0.f13780t;
        return 1L;
    }

    @Override // j$.util.function.AbstractC0504f
    public Object r(double d10) {
        return Double.valueOf(d10);
    }

    @Override // j$.util.function.t
    public long s(int i10) {
        int i11 = AbstractC0571k0.f13713t;
        return 1L;
    }

    @Override // j$.util.function.Predicate
    public boolean test(Object obj) {
        return ((C0510i) obj).c();
    }

    @Override // j$.util.function.BiConsumer
    public void w(Object obj, Object obj2) {
        ((j$.util.V) obj).a((CharSequence) obj2);
    }
}
