package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import org.conscrypt.BuildConfig;
/* loaded from: classes2.dex */
public final class Collectors {

    /* renamed from: a */
    static final Set f13430a = Collections.emptySet();

    static {
        EnumC0560i enumC0560i = EnumC0560i.CONCURRENT;
        EnumC0560i enumC0560i2 = EnumC0560i.UNORDERED;
        EnumC0560i enumC0560i3 = EnumC0560i.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC0560i, enumC0560i2, enumC0560i3));
        Collections.unmodifiableSet(EnumSet.of(enumC0560i, enumC0560i2));
        Collections.unmodifiableSet(EnumSet.of(enumC0560i3));
        Collections.unmodifiableSet(EnumSet.of(enumC0560i2, enumC0560i3));
    }

    public static double a(double[] dArr) {
        double d10 = dArr[0] + dArr[1];
        double d11 = dArr[dArr.length - 1];
        return (!Double.isNaN(d10) || !Double.isInfinite(d11)) ? d10 : d11;
    }

    public static double[] b(double[] dArr, double d10) {
        double d11 = d10 - dArr[1];
        double d12 = dArr[0];
        double d13 = d12 + d11;
        dArr[1] = (d13 - d12) - d11;
        dArr[0] = d13;
        return dArr;
    }

    public static Collector<CharSequence, ?, String> joining(final CharSequence charSequence) {
        return new C0585n(new j$.util.function.I() { // from class: j$.util.stream.k

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ CharSequence f13711b = BuildConfig.FLAVOR;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ CharSequence f13712c = BuildConfig.FLAVOR;

            @Override // j$.util.function.I
            public final Object get() {
                CharSequence charSequence2 = charSequence;
                CharSequence charSequence3 = this.f13711b;
                CharSequence charSequence4 = this.f13712c;
                Set set = Collectors.f13430a;
                return new j$.util.V(charSequence2, charSequence3, charSequence4);
            }
        }, f13430a);
    }
}
