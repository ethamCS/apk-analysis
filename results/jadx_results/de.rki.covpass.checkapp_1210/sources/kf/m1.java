package kf;

import jf.c;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u0004B1\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\"\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J*\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0016J\"\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lkf/m1;", "A", "B", "C", "Lkotlinx/serialization/KSerializer;", "Ltb/w;", "Ljf/c;", "composite", "d", "e", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "g", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "f", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "aSerializer", "bSerializer", "cSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class m1<A, B, C> implements KSerializer<tb.w<? extends A, ? extends B, ? extends C>> {

    /* renamed from: a */
    private final KSerializer<A> f15199a;

    /* renamed from: b */
    private final KSerializer<B> f15200b;

    /* renamed from: c */
    private final KSerializer<C> f15201c;

    /* renamed from: d */
    private final SerialDescriptor f15202d = p000if.h.b("kotlin.Triple", new SerialDescriptor[0], new a(this));

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"A", "B", "C", "Lif/a;", "Ltb/e0;", "b", "(Lif/a;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a extends hc.v implements gc.l<p000if.a, tb.e0> {

        /* renamed from: c */
        final /* synthetic */ m1<A, B, C> f15203c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m1<A, B, C> m1Var) {
            super(1);
            this.f15203c = m1Var;
        }

        public final void b(p000if.a aVar) {
            hc.t.e(aVar, "$this$buildClassSerialDescriptor");
            p000if.a.b(aVar, "first", ((m1) this.f15203c).f15199a.getDescriptor(), null, false, 12, null);
            p000if.a.b(aVar, "second", ((m1) this.f15203c).f15200b.getDescriptor(), null, false, 12, null);
            p000if.a.b(aVar, "third", ((m1) this.f15203c).f15201c.getDescriptor(), null, false, 12, null);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(p000if.a aVar) {
            b(aVar);
            return tb.e0.f22152a;
        }
    }

    public m1(KSerializer<A> kSerializer, KSerializer<B> kSerializer2, KSerializer<C> kSerializer3) {
        hc.t.e(kSerializer, "aSerializer");
        hc.t.e(kSerializer2, "bSerializer");
        hc.t.e(kSerializer3, "cSerializer");
        this.f15199a = kSerializer;
        this.f15200b = kSerializer2;
        this.f15201c = kSerializer3;
    }

    private final tb.w<A, B, C> d(jf.c cVar) {
        Object c10 = c.b.c(cVar, getDescriptor(), 0, this.f15199a, null, 8, null);
        Object c11 = c.b.c(cVar, getDescriptor(), 1, this.f15200b, null, 8, null);
        Object c12 = c.b.c(cVar, getDescriptor(), 2, this.f15201c, null, 8, null);
        cVar.c(getDescriptor());
        return new tb.w<>(c10, c11, c12);
    }

    private final tb.w<A, B, C> e(jf.c cVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        obj = n1.f15210a;
        obj2 = n1.f15210a;
        obj3 = n1.f15210a;
        while (true) {
            int q10 = cVar.q(getDescriptor());
            if (q10 == -1) {
                cVar.c(getDescriptor());
                obj4 = n1.f15210a;
                if (obj == obj4) {
                    throw new kotlinx.serialization.i("Element 'first' is missing");
                }
                obj5 = n1.f15210a;
                if (obj2 == obj5) {
                    throw new kotlinx.serialization.i("Element 'second' is missing");
                }
                obj6 = n1.f15210a;
                if (obj3 == obj6) {
                    throw new kotlinx.serialization.i("Element 'third' is missing");
                }
                return new tb.w<>(obj, obj2, obj3);
            } else if (q10 == 0) {
                obj = c.b.c(cVar, getDescriptor(), 0, this.f15199a, null, 8, null);
            } else if (q10 == 1) {
                obj2 = c.b.c(cVar, getDescriptor(), 1, this.f15200b, null, 8, null);
            } else if (q10 != 2) {
                throw new kotlinx.serialization.i("Unexpected index " + q10);
            } else {
                obj3 = c.b.c(cVar, getDescriptor(), 2, this.f15201c, null, 8, null);
            }
        }
    }

    /* renamed from: f */
    public tb.w<A, B, C> deserialize(Decoder decoder) {
        hc.t.e(decoder, "decoder");
        jf.c b10 = decoder.b(getDescriptor());
        return b10.r() ? d(b10) : e(b10);
    }

    /* renamed from: g */
    public void serialize(Encoder encoder, tb.w<? extends A, ? extends B, ? extends C> wVar) {
        hc.t.e(encoder, "encoder");
        hc.t.e(wVar, "value");
        jf.d b10 = encoder.b(getDescriptor());
        b10.t(getDescriptor(), 0, this.f15199a, wVar.f());
        b10.t(getDescriptor(), 1, this.f15200b, wVar.g());
        b10.t(getDescriptor(), 2, this.f15201c, wVar.h());
        b10.c(getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return this.f15202d;
    }
}
