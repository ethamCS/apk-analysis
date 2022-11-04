package hc;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lhc/b;", "Lub/p;", BuildConfig.FLAVOR, "hasNext", BuildConfig.FLAVOR, "a", BuildConfig.FLAVOR, "array", "<init>", "([B)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
final class b extends ub.p {

    /* renamed from: c */
    private final byte[] f11748c;

    /* renamed from: d */
    private int f11749d;

    public b(byte[] bArr) {
        t.e(bArr, "array");
        this.f11748c = bArr;
    }

    @Override // ub.p
    public byte a() {
        try {
            byte[] bArr = this.f11748c;
            int i10 = this.f11749d;
            this.f11749d = i10 + 1;
            return bArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f11749d--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public boolean hasNext() {
        return this.f11749d < this.f11748c.length;
    }
}
