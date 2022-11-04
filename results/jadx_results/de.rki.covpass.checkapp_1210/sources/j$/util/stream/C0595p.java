package j$.util.stream;

import j$.util.C0498f;
import j$.util.C0514m;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.BinaryOperator;
import j$.util.function.Function;
import j$.util.function.Predicate;
import java.util.LinkedHashSet;
import java.util.Objects;
/* renamed from: j$.util.stream.p */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0595p implements j$.util.function.I, BiConsumer, Predicate, j$.util.function.q, BinaryOperator, j$.util.function.y {

    /* renamed from: a */
    public static final /* synthetic */ C0595p f13762a = new C0595p();

    /* renamed from: b */
    public static final /* synthetic */ C0595p f13763b = new C0595p();

    /* renamed from: c */
    public static final /* synthetic */ C0595p f13764c = new C0595p();

    /* renamed from: d */
    public static final /* synthetic */ C0595p f13765d = new C0595p();

    /* renamed from: e */
    public static final /* synthetic */ C0595p f13766e = new C0595p();

    /* renamed from: f */
    public static final /* synthetic */ C0595p f13767f = new C0595p();

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
        return new Y0((N0) obj, (N0) obj2);
    }

    @Override // j$.util.function.I
    public Object get() {
        return new LinkedHashSet();
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.q
    public Object o(int i10) {
        return Integer.valueOf(i10);
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        return Objects.requireNonNull(predicate);
    }

    @Override // j$.util.function.y
    public Object p(long j10) {
        return D0.H0(j10);
    }

    @Override // j$.util.function.Predicate
    public boolean test(Object obj) {
        return ((C0514m) obj).c();
    }

    @Override // j$.util.function.BiConsumer
    public void w(Object obj, Object obj2) {
        ((C0498f) obj).b((C0498f) obj2);
    }
}
