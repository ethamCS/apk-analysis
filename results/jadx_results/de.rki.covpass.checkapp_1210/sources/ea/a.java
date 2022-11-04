package ea;
/* loaded from: classes.dex */
public class a {
    public static double a(la.a aVar) {
        double d10 = 0.0d;
        int i10 = 2;
        ka.b b10 = aVar.b(0);
        ka.b b11 = aVar.b(1);
        while (i10 < aVar.f()) {
            ka.b b12 = aVar.b(i10);
            d10 += b11.f10622c * (b12.f10623d - b10.f10623d);
            i10++;
            b10 = b11;
            b11 = b12;
        }
        ka.b b13 = aVar.b(0);
        return Math.abs(((d10 + (b11.f10622c * (b13.f10623d - b10.f10623d))) + (b13.f10622c * (aVar.b(1).f10623d - b11.f10623d))) / 2.0d);
    }
}
