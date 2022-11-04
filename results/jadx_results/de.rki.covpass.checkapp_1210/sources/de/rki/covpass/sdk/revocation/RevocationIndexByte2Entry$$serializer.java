package de.rki.covpass.sdk.revocation;

import hc.t;
import jf.c;
import jf.d;
import kf.d0;
import kf.m0;
import kf.v;
import kf.x0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.l;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"de/rki/covpass/sdk/revocation/RevocationIndexByte2Entry.$serializer", "Lkf/v;", "Lde/rki/covpass/sdk/revocation/RevocationIndexByte2Entry;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class RevocationIndexByte2Entry$$serializer implements v<RevocationIndexByte2Entry> {
    public static final RevocationIndexByte2Entry$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        RevocationIndexByte2Entry$$serializer revocationIndexByte2Entry$$serializer = new RevocationIndexByte2Entry$$serializer();
        INSTANCE = revocationIndexByte2Entry$$serializer;
        x0 x0Var = new x0("de.rki.covpass.sdk.revocation.RevocationIndexByte2Entry", revocationIndexByte2Entry$$serializer, 2);
        x0Var.c("timestamp", false);
        x0Var.c("num", false);
        descriptor = x0Var;
    }

    private RevocationIndexByte2Entry$$serializer() {
    }

    @Override // kf.v
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.p(m0.f15197a), BuiltinSerializersKt.p(d0.f15152a)};
    }

    @Override // kotlinx.serialization.b
    public RevocationIndexByte2Entry deserialize(Decoder decoder) {
        int i10;
        Object obj;
        Object obj2;
        t.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.r()) {
            obj2 = b10.m(descriptor2, 0, m0.f15197a, null);
            obj = b10.m(descriptor2, 1, d0.f15152a, null);
            i10 = 3;
        } else {
            obj2 = null;
            Object obj3 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int q10 = b10.q(descriptor2);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    obj2 = b10.m(descriptor2, 0, m0.f15197a, obj2);
                    i11 |= 1;
                } else if (q10 != 1) {
                    throw new l(q10);
                } else {
                    obj3 = b10.m(descriptor2, 1, d0.f15152a, obj3);
                    i11 |= 2;
                }
            }
            obj = obj3;
            i10 = i11;
        }
        b10.c(descriptor2);
        return new RevocationIndexByte2Entry(i10, (Long) obj2, (Integer) obj, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, RevocationIndexByte2Entry revocationIndexByte2Entry) {
        t.e(encoder, "encoder");
        t.e(revocationIndexByte2Entry, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b10 = encoder.b(descriptor2);
        RevocationIndexByte2Entry.b(revocationIndexByte2Entry, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // kf.v
    public KSerializer<?>[] typeParametersSerializers() {
        return v.a.a(this);
    }
}
