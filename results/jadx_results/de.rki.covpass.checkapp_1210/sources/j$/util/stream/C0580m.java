package j$.util.stream;

import j$.util.C0509h;
import j$.util.C0513l;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.BinaryOperator;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.Predicate;
import java.util.LinkedHashSet;
import java.util.Objects;
/* renamed from: j$.util.stream.m */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0580m implements j$.util.function.I, BiConsumer, j$.util.function.D, Predicate, j$.util.function.q, j$.util.function.m, j$.util.function.v, BinaryOperator, j$.util.function.y, Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C0580m f13735a = new C0580m();

    /* renamed from: b */
    public static final /* synthetic */ C0580m f13736b = new C0580m();

    /* renamed from: c */
    public static final /* synthetic */ C0580m f13737c = new C0580m();

    /* renamed from: d */
    public static final /* synthetic */ C0580m f13738d = new C0580m();

    /* renamed from: e */
    public static final /* synthetic */ C0580m f13739e = new C0580m();

    /* renamed from: f */
    public static final /* synthetic */ C0580m f13740f = new C0580m();

    /* renamed from: g */
    public static final /* synthetic */ C0580m f13741g = new C0580m();

    /* renamed from: h */
    public static final /* synthetic */ C0580m f13742h = new C0580m();

    /* renamed from: i */
    public static final /* synthetic */ C0580m f13743i = new C0580m();

    /* renamed from: j */
    public static final /* synthetic */ C0580m f13744j = new C0580m();

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
        return new X0((L0) obj, (L0) obj2);
    }

    @Override // j$.util.function.D
    public void b(Object obj, double d10) {
        double[] dArr = (double[]) obj;
        int i10 = G.f13452t;
        Collectors.b(dArr, d10);
        dArr[2] = dArr[2] + d10;
    }

    @Override // j$.util.function.m
    public int e(int i10, int i11) {
        return Math.min(i10, i11);
    }

    @Override // j$.util.function.v
    public long f(long j10, long j11) {
        return Math.min(j10, j11);
    }

    @Override // j$.util.function.I
    public Object get() {
        return new C0509h();
    }

    @Override // j$.util.function.Consumer
    public void h(Object obj) {
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.q
    public Object o(int i10) {
        int i11 = C0521a0.f13611h;
        return new Object[i10];
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        return Objects.requireNonNull(predicate);
    }

    @Override // j$.util.function.y
    public Object p(long j10) {
        return D0.F0(j10);
    }

    @Override // j$.util.function.Predicate
    public boolean test(Object obj) {
        return ((C0513l) obj).c();
    }

    @Override // j$.util.function.BiConsumer
    public void w(Object obj, Object obj2) {
        ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
    }
}
