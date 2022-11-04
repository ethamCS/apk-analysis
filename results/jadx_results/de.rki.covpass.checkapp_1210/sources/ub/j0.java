package ub;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002¨\u0006\n"}, d2 = {"Lub/j0;", "T", BuildConfig.FLAVOR, "Lub/h0;", BuildConfig.FLAVOR, "hasNext", "b", "iterator", "<init>", "(Ljava/util/Iterator;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class j0<T> implements Iterator<h0<? extends T>>, ic.a, j$.util.Iterator {

    /* renamed from: c */
    private final Iterator<T> f23379c;

    /* renamed from: d */
    private int f23380d;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(Iterator<? extends T> it) {
        hc.t.e(it, "iterator");
        this.f23379c = it;
    }

    /* renamed from: b */
    public final h0<T> next() {
        int i10 = this.f23380d;
        this.f23380d = i10 + 1;
        if (i10 < 0) {
            u.r();
        }
        return new h0<>(i10, this.f23379c.next());
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f23379c.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
