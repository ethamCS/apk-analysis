package xb;

import gc.p;
import hc.t;
import hc.v;
import java.io.Serializable;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0000H\u0002J*\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\f*\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0012\u001a\u00028\u00002\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00012\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0016J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016¨\u0006!"}, d2 = {"Lxb/c;", "Lxb/g;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", BuildConfig.FLAVOR, "g", "Lxb/g$b;", "element", BuildConfig.FLAVOR, "b", "context", "c", "E", "Lxb/g$c;", "key", "i", "(Lxb/g$c;)Lxb/g$b;", "R", "initial", "Lkotlin/Function2;", "operation", "f", "(Ljava/lang/Object;Lgc/p;)Ljava/lang/Object;", "s", BuildConfig.FLAVOR, "other", "equals", "hashCode", BuildConfig.FLAVOR, "toString", "left", "<init>", "(Lxb/g;Lxb/g$b;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c implements g, Serializable {

    /* renamed from: c */
    private final g f25511c;

    /* renamed from: d */
    private final g.b f25512d;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "acc", "Lxb/g$b;", "element", "b", "(Ljava/lang/String;Lxb/g$b;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class a extends v implements p<String, g.b, String> {

        /* renamed from: c */
        public static final a f25513c = new a();

        a() {
            super(2);
        }

        /* renamed from: b */
        public final String u(String str, g.b bVar) {
            t.e(str, "acc");
            t.e(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(g gVar, g.b bVar) {
        t.e(gVar, "left");
        t.e(bVar, "element");
        this.f25511c = gVar;
        this.f25512d = bVar;
    }

    private final boolean b(g.b bVar) {
        return t.a(i(bVar.getKey()), bVar);
    }

    private final boolean c(c cVar) {
        while (b(cVar.f25512d)) {
            g gVar = cVar.f25511c;
            if (!(gVar instanceof c)) {
                t.c(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return b((g.b) gVar);
            }
            cVar = (c) gVar;
        }
        return false;
    }

    private final int g() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f25511c;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    @Override // xb.g
    public g B(g gVar) {
        return g.a.a(this, gVar);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.g() != g() || !cVar.c(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // xb.g
    public <R> R f(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        t.e(pVar, "operation");
        return pVar.u((Object) this.f25511c.f(r10, pVar), this.f25512d);
    }

    public int hashCode() {
        return this.f25511c.hashCode() + this.f25512d.hashCode();
    }

    @Override // xb.g
    public <E extends g.b> E i(g.c<E> cVar) {
        t.e(cVar, "key");
        c cVar2 = this;
        while (true) {
            E e10 = (E) cVar2.f25512d.i(cVar);
            if (e10 != null) {
                return e10;
            }
            g gVar = cVar2.f25511c;
            if (!(gVar instanceof c)) {
                return (E) gVar.i(cVar);
            }
            cVar2 = (c) gVar;
        }
    }

    @Override // xb.g
    public g s(g.c<?> cVar) {
        t.e(cVar, "key");
        if (this.f25512d.i(cVar) != null) {
            return this.f25511c;
        }
        g s10 = this.f25511c.s(cVar);
        return s10 == this.f25511c ? this : s10 == h.f25516c ? this.f25512d : new c(s10, this.f25512d);
    }

    public String toString() {
        return '[' + ((String) f(BuildConfig.FLAVOR, a.f25513c)) + ']';
    }
}
