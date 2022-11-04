package kf;

import java.util.Arrays;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lkf/c0;", "Lkf/a1;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "requiredCapacity", "Ltb/e0;", "b", "(I)V", "c", "e", "f", "()[I", "<set-?>", "position", "I", "d", "()I", "bufferWithData", "<init>", "([I)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class c0 extends a1<int[]> {

    /* renamed from: a */
    private int[] f15149a;

    /* renamed from: b */
    private int f15150b;

    public c0(int[] iArr) {
        hc.t.e(iArr, "bufferWithData");
        this.f15149a = iArr;
        this.f15150b = iArr.length;
        b(10);
    }

    @Override // kf.a1
    public void b(int i10) {
        int b10;
        int[] iArr = this.f15149a;
        if (iArr.length < i10) {
            b10 = nc.m.b(i10, iArr.length * 2);
            int[] copyOf = Arrays.copyOf(iArr, b10);
            hc.t.d(copyOf, "copyOf(this, newSize)");
            this.f15149a = copyOf;
        }
    }

    @Override // kf.a1
    public int d() {
        return this.f15150b;
    }

    public final void e(int i10) {
        a1.c(this, 0, 1, null);
        int[] iArr = this.f15149a;
        int d10 = d();
        this.f15150b = d10 + 1;
        iArr[d10] = i10;
    }

    /* renamed from: f */
    public int[] a() {
        int[] copyOf = Arrays.copyOf(this.f15149a, d());
        hc.t.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
