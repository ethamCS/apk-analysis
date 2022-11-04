package de.rki.covpass.sdk.ticketing.data.identity;

import hc.t;
import jf.c;
import jf.d;
import kf.f;
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
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"de/rki/covpass/sdk/ticketing/data/identity/TicketingPublicKeyJwkRemote.$serializer", "Lkf/v;", "Lde/rki/covpass/sdk/ticketing/data/identity/TicketingPublicKeyJwkRemote;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class TicketingPublicKeyJwkRemote$$serializer implements v<TicketingPublicKeyJwkRemote> {
    public static final TicketingPublicKeyJwkRemote$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        TicketingPublicKeyJwkRemote$$serializer ticketingPublicKeyJwkRemote$$serializer = new TicketingPublicKeyJwkRemote$$serializer();
        INSTANCE = ticketingPublicKeyJwkRemote$$serializer;
        x0 x0Var = new x0("de.rki.covpass.sdk.ticketing.data.identity.TicketingPublicKeyJwkRemote", ticketingPublicKeyJwkRemote$$serializer, 4);
        x0Var.c("x5c", false);
        x0Var.c("kid", false);
        x0Var.c("alg", false);
        x0Var.c("use", false);
        descriptor = x0Var;
    }

    private TicketingPublicKeyJwkRemote$$serializer() {
    }

    @Override // kf.v
    public KSerializer<?>[] childSerializers() {
        k1 k1Var = k1.f15181a;
        return new KSerializer[]{new f(k1Var), k1Var, k1Var, k1Var};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    @Override // kotlinx.serialization.b
    public TicketingPublicKeyJwkRemote deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        int i10;
        Object obj;
        t.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        Object obj2 = null;
        if (b10.r()) {
            obj = b10.C(descriptor2, 0, new f(k1.f15181a), null);
            String k10 = b10.k(descriptor2, 1);
            String k11 = b10.k(descriptor2, 2);
            str = b10.k(descriptor2, 3);
            str2 = k11;
            i10 = 15;
            str3 = k10;
        } else {
            String str4 = null;
            String str5 = null;
            String str6 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int q10 = b10.q(descriptor2);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    obj2 = b10.C(descriptor2, 0, new f(k1.f15181a), obj2);
                    i11 |= 1;
                } else if (q10 == 1) {
                    str4 = b10.k(descriptor2, 1);
                    i11 |= 2;
                } else if (q10 == 2) {
                    str5 = b10.k(descriptor2, 2);
                    i11 |= 4;
                } else if (q10 != 3) {
                    throw new l(q10);
                } else {
                    str6 = b10.k(descriptor2, 3);
                    i11 |= 8;
                }
            }
            str3 = str4;
            obj = obj2;
            str2 = str5;
            str = str6;
            i10 = i11;
        }
        b10.c(descriptor2);
        return new TicketingPublicKeyJwkRemote(i10, obj, str3, str2, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, TicketingPublicKeyJwkRemote ticketingPublicKeyJwkRemote) {
        t.e(encoder, "encoder");
        t.e(ticketingPublicKeyJwkRemote, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b10 = encoder.b(descriptor2);
        TicketingPublicKeyJwkRemote.a(ticketingPublicKeyJwkRemote, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // kf.v
    public KSerializer<?>[] typeParametersSerializers() {
        return v.a.a(this);
    }
}
