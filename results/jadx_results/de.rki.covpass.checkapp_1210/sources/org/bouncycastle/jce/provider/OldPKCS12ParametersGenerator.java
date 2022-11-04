package org.bouncycastle.jce.provider;

import nh.p;
import nh.s;
import nh.v;
import org.bouncycastle.crypto.b0;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.r;
import zh.b1;
import zh.f1;
/* loaded from: classes3.dex */
class OldPKCS12ParametersGenerator extends b0 {
    public static final int IV_MATERIAL = 2;
    public static final int KEY_MATERIAL = 1;
    public static final int MAC_MATERIAL = 3;
    private r digest;

    /* renamed from: u */
    private int f18698u;

    /* renamed from: v */
    private int f18699v;

    public OldPKCS12ParametersGenerator(r rVar) {
        this.digest = rVar;
        if (rVar instanceof p) {
            this.f18698u = 16;
        } else if (!(rVar instanceof v) && !(rVar instanceof s)) {
            throw new IllegalArgumentException("Digest " + rVar.getAlgorithmName() + " unsupported");
        } else {
            this.f18698u = 20;
        }
        this.f18699v = 64;
    }

    private void adjust(byte[] bArr, int i10, byte[] bArr2) {
        int i11 = (bArr2[bArr2.length - 1] & 255) + (bArr[(bArr2.length + i10) - 1] & 255) + 1;
        bArr[(bArr2.length + i10) - 1] = (byte) i11;
        int i12 = i11 >>> 8;
        for (int length = bArr2.length - 2; length >= 0; length--) {
            int i13 = i10 + length;
            int i14 = i12 + (bArr2[length] & 255) + (bArr[i13] & 255);
            bArr[i13] = (byte) i14;
            i12 = i14 >>> 8;
        }
    }

    private byte[] generateDerivedKey(int i10, int i11) {
        byte[] bArr;
        byte[] bArr2;
        int i12;
        int i13 = this.f18699v;
        byte[] bArr3 = new byte[i13];
        byte[] bArr4 = new byte[i11];
        int i14 = 0;
        for (int i15 = 0; i15 != i13; i15++) {
            bArr3[i15] = (byte) i10;
        }
        byte[] bArr5 = this.salt;
        int i16 = 1;
        if (bArr5 == null || bArr5.length == 0) {
            bArr = new byte[0];
        } else {
            int i17 = this.f18699v;
            int length = i17 * (((bArr5.length + i17) - 1) / i17);
            bArr = new byte[length];
            for (int i18 = 0; i18 != length; i18++) {
                byte[] bArr6 = this.salt;
                bArr[i18] = bArr6[i18 % bArr6.length];
            }
        }
        byte[] bArr7 = this.password;
        if (bArr7 == null || bArr7.length == 0) {
            bArr2 = new byte[0];
        } else {
            int i19 = this.f18699v;
            int length2 = i19 * (((bArr7.length + i19) - 1) / i19);
            bArr2 = new byte[length2];
            for (int i20 = 0; i20 != length2; i20++) {
                byte[] bArr8 = this.password;
                bArr2[i20] = bArr8[i20 % bArr8.length];
            }
        }
        int length3 = bArr.length + bArr2.length;
        byte[] bArr9 = new byte[length3];
        System.arraycopy(bArr, 0, bArr9, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr9, bArr.length, bArr2.length);
        int i21 = this.f18699v;
        byte[] bArr10 = new byte[i21];
        int i22 = this.f18698u;
        int i23 = ((i11 + i22) - 1) / i22;
        int i24 = 1;
        while (i24 <= i23) {
            int i25 = this.f18698u;
            byte[] bArr11 = new byte[i25];
            this.digest.update(bArr3, i14, i13);
            this.digest.update(bArr9, i14, length3);
            this.digest.doFinal(bArr11, i14);
            for (int i26 = i16; i26 != this.iterationCount; i26++) {
                this.digest.update(bArr11, i14, i25);
                this.digest.doFinal(bArr11, i14);
            }
            for (int i27 = i14; i27 != i21; i27++) {
                bArr10[i24] = bArr11[i27 % i25];
            }
            int i28 = i14;
            while (true) {
                int i29 = this.f18699v;
                if (i28 == length3 / i29) {
                    break;
                }
                adjust(bArr9, i29 * i28, bArr10);
                i28++;
            }
            if (i24 == i23) {
                int i30 = i24 - 1;
                int i31 = this.f18698u;
                i12 = 0;
                System.arraycopy(bArr11, 0, bArr4, i30 * i31, i11 - (i30 * i31));
            } else {
                i12 = 0;
                System.arraycopy(bArr11, 0, bArr4, (i24 - 1) * this.f18698u, i25);
            }
            i24++;
            i14 = i12;
            i16 = 1;
        }
        return bArr4;
    }

    @Override // org.bouncycastle.crypto.b0
    public i generateDerivedMacParameters(int i10) {
        int i11 = i10 / 8;
        return new b1(generateDerivedKey(3, i11), 0, i11);
    }

    @Override // org.bouncycastle.crypto.b0
    public i generateDerivedParameters(int i10) {
        int i11 = i10 / 8;
        return new b1(generateDerivedKey(1, i11), 0, i11);
    }

    @Override // org.bouncycastle.crypto.b0
    public i generateDerivedParameters(int i10, int i11) {
        int i12 = i10 / 8;
        int i13 = i11 / 8;
        byte[] generateDerivedKey = generateDerivedKey(1, i12);
        return new f1(new b1(generateDerivedKey, 0, i12), generateDerivedKey(2, i13), 0, i13);
    }
}
