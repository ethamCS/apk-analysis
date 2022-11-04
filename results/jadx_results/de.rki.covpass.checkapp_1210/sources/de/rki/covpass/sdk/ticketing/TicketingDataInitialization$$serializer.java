package de.rki.covpass.sdk.ticketing;

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
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"de/rki/covpass/sdk/ticketing/TicketingDataInitialization.$serializer", "Lkf/v;", "Lde/rki/covpass/sdk/ticketing/TicketingDataInitialization;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class TicketingDataInitialization$$serializer implements v<TicketingDataInitialization> {
    public static final TicketingDataInitialization$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        TicketingDataInitialization$$serializer ticketingDataInitialization$$serializer = new TicketingDataInitialization$$serializer();
        INSTANCE = ticketingDataInitialization$$serializer;
        x0 x0Var = new x0("de.rki.covpass.sdk.ticketing.TicketingDataInitialization", ticketingDataInitialization$$serializer, 8);
        x0Var.c("protocol", false);
        x0Var.c("protocolVersion", false);
        x0Var.c("serviceIdentity", false);
        x0Var.c("privacyUrl", false);
        x0Var.c("token", false);
        x0Var.c("consent", false);
        x0Var.c("subject", false);
        x0Var.c("serviceProvider", false);
        descriptor = x0Var;
    }

    private TicketingDataInitialization$$serializer() {
    }

    @Override // kf.v
    public KSerializer<?>[] childSerializers() {
        k1 k1Var = k1.f15181a;
        return new KSerializer[]{k1Var, k1Var, k1Var, k1Var, k1Var, k1Var, k1Var, k1Var};
    }

    @Override // kotlinx.serialization.b
    public TicketingDataInitialization deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i10;
        t.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        jf.c b10 = decoder.b(descriptor2);
        int i11 = 0;
        if (b10.r()) {
            String k10 = b10.k(descriptor2, 0);
            String k11 = b10.k(descriptor2, 1);
            String k12 = b10.k(descriptor2, 2);
            String k13 = b10.k(descriptor2, 3);
            String k14 = b10.k(descriptor2, 4);
            String k15 = b10.k(descriptor2, 5);
            String k16 = b10.k(descriptor2, 6);
            str8 = k10;
            str = b10.k(descriptor2, 7);
            str2 = k16;
            str3 = k15;
            str5 = k13;
            str4 = k14;
            str6 = k12;
            str7 = k11;
            i10 = 255;
        } else {
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            boolean z10 = true;
            while (z10) {
                int q10 = b10.q(descriptor2);
                switch (q10) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        i11 |= 1;
                        str9 = b10.k(descriptor2, 0);
                        continue;
                    case 1:
                        str16 = b10.k(descriptor2, 1);
                        i11 |= 2;
                        continue;
                    case 2:
                        str15 = b10.k(descriptor2, 2);
                        i11 |= 4;
                        break;
                    case 3:
                        str13 = b10.k(descriptor2, 3);
                        i11 |= 8;
                        break;
                    case 4:
                        str14 = b10.k(descriptor2, 4);
                        i11 |= 16;
                        break;
                    case 5:
                        str12 = b10.k(descriptor2, 5);
                        i11 |= 32;
                        break;
                    case 6:
                        str11 = b10.k(descriptor2, 6);
                        i11 |= 64;
                        break;
                    case 7:
                        str10 = b10.k(descriptor2, 7);
                        i11 |= 128;
                        break;
                    default:
                        throw new l(q10);
                }
            }
            str = str10;
            str2 = str11;
            str3 = str12;
            str8 = str9;
            i10 = i11;
            String str17 = str15;
            str5 = str13;
            str7 = str16;
            str4 = str14;
            str6 = str17;
        }
        b10.c(descriptor2);
        return new TicketingDataInitialization(i10, str8, str7, str6, str5, str4, str3, str2, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, TicketingDataInitialization ticketingDataInitialization) {
        t.e(encoder, "encoder");
        t.e(ticketingDataInitialization, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        jf.d b10 = encoder.b(descriptor2);
        TicketingDataInitialization.a(ticketingDataInitialization, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // kf.v
    public KSerializer<?>[] typeParametersSerializers() {
        return v.a.a(this);
    }
}
