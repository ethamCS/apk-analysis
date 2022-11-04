package oe;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes3.dex */
public final class c0 extends j1 {

    /* renamed from: b */
    private final xc.f1[] f17920b;

    /* renamed from: c */
    private final g1[] f17921c;

    /* renamed from: d */
    private final boolean f17922d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c0(java.util.List<? extends xc.f1> r9, java.util.List<? extends oe.g1> r10) {
        /*
            r8 = this;
            java.lang.String r0 = "parameters"
            hc.t.e(r9, r0)
            java.lang.String r0 = "argumentsList"
            hc.t.e(r10, r0)
            r0 = 0
            xc.f1[] r1 = new xc.f1[r0]
            java.lang.Object[] r9 = r9.toArray(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            hc.t.c(r9, r1)
            r3 = r9
            xc.f1[] r3 = (xc.f1[]) r3
            oe.g1[] r9 = new oe.g1[r0]
            java.lang.Object[] r9 = r10.toArray(r9)
            hc.t.c(r9, r1)
            r4 = r9
            oe.g1[] r4 = (oe.g1[]) r4
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.c0.<init>(java.util.List, java.util.List):void");
    }

    public c0(xc.f1[] f1VarArr, g1[] g1VarArr, boolean z10) {
        hc.t.e(f1VarArr, "parameters");
        hc.t.e(g1VarArr, "arguments");
        this.f17920b = f1VarArr;
        this.f17921c = g1VarArr;
        this.f17922d = z10;
        int length = f1VarArr.length;
        int length2 = g1VarArr.length;
    }

    public /* synthetic */ c0(xc.f1[] f1VarArr, g1[] g1VarArr, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f1VarArr, g1VarArr, (i10 & 4) != 0 ? false : z10);
    }

    @Override // oe.j1
    public boolean b() {
        return this.f17922d;
    }

    @Override // oe.j1
    public g1 e(e0 e0Var) {
        hc.t.e(e0Var, "key");
        xc.h z10 = e0Var.W0().z();
        xc.f1 f1Var = z10 instanceof xc.f1 ? (xc.f1) z10 : null;
        if (f1Var == null) {
            return null;
        }
        int l10 = f1Var.l();
        xc.f1[] f1VarArr = this.f17920b;
        if (l10 < f1VarArr.length && hc.t.a(f1VarArr[l10].r(), f1Var.r())) {
            return this.f17921c[l10];
        }
        return null;
    }

    @Override // oe.j1
    public boolean f() {
        return this.f17921c.length == 0;
    }

    public final g1[] i() {
        return this.f17921c;
    }

    public final xc.f1[] j() {
        return this.f17920b;
    }
}
