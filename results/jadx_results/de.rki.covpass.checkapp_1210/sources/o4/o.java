package o4;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p4.c;
/* loaded from: classes.dex */
public class o implements n0<l4.d> {

    /* renamed from: a */
    private int f17523a;

    public o(int i10) {
        this.f17523a = i10;
    }

    private l4.d b(l4.d dVar, List<Float> list) {
        int i10 = this.f17523a * 4;
        if (list.size() <= i10) {
            return dVar;
        }
        float[] b10 = dVar.b();
        int[] a10 = dVar.a();
        int size = (list.size() - i10) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i11 = 0;
        while (i10 < list.size()) {
            if (i10 % 2 == 0) {
                fArr[i11] = list.get(i10).floatValue();
            } else {
                fArr2[i11] = list.get(i10).floatValue();
                i11++;
            }
            i10++;
        }
        float[] e10 = e(dVar.b(), fArr);
        int length = e10.length;
        int[] iArr = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            float f10 = e10[i12];
            int binarySearch = Arrays.binarySearch(b10, f10);
            int binarySearch2 = Arrays.binarySearch(fArr, f10);
            if (binarySearch < 0 || binarySearch2 > 0) {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                iArr[i12] = c(f10, fArr2[binarySearch2], b10, a10);
            } else {
                iArr[i12] = d(f10, a10[binarySearch], fArr, fArr2);
            }
        }
        return new l4.d(e10, iArr);
    }

    private int c(float f10, float f11, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f10 == fArr[0]) {
            return iArr[0];
        }
        for (int i10 = 1; i10 < fArr.length; i10++) {
            if (fArr[i10] >= f10 || i10 == fArr.length - 1) {
                int i11 = i10 - 1;
                float f12 = (f10 - fArr[i11]) / (fArr[i10] - fArr[i11]);
                int i12 = iArr[i10];
                int i13 = iArr[i11];
                return Color.argb((int) (f11 * 255.0f), q4.g.j(Color.red(i13), Color.red(i12), f12), q4.g.j(Color.green(i13), Color.green(i12), f12), q4.g.j(Color.blue(i13), Color.blue(i12), f12));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    private int d(float f10, int i10, float[] fArr, float[] fArr2) {
        float f11;
        if (fArr2.length >= 2 && f10 > fArr[0]) {
            for (int i11 = 1; i11 < fArr.length; i11++) {
                int i12 = (fArr[i11] > f10 ? 1 : (fArr[i11] == f10 ? 0 : -1));
                if (i12 >= 0 || i11 == fArr.length - 1) {
                    if (i12 <= 0) {
                        f11 = fArr2[i11];
                    } else {
                        int i13 = i11 - 1;
                        f11 = q4.g.i(fArr2[i13], fArr2[i11], (f10 - fArr[i13]) / (fArr[i11] - fArr[i13]));
                    }
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        f11 = fArr2[0];
        return Color.argb((int) (f11 * 255.0f), Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    protected static float[] e(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            float f10 = Float.NaN;
            float f11 = i11 < fArr.length ? fArr[i11] : Float.NaN;
            if (i12 < fArr2.length) {
                f10 = fArr2[i12];
            }
            if (Float.isNaN(f10) || f11 < f10) {
                fArr3[i13] = f11;
                i11++;
            } else if (Float.isNaN(f11) || f10 < f11) {
                fArr3[i13] = f10;
                i12++;
            } else {
                fArr3[i13] = f11;
                i11++;
                i12++;
                i10++;
            }
        }
        return i10 == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i10);
    }

    /* renamed from: f */
    public l4.d a(p4.c cVar, float f10) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = cVar.B() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.e();
        }
        while (cVar.j()) {
            arrayList.add(Float.valueOf((float) cVar.p()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.f17523a = 2;
        }
        if (z10) {
            cVar.h();
        }
        if (this.f17523a == -1) {
            this.f17523a = arrayList.size() / 4;
        }
        int i10 = this.f17523a;
        float[] fArr = new float[i10];
        int[] iArr = new int[i10];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f17523a * 4; i13++) {
            int i14 = i13 / 4;
            double floatValue = arrayList.get(i13).floatValue();
            int i15 = i13 % 4;
            if (i15 == 0) {
                if (i14 > 0) {
                    float f11 = (float) floatValue;
                    if (fArr[i14 - 1] >= f11) {
                        fArr[i14] = f11 + 0.01f;
                    }
                }
                fArr[i14] = (float) floatValue;
            } else if (i15 == 1) {
                i11 = (int) (floatValue * 255.0d);
            } else if (i15 == 2) {
                i12 = (int) (floatValue * 255.0d);
            } else if (i15 == 3) {
                iArr[i14] = Color.argb(255, i11, i12, (int) (floatValue * 255.0d));
            }
        }
        return b(new l4.d(fArr, iArr), arrayList);
    }
}
