package b.e.b.k.m;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class c extends p {
    ArrayList<p> k = new ArrayList<>();
    private int l;

    public c(b.e.b.k.e eVar, int i) {
        super(eVar);
        this.f2328f = i;
        q();
    }

    private void q() {
        b.e.b.k.e eVar;
        b.e.b.k.e eVar2 = this.f2324b;
        do {
            eVar = eVar2;
            eVar2 = eVar2.J(this.f2328f);
        } while (eVar2 != null);
        this.f2324b = eVar;
        this.k.add(eVar.L(this.f2328f));
        b.e.b.k.e H = eVar.H(this.f2328f);
        while (H != null) {
            this.k.add(H.L(this.f2328f));
            H = H.H(this.f2328f);
        }
        Iterator<p> it = this.k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i = this.f2328f;
            if (i == 0) {
                next.f2324b.f2260b = this;
            } else if (i == 1) {
                next.f2324b.f2261c = this;
            }
        }
        if ((this.f2328f == 0 && ((b.e.b.k.f) this.f2324b.I()).x1()) && this.k.size() > 1) {
            ArrayList<p> arrayList = this.k;
            this.f2324b = arrayList.get(arrayList.size() - 1).f2324b;
        }
        this.l = this.f2328f == 0 ? this.f2324b.x() : this.f2324b.N();
    }

    private b.e.b.k.e r() {
        for (int i = 0; i < this.k.size(); i++) {
            p pVar = this.k.get(i);
            if (pVar.f2324b.Q() != 8) {
                return pVar.f2324b;
            }
        }
        return null;
    }

    private b.e.b.k.e s() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            p pVar = this.k.get(size);
            if (pVar.f2324b.Q() != 8) {
                return pVar.f2324b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a0, code lost:
        if (r1 != r7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01c6, code lost:
        if (r1 != r7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c8, code lost:
        r13 = r13 + 1;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cb, code lost:
        r9.f2327e.d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x03eb, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00eb  */
    @Override // b.e.b.k.m.p, b.e.b.k.m.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(b.e.b.k.m.d r26) {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.b.k.m.c.a(b.e.b.k.m.d):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
        if (r1 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
        if (r1 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
        b(r5.i, r1, -r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
        r5.f2330h.f2295a = r5;
        r5.i.f2295a = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
        return;
     */
    @Override // b.e.b.k.m.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            r5 = this;
            java.util.ArrayList<b.e.b.k.m.p> r0 = r5.k
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            b.e.b.k.m.p r1 = (b.e.b.k.m.p) r1
            r1.d()
            goto L6
        L16:
            java.util.ArrayList<b.e.b.k.m.p> r0 = r5.k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L20
            return
        L20:
            java.util.ArrayList<b.e.b.k.m.p> r2 = r5.k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            b.e.b.k.m.p r2 = (b.e.b.k.m.p) r2
            b.e.b.k.e r2 = r2.f2324b
            java.util.ArrayList<b.e.b.k.m.p> r4 = r5.k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            b.e.b.k.m.p r0 = (b.e.b.k.m.p) r0
            b.e.b.k.e r0 = r0.f2324b
            int r4 = r5.f2328f
            if (r4 != 0) goto L70
            b.e.b.k.d r1 = r2.F
            b.e.b.k.d r0 = r0.H
            b.e.b.k.m.f r2 = r5.i(r1, r3)
            int r1 = r1.e()
            b.e.b.k.e r4 = r5.r()
            if (r4 == 0) goto L52
            b.e.b.k.d r1 = r4.F
            int r1 = r1.e()
        L52:
            if (r2 == 0) goto L59
            b.e.b.k.m.f r4 = r5.f2330h
            r5.b(r4, r2, r1)
        L59:
            b.e.b.k.m.f r1 = r5.i(r0, r3)
            int r0 = r0.e()
            b.e.b.k.e r2 = r5.s()
            if (r2 == 0) goto L6d
            b.e.b.k.d r0 = r2.H
            int r0 = r0.e()
        L6d:
            if (r1 == 0) goto Lab
            goto La5
        L70:
            b.e.b.k.d r2 = r2.G
            b.e.b.k.d r0 = r0.I
            b.e.b.k.m.f r3 = r5.i(r2, r1)
            int r2 = r2.e()
            b.e.b.k.e r4 = r5.r()
            if (r4 == 0) goto L88
            b.e.b.k.d r2 = r4.G
            int r2 = r2.e()
        L88:
            if (r3 == 0) goto L8f
            b.e.b.k.m.f r4 = r5.f2330h
            r5.b(r4, r3, r2)
        L8f:
            b.e.b.k.m.f r1 = r5.i(r0, r1)
            int r0 = r0.e()
            b.e.b.k.e r2 = r5.s()
            if (r2 == 0) goto La3
            b.e.b.k.d r0 = r2.I
            int r0 = r0.e()
        La3:
            if (r1 == 0) goto Lab
        La5:
            b.e.b.k.m.f r2 = r5.i
            int r0 = -r0
            r5.b(r2, r1, r0)
        Lab:
            b.e.b.k.m.f r0 = r5.f2330h
            r0.f2295a = r5
            b.e.b.k.m.f r0 = r5.i
            r0.f2295a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.b.k.m.c.d():void");
    }

    @Override // b.e.b.k.m.p
    public void e() {
        for (int i = 0; i < this.k.size(); i++) {
            this.k.get(i).e();
        }
    }

    @Override // b.e.b.k.m.p
    public void f() {
        this.f2325c = null;
        Iterator<p> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // b.e.b.k.m.p
    public long j() {
        int size = this.k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            p pVar = this.k.get(i);
            j = j + pVar.f2330h.f2300f + pVar.j() + pVar.i.f2300f;
        }
        return j;
    }

    @Override // b.e.b.k.m.p
    public boolean m() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            if (!this.k.get(i).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        Iterator<p> it;
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f2328f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        while (this.k.iterator().hasNext()) {
            sb2 = ((sb2 + "<") + it.next()) + "> ";
        }
        return sb2;
    }
}
