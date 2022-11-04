package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.module.kotlin.KotlinModule;
import fc.b;
import gc.l;
import hc.t;
import java.lang.annotation.Annotation;
import java.util.BitSet;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001c\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u001a\u001c\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0000\u001a\u0006\u0010\n\u001a\u00020\t\u001a&\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u000b0\u000b*\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u001a\f\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0000\u001a\u0010\u0010\u0017\u001a\u00020\u0016*\u0006\u0012\u0002\b\u00030\u0015H\u0000¨\u0006\u0018"}, d2 = {"Lkotlin/Function1;", "Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;", "Ltb/e0;", "initializer", "Lcom/fasterxml/jackson/module/kotlin/KotlinModule;", "kotlinModule", "Lcom/fasterxml/jackson/databind/json/JsonMapper$Builder;", "Lcom/fasterxml/jackson/databind/json/JsonMapper;", "jsonMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "jacksonObjectMapper", "Lcom/fasterxml/jackson/databind/JsonMappingException;", BuildConfig.FLAVOR, "refFrom", BuildConfig.FLAVOR, "refFieldName", "kotlin.jvm.PlatformType", "wrapWithPath", BuildConfig.FLAVOR, "Ljava/util/BitSet;", "toBitSet", "Ljava/lang/Class;", BuildConfig.FLAVOR, "isUnboxableValueClass", "jackson-module-kotlin"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class ExtensionsKt {
    public static final boolean isUnboxableValueClass(Class<?> cls) {
        boolean z10;
        t.e(cls, "<this>");
        Annotation[] annotations = cls.getAnnotations();
        t.d(annotations, "annotations");
        int length = annotations.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            } else if (annotations[i10] instanceof b) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        return z10 && KotlinModuleKt.isKotlinClass(cls);
    }

    public static final ObjectMapper jacksonObjectMapper() {
        return jsonMapper(ExtensionsKt$jacksonObjectMapper$1.INSTANCE);
    }

    public static final JsonMapper jsonMapper(l<? super JsonMapper.Builder, e0> lVar) {
        t.e(lVar, "initializer");
        JsonMapper.Builder builder = JsonMapper.builder();
        t.d(builder, "builder");
        lVar.invoke(builder);
        JsonMapper build = builder.build();
        t.d(build, "builder.build()");
        return build;
    }

    public static final KotlinModule kotlinModule(l<? super KotlinModule.Builder, e0> lVar) {
        t.e(lVar, "initializer");
        KotlinModule.Builder builder = new KotlinModule.Builder();
        lVar.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ KotlinModule kotlinModule$default(l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = ExtensionsKt$kotlinModule$1.INSTANCE;
        }
        return kotlinModule(lVar);
    }

    public static final BitSet toBitSet(int i10) {
        BitSet bitSet = new BitSet(32);
        int i11 = 0;
        while (i10 != 0) {
            if (i10 % 2 != 0) {
                bitSet.set(i11);
            }
            i11++;
            i10 >>= 1;
        }
        return bitSet;
    }

    public static final JsonMappingException wrapWithPath(JsonMappingException jsonMappingException, Object obj, String str) {
        t.e(jsonMappingException, "<this>");
        t.e(str, "refFieldName");
        return JsonMappingException.wrapWithPath(jsonMappingException, obj, str);
    }
}
