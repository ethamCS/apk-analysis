package de.rki.covpass.sdk.rules.remote.rules.eu;

import hc.k0;
import hc.t;
import j$.time.ZonedDateTime;
import jf.c;
import jf.d;
import kf.f;
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
import lf.h;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"de/rki/covpass/sdk/rules/remote/rules/eu/CovPassRuleRemote.$serializer", "Lkf/v;", "Lde/rki/covpass/sdk/rules/remote/rules/eu/CovPassRuleRemote;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class CovPassRuleRemote$$serializer implements v<CovPassRuleRemote> {
    public static final CovPassRuleRemote$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CovPassRuleRemote$$serializer covPassRuleRemote$$serializer = new CovPassRuleRemote$$serializer();
        INSTANCE = covPassRuleRemote$$serializer;
        x0 x0Var = new x0("de.rki.covpass.sdk.rules.remote.rules.eu.CovPassRuleRemote", covPassRuleRemote$$serializer, 14);
        x0Var.c("Identifier", false);
        x0Var.c("Type", false);
        x0Var.c("Version", false);
        x0Var.c("SchemaVersion", false);
        x0Var.c("Engine", false);
        x0Var.c("EngineVersion", false);
        x0Var.c("CertificateType", false);
        x0Var.c("Description", false);
        x0Var.c("ValidFrom", false);
        x0Var.c("ValidTo", false);
        x0Var.c("AffectedFields", false);
        x0Var.c("Logic", false);
        x0Var.c("Country", false);
        x0Var.c("Region", true);
        descriptor = x0Var;
    }

    private CovPassRuleRemote$$serializer() {
    }

    @Override // kf.v
    public KSerializer<?>[] childSerializers() {
        k1 k1Var = k1.f15181a;
        return new KSerializer[]{k1Var, k1Var, k1Var, k1Var, k1Var, k1Var, k1Var, new f(CovPassDescriptionRemote$$serializer.INSTANCE), new ContextualSerializer(k0.b(ZonedDateTime.class), null, new KSerializer[0]), new ContextualSerializer(k0.b(ZonedDateTime.class), null, new KSerializer[0]), new f(k1Var), h.f15995a, k1Var, BuiltinSerializersKt.p(k1Var)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r7v0 */
    @Override // kotlinx.serialization.b
    public CovPassRuleRemote deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        char c10;
        char c11;
        char c12;
        char c13;
        t.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        char c14 = 7;
        KSerializer kSerializer = null;
        if (b10.r()) {
            String k10 = b10.k(descriptor2, 0);
            String k11 = b10.k(descriptor2, 1);
            str6 = b10.k(descriptor2, 2);
            String k12 = b10.k(descriptor2, 3);
            String k13 = b10.k(descriptor2, 4);
            String k14 = b10.k(descriptor2, 5);
            String k15 = b10.k(descriptor2, 6);
            obj3 = b10.C(descriptor2, 7, new f(CovPassDescriptionRemote$$serializer.INSTANCE), null);
            obj2 = b10.C(descriptor2, 8, new ContextualSerializer(k0.b(ZonedDateTime.class), null, new KSerializer[0]), null);
            obj5 = b10.C(descriptor2, 9, new ContextualSerializer(k0.b(ZonedDateTime.class), null, new KSerializer[0]), null);
            k1 k1Var = k1.f15181a;
            obj = b10.C(descriptor2, 10, new f(k1Var), null);
            obj6 = b10.C(descriptor2, 11, h.f15995a, null);
            String k16 = b10.k(descriptor2, 12);
            obj4 = b10.m(descriptor2, 13, k1Var, null);
            str3 = k14;
            str5 = k12;
            str = k16;
            str8 = k10;
            i10 = 16383;
            str2 = k15;
            str4 = k13;
            str7 = k11;
        } else {
            int i11 = 13;
            boolean z10 = true;
            int i12 = 0;
            Object obj7 = null;
            String str9 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            while (z10) {
                int q10 = b10.q(descriptor2);
                switch (q10) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        c10 = c14;
                        c11 = 6;
                        str9 = b10.k(descriptor2, 0);
                        i12 |= 1;
                        c14 = c10;
                        kSerializer = null;
                        i11 = 13;
                    case 1:
                        c10 = c14;
                        c11 = 6;
                        str16 = b10.k(descriptor2, 1);
                        i12 |= 2;
                        c14 = c10;
                        kSerializer = null;
                        i11 = 13;
                    case 2:
                        c10 = c14;
                        c11 = 6;
                        str15 = b10.k(descriptor2, 2);
                        i12 |= 4;
                        c14 = c10;
                        kSerializer = null;
                        i11 = 13;
                    case 3:
                        c10 = c14;
                        c11 = 6;
                        str12 = b10.k(descriptor2, 3);
                        i12 |= 8;
                        c14 = c10;
                        kSerializer = null;
                        i11 = 13;
                    case 4:
                        c10 = c14;
                        c11 = 6;
                        str14 = b10.k(descriptor2, 4);
                        i12 |= 16;
                        c14 = c10;
                        kSerializer = null;
                        i11 = 13;
                    case 5:
                        c12 = c14;
                        c13 = 6;
                        str11 = b10.k(descriptor2, 5);
                        i12 |= 32;
                        c14 = c12;
                        i11 = 13;
                    case 6:
                        c12 = c14;
                        c13 = 6;
                        str10 = b10.k(descriptor2, 6);
                        i12 |= 64;
                        c14 = c12;
                        i11 = 13;
                    case 7:
                        obj12 = b10.C(descriptor2, 7, new f(CovPassDescriptionRemote$$serializer.INSTANCE), obj12);
                        i12 |= 128;
                        c14 = 7;
                        i11 = 13;
                    case 8:
                        obj10 = b10.C(descriptor2, 8, new ContextualSerializer(k0.b(ZonedDateTime.class), kSerializer, new KSerializer[0]), obj10);
                        i12 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        c14 = 7;
                        i11 = 13;
                    case 9:
                        obj9 = b10.C(descriptor2, 9, new ContextualSerializer(k0.b(ZonedDateTime.class), kSerializer, new KSerializer[0]), obj9);
                        i12 |= 512;
                        c14 = 7;
                        i11 = 13;
                    case 10:
                        obj11 = b10.C(descriptor2, 10, new f(k1.f15181a), obj11);
                        i12 |= 1024;
                        i11 = 13;
                    case 11:
                        obj8 = b10.C(descriptor2, 11, h.f15995a, obj8);
                        i12 |= 2048;
                        i11 = 13;
                    case 12:
                        str13 = b10.k(descriptor2, 12);
                        i12 |= 4096;
                        break;
                    case 13:
                        obj7 = b10.m(descriptor2, i11, k1.f15181a, obj7);
                        i12 |= 8192;
                        break;
                    default:
                        throw new l(q10);
                }
            }
            obj4 = obj7;
            str8 = str9;
            obj6 = obj8;
            obj5 = obj9;
            obj2 = obj10;
            obj = obj11;
            obj3 = obj12;
            str2 = str10;
            str3 = str11;
            str5 = str12;
            str = str13;
            str4 = str14;
            str6 = str15;
            str7 = str16;
            i10 = i12;
        }
        b10.c(descriptor2);
        return new CovPassRuleRemote(i10, str8, str7, str6, str5, str4, str3, str2, obj3, obj2, obj5, obj, obj6, str, obj4, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, CovPassRuleRemote covPassRuleRemote) {
        t.e(encoder, "encoder");
        t.e(covPassRuleRemote, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b10 = encoder.b(descriptor2);
        CovPassRuleRemote.o(covPassRuleRemote, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // kf.v
    public KSerializer<?>[] typeParametersSerializers() {
        return v.a.a(this);
    }
}
