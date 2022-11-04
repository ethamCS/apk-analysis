package xb;

import gc.l;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import xb.g;
import xb.g.b;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u0004B+\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lxb/b;", "Lxb/g$b;", "B", "E", "Lxb/g$c;", "element", "b", "(Lxb/g$b;)Lxb/g$b;", "key", BuildConfig.FLAVOR, "a", "(Lxb/g$c;)Z", "baseKey", "Lkotlin/Function1;", "safeCast", "<init>", "(Lxb/g$c;Lgc/l;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class b<B extends g.b, E extends B> implements g.c<E> {

    /* renamed from: c */
    private final l<g.b, E> f25509c;

    /* renamed from: d */
    private final g.c<?> f25510d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [gc.l<xb.g$b, E extends B>, java.lang.Object, gc.l<? super xb.g$b, ? extends E extends B>] */
    public b(g.c<B> cVar, l<? super g.b, ? extends E> lVar) {
        t.e(cVar, "baseKey");
        t.e(lVar, "safeCast");
        this.f25509c = lVar;
        this.f25510d = cVar instanceof b ? (g.c<B>) ((b) cVar).f25510d : cVar;
    }

    public final boolean a(g.c<?> cVar) {
        t.e(cVar, "key");
        return cVar == this || this.f25510d == cVar;
    }

    public final g.b b(g.b bVar) {
        t.e(bVar, "element");
        return (g.b) this.f25509c.invoke(bVar);
    }
}
