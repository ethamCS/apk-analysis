package kf;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.conscrypt.BuildConfig;
import p000if.j;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lkf/s0;", BuildConfig.FLAVOR, "T", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor$delegate", "Lkotlin/Lazy;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", BuildConfig.FLAVOR, "serialName", "objectInstance", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class s0<T> implements KSerializer<T> {

    /* renamed from: a */
    private final T f15240a;

    /* renamed from: b */
    private List<? extends Annotation> f15241b;

    /* renamed from: c */
    private final Lazy f15242c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a extends hc.v implements gc.a<SerialDescriptor> {

        /* renamed from: c */
        final /* synthetic */ String f15243c;

        /* renamed from: d */
        final /* synthetic */ s0<T> f15244d;

        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "T", "Lif/a;", "Ltb/e0;", "b", "(Lif/a;)V"}, k = 3, mv = {1, 6, 0})
        /* renamed from: kf.s0$a$a */
        /* loaded from: classes3.dex */
        public static final class C0225a extends hc.v implements gc.l<p000if.a, tb.e0> {

            /* renamed from: c */
            final /* synthetic */ s0<T> f15245c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0225a(s0<T> s0Var) {
                super(1);
                this.f15245c = s0Var;
            }

            public final void b(p000if.a aVar) {
                hc.t.e(aVar, "$this$buildSerialDescriptor");
                aVar.h(((s0) this.f15245c).f15241b);
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ tb.e0 invoke(p000if.a aVar) {
                b(aVar);
                return tb.e0.f22152a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, s0<T> s0Var) {
            super(0);
            this.f15243c = str;
            this.f15244d = s0Var;
        }

        /* renamed from: b */
        public final SerialDescriptor invoke() {
            return p000if.h.c(this.f15243c, j.d.f12556a, new SerialDescriptor[0], new C0225a(this.f15244d));
        }
    }

    public s0(String str, T t10) {
        List<? extends Annotation> h10;
        Lazy b10;
        hc.t.e(str, "serialName");
        hc.t.e(t10, "objectInstance");
        this.f15240a = t10;
        h10 = ub.u.h();
        this.f15241b = h10;
        b10 = tb.m.b(tb.o.PUBLICATION, new a(str, this));
        this.f15242c = b10;
    }

    @Override // kotlinx.serialization.b
    public T deserialize(Decoder decoder) {
        hc.t.e(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        jf.c b10 = decoder.b(descriptor);
        int q10 = b10.q(getDescriptor());
        if (q10 == -1) {
            tb.e0 e0Var = tb.e0.f22152a;
            b10.c(descriptor);
            return this.f15240a;
        }
        throw new kotlinx.serialization.i("Unexpected index " + q10);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f15242c.getValue();
    }

    @Override // kotlinx.serialization.j
    public void serialize(Encoder encoder, T t10) {
        hc.t.e(encoder, "encoder");
        hc.t.e(t10, "value");
        encoder.b(getDescriptor()).c(getDescriptor());
    }
}
