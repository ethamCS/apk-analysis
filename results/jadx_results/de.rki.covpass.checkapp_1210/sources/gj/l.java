package gj;

import org.bouncycastle.crypto.r;
/* loaded from: classes3.dex */
class l {
    public static byte[] a(e eVar, byte[] bArr, int i10, byte[] bArr2) {
        r a10 = b.a(eVar.b());
        byte[] b10 = a.f().d(bArr).i(i10).h(-32640).g(0, 22).b();
        a10.update(b10, 0, b10.length);
        r a11 = b.a(eVar.b());
        byte[] b11 = a.f().d(bArr).i(i10).g(0, a11.getDigestSize() + 23).b();
        n nVar = new n(bArr, bArr2, b.a(eVar.b()));
        nVar.d(i10);
        nVar.c(0);
        int d10 = eVar.d();
        int c10 = eVar.c();
        int g10 = (1 << eVar.g()) - 1;
        int i11 = 0;
        while (i11 < d10) {
            nVar.a(b11, i11 < d10 + (-1), 23);
            ak.l.A((short) i11, b11, 20);
            for (int i12 = 0; i12 < g10; i12++) {
                b11[22] = (byte) i12;
                a11.update(b11, 0, b11.length);
                a11.doFinal(b11, 23);
            }
            a10.update(b11, 23, c10);
            i11++;
        }
        byte[] bArr3 = new byte[a10.getDigestSize()];
        a10.doFinal(bArr3, 0);
        return bArr3;
    }
}
