package de.rki.covpass.sdk.cert.models;

import hc.k0;
import hc.t;
import j$.time.LocalDate;
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
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"de/rki/covpass/sdk/cert/models/Recovery.$serializer", "Lkf/v;", "Lde/rki/covpass/sdk/cert/models/Recovery;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class Recovery$$serializer implements v<Recovery> {
    public static final Recovery$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        Recovery$$serializer recovery$$serializer = new Recovery$$serializer();
        INSTANCE = recovery$$serializer;
        x0 x0Var = new x0("de.rki.covpass.sdk.cert.models.Recovery", recovery$$serializer, 7);
        x0Var.c("tg", true);
        x0Var.c("fr", true);
        x0Var.c("df", true);
        x0Var.c("du", true);
        x0Var.c("co", true);
        x0Var.c("is", true);
        x0Var.c("ci", true);
        descriptor = x0Var;
    }

    private Recovery$$serializer() {
    }

    @Override // kf.v
    public KSerializer<?>[] childSerializers() {
        k1 k1Var = k1.f15181a;
        return new KSerializer[]{k1Var, BuiltinSerializersKt.p(new ContextualSerializer(k0.b(LocalDate.class), null, new KSerializer[0])), BuiltinSerializersKt.p(new ContextualSerializer(k0.b(LocalDate.class), null, new KSerializer[0])), BuiltinSerializersKt.p(new ContextualSerializer(k0.b(LocalDate.class), null, new KSerializer[0])), k1Var, k1Var, k1Var};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r8v1 */
    @Override // kotlinx.serialization.b
    public Recovery deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        t.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        jf.c b10 = decoder.b(descriptor2);
        int i11 = 6;
        int i12 = 5;
        if (b10.r()) {
            String k10 = b10.k(descriptor2, 0);
            obj = b10.m(descriptor2, 1, new ContextualSerializer(k0.b(LocalDate.class), null, new KSerializer[0]), null);
            obj2 = b10.m(descriptor2, 2, new ContextualSerializer(k0.b(LocalDate.class), null, new KSerializer[0]), null);
            obj3 = b10.m(descriptor2, 3, new ContextualSerializer(k0.b(LocalDate.class), null, new KSerializer[0]), null);
            String k11 = b10.k(descriptor2, 4);
            String k12 = b10.k(descriptor2, 5);
            str4 = k10;
            str = b10.k(descriptor2, 6);
            str2 = k12;
            str3 = k11;
            i10 = 127;
        } else {
            boolean z10 = true;
            int i13 = 0;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            Object obj4 = null;
            String str8 = null;
            Object obj5 = null;
            Object obj6 = null;
            while (z10) {
                int q10 = b10.q(descriptor2);
                switch (q10) {
                    case -1:
                        z10 = false;
                        i12 = 5;
                    case 0:
                        str5 = b10.k(descriptor2, 0);
                        i13 |= 1;
                        i11 = 6;
                        i12 = 5;
                    case 1:
                        obj6 = b10.m(descriptor2, 1, new ContextualSerializer(k0.b(LocalDate.class), null, new KSerializer[0]), obj6);
                        i13 |= 2;
                        i11 = 6;
                        i12 = 5;
                    case 2:
                        obj5 = b10.m(descriptor2, 2, new ContextualSerializer(k0.b(LocalDate.class), null, new KSerializer[0]), obj5);
                        i13 |= 4;
                        i11 = 6;
                        i12 = 5;
                    case 3:
                        obj4 = b10.m(descriptor2, 3, new ContextualSerializer(k0.b(LocalDate.class), null, new KSerializer[0]), obj4);
                        i13 |= 8;
                        i11 = 6;
                        i12 = 5;
                    case 4:
                        str8 = b10.k(descriptor2, 4);
                        i13 |= 16;
                    case 5:
                        str7 = b10.k(descriptor2, i12);
                        i13 |= 32;
                    case 6:
                        str6 = b10.k(descriptor2, i11);
                        i13 |= 64;
                    default:
                        throw new l(q10);
                }
            }
            obj = obj6;
            str2 = str7;
            obj3 = obj4;
            obj2 = obj5;
            i10 = i13;
            str = str6;
            str3 = str8;
            str4 = str5;
        }
        b10.c(descriptor2);
        return new Recovery(i10, str4, (LocalDate) obj, (LocalDate) obj2, (LocalDate) obj3, str3, str2, str, (h1) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, Recovery recovery) {
        t.e(encoder, "encoder");
        t.e(recovery, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        jf.d b10 = encoder.b(descriptor2);
        Recovery.c(recovery, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // kf.v
    public KSerializer<?>[] typeParametersSerializers() {
        return v.a.a(this);
    }
}
