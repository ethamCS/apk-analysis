package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class i {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Bundle f899a;

        /* renamed from: b */
        private IconCompat f900b;

        /* renamed from: c */
        private final l[] f901c;

        /* renamed from: d */
        private final l[] f902d;

        /* renamed from: e */
        private boolean f903e;

        /* renamed from: f */
        boolean f904f;

        /* renamed from: g */
        private final int f905g;

        /* renamed from: h */
        private final boolean f906h;
        @Deprecated
        public int i;
        public CharSequence j;
        public PendingIntent k;

        public PendingIntent a() {
            return this.k;
        }

        public boolean b() {
            return this.f903e;
        }

        public l[] c() {
            return this.f902d;
        }

        public Bundle d() {
            return this.f899a;
        }

        public IconCompat e() {
            int i;
            if (this.f900b == null && (i = this.i) != 0) {
                this.f900b = IconCompat.b(null, "", i);
            }
            return this.f900b;
        }

        public l[] f() {
            return this.f901c;
        }

        public int g() {
            return this.f905g;
        }

        public boolean h() {
            return this.f904f;
        }

        public CharSequence i() {
            return this.j;
        }

        public boolean j() {
            return this.f906h;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static Notification.BubbleMetadata b(b bVar) {
            if (bVar == null) {
                return null;
            }
            new Notification.BubbleMetadata.Builder();
            bVar.a();
            throw null;
        }

        public boolean a() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        String A;
        Bundle B;
        Notification E;
        RemoteViews F;
        RemoteViews G;
        RemoteViews H;
        String I;
        String K;
        long L;
        b O;
        Notification P;
        boolean Q;

        /* renamed from: a */
        public Context f907a;

        /* renamed from: d */
        CharSequence f910d;

        /* renamed from: e */
        CharSequence f911e;

        /* renamed from: f */
        PendingIntent f912f;

        /* renamed from: g */
        PendingIntent f913g;

        /* renamed from: h */
        RemoteViews f914h;
        Bitmap i;
        CharSequence j;
        int k;
        boolean n;
        d o;
        CharSequence p;
        CharSequence[] q;
        int r;
        int s;
        boolean t;
        String u;
        boolean v;
        String w;
        boolean y;
        boolean z;

        /* renamed from: b */
        public ArrayList<a> f908b = new ArrayList<>();

        /* renamed from: c */
        ArrayList<a> f909c = new ArrayList<>();
        boolean m = true;
        boolean x = false;
        int C = 0;
        int D = 0;
        int J = 0;
        int M = 0;
        int l = 0;
        @Deprecated
        public ArrayList<String> R = new ArrayList<>();
        boolean N = true;

        public c(Context context, String str) {
            Notification notification = new Notification();
            this.P = notification;
            this.f907a = context;
            this.I = str;
            notification.when = System.currentTimeMillis();
            this.P.audioStreamType = -1;
        }

        protected static CharSequence c(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void h(int i, boolean z) {
            Notification notification;
            int i2;
            if (z) {
                notification = this.P;
                i2 = i | notification.flags;
            } else {
                notification = this.P;
                i2 = (~i) & notification.flags;
            }
            notification.flags = i2;
        }

        public Notification a() {
            return new j(this).b();
        }

        public Bundle b() {
            if (this.B == null) {
                this.B = new Bundle();
            }
            return this.B;
        }

        public c d(boolean z) {
            h(16, z);
            return this;
        }

        public c e(PendingIntent pendingIntent) {
            this.f912f = pendingIntent;
            return this;
        }

        public c f(CharSequence charSequence) {
            this.f911e = c(charSequence);
            return this;
        }

        public c g(CharSequence charSequence) {
            this.f910d = c(charSequence);
            return this;
        }

        public c i(int i) {
            this.P.icon = i;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {
        public abstract void a(Bundle bundle);

        public abstract void b(h hVar);

        public abstract RemoteViews c(h hVar);

        public abstract RemoteViews d(h hVar);

        public abstract RemoteViews e(h hVar);
    }

    public static Bundle a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i < 16) {
            return null;
        }
        return k.c(notification);
    }
}
