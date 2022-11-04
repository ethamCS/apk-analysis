package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.room.i0;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import m1.h;
/* loaded from: classes.dex */
public abstract class i0 {
    @Deprecated

    /* renamed from: a */
    protected volatile m1.g f4875a;

    /* renamed from: b */
    private Executor f4876b;

    /* renamed from: c */
    private Executor f4877c;

    /* renamed from: d */
    private m1.h f4878d;

    /* renamed from: f */
    private boolean f4880f;

    /* renamed from: g */
    boolean f4881g;
    @Deprecated

    /* renamed from: h */
    protected List<b> f4882h;

    /* renamed from: k */
    private androidx.room.a f4885k;

    /* renamed from: j */
    private final ReentrantReadWriteLock f4884j = new ReentrantReadWriteLock();

    /* renamed from: l */
    private final ThreadLocal<Integer> f4886l = new ThreadLocal<>();

    /* renamed from: m */
    private final Map<String, Object> f4887m = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: e */
    private final p f4879e = g();

    /* renamed from: n */
    private final Map<Class<?>, Object> f4888n = new HashMap();

    /* renamed from: i */
    protected Map<Class<? extends i1.a>, i1.a> f4883i = new HashMap();

    /* loaded from: classes.dex */
    public static class a<T extends i0> {

        /* renamed from: a */
        private final Class<T> f4889a;

        /* renamed from: b */
        private final String f4890b;

        /* renamed from: c */
        private final Context f4891c;

        /* renamed from: d */
        private ArrayList<b> f4892d;

        /* renamed from: e */
        private f f4893e;

        /* renamed from: f */
        private Executor f4894f;

        /* renamed from: g */
        private List<Object> f4895g;

        /* renamed from: h */
        private List<i1.a> f4896h;

        /* renamed from: i */
        private Executor f4897i;

        /* renamed from: j */
        private Executor f4898j;

        /* renamed from: k */
        private h.c f4899k;

        /* renamed from: l */
        private boolean f4900l;

        /* renamed from: n */
        private Intent f4902n;

        /* renamed from: p */
        private boolean f4904p;

        /* renamed from: r */
        private TimeUnit f4906r;

        /* renamed from: t */
        private Set<Integer> f4908t;

        /* renamed from: u */
        private Set<Integer> f4909u;

        /* renamed from: v */
        private String f4910v;

        /* renamed from: w */
        private File f4911w;

        /* renamed from: x */
        private Callable<InputStream> f4912x;

        /* renamed from: q */
        private long f4905q = -1;

        /* renamed from: m */
        private c f4901m = c.AUTOMATIC;

        /* renamed from: o */
        private boolean f4903o = true;

        /* renamed from: s */
        private final d f4907s = new d();

        public a(Context context, Class<T> cls, String str) {
            this.f4891c = context;
            this.f4889a = cls;
            this.f4890b = str;
        }

        public a<T> a(b bVar) {
            if (this.f4892d == null) {
                this.f4892d = new ArrayList<>();
            }
            this.f4892d.add(bVar);
            return this;
        }

        public a<T> b(i1.b... bVarArr) {
            if (this.f4909u == null) {
                this.f4909u = new HashSet();
            }
            for (i1.b bVar : bVarArr) {
                this.f4909u.add(Integer.valueOf(bVar.f12303a));
                this.f4909u.add(Integer.valueOf(bVar.f12304b));
            }
            this.f4907s.b(bVarArr);
            return this;
        }

        public a<T> c() {
            this.f4900l = true;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
            if (r1 != null) goto L11;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0121  */
        @android.annotation.SuppressLint({"RestrictedApi"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public T d() {
            /*
                Method dump skipped, instructions count: 313
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.i0.a.d():androidx.room.i0");
        }

        public a<T> e() {
            this.f4903o = false;
            this.f4904p = true;
            return this;
        }

        public a<T> f(h.c cVar) {
            this.f4899k = cVar;
            return this;
        }

        public a<T> g(Executor executor) {
            this.f4897i = executor;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(m1.g gVar) {
        }

        public void b(m1.g gVar) {
        }

        public void c(m1.g gVar) {
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean b(ActivityManager activityManager) {
            return m1.c.b(activityManager);
        }

        c g(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (activityManager == null || b(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        private HashMap<Integer, TreeMap<Integer, i1.b>> f4917a = new HashMap<>();

        private void a(i1.b bVar) {
            int i10 = bVar.f12303a;
            int i11 = bVar.f12304b;
            TreeMap<Integer, i1.b> treeMap = this.f4917a.get(Integer.valueOf(i10));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.f4917a.put(Integer.valueOf(i10), treeMap);
            }
            i1.b bVar2 = treeMap.get(Integer.valueOf(i11));
            if (bVar2 != null) {
                Log.w("ROOM", "Overriding migration " + bVar2 + " with " + bVar);
            }
            treeMap.put(Integer.valueOf(i11), bVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.util.List<i1.b> d(java.util.List<i1.b> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L5a
                goto L7
            L5:
                if (r9 <= r10) goto L5a
            L7:
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, i1.b>> r0 = r6.f4917a
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
                if (r3 == 0) goto L56
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r8 == 0) goto L40
                if (r3 > r10) goto L45
                if (r3 <= r9) goto L45
            L3e:
                r5 = r4
                goto L45
            L40:
                if (r3 < r10) goto L45
                if (r3 >= r9) goto L45
                goto L3e
            L45:
                if (r5 == 0) goto L26
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object r9 = r0.get(r9)
                i1.b r9 = (i1.b) r9
                r7.add(r9)
                r9 = r3
                goto L57
            L56:
                r4 = r5
            L57:
                if (r4 != 0) goto L0
                return r1
            L5a:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.i0.d.d(java.util.List, boolean, int, int):java.util.List");
        }

        public void b(i1.b... bVarArr) {
            for (i1.b bVar : bVarArr) {
                a(bVar);
            }
        }

        public List<i1.b> c(int i10, int i11) {
            if (i10 == i11) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i11 > i10, i10, i11);
        }

        public Map<Integer, Map<Integer, i1.b>> e() {
            return Collections.unmodifiableMap(this.f4917a);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(String str, List<Object> list);
    }

    public /* synthetic */ Object A(m1.g gVar) {
        v();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T E(Class<T> cls, m1.h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (!(hVar instanceof k)) {
            return null;
        }
        return (T) E(cls, ((k) hVar).b());
    }

    private void u() {
        c();
        m1.g U0 = this.f4878d.U0();
        this.f4879e.p(U0);
        if (U0.x0()) {
            U0.H0();
        } else {
            U0.t();
        }
    }

    private void v() {
        this.f4878d.U0().q();
        if (!s()) {
            this.f4879e.h();
        }
    }

    private static boolean x() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public /* synthetic */ Object z(m1.g gVar) {
        u();
        return null;
    }

    public Cursor B(m1.j jVar) {
        return C(jVar, null);
    }

    public Cursor C(m1.j jVar, CancellationSignal cancellationSignal) {
        c();
        d();
        return cancellationSignal != null ? this.f4878d.U0().R(jVar, cancellationSignal) : this.f4878d.U0().J(jVar);
    }

    @Deprecated
    public void D() {
        this.f4878d.U0().C0();
    }

    public void c() {
        if (!this.f4880f && x()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void d() {
        if (s() || this.f4886l.get() == null) {
            return;
        }
        throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    @Deprecated
    public void e() {
        c();
        androidx.room.a aVar = this.f4885k;
        if (aVar == null) {
            u();
        } else {
            aVar.c(new o.a() { // from class: h1.i
                @Override // o.a
                public final Object apply(Object obj) {
                    Object z10;
                    z10 = i0.this.z((m1.g) obj);
                    return z10;
                }
            });
        }
    }

    public m1.k f(String str) {
        c();
        d();
        return this.f4878d.U0().T(str);
    }

    protected abstract p g();

    protected abstract m1.h h(j jVar);

    @Deprecated
    public void i() {
        androidx.room.a aVar = this.f4885k;
        if (aVar == null) {
            v();
        } else {
            aVar.c(new o.a() { // from class: h1.j
                @Override // o.a
                public final Object apply(Object obj) {
                    Object A;
                    A = i0.this.A((m1.g) obj);
                    return A;
                }
            });
        }
    }

    public List<i1.b> j(Map<Class<? extends i1.a>, i1.a> map) {
        return Collections.emptyList();
    }

    public Map<String, Object> k() {
        return this.f4887m;
    }

    public Lock l() {
        return this.f4884j.readLock();
    }

    public m1.h m() {
        return this.f4878d;
    }

    public Executor n() {
        return this.f4876b;
    }

    public Set<Class<? extends i1.a>> o() {
        return Collections.emptySet();
    }

    protected Map<Class<?>, List<Class<?>>> p() {
        return Collections.emptyMap();
    }

    public ThreadLocal<Integer> q() {
        return this.f4886l;
    }

    public Executor r() {
        return this.f4877c;
    }

    public boolean s() {
        return this.f4878d.U0().n0();
    }

    public void t(j jVar) {
        boolean z10;
        this.f4878d = h(jVar);
        Set<Class<? extends i1.a>> o10 = o();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends i1.a>> it = o10.iterator();
        while (true) {
            int i10 = -1;
            if (!it.hasNext()) {
                for (int size = jVar.f4924g.size() - 1; size >= 0; size--) {
                    if (!bitSet.get(size)) {
                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    }
                }
                Iterator<i1.b> it2 = j(this.f4883i).iterator();
                while (true) {
                    z10 = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    i1.b next = it2.next();
                    if (!jVar.f4921d.e().containsKey(Integer.valueOf(next.f12303a))) {
                        jVar.f4921d.b(next);
                    }
                }
                l0 l0Var = (l0) E(l0.class, this.f4878d);
                if (l0Var != null) {
                    l0Var.h(jVar);
                }
                androidx.room.f fVar = (androidx.room.f) E(androidx.room.f.class, this.f4878d);
                if (fVar != null) {
                    androidx.room.a e10 = fVar.e();
                    this.f4885k = e10;
                    this.f4879e.k(e10);
                }
                if (jVar.f4926i == c.WRITE_AHEAD_LOGGING) {
                    z10 = true;
                }
                this.f4878d.setWriteAheadLoggingEnabled(z10);
                this.f4882h = jVar.f4922e;
                this.f4876b = jVar.f4927j;
                this.f4877c = new n0(jVar.f4928k);
                this.f4880f = jVar.f4925h;
                this.f4881g = z10;
                Intent intent = jVar.f4930m;
                if (intent != null) {
                    this.f4879e.l(jVar.f4919b, jVar.f4920c, intent);
                }
                Map<Class<?>, List<Class<?>>> p10 = p();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : p10.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size2 = jVar.f4923f.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                size2 = -1;
                                break;
                            } else if (cls.isAssignableFrom(jVar.f4923f.get(size2).getClass())) {
                                bitSet2.set(size2);
                                break;
                            } else {
                                size2--;
                            }
                        }
                        if (size2 < 0) {
                            throw new IllegalArgumentException("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.");
                        }
                        this.f4888n.put(cls, jVar.f4923f.get(size2));
                    }
                }
                for (int size3 = jVar.f4923f.size() - 1; size3 >= 0; size3--) {
                    if (!bitSet2.get(size3)) {
                        throw new IllegalArgumentException("Unexpected type converter " + jVar.f4923f.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                }
                return;
            }
            Class<? extends i1.a> next2 = it.next();
            int size4 = jVar.f4924g.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (next2.isAssignableFrom(jVar.f4924g.get(size4).getClass())) {
                    bitSet.set(size4);
                    i10 = size4;
                    break;
                } else {
                    size4--;
                }
            }
            if (i10 < 0) {
                throw new IllegalArgumentException("A required auto migration spec (" + next2.getCanonicalName() + ") is missing in the database configuration.");
            }
            this.f4883i.put(next2, jVar.f4924g.get(i10));
        }
    }

    public void w(m1.g gVar) {
        this.f4879e.e(gVar);
    }

    public boolean y() {
        androidx.room.a aVar = this.f4885k;
        if (aVar != null) {
            return aVar.g();
        }
        m1.g gVar = this.f4875a;
        return gVar != null && gVar.isOpen();
    }
}
