package b.e.b.k;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class b {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r8 == 2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (r8 == 2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
        r5 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0258 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x039f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0504 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0397 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:327:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void a(b.e.b.k.f r37, b.e.b.d r38, int r39, int r40, b.e.b.k.c r41) {
        /*
            Method dump skipped, instructions count: 1321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.b.k.b.a(b.e.b.k.f, b.e.b.d, int, int, b.e.b.k.c):void");
    }

    public static void b(f fVar, b.e.b.d dVar, ArrayList<e> arrayList, int i) {
        c[] cVarArr;
        int i2;
        int i3;
        if (i == 0) {
            i3 = fVar.y0;
            cVarArr = fVar.B0;
            i2 = 0;
        } else {
            int i4 = fVar.z0;
            cVarArr = fVar.A0;
            i3 = i4;
            i2 = 2;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            c cVar = cVarArr[i5];
            cVar.a();
            if (arrayList == null || (arrayList != null && arrayList.contains(cVar.f2235a))) {
                a(fVar, dVar, i, i2, cVar);
            }
        }
    }
}
