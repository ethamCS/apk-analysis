package x6;

import java.util.Collection;
import java.util.Map;
/* loaded from: classes.dex */
public final class q extends r {

    /* renamed from: b */
    private static final y[] f25433b = new y[0];

    /* renamed from: a */
    private final y[] f25434a;

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(java.util.Map<h6.e, ?> r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto L7
            r3 = 0
            goto Lf
        L7:
            h6.e r0 = h6.e.POSSIBLE_FORMATS
            java.lang.Object r3 = r3.get(r0)
            java.util.Collection r3 = (java.util.Collection) r3
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L55
            h6.a r1 = h6.a.EAN_13
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L27
            x6.i r1 = new x6.i
            r1.<init>()
        L23:
            r0.add(r1)
            goto L35
        L27:
            h6.a r1 = h6.a.UPC_A
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L35
            x6.t r1 = new x6.t
            r1.<init>()
            goto L23
        L35:
            h6.a r1 = h6.a.EAN_8
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L45
            x6.k r1 = new x6.k
            r1.<init>()
            r0.add(r1)
        L45:
            h6.a r1 = h6.a.UPC_E
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L55
            x6.a0 r3 = new x6.a0
            r3.<init>()
            r0.add(r3)
        L55:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L73
            x6.i r3 = new x6.i
            r3.<init>()
            r0.add(r3)
            x6.k r3 = new x6.k
            r3.<init>()
            r0.add(r3)
            x6.a0 r3 = new x6.a0
            r3.<init>()
            r0.add(r3)
        L73:
            x6.y[] r3 = x6.q.f25433b
            java.lang.Object[] r3 = r0.toArray(r3)
            x6.y[] r3 = (x6.y[]) r3
            r2.f25434a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.q.<init>(java.util.Map):void");
    }

    @Override // x6.r
    public h6.q c(int i10, o6.a aVar, Map<h6.e, ?> map) {
        boolean z10;
        int[] p10 = y.p(aVar);
        for (y yVar : this.f25434a) {
            try {
                h6.q m10 = yVar.m(i10, aVar, p10, map);
                boolean z11 = m10.b() == h6.a.EAN_13 && m10.f().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(h6.e.POSSIBLE_FORMATS);
                if (collection != null && !collection.contains(h6.a.UPC_A)) {
                    z10 = false;
                    if (z11 || !z10) {
                        return m10;
                    }
                    h6.q qVar = new h6.q(m10.f().substring(1), m10.c(), m10.e(), h6.a.UPC_A);
                    qVar.g(m10.d());
                    return qVar;
                }
                z10 = true;
                if (z11) {
                }
                return m10;
            } catch (h6.p unused) {
            }
        }
        throw h6.m.b();
    }

    @Override // x6.r, h6.o
    public void reset() {
        for (y yVar : this.f25434a) {
            yVar.reset();
        }
    }
}
