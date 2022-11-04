package ea;
/* loaded from: classes.dex */
public class c {
    public static double a(ja.c cVar, double d10, double d11) {
        double max = Math.max(Math.abs(cVar.f14237d.f10622c), Math.abs(cVar.f14237d.f10623d));
        double a10 = b.a(cVar, d10, d11, max);
        ka.e eVar = cVar.f14237d;
        ka.b bVar = cVar.f14236c;
        double d12 = d10 - (((eVar.f10622c / max) * a10) + bVar.f10622c);
        double d13 = d11 - (((eVar.f10623d / max) * a10) + bVar.f10623d);
        return (d12 * d12) + (d13 * d13);
    }

    public static double b(ja.c cVar, ka.b bVar) {
        double max = Math.max(Math.abs(cVar.f14237d.f10622c), Math.abs(cVar.f14237d.f10623d));
        double b10 = b.b(cVar, bVar, max);
        ka.e eVar = cVar.f14237d;
        ka.b bVar2 = cVar.f14236c;
        double d10 = ((eVar.f10622c / max) * b10) + bVar2.f10622c;
        double d11 = ((eVar.f10623d / max) * b10) + bVar2.f10623d;
        double d12 = bVar.f10622c - d10;
        double d13 = bVar.f10623d - d11;
        return (d12 * d12) + (d13 * d13);
    }

    public static double c(ja.e eVar, double d10, double d11) {
        ka.b bVar = eVar.f14241d;
        double d12 = bVar.f10622c;
        ka.b bVar2 = eVar.f14240c;
        double d13 = bVar2.f10622c;
        double d14 = d12 - d13;
        double d15 = bVar.f10623d;
        double d16 = bVar2.f10623d;
        double d17 = d15 - d16;
        double d18 = (((d10 - d13) * d14) + ((d11 - d16) * d17)) / ((d14 * d14) + (d17 * d17));
        return d18 < 0.0d ? da.d.a(d13, d16, d10, d11) : d18 > 1.0d ? da.d.a(d12, d15, d10, d11) : da.d.a(d13 + (d14 * d18), d16 + (d18 * d17), d10, d11);
    }
}
