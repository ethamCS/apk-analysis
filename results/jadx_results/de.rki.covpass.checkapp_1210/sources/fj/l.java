package fj;

import gg.a0;
import gg.q;
import gg.t;
import gg.t1;
import gg.x1;
/* loaded from: classes3.dex */
public class l extends t {

    /* renamed from: c */
    private final byte[] f10303c;

    /* renamed from: d */
    private final byte[] f10304d;

    public l(byte[] bArr, byte[] bArr2) {
        this.f10303c = ak.a.h(bArr);
        this.f10304d = ak.a.h(bArr2);
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h();
        hVar.a(new q(0L));
        hVar.a(new t1(this.f10303c));
        hVar.a(new t1(this.f10304d));
        return new x1(hVar);
    }
}
