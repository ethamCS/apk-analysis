package androidx.media;
/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static c read(androidx.versionedparcelable.a aVar) {
        c cVar = new c();
        cVar.f1267a = aVar.p(cVar.f1267a, 1);
        cVar.f1268b = aVar.p(cVar.f1268b, 2);
        cVar.f1269c = aVar.p(cVar.f1269c, 3);
        cVar.f1270d = aVar.p(cVar.f1270d, 4);
        return cVar;
    }

    public static void write(c cVar, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.F(cVar.f1267a, 1);
        aVar.F(cVar.f1268b, 2);
        aVar.F(cVar.f1269c, 3);
        aVar.F(cVar.f1270d, 4);
    }
}
