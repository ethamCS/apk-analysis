package mh;

import ak.l;
import gg.a2;
import gg.h;
import gg.t1;
import gg.v;
import gg.x1;
import java.io.IOException;
import org.bouncycastle.crypto.a0;
import org.bouncycastle.crypto.p;
import org.bouncycastle.crypto.q;
import org.bouncycastle.crypto.r;
/* loaded from: classes3.dex */
public class c implements p {

    /* renamed from: a */
    private final r f16678a;

    /* renamed from: b */
    private v f16679b;

    /* renamed from: c */
    private int f16680c;

    /* renamed from: d */
    private byte[] f16681d;

    /* renamed from: e */
    private byte[] f16682e;

    public c(r rVar) {
        this.f16678a = rVar;
    }

    @Override // org.bouncycastle.crypto.p
    public int generateBytes(byte[] bArr, int i10, int i11) {
        boolean z10;
        int i12 = i11;
        int i13 = i10;
        if (bArr.length - i12 >= i13) {
            long j10 = i12;
            int digestSize = this.f16678a.getDigestSize();
            if (j10 > 8589934591L) {
                throw new IllegalArgumentException("Output length too large");
            }
            long j11 = digestSize;
            int i14 = (int) (((j10 + j11) - 1) / j11);
            byte[] bArr2 = new byte[this.f16678a.getDigestSize()];
            int i15 = 0;
            int i16 = 0;
            int i17 = 1;
            while (i16 < i14) {
                r rVar = this.f16678a;
                byte[] bArr3 = this.f16681d;
                rVar.update(bArr3, i15, bArr3.length);
                h hVar = new h();
                h hVar2 = new h();
                hVar2.a(this.f16679b);
                hVar2.a(new t1(l.h(i17)));
                hVar.a(new x1(hVar2));
                if (this.f16682e != null) {
                    z10 = true;
                    hVar.a(new a2(true, i15, new t1(this.f16682e)));
                } else {
                    z10 = true;
                }
                hVar.a(new a2(z10, 2, new t1(l.h(this.f16680c))));
                try {
                    byte[] k10 = new x1(hVar).k("DER");
                    this.f16678a.update(k10, 0, k10.length);
                    this.f16678a.doFinal(bArr2, 0);
                    if (i12 > digestSize) {
                        System.arraycopy(bArr2, 0, bArr, i13, digestSize);
                        i13 += digestSize;
                        i12 -= digestSize;
                    } else {
                        System.arraycopy(bArr2, 0, bArr, i13, i12);
                    }
                    i17++;
                    i16++;
                    i15 = 0;
                } catch (IOException e10) {
                    throw new IllegalArgumentException("unable to encode parameter info: " + e10.getMessage());
                }
            }
            this.f16678a.reset();
            return (int) j10;
        }
        throw new a0("output buffer too small");
    }

    @Override // org.bouncycastle.crypto.p
    public void init(q qVar) {
        b bVar = (b) qVar;
        this.f16679b = bVar.a();
        this.f16680c = bVar.c();
        this.f16681d = bVar.d();
        this.f16682e = bVar.b();
    }
}
