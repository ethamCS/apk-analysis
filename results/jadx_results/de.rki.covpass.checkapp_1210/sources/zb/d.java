package zb;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eB\u001b\b\u0016\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000fJ\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lzb/d;", "Lzb/a;", "Lxb/d;", BuildConfig.FLAVOR, "W", "Ltb/e0;", "G", "Lxb/g;", "b", "()Lxb/g;", "context", "completion", "_context", "<init>", "(Lxb/d;Lxb/g;)V", "(Lxb/d;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class d extends a {

    /* renamed from: d */
    private final xb.g f26592d;

    /* renamed from: q */
    private transient xb.d<Object> f26593q;

    public d(xb.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.b() : null);
    }

    public d(xb.d<Object> dVar, xb.g gVar) {
        super(dVar);
        this.f26592d = gVar;
    }

    @Override // zb.a
    public void G() {
        xb.d<?> dVar = this.f26593q;
        if (dVar != null && dVar != this) {
            g.b i10 = b().i(xb.e.X0);
            t.b(i10);
            ((xb.e) i10).M(dVar);
        }
        this.f26593q = c.f26591c;
    }

    public final xb.d<Object> W() {
        xb.d<Object> dVar = this.f26593q;
        if (dVar == null) {
            xb.e eVar = (xb.e) b().i(xb.e.X0);
            if (eVar == null || (dVar = eVar.u(this)) == null) {
                dVar = this;
            }
            this.f26593q = dVar;
        }
        return dVar;
    }

    @Override // xb.d
    public xb.g b() {
        xb.g gVar = this.f26592d;
        t.b(gVar);
        return gVar;
    }
}
