package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class AnnotatedMethodCollector extends CollectorBase {
    private final boolean _collectAnnotations;
    private final ClassIntrospector.MixInResolver _mixInResolver;

    /* loaded from: classes.dex */
    public static final class MethodBuilder {
        public AnnotationCollector annotations;
        public Method method;
        public TypeResolutionContext typeContext;

        public MethodBuilder(TypeResolutionContext typeResolutionContext, Method method, AnnotationCollector annotationCollector) {
            this.typeContext = typeResolutionContext;
            this.method = method;
            this.annotations = annotationCollector;
        }

        public AnnotatedMethod build() {
            Method method = this.method;
            if (method == null) {
                return null;
            }
            return new AnnotatedMethod(this.typeContext, method, this.annotations.asAnnotationMap(), null);
        }
    }

    AnnotatedMethodCollector(AnnotationIntrospector annotationIntrospector, ClassIntrospector.MixInResolver mixInResolver, boolean z10) {
        super(annotationIntrospector);
        this._mixInResolver = annotationIntrospector == null ? null : mixInResolver;
        this._collectAnnotations = z10;
    }

    private void _addMemberMethods(TypeResolutionContext typeResolutionContext, Class<?> cls, Map<MemberKey, MethodBuilder> map, Class<?> cls2) {
        Method[] classMethods;
        if (cls2 != null) {
            _addMethodMixIns(typeResolutionContext, cls, map, cls2);
        }
        if (cls == null) {
            return;
        }
        for (Method method : ClassUtil.getClassMethods(cls)) {
            if (_isIncludableMemberMethod(method)) {
                MemberKey memberKey = new MemberKey(method);
                MethodBuilder methodBuilder = map.get(memberKey);
                if (methodBuilder == null) {
                    map.put(memberKey, new MethodBuilder(typeResolutionContext, method, this._intr == null ? AnnotationCollector.emptyCollector() : collectAnnotations(method.getDeclaredAnnotations())));
                } else {
                    if (this._collectAnnotations) {
                        methodBuilder.annotations = collectDefaultAnnotations(methodBuilder.annotations, method.getDeclaredAnnotations());
                    }
                    Method method2 = methodBuilder.method;
                    if (method2 == null) {
                        methodBuilder.method = method;
                    } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                        methodBuilder.method = method;
                        methodBuilder.typeContext = typeResolutionContext;
                    }
                }
            }
        }
    }

    private static boolean _isIncludableMemberMethod(Method method) {
        return !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic() && !method.isBridge() && method.getParameterTypes().length <= 2;
    }

    public static AnnotatedMethodMap collectMethods(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory, JavaType javaType, List<JavaType> list, Class<?> cls, boolean z10) {
        return new AnnotatedMethodCollector(annotationIntrospector, mixInResolver, z10).collect(typeFactory, typeResolutionContext, javaType, list, cls);
    }

    protected void _addMethodMixIns(TypeResolutionContext typeResolutionContext, Class<?> cls, Map<MemberKey, MethodBuilder> map, Class<?> cls2) {
        Method[] declaredMethods;
        if (this._intr == null) {
            return;
        }
        for (Class<?> cls3 : ClassUtil.findRawSuperTypes(cls2, cls, true)) {
            for (Method method : cls3.getDeclaredMethods()) {
                if (_isIncludableMemberMethod(method)) {
                    MemberKey memberKey = new MemberKey(method);
                    MethodBuilder methodBuilder = map.get(memberKey);
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    if (methodBuilder == null) {
                        map.put(memberKey, new MethodBuilder(typeResolutionContext, null, collectAnnotations(declaredAnnotations)));
                    } else {
                        methodBuilder.annotations = collectDefaultAnnotations(methodBuilder.annotations, declaredAnnotations);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap collect(com.fasterxml.jackson.databind.type.TypeFactory r6, com.fasterxml.jackson.databind.introspect.TypeResolutionContext r7, com.fasterxml.jackson.databind.JavaType r8, java.util.List<com.fasterxml.jackson.databind.JavaType> r9, java.lang.Class<?> r10) {
        /*
            r5 = this;
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.Class r2 = r8.getRawClass()
            r5._addMemberMethods(r7, r2, r1, r10)
            java.util.Iterator r9 = r9.iterator()
        L12:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L3d
            java.lang.Object r10 = r9.next()
            com.fasterxml.jackson.databind.JavaType r10 = (com.fasterxml.jackson.databind.JavaType) r10
            com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver r2 = r5._mixInResolver
            if (r2 != 0) goto L24
            r2 = 0
            goto L2c
        L24:
            java.lang.Class r3 = r10.getRawClass()
            java.lang.Class r2 = r2.findMixInClassFor(r3)
        L2c:
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext$Basic r3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext$Basic
            com.fasterxml.jackson.databind.type.TypeBindings r4 = r10.getBindings()
            r3.<init>(r6, r4)
            java.lang.Class r10 = r10.getRawClass()
            r5._addMemberMethods(r3, r10, r1, r2)
            goto L12
        L3d:
            com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver r6 = r5._mixInResolver
            r9 = 0
            if (r6 == 0) goto L51
            java.lang.Class r6 = r6.findMixInClassFor(r0)
            if (r6 == 0) goto L51
            java.lang.Class r8 = r8.getRawClass()
            r5._addMethodMixIns(r7, r8, r1, r6)
            r6 = 1
            goto L52
        L51:
            r6 = r9
        L52:
            if (r6 == 0) goto Lac
            com.fasterxml.jackson.databind.AnnotationIntrospector r6 = r5._intr
            if (r6 == 0) goto Lac
            boolean r6 = r1.isEmpty()
            if (r6 != 0) goto Lac
            java.util.Set r6 = r1.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L66:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lac
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            com.fasterxml.jackson.databind.introspect.MemberKey r8 = (com.fasterxml.jackson.databind.introspect.MemberKey) r8
            java.lang.String r10 = r8.getName()
            java.lang.String r2 = "hashCode"
            boolean r10 = r2.equals(r10)
            if (r10 == 0) goto L66
            int r10 = r8.argCount()
            if (r10 == 0) goto L8b
            goto L66
        L8b:
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Exception -> L66
            java.lang.Class[] r10 = new java.lang.Class[r9]     // Catch: java.lang.Exception -> L66
            java.lang.reflect.Method r8 = r0.getDeclaredMethod(r8, r10)     // Catch: java.lang.Exception -> L66
            if (r8 == 0) goto L66
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Exception -> L66
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector$MethodBuilder r7 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.MethodBuilder) r7     // Catch: java.lang.Exception -> L66
            com.fasterxml.jackson.databind.introspect.AnnotationCollector r10 = r7.annotations     // Catch: java.lang.Exception -> L66
            java.lang.annotation.Annotation[] r2 = r8.getDeclaredAnnotations()     // Catch: java.lang.Exception -> L66
            com.fasterxml.jackson.databind.introspect.AnnotationCollector r10 = r5.collectDefaultAnnotations(r10, r2)     // Catch: java.lang.Exception -> L66
            r7.annotations = r10     // Catch: java.lang.Exception -> L66
            r7.method = r8     // Catch: java.lang.Exception -> L66
            goto L66
        Lac:
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto Lb8
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap r6 = new com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap
            r6.<init>()
            return r6
        Lb8:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            int r7 = r1.size()
            r6.<init>(r7)
            java.util.Set r7 = r1.entrySet()
            java.util.Iterator r7 = r7.iterator()
        Lc9:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Le9
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getValue()
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector$MethodBuilder r9 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.MethodBuilder) r9
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r9 = r9.build()
            if (r9 == 0) goto Lc9
            java.lang.Object r8 = r8.getKey()
            r6.put(r8, r9)
            goto Lc9
        Le9:
            com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap r7 = new com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collect(com.fasterxml.jackson.databind.type.TypeFactory, com.fasterxml.jackson.databind.introspect.TypeResolutionContext, com.fasterxml.jackson.databind.JavaType, java.util.List, java.lang.Class):com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap");
    }
}
