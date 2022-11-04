package de.rki.covpass.sdk.cert.models;

import hc.k0;
import hc.t;
import j$.time.LocalDate;
import kf.d0;
import kf.h1;
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
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"de/rki/covpass/sdk/cert/models/Vaccination.$serializer", "Lkf/v;", "Lde/rki/covpass/sdk/cert/models/Vaccination;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class Vaccination$$serializer implements v<Vaccination> {
    public static final Vaccination$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        Vaccination$$serializer vaccination$$serializer = new Vaccination$$serializer();
        INSTANCE = vaccination$$serializer;
        x0 x0Var = new x0("de.rki.covpass.sdk.cert.models.Vaccination", vaccination$$serializer, 10);
        x0Var.c("tg", true);
        x0Var.c("vp", true);
        x0Var.c("mp", true);
        x0Var.c("ma", true);
        x0Var.c("dn", true);
        x0Var.c("sd", true);
        x0Var.c("dt", true);
        x0Var.c("co", true);
        x0Var.c("is", true);
        x0Var.c("ci", true);
        descriptor = x0Var;
    }

    private Vaccination$$serializer() {
    }

    @Override // kf.v
    public KSerializer<?>[] childSerializers() {
        k1 k1Var = k1.f15181a;
        d0 d0Var = d0.f15152a;
        return new KSerializer[]{k1Var, k1Var, k1Var, k1Var, d0Var, d0Var, BuiltinSerializersKt.p(new ContextualSerializer(k0.b(LocalDate.class), null, new KSerializer[0])), k1Var, k1Var, k1Var};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    @Override // kotlinx.serialization.b
    public Vaccination deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        int i10;
        int i11;
        String str4;
        String str5;
        String str6;
        String str7;
        int i12;
        Object obj;
        char c10;
        t.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        jf.c b10 = decoder.b(descriptor2);
        int i13 = 9;
        int i14 = 7;
        if (b10.r()) {
            String k10 = b10.k(descriptor2, 0);
            str6 = b10.k(descriptor2, 1);
            String k11 = b10.k(descriptor2, 2);
            String k12 = b10.k(descriptor2, 3);
            int x10 = b10.x(descriptor2, 4);
            int x11 = b10.x(descriptor2, 5);
            obj = b10.m(descriptor2, 6, new ContextualSerializer(k0.b(LocalDate.class), null, new KSerializer[0]), null);
            String k13 = b10.k(descriptor2, 7);
            String k14 = b10.k(descriptor2, 8);
            str = b10.k(descriptor2, 9);
            str3 = k13;
            i10 = x11;
            str4 = k12;
            str2 = k14;
            i11 = x10;
            i12 = 1023;
            str5 = k11;
            str7 = k10;
        } else {
            boolean z10 = true;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            String str8 = null;
            Object obj2 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            str2 = null;
            String str12 = null;
            String str13 = null;
            while (z10) {
                int q10 = b10.q(descriptor2);
                switch (q10) {
                    case -1:
                        z10 = false;
                    case 0:
                        c10 = 3;
                        str8 = b10.k(descriptor2, 0);
                        i15 |= 1;
                        i13 = 9;
                        i14 = 7;
                    case 1:
                        c10 = 3;
                        str13 = b10.k(descriptor2, 1);
                        i15 |= 2;
                        i13 = 9;
                        i14 = 7;
                    case 2:
                        c10 = 3;
                        str12 = b10.k(descriptor2, 2);
                        i15 |= 4;
                        i13 = 9;
                        i14 = 7;
                    case 3:
                        c10 = 3;
                        str11 = b10.k(descriptor2, 3);
                        i15 |= 8;
                        i13 = 9;
                        i14 = 7;
                    case 4:
                        i17 = b10.x(descriptor2, 4);
                        i15 |= 16;
                        i13 = 9;
                        i14 = 7;
                    case 5:
                        i16 = b10.x(descriptor2, 5);
                        i15 |= 32;
                        i13 = 9;
                        i14 = 7;
                    case 6:
                        obj2 = b10.m(descriptor2, 6, new ContextualSerializer(k0.b(LocalDate.class), null, new KSerializer[0]), obj2);
                        i15 |= 64;
                        i13 = 9;
                        i14 = 7;
                    case 7:
                        str10 = b10.k(descriptor2, i14);
                        i15 |= 128;
                    case 8:
                        str2 = b10.k(descriptor2, 8);
                        i15 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    case 9:
                        str9 = b10.k(descriptor2, i13);
                        i15 |= 512;
                    default:
                        throw new l(q10);
                }
            }
            i12 = i15;
            obj = obj2;
            str4 = str11;
            str5 = str12;
            str6 = str13;
            str7 = str8;
            str3 = str10;
            i10 = i16;
            int i18 = i17;
            str = str9;
            i11 = i18;
        }
        b10.c(descriptor2);
        return new Vaccination(i12, str7, str6, str5, str4, i11, i10, (LocalDate) obj, str3, str2, str, (h1) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, Vaccination vaccination) {
        t.e(encoder, "encoder");
        t.e(vaccination, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        jf.d b10 = encoder.b(descriptor2);
        Vaccination.j(vaccination, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // kf.v
    public KSerializer<?>[] typeParametersSerializers() {
        return v.a.a(this);
    }
}
