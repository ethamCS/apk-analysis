package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f868a = (IconCompat) aVar.v(remoteActionCompat.f868a, 1);
        remoteActionCompat.f869b = aVar.l(remoteActionCompat.f869b, 2);
        remoteActionCompat.f870c = aVar.l(remoteActionCompat.f870c, 3);
        remoteActionCompat.f871d = (PendingIntent) aVar.r(remoteActionCompat.f871d, 4);
        remoteActionCompat.f872e = aVar.h(remoteActionCompat.f872e, 5);
        remoteActionCompat.f873f = aVar.h(remoteActionCompat.f873f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f868a, 1);
        aVar.D(remoteActionCompat.f869b, 2);
        aVar.D(remoteActionCompat.f870c, 3);
        aVar.H(remoteActionCompat.f871d, 4);
        aVar.z(remoteActionCompat.f872e, 5);
        aVar.z(remoteActionCompat.f873f, 6);
    }
}
