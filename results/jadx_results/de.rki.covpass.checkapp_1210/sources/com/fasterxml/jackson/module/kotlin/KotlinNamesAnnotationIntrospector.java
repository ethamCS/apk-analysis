package com.fasterxml.jackson.module.kotlin;

import bf.b;
import bf.x;
import bf.y;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.util.BeanUtil;
import hc.t;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import oc.d;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u001d¢\u0006\u0004\b#\u0010$J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0010H\u0016R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR!\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinNamesAnnotationIntrospector;", "Lcom/fasterxml/jackson/databind/introspect/NopAnnotationIntrospector;", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;", "param", BuildConfig.FLAVOR, "findKotlinParameterName", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;", "member", "findImplicitPropertyName", "Lcom/fasterxml/jackson/databind/cfg/MapperConfig;", "config", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;", "field", "Lcom/fasterxml/jackson/databind/PropertyName;", "implName", "findRenameByField", "Lcom/fasterxml/jackson/databind/introspect/Annotated;", BuildConfig.FLAVOR, "hasCreatorAnnotation", "Lcom/fasterxml/jackson/module/kotlin/KotlinModule;", "module", "Lcom/fasterxml/jackson/module/kotlin/KotlinModule;", "getModule", "()Lcom/fasterxml/jackson/module/kotlin/KotlinModule;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "cache", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "getCache", "()Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", BuildConfig.FLAVOR, "Loc/d;", "ignoredClassesForImplyingJsonCreator", "Ljava/util/Set;", "getIgnoredClassesForImplyingJsonCreator", "()Ljava/util/Set;", "<init>", "(Lcom/fasterxml/jackson/module/kotlin/KotlinModule;Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;Ljava/util/Set;)V", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class KotlinNamesAnnotationIntrospector extends NopAnnotationIntrospector {
    private final ReflectionCache cache;
    private final Set<d<?>> ignoredClassesForImplyingJsonCreator;
    private final KotlinModule module;

    /* JADX WARN: Multi-variable type inference failed */
    public KotlinNamesAnnotationIntrospector(KotlinModule kotlinModule, ReflectionCache reflectionCache, Set<? extends d<?>> set) {
        t.e(kotlinModule, "module");
        t.e(reflectionCache, "cache");
        t.e(set, "ignoredClassesForImplyingJsonCreator");
        this.module = kotlinModule;
        this.cache = reflectionCache;
        this.ignoredClassesForImplyingJsonCreator = set;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0083 A[Catch: b0 -> 0x00b5, TryCatch #1 {b0 -> 0x00b5, blocks: (B:25:0x0061, B:28:0x006b, B:31:0x0072, B:34:0x007b, B:35:0x007f, B:37:0x0083, B:38:0x008a, B:41:0x0091, B:44:0x0098, B:48:0x00a1, B:51:0x00a8, B:54:0x00b1), top: B:60:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a A[Catch: b0 -> 0x00b5, TryCatch #1 {b0 -> 0x00b5, blocks: (B:25:0x0061, B:28:0x006b, B:31:0x0072, B:34:0x007b, B:35:0x007f, B:37:0x0083, B:38:0x008a, B:41:0x0091, B:44:0x0098, B:48:0x00a1, B:51:0x00a8, B:54:0x00b1), top: B:60:0x0061 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String findKotlinParameterName(com.fasterxml.jackson.databind.introspect.AnnotatedParameter r6) {
        /*
            r5 = this;
            java.lang.Class r0 = r6.getDeclaringClass()
            java.lang.String r1 = "param.declaringClass"
            hc.t.d(r0, r1)
            boolean r0 = com.fasterxml.jackson.module.kotlin.KotlinModuleKt.isKotlinClass(r0)
            r1 = 0
            if (r0 == 0) goto Lb5
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r0 = r6.getOwner()
            java.lang.reflect.Member r0 = r0.getMember()
            boolean r2 = r0 instanceof java.lang.reflect.Constructor
            r3 = 0
            if (r2 == 0) goto L5d
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            java.lang.Class[] r2 = r0.getParameterTypes()
            int r2 = r2.length
            oc.g r4 = qc.c.h(r0)     // Catch: java.lang.Throwable -> L36
            if (r4 != 0) goto L2b
            goto L36
        L2b:
            java.util.List r4 = r4.getParameters()     // Catch: java.lang.Throwable -> L36
            if (r4 != 0) goto L32
            goto L36
        L32:
            int r3 = r4.size()     // Catch: java.lang.Throwable -> L36
        L36:
            if (r3 <= 0) goto Lb5
            if (r3 != r2) goto Lb5
            oc.g r0 = qc.c.h(r0)
            if (r0 != 0) goto L42
            goto Lb5
        L42:
            java.util.List r0 = r0.getParameters()
            if (r0 != 0) goto L4a
            goto Lb5
        L4a:
            int r6 = r6.getIndex()
            java.lang.Object r6 = r0.get(r6)
            oc.j r6 = (oc.j) r6
            if (r6 != 0) goto L58
            goto Lb5
        L58:
            java.lang.String r1 = r6.getName()
            goto Lb5
        L5d:
            boolean r2 = r0 instanceof java.lang.reflect.Method
            if (r2 == 0) goto Lb5
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: rc.b0 -> Lb5
            oc.g r0 = qc.c.i(r0)     // Catch: rc.b0 -> Lb5
            if (r0 != 0) goto L6b
        L69:
            r2 = r1
            goto L7f
        L6b:
            java.util.List r2 = r0.getParameters()     // Catch: rc.b0 -> Lb5
            if (r2 != 0) goto L72
            goto L69
        L72:
            java.lang.Object r2 = ub.s.X(r2)     // Catch: rc.b0 -> Lb5
            oc.j r2 = (oc.j) r2     // Catch: rc.b0 -> Lb5
            if (r2 != 0) goto L7b
            goto L69
        L7b:
            oc.j$a r2 = r2.h()     // Catch: rc.b0 -> Lb5
        L7f:
            oc.j$a r4 = oc.j.a.VALUE     // Catch: rc.b0 -> Lb5
            if (r2 == r4) goto L8a
            int r6 = r6.getIndex()     // Catch: rc.b0 -> Lb5
            int r6 = r6 + 1
            goto L8e
        L8a:
            int r6 = r6.getIndex()     // Catch: rc.b0 -> Lb5
        L8e:
            if (r0 != 0) goto L91
            goto L9c
        L91:
            java.util.List r2 = r0.getParameters()     // Catch: rc.b0 -> Lb5
            if (r2 != 0) goto L98
            goto L9c
        L98:
            int r3 = r2.size()     // Catch: rc.b0 -> Lb5
        L9c:
            if (r3 <= r6) goto Lb5
            if (r0 != 0) goto La1
            goto Lb5
        La1:
            java.util.List r0 = r0.getParameters()     // Catch: rc.b0 -> Lb5
            if (r0 != 0) goto La8
            goto Lb5
        La8:
            java.lang.Object r6 = r0.get(r6)     // Catch: rc.b0 -> Lb5
            oc.j r6 = (oc.j) r6     // Catch: rc.b0 -> Lb5
            if (r6 != 0) goto Lb1
            goto Lb5
        Lb1:
            java.lang.String r1 = r6.getName()     // Catch: rc.b0 -> Lb5
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.module.kotlin.KotlinNamesAnnotationIntrospector.findKotlinParameterName(com.fasterxml.jackson.databind.introspect.AnnotatedParameter):java.lang.String");
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        boolean isInlineClass;
        boolean I;
        boolean I2;
        boolean M;
        String J0;
        String O0;
        String d10;
        boolean M2;
        String J02;
        String O02;
        String d11;
        t.e(annotatedMember, "member");
        if (annotatedMember instanceof AnnotatedMethod) {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            isInlineClass = KotlinNamesAnnotationIntrospectorKt.isInlineClass(annotatedMethod);
            if (isInlineClass) {
                String name = annotatedMethod.getName();
                t.d(name, "member.name");
                I = x.I(name, "get", false, 2, null);
                if (I) {
                    String name2 = annotatedMethod.getName();
                    t.d(name2, "member.name");
                    M2 = y.M(name2, '-', false, 2, null);
                    if (M2 && annotatedMethod.getParameterCount() == 0) {
                        String name3 = annotatedMethod.getName();
                        t.d(name3, "member.name");
                        J02 = y.J0(name3, "get", null, 2, null);
                        if (J02.length() > 0) {
                            StringBuilder sb2 = new StringBuilder();
                            char charAt = J02.charAt(0);
                            Locale locale = Locale.getDefault();
                            t.d(locale, "getDefault()");
                            d11 = b.d(charAt, locale);
                            sb2.append(d11.toString());
                            String substring = J02.substring(1);
                            t.d(substring, "(this as java.lang.String).substring(startIndex)");
                            sb2.append(substring);
                            J02 = sb2.toString();
                        }
                        O02 = y.O0(J02, '-', null, 2, null);
                        return O02;
                    }
                }
                String name4 = annotatedMethod.getName();
                t.d(name4, "member.name");
                I2 = x.I(name4, "is", false, 2, null);
                if (I2) {
                    String name5 = annotatedMethod.getName();
                    t.d(name5, "member.name");
                    M = y.M(name5, '-', false, 2, null);
                    if (M && annotatedMethod.getParameterCount() == 0) {
                        String name6 = annotatedMethod.getName();
                        t.d(name6, "member.name");
                        J0 = y.J0(name6, "is", null, 2, null);
                        if (J0.length() > 0) {
                            StringBuilder sb3 = new StringBuilder();
                            char charAt2 = J0.charAt(0);
                            Locale locale2 = Locale.getDefault();
                            t.d(locale2, "getDefault()");
                            d10 = b.d(charAt2, locale2);
                            sb3.append(d10.toString());
                            String substring2 = J0.substring(1);
                            t.d(substring2, "(this as java.lang.String).substring(startIndex)");
                            sb3.append(substring2);
                            J0 = sb3.toString();
                        }
                        O0 = y.O0(J0, '-', null, 2, null);
                        return O0;
                    }
                }
                return null;
            }
        }
        if (annotatedMember instanceof AnnotatedParameter) {
            return findKotlinParameterName((AnnotatedParameter) annotatedMember);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findRenameByField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, PropertyName propertyName) {
        boolean I;
        String stdManglePropertyName;
        t.e(mapperConfig, "config");
        t.e(annotatedField, "field");
        t.e(propertyName, "implName");
        String simpleName = propertyName.getSimpleName();
        Class<?> declaringClass = annotatedField.getDeclaringClass();
        t.d(declaringClass, "field.declaringClass");
        if (KotlinModuleKt.isKotlinClass(declaringClass)) {
            t.d(simpleName, "origSimple");
            I = x.I(simpleName, "is", false, 2, null);
            if (I && (stdManglePropertyName = BeanUtil.stdManglePropertyName(simpleName, 2)) != null && !stdManglePropertyName.equals(simpleName)) {
                return PropertyName.construct(stdManglePropertyName);
            }
        }
        return null;
    }

    public final ReflectionCache getCache() {
        return this.cache;
    }

    public final Set<d<?>> getIgnoredClassesForImplyingJsonCreator() {
        return this.ignoredClassesForImplyingJsonCreator;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean hasCreatorAnnotation(Annotated annotated) {
        t.e(annotated, "member");
        if (annotated instanceof AnnotatedConstructor) {
            AnnotatedConstructor annotatedConstructor = (AnnotatedConstructor) annotated;
            if (annotatedConstructor.getDeclaringClass().isEnum() || annotatedConstructor.getParameterCount() <= 0) {
                return false;
            }
            Class<?> declaringClass = annotatedConstructor.getDeclaringClass();
            t.d(declaringClass, "member.declaringClass");
            if (!KotlinModuleKt.isKotlinClass(declaringClass)) {
                return false;
            }
            return this.cache.checkConstructorIsCreatorAnnotated(annotatedConstructor, new KotlinNamesAnnotationIntrospector$hasCreatorAnnotation$1(this, annotated));
        }
        return false;
    }
}
