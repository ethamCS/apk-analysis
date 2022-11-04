package j$.util;

import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.io.Serializable;
/* renamed from: j$.util.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0493c implements java.util.Comparator, Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f13285a;

    /* renamed from: b */
    public final /* synthetic */ Object f13286b;

    public /* synthetic */ C0493c(Object obj, int i10) {
        this.f13285a = i10;
        this.f13286b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f13285a) {
            case 0:
                Function function = (Function) this.f13286b;
                return ((Comparable) function.apply(obj)).compareTo(function.apply(obj2));
            case 1:
                ToDoubleFunction toDoubleFunction = (ToDoubleFunction) this.f13286b;
                return Double.compare(toDoubleFunction.m(obj), toDoubleFunction.m(obj2));
            case 2:
                ToIntFunction toIntFunction = (ToIntFunction) this.f13286b;
                return Integer.compare(toIntFunction.applyAsInt(obj), toIntFunction.applyAsInt(obj2));
            default:
                ToLongFunction toLongFunction = (ToLongFunction) this.f13286b;
                return Long.compare(toLongFunction.applyAsLong(obj), toLongFunction.applyAsLong(obj2));
        }
    }
}
