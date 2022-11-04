package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
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
public class p {

    /* renamed from: o */
    private static final String[] f4975o = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b */
    final String[] f4977b;

    /* renamed from: c */
    private Map<String, Set<String>> f4978c;

    /* renamed from: e */
    final i0 f4980e;

    /* renamed from: h */
    volatile m1.k f4983h;

    /* renamed from: i */
    private final b f4984i;

    /* renamed from: j */
    private final n f4985j;

    /* renamed from: l */
    private q f4987l;

    /* renamed from: d */
    androidx.room.a f4979d = null;

    /* renamed from: f */
    AtomicBoolean f4981f = new AtomicBoolean(false);

    /* renamed from: g */
    private volatile boolean f4982g = false;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: k */
    final n.b<c, d> f4986k = new n.b<>();

    /* renamed from: m */
    private final Object f4988m = new Object();

    /* renamed from: n */
    Runnable f4989n = new a();

    /* renamed from: a */
    final HashMap<String, Integer> f4976a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            p.this = r1;
        }

        private Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor B = p.this.f4980e.B(new m1.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (B.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(B.getInt(0)));
                } catch (Throwable th2) {
                    B.close();
                    throw th2;
                }
            }
            B.close();
            if (!hashSet.isEmpty()) {
                p.this.f4983h.S();
            }
            return hashSet;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
            if (r0 != null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
            r0.b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
            if (r0 == null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
            if (r1 == null) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
            if (r1.isEmpty() != false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
            r0 = androidx.room.p.this.f4986k;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
            r2 = androidx.room.p.this.f4986k.iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
            if (r2.hasNext() == false) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
            r2.next().getValue().a(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
            monitor-exit(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00c2, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r5 = this;
                androidx.room.p r0 = androidx.room.p.this
                androidx.room.i0 r0 = r0.f4980e
                java.util.concurrent.locks.Lock r0 = r0.l()
                r0.lock()
                r1 = 0
                androidx.room.p r2 = androidx.room.p.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                boolean r2 = r2.d()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                if (r2 != 0) goto L21
                r0.unlock()
                androidx.room.p r0 = androidx.room.p.this
                androidx.room.a r0 = r0.f4979d
                if (r0 == 0) goto L20
                r0.b()
            L20:
                return
            L21:
                androidx.room.p r2 = androidx.room.p.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.f4981f     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                r3 = 1
                r4 = 0
                boolean r2 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                if (r2 != 0) goto L3a
                r0.unlock()
                androidx.room.p r0 = androidx.room.p.this
                androidx.room.a r0 = r0.f4979d
                if (r0 == 0) goto L39
                r0.b()
            L39:
                return
            L3a:
                androidx.room.p r2 = androidx.room.p.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                androidx.room.i0 r2 = r2.f4980e     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                boolean r2 = r2.s()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                if (r2 == 0) goto L51
                r0.unlock()
                androidx.room.p r0 = androidx.room.p.this
                androidx.room.a r0 = r0.f4979d
                if (r0 == 0) goto L50
                r0.b()
            L50:
                return
            L51:
                androidx.room.p r2 = androidx.room.p.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                androidx.room.i0 r2 = r2.f4980e     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                m1.h r2 = r2.m()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                m1.g r2 = r2.U0()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                r2.H0()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                java.util.Set r1 = r5.a()     // Catch: java.lang.Throwable -> L77
                r2.C0()     // Catch: java.lang.Throwable -> L77
                r2.q()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                r0.unlock()
                androidx.room.p r0 = androidx.room.p.this
                androidx.room.a r0 = r0.f4979d
                if (r0 == 0) goto L92
            L73:
                r0.b()
                goto L92
            L77:
                r3 = move-exception
                r2.q()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                throw r3     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
            L7c:
                r1 = move-exception
                goto Lc3
            L7e:
                r2 = move-exception
                goto L81
            L80:
                r2 = move-exception
            L81:
                java.lang.String r3 = "ROOM"
                java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L7c
                r0.unlock()
                androidx.room.p r0 = androidx.room.p.this
                androidx.room.a r0 = r0.f4979d
                if (r0 == 0) goto L92
                goto L73
            L92:
                if (r1 == 0) goto Lc2
                boolean r0 = r1.isEmpty()
                if (r0 != 0) goto Lc2
                androidx.room.p r0 = androidx.room.p.this
                n.b<androidx.room.p$c, androidx.room.p$d> r0 = r0.f4986k
                monitor-enter(r0)
                androidx.room.p r2 = androidx.room.p.this     // Catch: java.lang.Throwable -> Lbf
                n.b<androidx.room.p$c, androidx.room.p$d> r2 = r2.f4986k     // Catch: java.lang.Throwable -> Lbf
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lbf
            La7:
                boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lbf
                if (r3 == 0) goto Lbd
                java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Lbf
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Lbf
                java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> Lbf
                androidx.room.p$d r3 = (androidx.room.p.d) r3     // Catch: java.lang.Throwable -> Lbf
                r3.a(r1)     // Catch: java.lang.Throwable -> Lbf
                goto La7
            Lbd:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbf
                goto Lc2
            Lbf:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbf
                throw r1
            Lc2:
                return
            Lc3:
                r0.unlock()
                androidx.room.p r0 = androidx.room.p.this
                androidx.room.a r0 = r0.f4979d
                if (r0 == 0) goto Lcf
                r0.b()
            Lcf:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.p.a.run():void");
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final long[] f4991a;

        /* renamed from: b */
        final boolean[] f4992b;

        /* renamed from: c */
        final int[] f4993c;

        /* renamed from: d */
        boolean f4994d;

        b(int i10) {
            long[] jArr = new long[i10];
            this.f4991a = jArr;
            boolean[] zArr = new boolean[i10];
            this.f4992b = zArr;
            this.f4993c = new int[i10];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        int[] a() {
            synchronized (this) {
                if (!this.f4994d) {
                    return null;
                }
                int length = this.f4991a.length;
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = 1;
                    boolean z10 = this.f4991a[i10] > 0;
                    boolean[] zArr = this.f4992b;
                    if (z10 != zArr[i10]) {
                        int[] iArr = this.f4993c;
                        if (!z10) {
                            i11 = 2;
                        }
                        iArr[i10] = i11;
                    } else {
                        this.f4993c[i10] = 0;
                    }
                    zArr[i10] = z10;
                }
                this.f4994d = false;
                return (int[]) this.f4993c.clone();
            }
        }

        boolean b(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f4991a;
                    long j10 = jArr[i10];
                    jArr[i10] = 1 + j10;
                    if (j10 == 0) {
                        this.f4994d = true;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        boolean c(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f4991a;
                    long j10 = jArr[i10];
                    jArr[i10] = j10 - 1;
                    if (j10 == 1) {
                        this.f4994d = true;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        void d() {
            synchronized (this) {
                Arrays.fill(this.f4992b, false);
                this.f4994d = true;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a */
        final String[] f4995a;

        public c(String[] strArr) {
            this.f4995a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        boolean a() {
            return false;
        }

        public abstract void b(Set<String> set);
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        final int[] f4996a;

        /* renamed from: b */
        private final String[] f4997b;

        /* renamed from: c */
        final c f4998c;

        /* renamed from: d */
        private final Set<String> f4999d;

        d(c cVar, int[] iArr, String[] strArr) {
            Set<String> set;
            this.f4998c = cVar;
            this.f4996a = iArr;
            this.f4997b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                set = Collections.unmodifiableSet(hashSet);
            } else {
                set = null;
            }
            this.f4999d = set;
        }

        void a(Set<Integer> set) {
            int length = this.f4996a.length;
            Set<String> set2 = null;
            for (int i10 = 0; i10 < length; i10++) {
                if (set.contains(Integer.valueOf(this.f4996a[i10]))) {
                    if (length == 1) {
                        set2 = this.f4999d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet<>(length);
                        }
                        set2.add(this.f4997b[i10]);
                    }
                }
            }
            if (set2 != null) {
                this.f4998c.b(set2);
            }
        }

        void b(String[] strArr) {
            Set<String> set = null;
            if (this.f4997b.length == 1) {
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    } else if (strArr[i10].equalsIgnoreCase(this.f4997b[0])) {
                        set = this.f4999d;
                        break;
                    } else {
                        i10++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f4997b;
                    int length2 = strArr2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            String str2 = strArr2[i11];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i11++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f4998c.b(set);
            }
        }
    }

    public p(i0 i0Var, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f4980e = i0Var;
        this.f4984i = new b(strArr.length);
        this.f4978c = map2;
        this.f4985j = new n(i0Var);
        int length = strArr.length;
        this.f4977b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f4976a.put(lowerCase, Integer.valueOf(i10));
            String str2 = map.get(strArr[i10]);
            if (str2 != null) {
                this.f4977b[i10] = str2.toLowerCase(locale);
            } else {
                this.f4977b[i10] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            if (this.f4976a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f4976a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    private static void b(StringBuilder sb2, String str, String str2) {
        sb2.append("`");
        sb2.append("room_table_modification_trigger_");
        sb2.append(str);
        sb2.append("_");
        sb2.append(str2);
        sb2.append("`");
    }

    private static void c(m1.g gVar) {
        if (gVar.x0()) {
            gVar.H0();
        } else {
            gVar.t();
        }
    }

    private String[] j(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f4978c.containsKey(lowerCase)) {
                hashSet.addAll(this.f4978c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void m(m1.g gVar, int i10) {
        String[] strArr;
        gVar.H("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f4977b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f4975o) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb2, str, str2);
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE ");
            sb2.append("room_table_modification_log");
            sb2.append(" SET ");
            sb2.append("invalidated");
            sb2.append(" = 1");
            sb2.append(" WHERE ");
            sb2.append("table_id");
            sb2.append(" = ");
            sb2.append(i10);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            sb2.append("; END");
            gVar.H(sb2.toString());
        }
    }

    private void n(m1.g gVar, int i10) {
        String[] strArr;
        String str = this.f4977b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f4975o) {
            sb2.setLength(0);
            sb2.append("DROP TRIGGER IF EXISTS ");
            b(sb2, str, str2);
            gVar.H(sb2.toString());
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void a(c cVar) {
        d i10;
        String[] j10 = j(cVar.f4995a);
        int[] iArr = new int[j10.length];
        int length = j10.length;
        for (int i11 = 0; i11 < length; i11++) {
            Integer num = this.f4976a.get(j10[i11].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + j10[i11]);
            }
            iArr[i11] = num.intValue();
        }
        d dVar = new d(cVar, iArr, j10);
        synchronized (this.f4986k) {
            i10 = this.f4986k.i(cVar, dVar);
        }
        if (i10 != null || !this.f4984i.b(iArr)) {
            return;
        }
        o();
    }

    boolean d() {
        if (!this.f4980e.y()) {
            return false;
        }
        if (!this.f4982g) {
            this.f4980e.m().U0();
        }
        if (this.f4982g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public void e(m1.g gVar) {
        synchronized (this) {
            if (this.f4982g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            gVar.H("PRAGMA temp_store = MEMORY;");
            gVar.H("PRAGMA recursive_triggers='ON';");
            gVar.H("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            p(gVar);
            this.f4983h = gVar.T("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f4982g = true;
        }
    }

    public void f(String... strArr) {
        synchronized (this.f4986k) {
            Iterator<Map.Entry<c, d>> it = this.f4986k.iterator();
            while (it.hasNext()) {
                Map.Entry<c, d> next = it.next();
                if (!next.getKey().a()) {
                    next.getValue().b(strArr);
                }
            }
        }
    }

    public void g() {
        synchronized (this) {
            this.f4982g = false;
            this.f4984i.d();
        }
    }

    public void h() {
        if (this.f4981f.compareAndSet(false, true)) {
            androidx.room.a aVar = this.f4979d;
            if (aVar != null) {
                aVar.e();
            }
            this.f4980e.n().execute(this.f4989n);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void i(c cVar) {
        d k10;
        synchronized (this.f4986k) {
            k10 = this.f4986k.k(cVar);
        }
        if (k10 == null || !this.f4984i.c(k10.f4996a)) {
            return;
        }
        o();
    }

    public void k(androidx.room.a aVar) {
        this.f4979d = aVar;
        aVar.h(new Runnable() { // from class: androidx.room.o
            @Override // java.lang.Runnable
            public final void run() {
                p.this.g();
            }
        });
    }

    public void l(Context context, String str, Intent intent) {
        this.f4987l = new q(context, str, intent, this, this.f4980e.n());
    }

    void o() {
        if (!this.f4980e.y()) {
            return;
        }
        p(this.f4980e.m().U0());
    }

    public void p(m1.g gVar) {
        if (gVar.n0()) {
            return;
        }
        try {
            Lock l10 = this.f4980e.l();
            l10.lock();
            try {
                synchronized (this.f4988m) {
                    int[] a10 = this.f4984i.a();
                    if (a10 == null) {
                        return;
                    }
                    int length = a10.length;
                    c(gVar);
                    for (int i10 = 0; i10 < length; i10++) {
                        int i11 = a10[i10];
                        if (i11 == 1) {
                            m(gVar, i10);
                        } else if (i11 == 2) {
                            n(gVar, i10);
                        }
                    }
                    gVar.C0();
                    gVar.q();
                }
            } finally {
                l10.unlock();
            }
        } catch (SQLiteException | IllegalStateException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        }
    }
}
