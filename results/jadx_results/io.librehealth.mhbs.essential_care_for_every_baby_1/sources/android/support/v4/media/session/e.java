package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e {

    /* loaded from: classes.dex */
    public interface a extends d.a {
        void t(Uri uri, Bundle bundle);
    }

    /* loaded from: classes.dex */
    public static class b<T extends a> extends d.b<T> {
        public b(T t) {
            super(t);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlayFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            ((a) this.f143a).t(uri, bundle);
        }
    }

    public static Object a(a aVar) {
        return new b(aVar);
    }
}
