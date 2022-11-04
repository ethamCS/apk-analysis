package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.d;
import android.support.v4.media.session.e;
import android.support.v4.media.session.f;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class MediaSessionCompat {

    /* renamed from: b */
    static int f85b;

    /* renamed from: a */
    private final d f86a;

    /* loaded from: classes.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: a */
        private final MediaDescriptionCompat f87a;

        /* renamed from: b */
        private final long f88b;

        /* renamed from: c */
        private Object f89c;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<QueueItem> {
            a() {
            }

            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        QueueItem(Parcel parcel) {
            this.f87a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f88b = parcel.readLong();
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat != null) {
                if (j == -1) {
                    throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
                }
                this.f87a = mediaDescriptionCompat;
                this.f88b = j;
                this.f89c = obj;
                return;
            }
            throw new IllegalArgumentException("Description cannot be null.");
        }

        public static QueueItem a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.a(d.c.a(obj)), d.c.b(obj));
        }

        public static List<QueueItem> b(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return arrayList;
        }

        public MediaDescriptionCompat c() {
            return this.f87a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f87a + ", Id=" + this.f88b + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f87a.writeToParcel(parcel, i);
            parcel.writeLong(this.f88b);
        }
    }

    /* loaded from: classes.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: a */
        ResultReceiver f90a;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<ResultReceiverWrapper> {
            a() {
            }

            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f90a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f90a.writeToParcel(parcel, i);
        }
    }

    /* loaded from: classes.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: a */
        private final Object f91a;

        /* renamed from: b */
        private android.support.v4.media.session.b f92b;

        /* renamed from: c */
        private Bundle f93c;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<Token> {
            a() {
            }

            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(Build.VERSION.SDK_INT >= 21 ? parcel.readParcelable(null) : parcel.readStrongBinder());
            }

            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        Token(Object obj, android.support.v4.media.session.b bVar) {
            this(obj, bVar, null);
        }

        Token(Object obj, android.support.v4.media.session.b bVar, Bundle bundle) {
            this.f91a = obj;
            this.f92b = bVar;
            this.f93c = bundle;
        }

        public static Token a(Object obj) {
            return b(obj, null);
        }

        public static Token b(Object obj, android.support.v4.media.session.b bVar) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            android.support.v4.media.session.d.f(obj);
            return new Token(obj, bVar);
        }

        public android.support.v4.media.session.b c() {
            return this.f92b;
        }

        public Bundle d() {
            return this.f93c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Object e() {
            return this.f91a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.f91a;
            Object obj3 = ((Token) obj).f91a;
            if (obj2 == null) {
                return obj3 == null;
            } else if (obj3 != null) {
                return obj2.equals(obj3);
            } else {
                return false;
            }
        }

        public void f(android.support.v4.media.session.b bVar) {
            this.f92b = bVar;
        }

        public void g(Bundle bundle) {
            this.f93c = bundle;
        }

        public int hashCode() {
            Object obj = this.f91a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f91a, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f91a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends c {
        a(MediaSessionCompat mediaSessionCompat) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends c {
        b(MediaSessionCompat mediaSessionCompat) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a */
        final Object f94a;

        /* renamed from: b */
        WeakReference<d> f95b;

        /* renamed from: c */
        private a f96c = null;

        /* renamed from: d */
        private boolean f97d;

        /* loaded from: classes.dex */
        public class a extends Handler {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Looper looper) {
                super(looper);
                c.this = r1;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 1) {
                    c.this.a((androidx.media.e) message.obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public class b implements d.a {
            b() {
                c.this = r1;
            }

            @Override // android.support.v4.media.session.d.a
            public void a() {
                c.this.B();
            }

            @Override // android.support.v4.media.session.d.a
            public void c() {
                c.this.h();
            }

            @Override // android.support.v4.media.session.d.a
            public void e(Object obj) {
                c.this.u(RatingCompat.a(obj));
            }

            @Override // android.support.v4.media.session.d.a
            public void g(String str, Bundle bundle, ResultReceiver resultReceiver) {
                c cVar;
                MediaDescriptionCompat c2;
                try {
                    QueueItem queueItem = null;
                    IBinder iBinder = null;
                    queueItem = null;
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        g gVar = (g) c.this.f95b.get();
                        if (gVar == null) {
                            return;
                        }
                        Bundle bundle2 = new Bundle();
                        Token a2 = gVar.a();
                        android.support.v4.media.session.b c3 = a2.c();
                        if (c3 != null) {
                            iBinder = c3.asBinder();
                        }
                        androidx.core.app.b.b(bundle2, "android.support.v4.media.session.EXTRA_BINDER", iBinder);
                        bundle2.putBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE", a2.d());
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        c.this.b((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        c.this.c((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                    } else {
                        if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                            cVar = c.this;
                            c2 = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                            c.this.d(str, bundle, resultReceiver);
                            return;
                        } else {
                            g gVar2 = (g) c.this.f95b.get();
                            if (gVar2 == null || gVar2.f == null) {
                                return;
                            }
                            int i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                            if (i >= 0 && i < gVar2.f.size()) {
                                queueItem = gVar2.f.get(i);
                            }
                            if (queueItem == null) {
                                return;
                            }
                            cVar = c.this;
                            c2 = queueItem.c();
                        }
                        cVar.q(c2);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
            }

            @Override // android.support.v4.media.session.d.a
            public void h() {
                c.this.i();
            }

            @Override // android.support.v4.media.session.d.a
            public void i() {
                c.this.z();
            }

            @Override // android.support.v4.media.session.d.a
            public void j(String str, Bundle bundle) {
                c.this.j(str, bundle);
            }

            @Override // android.support.v4.media.session.d.a
            public void k() {
                c.this.f();
            }

            @Override // android.support.v4.media.session.d.a
            public void l() {
                c.this.r();
            }

            @Override // android.support.v4.media.session.d.a
            public boolean m(Intent intent) {
                return c.this.g(intent);
            }

            @Override // android.support.v4.media.session.d.a
            public void n(long j) {
                c.this.s(j);
            }

            @Override // android.support.v4.media.session.d.a
            public void o(String str, Bundle bundle) {
                Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                MediaSessionCompat.a(bundle2);
                if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                    c.this.l((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                    c.this.m();
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    c.this.n(bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    c.this.o(bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    c.this.p((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    c.this.t(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    c.this.w(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    c.this.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                } else if (!str.equals("android.support.v4.media.session.action.SET_RATING")) {
                    c.this.e(str, bundle);
                } else {
                    c.this.v((RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), bundle2);
                }
            }

            @Override // android.support.v4.media.session.d.a
            public void p() {
                c.this.y();
            }

            @Override // android.support.v4.media.session.d.a
            public void r(long j) {
                c.this.A(j);
            }

            @Override // android.support.v4.media.session.d.a
            public void s(String str, Bundle bundle) {
                c.this.k(str, bundle);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$c$c */
        /* loaded from: classes.dex */
        public class C0009c extends b implements e.a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0009c() {
                super();
                c.this = r1;
            }

            @Override // android.support.v4.media.session.e.a
            public void t(Uri uri, Bundle bundle) {
                c.this.l(uri, bundle);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public class d extends C0009c implements f.a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d() {
                super();
                c.this = r1;
            }

            @Override // android.support.v4.media.session.f.a
            public void b(String str, Bundle bundle) {
                c.this.n(str, bundle);
            }

            @Override // android.support.v4.media.session.f.a
            public void d() {
                c.this.m();
            }

            @Override // android.support.v4.media.session.f.a
            public void f(Uri uri, Bundle bundle) {
                c.this.p(uri, bundle);
            }

            @Override // android.support.v4.media.session.f.a
            public void q(String str, Bundle bundle) {
                c.this.o(str, bundle);
            }
        }

        public c() {
            Object obj = null;
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                obj = android.support.v4.media.session.f.a(new d());
            } else if (i >= 23) {
                obj = android.support.v4.media.session.e.a(new C0009c());
            } else if (i >= 21) {
                obj = android.support.v4.media.session.d.a(new b());
            }
            this.f94a = obj;
        }

        public void A(long j) {
        }

        public void B() {
        }

        void C(d dVar, Handler handler) {
            this.f95b = new WeakReference<>(dVar);
            a aVar = this.f96c;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            this.f96c = new a(handler.getLooper());
        }

        void a(androidx.media.e eVar) {
            if (!this.f97d) {
                return;
            }
            boolean z = false;
            this.f97d = false;
            this.f96c.removeMessages(1);
            d dVar = this.f95b.get();
            if (dVar == null) {
                return;
            }
            PlaybackStateCompat f = dVar.f();
            long b2 = f == null ? 0L : f.b();
            boolean z2 = f != null && f.f() == 3;
            boolean z3 = (516 & b2) != 0;
            if ((b2 & 514) != 0) {
                z = true;
            }
            dVar.d(eVar);
            if (z2 && z) {
                h();
            } else if (!z2 && z3) {
                i();
            }
            dVar.d(null);
        }

        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void e(String str, Bundle bundle) {
        }

        public void f() {
        }

        public boolean g(Intent intent) {
            d dVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27 || (dVar = this.f95b.get()) == null || this.f96c == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            androidx.media.e c2 = dVar.c();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                a(c2);
                return false;
            }
            if (keyEvent.getRepeatCount() > 0) {
                a(c2);
            } else if (this.f97d) {
                this.f96c.removeMessages(1);
                this.f97d = false;
                PlaybackStateCompat f = dVar.f();
                if (((f == null ? 0L : f.b()) & 32) != 0) {
                    y();
                }
            } else {
                this.f97d = true;
                a aVar = this.f96c;
                aVar.sendMessageDelayed(aVar.obtainMessage(1, c2), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        public void h() {
        }

        public void i() {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k(String str, Bundle bundle) {
        }

        public void l(Uri uri, Bundle bundle) {
        }

        public void m() {
        }

        public void n(String str, Bundle bundle) {
        }

        public void o(String str, Bundle bundle) {
        }

        public void p(Uri uri, Bundle bundle) {
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void r() {
        }

        public void s(long j) {
        }

        public void t(boolean z) {
        }

        public void u(RatingCompat ratingCompat) {
        }

        public void v(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void w(int i) {
        }

        public void x(int i) {
        }

        public void y() {
        }

        public void z() {
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        Token a();

        void b(PendingIntent pendingIntent);

        androidx.media.e c();

        void d(androidx.media.e eVar);

        void e(c cVar, Handler handler);

        PlaybackStateCompat f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e extends i {

        /* loaded from: classes.dex */
        public class a implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            a() {
                e.this = r1;
            }

            @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
            public void onPlaybackPositionUpdate(long j) {
                e.this.h(18, -1, -1, Long.valueOf(j), null);
            }
        }

        e(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.i, android.support.v4.media.session.MediaSessionCompat.d
        public void e(c cVar, Handler handler) {
            super.e(cVar, handler);
            if (cVar == null) {
                this.f.setPlaybackPositionUpdateListener(null);
                return;
            }
            this.f.setPlaybackPositionUpdateListener(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class f extends e {

        /* loaded from: classes.dex */
        class a implements RemoteControlClient.OnMetadataUpdateListener {
            a() {
                f.this = r1;
            }

            @Override // android.media.RemoteControlClient.OnMetadataUpdateListener
            public void onMetadataUpdate(int i, Object obj) {
                if (i != 268435457 || !(obj instanceof Rating)) {
                    return;
                }
                f.this.h(19, -1, -1, RatingCompat.a(obj), null);
            }
        }

        f(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e, android.support.v4.media.session.MediaSessionCompat.i, android.support.v4.media.session.MediaSessionCompat.d
        public void e(c cVar, Handler handler) {
            super.e(cVar, handler);
            if (cVar == null) {
                this.f.setMetadataUpdateListener(null);
                return;
            }
            this.f.setMetadataUpdateListener(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class g implements d {

        /* renamed from: a */
        final Object f104a;

        /* renamed from: b */
        final Token f105b;

        /* renamed from: c */
        boolean f106c = false;

        /* renamed from: d */
        final RemoteCallbackList<android.support.v4.media.session.a> f107d = new RemoteCallbackList<>();

        /* renamed from: e */
        PlaybackStateCompat f108e;
        List<QueueItem> f;
        MediaMetadataCompat g;
        int h;
        boolean i;
        int j;
        int k;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends b.a {
            a() {
                g.this = r1;
            }

            @Override // android.support.v4.media.session.b
            public void B(android.support.v4.media.session.a aVar) {
                g gVar = g.this;
                if (!gVar.f106c) {
                    String g = gVar.g();
                    if (g == null) {
                        g = "android.media.session.MediaController";
                    }
                    g.this.f107d.register(aVar, new androidx.media.e(g, Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            @Override // android.support.v4.media.session.b
            public void C(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean D() {
                return g.this.i;
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat E() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void F(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void G() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void H(android.support.v4.media.session.a aVar) {
                g.this.f107d.unregister(aVar);
            }

            @Override // android.support.v4.media.session.b
            public void I(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String L() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String M() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean N() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void O(boolean z) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void P() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void Q(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void S(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public long T() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void V(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void W(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int Y() {
                return g.this.j;
            }

            @Override // android.support.v4.media.session.b
            public void a0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void b0(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void c() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void c0(boolean z) {
            }

            @Override // android.support.v4.media.session.b
            public void d0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo e0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat f() {
                g gVar = g.this;
                return MediaSessionCompat.c(gVar.f108e, gVar.g);
            }

            @Override // android.support.v4.media.session.b
            public void g0(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void h(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public List<QueueItem> h0() {
                return null;
            }

            @Override // android.support.v4.media.session.b
            public void i(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void i0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void j(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public Bundle j0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean k() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void m() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean m0(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void n(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void next() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void o() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent p() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public CharSequence q() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int r() {
                return g.this.k;
            }

            @Override // android.support.v4.media.session.b
            public void s(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void t(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void u(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void v(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void x(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int y() {
                return g.this.h;
            }

            @Override // android.support.v4.media.session.b
            public void z(String str, Bundle bundle) {
                throw new AssertionError();
            }
        }

        g(Context context, String str, Bundle bundle) {
            Object b2 = android.support.v4.media.session.d.b(context, str);
            this.f104a = b2;
            this.f105b = new Token(android.support.v4.media.session.d.c(b2), new a(), bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public Token a() {
            return this.f105b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void b(PendingIntent pendingIntent) {
            android.support.v4.media.session.d.e(this.f104a, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public androidx.media.e c() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void d(androidx.media.e eVar) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void e(c cVar, Handler handler) {
            android.support.v4.media.session.d.d(this.f104a, cVar == null ? null : cVar.f94a, handler);
            if (cVar != null) {
                cVar.C(this, handler);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public PlaybackStateCompat f() {
            return this.f108e;
        }

        public String g() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return android.support.v4.media.session.f.b(this.f104a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h extends g {
        h(Context context, String str, Bundle bundle) {
            super(context, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.g, android.support.v4.media.session.MediaSessionCompat.d
        public final androidx.media.e c() {
            return new androidx.media.e(((MediaSession) this.f104a).getCurrentControllerInfo());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.g, android.support.v4.media.session.MediaSessionCompat.d
        public void d(androidx.media.e eVar) {
        }
    }

    /* loaded from: classes.dex */
    public static class i implements d {

        /* renamed from: a */
        private final b f110a;

        /* renamed from: b */
        private final Token f111b;

        /* renamed from: c */
        final String f112c;

        /* renamed from: d */
        final String f113d;

        /* renamed from: e */
        final AudioManager f114e;
        final RemoteControlClient f;
        private c i;
        volatile c k;
        private androidx.media.e l;
        int m;
        MediaMetadataCompat n;
        PlaybackStateCompat o;
        PendingIntent p;
        List<QueueItem> q;
        CharSequence r;
        int s;
        boolean t;
        int u;
        int v;
        Bundle w;
        int x;
        int y;
        l z;
        final Object g = new Object();
        final RemoteCallbackList<android.support.v4.media.session.a> h = new RemoteCallbackList<>();
        boolean j = false;

        /* loaded from: classes.dex */
        private static final class a {

            /* renamed from: a */
            public final String f115a;

            /* renamed from: b */
            public final Bundle f116b;

            /* renamed from: c */
            public final ResultReceiver f117c;

            public a(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f115a = str;
                this.f116b = bundle;
                this.f117c = resultReceiver;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b extends b.a {
            b() {
                i.this = r1;
            }

            @Override // android.support.v4.media.session.b
            public void B(android.support.v4.media.session.a aVar) {
                if (i.this.j) {
                    try {
                        aVar.d();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                i.this.h.register(aVar, new androidx.media.e("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
            }

            @Override // android.support.v4.media.session.b
            public void C(RatingCompat ratingCompat, Bundle bundle) {
                s0(31, ratingCompat, bundle);
            }

            @Override // android.support.v4.media.session.b
            public boolean D() {
                return i.this.t;
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat E() {
                return i.this.n;
            }

            @Override // android.support.v4.media.session.b
            public void F(String str, Bundle bundle) {
                s0(4, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void G() {
                o0(13);
            }

            @Override // android.support.v4.media.session.b
            public void H(android.support.v4.media.session.a aVar) {
                i.this.h.unregister(aVar);
            }

            @Override // android.support.v4.media.session.b
            public void I(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                r0(26, mediaDescriptionCompat, i);
            }

            @Override // android.support.v4.media.session.b
            public String L() {
                return i.this.f113d;
            }

            @Override // android.support.v4.media.session.b
            public String M() {
                return i.this.f112c;
            }

            @Override // android.support.v4.media.session.b
            public boolean N() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void O(boolean z) {
                q0(29, Boolean.valueOf(z));
            }

            @Override // android.support.v4.media.session.b
            public void P() {
                o0(3);
            }

            @Override // android.support.v4.media.session.b
            public void Q(RatingCompat ratingCompat) {
                q0(19, ratingCompat);
            }

            @Override // android.support.v4.media.session.b
            public void S(String str, Bundle bundle) {
                s0(8, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public long T() {
                long j;
                synchronized (i.this.g) {
                    j = i.this.m;
                }
                return j;
            }

            @Override // android.support.v4.media.session.b
            public void V(int i, int i2, String str) {
                i.this.i(i, i2);
            }

            @Override // android.support.v4.media.session.b
            public void W(Uri uri, Bundle bundle) {
                s0(6, uri, bundle);
            }

            @Override // android.support.v4.media.session.b
            public int Y() {
                return i.this.u;
            }

            @Override // android.support.v4.media.session.b
            public void a0() {
                o0(7);
            }

            @Override // android.support.v4.media.session.b
            public void b0(long j) {
                q0(11, Long.valueOf(j));
            }

            @Override // android.support.v4.media.session.b
            public void c() {
                o0(12);
            }

            @Override // android.support.v4.media.session.b
            public void c0(boolean z) {
            }

            @Override // android.support.v4.media.session.b
            public void d0(String str, Bundle bundle) {
                s0(9, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo e0() {
                int i;
                int i2;
                int streamMaxVolume;
                int streamVolume;
                synchronized (i.this.g) {
                    i iVar = i.this;
                    i = iVar.x;
                    i2 = iVar.y;
                    l lVar = iVar.z;
                    if (i == 2) {
                        lVar.a();
                        throw null;
                    }
                    streamMaxVolume = iVar.f114e.getStreamMaxVolume(i2);
                    streamVolume = i.this.f114e.getStreamVolume(i2);
                }
                return new ParcelableVolumeInfo(i, i2, 2, streamMaxVolume, streamVolume);
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat f() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (i.this.g) {
                    i iVar = i.this;
                    playbackStateCompat = iVar.o;
                    mediaMetadataCompat = iVar.n;
                }
                return MediaSessionCompat.c(playbackStateCompat, mediaMetadataCompat);
            }

            @Override // android.support.v4.media.session.b
            public void g0(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                q0(1, new a(str, bundle, resultReceiverWrapper.f90a));
            }

            @Override // android.support.v4.media.session.b
            public void h(Uri uri, Bundle bundle) {
                s0(10, uri, bundle);
            }

            @Override // android.support.v4.media.session.b
            public List<QueueItem> h0() {
                List<QueueItem> list;
                synchronized (i.this.g) {
                    list = i.this.q;
                }
                return list;
            }

            @Override // android.support.v4.media.session.b
            public void i(MediaDescriptionCompat mediaDescriptionCompat) {
                q0(27, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.b
            public void i0() {
                o0(16);
            }

            @Override // android.support.v4.media.session.b
            public void j(int i) {
                p0(23, i);
            }

            @Override // android.support.v4.media.session.b
            public Bundle j0() {
                Bundle bundle;
                synchronized (i.this.g) {
                    bundle = i.this.w;
                }
                return bundle;
            }

            @Override // android.support.v4.media.session.b
            public boolean k() {
                return (i.this.m & 2) != 0;
            }

            @Override // android.support.v4.media.session.b
            public void m() {
                o0(15);
            }

            @Override // android.support.v4.media.session.b
            public boolean m0(KeyEvent keyEvent) {
                boolean z = true;
                if ((i.this.m & 1) == 0) {
                    z = false;
                }
                if (z) {
                    q0(21, keyEvent);
                }
                return z;
            }

            @Override // android.support.v4.media.session.b
            public void n(MediaDescriptionCompat mediaDescriptionCompat) {
                q0(25, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.b
            public void next() {
                o0(14);
            }

            @Override // android.support.v4.media.session.b
            public void o() {
                o0(17);
            }

            void o0(int i) {
                i.this.h(i, 0, 0, null, null);
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent p() {
                PendingIntent pendingIntent;
                synchronized (i.this.g) {
                    pendingIntent = i.this.p;
                }
                return pendingIntent;
            }

            void p0(int i, int i2) {
                i.this.h(i, i2, 0, null, null);
            }

            @Override // android.support.v4.media.session.b
            public CharSequence q() {
                return i.this.r;
            }

            void q0(int i, Object obj) {
                i.this.h(i, 0, 0, obj, null);
            }

            @Override // android.support.v4.media.session.b
            public int r() {
                return i.this.v;
            }

            void r0(int i, Object obj, int i2) {
                i.this.h(i, i2, 0, obj, null);
            }

            @Override // android.support.v4.media.session.b
            public void s(String str, Bundle bundle) {
                s0(20, str, bundle);
            }

            void s0(int i, Object obj, Bundle bundle) {
                i.this.h(i, 0, 0, obj, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void t(long j) {
                q0(18, Long.valueOf(j));
            }

            @Override // android.support.v4.media.session.b
            public void u(int i, int i2, String str) {
                i.this.g(i, i2);
            }

            @Override // android.support.v4.media.session.b
            public void v(int i) {
                p0(30, i);
            }

            @Override // android.support.v4.media.session.b
            public void x(int i) {
                p0(28, i);
            }

            @Override // android.support.v4.media.session.b
            public int y() {
                return i.this.s;
            }

            @Override // android.support.v4.media.session.b
            public void z(String str, Bundle bundle) {
                s0(5, str, bundle);
            }
        }

        /* loaded from: classes.dex */
        public class c extends Handler {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Looper looper) {
                super(looper);
                i.this = r1;
            }

            private void a(KeyEvent keyEvent, c cVar) {
                if (keyEvent == null || keyEvent.getAction() != 0) {
                    return;
                }
                PlaybackStateCompat playbackStateCompat = i.this.o;
                long b2 = playbackStateCompat == null ? 0L : playbackStateCompat.b();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79) {
                    if (keyCode == 126) {
                        if ((b2 & 4) == 0) {
                            return;
                        }
                        cVar.i();
                        return;
                    } else if (keyCode == 127) {
                        if ((b2 & 2) == 0) {
                            return;
                        }
                        cVar.h();
                        return;
                    } else {
                        switch (keyCode) {
                            case 85:
                                break;
                            case 86:
                                if ((b2 & 1) == 0) {
                                    return;
                                }
                                cVar.B();
                                return;
                            case 87:
                                if ((b2 & 32) == 0) {
                                    return;
                                }
                                cVar.y();
                                return;
                            case 88:
                                if ((b2 & 16) == 0) {
                                    return;
                                }
                                cVar.z();
                                return;
                            case 89:
                                if ((b2 & 8) == 0) {
                                    return;
                                }
                                cVar.r();
                                return;
                            case 90:
                                if ((b2 & 64) == 0) {
                                    return;
                                }
                                cVar.f();
                                return;
                            default:
                                return;
                        }
                    }
                }
                Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                MediaDescriptionCompat mediaDescriptionCompat;
                c cVar = i.this.k;
                if (cVar == null) {
                    return;
                }
                Bundle data = message.getData();
                MediaSessionCompat.a(data);
                i.this.d(new androidx.media.e(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                Bundle bundle = data.getBundle("data_extras");
                MediaSessionCompat.a(bundle);
                try {
                    switch (message.what) {
                        case 1:
                            a aVar = (a) message.obj;
                            cVar.d(aVar.f115a, aVar.f116b, aVar.f117c);
                            break;
                        case 2:
                            i.this.g(message.arg1, 0);
                            break;
                        case 3:
                            cVar.m();
                            break;
                        case 4:
                            cVar.n((String) message.obj, bundle);
                            break;
                        case 5:
                            cVar.o((String) message.obj, bundle);
                            break;
                        case 6:
                            cVar.p((Uri) message.obj, bundle);
                            break;
                        case 7:
                            cVar.i();
                            break;
                        case 8:
                            cVar.j((String) message.obj, bundle);
                            break;
                        case 9:
                            cVar.k((String) message.obj, bundle);
                            break;
                        case 10:
                            cVar.l((Uri) message.obj, bundle);
                            break;
                        case 11:
                            cVar.A(((Long) message.obj).longValue());
                            break;
                        case 12:
                            cVar.h();
                            break;
                        case 13:
                            cVar.B();
                            break;
                        case 14:
                            cVar.y();
                            break;
                        case 15:
                            cVar.z();
                            break;
                        case 16:
                            cVar.f();
                            break;
                        case 17:
                            cVar.r();
                            break;
                        case 18:
                            cVar.s(((Long) message.obj).longValue());
                            break;
                        case 19:
                            cVar.u((RatingCompat) message.obj);
                            break;
                        case 20:
                            cVar.e((String) message.obj, bundle);
                            break;
                        case 21:
                            KeyEvent keyEvent = (KeyEvent) message.obj;
                            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                            intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                            if (!cVar.g(intent)) {
                                a(keyEvent, cVar);
                                break;
                            }
                            break;
                        case 22:
                            i.this.i(message.arg1, 0);
                            break;
                        case 23:
                            cVar.w(message.arg1);
                            break;
                        case 25:
                            cVar.b((MediaDescriptionCompat) message.obj);
                            break;
                        case 26:
                            cVar.c((MediaDescriptionCompat) message.obj, message.arg1);
                            break;
                        case 27:
                            mediaDescriptionCompat = (MediaDescriptionCompat) message.obj;
                            cVar.q(mediaDescriptionCompat);
                            break;
                        case 28:
                            List<QueueItem> list = i.this.q;
                            if (list != null) {
                                int i = message.arg1;
                                QueueItem queueItem = (i < 0 || i >= list.size()) ? null : i.this.q.get(message.arg1);
                                if (queueItem != null) {
                                    mediaDescriptionCompat = queueItem.c();
                                    cVar.q(mediaDescriptionCompat);
                                    break;
                                }
                            }
                            break;
                        case 29:
                            cVar.t(((Boolean) message.obj).booleanValue());
                            break;
                        case 30:
                            cVar.x(message.arg1);
                            break;
                        case 31:
                            cVar.v((RatingCompat) message.obj, bundle);
                            break;
                    }
                } finally {
                    i.this.d(null);
                }
            }
        }

        public i(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            if (componentName != null) {
                this.f112c = context.getPackageName();
                this.f114e = (AudioManager) context.getSystemService("audio");
                this.f113d = str;
                b bVar = new b();
                this.f110a = bVar;
                this.f111b = new Token(bVar);
                this.s = 0;
                this.x = 1;
                this.y = 3;
                this.f = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public Token a() {
            return this.f111b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void b(PendingIntent pendingIntent) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public androidx.media.e c() {
            androidx.media.e eVar;
            synchronized (this.g) {
                eVar = this.l;
            }
            return eVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void d(androidx.media.e eVar) {
            synchronized (this.g) {
                this.l = eVar;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void e(c cVar, Handler handler) {
            this.k = cVar;
            if (cVar != null) {
                if (handler == null) {
                    handler = new Handler();
                }
                synchronized (this.g) {
                    c cVar2 = this.i;
                    if (cVar2 != null) {
                        cVar2.removeCallbacksAndMessages(null);
                    }
                    this.i = new c(handler.getLooper());
                    this.k.C(this, handler);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public PlaybackStateCompat f() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.g) {
                playbackStateCompat = this.o;
            }
            return playbackStateCompat;
        }

        void g(int i, int i2) {
            if (this.x != 2) {
                this.f114e.adjustStreamVolume(this.y, i, i2);
                return;
            }
            l lVar = this.z;
            if (lVar == null) {
                return;
            }
            lVar.b(i);
        }

        void h(int i, int i2, int i3, Object obj, Bundle bundle) {
            synchronized (this.g) {
                c cVar = this.i;
                if (cVar != null) {
                    Message obtainMessage = cVar.obtainMessage(i, i2, i3, obj);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("data_calling_pkg", "android.media.session.MediaController");
                    bundle2.putInt("data_calling_pid", Binder.getCallingPid());
                    bundle2.putInt("data_calling_uid", Binder.getCallingUid());
                    if (bundle != null) {
                        bundle2.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }

        void i(int i, int i2) {
            if (this.x != 2) {
                this.f114e.setStreamVolume(this.y, i, i2);
                return;
            }
            l lVar = this.z;
            if (lVar == null) {
                return;
            }
            lVar.c(i);
        }
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private MediaSessionCompat(android.content.Context r3, java.lang.String r4, android.content.ComponentName r5, android.app.PendingIntent r6, android.os.Bundle r7) {
        /*
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L9f
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L97
            if (r5 != 0) goto L1f
            android.content.ComponentName r5 = androidx.media.session.MediaButtonReceiver.a(r3)
            if (r5 != 0) goto L1f
            java.lang.String r0 = "MediaSessionCompat"
            java.lang.String r1 = "Couldn't find a unique registered media button receiver in the given context."
            android.util.Log.w(r0, r1)
        L1f:
            if (r5 == 0) goto L32
            if (r6 != 0) goto L32
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.MEDIA_BUTTON"
            r6.<init>(r0)
            r6.setComponent(r5)
            r0 = 0
            android.app.PendingIntent r6 = android.app.PendingIntent.getBroadcast(r3, r0, r6, r0)
        L32:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L4b
            android.support.v4.media.session.MediaSessionCompat$h r5 = new android.support.v4.media.session.MediaSessionCompat$h
            r5.<init>(r3, r4, r7)
            r2.f86a = r5
            android.support.v4.media.session.MediaSessionCompat$a r4 = new android.support.v4.media.session.MediaSessionCompat$a
            r4.<init>(r2)
        L44:
            r2.d(r4)
            r5.b(r6)
            goto L78
        L4b:
            r1 = 21
            if (r0 < r1) goto L5c
            android.support.v4.media.session.MediaSessionCompat$g r5 = new android.support.v4.media.session.MediaSessionCompat$g
            r5.<init>(r3, r4, r7)
            r2.f86a = r5
            android.support.v4.media.session.MediaSessionCompat$b r4 = new android.support.v4.media.session.MediaSessionCompat$b
            r4.<init>(r2)
            goto L44
        L5c:
            r7 = 19
            if (r0 < r7) goto L68
            android.support.v4.media.session.MediaSessionCompat$f r7 = new android.support.v4.media.session.MediaSessionCompat$f
            r7.<init>(r3, r4, r5, r6)
        L65:
            r2.f86a = r7
            goto L78
        L68:
            r7 = 18
            if (r0 < r7) goto L72
            android.support.v4.media.session.MediaSessionCompat$e r7 = new android.support.v4.media.session.MediaSessionCompat$e
            r7.<init>(r3, r4, r5, r6)
            goto L65
        L72:
            android.support.v4.media.session.MediaSessionCompat$i r7 = new android.support.v4.media.session.MediaSessionCompat$i
            r7.<init>(r3, r4, r5, r6)
            goto L65
        L78:
            android.support.v4.media.session.MediaControllerCompat r4 = new android.support.v4.media.session.MediaControllerCompat
            r4.<init>(r3, r2)
            int r4 = android.support.v4.media.session.MediaSessionCompat.f85b
            if (r4 != 0) goto L96
            r4 = 1
            r5 = 1134559232(0x43a00000, float:320.0)
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = android.util.TypedValue.applyDimension(r4, r5, r3)
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r3 = (int) r3
            android.support.v4.media.session.MediaSessionCompat.f85b = r3
        L96:
            return
        L97:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "tag must not be null or empty"
            r3.<init>(r4)
            throw r3
        L9f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "context must not be null"
            r3.<init>(r4)
            goto La8
        La7:
            throw r3
        La8:
            goto La7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.<init>(android.content.Context, java.lang.String, android.content.ComponentName, android.app.PendingIntent, android.os.Bundle):void");
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    static PlaybackStateCompat c(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat != null) {
            long j = -1;
            if (playbackStateCompat.e() == -1) {
                return playbackStateCompat;
            }
            if (playbackStateCompat.f() != 3 && playbackStateCompat.f() != 4 && playbackStateCompat.f() != 5) {
                return playbackStateCompat;
            }
            long c2 = playbackStateCompat.c();
            if (c2 <= 0) {
                return playbackStateCompat;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long d2 = (playbackStateCompat.d() * ((float) (elapsedRealtime - c2))) + playbackStateCompat.e();
            if (mediaMetadataCompat != null && mediaMetadataCompat.a("android.media.metadata.DURATION")) {
                j = mediaMetadataCompat.c("android.media.metadata.DURATION");
            }
            long j2 = (j < 0 || d2 <= j) ? d2 < 0 ? 0L : d2 : j;
            PlaybackStateCompat.b bVar = new PlaybackStateCompat.b(playbackStateCompat);
            bVar.b(playbackStateCompat.f(), j2, playbackStateCompat.d(), elapsedRealtime);
            return bVar.a();
        }
        return playbackStateCompat;
    }

    public Token b() {
        return this.f86a.a();
    }

    public void d(c cVar) {
        e(cVar, null);
    }

    public void e(c cVar, Handler handler) {
        if (cVar == null) {
            this.f86a.e(null, null);
            return;
        }
        d dVar = this.f86a;
        if (handler == null) {
            handler = new Handler();
        }
        dVar.e(cVar, handler);
    }
}
