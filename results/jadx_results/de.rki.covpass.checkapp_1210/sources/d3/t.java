package d3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class t {
    public static /* synthetic */ Number A(float f10, int i10, int i11, int i12, float[] fArr, int i13) {
        int i14 = i10 + (i13 * i11);
        int i15 = i12 + i14;
        while (i14 < i15) {
            float f11 = fArr[i14];
            if (f11 > f10) {
                f10 = f11;
            }
            i14++;
        }
        return Float.valueOf(f10);
    }

    public static /* synthetic */ Number B(float f10, int i10, int i11, int i12, float[] fArr, int i13) {
        int i14 = i10 + (i13 * i11);
        int i15 = i12 + i14;
        while (i14 < i15) {
            float f11 = fArr[i14];
            if (f11 < f10) {
                f10 = f11;
            }
            i14++;
        }
        return Float.valueOf(f10);
    }

    public static float C(final float[] fArr, final int i10, int i11, final int i12, final int i13) {
        final float f10 = fArr[i10];
        return ll.b.g(0, i11, Float.TYPE, new ll.f() { // from class: d3.j
            @Override // ll.f
            public final Number accept(int i14) {
                Number A;
                A = t.A(f10, i10, i13, i12, fArr, i14);
                return A;
            }
        }).floatValue();
    }

    public static float D(final float[] fArr, final int i10, int i11, final int i12, final int i13) {
        final float f10 = fArr[i10];
        return ll.b.h(0, i11, Float.TYPE, new ll.f() { // from class: d3.k
            @Override // ll.f
            public final Number accept(int i14) {
                Number B;
                B = t.B(f10, i10, i13, i12, fArr, i14);
                return B;
            }
        }).floatValue();
    }

    public static void k(final c4.a aVar, final float f10, final int[] iArr) {
        Arrays.fill(iArr, 0);
        final ArrayList arrayList = new ArrayList();
        ll.b.e(0, aVar.f6221x, new ll.g() { // from class: d3.l
            @Override // ll.g
            public final void a(int i10, int i11) {
                t.x(iArr, aVar, f10, arrayList, i10, i11);
            }
        });
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            int[] iArr2 = (int[]) arrayList.get(i10);
            for (int i11 = 0; i11 < iArr.length; i11++) {
                iArr[i11] = iArr[i11] + iArr2[i11];
            }
        }
    }

    public static void l(final c4.b bVar, final double d10, final int[] iArr) {
        Arrays.fill(iArr, 0);
        final ArrayList arrayList = new ArrayList();
        ll.b.e(0, bVar.f6221x, new ll.g() { // from class: d3.m
            @Override // ll.g
            public final void a(int i10, int i11) {
                t.z(iArr, bVar, d10, arrayList, i10, i11);
            }
        });
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            int[] iArr2 = (int[]) arrayList.get(i10);
            for (int i11 = 0; i11 < iArr.length; i11++) {
                iArr[i11] = iArr[i11] + iArr2[i11];
            }
        }
    }

    public static void m(final c4.g gVar, final int i10, final int[] iArr) {
        Arrays.fill(iArr, 0);
        final ArrayList arrayList = new ArrayList();
        ll.b.e(0, gVar.f6221x, new ll.g() { // from class: d3.n
            @Override // ll.g
            public final void a(int i11, int i12) {
                t.u(iArr, gVar, i10, arrayList, i11, i12);
            }
        });
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int[] iArr2 = (int[]) arrayList.get(i11);
            for (int i12 = 0; i12 < iArr.length; i12++) {
                iArr[i12] = iArr[i12] + iArr2[i12];
            }
        }
    }

    public static void n(final c4.h hVar, final int i10, final int[] iArr) {
        Arrays.fill(iArr, 0);
        final ArrayList arrayList = new ArrayList();
        ll.b.e(0, hVar.f6221x, new ll.g() { // from class: d3.o
            @Override // ll.g
            public final void a(int i11, int i12) {
                t.v(iArr, hVar, i10, arrayList, i11, i12);
            }
        });
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int[] iArr2 = (int[]) arrayList.get(i11);
            for (int i12 = 0; i12 < iArr.length; i12++) {
                iArr[i12] = iArr[i12] + iArr2[i12];
            }
        }
    }

    public static void o(final c4.i iVar, final long j10, final int[] iArr) {
        Arrays.fill(iArr, 0);
        final ArrayList arrayList = new ArrayList();
        ll.b.e(0, iVar.f6221x, new ll.g() { // from class: d3.p
            @Override // ll.g
            public final void a(int i10, int i11) {
                t.w(iArr, iVar, j10, arrayList, i10, i11);
            }
        });
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            int[] iArr2 = (int[]) arrayList.get(i10);
            for (int i11 = 0; i11 < iArr.length; i11++) {
                iArr[i11] = iArr[i11] + iArr2[i11];
            }
        }
    }

    public static void p(final c4.j jVar, final int i10, final int[] iArr) {
        Arrays.fill(iArr, 0);
        final ArrayList arrayList = new ArrayList();
        ll.b.e(0, jVar.f6221x, new ll.g() { // from class: d3.q
            @Override // ll.g
            public final void a(int i11, int i12) {
                t.s(iArr, jVar, i10, arrayList, i11, i12);
            }
        });
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int[] iArr2 = (int[]) arrayList.get(i11);
            for (int i12 = 0; i12 < iArr.length; i12++) {
                iArr[i12] = iArr[i12] + iArr2[i12];
            }
        }
    }

    public static void q(final c4.k kVar, final int i10, final int[] iArr) {
        Arrays.fill(iArr, 0);
        final ArrayList arrayList = new ArrayList();
        ll.b.e(0, kVar.f6221x, new ll.g() { // from class: d3.r
            @Override // ll.g
            public final void a(int i11, int i12) {
                t.t(iArr, kVar, i10, arrayList, i11, i12);
            }
        });
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int[] iArr2 = (int[]) arrayList.get(i11);
            for (int i12 = 0; i12 < iArr.length; i12++) {
                iArr[i12] = iArr[i12] + iArr2[i12];
            }
        }
    }

    public static void r(final c4.l lVar, final int i10, final int[] iArr) {
        Arrays.fill(iArr, 0);
        final ArrayList arrayList = new ArrayList();
        ll.b.e(0, lVar.f6221x, new ll.g() { // from class: d3.s
            @Override // ll.g
            public final void a(int i11, int i12) {
                t.y(iArr, lVar, i10, arrayList, i11, i12);
            }
        });
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int[] iArr2 = (int[]) arrayList.get(i11);
            for (int i12 = 0; i12 < iArr.length; i12++) {
                iArr[i12] = iArr[i12] + iArr2[i12];
            }
        }
    }

    public static /* synthetic */ void s(int[] iArr, c4.j jVar, int i10, List list, int i11, int i12) {
        int[] iArr2 = new int[iArr.length];
        while (i11 < i12) {
            int i13 = jVar.f6218c + (jVar.f6219d * i11);
            int i14 = jVar.f6220q + i13;
            while (i13 < i14) {
                int i15 = i13 + 1;
                int i16 = jVar.V3[i13] - i10;
                iArr2[i16] = iArr2[i16] + 1;
                i13 = i15;
            }
            i11++;
        }
        synchronized (list) {
            list.add(iArr2);
        }
    }

    public static /* synthetic */ void t(int[] iArr, c4.k kVar, int i10, List list, int i11, int i12) {
        int[] iArr2 = new int[iArr.length];
        while (i11 < i12) {
            int i13 = kVar.f6218c + (kVar.f6219d * i11);
            int i14 = kVar.f6220q + i13;
            while (i13 < i14) {
                int i15 = i13 + 1;
                int i16 = (kVar.V3[i13] & 65535) - i10;
                iArr2[i16] = iArr2[i16] + 1;
                i13 = i15;
            }
            i11++;
        }
        synchronized (list) {
            list.add(iArr2);
        }
    }

    public static /* synthetic */ void u(int[] iArr, c4.g gVar, int i10, List list, int i11, int i12) {
        int[] iArr2 = new int[iArr.length];
        while (i11 < i12) {
            int i13 = gVar.f6218c + (gVar.f6219d * i11);
            int i14 = gVar.f6220q + i13;
            while (i13 < i14) {
                int i15 = i13 + 1;
                int i16 = gVar.V3[i13] - i10;
                iArr2[i16] = iArr2[i16] + 1;
                i13 = i15;
            }
            i11++;
        }
        synchronized (list) {
            list.add(iArr2);
        }
    }

    public static /* synthetic */ void v(int[] iArr, c4.h hVar, int i10, List list, int i11, int i12) {
        int[] iArr2 = new int[iArr.length];
        while (i11 < i12) {
            int i13 = hVar.f6218c + (hVar.f6219d * i11);
            int i14 = hVar.f6220q + i13;
            while (i13 < i14) {
                int i15 = i13 + 1;
                int i16 = hVar.V3[i13] - i10;
                iArr2[i16] = iArr2[i16] + 1;
                i13 = i15;
            }
            i11++;
        }
        synchronized (list) {
            list.add(iArr2);
        }
    }

    public static /* synthetic */ void w(int[] iArr, c4.i iVar, long j10, List list, int i10, int i11) {
        int[] iArr2 = new int[iArr.length];
        while (i10 < i11) {
            int i12 = iVar.f6218c + (iVar.f6219d * i10);
            int i13 = iVar.f6220q + i12;
            while (i12 < i13) {
                int i14 = i12 + 1;
                int i15 = (int) (iVar.V3[i12] - j10);
                iArr2[i15] = iArr2[i15] + 1;
                i12 = i14;
            }
            i10++;
        }
        synchronized (list) {
            list.add(iArr2);
        }
    }

    public static /* synthetic */ void x(int[] iArr, c4.a aVar, float f10, List list, int i10, int i11) {
        int[] iArr2 = new int[iArr.length];
        while (i10 < i11) {
            int i12 = aVar.f6218c + (aVar.f6219d * i10);
            int i13 = aVar.f6220q + i12;
            while (i12 < i13) {
                int i14 = i12 + 1;
                int i15 = (int) (aVar.V3[i12] - f10);
                iArr2[i15] = iArr2[i15] + 1;
                i12 = i14;
            }
            i10++;
        }
        synchronized (list) {
            list.add(iArr2);
        }
    }

    public static /* synthetic */ void y(int[] iArr, c4.l lVar, int i10, List list, int i11, int i12) {
        int[] iArr2 = new int[iArr.length];
        while (i11 < i12) {
            int i13 = lVar.f6218c + (lVar.f6219d * i11);
            int i14 = lVar.f6220q + i13;
            while (i13 < i14) {
                int i15 = i13 + 1;
                int i16 = (lVar.V3[i13] & 255) - i10;
                iArr2[i16] = iArr2[i16] + 1;
                i13 = i15;
            }
            i11++;
        }
        synchronized (list) {
            list.add(iArr2);
        }
    }

    public static /* synthetic */ void z(int[] iArr, c4.b bVar, double d10, List list, int i10, int i11) {
        int[] iArr2 = new int[iArr.length];
        while (i10 < i11) {
            int i12 = bVar.f6218c + (bVar.f6219d * i10);
            int i13 = bVar.f6220q + i12;
            while (i12 < i13) {
                int i14 = i12 + 1;
                int i15 = (int) (bVar.V3[i12] - d10);
                iArr2[i15] = iArr2[i15] + 1;
                i12 = i14;
            }
            i10++;
        }
        synchronized (list) {
            list.add(iArr2);
        }
    }
}
