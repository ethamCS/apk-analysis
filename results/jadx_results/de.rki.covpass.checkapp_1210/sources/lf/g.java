package lf;

import bf.v;
import bf.w;
import hc.k0;
import hc.t;
import kotlin.Metadata;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;
import mf.e0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H\u0002\"\u0015\u0010\n\u001a\u00020\u0002*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0015\u0010\u000e\u001a\u00020\u000b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0015\u0010\u0012\u001a\u00020\u000f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u000f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0019\u001a\u00020\u0016*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u0016*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0015\u0010 \u001a\u00020\u001d*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u0017\u0010$\u001a\u0004\u0018\u00010!*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0017\u0010'\u001a\u0004\u0018\u00010\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {BuildConfig.FLAVOR, "value", "Lkotlinx/serialization/json/JsonPrimitive;", "a", "Lkotlinx/serialization/json/JsonElement;", "element", BuildConfig.FLAVOR, "b", "i", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;", "jsonPrimitive", BuildConfig.FLAVOR, "h", "(Lkotlinx/serialization/json/JsonPrimitive;)I", "int", BuildConfig.FLAVOR, "j", "(Lkotlinx/serialization/json/JsonPrimitive;)J", "long", "k", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;", "longOrNull", BuildConfig.FLAVOR, "e", "(Lkotlinx/serialization/json/JsonPrimitive;)D", "double", "f", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;", "doubleOrNull", BuildConfig.FLAVOR, "g", "(Lkotlinx/serialization/json/JsonPrimitive;)F", "float", BuildConfig.FLAVOR, "c", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;", "booleanOrNull", "d", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;", "contentOrNull", "kotlinx-serialization-json"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class g {
    public static final JsonPrimitive a(String str) {
        return str == null ? JsonNull.f15603a : new m(str, true);
    }

    private static final Void b(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + k0.b(jsonElement.getClass()) + " is not a " + str);
    }

    public static final Boolean c(JsonPrimitive jsonPrimitive) {
        t.e(jsonPrimitive, "<this>");
        return e0.d(jsonPrimitive.a());
    }

    public static final String d(JsonPrimitive jsonPrimitive) {
        t.e(jsonPrimitive, "<this>");
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.a();
    }

    public static final double e(JsonPrimitive jsonPrimitive) {
        t.e(jsonPrimitive, "<this>");
        return Double.parseDouble(jsonPrimitive.a());
    }

    public static final Double f(JsonPrimitive jsonPrimitive) {
        Double j10;
        t.e(jsonPrimitive, "<this>");
        j10 = v.j(jsonPrimitive.a());
        return j10;
    }

    public static final float g(JsonPrimitive jsonPrimitive) {
        t.e(jsonPrimitive, "<this>");
        return Float.parseFloat(jsonPrimitive.a());
    }

    public static final int h(JsonPrimitive jsonPrimitive) {
        t.e(jsonPrimitive, "<this>");
        return Integer.parseInt(jsonPrimitive.a());
    }

    public static final JsonPrimitive i(JsonElement jsonElement) {
        t.e(jsonElement, "<this>");
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        b(jsonElement, "JsonPrimitive");
        throw new tb.i();
    }

    public static final long j(JsonPrimitive jsonPrimitive) {
        t.e(jsonPrimitive, "<this>");
        return Long.parseLong(jsonPrimitive.a());
    }

    public static final Long k(JsonPrimitive jsonPrimitive) {
        Long n10;
        t.e(jsonPrimitive, "<this>");
        n10 = w.n(jsonPrimitive.a());
        return n10;
    }
}
