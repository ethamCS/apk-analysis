package o4;

import p4.c;
/* loaded from: classes.dex */
public class k {

    /* renamed from: f */
    private static final c.a f17508f = c.a.a("ef");

    /* renamed from: g */
    private static final c.a f17509g = c.a.a("nm", "v");

    /* renamed from: a */
    private k4.a f17510a;

    /* renamed from: b */
    private k4.b f17511b;

    /* renamed from: c */
    private k4.b f17512c;

    /* renamed from: d */
    private k4.b f17513d;

    /* renamed from: e */
    private k4.b f17514e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
        if (r0.equals("Opacity") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(p4.c r6, e4.h r7) {
        /*
            r5 = this;
            r6.f()
            java.lang.String r0 = ""
        L5:
            boolean r1 = r6.j()
            if (r1 == 0) goto L8d
            p4.c$a r1 = o4.k.f17509g
            int r1 = r6.M(r1)
            if (r1 == 0) goto L87
            r2 = 1
            if (r1 == r2) goto L1a
            r6.V()
            goto L5f
        L1a:
            r0.hashCode()
            r1 = -1
            int r3 = r0.hashCode()
            r4 = 0
            switch(r3) {
                case 353103893: goto L52;
                case 397447147: goto L49;
                case 1041377119: goto L3e;
                case 1379387491: goto L33;
                case 1383710113: goto L28;
                default: goto L26;
            }
        L26:
            r2 = r1
            goto L5c
        L28:
            java.lang.String r2 = "Softness"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L31
            goto L26
        L31:
            r2 = 4
            goto L5c
        L33:
            java.lang.String r2 = "Shadow Color"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L3c
            goto L26
        L3c:
            r2 = 3
            goto L5c
        L3e:
            java.lang.String r2 = "Direction"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L47
            goto L26
        L47:
            r2 = 2
            goto L5c
        L49:
            java.lang.String r3 = "Opacity"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L5c
            goto L26
        L52:
            java.lang.String r2 = "Distance"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L5b
            goto L26
        L5b:
            r2 = r4
        L5c:
            switch(r2) {
                case 0: goto L7f;
                case 1: goto L78;
                case 2: goto L71;
                case 3: goto L6a;
                case 4: goto L63;
                default: goto L5f;
            }
        L5f:
            r6.W()
            goto L5
        L63:
            k4.b r1 = o4.d.e(r6, r7)
            r5.f17514e = r1
            goto L5
        L6a:
            k4.a r1 = o4.d.c(r6, r7)
            r5.f17510a = r1
            goto L5
        L71:
            k4.b r1 = o4.d.f(r6, r7, r4)
            r5.f17512c = r1
            goto L5
        L78:
            k4.b r1 = o4.d.f(r6, r7, r4)
            r5.f17511b = r1
            goto L5
        L7f:
            k4.b r1 = o4.d.e(r6, r7)
            r5.f17513d = r1
            goto L5
        L87:
            java.lang.String r0 = r6.u()
            goto L5
        L8d:
            r6.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.k.a(p4.c, e4.h):void");
    }

    public j b(p4.c cVar, e4.h hVar) {
        k4.b bVar;
        k4.b bVar2;
        k4.b bVar3;
        k4.b bVar4;
        while (cVar.j()) {
            if (cVar.M(f17508f) != 0) {
                cVar.V();
                cVar.W();
            } else {
                cVar.e();
                while (cVar.j()) {
                    a(cVar, hVar);
                }
                cVar.h();
            }
        }
        k4.a aVar = this.f17510a;
        if (aVar == null || (bVar = this.f17511b) == null || (bVar2 = this.f17512c) == null || (bVar3 = this.f17513d) == null || (bVar4 = this.f17514e) == null) {
            return null;
        }
        return new j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
