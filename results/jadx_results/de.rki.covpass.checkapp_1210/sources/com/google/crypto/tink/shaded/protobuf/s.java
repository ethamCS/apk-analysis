package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.u1;
import com.google.crypto.tink.shaded.protobuf.z;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
final class s extends r<z.d> {

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7981a;

        static {
            int[] iArr = new int[u1.b.values().length];
            f7981a = iArr;
            try {
                iArr[u1.b.f8024q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7981a[u1.b.f8025x.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7981a[u1.b.f8026y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7981a[u1.b.U3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7981a[u1.b.V3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7981a[u1.b.W3.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7981a[u1.b.X3.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7981a[u1.b.Y3.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7981a[u1.b.f8017d4.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7981a[u1.b.f8019f4.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7981a[u1.b.f8020g4.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7981a[u1.b.f8021h4.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7981a[u1.b.f8022i4.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7981a[u1.b.f8018e4.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7981a[u1.b.f8016c4.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7981a[u1.b.Z3.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7981a[u1.b.f8014a4.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f7981a[u1.b.f8015b4.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public int a(Map.Entry<?, ?> entry) {
        return ((z.d) entry.getKey()).c();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public Object b(q qVar, s0 s0Var, int i10) {
        return qVar.a(s0Var, i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public v<z.d> c(Object obj) {
        return ((z.c) obj).extensions;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public v<z.d> d(Object obj) {
        return ((z.c) obj).N();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public boolean e(s0 s0Var) {
        return s0Var instanceof z.c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public void f(Object obj) {
        c(obj).s();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018f  */
    @Override // com.google.crypto.tink.shaded.protobuf.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <UT, UB> UB g(com.google.crypto.tink.shaded.protobuf.g1 r5, java.lang.Object r6, com.google.crypto.tink.shaded.protobuf.q r7, com.google.crypto.tink.shaded.protobuf.v<com.google.crypto.tink.shaded.protobuf.z.d> r8, UB r9, com.google.crypto.tink.shaded.protobuf.o1<UT, UB> r10) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.s.g(com.google.crypto.tink.shaded.protobuf.g1, java.lang.Object, com.google.crypto.tink.shaded.protobuf.q, com.google.crypto.tink.shaded.protobuf.v, java.lang.Object, com.google.crypto.tink.shaded.protobuf.o1):java.lang.Object");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public void h(g1 g1Var, Object obj, q qVar, v<z.d> vVar) {
        z.e eVar = (z.e) obj;
        vVar.w(eVar.f8118b, g1Var.s(eVar.b().getClass(), qVar));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public void i(i iVar, Object obj, q qVar, v<z.d> vVar) {
        z.e eVar = (z.e) obj;
        s0 u10 = eVar.b().h().u();
        f Q = f.Q(ByteBuffer.wrap(iVar.b0()), true);
        d1.a().b(u10, Q, qVar);
        vVar.w(eVar.f8118b, u10);
        if (Q.u() == Integer.MAX_VALUE) {
            return;
        }
        throw c0.b();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public void j(v1 v1Var, Map.Entry<?, ?> entry) {
        z.d dVar = (z.d) entry.getKey();
        if (!dVar.e()) {
            switch (a.f7981a[dVar.f().ordinal()]) {
                case 1:
                    v1Var.o(dVar.c(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    v1Var.C(dVar.c(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    v1Var.d(dVar.c(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    v1Var.H(dVar.c(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                case 14:
                    v1Var.k(dVar.c(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    v1Var.z(dVar.c(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    v1Var.n(dVar.c(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    v1Var.e(dVar.c(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    v1Var.f(dVar.c(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    v1Var.i(dVar.c(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    v1Var.p(dVar.c(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    v1Var.N(dVar.c(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    v1Var.B(dVar.c(), ((Long) entry.getValue()).longValue());
                    return;
                case 15:
                    v1Var.v(dVar.c(), (i) entry.getValue());
                    return;
                case 16:
                    v1Var.F(dVar.c(), (String) entry.getValue());
                    return;
                case 17:
                    v1Var.M(dVar.c(), entry.getValue(), d1.a().d(entry.getValue().getClass()));
                    return;
                case 18:
                    v1Var.s(dVar.c(), entry.getValue(), d1.a().d(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
        switch (a.f7981a[dVar.f().ordinal()]) {
            case 1:
                j1.P(dVar.c(), (List) entry.getValue(), v1Var, dVar.k());
                return;
            case 2:
                j1.T(dVar.c(), (List) entry.getValue(), v1Var, dVar.k());
                return;
            case 3:
                j1.W(dVar.c(), (List) entry.getValue(), v1Var, dVar.k());
                return;
            case 4:
                j1.e0(dVar.c(), (List) entry.getValue(), v1Var, dVar.k());
                return;
            case 5:
            case 14:
                j1.V(dVar.c(), (List) entry.getValue(), v1Var, dVar.k());
                return;
            case 6:
                j1.S(dVar.c(), (List) entry.getValue(), v1Var, dVar.k());
                return;
            case 7:
                j1.R(dVar.c(), (List) entry.getValue(), v1Var, dVar.k());
                return;
            case 8:
                j1.N(dVar.c(), (List) entry.getValue(), v1Var, dVar.k());
                return;
            case 9:
                j1.d0(dVar.c(), (List) entry.getValue(), v1Var, dVar.k());
                return;
            case 10:
                j1.Y(dVar.c(), (List) entry.getValue(), v1Var, dVar.k());
                return;
            case 11:
                j1.Z(dVar.c(), (List) entry.getValue(), v1Var, dVar.k());
                return;
            case 12:
                j1.a0(dVar.c(), (List) entry.getValue(), v1Var, dVar.k());
                return;
            case 13:
                j1.b0(dVar.c(), (List) entry.getValue(), v1Var, dVar.k());
                return;
            case 15:
                j1.O(dVar.c(), (List) entry.getValue(), v1Var);
                return;
            case 16:
                j1.c0(dVar.c(), (List) entry.getValue(), v1Var);
                return;
            case 17:
                List list = (List) entry.getValue();
                if (list == null || list.isEmpty()) {
                    return;
                }
                j1.U(dVar.c(), (List) entry.getValue(), v1Var, d1.a().d(list.get(0).getClass()));
                return;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                j1.X(dVar.c(), (List) entry.getValue(), v1Var, d1.a().d(list2.get(0).getClass()));
                return;
            default:
                return;
        }
    }
}
