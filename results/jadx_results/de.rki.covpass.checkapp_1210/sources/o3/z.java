package o3;

import j$.util.function.IntConsumer;
import java.util.Objects;
/* loaded from: classes.dex */
public class z {
    public static void A(final c4.z zVar, final c4.g gVar) {
        int i10;
        IntConsumer intConsumer;
        final int N = zVar.N();
        if (N == 1) {
            for (int i11 = 0; i11 < zVar.f6221x; i11++) {
                System.arraycopy(zVar.W3, zVar.i(0, i11), gVar.V3, gVar.i(0, i11), zVar.f6220q);
            }
            return;
        }
        if (N == 2) {
            i10 = zVar.f6221x;
            intConsumer = new IntConsumer() { // from class: o3.v
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.d0(c4.z.this, gVar, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        } else if (N != 3) {
            ll.b.f(0, zVar.f6221x, new IntConsumer() { // from class: o3.x
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.J(c4.z.this, gVar, N, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            });
            return;
        } else {
            i10 = zVar.f6221x;
            intConsumer = new IntConsumer() { // from class: o3.w
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.I(c4.z.this, gVar, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        }
        ll.b.f(0, i10, intConsumer);
    }

    public static void B(final c4.a0 a0Var, final c4.h hVar) {
        int i10;
        IntConsumer intConsumer;
        final int N = a0Var.N();
        if (N == 1) {
            for (int i11 = 0; i11 < a0Var.f6221x; i11++) {
                System.arraycopy(a0Var.W3, a0Var.i(0, i11), hVar.V3, hVar.i(0, i11), a0Var.f6220q);
            }
            return;
        }
        if (N == 2) {
            i10 = a0Var.f6221x;
            intConsumer = new IntConsumer() { // from class: o3.c
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.K(c4.a0.this, hVar, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        } else if (N != 3) {
            ll.b.f(0, a0Var.f6221x, new IntConsumer() { // from class: o3.d
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.M(c4.a0.this, hVar, N, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            });
            return;
        } else {
            i10 = a0Var.f6221x;
            intConsumer = new IntConsumer() { // from class: o3.y
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.L(c4.a0.this, hVar, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        }
        ll.b.f(0, i10, intConsumer);
    }

    public static void C(final c4.b0 b0Var, final c4.i iVar) {
        int i10;
        IntConsumer intConsumer;
        final int N = b0Var.N();
        if (N == 1) {
            for (int i11 = 0; i11 < b0Var.f6221x; i11++) {
                System.arraycopy(b0Var.W3, b0Var.i(0, i11), iVar.V3, iVar.i(0, i11), b0Var.f6220q);
            }
            return;
        }
        if (N == 2) {
            i10 = b0Var.f6221x;
            intConsumer = new IntConsumer() { // from class: o3.e
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.N(c4.b0.this, iVar, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        } else if (N != 3) {
            ll.b.f(0, b0Var.f6221x, new IntConsumer() { // from class: o3.g
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.P(c4.b0.this, iVar, N, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            });
            return;
        } else {
            i10 = b0Var.f6221x;
            intConsumer = new IntConsumer() { // from class: o3.f
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.O(c4.b0.this, iVar, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        }
        ll.b.f(0, i10, intConsumer);
    }

    public static void D(final c4.c0 c0Var, final c4.j jVar) {
        int i10;
        IntConsumer intConsumer;
        final int N = c0Var.N();
        if (N == 1) {
            for (int i11 = 0; i11 < c0Var.f6221x; i11++) {
                System.arraycopy(c0Var.W3, c0Var.i(0, i11), jVar.V3, jVar.i(0, i11), c0Var.f6220q);
            }
            return;
        }
        if (N == 2) {
            i10 = c0Var.f6221x;
            intConsumer = new IntConsumer() { // from class: o3.h
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.X(c4.c0.this, jVar, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        } else if (N != 3) {
            ll.b.f(0, c0Var.f6221x, new IntConsumer() { // from class: o3.j
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.Z(c4.c0.this, jVar, N, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            });
            return;
        } else {
            i10 = c0Var.f6221x;
            intConsumer = new IntConsumer() { // from class: o3.i
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.Y(c4.c0.this, jVar, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        }
        ll.b.f(0, i10, intConsumer);
    }

    public static void E(final c4.d0 d0Var, final c4.k kVar) {
        int i10;
        IntConsumer intConsumer;
        final int N = d0Var.N();
        if (N == 1) {
            for (int i11 = 0; i11 < d0Var.f6221x; i11++) {
                System.arraycopy(d0Var.W3, d0Var.i(0, i11), kVar.V3, kVar.i(0, i11), d0Var.f6220q);
            }
            return;
        }
        if (N == 2) {
            i10 = d0Var.f6221x;
            intConsumer = new IntConsumer() { // from class: o3.k
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.a0(c4.d0.this, kVar, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        } else if (N != 3) {
            ll.b.f(0, d0Var.f6221x, new IntConsumer() { // from class: o3.n
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.c0(c4.d0.this, kVar, N, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            });
            return;
        } else {
            i10 = d0Var.f6221x;
            intConsumer = new IntConsumer() { // from class: o3.l
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.b0(c4.d0.this, kVar, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        }
        ll.b.f(0, i10, intConsumer);
    }

    public static void F(final c4.e0 e0Var, final c4.l lVar) {
        int i10;
        IntConsumer intConsumer;
        final int N = e0Var.N();
        if (N == 1) {
            for (int i11 = 0; i11 < e0Var.f6221x; i11++) {
                System.arraycopy(e0Var.W3, e0Var.i(0, i11), lVar.V3, lVar.i(0, i11), e0Var.f6220q);
            }
            return;
        }
        if (N == 2) {
            i10 = e0Var.f6221x;
            intConsumer = new IntConsumer() { // from class: o3.o
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.G(c4.e0.this, lVar, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        } else if (N != 3) {
            ll.b.f(0, e0Var.f6221x, new IntConsumer() { // from class: o3.q
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.S(c4.e0.this, lVar, N, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            });
            return;
        } else {
            i10 = e0Var.f6221x;
            intConsumer = new IntConsumer() { // from class: o3.p
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.H(c4.e0.this, lVar, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        }
        ll.b.f(0, i10, intConsumer);
    }

    public static /* synthetic */ void G(c4.e0 e0Var, c4.l lVar, int i10) {
        int i11 = e0Var.i(0, i10);
        int i12 = lVar.i(0, i10);
        int i13 = e0Var.f6220q + i12;
        while (i12 < i13) {
            byte[] bArr = e0Var.W3;
            int i14 = i11 + 1;
            lVar.V3[i12] = (byte) (((bArr[i11] & 255) + (bArr[i14] & 255)) / 2);
            i12++;
            i11 = i14 + 1;
        }
    }

    public static /* synthetic */ void H(c4.e0 e0Var, c4.l lVar, int i10) {
        int i11 = e0Var.i(0, i10);
        int i12 = lVar.i(0, i10);
        int i13 = e0Var.f6220q + i12;
        while (i12 < i13) {
            byte[] bArr = e0Var.W3;
            int i14 = i11 + 1;
            int i15 = i14 + 1;
            int i16 = (bArr[i11] & 255) + (bArr[i14] & 255);
            lVar.V3[i12] = (byte) ((i16 + (bArr[i15] & 255)) / 3);
            i11 = i15 + 1;
            i12++;
        }
    }

    public static /* synthetic */ void I(c4.z zVar, c4.g gVar, int i10) {
        int i11 = zVar.i(0, i10);
        int i12 = gVar.i(0, i10);
        int i13 = zVar.f6220q + i12;
        while (i12 < i13) {
            short[] sArr = zVar.W3;
            int i14 = i11 + 1;
            int i15 = i14 + 1;
            int i16 = sArr[i11] + sArr[i14];
            gVar.V3[i12] = (short) ((i16 + sArr[i15]) / 3);
            i11 = i15 + 1;
            i12++;
        }
    }

    public static /* synthetic */ void J(c4.z zVar, c4.g gVar, int i10, int i11) {
        int i12 = zVar.i(0, i11);
        int i13 = gVar.i(0, i11);
        int i14 = 0;
        while (i14 < zVar.f6220q) {
            int i15 = i12 + i10;
            int i16 = 0;
            while (i12 < i15) {
                i16 += zVar.W3[i12];
                i12++;
            }
            gVar.V3[i13] = (short) (i16 / i10);
            i14++;
            i13++;
        }
    }

    public static /* synthetic */ void K(c4.a0 a0Var, c4.h hVar, int i10) {
        int i11 = a0Var.i(0, i10);
        int i12 = hVar.i(0, i10);
        int i13 = a0Var.f6220q + i12;
        while (i12 < i13) {
            int[] iArr = a0Var.W3;
            int i14 = i11 + 1;
            hVar.V3[i12] = (iArr[i11] + iArr[i14]) / 2;
            i12++;
            i11 = i14 + 1;
        }
    }

    public static /* synthetic */ void L(c4.a0 a0Var, c4.h hVar, int i10) {
        int i11 = a0Var.i(0, i10);
        int i12 = hVar.i(0, i10);
        int i13 = a0Var.f6220q + i12;
        while (i12 < i13) {
            int[] iArr = a0Var.W3;
            int i14 = i11 + 1;
            int i15 = i14 + 1;
            int i16 = iArr[i11] + iArr[i14];
            hVar.V3[i12] = (i16 + iArr[i15]) / 3;
            i11 = i15 + 1;
            i12++;
        }
    }

    public static /* synthetic */ void M(c4.a0 a0Var, c4.h hVar, int i10, int i11) {
        int i12 = a0Var.i(0, i11);
        int i13 = hVar.i(0, i11);
        int i14 = 0;
        while (i14 < a0Var.f6220q) {
            int i15 = i12 + i10;
            int i16 = 0;
            while (i12 < i15) {
                i16 += a0Var.W3[i12];
                i12++;
            }
            hVar.V3[i13] = i16 / i10;
            i14++;
            i13++;
        }
    }

    public static /* synthetic */ void N(c4.b0 b0Var, c4.i iVar, int i10) {
        int i11 = b0Var.i(0, i10);
        int i12 = iVar.i(0, i10);
        int i13 = b0Var.f6220q + i12;
        while (i12 < i13) {
            long[] jArr = b0Var.W3;
            int i14 = i11 + 1;
            long j10 = jArr[i11];
            i11 = i14 + 1;
            iVar.V3[i12] = (j10 + jArr[i14]) / 2;
            i12++;
        }
    }

    public static /* synthetic */ void O(c4.b0 b0Var, c4.i iVar, int i10) {
        int i11 = b0Var.i(0, i10);
        int i12 = iVar.i(0, i10);
        int i13 = b0Var.f6220q + i12;
        while (i12 < i13) {
            long[] jArr = b0Var.W3;
            int i14 = i11 + 1;
            long j10 = jArr[i11];
            int i15 = i14 + 1;
            iVar.V3[i12] = ((j10 + jArr[i14]) + jArr[i15]) / 3;
            i12++;
            i11 = i15 + 1;
        }
    }

    public static /* synthetic */ void P(c4.b0 b0Var, c4.i iVar, int i10, int i11) {
        int i12 = 0;
        int i13 = b0Var.i(0, i11);
        int i14 = iVar.i(0, i11);
        while (i12 < b0Var.f6220q) {
            long j10 = 0;
            int i15 = i13 + i10;
            while (i13 < i15) {
                j10 += b0Var.W3[i13];
                i13++;
            }
            iVar.V3[i14] = j10 / i10;
            i12++;
            i14++;
        }
    }

    public static /* synthetic */ void Q(c4.u uVar, c4.a aVar, int i10) {
        int i11 = uVar.i(0, i10);
        int i12 = aVar.i(0, i10);
        int i13 = uVar.f6220q + i12;
        while (i12 < i13) {
            float[] fArr = uVar.W3;
            int i14 = i11 + 1;
            aVar.V3[i12] = (fArr[i11] + fArr[i14]) / 2.0f;
            i12++;
            i11 = i14 + 1;
        }
    }

    public static /* synthetic */ void R(c4.u uVar, c4.a aVar, int i10) {
        int i11 = uVar.i(0, i10);
        int i12 = aVar.i(0, i10);
        int i13 = uVar.f6220q + i12;
        while (i12 < i13) {
            float[] fArr = uVar.W3;
            int i14 = i11 + 1;
            int i15 = i14 + 1;
            float f10 = fArr[i11] + fArr[i14];
            aVar.V3[i12] = (f10 + fArr[i15]) / 3.0f;
            i11 = i15 + 1;
            i12++;
        }
    }

    public static /* synthetic */ void S(c4.e0 e0Var, c4.l lVar, int i10, int i11) {
        int i12 = e0Var.i(0, i11);
        int i13 = lVar.i(0, i11);
        int i14 = 0;
        while (i14 < e0Var.f6220q) {
            int i15 = i12 + i10;
            int i16 = 0;
            while (i12 < i15) {
                i16 += e0Var.W3[i12] & 255;
                i12++;
            }
            lVar.V3[i13] = (byte) (i16 / i10);
            i14++;
            i13++;
        }
    }

    public static /* synthetic */ void T(c4.u uVar, c4.a aVar, int i10, int i11) {
        int i12 = 0;
        int i13 = uVar.i(0, i11);
        int i14 = aVar.i(0, i11);
        while (i12 < uVar.f6220q) {
            float f10 = 0.0f;
            int i15 = i13 + i10;
            while (i13 < i15) {
                f10 += uVar.W3[i13];
                i13++;
            }
            aVar.V3[i14] = f10 / i10;
            i12++;
            i14++;
        }
    }

    public static /* synthetic */ void U(c4.v vVar, c4.b bVar, int i10) {
        int i11 = vVar.i(0, i10);
        int i12 = bVar.i(0, i10);
        int i13 = vVar.f6220q + i12;
        while (i12 < i13) {
            double[] dArr = vVar.W3;
            int i14 = i11 + 1;
            double d10 = dArr[i11];
            i11 = i14 + 1;
            bVar.V3[i12] = (d10 + dArr[i14]) / 2.0d;
            i12++;
        }
    }

    public static /* synthetic */ void V(c4.v vVar, c4.b bVar, int i10) {
        int i11 = vVar.i(0, i10);
        int i12 = bVar.i(0, i10);
        int i13 = vVar.f6220q + i12;
        while (i12 < i13) {
            double[] dArr = vVar.W3;
            int i14 = i11 + 1;
            double d10 = dArr[i11];
            int i15 = i14 + 1;
            bVar.V3[i12] = ((d10 + dArr[i14]) + dArr[i15]) / 3.0d;
            i12++;
            i11 = i15 + 1;
        }
    }

    public static /* synthetic */ void W(c4.v vVar, c4.b bVar, int i10, int i11) {
        int i12 = 0;
        int i13 = vVar.i(0, i11);
        int i14 = bVar.i(0, i11);
        while (i12 < vVar.f6220q) {
            double d10 = 0.0d;
            int i15 = i13 + i10;
            while (i13 < i15) {
                d10 += vVar.W3[i13];
                i13++;
            }
            bVar.V3[i14] = d10 / i10;
            i12++;
            i14++;
        }
    }

    public static /* synthetic */ void X(c4.c0 c0Var, c4.j jVar, int i10) {
        int i11 = c0Var.i(0, i10);
        int i12 = jVar.i(0, i10);
        int i13 = c0Var.f6220q + i12;
        while (i12 < i13) {
            byte[] bArr = c0Var.W3;
            int i14 = i11 + 1;
            jVar.V3[i12] = (byte) ((bArr[i11] + bArr[i14]) / 2);
            i12++;
            i11 = i14 + 1;
        }
    }

    public static /* synthetic */ void Y(c4.c0 c0Var, c4.j jVar, int i10) {
        int i11 = c0Var.i(0, i10);
        int i12 = jVar.i(0, i10);
        int i13 = c0Var.f6220q + i12;
        while (i12 < i13) {
            byte[] bArr = c0Var.W3;
            int i14 = i11 + 1;
            int i15 = i14 + 1;
            int i16 = bArr[i11] + bArr[i14];
            jVar.V3[i12] = (byte) ((i16 + bArr[i15]) / 3);
            i11 = i15 + 1;
            i12++;
        }
    }

    public static /* synthetic */ void Z(c4.c0 c0Var, c4.j jVar, int i10, int i11) {
        int i12 = c0Var.i(0, i11);
        int i13 = jVar.i(0, i11);
        int i14 = 0;
        while (i14 < c0Var.f6220q) {
            int i15 = i12 + i10;
            int i16 = 0;
            while (i12 < i15) {
                i16 += c0Var.W3[i12];
                i12++;
            }
            jVar.V3[i13] = (byte) (i16 / i10);
            i14++;
            i13++;
        }
    }

    public static /* synthetic */ void a0(c4.d0 d0Var, c4.k kVar, int i10) {
        int i11 = d0Var.i(0, i10);
        int i12 = kVar.i(0, i10);
        int i13 = d0Var.f6220q + i12;
        while (i12 < i13) {
            short[] sArr = d0Var.W3;
            int i14 = i11 + 1;
            kVar.V3[i12] = (short) (((sArr[i11] & 65535) + (sArr[i14] & 65535)) / 2);
            i12++;
            i11 = i14 + 1;
        }
    }

    public static /* synthetic */ void b0(c4.d0 d0Var, c4.k kVar, int i10) {
        int i11 = d0Var.i(0, i10);
        int i12 = kVar.i(0, i10);
        int i13 = d0Var.f6220q + i12;
        while (i12 < i13) {
            short[] sArr = d0Var.W3;
            int i14 = i11 + 1;
            int i15 = i14 + 1;
            kVar.V3[i12] = (short) ((((sArr[i11] & 65535) + (sArr[i14] & 65535)) + (sArr[i15] & 65535)) / 3);
            i11 = i15 + 1;
            i12++;
        }
    }

    public static /* synthetic */ void c0(c4.d0 d0Var, c4.k kVar, int i10, int i11) {
        int i12 = d0Var.i(0, i11);
        int i13 = kVar.i(0, i11);
        int i14 = 0;
        while (i14 < d0Var.f6220q) {
            int i15 = i12 + i10;
            int i16 = 0;
            while (i12 < i15) {
                i16 += d0Var.W3[i12] & 65535;
                i12++;
            }
            kVar.V3[i13] = (short) (i16 / i10);
            i14++;
            i13++;
        }
    }

    public static /* synthetic */ void d0(c4.z zVar, c4.g gVar, int i10) {
        int i11 = zVar.i(0, i10);
        int i12 = gVar.i(0, i10);
        int i13 = zVar.f6220q + i12;
        while (i12 < i13) {
            short[] sArr = zVar.W3;
            int i14 = i11 + 1;
            gVar.V3[i12] = (short) ((sArr[i11] + sArr[i14]) / 2);
            i12++;
            i11 = i14 + 1;
        }
    }

    public static void y(final c4.u uVar, final c4.a aVar) {
        int i10;
        IntConsumer intConsumer;
        final int N = uVar.N();
        if (N == 1) {
            for (int i11 = 0; i11 < uVar.f6221x; i11++) {
                System.arraycopy(uVar.W3, uVar.i(0, i11), aVar.V3, aVar.i(0, i11), uVar.f6220q);
            }
            return;
        }
        if (N == 2) {
            i10 = uVar.f6221x;
            intConsumer = new IntConsumer() { // from class: o3.m
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.Q(c4.u.this, aVar, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        } else if (N != 3) {
            ll.b.f(0, uVar.f6221x, new IntConsumer() { // from class: o3.r
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.T(c4.u.this, aVar, N, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            });
            return;
        } else {
            i10 = uVar.f6221x;
            intConsumer = new IntConsumer() { // from class: o3.b
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.R(c4.u.this, aVar, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        }
        ll.b.f(0, i10, intConsumer);
    }

    public static void z(final c4.v vVar, final c4.b bVar) {
        int i10;
        IntConsumer intConsumer;
        final int N = vVar.N();
        if (N == 1) {
            for (int i11 = 0; i11 < vVar.f6221x; i11++) {
                System.arraycopy(vVar.W3, vVar.i(0, i11), bVar.V3, bVar.i(0, i11), vVar.f6220q);
            }
            return;
        }
        if (N == 2) {
            i10 = vVar.f6221x;
            intConsumer = new IntConsumer() { // from class: o3.t
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.U(c4.v.this, bVar, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        } else if (N != 3) {
            ll.b.f(0, vVar.f6221x, new IntConsumer() { // from class: o3.u
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.W(c4.v.this, bVar, N, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            });
            return;
        } else {
            i10 = vVar.f6221x;
            intConsumer = new IntConsumer() { // from class: o3.s
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.V(c4.v.this, bVar, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        }
        ll.b.f(0, i10, intConsumer);
    }
}
