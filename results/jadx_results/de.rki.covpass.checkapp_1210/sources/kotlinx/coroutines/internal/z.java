package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.a2;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014R\u0019\u0010\f\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/internal/z;", "T", "Lkotlinx/coroutines/a;", "Lzb/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", BuildConfig.FLAVOR, "state", "Ltb/e0;", "C", "h1", "x", "()Lzb/e;", "callerFrame", BuildConfig.FLAVOR, "o0", "()Z", "isScopedCoroutine", "Lkotlinx/coroutines/a2;", "l1", "()Lkotlinx/coroutines/a2;", "parent", "Lxb/g;", "context", "Lxb/d;", "uCont", "<init>", "(Lxb/g;Lxb/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class z<T> extends kotlinx.coroutines.a<T> implements zb.e {

    /* renamed from: q */
    public final xb.d<T> f15466q;

    /* JADX WARN: Multi-variable type inference failed */
    public z(xb.g gVar, xb.d<? super T> dVar) {
        super(gVar, true, true);
        this.f15466q = dVar;
    }

    @Override // kotlinx.coroutines.i2
    public void C(Object obj) {
        xb.d b10;
        b10 = yb.c.b(this.f15466q);
        g.c(b10, kotlinx.coroutines.h0.a(obj, this.f15466q), null, 2, null);
    }

    @Override // kotlinx.coroutines.a
    protected void h1(Object obj) {
        xb.d<T> dVar = this.f15466q;
        dVar.y(kotlinx.coroutines.h0.a(obj, dVar));
    }

    public final a2 l1() {
        kotlinx.coroutines.v i02 = i0();
        if (i02 != null) {
            return i02.getParent();
        }
        return null;
    }

    @Override // kotlinx.coroutines.i2
    protected final boolean o0() {
        return true;
    }

    @Override // zb.e
    public final zb.e x() {
        xb.d<T> dVar = this.f15466q;
        if (dVar instanceof zb.e) {
            return (zb.e) dVar;
        }
        return null;
    }
}
