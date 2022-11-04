package kf;

import kf.v;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0000¨\u0006\u0007"}, d2 = {"T", BuildConfig.FLAVOR, "name", "Lkotlinx/serialization/KSerializer;", "primitiveSerializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "kotlinx-serialization-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class b0 {

    @Metadata(bv = {}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"kf/b0$a", "Lkf/v;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a implements v<T> {

        /* renamed from: a */
        final /* synthetic */ KSerializer<T> f15147a;

        a(KSerializer<T> kSerializer) {
            this.f15147a = kSerializer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kf.v
        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{this.f15147a};
        }

        @Override // kotlinx.serialization.b
        public T deserialize(Decoder decoder) {
            hc.t.e(decoder, "decoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
        public SerialDescriptor getDescriptor() {
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // kotlinx.serialization.j
        public void serialize(Encoder encoder, T t10) {
            hc.t.e(encoder, "encoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // kf.v
        public KSerializer<?>[] typeParametersSerializers() {
            return v.a.a(this);
        }
    }

    public static final <T> SerialDescriptor a(String str, KSerializer<T> kSerializer) {
        hc.t.e(str, "name");
        hc.t.e(kSerializer, "primitiveSerializer");
        return new a0(str, new a(kSerializer));
    }
}
