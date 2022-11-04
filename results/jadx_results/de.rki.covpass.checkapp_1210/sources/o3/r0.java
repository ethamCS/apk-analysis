package o3;

import j$.util.function.IntConsumer;
import java.util.Objects;
/* loaded from: classes.dex */
public class r0 {
    public static /* synthetic */ void A(c4.f0 f0Var, c4.i iVar, c4.i iVar2, c4.i iVar3, c4.i iVar4, int i10) {
        int i11 = 0;
        int i12 = f0Var.i(0, i10);
        int i13 = iVar.i(0, i10);
        while (i11 < f0Var.f6220q) {
            iVar.V3[i13] = ((iVar2.V3[i12] + iVar3.V3[i12]) + iVar4.V3[i12]) / 3;
            i11++;
            i12++;
            i13++;
        }
    }

    public static /* synthetic */ void B(c4.f0 f0Var, c4.i iVar, int i10, int i11) {
        int i12 = f0Var.i(0, i11);
        int i13 = iVar.i(0, i11);
        int i14 = 0;
        while (i14 < f0Var.f6220q) {
            long j10 = 0;
            for (int i15 = 0; i15 < i10; i15++) {
                j10 += ((c4.i[]) f0Var.W3)[i15].V3[i12];
            }
            iVar.V3[i13] = j10 / i10;
            i14++;
            i12++;
            i13++;
        }
    }

    public static /* synthetic */ void C(c4.f0 f0Var, c4.a aVar, c4.a aVar2, c4.a aVar3, c4.a aVar4, int i10) {
        int i11 = 0;
        int i12 = f0Var.i(0, i10);
        int i13 = aVar.i(0, i10);
        while (i11 < f0Var.f6220q) {
            aVar.V3[i13] = ((aVar2.V3[i12] + aVar3.V3[i12]) + aVar4.V3[i12]) / 3.0f;
            i11++;
            i12++;
            i13++;
        }
    }

    public static /* synthetic */ void D(c4.f0 f0Var, c4.a aVar, int i10, int i11) {
        int i12 = f0Var.i(0, i11);
        int i13 = aVar.i(0, i11);
        int i14 = 0;
        while (i14 < f0Var.f6220q) {
            float f10 = 0.0f;
            for (int i15 = 0; i15 < i10; i15++) {
                f10 += ((c4.a[]) f0Var.W3)[i15].V3[i12];
            }
            aVar.V3[i13] = f10 / i10;
            i14++;
            i12++;
            i13++;
        }
    }

    public static /* synthetic */ void E(c4.f0 f0Var, c4.b bVar, c4.b bVar2, c4.b bVar3, c4.b bVar4, int i10) {
        int i11 = 0;
        int i12 = f0Var.i(0, i10);
        int i13 = bVar.i(0, i10);
        while (i11 < f0Var.f6220q) {
            bVar.V3[i13] = ((bVar2.V3[i12] + bVar3.V3[i12]) + bVar4.V3[i12]) / 3.0d;
            i11++;
            i12++;
            i13++;
        }
    }

    public static /* synthetic */ void F(c4.f0 f0Var, c4.b bVar, int i10, int i11) {
        int i12 = f0Var.i(0, i11);
        int i13 = bVar.i(0, i11);
        int i14 = 0;
        while (i14 < f0Var.f6220q) {
            double d10 = 0.0d;
            for (int i15 = 0; i15 < i10; i15++) {
                d10 += ((c4.b[]) f0Var.W3)[i15].V3[i12];
            }
            bVar.V3[i13] = d10 / i10;
            i14++;
            i12++;
            i13++;
        }
    }

    public static /* synthetic */ void G(c4.f0 f0Var, c4.j jVar, c4.j jVar2, c4.j jVar3, c4.j jVar4, int i10) {
        int i11 = 0;
        int i12 = f0Var.i(0, i10);
        int i13 = jVar.i(0, i10);
        while (i11 < f0Var.f6220q) {
            jVar.V3[i13] = (byte) (((jVar2.V3[i12] + jVar3.V3[i12]) + jVar4.V3[i12]) / 3);
            i11++;
            i12++;
            i13++;
        }
    }

    public static /* synthetic */ void H(c4.f0 f0Var, c4.j jVar, int i10, int i11) {
        int i12 = f0Var.i(0, i11);
        int i13 = jVar.i(0, i11);
        int i14 = 0;
        while (i14 < f0Var.f6220q) {
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                i15 += ((c4.j[]) f0Var.W3)[i16].V3[i12];
            }
            jVar.V3[i13] = (byte) (i15 / i10);
            i14++;
            i12++;
            i13++;
        }
    }

    public static /* synthetic */ void I(c4.f0 f0Var, c4.k kVar, c4.k kVar2, c4.k kVar3, c4.k kVar4, int i10) {
        int i11 = 0;
        int i12 = f0Var.i(0, i10);
        int i13 = kVar.i(0, i10);
        while (i11 < f0Var.f6220q) {
            kVar.V3[i13] = (short) ((((kVar2.V3[i12] & 65535) + (kVar3.V3[i12] & 65535)) + (65535 & kVar4.V3[i12])) / 3);
            i11++;
            i12++;
            i13++;
        }
    }

    public static /* synthetic */ void J(c4.f0 f0Var, c4.k kVar, int i10, int i11) {
        int i12 = f0Var.i(0, i11);
        int i13 = kVar.i(0, i11);
        int i14 = 0;
        while (i14 < f0Var.f6220q) {
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                i15 += ((c4.k[]) f0Var.W3)[i16].V3[i12] & 65535;
            }
            kVar.V3[i13] = (short) (i15 / i10);
            i14++;
            i12++;
            i13++;
        }
    }

    public static /* synthetic */ void K(c4.f0 f0Var, c4.g gVar, c4.g gVar2, c4.g gVar3, c4.g gVar4, int i10) {
        int i11 = 0;
        int i12 = f0Var.i(0, i10);
        int i13 = gVar.i(0, i10);
        while (i11 < f0Var.f6220q) {
            gVar.V3[i13] = (short) (((gVar2.V3[i12] + gVar3.V3[i12]) + gVar4.V3[i12]) / 3);
            i11++;
            i12++;
            i13++;
        }
    }

    public static /* synthetic */ void L(c4.f0 f0Var, c4.g gVar, int i10, int i11) {
        int i12 = f0Var.i(0, i11);
        int i13 = gVar.i(0, i11);
        int i14 = 0;
        while (i14 < f0Var.f6220q) {
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                i15 += ((c4.g[]) f0Var.W3)[i16].V3[i12];
            }
            gVar.V3[i13] = (short) (i15 / i10);
            i14++;
            i12++;
            i13++;
        }
    }

    public static /* synthetic */ void M(c4.f0 f0Var, c4.h hVar, c4.h hVar2, c4.h hVar3, c4.h hVar4, int i10) {
        int i11 = 0;
        int i12 = f0Var.i(0, i10);
        int i13 = hVar.i(0, i10);
        while (i11 < f0Var.f6220q) {
            hVar.V3[i13] = ((hVar2.V3[i12] + hVar3.V3[i12]) + hVar4.V3[i12]) / 3;
            i11++;
            i12++;
            i13++;
        }
    }

    public static /* synthetic */ void N(c4.f0 f0Var, c4.h hVar, int i10, int i11) {
        int i12 = f0Var.i(0, i11);
        int i13 = hVar.i(0, i11);
        int i14 = 0;
        while (i14 < f0Var.f6220q) {
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                i15 += ((c4.h[]) f0Var.W3)[i16].V3[i12];
            }
            hVar.V3[i13] = i15 / i10;
            i14++;
            i12++;
            i13++;
        }
    }

    public static void q(final c4.f0<c4.a> f0Var, final c4.a aVar) {
        final int M = f0Var.M();
        if (M == 1) {
            aVar.y(f0Var.B(0));
        } else if (M != 3) {
            ll.b.f(0, f0Var.f6221x, new IntConsumer() { // from class: o3.b0
                @Override // j$.util.function.IntConsumer
                public final void accept(int i10) {
                    r0.D(c4.f0.this, aVar, M, i10);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return Objects.requireNonNull(intConsumer);
                }
            });
        } else {
            final c4.a B = f0Var.B(0);
            final c4.a B2 = f0Var.B(1);
            final c4.a B3 = f0Var.B(2);
            ll.b.f(0, f0Var.f6221x, new IntConsumer() { // from class: o3.i0
                @Override // j$.util.function.IntConsumer
                public final void accept(int i10) {
                    r0.C(c4.f0.this, aVar, B, B2, B3, i10);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return Objects.requireNonNull(intConsumer);
                }
            });
        }
    }

    public static void r(final c4.f0<c4.b> f0Var, final c4.b bVar) {
        final int M = f0Var.M();
        if (M == 1) {
            bVar.y(f0Var.B(0));
        } else if (M != 3) {
            ll.b.f(0, f0Var.f6221x, new IntConsumer() { // from class: o3.j0
                @Override // j$.util.function.IntConsumer
                public final void accept(int i10) {
                    r0.F(c4.f0.this, bVar, M, i10);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return Objects.requireNonNull(intConsumer);
                }
            });
        } else {
            final c4.b B = f0Var.B(0);
            final c4.b B2 = f0Var.B(1);
            final c4.b B3 = f0Var.B(2);
            ll.b.f(0, f0Var.f6221x, new IntConsumer() { // from class: o3.k0
                @Override // j$.util.function.IntConsumer
                public final void accept(int i10) {
                    r0.E(c4.f0.this, bVar, B, B2, B3, i10);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return Objects.requireNonNull(intConsumer);
                }
            });
        }
    }

    public static void s(final c4.f0<c4.g> f0Var, final c4.g gVar) {
        final int M = f0Var.M();
        if (M == 1) {
            gVar.y(f0Var.B(0));
        } else if (M != 3) {
            ll.b.f(0, f0Var.f6221x, new IntConsumer() { // from class: o3.l0
                @Override // j$.util.function.IntConsumer
                public final void accept(int i10) {
                    r0.L(c4.f0.this, gVar, M, i10);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return Objects.requireNonNull(intConsumer);
                }
            });
        } else {
            final c4.g B = f0Var.B(0);
            final c4.g B2 = f0Var.B(1);
            final c4.g B3 = f0Var.B(2);
            ll.b.f(0, f0Var.f6221x, new IntConsumer() { // from class: o3.m0
                @Override // j$.util.function.IntConsumer
                public final void accept(int i10) {
                    r0.K(c4.f0.this, gVar, B, B2, B3, i10);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return Objects.requireNonNull(intConsumer);
                }
            });
        }
    }

    public static void t(final c4.f0<c4.h> f0Var, final c4.h hVar) {
        final int M = f0Var.M();
        if (M == 1) {
            hVar.y(f0Var.B(0));
        } else if (M != 3) {
            ll.b.f(0, f0Var.f6221x, new IntConsumer() { // from class: o3.n0
                @Override // j$.util.function.IntConsumer
                public final void accept(int i10) {
                    r0.N(c4.f0.this, hVar, M, i10);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return Objects.requireNonNull(intConsumer);
                }
            });
        } else {
            final c4.h B = f0Var.B(0);
            final c4.h B2 = f0Var.B(1);
            final c4.h B3 = f0Var.B(2);
            ll.b.f(0, f0Var.f6221x, new IntConsumer() { // from class: o3.o0
                @Override // j$.util.function.IntConsumer
                public final void accept(int i10) {
                    r0.M(c4.f0.this, hVar, B, B2, B3, i10);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return Objects.requireNonNull(intConsumer);
                }
            });
        }
    }

    public static void u(final c4.f0<c4.i> f0Var, final c4.i iVar) {
        final int M = f0Var.M();
        if (M == 1) {
            iVar.y(f0Var.B(0));
        } else if (M != 3) {
            ll.b.f(0, f0Var.f6221x, new IntConsumer() { // from class: o3.p0
                @Override // j$.util.function.IntConsumer
                public final void accept(int i10) {
                    r0.B(c4.f0.this, iVar, M, i10);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return Objects.requireNonNull(intConsumer);
                }
            });
        } else {
            final c4.i B = f0Var.B(0);
            final c4.i B2 = f0Var.B(1);
            final c4.i B3 = f0Var.B(2);
            ll.b.f(0, f0Var.f6221x, new IntConsumer() { // from class: o3.q0
                @Override // j$.util.function.IntConsumer
                public final void accept(int i10) {
                    r0.A(c4.f0.this, iVar, B, B2, B3, i10);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return Objects.requireNonNull(intConsumer);
                }
            });
        }
    }

    public static void v(final c4.f0<c4.j> f0Var, final c4.j jVar) {
        final int M = f0Var.M();
        if (M == 1) {
            jVar.y(f0Var.B(0));
        } else if (M != 3) {
            ll.b.f(0, f0Var.f6221x, new IntConsumer() { // from class: o3.c0
                @Override // j$.util.function.IntConsumer
                public final void accept(int i10) {
                    r0.H(c4.f0.this, jVar, M, i10);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return Objects.requireNonNull(intConsumer);
                }
            });
        } else {
            final c4.j B = f0Var.B(0);
            final c4.j B2 = f0Var.B(1);
            final c4.j B3 = f0Var.B(2);
            ll.b.f(0, f0Var.f6221x, new IntConsumer() { // from class: o3.d0
                @Override // j$.util.function.IntConsumer
                public final void accept(int i10) {
                    r0.G(c4.f0.this, jVar, B, B2, B3, i10);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return Objects.requireNonNull(intConsumer);
                }
            });
        }
    }

    public static void w(final c4.f0<c4.k> f0Var, final c4.k kVar) {
        final int M = f0Var.M();
        if (M == 1) {
            kVar.y(f0Var.B(0));
        } else if (M != 3) {
            ll.b.f(0, f0Var.f6221x, new IntConsumer() { // from class: o3.e0
                @Override // j$.util.function.IntConsumer
                public final void accept(int i10) {
                    r0.J(c4.f0.this, kVar, M, i10);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return Objects.requireNonNull(intConsumer);
                }
            });
        } else {
            final c4.k B = f0Var.B(0);
            final c4.k B2 = f0Var.B(1);
            final c4.k B3 = f0Var.B(2);
            ll.b.f(0, f0Var.f6221x, new IntConsumer() { // from class: o3.f0
                @Override // j$.util.function.IntConsumer
                public final void accept(int i10) {
                    r0.I(c4.f0.this, kVar, B, B2, B3, i10);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return Objects.requireNonNull(intConsumer);
                }
            });
        }
    }

    public static void x(final c4.f0<c4.l> f0Var, final c4.l lVar) {
        final int M = f0Var.M();
        if (M == 1) {
            lVar.y(f0Var.B(0));
        } else if (M != 3) {
            ll.b.f(0, f0Var.f6221x, new IntConsumer() { // from class: o3.g0
                @Override // j$.util.function.IntConsumer
                public final void accept(int i10) {
                    r0.z(c4.f0.this, lVar, M, i10);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return Objects.requireNonNull(intConsumer);
                }
            });
        } else {
            final c4.l B = f0Var.B(0);
            final c4.l B2 = f0Var.B(1);
            final c4.l B3 = f0Var.B(2);
            ll.b.f(0, f0Var.f6221x, new IntConsumer() { // from class: o3.h0
                @Override // j$.util.function.IntConsumer
                public final void accept(int i10) {
                    r0.y(c4.f0.this, lVar, B, B2, B3, i10);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return Objects.requireNonNull(intConsumer);
                }
            });
        }
    }

    public static /* synthetic */ void y(c4.f0 f0Var, c4.l lVar, c4.l lVar2, c4.l lVar3, c4.l lVar4, int i10) {
        int i11 = 0;
        int i12 = f0Var.i(0, i10);
        int i13 = lVar.i(0, i10);
        while (i11 < f0Var.f6220q) {
            lVar.V3[i13] = (byte) ((((lVar2.V3[i12] & 255) + (lVar3.V3[i12] & 255)) + (lVar4.V3[i12] & 255)) / 3);
            i11++;
            i12++;
            i13++;
        }
    }

    public static /* synthetic */ void z(c4.f0 f0Var, c4.l lVar, int i10, int i11) {
        int i12 = f0Var.i(0, i11);
        int i13 = lVar.i(0, i11);
        int i14 = 0;
        while (i14 < f0Var.f6220q) {
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                i15 += ((c4.l[]) f0Var.W3)[i16].V3[i12] & 255;
            }
            lVar.V3[i13] = (byte) (i15 / i10);
            i14++;
            i12++;
            i13++;
        }
    }
}
