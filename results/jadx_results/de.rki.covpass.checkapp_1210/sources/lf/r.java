package lf;

import hc.k0;
import hc.t;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;
import p000if.e;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Llf/r;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "b", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class r implements KSerializer<JsonPrimitive> {

    /* renamed from: a */
    public static final r f16015a = new r();

    /* renamed from: b */
    private static final SerialDescriptor f16016b = p000if.h.d("kotlinx.serialization.json.JsonPrimitive", e.i.f12532a, new SerialDescriptor[0], null, 8, null);

    private r() {
    }

    /* renamed from: a */
    public JsonPrimitive deserialize(Decoder decoder) {
        t.e(decoder, "decoder");
        JsonElement v10 = i.d(decoder).v();
        if (v10 instanceof JsonPrimitive) {
            return (JsonPrimitive) v10;
        }
        throw mf.q.e(-1, "Unexpected JSON element, expected JsonPrimitive, had " + k0.b(v10.getClass()), v10.toString());
    }

    /* renamed from: b */
    public void serialize(Encoder encoder, JsonPrimitive jsonPrimitive) {
        t.e(encoder, "encoder");
        t.e(jsonPrimitive, "value");
        i.h(encoder);
        if (jsonPrimitive instanceof JsonNull) {
            encoder.e(p.f16008a, JsonNull.f15603a);
        } else {
            encoder.e(n.f16006a, (m) jsonPrimitive);
        }
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return f16016b;
    }
}
