package lf;

import hc.k0;
import hc.t;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0004H\u0000\u001a\f\u0010\n\u001a\u00020\t*\u00020\u0000H\u0000\u001a\u0016\u0010\u000e\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¨\u0006\u000f"}, d2 = {"Lkotlinx/serialization/encoding/Encoder;", "encoder", "Ltb/e0;", "h", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "g", "Llf/f;", "d", "Llf/j;", "e", "Lkotlin/Function0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "deferred", "f", "kotlinx-serialization-json"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class i {

    @Metadata(bv = {}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\u0012\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"lf/i$a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "n", "name", "k", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p", "q", BuildConfig.FLAVOR, "r", "original$delegate", "Lkotlin/Lazy;", "a", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "original", "l", "()Ljava/lang/String;", "serialName", "Lif/i;", "h", "()Lif/i;", "kind", "m", "()I", "elementsCount", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a implements SerialDescriptor {

        /* renamed from: a */
        private final Lazy f16003a;

        a(gc.a<? extends SerialDescriptor> aVar) {
            Lazy a10;
            a10 = tb.m.a(aVar);
            this.f16003a = a10;
        }

        private final SerialDescriptor a() {
            return (SerialDescriptor) this.f16003a.getValue();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public p000if.i h() {
            return a().h();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean isInline() {
            return SerialDescriptor.a.b(this);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List<Annotation> j() {
            return SerialDescriptor.a.a(this);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int k(String str) {
            t.e(str, "name");
            return a().k(str);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String l() {
            return a().l();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int m() {
            return a().m();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String n(int i10) {
            return a().n(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean o() {
            return SerialDescriptor.a.c(this);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List<Annotation> p(int i10) {
            return a().p(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public SerialDescriptor q(int i10) {
            return a().q(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean r(int i10) {
            return a().r(i10);
        }
    }

    public static final /* synthetic */ void b(Decoder decoder) {
        g(decoder);
    }

    public static final /* synthetic */ void c(Encoder encoder) {
        h(encoder);
    }

    public static final f d(Decoder decoder) {
        t.e(decoder, "<this>");
        f fVar = decoder instanceof f ? (f) decoder : null;
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + k0.b(decoder.getClass()));
    }

    public static final j e(Encoder encoder) {
        t.e(encoder, "<this>");
        j jVar = encoder instanceof j ? (j) encoder : null;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + k0.b(encoder.getClass()));
    }

    public static final SerialDescriptor f(gc.a<? extends SerialDescriptor> aVar) {
        return new a(aVar);
    }

    public static final void g(Decoder decoder) {
        d(decoder);
    }

    public static final void h(Encoder encoder) {
        e(encoder);
    }
}
