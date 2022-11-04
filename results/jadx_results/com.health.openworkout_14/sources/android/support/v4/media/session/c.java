package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.e;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public abstract class c implements IBinder.DeathRecipient {

    /* renamed from: a */
    final Object f66a;

    /* renamed from: b */
    a f67b;

    /* renamed from: c */
    android.support.v4.media.session.a f68c;

    /* loaded from: classes.dex */
    public class a extends Handler {
    }

    /* loaded from: classes.dex */
    private static class b implements e.a {

        /* renamed from: a */
        private final WeakReference<c> f69a;

        b(c cVar) {
            this.f69a = new WeakReference<>(cVar);
        }

        @Override // android.support.v4.media.session.e.a
        public void a(List<?> list) {
            c cVar = this.f69a.get();
            if (cVar != null) {
                cVar.e(MediaSessionCompat.QueueItem.c(list));
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void b(CharSequence charSequence) {
            c cVar = this.f69a.get();
            if (cVar != null) {
                cVar.f(charSequence);
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void c() {
            c cVar = this.f69a.get();
            if (cVar != null) {
                cVar.g();
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void d(Bundle bundle) {
            c cVar = this.f69a.get();
            if (cVar != null) {
                cVar.b(bundle);
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void e(Object obj) {
            c cVar = this.f69a.get();
            if (cVar == null || cVar.f68c != null) {
                return;
            }
            cVar.d(PlaybackStateCompat.a(obj));
        }

        @Override // android.support.v4.media.session.e.a
        public void f(Object obj) {
            c cVar = this.f69a.get();
            if (cVar != null) {
                cVar.c(MediaMetadataCompat.a(obj));
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void g(int i, int i2, int i3, int i4, int i5) {
            c cVar = this.f69a.get();
            if (cVar != null) {
                cVar.a(new d(i, i2, i3, i4, i5));
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void h(String str, Bundle bundle) {
            c cVar = this.f69a.get();
            if (cVar != null) {
                if (cVar.f68c != null && Build.VERSION.SDK_INT < 23) {
                    return;
                }
                cVar.h(str, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.media.session.c$c */
    /* loaded from: classes.dex */
    public static class BinderC0005c extends a.AbstractBinderC0003a {

        /* renamed from: a */
        private final WeakReference<c> f70a;

        public BinderC0005c(c cVar) {
            this.f70a = new WeakReference<>(cVar);
        }

        public void a(List<MediaSessionCompat.QueueItem> list) {
            c cVar = this.f70a.get();
            if (cVar != null) {
                cVar.i(5, list, null);
            }
        }

        public void b(CharSequence charSequence) {
            c cVar = this.f70a.get();
            if (cVar != null) {
                cVar.i(6, charSequence, null);
            }
        }

        public void c() {
            c cVar = this.f70a.get();
            if (cVar != null) {
                cVar.i(8, null, null);
            }
        }

        public void d(Bundle bundle) {
            c cVar = this.f70a.get();
            if (cVar != null) {
                cVar.i(7, bundle, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void e(boolean z) {
        }

        public void h(MediaMetadataCompat mediaMetadataCompat) {
            c cVar = this.f70a.get();
            if (cVar != null) {
                cVar.i(3, mediaMetadataCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void i(int i) {
            c cVar = this.f70a.get();
            if (cVar != null) {
                cVar.i(9, Integer.valueOf(i), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void k(boolean z) {
            c cVar = this.f70a.get();
            if (cVar != null) {
                cVar.i(11, Boolean.valueOf(z), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void m(int i) {
            c cVar = this.f70a.get();
            if (cVar != null) {
                cVar.i(12, Integer.valueOf(i), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void n() {
            c cVar = this.f70a.get();
            if (cVar != null) {
                cVar.i(13, null, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void p(PlaybackStateCompat playbackStateCompat) {
            c cVar = this.f70a.get();
            if (cVar != null) {
                cVar.i(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void q(String str, Bundle bundle) {
            c cVar = this.f70a.get();
            if (cVar != null) {
                cVar.i(1, str, bundle);
            }
        }

        public void s(ParcelableVolumeInfo parcelableVolumeInfo) {
            c cVar = this.f70a.get();
            if (cVar != null) {
                cVar.i(4, parcelableVolumeInfo != null ? new d(parcelableVolumeInfo.f48b, parcelableVolumeInfo.f49c, parcelableVolumeInfo.f50d, parcelableVolumeInfo.f51e, parcelableVolumeInfo.f52f) : null, null);
            }
        }
    }

    public c() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f66a = e.a(new b(this));
        } else {
            this.f68c = new BinderC0005c(this);
        }
    }

    public void a(d dVar) {
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

    public void i(int i, Object obj, Bundle bundle) {
        a aVar = this.f67b;
        if (aVar != null) {
            Message obtainMessage = aVar.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }
}
