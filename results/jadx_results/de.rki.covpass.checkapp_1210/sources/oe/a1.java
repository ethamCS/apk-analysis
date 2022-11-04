package oe;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes3.dex */
public final class a1 extends ve.e<y0<?>, y0<?>> {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private static final a1 f17918d;

    /* loaded from: classes3.dex */
    public static final class a extends ve.s<y0<?>, y0<?>> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // ve.s
        public <T extends y0<?>> int b(ConcurrentHashMap<oc.d<? extends y0<?>>, Integer> concurrentHashMap, oc.d<T> dVar, gc.l<? super oc.d<? extends y0<?>>, Integer> lVar) {
            int intValue;
            hc.t.e(concurrentHashMap, "<this>");
            hc.t.e(dVar, "kClass");
            hc.t.e(lVar, "compute");
            Integer num = concurrentHashMap.get(dVar);
            if (num == null) {
                synchronized (concurrentHashMap) {
                    Integer num2 = concurrentHashMap.get(dVar);
                    if (num2 == null) {
                        Integer invoke = lVar.invoke(dVar);
                        concurrentHashMap.putIfAbsent(dVar, Integer.valueOf(invoke.intValue()));
                        num2 = invoke;
                    }
                    hc.t.d(num2, "this[kClass] ?: compute(…putIfAbsent(kClass, it) }");
                    intValue = num2.intValue();
                }
                return intValue;
            }
            return num.intValue();
        }

        public final a1 g(List<? extends y0<?>> list) {
            hc.t.e(list, "attributes");
            return list.isEmpty() ? h() : new a1(list, null);
        }

        public final a1 h() {
            return a1.f17918d;
        }
    }

    static {
        List h10;
        h10 = ub.u.h();
        f17918d = new a1(h10);
    }

    private a1(List<? extends y0<?>> list) {
        for (y0<?> y0Var : list) {
            d(y0Var.b(), y0Var);
        }
    }

    public /* synthetic */ a1(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private a1(oe.y0<?> r1) {
        /*
            r0 = this;
            java.util.List r1 = ub.s.d(r1)
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.a1.<init>(oe.y0):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ve.a
    public ve.s<y0<?>, y0<?>> b() {
        return Companion;
    }

    public final a1 f(a1 a1Var) {
        hc.t.e(a1Var, "other");
        if (!isEmpty() || !a1Var.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Number number : Companion.e()) {
                int intValue = number.intValue();
                y0<?> y0Var = a().get(intValue);
                y0<?> y0Var2 = a1Var.a().get(intValue);
                ye.a.a(arrayList, y0Var == null ? y0Var2 != null ? y0Var2.a(y0Var) : null : y0Var.a(y0Var2));
            }
            return Companion.g(arrayList);
        }
        return this;
    }

    public final boolean i(y0<?> y0Var) {
        hc.t.e(y0Var, "attribute");
        return a().get(Companion.d(y0Var.b())) != null;
    }

    public final a1 k(a1 a1Var) {
        hc.t.e(a1Var, "other");
        if (!isEmpty() || !a1Var.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Number number : Companion.e()) {
                int intValue = number.intValue();
                y0<?> y0Var = a().get(intValue);
                y0<?> y0Var2 = a1Var.a().get(intValue);
                ye.a.a(arrayList, y0Var == null ? y0Var2 != null ? y0Var2.c(y0Var) : null : y0Var.c(y0Var2));
            }
            return Companion.g(arrayList);
        }
        return this;
    }

    public final a1 l(y0<?> y0Var) {
        List F0;
        List<? extends y0<?>> p02;
        hc.t.e(y0Var, "attribute");
        if (i(y0Var)) {
            return this;
        }
        if (isEmpty()) {
            return new a1(y0Var);
        }
        F0 = ub.c0.F0(this);
        p02 = ub.c0.p0(F0, y0Var);
        return Companion.g(p02);
    }

    public final a1 m(y0<?> y0Var) {
        hc.t.e(y0Var, "attribute");
        if (isEmpty()) {
            return this;
        }
        ve.c<y0<?>> a10 = a();
        ArrayList arrayList = new ArrayList();
        for (y0<?> y0Var2 : a10) {
            if (!hc.t.a(y0Var2, y0Var)) {
                arrayList.add(y0Var2);
            }
        }
        return arrayList.size() == a().a() ? this : Companion.g(arrayList);
    }
}
