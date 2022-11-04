package lh;

import org.bouncycastle.crypto.d0;
import zh.s1;
import zh.t1;
/* loaded from: classes3.dex */
public final class i implements d0 {

    /* renamed from: a */
    private s1 f16074a;

    @Override // org.bouncycastle.crypto.d0
    public void a(org.bouncycastle.crypto.i iVar, byte[] bArr, int i10) {
        this.f16074a.c((t1) iVar, bArr, i10);
    }

    @Override // org.bouncycastle.crypto.d0
    public int b() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.d0
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f16074a = (s1) iVar;
    }
}
