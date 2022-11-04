package df;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003BJ\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012(\u0010\u0018\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0015ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Ldf/u;", "E", "Ldf/d;", BuildConfig.FLAVOR, "Ldf/e0;", "Ltb/e0;", "J0", "element", "c", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;", "Ldf/m;", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", BuildConfig.FLAVOR, "cause", BuildConfig.FLAVOR, "a", "Lxb/g;", "parentContext", "Ldf/i;", "channel", "Lkotlin/Function2;", "Ldf/f;", "Lxb/d;", "block", "<init>", "(Lxb/g;Ldf/i;Lgc/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class u<E> extends d<E> {

    /* renamed from: x */
    private xb.d<? super tb.e0> f8934x;

    public u(xb.g gVar, i<E> iVar, gc.p<? super f<E>, ? super xb.d<? super tb.e0>, ? extends Object> pVar) {
        super(gVar, iVar, false);
        xb.d<? super tb.e0> a10;
        a10 = yb.c.a(pVar, this, this);
        this.f8934x = a10;
    }

    @Override // kotlinx.coroutines.i2
    protected void J0() {
        ff.a.c(this.f8934x, this);
    }

    @Override // df.j, df.e0
    public boolean a(Throwable th2) {
        boolean a10 = super.a(th2);
        start();
        return a10;
    }

    @Override // df.j, df.e0
    public Object c(E e10, xb.d<? super tb.e0> dVar) {
        Object c10;
        start();
        Object c11 = super.c(e10, dVar);
        c10 = yb.d.c();
        return c11 == c10 ? c11 : tb.e0.f22152a;
    }

    @Override // df.j, df.e0
    public Object d(E e10) {
        start();
        return super.d(e10);
    }
}
