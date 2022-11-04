package f;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class m extends AbstractList<f> implements RandomAccess {

    /* renamed from: b */
    final f[] f4461b;

    /* renamed from: c */
    final int[] f4462c;

    private m(f[] fVarArr, int[] iArr) {
        this.f4461b = fVarArr;
        this.f4462c = iArr;
    }

    private static void a(long j, c cVar, int i, List<f> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        c cVar2;
        int i6;
        int i7 = i2;
        if (i7 < i3) {
            for (int i8 = i7; i8 < i3; i8++) {
                if (list.get(i8).r() < i) {
                    throw new AssertionError();
                }
            }
            f fVar = list.get(i2);
            f fVar2 = list.get(i3 - 1);
            int i9 = -1;
            if (i == fVar.r()) {
                i9 = list2.get(i7).intValue();
                i7++;
                fVar = list.get(i7);
            }
            int i10 = i7;
            if (fVar.k(i) == fVar2.k(i)) {
                int i11 = 0;
                int min = Math.min(fVar.r(), fVar2.r());
                for (int i12 = i; i12 < min && fVar.k(i12) == fVar2.k(i12); i12++) {
                    i11++;
                }
                long c2 = 1 + j + c(cVar) + 2 + i11;
                cVar.G0(-i11);
                cVar.G0(i9);
                int i13 = i;
                while (true) {
                    i4 = i + i11;
                    if (i13 >= i4) {
                        break;
                    }
                    cVar.G0(fVar.k(i13) & 255);
                    i13++;
                }
                if (i10 + 1 == i3) {
                    if (i4 != list.get(i10).r()) {
                        throw new AssertionError();
                    }
                    cVar.G0(list2.get(i10).intValue());
                    return;
                }
                c cVar3 = new c();
                cVar.G0((int) ((c(cVar3) + c2) * (-1)));
                a(c2, cVar3, i4, list, i10, i3, list2);
                cVar.i(cVar3, cVar3.v0());
                return;
            }
            int i14 = 1;
            for (int i15 = i10 + 1; i15 < i3; i15++) {
                if (list.get(i15 - 1).k(i) != list.get(i15).k(i)) {
                    i14++;
                }
            }
            long c3 = j + c(cVar) + 2 + (i14 * 2);
            cVar.G0(i14);
            cVar.G0(i9);
            for (int i16 = i10; i16 < i3; i16++) {
                byte k = list.get(i16).k(i);
                if (i16 == i10 || k != list.get(i16 - 1).k(i)) {
                    cVar.G0(k & 255);
                }
            }
            c cVar4 = new c();
            int i17 = i10;
            while (i17 < i3) {
                byte k2 = list.get(i17).k(i);
                int i18 = i17 + 1;
                int i19 = i18;
                while (true) {
                    if (i19 >= i3) {
                        i5 = i3;
                        break;
                    } else if (k2 != list.get(i19).k(i)) {
                        i5 = i19;
                        break;
                    } else {
                        i19++;
                    }
                }
                if (i18 == i5 && i + 1 == list.get(i17).r()) {
                    cVar.G0(list2.get(i17).intValue());
                    i6 = i5;
                    cVar2 = cVar4;
                } else {
                    cVar.G0((int) ((c(cVar4) + c3) * (-1)));
                    i6 = i5;
                    cVar2 = cVar4;
                    a(c3, cVar4, i + 1, list, i17, i5, list2);
                }
                cVar4 = cVar2;
                i17 = i6;
            }
            c cVar5 = cVar4;
            cVar.i(cVar5, cVar5.v0());
            return;
        }
        throw new AssertionError();
    }

    private static int c(c cVar) {
        return (int) (cVar.v0() / 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static f.m d(f.f... r10) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.m.d(f.f[]):f.m");
    }

    /* renamed from: b */
    public f get(int i) {
        return this.f4461b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4461b.length;
    }
}
