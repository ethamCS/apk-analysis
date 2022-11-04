package qh;
/* loaded from: classes3.dex */
public class m extends u0 {
    public static void j(int i10, int[] iArr, int[] iArr2) {
        int i11 = 16;
        if (iArr.length == 16) {
            if (iArr2.length != 16) {
                throw new IllegalArgumentException();
            }
            if (i10 % 2 != 0) {
                throw new IllegalArgumentException("Number of rounds must be even");
            }
            char c10 = 0;
            int i12 = iArr[0];
            int i13 = iArr[1];
            int i14 = iArr[2];
            int i15 = iArr[3];
            int i16 = iArr[4];
            int i17 = iArr[5];
            int i18 = iArr[6];
            int i19 = 7;
            int i20 = iArr[7];
            int i21 = 8;
            int i22 = iArr[8];
            int i23 = iArr[9];
            int i24 = iArr[10];
            int i25 = iArr[11];
            int i26 = 12;
            int i27 = iArr[12];
            int i28 = iArr[13];
            int i29 = iArr[14];
            int i30 = iArr[15];
            int i31 = i29;
            int i32 = i28;
            int i33 = i27;
            int i34 = i25;
            int i35 = i24;
            int i36 = i23;
            int i37 = i22;
            int i38 = i20;
            int i39 = i18;
            int i40 = i17;
            int i41 = i16;
            int i42 = i15;
            int i43 = i14;
            int i44 = i13;
            int i45 = i12;
            int i46 = i10;
            while (i46 > 0) {
                int i47 = i45 + i41;
                int c11 = ak.g.c(i33 ^ i47, i11);
                int i48 = i37 + c11;
                int c12 = ak.g.c(i41 ^ i48, i26);
                int i49 = i47 + c12;
                int c13 = ak.g.c(c11 ^ i49, i21);
                int i50 = i48 + c13;
                int c14 = ak.g.c(c12 ^ i50, i19);
                int i51 = i44 + i40;
                int c15 = ak.g.c(i32 ^ i51, i11);
                int i52 = i36 + c15;
                int c16 = ak.g.c(i40 ^ i52, i26);
                int i53 = i51 + c16;
                int c17 = ak.g.c(c15 ^ i53, i21);
                int i54 = i52 + c17;
                int c18 = ak.g.c(c16 ^ i54, i19);
                int i55 = i43 + i39;
                int c19 = ak.g.c(i31 ^ i55, i11);
                int i56 = i35 + c19;
                int c20 = ak.g.c(i39 ^ i56, i26);
                int i57 = i55 + c20;
                int c21 = ak.g.c(c19 ^ i57, i21);
                int i58 = i56 + c21;
                int c22 = ak.g.c(c20 ^ i58, i19);
                int i59 = i42 + i38;
                int c23 = ak.g.c(i30 ^ i59, 16);
                int i60 = i34 + c23;
                int c24 = ak.g.c(i38 ^ i60, i26);
                int i61 = i59 + c24;
                int c25 = ak.g.c(c23 ^ i61, 8);
                int i62 = i60 + c25;
                int c26 = ak.g.c(c24 ^ i62, 7);
                int i63 = i49 + c18;
                int c27 = ak.g.c(c25 ^ i63, 16);
                int i64 = i58 + c27;
                int c28 = ak.g.c(c18 ^ i64, 12);
                i45 = i63 + c28;
                i30 = ak.g.c(c27 ^ i45, 8);
                i35 = i64 + i30;
                i40 = ak.g.c(c28 ^ i35, 7);
                int i65 = i53 + c22;
                int c29 = ak.g.c(c13 ^ i65, 16);
                int i66 = i62 + c29;
                int c30 = ak.g.c(c22 ^ i66, 12);
                i44 = i65 + c30;
                i33 = ak.g.c(c29 ^ i44, 8);
                i34 = i66 + i33;
                i39 = ak.g.c(c30 ^ i34, 7);
                int i67 = i57 + c26;
                int c31 = ak.g.c(c17 ^ i67, 16);
                int i68 = i50 + c31;
                int c32 = ak.g.c(c26 ^ i68, 12);
                i43 = i67 + c32;
                i32 = ak.g.c(c31 ^ i43, 8);
                i37 = i68 + i32;
                i38 = ak.g.c(c32 ^ i37, 7);
                int i69 = i61 + c14;
                i11 = 16;
                int c33 = ak.g.c(c21 ^ i69, 16);
                int i70 = i54 + c33;
                int c34 = ak.g.c(c14 ^ i70, 12);
                i42 = i69 + c34;
                i31 = ak.g.c(c33 ^ i42, 8);
                i36 = i70 + i31;
                i41 = ak.g.c(c34 ^ i36, 7);
                i46 -= 2;
                c10 = 0;
                i26 = 12;
                i21 = 8;
                i19 = 7;
            }
            iArr2[c10] = i45 + iArr[c10];
            iArr2[1] = i44 + iArr[1];
            iArr2[2] = i43 + iArr[2];
            iArr2[3] = i42 + iArr[3];
            iArr2[4] = i41 + iArr[4];
            iArr2[5] = i40 + iArr[5];
            iArr2[6] = i39 + iArr[6];
            iArr2[7] = i38 + iArr[7];
            iArr2[8] = i37 + iArr[8];
            iArr2[9] = i36 + iArr[9];
            iArr2[10] = i35 + iArr[10];
            iArr2[11] = i34 + iArr[11];
            iArr2[12] = i33 + iArr[12];
            iArr2[13] = i32 + iArr[13];
            iArr2[14] = i31 + iArr[14];
            iArr2[15] = i30 + iArr[15];
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // qh.u0
    protected void a() {
        int[] iArr = this.f20196c;
        int i10 = iArr[12] + 1;
        iArr[12] = i10;
        if (i10 == 0) {
            iArr[13] = iArr[13] + 1;
        }
    }

    @Override // qh.u0
    protected void b(byte[] bArr) {
        j(this.f20194a, this.f20196c, this.f20197d);
        ak.l.j(this.f20197d, bArr, 0);
    }

    @Override // qh.u0
    protected void f() {
        int[] iArr = this.f20196c;
        iArr[13] = 0;
        iArr[12] = 0;
    }

    @Override // qh.u0, org.bouncycastle.crypto.h0
    public String getAlgorithmName() {
        return "ChaCha" + this.f20194a;
    }

    @Override // qh.u0
    public void i(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            e(bArr.length, this.f20196c, 0);
            ak.l.n(bArr, 0, this.f20196c, 4, 4);
            ak.l.n(bArr, bArr.length - 16, this.f20196c, 8, 4);
        }
        ak.l.n(bArr2, 0, this.f20196c, 14, 2);
    }
}
