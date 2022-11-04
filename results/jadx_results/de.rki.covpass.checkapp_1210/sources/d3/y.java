package d3;

import j$.util.function.IntConsumer;
import java.util.Objects;
/* loaded from: classes.dex */
public class y {
    public static /* synthetic */ void d(int i10, int i11, int i12, int i13, int i14, float[] fArr, float[] fArr2, int i15) {
        int i16 = i10 + (i11 * i15);
        int i17 = i12 + (i15 * i13);
        int i18 = i14 + i16;
        while (i16 < i18) {
            float f10 = fArr[i16];
            fArr2[i17] = f10 * f10;
            i16++;
            i17++;
        }
    }

    public static /* synthetic */ void e(int i10, int i11, int i12, int i13, int i14, float[] fArr, float[] fArr2, int i15) {
        int i16 = i10 + (i11 * i15);
        int i17 = i12 + (i15 * i13);
        int i18 = i14 + i16;
        while (i16 < i18) {
            fArr[i17] = (float) Math.sqrt(fArr2[i16]);
            i16++;
            i17++;
        }
    }

    public static /* synthetic */ void f(c4.a aVar, c4.a aVar2, c4.a aVar3, int i10, int i11) {
        int j10 = aVar.j() + (aVar.k() * i11);
        int j11 = aVar2.j() + (aVar2.k() * i11);
        int j12 = aVar3.j() + (i11 * aVar3.k());
        int i12 = i10 + j10;
        while (j10 < i12) {
            aVar3.V3[j12] = aVar.V3[j10] - aVar2.V3[j11];
            j10++;
            j11++;
            j12++;
        }
    }

    public static void g(final float[] fArr, final int i10, final int i11, final float[] fArr2, final int i12, final int i13, int i14, final int i15) {
        ll.b.f(0, i14, new IntConsumer() { // from class: d3.v
            @Override // j$.util.function.IntConsumer
            public final void accept(int i16) {
                y.d(i10, i11, i12, i13, i15, fArr, fArr2, i16);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void h(final float[] fArr, final int i10, final int i11, final float[] fArr2, final int i12, final int i13, int i14, final int i15) {
        ll.b.f(0, i14, new IntConsumer() { // from class: d3.w
            @Override // j$.util.function.IntConsumer
            public final void accept(int i16) {
                y.e(i10, i11, i12, i13, i15, fArr2, fArr, i16);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void i(final c4.a aVar, final c4.a aVar2, final c4.a aVar3) {
        int g10 = aVar.g();
        final int p10 = aVar.p();
        ll.b.f(0, g10, new IntConsumer() { // from class: d3.x
            @Override // j$.util.function.IntConsumer
            public final void accept(int i10) {
                y.f(c4.a.this, aVar2, aVar3, p10, i10);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }
}
