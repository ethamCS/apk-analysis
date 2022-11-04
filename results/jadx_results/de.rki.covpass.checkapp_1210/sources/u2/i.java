package u2;
/* loaded from: classes.dex */
public class i {
    public static boolean a(z3.b bVar, c4.a aVar, c4.a aVar2) {
        int i10 = bVar.f26454b;
        int i11 = bVar.f26453a;
        if (i10 != i11 / 2 || i11 % 2 == 0) {
            return false;
        }
        if (i11 == 3) {
            c(bVar, aVar, aVar2);
            return true;
        } else if (i11 == 5) {
            d(bVar, aVar, aVar2);
            return true;
        } else if (i11 == 7) {
            e(bVar, aVar, aVar2);
            return true;
        } else if (i11 == 9) {
            f(bVar, aVar, aVar2);
            return true;
        } else if (i11 != 11) {
            return false;
        } else {
            b(bVar, aVar, aVar2);
            return true;
        }
    }

    public static void b(z3.b bVar, c4.a aVar, c4.a aVar2) {
        c4.a aVar3 = aVar2;
        float[] fArr = aVar.V3;
        float[] fArr2 = aVar3.V3;
        float[] fArr3 = bVar.f26447c;
        int i10 = 0;
        float f10 = fArr3[0];
        float f11 = fArr3[1];
        float f12 = fArr3[2];
        float f13 = fArr3[3];
        float f14 = fArr3[4];
        float f15 = fArr3[5];
        float f16 = fArr3[6];
        float f17 = fArr3[7];
        float f18 = fArr3[8];
        float f19 = fArr3[9];
        float f20 = fArr3[10];
        int b10 = bVar.b();
        int p10 = aVar.p();
        while (i10 < aVar.f6221x) {
            float f21 = f20;
            int i11 = aVar3.f6218c + (aVar3.f6219d * i10) + b10;
            int i12 = (aVar.f6218c + (aVar.f6219d * i10)) - b10;
            int i13 = (i12 + p10) - b10;
            int i14 = i12 + b10;
            while (i14 < i13) {
                int i15 = i14 + 1;
                int i16 = i15 + 1;
                int i17 = i16 + 1;
                float f22 = (fArr[i14] * f10) + (fArr[i15] * f11) + (fArr[i16] * f12);
                int i18 = i17 + 1;
                float f23 = f22 + (fArr[i17] * f13);
                int i19 = i18 + 1;
                float f24 = f23 + (fArr[i18] * f14);
                int i20 = i19 + 1;
                float f25 = f24 + (fArr[i19] * f15);
                int i21 = i20 + 1;
                float f26 = f25 + (fArr[i20] * f16);
                int i22 = i21 + 1;
                float f27 = f26 + (fArr[i21] * f17);
                int i23 = i22 + 1;
                fArr2[i11] = f27 + (fArr[i22] * f18) + (fArr[i23] * f19) + (fArr[i23 + 1] * f21);
                i14 = i15;
                i11++;
            }
            i10++;
            aVar3 = aVar2;
            f20 = f21;
        }
    }

    public static void c(z3.b bVar, c4.a aVar, c4.a aVar2) {
        float[] fArr = aVar.V3;
        float[] fArr2 = aVar2.V3;
        float[] fArr3 = bVar.f26447c;
        float f10 = fArr3[0];
        float f11 = fArr3[1];
        float f12 = fArr3[2];
        int b10 = bVar.b();
        int p10 = aVar.p();
        for (int i10 = 0; i10 < aVar.f6221x; i10++) {
            int i11 = aVar2.f6218c + (aVar2.f6219d * i10) + b10;
            int i12 = (aVar.f6218c + (aVar.f6219d * i10)) - b10;
            int i13 = (i12 + p10) - b10;
            int i14 = i12 + b10;
            while (i14 < i13) {
                int i15 = i14 + 1;
                fArr2[i11] = (fArr[i14] * f10) + (fArr[i15] * f11) + (fArr[i15 + 1] * f12);
                i14 = i15;
                i11++;
            }
        }
    }

    public static void d(z3.b bVar, c4.a aVar, c4.a aVar2) {
        float[] fArr = aVar.V3;
        float[] fArr2 = aVar2.V3;
        float[] fArr3 = bVar.f26447c;
        float f10 = fArr3[0];
        float f11 = fArr3[1];
        float f12 = fArr3[2];
        float f13 = fArr3[3];
        float f14 = fArr3[4];
        int b10 = bVar.b();
        int p10 = aVar.p();
        for (int i10 = 0; i10 < aVar.f6221x; i10++) {
            int i11 = aVar2.f6218c + (aVar2.f6219d * i10) + b10;
            int i12 = (aVar.f6218c + (aVar.f6219d * i10)) - b10;
            int i13 = (i12 + p10) - b10;
            int i14 = i12 + b10;
            while (i14 < i13) {
                int i15 = i14 + 1;
                int i16 = i15 + 1;
                int i17 = i16 + 1;
                fArr2[i11] = (fArr[i14] * f10) + (fArr[i15] * f11) + (fArr[i16] * f12) + (fArr[i17] * f13) + (fArr[i17 + 1] * f14);
                i14 = i15;
                i11++;
            }
        }
    }

    public static void e(z3.b bVar, c4.a aVar, c4.a aVar2) {
        c4.a aVar3 = aVar2;
        float[] fArr = aVar.V3;
        float[] fArr2 = aVar3.V3;
        float[] fArr3 = bVar.f26447c;
        int i10 = 0;
        float f10 = fArr3[0];
        float f11 = fArr3[1];
        float f12 = fArr3[2];
        float f13 = fArr3[3];
        float f14 = fArr3[4];
        float f15 = fArr3[5];
        float f16 = fArr3[6];
        int b10 = bVar.b();
        int p10 = aVar.p();
        while (i10 < aVar.f6221x) {
            int i11 = aVar3.f6218c + (aVar3.f6219d * i10) + b10;
            int i12 = (aVar.f6218c + (aVar.f6219d * i10)) - b10;
            int i13 = (i12 + p10) - b10;
            int i14 = i12 + b10;
            while (i14 < i13) {
                int i15 = i14 + 1;
                int i16 = i15 + 1;
                int i17 = i16 + 1;
                float f17 = (fArr[i14] * f10) + (fArr[i15] * f11) + (fArr[i16] * f12);
                int i18 = i17 + 1;
                float f18 = f17 + (fArr[i17] * f13);
                int i19 = i18 + 1;
                fArr2[i11] = f18 + (fArr[i18] * f14) + (fArr[i19] * f15) + (fArr[i19 + 1] * f16);
                i14 = i15;
                i11++;
            }
            i10++;
            aVar3 = aVar2;
        }
    }

    public static void f(z3.b bVar, c4.a aVar, c4.a aVar2) {
        c4.a aVar3 = aVar2;
        float[] fArr = aVar.V3;
        float[] fArr2 = aVar3.V3;
        float[] fArr3 = bVar.f26447c;
        int i10 = 0;
        float f10 = fArr3[0];
        float f11 = fArr3[1];
        float f12 = fArr3[2];
        float f13 = fArr3[3];
        float f14 = fArr3[4];
        float f15 = fArr3[5];
        float f16 = fArr3[6];
        float f17 = fArr3[7];
        float f18 = fArr3[8];
        int b10 = bVar.b();
        int p10 = aVar.p();
        while (i10 < aVar.f6221x) {
            float f19 = f18;
            int i11 = aVar3.f6218c + (aVar3.f6219d * i10) + b10;
            int i12 = (aVar.f6218c + (aVar.f6219d * i10)) - b10;
            int i13 = (i12 + p10) - b10;
            int i14 = i12 + b10;
            while (i14 < i13) {
                int i15 = i14 + 1;
                int i16 = i15 + 1;
                int i17 = i16 + 1;
                float f20 = (fArr[i14] * f10) + (fArr[i15] * f11) + (fArr[i16] * f12);
                int i18 = i17 + 1;
                float f21 = f20 + (fArr[i17] * f13);
                int i19 = i18 + 1;
                float f22 = f21 + (fArr[i18] * f14);
                int i20 = i19 + 1;
                float f23 = f22 + (fArr[i19] * f15);
                int i21 = i20 + 1;
                fArr2[i11] = f23 + (fArr[i20] * f16) + (fArr[i21] * f17) + (fArr[i21 + 1] * f19);
                i14 = i15;
                i11++;
            }
            i10++;
            aVar3 = aVar2;
            f18 = f19;
        }
    }

    public static boolean g(z3.b bVar, c4.a aVar, c4.a aVar2) {
        int i10 = bVar.f26454b;
        int i11 = bVar.f26453a;
        if (i10 != i11 / 2 || i11 % 2 == 0) {
            return false;
        }
        if (i11 == 3) {
            i(bVar, aVar, aVar2);
            return true;
        } else if (i11 == 5) {
            j(bVar, aVar, aVar2);
            return true;
        } else if (i11 == 7) {
            k(bVar, aVar, aVar2);
            return true;
        } else if (i11 == 9) {
            l(bVar, aVar, aVar2);
            return true;
        } else if (i11 != 11) {
            return false;
        } else {
            h(bVar, aVar, aVar2);
            return true;
        }
    }

    public static void h(z3.b bVar, c4.a aVar, c4.a aVar2) {
        c4.a aVar3 = aVar2;
        float[] fArr = aVar.V3;
        float[] fArr2 = aVar3.V3;
        float[] fArr3 = bVar.f26447c;
        float f10 = fArr3[0];
        float f11 = fArr3[1];
        float f12 = fArr3[2];
        float f13 = fArr3[3];
        float f14 = fArr3[4];
        float f15 = fArr3[5];
        float f16 = fArr3[6];
        float f17 = fArr3[7];
        float f18 = fArr3[8];
        float f19 = fArr3[9];
        float f20 = fArr3[10];
        int b10 = bVar.b();
        int p10 = aVar2.p();
        int g10 = aVar2.g() - b10;
        int i10 = b10;
        while (i10 < g10) {
            int i11 = g10;
            float f21 = f19;
            int i12 = aVar3.f6218c + (aVar3.f6219d * i10);
            int i13 = aVar.f6218c + ((i10 - b10) * aVar.f6219d);
            int i14 = i13 + p10;
            while (i13 < i14) {
                int i15 = i14;
                int i16 = aVar.f6219d;
                int i17 = i13 + i16;
                int i18 = i17 + i16;
                int i19 = i18 + i16;
                int i20 = i19 + i16;
                int i21 = i20 + i16;
                int i22 = i21 + i16;
                int i23 = i22 + i16;
                int i24 = i23 + i16;
                int i25 = i24 + i16;
                fArr2[i12] = (fArr[i13] * f10) + (fArr[i17] * f11) + (fArr[i18] * f12) + (fArr[i19] * f13) + (fArr[i20] * f14) + (fArr[i21] * f15) + (fArr[i22] * f16) + (fArr[i23] * f17) + (fArr[i24] * f18) + (fArr[i25] * f21) + (fArr[i25 + i16] * f20);
                i13++;
                i12++;
                i14 = i15;
            }
            i10++;
            g10 = i11;
            aVar3 = aVar2;
            f19 = f21;
        }
    }

    public static void i(z3.b bVar, c4.a aVar, c4.a aVar2) {
        float[] fArr = aVar.V3;
        float[] fArr2 = aVar2.V3;
        float[] fArr3 = bVar.f26447c;
        float f10 = fArr3[0];
        float f11 = fArr3[1];
        float f12 = fArr3[2];
        int b10 = bVar.b();
        int p10 = aVar2.p();
        int g10 = aVar2.g() - b10;
        for (int i10 = b10; i10 < g10; i10++) {
            int i11 = aVar2.f6218c + (aVar2.f6219d * i10);
            int i12 = aVar.f6218c + ((i10 - b10) * aVar.f6219d);
            int i13 = i12 + p10;
            while (i12 < i13) {
                int i14 = aVar.f6219d;
                int i15 = i12 + i14;
                fArr2[i11] = (fArr[i12] * f10) + (fArr[i15] * f11) + (fArr[i15 + i14] * f12);
                i12++;
                i11++;
            }
        }
    }

    public static void j(z3.b bVar, c4.a aVar, c4.a aVar2) {
        c4.a aVar3 = aVar2;
        float[] fArr = aVar.V3;
        float[] fArr2 = aVar3.V3;
        float[] fArr3 = bVar.f26447c;
        float f10 = fArr3[0];
        float f11 = fArr3[1];
        float f12 = fArr3[2];
        float f13 = fArr3[3];
        float f14 = fArr3[4];
        int b10 = bVar.b();
        int p10 = aVar2.p();
        int g10 = aVar2.g() - b10;
        int i10 = b10;
        while (i10 < g10) {
            int i11 = aVar3.f6218c + (aVar3.f6219d * i10);
            int i12 = aVar.f6218c + ((i10 - b10) * aVar.f6219d);
            int i13 = i12 + p10;
            while (i12 < i13) {
                int i14 = i13;
                int i15 = aVar.f6219d;
                int i16 = i12 + i15;
                int i17 = i16 + i15;
                int i18 = i17 + i15;
                fArr2[i11] = (fArr[i12] * f10) + (fArr[i16] * f11) + (fArr[i17] * f12) + (fArr[i18] * f13) + (fArr[i18 + i15] * f14);
                i12++;
                i11++;
                i13 = i14;
            }
            i10++;
            aVar3 = aVar2;
        }
    }

    public static void k(z3.b bVar, c4.a aVar, c4.a aVar2) {
        c4.a aVar3 = aVar2;
        float[] fArr = aVar.V3;
        float[] fArr2 = aVar3.V3;
        float[] fArr3 = bVar.f26447c;
        float f10 = fArr3[0];
        float f11 = fArr3[1];
        float f12 = fArr3[2];
        float f13 = fArr3[3];
        float f14 = fArr3[4];
        float f15 = fArr3[5];
        float f16 = fArr3[6];
        int b10 = bVar.b();
        int p10 = aVar2.p();
        int g10 = aVar2.g() - b10;
        int i10 = b10;
        while (i10 < g10) {
            int i11 = g10;
            int i12 = aVar3.f6218c + (aVar3.f6219d * i10);
            int i13 = aVar.f6218c + ((i10 - b10) * aVar.f6219d);
            int i14 = i13 + p10;
            while (i13 < i14) {
                int i15 = i14;
                int i16 = aVar.f6219d;
                int i17 = i13 + i16;
                int i18 = i17 + i16;
                int i19 = i18 + i16;
                int i20 = i19 + i16;
                int i21 = i20 + i16;
                fArr2[i12] = (fArr[i13] * f10) + (fArr[i17] * f11) + (fArr[i18] * f12) + (fArr[i19] * f13) + (fArr[i20] * f14) + (fArr[i21] * f15) + (fArr[i21 + i16] * f16);
                i13++;
                i12++;
                i14 = i15;
            }
            i10++;
            g10 = i11;
            aVar3 = aVar2;
        }
    }

    public static void l(z3.b bVar, c4.a aVar, c4.a aVar2) {
        c4.a aVar3 = aVar2;
        float[] fArr = aVar.V3;
        float[] fArr2 = aVar3.V3;
        float[] fArr3 = bVar.f26447c;
        float f10 = fArr3[0];
        float f11 = fArr3[1];
        float f12 = fArr3[2];
        float f13 = fArr3[3];
        float f14 = fArr3[4];
        float f15 = fArr3[5];
        float f16 = fArr3[6];
        float f17 = fArr3[7];
        float f18 = fArr3[8];
        int b10 = bVar.b();
        int p10 = aVar2.p();
        int g10 = aVar2.g() - b10;
        int i10 = b10;
        while (i10 < g10) {
            int i11 = g10;
            float f19 = f18;
            int i12 = aVar3.f6218c + (aVar3.f6219d * i10);
            int i13 = aVar.f6218c + ((i10 - b10) * aVar.f6219d);
            int i14 = i13 + p10;
            while (i13 < i14) {
                int i15 = i14;
                int i16 = aVar.f6219d;
                int i17 = i13 + i16;
                int i18 = i17 + i16;
                int i19 = i18 + i16;
                int i20 = i19 + i16;
                int i21 = i20 + i16;
                int i22 = i21 + i16;
                int i23 = i22 + i16;
                fArr2[i12] = (fArr[i13] * f10) + (fArr[i17] * f11) + (fArr[i18] * f12) + (fArr[i19] * f13) + (fArr[i20] * f14) + (fArr[i21] * f15) + (fArr[i22] * f16) + (fArr[i23] * f17) + (fArr[i23 + i16] * f19);
                i13++;
                i12++;
                i14 = i15;
            }
            i10++;
            g10 = i11;
            aVar3 = aVar2;
            f18 = f19;
        }
    }
}
