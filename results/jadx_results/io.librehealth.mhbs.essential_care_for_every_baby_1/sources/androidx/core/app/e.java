package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/* loaded from: classes.dex */
public class e {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Bundle f164a;

        /* renamed from: b */
        private IconCompat f165b;

        /* renamed from: c */
        private final i[] f166c;

        /* renamed from: d */
        private final i[] f167d;

        /* renamed from: e */
        private boolean f168e;
        boolean f;
        private final int g;
        private final boolean h;
        @Deprecated
        public int i;
        public CharSequence j;
        public PendingIntent k;

        /* renamed from: androidx.core.app.e$a$a */
        /* loaded from: classes.dex */
        public static final class C0014a {

            /* renamed from: a */
            private final IconCompat f169a;

            /* renamed from: b */
            private final CharSequence f170b;

            /* renamed from: c */
            private final PendingIntent f171c;

            /* renamed from: d */
            private boolean f172d;

            /* renamed from: e */
            private final Bundle f173e;
            private ArrayList<i> f;
            private int g;
            private boolean h;
            private boolean i;

            public C0014a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.d(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false);
            }

            private C0014a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, i[] iVarArr, boolean z, int i, boolean z2, boolean z3) {
                this.f172d = true;
                this.h = true;
                this.f169a = iconCompat;
                this.f170b = C0015e.h(charSequence);
                this.f171c = pendingIntent;
                this.f173e = bundle;
                this.f = iVarArr == null ? null : new ArrayList<>(Arrays.asList(iVarArr));
                this.f172d = z;
                this.g = i;
                this.h = z2;
                this.i = z3;
            }

            private void c() {
                if (this.i && this.f171c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C0014a a(i iVar) {
                if (this.f == null) {
                    this.f = new ArrayList<>();
                }
                this.f.add(iVar);
                return this;
            }

            public a b() {
                c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<i> arrayList3 = this.f;
                if (arrayList3 != null) {
                    Iterator<i> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        i next = it.next();
                        if (next.l()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                i[] iVarArr = null;
                i[] iVarArr2 = arrayList.isEmpty() ? null : (i[]) arrayList.toArray(new i[arrayList.size()]);
                if (!arrayList2.isEmpty()) {
                    iVarArr = (i[]) arrayList2.toArray(new i[arrayList2.size()]);
                }
                return new a(this.f169a, this.f170b, this.f171c, this.f173e, iVarArr, iVarArr2, this.f172d, this.g, this.h, this.i);
            }
        }

        public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.d(null, "", i) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, i[] iVarArr, i[] iVarArr2, boolean z, int i, boolean z2, boolean z3) {
            this.f = true;
            this.f165b = iconCompat;
            if (iconCompat != null && iconCompat.j() == 2) {
                this.i = iconCompat.e();
            }
            this.j = C0015e.h(charSequence);
            this.k = pendingIntent;
            this.f164a = bundle == null ? new Bundle() : bundle;
            this.f166c = iVarArr;
            this.f167d = iVarArr2;
            this.f168e = z;
            this.g = i;
            this.f = z2;
            this.h = z3;
        }

        public PendingIntent a() {
            return this.k;
        }

        public boolean b() {
            return this.f168e;
        }

        public i[] c() {
            return this.f167d;
        }

        public Bundle d() {
            return this.f164a;
        }

        @Deprecated
        public int e() {
            return this.i;
        }

        public IconCompat f() {
            int i;
            if (this.f165b == null && (i = this.i) != 0) {
                this.f165b = IconCompat.d(null, "", i);
            }
            return this.f165b;
        }

        public i[] g() {
            return this.f166c;
        }

        public int h() {
            return this.g;
        }

        public boolean i() {
            return this.f;
        }

        public CharSequence j() {
            return this.j;
        }

        public boolean k() {
            return this.h;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: e */
        private Bitmap f174e;
        private Bitmap f;
        private boolean g;

        @Override // androidx.core.app.e.g
        public void b(androidx.core.app.d dVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(dVar.a()).setBigContentTitle(this.f183b).bigPicture(this.f174e);
                if (this.g) {
                    bigPicture.bigLargeIcon(this.f);
                }
                if (!this.f185d) {
                    return;
                }
                bigPicture.setSummaryText(this.f184c);
            }
        }

        public b l(Bitmap bitmap) {
            this.f = bitmap;
            this.g = true;
            return this;
        }

        public b m(Bitmap bitmap) {
            this.f174e = bitmap;
            return this;
        }

        public b n(CharSequence charSequence) {
            this.f183b = C0015e.h(charSequence);
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f184c = C0015e.h(charSequence);
            this.f185d = true;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends g {

        /* renamed from: e */
        private CharSequence f175e;

        @Override // androidx.core.app.e.g
        public void b(androidx.core.app.d dVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(dVar.a()).setBigContentTitle(this.f183b).bigText(this.f175e);
                if (!this.f185d) {
                    return;
                }
                bigText.setSummaryText(this.f184c);
            }
        }

        public c l(CharSequence charSequence) {
            this.f175e = C0015e.h(charSequence);
            return this;
        }

        public c m(CharSequence charSequence) {
            this.f183b = C0015e.h(charSequence);
            return this;
        }

        public c n(CharSequence charSequence) {
            this.f184c = C0015e.h(charSequence);
            this.f185d = true;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static Notification.BubbleMetadata b(d dVar) {
            if (dVar == null) {
                return null;
            }
            new Notification.BubbleMetadata.Builder();
            dVar.a();
            throw null;
        }

        public boolean a() {
            throw null;
        }
    }

    /* renamed from: androidx.core.app.e$e */
    /* loaded from: classes.dex */
    public static class C0015e {
        boolean A;
        String B;
        Bundle C;
        Notification F;
        RemoteViews G;
        RemoteViews H;
        RemoteViews I;
        String J;
        String L;
        long M;
        d P;
        Notification Q;
        boolean R;

        /* renamed from: a */
        public Context f176a;

        /* renamed from: d */
        CharSequence f179d;

        /* renamed from: e */
        CharSequence f180e;
        PendingIntent f;
        PendingIntent g;
        RemoteViews h;
        Bitmap i;
        CharSequence j;
        int k;
        boolean n;
        boolean o;
        g p;
        CharSequence q;
        CharSequence[] r;
        int s;
        int t;
        boolean u;
        String v;
        boolean w;
        String x;
        boolean z;

        /* renamed from: b */
        public ArrayList<a> f177b = new ArrayList<>();

        /* renamed from: c */
        ArrayList<a> f178c = new ArrayList<>();
        boolean m = true;
        boolean y = false;
        int D = 0;
        int E = 0;
        int K = 0;
        int N = 0;
        int l = 0;
        @Deprecated
        public ArrayList<String> S = new ArrayList<>();
        boolean O = true;

        public C0015e(Context context, String str) {
            Notification notification = new Notification();
            this.Q = notification;
            this.f176a = context;
            this.J = str;
            notification.when = System.currentTimeMillis();
            this.Q.audioStreamType = -1;
        }

        protected static CharSequence h(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap i(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f176a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(b.c.a.f344b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(b.c.a.f343a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double d2 = dimensionPixelSize;
            double max = Math.max(1, bitmap.getWidth());
            Double.isNaN(d2);
            Double.isNaN(max);
            double d3 = d2 / max;
            double d4 = dimensionPixelSize2;
            double max2 = Math.max(1, bitmap.getHeight());
            Double.isNaN(d4);
            Double.isNaN(max2);
            double min = Math.min(d3, d4 / max2);
            double width = bitmap.getWidth();
            Double.isNaN(width);
            double height = bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(width * min), (int) Math.ceil(height * min), true);
        }

        private void r(int i, boolean z) {
            Notification notification;
            int i2;
            if (z) {
                notification = this.Q;
                i2 = i | notification.flags;
            } else {
                notification = this.Q;
                i2 = (i ^ (-1)) & notification.flags;
            }
            notification.flags = i2;
        }

        public C0015e A(int i) {
            this.l = i;
            return this;
        }

        public C0015e B(int i, int i2, boolean z) {
            this.s = i;
            this.t = i2;
            this.u = z;
            return this;
        }

        public C0015e C(boolean z) {
            this.m = z;
            return this;
        }

        public C0015e D(int i) {
            this.Q.icon = i;
            return this;
        }

        public C0015e E(String str) {
            this.x = str;
            return this;
        }

        public C0015e F(Uri uri) {
            Notification notification = this.Q;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public C0015e G(g gVar) {
            if (this.p != gVar) {
                this.p = gVar;
                if (gVar != null) {
                    gVar.k(this);
                }
            }
            return this;
        }

        public C0015e H(CharSequence charSequence) {
            this.q = h(charSequence);
            return this;
        }

        public C0015e I(CharSequence charSequence) {
            this.Q.tickerText = h(charSequence);
            return this;
        }

        public C0015e J(long[] jArr) {
            this.Q.vibrate = jArr;
            return this;
        }

        public C0015e K(int i) {
            this.E = i;
            return this;
        }

        public C0015e a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f177b.add(new a(i, charSequence, pendingIntent));
            return this;
        }

        public C0015e b(a aVar) {
            this.f177b.add(aVar);
            return this;
        }

        public Notification c() {
            return new androidx.core.app.f(this).c();
        }

        public int d() {
            return this.D;
        }

        public Bundle e() {
            if (this.C == null) {
                this.C = new Bundle();
            }
            return this.C;
        }

        public int f() {
            return this.l;
        }

        public long g() {
            if (this.m) {
                return this.Q.when;
            }
            return 0L;
        }

        public C0015e j(boolean z) {
            r(16, z);
            return this;
        }

        public C0015e k(String str) {
            this.J = str;
            return this;
        }

        public C0015e l(int i) {
            this.D = i;
            return this;
        }

        public C0015e m(boolean z) {
            this.z = z;
            this.A = true;
            return this;
        }

        public C0015e n(PendingIntent pendingIntent) {
            this.f = pendingIntent;
            return this;
        }

        public C0015e o(CharSequence charSequence) {
            this.f180e = h(charSequence);
            return this;
        }

        public C0015e p(CharSequence charSequence) {
            this.f179d = h(charSequence);
            return this;
        }

        public C0015e q(PendingIntent pendingIntent) {
            this.Q.deleteIntent = pendingIntent;
            return this;
        }

        public C0015e s(String str) {
            this.v = str;
            return this;
        }

        public C0015e t(int i) {
            this.N = i;
            return this;
        }

        public C0015e u(boolean z) {
            this.w = z;
            return this;
        }

        public C0015e v(Bitmap bitmap) {
            this.i = i(bitmap);
            return this;
        }

        public C0015e w(int i, int i2, int i3) {
            Notification notification = this.Q;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public C0015e x(int i) {
            this.k = i;
            return this;
        }

        public C0015e y(boolean z) {
            r(2, z);
            return this;
        }

        public C0015e z(boolean z) {
            r(8, z);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends g {

        /* renamed from: e */
        private ArrayList<CharSequence> f181e = new ArrayList<>();

        @Override // androidx.core.app.e.g
        public void b(androidx.core.app.d dVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(dVar.a()).setBigContentTitle(this.f183b);
                if (this.f185d) {
                    bigContentTitle.setSummaryText(this.f184c);
                }
                Iterator<CharSequence> it = this.f181e.iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine(it.next());
                }
            }
        }

        public f l(CharSequence charSequence) {
            this.f181e.add(C0015e.h(charSequence));
            return this;
        }

        public f m(CharSequence charSequence) {
            this.f183b = C0015e.h(charSequence);
            return this;
        }

        public f n(CharSequence charSequence) {
            this.f184c = C0015e.h(charSequence);
            this.f185d = true;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g {

        /* renamed from: a */
        protected C0015e f182a;

        /* renamed from: b */
        CharSequence f183b;

        /* renamed from: c */
        CharSequence f184c;

        /* renamed from: d */
        boolean f185d = false;

        private Bitmap e(int i, int i2, int i3) {
            return f(IconCompat.c(this.f182a.f176a, i), i2, i3);
        }

        private Bitmap f(IconCompat iconCompat, int i, int i2) {
            Drawable o = iconCompat.o(this.f182a.f176a);
            int intrinsicWidth = i2 == 0 ? o.getIntrinsicWidth() : i2;
            if (i2 == 0) {
                i2 = o.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
            o.setBounds(0, 0, intrinsicWidth, i2);
            if (i != 0) {
                o.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            o.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        private Bitmap g(int i, int i2, int i3, int i4) {
            int i5 = b.c.b.f350c;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap e2 = e(i5, i4, i2);
            Canvas canvas = new Canvas(e2);
            Drawable mutate = this.f182a.f176a.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return e2;
        }

        public void a(Bundle bundle) {
        }

        public abstract void b(androidx.core.app.d dVar);

        /* JADX WARN: Removed duplicated region for block: B:65:0x016c  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0176  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x017e A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01ef  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01fb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.widget.RemoteViews c(boolean r17, int r18, boolean r19) {
            /*
                Method dump skipped, instructions count: 513
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.e.g.c(boolean, int, boolean):android.widget.RemoteViews");
        }

        public Bitmap d(int i, int i2) {
            return e(i, i2, 0);
        }

        public RemoteViews h(androidx.core.app.d dVar) {
            return null;
        }

        public RemoteViews i(androidx.core.app.d dVar) {
            return null;
        }

        public RemoteViews j(androidx.core.app.d dVar) {
            return null;
        }

        public void k(C0015e c0015e) {
            if (this.f182a != c0015e) {
                this.f182a = c0015e;
                if (c0015e == null) {
                    return;
                }
                c0015e.G(this);
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i < 16) {
            return null;
        }
        return androidx.core.app.g.c(notification);
    }
}
