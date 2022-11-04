package de.rki.covpass.sdk.cert.models;

import hc.t;
import kf.k1;
import kf.m0;
import kf.s;
import kf.v;
import kf.x0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.l;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"de/rki/covpass/sdk/cert/models/CombinedCovCertificateLocal.$serializer", "Lkf/v;", "Lde/rki/covpass/sdk/cert/models/CombinedCovCertificateLocal;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class CombinedCovCertificateLocal$$serializer implements v<CombinedCovCertificateLocal> {
    public static final CombinedCovCertificateLocal$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CombinedCovCertificateLocal$$serializer combinedCovCertificateLocal$$serializer = new CombinedCovCertificateLocal$$serializer();
        INSTANCE = combinedCovCertificateLocal$$serializer;
        x0 x0Var = new x0("de.rki.covpass.sdk.cert.models.CombinedCovCertificateLocal", combinedCovCertificateLocal$$serializer, 14);
        x0Var.c("vaccinationCertificate", false);
        x0Var.c("vaccinationQrContent", false);
        x0Var.c("certificateTimestamp", true);
        x0Var.c("hasSeenBoosterNotification", true);
        x0Var.c("hasSeenBoosterDetailNotification", true);
        x0Var.c("hasSeenExpiryNotification", true);
        x0Var.c("boosterNotificationRuleIds", true);
        x0Var.c("hasSeenReissueNotification", true);
        x0Var.c("hasSeenExpiredReissueNotification", true);
        x0Var.c("hasSeenReissueDetailNotification", true);
        x0Var.c("hasSeenRevokedNotification", true);
        x0Var.c("isRevoked", true);
        x0Var.c("reissueState", true);
        x0Var.c("reissueType", true);
        descriptor = x0Var;
    }

    private CombinedCovCertificateLocal$$serializer() {
    }

    @Override // kf.v
    public KSerializer<?>[] childSerializers() {
        k1 k1Var = k1.f15181a;
        kf.h hVar = kf.h.f15167a;
        return new KSerializer[]{CovCertificate$$serializer.INSTANCE, k1Var, m0.f15197a, hVar, hVar, hVar, new kf.f(k1Var), hVar, hVar, hVar, hVar, hVar, new s("de.rki.covpass.sdk.cert.models.ReissueState", h.values()), new s("de.rki.covpass.sdk.cert.models.ReissueType", i.values())};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r22v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    @Override // kotlinx.serialization.b
    public CombinedCovCertificateLocal deserialize(Decoder decoder) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        long j10;
        String str;
        int i10;
        h hVar;
        Object obj;
        i iVar;
        CovCertificate covCertificate;
        char c10;
        CovCertificate covCertificate2;
        h hVar2;
        i iVar2;
        CovCertificate covCertificate3;
        t.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        jf.c b10 = decoder.b(descriptor2);
        int i11 = 9;
        int i12 = 7;
        int i13 = 4;
        if (b10.r()) {
            ?? C = b10.C(descriptor2, 0, CovCertificate$$serializer.INSTANCE, null);
            String k10 = b10.k(descriptor2, 1);
            long s10 = b10.s(descriptor2, 2);
            boolean i14 = b10.i(descriptor2, 3);
            boolean i15 = b10.i(descriptor2, 4);
            boolean i16 = b10.i(descriptor2, 5);
            obj = b10.C(descriptor2, 6, new kf.f(k1.f15181a), null);
            boolean i17 = b10.i(descriptor2, 7);
            boolean i18 = b10.i(descriptor2, 8);
            boolean i19 = b10.i(descriptor2, 9);
            boolean i20 = b10.i(descriptor2, 10);
            boolean i21 = b10.i(descriptor2, 11);
            hVar = b10.C(descriptor2, 12, new s("de.rki.covpass.sdk.cert.models.ReissueState", h.values()), null);
            i10 = 16383;
            z17 = i14;
            z16 = i15;
            z12 = i19;
            z14 = i17;
            z15 = i16;
            z13 = i18;
            z11 = i20;
            z10 = i21;
            j10 = s10;
            iVar = b10.C(descriptor2, 13, new s("de.rki.covpass.sdk.cert.models.ReissueType", i.values()), null);
            str = k10;
            covCertificate = C;
        } else {
            int i22 = 13;
            boolean z18 = true;
            i iVar3 = null;
            h hVar3 = null;
            CovCertificate covCertificate4 = null;
            z16 = false;
            boolean z19 = false;
            boolean z20 = false;
            boolean z21 = false;
            z13 = false;
            boolean z22 = false;
            boolean z23 = false;
            long j11 = 0;
            str = null;
            boolean z24 = false;
            int i23 = 0;
            Object obj2 = null;
            while (z18) {
                int q10 = b10.q(descriptor2);
                switch (q10) {
                    case -1:
                        z18 = false;
                        covCertificate3 = covCertificate4;
                        i11 = 9;
                        i12 = 7;
                        iVar2 = iVar3;
                        hVar2 = hVar3;
                        covCertificate2 = covCertificate3;
                        iVar3 = iVar2;
                        hVar3 = hVar2;
                        covCertificate4 = covCertificate2;
                        i13 = 4;
                        break;
                    case 0:
                        i23 |= 1;
                        i22 = 13;
                        covCertificate3 = b10.C(descriptor2, 0, CovCertificate$$serializer.INSTANCE, covCertificate4);
                        i11 = 9;
                        i12 = 7;
                        iVar2 = iVar3;
                        hVar2 = hVar3;
                        covCertificate2 = covCertificate3;
                        iVar3 = iVar2;
                        hVar3 = hVar2;
                        covCertificate4 = covCertificate2;
                        i13 = 4;
                        break;
                    case 1:
                        c10 = 3;
                        str = b10.k(descriptor2, 1);
                        i23 |= 2;
                        i22 = 13;
                        i11 = 9;
                        iVar3 = iVar3;
                        hVar3 = hVar3;
                        covCertificate4 = covCertificate4;
                        i13 = 4;
                        break;
                    case 2:
                        c10 = 3;
                        j11 = b10.s(descriptor2, 2);
                        i23 |= 4;
                        i22 = 13;
                        i11 = 9;
                        iVar3 = iVar3;
                        hVar3 = hVar3;
                        covCertificate4 = covCertificate4;
                        i13 = 4;
                        break;
                    case 3:
                        z24 = b10.i(descriptor2, 3);
                        i23 |= 8;
                        i13 = i13;
                        i22 = 13;
                        i11 = 9;
                        break;
                    case 4:
                        int i24 = i13;
                        z16 = b10.i(descriptor2, i24);
                        i23 |= 16;
                        i13 = i24;
                        i22 = 13;
                        i11 = 9;
                        break;
                    case 5:
                        z21 = b10.i(descriptor2, 5);
                        i23 |= 32;
                        i22 = 13;
                        i11 = 9;
                        iVar2 = iVar3;
                        hVar2 = hVar3;
                        covCertificate2 = covCertificate4;
                        iVar3 = iVar2;
                        hVar3 = hVar2;
                        covCertificate4 = covCertificate2;
                        i13 = 4;
                        break;
                    case 6:
                        obj2 = b10.C(descriptor2, 6, new kf.f(k1.f15181a), obj2);
                        i23 |= 64;
                        i22 = 13;
                        i11 = 9;
                        iVar2 = iVar3;
                        hVar2 = hVar3;
                        covCertificate2 = covCertificate4;
                        iVar3 = iVar2;
                        hVar3 = hVar2;
                        covCertificate4 = covCertificate2;
                        i13 = 4;
                        break;
                    case 7:
                        z20 = b10.i(descriptor2, i12);
                        i23 |= 128;
                        i22 = 13;
                        iVar2 = iVar3;
                        hVar2 = hVar3;
                        covCertificate2 = covCertificate4;
                        iVar3 = iVar2;
                        hVar3 = hVar2;
                        covCertificate4 = covCertificate2;
                        i13 = 4;
                        break;
                    case 8:
                        z13 = b10.i(descriptor2, 8);
                        i23 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        i22 = 13;
                        iVar2 = iVar3;
                        hVar2 = hVar3;
                        covCertificate2 = covCertificate4;
                        iVar3 = iVar2;
                        hVar3 = hVar2;
                        covCertificate4 = covCertificate2;
                        i13 = 4;
                        break;
                    case 9:
                        z19 = b10.i(descriptor2, i11);
                        i23 |= 512;
                        i22 = 13;
                        iVar2 = iVar3;
                        hVar2 = hVar3;
                        covCertificate2 = covCertificate4;
                        iVar3 = iVar2;
                        hVar3 = hVar2;
                        covCertificate4 = covCertificate2;
                        i13 = 4;
                        break;
                    case 10:
                        z22 = b10.i(descriptor2, 10);
                        i23 |= 1024;
                        i22 = 13;
                        iVar2 = iVar3;
                        hVar2 = hVar3;
                        covCertificate2 = covCertificate4;
                        iVar3 = iVar2;
                        hVar3 = hVar2;
                        covCertificate4 = covCertificate2;
                        i13 = 4;
                        break;
                    case 11:
                        z23 = b10.i(descriptor2, 11);
                        i23 |= 2048;
                        iVar2 = iVar3;
                        hVar2 = hVar3;
                        covCertificate2 = covCertificate4;
                        iVar3 = iVar2;
                        hVar3 = hVar2;
                        covCertificate4 = covCertificate2;
                        i13 = 4;
                        break;
                    case 12:
                        i23 |= 4096;
                        iVar2 = iVar3;
                        hVar2 = b10.C(descriptor2, 12, new s("de.rki.covpass.sdk.cert.models.ReissueState", h.values()), hVar3);
                        covCertificate2 = covCertificate4;
                        iVar3 = iVar2;
                        hVar3 = hVar2;
                        covCertificate4 = covCertificate2;
                        i13 = 4;
                        break;
                    case 13:
                        i23 |= 8192;
                        iVar2 = b10.C(descriptor2, i22, new s("de.rki.covpass.sdk.cert.models.ReissueType", i.values()), iVar3);
                        hVar2 = hVar3;
                        covCertificate2 = covCertificate4;
                        iVar3 = iVar2;
                        hVar3 = hVar2;
                        covCertificate4 = covCertificate2;
                        i13 = 4;
                        break;
                    default:
                        throw new l(q10);
                }
            }
            hVar = hVar3;
            i10 = i23;
            obj = obj2;
            covCertificate = covCertificate4;
            z17 = z24;
            j10 = j11;
            z10 = z23;
            z11 = z22;
            z12 = z19;
            z15 = z21;
            z14 = z20;
            iVar = iVar3;
        }
        b10.c(descriptor2);
        return new CombinedCovCertificateLocal(i10, covCertificate, str, j10, z17, z16, z15, obj, z14, z13, z12, z11, z10, hVar, iVar, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, CombinedCovCertificateLocal combinedCovCertificateLocal) {
        t.e(encoder, "encoder");
        t.e(combinedCovCertificateLocal, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        jf.d b10 = encoder.b(descriptor2);
        CombinedCovCertificateLocal.a(combinedCovCertificateLocal, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // kf.v
    public KSerializer<?>[] typeParametersSerializers() {
        return v.a.a(this);
    }
}
