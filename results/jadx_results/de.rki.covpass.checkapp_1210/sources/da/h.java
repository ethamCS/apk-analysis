package da;
/* loaded from: classes.dex */
public class h {
    public static double a(ka.e eVar, ka.e eVar2) {
        double n10 = eVar.n(eVar2) / (eVar.h() * eVar2.h());
        if (n10 > 1.0d) {
            n10 = 1.0d;
        } else if (n10 < -1.0d) {
            n10 = -1.0d;
        }
        return Math.acos(n10);
    }
}
