package ea;
/* loaded from: classes.dex */
public class b {
    public static double a(ja.c cVar, double d10, double d11, double d12) {
        ka.e eVar = cVar.f14237d;
        double d13 = eVar.f10622c / d12;
        double d14 = eVar.f10623d / d12;
        ka.b bVar = cVar.f14236c;
        return (((d10 - bVar.f10622c) * d13) + ((d11 - bVar.f10623d) * d14)) / ((d13 * d13) + (d14 * d14));
    }

    public static double b(ja.c cVar, ka.b bVar, double d10) {
        ka.e eVar = cVar.f14237d;
        double d11 = eVar.f10622c / d10;
        double d12 = eVar.f10623d / d10;
        double d13 = bVar.f10622c;
        ka.b bVar2 = cVar.f14236c;
        return (((d13 - bVar2.f10622c) * d11) + ((bVar.f10623d - bVar2.f10623d) * d12)) / ((d11 * d11) + (d12 * d12));
    }
}
