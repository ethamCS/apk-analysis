package nc;

import hc.t;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.q;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lnc/b;", "Lub/q;", BuildConfig.FLAVOR, "hasNext", BuildConfig.FLAVOR, "b", "first", "last", BuildConfig.FLAVOR, "step", "<init>", "(CCI)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b extends q {

    /* renamed from: c */
    private final int f16948c;

    /* renamed from: d */
    private final int f16949d;

    /* renamed from: q */
    private boolean f16950q;

    /* renamed from: x */
    private int f16951x;

    public b(char c10, char c11, int i10) {
        this.f16948c = i10;
        this.f16949d = c11;
        boolean z10 = true;
        if (i10 <= 0 ? t.f(c10, c11) < 0 : t.f(c10, c11) > 0) {
            z10 = false;
        }
        this.f16950q = z10;
        this.f16951x = !z10 ? c11 : c10;
    }

    @Override // ub.q
    public char b() {
        int i10 = this.f16951x;
        if (i10 != this.f16949d) {
            this.f16951x = this.f16948c + i10;
        } else if (!this.f16950q) {
            throw new NoSuchElementException();
        } else {
            this.f16950q = false;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public boolean hasNext() {
        return this.f16950q;
    }
}
