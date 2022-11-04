package kf;

import java.util.Arrays;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lkf/l;", "Lkf/a1;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "requiredCapacity", "Ltb/e0;", "b", "(I)V", BuildConfig.FLAVOR, "c", "e", "(C)V", "f", "()[C", "<set-?>", "position", "I", "d", "()I", "bufferWithData", "<init>", "([C)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class l extends a1<char[]> {

    /* renamed from: a */
    private char[] f15183a;

    /* renamed from: b */
    private int f15184b;

    public l(char[] cArr) {
        hc.t.e(cArr, "bufferWithData");
        this.f15183a = cArr;
        this.f15184b = cArr.length;
        b(10);
    }

    @Override // kf.a1
    public void b(int i10) {
        int b10;
        char[] cArr = this.f15183a;
        if (cArr.length < i10) {
            b10 = nc.m.b(i10, cArr.length * 2);
            char[] copyOf = Arrays.copyOf(cArr, b10);
            hc.t.d(copyOf, "copyOf(this, newSize)");
            this.f15183a = copyOf;
        }
    }

    @Override // kf.a1
    public int d() {
        return this.f15184b;
    }

    public final void e(char c10) {
        a1.c(this, 0, 1, null);
        char[] cArr = this.f15183a;
        int d10 = d();
        this.f15184b = d10 + 1;
        cArr[d10] = c10;
    }

    /* renamed from: f */
    public char[] a() {
        char[] copyOf = Arrays.copyOf(this.f15183a, d());
        hc.t.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
