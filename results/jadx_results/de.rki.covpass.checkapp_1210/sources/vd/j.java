package vd;

import hc.t;
/* loaded from: classes.dex */
public final class j {
    public static final byte[] a(String[] strArr) {
        t.e(strArr, "strings");
        int i10 = 0;
        for (String str : strArr) {
            i10 += str.length();
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (String str2 : strArr) {
            int length = str2.length();
            int i12 = 0;
            while (i12 < length) {
                bArr[i11] = (byte) str2.charAt(i12);
                i12++;
                i11++;
            }
        }
        return bArr;
    }
}
