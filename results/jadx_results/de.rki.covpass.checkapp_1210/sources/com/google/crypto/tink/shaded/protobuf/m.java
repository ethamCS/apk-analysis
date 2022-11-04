package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.u1;
import com.google.crypto.tink.shaded.protobuf.v1;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class m implements v1 {

    /* renamed from: a */
    private final l f7951a;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7952a;

        static {
            int[] iArr = new int[u1.b.values().length];
            f7952a = iArr;
            try {
                iArr[u1.b.Y3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7952a[u1.b.X3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7952a[u1.b.V3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7952a[u1.b.f8019f4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7952a[u1.b.f8021h4.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7952a[u1.b.f8017d4.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7952a[u1.b.W3.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7952a[u1.b.f8026y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7952a[u1.b.f8020g4.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7952a[u1.b.f8022i4.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7952a[u1.b.U3.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7952a[u1.b.Z3.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private m(l lVar) {
        l lVar2 = (l) b0.b(lVar, "output");
        this.f7951a = lVar2;
        lVar2.f7940a = this;
    }

    public static m P(l lVar) {
        m mVar = lVar.f7940a;
        return mVar != null ? mVar : new m(lVar);
    }

    private <K, V> void Q(int i10, l0.a<K, V> aVar, Map<K, V> map) {
        int[] iArr = a.f7952a;
        throw null;
    }

    private void R(int i10, Object obj) {
        if (obj instanceof String) {
            this.f7951a.L0(i10, (String) obj);
        } else {
            this.f7951a.j0(i10, (i) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public v1.a A() {
        return v1.a.ASCENDING;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void B(int i10, long j10) {
        this.f7951a.J0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void C(int i10, float f10) {
        this.f7951a.s0(i10, f10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void D(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof h0)) {
            while (i11 < list.size()) {
                this.f7951a.L0(i10, list.get(i11));
                i11++;
            }
            return;
        }
        h0 h0Var = (h0) list;
        while (i11 < list.size()) {
            R(i10, h0Var.A(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void E(int i10) {
        this.f7951a.M0(i10, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void F(int i10, String str) {
        this.f7951a.L0(i10, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void G(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7951a.H0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f7951a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.P(list.get(i13).intValue());
        }
        this.f7951a.O0(i12);
        while (i11 < list.size()) {
            this.f7951a.I0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void H(int i10, long j10) {
        this.f7951a.P0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void I(int i10, int i11) {
        this.f7951a.m0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void J(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7951a.y0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f7951a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.y(list.get(i13).longValue());
        }
        this.f7951a.O0(i12);
        while (i11 < list.size()) {
            this.f7951a.z0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void K(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7951a.m0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f7951a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.l(list.get(i13).intValue());
        }
        this.f7951a.O0(i12);
        while (i11 < list.size()) {
            this.f7951a.n0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void L(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7951a.k0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f7951a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.j(list.get(i13).doubleValue());
        }
        this.f7951a.O0(i12);
        while (i11 < list.size()) {
            this.f7951a.l0(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void M(int i10, Object obj, h1 h1Var) {
        this.f7951a.u0(i10, (s0) obj, h1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void N(int i10, int i11) {
        this.f7951a.H0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void O(int i10, List<i> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f7951a.j0(i10, list.get(i11));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void a(int i10, List<?> list, h1 h1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            M(i10, list.get(i11), h1Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void b(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7951a.w0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f7951a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.w(list.get(i13).intValue());
        }
        this.f7951a.O0(i12);
        while (i11 < list.size()) {
            this.f7951a.x0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void c(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7951a.s0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f7951a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.r(list.get(i13).floatValue());
        }
        this.f7951a.O0(i12);
        while (i11 < list.size()) {
            this.f7951a.t0(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void d(int i10, long j10) {
        this.f7951a.y0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void e(int i10, boolean z10) {
        this.f7951a.h0(i10, z10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void f(int i10, int i11) {
        this.f7951a.N0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void g(int i10, List<?> list, h1 h1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            s(i10, list.get(i11), h1Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final void h(int i10, Object obj) {
        if (obj instanceof i) {
            this.f7951a.C0(i10, (i) obj);
        } else {
            this.f7951a.B0(i10, (s0) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void i(int i10, int i11) {
        this.f7951a.D0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void j(int i10) {
        this.f7951a.M0(i10, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void k(int i10, int i11) {
        this.f7951a.w0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void l(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7951a.q0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f7951a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.p(list.get(i13).longValue());
        }
        this.f7951a.O0(i12);
        while (i11 < list.size()) {
            this.f7951a.r0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void m(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7951a.D0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f7951a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.L(list.get(i13).intValue());
        }
        this.f7951a.O0(i12);
        while (i11 < list.size()) {
            this.f7951a.E0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void n(int i10, int i11) {
        this.f7951a.o0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void o(int i10, double d10) {
        this.f7951a.k0(i10, d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void p(int i10, long j10) {
        this.f7951a.F0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void q(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7951a.F0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f7951a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.N(list.get(i13).longValue());
        }
        this.f7951a.O0(i12);
        while (i11 < list.size()) {
            this.f7951a.G0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void r(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7951a.o0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f7951a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.n(list.get(i13).intValue());
        }
        this.f7951a.O0(i12);
        while (i11 < list.size()) {
            this.f7951a.p0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void s(int i10, Object obj, h1 h1Var) {
        this.f7951a.A0(i10, (s0) obj, h1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void t(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7951a.P0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f7951a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.Y(list.get(i13).longValue());
        }
        this.f7951a.O0(i12);
        while (i11 < list.size()) {
            this.f7951a.Q0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void u(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7951a.h0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f7951a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.e(list.get(i13).booleanValue());
        }
        this.f7951a.O0(i12);
        while (i11 < list.size()) {
            this.f7951a.i0(list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void v(int i10, i iVar) {
        this.f7951a.j0(i10, iVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void w(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7951a.N0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f7951a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.W(list.get(i13).intValue());
        }
        this.f7951a.O0(i12);
        while (i11 < list.size()) {
            this.f7951a.O0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public <K, V> void x(int i10, l0.a<K, V> aVar, Map<K, V> map) {
        if (this.f7951a.c0()) {
            Q(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f7951a.M0(i10, 2);
            this.f7951a.O0(l0.b(aVar, entry.getKey(), entry.getValue()));
            l0.d(this.f7951a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void y(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7951a.J0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f7951a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.R(list.get(i13).longValue());
        }
        this.f7951a.O0(i12);
        while (i11 < list.size()) {
            this.f7951a.K0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void z(int i10, long j10) {
        this.f7951a.q0(i10, j10);
    }
}
