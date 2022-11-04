package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.v;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a */
    private static final Class<?> f7908a = B();

    /* renamed from: b */
    private static final o1<?, ?> f7909b = C(false);

    /* renamed from: c */
    private static final o1<?, ?> f7910c = C(true);

    /* renamed from: d */
    private static final o1<?, ?> f7911d = new q1();

    public static <UT, UB> UB A(int i10, List<Integer> list, b0.e eVar, UB ub2, o1<UT, UB> o1Var) {
        if (eVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (eVar.a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) L(i10, intValue, ub2, o1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.a(intValue2)) {
                    ub2 = (UB) L(i10, intValue2, ub2, o1Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    private static Class<?> B() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static o1<?, ?> C(boolean z10) {
        try {
            Class<?> D = D();
            if (D != null) {
                return (o1) D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, FT extends v.b<FT>> void E(r<FT> rVar, T t10, T t11) {
        v<FT> c10 = rVar.c(t11);
        if (!c10.m()) {
            rVar.d(t10).t(c10);
        }
    }

    public static <T> void F(n0 n0Var, T t10, T t11, long j10) {
        s1.O(t10, j10, n0Var.b(s1.A(t10, j10), s1.A(t11, j10)));
    }

    public static <T, UT, UB> void G(o1<UT, UB> o1Var, T t10, T t11) {
        o1Var.p(t10, o1Var.k(o1Var.g(t10), o1Var.g(t11)));
    }

    public static o1<?, ?> H() {
        return f7909b;
    }

    public static o1<?, ?> I() {
        return f7910c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (z.class.isAssignableFrom(cls) || (cls2 = f7908a) == null || cls2.isAssignableFrom(cls)) {
            return;
        }
        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
    }

    public static boolean K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <UT, UB> UB L(int i10, int i11, UB ub2, o1<UT, UB> o1Var) {
        if (ub2 == null) {
            ub2 = o1Var.n();
        }
        o1Var.e(ub2, i10, i11);
        return ub2;
    }

    public static o1<?, ?> M() {
        return f7911d;
    }

    public static void N(int i10, List<Boolean> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.u(i10, list, z10);
    }

    public static void O(int i10, List<i> list, v1 v1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.O(i10, list);
    }

    public static void P(int i10, List<Double> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.L(i10, list, z10);
    }

    public static void Q(int i10, List<Integer> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.K(i10, list, z10);
    }

    public static void R(int i10, List<Integer> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.r(i10, list, z10);
    }

    public static void S(int i10, List<Long> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.l(i10, list, z10);
    }

    public static void T(int i10, List<Float> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.c(i10, list, z10);
    }

    public static void U(int i10, List<?> list, v1 v1Var, h1 h1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.a(i10, list, h1Var);
    }

    public static void V(int i10, List<Integer> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.b(i10, list, z10);
    }

    public static void W(int i10, List<Long> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.J(i10, list, z10);
    }

    public static void X(int i10, List<?> list, v1 v1Var, h1 h1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.g(i10, list, h1Var);
    }

    public static void Y(int i10, List<Integer> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.m(i10, list, z10);
    }

    public static void Z(int i10, List<Long> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.q(i10, list, z10);
    }

    public static int a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? l.U(i10) + l.C(size) : size * l.d(i10, true);
    }

    public static void a0(int i10, List<Integer> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.G(i10, list, z10);
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i10, List<Long> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.y(i10, list, z10);
    }

    public static int c(int i10, List<i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = size * l.U(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            U += l.h(list.get(i11));
        }
        return U;
    }

    public static void c0(int i10, List<String> list, v1 v1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.D(i10, list);
    }

    public static int d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e10 = e(list);
        int U = l.U(i10);
        return z10 ? U + l.C(e10) : e10 + (size * U);
    }

    public static void d0(int i10, List<Integer> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.w(i10, list, z10);
    }

    public static int e(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.l(a0Var.k(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += l.l(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void e0(int i10, List<Long> list, v1 v1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v1Var.t(i10, list, z10);
    }

    public static int f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? l.U(i10) + l.C(size * 4) : size * l.m(i10, 0);
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? l.U(i10) + l.C(size * 8) : size * l.o(i10, 0L);
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i10, List<s0> list, h1 h1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += l.s(i10, list.get(i12), h1Var);
        }
        return i11;
    }

    public static int k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l10 = l(list);
        int U = l.U(i10);
        return z10 ? U + l.C(l10) : l10 + (size * U);
    }

    public static int l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.w(a0Var.k(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += l.w(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int n10 = n(list);
        return z10 ? l.U(i10) + l.C(n10) : n10 + (list.size() * l.U(i10));
    }

    public static int n(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.y(j0Var.k(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += l.y(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int o(int i10, Object obj, h1 h1Var) {
        return obj instanceof f0 ? l.A(i10, (f0) obj) : l.F(i10, (s0) obj, h1Var);
    }

    public static int p(int i10, List<?> list, h1 h1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = l.U(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            U += obj instanceof f0 ? l.B((f0) obj) : l.H((s0) obj, h1Var);
        }
        return U;
    }

    public static int q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r10 = r(list);
        int U = l.U(i10);
        return z10 ? U + l.C(r10) : r10 + (size * U);
    }

    public static int r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.P(a0Var.k(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += l.P(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t10 = t(list);
        int U = l.U(i10);
        return z10 ? U + l.C(t10) : t10 + (size * U);
    }

    public static int t(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.R(j0Var.k(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += l.R(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int u(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int U = l.U(i10) * size;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            while (i11 < size) {
                Object A = h0Var.A(i11);
                U += A instanceof i ? l.h((i) A) : l.T((String) A);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                U += obj instanceof i ? l.h((i) obj) : l.T((String) obj);
                i11++;
            }
        }
        return U;
    }

    public static int v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w9 = w(list);
        int U = l.U(i10);
        return z10 ? U + l.C(w9) : w9 + (size * U);
    }

    public static int w(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.W(a0Var.k(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += l.W(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = y(list);
        int U = l.U(i10);
        return z10 ? U + l.C(y10) : y10 + (size * U);
    }

    public static int y(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.Y(j0Var.k(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += l.Y(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static <UT, UB> UB z(int i10, List<Integer> list, b0.d<?> dVar, UB ub2, o1<UT, UB> o1Var) {
        if (dVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (dVar.a(intValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) L(i10, intValue, ub2, o1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.a(intValue2) == null) {
                    ub2 = (UB) L(i10, intValue2, ub2, o1Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
