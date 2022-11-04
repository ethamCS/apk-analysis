package de.rki.covpass.sdk.rules.booster.remote;

import hc.t;
import jf.c;
import jf.d;
import kf.k1;
import kf.v;
import kf.x0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.l;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"de/rki/covpass/sdk/rules/booster/remote/BoosterDescriptionRemote.$serializer", "Lkf/v;", "Lde/rki/covpass/sdk/rules/booster/remote/BoosterDescriptionRemote;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class BoosterDescriptionRemote$$serializer implements v<BoosterDescriptionRemote> {
    public static final BoosterDescriptionRemote$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        BoosterDescriptionRemote$$serializer boosterDescriptionRemote$$serializer = new BoosterDescriptionRemote$$serializer();
        INSTANCE = boosterDescriptionRemote$$serializer;
        x0 x0Var = new x0("de.rki.covpass.sdk.rules.booster.remote.BoosterDescriptionRemote", boosterDescriptionRemote$$serializer, 2);
        x0Var.c("lang", false);
        x0Var.c("desc", false);
        descriptor = x0Var;
    }

    private BoosterDescriptionRemote$$serializer() {
    }

    @Override // kf.v
    public KSerializer<?>[] childSerializers() {
        k1 k1Var = k1.f15181a;
        return new KSerializer[]{k1Var, k1Var};
    }

    @Override // kotlinx.serialization.b
    public BoosterDescriptionRemote deserialize(Decoder decoder) {
        int i10;
        String str;
        String str2;
        t.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.r()) {
            str2 = b10.k(descriptor2, 0);
            str = b10.k(descriptor2, 1);
            i10 = 3;
        } else {
            str2 = null;
            String str3 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int q10 = b10.q(descriptor2);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    str2 = b10.k(descriptor2, 0);
                    i11 |= 1;
                } else if (q10 != 1) {
                    throw new l(q10);
                } else {
                    str3 = b10.k(descriptor2, 1);
                    i11 |= 2;
                }
            }
            str = str3;
            i10 = i11;
        }
        b10.c(descriptor2);
        return new BoosterDescriptionRemote(i10, str2, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, BoosterDescriptionRemote boosterDescriptionRemote) {
        t.e(encoder, "encoder");
        t.e(boosterDescriptionRemote, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b10 = encoder.b(descriptor2);
        BoosterDescriptionRemote.c(boosterDescriptionRemote, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // kf.v
    public KSerializer<?>[] typeParametersSerializers() {
        return v.a.a(this);
    }
}
