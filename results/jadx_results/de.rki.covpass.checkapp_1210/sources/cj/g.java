package cj;

import gg.a0;
import gg.p;
/* loaded from: classes3.dex */
public class g {

    /* renamed from: a */
    private final jh.e f6641a;

    /* renamed from: b */
    private final a f6642b;

    public g(byte[] bArr) {
        p pVar = new p(bArr);
        this.f6641a = new jh.e(pVar.s().getEncoded());
        a0 s10 = pVar.s();
        if (s10 != null) {
            this.f6642b = new a(s10.getEncoded());
        } else {
            this.f6642b = null;
        }
    }
}
