package hf;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002R\u0011\u0010\f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lhf/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", BuildConfig.FLAVOR, "offset", "length", "c", "Ltb/e0;", "d", "a", "()I", "availableBytes", "array", "<init>", "([B)V", "kotlinx-serialization-cbor"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a */
    private byte[] f11888a;

    /* renamed from: b */
    private int f11889b;

    public a(byte[] bArr) {
        t.e(bArr, "array");
        this.f11888a = bArr;
    }

    public final int a() {
        return this.f11888a.length - this.f11889b;
    }

    public final int b() {
        int i10 = this.f11889b;
        byte[] bArr = this.f11888a;
        if (i10 < bArr.length) {
            this.f11889b = i10 + 1;
            return bArr[i10] & 255;
        }
        return -1;
    }

    public final int c(byte[] bArr, int i10, int i11) {
        t.e(bArr, "b");
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        int i12 = this.f11889b;
        byte[] bArr2 = this.f11888a;
        if (i12 >= bArr2.length) {
            return -1;
        }
        if (i11 == 0) {
            return 0;
        }
        if (bArr2.length - i12 < i11) {
            i11 = bArr2.length - i12;
        }
        ub.l.e(bArr2, bArr, i10, i12, i12 + i11);
        this.f11889b += i11;
        return i11;
    }

    public final void d(int i10) {
        this.f11889b += i10;
    }
}
