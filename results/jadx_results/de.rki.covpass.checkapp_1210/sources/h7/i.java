package h7;

import h6.s;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    private final boolean f11404a;

    public i(boolean z10) {
        this.f11404a = z10;
    }

    public void a(s[] sVarArr) {
        if (!this.f11404a || sVarArr == null || sVarArr.length < 3) {
            return;
        }
        s sVar = sVarArr[0];
        sVarArr[0] = sVarArr[2];
        sVarArr[2] = sVar;
    }
}
