package androidx.media;

import android.media.AudioAttributes;
/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static b read(androidx.versionedparcelable.a aVar) {
        b bVar = new b();
        bVar.f278a = (AudioAttributes) aVar.r(bVar.f278a, 1);
        bVar.f279b = aVar.p(bVar.f279b, 2);
        return bVar;
    }

    public static void write(b bVar, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.H(bVar.f278a, 1);
        aVar.F(bVar.f279b, 2);
    }
}
