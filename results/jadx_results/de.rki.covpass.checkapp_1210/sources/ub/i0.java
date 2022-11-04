package ub;

import java.util.Iterator;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0004H\u0096\u0002¨\u0006\n"}, d2 = {"Lub/i0;", "T", BuildConfig.FLAVOR, "Lub/h0;", BuildConfig.FLAVOR, "iterator", "Lkotlin/Function0;", "iteratorFactory", "<init>", "(Lgc/a;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class i0<T> implements Iterable<h0<? extends T>>, ic.a {

    /* renamed from: c */
    private final gc.a<Iterator<T>> f23378c;

    /* JADX WARN: Multi-variable type inference failed */
    public i0(gc.a<? extends Iterator<? extends T>> aVar) {
        hc.t.e(aVar, "iteratorFactory");
        this.f23378c = aVar;
    }

    @Override // java.lang.Iterable
    public Iterator<h0<T>> iterator() {
        return new j0(this.f23378c.invoke());
    }
}
