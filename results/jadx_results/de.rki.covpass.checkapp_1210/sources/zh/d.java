package zh;
/* loaded from: classes3.dex */
public class d extends c {
    public static boolean d(byte[] bArr, int i10) {
        boolean z10 = false;
        for (int i11 = i10; i11 != i10 + 8; i11++) {
            if (bArr[i11] != bArr[i11 + 8]) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean e(byte[] bArr, int i10) {
        int i11 = i10;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            boolean z13 = true;
            if (i11 == i10 + 8) {
                break;
            }
            int i12 = i11 + 8;
            z10 |= bArr[i11] != bArr[i12];
            int i13 = i11 + 16;
            z11 |= bArr[i11] != bArr[i13];
            if (bArr[i12] == bArr[i13]) {
                z13 = false;
            }
            z12 |= z13;
            i11++;
        }
        return z10 && z11 && z12;
    }

    public static boolean f(byte[] bArr, int i10) {
        return bArr.length == 16 ? d(bArr, i10) : e(bArr, i10);
    }

    public static boolean g(byte[] bArr, int i10, int i11) {
        while (i10 < i11) {
            if (c.b(bArr, i10)) {
                return true;
            }
            i10 += 8;
        }
        return false;
    }
}
