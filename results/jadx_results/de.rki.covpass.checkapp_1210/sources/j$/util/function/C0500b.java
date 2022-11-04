package j$.util.function;

import j$.util.function.BiFunction;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
/* renamed from: j$.util.function.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0500b implements BinaryOperator, AbstractC0501c, AbstractC0504f, AbstractC0505g, AbstractC0506h, AbstractC0507i, j, m, q, r, s, t, u, v, y, z, A, B, C, D, E, F, I {

    /* renamed from: a */
    final /* synthetic */ Object f13371a;

    public /* synthetic */ C0500b(Object obj) {
        this.f13371a = obj;
    }

    public static /* synthetic */ BinaryOperator t(java.util.function.BinaryOperator binaryOperator) {
        if (binaryOperator == null) {
            return null;
        }
        return new C0500b(binaryOperator);
    }

    public static /* synthetic */ AbstractC0505g u(DoublePredicate doublePredicate) {
        if (doublePredicate == null) {
            return null;
        }
        return new C0500b(doublePredicate);
    }

    public static /* synthetic */ q v(IntFunction intFunction) {
        if (intFunction == null) {
            return null;
        }
        return new C0500b(intFunction);
    }

    public static /* synthetic */ r w(IntPredicate intPredicate) {
        if (intPredicate == null) {
            return null;
        }
        return new C0500b(intPredicate);
    }

    public static /* synthetic */ z x(LongPredicate longPredicate) {
        if (longPredicate == null) {
            return null;
        }
        return new C0500b(longPredicate);
    }

    public static /* synthetic */ I y(Supplier supplier) {
        if (supplier == null) {
            return null;
        }
        return new C0500b(supplier);
    }

    public final /* synthetic */ boolean A(int i10) {
        return ((IntPredicate) this.f13371a).test(i10);
    }

    public final /* synthetic */ boolean B(long j10) {
        return ((LongPredicate) this.f13371a).test(j10);
    }

    public final /* synthetic */ double a(double d10) {
        return ((DoubleUnaryOperator) this.f13371a).applyAsDouble(d10);
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.VivifiedWrapper.convert(((java.util.function.BinaryOperator) this.f13371a).andThen(l.a(function)));
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return ((java.util.function.BinaryOperator) this.f13371a).apply(obj, obj2);
    }

    @Override // j$.util.function.D
    public final /* synthetic */ void b(Object obj, double d10) {
        ((ObjDoubleConsumer) this.f13371a).accept(obj, d10);
    }

    public final /* synthetic */ double c(int i10) {
        return ((IntToDoubleFunction) this.f13371a).applyAsDouble(i10);
    }

    public final /* synthetic */ double d(long j10) {
        return ((LongToDoubleFunction) this.f13371a).applyAsDouble(j10);
    }

    @Override // j$.util.function.m
    public final /* synthetic */ int e(int i10, int i11) {
        return ((IntBinaryOperator) this.f13371a).applyAsInt(i10, i11);
    }

    @Override // j$.util.function.v
    public final /* synthetic */ long f(long j10, long j11) {
        return ((LongBinaryOperator) this.f13371a).applyAsLong(j10, j11);
    }

    @Override // j$.util.function.AbstractC0501c
    public final /* synthetic */ double g(double d10, double d11) {
        return ((DoubleBinaryOperator) this.f13371a).applyAsDouble(d10, d11);
    }

    @Override // j$.util.function.I
    public final /* synthetic */ Object get() {
        return ((Supplier) this.f13371a).get();
    }

    public final /* synthetic */ int h(double d10) {
        return ((DoubleToIntFunction) this.f13371a).applyAsInt(d10);
    }

    @Override // j$.util.function.E
    public final /* synthetic */ void i(Object obj, int i10) {
        ((ObjIntConsumer) this.f13371a).accept(obj, i10);
    }

    @Override // j$.util.function.F
    public final /* synthetic */ void j(Object obj, long j10) {
        ((ObjLongConsumer) this.f13371a).accept(obj, j10);
    }

    @Override // j$.util.function.AbstractC0507i
    public final /* synthetic */ long k(double d10) {
        return ((DoubleToLongFunction) this.f13371a).applyAsLong(d10);
    }

    public final /* synthetic */ int m(int i10) {
        return ((IntUnaryOperator) this.f13371a).applyAsInt(i10);
    }

    public final /* synthetic */ int n(long j10) {
        return ((LongToIntFunction) this.f13371a).applyAsInt(j10);
    }

    @Override // j$.util.function.q
    public final /* synthetic */ Object o(int i10) {
        return ((IntFunction) this.f13371a).apply(i10);
    }

    @Override // j$.util.function.y
    public final /* synthetic */ Object p(long j10) {
        return ((LongFunction) this.f13371a).apply(j10);
    }

    @Override // j$.util.function.C
    public final /* synthetic */ long q(long j10) {
        return ((LongUnaryOperator) this.f13371a).applyAsLong(j10);
    }

    @Override // j$.util.function.AbstractC0504f
    public final /* synthetic */ Object r(double d10) {
        return ((DoubleFunction) this.f13371a).apply(d10);
    }

    @Override // j$.util.function.t
    public final /* synthetic */ long s(int i10) {
        return ((IntToLongFunction) this.f13371a).applyAsLong(i10);
    }

    public final /* synthetic */ boolean z(double d10) {
        return ((DoublePredicate) this.f13371a).test(d10);
    }
}
