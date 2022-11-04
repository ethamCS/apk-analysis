package kf;

import java.util.Iterator;
import kf.a1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0017\b\u0000\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,¢\u0006\u0004\b.\u0010/J\u0013\u0010\u0007\u001a\u00020\u0006*\u00028\u0002H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00028\u0001*\u00028\u0002H\u0004¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f*\u00028\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f*\u00028\u0001H\u0004¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\f*\u00028\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00028\u0002H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00028\u0001H$¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\u0006H$¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001f2\u0006\u0010 \u001a\u00028\u0001¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00028\u00012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u00060"}, d2 = {"Lkf/c1;", "Element", "Array", "Lkf/a1;", "Builder", "Lkf/n;", BuildConfig.FLAVOR, "p", "(Lkf/a1;)I", "t", "(Lkf/a1;)Ljava/lang/Object;", "size", "Ltb/e0;", "q", "(Lkf/a1;I)V", BuildConfig.FLAVOR, "d", "(Ljava/lang/Object;)Ljava/util/Iterator;", "index", "element", "s", "(Lkf/a1;ILjava/lang/Object;)V", "o", "()Lkf/a1;", "r", "()Ljava/lang/Object;", "Ljf/d;", "encoder", "content", "u", "(Ljf/d;Ljava/lang/Object;I)V", "Lkotlinx/serialization/encoding/Encoder;", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/KSerializer;", "primitiveSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class c1<Element, Array, Builder extends a1<Array>> extends n<Element, Array, Builder> {

    /* renamed from: b */
    private final SerialDescriptor f15151b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(KSerializer<Element> kSerializer) {
        super(kSerializer, null);
        hc.t.e(kSerializer, "primitiveSerializer");
        this.f15151b = new b1(kSerializer.getDescriptor());
    }

    @Override // kf.a
    public final Iterator<Element> d(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // kf.a, kotlinx.serialization.b
    public final Array deserialize(Decoder decoder) {
        hc.t.e(decoder, "decoder");
        return f(decoder, null);
    }

    @Override // kf.n, kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public final SerialDescriptor getDescriptor() {
        return this.f15151b;
    }

    /* renamed from: o */
    public final Builder a() {
        return (Builder) k(r());
    }

    /* renamed from: p */
    public final int b(Builder builder) {
        hc.t.e(builder, "<this>");
        return builder.d();
    }

    /* renamed from: q */
    public final void c(Builder builder, int i10) {
        hc.t.e(builder, "<this>");
        builder.b(i10);
    }

    protected abstract Array r();

    /* renamed from: s */
    public final void n(Builder builder, int i10, Element element) {
        hc.t.e(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    @Override // kf.n, kotlinx.serialization.j
    public final void serialize(Encoder encoder, Array array) {
        hc.t.e(encoder, "encoder");
        int e10 = e(array);
        SerialDescriptor serialDescriptor = this.f15151b;
        jf.d j10 = encoder.j(serialDescriptor, e10);
        u(j10, array, e10);
        j10.c(serialDescriptor);
    }

    /* renamed from: t */
    public final Array l(Builder builder) {
        hc.t.e(builder, "<this>");
        return (Array) builder.a();
    }

    protected abstract void u(jf.d dVar, Array array, int i10);
}
