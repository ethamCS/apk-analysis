package ae;

import java.util.Comparator;
import xc.e1;
import xc.u0;
import xc.y;
/* loaded from: classes3.dex */
public class g implements Comparator<xc.m> {

    /* renamed from: c */
    public static final g f442c = new g();

    private g() {
    }

    private static Integer b(xc.m mVar, xc.m mVar2) {
        int c10 = c(mVar2) - c(mVar);
        if (c10 != 0) {
            return Integer.valueOf(c10);
        }
        if (d.B(mVar) && d.B(mVar2)) {
            return 0;
        }
        int compareTo = mVar.getName().compareTo(mVar2.getName());
        if (compareTo == 0) {
            return null;
        }
        return Integer.valueOf(compareTo);
    }

    private static int c(xc.m mVar) {
        if (d.B(mVar)) {
            return 8;
        }
        if (mVar instanceof xc.l) {
            return 7;
        }
        if (mVar instanceof u0) {
            return ((u0) mVar).U() == null ? 6 : 5;
        } else if (mVar instanceof y) {
            return ((y) mVar).U() == null ? 4 : 3;
        } else if (mVar instanceof xc.e) {
            return 2;
        } else {
            return mVar instanceof e1 ? 1 : 0;
        }
    }

    /* renamed from: a */
    public int compare(xc.m mVar, xc.m mVar2) {
        Integer b10 = b(mVar, mVar2);
        if (b10 != null) {
            return b10.intValue();
        }
        return 0;
    }
}
