package ub;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0005\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0006¨\u0006\u0016"}, d2 = {"Lub/h0;", "T", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", "b", "()Ljava/lang/Object;", BuildConfig.FLAVOR, "toString", "hashCode", "other", BuildConfig.FLAVOR, "equals", "index", "I", "c", "()I", "value", "Ljava/lang/Object;", "d", "<init>", "(ILjava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class h0<T> {

    /* renamed from: a */
    private final int f23376a;

    /* renamed from: b */
    private final T f23377b;

    public h0(int i10, T t10) {
        this.f23376a = i10;
        this.f23377b = t10;
    }

    public final int a() {
        return this.f23376a;
    }

    public final T b() {
        return this.f23377b;
    }

    public final int c() {
        return this.f23376a;
    }

    public final T d() {
        return this.f23377b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f23376a == h0Var.f23376a && hc.t.a(this.f23377b, h0Var.f23377b);
    }

    public int hashCode() {
        int i10 = this.f23376a * 31;
        T t10 = this.f23377b;
        return i10 + (t10 == null ? 0 : t10.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f23376a + ", value=" + this.f23377b + ')';
    }
}
