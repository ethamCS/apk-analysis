package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends a.a.a.a.b {

    /* renamed from: d */
    private final String f10d;

    /* renamed from: e */
    private final b f11e;

    @Override // a.a.a.a.b
    protected void a(int i, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            this.f11e.a(this.f10d);
            return;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            this.f11e.b((MediaBrowserCompat$MediaItem) parcelable);
        } else {
            this.f11e.a(this.f10d);
        }
    }
}
