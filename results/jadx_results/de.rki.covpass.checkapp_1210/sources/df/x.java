package df;

import df.e0;
import kotlin.Metadata;
import kotlinx.coroutines.o0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014R\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Ldf/x;", "E", "Ldf/j;", "Ldf/y;", "Ltb/e0;", "value", "m1", "(Ltb/e0;)V", BuildConfig.FLAVOR, "cause", BuildConfig.FLAVOR, "handled", "i1", "j", "()Z", "isActive", "Lxb/g;", "parentContext", "Ldf/i;", "channel", "<init>", "(Lxb/g;Ldf/i;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class x<E> extends j<E> implements y<E> {
    public x(xb.g gVar, i<E> iVar) {
        super(gVar, iVar, true, true);
    }

    @Override // kotlinx.coroutines.a
    protected void i1(Throwable th2, boolean z10) {
        if (l1().a(th2) || z10) {
            return;
        }
        o0.a(b(), th2);
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.i2, kotlinx.coroutines.a2
    public boolean j() {
        return super.j();
    }

    /* renamed from: m1 */
    public void j1(tb.e0 e0Var) {
        e0.a.a(l1(), null, 1, null);
    }
}
