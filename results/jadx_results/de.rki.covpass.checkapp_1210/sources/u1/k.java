package u1;

import android.util.Log;
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a */
    private static k f22557a = null;

    /* renamed from: b */
    private static final int f22558b = 20;

    /* loaded from: classes.dex */
    public static class a extends k {

        /* renamed from: c */
        private int f22559c;

        public a(int i10) {
            super(i10);
            this.f22559c = i10;
        }

        @Override // u1.k
        public void a(String str, String str2, Throwable... thArr) {
            if (this.f22559c <= 3) {
                if (thArr == null || thArr.length < 1) {
                    Log.d(str, str2);
                } else {
                    Log.d(str, str2, thArr[0]);
                }
            }
        }

        @Override // u1.k
        public void b(String str, String str2, Throwable... thArr) {
            if (this.f22559c <= 6) {
                if (thArr == null || thArr.length < 1) {
                    Log.e(str, str2);
                } else {
                    Log.e(str, str2, thArr[0]);
                }
            }
        }

        @Override // u1.k
        public void d(String str, String str2, Throwable... thArr) {
            if (this.f22559c <= 4) {
                if (thArr == null || thArr.length < 1) {
                    Log.i(str, str2);
                } else {
                    Log.i(str, str2, thArr[0]);
                }
            }
        }

        @Override // u1.k
        public void g(String str, String str2, Throwable... thArr) {
            if (this.f22559c <= 2) {
                if (thArr == null || thArr.length < 1) {
                    Log.v(str, str2);
                } else {
                    Log.v(str, str2, thArr[0]);
                }
            }
        }

        @Override // u1.k
        public void h(String str, String str2, Throwable... thArr) {
            if (this.f22559c <= 5) {
                if (thArr == null || thArr.length < 1) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, thArr[0]);
                }
            }
        }
    }

    public k(int i10) {
    }

    public static synchronized k c() {
        k kVar;
        synchronized (k.class) {
            if (f22557a == null) {
                f22557a = new a(3);
            }
            kVar = f22557a;
        }
        return kVar;
    }

    public static synchronized void e(k kVar) {
        synchronized (k.class) {
            f22557a = kVar;
        }
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f22558b;
        if (length >= i10) {
            str = str.substring(0, i10);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}
