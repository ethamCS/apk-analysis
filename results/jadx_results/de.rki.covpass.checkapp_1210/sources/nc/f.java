package nc;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.k0;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lnc/f;", "Lub/k0;", BuildConfig.FLAVOR, "hasNext", BuildConfig.FLAVOR, "b", "first", "last", "step", "<init>", "(III)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class f extends k0 {

    /* renamed from: c */
    private final int f16956c;

    /* renamed from: d */
    private final int f16957d;

    /* renamed from: q */
    private boolean f16958q;

    /* renamed from: x */
    private int f16959x;

    public f(int i10, int i11, int i12) {
        this.f16956c = i12;
        this.f16957d = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f16958q = z10;
        this.f16959x = !z10 ? i11 : i10;
    }

    @Override // ub.k0
    public int b() {
        int i10 = this.f16959x;
        if (i10 != this.f16957d) {
            this.f16959x = this.f16956c + i10;
        } else if (!this.f16958q) {
            throw new NoSuchElementException();
        } else {
            this.f16958q = false;
        }
        return i10;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public boolean hasNext() {
        return this.f16958q;
    }
}
