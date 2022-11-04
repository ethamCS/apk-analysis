package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3344a = (IconCompat) aVar.v(remoteActionCompat.f3344a, 1);
        remoteActionCompat.f3345b = aVar.l(remoteActionCompat.f3345b, 2);
        remoteActionCompat.f3346c = aVar.l(remoteActionCompat.f3346c, 3);
        remoteActionCompat.f3347d = (PendingIntent) aVar.r(remoteActionCompat.f3347d, 4);
        remoteActionCompat.f3348e = aVar.h(remoteActionCompat.f3348e, 5);
        remoteActionCompat.f3349f = aVar.h(remoteActionCompat.f3349f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f3344a, 1);
        aVar.D(remoteActionCompat.f3345b, 2);
        aVar.D(remoteActionCompat.f3346c, 3);
        aVar.H(remoteActionCompat.f3347d, 4);
        aVar.z(remoteActionCompat.f3348e, 5);
        aVar.z(remoteActionCompat.f3349f, 6);
    }
}
