package zb;

import hc.t;
import java.io.Serializable;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.s;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H$ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0007H\u0014J$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R!\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lzb/a;", "Lxb/d;", BuildConfig.FLAVOR, "Lzb/e;", "Ljava/io/Serializable;", "Ltb/s;", "result", "Ltb/e0;", "y", "(Ljava/lang/Object;)V", "B", "(Ljava/lang/Object;)Ljava/lang/Object;", "G", "value", "completion", "j", BuildConfig.FLAVOR, "toString", "Ljava/lang/StackTraceElement;", "z", "Lxb/d;", "k", "()Lxb/d;", "x", "()Lzb/e;", "callerFrame", "<init>", "(Lxb/d;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class a implements xb.d<Object>, e, Serializable {

    /* renamed from: c */
    private final xb.d<Object> f26590c;

    public a(xb.d<Object> dVar) {
        this.f26590c = dVar;
    }

    protected abstract Object B(Object obj);

    protected void G() {
    }

    public xb.d<e0> j(Object obj, xb.d<?> dVar) {
        t.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public final xb.d<Object> k() {
        return this.f26590c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object z10 = z();
        if (z10 == null) {
            z10 = getClass().getName();
        }
        sb2.append(z10);
        return sb2.toString();
    }

    public e x() {
        xb.d<Object> dVar = this.f26590c;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xb.d
    public final void y(Object obj) {
        Object B;
        Object c10;
        xb.d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            xb.d dVar2 = aVar.f26590c;
            t.b(dVar2);
            try {
                B = aVar.B(obj);
                c10 = yb.d.c();
            } catch (Throwable th2) {
                s.a aVar2 = s.Companion;
                obj = s.c(tb.t.a(th2));
            }
            if (B == c10) {
                return;
            }
            s.a aVar3 = s.Companion;
            obj = s.c(B);
            aVar.G();
            if (!(dVar2 instanceof a)) {
                dVar2.y(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public StackTraceElement z() {
        return g.d(this);
    }
}
