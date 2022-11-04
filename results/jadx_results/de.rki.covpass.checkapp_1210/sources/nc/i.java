package nc;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.l0;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lnc/i;", "Lub/l0;", BuildConfig.FLAVOR, "hasNext", BuildConfig.FLAVOR, "b", "first", "last", "step", "<init>", "(JJJ)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class i extends l0 {

    /* renamed from: c */
    private final long f16964c;

    /* renamed from: d */
    private final long f16965d;

    /* renamed from: q */
    private boolean f16966q;

    /* renamed from: x */
    private long f16967x;

    public i(long j10, long j11, long j12) {
        this.f16964c = j12;
        this.f16965d = j11;
        boolean z10 = true;
        if (j12 <= 0 ? j10 < j11 : j10 > j11) {
            z10 = false;
        }
        this.f16966q = z10;
        this.f16967x = !z10 ? j11 : j10;
    }

    @Override // ub.l0
    public long b() {
        long j10 = this.f16967x;
        if (j10 != this.f16965d) {
            this.f16967x = this.f16964c + j10;
        } else if (!this.f16966q) {
            throw new NoSuchElementException();
        } else {
            this.f16966q = false;
        }
        return j10;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public boolean hasNext() {
        return this.f16966q;
    }
}
