package r2;

import j$.util.function.IntConsumer;
import java.util.Objects;
/* loaded from: classes.dex */
public class z {
    public static /* synthetic */ void A(c4.k kVar, c4.l lVar, c4.k kVar2, float f10, int i10) {
        int i11 = kVar.f6218c + (kVar.f6219d * i10);
        int i12 = lVar.f6218c + (lVar.f6219d * i10);
        int i13 = kVar2.f6218c + (i10 * kVar2.f6219d);
        int i14 = kVar.f6220q + i11;
        while (i11 < i14) {
            if ((65535 & kVar.V3[i11]) <= (kVar2.V3[i13] & 65535) * f10) {
                lVar.V3[i12] = 1;
            } else {
                lVar.V3[i12] = 0;
            }
            i11++;
            i12++;
            i13++;
        }
    }

    public static /* synthetic */ void B(c4.k kVar, c4.l lVar, c4.k kVar2, float f10, int i10) {
        int i11 = kVar.f6218c + (kVar.f6219d * i10);
        int i12 = lVar.f6218c + (lVar.f6219d * i10);
        int i13 = kVar2.f6218c + (i10 * kVar2.f6219d);
        int i14 = kVar.f6220q + i11;
        while (i11 < i14) {
            if ((65535 & kVar.V3[i11]) * f10 > (kVar2.V3[i13] & 65535)) {
                lVar.V3[i12] = 1;
            } else {
                lVar.V3[i12] = 0;
            }
            i11++;
            i12++;
            i13++;
        }
    }

    public static /* synthetic */ void C(c4.a aVar, c4.l lVar, c4.a aVar2, float f10, int i10) {
        int i11 = aVar.f6218c + (aVar.f6219d * i10);
        int i12 = lVar.f6218c + (lVar.f6219d * i10);
        int i13 = aVar2.f6218c + (i10 * aVar2.f6219d);
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

    public static /* synthetic */ void D(c4.a aVar, c4.l lVar, c4.a aVar2, float f10, int i10) {
        int i11 = aVar.f6218c + (aVar.f6219d * i10);
        int i12 = lVar.f6218c + (lVar.f6219d * i10);
        int i13 = aVar2.f6218c + (i10 * aVar2.f6219d);
        int i14 = aVar.f6220q + i11;
        while (i11 < i14) {
            if (aVar.V3[i11] * f10 > aVar2.V3[i13]) {
                lVar.V3[i12] = 1;
            } else {
                lVar.V3[i12] = 0;
            }
            i11++;
            i12++;
            i13++;
        }
    }

    public static /* synthetic */ void E(c4.l lVar, c4.l lVar2, c4.l lVar3, float f10, int i10) {
        int i11 = lVar.f6218c + (lVar.f6219d * i10);
        int i12 = lVar2.f6218c + (lVar2.f6219d * i10);
        int i13 = lVar3.f6218c + (i10 * lVar3.f6219d);
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

    public static /* synthetic */ void F(c4.l lVar, c4.l lVar2, c4.l lVar3, float f10, int i10) {
        int i11 = lVar.f6218c + (lVar.f6219d * i10);
        int i12 = lVar2.f6218c + (lVar2.f6219d * i10);
        int i13 = lVar3.f6218c + (i10 * lVar3.f6219d);
        int i14 = lVar.f6220q + i11;
        while (i11 < i14) {
            int i15 = i13 + 1;
            int i16 = i12 + 1;
            int i17 = i11 + 1;
            lVar2.V3[i12] = ((float) (lVar.V3[i11] & 255)) * f10 > ((float) (lVar3.V3[i13] & 255)) ? (byte) 1 : (byte) 0;
            i13 = i15;
            i12 = i16;
            i11 = i17;
        }
    }

    public static /* synthetic */ void G(c4.k kVar, c4.l lVar, c4.k kVar2, float f10, int i10) {
        int i11 = kVar.f6218c + (kVar.f6219d * i10);
        int i12 = lVar.f6218c + (lVar.f6219d * i10);
        int i13 = kVar2.f6218c + (i10 * kVar2.f6219d);
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
    }

    public static /* synthetic */ void H(c4.k kVar, c4.l lVar, c4.k kVar2, float f10, int i10) {
        int i11 = kVar.f6218c + (kVar.f6219d * i10);
        int i12 = lVar.f6218c + (lVar.f6219d * i10);
        int i13 = kVar2.f6218c + (i10 * kVar2.f6219d);
        int i14 = kVar.f6220q + i11;
        while (i11 < i14) {
            int i15 = i13 + 1;
            int i16 = i12 + 1;
            int i17 = i11 + 1;
            lVar.V3[i12] = ((float) (kVar.V3[i11] & 65535)) * f10 > ((float) (kVar2.V3[i13] & 65535)) ? (byte) 1 : (byte) 0;
            i13 = i15;
            i12 = i16;
            i11 = i17;
        }
    }

    public static /* synthetic */ void I(c4.a aVar, c4.l lVar, c4.a aVar2, float f10, int i10) {
        int i11 = aVar.f6218c + (aVar.f6219d * i10);
        int i12 = lVar.f6218c + (lVar.f6219d * i10);
        int i13 = aVar2.f6218c + (i10 * aVar2.f6219d);
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

    public static /* synthetic */ void J(c4.a aVar, c4.l lVar, c4.a aVar2, float f10, int i10) {
        int i11 = aVar.f6218c + (aVar.f6219d * i10);
        int i12 = lVar.f6218c + (lVar.f6219d * i10);
        int i13 = aVar2.f6218c + (i10 * aVar2.f6219d);
        int i14 = aVar.f6220q + i11;
        while (i11 < i14) {
            int i15 = i13 + 1;
            int i16 = i12 + 1;
            int i17 = i11 + 1;
            lVar.V3[i12] = aVar.V3[i11] * f10 > aVar2.V3[i13] ? (byte) 1 : (byte) 0;
            i13 = i15;
            i12 = i16;
            i11 = i17;
        }
    }

    public static /* synthetic */ void K(c4.a aVar, c4.l lVar, float f10, int i10) {
        int i11 = aVar.f6218c + (aVar.f6219d * i10);
        int i12 = lVar.f6218c + (i10 * lVar.f6219d);
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

    public static /* synthetic */ void L(c4.a aVar, c4.l lVar, float f10, int i10) {
        int i11 = aVar.f6218c + (aVar.f6219d * i10);
        int i12 = lVar.f6218c + (i10 * lVar.f6219d);
        int i13 = aVar.f6220q;
        while (i13 > 0) {
            int i14 = i12 + 1;
            int i15 = i11 + 1;
            lVar.V3[i12] = (byte) (aVar.V3[i11] > f10 ? 1 : 0);
            i13--;
            i12 = i14;
            i11 = i15;
        }
    }

    public static /* synthetic */ void M(c4.h hVar, c4.l lVar, int i10, int i11) {
        int i12 = hVar.f6218c + (hVar.f6219d * i11);
        int i13 = lVar.f6218c + (i11 * lVar.f6219d);
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

    public static /* synthetic */ void N(c4.h hVar, c4.l lVar, int i10, int i11) {
        int i12 = hVar.f6218c + (hVar.f6219d * i11);
        int i13 = lVar.f6218c + (i11 * lVar.f6219d);
        int i14 = hVar.f6220q;
        while (i14 > 0) {
            int i15 = i13 + 1;
            int i16 = i12 + 1;
            lVar.V3[i13] = (byte) (hVar.V3[i12] > i10 ? 1 : 0);
            i14--;
            i13 = i15;
            i12 = i16;
        }
    }

    public static /* synthetic */ void O(c4.b bVar, c4.l lVar, double d10, int i10) {
        int i11 = bVar.f6218c + (bVar.f6219d * i10);
        int i12 = lVar.f6218c + (i10 * lVar.f6219d);
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

    public static /* synthetic */ void P(c4.b bVar, c4.l lVar, double d10, int i10) {
        int i11 = bVar.f6218c + (bVar.f6219d * i10);
        int i12 = lVar.f6218c + (i10 * lVar.f6219d);
        int i13 = bVar.f6220q;
        while (i13 > 0) {
            int i14 = i12 + 1;
            int i15 = i11 + 1;
            lVar.V3[i12] = (byte) (bVar.V3[i11] > d10 ? 1 : 0);
            i13--;
            i12 = i14;
            i11 = i15;
        }
    }

    public static /* synthetic */ void Q(c4.l lVar, c4.l lVar2, int i10, int i11) {
        int i12 = lVar.f6218c + (lVar.f6219d * i11);
        int i13 = lVar2.f6218c + (i11 * lVar2.f6219d);
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

    public static /* synthetic */ void R(c4.l lVar, c4.l lVar2, int i10, int i11) {
        int i12 = lVar.f6218c + (lVar.f6219d * i11);
        int i13 = lVar2.f6218c + (i11 * lVar2.f6219d);
        int i14 = lVar.f6220q;
        while (i14 > 0) {
            int i15 = i13 + 1;
            int i16 = i12 + 1;
            lVar2.V3[i13] = (byte) ((lVar.V3[i12] & 255) > i10 ? 1 : 0);
            i14--;
            i13 = i15;
            i12 = i16;
        }
    }

    public static /* synthetic */ void S(c4.g gVar, c4.l lVar, int i10, int i11) {
        int i12 = gVar.f6218c + (gVar.f6219d * i11);
        int i13 = lVar.f6218c + (i11 * lVar.f6219d);
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

    public static /* synthetic */ void T(c4.g gVar, c4.l lVar, int i10, int i11) {
        int i12 = gVar.f6218c + (gVar.f6219d * i11);
        int i13 = lVar.f6218c + (i11 * lVar.f6219d);
        int i14 = gVar.f6220q;
        while (i14 > 0) {
            int i15 = i13 + 1;
            int i16 = i12 + 1;
            lVar.V3[i13] = (byte) (gVar.V3[i12] > i10 ? 1 : 0);
            i14--;
            i13 = i15;
            i12 = i16;
        }
    }

    public static /* synthetic */ void U(c4.k kVar, c4.l lVar, int i10, int i11) {
        int i12 = kVar.f6218c + (kVar.f6219d * i11);
        int i13 = lVar.f6218c + (i11 * lVar.f6219d);
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

    public static /* synthetic */ void V(c4.k kVar, c4.l lVar, int i10, int i11) {
        int i12 = kVar.f6218c + (kVar.f6219d * i11);
        int i13 = lVar.f6218c + (i11 * lVar.f6219d);
        int i14 = kVar.f6220q;
        while (i14 > 0) {
            int i15 = i13 + 1;
            int i16 = i12 + 1;
            lVar.V3[i13] = (byte) ((kVar.V3[i12] & 65535) > i10 ? 1 : 0);
            i14--;
            i13 = i15;
            i12 = i16;
        }
    }

    public static c4.l W(final c4.a aVar, final c4.l lVar, x3.b bVar, final float f10, boolean z10, final c4.a aVar2, c4.a aVar3) {
        IntConsumer intConsumer;
        int i10;
        s2.b.b(aVar, aVar2, -1.0d, bVar.e(Math.min(aVar.f6220q, aVar.f6221x)) / 2, aVar3);
        if (z10) {
            i10 = aVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.u
                @Override // j$.util.function.IntConsumer
                public final void accept(int i11) {
                    z.C(c4.a.this, lVar, aVar2, f10, i11);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        } else {
            i10 = aVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.t
                @Override // j$.util.function.IntConsumer
                public final void accept(int i11) {
                    z.D(c4.a.this, lVar, aVar2, f10, i11);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        }
        ll.b.f(0, i10, intConsumer);
        return lVar;
    }

    public static c4.l X(final c4.k kVar, final c4.l lVar, x3.b bVar, final float f10, boolean z10, final c4.k kVar2, c4.k kVar3) {
        IntConsumer intConsumer;
        int i10;
        s2.b.d(kVar, kVar2, -1.0d, bVar.e(Math.min(kVar.f6220q, kVar.f6221x)) / 2, kVar3);
        if (z10) {
            i10 = kVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.i
                @Override // j$.util.function.IntConsumer
                public final void accept(int i11) {
                    z.A(c4.k.this, lVar, kVar2, f10, i11);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        } else {
            i10 = kVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.h
                @Override // j$.util.function.IntConsumer
                public final void accept(int i11) {
                    z.B(c4.k.this, lVar, kVar2, f10, i11);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        }
        ll.b.f(0, i10, intConsumer);
        return lVar;
    }

    public static c4.l Y(final c4.l lVar, final c4.l lVar2, x3.b bVar, final float f10, boolean z10, final c4.l lVar3, c4.l lVar4) {
        IntConsumer intConsumer;
        int i10;
        s2.b.f(lVar, lVar3, -1.0d, bVar.e(Math.min(lVar.f6220q, lVar.f6221x)) / 2, lVar4);
        if (z10) {
            i10 = lVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.q
                @Override // j$.util.function.IntConsumer
                public final void accept(int i11) {
                    z.y(c4.l.this, lVar2, lVar3, f10, i11);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        } else {
            i10 = lVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.p
                @Override // j$.util.function.IntConsumer
                public final void accept(int i11) {
                    z.z(c4.l.this, lVar2, lVar3, f10, i11);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        }
        ll.b.f(0, i10, intConsumer);
        return lVar2;
    }

    public static c4.l Z(final c4.a aVar, final c4.l lVar, x3.b bVar, final float f10, boolean z10, final c4.a aVar2, c4.a aVar3, ll.d<ok.e> dVar) {
        IntConsumer intConsumer;
        int i10;
        s2.b.h(aVar, aVar2, bVar.e(Math.min(aVar.f6220q, aVar.f6221x)) / 2, aVar3, dVar);
        if (z10) {
            i10 = aVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.r
                @Override // j$.util.function.IntConsumer
                public final void accept(int i11) {
                    z.I(c4.a.this, lVar, aVar2, f10, i11);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        } else {
            i10 = aVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.s
                @Override // j$.util.function.IntConsumer
                public final void accept(int i11) {
                    z.J(c4.a.this, lVar, aVar2, f10, i11);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        }
        ll.b.f(0, i10, intConsumer);
        return lVar;
    }

    public static c4.l a0(final c4.k kVar, final c4.l lVar, x3.b bVar, final float f10, boolean z10, final c4.k kVar2, c4.k kVar3, ll.d<ok.g> dVar) {
        IntConsumer intConsumer;
        int i10;
        s2.b.j(kVar, kVar2, bVar.e(Math.min(kVar.f6220q, kVar.f6221x)) / 2, kVar3, dVar);
        if (z10) {
            i10 = kVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.g
                @Override // j$.util.function.IntConsumer
                public final void accept(int i11) {
                    z.G(c4.k.this, lVar, kVar2, f10, i11);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        } else {
            i10 = kVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.j
                @Override // j$.util.function.IntConsumer
                public final void accept(int i11) {
                    z.H(c4.k.this, lVar, kVar2, f10, i11);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        }
        ll.b.f(0, i10, intConsumer);
        return lVar;
    }

    public static c4.l b0(final c4.l lVar, final c4.l lVar2, x3.b bVar, final float f10, boolean z10, final c4.l lVar3, c4.l lVar4, ll.d<ok.g> dVar) {
        IntConsumer intConsumer;
        int i10;
        s2.b.l(lVar, lVar3, bVar.e(Math.min(lVar.f6220q, lVar.f6221x)) / 2, lVar4, dVar);
        if (z10) {
            i10 = lVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.o
                @Override // j$.util.function.IntConsumer
                public final void accept(int i11) {
                    z.E(c4.l.this, lVar2, lVar3, f10, i11);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        } else {
            i10 = lVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.n
                @Override // j$.util.function.IntConsumer
                public final void accept(int i11) {
                    z.F(c4.l.this, lVar2, lVar3, f10, i11);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        }
        ll.b.f(0, i10, intConsumer);
        return lVar2;
    }

    public static c4.l c0(final c4.a aVar, final c4.l lVar, final float f10, boolean z10) {
        int i10;
        IntConsumer intConsumer;
        if (z10) {
            i10 = aVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.m
                @Override // j$.util.function.IntConsumer
                public final void accept(int i11) {
                    z.K(c4.a.this, lVar, f10, i11);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        } else {
            i10 = aVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.b
                @Override // j$.util.function.IntConsumer
                public final void accept(int i11) {
                    z.L(c4.a.this, lVar, f10, i11);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        }
        ll.b.f(0, i10, intConsumer);
        return lVar;
    }

    public static c4.l d0(final c4.b bVar, final c4.l lVar, final double d10, boolean z10) {
        int i10;
        IntConsumer intConsumer;
        if (z10) {
            i10 = bVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.w
                @Override // j$.util.function.IntConsumer
                public final void accept(int i11) {
                    z.O(c4.b.this, lVar, d10, i11);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        } else {
            i10 = bVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.v
                @Override // j$.util.function.IntConsumer
                public final void accept(int i11) {
                    z.P(c4.b.this, lVar, d10, i11);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        }
        ll.b.f(0, i10, intConsumer);
        return lVar;
    }

    public static c4.l e0(final c4.g gVar, final c4.l lVar, final int i10, boolean z10) {
        int i11;
        IntConsumer intConsumer;
        if (z10) {
            i11 = gVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.x
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.S(c4.g.this, lVar, i10, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        } else {
            i11 = gVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.y
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.T(c4.g.this, lVar, i10, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        }
        ll.b.f(0, i11, intConsumer);
        return lVar;
    }

    public static c4.l f0(final c4.h hVar, final c4.l lVar, final int i10, boolean z10) {
        int i11;
        IntConsumer intConsumer;
        if (z10) {
            i11 = hVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.c
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.M(c4.h.this, lVar, i10, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        } else {
            i11 = hVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.d
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.N(c4.h.this, lVar, i10, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        }
        ll.b.f(0, i11, intConsumer);
        return lVar;
    }

    public static c4.l g0(final c4.k kVar, final c4.l lVar, final int i10, boolean z10) {
        int i11;
        IntConsumer intConsumer;
        if (z10) {
            i11 = kVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.f
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.U(c4.k.this, lVar, i10, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        } else {
            i11 = kVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.e
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.V(c4.k.this, lVar, i10, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        }
        ll.b.f(0, i11, intConsumer);
        return lVar;
    }

    public static c4.l h0(final c4.l lVar, final c4.l lVar2, final int i10, boolean z10) {
        int i11;
        IntConsumer intConsumer;
        if (z10) {
            i11 = lVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.l
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.Q(c4.l.this, lVar2, i10, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        } else {
            i11 = lVar.f6221x;
            intConsumer = new IntConsumer() { // from class: r2.k
                @Override // j$.util.function.IntConsumer
                public final void accept(int i12) {
                    z.R(c4.l.this, lVar2, i10, i12);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        }
        ll.b.f(0, i11, intConsumer);
        return lVar2;
    }

    public static /* synthetic */ void y(c4.l lVar, c4.l lVar2, c4.l lVar3, float f10, int i10) {
        int i11 = lVar.f6218c + (lVar.f6219d * i10);
        int i12 = lVar2.f6218c + (lVar2.f6219d * i10);
        int i13 = lVar3.f6218c + (i10 * lVar3.f6219d);
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

    public static /* synthetic */ void z(c4.l lVar, c4.l lVar2, c4.l lVar3, float f10, int i10) {
        int i11 = lVar.f6218c + (lVar.f6219d * i10);
        int i12 = lVar2.f6218c + (lVar2.f6219d * i10);
        int i13 = lVar3.f6218c + (i10 * lVar3.f6219d);
        int i14 = lVar.f6220q + i11;
        while (i11 < i14) {
            if ((lVar.V3[i11] & 255) * f10 > (lVar3.V3[i13] & 255)) {
                lVar2.V3[i12] = 1;
            } else {
                lVar2.V3[i12] = 0;
            }
            i11++;
            i12++;
            i13++;
        }
    }
}
