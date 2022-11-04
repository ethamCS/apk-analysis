package df;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.p1;
import kotlinx.coroutines.u0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\u0012"}, d2 = {"Ldf/d;", "E", "Ldf/j;", "Ldf/f;", BuildConfig.FLAVOR, "cause", "Ltb/e0;", "G0", "exception", BuildConfig.FLAVOR, "l0", "Lxb/g;", "parentContext", "Ldf/i;", "channel", "active", "<init>", "(Lxb/g;Ldf/i;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
class d<E> extends j<E> implements f<E> {
    public d(xb.g gVar, i<E> iVar, boolean z10) {
        super(gVar, iVar, false, z10);
        n0((a2) gVar.i(a2.W0));
    }

    @Override // kotlinx.coroutines.i2
    protected void G0(Throwable th2) {
        i<E> l12 = l1();
        CancellationException cancellationException = null;
        if (th2 != null) {
            if (th2 instanceof CancellationException) {
                cancellationException = (CancellationException) th2;
            }
            if (cancellationException == null) {
                cancellationException = p1.a(u0.a(this) + " was cancelled", th2);
            }
        }
        l12.r(cancellationException);
    }

    @Override // kotlinx.coroutines.i2
    protected boolean l0(Throwable th2) {
        o0.a(b(), th2);
        return true;
    }
}
