package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.v1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.conscrypt.BuildConfig;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class v0<T> implements h1<T> {

    /* renamed from: r */
    private static final int[] f8040r = new int[0];

    /* renamed from: s */
    private static final Unsafe f8041s = s1.B();

    /* renamed from: a */
    private final int[] f8042a;

    /* renamed from: b */
    private final Object[] f8043b;

    /* renamed from: c */
    private final int f8044c;

    /* renamed from: d */
    private final int f8045d;

    /* renamed from: e */
    private final s0 f8046e;

    /* renamed from: f */
    private final boolean f8047f;

    /* renamed from: g */
    private final boolean f8048g;

    /* renamed from: h */
    private final boolean f8049h;

    /* renamed from: i */
    private final boolean f8050i;

    /* renamed from: j */
    private final int[] f8051j;

    /* renamed from: k */
    private final int f8052k;

    /* renamed from: l */
    private final int f8053l;

    /* renamed from: m */
    private final x0 f8054m;

    /* renamed from: n */
    private final i0 f8055n;

    /* renamed from: o */
    private final o1<?, ?> f8056o;

    /* renamed from: p */
    private final r<?> f8057p;

    /* renamed from: q */
    private final n0 f8058q;

    private v0(int[] iArr, Object[] objArr, int i10, int i11, s0 s0Var, boolean z10, boolean z11, int[] iArr2, int i12, int i13, x0 x0Var, i0 i0Var, o1<?, ?> o1Var, r<?> rVar, n0 n0Var) {
        this.f8042a = iArr;
        this.f8043b = objArr;
        this.f8044c = i10;
        this.f8045d = i11;
        this.f8048g = s0Var instanceof z;
        this.f8049h = z10;
        this.f8047f = rVar != null && rVar.e(s0Var);
        this.f8050i = z11;
        this.f8051j = iArr2;
        this.f8052k = i12;
        this.f8053l = i13;
        this.f8054m = x0Var;
        this.f8055n = i0Var;
        this.f8056o = o1Var;
        this.f8057p = rVar;
        this.f8046e = s0Var;
        this.f8058q = n0Var;
    }

    private static boolean A(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean B(T t10, int i10) {
        if (!this.f8049h) {
            int h02 = h0(i10);
            return (s1.x(t10, (long) (h02 & 1048575)) & (1 << (h02 >>> 20))) != 0;
        }
        int r02 = r0(i10);
        long U = U(r02);
        switch (q0(r02)) {
            case 0:
                return s1.v(t10, U) != 0.0d;
            case 1:
                return s1.w(t10, U) != 0.0f;
            case 2:
                return s1.y(t10, U) != 0;
            case 3:
                return s1.y(t10, U) != 0;
            case 4:
                return s1.x(t10, U) != 0;
            case 5:
                return s1.y(t10, U) != 0;
            case 6:
                return s1.x(t10, U) != 0;
            case 7:
                return s1.p(t10, U);
            case 8:
                Object A = s1.A(t10, U);
                if (A instanceof String) {
                    return !((String) A).isEmpty();
                }
                if (!(A instanceof i)) {
                    throw new IllegalArgumentException();
                }
                return !i.f7878d.equals(A);
            case 9:
                return s1.A(t10, U) != null;
            case 10:
                return !i.f7878d.equals(s1.A(t10, U));
            case 11:
                return s1.x(t10, U) != 0;
            case 12:
                return s1.x(t10, U) != 0;
            case 13:
                return s1.x(t10, U) != 0;
            case 14:
                return s1.y(t10, U) != 0;
            case 15:
                return s1.x(t10, U) != 0;
            case 16:
                return s1.y(t10, U) != 0;
            case 17:
                return s1.A(t10, U) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean C(T t10, int i10, int i11, int i12) {
        return this.f8049h ? B(t10, i10) : (i11 & i12) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean D(Object obj, int i10, h1 h1Var) {
        return h1Var.g(s1.A(obj, U(i10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean E(Object obj, int i10, int i11) {
        List list = (List) s1.A(obj, U(i10));
        if (list.isEmpty()) {
            return true;
        }
        h1 u10 = u(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!u10.g(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean F(T t10, int i10, int i11) {
        if (this.f8058q.h(s1.A(t10, U(i10))).isEmpty()) {
            return true;
        }
        this.f8058q.g(t(i11));
        throw null;
    }

    private boolean G(T t10, T t11, int i10) {
        long h02 = h0(i10) & 1048575;
        return s1.x(t10, h02) == s1.x(t11, h02);
    }

    private boolean H(T t10, int i10, int i11) {
        return s1.x(t10, (long) (h0(i11) & 1048575)) == i10;
    }

    private static boolean I(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static List<?> J(Object obj, long j10) {
        return (List) s1.A(obj, j10);
    }

    private static <T> long K(T t10, long j10) {
        return s1.y(t10, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
        r0 = r16.f8052k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
        if (r0 >= r16.f8053l) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
        r13 = p(r19, r16.f8051j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
        if (r13 == null) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
        r17.o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.v.b<ET>> void L(com.google.crypto.tink.shaded.protobuf.o1<UT, UB> r17, com.google.crypto.tink.shaded.protobuf.r<ET> r18, T r19, com.google.crypto.tink.shaded.protobuf.g1 r20, com.google.crypto.tink.shaded.protobuf.q r21) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.L(com.google.crypto.tink.shaded.protobuf.o1, com.google.crypto.tink.shaded.protobuf.r, java.lang.Object, com.google.crypto.tink.shaded.protobuf.g1, com.google.crypto.tink.shaded.protobuf.q):void");
    }

    private final <K, V> void M(Object obj, int i10, Object obj2, q qVar, g1 g1Var) {
        long U = U(r0(i10));
        Object A = s1.A(obj, U);
        if (A == null) {
            A = this.f8058q.c(obj2);
            s1.O(obj, U, A);
        } else if (this.f8058q.e(A)) {
            Object c10 = this.f8058q.c(obj2);
            this.f8058q.b(c10, A);
            s1.O(obj, U, c10);
            A = c10;
        }
        Map<?, ?> i11 = this.f8058q.i(A);
        this.f8058q.g(obj2);
        g1Var.G(i11, null, qVar);
    }

    private void N(T t10, T t11, int i10) {
        long U = U(r0(i10));
        if (!B(t11, i10)) {
            return;
        }
        Object A = s1.A(t10, U);
        Object A2 = s1.A(t11, U);
        if (A != null && A2 != null) {
            A2 = b0.h(A, A2);
        } else if (A2 == null) {
            return;
        }
        s1.O(t10, U, A2);
        n0(t10, i10);
    }

    private void O(T t10, T t11, int i10) {
        int r02 = r0(i10);
        int T = T(i10);
        long U = U(r02);
        if (!H(t11, T, i10)) {
            return;
        }
        Object A = s1.A(t10, U);
        Object A2 = s1.A(t11, U);
        if (A != null && A2 != null) {
            A2 = b0.h(A, A2);
        } else if (A2 == null) {
            return;
        }
        s1.O(t10, U, A2);
        o0(t10, T, i10);
    }

    private void P(T t10, T t11, int i10) {
        int r02 = r0(i10);
        long U = U(r02);
        int T = T(i10);
        switch (q0(r02)) {
            case 0:
                if (!B(t11, i10)) {
                    return;
                }
                s1.K(t10, U, s1.v(t11, U));
                n0(t10, i10);
                return;
            case 1:
                if (!B(t11, i10)) {
                    return;
                }
                s1.L(t10, U, s1.w(t11, U));
                n0(t10, i10);
                return;
            case 2:
                if (!B(t11, i10)) {
                    return;
                }
                s1.N(t10, U, s1.y(t11, U));
                n0(t10, i10);
                return;
            case 3:
                if (!B(t11, i10)) {
                    return;
                }
                s1.N(t10, U, s1.y(t11, U));
                n0(t10, i10);
                return;
            case 4:
                if (!B(t11, i10)) {
                    return;
                }
                s1.M(t10, U, s1.x(t11, U));
                n0(t10, i10);
                return;
            case 5:
                if (!B(t11, i10)) {
                    return;
                }
                s1.N(t10, U, s1.y(t11, U));
                n0(t10, i10);
                return;
            case 6:
                if (!B(t11, i10)) {
                    return;
                }
                s1.M(t10, U, s1.x(t11, U));
                n0(t10, i10);
                return;
            case 7:
                if (!B(t11, i10)) {
                    return;
                }
                s1.E(t10, U, s1.p(t11, U));
                n0(t10, i10);
                return;
            case 8:
                if (!B(t11, i10)) {
                    return;
                }
                s1.O(t10, U, s1.A(t11, U));
                n0(t10, i10);
                return;
            case 9:
            case 17:
                N(t10, t11, i10);
                return;
            case 10:
                if (!B(t11, i10)) {
                    return;
                }
                s1.O(t10, U, s1.A(t11, U));
                n0(t10, i10);
                return;
            case 11:
                if (!B(t11, i10)) {
                    return;
                }
                s1.M(t10, U, s1.x(t11, U));
                n0(t10, i10);
                return;
            case 12:
                if (!B(t11, i10)) {
                    return;
                }
                s1.M(t10, U, s1.x(t11, U));
                n0(t10, i10);
                return;
            case 13:
                if (!B(t11, i10)) {
                    return;
                }
                s1.M(t10, U, s1.x(t11, U));
                n0(t10, i10);
                return;
            case 14:
                if (!B(t11, i10)) {
                    return;
                }
                s1.N(t10, U, s1.y(t11, U));
                n0(t10, i10);
                return;
            case 15:
                if (!B(t11, i10)) {
                    return;
                }
                s1.M(t10, U, s1.x(t11, U));
                n0(t10, i10);
                return;
            case 16:
                if (!B(t11, i10)) {
                    return;
                }
                s1.N(t10, U, s1.y(t11, U));
                n0(t10, i10);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f8055n.d(t10, t11, U);
                return;
            case 50:
                j1.F(this.f8058q, t10, t11, U);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (!H(t11, T, i10)) {
                    return;
                }
                s1.O(t10, U, s1.A(t11, U));
                o0(t10, T, i10);
                return;
            case 60:
            case 68:
                O(t10, t11, i10);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (!H(t11, T, i10)) {
                    return;
                }
                s1.O(t10, U, s1.A(t11, U));
                o0(t10, T, i10);
                return;
            default:
                return;
        }
    }

    public static <T> v0<T> Q(Class<T> cls, q0 q0Var, x0 x0Var, i0 i0Var, o1<?, ?> o1Var, r<?> rVar, n0 n0Var) {
        return q0Var instanceof f1 ? S((f1) q0Var, x0Var, i0Var, o1Var, rVar, n0Var) : R((l1) q0Var, x0Var, i0Var, o1Var, rVar, n0Var);
    }

    static <T> v0<T> R(l1 l1Var, x0 x0Var, i0 i0Var, o1<?, ?> o1Var, r<?> rVar, n0 n0Var) {
        boolean z10 = l1Var.b() == c1.PROTO3;
        u[] e10 = l1Var.e();
        if (e10.length != 0) {
            u uVar = e10[0];
            throw null;
        }
        int length = e10.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (e10.length > 0) {
            u uVar2 = e10[0];
            throw null;
        }
        int[] d10 = l1Var.d();
        if (d10 == null) {
            d10 = f8040r;
        }
        if (e10.length > 0) {
            u uVar3 = e10[0];
            throw null;
        }
        int[] iArr2 = f8040r;
        int[] iArr3 = f8040r;
        int[] iArr4 = new int[d10.length + iArr2.length + iArr3.length];
        System.arraycopy(d10, 0, iArr4, 0, d10.length);
        System.arraycopy(iArr2, 0, iArr4, d10.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, d10.length + iArr2.length, iArr3.length);
        return new v0<>(iArr, objArr, 0, 0, l1Var.c(), z10, true, iArr4, d10.length, d10.length + iArr2.length, x0Var, i0Var, o1Var, rVar, n0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x039e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> com.google.crypto.tink.shaded.protobuf.v0<T> S(com.google.crypto.tink.shaded.protobuf.f1 r36, com.google.crypto.tink.shaded.protobuf.x0 r37, com.google.crypto.tink.shaded.protobuf.i0 r38, com.google.crypto.tink.shaded.protobuf.o1<?, ?> r39, com.google.crypto.tink.shaded.protobuf.r<?> r40, com.google.crypto.tink.shaded.protobuf.n0 r41) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.S(com.google.crypto.tink.shaded.protobuf.f1, com.google.crypto.tink.shaded.protobuf.x0, com.google.crypto.tink.shaded.protobuf.i0, com.google.crypto.tink.shaded.protobuf.o1, com.google.crypto.tink.shaded.protobuf.r, com.google.crypto.tink.shaded.protobuf.n0):com.google.crypto.tink.shaded.protobuf.v0");
    }

    private int T(int i10) {
        return this.f8042a[i10];
    }

    private static long U(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean V(T t10, long j10) {
        return ((Boolean) s1.A(t10, j10)).booleanValue();
    }

    private static <T> double W(T t10, long j10) {
        return ((Double) s1.A(t10, j10)).doubleValue();
    }

    private static <T> float X(T t10, long j10) {
        return ((Float) s1.A(t10, j10)).floatValue();
    }

    private static <T> int Y(T t10, long j10) {
        return ((Integer) s1.A(t10, j10)).intValue();
    }

    private static <T> long Z(T t10, long j10) {
        return ((Long) s1.A(t10, j10)).longValue();
    }

    private <K, V> int a0(T t10, byte[] bArr, int i10, int i11, int i12, long j10, e.b bVar) {
        Unsafe unsafe = f8041s;
        Object t11 = t(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.f8058q.e(object)) {
            Object c10 = this.f8058q.c(t11);
            this.f8058q.b(c10, object);
            unsafe.putObject(t10, j10, c10);
            object = c10;
        }
        this.f8058q.g(t11);
        return m(bArr, i10, i11, null, this.f8058q.i(object), bVar);
    }

    private int b0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, e.b bVar) {
        int i18;
        Object obj;
        Object obj2;
        Object obj3;
        long j11;
        int i19;
        Unsafe unsafe = f8041s;
        long j12 = this.f8042a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    obj = Double.valueOf(e.d(bArr, i10));
                    unsafe.putObject(t10, j10, obj);
                    i18 = i10 + 8;
                    unsafe.putInt(t10, j12, i13);
                    return i18;
                }
                return i10;
            case 52:
                if (i14 == 5) {
                    obj2 = Float.valueOf(e.l(bArr, i10));
                    unsafe.putObject(t10, j10, obj2);
                    i18 = i10 + 4;
                    unsafe.putInt(t10, j12, i13);
                    return i18;
                }
                return i10;
            case 53:
            case 54:
                if (i14 == 0) {
                    i18 = e.L(bArr, i10, bVar);
                    j11 = bVar.f7847b;
                    obj3 = Long.valueOf(j11);
                    unsafe.putObject(t10, j10, obj3);
                    unsafe.putInt(t10, j12, i13);
                    return i18;
                }
                return i10;
            case 55:
            case 62:
                if (i14 == 0) {
                    i18 = e.I(bArr, i10, bVar);
                    i19 = bVar.f7846a;
                    obj3 = Integer.valueOf(i19);
                    unsafe.putObject(t10, j10, obj3);
                    unsafe.putInt(t10, j12, i13);
                    return i18;
                }
                return i10;
            case 56:
            case 65:
                if (i14 == 1) {
                    obj = Long.valueOf(e.j(bArr, i10));
                    unsafe.putObject(t10, j10, obj);
                    i18 = i10 + 8;
                    unsafe.putInt(t10, j12, i13);
                    return i18;
                }
                return i10;
            case 57:
            case 64:
                if (i14 == 5) {
                    obj2 = Integer.valueOf(e.h(bArr, i10));
                    unsafe.putObject(t10, j10, obj2);
                    i18 = i10 + 4;
                    unsafe.putInt(t10, j12, i13);
                    return i18;
                }
                return i10;
            case 58:
                if (i14 == 0) {
                    i18 = e.L(bArr, i10, bVar);
                    obj3 = Boolean.valueOf(bVar.f7847b != 0);
                    unsafe.putObject(t10, j10, obj3);
                    unsafe.putInt(t10, j12, i13);
                    return i18;
                }
                return i10;
            case 59:
                if (i14 == 2) {
                    i18 = e.I(bArr, i10, bVar);
                    int i20 = bVar.f7846a;
                    if (i20 == 0) {
                        obj3 = BuildConfig.FLAVOR;
                        unsafe.putObject(t10, j10, obj3);
                        unsafe.putInt(t10, j12, i13);
                        return i18;
                    } else if ((i15 & 536870912) != 0 && !t1.n(bArr, i18, i18 + i20)) {
                        throw c0.e();
                    } else {
                        unsafe.putObject(t10, j10, new String(bArr, i18, i20, b0.f7822a));
                        i18 += i20;
                        unsafe.putInt(t10, j12, i13);
                        return i18;
                    }
                }
                return i10;
            case 60:
                if (i14 == 2) {
                    i18 = e.p(u(i17), bArr, i10, i11, bVar);
                    Object object = unsafe.getInt(t10, j12) == i13 ? unsafe.getObject(t10, j10) : null;
                    obj3 = bVar.f7848c;
                    if (object != null) {
                        obj3 = b0.h(object, obj3);
                    }
                    unsafe.putObject(t10, j10, obj3);
                    unsafe.putInt(t10, j12, i13);
                    return i18;
                }
                return i10;
            case 61:
                if (i14 == 2) {
                    i18 = e.b(bArr, i10, bVar);
                    obj3 = bVar.f7848c;
                    unsafe.putObject(t10, j10, obj3);
                    unsafe.putInt(t10, j12, i13);
                    return i18;
                }
                return i10;
            case 63:
                if (i14 == 0) {
                    int I = e.I(bArr, i10, bVar);
                    int i21 = bVar.f7846a;
                    b0.e s10 = s(i17);
                    if (s10 == null || s10.a(i21)) {
                        unsafe.putObject(t10, j10, Integer.valueOf(i21));
                        unsafe.putInt(t10, j12, i13);
                    } else {
                        v(t10).n(i12, Long.valueOf(i21));
                    }
                    return I;
                }
                return i10;
            case 66:
                if (i14 == 0) {
                    i18 = e.I(bArr, i10, bVar);
                    i19 = j.b(bVar.f7846a);
                    obj3 = Integer.valueOf(i19);
                    unsafe.putObject(t10, j10, obj3);
                    unsafe.putInt(t10, j12, i13);
                    return i18;
                }
                return i10;
            case 67:
                if (i14 == 0) {
                    i18 = e.L(bArr, i10, bVar);
                    j11 = j.c(bVar.f7847b);
                    obj3 = Long.valueOf(j11);
                    unsafe.putObject(t10, j10, obj3);
                    unsafe.putInt(t10, j12, i13);
                    return i18;
                }
                return i10;
            case 68:
                if (i14 == 3) {
                    i18 = e.n(u(i17), bArr, i10, i11, (i12 & (-8)) | 4, bVar);
                    Object object2 = unsafe.getInt(t10, j12) == i13 ? unsafe.getObject(t10, j10) : null;
                    obj3 = bVar.f7848c;
                    if (object2 != null) {
                        obj3 = b0.h(object2, obj3);
                    }
                    unsafe.putObject(t10, j10, obj3);
                    unsafe.putInt(t10, j12, i13);
                    return i18;
                }
                return i10;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c4, code lost:
        if (r0 != r15) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f2, code lost:
        if (r0 != r15) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x020f, code lost:
        if (r0 != r15) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0212, code lost:
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int d0(T r28, byte[] r29, int r30, int r31, com.google.crypto.tink.shaded.protobuf.e.b r32) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.d0(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    private int e0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, e.b bVar) {
        int i17;
        Unsafe unsafe = f8041s;
        b0.i iVar = (b0.i) unsafe.getObject(t10, j11);
        if (!iVar.I()) {
            int size = iVar.size();
            iVar = iVar.t(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j11, iVar);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return e.s(bArr, i10, iVar, bVar);
                }
                if (i14 == 1) {
                    return e.e(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 19:
            case 36:
                if (i14 == 2) {
                    return e.v(bArr, i10, iVar, bVar);
                }
                if (i14 == 5) {
                    return e.m(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return e.z(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.M(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return e.y(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.J(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return e.u(bArr, i10, iVar, bVar);
                }
                if (i14 == 1) {
                    return e.k(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return e.t(bArr, i10, iVar, bVar);
                }
                if (i14 == 5) {
                    return e.i(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 25:
            case 42:
                if (i14 == 2) {
                    return e.r(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.a(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 26:
                if (i14 == 2) {
                    int i18 = ((j10 & 536870912) > 0L ? 1 : ((j10 & 536870912) == 0L ? 0 : -1));
                    b0.i iVar2 = iVar;
                    return i18 == 0 ? e.D(i12, bArr, i10, i11, iVar2, bVar) : e.E(i12, bArr, i10, i11, iVar2, bVar);
                }
                break;
            case 27:
                if (i14 == 2) {
                    return e.q(u(i15), i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 28:
                if (i14 == 2) {
                    return e.c(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 30:
            case 44:
                if (i14 == 2) {
                    i17 = e.y(bArr, i10, iVar, bVar);
                } else if (i14 == 0) {
                    i17 = e.J(i12, bArr, i10, i11, iVar, bVar);
                }
                z zVar = (z) t10;
                p1 p1Var = zVar.unknownFields;
                if (p1Var == p1.e()) {
                    p1Var = null;
                }
                p1 p1Var2 = (p1) j1.A(i13, iVar, s(i15), p1Var, this.f8056o);
                if (p1Var2 != null) {
                    zVar.unknownFields = p1Var2;
                }
                return i17;
            case 33:
            case 47:
                if (i14 == 2) {
                    return e.w(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.A(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 34:
            case 48:
                if (i14 == 2) {
                    return e.x(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.B(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 49:
                if (i14 == 3) {
                    return e.o(u(i15), i12, bArr, i10, i11, iVar, bVar);
                }
                break;
        }
        return i10;
    }

    private int f0(int i10) {
        if (i10 < this.f8044c || i10 > this.f8045d) {
            return -1;
        }
        return p0(i10, 0);
    }

    private int g0(int i10, int i11) {
        if (i10 < this.f8044c || i10 > this.f8045d) {
            return -1;
        }
        return p0(i10, i11);
    }

    private int h0(int i10) {
        return this.f8042a[i10 + 2];
    }

    private <E> void i0(Object obj, long j10, g1 g1Var, h1<E> h1Var, q qVar) {
        g1Var.K(this.f8055n.e(obj, j10), h1Var, qVar);
    }

    private <E> void j0(Object obj, int i10, g1 g1Var, h1<E> h1Var, q qVar) {
        g1Var.q(this.f8055n.e(obj, U(i10)), h1Var, qVar);
    }

    private boolean k(T t10, T t11, int i10) {
        return B(t10, i10) == B(t11, i10);
    }

    private void k0(Object obj, int i10, g1 g1Var) {
        long U;
        Object z10;
        if (A(i10)) {
            U = U(i10);
            z10 = g1Var.M();
        } else if (this.f8048g) {
            U = U(i10);
            z10 = g1Var.p();
        } else {
            U = U(i10);
            z10 = g1Var.z();
        }
        s1.O(obj, U, z10);
    }

    private static <T> boolean l(T t10, long j10) {
        return s1.p(t10, j10);
    }

    private void l0(Object obj, int i10, g1 g1Var) {
        if (A(i10)) {
            g1Var.y(this.f8055n.e(obj, U(i10)));
        } else {
            g1Var.v(this.f8055n.e(obj, U(i10)));
        }
    }

    private <K, V> int m(byte[] bArr, int i10, int i11, l0.a<K, V> aVar, Map<K, V> map, e.b bVar) {
        int I = e.I(bArr, i10, bVar);
        int i12 = bVar.f7846a;
        if (i12 < 0 || i12 > i11 - I) {
            throw c0.n();
        }
        throw null;
    }

    private static Field m0(Class<?> cls, String str) {
        Field[] declaredFields;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static <T> double n(T t10, long j10) {
        return s1.v(t10, j10);
    }

    private void n0(T t10, int i10) {
        if (this.f8049h) {
            return;
        }
        int h02 = h0(i10);
        long j10 = h02 & 1048575;
        s1.M(t10, j10, s1.x(t10, j10) | (1 << (h02 >>> 20)));
    }

    private boolean o(T t10, T t11, int i10) {
        int r02 = r0(i10);
        long U = U(r02);
        switch (q0(r02)) {
            case 0:
                return k(t10, t11, i10) && Double.doubleToLongBits(s1.v(t10, U)) == Double.doubleToLongBits(s1.v(t11, U));
            case 1:
                return k(t10, t11, i10) && Float.floatToIntBits(s1.w(t10, U)) == Float.floatToIntBits(s1.w(t11, U));
            case 2:
                return k(t10, t11, i10) && s1.y(t10, U) == s1.y(t11, U);
            case 3:
                return k(t10, t11, i10) && s1.y(t10, U) == s1.y(t11, U);
            case 4:
                return k(t10, t11, i10) && s1.x(t10, U) == s1.x(t11, U);
            case 5:
                return k(t10, t11, i10) && s1.y(t10, U) == s1.y(t11, U);
            case 6:
                return k(t10, t11, i10) && s1.x(t10, U) == s1.x(t11, U);
            case 7:
                return k(t10, t11, i10) && s1.p(t10, U) == s1.p(t11, U);
            case 8:
                return k(t10, t11, i10) && j1.K(s1.A(t10, U), s1.A(t11, U));
            case 9:
                return k(t10, t11, i10) && j1.K(s1.A(t10, U), s1.A(t11, U));
            case 10:
                return k(t10, t11, i10) && j1.K(s1.A(t10, U), s1.A(t11, U));
            case 11:
                return k(t10, t11, i10) && s1.x(t10, U) == s1.x(t11, U);
            case 12:
                return k(t10, t11, i10) && s1.x(t10, U) == s1.x(t11, U);
            case 13:
                return k(t10, t11, i10) && s1.x(t10, U) == s1.x(t11, U);
            case 14:
                return k(t10, t11, i10) && s1.y(t10, U) == s1.y(t11, U);
            case 15:
                return k(t10, t11, i10) && s1.x(t10, U) == s1.x(t11, U);
            case 16:
                return k(t10, t11, i10) && s1.y(t10, U) == s1.y(t11, U);
            case 17:
                return k(t10, t11, i10) && j1.K(s1.A(t10, U), s1.A(t11, U));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                return j1.K(s1.A(t10, U), s1.A(t11, U));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return G(t10, t11, i10) && j1.K(s1.A(t10, U), s1.A(t11, U));
            default:
                return true;
        }
    }

    private void o0(T t10, int i10, int i11) {
        s1.M(t10, h0(i11) & 1048575, i10);
    }

    private final <UT, UB> UB p(Object obj, int i10, UB ub2, o1<UT, UB> o1Var) {
        b0.e s10;
        int T = T(i10);
        Object A = s1.A(obj, U(r0(i10)));
        return (A == null || (s10 = s(i10)) == null) ? ub2 : (UB) q(i10, T, this.f8058q.i(A), s10, ub2, o1Var);
    }

    private int p0(int i10, int i11) {
        int length = (this.f8042a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int T = T(i13);
            if (i10 == T) {
                return i13;
            }
            if (i10 < T) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private final <K, V, UT, UB> UB q(int i10, int i11, Map<K, V> map, b0.e eVar, UB ub2, o1<UT, UB> o1Var) {
        this.f8058q.g(t(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = o1Var.n();
                }
                i.h G = i.G(l0.b(null, next.getKey(), next.getValue()));
                try {
                    l0.d(G.b(), null, next.getKey(), next.getValue());
                    o1Var.d(ub2, i11, G.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private static int q0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private static <T> float r(T t10, long j10) {
        return s1.w(t10, j10);
    }

    private int r0(int i10) {
        return this.f8042a[i10 + 1];
    }

    private b0.e s(int i10) {
        return (b0.e) this.f8043b[((i10 / 3) * 2) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x049e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void s0(T r18, com.google.crypto.tink.shaded.protobuf.v1 r19) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.s0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.v1):void");
    }

    private Object t(int i10) {
        return this.f8043b[(i10 / 3) * 2];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0528  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t0(T r13, com.google.crypto.tink.shaded.protobuf.v1 r14) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.t0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.v1):void");
    }

    private h1 u(int i10) {
        int i11 = (i10 / 3) * 2;
        h1 h1Var = (h1) this.f8043b[i11];
        if (h1Var != null) {
            return h1Var;
        }
        h1<T> d10 = d1.a().d((Class) this.f8043b[i11 + 1]);
        this.f8043b[i11] = d10;
        return d10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x052e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void u0(T r11, com.google.crypto.tink.shaded.protobuf.v1 r12) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.u0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.v1):void");
    }

    public static p1 v(Object obj) {
        z zVar = (z) obj;
        p1 p1Var = zVar.unknownFields;
        if (p1Var == p1.e()) {
            p1 l10 = p1.l();
            zVar.unknownFields = l10;
            return l10;
        }
        return p1Var;
    }

    private <K, V> void v0(v1 v1Var, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f8058q.g(t(i11));
            v1Var.x(i10, null, this.f8058q.h(obj));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e0, code lost:
        if (r17.f8050i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f2, code lost:
        if (r17.f8050i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0203, code lost:
        if (r17.f8050i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0214, code lost:
        if (r17.f8050i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0225, code lost:
        if (r17.f8050i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0236, code lost:
        if (r17.f8050i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0247, code lost:
        if (r17.f8050i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0258, code lost:
        if (r17.f8050i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x025a, code lost:
        r2.putInt(r18, r11, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x025e, code lost:
        r4 = (com.google.crypto.tink.shaded.protobuf.l.U(r9) + com.google.crypto.tink.shaded.protobuf.l.W(r3)) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0320, code lost:
        if ((r7 & r14) != 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0322, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.l.s(r9, (com.google.crypto.tink.shaded.protobuf.s0) r2.getObject(r18, r12), u(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x034d, code lost:
        if ((r7 & r14) != 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x034f, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.l.M(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0356, code lost:
        if ((r7 & r14) != 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0358, code lost:
        r4 = com.google.crypto.tink.shaded.protobuf.l.K(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x037b, code lost:
        if ((r7 & r14) != 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x037d, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.l.g(r9, (com.google.crypto.tink.shaded.protobuf.i) r2.getObject(r18, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x038a, code lost:
        if ((r7 & r14) != 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x038c, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.j1.o(r9, r2.getObject(r18, r12), u(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03b7, code lost:
        if ((r7 & r14) != 0) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03b9, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.l.d(r9, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
        if (H(r18, r9, r5) != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
        if (H(r18, r9, r5) != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (H(r18, r9, r5) != false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b1, code lost:
        if (H(r18, r9, r5) != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
        if (H(r18, r9, r5) != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
        if (H(r18, r9, r5) != false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0174, code lost:
        if (r17.f8050i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0186, code lost:
        if (r17.f8050i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0198, code lost:
        if (r17.f8050i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01aa, code lost:
        if (r17.f8050i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bc, code lost:
        if (r17.f8050i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ce, code lost:
        if (r17.f8050i != false) goto L131;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int w(T r18) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.w(java.lang.Object):int");
    }

    private void w0(int i10, Object obj, v1 v1Var) {
        if (obj instanceof String) {
            v1Var.F(i10, (String) obj);
        } else {
            v1Var.v(i10, (i) obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ca, code lost:
        if (r15.f8050i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01db, code lost:
        if (r15.f8050i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ec, code lost:
        if (r15.f8050i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01fd, code lost:
        if (r15.f8050i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x020e, code lost:
        if (r15.f8050i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0210, code lost:
        r2.putInt(r16, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0214, code lost:
        r6 = (com.google.crypto.tink.shaded.protobuf.l.U(r8) + com.google.crypto.tink.shaded.protobuf.l.W(r7)) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0334, code lost:
        if ((r6 instanceof com.google.crypto.tink.shaded.protobuf.i) != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a6, code lost:
        if ((r6 instanceof com.google.crypto.tink.shaded.protobuf.i) != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
        r6 = com.google.crypto.tink.shaded.protobuf.l.S(r8, (java.lang.String) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012a, code lost:
        if (r15.f8050i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013c, code lost:
        if (r15.f8050i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014e, code lost:
        if (r15.f8050i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0160, code lost:
        if (r15.f8050i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0172, code lost:
        if (r15.f8050i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0184, code lost:
        if (r15.f8050i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0196, code lost:
        if (r15.f8050i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a8, code lost:
        if (r15.f8050i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b9, code lost:
        if (r15.f8050i != false) goto L117;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int x(T r16) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.x(java.lang.Object):int");
    }

    private <UT, UB> void x0(o1<UT, UB> o1Var, T t10, v1 v1Var) {
        o1Var.t(o1Var.g(t10), v1Var);
    }

    private <UT, UB> int y(o1<UT, UB> o1Var, T t10) {
        return o1Var.h(o1Var.g(t10));
    }

    private static <T> int z(T t10, long j10) {
        return s1.x(t10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public T a() {
        return (T) this.f8054m.a(this.f8046e);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public void b(T t10, T t11) {
        Objects.requireNonNull(t11);
        for (int i10 = 0; i10 < this.f8042a.length; i10 += 3) {
            P(t10, t11, i10);
        }
        j1.G(this.f8056o, t10, t11);
        if (this.f8047f) {
            j1.E(this.f8057p, t10, t11);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public void c(T t10, byte[] bArr, int i10, int i11, e.b bVar) {
        if (this.f8049h) {
            d0(t10, bArr, i10, i11, bVar);
        } else {
            c0(t10, bArr, i10, i11, 0, bVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0340, code lost:
        if (r0 != r11) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0342, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r9 = r36;
        r1 = r17;
        r3 = r18;
        r7 = r19;
        r2 = r20;
        r6 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0389, code lost:
        if (r0 != r15) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03aa, code lost:
        if (r0 != r15) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03ad, code lost:
        r2 = r0;
        r8 = r18;
        r0 = r35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c0(T r31, byte[] r32, int r33, int r34, int r35, com.google.crypto.tink.shaded.protobuf.e.b r36) {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.c0(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public void d(T t10, v1 v1Var) {
        if (v1Var.A() == v1.a.DESCENDING) {
            u0(t10, v1Var);
        } else if (this.f8049h) {
            t0(t10, v1Var);
        } else {
            s0(t10, v1Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public void e(T t10, g1 g1Var, q qVar) {
        Objects.requireNonNull(qVar);
        L(this.f8056o, this.f8057p, t10, g1Var, qVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public void f(T t10) {
        int i10;
        int i11 = this.f8052k;
        while (true) {
            i10 = this.f8053l;
            if (i11 >= i10) {
                break;
            }
            long U = U(r0(this.f8051j[i11]));
            Object A = s1.A(t10, U);
            if (A != null) {
                s1.O(t10, U, this.f8058q.f(A));
            }
            i11++;
        }
        int length = this.f8051j.length;
        while (i10 < length) {
            this.f8055n.c(t10, this.f8051j[i10]);
            i10++;
        }
        this.f8056o.j(t10);
        if (this.f8047f) {
            this.f8057p.f(t10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final boolean g(T t10) {
        int i10;
        int i11 = -1;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f8052k; i13++) {
            int i14 = this.f8051j[i13];
            int T = T(i14);
            int r02 = r0(i14);
            if (!this.f8049h) {
                int i15 = this.f8042a[i14 + 2];
                int i16 = 1048575 & i15;
                i10 = 1 << (i15 >>> 20);
                if (i16 != i11) {
                    i12 = f8041s.getInt(t10, i16);
                    i11 = i16;
                }
            } else {
                i10 = 0;
            }
            if (I(r02) && !C(t10, i14, i12, i10)) {
                return false;
            }
            int q02 = q0(r02);
            if (q02 != 9 && q02 != 17) {
                if (q02 != 27) {
                    if (q02 == 60 || q02 == 68) {
                        if (H(t10, T, i14) && !D(t10, r02, u(i14))) {
                            return false;
                        }
                    } else if (q02 != 49) {
                        if (q02 == 50 && !F(t10, r02, i14)) {
                            return false;
                        }
                    }
                }
                if (!E(t10, r02, i14)) {
                    return false;
                }
            } else if (C(t10, i14, i12, i10) && !D(t10, r02, u(i14))) {
                return false;
            }
        }
        return !this.f8047f || this.f8057p.c(t10).o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public boolean h(T t10, T t11) {
        int length = this.f8042a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!o(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f8056o.g(t10).equals(this.f8056o.g(t11))) {
            return false;
        }
        if (!this.f8047f) {
            return true;
        }
        return this.f8057p.c(t10).equals(this.f8057p.c(t11));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public int i(T t10) {
        return this.f8049h ? x(t10) : w(t10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cc, code lost:
        if (r3 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00de, code lost:
        if (r3 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e0, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e4, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // com.google.crypto.tink.shaded.protobuf.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int j(T r9) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.j(java.lang.Object):int");
    }
}
