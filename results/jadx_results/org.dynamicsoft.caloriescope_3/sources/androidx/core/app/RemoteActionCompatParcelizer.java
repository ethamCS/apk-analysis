package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f824a = (IconCompat) aVar.a((androidx.versionedparcelable.a) remoteActionCompat.f824a, 1);
        remoteActionCompat.f825b = aVar.a(remoteActionCompat.f825b, 2);
        remoteActionCompat.f826c = aVar.a(remoteActionCompat.f826c, 3);
        remoteActionCompat.d = (PendingIntent) aVar.a((androidx.versionedparcelable.a) remoteActionCompat.d, 4);
        remoteActionCompat.e = aVar.a(remoteActionCompat.e, 5);
        remoteActionCompat.f = aVar.a(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.a(false, false);
        aVar.b(remoteActionCompat.f824a, 1);
        aVar.b(remoteActionCompat.f825b, 2);
        aVar.b(remoteActionCompat.f826c, 3);
        aVar.b(remoteActionCompat.d, 4);
        aVar.b(remoteActionCompat.e, 5);
        aVar.b(remoteActionCompat.f, 6);
    }
}
