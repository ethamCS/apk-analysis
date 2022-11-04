package p2;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class m extends rk.a {

    /* renamed from: x */
    public List<ka.c> f18819x = new ArrayList();

    private m(int i10) {
        super(i10, i10);
    }

    private void i(boolean z10) {
        int i10 = this.f21258d;
        int i11 = i10 - 1;
        int i12 = -1;
        int i13 = i11;
        while (i11 > 0) {
            if (i11 == 6 && !z10) {
                i11--;
            }
            if (!c(i13, i11)) {
                this.f18819x.add(new ka.c(i11, i13));
            }
            int i14 = i11 - 1;
            if (!c(i13, i14)) {
                this.f18819x.add(new ka.c(i14, i13));
            }
            i13 += i12;
            if (i13 < 0 || i13 >= i10) {
                i12 = -i12;
                i11 -= 2;
                i13 += i12;
            }
        }
    }

    private void j(int i10, int[] iArr, boolean z10) {
        n(0, 0, 9);
        int i11 = i10 - 8;
        k(i11, 0, 9, 8);
        k(0, i11, 8, 9);
        int i12 = i11 - 8;
        k(8, 6, 1, i12);
        k(6, 8, i12, 1);
        if (z10) {
            int i13 = i10 - 11;
            k(i13, 0, 6, 3);
            k(0, i13, 3, 6);
        }
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            for (int i16 = 0; i16 < iArr.length; i16++) {
                if ((i14 != 0 || i16 != 0) && ((i14 != iArr.length - 1 || i16 != 0) && (i14 != 0 || i16 != iArr.length - 1))) {
                    n(i15 - 2, iArr[i16] - 2, 5);
                }
            }
        }
    }

    private void k(int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            for (int i15 = 0; i15 < i12; i15++) {
                g(i10 + i14, i11 + i15, true);
            }
        }
    }

    private void n(int i10, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            for (int i14 = 0; i14 < i12; i14++) {
                g(i10 + i13, i11 + i14, true);
            }
        }
    }

    public static m p(int i10) {
        int f10 = g.f(i10);
        int[] iArr = g.f18746k4[i10].f18789b;
        boolean z10 = i10 >= 7;
        m mVar = new m(f10);
        mVar.j(f10, iArr, z10);
        mVar.i(false);
        return mVar;
    }
}
