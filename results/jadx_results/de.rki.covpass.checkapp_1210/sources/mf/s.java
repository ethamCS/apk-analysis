package mf;

import java.util.Arrays;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
import p000if.j;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\u000eH\u0016¨\u0006\u0013"}, d2 = {"Lmf/s;", BuildConfig.FLAVOR, "Ltb/e0;", "e", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "sd", "c", BuildConfig.FLAVOR, "index", "g", "key", "f", "d", "b", BuildConfig.FLAVOR, "a", "toString", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a */
    private Object[] f16637a = new Object[8];

    /* renamed from: b */
    private int[] f16638b;

    /* renamed from: c */
    private int f16639c;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmf/s$a;", BuildConfig.FLAVOR, "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f16640a = new a();

        private a() {
        }
    }

    public s() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.f16638b = iArr;
        this.f16639c = -1;
    }

    private final void e() {
        int i10 = this.f16639c * 2;
        Object[] copyOf = Arrays.copyOf(this.f16637a, i10);
        hc.t.d(copyOf, "copyOf(this, newSize)");
        this.f16637a = copyOf;
        int[] copyOf2 = Arrays.copyOf(this.f16638b, i10);
        hc.t.d(copyOf2, "copyOf(this, newSize)");
        this.f16638b = copyOf2;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i10 = this.f16639c + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.f16637a[i11];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!hc.t.a(serialDescriptor.h(), j.b.f12554a)) {
                    int i12 = this.f16638b[i11];
                    if (i12 >= 0) {
                        sb2.append(".");
                        sb2.append(serialDescriptor.n(i12));
                    }
                } else if (this.f16638b[i11] != -1) {
                    sb2.append("[");
                    sb2.append(this.f16638b[i11]);
                    sb2.append("]");
                }
            } else if (obj != a.f16640a) {
                sb2.append("[");
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append("]");
            }
        }
        String sb3 = sb2.toString();
        hc.t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final void b() {
        int i10 = this.f16639c;
        int[] iArr = this.f16638b;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            this.f16639c = i10 - 1;
        }
        int i11 = this.f16639c;
        if (i11 != -1) {
            this.f16639c = i11 - 1;
        }
    }

    public final void c(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "sd");
        int i10 = this.f16639c + 1;
        this.f16639c = i10;
        if (i10 == this.f16637a.length) {
            e();
        }
        this.f16637a[i10] = serialDescriptor;
    }

    public final void d() {
        int[] iArr = this.f16638b;
        int i10 = this.f16639c;
        if (iArr[i10] == -2) {
            this.f16637a[i10] = a.f16640a;
        }
    }

    public final void f(Object obj) {
        int[] iArr = this.f16638b;
        int i10 = this.f16639c;
        if (iArr[i10] != -2) {
            int i11 = i10 + 1;
            this.f16639c = i11;
            if (i11 == this.f16637a.length) {
                e();
            }
        }
        Object[] objArr = this.f16637a;
        int i12 = this.f16639c;
        objArr[i12] = obj;
        this.f16638b[i12] = -2;
    }

    public final void g(int i10) {
        this.f16638b[this.f16639c] = i10;
    }

    public String toString() {
        return a();
    }
}
