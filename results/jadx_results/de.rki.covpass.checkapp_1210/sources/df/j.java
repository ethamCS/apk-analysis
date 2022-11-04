package df;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.i2;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0003J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096Aø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u000e\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0015\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Ldf/j;", "E", "Lkotlinx/coroutines/a;", "Ltb/e0;", "Ldf/i;", BuildConfig.FLAVOR, "cause", BuildConfig.FLAVOR, "a", "Ldf/k;", "iterator", "Ldf/m;", "w", "(Lxb/d;)Ljava/lang/Object;", "element", "c", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "r", "J", "_channel", "Ldf/i;", "l1", "()Ldf/i;", "e", "channel", "Lxb/g;", "parentContext", "initParentJob", "active", "<init>", "(Lxb/g;Ldf/i;ZZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class j<E> extends kotlinx.coroutines.a<tb.e0> implements i<E> {

    /* renamed from: q */
    private final i<E> f8926q;

    public j(xb.g gVar, i<E> iVar, boolean z10, boolean z11) {
        super(gVar, z10, z11);
        this.f8926q = iVar;
    }

    @Override // kotlinx.coroutines.i2
    public void J(Throwable th2) {
        CancellationException X0 = i2.X0(this, th2, null, 1, null);
        this.f8926q.r(X0);
        F(X0);
    }

    @Override // df.e0
    public boolean a(Throwable th2) {
        return this.f8926q.a(th2);
    }

    @Override // df.e0
    public Object c(E e10, xb.d<? super tb.e0> dVar) {
        return this.f8926q.c(e10, dVar);
    }

    @Override // df.e0
    public Object d(E e10) {
        return this.f8926q.d(e10);
    }

    public final i<E> e() {
        return this;
    }

    @Override // df.a0
    public k<E> iterator() {
        return this.f8926q.iterator();
    }

    public final i<E> l1() {
        return this.f8926q;
    }

    @Override // kotlinx.coroutines.i2, kotlinx.coroutines.a2, df.a0
    public final void r(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new b2(O(), null, this);
        }
        J(cancellationException);
    }

    @Override // df.a0
    public Object w(xb.d<? super m<? extends E>> dVar) {
        Object w9 = this.f8926q.w(dVar);
        yb.d.c();
        return w9;
    }
}
