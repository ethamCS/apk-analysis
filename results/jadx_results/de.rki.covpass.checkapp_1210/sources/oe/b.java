package oe;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public abstract class b extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ne.n nVar) {
        super(nVar);
        if (nVar == null) {
            s(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void s(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.b.s(int):void");
    }

    @Override // oe.m
    protected boolean f(xc.h hVar) {
        if (hVar == null) {
            s(2);
        }
        return (hVar instanceof xc.e) && d(t(), hVar);
    }

    @Override // oe.g
    protected e0 j() {
        if (uc.h.t0(t())) {
            return null;
        }
        return x().i();
    }

    @Override // oe.g
    protected Collection<e0> k(boolean z10) {
        xc.m b10 = t().b();
        if (!(b10 instanceof xc.e)) {
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                s(3);
            }
            return emptyList;
        }
        ye.e eVar = new ye.e();
        xc.e eVar2 = (xc.e) b10;
        eVar.add(eVar2.u());
        xc.e E0 = eVar2.E0();
        if (z10 && E0 != null) {
            eVar.add(E0.u());
        }
        return eVar;
    }

    public abstract xc.e t();

    @Override // oe.e1
    public uc.h x() {
        uc.h f10 = ee.a.f(t());
        if (f10 == null) {
            s(1);
        }
        return f10;
    }
}
