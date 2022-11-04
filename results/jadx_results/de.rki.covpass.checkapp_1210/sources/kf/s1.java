package kf;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J \u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkf/s1;", "Lkotlinx/serialization/KSerializer;", "Ltb/e0;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "b", "(Lkotlinx/serialization/encoding/Encoder;Ltb/e0;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class s1 implements KSerializer<tb.e0> {

    /* renamed from: b */
    public static final s1 f15246b = new s1();

    /* renamed from: a */
    private final /* synthetic */ s0<tb.e0> f15247a = new s0<>("kotlin.Unit", tb.e0.f22152a);

    private s1() {
    }

    public void a(Decoder decoder) {
        hc.t.e(decoder, "decoder");
        this.f15247a.deserialize(decoder);
    }

    /* renamed from: b */
    public void serialize(Encoder encoder, tb.e0 e0Var) {
        hc.t.e(encoder, "encoder");
        hc.t.e(e0Var, "value");
        this.f15247a.serialize(encoder, e0Var);
    }

    @Override // kotlinx.serialization.b
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        a(decoder);
        return tb.e0.f22152a;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return this.f15247a.getDescriptor();
    }
}
