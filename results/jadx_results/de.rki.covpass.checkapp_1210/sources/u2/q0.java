package u2;
/* loaded from: classes.dex */
public class q0 {
    public static boolean a(z3.d dVar, c4.k kVar, c4.d dVar2, int i10) {
        int i11 = dVar.f26454b;
        int i12 = dVar.f26453a;
        if (i11 != i12 / 2 || i12 % 2 == 0) {
            return false;
        }
        if (i12 == 3) {
            c(dVar, kVar, dVar2, i10);
            return true;
        } else if (i12 == 5) {
            d(dVar, kVar, dVar2, i10);
            return true;
        } else if (i12 == 7) {
            e(dVar, kVar, dVar2, i10);
            return true;
        } else if (i12 == 9) {
            f(dVar, kVar, dVar2, i10);
            return true;
        } else if (i12 != 11) {
            return false;
        } else {
            b(dVar, kVar, dVar2, i10);
            return true;
        }
    }

    public static void b(z3.d dVar, c4.k kVar, c4.d dVar2, int i10) {
        c4.d dVar3 = dVar2;
        short[] sArr = kVar.V3;
        short[] sArr2 = dVar3.V3;
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
        int p10 = kVar.p();
        int i23 = i10 / 2;
        while (i11 < kVar.f6221x) {
            int i24 = i22;
            int i25 = dVar3.f6218c + (dVar3.f6219d * i11) + b10;
            int i26 = (kVar.f6218c + (kVar.f6219d * i11)) - b10;
            int i27 = (i26 + p10) - b10;
            int i28 = i26 + b10;
            while (i28 < i27) {
                int i29 = i28 + 1;
                int i30 = i29 + 1;
                int i31 = i30 + 1;
                int i32 = ((sArr[i28] & 65535) * i12) + ((sArr[i29] & 65535) * i13) + ((sArr[i30] & 65535) * i14);
                int i33 = i31 + 1;
                int i34 = i32 + ((sArr[i31] & 65535) * i15);
                int i35 = i33 + 1;
                int i36 = i34 + ((sArr[i33] & 65535) * i16);
                int i37 = i35 + 1;
                int i38 = i36 + ((sArr[i35] & 65535) * i17);
                int i39 = i37 + 1;
                int i40 = i38 + ((sArr[i37] & 65535) * i18);
                int i41 = i39 + 1;
                int i42 = i40 + ((sArr[i39] & 65535) * i19);
                int i43 = i41 + 1;
                sArr2[i25] = (short) (((((i42 + ((sArr[i41] & 65535) * i20)) + ((sArr[i43] & 65535) * i21)) + ((sArr[i43 + 1] & 65535) * i24)) + i23) / i10);
                i28 = i29;
                i25++;
            }
            i11++;
            dVar3 = dVar2;
            i22 = i24;
        }
    }

    public static void c(z3.d dVar, c4.k kVar, c4.d dVar2, int i10) {
        short[] sArr = kVar.V3;
        short[] sArr2 = dVar2.V3;
        int[] iArr = dVar.f26449c;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int b10 = dVar.b();
        int p10 = kVar.p();
        int i14 = i10 / 2;
        for (int i15 = 0; i15 < kVar.f6221x; i15++) {
            int i16 = dVar2.f6218c + (dVar2.f6219d * i15) + b10;
            int i17 = (kVar.f6218c + (kVar.f6219d * i15)) - b10;
            int i18 = (i17 + p10) - b10;
            int i19 = i17 + b10;
            while (i19 < i18) {
                int i20 = i19 + 1;
                sArr2[i16] = (short) ((((((sArr[i19] & 65535) * i11) + ((sArr[i20] & 65535) * i12)) + ((sArr[i20 + 1] & 65535) * i13)) + i14) / i10);
                i19 = i20;
                i16++;
            }
        }
    }

    public static void d(z3.d dVar, c4.k kVar, c4.d dVar2, int i10) {
        short[] sArr = kVar.V3;
        short[] sArr2 = dVar2.V3;
        int[] iArr = dVar.f26449c;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int b10 = dVar.b();
        int p10 = kVar.p();
        int i16 = i10 / 2;
        for (int i17 = 0; i17 < kVar.f6221x; i17++) {
            int i18 = dVar2.f6218c + (dVar2.f6219d * i17) + b10;
            int i19 = (kVar.f6218c + (kVar.f6219d * i17)) - b10;
            int i20 = (i19 + p10) - b10;
            int i21 = i19 + b10;
            while (i21 < i20) {
                int i22 = i21 + 1;
                int i23 = i22 + 1;
                int i24 = i23 + 1;
                sArr2[i18] = (short) ((((((((sArr[i21] & 65535) * i11) + ((sArr[i22] & 65535) * i12)) + ((sArr[i23] & 65535) * i13)) + ((sArr[i24] & 65535) * i14)) + ((sArr[i24 + 1] & 65535) * i15)) + i16) / i10);
                i21 = i22;
                i18++;
            }
        }
    }

    public static void e(z3.d dVar, c4.k kVar, c4.d dVar2, int i10) {
        c4.d dVar3 = dVar2;
        short[] sArr = kVar.V3;
        short[] sArr2 = dVar3.V3;
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
        int p10 = kVar.p();
        int i19 = i10 / 2;
        while (i11 < kVar.f6221x) {
            short[] sArr3 = sArr2;
            int i20 = dVar3.f6218c + (dVar3.f6219d * i11) + b10;
            int i21 = (kVar.f6218c + (kVar.f6219d * i11)) - b10;
            int i22 = (i21 + p10) - b10;
            int i23 = i21 + b10;
            while (i23 < i22) {
                int i24 = i23 + 1;
                int i25 = i24 + 1;
                int i26 = i25 + 1;
                int i27 = ((sArr[i23] & 65535) * i12) + ((sArr[i24] & 65535) * i13) + ((sArr[i25] & 65535) * i14);
                int i28 = i26 + 1;
                int i29 = i27 + ((sArr[i26] & 65535) * i15);
                int i30 = i28 + 1;
                sArr3[i20] = (short) (((((i29 + ((sArr[i28] & 65535) * i16)) + ((sArr[i30] & 65535) * i17)) + ((sArr[i30 + 1] & 65535) * i18)) + i19) / i10);
                i23 = i24;
                i20++;
            }
            i11++;
            dVar3 = dVar2;
            sArr2 = sArr3;
        }
    }

    public static void f(z3.d dVar, c4.k kVar, c4.d dVar2, int i10) {
        c4.d dVar3 = dVar2;
        short[] sArr = kVar.V3;
        short[] sArr2 = dVar3.V3;
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
        int p10 = kVar.p();
        int i21 = i10 / 2;
        while (i11 < kVar.f6221x) {
            int i22 = i20;
            int i23 = dVar3.f6218c + (dVar3.f6219d * i11) + b10;
            int i24 = (kVar.f6218c + (kVar.f6219d * i11)) - b10;
            int i25 = (i24 + p10) - b10;
            int i26 = i24 + b10;
            while (i26 < i25) {
                int i27 = i26 + 1;
                int i28 = i27 + 1;
                int i29 = i28 + 1;
                int i30 = ((sArr[i26] & 65535) * i12) + ((sArr[i27] & 65535) * i13) + ((sArr[i28] & 65535) * i14);
                int i31 = i29 + 1;
                int i32 = i30 + ((sArr[i29] & 65535) * i15);
                int i33 = i31 + 1;
                int i34 = i32 + ((sArr[i31] & 65535) * i16);
                int i35 = i33 + 1;
                int i36 = i34 + ((sArr[i33] & 65535) * i17);
                int i37 = i35 + 1;
                sArr2[i23] = (short) (((((i36 + ((sArr[i35] & 65535) * i18)) + ((sArr[i37] & 65535) * i19)) + ((sArr[i37 + 1] & 65535) * i22)) + i21) / i10);
                i26 = i27;
                i23++;
            }
            i11++;
            dVar3 = dVar2;
            i20 = i22;
        }
    }

    public static boolean g(z3.d dVar, c4.k kVar, c4.d dVar2, int i10, ll.d<ok.g> dVar3) {
        int i11 = dVar.f26454b;
        int i12 = dVar.f26453a;
        if (i11 != i12 / 2 || i12 % 2 == 0) {
            return false;
        }
        if (i12 == 3) {
            i(dVar, kVar, dVar2, i10, dVar3);
            return true;
        } else if (i12 == 5) {
            j(dVar, kVar, dVar2, i10, dVar3);
            return true;
        } else if (i12 == 7) {
            k(dVar, kVar, dVar2, i10, dVar3);
            return true;
        } else if (i12 == 9) {
            l(dVar, kVar, dVar2, i10, dVar3);
            return true;
        } else if (i12 != 11) {
            return false;
        } else {
            h(dVar, kVar, dVar2, i10, dVar3);
            return true;
        }
    }

    public static void h(z3.d dVar, c4.k kVar, c4.d dVar2, int i10, ll.d<ok.g> dVar3) {
        c4.k kVar2 = kVar;
        c4.d dVar4 = dVar2;
        short[] sArr = kVar2.V3;
        short[] sArr2 = dVar4.V3;
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
        int p10 = dVar2.p();
        int i22 = i10 / 2;
        int g10 = dVar2.g() - b10;
        int i23 = b10;
        while (i23 < g10) {
            int i24 = g10;
            int i25 = i20;
            int i26 = dVar4.f6218c + (dVar4.f6219d * i23);
            int i27 = kVar2.f6218c + ((i23 - b10) * kVar2.f6219d);
            int i28 = i27 + p10;
            while (i27 < i28) {
                int i29 = i28;
                int i30 = kVar2.f6219d;
                int i31 = i27 + i30;
                int i32 = i31 + i30;
                int i33 = i32 + i30;
                int i34 = i33 + i30;
                int i35 = i34 + i30;
                int i36 = i35 + i30;
                int i37 = i36 + i30;
                int i38 = i37 + i30;
                int i39 = i38 + i30;
                sArr2[i26] = (short) ((((((((((((((sArr[i27] & 65535) * i11) + ((sArr[i31] & 65535) * i12)) + ((sArr[i32] & 65535) * i13)) + ((sArr[i33] & 65535) * i14)) + ((sArr[i34] & 65535) * i15)) + ((sArr[i35] & 65535) * i16)) + ((sArr[i36] & 65535) * i17)) + ((sArr[i37] & 65535) * i18)) + ((sArr[i38] & 65535) * i19)) + ((sArr[i39] & 65535) * i25)) + ((sArr[i39 + i30] & 65535) * i21)) + i22) / i10);
                i27++;
                kVar2 = kVar;
                i26++;
                i28 = i29;
            }
            i23++;
            g10 = i24;
            kVar2 = kVar;
            dVar4 = dVar2;
            i20 = i25;
        }
    }

    public static void i(z3.d dVar, c4.k kVar, c4.d dVar2, int i10, ll.d<ok.g> dVar3) {
        c4.d dVar4 = dVar2;
        short[] sArr = kVar.V3;
        short[] sArr2 = dVar4.V3;
        int[] iArr = dVar.f26449c;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int b10 = dVar.b();
        int p10 = dVar2.p();
        int i14 = i10 / 2;
        int g10 = dVar2.g() - b10;
        int i15 = b10;
        while (i15 < g10) {
            int i16 = dVar4.f6218c + (dVar4.f6219d * i15);
            int i17 = kVar.f6218c + ((i15 - b10) * kVar.f6219d);
            int i18 = i17 + p10;
            while (i17 < i18) {
                int i19 = kVar.f6219d;
                int i20 = i17 + i19;
                sArr2[i16] = (short) ((((((sArr[i17] & 65535) * i11) + ((sArr[i20] & 65535) * i12)) + ((sArr[i20 + i19] & 65535) * i13)) + i14) / i10);
                i17++;
                i16++;
            }
            i15++;
            dVar4 = dVar2;
        }
    }

    public static void j(z3.d dVar, c4.k kVar, c4.d dVar2, int i10, ll.d<ok.g> dVar3) {
        c4.k kVar2 = kVar;
        c4.d dVar4 = dVar2;
        short[] sArr = kVar2.V3;
        short[] sArr2 = dVar4.V3;
        int[] iArr = dVar.f26449c;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int b10 = dVar.b();
        int p10 = dVar2.p();
        int i16 = i10 / 2;
        int g10 = dVar2.g() - b10;
        int i17 = b10;
        while (i17 < g10) {
            int i18 = dVar4.f6218c + (dVar4.f6219d * i17);
            int i19 = kVar2.f6218c + ((i17 - b10) * kVar2.f6219d);
            int i20 = i19 + p10;
            while (i19 < i20) {
                int i21 = i20;
                int i22 = kVar2.f6219d;
                int i23 = i19 + i22;
                int i24 = i23 + i22;
                int i25 = i24 + i22;
                sArr2[i18] = (short) ((((((((sArr[i19] & 65535) * i11) + ((sArr[i23] & 65535) * i12)) + ((sArr[i24] & 65535) * i13)) + ((sArr[i25] & 65535) * i14)) + ((sArr[i25 + i22] & 65535) * i15)) + i16) / i10);
                i19++;
                kVar2 = kVar;
                i18++;
                i20 = i21;
            }
            i17++;
            kVar2 = kVar;
            dVar4 = dVar2;
        }
    }

    public static void k(z3.d dVar, c4.k kVar, c4.d dVar2, int i10, ll.d<ok.g> dVar3) {
        c4.k kVar2 = kVar;
        c4.d dVar4 = dVar2;
        short[] sArr = kVar2.V3;
        short[] sArr2 = dVar4.V3;
        int[] iArr = dVar.f26449c;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int b10 = dVar.b();
        int p10 = dVar2.p();
        int i18 = i10 / 2;
        int g10 = dVar2.g() - b10;
        int i19 = b10;
        while (i19 < g10) {
            int i20 = g10;
            short[] sArr3 = sArr2;
            int i21 = dVar4.f6218c + (dVar4.f6219d * i19);
            int i22 = kVar2.f6218c + ((i19 - b10) * kVar2.f6219d);
            int i23 = i22 + p10;
            while (i22 < i23) {
                int i24 = i23;
                int i25 = kVar2.f6219d;
                int i26 = i22 + i25;
                int i27 = i26 + i25;
                int i28 = i27 + i25;
                int i29 = i28 + i25;
                int i30 = i29 + i25;
                sArr3[i21] = (short) ((((((((((sArr[i22] & 65535) * i11) + ((sArr[i26] & 65535) * i12)) + ((sArr[i27] & 65535) * i13)) + ((sArr[i28] & 65535) * i14)) + ((sArr[i29] & 65535) * i15)) + ((sArr[i30] & 65535) * i16)) + ((sArr[i30 + i25] & 65535) * i17)) + i18) / i10);
                i22++;
                kVar2 = kVar;
                i21++;
                i23 = i24;
            }
            i19++;
            g10 = i20;
            kVar2 = kVar;
            dVar4 = dVar2;
            sArr2 = sArr3;
        }
    }

    public static void l(z3.d dVar, c4.k kVar, c4.d dVar2, int i10, ll.d<ok.g> dVar3) {
        c4.k kVar2 = kVar;
        c4.d dVar4 = dVar2;
        short[] sArr = kVar2.V3;
        short[] sArr2 = dVar4.V3;
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
        int p10 = dVar2.p();
        int i20 = i10 / 2;
        int g10 = dVar2.g() - b10;
        int i21 = b10;
        while (i21 < g10) {
            int i22 = g10;
            int i23 = i19;
            int i24 = dVar4.f6218c + (dVar4.f6219d * i21);
            int i25 = kVar2.f6218c + ((i21 - b10) * kVar2.f6219d);
            int i26 = i25 + p10;
            while (i25 < i26) {
                int i27 = i26;
                int i28 = kVar2.f6219d;
                int i29 = i25 + i28;
                int i30 = i29 + i28;
                int i31 = i30 + i28;
                int i32 = i31 + i28;
                int i33 = i32 + i28;
                int i34 = i33 + i28;
                int i35 = i34 + i28;
                sArr2[i24] = (short) ((((((((((((sArr[i25] & 65535) * i11) + ((sArr[i29] & 65535) * i12)) + ((sArr[i30] & 65535) * i13)) + ((sArr[i31] & 65535) * i14)) + ((sArr[i32] & 65535) * i15)) + ((sArr[i33] & 65535) * i16)) + ((sArr[i34] & 65535) * i17)) + ((sArr[i35] & 65535) * i18)) + ((sArr[i35 + i28] & 65535) * i23)) + i20) / i10);
                i25++;
                kVar2 = kVar;
                i24++;
                i26 = i27;
            }
            i21++;
            g10 = i22;
            kVar2 = kVar;
            dVar4 = dVar2;
            i19 = i23;
        }
    }
}
