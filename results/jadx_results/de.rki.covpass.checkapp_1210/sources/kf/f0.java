package kf;

import jf.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B%\b\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0007\u001a\u00028\u00022\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H$¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00028\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u00028\u0000*\u00028\u00028$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u00028\u0001*\u00028\u00028$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013\u0082\u0001\u0002\u0019\u001a¨\u0006\u001b"}, d2 = {"Lkf/f0;", "K", "V", "R", "Lkotlinx/serialization/KSerializer;", "key", "value", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "Ltb/e0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "Lkf/n0;", "Lkf/t0;", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class f0<K, V, R> implements KSerializer<R> {

    /* renamed from: a */
    private final KSerializer<K> f15158a;

    /* renamed from: b */
    private final KSerializer<V> f15159b;

    private f0(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        this.f15158a = kSerializer;
        this.f15159b = kSerializer2;
    }

    public /* synthetic */ f0(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    protected abstract K a(R r10);

    protected abstract V b(R r10);

    protected abstract R c(K k10, V v10);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.b
    public R deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        hc.t.e(decoder, "decoder");
        jf.c b10 = decoder.b(getDescriptor());
        if (b10.r()) {
            return (R) c(c.b.c(b10, getDescriptor(), 0, this.f15158a, null, 8, null), c.b.c(b10, getDescriptor(), 1, this.f15159b, null, 8, null));
        }
        obj = n1.f15210a;
        obj2 = n1.f15210a;
        Object obj5 = obj2;
        while (true) {
            int q10 = b10.q(getDescriptor());
            if (q10 == -1) {
                b10.c(getDescriptor());
                obj3 = n1.f15210a;
                if (obj == obj3) {
                    throw new kotlinx.serialization.i("Element 'key' is missing");
                }
                obj4 = n1.f15210a;
                if (obj5 == obj4) {
                    throw new kotlinx.serialization.i("Element 'value' is missing");
                }
                return (R) c(obj, obj5);
            } else if (q10 == 0) {
                obj = c.b.c(b10, getDescriptor(), 0, this.f15158a, null, 8, null);
            } else if (q10 != 1) {
                throw new kotlinx.serialization.i("Invalid index: " + q10);
            } else {
                obj5 = c.b.c(b10, getDescriptor(), 1, this.f15159b, null, 8, null);
            }
        }
    }

    @Override // kotlinx.serialization.j
    public void serialize(Encoder encoder, R r10) {
        hc.t.e(encoder, "encoder");
        jf.d b10 = encoder.b(getDescriptor());
        b10.t(getDescriptor(), 0, this.f15158a, a(r10));
        b10.t(getDescriptor(), 1, this.f15159b, b(r10));
        b10.c(getDescriptor());
    }
}
