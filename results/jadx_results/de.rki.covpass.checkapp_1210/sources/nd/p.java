package nd;
/* loaded from: classes.dex */
public final class p {
    private static final boolean a(r rVar) {
        Object u02;
        wd.c d10;
        u02 = ub.c0.u0(rVar.o());
        b0 b0Var = (b0) u02;
        j jVar = null;
        x type = b0Var != null ? b0Var.getType() : null;
        if (type instanceof j) {
            jVar = (j) type;
        }
        if (jVar == null) {
            return false;
        }
        i f10 = jVar.f();
        return (f10 instanceof g) && (d10 = ((g) f10).d()) != null && hc.t.a(d10.b(), "java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r0.equals("toString") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return r3.o().isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r0.equals("hashCode") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean b(nd.r r3) {
        /*
            wd.f r0 = r3.getName()
            java.lang.String r0 = r0.b()
            int r1 = r0.hashCode()
            r2 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r1 == r2) goto L33
            r2 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r1 == r2) goto L25
            r2 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r1 == r2) goto L1c
            goto L44
        L1c:
            java.lang.String r1 = "hashCode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b
            goto L44
        L25:
            java.lang.String r1 = "equals"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            goto L44
        L2e:
            boolean r3 = a(r3)
            goto L45
        L33:
            java.lang.String r1 = "toString"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
        L3b:
            java.util.List r3 = r3.o()
            boolean r3 = r3.isEmpty()
            goto L45
        L44:
            r3 = 0
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.p.b(nd.r):boolean");
    }

    public static final boolean c(q qVar) {
        hc.t.e(qVar, "<this>");
        return qVar.S().H() && (qVar instanceof r) && b((r) qVar);
    }
}
