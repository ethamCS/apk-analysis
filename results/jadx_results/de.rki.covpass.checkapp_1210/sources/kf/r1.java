package kf;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Lkf/r1;", "Lkotlinx/serialization/KSerializer;", "Ltb/c0;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "b", "(Lkotlinx/serialization/encoding/Encoder;S)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)S", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class r1 implements KSerializer<tb.c0> {

    /* renamed from: a */
    public static final r1 f15234a = new r1();

    /* renamed from: b */
    private static final SerialDescriptor f15235b = b0.a("kotlin.UShort", BuiltinSerializersKt.serializer(hc.n0.f11775a));

    private r1() {
    }

    public short a(Decoder decoder) {
        hc.t.e(decoder, "decoder");
        return tb.c0.b(decoder.t(getDescriptor()).B());
    }

    public void b(Encoder encoder, short s10) {
        hc.t.e(encoder, "encoder");
        encoder.r(getDescriptor()).i(s10);
    }

    @Override // kotlinx.serialization.b
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return tb.c0.a(a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return f15235b;
    }

    @Override // kotlinx.serialization.j
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((tb.c0) obj).j());
    }
}