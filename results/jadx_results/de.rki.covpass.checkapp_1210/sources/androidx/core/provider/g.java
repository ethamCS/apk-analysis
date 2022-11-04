package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
/* loaded from: classes.dex */
public class g {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final int f3537a;

        /* renamed from: b */
        private final b[] f3538b;

        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f3537a = i10;
            this.f3538b = bVarArr;
        }

        public static a a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] b() {
            return this.f3538b;
        }

        public int c() {
            return this.f3537a;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final Uri f3539a;

        /* renamed from: b */
        private final int f3540b;

        /* renamed from: c */
        private final int f3541c;

        /* renamed from: d */
        private final boolean f3542d;

        /* renamed from: e */
        private final int f3543e;

        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f3539a = (Uri) androidx.core.util.h.g(uri);
            this.f3540b = i10;
            this.f3541c = i11;
            this.f3542d = z10;
            this.f3543e = i12;
        }

        public static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f3543e;
        }

        public int c() {
            return this.f3540b;
        }

        public Uri d() {
            return this.f3539a;
        }

        public int e() {
            return this.f3541c;
        }

        public boolean f() {
            return this.f3542d;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public void a(int i10) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return androidx.core.graphics.e.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, eVar, cancellationSignal);
    }

    public static Typeface c(Context context, e eVar, int i10, boolean z10, int i11, Handler handler, c cVar) {
        androidx.core.provider.a aVar = new androidx.core.provider.a(cVar, handler);
        return z10 ? f.e(context, eVar, aVar, i10, i11) : f.d(context, eVar, i10, null, aVar);
    }
}
