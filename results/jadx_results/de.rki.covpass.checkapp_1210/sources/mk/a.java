package mk;
/* loaded from: classes3.dex */
public class a {
    public static int a(double[] dArr, int i10, int i11, int[] iArr) {
        int i12;
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            iArr[i14] = i14;
        }
        int i15 = i11 - 1;
        while (true) {
            i12 = i13 + 1;
            if (i15 <= i12) {
                break;
            }
            int i16 = (i13 + i15) >> 1;
            int i17 = iArr[i16];
            iArr[i16] = iArr[i12];
            iArr[i12] = i17;
            if (dArr[iArr[i13]] > dArr[iArr[i15]]) {
                int i18 = iArr[i13];
                iArr[i13] = iArr[i15];
                iArr[i15] = i18;
            }
            if (dArr[iArr[i12]] > dArr[iArr[i15]]) {
                int i19 = iArr[i12];
                iArr[i12] = iArr[i15];
                iArr[i15] = i19;
            }
            if (dArr[iArr[i13]] > dArr[iArr[i12]]) {
                int i20 = iArr[i12];
                iArr[i12] = iArr[i13];
                iArr[i13] = i20;
            }
            int i21 = iArr[i12];
            int i22 = i15;
            int i23 = i12;
            while (true) {
                i23++;
                if (dArr[iArr[i23]] >= dArr[i21]) {
                    do {
                        i22--;
                    } while (dArr[iArr[i22]] > dArr[i21]);
                    if (i22 < i23) {
                        break;
                    }
                    int i24 = iArr[i23];
                    iArr[i23] = iArr[i22];
                    iArr[i22] = i24;
                }
            }
            iArr[i12] = iArr[i22];
            iArr[i22] = i21;
            if (i22 >= i10) {
                i15 = i22 - 1;
            }
            if (i22 <= i10) {
                i13 = i23;
            }
        }
        if (i15 == i12 && dArr[iArr[i15]] < dArr[iArr[i13]]) {
            int i25 = iArr[i13];
            iArr[i13] = iArr[i15];
            iArr[i15] = i25;
        }
        return iArr[i10];
    }
}
