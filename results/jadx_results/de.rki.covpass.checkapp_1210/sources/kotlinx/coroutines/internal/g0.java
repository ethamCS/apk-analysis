package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.z2;
import org.conscrypt.BuildConfig;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0016\u001a\u00028\u0000\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\r\u001a\u00020\u00032\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016J*\u0010\u0010\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u000f*\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lkotlinx/coroutines/internal/g0;", "T", "Lkotlinx/coroutines/z2;", "Lxb/g;", "context", "e0", "(Lxb/g;)Ljava/lang/Object;", "oldState", "Ltb/e0;", "z0", "(Lxb/g;Ljava/lang/Object;)V", "Lxb/g$c;", "key", "s", "Lxb/g$b;", "E", "i", "(Lxb/g$c;)Lxb/g$b;", BuildConfig.FLAVOR, "toString", "c", "Ljava/lang/Object;", "value", "Ljava/lang/ThreadLocal;", "d", "Ljava/lang/ThreadLocal;", "threadLocal", "Lxb/g$c;", "getKey", "()Lxb/g$c;", "<init>", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class g0<T> implements z2<T> {

    /* renamed from: c */
    private final T f15426c;

    /* renamed from: d */
    private final ThreadLocal<T> f15427d;

    /* renamed from: q */
    private final g.c<?> f15428q;

    public g0(T t10, ThreadLocal<T> threadLocal) {
        this.f15426c = t10;
        this.f15427d = threadLocal;
        this.f15428q = new h0(threadLocal);
    }

    @Override // xb.g
    public xb.g B(xb.g gVar) {
        return z2.a.b(this, gVar);
    }

    @Override // kotlinx.coroutines.z2
    public T e0(xb.g gVar) {
        T t10 = this.f15427d.get();
        this.f15427d.set(this.f15426c);
        return t10;
    }

    @Override // xb.g.b, xb.g
    public <R> R f(R r10, gc.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) z2.a.a(this, r10, pVar);
    }

    @Override // xb.g.b
    public g.c<?> getKey() {
        return this.f15428q;
    }

    @Override // xb.g.b, xb.g
    public <E extends g.b> E i(g.c<E> cVar) {
        if (hc.t.a(getKey(), cVar)) {
            return this;
        }
        return null;
    }

    @Override // xb.g.b, xb.g
    public xb.g s(g.c<?> cVar) {
        return hc.t.a(getKey(), cVar) ? xb.h.f25516c : this;
    }

    public String toString() {
        return "ThreadLocal(value=" + this.f15426c + ", threadLocal = " + this.f15427d + ')';
    }

    @Override // kotlinx.coroutines.z2
    public void z0(xb.g gVar, T t10) {
        this.f15427d.set(t10);
    }
}
