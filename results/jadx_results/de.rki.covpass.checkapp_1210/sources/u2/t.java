package u2;

import j$.util.function.IntConsumer;
import java.util.Objects;
/* loaded from: classes.dex */
public class t {
    public static boolean A(z3.b bVar, c4.a aVar, c4.a aVar2) {
        int i10 = bVar.f26454b;
        int i11 = bVar.f26453a;
        if (i10 != i11 / 2 || i11 % 2 == 0) {
            return false;
        }
        if (i11 == 3) {
            C(bVar, aVar, aVar2);
            return true;
        } else if (i11 == 5) {
            D(bVar, aVar, aVar2);
            return true;
        } else if (i11 == 7) {
            E(bVar, aVar, aVar2);
            return true;
        } else if (i11 == 9) {
            F(bVar, aVar, aVar2);
            return true;
        } else if (i11 != 11) {
            return false;
        } else {
            B(bVar, aVar, aVar2);
            return true;
        }
    }

    public static void B(z3.b bVar, final c4.a aVar, final c4.a aVar2) {
        final float[] fArr = aVar.V3;
        final float[] fArr2 = aVar2.V3;
        float[] fArr3 = bVar.f26447c;
        final float f10 = fArr3[0];
        final float f11 = fArr3[1];
        final float f12 = fArr3[2];
        final float f13 = fArr3[3];
        final float f14 = fArr3[4];
        final float f15 = fArr3[5];
        final float f16 = fArr3[6];
        final float f17 = fArr3[7];
        final float f18 = fArr3[8];
        final float f19 = fArr3[9];
        final float f20 = fArr3[10];
        final int b10 = bVar.b();
        final int p10 = aVar2.p();
        ll.b.f(b10, aVar2.g() - b10, new IntConsumer() { // from class: u2.o
            @Override // j$.util.function.IntConsumer
            public final void accept(int i10) {
                t.v(c4.a.this, aVar, b10, p10, fArr, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, fArr2, i10);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void C(z3.b bVar, final c4.a aVar, final c4.a aVar2) {
        final float[] fArr = aVar.V3;
        final float[] fArr2 = aVar2.V3;
        float[] fArr3 = bVar.f26447c;
        final float f10 = fArr3[0];
        final float f11 = fArr3[1];
        final float f12 = fArr3[2];
        final int b10 = bVar.b();
        final int p10 = aVar2.p();
        ll.b.f(b10, aVar2.g() - b10, new IntConsumer() { // from class: u2.s
            @Override // j$.util.function.IntConsumer
            public final void accept(int i10) {
                t.w(c4.a.this, aVar, b10, p10, fArr, f10, f11, f12, fArr2, i10);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void D(z3.b bVar, final c4.a aVar, final c4.a aVar2) {
        final float[] fArr = aVar.V3;
        final float[] fArr2 = aVar2.V3;
        float[] fArr3 = bVar.f26447c;
        final float f10 = fArr3[0];
        final float f11 = fArr3[1];
        final float f12 = fArr3[2];
        final float f13 = fArr3[3];
        final float f14 = fArr3[4];
        final int b10 = bVar.b();
        final int p10 = aVar2.p();
        ll.b.f(b10, aVar2.g() - b10, new IntConsumer() { // from class: u2.r
            @Override // j$.util.function.IntConsumer
            public final void accept(int i10) {
                t.x(c4.a.this, aVar, b10, p10, fArr, f10, f11, f12, f13, f14, fArr2, i10);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void E(z3.b bVar, final c4.a aVar, final c4.a aVar2) {
        final float[] fArr = aVar.V3;
        final float[] fArr2 = aVar2.V3;
        float[] fArr3 = bVar.f26447c;
        final float f10 = fArr3[0];
        final float f11 = fArr3[1];
        final float f12 = fArr3[2];
        final float f13 = fArr3[3];
        final float f14 = fArr3[4];
        final float f15 = fArr3[5];
        final float f16 = fArr3[6];
        final int b10 = bVar.b();
        final int p10 = aVar2.p();
        ll.b.f(b10, aVar2.g() - b10, new IntConsumer() { // from class: u2.q
            @Override // j$.util.function.IntConsumer
            public final void accept(int i10) {
                t.y(c4.a.this, aVar, b10, p10, fArr, f10, f11, f12, f13, f14, f15, f16, fArr2, i10);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void F(z3.b bVar, final c4.a aVar, final c4.a aVar2) {
        final float[] fArr = aVar.V3;
        final float[] fArr2 = aVar2.V3;
        float[] fArr3 = bVar.f26447c;
        final float f10 = fArr3[0];
        final float f11 = fArr3[1];
        final float f12 = fArr3[2];
        final float f13 = fArr3[3];
        final float f14 = fArr3[4];
        final float f15 = fArr3[5];
        final float f16 = fArr3[6];
        final float f17 = fArr3[7];
        final float f18 = fArr3[8];
        final int b10 = bVar.b();
        final int p10 = aVar2.p();
        ll.b.f(b10, aVar2.g() - b10, new IntConsumer() { // from class: u2.p
            @Override // j$.util.function.IntConsumer
            public final void accept(int i10) {
                t.z(c4.a.this, aVar, b10, p10, fArr, f10, f11, f12, f13, f14, f15, f16, f17, f18, fArr2, i10);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static boolean k(z3.b bVar, c4.a aVar, c4.a aVar2) {
        int i10 = bVar.f26454b;
        int i11 = bVar.f26453a;
        if (i10 != i11 / 2 || i11 % 2 == 0) {
            return false;
        }
        if (i11 == 3) {
            m(bVar, aVar, aVar2);
            return true;
        } else if (i11 == 5) {
            n(bVar, aVar, aVar2);
            return true;
        } else if (i11 == 7) {
            o(bVar, aVar, aVar2);
            return true;
        } else if (i11 == 9) {
            p(bVar, aVar, aVar2);
            return true;
        } else if (i11 != 11) {
            return false;
        } else {
            l(bVar, aVar, aVar2);
            return true;
        }
    }

    public static void l(z3.b bVar, final c4.a aVar, final c4.a aVar2) {
        final float[] fArr = aVar.V3;
        final float[] fArr2 = aVar2.V3;
        float[] fArr3 = bVar.f26447c;
        final float f10 = fArr3[0];
        final float f11 = fArr3[1];
        final float f12 = fArr3[2];
        final float f13 = fArr3[3];
        final float f14 = fArr3[4];
        final float f15 = fArr3[5];
        final float f16 = fArr3[6];
        final float f17 = fArr3[7];
        final float f18 = fArr3[8];
        final float f19 = fArr3[9];
        final float f20 = fArr3[10];
        final int b10 = bVar.b();
        final int p10 = aVar.p();
        ll.b.f(0, aVar.f6221x, new IntConsumer() { // from class: u2.j
            @Override // j$.util.function.IntConsumer
            public final void accept(int i10) {
                t.q(c4.a.this, b10, aVar, p10, fArr, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, fArr2, i10);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void m(z3.b bVar, final c4.a aVar, final c4.a aVar2) {
        final float[] fArr = aVar.V3;
        final float[] fArr2 = aVar2.V3;
        float[] fArr3 = bVar.f26447c;
        final float f10 = fArr3[0];
        final float f11 = fArr3[1];
        final float f12 = fArr3[2];
        final int b10 = bVar.b();
        final int p10 = aVar.p();
        ll.b.f(0, aVar.f6221x, new IntConsumer() { // from class: u2.n
            @Override // j$.util.function.IntConsumer
            public final void accept(int i10) {
                t.r(c4.a.this, b10, aVar, p10, fArr, f10, f11, f12, fArr2, i10);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void n(z3.b bVar, final c4.a aVar, final c4.a aVar2) {
        final float[] fArr = aVar.V3;
        final float[] fArr2 = aVar2.V3;
        float[] fArr3 = bVar.f26447c;
        final float f10 = fArr3[0];
        final float f11 = fArr3[1];
        final float f12 = fArr3[2];
        final float f13 = fArr3[3];
        final float f14 = fArr3[4];
        final int b10 = bVar.b();
        final int p10 = aVar.p();
        ll.b.f(0, aVar.f6221x, new IntConsumer() { // from class: u2.m
            @Override // j$.util.function.IntConsumer
            public final void accept(int i10) {
                t.s(c4.a.this, b10, aVar, p10, fArr, f10, f11, f12, f13, f14, fArr2, i10);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void o(z3.b bVar, final c4.a aVar, final c4.a aVar2) {
        final float[] fArr = aVar.V3;
        final float[] fArr2 = aVar2.V3;
        float[] fArr3 = bVar.f26447c;
        final float f10 = fArr3[0];
        final float f11 = fArr3[1];
        final float f12 = fArr3[2];
        final float f13 = fArr3[3];
        final float f14 = fArr3[4];
        final float f15 = fArr3[5];
        final float f16 = fArr3[6];
        final int b10 = bVar.b();
        final int p10 = aVar.p();
        ll.b.f(0, aVar.f6221x, new IntConsumer() { // from class: u2.l
            @Override // j$.util.function.IntConsumer
            public final void accept(int i10) {
                t.t(c4.a.this, b10, aVar, p10, fArr, f10, f11, f12, f13, f14, f15, f16, fArr2, i10);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void p(z3.b bVar, final c4.a aVar, final c4.a aVar2) {
        final float[] fArr = aVar.V3;
        final float[] fArr2 = aVar2.V3;
        float[] fArr3 = bVar.f26447c;
        final float f10 = fArr3[0];
        final float f11 = fArr3[1];
        final float f12 = fArr3[2];
        final float f13 = fArr3[3];
        final float f14 = fArr3[4];
        final float f15 = fArr3[5];
        final float f16 = fArr3[6];
        final float f17 = fArr3[7];
        final float f18 = fArr3[8];
        final int b10 = bVar.b();
        final int p10 = aVar.p();
        ll.b.f(0, aVar.f6221x, new IntConsumer() { // from class: u2.k
            @Override // j$.util.function.IntConsumer
            public final void accept(int i10) {
                t.u(c4.a.this, b10, aVar, p10, fArr, f10, f11, f12, f13, f14, f15, f16, f17, f18, fArr2, i10);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static /* synthetic */ void q(c4.a aVar, int i10, c4.a aVar2, int i11, float[] fArr, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float[] fArr2, int i12) {
        int i13 = aVar.f6218c + (aVar.f6219d * i12) + i10;
        int i14 = (aVar2.f6218c + (aVar2.f6219d * i12)) - i10;
        int i15 = (i14 + i11) - i10;
        int i16 = i14 + i10;
        while (i16 < i15) {
            int i17 = i16 + 1;
            int i18 = i17 + 1;
            int i19 = i18 + 1;
            float f21 = (fArr[i16] * f10) + (fArr[i17] * f11) + (fArr[i18] * f12);
            int i20 = i19 + 1;
            float f22 = f21 + (fArr[i19] * f13);
            int i21 = i20 + 1;
            float f23 = f22 + (fArr[i20] * f14);
            int i22 = i21 + 1;
            float f24 = f23 + (fArr[i21] * f15);
            int i23 = i22 + 1;
            float f25 = f24 + (fArr[i22] * f16);
            int i24 = i23 + 1;
            float f26 = f25 + (fArr[i23] * f17);
            int i25 = i24 + 1;
            fArr2[i13] = f26 + (fArr[i24] * f18) + (fArr[i25] * f19) + (fArr[i25 + 1] * f20);
            i16 = i17;
            i13++;
        }
    }

    public static /* synthetic */ void r(c4.a aVar, int i10, c4.a aVar2, int i11, float[] fArr, float f10, float f11, float f12, float[] fArr2, int i12) {
        int i13 = aVar.f6218c + (aVar.f6219d * i12) + i10;
        int i14 = (aVar2.f6218c + (i12 * aVar2.f6219d)) - i10;
        int i15 = (i11 + i14) - i10;
        int i16 = i14 + i10;
        while (i16 < i15) {
            int i17 = i16 + 1;
            fArr2[i13] = (fArr[i16] * f10) + (fArr[i17] * f11) + (fArr[i17 + 1] * f12);
            i16 = i17;
            i13++;
        }
    }

    public static /* synthetic */ void s(c4.a aVar, int i10, c4.a aVar2, int i11, float[] fArr, float f10, float f11, float f12, float f13, float f14, float[] fArr2, int i12) {
        int i13 = aVar.f6218c + (aVar.f6219d * i12) + i10;
        int i14 = (aVar2.f6218c + (i12 * aVar2.f6219d)) - i10;
        int i15 = (i11 + i14) - i10;
        int i16 = i14 + i10;
        while (i16 < i15) {
            int i17 = i16 + 1;
            int i18 = i17 + 1;
            int i19 = i18 + 1;
            fArr2[i13] = (fArr[i16] * f10) + (fArr[i17] * f11) + (fArr[i18] * f12) + (fArr[i19] * f13) + (fArr[i19 + 1] * f14);
            i16 = i17;
            i13++;
        }
    }

    public static /* synthetic */ void t(c4.a aVar, int i10, c4.a aVar2, int i11, float[] fArr, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float[] fArr2, int i12) {
        int i13 = aVar.f6218c + (aVar.f6219d * i12) + i10;
        int i14 = (aVar2.f6218c + (i12 * aVar2.f6219d)) - i10;
        int i15 = (i11 + i14) - i10;
        int i16 = i14 + i10;
        while (i16 < i15) {
            int i17 = i16 + 1;
            int i18 = i17 + 1;
            int i19 = i18 + 1;
            float f17 = (fArr[i16] * f10) + (fArr[i17] * f11) + (fArr[i18] * f12);
            int i20 = i19 + 1;
            float f18 = f17 + (fArr[i19] * f13);
            int i21 = i20 + 1;
            fArr2[i13] = f18 + (fArr[i20] * f14) + (fArr[i21] * f15) + (fArr[i21 + 1] * f16);
            i16 = i17;
            i13++;
        }
    }

    public static /* synthetic */ void u(c4.a aVar, int i10, c4.a aVar2, int i11, float[] fArr, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float[] fArr2, int i12) {
        int i13 = aVar.f6218c + (aVar.f6219d * i12) + i10;
        int i14 = (aVar2.f6218c + (aVar2.f6219d * i12)) - i10;
        int i15 = (i14 + i11) - i10;
        int i16 = i14 + i10;
        while (i16 < i15) {
            int i17 = i16 + 1;
            int i18 = i17 + 1;
            int i19 = i18 + 1;
            float f19 = (fArr[i16] * f10) + (fArr[i17] * f11) + (fArr[i18] * f12);
            int i20 = i19 + 1;
            float f20 = f19 + (fArr[i19] * f13);
            int i21 = i20 + 1;
            float f21 = f20 + (fArr[i20] * f14);
            int i22 = i21 + 1;
            float f22 = f21 + (fArr[i21] * f15);
            int i23 = i22 + 1;
            fArr2[i13] = f22 + (fArr[i22] * f16) + (fArr[i23] * f17) + (fArr[i23 + 1] * f18);
            i16 = i17;
            i13++;
        }
    }

    public static /* synthetic */ void v(c4.a aVar, c4.a aVar2, int i10, int i11, float[] fArr, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float[] fArr2, int i12) {
        int i13 = aVar.f6218c + (aVar.f6219d * i12);
        int i14 = aVar2.f6218c + ((i12 - i10) * aVar2.f6219d);
        int i15 = i14 + i11;
        while (i14 < i15) {
            int i16 = aVar2.f6219d;
            int i17 = i14 + i16;
            int i18 = i17 + i16;
            int i19 = i18 + i16;
            int i20 = i19 + i16;
            int i21 = i20 + i16;
            int i22 = i21 + i16;
            int i23 = i22 + i16;
            int i24 = i23 + i16;
            int i25 = i24 + i16;
            fArr2[i13] = (fArr[i14] * f10) + (fArr[i17] * f11) + (fArr[i18] * f12) + (fArr[i19] * f13) + (fArr[i20] * f14) + (fArr[i21] * f15) + (fArr[i22] * f16) + (fArr[i23] * f17) + (fArr[i24] * f18) + (fArr[i25] * f19) + (fArr[i25 + i16] * f20);
            i14++;
            i13++;
        }
    }

    public static /* synthetic */ void w(c4.a aVar, c4.a aVar2, int i10, int i11, float[] fArr, float f10, float f11, float f12, float[] fArr2, int i12) {
        int i13 = aVar.f6218c + (aVar.f6219d * i12);
        int i14 = aVar2.f6218c + ((i12 - i10) * aVar2.f6219d);
        int i15 = i11 + i14;
        while (i14 < i15) {
            int i16 = aVar2.f6219d;
            int i17 = i14 + i16;
            fArr2[i13] = (fArr[i14] * f10) + (fArr[i17] * f11) + (fArr[i17 + i16] * f12);
            i14++;
            i13++;
        }
    }

    public static /* synthetic */ void x(c4.a aVar, c4.a aVar2, int i10, int i11, float[] fArr, float f10, float f11, float f12, float f13, float f14, float[] fArr2, int i12) {
        int i13 = aVar.f6218c + (aVar.f6219d * i12);
        int i14 = aVar2.f6218c + ((i12 - i10) * aVar2.f6219d);
        int i15 = i11 + i14;
        while (i14 < i15) {
            int i16 = aVar2.f6219d;
            int i17 = i14 + i16;
            int i18 = i17 + i16;
            int i19 = i18 + i16;
            fArr2[i13] = (fArr[i14] * f10) + (fArr[i17] * f11) + (fArr[i18] * f12) + (fArr[i19] * f13) + (fArr[i19 + i16] * f14);
            i14++;
            i13++;
        }
    }

    public static /* synthetic */ void y(c4.a aVar, c4.a aVar2, int i10, int i11, float[] fArr, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float[] fArr2, int i12) {
        int i13 = aVar.f6218c + (aVar.f6219d * i12);
        int i14 = aVar2.f6218c + ((i12 - i10) * aVar2.f6219d);
        int i15 = i14 + i11;
        while (i14 < i15) {
            int i16 = aVar2.f6219d;
            int i17 = i14 + i16;
            int i18 = i17 + i16;
            int i19 = i18 + i16;
            int i20 = i19 + i16;
            int i21 = i20 + i16;
            fArr2[i13] = (fArr[i14] * f10) + (fArr[i17] * f11) + (fArr[i18] * f12) + (fArr[i19] * f13) + (fArr[i20] * f14) + (fArr[i21] * f15) + (fArr[i21 + i16] * f16);
            i14++;
            i13++;
        }
    }

    public static /* synthetic */ void z(c4.a aVar, c4.a aVar2, int i10, int i11, float[] fArr, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float[] fArr2, int i12) {
        int i13 = aVar.f6218c + (aVar.f6219d * i12);
        int i14 = aVar2.f6218c + ((i12 - i10) * aVar2.f6219d);
        int i15 = i14 + i11;
        while (i14 < i15) {
            int i16 = aVar2.f6219d;
            int i17 = i14 + i16;
            int i18 = i17 + i16;
            int i19 = i18 + i16;
            int i20 = i19 + i16;
            int i21 = i20 + i16;
            int i22 = i21 + i16;
            int i23 = i22 + i16;
            fArr2[i13] = (fArr[i14] * f10) + (fArr[i17] * f11) + (fArr[i18] * f12) + (fArr[i19] * f13) + (fArr[i20] * f14) + (fArr[i21] * f15) + (fArr[i22] * f16) + (fArr[i23] * f17) + (fArr[i23 + i16] * f18);
            i14++;
            i13++;
        }
    }
}
