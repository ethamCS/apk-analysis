package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private final f f3648a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final AbstractC0043c f3649a;

        public a(ClipData clipData, int i10) {
            this.f3649a = Build.VERSION.SDK_INT >= 31 ? new b(clipData, i10) : new d(clipData, i10);
        }

        public c a() {
            return this.f3649a.b();
        }

        public a b(Bundle bundle) {
            this.f3649a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f3649a.d(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f3649a.c(uri);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements AbstractC0043c {

        /* renamed from: a */
        private final ContentInfo.Builder f3650a;

        b(ClipData clipData, int i10) {
            this.f3650a = new ContentInfo.Builder(clipData, i10);
        }

        @Override // androidx.core.view.c.AbstractC0043c
        public c b() {
            return new c(new e(this.f3650a.build()));
        }

        @Override // androidx.core.view.c.AbstractC0043c
        public void c(Uri uri) {
            this.f3650a.setLinkUri(uri);
        }

        @Override // androidx.core.view.c.AbstractC0043c
        public void d(int i10) {
            this.f3650a.setFlags(i10);
        }

        @Override // androidx.core.view.c.AbstractC0043c
        public void setExtras(Bundle bundle) {
            this.f3650a.setExtras(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.c$c */
    /* loaded from: classes.dex */
    public interface AbstractC0043c {
        c b();

        void c(Uri uri);

        void d(int i10);

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d implements AbstractC0043c {

        /* renamed from: a */
        ClipData f3651a;

        /* renamed from: b */
        int f3652b;

        /* renamed from: c */
        int f3653c;

        /* renamed from: d */
        Uri f3654d;

        /* renamed from: e */
        Bundle f3655e;

        d(ClipData clipData, int i10) {
            this.f3651a = clipData;
            this.f3652b = i10;
        }

        @Override // androidx.core.view.c.AbstractC0043c
        public c b() {
            return new c(new g(this));
        }

        @Override // androidx.core.view.c.AbstractC0043c
        public void c(Uri uri) {
            this.f3654d = uri;
        }

        @Override // androidx.core.view.c.AbstractC0043c
        public void d(int i10) {
            this.f3653c = i10;
        }

        @Override // androidx.core.view.c.AbstractC0043c
        public void setExtras(Bundle bundle) {
            this.f3655e = bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e implements f {

        /* renamed from: a */
        private final ContentInfo f3656a;

        e(ContentInfo contentInfo) {
            this.f3656a = (ContentInfo) androidx.core.util.h.g(contentInfo);
        }

        @Override // androidx.core.view.c.f
        public int m() {
            return this.f3656a.getSource();
        }

        @Override // androidx.core.view.c.f
        public ClipData n() {
            return this.f3656a.getClip();
        }

        @Override // androidx.core.view.c.f
        public int o() {
            return this.f3656a.getFlags();
        }

        @Override // androidx.core.view.c.f
        public ContentInfo p() {
            return this.f3656a;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f3656a + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface f {
        int m();

        ClipData n();

        int o();

        ContentInfo p();
    }

    /* loaded from: classes.dex */
    private static final class g implements f {

        /* renamed from: a */
        private final ClipData f3657a;

        /* renamed from: b */
        private final int f3658b;

        /* renamed from: c */
        private final int f3659c;

        /* renamed from: d */
        private final Uri f3660d;

        /* renamed from: e */
        private final Bundle f3661e;

        g(d dVar) {
            this.f3657a = (ClipData) androidx.core.util.h.g(dVar.f3651a);
            this.f3658b = androidx.core.util.h.c(dVar.f3652b, 0, 5, "source");
            this.f3659c = androidx.core.util.h.f(dVar.f3653c, 1);
            this.f3660d = dVar.f3654d;
            this.f3661e = dVar.f3655e;
        }

        @Override // androidx.core.view.c.f
        public int m() {
            return this.f3658b;
        }

        @Override // androidx.core.view.c.f
        public ClipData n() {
            return this.f3657a;
        }

        @Override // androidx.core.view.c.f
        public int o() {
            return this.f3659c;
        }

        @Override // androidx.core.view.c.f
        public ContentInfo p() {
            return null;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f3657a.getDescription());
            sb2.append(", source=");
            sb2.append(c.e(this.f3658b));
            sb2.append(", flags=");
            sb2.append(c.a(this.f3659c));
            Uri uri = this.f3660d;
            String str2 = BuildConfig.FLAVOR;
            if (uri == null) {
                str = str2;
            } else {
                str = ", hasLinkUri(" + this.f3660d.toString().length() + ")";
            }
            sb2.append(str);
            if (this.f3661e != null) {
                str2 = ", hasExtras";
            }
            sb2.append(str2);
            sb2.append("}");
            return sb2.toString();
        }
    }

    c(f fVar) {
        this.f3648a = fVar;
    }

    static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    static String e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static c g(ContentInfo contentInfo) {
        return new c(new e(contentInfo));
    }

    public ClipData b() {
        return this.f3648a.n();
    }

    public int c() {
        return this.f3648a.o();
    }

    public int d() {
        return this.f3648a.m();
    }

    public ContentInfo f() {
        ContentInfo p10 = this.f3648a.p();
        Objects.requireNonNull(p10);
        return p10;
    }

    public String toString() {
        return this.f3648a.toString();
    }
}
