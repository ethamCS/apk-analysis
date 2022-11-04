package qa;

import gc.p;
import hc.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lqa/k;", "Lxb/g$b;", "Lxb/g;", "callContext", "Lxb/g;", "a", "()Lxb/g;", "Lxb/g$c;", "getKey", "()Lxb/g$c;", "key", "<init>", "(Lxb/g;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class k implements g.b {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private final xb.g f19770c;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqa/k$a;", "Lxb/g$c;", "Lqa/k;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a implements g.c<k> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public k(xb.g gVar) {
        t.e(gVar, "callContext");
        this.f19770c = gVar;
    }

    @Override // xb.g
    public xb.g B(xb.g gVar) {
        return g.b.a.d(this, gVar);
    }

    public final xb.g a() {
        return this.f19770c;
    }

    @Override // xb.g.b, xb.g
    public <R> R f(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r10, pVar);
    }

    @Override // xb.g.b
    public g.c<?> getKey() {
        return Companion;
    }

    @Override // xb.g.b, xb.g
    public <E extends g.b> E i(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // xb.g.b, xb.g
    public xb.g s(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }
}
