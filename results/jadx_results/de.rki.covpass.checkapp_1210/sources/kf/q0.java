package kf;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0006\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014¨\u0006\u0010"}, d2 = {"Lkf/q0;", "Lkf/l1;", BuildConfig.FLAVOR, "Lkotlinx/serialization/descriptors/SerialDescriptor;", BuildConfig.FLAVOR, "index", "a0", "nestedName", "b0", "desc", "Z", "parentName", "childName", "Y", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class q0 extends l1<String> {
    protected abstract String Y(String str, String str2);

    protected abstract String Z(SerialDescriptor serialDescriptor, int i10);

    /* renamed from: a0 */
    public final String U(SerialDescriptor serialDescriptor, int i10) {
        hc.t.e(serialDescriptor, "<this>");
        return b0(Z(serialDescriptor, i10));
    }

    protected final String b0(String str) {
        hc.t.e(str, "nestedName");
        String T = T();
        if (T == null) {
            T = BuildConfig.FLAVOR;
        }
        return Y(T, str);
    }
}
