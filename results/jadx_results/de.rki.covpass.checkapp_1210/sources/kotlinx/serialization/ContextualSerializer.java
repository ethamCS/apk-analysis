package kotlinx.serialization;

import hc.t;
import hc.v;
import java.lang.annotation.Annotation;
import java.util.List;
import kf.v0;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.conscrypt.BuildConfig;
import p000if.i;
import tb.e0;
import ub.u;
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030 ¢\u0006\u0004\b!\u0010\"J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006#"}, d2 = {"Lkotlinx/serialization/ContextualSerializer;", BuildConfig.FLAVOR, "T", "Lkotlinx/serialization/KSerializer;", "Lnf/d;", "serializersModule", "serializer", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "b", "Lkotlinx/serialization/KSerializer;", "fallbackSerializer", BuildConfig.FLAVOR, "c", "Ljava/util/List;", "typeArgumentsSerializers", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "d", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Loc/d;", "serializableClass", BuildConfig.FLAVOR, "<init>", "(Loc/d;Lkotlinx/serialization/KSerializer;[Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ContextualSerializer<T> implements KSerializer<T> {

    /* renamed from: a */
    private final oc.d<T> f15584a;

    /* renamed from: b */
    private final KSerializer<T> f15585b;

    /* renamed from: c */
    private final List<KSerializer<?>> f15586c;

    /* renamed from: d */
    private final SerialDescriptor f15587d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "T", "Lif/a;", "Ltb/e0;", "b", "(Lif/a;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a extends v implements gc.l<p000if.a, e0> {

        /* renamed from: c */
        final /* synthetic */ ContextualSerializer<T> f15588c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ContextualSerializer<T> contextualSerializer) {
            super(1);
            this.f15588c = contextualSerializer;
        }

        public final void b(p000if.a aVar) {
            SerialDescriptor descriptor;
            t.e(aVar, "$this$buildSerialDescriptor");
            KSerializer kSerializer = ((ContextualSerializer) this.f15588c).f15585b;
            List<Annotation> j10 = (kSerializer == null || (descriptor = kSerializer.getDescriptor()) == null) ? null : descriptor.j();
            if (j10 == null) {
                j10 = u.h();
            }
            aVar.h(j10);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(p000if.a aVar) {
            b(aVar);
            return e0.f22152a;
        }
    }

    public ContextualSerializer(oc.d<T> dVar, KSerializer<T> kSerializer, KSerializer<?>[] kSerializerArr) {
        List<KSerializer<?>> d10;
        t.e(dVar, "serializableClass");
        t.e(kSerializerArr, "typeArgumentsSerializers");
        this.f15584a = dVar;
        this.f15585b = kSerializer;
        d10 = ub.l.d(kSerializerArr);
        this.f15586c = d10;
        this.f15587d = p000if.b.c(p000if.h.c("kotlinx.serialization.ContextualSerializer", i.a.f12551a, new SerialDescriptor[0], new a(this)), dVar);
    }

    private final KSerializer<T> serializer(nf.d dVar) {
        KSerializer<T> b10 = dVar.b(this.f15584a, this.f15586c);
        if (b10 == null && (b10 = this.f15585b) == null) {
            v0.d(this.f15584a);
            throw new tb.i();
        }
        return b10;
    }

    @Override // kotlinx.serialization.b
    public T deserialize(Decoder decoder) {
        t.e(decoder, "decoder");
        return (T) decoder.y(serializer(decoder.a()));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return this.f15587d;
    }

    @Override // kotlinx.serialization.j
    public void serialize(Encoder encoder, T t10) {
        t.e(encoder, "encoder");
        t.e(t10, "value");
        encoder.e(serializer(encoder.a()), t10);
    }
}
