package de.rki.covpass.commonapp.license.models;

import hc.t;
import java.util.List;
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
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"de/rki/covpass/commonapp/license/models/OpenSourceItem.$serializer", "Lkf/v;", "Lde/rki/covpass/commonapp/license/models/OpenSourceItem;", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class OpenSourceItem$$serializer implements v<OpenSourceItem> {
    public static final OpenSourceItem$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        OpenSourceItem$$serializer openSourceItem$$serializer = new OpenSourceItem$$serializer();
        INSTANCE = openSourceItem$$serializer;
        x0 x0Var = new x0("de.rki.covpass.commonapp.license.models.OpenSourceItem", openSourceItem$$serializer, 8);
        x0Var.c("project", false);
        x0Var.c("description", false);
        x0Var.c("version", false);
        x0Var.c("developers", false);
        x0Var.c("url", false);
        x0Var.c("year", false);
        x0Var.c("licenses", false);
        x0Var.c("dependency", false);
        descriptor = x0Var;
    }

    private OpenSourceItem$$serializer() {
    }

    @Override // kf.v
    public KSerializer<?>[] childSerializers() {
        k1 k1Var = k1.f15181a;
        return new KSerializer[]{BuiltinSerializersKt.p(k1Var), BuiltinSerializersKt.p(k1Var), BuiltinSerializersKt.p(k1Var), BuiltinSerializersKt.p(new f(k1Var)), BuiltinSerializersKt.p(k1Var), BuiltinSerializersKt.p(k1Var), BuiltinSerializersKt.p(new f(License$$serializer.INSTANCE)), BuiltinSerializersKt.p(k1Var)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r7v1 */
    @Override // kotlinx.serialization.b
    public OpenSourceItem deserialize(Decoder decoder) {
        String str;
        List list;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i10;
        Object obj6;
        String str2;
        List list2;
        t.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i11 = 7;
        int i12 = 6;
        Object obj7 = null;
        if (b10.r()) {
            k1 k1Var = k1.f15181a;
            obj = b10.m(descriptor2, 0, k1Var, null);
            ?? m10 = b10.m(descriptor2, 1, k1Var, null);
            obj2 = b10.m(descriptor2, 2, k1Var, null);
            obj4 = b10.m(descriptor2, 3, new f(k1Var), null);
            obj3 = b10.m(descriptor2, 4, k1Var, null);
            obj5 = b10.m(descriptor2, 5, k1Var, null);
            ?? m11 = b10.m(descriptor2, 6, new f(License$$serializer.INSTANCE), null);
            obj6 = b10.m(descriptor2, 7, k1Var, null);
            str = m10;
            list = m11;
            i10 = 255;
        } else {
            int i13 = 0;
            boolean z10 = true;
            Object obj8 = null;
            Object obj9 = null;
            List list3 = null;
            String str3 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            while (z10) {
                int q10 = b10.q(descriptor2);
                switch (q10) {
                    case -1:
                        z10 = false;
                        str3 = str3;
                        i12 = 6;
                        break;
                    case 0:
                        obj7 = b10.m(descriptor2, 0, k1.f15181a, obj7);
                        i13 |= 1;
                        str2 = str3;
                        i11 = 7;
                        str3 = str2;
                        i12 = 6;
                        break;
                    case 1:
                        i13 |= 2;
                        str2 = b10.m(descriptor2, 1, k1.f15181a, str3);
                        i11 = 7;
                        str3 = str2;
                        i12 = 6;
                        break;
                    case 2:
                        obj10 = b10.m(descriptor2, 2, k1.f15181a, obj10);
                        i13 |= 4;
                        str2 = str3;
                        i11 = 7;
                        str3 = str2;
                        i12 = 6;
                        break;
                    case 3:
                        obj11 = b10.m(descriptor2, 3, new f(k1.f15181a), obj11);
                        i13 |= 8;
                        i11 = 7;
                        break;
                    case 4:
                        obj12 = b10.m(descriptor2, 4, k1.f15181a, obj12);
                        i13 |= 16;
                        list2 = list3;
                        i11 = 7;
                        list3 = list2;
                        break;
                    case 5:
                        obj9 = b10.m(descriptor2, 5, k1.f15181a, obj9);
                        i13 |= 32;
                        list2 = list3;
                        i11 = 7;
                        list3 = list2;
                        break;
                    case 6:
                        i13 |= 64;
                        list2 = b10.m(descriptor2, i12, new f(License$$serializer.INSTANCE), list3);
                        i11 = 7;
                        list3 = list2;
                        break;
                    case 7:
                        obj8 = b10.m(descriptor2, i11, k1.f15181a, obj8);
                        i13 |= 128;
                        list3 = list3;
                        break;
                    default:
                        throw new l(q10);
                }
            }
            i10 = i13;
            obj6 = obj8;
            obj5 = obj9;
            obj = obj7;
            obj2 = obj10;
            obj4 = obj11;
            obj3 = obj12;
            list = list3;
            str = str3;
        }
        b10.c(descriptor2);
        return new OpenSourceItem(i10, (String) obj, str, (String) obj2, obj4, obj3, obj5, list, (String) obj6, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, OpenSourceItem openSourceItem) {
        t.e(encoder, "encoder");
        t.e(openSourceItem, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b10 = encoder.b(descriptor2);
        OpenSourceItem.e(openSourceItem, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // kf.v
    public KSerializer<?>[] typeParametersSerializers() {
        return v.a.a(this);
    }
}
