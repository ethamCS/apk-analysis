package d3;
/* loaded from: classes.dex */
public class u {
    public static void a(float[] fArr, int i10, int i11, float[] fArr2, int i12, int i13, int i14, int i15) {
        for (int i16 = 0; i16 < i14; i16++) {
            int i17 = (i16 * i11) + i10;
            int i18 = (i16 * i13) + i12;
            int i19 = i17 + i15;
            while (i17 < i19) {
                float f10 = fArr[i17];
                fArr2[i18] = f10 * f10;
                i17++;
                i18++;
            }
        }
    }

    public static void b(float[] fArr, int i10, int i11, float[] fArr2, int i12, int i13, int i14, int i15) {
        for (int i16 = 0; i16 < i14; i16++) {
            int i17 = (i16 * i11) + i10;
            int i18 = (i16 * i13) + i12;
            int i19 = i17 + i15;
            while (i17 < i19) {
                fArr2[i18] = (float) Math.sqrt(fArr[i17]);
                i17++;
                i18++;
            }
        }
    }

    public static void c(c4.a aVar, c4.a aVar2, c4.a aVar3) {
        int g10 = aVar.g();
        int p10 = aVar.p();
        for (int i10 = 0; i10 < g10; i10++) {
            int j10 = aVar.j() + (aVar.k() * i10);
            int j11 = aVar2.j() + (aVar2.k() * i10);
            int j12 = aVar3.j() + (aVar3.k() * i10);
            int i11 = j10 + p10;
            while (j10 < i11) {
                aVar3.V3[j12] = aVar.V3[j10] - aVar2.V3[j11];
                j10++;
                j11++;
                j12++;
            }
        }
    }
}
