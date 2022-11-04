package da;
/* loaded from: classes.dex */
public class c {
    public static ja.b a(ja.d dVar, ja.b bVar) {
        if (bVar == null) {
            bVar = new ja.b();
        }
        double cos = Math.cos(dVar.f14239d);
        double sin = Math.sin(dVar.f14239d);
        bVar.f14233c = cos;
        bVar.f14234d = sin;
        bVar.f14235q = -dVar.f14238c;
        return bVar;
    }

    public static ja.b b(ja.e eVar, ja.b bVar) {
        return c(eVar.f14240c, eVar.f14241d, bVar);
    }

    public static ja.b c(ka.b bVar, ka.b bVar2, ja.b bVar3) {
        if (bVar3 == null) {
            bVar3 = new ja.b();
        }
        double d10 = bVar.f10623d;
        double d11 = d10 - bVar2.f10623d;
        bVar3.f14233c = d11;
        double d12 = bVar2.f10622c;
        double d13 = bVar.f10622c;
        double d14 = d12 - d13;
        bVar3.f14234d = d14;
        bVar3.f14235q = -((d11 * d13) + (d14 * d10));
        return bVar3;
    }

    public static ja.c d(ja.e eVar, ja.c cVar) {
        if (cVar == null) {
            cVar = new ja.c();
        }
        cVar.f14236c.k(eVar.f14240c);
        cVar.f14237d.i(eVar.c(), eVar.e());
        return cVar;
    }
}
