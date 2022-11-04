package o3;
/* loaded from: classes.dex */
public class a0 {
    public static void a(c4.f0<c4.a> f0Var, c4.a aVar) {
        int M = f0Var.M();
        if (M == 1) {
            aVar.y(f0Var.B(0));
        } else if (M == 3) {
            c4.a B = f0Var.B(0);
            c4.a B2 = f0Var.B(1);
            c4.a B3 = f0Var.B(2);
            for (int i10 = 0; i10 < f0Var.f6221x; i10++) {
                int i11 = f0Var.i(0, i10);
                int i12 = aVar.i(0, i10);
                int i13 = 0;
                while (i13 < f0Var.f6220q) {
                    aVar.V3[i12] = ((B.V3[i11] + B2.V3[i11]) + B3.V3[i11]) / 3.0f;
                    i13++;
                    i11++;
                    i12++;
                }
            }
        } else {
            for (int i14 = 0; i14 < f0Var.f6221x; i14++) {
                int i15 = f0Var.i(0, i14);
                int i16 = aVar.i(0, i14);
                int i17 = 0;
                while (i17 < f0Var.f6220q) {
                    float f10 = 0.0f;
                    for (int i18 = 0; i18 < M; i18++) {
                        f10 += f0Var.W3[i18].V3[i15];
                    }
                    aVar.V3[i16] = f10 / M;
                    i17++;
                    i15++;
                    i16++;
                }
            }
        }
    }

    public static void b(c4.f0<c4.b> f0Var, c4.b bVar) {
        int M = f0Var.M();
        if (M == 1) {
            bVar.y(f0Var.B(0));
        } else if (M == 3) {
            c4.b B = f0Var.B(0);
            c4.b B2 = f0Var.B(1);
            c4.b B3 = f0Var.B(2);
            for (int i10 = 0; i10 < f0Var.f6221x; i10++) {
                int i11 = f0Var.i(0, i10);
                int i12 = bVar.i(0, i10);
                int i13 = 0;
                while (i13 < f0Var.f6220q) {
                    bVar.V3[i12] = ((B.V3[i11] + B2.V3[i11]) + B3.V3[i11]) / 3.0d;
                    i13++;
                    i11++;
                    i12++;
                }
            }
        } else {
            for (int i14 = 0; i14 < f0Var.f6221x; i14++) {
                int i15 = f0Var.i(0, i14);
                int i16 = bVar.i(0, i14);
                int i17 = 0;
                while (i17 < f0Var.f6220q) {
                    double d10 = 0.0d;
                    for (int i18 = 0; i18 < M; i18++) {
                        d10 += f0Var.W3[i18].V3[i15];
                    }
                    bVar.V3[i16] = d10 / M;
                    i17++;
                    i15++;
                    i16++;
                }
            }
        }
    }

    public static void c(c4.f0<c4.g> f0Var, c4.g gVar) {
        int M = f0Var.M();
        if (M == 1) {
            gVar.y(f0Var.B(0));
        } else if (M == 3) {
            c4.g B = f0Var.B(0);
            c4.g B2 = f0Var.B(1);
            c4.g B3 = f0Var.B(2);
            for (int i10 = 0; i10 < f0Var.f6221x; i10++) {
                int i11 = f0Var.i(0, i10);
                int i12 = gVar.i(0, i10);
                int i13 = 0;
                while (i13 < f0Var.f6220q) {
                    gVar.V3[i12] = (short) (((B.V3[i11] + B2.V3[i11]) + B3.V3[i11]) / 3);
                    i13++;
                    i11++;
                    i12++;
                }
            }
        } else {
            for (int i14 = 0; i14 < f0Var.f6221x; i14++) {
                int i15 = f0Var.i(0, i14);
                int i16 = gVar.i(0, i14);
                int i17 = 0;
                while (i17 < f0Var.f6220q) {
                    int i18 = 0;
                    for (int i19 = 0; i19 < M; i19++) {
                        i18 += f0Var.W3[i19].V3[i15];
                    }
                    gVar.V3[i16] = (short) (i18 / M);
                    i17++;
                    i15++;
                    i16++;
                }
            }
        }
    }

    public static void d(c4.f0<c4.h> f0Var, c4.h hVar) {
        int M = f0Var.M();
        if (M == 1) {
            hVar.y(f0Var.B(0));
        } else if (M == 3) {
            c4.h B = f0Var.B(0);
            c4.h B2 = f0Var.B(1);
            c4.h B3 = f0Var.B(2);
            for (int i10 = 0; i10 < f0Var.f6221x; i10++) {
                int i11 = f0Var.i(0, i10);
                int i12 = hVar.i(0, i10);
                int i13 = 0;
                while (i13 < f0Var.f6220q) {
                    hVar.V3[i12] = ((B.V3[i11] + B2.V3[i11]) + B3.V3[i11]) / 3;
                    i13++;
                    i11++;
                    i12++;
                }
            }
        } else {
            for (int i14 = 0; i14 < f0Var.f6221x; i14++) {
                int i15 = f0Var.i(0, i14);
                int i16 = hVar.i(0, i14);
                int i17 = 0;
                while (i17 < f0Var.f6220q) {
                    int i18 = 0;
                    for (int i19 = 0; i19 < M; i19++) {
                        i18 += f0Var.W3[i19].V3[i15];
                    }
                    hVar.V3[i16] = i18 / M;
                    i17++;
                    i15++;
                    i16++;
                }
            }
        }
    }

    public static void e(c4.f0<c4.i> f0Var, c4.i iVar) {
        int M = f0Var.M();
        if (M == 1) {
            iVar.y(f0Var.B(0));
        } else if (M == 3) {
            c4.i B = f0Var.B(0);
            c4.i B2 = f0Var.B(1);
            c4.i B3 = f0Var.B(2);
            for (int i10 = 0; i10 < f0Var.f6221x; i10++) {
                int i11 = f0Var.i(0, i10);
                int i12 = iVar.i(0, i10);
                int i13 = 0;
                while (i13 < f0Var.f6220q) {
                    iVar.V3[i12] = ((B.V3[i11] + B2.V3[i11]) + B3.V3[i11]) / 3;
                    i13++;
                    i11++;
                    i12++;
                }
            }
        } else {
            for (int i14 = 0; i14 < f0Var.f6221x; i14++) {
                int i15 = f0Var.i(0, i14);
                int i16 = iVar.i(0, i14);
                int i17 = 0;
                while (i17 < f0Var.f6220q) {
                    long j10 = 0;
                    for (int i18 = 0; i18 < M; i18++) {
                        j10 += f0Var.W3[i18].V3[i15];
                    }
                    iVar.V3[i16] = j10 / M;
                    i17++;
                    i15++;
                    i16++;
                }
            }
        }
    }

    public static void f(c4.f0<c4.j> f0Var, c4.j jVar) {
        int M = f0Var.M();
        if (M == 1) {
            jVar.y(f0Var.B(0));
        } else if (M == 3) {
            c4.j B = f0Var.B(0);
            c4.j B2 = f0Var.B(1);
            c4.j B3 = f0Var.B(2);
            for (int i10 = 0; i10 < f0Var.f6221x; i10++) {
                int i11 = f0Var.i(0, i10);
                int i12 = jVar.i(0, i10);
                int i13 = 0;
                while (i13 < f0Var.f6220q) {
                    jVar.V3[i12] = (byte) (((B.V3[i11] + B2.V3[i11]) + B3.V3[i11]) / 3);
                    i13++;
                    i11++;
                    i12++;
                }
            }
        } else {
            for (int i14 = 0; i14 < f0Var.f6221x; i14++) {
                int i15 = f0Var.i(0, i14);
                int i16 = jVar.i(0, i14);
                int i17 = 0;
                while (i17 < f0Var.f6220q) {
                    int i18 = 0;
                    for (int i19 = 0; i19 < M; i19++) {
                        i18 += f0Var.W3[i19].V3[i15];
                    }
                    jVar.V3[i16] = (byte) (i18 / M);
                    i17++;
                    i15++;
                    i16++;
                }
            }
        }
    }

    public static void g(c4.f0<c4.k> f0Var, c4.k kVar) {
        int M = f0Var.M();
        if (M == 1) {
            kVar.y(f0Var.B(0));
        } else if (M == 3) {
            c4.k B = f0Var.B(0);
            c4.k B2 = f0Var.B(1);
            c4.k B3 = f0Var.B(2);
            for (int i10 = 0; i10 < f0Var.f6221x; i10++) {
                int i11 = f0Var.i(0, i10);
                int i12 = kVar.i(0, i10);
                int i13 = 0;
                while (i13 < f0Var.f6220q) {
                    kVar.V3[i12] = (short) ((((B.V3[i11] & 65535) + (B2.V3[i11] & 65535)) + (B3.V3[i11] & 65535)) / 3);
                    i13++;
                    i11++;
                    i12++;
                }
            }
        } else {
            for (int i14 = 0; i14 < f0Var.f6221x; i14++) {
                int i15 = f0Var.i(0, i14);
                int i16 = kVar.i(0, i14);
                int i17 = 0;
                while (i17 < f0Var.f6220q) {
                    int i18 = 0;
                    for (int i19 = 0; i19 < M; i19++) {
                        i18 += f0Var.W3[i19].V3[i15] & 65535;
                    }
                    kVar.V3[i16] = (short) (i18 / M);
                    i17++;
                    i15++;
                    i16++;
                }
            }
        }
    }

    public static void h(c4.f0<c4.l> f0Var, c4.l lVar) {
        int M = f0Var.M();
        if (M == 1) {
            lVar.y(f0Var.B(0));
        } else if (M == 3) {
            c4.l B = f0Var.B(0);
            c4.l B2 = f0Var.B(1);
            c4.l B3 = f0Var.B(2);
            for (int i10 = 0; i10 < f0Var.f6221x; i10++) {
                int i11 = f0Var.i(0, i10);
                int i12 = lVar.i(0, i10);
                int i13 = 0;
                while (i13 < f0Var.f6220q) {
                    lVar.V3[i12] = (byte) ((((B.V3[i11] & 255) + (B2.V3[i11] & 255)) + (B3.V3[i11] & 255)) / 3);
                    i13++;
                    i11++;
                    i12++;
                }
            }
        } else {
            for (int i14 = 0; i14 < f0Var.f6221x; i14++) {
                int i15 = f0Var.i(0, i14);
                int i16 = lVar.i(0, i14);
                int i17 = 0;
                while (i17 < f0Var.f6220q) {
                    int i18 = 0;
                    for (int i19 = 0; i19 < M; i19++) {
                        i18 += f0Var.W3[i19].V3[i15] & 255;
                    }
                    lVar.V3[i16] = (byte) (i18 / M);
                    i17++;
                    i15++;
                    i16++;
                }
            }
        }
    }
}
