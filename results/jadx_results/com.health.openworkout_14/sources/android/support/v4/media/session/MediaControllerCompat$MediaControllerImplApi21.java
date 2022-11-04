package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a */
    final Object f37a;

    /* renamed from: b */
    private final List<c> f38b;

    /* renamed from: c */
    private HashMap<c, a> f39c;

    /* renamed from: d */
    final MediaSessionCompat.Token f40d;

    /* loaded from: classes.dex */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: b */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f41b;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f41b.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f37a) {
                mediaControllerCompat$MediaControllerImplApi21.f40d.c(b.a.t(androidx.core.app.e.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.f40d.k(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                mediaControllerCompat$MediaControllerImplApi21.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a extends c.BinderC0005c {
        a(c cVar) {
            super(cVar);
        }

        @Override // android.support.v4.media.session.c.BinderC0005c, android.support.v4.media.session.a
        public void a(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.BinderC0005c, android.support.v4.media.session.a
        public void b(CharSequence charSequence) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.BinderC0005c, android.support.v4.media.session.a
        public void c() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.BinderC0005c, android.support.v4.media.session.a
        public void d(Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.BinderC0005c, android.support.v4.media.session.a
        public void h(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.BinderC0005c, android.support.v4.media.session.a
        public void s(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }
    }

    void a() {
        if (this.f40d.a() == null) {
            return;
        }
        for (c cVar : this.f38b) {
            a aVar = new a(cVar);
            this.f39c.put(cVar, aVar);
            cVar.f68c = aVar;
            try {
                this.f40d.a().g(aVar);
                cVar.i(13, null, null);
            } catch (RemoteException e2) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
            }
        }
        this.f38b.clear();
    }
}
