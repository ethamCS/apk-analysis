package u2;

import j$.util.function.IntConsumer;
import java.util.Objects;
/* loaded from: classes.dex */
public class e0 {
    public static boolean A(z3.d dVar, c4.k kVar, c4.d dVar2, int i10, ll.d<ok.g> dVar3) {
        int i11 = dVar.f26454b;
        int i12 = dVar.f26453a;
        if (i11 != i12 / 2 || i12 % 2 == 0) {
            return false;
        }
        if (i12 == 3) {
            C(dVar, kVar, dVar2, i10, dVar3);
            return true;
        } else if (i12 == 5) {
            D(dVar, kVar, dVar2, i10, dVar3);
            return true;
        } else if (i12 == 7) {
            E(dVar, kVar, dVar2, i10, dVar3);
            return true;
        } else if (i12 == 9) {
            F(dVar, kVar, dVar2, i10, dVar3);
            return true;
        } else if (i12 != 11) {
            return false;
        } else {
            B(dVar, kVar, dVar2, i10, dVar3);
            return true;
        }
    }

    public static void B(z3.d dVar, final c4.k kVar, final c4.d dVar2, final int i10, ll.d<ok.g> dVar3) {
        final short[] sArr = kVar.V3;
        final short[] sArr2 = dVar2.V3;
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
        final int p10 = dVar2.p();
        final int i22 = i10 / 2;
        ll.b.f(b10, dVar2.g() - b10, new IntConsumer() { // from class: u2.z
            @Override // j$.util.function.IntConsumer
            public final void accept(int i23) {
                e0.v(c4.d.this, kVar, b10, p10, sArr, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, sArr2, i22, i10, i23);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void C(z3.d dVar, final c4.k kVar, final c4.d dVar2, final int i10, ll.d<ok.g> dVar3) {
        final short[] sArr = kVar.V3;
        final short[] sArr2 = dVar2.V3;
        int[] iArr = dVar.f26449c;
        final int i11 = iArr[0];
        final int i12 = iArr[1];
        final int i13 = iArr[2];
        final int b10 = dVar.b();
        final int p10 = dVar2.p();
        final int i14 = i10 / 2;
        ll.b.f(b10, dVar2.g() - b10, new IntConsumer() { // from class: u2.d0
            @Override // j$.util.function.IntConsumer
            public final void accept(int i15) {
                e0.w(c4.d.this, kVar, b10, p10, sArr, i11, i12, i13, sArr2, i14, i10, i15);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void D(z3.d dVar, final c4.k kVar, final c4.d dVar2, final int i10, ll.d<ok.g> dVar3) {
        final short[] sArr = kVar.V3;
        final short[] sArr2 = dVar2.V3;
        int[] iArr = dVar.f26449c;
        final int i11 = iArr[0];
        final int i12 = iArr[1];
        final int i13 = iArr[2];
        final int i14 = iArr[3];
        final int i15 = iArr[4];
        final int b10 = dVar.b();
        final int p10 = dVar2.p();
        final int i16 = i10 / 2;
        ll.b.f(b10, dVar2.g() - b10, new IntConsumer() { // from class: u2.c0
            @Override // j$.util.function.IntConsumer
            public final void accept(int i17) {
                e0.x(c4.d.this, kVar, b10, p10, sArr, i11, i12, i13, i14, i15, sArr2, i16, i10, i17);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void E(z3.d dVar, final c4.k kVar, final c4.d dVar2, final int i10, ll.d<ok.g> dVar3) {
        final short[] sArr = kVar.V3;
        final short[] sArr2 = dVar2.V3;
        int[] iArr = dVar.f26449c;
        final int i11 = iArr[0];
        final int i12 = iArr[1];
        final int i13 = iArr[2];
        final int i14 = iArr[3];
        final int i15 = iArr[4];
        final int i16 = iArr[5];
        final int i17 = iArr[6];
        final int b10 = dVar.b();
        final int p10 = dVar2.p();
        final int i18 = i10 / 2;
        ll.b.f(b10, dVar2.g() - b10, new IntConsumer() { // from class: u2.b0
            @Override // j$.util.function.IntConsumer
            public final void accept(int i19) {
                e0.y(c4.d.this, kVar, b10, p10, sArr, i11, i12, i13, i14, i15, i16, i17, sArr2, i18, i10, i19);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void F(z3.d dVar, final c4.k kVar, final c4.d dVar2, final int i10, ll.d<ok.g> dVar3) {
        final short[] sArr = kVar.V3;
        final short[] sArr2 = dVar2.V3;
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
        final int p10 = dVar2.p();
        final int i20 = i10 / 2;
        ll.b.f(b10, dVar2.g() - b10, new IntConsumer() { // from class: u2.a0
            @Override // j$.util.function.IntConsumer
            public final void accept(int i21) {
                e0.z(c4.d.this, kVar, b10, p10, sArr, i11, i12, i13, i14, i15, i16, i17, i18, i19, sArr2, i20, i10, i21);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static boolean k(z3.d dVar, c4.k kVar, c4.d dVar2, int i10) {
        int i11 = dVar.f26454b;
        int i12 = dVar.f26453a;
        if (i11 != i12 / 2 || i12 % 2 == 0) {
            return false;
        }
        if (i12 == 3) {
            m(dVar, kVar, dVar2, i10);
            return true;
        } else if (i12 == 5) {
            n(dVar, kVar, dVar2, i10);
            return true;
        } else if (i12 == 7) {
            o(dVar, kVar, dVar2, i10);
            return true;
        } else if (i12 == 9) {
            p(dVar, kVar, dVar2, i10);
            return true;
        } else if (i12 != 11) {
            return false;
        } else {
            l(dVar, kVar, dVar2, i10);
            return true;
        }
    }

    public static void l(z3.d dVar, final c4.k kVar, final c4.d dVar2, final int i10) {
        final short[] sArr = kVar.V3;
        final short[] sArr2 = dVar2.V3;
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
        final int p10 = kVar.p();
        final int i22 = i10 / 2;
        ll.b.f(0, kVar.f6221x, new IntConsumer() { // from class: u2.u
            @Override // j$.util.function.IntConsumer
            public final void accept(int i23) {
                e0.q(c4.d.this, b10, kVar, p10, sArr, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, sArr2, i22, i10, i23);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void m(z3.d dVar, final c4.k kVar, final c4.d dVar2, final int i10) {
        final short[] sArr = kVar.V3;
        final short[] sArr2 = dVar2.V3;
        int[] iArr = dVar.f26449c;
        final int i11 = iArr[0];
        final int i12 = iArr[1];
        final int i13 = iArr[2];
        final int b10 = dVar.b();
        final int p10 = kVar.p();
        final int i14 = i10 / 2;
        ll.b.f(0, kVar.f6221x, new IntConsumer() { // from class: u2.y
            @Override // j$.util.function.IntConsumer
            public final void accept(int i15) {
                e0.r(c4.d.this, b10, kVar, p10, sArr, i11, i12, i13, sArr2, i14, i10, i15);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void n(z3.d dVar, final c4.k kVar, final c4.d dVar2, final int i10) {
        final short[] sArr = kVar.V3;
        final short[] sArr2 = dVar2.V3;
        int[] iArr = dVar.f26449c;
        final int i11 = iArr[0];
        final int i12 = iArr[1];
        final int i13 = iArr[2];
        final int i14 = iArr[3];
        final int i15 = iArr[4];
        final int b10 = dVar.b();
        final int p10 = kVar.p();
        final int i16 = i10 / 2;
        ll.b.f(0, kVar.f6221x, new IntConsumer() { // from class: u2.x
            @Override // j$.util.function.IntConsumer
            public final void accept(int i17) {
                e0.s(c4.d.this, b10, kVar, p10, sArr, i11, i12, i13, i14, i15, sArr2, i16, i10, i17);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void o(z3.d dVar, final c4.k kVar, final c4.d dVar2, final int i10) {
        final short[] sArr = kVar.V3;
        final short[] sArr2 = dVar2.V3;
        int[] iArr = dVar.f26449c;
        final int i11 = iArr[0];
        final int i12 = iArr[1];
        final int i13 = iArr[2];
        final int i14 = iArr[3];
        final int i15 = iArr[4];
        final int i16 = iArr[5];
        final int i17 = iArr[6];
        final int b10 = dVar.b();
        final int p10 = kVar.p();
        final int i18 = i10 / 2;
        ll.b.f(0, kVar.f6221x, new IntConsumer() { // from class: u2.w
            @Override // j$.util.function.IntConsumer
            public final void accept(int i19) {
                e0.t(c4.d.this, b10, kVar, p10, sArr, i11, i12, i13, i14, i15, i16, i17, sArr2, i18, i10, i19);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void p(z3.d dVar, final c4.k kVar, final c4.d dVar2, final int i10) {
        final short[] sArr = kVar.V3;
        final short[] sArr2 = dVar2.V3;
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
        final int p10 = kVar.p();
        final int i20 = i10 / 2;
        ll.b.f(0, kVar.f6221x, new IntConsumer() { // from class: u2.v
            @Override // j$.util.function.IntConsumer
            public final void accept(int i21) {
                e0.u(c4.d.this, b10, kVar, p10, sArr, i11, i12, i13, i14, i15, i16, i17, i18, i19, sArr2, i20, i10, i21);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static /* synthetic */ void q(c4.d dVar, int i10, c4.k kVar, int i11, short[] sArr, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, short[] sArr2, int i23, int i24, int i25) {
        int i26 = dVar.f6218c + (dVar.f6219d * i25) + i10;
        int i27 = (kVar.f6218c + (kVar.f6219d * i25)) - i10;
        int i28 = (i27 + i11) - i10;
        int i29 = i27 + i10;
        while (i29 < i28) {
            int i30 = i29 + 1;
            int i31 = i30 + 1;
            int i32 = i31 + 1;
            int i33 = ((sArr[i29] & 65535) * i12) + ((sArr[i30] & 65535) * i13) + ((sArr[i31] & 65535) * i14);
            int i34 = i32 + 1;
            int i35 = i33 + ((sArr[i32] & 65535) * i15);
            int i36 = i34 + 1;
            int i37 = i35 + ((sArr[i34] & 65535) * i16);
            int i38 = i36 + 1;
            int i39 = i37 + ((sArr[i36] & 65535) * i17);
            int i40 = i38 + 1;
            int i41 = i39 + ((sArr[i38] & 65535) * i18);
            int i42 = i40 + 1;
            int i43 = i41 + ((sArr[i40] & 65535) * i19);
            int i44 = i42 + 1;
            sArr2[i26] = (short) (((((i43 + ((sArr[i42] & 65535) * i20)) + ((sArr[i44] & 65535) * i21)) + ((65535 & sArr[i44 + 1]) * i22)) + i23) / i24);
            i29 = i30;
            i26++;
        }
    }

    public static /* synthetic */ void r(c4.d dVar, int i10, c4.k kVar, int i11, short[] sArr, int i12, int i13, int i14, short[] sArr2, int i15, int i16, int i17) {
        int i18 = dVar.f6218c + (dVar.f6219d * i17) + i10;
        int i19 = (kVar.f6218c + (i17 * kVar.f6219d)) - i10;
        int i20 = (i11 + i19) - i10;
        int i21 = i19 + i10;
        while (i21 < i20) {
            int i22 = i21 + 1;
            sArr2[i18] = (short) ((((((sArr[i21] & 65535) * i12) + ((sArr[i22] & 65535) * i13)) + ((65535 & sArr[i22 + 1]) * i14)) + i15) / i16);
            i21 = i22;
            i18++;
        }
    }

    public static /* synthetic */ void s(c4.d dVar, int i10, c4.k kVar, int i11, short[] sArr, int i12, int i13, int i14, int i15, int i16, short[] sArr2, int i17, int i18, int i19) {
        int i20 = dVar.f6218c + (dVar.f6219d * i19) + i10;
        int i21 = (kVar.f6218c + (i19 * kVar.f6219d)) - i10;
        int i22 = (i11 + i21) - i10;
        int i23 = i21 + i10;
        while (i23 < i22) {
            int i24 = i23 + 1;
            int i25 = i24 + 1;
            int i26 = i25 + 1;
            sArr2[i20] = (short) ((((((((sArr[i23] & 65535) * i12) + ((sArr[i24] & 65535) * i13)) + ((sArr[i25] & 65535) * i14)) + ((sArr[i26] & 65535) * i15)) + ((65535 & sArr[i26 + 1]) * i16)) + i17) / i18);
            i23 = i24;
            i20++;
        }
    }

    public static /* synthetic */ void t(c4.d dVar, int i10, c4.k kVar, int i11, short[] sArr, int i12, int i13, int i14, int i15, int i16, int i17, int i18, short[] sArr2, int i19, int i20, int i21) {
        int i22 = dVar.f6218c + (dVar.f6219d * i21) + i10;
        int i23 = (kVar.f6218c + (kVar.f6219d * i21)) - i10;
        int i24 = (i23 + i11) - i10;
        int i25 = i23 + i10;
        while (i25 < i24) {
            int i26 = i25 + 1;
            int i27 = i26 + 1;
            int i28 = i27 + 1;
            int i29 = ((sArr[i25] & 65535) * i12) + ((sArr[i26] & 65535) * i13) + ((sArr[i27] & 65535) * i14);
            int i30 = i28 + 1;
            int i31 = i29 + ((sArr[i28] & 65535) * i15);
            int i32 = i30 + 1;
            sArr2[i22] = (short) (((((i31 + ((sArr[i30] & 65535) * i16)) + ((sArr[i32] & 65535) * i17)) + ((65535 & sArr[i32 + 1]) * i18)) + i19) / i20);
            i25 = i26;
            i22++;
        }
    }

    public static /* synthetic */ void u(c4.d dVar, int i10, c4.k kVar, int i11, short[] sArr, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, short[] sArr2, int i21, int i22, int i23) {
        int i24 = dVar.f6218c + (dVar.f6219d * i23) + i10;
        int i25 = (kVar.f6218c + (kVar.f6219d * i23)) - i10;
        int i26 = (i25 + i11) - i10;
        int i27 = i25 + i10;
        while (i27 < i26) {
            int i28 = i27 + 1;
            int i29 = i28 + 1;
            int i30 = i29 + 1;
            int i31 = ((sArr[i27] & 65535) * i12) + ((sArr[i28] & 65535) * i13) + ((sArr[i29] & 65535) * i14);
            int i32 = i30 + 1;
            int i33 = i31 + ((sArr[i30] & 65535) * i15);
            int i34 = i32 + 1;
            int i35 = i33 + ((sArr[i32] & 65535) * i16);
            int i36 = i34 + 1;
            int i37 = i35 + ((sArr[i34] & 65535) * i17);
            int i38 = i36 + 1;
            sArr2[i24] = (short) (((((i37 + ((sArr[i36] & 65535) * i18)) + ((sArr[i38] & 65535) * i19)) + ((65535 & sArr[i38 + 1]) * i20)) + i21) / i22);
            i27 = i28;
            i24++;
        }
    }

    public static /* synthetic */ void v(c4.d dVar, c4.k kVar, int i10, int i11, short[] sArr, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, short[] sArr2, int i23, int i24, int i25) {
        int i26 = dVar.f6218c + (dVar.f6219d * i25);
        int i27 = kVar.f6218c + ((i25 - i10) * kVar.f6219d);
        int i28 = i27 + i11;
        while (i27 < i28) {
            int i29 = kVar.f6219d;
            int i30 = i27 + i29;
            int i31 = i30 + i29;
            int i32 = i31 + i29;
            int i33 = i32 + i29;
            int i34 = i33 + i29;
            int i35 = i34 + i29;
            int i36 = i35 + i29;
            int i37 = i36 + i29;
            int i38 = i37 + i29;
            sArr2[i26] = (short) ((((((((((((((sArr[i27] & 65535) * i12) + ((sArr[i30] & 65535) * i13)) + ((sArr[i31] & 65535) * i14)) + ((sArr[i32] & 65535) * i15)) + ((sArr[i33] & 65535) * i16)) + ((sArr[i34] & 65535) * i17)) + ((sArr[i35] & 65535) * i18)) + ((sArr[i36] & 65535) * i19)) + ((sArr[i37] & 65535) * i20)) + ((sArr[i38] & 65535) * i21)) + ((65535 & sArr[i38 + i29]) * i22)) + i23) / i24);
            i27++;
            i26++;
        }
    }

    public static /* synthetic */ void w(c4.d dVar, c4.k kVar, int i10, int i11, short[] sArr, int i12, int i13, int i14, short[] sArr2, int i15, int i16, int i17) {
        int i18 = dVar.f6218c + (dVar.f6219d * i17);
        int i19 = kVar.f6218c + ((i17 - i10) * kVar.f6219d);
        int i20 = i11 + i19;
        while (i19 < i20) {
            int i21 = kVar.f6219d;
            int i22 = i19 + i21;
            sArr2[i18] = (short) ((((((sArr[i19] & 65535) * i12) + ((sArr[i22] & 65535) * i13)) + ((65535 & sArr[i22 + i21]) * i14)) + i15) / i16);
            i19++;
            i18++;
        }
    }

    public static /* synthetic */ void x(c4.d dVar, c4.k kVar, int i10, int i11, short[] sArr, int i12, int i13, int i14, int i15, int i16, short[] sArr2, int i17, int i18, int i19) {
        int i20 = dVar.f6218c + (dVar.f6219d * i19);
        int i21 = kVar.f6218c + ((i19 - i10) * kVar.f6219d);
        int i22 = i21 + i11;
        while (i21 < i22) {
            int i23 = kVar.f6219d;
            int i24 = i21 + i23;
            int i25 = i24 + i23;
            int i26 = i25 + i23;
            sArr2[i20] = (short) ((((((((sArr[i21] & 65535) * i12) + ((sArr[i24] & 65535) * i13)) + ((sArr[i25] & 65535) * i14)) + ((sArr[i26] & 65535) * i15)) + ((65535 & sArr[i26 + i23]) * i16)) + i17) / i18);
            i21++;
            i20++;
        }
    }

    public static /* synthetic */ void y(c4.d dVar, c4.k kVar, int i10, int i11, short[] sArr, int i12, int i13, int i14, int i15, int i16, int i17, int i18, short[] sArr2, int i19, int i20, int i21) {
        int i22 = dVar.f6218c + (dVar.f6219d * i21);
        int i23 = kVar.f6218c + ((i21 - i10) * kVar.f6219d);
        int i24 = i23 + i11;
        while (i23 < i24) {
            int i25 = kVar.f6219d;
            int i26 = i23 + i25;
            int i27 = i26 + i25;
            int i28 = i27 + i25;
            int i29 = i28 + i25;
            int i30 = i29 + i25;
            sArr2[i22] = (short) ((((((((((sArr[i23] & 65535) * i12) + ((sArr[i26] & 65535) * i13)) + ((sArr[i27] & 65535) * i14)) + ((sArr[i28] & 65535) * i15)) + ((sArr[i29] & 65535) * i16)) + ((sArr[i30] & 65535) * i17)) + ((65535 & sArr[i30 + i25]) * i18)) + i19) / i20);
            i23++;
            i22++;
        }
    }

    public static /* synthetic */ void z(c4.d dVar, c4.k kVar, int i10, int i11, short[] sArr, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, short[] sArr2, int i21, int i22, int i23) {
        int i24 = dVar.f6218c + (dVar.f6219d * i23);
        int i25 = kVar.f6218c + ((i23 - i10) * kVar.f6219d);
        int i26 = i25 + i11;
        while (i25 < i26) {
            int i27 = kVar.f6219d;
            int i28 = i25 + i27;
            int i29 = i28 + i27;
            int i30 = i29 + i27;
            int i31 = i30 + i27;
            int i32 = i31 + i27;
            int i33 = i32 + i27;
            int i34 = i33 + i27;
            sArr2[i24] = (short) ((((((((((((sArr[i25] & 65535) * i12) + ((sArr[i28] & 65535) * i13)) + ((sArr[i29] & 65535) * i14)) + ((sArr[i30] & 65535) * i15)) + ((sArr[i31] & 65535) * i16)) + ((sArr[i32] & 65535) * i17)) + ((sArr[i33] & 65535) * i18)) + ((sArr[i34] & 65535) * i19)) + ((65535 & sArr[i34 + i27]) * i20)) + i21) / i22);
            i25++;
            i24++;
        }
    }
}
