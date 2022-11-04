package com.fasterxml.jackson.module.kotlin;

import fc.a;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¨\u0006\u0004"}, d2 = {"objectSingletonInstance", BuildConfig.FLAVOR, "beanClass", "Ljava/lang/Class;", "jackson-module-kotlin"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KotlinBeanDeserializerModifierKt {
    public static final Object objectSingletonInstance(Class<?> cls) {
        if (!KotlinModuleKt.isKotlinClass(cls)) {
            return null;
        }
        return a.e(cls).I();
    }
}
