package lh;

import org.bouncycastle.crypto.d0;
import zh.v1;
import zh.w1;
/* loaded from: classes3.dex */
public final class j implements d0 {

    /* renamed from: a */
    private v1 f16075a;

    @Override // org.bouncycastle.crypto.d0
    public void a(org.bouncycastle.crypto.i iVar, byte[] bArr, int i10) {
        this.f16075a.c((w1) iVar, bArr, i10);
    }

    @Override // org.bouncycastle.crypto.d0
    public int b() {
        return 56;
    }

    @Override // org.bouncycastle.crypto.d0
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f16075a = (v1) iVar;
    }
}
