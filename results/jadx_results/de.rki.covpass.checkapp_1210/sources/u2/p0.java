package u2;

import j$.util.function.IntConsumer;
import java.util.Objects;
/* loaded from: classes.dex */
public class p0 {
    public static boolean A(z3.d dVar, c4.l lVar, c4.e eVar, int i10, ll.d<ok.g> dVar2) {
        int i11 = dVar.f26454b;
        int i12 = dVar.f26453a;
        if (i11 != i12 / 2 || i12 % 2 == 0) {
            return false;
        }
        if (i12 == 3) {
            C(dVar, lVar, eVar, i10, dVar2);
            return true;
        } else if (i12 == 5) {
            D(dVar, lVar, eVar, i10, dVar2);
            return true;
        } else if (i12 == 7) {
            E(dVar, lVar, eVar, i10, dVar2);
            return true;
        } else if (i12 == 9) {
            F(dVar, lVar, eVar, i10, dVar2);
            return true;
        } else if (i12 != 11) {
            return false;
        } else {
            B(dVar, lVar, eVar, i10, dVar2);
            return true;
        }
    }

    public static void B(z3.d dVar, final c4.l lVar, final c4.e eVar, final int i10, ll.d<ok.g> dVar2) {
        final byte[] bArr = lVar.V3;
        final byte[] bArr2 = eVar.V3;
        int[] iArr = dVar.f26449c;
        final int i11 = iArr[0];
        final int i12 = iArr[1];
        final int i13 = iArr[2];
        final int i14 = iArr[3];
        final int i15 = iArr[4];
        final int i16 = iArr[5];
        final int i17 = iArr[6];
        final int i18 = iArr[7];
        final int i19 = iArr[8];
        final int i20 = iArr[9];
        final int i21 = iArr[10];
        final int b10 = dVar.b();
        final int p10 = eVar.p();
        final int i22 = i10 / 2;
        ll.b.f(b10, eVar.g() - b10, new IntConsumer() { // from class: u2.k0
            @Override // j$.util.function.IntConsumer
            public final void accept(int i23) {
                p0.v(c4.e.this, lVar, b10, p10, bArr, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, bArr2, i22, i10, i23);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void C(z3.d dVar, final c4.l lVar, final c4.e eVar, final int i10, ll.d<ok.g> dVar2) {
        final byte[] bArr = lVar.V3;
        final byte[] bArr2 = eVar.V3;
        int[] iArr = dVar.f26449c;
        final int i11 = iArr[0];
        final int i12 = iArr[1];
        final int i13 = iArr[2];
        final int b10 = dVar.b();
        final int p10 = eVar.p();
        final int i14 = i10 / 2;
        ll.b.f(b10, eVar.g() - b10, new IntConsumer() { // from class: u2.o0
            @Override // j$.util.function.IntConsumer
            public final void accept(int i15) {
                p0.w(c4.e.this, lVar, b10, p10, bArr, i11, i12, i13, bArr2, i14, i10, i15);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void D(z3.d dVar, final c4.l lVar, final c4.e eVar, final int i10, ll.d<ok.g> dVar2) {
        final byte[] bArr = lVar.V3;
        final byte[] bArr2 = eVar.V3;
        int[] iArr = dVar.f26449c;
        final int i11 = iArr[0];
        final int i12 = iArr[1];
        final int i13 = iArr[2];
        final int i14 = iArr[3];
        final int i15 = iArr[4];
        final int b10 = dVar.b();
        final int p10 = eVar.p();
        final int i16 = i10 / 2;
        ll.b.f(b10, eVar.g() - b10, new IntConsumer() { // from class: u2.n0
            @Override // j$.util.function.IntConsumer
            public final void accept(int i17) {
                p0.x(c4.e.this, lVar, b10, p10, bArr, i11, i12, i13, i14, i15, bArr2, i16, i10, i17);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void E(z3.d dVar, final c4.l lVar, final c4.e eVar, final int i10, ll.d<ok.g> dVar2) {
        final byte[] bArr = lVar.V3;
        final byte[] bArr2 = eVar.V3;
        int[] iArr = dVar.f26449c;
        final int i11 = iArr[0];
        final int i12 = iArr[1];
        final int i13 = iArr[2];
        final int i14 = iArr[3];
        final int i15 = iArr[4];
        final int i16 = iArr[5];
        final int i17 = iArr[6];
        final int b10 = dVar.b();
        final int p10 = eVar.p();
        final int i18 = i10 / 2;
        ll.b.f(b10, eVar.g() - b10, new IntConsumer() { // from class: u2.m0
            @Override // j$.util.function.IntConsumer
            public final void accept(int i19) {
                p0.y(c4.e.this, lVar, b10, p10, bArr, i11, i12, i13, i14, i15, i16, i17, bArr2, i18, i10, i19);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void F(z3.d dVar, final c4.l lVar, final c4.e eVar, final int i10, ll.d<ok.g> dVar2) {
        final byte[] bArr = lVar.V3;
        final byte[] bArr2 = eVar.V3;
        int[] iArr = dVar.f26449c;
        final int i11 = iArr[0];
        final int i12 = iArr[1];
        final int i13 = iArr[2];
        final int i14 = iArr[3];
        final int i15 = iArr[4];
        final int i16 = iArr[5];
        final int i17 = iArr[6];
        final int i18 = iArr[7];
        final int i19 = iArr[8];
        final int b10 = dVar.b();
        final int p10 = eVar.p();
        final int i20 = i10 / 2;
        ll.b.f(b10, eVar.g() - b10, new IntConsumer() { // from class: u2.l0
            @Override // j$.util.function.IntConsumer
            public final void accept(int i21) {
                p0.z(c4.e.this, lVar, b10, p10, bArr, i11, i12, i13, i14, i15, i16, i17, i18, i19, bArr2, i20, i10, i21);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static boolean k(z3.d dVar, c4.l lVar, c4.e eVar, int i10) {
        int i11 = dVar.f26454b;
        int i12 = dVar.f26453a;
        if (i11 != i12 / 2 || i12 % 2 == 0) {
            return false;
        }
        if (i12 == 3) {
            m(dVar, lVar, eVar, i10);
            return true;
        } else if (i12 == 5) {
            n(dVar, lVar, eVar, i10);
            return true;
        } else if (i12 == 7) {
            o(dVar, lVar, eVar, i10);
            return true;
        } else if (i12 == 9) {
            p(dVar, lVar, eVar, i10);
            return true;
        } else if (i12 != 11) {
            return false;
        } else {
            l(dVar, lVar, eVar, i10);
            return true;
        }
    }

    public static void l(z3.d dVar, final c4.l lVar, final c4.e eVar, final int i10) {
        final byte[] bArr = lVar.V3;
        final byte[] bArr2 = eVar.V3;
        int[] iArr = dVar.f26449c;
        final int i11 = iArr[0];
        final int i12 = iArr[1];
        final int i13 = iArr[2];
        final int i14 = iArr[3];
        final int i15 = iArr[4];
        final int i16 = iArr[5];
        final int i17 = iArr[6];
        final int i18 = iArr[7];
        final int i19 = iArr[8];
        final int i20 = iArr[9];
        final int i21 = iArr[10];
        final int b10 = dVar.b();
        final int p10 = lVar.p();
        final int i22 = i10 / 2;
        ll.b.f(0, lVar.f6221x, new IntConsumer() { // from class: u2.f0
            @Override // j$.util.function.IntConsumer
            public final void accept(int i23) {
                p0.q(c4.e.this, b10, lVar, p10, bArr, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, bArr2, i22, i10, i23);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void m(z3.d dVar, final c4.l lVar, final c4.e eVar, final int i10) {
        final byte[] bArr = lVar.V3;
        final byte[] bArr2 = eVar.V3;
        int[] iArr = dVar.f26449c;
        final int i11 = iArr[0];
        final int i12 = iArr[1];
        final int i13 = iArr[2];
        final int b10 = dVar.b();
        final int p10 = lVar.p();
        final int i14 = i10 / 2;
        ll.b.f(0, lVar.f6221x, new IntConsumer() { // from class: u2.j0
            @Override // j$.util.function.IntConsumer
            public final void accept(int i15) {
                p0.r(c4.e.this, b10, lVar, p10, bArr, i11, i12, i13, bArr2, i14, i10, i15);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void n(z3.d dVar, final c4.l lVar, final c4.e eVar, final int i10) {
        final byte[] bArr = lVar.V3;
        final byte[] bArr2 = eVar.V3;
        int[] iArr = dVar.f26449c;
        final int i11 = iArr[0];
        final int i12 = iArr[1];
        final int i13 = iArr[2];
        final int i14 = iArr[3];
        final int i15 = iArr[4];
        final int b10 = dVar.b();
        final int p10 = lVar.p();
        final int i16 = i10 / 2;
        ll.b.f(0, lVar.f6221x, new IntConsumer() { // from class: u2.i0
            @Override // j$.util.function.IntConsumer
            public final void accept(int i17) {
                p0.s(c4.e.this, b10, lVar, p10, bArr, i11, i12, i13, i14, i15, bArr2, i16, i10, i17);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void o(z3.d dVar, final c4.l lVar, final c4.e eVar, final int i10) {
        final byte[] bArr = lVar.V3;
        final byte[] bArr2 = eVar.V3;
        int[] iArr = dVar.f26449c;
        final int i11 = iArr[0];
        final int i12 = iArr[1];
        final int i13 = iArr[2];
        final int i14 = iArr[3];
        final int i15 = iArr[4];
        final int i16 = iArr[5];
        final int i17 = iArr[6];
        final int b10 = dVar.b();
        final int p10 = lVar.p();
        final int i18 = i10 / 2;
        ll.b.f(0, lVar.f6221x, new IntConsumer() { // from class: u2.h0
            @Override // j$.util.function.IntConsumer
            public final void accept(int i19) {
                p0.t(c4.e.this, b10, lVar, p10, bArr, i11, i12, i13, i14, i15, i16, i17, bArr2, i18, i10, i19);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void p(z3.d dVar, final c4.l lVar, final c4.e eVar, final int i10) {
        final byte[] bArr = lVar.V3;
        final byte[] bArr2 = eVar.V3;
        int[] iArr = dVar.f26449c;
        final int i11 = iArr[0];
        final int i12 = iArr[1];
        final int i13 = iArr[2];
        final int i14 = iArr[3];
        final int i15 = iArr[4];
        final int i16 = iArr[5];
        final int i17 = iArr[6];
        final int i18 = iArr[7];
        final int i19 = iArr[8];
        final int b10 = dVar.b();
        final int p10 = lVar.p();
        final int i20 = i10 / 2;
        ll.b.f(0, lVar.f6221x, new IntConsumer() { // from class: u2.g0
            @Override // j$.util.function.IntConsumer
            public final void accept(int i21) {
                p0.u(c4.e.this, b10, lVar, p10, bArr, i11, i12, i13, i14, i15, i16, i17, i18, i19, bArr2, i20, i10, i21);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static /* synthetic */ void q(c4.e eVar, int i10, c4.l lVar, int i11, byte[] bArr, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, byte[] bArr2, int i23, int i24, int i25) {
        int i26 = eVar.f6218c + (eVar.f6219d * i25) + i10;
        int i27 = (lVar.f6218c + (lVar.f6219d * i25)) - i10;
        int i28 = (i27 + i11) - i10;
        int i29 = i27 + i10;
        while (i29 < i28) {
            int i30 = i29 + 1;
            int i31 = i30 + 1;
            int i32 = i31 + 1;
            int i33 = ((bArr[i29] & 255) * i12) + ((bArr[i30] & 255) * i13) + ((bArr[i31] & 255) * i14);
            int i34 = i32 + 1;
            int i35 = i33 + ((bArr[i32] & 255) * i15);
            int i36 = i34 + 1;
            int i37 = i35 + ((bArr[i34] & 255) * i16);
            int i38 = i36 + 1;
            int i39 = i37 + ((bArr[i36] & 255) * i17);
            int i40 = i38 + 1;
            int i41 = i39 + ((bArr[i38] & 255) * i18);
            int i42 = i40 + 1;
            int i43 = i41 + ((bArr[i40] & 255) * i19);
            int i44 = i42 + 1;
            bArr2[i26] = (byte) (((((i43 + ((bArr[i42] & 255) * i20)) + ((bArr[i44] & 255) * i21)) + ((bArr[i44 + 1] & 255) * i22)) + i23) / i24);
            i29 = i30;
            i26++;
        }
    }

    public static /* synthetic */ void r(c4.e eVar, int i10, c4.l lVar, int i11, byte[] bArr, int i12, int i13, int i14, byte[] bArr2, int i15, int i16, int i17) {
        int i18 = eVar.f6218c + (eVar.f6219d * i17) + i10;
        int i19 = (lVar.f6218c + (i17 * lVar.f6219d)) - i10;
        int i20 = (i11 + i19) - i10;
        int i21 = i19 + i10;
        while (i21 < i20) {
            int i22 = i21 + 1;
            bArr2[i18] = (byte) ((((((bArr[i21] & 255) * i12) + ((bArr[i22] & 255) * i13)) + ((bArr[i22 + 1] & 255) * i14)) + i15) / i16);
            i21 = i22;
            i18++;
        }
    }

    public static /* synthetic */ void s(c4.e eVar, int i10, c4.l lVar, int i11, byte[] bArr, int i12, int i13, int i14, int i15, int i16, byte[] bArr2, int i17, int i18, int i19) {
        int i20 = eVar.f6218c + (eVar.f6219d * i19) + i10;
        int i21 = (lVar.f6218c + (i19 * lVar.f6219d)) - i10;
        int i22 = (i11 + i21) - i10;
        int i23 = i21 + i10;
        while (i23 < i22) {
            int i24 = i23 + 1;
            int i25 = i24 + 1;
            int i26 = i25 + 1;
            bArr2[i20] = (byte) ((((((((bArr[i23] & 255) * i12) + ((bArr[i24] & 255) * i13)) + ((bArr[i25] & 255) * i14)) + ((bArr[i26] & 255) * i15)) + ((bArr[i26 + 1] & 255) * i16)) + i17) / i18);
            i23 = i24;
            i20++;
        }
    }

    public static /* synthetic */ void t(c4.e eVar, int i10, c4.l lVar, int i11, byte[] bArr, int i12, int i13, int i14, int i15, int i16, int i17, int i18, byte[] bArr2, int i19, int i20, int i21) {
        int i22 = eVar.f6218c + (eVar.f6219d * i21) + i10;
        int i23 = (lVar.f6218c + (lVar.f6219d * i21)) - i10;
        int i24 = (i23 + i11) - i10;
        int i25 = i23 + i10;
        while (i25 < i24) {
            int i26 = i25 + 1;
            int i27 = i26 + 1;
            int i28 = i27 + 1;
            int i29 = ((bArr[i25] & 255) * i12) + ((bArr[i26] & 255) * i13) + ((bArr[i27] & 255) * i14);
            int i30 = i28 + 1;
            int i31 = i29 + ((bArr[i28] & 255) * i15);
            int i32 = i30 + 1;
            bArr2[i22] = (byte) (((((i31 + ((bArr[i30] & 255) * i16)) + ((bArr[i32] & 255) * i17)) + ((bArr[i32 + 1] & 255) * i18)) + i19) / i20);
            i25 = i26;
            i22++;
        }
    }

    public static /* synthetic */ void u(c4.e eVar, int i10, c4.l lVar, int i11, byte[] bArr, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, byte[] bArr2, int i21, int i22, int i23) {
        int i24 = eVar.f6218c + (eVar.f6219d * i23) + i10;
        int i25 = (lVar.f6218c + (lVar.f6219d * i23)) - i10;
        int i26 = (i25 + i11) - i10;
        int i27 = i25 + i10;
        while (i27 < i26) {
            int i28 = i27 + 1;
            int i29 = i28 + 1;
            int i30 = i29 + 1;
            int i31 = ((bArr[i27] & 255) * i12) + ((bArr[i28] & 255) * i13) + ((bArr[i29] & 255) * i14);
            int i32 = i30 + 1;
            int i33 = i31 + ((bArr[i30] & 255) * i15);
            int i34 = i32 + 1;
            int i35 = i33 + ((bArr[i32] & 255) * i16);
            int i36 = i34 + 1;
            int i37 = i35 + ((bArr[i34] & 255) * i17);
            int i38 = i36 + 1;
            bArr2[i24] = (byte) (((((i37 + ((bArr[i36] & 255) * i18)) + ((bArr[i38] & 255) * i19)) + ((bArr[i38 + 1] & 255) * i20)) + i21) / i22);
            i27 = i28;
            i24++;
        }
    }

    public static /* synthetic */ void v(c4.e eVar, c4.l lVar, int i10, int i11, byte[] bArr, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, byte[] bArr2, int i23, int i24, int i25) {
        int i26 = eVar.f6218c + (eVar.f6219d * i25);
        int i27 = lVar.f6218c + ((i25 - i10) * lVar.f6219d);
        int i28 = i27 + i11;
        while (i27 < i28) {
            int i29 = lVar.f6219d;
            int i30 = i27 + i29;
            int i31 = i30 + i29;
            int i32 = i31 + i29;
            int i33 = i32 + i29;
            int i34 = i33 + i29;
            int i35 = i34 + i29;
            int i36 = i35 + i29;
            int i37 = i36 + i29;
            int i38 = i37 + i29;
            bArr2[i26] = (byte) ((((((((((((((bArr[i27] & 255) * i12) + ((bArr[i30] & 255) * i13)) + ((bArr[i31] & 255) * i14)) + ((bArr[i32] & 255) * i15)) + ((bArr[i33] & 255) * i16)) + ((bArr[i34] & 255) * i17)) + ((bArr[i35] & 255) * i18)) + ((bArr[i36] & 255) * i19)) + ((bArr[i37] & 255) * i20)) + ((bArr[i38] & 255) * i21)) + ((bArr[i38 + i29] & 255) * i22)) + i23) / i24);
            i27++;
            i26++;
        }
    }

    public static /* synthetic */ void w(c4.e eVar, c4.l lVar, int i10, int i11, byte[] bArr, int i12, int i13, int i14, byte[] bArr2, int i15, int i16, int i17) {
        int i18 = eVar.f6218c + (eVar.f6219d * i17);
        int i19 = lVar.f6218c + ((i17 - i10) * lVar.f6219d);
        int i20 = i11 + i19;
        while (i19 < i20) {
            int i21 = lVar.f6219d;
            int i22 = i19 + i21;
            bArr2[i18] = (byte) ((((((bArr[i19] & 255) * i12) + ((bArr[i22] & 255) * i13)) + ((bArr[i22 + i21] & 255) * i14)) + i15) / i16);
            i19++;
            i18++;
        }
    }

    public static /* synthetic */ void x(c4.e eVar, c4.l lVar, int i10, int i11, byte[] bArr, int i12, int i13, int i14, int i15, int i16, byte[] bArr2, int i17, int i18, int i19) {
        int i20 = eVar.f6218c + (eVar.f6219d * i19);
        int i21 = lVar.f6218c + ((i19 - i10) * lVar.f6219d);
        int i22 = i21 + i11;
        while (i21 < i22) {
            int i23 = lVar.f6219d;
            int i24 = i21 + i23;
            int i25 = i24 + i23;
            int i26 = i25 + i23;
            bArr2[i20] = (byte) ((((((((bArr[i21] & 255) * i12) + ((bArr[i24] & 255) * i13)) + ((bArr[i25] & 255) * i14)) + ((bArr[i26] & 255) * i15)) + ((bArr[i26 + i23] & 255) * i16)) + i17) / i18);
            i21++;
            i20++;
        }
    }

    public static /* synthetic */ void y(c4.e eVar, c4.l lVar, int i10, int i11, byte[] bArr, int i12, int i13, int i14, int i15, int i16, int i17, int i18, byte[] bArr2, int i19, int i20, int i21) {
        int i22 = eVar.f6218c + (eVar.f6219d * i21);
        int i23 = lVar.f6218c + ((i21 - i10) * lVar.f6219d);
        int i24 = i23 + i11;
        while (i23 < i24) {
            int i25 = lVar.f6219d;
            int i26 = i23 + i25;
            int i27 = i26 + i25;
            int i28 = i27 + i25;
            int i29 = i28 + i25;
            int i30 = i29 + i25;
            bArr2[i22] = (byte) ((((((((((bArr[i23] & 255) * i12) + ((bArr[i26] & 255) * i13)) + ((bArr[i27] & 255) * i14)) + ((bArr[i28] & 255) * i15)) + ((bArr[i29] & 255) * i16)) + ((bArr[i30] & 255) * i17)) + ((bArr[i30 + i25] & 255) * i18)) + i19) / i20);
            i23++;
            i22++;
        }
    }

    public static /* synthetic */ void z(c4.e eVar, c4.l lVar, int i10, int i11, byte[] bArr, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, byte[] bArr2, int i21, int i22, int i23) {
        int i24 = eVar.f6218c + (eVar.f6219d * i23);
        int i25 = lVar.f6218c + ((i23 - i10) * lVar.f6219d);
        int i26 = i25 + i11;
        while (i25 < i26) {
            int i27 = lVar.f6219d;
            int i28 = i25 + i27;
            int i29 = i28 + i27;
            int i30 = i29 + i27;
            int i31 = i30 + i27;
            int i32 = i31 + i27;
            int i33 = i32 + i27;
            int i34 = i33 + i27;
            bArr2[i24] = (byte) ((((((((((((bArr[i25] & 255) * i12) + ((bArr[i28] & 255) * i13)) + ((bArr[i29] & 255) * i14)) + ((bArr[i30] & 255) * i15)) + ((bArr[i31] & 255) * i16)) + ((bArr[i32] & 255) * i17)) + ((bArr[i33] & 255) * i18)) + ((bArr[i34] & 255) * i19)) + ((bArr[i34 + i27] & 255) * i20)) + i21) / i22);
            i25++;
            i24++;
        }
    }
}
