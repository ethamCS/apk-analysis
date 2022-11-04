package de.rki.covpass.sdk.cert.models;

import hc.t;
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
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"de/rki/covpass/sdk/cert/models/GroupedCertificatesId.$serializer", "Lkf/v;", "Lde/rki/covpass/sdk/cert/models/GroupedCertificatesId;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class GroupedCertificatesId$$serializer implements v<GroupedCertificatesId> {
    public static final GroupedCertificatesId$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        GroupedCertificatesId$$serializer groupedCertificatesId$$serializer = new GroupedCertificatesId$$serializer();
        INSTANCE = groupedCertificatesId$$serializer;
        x0 x0Var = new x0("de.rki.covpass.sdk.cert.models.GroupedCertificatesId", groupedCertificatesId$$serializer, 2);
        x0Var.c("name", false);
        x0Var.c("birthDate", false);
        descriptor = x0Var;
    }

    private GroupedCertificatesId$$serializer() {
    }

    @Override // kf.v
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{Name$$serializer.INSTANCE, k1.f15181a};
    }

    @Override // kotlinx.serialization.b
    public GroupedCertificatesId deserialize(Decoder decoder) {
        int i10;
        String str;
        Object obj;
        t.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        jf.c b10 = decoder.b(descriptor2);
        if (b10.r()) {
            obj = b10.C(descriptor2, 0, Name$$serializer.INSTANCE, null);
            str = b10.k(descriptor2, 1);
            i10 = 3;
        } else {
            obj = null;
            String str2 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int q10 = b10.q(descriptor2);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    obj = b10.C(descriptor2, 0, Name$$serializer.INSTANCE, obj);
                    i11 |= 1;
                } else if (q10 != 1) {
                    throw new l(q10);
                } else {
                    str2 = b10.k(descriptor2, 1);
                    i11 |= 2;
                }
            }
            str = str2;
            i10 = i11;
        }
        b10.c(descriptor2);
        return new GroupedCertificatesId(i10, (Name) obj, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, GroupedCertificatesId groupedCertificatesId) {
        t.e(encoder, "encoder");
        t.e(groupedCertificatesId, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        jf.d b10 = encoder.b(descriptor2);
        GroupedCertificatesId.b(groupedCertificatesId, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // kf.v
    public KSerializer<?>[] typeParametersSerializers() {
        return v.a.a(this);
    }
}
