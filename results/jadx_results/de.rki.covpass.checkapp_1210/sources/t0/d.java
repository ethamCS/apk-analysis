package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    private final c f21791a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements c {

        /* renamed from: a */
        final InputContentInfo f21792a;

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f21792a = new InputContentInfo(uri, clipDescription, uri2);
        }

        a(Object obj) {
            this.f21792a = (InputContentInfo) obj;
        }

        @Override // t0.d.c
        public ClipDescription a() {
            return this.f21792a.getDescription();
        }

        @Override // t0.d.c
        public Object b() {
            return this.f21792a;
        }

        @Override // t0.d.c
        public Uri c() {
            return this.f21792a.getContentUri();
        }

        @Override // t0.d.c
        public void d() {
            this.f21792a.requestPermission();
        }

        @Override // t0.d.c
        public Uri e() {
            return this.f21792a.getLinkUri();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements c {

        /* renamed from: a */
        private final Uri f21793a;

        /* renamed from: b */
        private final ClipDescription f21794b;

        /* renamed from: c */
        private final Uri f21795c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f21793a = uri;
            this.f21794b = clipDescription;
            this.f21795c = uri2;
        }

        @Override // t0.d.c
        public ClipDescription a() {
            return this.f21794b;
        }

        @Override // t0.d.c
        public Object b() {
            return null;
        }

        @Override // t0.d.c
        public Uri c() {
            return this.f21793a;
        }

        @Override // t0.d.c
        public void d() {
        }

        @Override // t0.d.c
        public Uri e() {
            return this.f21795c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        ClipDescription a();

        Object b();

        Uri c();

        void d();

        Uri e();
    }

    public d(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f21791a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    private d(c cVar) {
        this.f21791a = cVar;
    }

    public static d f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new d(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f21791a.c();
    }

    public ClipDescription b() {
        return this.f21791a.a();
    }

    public Uri c() {
        return this.f21791a.e();
    }

    public void d() {
        this.f21791a.d();
    }

    public Object e() {
        return this.f21791a.b();
    }
}
