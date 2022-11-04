package lh;

import org.bouncycastle.crypto.d0;
import zh.x1;
import zh.y1;
/* loaded from: classes3.dex */
public class k implements d0 {

    /* renamed from: a */
    private final d0 f16076a;

    /* renamed from: b */
    private x1 f16077b;

    public k(d0 d0Var) {
        this.f16076a = d0Var;
    }

    @Override // org.bouncycastle.crypto.d0
    public void a(org.bouncycastle.crypto.i iVar, byte[] bArr, int i10) {
        y1 y1Var = (y1) iVar;
        this.f16076a.init(this.f16077b.a());
        this.f16076a.a(y1Var.a(), bArr, i10);
        this.f16076a.init(this.f16077b.b());
        this.f16076a.a(y1Var.b(), bArr, i10 + this.f16076a.b());
    }

    @Override // org.bouncycastle.crypto.d0
    public int b() {
        return this.f16076a.b() * 2;
    }

    @Override // org.bouncycastle.crypto.d0
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f16077b = (x1) iVar;
    }
}
