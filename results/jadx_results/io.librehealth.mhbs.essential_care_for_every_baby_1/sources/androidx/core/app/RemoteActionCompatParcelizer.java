package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f155a = (IconCompat) aVar.v(remoteActionCompat.f155a, 1);
        remoteActionCompat.f156b = aVar.l(remoteActionCompat.f156b, 2);
        remoteActionCompat.f157c = aVar.l(remoteActionCompat.f157c, 3);
        remoteActionCompat.f158d = (PendingIntent) aVar.r(remoteActionCompat.f158d, 4);
        remoteActionCompat.f159e = aVar.h(remoteActionCompat.f159e, 5);
        remoteActionCompat.f = aVar.h(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f155a, 1);
        aVar.D(remoteActionCompat.f156b, 2);
        aVar.D(remoteActionCompat.f157c, 3);
        aVar.H(remoteActionCompat.f158d, 4);
        aVar.z(remoteActionCompat.f159e, 5);
        aVar.z(remoteActionCompat.f, 6);
    }
}
