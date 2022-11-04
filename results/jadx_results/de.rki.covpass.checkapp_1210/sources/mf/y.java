package mf;

import hc.k0;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.conscrypt.BuildConfig;
import p000if.i;
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000\u001a'\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b*\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u001a\u0014\u0010\u0019\u001a\u00020\u0004*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¨\u0006\u001a"}, d2 = {"Lkotlinx/serialization/j;", "serializer", BuildConfig.FLAVOR, "actualSerializer", BuildConfig.FLAVOR, "classDiscriminator", "Ltb/e0;", "f", "Lif/i;", "kind", "b", "T", "Llf/f;", "Lkotlinx/serialization/b;", "deserializer", "d", "(Llf/f;Lkotlinx/serialization/b;)Ljava/lang/Object;", "type", "Lkotlinx/serialization/json/JsonObject;", "jsonTree", BuildConfig.FLAVOR, "e", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Llf/a;", "json", "c", "kotlinx-serialization-json"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class y {
    public static final /* synthetic */ void a(kotlinx.serialization.j jVar, kotlinx.serialization.j jVar2, String str) {
        f(jVar, jVar2, str);
    }

    public static final void b(p000if.i iVar) {
        hc.t.e(iVar, "kind");
        if (!(iVar instanceof i.b)) {
            if (iVar instanceof p000if.e) {
                throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
            }
            if (iVar instanceof p000if.d) {
                throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
            }
            return;
        }
        throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
    }

    public static final String c(SerialDescriptor serialDescriptor, lf.a aVar) {
        hc.t.e(serialDescriptor, "<this>");
        hc.t.e(aVar, "json");
        for (Annotation annotation : serialDescriptor.j()) {
            if (annotation instanceof lf.d) {
                return ((lf.d) annotation).discriminator();
            }
        }
        return aVar.f().c();
    }

    public static final <T> T d(lf.f fVar, kotlinx.serialization.b<T> bVar) {
        JsonPrimitive i10;
        hc.t.e(fVar, "<this>");
        hc.t.e(bVar, "deserializer");
        if (!(bVar instanceof kf.b) || fVar.d().f().k()) {
            return bVar.deserialize(fVar);
        }
        JsonElement v10 = fVar.v();
        SerialDescriptor descriptor = bVar.getDescriptor();
        if (!(v10 instanceof JsonObject)) {
            throw q.d(-1, "Expected " + k0.b(JsonObject.class) + " as the serialized body of " + descriptor.l() + ", but had " + k0.b(v10.getClass()));
        }
        JsonObject jsonObject = (JsonObject) v10;
        String c10 = c(bVar.getDescriptor(), fVar.d());
        JsonElement jsonElement = (JsonElement) jsonObject.get(c10);
        String a10 = (jsonElement == null || (i10 = lf.g.i(jsonElement)) == null) ? null : i10.a();
        kotlinx.serialization.b<? extends T> c11 = ((kf.b) bVar).c(fVar, a10);
        if (c11 != null) {
            return (T) f0.a(fVar.d(), c10, jsonObject, c11);
        }
        e(a10, jsonObject);
        throw new tb.i();
    }

    private static final Void e(String str, JsonObject jsonObject) {
        String str2;
        if (str == null) {
            str2 = "missing class discriminator ('null')";
        } else {
            str2 = "class discriminator '" + str + '\'';
        }
        throw q.e(-1, "Polymorphic serializer was not found for " + str2, jsonObject.toString());
    }

    public static final void f(kotlinx.serialization.j<?> jVar, kotlinx.serialization.j<Object> jVar2, String str) {
    }
}
