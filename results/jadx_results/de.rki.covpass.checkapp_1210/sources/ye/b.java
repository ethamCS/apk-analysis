package ye;

import gc.l;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes3.dex */
public class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a extends AbstractC0460b<N, Boolean> {

        /* renamed from: a */
        final /* synthetic */ l f26230a;

        /* renamed from: b */
        final /* synthetic */ boolean[] f26231b;

        a(l lVar, boolean[] zArr) {
            this.f26230a = lVar;
            this.f26231b = zArr;
        }

        @Override // ye.b.d
        public boolean c(N n10) {
            if (((Boolean) this.f26230a.invoke(n10)).booleanValue()) {
                this.f26231b[0] = true;
            }
            return !this.f26231b[0];
        }

        /* renamed from: d */
        public Boolean a() {
            return Boolean.valueOf(this.f26231b[0]);
        }
    }

    /* renamed from: ye.b$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0460b<N, R> implements d<N, R> {
        @Override // ye.b.d
        public void b(N n10) {
        }
    }

    /* loaded from: classes3.dex */
    public interface c<N> {
        Iterable<? extends N> a(N n10);
    }

    /* loaded from: classes3.dex */
    public interface d<N, R> {
        R a();

        void b(N n10);

        boolean c(N n10);
    }

    /* loaded from: classes3.dex */
    public interface e<N> {
        boolean a(N n10);
    }

    /* loaded from: classes3.dex */
    public static class f<N> implements e<N> {

        /* renamed from: a */
        private final Set<N> f26232a;

        public f() {
            this(new HashSet());
        }

        public f(Set<N> set) {
            if (set == null) {
                b(0);
            }
            this.f26232a = set;
        }

        private static /* synthetic */ void b(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
        }

        @Override // ye.b.e
        public boolean a(N n10) {
            return this.f26232a.add(n10);
        }
    }

    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i10) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static <N, R> R b(Collection<N> collection, c<N> cVar, d<N, R> dVar) {
        if (collection == null) {
            a(4);
        }
        if (cVar == null) {
            a(5);
        }
        if (dVar == null) {
            a(6);
        }
        return (R) c(collection, cVar, new f(), dVar);
    }

    public static <N, R> R c(Collection<N> collection, c<N> cVar, e<N> eVar, d<N, R> dVar) {
        if (collection == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        if (eVar == null) {
            a(2);
        }
        if (dVar == null) {
            a(3);
        }
        for (N n10 : collection) {
            d(n10, cVar, eVar, dVar);
        }
        return dVar.a();
    }

    public static <N> void d(N n10, c<N> cVar, e<N> eVar, d<N, ?> dVar) {
        if (n10 == null) {
            a(22);
        }
        if (cVar == null) {
            a(23);
        }
        if (eVar == null) {
            a(24);
        }
        if (dVar == null) {
            a(25);
        }
        if (eVar.a(n10) && dVar.c(n10)) {
            for (N n11 : cVar.a(n10)) {
                d(n11, cVar, eVar, dVar);
            }
            dVar.b(n10);
        }
    }

    public static <N> Boolean e(Collection<N> collection, c<N> cVar, l<N, Boolean> lVar) {
        if (collection == null) {
            a(7);
        }
        if (cVar == null) {
            a(8);
        }
        if (lVar == null) {
            a(9);
        }
        return (Boolean) b(collection, cVar, new a(lVar, new boolean[1]));
    }
}
