package u2;
/* loaded from: classes.dex */
public class r0 {
    public static boolean a(z3.d dVar, c4.l lVar, c4.e eVar, int i10) {
        int i11 = dVar.f26454b;
        int i12 = dVar.f26453a;
        if (i11 != i12 / 2 || i12 % 2 == 0) {
            return false;
        }
        if (i12 == 3) {
            c(dVar, lVar, eVar, i10);
            return true;
        } else if (i12 == 5) {
            d(dVar, lVar, eVar, i10);
            return true;
        } else if (i12 == 7) {
            e(dVar, lVar, eVar, i10);
            return true;
        } else if (i12 == 9) {
            f(dVar, lVar, eVar, i10);
            return true;
        } else if (i12 != 11) {
            return false;
        } else {
            b(dVar, lVar, eVar, i10);
            return true;
        }
    }

    public static void b(z3.d dVar, c4.l lVar, c4.e eVar, int i10) {
        c4.l lVar2 = lVar;
        c4.e eVar2 = eVar;
        byte[] bArr = lVar2.V3;
        byte[] bArr2 = eVar2.V3;
        int[] iArr = dVar.f26449c;
        int i11 = 0;
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        int i16 = iArr[4];
        int i17 = iArr[5];
        int i18 = iArr[6];
        int i19 = iArr[7];
        int i20 = iArr[8];
        int i21 = iArr[9];
        int i22 = iArr[10];
        int b10 = dVar.b();
        int p10 = lVar.p();
        int i23 = i10 / 2;
        while (i11 < lVar2.f6221x) {
            int i24 = i22;
            int i25 = eVar2.f6218c + (eVar2.f6219d * i11) + b10;
            int i26 = (lVar2.f6218c + (lVar2.f6219d * i11)) - b10;
            int i27 = (i26 + p10) - b10;
            int i28 = i26 + b10;
            while (i28 < i27) {
                int i29 = i28 + 1;
                int i30 = i29 + 1;
                int i31 = i30 + 1;
                int i32 = i27;
                int i33 = i31 + 1;
                int i34 = ((bArr[i28] & 255) * i12) + ((bArr[i29] & 255) * i13) + ((bArr[i30] & 255) * i14) + ((bArr[i31] & 255) * i15);
                int i35 = i33 + 1;
                int i36 = i34 + ((bArr[i33] & 255) * i16);
                int i37 = i35 + 1;
                int i38 = i36 + ((bArr[i35] & 255) * i17);
                int i39 = i37 + 1;
                int i40 = i38 + ((bArr[i37] & 255) * i18);
                int i41 = i39 + 1;
                int i42 = i40 + ((bArr[i39] & 255) * i19);
                int i43 = i41 + 1;
                bArr2[i25] = (byte) (((((i42 + ((bArr[i41] & 255) * i20)) + ((bArr[i43] & 255) * i21)) + ((bArr[i43 + 1] & 255) * i24)) + i23) / i10);
                i27 = i32;
                i25++;
                i28 = i29;
            }
            i11++;
            lVar2 = lVar;
            eVar2 = eVar;
            i22 = i24;
        }
    }

    public static void c(z3.d dVar, c4.l lVar, c4.e eVar, int i10) {
        c4.l lVar2 = lVar;
        byte[] bArr = lVar2.V3;
        byte[] bArr2 = eVar.V3;
        int[] iArr = dVar.f26449c;
        int i11 = 0;
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int b10 = dVar.b();
        int p10 = lVar.p();
        int i15 = i10 / 2;
        while (i11 < lVar2.f6221x) {
            int i16 = eVar.f6218c + (eVar.f6219d * i11) + b10;
            int i17 = (lVar2.f6218c + (lVar2.f6219d * i11)) - b10;
            int i18 = (i17 + p10) - b10;
            int i19 = i17 + b10;
            while (i19 < i18) {
                int i20 = i19 + 1;
                bArr2[i16] = (byte) ((((((bArr[i19] & 255) * i12) + ((bArr[i20] & 255) * i13)) + ((bArr[i20 + 1] & 255) * i14)) + i15) / i10);
                i16++;
                i19 = i20;
            }
            i11++;
            lVar2 = lVar;
        }
    }

    public static void d(z3.d dVar, c4.l lVar, c4.e eVar, int i10) {
        c4.l lVar2 = lVar;
        c4.e eVar2 = eVar;
        byte[] bArr = lVar2.V3;
        byte[] bArr2 = eVar2.V3;
        int[] iArr = dVar.f26449c;
        int i11 = 0;
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        int i16 = iArr[4];
        int b10 = dVar.b();
        int p10 = lVar.p();
        int i17 = i10 / 2;
        while (i11 < lVar2.f6221x) {
            int i18 = eVar2.f6218c + (eVar2.f6219d * i11) + b10;
            int i19 = (lVar2.f6218c + (lVar2.f6219d * i11)) - b10;
            int i20 = (i19 + p10) - b10;
            int i21 = i19 + b10;
            while (i21 < i20) {
                int i22 = i21 + 1;
                int i23 = i22 + 1;
                int i24 = i23 + 1;
                bArr2[i18] = (byte) ((((((((bArr[i21] & 255) * i12) + ((bArr[i22] & 255) * i13)) + ((bArr[i23] & 255) * i14)) + ((bArr[i24] & 255) * i15)) + ((bArr[i24 + 1] & 255) * i16)) + i17) / i10);
                i18++;
                i21 = i22;
            }
            i11++;
            lVar2 = lVar;
            eVar2 = eVar;
        }
    }

    public static void e(z3.d dVar, c4.l lVar, c4.e eVar, int i10) {
        c4.l lVar2 = lVar;
        c4.e eVar2 = eVar;
        byte[] bArr = lVar2.V3;
        byte[] bArr2 = eVar2.V3;
        int[] iArr = dVar.f26449c;
        int i11 = 0;
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        int i16 = iArr[4];
        int i17 = iArr[5];
        int i18 = iArr[6];
        int b10 = dVar.b();
        int p10 = lVar.p();
        int i19 = i10 / 2;
        while (i11 < lVar2.f6221x) {
            byte[] bArr3 = bArr2;
            int i20 = eVar2.f6218c + (eVar2.f6219d * i11) + b10;
            int i21 = (lVar2.f6218c + (lVar2.f6219d * i11)) - b10;
            int i22 = (i21 + p10) - b10;
            int i23 = i21 + b10;
            while (i23 < i22) {
                int i24 = i23 + 1;
                int i25 = i24 + 1;
                int i26 = i25 + 1;
                int i27 = i22;
                int i28 = i26 + 1;
                int i29 = ((bArr[i23] & 255) * i12) + ((bArr[i24] & 255) * i13) + ((bArr[i25] & 255) * i14) + ((bArr[i26] & 255) * i15);
                int i30 = i28 + 1;
                bArr3[i20] = (byte) (((((i29 + ((bArr[i28] & 255) * i16)) + ((bArr[i30] & 255) * i17)) + ((bArr[i30 + 1] & 255) * i18)) + i19) / i10);
                i22 = i27;
                i20++;
                i23 = i24;
            }
            i11++;
            lVar2 = lVar;
            eVar2 = eVar;
            bArr2 = bArr3;
        }
    }

    public static void f(z3.d dVar, c4.l lVar, c4.e eVar, int i10) {
        c4.l lVar2 = lVar;
        c4.e eVar2 = eVar;
        byte[] bArr = lVar2.V3;
        byte[] bArr2 = eVar2.V3;
        int[] iArr = dVar.f26449c;
        int i11 = 0;
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        int i16 = iArr[4];
        int i17 = iArr[5];
        int i18 = iArr[6];
        int i19 = iArr[7];
        int i20 = iArr[8];
        int b10 = dVar.b();
        int p10 = lVar.p();
        int i21 = i10 / 2;
        while (i11 < lVar2.f6221x) {
            int i22 = i20;
            int i23 = eVar2.f6218c + (eVar2.f6219d * i11) + b10;
            int i24 = (lVar2.f6218c + (lVar2.f6219d * i11)) - b10;
            int i25 = (i24 + p10) - b10;
            int i26 = i24 + b10;
            while (i26 < i25) {
                int i27 = i26 + 1;
                int i28 = i27 + 1;
                int i29 = i28 + 1;
                int i30 = i25;
                int i31 = i29 + 1;
                int i32 = ((bArr[i26] & 255) * i12) + ((bArr[i27] & 255) * i13) + ((bArr[i28] & 255) * i14) + ((bArr[i29] & 255) * i15);
                int i33 = i31 + 1;
                int i34 = i32 + ((bArr[i31] & 255) * i16);
                int i35 = i33 + 1;
                int i36 = i34 + ((bArr[i33] & 255) * i17);
                int i37 = i35 + 1;
                bArr2[i23] = (byte) (((((i36 + ((bArr[i35] & 255) * i18)) + ((bArr[i37] & 255) * i19)) + ((bArr[i37 + 1] & 255) * i22)) + i21) / i10);
                i25 = i30;
                i23++;
                i26 = i27;
            }
            i11++;
            lVar2 = lVar;
            eVar2 = eVar;
            i20 = i22;
        }
    }

    public static boolean g(z3.d dVar, c4.l lVar, c4.e eVar, int i10, ll.d<ok.g> dVar2) {
        int i11 = dVar.f26454b;
        int i12 = dVar.f26453a;
        if (i11 != i12 / 2 || i12 % 2 == 0) {
            return false;
        }
        if (i12 == 3) {
            i(dVar, lVar, eVar, i10, dVar2);
            return true;
        } else if (i12 == 5) {
            j(dVar, lVar, eVar, i10, dVar2);
            return true;
        } else if (i12 == 7) {
            k(dVar, lVar, eVar, i10, dVar2);
            return true;
        } else if (i12 == 9) {
            l(dVar, lVar, eVar, i10, dVar2);
            return true;
        } else if (i12 != 11) {
            return false;
        } else {
            h(dVar, lVar, eVar, i10, dVar2);
            return true;
        }
    }

    public static void h(z3.d dVar, c4.l lVar, c4.e eVar, int i10, ll.d<ok.g> dVar2) {
        c4.l lVar2 = lVar;
        c4.e eVar2 = eVar;
        byte[] bArr = lVar2.V3;
        byte[] bArr2 = eVar2.V3;
        int[] iArr = dVar.f26449c;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        int i19 = iArr[8];
        int i20 = iArr[9];
        int i21 = iArr[10];
        int b10 = dVar.b();
        int p10 = eVar.p();
        int i22 = i10 / 2;
        int g10 = eVar.g() - b10;
        int i23 = b10;
        while (i23 < g10) {
            int i24 = g10;
            int i25 = i20;
            int i26 = eVar2.f6218c + (eVar2.f6219d * i23);
            int i27 = lVar2.f6218c + ((i23 - b10) * lVar2.f6219d);
            int i28 = i27 + p10;
            while (i27 < i28) {
                int i29 = i28;
                int i30 = b10;
                int i31 = lVar2.f6219d;
                int i32 = i27 + i31;
                int i33 = i32 + i31;
                int i34 = i33 + i31;
                int i35 = i34 + i31;
                int i36 = i35 + i31;
                int i37 = i36 + i31;
                int i38 = i37 + i31;
                int i39 = i38 + i31;
                int i40 = i39 + i31;
                bArr2[i26] = (byte) ((((((((((((((bArr[i27] & 255) * i11) + ((bArr[i32] & 255) * i12)) + ((bArr[i33] & 255) * i13)) + ((bArr[i34] & 255) * i14)) + ((bArr[i35] & 255) * i15)) + ((bArr[i36] & 255) * i16)) + ((bArr[i37] & 255) * i17)) + ((bArr[i38] & 255) * i18)) + ((bArr[i39] & 255) * i19)) + ((bArr[i40] & 255) * i25)) + ((bArr[i40 + i31] & 255) * i21)) + i22) / i10);
                i27++;
                i26++;
                i28 = i29;
                b10 = i30;
                lVar2 = lVar;
            }
            i23++;
            g10 = i24;
            lVar2 = lVar;
            eVar2 = eVar;
            i20 = i25;
        }
    }

    public static void i(z3.d dVar, c4.l lVar, c4.e eVar, int i10, ll.d<ok.g> dVar2) {
        c4.l lVar2 = lVar;
        c4.e eVar2 = eVar;
        byte[] bArr = lVar2.V3;
        byte[] bArr2 = eVar2.V3;
        int[] iArr = dVar.f26449c;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int b10 = dVar.b();
        int p10 = eVar.p();
        int i14 = i10 / 2;
        int g10 = eVar.g() - b10;
        int i15 = b10;
        while (i15 < g10) {
            int i16 = eVar2.f6218c + (eVar2.f6219d * i15);
            int i17 = lVar2.f6218c + ((i15 - b10) * lVar2.f6219d);
            int i18 = i17 + p10;
            while (i17 < i18) {
                int i19 = lVar2.f6219d;
                int i20 = i17 + i19;
                bArr2[i16] = (byte) ((((((bArr[i17] & 255) * i11) + ((bArr[i20] & 255) * i12)) + ((bArr[i20 + i19] & 255) * i13)) + i14) / i10);
                i17++;
                i16++;
                lVar2 = lVar;
            }
            i15++;
            lVar2 = lVar;
            eVar2 = eVar;
        }
    }

    public static void j(z3.d dVar, c4.l lVar, c4.e eVar, int i10, ll.d<ok.g> dVar2) {
        c4.l lVar2 = lVar;
        c4.e eVar2 = eVar;
        byte[] bArr = lVar2.V3;
        byte[] bArr2 = eVar2.V3;
        int[] iArr = dVar.f26449c;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int b10 = dVar.b();
        int p10 = eVar.p();
        int i16 = i10 / 2;
        int g10 = eVar.g() - b10;
        int i17 = b10;
        while (i17 < g10) {
            int i18 = eVar2.f6218c + (eVar2.f6219d * i17);
            int i19 = lVar2.f6218c + ((i17 - b10) * lVar2.f6219d);
            int i20 = i19 + p10;
            while (i19 < i20) {
                int i21 = i20;
                int i22 = b10;
                int i23 = lVar2.f6219d;
                int i24 = i19 + i23;
                int i25 = i24 + i23;
                int i26 = i25 + i23;
                bArr2[i18] = (byte) ((((((((bArr[i19] & 255) * i11) + ((bArr[i24] & 255) * i12)) + ((bArr[i25] & 255) * i13)) + ((bArr[i26] & 255) * i14)) + ((bArr[i26 + i23] & 255) * i15)) + i16) / i10);
                i19++;
                i20 = i21;
                b10 = i22;
                i18++;
                lVar2 = lVar;
            }
            i17++;
            lVar2 = lVar;
            eVar2 = eVar;
        }
    }

    public static void k(z3.d dVar, c4.l lVar, c4.e eVar, int i10, ll.d<ok.g> dVar2) {
        c4.l lVar2 = lVar;
        c4.e eVar2 = eVar;
        byte[] bArr = lVar2.V3;
        byte[] bArr2 = eVar2.V3;
        int[] iArr = dVar.f26449c;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int b10 = dVar.b();
        int p10 = eVar.p();
        int i18 = i10 / 2;
        int g10 = eVar.g() - b10;
        int i19 = b10;
        while (i19 < g10) {
            int i20 = g10;
            byte[] bArr3 = bArr2;
            int i21 = eVar2.f6218c + (eVar2.f6219d * i19);
            int i22 = lVar2.f6218c + ((i19 - b10) * lVar2.f6219d);
            int i23 = i22 + p10;
            while (i22 < i23) {
                int i24 = i23;
                int i25 = b10;
                int i26 = lVar2.f6219d;
                int i27 = i22 + i26;
                int i28 = i27 + i26;
                int i29 = i28 + i26;
                int i30 = i29 + i26;
                int i31 = i30 + i26;
                bArr3[i21] = (byte) ((((((((((bArr[i22] & 255) * i11) + ((bArr[i27] & 255) * i12)) + ((bArr[i28] & 255) * i13)) + ((bArr[i29] & 255) * i14)) + ((bArr[i30] & 255) * i15)) + ((bArr[i31] & 255) * i16)) + ((bArr[i31 + i26] & 255) * i17)) + i18) / i10);
                i22++;
                i21++;
                i23 = i24;
                b10 = i25;
                lVar2 = lVar;
            }
            i19++;
            g10 = i20;
            lVar2 = lVar;
            eVar2 = eVar;
            bArr2 = bArr3;
        }
    }

    public static void l(z3.d dVar, c4.l lVar, c4.e eVar, int i10, ll.d<ok.g> dVar2) {
        c4.l lVar2 = lVar;
        c4.e eVar2 = eVar;
        byte[] bArr = lVar2.V3;
        byte[] bArr2 = eVar2.V3;
        int[] iArr = dVar.f26449c;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        int i19 = iArr[8];
        int b10 = dVar.b();
        int p10 = eVar.p();
        int i20 = i10 / 2;
        int g10 = eVar.g() - b10;
        int i21 = b10;
        while (i21 < g10) {
            int i22 = g10;
            int i23 = i19;
            int i24 = eVar2.f6218c + (eVar2.f6219d * i21);
            int i25 = lVar2.f6218c + ((i21 - b10) * lVar2.f6219d);
            int i26 = i25 + p10;
            while (i25 < i26) {
                int i27 = i26;
                int i28 = b10;
                int i29 = lVar2.f6219d;
                int i30 = i25 + i29;
                int i31 = i30 + i29;
                int i32 = i31 + i29;
                int i33 = i32 + i29;
                int i34 = i33 + i29;
                int i35 = i34 + i29;
                int i36 = i35 + i29;
                bArr2[i24] = (byte) ((((((((((((bArr[i25] & 255) * i11) + ((bArr[i30] & 255) * i12)) + ((bArr[i31] & 255) * i13)) + ((bArr[i32] & 255) * i14)) + ((bArr[i33] & 255) * i15)) + ((bArr[i34] & 255) * i16)) + ((bArr[i35] & 255) * i17)) + ((bArr[i36] & 255) * i18)) + ((bArr[i36 + i29] & 255) * i23)) + i20) / i10);
                i25++;
                i24++;
                i26 = i27;
                b10 = i28;
                lVar2 = lVar;
            }
            i21++;
            g10 = i22;
            lVar2 = lVar;
            eVar2 = eVar;
            i19 = i23;
        }
    }
}
