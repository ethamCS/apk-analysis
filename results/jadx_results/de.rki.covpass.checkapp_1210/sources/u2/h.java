package u2;

import j$.util.function.IntConsumer;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public class h {
    public static void g(z3.b bVar, final c4.a aVar, final c4.a aVar2) {
        final float[] fArr = aVar.V3;
        final float[] fArr2 = aVar2.V3;
        final float[] fArr3 = bVar.f26447c;
        final int a10 = bVar.a();
        final int c10 = bVar.c();
        final int p10 = aVar.p();
        ll.b.f(0, aVar.f6221x, new IntConsumer() { // from class: u2.b
            @Override // j$.util.function.IntConsumer
            public final void accept(int i10) {
                h.j(c4.a.this, a10, aVar, p10, c10, fArr, fArr3, fArr2, i10);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void h(z3.d dVar, final c4.k kVar, final c4.d dVar2, final int i10) {
        final short[] sArr = kVar.V3;
        final short[] sArr2 = dVar2.V3;
        final int[] iArr = dVar.f26449c;
        final int a10 = dVar.a();
        final int c10 = dVar.c();
        final int i11 = i10 / 2;
        final int p10 = kVar.p();
        ll.b.f(0, kVar.f6221x, new IntConsumer() { // from class: u2.d
            @Override // j$.util.function.IntConsumer
            public final void accept(int i12) {
                h.l(c4.d.this, a10, kVar, p10, c10, sArr, iArr, sArr2, i11, i10, i12);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void i(z3.d dVar, final c4.l lVar, final c4.e eVar, final int i10) {
        final byte[] bArr = lVar.V3;
        final byte[] bArr2 = eVar.V3;
        final int[] iArr = dVar.f26449c;
        final int a10 = dVar.a();
        final int c10 = dVar.c();
        final int i11 = i10 / 2;
        final int p10 = lVar.p();
        ll.b.f(0, lVar.f6221x, new IntConsumer() { // from class: u2.e
            @Override // j$.util.function.IntConsumer
            public final void accept(int i12) {
                h.k(c4.e.this, a10, lVar, p10, c10, bArr, iArr, bArr2, i11, i10, i12);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static /* synthetic */ void j(c4.a aVar, int i10, c4.a aVar2, int i11, int i12, float[] fArr, float[] fArr2, float[] fArr3, int i13) {
        int i14 = aVar.f6218c + (aVar.f6219d * i13) + i10;
        int i15 = aVar2.f6218c + (i13 * aVar2.f6219d);
        int i16 = (i11 + i15) - (i12 - 1);
        while (i15 < i16) {
            float f10 = 0.0f;
            int i17 = 0;
            int i18 = i15;
            while (i17 < i12) {
                f10 += fArr[i18] * fArr2[i17];
                i17++;
                i18++;
            }
            fArr3[i14] = f10;
            i15++;
            i14++;
        }
    }

    public static /* synthetic */ void k(c4.e eVar, int i10, c4.l lVar, int i11, int i12, byte[] bArr, int[] iArr, byte[] bArr2, int i13, int i14, int i15) {
        int i16 = eVar.f6218c + (eVar.f6219d * i15) + i10;
        int i17 = lVar.f6218c + (i15 * lVar.f6219d);
        int i18 = (i11 + i17) - (i12 - 1);
        while (i17 < i18) {
            int i19 = 0;
            int i20 = i17;
            int i21 = 0;
            while (i19 < i12) {
                i21 += (bArr[i20] & 255) * iArr[i19];
                i19++;
                i20++;
            }
            bArr2[i16] = (byte) ((i21 + i13) / i14);
            i17++;
            i16++;
        }
    }

    public static /* synthetic */ void l(c4.d dVar, int i10, c4.k kVar, int i11, int i12, short[] sArr, int[] iArr, short[] sArr2, int i13, int i14, int i15) {
        int i16 = dVar.f6218c + (dVar.f6219d * i15) + i10;
        int i17 = kVar.f6218c + (i15 * kVar.f6219d);
        int i18 = (i11 + i17) - (i12 - 1);
        while (i17 < i18) {
            int i19 = 0;
            int i20 = i17;
            int i21 = 0;
            while (i19 < i12) {
                i21 += (sArr[i20] & 65535) * iArr[i19];
                i19++;
                i20++;
            }
            sArr2[i16] = (short) ((i21 + i13) / i14);
            i17++;
            i16++;
        }
    }

    public static /* synthetic */ void m(c4.a aVar, float[] fArr, int i10, int i11, c4.a aVar2, int i12, float[] fArr2, float[] fArr3, int i13) {
        int i14 = aVar.f6218c + (aVar.f6219d * i13);
        Arrays.fill(fArr, i14, i14 + i10, 0.0f);
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = aVar2.f6218c + (((i13 - i12) + i15) * aVar2.f6219d);
            int i17 = i16 + i10;
            float f10 = fArr2[i15];
            int i18 = i14;
            while (i16 < i17) {
                fArr[i18] = fArr[i18] + (fArr3[i16] * f10);
                i16++;
                i18++;
            }
        }
    }

    public static /* synthetic */ void n(int i10, int i11, int[] iArr, c4.l lVar, int i12, byte[] bArr, c4.e eVar, byte[] bArr2, int i13, double d10, ok.g gVar, int i14, int i15) {
        int[] d11 = v3.a.d(gVar, i10, true);
        for (int i16 = i14; i16 < i15; i16++) {
            for (int i17 = 0; i17 < i11; i17++) {
                int i18 = iArr[i17];
                int i19 = lVar.f6218c + (((i16 - i12) + i17) * lVar.f6219d);
                int i20 = 0;
                while (i20 < i10) {
                    d11[i20] = d11[i20] + ((bArr[i19] & 255) * i18);
                    i20++;
                    i19++;
                }
            }
            int i21 = eVar.f6218c + (eVar.f6219d * i16);
            int i22 = 0;
            while (i22 < i10) {
                bArr2[i21] = (byte) ((d11[i22] + i13) * d10);
                i22++;
                i21++;
            }
            Arrays.fill(d11, 0, i10, 0);
        }
    }

    public static /* synthetic */ void o(int i10, int i11, int[] iArr, c4.k kVar, int i12, short[] sArr, c4.d dVar, short[] sArr2, int i13, double d10, ok.g gVar, int i14, int i15) {
        int[] d11 = v3.a.d(gVar, i10, true);
        for (int i16 = i14; i16 < i15; i16++) {
            for (int i17 = 0; i17 < i11; i17++) {
                int i18 = iArr[i17];
                int i19 = kVar.f6218c + (((i16 - i12) + i17) * kVar.f6219d);
                int i20 = 0;
                while (i20 < i10) {
                    d11[i20] = d11[i20] + ((sArr[i19] & 65535) * i18);
                    i20++;
                    i19++;
                }
            }
            int i21 = dVar.f6218c + (dVar.f6219d * i16);
            int i22 = 0;
            while (i22 < i10) {
                sArr2[i21] = (short) ((d11[i22] + i13) * d10);
                i22++;
                i21++;
            }
            Arrays.fill(d11, 0, i10, 0);
        }
    }

    public static void p(z3.b bVar, final c4.a aVar, final c4.a aVar2) {
        final float[] fArr = aVar.V3;
        final float[] fArr2 = aVar2.V3;
        final float[] fArr3 = bVar.f26447c;
        final int a10 = bVar.a();
        final int c10 = bVar.c();
        final int p10 = aVar2.p();
        ll.b.f(a10, aVar2.g() - ((c10 - a10) - 1), new IntConsumer() { // from class: u2.c
            @Override // j$.util.function.IntConsumer
            public final void accept(int i10) {
                h.m(c4.a.this, fArr2, p10, c10, aVar, a10, fArr3, fArr, i10);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void q(z3.d dVar, final c4.k kVar, final c4.d dVar2, int i10, ll.d<ok.g> dVar3) {
        ll.d a10 = v3.a.a(dVar3, m3.g.f16265a);
        final short[] sArr = kVar.V3;
        final short[] sArr2 = dVar2.V3;
        final int[] iArr = dVar.f26449c;
        final int a11 = dVar.a();
        final int c10 = dVar.c();
        final int i11 = i10 / 2;
        final double d10 = 1.0d / i10;
        final int p10 = dVar2.p();
        ll.b.d(a11, dVar2.g() - ((c10 - a11) - 1), a10, new ll.h() { // from class: u2.f
            @Override // ll.h
            public final void a(Object obj, int i12, int i13) {
                h.o(p10, c10, iArr, kVar, a11, sArr, dVar2, sArr2, i11, d10, (ok.g) obj, i12, i13);
            }
        });
    }

    public static void r(z3.d dVar, final c4.l lVar, final c4.e eVar, int i10, ll.d<ok.g> dVar2) {
        ll.d a10 = v3.a.a(dVar2, m3.g.f16265a);
        final byte[] bArr = lVar.V3;
        final byte[] bArr2 = eVar.V3;
        final int[] iArr = dVar.f26449c;
        final int a11 = dVar.a();
        final int c10 = dVar.c();
        final int i11 = i10 / 2;
        final double d10 = 1.0d / i10;
        final int p10 = eVar.p();
        ll.b.d(a11, eVar.g() - ((c10 - a11) - 1), a10, new ll.h() { // from class: u2.g
            @Override // ll.h
            public final void a(Object obj, int i12, int i13) {
                h.n(p10, c10, iArr, lVar, a11, bArr, eVar, bArr2, i11, d10, (ok.g) obj, i12, i13);
            }
        });
    }
}
