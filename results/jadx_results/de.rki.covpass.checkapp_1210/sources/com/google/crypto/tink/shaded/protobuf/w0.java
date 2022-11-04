package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.u1;
import com.google.crypto.tink.shaded.protobuf.v;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
final class w0<T> implements h1<T> {

    /* renamed from: a */
    private final s0 f8100a;

    /* renamed from: b */
    private final o1<?, ?> f8101b;

    /* renamed from: c */
    private final boolean f8102c;

    /* renamed from: d */
    private final r<?> f8103d;

    private w0(o1<?, ?> o1Var, r<?> rVar, s0 s0Var) {
        this.f8101b = o1Var;
        this.f8102c = rVar.e(s0Var);
        this.f8103d = rVar;
        this.f8100a = s0Var;
    }

    private <UT, UB> int k(o1<UT, UB> o1Var, T t10) {
        return o1Var.i(o1Var.g(t10));
    }

    private <UT, UB, ET extends v.b<ET>> void l(o1<UT, UB> o1Var, r<ET> rVar, T t10, g1 g1Var, q qVar) {
        UB f10 = o1Var.f(t10);
        v<ET> d10 = rVar.d(t10);
        do {
            try {
                if (g1Var.u() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                o1Var.o(t10, f10);
            }
        } while (n(g1Var, qVar, rVar, d10, o1Var, f10));
    }

    public static <T> w0<T> m(o1<?, ?> o1Var, r<?> rVar, s0 s0Var) {
        return new w0<>(o1Var, rVar, s0Var);
    }

    private <UT, UB, ET extends v.b<ET>> boolean n(g1 g1Var, q qVar, r<ET> rVar, v<ET> vVar, o1<UT, UB> o1Var, UB ub2) {
        int e10 = g1Var.e();
        if (e10 != u1.f8010a) {
            if (u1.b(e10) != 2) {
                return g1Var.D();
            }
            Object b10 = rVar.b(qVar, this.f8100a, u1.a(e10));
            if (b10 == null) {
                return o1Var.m(ub2, g1Var);
            }
            rVar.h(g1Var, b10, qVar, vVar);
            return true;
        }
        int i10 = 0;
        Object obj = null;
        i iVar = null;
        while (g1Var.u() != Integer.MAX_VALUE) {
            int e11 = g1Var.e();
            if (e11 == u1.f8012c) {
                i10 = g1Var.B();
                obj = rVar.b(qVar, this.f8100a, i10);
            } else if (e11 == u1.f8013d) {
                if (obj != null) {
                    rVar.h(g1Var, obj, qVar, vVar);
                } else {
                    iVar = g1Var.z();
                }
            } else if (!g1Var.D()) {
                break;
            }
        }
        if (g1Var.e() != u1.f8011b) {
            throw c0.b();
        }
        if (iVar != null) {
            if (obj != null) {
                rVar.i(iVar, obj, qVar, vVar);
            } else {
                o1Var.d(ub2, i10, iVar);
            }
        }
        return true;
    }

    private <UT, UB> void o(o1<UT, UB> o1Var, T t10, v1 v1Var) {
        o1Var.s(o1Var.g(t10), v1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public T a() {
        return (T) this.f8100a.h().u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public void b(T t10, T t11) {
        j1.G(this.f8101b, t10, t11);
        if (this.f8102c) {
            j1.E(this.f8103d, t10, t11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb A[EDGE_INSN: B:57:0x00cb->B:32:0x00cb ?: BREAK  , SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(T r11, byte[] r12, int r13, int r14, com.google.crypto.tink.shaded.protobuf.e.b r15) {
        /*
            r10 = this;
            r0 = r11
            com.google.crypto.tink.shaded.protobuf.z r0 = (com.google.crypto.tink.shaded.protobuf.z) r0
            com.google.crypto.tink.shaded.protobuf.p1 r1 = r0.unknownFields
            com.google.crypto.tink.shaded.protobuf.p1 r2 = com.google.crypto.tink.shaded.protobuf.p1.e()
            if (r1 != r2) goto L11
            com.google.crypto.tink.shaded.protobuf.p1 r1 = com.google.crypto.tink.shaded.protobuf.p1.l()
            r0.unknownFields = r1
        L11:
            com.google.crypto.tink.shaded.protobuf.z$c r11 = (com.google.crypto.tink.shaded.protobuf.z.c) r11
            com.google.crypto.tink.shaded.protobuf.v r11 = r11.N()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Ld7
            int r4 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r13, r15)
            int r13 = r15.f7846a
            int r3 = com.google.crypto.tink.shaded.protobuf.u1.f8010a
            r5 = 2
            if (r13 == r3) goto L6b
            int r3 = com.google.crypto.tink.shaded.protobuf.u1.b(r13)
            if (r3 != r5) goto L66
            com.google.crypto.tink.shaded.protobuf.r<?> r2 = r10.f8103d
            com.google.crypto.tink.shaded.protobuf.q r3 = r15.f7849d
            com.google.crypto.tink.shaded.protobuf.s0 r5 = r10.f8100a
            int r6 = com.google.crypto.tink.shaded.protobuf.u1.a(r13)
            java.lang.Object r2 = r2.b(r3, r5, r6)
            r8 = r2
            com.google.crypto.tink.shaded.protobuf.z$e r8 = (com.google.crypto.tink.shaded.protobuf.z.e) r8
            if (r8 == 0) goto L5b
            com.google.crypto.tink.shaded.protobuf.d1 r13 = com.google.crypto.tink.shaded.protobuf.d1.a()
            com.google.crypto.tink.shaded.protobuf.s0 r2 = r8.b()
            java.lang.Class r2 = r2.getClass()
            com.google.crypto.tink.shaded.protobuf.h1 r13 = r13.d(r2)
            int r13 = com.google.crypto.tink.shaded.protobuf.e.p(r13, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.z$d r2 = r8.f8118b
            java.lang.Object r3 = r15.f7848c
            r11.w(r2, r3)
            goto L64
        L5b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.crypto.tink.shaded.protobuf.e.G(r2, r3, r4, r5, r6, r7)
        L64:
            r2 = r8
            goto L19
        L66:
            int r13 = com.google.crypto.tink.shaded.protobuf.e.N(r13, r12, r4, r14, r15)
            goto L19
        L6b:
            r13 = 0
            r3 = r0
        L6d:
            if (r4 >= r14) goto Lcb
            int r4 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r4, r15)
            int r6 = r15.f7846a
            int r7 = com.google.crypto.tink.shaded.protobuf.u1.a(r6)
            int r8 = com.google.crypto.tink.shaded.protobuf.u1.b(r6)
            if (r7 == r5) goto Lac
            r9 = 3
            if (r7 == r9) goto L83
            goto Lc1
        L83:
            if (r2 == 0) goto La1
            com.google.crypto.tink.shaded.protobuf.d1 r6 = com.google.crypto.tink.shaded.protobuf.d1.a()
            com.google.crypto.tink.shaded.protobuf.s0 r7 = r2.b()
            java.lang.Class r7 = r7.getClass()
            com.google.crypto.tink.shaded.protobuf.h1 r6 = r6.d(r7)
            int r4 = com.google.crypto.tink.shaded.protobuf.e.p(r6, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.z$d r6 = r2.f8118b
            java.lang.Object r7 = r15.f7848c
            r11.w(r6, r7)
            goto L6d
        La1:
            if (r8 != r5) goto Lc1
            int r4 = com.google.crypto.tink.shaded.protobuf.e.b(r12, r4, r15)
            java.lang.Object r3 = r15.f7848c
            com.google.crypto.tink.shaded.protobuf.i r3 = (com.google.crypto.tink.shaded.protobuf.i) r3
            goto L6d
        Lac:
            if (r8 != 0) goto Lc1
            int r4 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r4, r15)
            int r13 = r15.f7846a
            com.google.crypto.tink.shaded.protobuf.r<?> r2 = r10.f8103d
            com.google.crypto.tink.shaded.protobuf.q r6 = r15.f7849d
            com.google.crypto.tink.shaded.protobuf.s0 r7 = r10.f8100a
            java.lang.Object r2 = r2.b(r6, r7, r13)
            com.google.crypto.tink.shaded.protobuf.z$e r2 = (com.google.crypto.tink.shaded.protobuf.z.e) r2
            goto L6d
        Lc1:
            int r7 = com.google.crypto.tink.shaded.protobuf.u1.f8011b
            if (r6 != r7) goto Lc6
            goto Lcb
        Lc6:
            int r4 = com.google.crypto.tink.shaded.protobuf.e.N(r6, r12, r4, r14, r15)
            goto L6d
        Lcb:
            if (r3 == 0) goto Ld4
            int r13 = com.google.crypto.tink.shaded.protobuf.u1.c(r13, r5)
            r1.n(r13, r3)
        Ld4:
            r13 = r4
            goto L19
        Ld7:
            if (r13 != r14) goto Lda
            return
        Lda:
            com.google.crypto.tink.shaded.protobuf.c0 r11 = com.google.crypto.tink.shaded.protobuf.c0.i()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.w0.c(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$b):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public void d(T t10, v1 v1Var) {
        Iterator<Map.Entry<?, Object>> r10 = this.f8103d.c(t10).r();
        while (r10.hasNext()) {
            Map.Entry<?, Object> next = r10.next();
            v.b bVar = (v.b) next.getKey();
            if (bVar.i() != u1.c.MESSAGE || bVar.e() || bVar.k()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            v1Var.h(bVar.c(), next instanceof e0.b ? ((e0.b) next).a().e() : next.getValue());
        }
        o(this.f8101b, t10, v1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public void e(T t10, g1 g1Var, q qVar) {
        l(this.f8101b, this.f8103d, t10, g1Var, qVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public void f(T t10) {
        this.f8101b.j(t10);
        this.f8103d.f(t10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final boolean g(T t10) {
        return this.f8103d.c(t10).o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public boolean h(T t10, T t11) {
        if (!this.f8101b.g(t10).equals(this.f8101b.g(t11))) {
            return false;
        }
        if (!this.f8102c) {
            return true;
        }
        return this.f8103d.c(t10).equals(this.f8103d.c(t11));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public int i(T t10) {
        int k10 = k(this.f8101b, t10) + 0;
        return this.f8102c ? k10 + this.f8103d.c(t10).j() : k10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public int j(T t10) {
        int hashCode = this.f8101b.g(t10).hashCode();
        return this.f8102c ? (hashCode * 53) + this.f8103d.c(t10).hashCode() : hashCode;
    }
}
