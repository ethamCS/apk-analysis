package lf;

import bf.b0;
import hc.k0;
import hc.t;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import p000if.e;
import tb.a0;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Llf/n;", "Lkotlinx/serialization/KSerializer;", "Llf/m;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "b", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class n implements KSerializer<m> {

    /* renamed from: a */
    public static final n f16006a = new n();

    /* renamed from: b */
    private static final SerialDescriptor f16007b = p000if.h.a("kotlinx.serialization.json.JsonLiteral", e.i.f12532a);

    private n() {
    }

    /* renamed from: a */
    public m deserialize(Decoder decoder) {
        t.e(decoder, "decoder");
        JsonElement v10 = i.d(decoder).v();
        if (v10 instanceof m) {
            return (m) v10;
        }
        throw mf.q.e(-1, "Unexpected JSON element, expected JsonLiteral, had " + k0.b(v10.getClass()), v10.toString());
    }

    /* renamed from: b */
    public void serialize(Encoder encoder, m mVar) {
        t.e(encoder, "encoder");
        t.e(mVar, "value");
        i.h(encoder);
        if (mVar.b()) {
            encoder.D(mVar.a());
            return;
        }
        Long k10 = g.k(mVar);
        if (k10 != null) {
            encoder.w(k10.longValue());
            return;
        }
        a0 h10 = b0.h(mVar.a());
        if (h10 != null) {
            encoder.r(BuiltinSerializersKt.serializer(a0.Companion).getDescriptor()).w(h10.j());
            return;
        }
        Double f10 = g.f(mVar);
        if (f10 != null) {
            encoder.h(f10.doubleValue());
            return;
        }
        Boolean c10 = g.c(mVar);
        if (c10 != null) {
            encoder.l(c10.booleanValue());
        } else {
            encoder.D(mVar.a());
        }
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return f16007b;
    }
}
