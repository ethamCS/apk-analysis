package de.rki.covpass.sdk.ticketing.data.accesstoken;

import hc.k0;
import hc.t;
import j$.time.ZonedDateTime;
import java.util.List;
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
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"de/rki/covpass/sdk/ticketing/data/accesstoken/TicketingCertificateDataRemote.$serializer", "Lkf/v;", "Lde/rki/covpass/sdk/ticketing/data/accesstoken/TicketingCertificateDataRemote;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class TicketingCertificateDataRemote$$serializer implements v<TicketingCertificateDataRemote> {
    public static final TicketingCertificateDataRemote$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        TicketingCertificateDataRemote$$serializer ticketingCertificateDataRemote$$serializer = new TicketingCertificateDataRemote$$serializer();
        INSTANCE = ticketingCertificateDataRemote$$serializer;
        x0 x0Var = new x0("de.rki.covpass.sdk.ticketing.data.accesstoken.TicketingCertificateDataRemote", ticketingCertificateDataRemote$$serializer, 14);
        x0Var.c("hash", true);
        x0Var.c("lang", false);
        x0Var.c("fnt", false);
        x0Var.c("gnt", false);
        x0Var.c("dob", false);
        x0Var.c("coa", false);
        x0Var.c("cod", false);
        x0Var.c("roa", false);
        x0Var.c("rod", false);
        x0Var.c("type", false);
        x0Var.c("category", false);
        x0Var.c("validationClock", false);
        x0Var.c("validFrom", false);
        x0Var.c("validTo", false);
        descriptor = x0Var;
    }

    private TicketingCertificateDataRemote$$serializer() {
    }

    @Override // kf.v
    public KSerializer<?>[] childSerializers() {
        k1 k1Var = k1.f15181a;
        return new KSerializer[]{BuiltinSerializersKt.p(k1Var), k1Var, k1Var, k1Var, k1Var, k1Var, k1Var, k1Var, k1Var, new f(k1Var), new f(k1Var), new ContextualSerializer(k0.b(ZonedDateTime.class), null, new KSerializer[0]), new ContextualSerializer(k0.b(ZonedDateTime.class), null, new KSerializer[0]), new ContextualSerializer(k0.b(ZonedDateTime.class), null, new KSerializer[0])};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    @Override // kotlinx.serialization.b
    public TicketingCertificateDataRemote deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i10;
        ZonedDateTime zonedDateTime;
        Object obj;
        ZonedDateTime zonedDateTime2;
        Object obj2;
        Object obj3;
        List list;
        int i11;
        int i12;
        ZonedDateTime zonedDateTime3;
        ZonedDateTime zonedDateTime4;
        List list2;
        ZonedDateTime zonedDateTime5;
        ZonedDateTime zonedDateTime6;
        List list3;
        t.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i13 = 10;
        int i14 = 7;
        int i15 = 6;
        KSerializer kSerializer = null;
        if (b10.r()) {
            k1 k1Var = k1.f15181a;
            obj = b10.m(descriptor2, 0, k1Var, null);
            String k10 = b10.k(descriptor2, 1);
            String k11 = b10.k(descriptor2, 2);
            String k12 = b10.k(descriptor2, 3);
            String k13 = b10.k(descriptor2, 4);
            String k14 = b10.k(descriptor2, 5);
            String k15 = b10.k(descriptor2, 6);
            String k16 = b10.k(descriptor2, 7);
            String k17 = b10.k(descriptor2, 8);
            obj2 = b10.C(descriptor2, 9, new f(k1Var), null);
            ?? C = b10.C(descriptor2, 10, new f(k1Var), null);
            zonedDateTime = b10.C(descriptor2, 11, new ContextualSerializer(k0.b(ZonedDateTime.class), null, new KSerializer[0]), null);
            ?? C2 = b10.C(descriptor2, 12, new ContextualSerializer(k0.b(ZonedDateTime.class), null, new KSerializer[0]), null);
            obj3 = b10.C(descriptor2, 13, new ContextualSerializer(k0.b(ZonedDateTime.class), null, new KSerializer[0]), null);
            i10 = 16383;
            str2 = k16;
            str3 = k15;
            str4 = k14;
            str6 = k12;
            str = k17;
            str5 = k13;
            str7 = k11;
            str8 = k10;
            zonedDateTime2 = C2;
            list = C;
        } else {
            int i16 = 0;
            List list4 = null;
            ZonedDateTime zonedDateTime7 = null;
            Object obj4 = null;
            Object obj5 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            Object obj6 = null;
            boolean z10 = true;
            ZonedDateTime zonedDateTime8 = null;
            while (z10) {
                int q10 = b10.q(descriptor2);
                switch (q10) {
                    case -1:
                        z10 = false;
                        i14 = i14;
                        i15 = i15;
                        i13 = 10;
                        list4 = list4;
                        zonedDateTime7 = zonedDateTime7;
                        zonedDateTime8 = zonedDateTime8;
                        break;
                    case 0:
                        obj6 = b10.m(descriptor2, 0, k1.f15181a, obj6);
                        i16 |= 1;
                        i14 = i14;
                        i15 = i15;
                        kSerializer = null;
                        i13 = 10;
                        list4 = list4;
                        zonedDateTime7 = zonedDateTime7;
                        zonedDateTime8 = zonedDateTime8;
                        break;
                    case 1:
                        i11 = i15;
                        i12 = i14;
                        str16 = b10.k(descriptor2, 1);
                        i16 |= 2;
                        i14 = i12;
                        i15 = i11;
                        kSerializer = null;
                        list4 = list4;
                        zonedDateTime7 = zonedDateTime7;
                        zonedDateTime8 = zonedDateTime8;
                        break;
                    case 2:
                        i11 = i15;
                        i12 = i14;
                        str15 = b10.k(descriptor2, 2);
                        i16 |= 4;
                        i14 = i12;
                        i15 = i11;
                        kSerializer = null;
                        list4 = list4;
                        zonedDateTime7 = zonedDateTime7;
                        zonedDateTime8 = zonedDateTime8;
                        break;
                    case 3:
                        i11 = i15;
                        i12 = i14;
                        str12 = b10.k(descriptor2, 3);
                        i16 |= 8;
                        i14 = i12;
                        i15 = i11;
                        kSerializer = null;
                        list4 = list4;
                        zonedDateTime7 = zonedDateTime7;
                        zonedDateTime8 = zonedDateTime8;
                        break;
                    case 4:
                        i11 = i15;
                        i12 = i14;
                        str14 = b10.k(descriptor2, 4);
                        i16 |= 16;
                        i14 = i12;
                        i15 = i11;
                        kSerializer = null;
                        list4 = list4;
                        zonedDateTime7 = zonedDateTime7;
                        zonedDateTime8 = zonedDateTime8;
                        break;
                    case 5:
                        str11 = b10.k(descriptor2, 5);
                        i16 |= 32;
                        i14 = i14;
                        i15 = i15;
                        kSerializer = null;
                        continue;
                    case 6:
                        int i17 = i15;
                        str10 = b10.k(descriptor2, i17);
                        i16 |= 64;
                        i14 = i14;
                        i15 = i17;
                        list4 = list4;
                        zonedDateTime7 = zonedDateTime7;
                        zonedDateTime8 = zonedDateTime8;
                        break;
                    case 7:
                        int i18 = i14;
                        str9 = b10.k(descriptor2, i18);
                        i16 |= 128;
                        i14 = i18;
                        list2 = list4;
                        zonedDateTime4 = zonedDateTime7;
                        zonedDateTime3 = zonedDateTime8;
                        i15 = 6;
                        list4 = list2;
                        zonedDateTime7 = zonedDateTime4;
                        zonedDateTime8 = zonedDateTime3;
                        break;
                    case 8:
                        str13 = b10.k(descriptor2, 8);
                        i16 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        list3 = list4;
                        zonedDateTime6 = zonedDateTime7;
                        zonedDateTime5 = zonedDateTime8;
                        i14 = 7;
                        list2 = list3;
                        zonedDateTime4 = zonedDateTime6;
                        zonedDateTime3 = zonedDateTime5;
                        i15 = 6;
                        list4 = list2;
                        zonedDateTime7 = zonedDateTime4;
                        zonedDateTime8 = zonedDateTime3;
                        break;
                    case 9:
                        obj4 = b10.C(descriptor2, 9, new f(k1.f15181a), obj4);
                        i16 |= 512;
                        list3 = list4;
                        zonedDateTime6 = zonedDateTime7;
                        zonedDateTime5 = zonedDateTime8;
                        i14 = 7;
                        list2 = list3;
                        zonedDateTime4 = zonedDateTime6;
                        zonedDateTime3 = zonedDateTime5;
                        i15 = 6;
                        list4 = list2;
                        zonedDateTime7 = zonedDateTime4;
                        zonedDateTime8 = zonedDateTime3;
                        break;
                    case 10:
                        i16 |= 1024;
                        list3 = b10.C(descriptor2, i13, new f(k1.f15181a), list4);
                        zonedDateTime6 = zonedDateTime7;
                        zonedDateTime5 = zonedDateTime8;
                        i14 = 7;
                        list2 = list3;
                        zonedDateTime4 = zonedDateTime6;
                        zonedDateTime3 = zonedDateTime5;
                        i15 = 6;
                        list4 = list2;
                        zonedDateTime7 = zonedDateTime4;
                        zonedDateTime8 = zonedDateTime3;
                        break;
                    case 11:
                        i16 |= 2048;
                        list3 = list4;
                        zonedDateTime6 = b10.C(descriptor2, 11, new ContextualSerializer(k0.b(ZonedDateTime.class), kSerializer, new KSerializer[0]), zonedDateTime7);
                        zonedDateTime5 = zonedDateTime8;
                        i14 = 7;
                        list2 = list3;
                        zonedDateTime4 = zonedDateTime6;
                        zonedDateTime3 = zonedDateTime5;
                        i15 = 6;
                        list4 = list2;
                        zonedDateTime7 = zonedDateTime4;
                        zonedDateTime8 = zonedDateTime3;
                        break;
                    case 12:
                        i16 |= 4096;
                        list3 = list4;
                        zonedDateTime6 = zonedDateTime7;
                        zonedDateTime5 = b10.C(descriptor2, 12, new ContextualSerializer(k0.b(ZonedDateTime.class), kSerializer, new KSerializer[0]), zonedDateTime8);
                        i14 = 7;
                        list2 = list3;
                        zonedDateTime4 = zonedDateTime6;
                        zonedDateTime3 = zonedDateTime5;
                        i15 = 6;
                        list4 = list2;
                        zonedDateTime7 = zonedDateTime4;
                        zonedDateTime8 = zonedDateTime3;
                        break;
                    case 13:
                        obj5 = b10.C(descriptor2, 13, new ContextualSerializer(k0.b(ZonedDateTime.class), kSerializer, new KSerializer[0]), obj5);
                        i16 |= 8192;
                        list3 = list4;
                        zonedDateTime6 = zonedDateTime7;
                        zonedDateTime5 = zonedDateTime8;
                        i14 = 7;
                        list2 = list3;
                        zonedDateTime4 = zonedDateTime6;
                        zonedDateTime3 = zonedDateTime5;
                        i15 = 6;
                        list4 = list2;
                        zonedDateTime7 = zonedDateTime4;
                        zonedDateTime8 = zonedDateTime3;
                        break;
                    default:
                        throw new l(q10);
                }
            }
            zonedDateTime = zonedDateTime7;
            obj = obj6;
            i10 = i16;
            obj2 = obj4;
            obj3 = obj5;
            String str17 = str15;
            str2 = str9;
            str8 = str16;
            str = str13;
            str4 = str11;
            str6 = str12;
            str5 = str14;
            str3 = str10;
            str7 = str17;
            list = list4;
            zonedDateTime2 = zonedDateTime8;
        }
        b10.c(descriptor2);
        return new TicketingCertificateDataRemote(i10, obj, str8, str7, str6, str5, str4, str3, str2, str, obj2, list, zonedDateTime, zonedDateTime2, obj3, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, TicketingCertificateDataRemote ticketingCertificateDataRemote) {
        t.e(encoder, "encoder");
        t.e(ticketingCertificateDataRemote, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b10 = encoder.b(descriptor2);
        TicketingCertificateDataRemote.e(ticketingCertificateDataRemote, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // kf.v
    public KSerializer<?>[] typeParametersSerializers() {
        return v.a.a(this);
    }
}
