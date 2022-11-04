package j$.util;

import j$.util.Comparator;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.Collections;
import java.util.Objects;
/* renamed from: j$.util.d */
/* loaded from: classes2.dex */
public final class EnumC0496d extends Enum implements java.util.Comparator, Comparator {
    public static final EnumC0496d INSTANCE;

    /* renamed from: a */
    private static final /* synthetic */ EnumC0496d[] f13347a;

    static {
        EnumC0496d enumC0496d = new EnumC0496d();
        INSTANCE = enumC0496d;
        f13347a = new EnumC0496d[]{enumC0496d};
    }

    private EnumC0496d() {
        super("INSTANCE", 0);
    }

    public static EnumC0496d valueOf(String str) {
        return (EnumC0496d) Enum.valueOf(EnumC0496d.class, str);
    }

    public static EnumC0496d[] values() {
        return (EnumC0496d[]) f13347a.clone();
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final java.util.Comparator reversed() {
        return Collections.reverseOrder();
    }

    @Override // j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, function, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return Objects.requireNonNull(comparator);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function) {
        return Objects.requireNonNull(Function.VivifiedWrapper.convert(function));
    }

    @Override // j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Objects.requireNonNull(toDoubleFunction);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(java.util.function.ToDoubleFunction toDoubleFunction) {
        return Objects.requireNonNull(ToDoubleFunction.VivifiedWrapper.convert(toDoubleFunction));
    }

    @Override // j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Objects.requireNonNull(toIntFunction);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(java.util.function.ToIntFunction toIntFunction) {
        return Objects.requireNonNull(ToIntFunction.VivifiedWrapper.convert(toIntFunction));
    }

    @Override // j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Objects.requireNonNull(toLongFunction);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(java.util.function.ToLongFunction toLongFunction) {
        return Objects.requireNonNull(ToLongFunction.VivifiedWrapper.convert(toLongFunction));
    }

    @Override // java.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, Function.VivifiedWrapper.convert(function), comparator);
    }
}
