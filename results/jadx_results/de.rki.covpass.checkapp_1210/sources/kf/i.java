package kf;

import java.util.Arrays;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lkf/i;", "Lkf/a1;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "requiredCapacity", "Ltb/e0;", "b", "(I)V", BuildConfig.FLAVOR, "c", "e", "(B)V", "f", "()[B", "<set-?>", "position", "I", "d", "()I", "bufferWithData", "<init>", "([B)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class i extends a1<byte[]> {

    /* renamed from: a */
    private byte[] f15170a;

    /* renamed from: b */
    private int f15171b;

    public i(byte[] bArr) {
        hc.t.e(bArr, "bufferWithData");
        this.f15170a = bArr;
        this.f15171b = bArr.length;
        b(10);
    }

    @Override // kf.a1
    public void b(int i10) {
        int b10;
        byte[] bArr = this.f15170a;
        if (bArr.length < i10) {
            b10 = nc.m.b(i10, bArr.length * 2);
            byte[] copyOf = Arrays.copyOf(bArr, b10);
            hc.t.d(copyOf, "copyOf(this, newSize)");
            this.f15170a = copyOf;
        }
    }

    @Override // kf.a1
    public int d() {
        return this.f15171b;
    }

    public final void e(byte b10) {
        a1.c(this, 0, 1, null);
        byte[] bArr = this.f15170a;
        int d10 = d();
        this.f15171b = d10 + 1;
        bArr[d10] = b10;
    }

    /* renamed from: f */
    public byte[] a() {
        byte[] copyOf = Arrays.copyOf(this.f15170a, d());
        hc.t.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
