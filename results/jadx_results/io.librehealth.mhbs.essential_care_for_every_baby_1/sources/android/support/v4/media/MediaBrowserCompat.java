package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.a;
import android.support.v4.media.b;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* renamed from: b */
    static final boolean f9b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a */
    private final e f10a;

    /* loaded from: classes.dex */
    private static class CustomActionResultReceiver extends a.a.a.a.b {

        /* renamed from: c */
        private final String f11c;

        /* renamed from: d */
        private final Bundle f12d;

        /* renamed from: e */
        private final c f13e;

        @Override // a.a.a.a.b
        protected void a(int i, Bundle bundle) {
            if (this.f13e == null) {
                return;
            }
            MediaSessionCompat.a(bundle);
            if (i == -1) {
                this.f13e.a(this.f11c, this.f12d, bundle);
            } else if (i == 0) {
                this.f13e.c(this.f11c, this.f12d, bundle);
            } else if (i == 1) {
                this.f13e.b(this.f11c, this.f12d, bundle);
            } else {
                Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.f12d + ", resultData=" + bundle + ")");
            }
        }
    }

    /* loaded from: classes.dex */
    private static class ItemReceiver extends a.a.a.a.b {

        /* renamed from: c */
        private final String f14c;

        /* renamed from: d */
        private final d f15d;

        @Override // a.a.a.a.b
        protected void a(int i, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.f15d.a(this.f14c);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.f15d.b((MediaItem) parcelable);
            } else {
                this.f15d.a(this.f14c);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();

        /* renamed from: a */
        private final int f16a;

        /* renamed from: b */
        private final MediaDescriptionCompat f17b;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<MediaItem> {
            a() {
            }

            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: b */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        MediaItem(Parcel parcel) {
            this.f16a = parcel.readInt();
            this.f17b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat != null) {
                if (TextUtils.isEmpty(mediaDescriptionCompat.c())) {
                    throw new IllegalArgumentException("description must have a non-empty media id");
                }
                this.f16a = i;
                this.f17b = mediaDescriptionCompat;
                return;
            }
            throw new IllegalArgumentException("description cannot be null");
        }

        public static MediaItem a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new MediaItem(MediaDescriptionCompat.a(a.c.a(obj)), a.c.b(obj));
        }

        public static List<MediaItem> b(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.f16a + ", mDescription=" + this.f17b + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f16a);
            this.f17b.writeToParcel(parcel, i);
        }
    }

    /* loaded from: classes.dex */
    private static class SearchResultReceiver extends a.a.a.a.b {

        /* renamed from: c */
        private final String f18c;

        /* renamed from: d */
        private final Bundle f19d;

        /* renamed from: e */
        private final k f20e;

        @Override // a.a.a.a.b
        protected void a(int i, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.f20e.a(this.f18c, this.f19d);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            ArrayList arrayList = null;
            if (parcelableArray != null) {
                arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            this.f20e.b(this.f18c, this.f19d, arrayList);
        }
    }

    /* loaded from: classes.dex */
    public static class a extends Handler {

        /* renamed from: a */
        private final WeakReference<j> f21a;

        /* renamed from: b */
        private WeakReference<Messenger> f22b;

        a(j jVar) {
            this.f21a = new WeakReference<>(jVar);
        }

        void a(Messenger messenger) {
            this.f22b = new WeakReference<>(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f22b;
            if (weakReference == null || weakReference.get() == null || this.f21a.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.a(data);
            j jVar = this.f21a.get();
            Messenger messenger = this.f22b.get();
            try {
                int i = message.what;
                if (i == 1) {
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle);
                    jVar.g(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                } else if (i == 2) {
                    jVar.i(messenger);
                } else if (i != 3) {
                    Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                } else {
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.a(bundle2);
                    Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                    MediaSessionCompat.a(bundle3);
                    jVar.h(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what != 1) {
                    return;
                }
                jVar.i(messenger);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final Object f23a;

        /* renamed from: b */
        a f24b;

        /* loaded from: classes.dex */
        public interface a {
            void b();

            void c();

            void d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b */
        /* loaded from: classes.dex */
        public class C0005b implements a.AbstractC0006a {
            C0005b() {
                b.this = r1;
            }

            @Override // android.support.v4.media.a.AbstractC0006a
            public void b() {
                a aVar = b.this.f24b;
                if (aVar != null) {
                    aVar.b();
                }
                b.this.a();
            }

            @Override // android.support.v4.media.a.AbstractC0006a
            public void c() {
                a aVar = b.this.f24b;
                if (aVar != null) {
                    aVar.c();
                }
                b.this.b();
            }

            @Override // android.support.v4.media.a.AbstractC0006a
            public void d() {
                a aVar = b.this.f24b;
                if (aVar != null) {
                    aVar.d();
                }
                b.this.c();
            }
        }

        public b() {
            this.f23a = Build.VERSION.SDK_INT >= 21 ? android.support.v4.media.a.c(new C0005b()) : null;
        }

        public void a() {
            throw null;
        }

        public void b() {
            throw null;
        }

        public void c() {
            throw null;
        }

        void d(a aVar) {
            this.f24b = aVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a(String str, Bundle bundle, Bundle bundle2);

        public abstract void b(String str, Bundle bundle, Bundle bundle2);

        public abstract void c(String str, Bundle bundle, Bundle bundle2);
    }

    /* loaded from: classes.dex */
    public static abstract class d {
        public abstract void a(String str);

        public abstract void b(MediaItem mediaItem);
    }

    /* loaded from: classes.dex */
    public interface e {
        MediaSessionCompat.Token a();

        void e();

        void f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class f implements e, j, b.a {

        /* renamed from: a */
        final Context f26a;

        /* renamed from: b */
        protected final Object f27b;

        /* renamed from: c */
        protected final Bundle f28c;

        /* renamed from: d */
        protected final a f29d = new a(this);

        /* renamed from: e */
        private final b.b.a<String, m> f30e = new b.b.a<>();
        protected l f;
        protected Messenger g;
        private MediaSessionCompat.Token h;

        f(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            this.f26a = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.f28c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bVar.d(this);
            this.f27b = android.support.v4.media.a.b(context, componentName, bVar.f23a, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public MediaSessionCompat.Token a() {
            if (this.h == null) {
                this.h = MediaSessionCompat.Token.a(android.support.v4.media.a.g(this.f27b));
            }
            return this.h;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public void b() {
            Bundle f = android.support.v4.media.a.f(this.f27b);
            if (f == null) {
                return;
            }
            f.getInt("extra_service_version", 0);
            IBinder a2 = androidx.core.app.b.a(f, "extra_messenger");
            if (a2 != null) {
                this.f = new l(a2, this.f28c);
                Messenger messenger = new Messenger(this.f29d);
                this.g = messenger;
                this.f29d.a(messenger);
                try {
                    this.f.d(this.f26a, this.g);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                }
            }
            android.support.v4.media.session.b n0 = b.a.n0(androidx.core.app.b.a(f, "extra_session_binder"));
            if (n0 == null) {
                return;
            }
            this.h = MediaSessionCompat.Token.b(android.support.v4.media.a.g(this.f27b), n0);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public void c() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public void d() {
            this.f = null;
            this.g = null;
            this.h = null;
            this.f29d.a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void e() {
            Messenger messenger;
            l lVar = this.f;
            if (lVar != null && (messenger = this.g) != null) {
                try {
                    lVar.f(messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            android.support.v4.media.a.e(this.f27b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void f() {
            android.support.v4.media.a.a(this.f27b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void g(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void h(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.g != messenger) {
                return;
            }
            m mVar = this.f30e.get(str);
            if (mVar == null) {
                if (!MediaBrowserCompat.f9b) {
                    return;
                }
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                return;
            }
            n a2 = mVar.a(bundle);
            if (a2 == null) {
                return;
            }
            if (bundle == null) {
                if (list == null) {
                    a2.c(str);
                } else {
                    a2.a(str, list);
                }
            } else if (list == null) {
                a2.d(str, bundle);
            } else {
                a2.b(str, list, bundle);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void i(Messenger messenger) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class g extends f {
        g(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h extends g {
        h(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class i implements e, j {

        /* renamed from: a */
        final Context f31a;

        /* renamed from: b */
        final ComponentName f32b;

        /* renamed from: c */
        final b f33c;

        /* renamed from: d */
        final Bundle f34d;

        /* renamed from: e */
        final a f35e = new a(this);
        private final b.b.a<String, m> f = new b.b.a<>();
        int g = 1;
        c h;
        l i;
        Messenger j;
        private String k;
        private MediaSessionCompat.Token l;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
                i.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                i iVar = i.this;
                if (iVar.g == 0) {
                    return;
                }
                iVar.g = 2;
                if (MediaBrowserCompat.f9b && iVar.h != null) {
                    throw new RuntimeException("mServiceConnection should be null. Instead it is " + i.this.h);
                } else if (iVar.i != null) {
                    throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + i.this.i);
                } else if (iVar.j != null) {
                    throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + i.this.j);
                } else {
                    Intent intent = new Intent("android.media.browse.MediaBrowserService");
                    intent.setComponent(i.this.f32b);
                    i iVar2 = i.this;
                    c cVar = new c();
                    iVar2.h = cVar;
                    boolean z = false;
                    try {
                        z = iVar2.f31a.bindService(intent, cVar, 1);
                    } catch (Exception unused) {
                        Log.e("MediaBrowserCompat", "Failed binding to service " + i.this.f32b);
                    }
                    if (!z) {
                        i.this.c();
                        i.this.f33c.b();
                    }
                    if (!MediaBrowserCompat.f9b) {
                        return;
                    }
                    Log.d("MediaBrowserCompat", "connect...");
                    i.this.b();
                }
            }
        }

        /* loaded from: classes.dex */
        class b implements Runnable {
            b() {
                i.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                i iVar = i.this;
                Messenger messenger = iVar.j;
                if (messenger != null) {
                    try {
                        iVar.i.c(messenger);
                    } catch (RemoteException unused) {
                        Log.w("MediaBrowserCompat", "RemoteException during connect for " + i.this.f32b);
                    }
                }
                i iVar2 = i.this;
                int i = iVar2.g;
                iVar2.c();
                if (i != 0) {
                    i.this.g = i;
                }
                if (MediaBrowserCompat.f9b) {
                    Log.d("MediaBrowserCompat", "disconnect...");
                    i.this.b();
                }
            }
        }

        /* loaded from: classes.dex */
        public class c implements ServiceConnection {

            /* loaded from: classes.dex */
            class a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ ComponentName f39a;

                /* renamed from: b */
                final /* synthetic */ IBinder f40b;

                a(ComponentName componentName, IBinder iBinder) {
                    c.this = r1;
                    this.f39a = componentName;
                    this.f40b = iBinder;
                }

                @Override // java.lang.Runnable
                public void run() {
                    boolean z = MediaBrowserCompat.f9b;
                    if (z) {
                        Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceConnected name=" + this.f39a + " binder=" + this.f40b);
                        i.this.b();
                    }
                    if (!c.this.a("onServiceConnected")) {
                        return;
                    }
                    i iVar = i.this;
                    iVar.i = new l(this.f40b, iVar.f34d);
                    i.this.j = new Messenger(i.this.f35e);
                    i iVar2 = i.this;
                    iVar2.f35e.a(iVar2.j);
                    i.this.g = 2;
                    if (z) {
                        try {
                            Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                            i.this.b();
                        } catch (RemoteException unused) {
                            Log.w("MediaBrowserCompat", "RemoteException during connect for " + i.this.f32b);
                            if (!MediaBrowserCompat.f9b) {
                                return;
                            }
                            Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                            i.this.b();
                            return;
                        }
                    }
                    i iVar3 = i.this;
                    iVar3.i.b(iVar3.f31a, iVar3.j);
                }
            }

            /* loaded from: classes.dex */
            class b implements Runnable {

                /* renamed from: a */
                final /* synthetic */ ComponentName f42a;

                b(ComponentName componentName) {
                    c.this = r1;
                    this.f42a = componentName;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (MediaBrowserCompat.f9b) {
                        Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceDisconnected name=" + this.f42a + " this=" + this + " mServiceConnection=" + i.this.h);
                        i.this.b();
                    }
                    if (!c.this.a("onServiceDisconnected")) {
                        return;
                    }
                    i iVar = i.this;
                    iVar.i = null;
                    iVar.j = null;
                    iVar.f35e.a(null);
                    i iVar2 = i.this;
                    iVar2.g = 4;
                    iVar2.f33c.c();
                }
            }

            c() {
                i.this = r1;
            }

            private void b(Runnable runnable) {
                if (Thread.currentThread() == i.this.f35e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    i.this.f35e.post(runnable);
                }
            }

            boolean a(String str) {
                int i;
                i iVar = i.this;
                if (iVar.h != this || (i = iVar.g) == 0 || i == 1) {
                    int i2 = iVar.g;
                    if (i2 == 0 || i2 == 1) {
                        return false;
                    }
                    Log.i("MediaBrowserCompat", str + " for " + i.this.f32b + " with mServiceConnection=" + i.this.h + " this=" + this);
                    return false;
                }
                return true;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                b(new a(componentName, iBinder));
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                b(new b(componentName));
            }
        }

        public i(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            if (context != null) {
                if (componentName == null) {
                    throw new IllegalArgumentException("service component must not be null");
                }
                if (bVar == null) {
                    throw new IllegalArgumentException("connection callback must not be null");
                }
                this.f31a = context;
                this.f32b = componentName;
                this.f33c = bVar;
                this.f34d = bundle == null ? null : new Bundle(bundle);
                return;
            }
            throw new IllegalArgumentException("context must not be null");
        }

        private static String d(int i) {
            if (i != 0) {
                if (i == 1) {
                    return "CONNECT_STATE_DISCONNECTED";
                }
                if (i == 2) {
                    return "CONNECT_STATE_CONNECTING";
                }
                if (i == 3) {
                    return "CONNECT_STATE_CONNECTED";
                }
                if (i == 4) {
                    return "CONNECT_STATE_SUSPENDED";
                }
                return "UNKNOWN/" + i;
            }
            return "CONNECT_STATE_DISCONNECTING";
        }

        private boolean k(Messenger messenger, String str) {
            int i;
            if (this.j != messenger || (i = this.g) == 0 || i == 1) {
                int i2 = this.g;
                if (i2 == 0 || i2 == 1) {
                    return false;
                }
                Log.i("MediaBrowserCompat", str + " for " + this.f32b + " with mCallbacksMessenger=" + this.j + " this=" + this);
                return false;
            }
            return true;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public MediaSessionCompat.Token a() {
            if (j()) {
                return this.l;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.g + ")");
        }

        void b() {
            Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
            Log.d("MediaBrowserCompat", "  mServiceComponent=" + this.f32b);
            Log.d("MediaBrowserCompat", "  mCallback=" + this.f33c);
            Log.d("MediaBrowserCompat", "  mRootHints=" + this.f34d);
            Log.d("MediaBrowserCompat", "  mState=" + d(this.g));
            Log.d("MediaBrowserCompat", "  mServiceConnection=" + this.h);
            Log.d("MediaBrowserCompat", "  mServiceBinderWrapper=" + this.i);
            Log.d("MediaBrowserCompat", "  mCallbacksMessenger=" + this.j);
            Log.d("MediaBrowserCompat", "  mRootId=" + this.k);
            Log.d("MediaBrowserCompat", "  mMediaSessionToken=" + this.l);
        }

        void c() {
            c cVar = this.h;
            if (cVar != null) {
                this.f31a.unbindService(cVar);
            }
            this.g = 1;
            this.h = null;
            this.i = null;
            this.j = null;
            this.f35e.a(null);
            this.k = null;
            this.l = null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void e() {
            this.g = 0;
            this.f35e.post(new b());
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void f() {
            int i = this.g;
            if (i == 0 || i == 1) {
                this.g = 2;
                this.f35e.post(new a());
                return;
            }
            throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + d(this.g) + ")");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void g(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (!k(messenger, "onConnect")) {
                return;
            }
            if (this.g != 2) {
                Log.w("MediaBrowserCompat", "onConnect from service while mState=" + d(this.g) + "... ignoring");
                return;
            }
            this.k = str;
            this.l = token;
            this.g = 3;
            if (MediaBrowserCompat.f9b) {
                Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                b();
            }
            this.f33c.a();
            try {
                for (Map.Entry<String, m> entry : this.f.entrySet()) {
                    String key = entry.getKey();
                    m value = entry.getValue();
                    List<n> b2 = value.b();
                    List<Bundle> c2 = value.c();
                    for (int i = 0; i < b2.size(); i++) {
                        this.i.a(key, b2.get(i).f49b, c2.get(i), this.j);
                    }
                }
            } catch (RemoteException unused) {
                Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void h(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (!k(messenger, "onLoadChildren")) {
                return;
            }
            boolean z = MediaBrowserCompat.f9b;
            if (z) {
                Log.d("MediaBrowserCompat", "onLoadChildren for " + this.f32b + " id=" + str);
            }
            m mVar = this.f.get(str);
            if (mVar == null) {
                if (!z) {
                    return;
                }
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                return;
            }
            n a2 = mVar.a(bundle);
            if (a2 == null) {
                return;
            }
            if (bundle == null) {
                if (list == null) {
                    a2.c(str);
                } else {
                    a2.a(str, list);
                }
            } else if (list == null) {
                a2.d(str, bundle);
            } else {
                a2.b(str, list, bundle);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void i(Messenger messenger) {
            Log.e("MediaBrowserCompat", "onConnectFailed for " + this.f32b);
            if (!k(messenger, "onConnectFailed")) {
                return;
            }
            if (this.g == 2) {
                c();
                this.f33c.b();
                return;
            }
            Log.w("MediaBrowserCompat", "onConnect from service while mState=" + d(this.g) + "... ignoring");
        }

        public boolean j() {
            return this.g == 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface j {
        void g(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void h(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        void i(Messenger messenger);
    }

    /* loaded from: classes.dex */
    public static abstract class k {
        public abstract void a(String str, Bundle bundle);

        public abstract void b(String str, Bundle bundle, List<MediaItem> list);
    }

    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: a */
        private Messenger f44a;

        /* renamed from: b */
        private Bundle f45b;

        public l(IBinder iBinder, Bundle bundle) {
            this.f44a = new Messenger(iBinder);
            this.f45b = bundle;
        }

        private void e(int i, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f44a.send(obtain);
        }

        void a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            androidx.core.app.b.b(bundle2, "data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            e(3, bundle2, messenger);
        }

        void b(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", this.f45b);
            e(1, bundle, messenger);
        }

        void c(Messenger messenger) {
            e(2, null, messenger);
        }

        void d(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", this.f45b);
            e(6, bundle, messenger);
        }

        void f(Messenger messenger) {
            e(7, null, messenger);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class m {

        /* renamed from: a */
        private final List<n> f46a = new ArrayList();

        /* renamed from: b */
        private final List<Bundle> f47b = new ArrayList();

        public n a(Bundle bundle) {
            for (int i = 0; i < this.f47b.size(); i++) {
                if (androidx.media.d.a(this.f47b.get(i), bundle)) {
                    return this.f46a.get(i);
                }
            }
            return null;
        }

        public List<n> b() {
            return this.f46a;
        }

        public List<Bundle> c() {
            return this.f47b;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class n {

        /* renamed from: a */
        final Object f48a;

        /* renamed from: b */
        final IBinder f49b = new Binder();

        /* renamed from: c */
        WeakReference<m> f50c;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public class a implements a.d {
            a() {
                n.this = r1;
            }

            @Override // android.support.v4.media.a.d
            public void c(String str) {
                n.this.c(str);
            }

            @Override // android.support.v4.media.a.d
            public void d(String str, List<?> list) {
                WeakReference<m> weakReference = n.this.f50c;
                m mVar = weakReference == null ? null : weakReference.get();
                if (mVar == null) {
                    n.this.a(str, MediaItem.b(list));
                    return;
                }
                List<MediaItem> b2 = MediaItem.b(list);
                List<n> b3 = mVar.b();
                List<Bundle> c2 = mVar.c();
                for (int i = 0; i < b3.size(); i++) {
                    Bundle bundle = c2.get(i);
                    if (bundle == null) {
                        n.this.a(str, b2);
                    } else {
                        n.this.b(str, e(b2, bundle), bundle);
                    }
                }
            }

            List<MediaItem> e(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.emptyList();
                }
                if (i4 > list.size()) {
                    i4 = list.size();
                }
                return list.subList(i3, i4);
            }
        }

        /* loaded from: classes.dex */
        private class b extends a implements b.a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b() {
                super();
                n.this = r1;
            }

            @Override // android.support.v4.media.b.a
            public void a(String str, List<?> list, Bundle bundle) {
                n.this.b(str, MediaItem.b(list), bundle);
            }

            @Override // android.support.v4.media.b.a
            public void b(String str, Bundle bundle) {
                n.this.d(str, bundle);
            }
        }

        public n() {
            Object d2;
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                d2 = android.support.v4.media.b.a(new b());
            } else if (i < 21) {
                return;
            } else {
                d2 = android.support.v4.media.a.d(new a());
            }
            this.f48a = d2;
        }

        public void a(String str, List<MediaItem> list) {
        }

        public void b(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void c(String str) {
        }

        public void d(String str, Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, b bVar, Bundle bundle) {
        int i2 = Build.VERSION.SDK_INT;
        this.f10a = i2 >= 26 ? new h(context, componentName, bVar, bundle) : i2 >= 23 ? new g(context, componentName, bVar, bundle) : i2 >= 21 ? new f(context, componentName, bVar, bundle) : new i(context, componentName, bVar, bundle);
    }

    public void a() {
        this.f10a.f();
    }

    public void b() {
        this.f10a.e();
    }

    public MediaSessionCompat.Token c() {
        return this.f10a.a();
    }
}
