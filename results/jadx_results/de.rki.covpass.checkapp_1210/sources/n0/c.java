package n0;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class c extends p {

    /* renamed from: k */
    ArrayList<p> f16765k = new ArrayList<>();

    /* renamed from: l */
    private int f16766l;

    public c(m0.e eVar, int i10) {
        super(eVar);
        this.f16830f = i10;
        q();
    }

    private void q() {
        m0.e eVar;
        m0.e eVar2 = this.f16826b;
        do {
            eVar = eVar2;
            eVar2 = eVar2.J(this.f16830f);
        } while (eVar2 != null);
        this.f16826b = eVar;
        this.f16765k.add(eVar.L(this.f16830f));
        m0.e H = eVar.H(this.f16830f);
        while (H != null) {
            this.f16765k.add(H.L(this.f16830f));
            H = H.H(this.f16830f);
        }
        Iterator<p> it = this.f16765k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i10 = this.f16830f;
            if (i10 == 0) {
                next.f16826b.f16173c = this;
            } else if (i10 == 1) {
                next.f16826b.f16175d = this;
            }
        }
        if ((this.f16830f == 0 && ((m0.f) this.f16826b.I()).L1()) && this.f16765k.size() > 1) {
            ArrayList<p> arrayList = this.f16765k;
            this.f16826b = arrayList.get(arrayList.size() - 1).f16826b;
        }
        this.f16766l = this.f16830f == 0 ? this.f16826b.x() : this.f16826b.Q();
    }

    private m0.e r() {
        for (int i10 = 0; i10 < this.f16765k.size(); i10++) {
            p pVar = this.f16765k.get(i10);
            if (pVar.f16826b.T() != 8) {
                return pVar.f16826b;
            }
        }
        return null;
    }

    private m0.e s() {
        for (int size = this.f16765k.size() - 1; size >= 0; size--) {
            p pVar = this.f16765k.get(size);
            if (pVar.f16826b.T() != 8) {
                return pVar.f16826b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x03d1, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    @Override // n0.p, n0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(n0.d r27) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.c.a(n0.d):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
        if (r1 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
        if (r1 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
        b(r5.f16833i, r1, -r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
        r5.f16832h.f16776a = r5;
        r5.f16833i.f16776a = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
        return;
     */
    @Override // n0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            r5 = this;
            java.util.ArrayList<n0.p> r0 = r5.f16765k
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            n0.p r1 = (n0.p) r1
            r1.d()
            goto L6
        L16:
            java.util.ArrayList<n0.p> r0 = r5.f16765k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L20
            return
        L20:
            java.util.ArrayList<n0.p> r2 = r5.f16765k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            n0.p r2 = (n0.p) r2
            m0.e r2 = r2.f16826b
            java.util.ArrayList<n0.p> r4 = r5.f16765k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            n0.p r0 = (n0.p) r0
            m0.e r0 = r0.f16826b
            int r4 = r5.f16830f
            if (r4 != 0) goto L70
            m0.d r1 = r2.O
            m0.d r0 = r0.Q
            n0.f r2 = r5.i(r1, r3)
            int r1 = r1.e()
            m0.e r4 = r5.r()
            if (r4 == 0) goto L52
            m0.d r1 = r4.O
            int r1 = r1.e()
        L52:
            if (r2 == 0) goto L59
            n0.f r4 = r5.f16832h
            r5.b(r4, r2, r1)
        L59:
            n0.f r1 = r5.i(r0, r3)
            int r0 = r0.e()
            m0.e r2 = r5.s()
            if (r2 == 0) goto L6d
            m0.d r0 = r2.Q
            int r0 = r0.e()
        L6d:
            if (r1 == 0) goto Lab
            goto La5
        L70:
            m0.d r2 = r2.P
            m0.d r0 = r0.R
            n0.f r3 = r5.i(r2, r1)
            int r2 = r2.e()
            m0.e r4 = r5.r()
            if (r4 == 0) goto L88
            m0.d r2 = r4.P
            int r2 = r2.e()
        L88:
            if (r3 == 0) goto L8f
            n0.f r4 = r5.f16832h
            r5.b(r4, r3, r2)
        L8f:
            n0.f r1 = r5.i(r0, r1)
            int r0 = r0.e()
            m0.e r2 = r5.s()
            if (r2 == 0) goto La3
            m0.d r0 = r2.R
            int r0 = r0.e()
        La3:
            if (r1 == 0) goto Lab
        La5:
            n0.f r2 = r5.f16833i
            int r0 = -r0
            r5.b(r2, r1, r0)
        Lab:
            n0.f r0 = r5.f16832h
            r0.f16776a = r5
            n0.f r0 = r5.f16833i
            r0.f16776a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.c.d():void");
    }

    @Override // n0.p
    public void e() {
        for (int i10 = 0; i10 < this.f16765k.size(); i10++) {
            this.f16765k.get(i10).e();
        }
    }

    @Override // n0.p
    public void f() {
        this.f16827c = null;
        Iterator<p> it = this.f16765k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // n0.p
    public long j() {
        int size = this.f16765k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = this.f16765k.get(i10);
            j10 = j10 + pVar.f16832h.f16781f + pVar.j() + pVar.f16833i.f16781f;
        }
        return j10;
    }

    @Override // n0.p
    public boolean m() {
        int size = this.f16765k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f16765k.get(i10).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f16830f == 0 ? "horizontal : " : "vertical : ");
        Iterator<p> it = this.f16765k.iterator();
        while (it.hasNext()) {
            sb2.append("<");
            sb2.append(it.next());
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
