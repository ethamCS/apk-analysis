package hf;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lhf/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "elementsToAppend", "Ltb/e0;", "a", BuildConfig.FLAVOR, "b", "buffer", "offset", "count", "d", "byteValue", "c", "<init>", "()V", "kotlinx-serialization-cbor"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a */
    private byte[] f11890a = new byte[32];

    /* renamed from: b */
    private int f11891b;

    private final void a(int i10) {
        int i11 = this.f11891b;
        if (i11 + i10 <= this.f11890a.length) {
            return;
        }
        byte[] bArr = new byte[Integer.highestOneBit(i11 + i10) << 1];
        ub.l.g(this.f11890a, bArr, 0, 0, 0, 14, null);
        this.f11890a = bArr;
    }

    public static /* synthetic */ void e(b bVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        bVar.d(bArr, i10, i11);
    }

    public final byte[] b() {
        int i10 = this.f11891b;
        byte[] bArr = new byte[i10];
        ub.l.g(this.f11890a, bArr, 0, 0, i10, 2, null);
        return bArr;
    }

    public final void c(int i10) {
        a(1);
        byte[] bArr = this.f11890a;
        int i11 = this.f11891b;
        this.f11891b = i11 + 1;
        bArr[i11] = (byte) i10;
    }

    public final void d(byte[] bArr, int i10, int i11) {
        t.e(bArr, "buffer");
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return;
        }
        a(i11);
        ub.l.e(bArr, this.f11890a, this.f11891b, i10, i10 + i11);
        this.f11891b += i11;
    }
}
