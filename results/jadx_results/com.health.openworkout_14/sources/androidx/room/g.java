package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
/* loaded from: classes.dex */
public class g {
    private static final String[] k = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b */
    final String[] f1846b;

    /* renamed from: c */
    private Map<String, Set<String>> f1847c;

    /* renamed from: d */
    final j f1848d;

    /* renamed from: g */
    volatile b.o.a.f f1851g;

    /* renamed from: h */
    private b f1852h;

    /* renamed from: e */
    AtomicBoolean f1849e = new AtomicBoolean(false);

    /* renamed from: f */
    private volatile boolean f1850f = false;
    @SuppressLint({"RestrictedApi"})
    final b.b.a.b.b<c, d> i = new b.b.a.b.b<>();
    Runnable j = new a();

    /* renamed from: a */
    final HashMap<String, Integer> f1845a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            g.this = r1;
        }

        private Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor p = g.this.f1848d.p(new b.o.a.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (p.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(p.getInt(0)));
                } catch (Throwable th) {
                    p.close();
                    throw th;
                }
            }
            p.close();
            if (!hashSet.isEmpty()) {
                g.this.f1851g.C();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            Lock h2 = g.this.f1848d.h();
            Set<Integer> set = null;
            try {
                try {
                    h2.lock();
                } finally {
                    h2.unlock();
                }
            } catch (SQLiteException | IllegalStateException e2) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
            }
            if (!g.this.c()) {
                return;
            }
            if (!g.this.f1849e.compareAndSet(true, false)) {
                return;
            }
            if (g.this.f1848d.k()) {
                return;
            }
            j jVar = g.this.f1848d;
            if (jVar.f1884f) {
                b.o.a.b b2 = jVar.i().b();
                b2.h();
                try {
                    set = a();
                    b2.B();
                    b2.g();
                } catch (Throwable th) {
                    b2.g();
                    throw th;
                }
            } else {
                set = a();
            }
            if (set == null || set.isEmpty()) {
                return;
            }
            synchronized (g.this.i) {
                Iterator<Map.Entry<c, d>> it = g.this.i.iterator();
                while (it.hasNext()) {
                    it.next().getValue().a(set);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final long[] f1854a;

        /* renamed from: b */
        final boolean[] f1855b;

        /* renamed from: c */
        final int[] f1856c;

        /* renamed from: d */
        boolean f1857d;

        /* renamed from: e */
        boolean f1858e;

        b(int i) {
            long[] jArr = new long[i];
            this.f1854a = jArr;
            boolean[] zArr = new boolean[i];
            this.f1855b = zArr;
            this.f1856c = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        int[] a() {
            synchronized (this) {
                if (this.f1857d && !this.f1858e) {
                    int length = this.f1854a.length;
                    int i = 0;
                    while (true) {
                        int i2 = 1;
                        if (i >= length) {
                            this.f1858e = true;
                            this.f1857d = false;
                            return this.f1856c;
                        }
                        boolean z = this.f1854a[i] > 0;
                        boolean[] zArr = this.f1855b;
                        if (z != zArr[i]) {
                            int[] iArr = this.f1856c;
                            if (!z) {
                                i2 = 2;
                            }
                            iArr[i] = i2;
                        } else {
                            this.f1856c[i] = 0;
                        }
                        zArr[i] = z;
                        i++;
                    }
                }
                return null;
            }
        }

        boolean b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f1854a;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        this.f1857d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        boolean c(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f1854a;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        this.f1857d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        void d() {
            synchronized (this) {
                this.f1858e = false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a */
        final String[] f1859a;

        public c(String[] strArr) {
            this.f1859a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        boolean a() {
            return false;
        }

        public abstract void b(Set<String> set);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        final int[] f1860a;

        /* renamed from: b */
        private final String[] f1861b;

        /* renamed from: c */
        final c f1862c;

        /* renamed from: d */
        private final Set<String> f1863d;

        d(c cVar, int[] iArr, String[] strArr) {
            Set<String> set;
            this.f1862c = cVar;
            this.f1860a = iArr;
            this.f1861b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                set = Collections.unmodifiableSet(hashSet);
            } else {
                set = null;
            }
            this.f1863d = set;
        }

        void a(Set<Integer> set) {
            int length = this.f1860a.length;
            Set<String> set2 = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.f1860a[i]))) {
                    if (length == 1) {
                        set2 = this.f1863d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet<>(length);
                        }
                        set2.add(this.f1861b[i]);
                    }
                }
            }
            if (set2 != null) {
                this.f1862c.b(set2);
            }
        }

        void b(String[] strArr) {
            Set<String> set = null;
            if (this.f1861b.length == 1) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].equalsIgnoreCase(this.f1861b[0])) {
                        set = this.f1863d;
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f1861b;
                    int length2 = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            String str2 = strArr2[i2];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i2++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f1862c.b(set);
            }
        }
    }

    public g(j jVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f1848d = jVar;
        this.f1852h = new b(strArr.length);
        this.f1847c = map2;
        new f(jVar);
        int length = strArr.length;
        this.f1846b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f1845a.put(lowerCase, Integer.valueOf(i));
            String str2 = map.get(strArr[i]);
            if (str2 != null) {
                this.f1846b[i] = str2.toLowerCase(locale);
            } else {
                this.f1846b[i] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            if (this.f1845a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f1845a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    private static void b(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    private String[] h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f1847c.containsKey(lowerCase)) {
                hashSet.addAll(this.f1847c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void j(b.o.a.b bVar, int i) {
        String[] strArr;
        bVar.t("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f1846b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : k) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.t(sb.toString());
        }
    }

    private void k(b.o.a.b bVar, int i) {
        String[] strArr;
        String str = this.f1846b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : k) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            b(sb, str, str2);
            bVar.t(sb.toString());
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void a(c cVar) {
        d g2;
        String[] h2 = h(cVar.f1859a);
        int[] iArr = new int[h2.length];
        int length = h2.length;
        for (int i = 0; i < length; i++) {
            Integer num = this.f1845a.get(h2[i].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + h2[i]);
            }
            iArr[i] = num.intValue();
        }
        d dVar = new d(cVar, iArr, h2);
        synchronized (this.i) {
            g2 = this.i.g(cVar, dVar);
        }
        if (g2 != null || !this.f1852h.b(iArr)) {
            return;
        }
        l();
    }

    boolean c() {
        if (!this.f1848d.o()) {
            return false;
        }
        if (!this.f1850f) {
            this.f1848d.i().b();
        }
        if (this.f1850f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public void d(b.o.a.b bVar) {
        synchronized (this) {
            if (this.f1850f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            bVar.t("PRAGMA temp_store = MEMORY;");
            bVar.t("PRAGMA recursive_triggers='ON';");
            bVar.t("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            m(bVar);
            this.f1851g = bVar.D("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f1850f = true;
        }
    }

    public void e(String... strArr) {
        synchronized (this.i) {
            Iterator<Map.Entry<c, d>> it = this.i.iterator();
            while (it.hasNext()) {
                Map.Entry<c, d> next = it.next();
                if (!next.getKey().a()) {
                    next.getValue().b(strArr);
                }
            }
        }
    }

    public void f() {
        if (this.f1849e.compareAndSet(false, true)) {
            this.f1848d.j().execute(this.j);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void g(c cVar) {
        d h2;
        synchronized (this.i) {
            h2 = this.i.h(cVar);
        }
        if (h2 == null || !this.f1852h.c(h2.f1860a)) {
            return;
        }
        l();
    }

    public void i(Context context, String str) {
        new h(context, str, this, this.f1848d.j());
    }

    void l() {
        if (!this.f1848d.o()) {
            return;
        }
        m(this.f1848d.i().b());
    }

    public void m(b.o.a.b bVar) {
        if (bVar.b0()) {
            return;
        }
        while (true) {
            try {
                Lock h2 = this.f1848d.h();
                h2.lock();
                try {
                    int[] a2 = this.f1852h.a();
                    if (a2 == null) {
                        return;
                    }
                    int length = a2.length;
                    bVar.h();
                    for (int i = 0; i < length; i++) {
                        int i2 = a2[i];
                        if (i2 == 1) {
                            j(bVar, i);
                        } else if (i2 == 2) {
                            k(bVar, i);
                        }
                    }
                    bVar.B();
                    bVar.g();
                    this.f1852h.d();
                } finally {
                    h2.unlock();
                }
            } catch (SQLiteException | IllegalStateException e2) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                return;
            }
        }
    }
}
