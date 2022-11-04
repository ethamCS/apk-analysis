package mi;

import gg.r1;
import javax.crypto.spec.PBEKeySpec;
/* loaded from: classes3.dex */
public class o extends PBEKeySpec {

    /* renamed from: d */
    private static final hh.b f16717d = new hh.b(zg.q.I1, r1.f10880d);

    /* renamed from: c */
    private hh.b f16718c;

    public o(char[] cArr, byte[] bArr, int i10, int i11, hh.b bVar) {
        super(cArr, bArr, i10, i11);
        this.f16718c = bVar;
    }

    public hh.b a() {
        return this.f16718c;
    }
}
