package f3;
/* loaded from: classes.dex */
public class m {
    public static boolean a(ja.b[] bVarArr, la.a aVar) {
        int i10 = 0;
        while (i10 < aVar.f()) {
            int i11 = i10 + 1;
            int f10 = i11 % aVar.f();
            if (ea.d.a(bVarArr[i10], bVarArr[f10], aVar.b(f10)) == null) {
                return false;
            }
            i10 = i11;
        }
        return true;
    }
}
