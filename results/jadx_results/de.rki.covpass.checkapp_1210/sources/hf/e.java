package hf;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¨\u0006\u0007"}, d2 = {BuildConfig.FLAVOR, "expected", BuildConfig.FLAVOR, "foundByte", "Lhf/d;", "a", "b", "kotlinx-serialization-cbor"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e {
    public static final d a(String str, int i10) {
        t.e(str, "expected");
        return new d("Expected " + str + ", but found " + b(i10));
    }

    public static final String b(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0123456789ABCDEF".charAt((i10 >> 4) & 15));
        sb2.append("0123456789ABCDEF".charAt(i10 & 15));
        String sb3 = sb2.toString();
        t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
