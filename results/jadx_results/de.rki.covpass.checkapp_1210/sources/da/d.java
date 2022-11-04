package da;
/* loaded from: classes.dex */
public class d {
    public static double a(double d10, double d11, double d12, double d13) {
        double d14 = d12 - d10;
        double d15 = d13 - d11;
        return (d14 * d14) + (d15 * d15);
    }

    public static ka.b b(ka.b bVar, ka.b bVar2, ka.b bVar3) {
        if (bVar3 == null) {
            bVar3 = new ka.b();
        }
        bVar3.f10622c = (bVar.f10622c + bVar2.f10622c) / 2.0d;
        bVar3.f10623d = (bVar.f10623d + bVar2.f10623d) / 2.0d;
        return bVar3;
    }
}
