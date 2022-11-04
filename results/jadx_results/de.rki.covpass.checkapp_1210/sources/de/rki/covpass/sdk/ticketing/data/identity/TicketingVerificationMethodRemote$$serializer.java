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
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.l;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"de/rki/covpass/sdk/ticketing/data/identity/TicketingVerificationMethodRemote.$serializer", "Lkf/v;", "Lde/rki/covpass/sdk/ticketing/data/identity/TicketingVerificationMethodRemote;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class TicketingVerificationMethodRemote$$serializer implements v<TicketingVerificationMethodRemote> {
    public static final TicketingVerificationMethodRemote$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        TicketingVerificationMethodRemote$$serializer ticketingVerificationMethodRemote$$serializer = new TicketingVerificationMethodRemote$$serializer();
        INSTANCE = ticketingVerificationMethodRemote$$serializer;
        x0 x0Var = new x0("de.rki.covpass.sdk.ticketing.data.identity.TicketingVerificationMethodRemote", ticketingVerificationMethodRemote$$serializer, 5);
        x0Var.c("id", false);
        x0Var.c("type", false);
        x0Var.c("controller", false);
        x0Var.c("publicKeyJwk", true);
        x0Var.c("verificationMethods", true);
        descriptor = x0Var;
    }

    private TicketingVerificationMethodRemote$$serializer() {
    }

    @Override // kf.v
    public KSerializer<?>[] childSerializers() {
        k1 k1Var = k1.f15181a;
        return new KSerializer[]{k1Var, k1Var, k1Var, BuiltinSerializersKt.p(TicketingPublicKeyJwkRemote$$serializer.INSTANCE), BuiltinSerializersKt.p(new f(k1Var))};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r4v1 */
    @Override // kotlinx.serialization.b
    public TicketingVerificationMethodRemote deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        int i10;
        Object obj;
        Object obj2;
        t.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.r()) {
            String k10 = b10.k(descriptor2, 0);
            String k11 = b10.k(descriptor2, 1);
            String k12 = b10.k(descriptor2, 2);
            obj2 = b10.m(descriptor2, 3, TicketingPublicKeyJwkRemote$$serializer.INSTANCE, null);
            obj = b10.m(descriptor2, 4, new f(k1.f15181a), null);
            str3 = k10;
            str = k12;
            str2 = k11;
            i10 = 31;
        } else {
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Object obj3 = null;
            Object obj4 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int q10 = b10.q(descriptor2);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    str4 = b10.k(descriptor2, 0);
                    i11 |= 1;
                } else if (q10 == 1) {
                    str5 = b10.k(descriptor2, 1);
                    i11 |= 2;
                } else if (q10 == 2) {
                    str6 = b10.k(descriptor2, 2);
                    i11 |= 4;
                } else if (q10 == 3) {
                    obj3 = b10.m(descriptor2, 3, TicketingPublicKeyJwkRemote$$serializer.INSTANCE, obj3);
                    i11 |= 8;
                } else if (q10 != 4) {
                    throw new l(q10);
                } else {
                    obj4 = b10.m(descriptor2, 4, new f(k1.f15181a), obj4);
                    i11 |= 16;
                }
            }
            str3 = str4;
            i10 = i11;
            str2 = str5;
            str = str6;
            obj2 = obj3;
            obj = obj4;
        }
        b10.c(descriptor2);
        return new TicketingVerificationMethodRemote(i10, str3, str2, str, obj2, obj, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, TicketingVerificationMethodRemote ticketingVerificationMethodRemote) {
        t.e(encoder, "encoder");
        t.e(ticketingVerificationMethodRemote, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b10 = encoder.b(descriptor2);
        TicketingVerificationMethodRemote.a(ticketingVerificationMethodRemote, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // kf.v
    public KSerializer<?>[] typeParametersSerializers() {
        return v.a.a(this);
    }
}
