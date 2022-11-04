package od;

import gd.a0;
import hc.t;
import java.util.Set;
import oe.m1;
import ub.c0;
import ub.z0;
/* loaded from: classes.dex */
public final class s {
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d2, code lost:
        if (r6 != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final od.e a(od.e r6, java.util.Collection<od.e> r7, boolean r8, boolean r9, boolean r10) {
        /*
            java.lang.String r0 = "<this>"
            hc.t.e(r6, r0)
            java.lang.String r0 = "superQualifiers"
            hc.t.e(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r7.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            od.e r2 = (od.e) r2
            od.h r2 = b(r2)
            if (r2 == 0) goto L13
            r0.add(r2)
            goto L13
        L29:
            java.util.Set r0 = ub.s.J0(r0)
            od.h r1 = b(r6)
            od.h r0 = e(r0, r1, r8)
            if (r0 != 0) goto L63
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r7.iterator()
        L40:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L56
            java.lang.Object r3 = r2.next()
            od.e r3 = (od.e) r3
            od.h r3 = r3.d()
            if (r3 == 0) goto L40
            r1.add(r3)
            goto L40
        L56:
            java.util.Set r1 = ub.s.J0(r1)
            od.h r2 = r6.d()
            od.h r1 = e(r1, r2, r8)
            goto L64
        L63:
            r1 = r0
        L64:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r7.iterator()
        L6d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L83
            java.lang.Object r4 = r3.next()
            od.e r4 = (od.e) r4
            od.f r4 = r4.c()
            if (r4 == 0) goto L6d
            r2.add(r4)
            goto L6d
        L83:
            java.util.Set r2 = ub.s.J0(r2)
            od.f r3 = od.f.MUTABLE
            od.f r4 = od.f.READ_ONLY
            od.f r5 = r6.c()
            java.lang.Object r8 = d(r2, r3, r4, r5, r8)
            od.f r8 = (od.f) r8
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto La9
            if (r10 != 0) goto La5
            if (r9 == 0) goto La3
            od.h r9 = od.h.NULLABLE
            if (r1 != r9) goto La3
            goto La5
        La3:
            r9 = r4
            goto La6
        La5:
            r9 = r3
        La6:
            if (r9 != 0) goto La9
            r2 = r1
        La9:
            od.h r9 = od.h.NOT_NULL
            if (r2 != r9) goto Ld6
            boolean r6 = r6.b()
            if (r6 != 0) goto Ld4
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto Lbb
        Lb9:
            r6 = r4
            goto Ld2
        Lbb:
            java.util.Iterator r6 = r7.iterator()
        Lbf:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb9
            java.lang.Object r7 = r6.next()
            od.e r7 = (od.e) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto Lbf
            r6 = r3
        Ld2:
            if (r6 == 0) goto Ld6
        Ld4:
            r6 = r3
            goto Ld7
        Ld6:
            r6 = r4
        Ld7:
            if (r2 == 0) goto Ldc
            if (r0 == r1) goto Ldc
            goto Ldd
        Ldc:
            r3 = r4
        Ldd:
            od.e r7 = new od.e
            r7.<init>(r2, r8, r6, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: od.s.a(od.e, java.util.Collection, boolean, boolean, boolean):od.e");
    }

    private static final h b(e eVar) {
        if (eVar.e()) {
            return null;
        }
        return eVar.d();
    }

    public static final boolean c(m1 m1Var, se.i iVar) {
        t.e(m1Var, "<this>");
        t.e(iVar, "type");
        wd.c cVar = a0.f10652u;
        t.d(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        return m1Var.W(iVar, cVar);
    }

    private static final <T> T d(Set<? extends T> set, T t10, T t11, T t12, boolean z10) {
        Set i10;
        Set<? extends T> J0;
        Object t02;
        if (z10) {
            T t13 = set.contains(t10) ? t10 : set.contains(t11) ? t11 : null;
            if (t.a(t13, t10) && t.a(t12, t11)) {
                return null;
            }
            return t12 == null ? t13 : t12;
        }
        if (t12 != null) {
            i10 = z0.i(set, t12);
            J0 = c0.J0(i10);
            if (J0 != null) {
                set = J0;
            }
        }
        t02 = c0.t0(set);
        return (T) t02;
    }

    private static final h e(Set<? extends h> set, h hVar, boolean z10) {
        h hVar2 = h.FORCE_FLEXIBILITY;
        return hVar == hVar2 ? hVar2 : (h) d(set, h.NOT_NULL, h.NULLABLE, hVar, z10);
    }
}
