package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.v1;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: f */
    private static final p1 f7963f = new p1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f7964a;

    /* renamed from: b */
    private int[] f7965b;

    /* renamed from: c */
    private Object[] f7966c;

    /* renamed from: d */
    private int f7967d;

    /* renamed from: e */
    private boolean f7968e;

    private p1() {
        this(0, new int[8], new Object[8], true);
    }

    private p1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f7967d = -1;
        this.f7964a = i10;
        this.f7965b = iArr;
        this.f7966c = objArr;
        this.f7968e = z10;
    }

    private void b() {
        int i10 = this.f7964a;
        int[] iArr = this.f7965b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f7965b = Arrays.copyOf(iArr, i11);
            this.f7966c = Arrays.copyOf(this.f7966c, i11);
        }
    }

    private static boolean c(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    public static p1 e() {
        return f7963f;
    }

    private static int h(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int i(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    public static p1 k(p1 p1Var, p1 p1Var2) {
        int i10 = p1Var.f7964a + p1Var2.f7964a;
        int[] copyOf = Arrays.copyOf(p1Var.f7965b, i10);
        System.arraycopy(p1Var2.f7965b, 0, copyOf, p1Var.f7964a, p1Var2.f7964a);
        Object[] copyOf2 = Arrays.copyOf(p1Var.f7966c, i10);
        System.arraycopy(p1Var2.f7966c, 0, copyOf2, p1Var.f7964a, p1Var2.f7964a);
        return new p1(i10, copyOf, copyOf2, true);
    }

    public static p1 l() {
        return new p1();
    }

    private static void p(int i10, Object obj, v1 v1Var) {
        int a10 = u1.a(i10);
        int b10 = u1.b(i10);
        if (b10 == 0) {
            v1Var.d(a10, ((Long) obj).longValue());
        } else if (b10 == 1) {
            v1Var.z(a10, ((Long) obj).longValue());
        } else if (b10 == 2) {
            v1Var.v(a10, (i) obj);
        } else if (b10 != 3) {
            if (b10 != 5) {
                throw new RuntimeException(c0.f());
            }
            v1Var.n(a10, ((Integer) obj).intValue());
        } else if (v1Var.A() == v1.a.ASCENDING) {
            v1Var.j(a10);
            ((p1) obj).q(v1Var);
            v1Var.E(a10);
        } else {
            v1Var.E(a10);
            ((p1) obj).q(v1Var);
            v1Var.j(a10);
        }
    }

    void a() {
        if (this.f7968e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        int i10 = this.f7964a;
        return i10 == p1Var.f7964a && c(this.f7965b, p1Var.f7965b, i10) && d(this.f7966c, p1Var.f7966c, this.f7964a);
    }

    public int f() {
        int i10;
        int i11 = this.f7967d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f7964a; i13++) {
            int i14 = this.f7965b[i13];
            int a10 = u1.a(i14);
            int b10 = u1.b(i14);
            if (b10 == 0) {
                i10 = l.X(a10, ((Long) this.f7966c[i13]).longValue());
            } else if (b10 == 1) {
                i10 = l.o(a10, ((Long) this.f7966c[i13]).longValue());
            } else if (b10 == 2) {
                i10 = l.g(a10, (i) this.f7966c[i13]);
            } else if (b10 == 3) {
                i10 = (l.U(a10) * 2) + ((p1) this.f7966c[i13]).f();
            } else if (b10 != 5) {
                throw new IllegalStateException(c0.f());
            } else {
                i10 = l.m(a10, ((Integer) this.f7966c[i13]).intValue());
            }
            i12 += i10;
        }
        this.f7967d = i12;
        return i12;
    }

    public int g() {
        int i10 = this.f7967d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f7964a; i12++) {
            i11 += l.I(u1.a(this.f7965b[i12]), (i) this.f7966c[i12]);
        }
        this.f7967d = i11;
        return i11;
    }

    public int hashCode() {
        int i10 = this.f7964a;
        return ((((527 + i10) * 31) + h(this.f7965b, i10)) * 31) + i(this.f7966c, this.f7964a);
    }

    public void j() {
        this.f7968e = false;
    }

    public final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f7964a; i11++) {
            u0.c(sb2, i10, String.valueOf(u1.a(this.f7965b[i11])), this.f7966c[i11]);
        }
    }

    public void n(int i10, Object obj) {
        a();
        b();
        int[] iArr = this.f7965b;
        int i11 = this.f7964a;
        iArr[i11] = i10;
        this.f7966c[i11] = obj;
        this.f7964a = i11 + 1;
    }

    public void o(v1 v1Var) {
        if (v1Var.A() == v1.a.DESCENDING) {
            for (int i10 = this.f7964a - 1; i10 >= 0; i10--) {
                v1Var.h(u1.a(this.f7965b[i10]), this.f7966c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f7964a; i11++) {
            v1Var.h(u1.a(this.f7965b[i11]), this.f7966c[i11]);
        }
    }

    public void q(v1 v1Var) {
        if (this.f7964a == 0) {
            return;
        }
        if (v1Var.A() == v1.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f7964a; i10++) {
                p(this.f7965b[i10], this.f7966c[i10], v1Var);
            }
            return;
        }
        for (int i11 = this.f7964a - 1; i11 >= 0; i11--) {
            p(this.f7965b[i11], this.f7966c[i11], v1Var);
        }
    }
}
