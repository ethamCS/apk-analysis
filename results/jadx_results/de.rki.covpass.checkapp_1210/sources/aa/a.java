package aa;

import hc.t;
import j$.time.Instant;
import kf.x0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Laa/a;", "Lkotlinx/serialization/KSerializer;", "j$/time/Instant", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a implements KSerializer<Instant> {

    /* renamed from: a */
    public static final a f221a = new a();

    /* renamed from: b */
    public static final /* synthetic */ SerialDescriptor f222b = new x0("java.time.Instant", null, 0);

    private a() {
    }

    /* renamed from: a */
    public Instant deserialize(Decoder decoder) {
        t.e(decoder, "decoder");
        Instant ofEpochSecond = Instant.ofEpochSecond(decoder.h());
        t.d(ofEpochSecond, "ofEpochSecond(decoder.decodeLong())");
        return ofEpochSecond;
    }

    /* renamed from: b */
    public void serialize(Encoder encoder, Instant instant) {
        t.e(encoder, "encoder");
        t.e(instant, "value");
        encoder.w(instant.getEpochSecond());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return f222b;
    }
}
