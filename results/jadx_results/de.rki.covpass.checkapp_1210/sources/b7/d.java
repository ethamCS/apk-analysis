package b7;

import f7.e;
import h6.g;
import h6.u;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;
/* loaded from: classes.dex */
public final class d implements u {
    private static o6.b b(byte[][] bArr, int i10) {
        int i11 = i10 * 2;
        o6.b bVar = new o6.b(bArr[0].length + i11, bArr.length + i11);
        bVar.c();
        int i12 = (bVar.i() - i10) - 1;
        int i13 = 0;
        while (i13 < bArr.length) {
            byte[] bArr2 = bArr[i13];
            for (int i14 = 0; i14 < bArr[0].length; i14++) {
                if (bArr2[i14] == 1) {
                    bVar.o(i14 + i10, i12);
                }
            }
            i13++;
            i12--;
        }
        return bVar;
    }

    private static o6.b c(e eVar, String str, int i10, int i11, int i12, int i13) {
        boolean z10;
        eVar.e(str, i10);
        byte[][] b10 = eVar.f().b(1, 4);
        if ((i12 > i11) != (b10[0].length < b10.length)) {
            b10 = d(b10);
            z10 = true;
        } else {
            z10 = false;
        }
        int min = Math.min(i11 / b10[0].length, i12 / b10.length);
        if (min > 1) {
            byte[][] b11 = eVar.f().b(min, min << 2);
            if (z10) {
                b11 = d(b11);
            }
            return b(b11, i13);
        }
        return b(b10, i13);
    }

    private static byte[][] d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, bArr[0].length, bArr.length);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int length = (bArr.length - i10) - 1;
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                bArr2[i11][length] = bArr[i10][i11];
            }
        }
        return bArr2;
    }

    @Override // h6.u
    public o6.b a(String str, h6.a aVar, int i10, int i11, Map<g, ?> map) {
        if (aVar == h6.a.PDF_417) {
            e eVar = new e();
            int i12 = 30;
            int i13 = 2;
            if (map != null) {
                g gVar = g.PDF417_COMPACT;
                if (map.containsKey(gVar)) {
                    eVar.h(Boolean.parseBoolean(map.get(gVar).toString()));
                }
                g gVar2 = g.PDF417_COMPACTION;
                if (map.containsKey(gVar2)) {
                    eVar.i(f7.c.valueOf(map.get(gVar2).toString()));
                }
                g gVar3 = g.PDF417_DIMENSIONS;
                if (map.containsKey(gVar3)) {
                    f7.d dVar = (f7.d) map.get(gVar3);
                    eVar.j(dVar.a(), dVar.c(), dVar.b(), dVar.d());
                }
                g gVar4 = g.MARGIN;
                if (map.containsKey(gVar4)) {
                    i12 = Integer.parseInt(map.get(gVar4).toString());
                }
                g gVar5 = g.ERROR_CORRECTION;
                if (map.containsKey(gVar5)) {
                    i13 = Integer.parseInt(map.get(gVar5).toString());
                }
                g gVar6 = g.CHARACTER_SET;
                if (map.containsKey(gVar6)) {
                    eVar.k(Charset.forName(map.get(gVar6).toString()));
                }
            }
            return c(eVar, str, i13, i10, i11, i12);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(aVar)));
    }
}
