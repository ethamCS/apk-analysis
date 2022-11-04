package kf;

import java.util.Arrays;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lkf/t;", "Lkf/a1;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "requiredCapacity", "Ltb/e0;", "b", "(I)V", BuildConfig.FLAVOR, "c", "e", "(F)V", "f", "()[F", "<set-?>", "position", "I", "d", "()I", "bufferWithData", "<init>", "([F)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class t extends a1<float[]> {

    /* renamed from: a */
    private float[] f15248a;

    /* renamed from: b */
    private int f15249b;

    public t(float[] fArr) {
        hc.t.e(fArr, "bufferWithData");
        this.f15248a = fArr;
        this.f15249b = fArr.length;
        b(10);
    }

    @Override // kf.a1
    public void b(int i10) {
        int b10;
        float[] fArr = this.f15248a;
        if (fArr.length < i10) {
            b10 = nc.m.b(i10, fArr.length * 2);
            float[] copyOf = Arrays.copyOf(fArr, b10);
            hc.t.d(copyOf, "copyOf(this, newSize)");
            this.f15248a = copyOf;
        }
    }

    @Override // kf.a1
    public int d() {
        return this.f15249b;
    }

    public final void e(float f10) {
        a1.c(this, 0, 1, null);
        float[] fArr = this.f15248a;
        int d10 = d();
        this.f15249b = d10 + 1;
        fArr[d10] = f10;
    }

    /* renamed from: f */
    public float[] a() {
        float[] copyOf = Arrays.copyOf(this.f15248a, d());
        hc.t.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
