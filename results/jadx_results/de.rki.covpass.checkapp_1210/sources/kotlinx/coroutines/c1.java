package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/c1;", "T", "Lkotlinx/coroutines/internal/z;", BuildConfig.FLAVOR, "o1", "()Z", "n1", BuildConfig.FLAVOR, "state", "Ltb/e0;", "C", "(Ljava/lang/Object;)V", "h1", "m1", "()Ljava/lang/Object;", "Lxb/g;", "context", "Lxb/d;", "uCont", "<init>", "(Lxb/g;Lxb/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class c1<T> extends kotlinx.coroutines.internal.z<T> {

    /* renamed from: x */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f15321x = AtomicIntegerFieldUpdater.newUpdater(c1.class, "_decision");
    private volatile /* synthetic */ int _decision = 0;

    public c1(xb.g gVar, xb.d<? super T> dVar) {
        super(gVar, dVar);
    }

    private final boolean n1() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                return false;
            }
        } while (!f15321x.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean o1() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                return false;
            }
        } while (!f15321x.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // kotlinx.coroutines.internal.z, kotlinx.coroutines.i2
    public void C(Object obj) {
        h1(obj);
    }

    @Override // kotlinx.coroutines.internal.z, kotlinx.coroutines.a
    protected void h1(Object obj) {
        xb.d b10;
        if (n1()) {
            return;
        }
        b10 = yb.c.b(this.f15466q);
        kotlinx.coroutines.internal.g.c(b10, h0.a(obj, this.f15466q), null, 2, null);
    }

    public final Object m1() {
        Object c10;
        if (o1()) {
            c10 = yb.d.c();
            return c10;
        }
        Object h10 = j2.h(k0());
        if (h10 instanceof d0) {
            throw ((d0) h10).f15325a;
        }
        return h10;
    }
}
