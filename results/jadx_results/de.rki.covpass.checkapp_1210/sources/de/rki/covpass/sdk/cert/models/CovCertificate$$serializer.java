package de.rki.covpass.sdk.cert.models;

import hc.k0;
import hc.t;
import j$.time.Instant;
import java.util.List;
import kf.d0;
import kf.k1;
import kf.v;
import kf.x0;
import kotlin.Metadata;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.l;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"de/rki/covpass/sdk/cert/models/CovCertificate.$serializer", "Lkf/v;", "Lde/rki/covpass/sdk/cert/models/CovCertificate;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class CovCertificate$$serializer implements v<CovCertificate> {
    public static final CovCertificate$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CovCertificate$$serializer covCertificate$$serializer = new CovCertificate$$serializer();
        INSTANCE = covCertificate$$serializer;
        x0 x0Var = new x0("de.rki.covpass.sdk.cert.models.CovCertificate", covCertificate$$serializer, 17);
        x0Var.c("issuer", true);
        x0Var.c("validFrom", true);
        x0Var.c("validUntil", true);
        x0Var.c("nam", true);
        x0Var.c("dob", true);
        x0Var.c("v", true);
        x0Var.c("t", true);
        x0Var.c("r", true);
        x0Var.c("ver", true);
        x0Var.c("kid", true);
        x0Var.c("rValue", true);
        x0Var.c("dateTimeSeparator", true);
        x0Var.c("empty", true);
        x0Var.c("yearCount", true);
        x0Var.c("yearMonthCount", true);
        x0Var.c("yearMonthDayCount", true);
        x0Var.c("isGermanCertificate", true);
        descriptor = x0Var;
    }

    private CovCertificate$$serializer() {
    }

    @Override // kf.v
    public KSerializer<?>[] childSerializers() {
        k1 k1Var = k1.f15181a;
        d0 d0Var = d0.f15152a;
        return new KSerializer[]{k1Var, BuiltinSerializersKt.p(new ContextualSerializer(k0.b(Instant.class), null, new KSerializer[0])), BuiltinSerializersKt.p(new ContextualSerializer(k0.b(Instant.class), null, new KSerializer[0])), Name$$serializer.INSTANCE, k1Var, BuiltinSerializersKt.p(new kf.f(Vaccination$$serializer.INSTANCE)), BuiltinSerializersKt.p(new kf.f(TestCert$$serializer.INSTANCE)), BuiltinSerializersKt.p(new kf.f(Recovery$$serializer.INSTANCE)), k1Var, k1Var, k1Var, k1Var, d0Var, d0Var, d0Var, d0Var, kf.h.f15167a};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r9v0 */
    @Override // kotlinx.serialization.b
    public CovCertificate deserialize(Decoder decoder) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i14;
        Object obj;
        Object obj2;
        List list;
        Object obj3;
        Instant instant;
        Object obj4;
        List list2;
        t.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        jf.c b10 = decoder.b(descriptor2);
        int i15 = 7;
        int i16 = 6;
        int i17 = 8;
        List list3 = null;
        if (b10.r()) {
            String k10 = b10.k(descriptor2, 0);
            ?? m10 = b10.m(descriptor2, 1, new ContextualSerializer(k0.b(Instant.class), null, new KSerializer[0]), null);
            obj4 = b10.m(descriptor2, 2, new ContextualSerializer(k0.b(Instant.class), null, new KSerializer[0]), null);
            obj3 = b10.C(descriptor2, 3, Name$$serializer.INSTANCE, null);
            String k11 = b10.k(descriptor2, 4);
            obj2 = b10.m(descriptor2, 5, new kf.f(Vaccination$$serializer.INSTANCE), null);
            obj = b10.m(descriptor2, 6, new kf.f(TestCert$$serializer.INSTANCE), null);
            ?? m11 = b10.m(descriptor2, 7, new kf.f(Recovery$$serializer.INSTANCE), null);
            String k12 = b10.k(descriptor2, 8);
            String k13 = b10.k(descriptor2, 9);
            String k14 = b10.k(descriptor2, 10);
            String k15 = b10.k(descriptor2, 11);
            int x10 = b10.x(descriptor2, 12);
            int x11 = b10.x(descriptor2, 13);
            int x12 = b10.x(descriptor2, 14);
            i10 = b10.x(descriptor2, 15);
            z10 = b10.i(descriptor2, 16);
            str4 = k12;
            str3 = k13;
            str2 = k14;
            str = k15;
            i13 = x10;
            i12 = x11;
            instant = m10;
            i11 = x12;
            str6 = k10;
            i14 = 131071;
            str5 = k11;
            list = m11;
        } else {
            int i18 = 16;
            boolean z11 = true;
            int i19 = 0;
            int i20 = 0;
            i14 = 0;
            boolean z12 = false;
            int i21 = 0;
            int i22 = 0;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            String str7 = null;
            Object obj8 = null;
            Instant instant2 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            while (z11) {
                int q10 = b10.q(descriptor2);
                switch (q10) {
                    case -1:
                        z11 = false;
                        i15 = 7;
                        i16 = 6;
                        list3 = list3;
                        break;
                    case 0:
                        str7 = b10.k(descriptor2, 0);
                        i14 |= 1;
                        instant2 = instant2;
                        i18 = 16;
                        i15 = 7;
                        i16 = 6;
                        i17 = 8;
                        break;
                    case 1:
                        i14 |= 2;
                        instant2 = b10.m(descriptor2, 1, new ContextualSerializer(k0.b(Instant.class), null, new KSerializer[0]), instant2);
                        i18 = 16;
                        i15 = 7;
                        i16 = 6;
                        i17 = 8;
                        break;
                    case 2:
                        obj5 = b10.m(descriptor2, 2, new ContextualSerializer(k0.b(Instant.class), null, new KSerializer[0]), obj5);
                        i14 |= 4;
                        instant2 = instant2;
                        i18 = 16;
                        i15 = 7;
                        i16 = 6;
                        i17 = 8;
                        break;
                    case 3:
                        obj6 = b10.C(descriptor2, 3, Name$$serializer.INSTANCE, obj6);
                        i14 |= 8;
                        i18 = 16;
                        i15 = 7;
                        break;
                    case 4:
                        str8 = b10.k(descriptor2, 4);
                        i14 |= 16;
                        i18 = 16;
                        break;
                    case 5:
                        obj7 = b10.m(descriptor2, 5, new kf.f(Vaccination$$serializer.INSTANCE), obj7);
                        i14 |= 32;
                        i18 = 16;
                        break;
                    case 6:
                        obj8 = b10.m(descriptor2, i16, new kf.f(TestCert$$serializer.INSTANCE), obj8);
                        i14 |= 64;
                        list2 = list3;
                        i18 = 16;
                        list3 = list2;
                        z11 = z11;
                        break;
                    case 7:
                        i14 |= 128;
                        list2 = b10.m(descriptor2, i15, new kf.f(Recovery$$serializer.INSTANCE), list3 == 1 ? 1 : 0);
                        i18 = 16;
                        list3 = list2;
                        z11 = z11;
                        break;
                    case 8:
                        str9 = b10.k(descriptor2, i17);
                        i14 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        list2 = list3;
                        i18 = 16;
                        list3 = list2;
                        z11 = z11;
                        break;
                    case 9:
                        str10 = b10.k(descriptor2, 9);
                        i14 |= 512;
                        list2 = list3;
                        i18 = 16;
                        list3 = list2;
                        z11 = z11;
                        break;
                    case 10:
                        str11 = b10.k(descriptor2, 10);
                        i14 |= 1024;
                        list2 = list3;
                        i18 = 16;
                        list3 = list2;
                        z11 = z11;
                        break;
                    case 11:
                        str12 = b10.k(descriptor2, 11);
                        i14 |= 2048;
                        list2 = list3;
                        i18 = 16;
                        list3 = list2;
                        z11 = z11;
                        break;
                    case 12:
                        i21 = b10.x(descriptor2, 12);
                        i14 |= 4096;
                        list2 = list3;
                        i18 = 16;
                        list3 = list2;
                        z11 = z11;
                        break;
                    case 13:
                        i22 = b10.x(descriptor2, 13);
                        i14 |= 8192;
                        list2 = list3;
                        i18 = 16;
                        list3 = list2;
                        z11 = z11;
                        break;
                    case 14:
                        i14 |= 16384;
                        i19 = b10.x(descriptor2, 14);
                        list3 = list3;
                        z11 = z11;
                        break;
                    case 15:
                        i20 = b10.x(descriptor2, 15);
                        i14 |= 32768;
                        list3 = list3;
                        z11 = z11;
                        break;
                    case 16:
                        z12 = b10.i(descriptor2, i18);
                        i14 |= 65536;
                        list3 = list3;
                        z11 = z11;
                        break;
                    default:
                        throw new l(q10);
                }
            }
            str6 = str7;
            i11 = i19;
            instant = instant2;
            str5 = str8;
            str4 = str9;
            str2 = str11;
            str = str12;
            i13 = i21;
            i12 = i22;
            obj2 = obj7;
            i10 = i20;
            obj = obj8;
            obj3 = obj6;
            obj4 = obj5;
            String str13 = str10;
            z10 = z12;
            str3 = str13;
            list = list3;
        }
        b10.c(descriptor2);
        return new CovCertificate(i14, str6, instant, obj4, obj3, str5, obj2, obj, list, str4, str3, str2, str, i13, i12, i11, i10, z10, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, CovCertificate covCertificate) {
        t.e(encoder, "encoder");
        t.e(covCertificate, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        jf.d b10 = encoder.b(descriptor2);
        CovCertificate.r(covCertificate, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // kf.v
    public KSerializer<?>[] typeParametersSerializers() {
        return v.a.a(this);
    }
}
