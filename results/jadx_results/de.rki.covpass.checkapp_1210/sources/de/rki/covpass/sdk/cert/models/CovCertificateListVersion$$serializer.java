package de.rki.covpass.sdk.cert.models;

import hc.t;
import kf.d0;
import kf.h1;
import kf.v;
import kf.x0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.l;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"de/rki/covpass/sdk/cert/models/CovCertificateListVersion.$serializer", "Lkf/v;", "Lde/rki/covpass/sdk/cert/models/CovCertificateListVersion;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class CovCertificateListVersion$$serializer implements v<CovCertificateListVersion> {
    public static final CovCertificateListVersion$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CovCertificateListVersion$$serializer covCertificateListVersion$$serializer = new CovCertificateListVersion$$serializer();
        INSTANCE = covCertificateListVersion$$serializer;
        x0 x0Var = new x0("de.rki.covpass.sdk.cert.models.CovCertificateListVersion", covCertificateListVersion$$serializer, 1);
        x0Var.c("dataModelVersion", true);
        descriptor = x0Var;
    }

    private CovCertificateListVersion$$serializer() {
    }

    @Override // kf.v
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{d0.f15152a};
    }

    @Override // kotlinx.serialization.b
    public CovCertificateListVersion deserialize(Decoder decoder) {
        int i10;
        t.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        jf.c b10 = decoder.b(descriptor2);
        int i11 = 1;
        if (b10.r()) {
            i10 = b10.x(descriptor2, 0);
        } else {
            i10 = 0;
            int i12 = 0;
            while (i11 != 0) {
                int q10 = b10.q(descriptor2);
                if (q10 == -1) {
                    i11 = 0;
                } else if (q10 != 0) {
                    throw new l(q10);
                } else {
                    i10 = b10.x(descriptor2, 0);
                    i12 |= 1;
                }
            }
            i11 = i12;
        }
        b10.c(descriptor2);
        return new CovCertificateListVersion(i11, i10, (h1) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, CovCertificateListVersion covCertificateListVersion) {
        t.e(encoder, "encoder");
        t.e(covCertificateListVersion, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        jf.d b10 = encoder.b(descriptor2);
        CovCertificateListVersion.a(covCertificateListVersion, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // kf.v
    public KSerializer<?>[] typeParametersSerializers() {
        return v.a.a(this);
    }
}
