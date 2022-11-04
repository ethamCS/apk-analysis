package xb;

import gc.p;
import hc.t;
import hc.v;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import xb.e;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002J\u0014\u0010\u0010\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¨\u0006\u0013"}, d2 = {"Lxb/g;", BuildConfig.FLAVOR, "Lxb/g$b;", "E", "Lxb/g$c;", "key", "i", "(Lxb/g$c;)Lxb/g$b;", "R", "initial", "Lkotlin/Function2;", "operation", "f", "(Ljava/lang/Object;Lgc/p;)Ljava/lang/Object;", "context", "B", "s", "b", "c", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public interface g {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxb/g;", "acc", "Lxb/g$b;", "element", "b", "(Lxb/g;Lxb/g$b;)Lxb/g;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: xb.g$a$a */
        /* loaded from: classes.dex */
        public static final class C0450a extends v implements p<g, b, g> {

            /* renamed from: c */
            public static final C0450a f25515c = new C0450a();

            C0450a() {
                super(2);
            }

            /* renamed from: b */
            public final g u(g gVar, b bVar) {
                xb.c cVar;
                t.e(gVar, "acc");
                t.e(bVar, "element");
                g s10 = gVar.s(bVar.getKey());
                h hVar = h.f25516c;
                if (s10 == hVar) {
                    return bVar;
                }
                e.b bVar2 = e.X0;
                e eVar = (e) s10.i(bVar2);
                if (eVar == null) {
                    cVar = new xb.c(s10, bVar);
                } else {
                    g s11 = s10.s(bVar2);
                    if (s11 == hVar) {
                        return new xb.c(bVar, eVar);
                    }
                    cVar = new xb.c(new xb.c(s11, bVar), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g gVar2) {
            t.e(gVar2, "context");
            return gVar2 == h.f25516c ? gVar : (g) gVar2.f(gVar, C0450a.f25515c);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00028\u00002\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\r\u001a\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lxb/g$b;", "Lxb/g;", "E", "Lxb/g$c;", "key", "i", "(Lxb/g$c;)Lxb/g$b;", "R", "initial", "Lkotlin/Function2;", "operation", "f", "(Ljava/lang/Object;Lgc/p;)Ljava/lang/Object;", "s", "getKey", "()Lxb/g$c;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public interface b extends g {

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class a {
            public static <R> R a(b bVar, R r10, p<? super R, ? super b, ? extends R> pVar) {
                t.e(pVar, "operation");
                return pVar.u(r10, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> cVar) {
                t.e(cVar, "key");
                if (t.a(bVar.getKey(), cVar)) {
                    t.c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return bVar;
                }
                return null;
            }

            public static g c(b bVar, c<?> cVar) {
                t.e(cVar, "key");
                return t.a(bVar.getKey(), cVar) ? h.f25516c : bVar;
            }

            public static g d(b bVar, g gVar) {
                t.e(gVar, "context");
                return a.a(bVar, gVar);
            }
        }

        @Override // xb.g
        <R> R f(R r10, p<? super R, ? super b, ? extends R> pVar);

        c<?> getKey();

        @Override // xb.g
        <E extends b> E i(c<E> cVar);

        @Override // xb.g
        g s(c<?> cVar);
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lxb/g$c;", "Lxb/g$b;", "E", BuildConfig.FLAVOR, "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public interface c<E extends b> {
    }

    g B(g gVar);

    <R> R f(R r10, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E i(c<E> cVar);

    g s(c<?> cVar);
}
