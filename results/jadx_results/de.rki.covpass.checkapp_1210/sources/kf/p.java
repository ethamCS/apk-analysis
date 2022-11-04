package kf;

import java.util.Arrays;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lkf/p;", "Lkf/a1;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "requiredCapacity", "Ltb/e0;", "b", "(I)V", BuildConfig.FLAVOR, "c", "e", "(D)V", "f", "()[D", "<set-?>", "position", "I", "d", "()I", "bufferWithData", "<init>", "([D)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class p extends a1<double[]> {

    /* renamed from: a */
    private double[] f15217a;

    /* renamed from: b */
    private int f15218b;

    public p(double[] dArr) {
        hc.t.e(dArr, "bufferWithData");
        this.f15217a = dArr;
        this.f15218b = dArr.length;
        b(10);
    }

    @Override // kf.a1
    public void b(int i10) {
        int b10;
        double[] dArr = this.f15217a;
        if (dArr.length < i10) {
            b10 = nc.m.b(i10, dArr.length * 2);
            double[] copyOf = Arrays.copyOf(dArr, b10);
            hc.t.d(copyOf, "copyOf(this, newSize)");
            this.f15217a = copyOf;
        }
    }

    @Override // kf.a1
    public int d() {
        return this.f15218b;
    }

    public final void e(double d10) {
        a1.c(this, 0, 1, null);
        double[] dArr = this.f15217a;
        int d11 = d();
        this.f15218b = d11 + 1;
        dArr[d11] = d10;
    }

    /* renamed from: f */
    public double[] a() {
        double[] copyOf = Arrays.copyOf(this.f15217a, d());
        hc.t.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
