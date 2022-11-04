package w6;

import h6.d;
import h6.h;
import java.util.Map;
import q6.e;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private final q6.c f24691a = new q6.c(q6.a.f19680o);

    private void a(byte[] bArr, int i10, int i11, int i12, int i13) {
        int i14 = i11 + i12;
        int i15 = i13 == 0 ? 1 : 2;
        int[] iArr = new int[i14 / i15];
        for (int i16 = 0; i16 < i14; i16++) {
            if (i13 == 0 || i16 % 2 == i13 - 1) {
                iArr[i16 / i15] = bArr[i16 + i10] & 255;
            }
        }
        try {
            this.f24691a.a(iArr, i12 / i15);
            for (int i17 = 0; i17 < i11; i17++) {
                if (i13 == 0 || i17 % 2 == i13 - 1) {
                    bArr[i17 + i10] = (byte) iArr[i17 / i15];
                }
            }
        } catch (e unused) {
            throw d.b();
        }
    }

    public o6.e b(o6.b bVar, Map<h6.e, ?> map) {
        int i10;
        byte[] a10 = new a(bVar).a();
        a(a10, 0, 10, 10, 0);
        int i11 = a10[0] & 15;
        if (i11 == 2 || i11 == 3 || i11 == 4) {
            a(a10, 20, 84, 40, 1);
            a(a10, 20, 84, 40, 2);
            i10 = 94;
        } else if (i11 != 5) {
            throw h.b();
        } else {
            a(a10, 20, 68, 56, 1);
            a(a10, 20, 68, 56, 2);
            i10 = 78;
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(a10, 0, bArr, 0, 10);
        System.arraycopy(a10, 20, bArr, 10, bArr.length - 10);
        return b.a(bArr, i11);
    }
}
