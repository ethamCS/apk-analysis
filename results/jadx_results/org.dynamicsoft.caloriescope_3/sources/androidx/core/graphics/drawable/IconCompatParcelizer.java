package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f845a = aVar.a(iconCompat.f845a, 1);
        iconCompat.f847c = aVar.a(iconCompat.f847c, 2);
        iconCompat.d = aVar.a((androidx.versionedparcelable.a) iconCompat.d, 3);
        iconCompat.e = aVar.a(iconCompat.e, 4);
        iconCompat.f = aVar.a(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) aVar.a((androidx.versionedparcelable.a) iconCompat.g, 6);
        iconCompat.i = aVar.a(iconCompat.i, 7);
        iconCompat.c();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.a(true, true);
        iconCompat.a(aVar.c());
        int i = iconCompat.f845a;
        if (-1 != i) {
            aVar.b(i, 1);
        }
        byte[] bArr = iconCompat.f847c;
        if (bArr != null) {
            aVar.b(bArr, 2);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            aVar.b(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            aVar.b(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            aVar.b(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            aVar.b(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            aVar.b(str, 7);
        }
    }
}
