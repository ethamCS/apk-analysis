package kf;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0007"}, d2 = {BuildConfig.FLAVOR, "seen", "goldenMask", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Ltb/e0;", "a", "kotlinx-serialization-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class w0 {
    public static final void a(int i10, int i11, SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(serialDescriptor.n(i13));
            }
            i12 >>>= 1;
        }
        throw new kotlinx.serialization.c(arrayList, serialDescriptor.l());
    }
}
