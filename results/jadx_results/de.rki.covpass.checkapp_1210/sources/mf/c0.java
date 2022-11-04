package mf;

import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
import ub.y0;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\"\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", BuildConfig.FLAVOR, "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z", "isUnsignedNumber$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "isUnsignedNumber", "kotlinx-serialization-json"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a */
    private static final Set<SerialDescriptor> f16611a;

    static {
        Set<SerialDescriptor> e10;
        e10 = y0.e(BuiltinSerializersKt.serializer(tb.z.Companion).getDescriptor(), BuiltinSerializersKt.serializer(tb.a0.Companion).getDescriptor(), BuiltinSerializersKt.serializer(tb.y.Companion).getDescriptor(), BuiltinSerializersKt.serializer(tb.c0.Companion).getDescriptor());
        f16611a = e10;
    }

    public static final boolean a(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "<this>");
        return serialDescriptor.isInline() && f16611a.contains(serialDescriptor);
    }
}
