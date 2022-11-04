package com.fasterxml.jackson.module.kotlin;

import fc.a;
import hc.t;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¨\u0006\u0003"}, d2 = {"Ljava/lang/Class;", BuildConfig.FLAVOR, "isKotlinClass", "jackson-module-kotlin"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class KotlinModuleKt {
    public static final boolean isKotlinClass(Class<?> cls) {
        t.e(cls, "<this>");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        t.d(declaredAnnotations, "declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            if (t.a(a.b(a.a(annotation)).getName(), "kotlin.Metadata")) {
                return true;
            }
        }
        return false;
    }
}
