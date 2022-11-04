package kf;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lkf/b1;", "Lkf/k0;", BuildConfig.FLAVOR, "serialName", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "primitive", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class b1 extends k0 {

    /* renamed from: c */
    private final String f15148c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(SerialDescriptor serialDescriptor) {
        super(serialDescriptor, null);
        hc.t.e(serialDescriptor, "primitive");
        this.f15148c = serialDescriptor.l() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String l() {
        return this.f15148c;
    }
}
