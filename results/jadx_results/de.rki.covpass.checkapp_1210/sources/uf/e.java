package uf;

import bf.x;
import eg.f;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import of.b0;
import of.m;
import of.n;
import of.t;
import of.u;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\t*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0006H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u001a\u0010\u0016\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0017¨\u0006\u0019"}, d2 = {"Lof/t;", BuildConfig.FLAVOR, "headerName", BuildConfig.FLAVOR, "Lof/h;", "a", "Leg/c;", BuildConfig.FLAVOR, "result", "Ltb/e0;", "c", BuildConfig.FLAVOR, "g", BuildConfig.FLAVOR, "prefix", "h", "d", "e", "Lof/n;", "Lof/u;", "url", "headers", "f", "Lof/b0;", "b", "okhttp"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a */
    private static final eg.f f23609a;

    /* renamed from: b */
    private static final eg.f f23610b;

    static {
        f.a aVar = eg.f.Companion;
        f23609a = aVar.d("\"\\");
        f23610b = aVar.d("\t ,=");
    }

    public static final List<of.h> a(t tVar, String str) {
        boolean v10;
        hc.t.e(tVar, "<this>");
        hc.t.e(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = tVar.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            v10 = x.v(str, tVar.b(i10), true);
            if (v10) {
                try {
                    c(new eg.c().Q0(tVar.i(i10)), arrayList);
                } catch (EOFException e10) {
                    yf.h.Companion.g().k("Unable to parse challenge", 5, e10);
                }
            }
            i10 = i11;
        }
        return arrayList;
    }

    public static final boolean b(b0 b0Var) {
        boolean v10;
        hc.t.e(b0Var, "<this>");
        if (hc.t.a(b0Var.W().h(), "HEAD")) {
            return false;
        }
        int i10 = b0Var.i();
        if (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && pf.d.v(b0Var) == -1) {
            v10 = x.v("chunked", b0.r(b0Var, "Transfer-Encoding", null, 2, null), true);
            if (!v10) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0079, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0079, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void c(eg.c r7, java.util.List<of.h> r8) {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            g(r7)
            java.lang.String r1 = e(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = g(r7)
            java.lang.String r3 = e(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.g0()
            if (r7 != 0) goto L1f
            return
        L1f:
            of.h r7 = new of.h
            java.util.Map r0 = ub.n0.h()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = pf.d.K(r7, r4)
            boolean r6 = g(r7)
            if (r2 != 0) goto L5c
            if (r6 != 0) goto L40
            boolean r2 = r7.g0()
            if (r2 == 0) goto L5c
        L40:
            of.h r2 = new of.h
            java.lang.String r4 = "="
            java.lang.String r4 = bf.o.A(r4, r5)
            java.lang.String r3 = hc.t.l(r3, r4)
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            hc.t.d(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L5c:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = pf.d.K(r7, r4)
            int r5 = r5 + r6
        L66:
            if (r3 != 0) goto L77
            java.lang.String r3 = e(r7)
            boolean r5 = g(r7)
            if (r5 == 0) goto L73
            goto L79
        L73:
            int r5 = pf.d.K(r7, r4)
        L77:
            if (r5 != 0) goto L84
        L79:
            of.h r4 = new of.h
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L84:
            r6 = 1
            if (r5 <= r6) goto L88
            return
        L88:
            boolean r6 = g(r7)
            if (r6 == 0) goto L8f
            return
        L8f:
            r6 = 34
            boolean r6 = h(r7, r6)
            if (r6 == 0) goto L9c
            java.lang.String r6 = d(r7)
            goto La0
        L9c:
            java.lang.String r6 = e(r7)
        La0:
            if (r6 != 0) goto La3
            return
        La3:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lac
            return
        Lac:
            boolean r3 = g(r7)
            if (r3 != 0) goto Lb9
            boolean r3 = r7.g0()
            if (r3 != 0) goto Lb9
            return
        Lb9:
            r3 = r0
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.e.c(eg.c, java.util.List):void");
    }

    private static final String d(eg.c cVar) {
        if (cVar.readByte() == 34) {
            eg.c cVar2 = new eg.c();
            while (true) {
                long Y = cVar.Y(f23609a);
                if (Y == -1) {
                    return null;
                }
                if (cVar.M(Y) == 34) {
                    cVar2.O(cVar, Y);
                    cVar.readByte();
                    return cVar2.O0();
                } else if (cVar.e1() == Y + 1) {
                    return null;
                } else {
                    cVar2.O(cVar, Y);
                    cVar.readByte();
                    cVar2.O(cVar, 1L);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private static final String e(eg.c cVar) {
        long Y = cVar.Y(f23610b);
        if (Y == -1) {
            Y = cVar.e1();
        }
        if (Y != 0) {
            return cVar.R0(Y);
        }
        return null;
    }

    public static final void f(n nVar, u uVar, t tVar) {
        hc.t.e(nVar, "<this>");
        hc.t.e(uVar, "url");
        hc.t.e(tVar, "headers");
        if (nVar == n.f18276a) {
            return;
        }
        List<m> e10 = m.Companion.e(uVar, tVar);
        if (e10.isEmpty()) {
            return;
        }
        nVar.b(uVar, e10);
    }

    private static final boolean g(eg.c cVar) {
        boolean z10 = false;
        while (!cVar.g0()) {
            byte M = cVar.M(0L);
            if (M != 44) {
                if (!(M == 32 || M == 9)) {
                    break;
                }
                cVar.readByte();
            } else {
                cVar.readByte();
                z10 = true;
            }
        }
        return z10;
    }

    private static final boolean h(eg.c cVar, byte b10) {
        return !cVar.g0() && cVar.M(0L) == b10;
    }
}
