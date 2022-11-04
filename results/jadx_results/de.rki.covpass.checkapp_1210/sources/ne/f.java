package ne;

import bf.y;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import org.conscrypt.BuildConfig;
import tb.e0;
/* loaded from: classes3.dex */
public class f implements ne.n {

    /* renamed from: d */
    private static final String f16976d;

    /* renamed from: e */
    public static final ne.n f16977e = new a("NO_LOCKS", AbstractC0264f.f16984a, ne.e.f16975a);

    /* renamed from: a */
    protected final ne.k f16978a;

    /* renamed from: b */
    private final AbstractC0264f f16979b;

    /* renamed from: c */
    private final String f16980c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a extends f {
        a(String str, AbstractC0264f abstractC0264f, ne.k kVar) {
            super(str, abstractC0264f, kVar, null);
        }

        private static /* synthetic */ void j(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i10 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String format = String.format(str, objArr);
            if (i10 != 1) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // ne.f
        protected <K, V> o<V> p(String str, K k10) {
            if (str == null) {
                j(0);
            }
            o<V> a10 = o.a();
            if (a10 == null) {
                j(1);
            }
            return a10;
        }
    }

    /* loaded from: classes3.dex */
    class b extends j<T> {

        /* renamed from: x */
        final /* synthetic */ Object f16981x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar, gc.a aVar, Object obj) {
            super(fVar, aVar);
            f.this = r1;
            this.f16981x = obj;
        }

        private static /* synthetic */ void a(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // ne.f.h
        protected o<T> c(boolean z10) {
            o<T> d10 = o.d(this.f16981x);
            if (d10 == 0) {
                a(0);
            }
            return d10;
        }
    }

    /* loaded from: classes3.dex */
    class c extends k<T> {
        final /* synthetic */ gc.l U3;

        /* renamed from: y */
        final /* synthetic */ gc.l f16983y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f fVar, gc.a aVar, gc.l lVar, gc.l lVar2) {
            super(fVar, aVar);
            f.this = r1;
            this.f16983y = lVar;
            this.U3 = lVar2;
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i10 != 2 ? 2 : 3];
            if (i10 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i10 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i10 == 2) {
                objArr[2] = "doPostCompute";
            }
            String format = String.format(str, objArr);
            if (i10 != 2) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }

        @Override // ne.f.h
        protected o<T> c(boolean z10) {
            gc.l lVar = this.f16983y;
            if (lVar == null) {
                o<T> c10 = super.c(z10);
                if (c10 == 0) {
                    a(0);
                }
                return c10;
            }
            o<T> d10 = o.d(lVar.invoke(Boolean.valueOf(z10)));
            if (d10 == 0) {
                a(1);
            }
            return d10;
        }

        @Override // ne.f.i
        protected void d(T t10) {
            if (t10 == 0) {
                a(2);
            }
            this.U3.invoke(t10);
        }
    }

    /* loaded from: classes3.dex */
    private static class d<K, V> extends e<K, V> implements ne.a<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private d(f fVar, ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(fVar, concurrentMap, null);
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }

        /* synthetic */ d(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "computation";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i10 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 != 3) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // ne.f.e, ne.a
        public V a(K k10, gc.a<? extends V> aVar) {
            if (aVar == null) {
                b(2);
            }
            V v10 = (V) super.a(k10, aVar);
            if (v10 == null) {
                b(3);
            }
            return v10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class e<K, V> extends l<g<K, V>, V> implements ne.b<K, V> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a implements gc.l<g<K, V>, V> {
            a() {
            }

            /* renamed from: a */
            public V invoke(g<K, V> gVar) {
                return (V) ((g) gVar).f16986b.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private e(f fVar, ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(fVar, concurrentMap, new a());
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }

        /* synthetic */ e(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i10 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public V a(K k10, gc.a<? extends V> aVar) {
            if (aVar == null) {
                b(2);
            }
            return invoke(new g(k10, aVar));
        }
    }

    /* renamed from: ne.f$f */
    /* loaded from: classes3.dex */
    public interface AbstractC0264f {

        /* renamed from: a */
        public static final AbstractC0264f f16984a = new a();

        /* renamed from: ne.f$f$a */
        /* loaded from: classes3.dex */
        static class a implements AbstractC0264f {
            a() {
            }

            private static /* synthetic */ void b(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // ne.f.AbstractC0264f
            public RuntimeException a(Throwable th2) {
                if (th2 == null) {
                    b(0);
                }
                throw ye.c.b(th2);
            }
        }

        RuntimeException a(Throwable th2);
    }

    /* loaded from: classes3.dex */
    public static class g<K, V> {

        /* renamed from: a */
        private final K f16985a;

        /* renamed from: b */
        private final gc.a<? extends V> f16986b;

        public g(K k10, gc.a<? extends V> aVar) {
            this.f16985a = k10;
            this.f16986b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f16985a.equals(((g) obj).f16985a);
        }

        public int hashCode() {
            return this.f16985a.hashCode();
        }
    }

    /* loaded from: classes3.dex */
    public static class h<T> implements ne.j<T> {

        /* renamed from: c */
        private final f f16987c;

        /* renamed from: d */
        private final gc.a<? extends T> f16988d;

        /* renamed from: q */
        private volatile Object f16989q;

        public h(f fVar, gc.a<? extends T> aVar) {
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f16989q = n.NOT_COMPUTED;
            this.f16987c = fVar;
            this.f16988d = aVar;
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 2 || i10 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 2 || i10 == 3) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 == 2 || i10 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i10 != 2 && i10 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 == 2 || i10 == 3) {
                throw new IllegalStateException(format);
            }
        }

        protected void b(T t10) {
        }

        protected o<T> c(boolean z10) {
            o<T> p10 = this.f16987c.p("in a lazy value", null);
            if (p10 == null) {
                a(2);
            }
            return p10;
        }

        @Override // gc.a
        public T invoke() {
            T invoke;
            Object obj = this.f16989q;
            if (!(obj instanceof n)) {
                return (T) ye.g.f(obj);
            }
            this.f16987c.f16978a.b();
            try {
                Object obj2 = this.f16989q;
                if (!(obj2 instanceof n)) {
                    invoke = (T) ye.g.f(obj2);
                } else {
                    n nVar = n.COMPUTING;
                    if (obj2 == nVar) {
                        this.f16989q = n.RECURSION_WAS_DETECTED;
                        o<T> c10 = c(true);
                        if (!c10.c()) {
                            invoke = c10.b();
                        }
                    }
                    if (obj2 == n.RECURSION_WAS_DETECTED) {
                        o<T> c11 = c(false);
                        if (!c11.c()) {
                            invoke = c11.b();
                        }
                    }
                    this.f16989q = nVar;
                    invoke = this.f16988d.invoke();
                    b(invoke);
                    this.f16989q = invoke;
                }
                return invoke;
            } finally {
                this.f16987c.f16978a.a();
            }
        }

        public boolean r() {
            return (this.f16989q == n.NOT_COMPUTED || this.f16989q == n.COMPUTING) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static abstract class i<T> extends h<T> {

        /* renamed from: x */
        private volatile ne.l<T> f16990x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(f fVar, gc.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f16990x = null;
        }

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // ne.f.h
        protected final void b(T t10) {
            this.f16990x = new ne.l<>(t10);
            try {
                d(t10);
            } finally {
                this.f16990x = null;
            }
        }

        protected abstract void d(T t10);

        @Override // ne.f.h, gc.a
        public T invoke() {
            ne.l<T> lVar = this.f16990x;
            return (lVar == null || !lVar.b()) ? (T) super.invoke() : lVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class j<T> extends h<T> implements ne.i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(f fVar, gc.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 != 2) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // ne.f.h, gc.a
        public T invoke() {
            T t10 = (T) super.invoke();
            if (t10 == null) {
                a(2);
            }
            return t10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static abstract class k<T> extends i<T> implements ne.i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(f fVar, gc.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 != 2) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // ne.f.i, ne.f.h, gc.a
        public T invoke() {
            T t10 = (T) super.invoke();
            if (t10 == null) {
                a(2);
            }
            return t10;
        }
    }

    /* loaded from: classes3.dex */
    public static class l<K, V> implements ne.h<K, V> {

        /* renamed from: c */
        private final f f16991c;

        /* renamed from: d */
        private final ConcurrentMap<K, Object> f16992d;

        /* renamed from: q */
        private final gc.l<? super K, ? extends V> f16993q;

        public l(f fVar, ConcurrentMap<K, Object> concurrentMap, gc.l<? super K, ? extends V> lVar) {
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (lVar == null) {
                b(2);
            }
            this.f16991c = fVar;
            this.f16992d = concurrentMap;
            this.f16993q = lVar;
        }

        private static /* synthetic */ void b(int i10) {
            String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 == 3 || i10 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 == 3 || i10 == 4) {
                throw new IllegalStateException(format);
            }
        }

        private AssertionError c(K k10, Object obj) {
            AssertionError assertionError = (AssertionError) f.q(new AssertionError("Race condition detected on input " + k10 + ". Old value is " + obj + " under " + this.f16991c));
            if (assertionError == null) {
                b(4);
            }
            return assertionError;
        }

        @Override // ne.h
        public boolean V(K k10) {
            Object obj = this.f16992d.get(k10);
            return (obj == null || obj == n.COMPUTING) ? false : true;
        }

        protected o<V> d(K k10, boolean z10) {
            o<V> p10 = this.f16991c.p(BuildConfig.FLAVOR, k10);
            if (p10 == null) {
                b(3);
            }
            return p10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
            if (r2.c() == false) goto L13;
         */
        @Override // gc.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public V invoke(K r6) {
            /*
                r5 = this;
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.f16992d
                java.lang.Object r0 = r0.get(r6)
                if (r0 == 0) goto L11
                ne.f$n r1 = ne.f.n.COMPUTING
                if (r0 == r1) goto L11
                java.lang.Object r6 = ye.g.d(r0)
                return r6
            L11:
                ne.f r0 = r5.f16991c
                ne.k r0 = r0.f16978a
                r0.b()
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.f16992d     // Catch: java.lang.Throwable -> Lb1
                java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> Lb1
                ne.f$n r1 = ne.f.n.COMPUTING     // Catch: java.lang.Throwable -> Lb1
                if (r0 != r1) goto L3b
                ne.f$n r0 = ne.f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> Lb1
                r2 = 1
                ne.f$o r2 = r5.d(r6, r2)     // Catch: java.lang.Throwable -> Lb1
                boolean r3 = r2.c()     // Catch: java.lang.Throwable -> Lb1
                if (r3 != 0) goto L3b
            L2f:
                java.lang.Object r6 = r2.b()     // Catch: java.lang.Throwable -> Lb1
            L33:
                ne.f r0 = r5.f16991c
                ne.k r0 = r0.f16978a
                r0.a()
                return r6
            L3b:
                ne.f$n r2 = ne.f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> Lb1
                if (r0 != r2) goto L4b
                r2 = 0
                ne.f$o r2 = r5.d(r6, r2)     // Catch: java.lang.Throwable -> Lb1
                boolean r3 = r2.c()     // Catch: java.lang.Throwable -> Lb1
                if (r3 != 0) goto L4b
                goto L2f
            L4b:
                if (r0 == 0) goto L52
                java.lang.Object r6 = ye.g.d(r0)     // Catch: java.lang.Throwable -> Lb1
                goto L33
            L52:
                r0 = 0
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r2 = r5.f16992d     // Catch: java.lang.Throwable -> L77
                r2.put(r6, r1)     // Catch: java.lang.Throwable -> L77
                gc.l<? super K, ? extends V> r2 = r5.f16993q     // Catch: java.lang.Throwable -> L77
                java.lang.Object r2 = r2.invoke(r6)     // Catch: java.lang.Throwable -> L77
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r3 = r5.f16992d     // Catch: java.lang.Throwable -> L77
                java.lang.Object r4 = ye.g.b(r2)     // Catch: java.lang.Throwable -> L77
                java.lang.Object r3 = r3.put(r6, r4)     // Catch: java.lang.Throwable -> L77
                if (r3 != r1) goto L72
                ne.f r6 = r5.f16991c
                ne.k r6 = r6.f16978a
                r6.a()
                return r2
            L72:
                java.lang.AssertionError r0 = r5.c(r6, r3)     // Catch: java.lang.Throwable -> L77
                throw r0     // Catch: java.lang.Throwable -> L77
            L77:
                r1 = move-exception
                boolean r2 = ye.c.a(r1)     // Catch: java.lang.Throwable -> Lb1
                if (r2 != 0) goto La9
                if (r1 == r0) goto L9e
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.f16992d     // Catch: java.lang.Throwable -> Lb1
                java.lang.Object r2 = ye.g.c(r1)     // Catch: java.lang.Throwable -> Lb1
                java.lang.Object r0 = r0.put(r6, r2)     // Catch: java.lang.Throwable -> Lb1
                ne.f$n r2 = ne.f.n.COMPUTING     // Catch: java.lang.Throwable -> Lb1
                if (r0 == r2) goto L93
                java.lang.AssertionError r6 = r5.c(r6, r0)     // Catch: java.lang.Throwable -> Lb1
                throw r6     // Catch: java.lang.Throwable -> Lb1
            L93:
                ne.f r6 = r5.f16991c     // Catch: java.lang.Throwable -> Lb1
                ne.f$f r6 = ne.f.k(r6)     // Catch: java.lang.Throwable -> Lb1
                java.lang.RuntimeException r6 = r6.a(r1)     // Catch: java.lang.Throwable -> Lb1
                throw r6     // Catch: java.lang.Throwable -> Lb1
            L9e:
                ne.f r6 = r5.f16991c     // Catch: java.lang.Throwable -> Lb1
                ne.f$f r6 = ne.f.k(r6)     // Catch: java.lang.Throwable -> Lb1
                java.lang.RuntimeException r6 = r6.a(r1)     // Catch: java.lang.Throwable -> Lb1
                throw r6     // Catch: java.lang.Throwable -> Lb1
            La9:
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.f16992d     // Catch: java.lang.Throwable -> Lb1
                r0.remove(r6)     // Catch: java.lang.Throwable -> Lb1
                java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1     // Catch: java.lang.Throwable -> Lb1
                throw r1     // Catch: java.lang.Throwable -> Lb1
            Lb1:
                r6 = move-exception
                ne.f r0 = r5.f16991c
                ne.k r0 = r0.f16978a
                r0.a()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ne.f.l.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes3.dex */
    public static class m<K, V> extends l<K, V> implements ne.g<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(f fVar, ConcurrentMap<K, Object> concurrentMap, gc.l<? super K, ? extends V> lVar) {
            super(fVar, concurrentMap, lVar);
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (lVar == null) {
                b(2);
            }
        }

        private static /* synthetic */ void b(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 != 3) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // ne.f.l, gc.l
        public V invoke(K k10) {
            V v10 = (V) super.invoke(k10);
            if (v10 == null) {
                b(3);
            }
            return v10;
        }
    }

    /* loaded from: classes3.dex */
    public enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* loaded from: classes3.dex */
    public static class o<T> {

        /* renamed from: a */
        private final T f16998a;

        /* renamed from: b */
        private final boolean f16999b;

        private o(T t10, boolean z10) {
            this.f16998a = t10;
            this.f16999b = z10;
        }

        public static <T> o<T> a() {
            return new o<>(null, true);
        }

        public static <T> o<T> d(T t10) {
            return new o<>(t10, false);
        }

        public T b() {
            return this.f16998a;
        }

        public boolean c() {
            return this.f16999b;
        }

        public String toString() {
            return c() ? "FALL_THROUGH" : String.valueOf(this.f16998a);
        }
    }

    static {
        String Q0;
        Q0 = y.Q0(f.class.getCanonicalName(), ".", BuildConfig.FLAVOR);
        f16976d = Q0;
    }

    public f(String str) {
        this(str, (Runnable) null, (gc.l<InterruptedException, e0>) null);
    }

    public f(String str, Runnable runnable, gc.l<InterruptedException, e0> lVar) {
        this(str, AbstractC0264f.f16984a, ne.k.Companion.a(runnable, lVar));
    }

    private f(String str, AbstractC0264f abstractC0264f, ne.k kVar) {
        if (str == null) {
            j(4);
        }
        if (abstractC0264f == null) {
            j(5);
        }
        if (kVar == null) {
            j(6);
        }
        this.f16978a = kVar;
        this.f16979b = abstractC0264f;
        this.f16980c = str;
    }

    /* synthetic */ f(String str, AbstractC0264f abstractC0264f, ne.k kVar, a aVar) {
        this(str, abstractC0264f, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void j(int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.f.j(int):void");
    }

    static /* synthetic */ AbstractC0264f k(f fVar) {
        return fVar.f16979b;
    }

    private static <K> ConcurrentMap<K, Object> m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    public static <T extends Throwable> T q(T t10) {
        if (t10 == null) {
            j(36);
        }
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            } else if (!stackTrace[i11].getClassName().startsWith(f16976d)) {
                i10 = i11;
                break;
            } else {
                i11++;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i10, length);
        t10.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t10;
    }

    @Override // ne.n
    public <T> T a(gc.a<? extends T> aVar) {
        if (aVar == null) {
            j(34);
        }
        this.f16978a.b();
        try {
            return aVar.invoke();
        } finally {
        }
    }

    @Override // ne.n
    public <K, V> ne.g<K, V> b(gc.l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            j(9);
        }
        ne.g<K, V> n10 = n(lVar, m());
        if (n10 == null) {
            j(10);
        }
        return n10;
    }

    @Override // ne.n
    public <K, V> ne.b<K, V> c() {
        return new e(this, m(), null);
    }

    @Override // ne.n
    public <T> ne.i<T> d(gc.a<? extends T> aVar) {
        if (aVar == null) {
            j(23);
        }
        return new j(this, aVar);
    }

    @Override // ne.n
    public <K, V> ne.a<K, V> e() {
        return new d(this, m(), null);
    }

    @Override // ne.n
    public <T> ne.j<T> f(gc.a<? extends T> aVar) {
        if (aVar == null) {
            j(30);
        }
        return new h(this, aVar);
    }

    @Override // ne.n
    public <T> ne.i<T> g(gc.a<? extends T> aVar, T t10) {
        if (aVar == null) {
            j(26);
        }
        if (t10 == null) {
            j(27);
        }
        return new b(this, aVar, t10);
    }

    @Override // ne.n
    public <T> ne.i<T> h(gc.a<? extends T> aVar, gc.l<? super Boolean, ? extends T> lVar, gc.l<? super T, e0> lVar2) {
        if (aVar == null) {
            j(28);
        }
        if (lVar2 == null) {
            j(29);
        }
        return new c(this, aVar, lVar, lVar2);
    }

    @Override // ne.n
    public <K, V> ne.h<K, V> i(gc.l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            j(19);
        }
        ne.h<K, V> o10 = o(lVar, m());
        if (o10 == null) {
            j(20);
        }
        return o10;
    }

    public <K, V> ne.g<K, V> n(gc.l<? super K, ? extends V> lVar, ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            j(14);
        }
        if (concurrentMap == null) {
            j(15);
        }
        return new m(this, concurrentMap, lVar);
    }

    public <K, V> ne.h<K, V> o(gc.l<? super K, ? extends V> lVar, ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            j(21);
        }
        if (concurrentMap == null) {
            j(22);
        }
        return new l(this, concurrentMap, lVar);
    }

    protected <K, V> o<V> p(String str, K k10) {
        String str2;
        if (str == null) {
            j(35);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Recursion detected ");
        sb2.append(str);
        if (k10 == null) {
            str2 = BuildConfig.FLAVOR;
        } else {
            str2 = "on input: " + k10;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        throw ((AssertionError) q(new AssertionError(sb2.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f16980c + ")";
    }
}
