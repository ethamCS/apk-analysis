package kf;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", BuildConfig.FLAVOR, "typeParams", BuildConfig.FLAVOR, "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;[Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "kotlinx-serialization-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class y0 {
    public static final int a(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        hc.t.e(serialDescriptor, "<this>");
        hc.t.e(serialDescriptorArr, "typeParams");
        int hashCode = (serialDescriptor.l().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        Iterable<SerialDescriptor> a10 = p000if.g.a(serialDescriptor);
        Iterator<SerialDescriptor> it = a10.iterator();
        int i10 = 1;
        int i11 = 1;
        while (true) {
            int i12 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i13 = i11 * 31;
            String l10 = it.next().l();
            if (l10 != null) {
                i12 = l10.hashCode();
            }
            i11 = i13 + i12;
        }
        for (SerialDescriptor serialDescriptor2 : a10) {
            int i14 = i10 * 31;
            p000if.i h10 = serialDescriptor2.h();
            i10 = i14 + (h10 != null ? h10.hashCode() : 0);
        }
        return (((hashCode * 31) + i11) * 31) + i10;
    }
}
