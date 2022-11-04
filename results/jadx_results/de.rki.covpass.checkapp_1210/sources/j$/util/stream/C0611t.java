package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.BinaryOperator;
import j$.util.function.Function;
import java.util.Objects;
/* renamed from: j$.util.stream.t */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0611t implements j$.util.function.I, BiConsumer, j$.util.function.q, BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C0611t f13788a = new C0611t();

    /* renamed from: b */
    public static final /* synthetic */ C0611t f13789b = new C0611t();

    /* renamed from: c */
    public static final /* synthetic */ C0611t f13790c = new C0611t();

    /* renamed from: d */
    public static final /* synthetic */ C0611t f13791d = new C0611t();

    @Override // j$.util.function.BiFunction
    public /* synthetic */ BiFunction andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new C0522a1((P0) obj, (P0) obj2);
    }

    @Override // j$.util.function.I
    public Object get() {
        int i10 = G.f13452t;
        return new double[4];
    }

    @Override // j$.util.function.q
    public Object o(int i10) {
        int i11 = AbstractC0571k0.f13713t;
        return new Integer[i10];
    }

    @Override // j$.util.function.BiConsumer
    public void w(Object obj, Object obj2) {
        double[] dArr = (double[]) obj;
        double[] dArr2 = (double[]) obj2;
        int i10 = G.f13452t;
        Collectors.b(dArr, dArr2[0]);
        Collectors.b(dArr, dArr2[1]);
        dArr[2] = dArr[2] + dArr2[2];
        dArr[3] = dArr[3] + dArr2[3];
    }
}
