package j$.util;

import j$.util.function.Function;
import java.io.Serializable;
/* renamed from: j$.util.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0492b implements java.util.Comparator, Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f13282a;

    /* renamed from: b */
    public final /* synthetic */ java.util.Comparator f13283b;

    /* renamed from: c */
    public final /* synthetic */ Object f13284c;

    public /* synthetic */ C0492b(java.util.Comparator comparator, Object obj, int i10) {
        this.f13282a = i10;
        this.f13283b = comparator;
        this.f13284c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f13282a) {
            case 0:
                java.util.Comparator comparator = this.f13283b;
                java.util.Comparator comparator2 = (java.util.Comparator) this.f13284c;
                int compare = comparator.compare(obj, obj2);
                return compare != 0 ? compare : comparator2.compare(obj, obj2);
            default:
                java.util.Comparator comparator3 = this.f13283b;
                Function function = (Function) this.f13284c;
                return comparator3.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
