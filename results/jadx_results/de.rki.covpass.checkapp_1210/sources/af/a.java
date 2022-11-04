package af;

import hc.t;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\b"}, d2 = {"Laf/a;", "T", "Laf/h;", BuildConfig.FLAVOR, "iterator", "sequence", "<init>", "(Laf/h;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class a<T> implements h<T> {

    /* renamed from: a */
    private final AtomicReference<h<T>> f472a;

    public a(h<? extends T> hVar) {
        t.e(hVar, "sequence");
        this.f472a = new AtomicReference<>(hVar);
    }

    @Override // af.h
    public Iterator<T> iterator() {
        h<T> andSet = this.f472a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
