package s6;

import s6.e;
/* loaded from: classes.dex */
final class b {

    /* renamed from: a */
    private final int f21476a;

    /* renamed from: b */
    private final byte[] f21477b;

    private b(int i10, byte[] bArr) {
        this.f21476a = i10;
        this.f21477b = bArr;
    }

    public static b[] b(byte[] bArr, e eVar) {
        e.c d10 = eVar.d();
        e.b[] a10 = d10.a();
        int i10 = 0;
        for (e.b bVar : a10) {
            i10 += bVar.a();
        }
        b[] bVarArr = new b[i10];
        int i11 = 0;
        for (e.b bVar2 : a10) {
            int i12 = 0;
            while (i12 < bVar2.a()) {
                int b10 = bVar2.b();
                bVarArr[i11] = new b(b10, new byte[d10.b() + b10]);
                i12++;
                i11++;
            }
        }
        int length = bVarArr[0].f21477b.length - d10.b();
        int i13 = length - 1;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = 0;
            while (i16 < i11) {
                bVarArr[i16].f21477b[i15] = bArr[i14];
                i16++;
                i14++;
            }
        }
        boolean z10 = eVar.i() == 24;
        int i17 = z10 ? 8 : i11;
        int i18 = 0;
        while (i18 < i17) {
            bVarArr[i18].f21477b[i13] = bArr[i14];
            i18++;
            i14++;
        }
        int length2 = bVarArr[0].f21477b.length;
        while (length < length2) {
            int i19 = 0;
            while (i19 < i11) {
                int i20 = z10 ? (i19 + 8) % i11 : i19;
                bVarArr[i20].f21477b[(!z10 || i20 <= 7) ? length : length - 1] = bArr[i14];
                i19++;
                i14++;
            }
            length++;
        }
        if (i14 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    public byte[] a() {
        return this.f21477b;
    }

    public int c() {
        return this.f21476a;
    }
}
