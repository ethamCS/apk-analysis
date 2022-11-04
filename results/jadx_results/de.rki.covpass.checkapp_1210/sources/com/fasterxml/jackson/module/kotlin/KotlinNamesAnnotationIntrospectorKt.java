package com.fasterxml.jackson.module.kotlin;

import bf.y;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import hc.t;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"isInlineClass", BuildConfig.FLAVOR, "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;", "jackson-module-kotlin"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KotlinNamesAnnotationIntrospectorKt {
    public static final boolean isInlineClass(AnnotatedMethod annotatedMethod) {
        boolean M;
        Method[] declaredMethods = annotatedMethod.getDeclaringClass().getDeclaredMethods();
        t.d(declaredMethods, "declaringClass.declaredMethods");
        for (Method method : declaredMethods) {
            String name = method.getName();
            t.d(name, "it.name");
            M = y.M(name, '-', false, 2, null);
            if (M) {
                return true;
            }
        }
        return false;
    }
}
