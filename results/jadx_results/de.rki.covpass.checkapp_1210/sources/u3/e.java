package u3;
/* loaded from: classes.dex */
public class e {
    public static k2.d a(k2.a aVar) {
        if (aVar instanceof d) {
            return c((d) aVar);
        }
        if (!(aVar instanceof k2.b)) {
            throw new RuntimeException("Unknown");
        }
        return b((k2.b) aVar);
    }

    public static k2.d b(k2.b bVar) {
        if (bVar == null) {
            bVar = new k2.b();
        }
        bVar.b();
        return new k2.c(bVar);
    }

    @Deprecated
    public static k2.d c(d dVar) {
        if (dVar == null) {
            dVar = new d();
        }
        dVar.b();
        return new k2.e(dVar);
    }
}
