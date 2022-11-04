package m0;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class b {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r8 == 2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
        if (r8 == 2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
        r5 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0268 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x035e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0520 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x03a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:332:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void a(m0.f r38, j0.d r39, int r40, int r41, m0.c r42) {
        /*
            Method dump skipped, instructions count: 1345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.b.a(m0.f, j0.d, int, int, m0.c):void");
    }

    public static void b(f fVar, j0.d dVar, ArrayList<e> arrayList, int i10) {
        c[] cVarArr;
        int i11;
        int i12;
        if (i10 == 0) {
            i12 = fVar.W0;
            cVarArr = fVar.Z0;
            i11 = 0;
        } else {
            int i13 = fVar.X0;
            cVarArr = fVar.Y0;
            i11 = 2;
            i12 = i13;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            c cVar = cVarArr[i14];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f16132a)) {
                a(fVar, dVar, i10, i11, cVar);
            }
        }
    }
}
