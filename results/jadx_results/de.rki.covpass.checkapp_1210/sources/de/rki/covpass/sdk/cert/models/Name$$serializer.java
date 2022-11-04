package de.rki.covpass.sdk.cert.models;

import hc.t;
import kf.h1;
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
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"de/rki/covpass/sdk/cert/models/Name.$serializer", "Lkf/v;", "Lde/rki/covpass/sdk/cert/models/Name;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class Name$$serializer implements v<Name> {
    public static final Name$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        Name$$serializer name$$serializer = new Name$$serializer();
        INSTANCE = name$$serializer;
        x0 x0Var = new x0("de.rki.covpass.sdk.cert.models.Name", name$$serializer, 4);
        x0Var.c("gn", true);
        x0Var.c("fn", true);
        x0Var.c("gnt", true);
        x0Var.c("fnt", true);
        descriptor = x0Var;
    }

    private Name$$serializer() {
    }

    @Override // kf.v
    public KSerializer<?>[] childSerializers() {
        k1 k1Var = k1.f15181a;
        return new KSerializer[]{BuiltinSerializersKt.p(k1Var), BuiltinSerializersKt.p(k1Var), BuiltinSerializersKt.p(k1Var), k1Var};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r6v1 */
    @Override // kotlinx.serialization.b
    public Name deserialize(Decoder decoder) {
        String str;
        Object obj;
        Object obj2;
        int i10;
        Object obj3;
        t.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        jf.c b10 = decoder.b(descriptor2);
        Object obj4 = null;
        if (b10.r()) {
            k1 k1Var = k1.f15181a;
            obj2 = b10.m(descriptor2, 0, k1Var, null);
            obj = b10.m(descriptor2, 1, k1Var, null);
            obj3 = b10.m(descriptor2, 2, k1Var, null);
            i10 = 15;
            str = b10.k(descriptor2, 3);
        } else {
            Object obj5 = null;
            Object obj6 = null;
            String str2 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int q10 = b10.q(descriptor2);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    obj4 = b10.m(descriptor2, 0, k1.f15181a, obj4);
                    i11 |= 1;
                } else if (q10 == 1) {
                    obj5 = b10.m(descriptor2, 1, k1.f15181a, obj5);
                    i11 |= 2;
                } else if (q10 == 2) {
                    obj6 = b10.m(descriptor2, 2, k1.f15181a, obj6);
                    i11 |= 4;
                } else if (q10 != 3) {
                    throw new l(q10);
                } else {
                    str2 = b10.k(descriptor2, 3);
                    i11 |= 8;
                }
            }
            i10 = i11;
            obj2 = obj4;
            obj = obj5;
            obj3 = obj6;
            str = str2;
        }
        b10.c(descriptor2);
        return new Name(i10, (String) obj2, (String) obj, (String) obj3, str, (h1) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, Name name) {
        t.e(encoder, "encoder");
        t.e(name, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        jf.d b10 = encoder.b(descriptor2);
        Name.h(name, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // kf.v
    public KSerializer<?>[] typeParametersSerializers() {
        return v.a.a(this);
    }
}
