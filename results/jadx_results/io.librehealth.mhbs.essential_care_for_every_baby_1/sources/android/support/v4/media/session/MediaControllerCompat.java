package android.support.v4.media.session;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* loaded from: classes.dex */
public final class MediaControllerCompat {

    /* renamed from: a */
    private final b f71a;

    /* renamed from: b */
    private final MediaSessionCompat.Token f72b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class MediaControllerImplApi21 implements b {

        /* renamed from: a */
        protected final Object f73a;

        /* renamed from: b */
        final Object f74b = new Object();

        /* renamed from: c */
        private final List<a> f75c = new ArrayList();

        /* renamed from: d */
        private HashMap<a, a> f76d = new HashMap<>();

        /* renamed from: e */
        final MediaSessionCompat.Token f77e;

        /* loaded from: classes.dex */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a */
            private WeakReference<MediaControllerImplApi21> f78a;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f78a = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f78a.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.f74b) {
                    mediaControllerImplApi21.f77e.f(b.a.n0(androidx.core.app.b.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerImplApi21.f77e.g(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                    mediaControllerImplApi21.b();
                }
            }
        }

        /* loaded from: classes.dex */
        public static class a extends a.c {
            a(a aVar) {
                super(aVar);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void J(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void a(List<MediaSessionCompat.QueueItem> list) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void b(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void d() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void e(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void l0(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f77e = token;
            Object c2 = android.support.v4.media.session.c.c(context, token.e());
            this.f73a = c2;
            if (c2 != null) {
                if (token.c() != null) {
                    return;
                }
                c();
                return;
            }
            throw new RemoteException();
        }

        private void c() {
            d("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean a(KeyEvent keyEvent) {
            return android.support.v4.media.session.c.b(this.f73a, keyEvent);
        }

        void b() {
            if (this.f77e.c() == null) {
                return;
            }
            for (a aVar : this.f75c) {
                a aVar2 = new a(aVar);
                this.f76d.put(aVar, aVar2);
                aVar.f81c = aVar2;
                try {
                    this.f77e.c().B(aVar2);
                    aVar.i(13, null, null);
                } catch (RemoteException e2) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
                }
            }
            this.f75c.clear();
        }

        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
            android.support.v4.media.session.c.d(this.f73a, str, bundle, resultReceiver);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a implements IBinder.DeathRecipient {

        /* renamed from: a */
        final Object f79a;

        /* renamed from: b */
        HandlerC0008a f80b;

        /* renamed from: c */
        android.support.v4.media.session.a f81c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        /* loaded from: classes.dex */
        public class HandlerC0008a extends Handler {
        }

        /* loaded from: classes.dex */
        private static class b implements c.a {

            /* renamed from: a */
            private final WeakReference<a> f82a;

            b(a aVar) {
                this.f82a = new WeakReference<>(aVar);
            }

            @Override // android.support.v4.media.session.c.a
            public void a(List<?> list) {
                a aVar = this.f82a.get();
                if (aVar != null) {
                    aVar.e(MediaSessionCompat.QueueItem.b(list));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void b(CharSequence charSequence) {
                a aVar = this.f82a.get();
                if (aVar != null) {
                    aVar.f(charSequence);
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void c(Object obj) {
                a aVar = this.f82a.get();
                if (aVar == null || aVar.f81c != null) {
                    return;
                }
                aVar.d(PlaybackStateCompat.a(obj));
            }

            @Override // android.support.v4.media.session.c.a
            public void d() {
                a aVar = this.f82a.get();
                if (aVar != null) {
                    aVar.g();
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void e(Bundle bundle) {
                a aVar = this.f82a.get();
                if (aVar != null) {
                    aVar.b(bundle);
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void f(Object obj) {
                a aVar = this.f82a.get();
                if (aVar != null) {
                    aVar.c(MediaMetadataCompat.b(obj));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void g(int i, int i2, int i3, int i4, int i5) {
                a aVar = this.f82a.get();
                if (aVar != null) {
                    aVar.a(new f(i, i2, i3, i4, i5));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void h(String str, Bundle bundle) {
                a aVar = this.f82a.get();
                if (aVar != null) {
                    if (aVar.f81c != null && Build.VERSION.SDK_INT < 23) {
                        return;
                    }
                    aVar.h(str, bundle);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class c extends a.AbstractBinderC0010a {

            /* renamed from: a */
            private final WeakReference<a> f83a;

            c(a aVar) {
                this.f83a = new WeakReference<>(aVar);
            }

            public void J(MediaMetadataCompat mediaMetadataCompat) {
                a aVar = this.f83a.get();
                if (aVar != null) {
                    aVar.i(3, mediaMetadataCompat, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void R(int i) {
                a aVar = this.f83a.get();
                if (aVar != null) {
                    aVar.i(12, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void U() {
                a aVar = this.f83a.get();
                if (aVar != null) {
                    aVar.i(13, null, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void X(PlaybackStateCompat playbackStateCompat) {
                a aVar = this.f83a.get();
                if (aVar != null) {
                    aVar.i(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void Z(String str, Bundle bundle) {
                a aVar = this.f83a.get();
                if (aVar != null) {
                    aVar.i(1, str, bundle);
                }
            }

            public void a(List<MediaSessionCompat.QueueItem> list) {
                a aVar = this.f83a.get();
                if (aVar != null) {
                    aVar.i(5, list, null);
                }
            }

            public void b(CharSequence charSequence) {
                a aVar = this.f83a.get();
                if (aVar != null) {
                    aVar.i(6, charSequence, null);
                }
            }

            public void d() {
                a aVar = this.f83a.get();
                if (aVar != null) {
                    aVar.i(8, null, null);
                }
            }

            public void e(Bundle bundle) {
                a aVar = this.f83a.get();
                if (aVar != null) {
                    aVar.i(7, bundle, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void f0(int i) {
                a aVar = this.f83a.get();
                if (aVar != null) {
                    aVar.i(9, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void l(boolean z) {
            }

            public void l0(ParcelableVolumeInfo parcelableVolumeInfo) {
                a aVar = this.f83a.get();
                if (aVar != null) {
                    aVar.i(4, parcelableVolumeInfo != null ? new f(parcelableVolumeInfo.f120a, parcelableVolumeInfo.f121b, parcelableVolumeInfo.f122c, parcelableVolumeInfo.f123d, parcelableVolumeInfo.f124e) : null, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void w(boolean z) {
                a aVar = this.f83a.get();
                if (aVar != null) {
                    aVar.i(11, Boolean.valueOf(z), null);
                }
            }
        }

        public a() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f79a = android.support.v4.media.session.c.a(new b(this));
            } else {
                this.f81c = new c(this);
            }
        }

        public void a(f fVar) {
        }

        public void b(Bundle bundle) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            i(8, null, null);
        }

        public void c(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void d(PlaybackStateCompat playbackStateCompat) {
        }

        public void e(List<MediaSessionCompat.QueueItem> list) {
        }

        public void f(CharSequence charSequence) {
        }

        public void g() {
        }

        public void h(String str, Bundle bundle) {
        }

        void i(int i, Object obj, Bundle bundle) {
            HandlerC0008a handlerC0008a = this.f80b;
            if (handlerC0008a != null) {
                Message obtainMessage = handlerC0008a.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(KeyEvent keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends MediaControllerImplApi21 {
        public c(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d extends c {
        public d(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e implements b {

        /* renamed from: a */
        private android.support.v4.media.session.b f84a;

        public e(MediaSessionCompat.Token token) {
            this.f84a = b.a.n0((IBinder) token.e());
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean a(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.f84a.m0(keyEvent);
                    return false;
                } catch (RemoteException e2) {
                    Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", e2);
                    return false;
                }
            }
            throw new IllegalArgumentException("event may not be null.");
        }
    }

    /* loaded from: classes.dex */
    public static final class f {
        f(int i, int i2, int i3, int i4, int i5) {
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        b mediaControllerImplApi21;
        new HashSet();
        if (token != null) {
            this.f72b = token;
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                mediaControllerImplApi21 = new d(context, token);
            } else if (i >= 23) {
                mediaControllerImplApi21 = new c(context, token);
            } else if (i < 21) {
                this.f71a = new e(token);
                return;
            } else {
                mediaControllerImplApi21 = new MediaControllerImplApi21(context, token);
            }
            this.f71a = mediaControllerImplApi21;
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        int i;
        b mediaControllerImplApi21;
        new HashSet();
        if (mediaSessionCompat != null) {
            MediaSessionCompat.Token b2 = mediaSessionCompat.b();
            this.f72b = b2;
            e eVar = null;
            try {
                i = Build.VERSION.SDK_INT;
            } catch (RemoteException e2) {
                Log.w("MediaControllerCompat", "Failed to create MediaControllerImpl.", e2);
            }
            if (i >= 24) {
                mediaControllerImplApi21 = new d(context, b2);
            } else if (i >= 23) {
                mediaControllerImplApi21 = new c(context, b2);
            } else if (i < 21) {
                eVar = new e(b2);
                this.f71a = eVar;
                return;
            } else {
                mediaControllerImplApi21 = new MediaControllerImplApi21(context, b2);
            }
            eVar = mediaControllerImplApi21;
            this.f71a = eVar;
            return;
        }
        throw new IllegalArgumentException("session must not be null");
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f71a.a(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }
}
