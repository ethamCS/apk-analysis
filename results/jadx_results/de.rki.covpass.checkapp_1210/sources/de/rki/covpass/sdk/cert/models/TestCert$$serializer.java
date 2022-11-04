package de.rki.covpass.sdk.cert.models;

import hc.k0;
import hc.t;
import j$.time.ZonedDateTime;
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
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"de/rki/covpass/sdk/cert/models/TestCert.$serializer", "Lkf/v;", "Lde/rki/covpass/sdk/cert/models/TestCert;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class TestCert$$serializer implements v<TestCert> {
    public static final TestCert$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        TestCert$$serializer testCert$$serializer = new TestCert$$serializer();
        INSTANCE = testCert$$serializer;
        x0 x0Var = new x0("de.rki.covpass.sdk.cert.models.TestCert", testCert$$serializer, 10);
        x0Var.c("tg", true);
        x0Var.c("tt", true);
        x0Var.c("nm", true);
        x0Var.c("ma", true);
        x0Var.c("sc", true);
        x0Var.c("tr", true);
        x0Var.c("tc", true);
        x0Var.c("co", true);
        x0Var.c("is", true);
        x0Var.c("ci", true);
        descriptor = x0Var;
    }

    private TestCert$$serializer() {
    }

    @Override // kf.v
    public KSerializer<?>[] childSerializers() {
        k1 k1Var = k1.f15181a;
        return new KSerializer[]{k1Var, k1Var, BuiltinSerializersKt.p(k1Var), BuiltinSerializersKt.p(k1Var), BuiltinSerializersKt.p(new ContextualSerializer(k0.b(ZonedDateTime.class), null, new KSerializer[0])), k1Var, k1Var, k1Var, k1Var, k1Var};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r9v1 */
    @Override // kotlinx.serialization.b
    public TestCert deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        char c10;
        t.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        jf.c b10 = decoder.b(descriptor2);
        int i11 = 9;
        int i12 = 7;
        int i13 = 6;
        if (b10.r()) {
            String k10 = b10.k(descriptor2, 0);
            String k11 = b10.k(descriptor2, 1);
            k1 k1Var = k1.f15181a;
            obj = b10.m(descriptor2, 2, k1Var, null);
            obj3 = b10.m(descriptor2, 3, k1Var, null);
            obj2 = b10.m(descriptor2, 4, new ContextualSerializer(k0.b(ZonedDateTime.class), null, new KSerializer[0]), null);
            String k12 = b10.k(descriptor2, 5);
            String k13 = b10.k(descriptor2, 6);
            String k14 = b10.k(descriptor2, 7);
            String k15 = b10.k(descriptor2, 8);
            str = b10.k(descriptor2, 9);
            str3 = k14;
            str4 = k13;
            str5 = k12;
            str2 = k15;
            str6 = k11;
            i10 = 1023;
            str7 = k10;
        } else {
            boolean z10 = true;
            int i14 = 0;
            String str8 = null;
            Object obj4 = null;
            Object obj5 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            str5 = null;
            String str12 = null;
            Object obj6 = null;
            String str13 = null;
            while (z10) {
                int q10 = b10.q(descriptor2);
                switch (q10) {
                    case -1:
                        z10 = false;
                        i11 = 9;
                        i13 = 6;
                    case 0:
                        str8 = b10.k(descriptor2, 0);
                        i14 |= 1;
                        i11 = 9;
                        i12 = 7;
                        i13 = 6;
                    case 1:
                        str13 = b10.k(descriptor2, 1);
                        i14 |= 2;
                        i11 = 9;
                        i12 = 7;
                        i13 = 6;
                    case 2:
                        obj6 = b10.m(descriptor2, 2, k1.f15181a, obj6);
                        i14 |= 4;
                        i11 = 9;
                        i12 = 7;
                        i13 = 6;
                    case 3:
                        c10 = 4;
                        obj5 = b10.m(descriptor2, 3, k1.f15181a, obj5);
                        i14 |= 8;
                        i11 = 9;
                        i12 = 7;
                    case 4:
                        c10 = 4;
                        obj4 = b10.m(descriptor2, 4, new ContextualSerializer(k0.b(ZonedDateTime.class), null, new KSerializer[0]), obj4);
                        i14 |= 16;
                        i11 = 9;
                        i12 = 7;
                    case 5:
                        str5 = b10.k(descriptor2, 5);
                        i14 |= 32;
                    case 6:
                        str11 = b10.k(descriptor2, i13);
                        i14 |= 64;
                    case 7:
                        str10 = b10.k(descriptor2, i12);
                        i14 |= 128;
                    case 8:
                        str12 = b10.k(descriptor2, 8);
                        i14 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    case 9:
                        str9 = b10.k(descriptor2, i11);
                        i14 |= 512;
                    default:
                        throw new l(q10);
                }
            }
            Object obj7 = obj6;
            str7 = str8;
            obj2 = obj4;
            str3 = str10;
            str2 = str12;
            str6 = str13;
            obj = obj7;
            str = str9;
            str4 = str11;
            Object obj8 = obj5;
            i10 = i14;
            obj3 = obj8;
        }
        b10.c(descriptor2);
        return new TestCert(i10, str7, str6, (String) obj, (String) obj3, (ZonedDateTime) obj2, str5, str4, str3, str2, str, (h1) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, TestCert testCert) {
        t.e(encoder, "encoder");
        t.e(testCert, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        jf.d b10 = encoder.b(descriptor2);
        TestCert.d(testCert, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // kf.v
    public KSerializer<?>[] typeParametersSerializers() {
        return v.a.a(this);
    }
}
