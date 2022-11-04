package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3462a = aVar.p(iconCompat.f3462a, 1);
        iconCompat.f3464c = aVar.j(iconCompat.f3464c, 2);
        iconCompat.f3465d = aVar.r(iconCompat.f3465d, 3);
        iconCompat.f3466e = aVar.p(iconCompat.f3466e, 4);
        iconCompat.f3467f = aVar.p(iconCompat.f3467f, 5);
        iconCompat.f3468g = (ColorStateList) aVar.r(iconCompat.f3468g, 6);
        iconCompat.f3470i = aVar.t(iconCompat.f3470i, 7);
        iconCompat.f3471j = aVar.t(iconCompat.f3471j, 8);
        iconCompat.f();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(true, true);
        iconCompat.g(aVar.f());
        int i10 = iconCompat.f3462a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.f3464c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f3465d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f3466e;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f3467f;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f3468g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f3470i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f3471j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
