package kf;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.conscrypt.BuildConfig;
import p000if.e;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lkf/j;", "Lkotlinx/serialization/KSerializer;", BuildConfig.FLAVOR, "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "b", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Byte;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class j implements KSerializer<Byte> {

    /* renamed from: a */
    public static final j f15174a = new j();

    /* renamed from: b */
    private static final SerialDescriptor f15175b = new d1("kotlin.Byte", e.b.f12525a);

    private j() {
    }

    /* renamed from: a */
    public Byte deserialize(Decoder decoder) {
        hc.t.e(decoder, "decoder");
        return Byte.valueOf(decoder.z());
    }

    public void b(Encoder encoder, byte b10) {
        hc.t.e(encoder, "encoder");
        encoder.k(b10);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return f15175b;
    }

    @Override // kotlinx.serialization.j
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((Number) obj).byteValue());
    }
}
