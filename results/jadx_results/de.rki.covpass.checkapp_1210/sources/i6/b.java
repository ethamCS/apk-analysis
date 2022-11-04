package i6;

import h6.o;
import h6.q;
/* loaded from: classes.dex */
public final class b implements o {
    @Override // h6.o
    public q a(h6.c cVar) {
        return b(cVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e A[LOOP:0: B:28:0x005c->B:29:0x005e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    @Override // h6.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h6.q b(h6.c r11, java.util.Map<h6.e, ?> r12) {
        /*
            r10 = this;
            k6.a r0 = new k6.a
            o6.b r11 = r11.a()
            r0.<init>(r11)
            r11 = 0
            r1 = 0
            i6.a r2 = r0.a(r11)     // Catch: h6.h -> L25 h6.m -> L2b
            h6.s[] r3 = r2.b()     // Catch: h6.h -> L25 h6.m -> L2b
            j6.a r4 = new j6.a     // Catch: h6.h -> L21 h6.m -> L23
            r4.<init>()     // Catch: h6.h -> L21 h6.m -> L23
            o6.e r2 = r4.c(r2)     // Catch: h6.h -> L21 h6.m -> L23
            r4 = r3
            r3 = r1
            r1 = r2
            r2 = r3
            goto L2f
        L21:
            r2 = move-exception
            goto L27
        L23:
            r2 = move-exception
            goto L2d
        L25:
            r2 = move-exception
            r3 = r1
        L27:
            r4 = r3
            r3 = r2
            r2 = r1
            goto L2f
        L2b:
            r2 = move-exception
            r3 = r1
        L2d:
            r4 = r3
            r3 = r1
        L2f:
            if (r1 != 0) goto L4e
            r1 = 1
            i6.a r0 = r0.a(r1)     // Catch: h6.h -> L44 h6.m -> L46
            h6.s[] r4 = r0.b()     // Catch: h6.h -> L44 h6.m -> L46
            j6.a r1 = new j6.a     // Catch: h6.h -> L44 h6.m -> L46
            r1.<init>()     // Catch: h6.h -> L44 h6.m -> L46
            o6.e r1 = r1.c(r0)     // Catch: h6.h -> L44 h6.m -> L46
            goto L4e
        L44:
            r11 = move-exception
            goto L47
        L46:
            r11 = move-exception
        L47:
            if (r2 != 0) goto L4d
            if (r3 == 0) goto L4c
            throw r3
        L4c:
            throw r11
        L4d:
            throw r2
        L4e:
            r6 = r4
            if (r12 == 0) goto L66
            h6.e r0 = h6.e.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r12 = r12.get(r0)
            h6.t r12 = (h6.t) r12
            if (r12 == 0) goto L66
            int r0 = r6.length
        L5c:
            if (r11 >= r0) goto L66
            r2 = r6[r11]
            r12.a(r2)
            int r11 = r11 + 1
            goto L5c
        L66:
            h6.q r11 = new h6.q
            java.lang.String r3 = r1.h()
            byte[] r4 = r1.e()
            int r5 = r1.c()
            h6.a r7 = h6.a.AZTEC
            long r8 = java.lang.System.currentTimeMillis()
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.List r12 = r1.a()
            if (r12 == 0) goto L89
            h6.r r0 = h6.r.BYTE_SEGMENTS
            r11.h(r0, r12)
        L89:
            java.lang.String r12 = r1.b()
            if (r12 == 0) goto L94
            h6.r r0 = h6.r.ERROR_CORRECTION_LEVEL
            r11.h(r0, r12)
        L94:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.b.b(h6.c, java.util.Map):h6.q");
    }

    @Override // h6.o
    public void reset() {
    }
}
