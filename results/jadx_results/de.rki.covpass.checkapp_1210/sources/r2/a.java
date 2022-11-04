package r2;
/* loaded from: classes.dex */
public class a {
    public static c4.l a(c4.a aVar, c4.l lVar, x3.b bVar, float f10, boolean z10, c4.a aVar2, c4.a aVar3) {
        s2.b.b(aVar, aVar2, -1.0d, bVar.e(Math.min(aVar.f6220q, aVar.f6221x)) / 2, aVar3);
        if (z10) {
            for (int i10 = 0; i10 < aVar.f6221x; i10++) {
                int i11 = aVar.f6218c + (aVar.f6219d * i10);
                int i12 = lVar.f6218c + (lVar.f6219d * i10);
                int i13 = aVar2.f6218c + (aVar2.f6219d * i10);
                int i14 = aVar.f6220q + i11;
                while (i11 < i14) {
                    if (aVar.V3[i11] <= aVar2.V3[i13] * f10) {
                        lVar.V3[i12] = 1;
                    } else {
                        lVar.V3[i12] = 0;
                    }
                    i11++;
                    i12++;
                    i13++;
                }
            }
        } else {
            for (int i15 = 0; i15 < aVar.f6221x; i15++) {
                int i16 = aVar.f6218c + (aVar.f6219d * i15);
                int i17 = lVar.f6218c + (lVar.f6219d * i15);
                int i18 = aVar2.f6218c + (aVar2.f6219d * i15);
                int i19 = aVar.f6220q + i16;
                while (i16 < i19) {
                    if (aVar.V3[i16] * f10 > aVar2.V3[i18]) {
                        lVar.V3[i17] = 1;
                    } else {
                        lVar.V3[i17] = 0;
                    }
                    i16++;
                    i17++;
                    i18++;
                }
            }
        }
        return lVar;
    }

    public static c4.l b(c4.k kVar, c4.l lVar, x3.b bVar, float f10, boolean z10, c4.k kVar2, c4.k kVar3) {
        s2.b.d(kVar, kVar2, -1.0d, bVar.e(Math.min(kVar.f6220q, kVar.f6221x)) / 2, kVar3);
        if (z10) {
            for (int i10 = 0; i10 < kVar.f6221x; i10++) {
                int i11 = kVar.f6218c + (kVar.f6219d * i10);
                int i12 = lVar.f6218c + (lVar.f6219d * i10);
                int i13 = kVar2.f6218c + (kVar2.f6219d * i10);
                int i14 = kVar.f6220q + i11;
                while (i11 < i14) {
                    if ((kVar.V3[i11] & 65535) <= (kVar2.V3[i13] & 65535) * f10) {
                        lVar.V3[i12] = 1;
                    } else {
                        lVar.V3[i12] = 0;
                    }
                    i11++;
                    i12++;
                    i13++;
                }
            }
        } else {
            for (int i15 = 0; i15 < kVar.f6221x; i15++) {
                int i16 = kVar.f6218c + (kVar.f6219d * i15);
                int i17 = lVar.f6218c + (lVar.f6219d * i15);
                int i18 = kVar2.f6218c + (kVar2.f6219d * i15);
                int i19 = kVar.f6220q + i16;
                while (i16 < i19) {
                    if ((kVar.V3[i16] & 65535) * f10 > (kVar2.V3[i18] & 65535)) {
                        lVar.V3[i17] = 1;
                    } else {
                        lVar.V3[i17] = 0;
                    }
                    i16++;
                    i17++;
                    i18++;
                }
            }
        }
        return lVar;
    }

    public static c4.l c(c4.l lVar, c4.l lVar2, x3.b bVar, float f10, boolean z10, c4.l lVar3, c4.l lVar4) {
        s2.b.f(lVar, lVar3, -1.0d, bVar.e(Math.min(lVar.f6220q, lVar.f6221x)) / 2, lVar4);
        if (z10) {
            for (int i10 = 0; i10 < lVar.f6221x; i10++) {
                int i11 = lVar.f6218c + (lVar.f6219d * i10);
                int i12 = lVar2.f6218c + (lVar2.f6219d * i10);
                int i13 = lVar3.f6218c + (lVar3.f6219d * i10);
                int i14 = lVar.f6220q + i11;
                while (i11 < i14) {
                    if ((lVar.V3[i11] & 255) <= (lVar3.V3[i13] & 255) * f10) {
                        lVar2.V3[i12] = 1;
                    } else {
                        lVar2.V3[i12] = 0;
                    }
                    i11++;
                    i12++;
                    i13++;
                }
            }
        } else {
            for (int i15 = 0; i15 < lVar.f6221x; i15++) {
                int i16 = lVar.f6218c + (lVar.f6219d * i15);
                int i17 = lVar2.f6218c + (lVar2.f6219d * i15);
                int i18 = lVar3.f6218c + (lVar3.f6219d * i15);
                int i19 = lVar.f6220q + i16;
                while (i16 < i19) {
                    if ((lVar.V3[i16] & 255) * f10 > (lVar3.V3[i18] & 255)) {
                        lVar2.V3[i17] = 1;
                    } else {
                        lVar2.V3[i17] = 0;
                    }
                    i16++;
                    i17++;
                    i18++;
                }
            }
        }
        return lVar2;
    }

    public static c4.l d(c4.a aVar, c4.l lVar, x3.b bVar, float f10, boolean z10, c4.a aVar2, c4.a aVar3, ll.d<ok.e> dVar) {
        s2.b.h(aVar, aVar2, bVar.e(Math.min(aVar.f6220q, aVar.f6221x)) / 2, aVar3, dVar);
        if (z10) {
            for (int i10 = 0; i10 < aVar.f6221x; i10++) {
                int i11 = aVar.f6218c + (aVar.f6219d * i10);
                int i12 = lVar.f6218c + (lVar.f6219d * i10);
                int i13 = aVar2.f6218c + (aVar2.f6219d * i10);
                int i14 = aVar.f6220q + i11;
                while (i11 < i14) {
                    int i15 = i13 + 1;
                    int i16 = i12 + 1;
                    int i17 = i11 + 1;
                    lVar.V3[i12] = aVar.V3[i11] <= aVar2.V3[i13] * f10 ? (byte) 1 : (byte) 0;
                    i13 = i15;
                    i12 = i16;
                    i11 = i17;
                }
            }
        } else {
            for (int i18 = 0; i18 < aVar.f6221x; i18++) {
                int i19 = aVar.f6218c + (aVar.f6219d * i18);
                int i20 = lVar.f6218c + (lVar.f6219d * i18);
                int i21 = aVar2.f6218c + (aVar2.f6219d * i18);
                int i22 = aVar.f6220q + i19;
                while (i19 < i22) {
                    int i23 = i21 + 1;
                    int i24 = i20 + 1;
                    int i25 = i19 + 1;
                    lVar.V3[i20] = aVar.V3[i19] * f10 > aVar2.V3[i21] ? (byte) 1 : (byte) 0;
                    i21 = i23;
                    i20 = i24;
                    i19 = i25;
                }
            }
        }
        return lVar;
    }

    public static c4.l e(c4.k kVar, c4.l lVar, x3.b bVar, float f10, boolean z10, c4.k kVar2, c4.k kVar3, ll.d<ok.g> dVar) {
        s2.b.j(kVar, kVar2, bVar.e(Math.min(kVar.f6220q, kVar.f6221x)) / 2, kVar3, dVar);
        int i10 = 0;
        if (z10) {
            while (i10 < kVar.f6221x) {
                int i11 = kVar.f6218c + (kVar.f6219d * i10);
                int i12 = lVar.f6218c + (lVar.f6219d * i10);
                int i13 = kVar2.f6218c + (kVar2.f6219d * i10);
                int i14 = kVar.f6220q + i11;
                while (i11 < i14) {
                    int i15 = i13 + 1;
                    int i16 = i12 + 1;
                    int i17 = i11 + 1;
                    lVar.V3[i12] = ((float) (kVar.V3[i11] & 65535)) <= ((float) (kVar2.V3[i13] & 65535)) * f10 ? (byte) 1 : (byte) 0;
                    i13 = i15;
                    i12 = i16;
                    i11 = i17;
                }
                i10++;
            }
        } else {
            while (i10 < kVar.f6221x) {
                int i18 = kVar.f6218c + (kVar.f6219d * i10);
                int i19 = lVar.f6218c + (lVar.f6219d * i10);
                int i20 = kVar2.f6218c + (kVar2.f6219d * i10);
                int i21 = kVar.f6220q + i18;
                while (i18 < i21) {
                    int i22 = i20 + 1;
                    int i23 = i19 + 1;
                    int i24 = i18 + 1;
                    lVar.V3[i19] = ((float) (kVar.V3[i18] & 65535)) * f10 > ((float) (kVar2.V3[i20] & 65535)) ? (byte) 1 : (byte) 0;
                    i20 = i22;
                    i19 = i23;
                    i18 = i24;
                }
                i10++;
            }
        }
        return lVar;
    }

    public static c4.l f(c4.l lVar, c4.l lVar2, x3.b bVar, float f10, boolean z10, c4.l lVar3, c4.l lVar4, ll.d<ok.g> dVar) {
        s2.b.l(lVar, lVar3, bVar.e(Math.min(lVar.f6220q, lVar.f6221x)) / 2, lVar4, dVar);
        if (z10) {
            for (int i10 = 0; i10 < lVar.f6221x; i10++) {
                int i11 = lVar.f6218c + (lVar.f6219d * i10);
                int i12 = lVar2.f6218c + (lVar2.f6219d * i10);
                int i13 = lVar3.f6218c + (lVar3.f6219d * i10);
                int i14 = lVar.f6220q + i11;
                while (i11 < i14) {
                    int i15 = i13 + 1;
                    int i16 = i12 + 1;
                    int i17 = i11 + 1;
                    lVar2.V3[i12] = ((float) (lVar.V3[i11] & 255)) <= ((float) (lVar3.V3[i13] & 255)) * f10 ? (byte) 1 : (byte) 0;
                    i13 = i15;
                    i12 = i16;
                    i11 = i17;
                }
            }
        } else {
            for (int i18 = 0; i18 < lVar.f6221x; i18++) {
                int i19 = lVar.f6218c + (lVar.f6219d * i18);
                int i20 = lVar2.f6218c + (lVar2.f6219d * i18);
                int i21 = lVar3.f6218c + (lVar3.f6219d * i18);
                int i22 = lVar.f6220q + i19;
                while (i19 < i22) {
                    int i23 = i21 + 1;
                    int i24 = i20 + 1;
                    int i25 = i19 + 1;
                    lVar2.V3[i20] = ((float) (lVar.V3[i19] & 255)) * f10 > ((float) (lVar3.V3[i21] & 255)) ? (byte) 1 : (byte) 0;
                    i21 = i23;
                    i20 = i24;
                    i19 = i25;
                }
            }
        }
        return lVar2;
    }

    public static c4.l g(c4.a aVar, c4.l lVar, float f10, boolean z10) {
        if (z10) {
            for (int i10 = 0; i10 < aVar.f6221x; i10++) {
                int i11 = aVar.f6218c + (aVar.f6219d * i10);
                int i12 = lVar.f6218c + (lVar.f6219d * i10);
                int i13 = aVar.f6220q;
                while (i13 > 0) {
                    int i14 = i12 + 1;
                    int i15 = i11 + 1;
                    lVar.V3[i12] = (byte) (aVar.V3[i11] <= f10 ? 1 : 0);
                    i13--;
                    i12 = i14;
                    i11 = i15;
                }
            }
        } else {
            for (int i16 = 0; i16 < aVar.f6221x; i16++) {
                int i17 = aVar.f6218c + (aVar.f6219d * i16);
                int i18 = lVar.f6218c + (lVar.f6219d * i16);
                int i19 = aVar.f6220q;
                while (i19 > 0) {
                    int i20 = i18 + 1;
                    int i21 = i17 + 1;
                    lVar.V3[i18] = (byte) (aVar.V3[i17] > f10 ? 1 : 0);
                    i19--;
                    i18 = i20;
                    i17 = i21;
                }
            }
        }
        return lVar;
    }

    public static c4.l h(c4.b bVar, c4.l lVar, double d10, boolean z10) {
        if (z10) {
            for (int i10 = 0; i10 < bVar.f6221x; i10++) {
                int i11 = bVar.f6218c + (bVar.f6219d * i10);
                int i12 = lVar.f6218c + (lVar.f6219d * i10);
                int i13 = bVar.f6220q;
                while (i13 > 0) {
                    int i14 = i12 + 1;
                    int i15 = i11 + 1;
                    lVar.V3[i12] = (byte) (bVar.V3[i11] <= d10 ? 1 : 0);
                    i13--;
                    i12 = i14;
                    i11 = i15;
                }
            }
        } else {
            for (int i16 = 0; i16 < bVar.f6221x; i16++) {
                int i17 = bVar.f6218c + (bVar.f6219d * i16);
                int i18 = lVar.f6218c + (lVar.f6219d * i16);
                int i19 = bVar.f6220q;
                while (i19 > 0) {
                    int i20 = i18 + 1;
                    int i21 = i17 + 1;
                    lVar.V3[i18] = (byte) (bVar.V3[i17] > d10 ? 1 : 0);
                    i19--;
                    i18 = i20;
                    i17 = i21;
                }
            }
        }
        return lVar;
    }

    public static c4.l i(c4.g gVar, c4.l lVar, int i10, boolean z10) {
        if (z10) {
            for (int i11 = 0; i11 < gVar.f6221x; i11++) {
                int i12 = gVar.f6218c + (gVar.f6219d * i11);
                int i13 = lVar.f6218c + (lVar.f6219d * i11);
                int i14 = gVar.f6220q;
                while (i14 > 0) {
                    int i15 = i13 + 1;
                    int i16 = i12 + 1;
                    lVar.V3[i13] = (byte) (gVar.V3[i12] <= i10 ? 1 : 0);
                    i14--;
                    i13 = i15;
                    i12 = i16;
                }
            }
        } else {
            for (int i17 = 0; i17 < gVar.f6221x; i17++) {
                int i18 = gVar.f6218c + (gVar.f6219d * i17);
                int i19 = lVar.f6218c + (lVar.f6219d * i17);
                int i20 = gVar.f6220q;
                while (i20 > 0) {
                    int i21 = i19 + 1;
                    int i22 = i18 + 1;
                    lVar.V3[i19] = (byte) (gVar.V3[i18] > i10 ? 1 : 0);
                    i20--;
                    i19 = i21;
                    i18 = i22;
                }
            }
        }
        return lVar;
    }

    public static c4.l j(c4.h hVar, c4.l lVar, int i10, boolean z10) {
        if (z10) {
            for (int i11 = 0; i11 < hVar.f6221x; i11++) {
                int i12 = hVar.f6218c + (hVar.f6219d * i11);
                int i13 = lVar.f6218c + (lVar.f6219d * i11);
                int i14 = hVar.f6220q;
                while (i14 > 0) {
                    int i15 = i13 + 1;
                    int i16 = i12 + 1;
                    lVar.V3[i13] = (byte) (hVar.V3[i12] <= i10 ? 1 : 0);
                    i14--;
                    i13 = i15;
                    i12 = i16;
                }
            }
        } else {
            for (int i17 = 0; i17 < hVar.f6221x; i17++) {
                int i18 = hVar.f6218c + (hVar.f6219d * i17);
                int i19 = lVar.f6218c + (lVar.f6219d * i17);
                int i20 = hVar.f6220q;
                while (i20 > 0) {
                    int i21 = i19 + 1;
                    int i22 = i18 + 1;
                    lVar.V3[i19] = (byte) (hVar.V3[i18] > i10 ? 1 : 0);
                    i20--;
                    i19 = i21;
                    i18 = i22;
                }
            }
        }
        return lVar;
    }

    public static c4.l k(c4.k kVar, c4.l lVar, int i10, boolean z10) {
        if (z10) {
            for (int i11 = 0; i11 < kVar.f6221x; i11++) {
                int i12 = kVar.f6218c + (kVar.f6219d * i11);
                int i13 = lVar.f6218c + (lVar.f6219d * i11);
                int i14 = kVar.f6220q;
                while (i14 > 0) {
                    int i15 = i13 + 1;
                    int i16 = i12 + 1;
                    lVar.V3[i13] = (byte) ((kVar.V3[i12] & 65535) <= i10 ? 1 : 0);
                    i14--;
                    i13 = i15;
                    i12 = i16;
                }
            }
        } else {
            for (int i17 = 0; i17 < kVar.f6221x; i17++) {
                int i18 = kVar.f6218c + (kVar.f6219d * i17);
                int i19 = lVar.f6218c + (lVar.f6219d * i17);
                int i20 = kVar.f6220q;
                while (i20 > 0) {
                    int i21 = i19 + 1;
                    int i22 = i18 + 1;
                    lVar.V3[i19] = (byte) ((kVar.V3[i18] & 65535) > i10 ? 1 : 0);
                    i20--;
                    i19 = i21;
                    i18 = i22;
                }
            }
        }
        return lVar;
    }

    public static c4.l l(c4.l lVar, c4.l lVar2, int i10, boolean z10) {
        if (z10) {
            for (int i11 = 0; i11 < lVar.f6221x; i11++) {
                int i12 = lVar.f6218c + (lVar.f6219d * i11);
                int i13 = lVar2.f6218c + (lVar2.f6219d * i11);
                int i14 = lVar.f6220q;
                while (i14 > 0) {
                    int i15 = i13 + 1;
                    int i16 = i12 + 1;
                    lVar2.V3[i13] = (byte) ((lVar.V3[i12] & 255) <= i10 ? 1 : 0);
                    i14--;
                    i13 = i15;
                    i12 = i16;
                }
            }
        } else {
            for (int i17 = 0; i17 < lVar.f6221x; i17++) {
                int i18 = lVar.f6218c + (lVar.f6219d * i17);
                int i19 = lVar2.f6218c + (lVar2.f6219d * i17);
                int i20 = lVar.f6220q;
                while (i20 > 0) {
                    int i21 = i19 + 1;
                    int i22 = i18 + 1;
                    lVar2.V3[i19] = (byte) ((lVar.V3[i18] & 255) > i10 ? 1 : 0);
                    i20--;
                    i19 = i21;
                    i18 = i22;
                }
            }
        }
        return lVar2;
    }
}
