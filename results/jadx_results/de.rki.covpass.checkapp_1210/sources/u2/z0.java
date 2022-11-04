package u2;

import j$.util.function.IntConsumer;
import java.util.Objects;
/* loaded from: classes.dex */
public class z0 {
    public static void g(final c4.a aVar, final c4.a aVar2, final int i10, final int i11) {
        final float f10 = i11;
        ll.b.f(0, aVar.f6221x, new IntConsumer() { // from class: u2.t0
            @Override // j$.util.function.IntConsumer
            public final void accept(int i12) {
                z0.l(c4.a.this, aVar2, i10, i11, f10, i12);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void h(final c4.k kVar, final c4.d dVar, final int i10, final int i11) {
        final int i12 = i11 / 2;
        ll.b.f(0, kVar.f6221x, new IntConsumer() { // from class: u2.u0
            @Override // j$.util.function.IntConsumer
            public final void accept(int i13) {
                z0.k(c4.k.this, dVar, i10, i11, i12, i11, i13);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void i(final c4.l lVar, final c4.e eVar, final int i10, final int i11) {
        final int i12 = i11 / 2;
        ll.b.f(0, lVar.f6221x, new IntConsumer() { // from class: u2.v0
            @Override // j$.util.function.IntConsumer
            public final void accept(int i13) {
                z0.j(c4.l.this, eVar, i10, i11, i12, i11, i13);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static /* synthetic */ void j(c4.l lVar, c4.e eVar, int i10, int i11, int i12, int i13, int i14) {
        int i15 = lVar.f6218c + (lVar.f6219d * i14);
        int i16 = eVar.f6218c + (eVar.f6219d * i14) + i10;
        int i17 = i15 + i11;
        int i18 = 0;
        while (i15 < i17) {
            i18 += lVar.V3[i15] & 255;
            i15++;
        }
        int i19 = i16 + 1;
        eVar.V3[i16] = (byte) ((i18 + i12) / i13);
        int i20 = (lVar.f6220q + i15) - i11;
        while (i15 < i20) {
            byte[] bArr = lVar.V3;
            i18 = (i18 - (bArr[i15 - i11] & 255)) + (bArr[i15] & 255);
            eVar.V3[i19] = (byte) ((i18 + i12) / i13);
            i15++;
            i19++;
        }
    }

    public static /* synthetic */ void k(c4.k kVar, c4.d dVar, int i10, int i11, int i12, int i13, int i14) {
        int i15 = kVar.f6218c + (kVar.f6219d * i14);
        int i16 = dVar.f6218c + (dVar.f6219d * i14) + i10;
        int i17 = i15 + i11;
        int i18 = 0;
        while (i15 < i17) {
            i18 += 65535 & kVar.V3[i15];
            i15++;
        }
        int i19 = i16 + 1;
        dVar.V3[i16] = (short) ((i18 + i12) / i13);
        int i20 = (kVar.f6220q + i15) - i11;
        while (i15 < i20) {
            short[] sArr = kVar.V3;
            i18 = (i18 - (sArr[i15 - i11] & 65535)) + (sArr[i15] & 65535);
            dVar.V3[i19] = (short) ((i18 + i12) / i13);
            i15++;
            i19++;
        }
    }

    public static /* synthetic */ void l(c4.a aVar, c4.a aVar2, int i10, int i11, float f10, int i12) {
        int i13 = aVar.f6218c + (aVar.f6219d * i12);
        int i14 = aVar2.f6218c + (aVar2.f6219d * i12) + i10;
        int i15 = i13 + i11;
        float f11 = 0.0f;
        while (i13 < i15) {
            f11 += aVar.V3[i13];
            i13++;
        }
        int i16 = i14 + 1;
        aVar2.V3[i14] = f11 / f10;
        int i17 = (aVar.f6220q + i13) - i11;
        while (i13 < i17) {
            float[] fArr = aVar.V3;
            f11 = (f11 - fArr[i13 - i11]) + fArr[i13];
            aVar2.V3[i16] = f11 / f10;
            i13++;
            i16++;
        }
    }

    public static /* synthetic */ void m(c4.l lVar, int i10, c4.e eVar, int i11, int i12, int i13, int i14, int i15, ok.g gVar, int i16, int i17) {
        int[] d10 = v3.a.d(gVar, lVar.f6220q, false);
        for (int i18 = 0; i18 < lVar.f6220q; i18++) {
            int i19 = lVar.f6218c;
            int i20 = lVar.f6219d;
            int i21 = i19 + ((i16 - i10) * i20) + i18;
            int i22 = eVar.f6218c + (eVar.f6219d * i16) + i18;
            int i23 = (i20 * i11) + i21;
            int i24 = 0;
            while (i21 < i23) {
                i24 += lVar.V3[i21] & 255;
                i21 += lVar.f6219d;
            }
            d10[i18] = i24;
            eVar.V3[i22] = (byte) ((i24 + i12) / i13);
        }
        for (int i25 = i16 + 1; i25 < i17; i25++) {
            int i26 = lVar.f6218c + ((i25 + i14) * lVar.f6219d);
            int i27 = eVar.f6218c + (eVar.f6219d * i25);
            int i28 = 0;
            while (i28 < lVar.f6220q) {
                int i29 = d10[i28];
                byte[] bArr = lVar.V3;
                int i30 = (i29 - (bArr[i26 - i15] & 255)) + (bArr[i26] & 255);
                d10[i28] = i30;
                eVar.V3[i27] = (byte) ((i30 + i12) / i13);
                i28++;
                i26++;
                i27++;
            }
        }
    }

    public static /* synthetic */ void n(c4.k kVar, int i10, c4.d dVar, int i11, int i12, int i13, int i14, int i15, ok.g gVar, int i16, int i17) {
        int[] d10 = v3.a.d(gVar, kVar.f6220q, false);
        for (int i18 = 0; i18 < kVar.f6220q; i18++) {
            int i19 = kVar.f6218c;
            int i20 = kVar.f6219d;
            int i21 = i19 + ((i16 - i10) * i20) + i18;
            int i22 = dVar.f6218c + (dVar.f6219d * i16) + i18;
            int i23 = (i20 * i11) + i21;
            int i24 = 0;
            while (i21 < i23) {
                i24 += kVar.V3[i21] & 65535;
                i21 += kVar.f6219d;
            }
            d10[i18] = i24;
            dVar.V3[i22] = (short) ((i24 + i12) / i13);
        }
        for (int i25 = i16 + 1; i25 < i17; i25++) {
            int i26 = kVar.f6218c + ((i25 + i14) * kVar.f6219d);
            int i27 = dVar.f6218c + (dVar.f6219d * i25);
            int i28 = 0;
            while (i28 < kVar.f6220q) {
                int i29 = d10[i28];
                short[] sArr = kVar.V3;
                int i30 = (i29 - (sArr[i26 - i15] & 65535)) + (sArr[i26] & 65535);
                d10[i28] = i30;
                dVar.V3[i27] = (short) ((i30 + i12) / i13);
                i28++;
                i26++;
                i27++;
            }
        }
    }

    public static /* synthetic */ void o(c4.a aVar, int i10, c4.a aVar2, int i11, float f10, int i12, int i13, ok.e eVar, int i14, int i15) {
        float[] c10 = v3.a.c(eVar, aVar.f6220q, false);
        for (int i16 = 0; i16 < aVar.f6220q; i16++) {
            int i17 = aVar.f6218c;
            int i18 = aVar.f6219d;
            int i19 = i17 + ((i14 - i10) * i18) + i16;
            int i20 = aVar2.f6218c + (aVar2.f6219d * i14) + i16;
            float f11 = 0.0f;
            int i21 = (i18 * i11) + i19;
            while (i19 < i21) {
                f11 += aVar.V3[i19];
                i19 += aVar.f6219d;
            }
            c10[i16] = f11;
            aVar2.V3[i20] = f11 / f10;
        }
        for (int i22 = i14 + 1; i22 < i15; i22++) {
            int i23 = aVar.f6218c + ((i22 + i12) * aVar.f6219d);
            int i24 = aVar2.f6218c + (aVar2.f6219d * i22);
            int i25 = 0;
            while (i25 < aVar.f6220q) {
                float f12 = c10[i25];
                float[] fArr = aVar.V3;
                float f13 = (f12 - fArr[i23 - i13]) + fArr[i23];
                c10[i25] = f13;
                aVar2.V3[i24] = f13 / f10;
                i25++;
                i23++;
                i24++;
            }
        }
    }

    public static void p(final c4.a aVar, final c4.a aVar2, final int i10, final int i11, ll.d<ok.e> dVar) {
        ll.d a10 = v3.a.a(dVar, m3.e.f16263a);
        final int i12 = i11 * aVar.f6219d;
        final int i13 = (i11 - i10) - 1;
        final float f10 = i11;
        ll.b.c(i10, aVar2.f6221x - i13, i11, a10, new ll.h() { // from class: u2.w0
            @Override // ll.h
            public final void a(Object obj, int i14, int i15) {
                z0.o(c4.a.this, i10, aVar2, i11, f10, i13, i12, (ok.e) obj, i14, i15);
            }
        });
    }

    public static void q(final c4.k kVar, final c4.d dVar, final int i10, final int i11, ll.d<ok.g> dVar2) {
        ll.d a10 = v3.a.a(dVar2, m3.g.f16265a);
        final int i12 = i11 * kVar.f6219d;
        final int i13 = (i11 - i10) - 1;
        final int i14 = i11 / 2;
        ll.b.c(i10, dVar.f6221x - i13, i11, a10, new ll.h() { // from class: u2.x0
            @Override // ll.h
            public final void a(Object obj, int i15, int i16) {
                z0.n(c4.k.this, i10, dVar, i11, i14, i11, i13, i12, (ok.g) obj, i15, i16);
            }
        });
    }

    public static void r(final c4.l lVar, final c4.e eVar, final int i10, final int i11, ll.d<ok.g> dVar) {
        ll.d a10 = v3.a.a(dVar, m3.g.f16265a);
        final int i12 = i11 * lVar.f6219d;
        final int i13 = (i11 - i10) - 1;
        final int i14 = i11 / 2;
        ll.b.c(i10, eVar.f6221x - i13, i11, a10, new ll.h() { // from class: u2.y0
            @Override // ll.h
            public final void a(Object obj, int i15, int i16) {
                z0.m(c4.l.this, i10, eVar, i11, i14, i11, i13, i12, (ok.g) obj, i15, i16);
            }
        });
    }
}
