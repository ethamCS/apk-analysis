package de.rki.covpass.sdk.ticketing.data.accesstoken;

import hc.t;
import jf.c;
import jf.d;
import kf.k1;
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
import org.conscrypt.PSKKeyManager;
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"de/rki/covpass/sdk/ticketing/data/accesstoken/TicketingAccessTokenResponse.$serializer", "Lkf/v;", "Lde/rki/covpass/sdk/ticketing/data/accesstoken/TicketingAccessTokenResponse;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class TicketingAccessTokenResponse$$serializer implements v<TicketingAccessTokenResponse> {
    public static final TicketingAccessTokenResponse$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        TicketingAccessTokenResponse$$serializer ticketingAccessTokenResponse$$serializer = new TicketingAccessTokenResponse$$serializer();
        INSTANCE = ticketingAccessTokenResponse$$serializer;
        x0 x0Var = new x0("de.rki.covpass.sdk.ticketing.data.accesstoken.TicketingAccessTokenResponse", ticketingAccessTokenResponse$$serializer, 9);
        x0Var.c("jti", true);
        x0Var.c("iss", false);
        x0Var.c("iat", false);
        x0Var.c("sub", false);
        x0Var.c("aud", false);
        x0Var.c("exp", false);
        x0Var.c("t", false);
        x0Var.c("v", false);
        x0Var.c("vc", false);
        descriptor = x0Var;
    }

    private TicketingAccessTokenResponse$$serializer() {
    }

    @Override // kf.v
    public KSerializer<?>[] childSerializers() {
        k1 k1Var = k1.f15181a;
        m0 m0Var = m0.f15197a;
        return new KSerializer[]{BuiltinSerializersKt.p(k1Var), k1Var, m0Var, k1Var, k1Var, m0Var, m0Var, k1Var, TicketingCertificateDataRemote$$serializer.INSTANCE};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    @Override // kotlinx.serialization.b
    public TicketingAccessTokenResponse deserialize(Decoder decoder) {
        String str;
        long j10;
        long j11;
        String str2;
        String str3;
        long j12;
        String str4;
        int i10;
        TicketingCertificateDataRemote ticketingCertificateDataRemote;
        Object obj;
        t.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i11 = 7;
        int i12 = 6;
        String str5 = null;
        if (b10.r()) {
            obj = b10.m(descriptor2, 0, k1.f15181a, null);
            String k10 = b10.k(descriptor2, 1);
            long s10 = b10.s(descriptor2, 2);
            String k11 = b10.k(descriptor2, 3);
            String k12 = b10.k(descriptor2, 4);
            long s11 = b10.s(descriptor2, 5);
            long s12 = b10.s(descriptor2, 6);
            j11 = s11;
            str = b10.k(descriptor2, 7);
            ticketingCertificateDataRemote = b10.C(descriptor2, 8, TicketingCertificateDataRemote$$serializer.INSTANCE, null);
            str3 = k11;
            str4 = k10;
            str2 = k12;
            j12 = s10;
            j10 = s12;
            i10 = 511;
        } else {
            j10 = 0;
            int i13 = 0;
            boolean z10 = true;
            TicketingCertificateDataRemote ticketingCertificateDataRemote2 = null;
            String str6 = null;
            Object obj2 = null;
            String str7 = null;
            String str8 = null;
            long j13 = 0;
            long j14 = 0;
            while (z10) {
                int q10 = b10.q(descriptor2);
                switch (q10) {
                    case -1:
                        z10 = false;
                        i11 = 7;
                        i12 = 6;
                    case 0:
                        obj2 = b10.m(descriptor2, 0, k1.f15181a, obj2);
                        i13 |= 1;
                        i11 = 7;
                        i12 = 6;
                    case 1:
                        str6 = b10.k(descriptor2, 1);
                        i13 |= 2;
                        ticketingCertificateDataRemote2 = ticketingCertificateDataRemote2;
                    case 2:
                        j13 = b10.s(descriptor2, 2);
                        i13 |= 4;
                        ticketingCertificateDataRemote2 = ticketingCertificateDataRemote2;
                    case 3:
                        str7 = b10.k(descriptor2, 3);
                        i13 |= 8;
                        ticketingCertificateDataRemote2 = ticketingCertificateDataRemote2;
                    case 4:
                        str8 = b10.k(descriptor2, 4);
                        i13 |= 16;
                        ticketingCertificateDataRemote2 = ticketingCertificateDataRemote2;
                    case 5:
                        j14 = b10.s(descriptor2, 5);
                        i13 |= 32;
                        ticketingCertificateDataRemote2 = ticketingCertificateDataRemote2;
                    case 6:
                        j10 = b10.s(descriptor2, i12);
                        i13 |= 64;
                        ticketingCertificateDataRemote2 = ticketingCertificateDataRemote2;
                    case 7:
                        str5 = b10.k(descriptor2, i11);
                        i13 |= 128;
                        ticketingCertificateDataRemote2 = ticketingCertificateDataRemote2;
                    case 8:
                        ?? C = b10.C(descriptor2, 8, TicketingCertificateDataRemote$$serializer.INSTANCE, ticketingCertificateDataRemote2);
                        i13 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        ticketingCertificateDataRemote2 = C;
                    default:
                        throw new l(q10);
                }
            }
            i10 = i13;
            obj = obj2;
            ticketingCertificateDataRemote = ticketingCertificateDataRemote2;
            str4 = str6;
            str3 = str7;
            str2 = str8;
            j12 = j13;
            str = str5;
            j11 = j14;
        }
        b10.c(descriptor2);
        return new TicketingAccessTokenResponse(i10, obj, str4, j12, str3, str2, j11, j10, str, ticketingCertificateDataRemote, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, TicketingAccessTokenResponse ticketingAccessTokenResponse) {
        t.e(encoder, "encoder");
        t.e(ticketingAccessTokenResponse, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b10 = encoder.b(descriptor2);
        TicketingAccessTokenResponse.a(ticketingAccessTokenResponse, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // kf.v
    public KSerializer<?>[] typeParametersSerializers() {
        return v.a.a(this);
    }
}
