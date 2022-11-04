package xb;

import hc.t;
import kotlin.Metadata;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\bJ\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&J\u0014\u0010\u0007\u001a\u00020\u00062\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¨\u0006\t"}, d2 = {"Lxb/e;", "Lxb/g$b;", "T", "Lxb/d;", "continuation", "u", "Ltb/e0;", "M", "b", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public interface e extends g.b {
    public static final b X0 = b.f25514c;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {
        public static <E extends g.b> E a(e eVar, g.c<E> cVar) {
            t.e(cVar, "key");
            if (!(cVar instanceof xb.b)) {
                if (e.X0 != cVar) {
                    return null;
                }
                t.c(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
            xb.b bVar = (xb.b) cVar;
            if (!bVar.a(eVar.getKey())) {
                return null;
            }
            E e10 = (E) bVar.b(eVar);
            if (!(e10 instanceof g.b)) {
                return null;
            }
            return e10;
        }

        public static g b(e eVar, g.c<?> cVar) {
            t.e(cVar, "key");
            if (!(cVar instanceof xb.b)) {
                return e.X0 == cVar ? h.f25516c : eVar;
            }
            xb.b bVar = (xb.b) cVar;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f25516c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lxb/e$b;", "Lxb/g$c;", "Lxb/e;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b implements g.c<e> {

        /* renamed from: c */
        static final /* synthetic */ b f25514c = new b();

        private b() {
        }
    }

    void M(d<?> dVar);

    <T> d<T> u(d<? super T> dVar);
}
