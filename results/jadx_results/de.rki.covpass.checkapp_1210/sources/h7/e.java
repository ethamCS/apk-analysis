package h7;

import java.util.Map;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    private final q6.c f11388a = new q6.c(q6.a.f19677l);

    private void a(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f11388a.a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (q6.e unused) {
            throw h6.d.b();
        }
    }

    private o6.e b(a aVar, Map<h6.e, ?> map) {
        j e10 = aVar.e();
        f d10 = aVar.d().d();
        b[] b10 = b.b(aVar.c(), e10, d10);
        int i10 = 0;
        for (b bVar : b10) {
            i10 += bVar.c();
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (b bVar2 : b10) {
            byte[] a10 = bVar2.a();
            int c10 = bVar2.c();
            a(a10, c10);
            int i12 = 0;
            while (i12 < c10) {
                bArr[i11] = a10[i12];
                i12++;
                i11++;
            }
        }
        return d.a(bArr, e10, d10, map);
    }

    public o6.e c(o6.b bVar, Map<h6.e, ?> map) {
        h6.d e10;
        a aVar = new a(bVar);
        h6.h hVar = null;
        try {
            return b(aVar, map);
        } catch (h6.d e11) {
            e10 = e11;
            try {
                aVar.f();
                aVar.g(true);
                aVar.e();
                aVar.d();
                aVar.b();
                o6.e b10 = b(aVar, map);
                b10.m(new i(true));
                return b10;
            } catch (h6.d | h6.h unused) {
                if (hVar == null) {
                    throw e10;
                }
                throw hVar;
            }
        } catch (h6.h e12) {
            e10 = null;
            hVar = e12;
            aVar.f();
            aVar.g(true);
            aVar.e();
            aVar.d();
            aVar.b();
            o6.e b102 = b(aVar, map);
            b102.m(new i(true));
            return b102;
        }
    }
}
