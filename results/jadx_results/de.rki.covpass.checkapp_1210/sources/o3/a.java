package o3;
/* loaded from: classes.dex */
public class a {
    public static void a(c4.u uVar, c4.a aVar) {
        int N = uVar.N();
        if (N == 1) {
            for (int i10 = 0; i10 < uVar.f6221x; i10++) {
                System.arraycopy(uVar.W3, uVar.i(0, i10), aVar.V3, aVar.i(0, i10), uVar.f6220q);
            }
        } else if (N == 2) {
            for (int i11 = 0; i11 < uVar.f6221x; i11++) {
                int i12 = uVar.i(0, i11);
                int i13 = aVar.i(0, i11);
                int i14 = uVar.f6220q + i13;
                while (i13 < i14) {
                    float[] fArr = uVar.W3;
                    int i15 = i12 + 1;
                    aVar.V3[i13] = (fArr[i12] + fArr[i15]) / 2.0f;
                    i13++;
                    i12 = i15 + 1;
                }
            }
        } else if (N == 3) {
            for (int i16 = 0; i16 < uVar.f6221x; i16++) {
                int i17 = uVar.i(0, i16);
                int i18 = aVar.i(0, i16);
                int i19 = uVar.f6220q + i18;
                while (i18 < i19) {
                    float[] fArr2 = uVar.W3;
                    int i20 = i17 + 1;
                    int i21 = i20 + 1;
                    aVar.V3[i18] = ((fArr2[i17] + fArr2[i20]) + fArr2[i21]) / 3.0f;
                    i17 = i21 + 1;
                    i18++;
                }
            }
        } else {
            for (int i22 = 0; i22 < uVar.f6221x; i22++) {
                int i23 = uVar.i(0, i22);
                int i24 = aVar.i(0, i22);
                int i25 = 0;
                while (i25 < uVar.f6220q) {
                    float f10 = 0.0f;
                    int i26 = i23 + N;
                    while (i23 < i26) {
                        f10 += uVar.W3[i23];
                        i23++;
                    }
                    aVar.V3[i24] = f10 / N;
                    i25++;
                    i24++;
                }
            }
        }
    }

    public static void b(c4.v vVar, c4.b bVar) {
        int N = vVar.N();
        if (N == 1) {
            for (int i10 = 0; i10 < vVar.f6221x; i10++) {
                System.arraycopy(vVar.W3, vVar.i(0, i10), bVar.V3, bVar.i(0, i10), vVar.f6220q);
            }
        } else if (N == 2) {
            for (int i11 = 0; i11 < vVar.f6221x; i11++) {
                int i12 = vVar.i(0, i11);
                int i13 = bVar.i(0, i11);
                int i14 = vVar.f6220q + i13;
                while (i13 < i14) {
                    double[] dArr = vVar.W3;
                    int i15 = i12 + 1;
                    double d10 = dArr[i12];
                    i12 = i15 + 1;
                    bVar.V3[i13] = (d10 + dArr[i15]) / 2.0d;
                    i13++;
                }
            }
        } else if (N == 3) {
            for (int i16 = 0; i16 < vVar.f6221x; i16++) {
                int i17 = vVar.i(0, i16);
                int i18 = bVar.i(0, i16);
                int i19 = vVar.f6220q + i18;
                while (i18 < i19) {
                    double[] dArr2 = vVar.W3;
                    int i20 = i17 + 1;
                    double d11 = dArr2[i17];
                    int i21 = i20 + 1;
                    bVar.V3[i18] = ((d11 + dArr2[i20]) + dArr2[i21]) / 3.0d;
                    i18++;
                    i17 = i21 + 1;
                }
            }
        } else {
            for (int i22 = 0; i22 < vVar.f6221x; i22++) {
                int i23 = vVar.i(0, i22);
                int i24 = bVar.i(0, i22);
                int i25 = 0;
                while (i25 < vVar.f6220q) {
                    double d12 = 0.0d;
                    int i26 = i23 + N;
                    while (i23 < i26) {
                        d12 += vVar.W3[i23];
                        i23++;
                    }
                    bVar.V3[i24] = d12 / N;
                    i25++;
                    i24++;
                }
            }
        }
    }

    public static void c(c4.z zVar, c4.g gVar) {
        int N = zVar.N();
        if (N == 1) {
            for (int i10 = 0; i10 < zVar.f6221x; i10++) {
                System.arraycopy(zVar.W3, zVar.i(0, i10), gVar.V3, gVar.i(0, i10), zVar.f6220q);
            }
        } else if (N == 2) {
            for (int i11 = 0; i11 < zVar.f6221x; i11++) {
                int i12 = zVar.i(0, i11);
                int i13 = gVar.i(0, i11);
                int i14 = zVar.f6220q + i13;
                while (i13 < i14) {
                    short[] sArr = zVar.W3;
                    int i15 = i12 + 1;
                    gVar.V3[i13] = (short) ((sArr[i12] + sArr[i15]) / 2);
                    i13++;
                    i12 = i15 + 1;
                }
            }
        } else if (N == 3) {
            for (int i16 = 0; i16 < zVar.f6221x; i16++) {
                int i17 = zVar.i(0, i16);
                int i18 = gVar.i(0, i16);
                int i19 = zVar.f6220q + i18;
                while (i18 < i19) {
                    short[] sArr2 = zVar.W3;
                    int i20 = i17 + 1;
                    int i21 = i20 + 1;
                    gVar.V3[i18] = (short) (((sArr2[i17] + sArr2[i20]) + sArr2[i21]) / 3);
                    i17 = i21 + 1;
                    i18++;
                }
            }
        } else {
            for (int i22 = 0; i22 < zVar.f6221x; i22++) {
                int i23 = zVar.i(0, i22);
                int i24 = gVar.i(0, i22);
                int i25 = 0;
                while (i25 < zVar.f6220q) {
                    int i26 = i23 + N;
                    int i27 = 0;
                    while (i23 < i26) {
                        i27 += zVar.W3[i23];
                        i23++;
                    }
                    gVar.V3[i24] = (short) (i27 / N);
                    i25++;
                    i24++;
                }
            }
        }
    }

    public static void d(c4.a0 a0Var, c4.h hVar) {
        int N = a0Var.N();
        if (N == 1) {
            for (int i10 = 0; i10 < a0Var.f6221x; i10++) {
                System.arraycopy(a0Var.W3, a0Var.i(0, i10), hVar.V3, hVar.i(0, i10), a0Var.f6220q);
            }
        } else if (N == 2) {
            for (int i11 = 0; i11 < a0Var.f6221x; i11++) {
                int i12 = a0Var.i(0, i11);
                int i13 = hVar.i(0, i11);
                int i14 = a0Var.f6220q + i13;
                while (i13 < i14) {
                    int[] iArr = a0Var.W3;
                    int i15 = i12 + 1;
                    hVar.V3[i13] = (iArr[i12] + iArr[i15]) / 2;
                    i13++;
                    i12 = i15 + 1;
                }
            }
        } else if (N == 3) {
            for (int i16 = 0; i16 < a0Var.f6221x; i16++) {
                int i17 = a0Var.i(0, i16);
                int i18 = hVar.i(0, i16);
                int i19 = a0Var.f6220q + i18;
                while (i18 < i19) {
                    int[] iArr2 = a0Var.W3;
                    int i20 = i17 + 1;
                    int i21 = i20 + 1;
                    hVar.V3[i18] = ((iArr2[i17] + iArr2[i20]) + iArr2[i21]) / 3;
                    i17 = i21 + 1;
                    i18++;
                }
            }
        } else {
            for (int i22 = 0; i22 < a0Var.f6221x; i22++) {
                int i23 = a0Var.i(0, i22);
                int i24 = hVar.i(0, i22);
                int i25 = 0;
                while (i25 < a0Var.f6220q) {
                    int i26 = i23 + N;
                    int i27 = 0;
                    while (i23 < i26) {
                        i27 += a0Var.W3[i23];
                        i23++;
                    }
                    hVar.V3[i24] = i27 / N;
                    i25++;
                    i24++;
                }
            }
        }
    }

    public static void e(c4.b0 b0Var, c4.i iVar) {
        int N = b0Var.N();
        if (N == 1) {
            for (int i10 = 0; i10 < b0Var.f6221x; i10++) {
                System.arraycopy(b0Var.W3, b0Var.i(0, i10), iVar.V3, iVar.i(0, i10), b0Var.f6220q);
            }
        } else if (N == 2) {
            for (int i11 = 0; i11 < b0Var.f6221x; i11++) {
                int i12 = b0Var.i(0, i11);
                int i13 = iVar.i(0, i11);
                int i14 = b0Var.f6220q + i13;
                while (i13 < i14) {
                    long[] jArr = b0Var.W3;
                    int i15 = i12 + 1;
                    long j10 = jArr[i12];
                    i12 = i15 + 1;
                    iVar.V3[i13] = (j10 + jArr[i15]) / 2;
                    i13++;
                }
            }
        } else if (N == 3) {
            for (int i16 = 0; i16 < b0Var.f6221x; i16++) {
                int i17 = b0Var.i(0, i16);
                int i18 = iVar.i(0, i16);
                int i19 = b0Var.f6220q + i18;
                while (i18 < i19) {
                    long[] jArr2 = b0Var.W3;
                    int i20 = i17 + 1;
                    long j11 = jArr2[i17];
                    int i21 = i20 + 1;
                    iVar.V3[i18] = ((j11 + jArr2[i20]) + jArr2[i21]) / 3;
                    i18++;
                    i17 = i21 + 1;
                }
            }
        } else {
            for (int i22 = 0; i22 < b0Var.f6221x; i22++) {
                int i23 = b0Var.i(0, i22);
                int i24 = iVar.i(0, i22);
                int i25 = 0;
                while (i25 < b0Var.f6220q) {
                    long j12 = 0;
                    int i26 = i23 + N;
                    while (i23 < i26) {
                        j12 += b0Var.W3[i23];
                        i23++;
                    }
                    iVar.V3[i24] = j12 / N;
                    i25++;
                    i24++;
                }
            }
        }
    }

    public static void f(c4.c0 c0Var, c4.j jVar) {
        int N = c0Var.N();
        if (N == 1) {
            for (int i10 = 0; i10 < c0Var.f6221x; i10++) {
                System.arraycopy(c0Var.W3, c0Var.i(0, i10), jVar.V3, jVar.i(0, i10), c0Var.f6220q);
            }
        } else if (N == 2) {
            for (int i11 = 0; i11 < c0Var.f6221x; i11++) {
                int i12 = c0Var.i(0, i11);
                int i13 = jVar.i(0, i11);
                int i14 = c0Var.f6220q + i13;
                while (i13 < i14) {
                    byte[] bArr = c0Var.W3;
                    int i15 = i12 + 1;
                    jVar.V3[i13] = (byte) ((bArr[i12] + bArr[i15]) / 2);
                    i13++;
                    i12 = i15 + 1;
                }
            }
        } else if (N == 3) {
            for (int i16 = 0; i16 < c0Var.f6221x; i16++) {
                int i17 = c0Var.i(0, i16);
                int i18 = jVar.i(0, i16);
                int i19 = c0Var.f6220q + i18;
                while (i18 < i19) {
                    byte[] bArr2 = c0Var.W3;
                    int i20 = i17 + 1;
                    int i21 = i20 + 1;
                    jVar.V3[i18] = (byte) (((bArr2[i17] + bArr2[i20]) + bArr2[i21]) / 3);
                    i17 = i21 + 1;
                    i18++;
                }
            }
        } else {
            for (int i22 = 0; i22 < c0Var.f6221x; i22++) {
                int i23 = c0Var.i(0, i22);
                int i24 = jVar.i(0, i22);
                int i25 = 0;
                while (i25 < c0Var.f6220q) {
                    int i26 = i23 + N;
                    int i27 = 0;
                    while (i23 < i26) {
                        i27 += c0Var.W3[i23];
                        i23++;
                    }
                    jVar.V3[i24] = (byte) (i27 / N);
                    i25++;
                    i24++;
                }
            }
        }
    }

    public static void g(c4.d0 d0Var, c4.k kVar) {
        int N = d0Var.N();
        if (N == 1) {
            for (int i10 = 0; i10 < d0Var.f6221x; i10++) {
                System.arraycopy(d0Var.W3, d0Var.i(0, i10), kVar.V3, kVar.i(0, i10), d0Var.f6220q);
            }
        } else if (N == 2) {
            for (int i11 = 0; i11 < d0Var.f6221x; i11++) {
                int i12 = d0Var.i(0, i11);
                int i13 = kVar.i(0, i11);
                int i14 = d0Var.f6220q + i13;
                while (i13 < i14) {
                    short[] sArr = d0Var.W3;
                    int i15 = i12 + 1;
                    kVar.V3[i13] = (short) (((sArr[i12] & 65535) + (sArr[i15] & 65535)) / 2);
                    i13++;
                    i12 = i15 + 1;
                }
            }
        } else if (N == 3) {
            for (int i16 = 0; i16 < d0Var.f6221x; i16++) {
                int i17 = d0Var.i(0, i16);
                int i18 = kVar.i(0, i16);
                int i19 = d0Var.f6220q + i18;
                while (i18 < i19) {
                    short[] sArr2 = d0Var.W3;
                    int i20 = i17 + 1;
                    int i21 = i20 + 1;
                    kVar.V3[i18] = (short) ((((sArr2[i17] & 65535) + (sArr2[i20] & 65535)) + (sArr2[i21] & 65535)) / 3);
                    i17 = i21 + 1;
                    i18++;
                }
            }
        } else {
            for (int i22 = 0; i22 < d0Var.f6221x; i22++) {
                int i23 = d0Var.i(0, i22);
                int i24 = kVar.i(0, i22);
                int i25 = 0;
                while (i25 < d0Var.f6220q) {
                    int i26 = i23 + N;
                    int i27 = 0;
                    while (i23 < i26) {
                        i27 += d0Var.W3[i23] & 65535;
                        i23++;
                    }
                    kVar.V3[i24] = (short) (i27 / N);
                    i25++;
                    i24++;
                }
            }
        }
    }

    public static void h(c4.e0 e0Var, c4.l lVar) {
        int N = e0Var.N();
        if (N == 1) {
            for (int i10 = 0; i10 < e0Var.f6221x; i10++) {
                System.arraycopy(e0Var.W3, e0Var.i(0, i10), lVar.V3, lVar.i(0, i10), e0Var.f6220q);
            }
        } else if (N == 2) {
            for (int i11 = 0; i11 < e0Var.f6221x; i11++) {
                int i12 = e0Var.i(0, i11);
                int i13 = lVar.i(0, i11);
                int i14 = e0Var.f6220q + i13;
                while (i13 < i14) {
                    byte[] bArr = e0Var.W3;
                    int i15 = i12 + 1;
                    lVar.V3[i13] = (byte) (((bArr[i12] & 255) + (bArr[i15] & 255)) / 2);
                    i13++;
                    i12 = i15 + 1;
                }
            }
        } else if (N == 3) {
            for (int i16 = 0; i16 < e0Var.f6221x; i16++) {
                int i17 = e0Var.i(0, i16);
                int i18 = lVar.i(0, i16);
                int i19 = e0Var.f6220q + i18;
                while (i18 < i19) {
                    byte[] bArr2 = e0Var.W3;
                    int i20 = i17 + 1;
                    int i21 = i20 + 1;
                    lVar.V3[i18] = (byte) ((((bArr2[i17] & 255) + (bArr2[i20] & 255)) + (bArr2[i21] & 255)) / 3);
                    i17 = i21 + 1;
                    i18++;
                }
            }
        } else {
            for (int i22 = 0; i22 < e0Var.f6221x; i22++) {
                int i23 = e0Var.i(0, i22);
                int i24 = lVar.i(0, i22);
                int i25 = 0;
                while (i25 < e0Var.f6220q) {
                    int i26 = i23 + N;
                    int i27 = 0;
                    while (i23 < i26) {
                        i27 += e0Var.W3[i23] & 255;
                        i23++;
                    }
                    lVar.V3[i24] = (byte) (i27 / N);
                    i25++;
                    i24++;
                }
            }
        }
    }
}
