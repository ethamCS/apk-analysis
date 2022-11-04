package de.rki.covpass.sdk.rules.remote.valuesets;

import hc.k0;
import hc.t;
import j$.time.LocalDate;
import jf.c;
import jf.d;
import kf.k1;
import kf.v;
import kf.x0;
import kotlin.Metadata;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.l;
import lf.h;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"de/rki/covpass/sdk/rules/remote/valuesets/CovPassValueSetRemote.$serializer", "Lkf/v;", "Lde/rki/covpass/sdk/rules/remote/valuesets/CovPassValueSetRemote;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class CovPassValueSetRemote$$serializer implements v<CovPassValueSetRemote> {
    public static final CovPassValueSetRemote$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CovPassValueSetRemote$$serializer covPassValueSetRemote$$serializer = new CovPassValueSetRemote$$serializer();
        INSTANCE = covPassValueSetRemote$$serializer;
        x0 x0Var = new x0("de.rki.covpass.sdk.rules.remote.valuesets.CovPassValueSetRemote", covPassValueSetRemote$$serializer, 3);
        x0Var.c("valueSetId", false);
        x0Var.c("valueSetDate", false);
        x0Var.c("valueSetValues", false);
        descriptor = x0Var;
    }

    private CovPassValueSetRemote$$serializer() {
    }

    @Override // kf.v
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{k1.f15181a, new ContextualSerializer(k0.b(LocalDate.class), null, new KSerializer[0]), h.f15995a};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r5v1 */
    @Override // kotlinx.serialization.b
    public CovPassValueSetRemote deserialize(Decoder decoder) {
        String str;
        int i10;
        Object obj;
        Object obj2;
        t.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.r()) {
            String k10 = b10.k(descriptor2, 0);
            obj = b10.C(descriptor2, 1, new ContextualSerializer(k0.b(LocalDate.class), null, new KSerializer[0]), null);
            obj2 = b10.C(descriptor2, 2, h.f15995a, null);
            str = k10;
            i10 = 7;
        } else {
            String str2 = null;
            Object obj3 = null;
            Object obj4 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int q10 = b10.q(descriptor2);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    str2 = b10.k(descriptor2, 0);
                    i11 |= 1;
                } else if (q10 == 1) {
                    obj4 = b10.C(descriptor2, 1, new ContextualSerializer(k0.b(LocalDate.class), null, new KSerializer[0]), obj4);
                    i11 |= 2;
                } else if (q10 != 2) {
                    throw new l(q10);
                } else {
                    obj3 = b10.C(descriptor2, 2, h.f15995a, obj3);
                    i11 |= 4;
                }
            }
            str = str2;
            obj2 = obj3;
            i10 = i11;
            obj = obj4;
        }
        b10.c(descriptor2);
        return new CovPassValueSetRemote(i10, str, obj, obj2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, CovPassValueSetRemote covPassValueSetRemote) {
        t.e(encoder, "encoder");
        t.e(covPassValueSetRemote, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b10 = encoder.b(descriptor2);
        CovPassValueSetRemote.d(covPassValueSetRemote, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // kf.v
    public KSerializer<?>[] typeParametersSerializers() {
        return v.a.a(this);
    }
}
