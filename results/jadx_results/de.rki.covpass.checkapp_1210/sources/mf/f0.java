package mf;

import kotlin.Metadata;
import kotlinx.serialization.json.JsonObject;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Llf/a;", BuildConfig.FLAVOR, "discriminator", "Lkotlinx/serialization/json/JsonObject;", "element", "Lkotlinx/serialization/b;", "deserializer", "a", "(Llf/a;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/b;)Ljava/lang/Object;", "kotlinx-serialization-json"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class f0 {
    public static final <T> T a(lf.a aVar, String str, JsonObject jsonObject, kotlinx.serialization.b<T> bVar) {
        hc.t.e(aVar, "<this>");
        hc.t.e(str, "discriminator");
        hc.t.e(jsonObject, "element");
        hc.t.e(bVar, "deserializer");
        return (T) new u(aVar, jsonObject, str, bVar.getDescriptor()).y(bVar);
    }
}
