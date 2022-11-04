package kf;

import java.lang.Enum;
import java.util.Arrays;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.conscrypt.BuildConfig;
import p000if.i;
import p000if.j;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0001\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lkf/s;", BuildConfig.FLAVOR, "T", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "c", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Enum;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Enum;", BuildConfig.FLAVOR, "toString", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialName", BuildConfig.FLAVOR, "values", "<init>", "(Ljava/lang/String;[Ljava/lang/Enum;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class s<T extends Enum<T>> implements KSerializer<T> {

    /* renamed from: a */
    private final T[] f15236a;

    /* renamed from: b */
    private final SerialDescriptor f15237b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "T", "Lif/a;", "Ltb/e0;", "b", "(Lif/a;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a extends hc.v implements gc.l<p000if.a, tb.e0> {

        /* renamed from: c */
        final /* synthetic */ s<T> f15238c;

        /* renamed from: d */
        final /* synthetic */ String f15239d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s<T> sVar, String str) {
            super(1);
            this.f15238c = sVar;
            this.f15239d = str;
        }

        public final void b(p000if.a aVar) {
            hc.t.e(aVar, "$this$buildSerialDescriptor");
            Enum[] enumArr = ((s) this.f15238c).f15236a;
            String str = this.f15239d;
            for (Enum r22 : enumArr) {
                p000if.a.b(aVar, r22.name(), p000if.h.d(str + '.' + r22.name(), j.d.f12556a, new SerialDescriptor[0], null, 8, null), null, false, 12, null);
            }
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(p000if.a aVar) {
            b(aVar);
            return tb.e0.f22152a;
        }
    }

    public s(String str, T[] tArr) {
        hc.t.e(str, "serialName");
        hc.t.e(tArr, "values");
        this.f15236a = tArr;
        this.f15237b = p000if.h.c(str, i.b.f12552a, new SerialDescriptor[0], new a(this, str));
    }

    /* renamed from: b */
    public T deserialize(Decoder decoder) {
        hc.t.e(decoder, "decoder");
        int p10 = decoder.p(getDescriptor());
        boolean z10 = false;
        if (p10 >= 0 && p10 < this.f15236a.length) {
            z10 = true;
        }
        if (z10) {
            return this.f15236a[p10];
        }
        throw new kotlinx.serialization.i(p10 + " is not among valid " + getDescriptor().l() + " enum values, values size is " + this.f15236a.length);
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, T t10) {
        int I;
        hc.t.e(encoder, "encoder");
        hc.t.e(t10, "value");
        I = ub.m.I(this.f15236a, t10);
        if (I != -1) {
            encoder.o(getDescriptor(), I);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(t10);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().l());
        sb2.append(", must be one of ");
        String arrays = Arrays.toString(this.f15236a);
        hc.t.d(arrays, "toString(this)");
        sb2.append(arrays);
        throw new kotlinx.serialization.i(sb2.toString());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return this.f15237b;
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().l() + '>';
    }
}
