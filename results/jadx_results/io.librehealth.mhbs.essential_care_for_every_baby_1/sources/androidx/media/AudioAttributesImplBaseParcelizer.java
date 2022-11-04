package androidx.media;
/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static c read(androidx.versionedparcelable.a aVar) {
        c cVar = new c();
        cVar.f280a = aVar.p(cVar.f280a, 1);
        cVar.f281b = aVar.p(cVar.f281b, 2);
        cVar.f282c = aVar.p(cVar.f282c, 3);
        cVar.f283d = aVar.p(cVar.f283d, 4);
        return cVar;
    }

    public static void write(c cVar, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.F(cVar.f280a, 1);
        aVar.F(cVar.f281b, 2);
        aVar.F(cVar.f282c, 3);
        aVar.F(cVar.f283d, 4);
    }
}
