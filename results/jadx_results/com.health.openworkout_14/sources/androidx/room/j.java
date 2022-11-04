package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import b.o.a.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes.dex */
public abstract class j {
    @Deprecated

    /* renamed from: a */
    protected volatile b.o.a.b f1879a;

    /* renamed from: b */
    private Executor f1880b;

    /* renamed from: c */
    private b.o.a.c f1881c;

    /* renamed from: e */
    private boolean f1883e;

    /* renamed from: f */
    boolean f1884f;
    @Deprecated

    /* renamed from: g */
    protected List<b> f1885g;

    /* renamed from: h */
    private final ReentrantReadWriteLock f1886h = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> i = new ThreadLocal<>();

    /* renamed from: d */
    private final g f1882d = e();

    /* loaded from: classes.dex */
    public static class a<T extends j> {

        /* renamed from: a */
        private final Class<T> f1887a;

        /* renamed from: b */
        private final String f1888b;

        /* renamed from: c */
        private final Context f1889c;

        /* renamed from: d */
        private ArrayList<b> f1890d;

        /* renamed from: e */
        private Executor f1891e;

        /* renamed from: f */
        private Executor f1892f;

        /* renamed from: g */
        private c.AbstractC0060c f1893g;

        /* renamed from: h */
        private boolean f1894h;
        private boolean j;
        private boolean l;
        private Set<Integer> n;
        private Set<Integer> o;
        private String p;
        private File q;
        private c i = c.AUTOMATIC;
        private boolean k = true;
        private final d m = new d();

        public a(Context context, Class<T> cls, String str) {
            this.f1889c = context;
            this.f1887a = cls;
            this.f1888b = str;
        }

        public a<T> a(b bVar) {
            if (this.f1890d == null) {
                this.f1890d = new ArrayList<>();
            }
            this.f1890d.add(bVar);
            return this;
        }

        public a<T> b(androidx.room.r.a... aVarArr) {
            if (this.o == null) {
                this.o = new HashSet();
            }
            for (androidx.room.r.a aVar : aVarArr) {
                this.o.add(Integer.valueOf(aVar.f1932a));
                this.o.add(Integer.valueOf(aVar.f1933b));
            }
            this.m.b(aVarArr);
            return this;
        }

        public a<T> c() {
            this.f1894h = true;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
            if (r1 != null) goto L11;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
        @android.annotation.SuppressLint({"RestrictedApi"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public T d() {
            /*
                Method dump skipped, instructions count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.j.a.d():androidx.room.j");
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(b.o.a.b bVar) {
        }

        public void b(b.o.a.b bVar) {
        }

        public void c(b.o.a.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean a(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return activityManager.isLowRamDevice();
            }
            return false;
        }

        @SuppressLint({"NewApi"})
        c e(Context context) {
            ActivityManager activityManager;
            return this != AUTOMATIC ? this : (Build.VERSION.SDK_INT < 16 || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || a(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        private HashMap<Integer, TreeMap<Integer, androidx.room.r.a>> f1899a = new HashMap<>();

        private void a(androidx.room.r.a aVar) {
            int i = aVar.f1932a;
            int i2 = aVar.f1933b;
            TreeMap<Integer, androidx.room.r.a> treeMap = this.f1899a.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.f1899a.put(Integer.valueOf(i), treeMap);
            }
            androidx.room.r.a aVar2 = treeMap.get(Integer.valueOf(i2));
            if (aVar2 != null) {
                Log.w("ROOM", "Overriding migration " + aVar2 + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i2), aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.util.List<androidx.room.r.a> d(java.util.List<androidx.room.r.a> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L58
                goto L7
            L5:
                if (r9 <= r10) goto L58
            L7:
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.r.a>> r0 = r6.f1899a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L54
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r8 == 0) goto L40
                if (r3 > r10) goto L45
                if (r3 <= r9) goto L45
            L3e:
                r5 = 1
                goto L45
            L40:
                if (r3 < r10) goto L45
                if (r3 >= r9) goto L45
                goto L3e
            L45:
                if (r5 == 0) goto L26
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object r9 = r0.get(r9)
                r7.add(r9)
                r9 = r3
                goto L55
            L54:
                r4 = 0
            L55:
                if (r4 != 0) goto L0
                return r1
            L58:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.j.d.d(java.util.List, boolean, int, int):java.util.List");
        }

        public void b(androidx.room.r.a... aVarArr) {
            for (androidx.room.r.a aVar : aVarArr) {
                a(aVar);
            }
        }

        public List<androidx.room.r.a> c(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i2 > i, i, i2);
        }
    }

    public j() {
        new ConcurrentHashMap();
    }

    private static boolean n() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void a() {
        if (!this.f1883e && n()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (k() || this.i.get() == null) {
            return;
        }
        throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    @Deprecated
    public void c() {
        a();
        b.o.a.b b2 = this.f1881c.b();
        this.f1882d.m(b2);
        b2.h();
    }

    public b.o.a.f d(String str) {
        a();
        b();
        return this.f1881c.b().D(str);
    }

    protected abstract g e();

    protected abstract b.o.a.c f(androidx.room.a aVar);

    @Deprecated
    public void g() {
        this.f1881c.b().g();
        if (!k()) {
            this.f1882d.f();
        }
    }

    public Lock h() {
        return this.f1886h.readLock();
    }

    public b.o.a.c i() {
        return this.f1881c;
    }

    public Executor j() {
        return this.f1880b;
    }

    public boolean k() {
        return this.f1881c.b().b0();
    }

    public void l(androidx.room.a aVar) {
        b.o.a.c f2 = f(aVar);
        this.f1881c = f2;
        if (f2 instanceof n) {
            ((n) f2).e(aVar);
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 16) {
            if (aVar.f1841g == c.WRITE_AHEAD_LOGGING) {
                z = true;
            }
            this.f1881c.a(z);
        }
        this.f1885g = aVar.f1839e;
        this.f1880b = aVar.f1842h;
        new q(aVar.i);
        this.f1883e = aVar.f1840f;
        this.f1884f = z;
        if (aVar.j) {
            this.f1882d.i(aVar.f1836b, aVar.f1837c);
        }
    }

    public void m(b.o.a.b bVar) {
        this.f1882d.d(bVar);
    }

    public boolean o() {
        b.o.a.b bVar = this.f1879a;
        return bVar != null && bVar.isOpen();
    }

    public Cursor p(b.o.a.e eVar) {
        return q(eVar, null);
    }

    public Cursor q(b.o.a.e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        return (cancellationSignal == null || Build.VERSION.SDK_INT < 16) ? this.f1881c.b().G(eVar) : this.f1881c.b().Z(eVar, cancellationSignal);
    }

    @Deprecated
    public void r() {
        this.f1881c.b().B();
    }
}
