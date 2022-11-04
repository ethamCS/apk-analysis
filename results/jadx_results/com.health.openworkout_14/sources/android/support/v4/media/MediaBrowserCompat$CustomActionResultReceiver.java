package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
/* loaded from: classes.dex */
class MediaBrowserCompat$CustomActionResultReceiver extends a.a.a.a.b {

    /* renamed from: d */
    private final String f7d;

    /* renamed from: e */
    private final Bundle f8e;

    /* renamed from: f */
    private final a f9f;

    @Override // a.a.a.a.b
    protected void a(int i, Bundle bundle) {
        if (this.f9f == null) {
            return;
        }
        MediaSessionCompat.a(bundle);
        if (i == -1) {
            this.f9f.a(this.f7d, this.f8e, bundle);
        } else if (i == 0) {
            this.f9f.c(this.f7d, this.f8e, bundle);
        } else if (i == 1) {
            this.f9f.b(this.f7d, this.f8e, bundle);
        } else {
            Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.f8e + ", resultData=" + bundle + ")");
        }
    }
}
