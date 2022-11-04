package de.rki.covpass.sdk.ticketing.data.validate;

import hc.t;
import java.util.List;
import jf.c;
import jf.d;
import kf.d0;
import kf.f;
import kf.k1;
import kf.s;
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
import x9.a;
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"de/rki/covpass/sdk/ticketing/data/validate/BookingValidationResponse.$serializer", "Lkf/v;", "Lde/rki/covpass/sdk/ticketing/data/validate/BookingValidationResponse;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class BookingValidationResponse$$serializer implements v<BookingValidationResponse> {
    public static final BookingValidationResponse$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        BookingValidationResponse$$serializer bookingValidationResponse$$serializer = new BookingValidationResponse$$serializer();
        INSTANCE = bookingValidationResponse$$serializer;
        x0 x0Var = new x0("de.rki.covpass.sdk.ticketing.data.validate.BookingValidationResponse", bookingValidationResponse$$serializer, 8);
        x0Var.c("result", false);
        x0Var.c("sub", false);
        x0Var.c("iss", false);
        x0Var.c("exp", true);
        x0Var.c("category", true);
        x0Var.c("confirmation", false);
        x0Var.c("iat", false);
        x0Var.c("results", false);
        descriptor = x0Var;
    }

    private BookingValidationResponse$$serializer() {
    }

    @Override // kf.v
    public KSerializer<?>[] childSerializers() {
        k1 k1Var = k1.f15181a;
        d0 d0Var = d0.f15152a;
        return new KSerializer[]{new s("de.rki.covpass.sdk.ticketing.data.validate.BookingPortalValidationResponseResult", a.values()), k1Var, k1Var, BuiltinSerializersKt.p(d0Var), BuiltinSerializersKt.p(new f(k1Var)), k1Var, d0Var, new f(BookingPortalValidationResponseResultItem$$serializer.INSTANCE)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r6v1 */
    @Override // kotlinx.serialization.b
    public BookingValidationResponse deserialize(Decoder decoder) {
        int i10;
        String str;
        Object obj;
        String str2;
        String str3;
        Object obj2;
        int i11;
        Object obj3;
        Object obj4;
        char c10;
        t.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i12 = 7;
        int i13 = 6;
        if (b10.r()) {
            obj4 = b10.C(descriptor2, 0, new s("de.rki.covpass.sdk.ticketing.data.validate.BookingPortalValidationResponseResult", a.values()), null);
            str3 = b10.k(descriptor2, 1);
            String k10 = b10.k(descriptor2, 2);
            obj2 = b10.m(descriptor2, 3, d0.f15152a, null);
            Object m10 = b10.m(descriptor2, 4, new f(k1.f15181a), null);
            String k11 = b10.k(descriptor2, 5);
            int x10 = b10.x(descriptor2, 6);
            obj3 = b10.C(descriptor2, 7, new f(BookingPortalValidationResponseResultItem$$serializer.INSTANCE), null);
            i10 = x10;
            str = k11;
            i11 = 255;
            obj = m10;
            str2 = k10;
        } else {
            boolean z10 = true;
            int i14 = 0;
            Object obj5 = null;
            obj = null;
            Object obj6 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Object obj7 = null;
            int i15 = 0;
            while (z10) {
                int q10 = b10.q(descriptor2);
                switch (q10) {
                    case -1:
                        z10 = false;
                        i13 = 6;
                    case 0:
                        obj6 = b10.C(descriptor2, 0, new s("de.rki.covpass.sdk.ticketing.data.validate.BookingPortalValidationResponseResult", a.values()), obj6);
                        i15 |= 1;
                        i12 = 7;
                        i13 = 6;
                    case 1:
                        i15 |= 2;
                        str4 = b10.k(descriptor2, 1);
                        i12 = 7;
                    case 2:
                        c10 = 3;
                        str5 = b10.k(descriptor2, 2);
                        i15 |= 4;
                        i12 = 7;
                    case 3:
                        c10 = 3;
                        obj7 = b10.m(descriptor2, 3, d0.f15152a, obj7);
                        i15 |= 8;
                        i12 = 7;
                    case 4:
                        obj = b10.m(descriptor2, 4, new f(k1.f15181a), obj);
                        i15 |= 16;
                    case 5:
                        str6 = b10.k(descriptor2, 5);
                        i15 |= 32;
                    case 6:
                        i14 = b10.x(descriptor2, i13);
                        i15 |= 64;
                    case 7:
                        obj5 = b10.C(descriptor2, i12, new f(BookingPortalValidationResponseResultItem$$serializer.INSTANCE), obj5);
                        i15 |= 128;
                    default:
                        throw new l(q10);
                }
            }
            obj3 = obj5;
            obj2 = obj7;
            i11 = i15;
            str3 = str4;
            str2 = str5;
            str = str6;
            i10 = i14;
            obj4 = obj6;
        }
        b10.c(descriptor2);
        return new BookingValidationResponse(i11, obj4, str3, str2, obj2, (List) obj, str, i10, obj3, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, BookingValidationResponse bookingValidationResponse) {
        t.e(encoder, "encoder");
        t.e(bookingValidationResponse, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b10 = encoder.b(descriptor2);
        BookingValidationResponse.a(bookingValidationResponse, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // kf.v
    public KSerializer<?>[] typeParametersSerializers() {
        return v.a.a(this);
    }
}
