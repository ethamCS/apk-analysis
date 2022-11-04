package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class JavaUtilCollectionsDeserializers {

    /* loaded from: classes.dex */
    public static class JavaUtilCollectionsConverter implements Converter<Object, Object> {
        private final JavaType _inputType;
        private final int _kind;

        JavaUtilCollectionsConverter(int i10, JavaType javaType) {
            this._inputType = javaType;
            this._kind = i10;
        }

        private void _checkSingleton(int i10) {
            if (i10 == 1) {
                return;
            }
            throw new IllegalArgumentException("Can not deserialize Singleton container from " + i10 + " entries");
        }

        @Override // com.fasterxml.jackson.databind.util.Converter
        public Object convert(Object obj) {
            if (obj == null) {
                return null;
            }
            switch (this._kind) {
                case 1:
                    Set set = (Set) obj;
                    _checkSingleton(set.size());
                    return Collections.singleton(set.iterator().next());
                case 2:
                    List list = (List) obj;
                    _checkSingleton(list.size());
                    return Collections.singletonList(list.get(0));
                case 3:
                    Map map = (Map) obj;
                    _checkSingleton(map.size());
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    return Collections.singletonMap(entry.getKey(), entry.getValue());
                case 4:
                    return Collections.unmodifiableSet((Set) obj);
                case 5:
                    return Collections.unmodifiableList((List) obj);
                case 6:
                    return Collections.unmodifiableMap((Map) obj);
                case 7:
                    return Collections.synchronizedSet((Set) obj);
                case 8:
                    return Collections.synchronizedCollection((Collection) obj);
                case 9:
                    return Collections.synchronizedList((List) obj);
                case 10:
                    return DesugarCollections.synchronizedMap((Map) obj);
                default:
                    return obj;
            }
        }

        @Override // com.fasterxml.jackson.databind.util.Converter
        public JavaType getInputType(TypeFactory typeFactory) {
            return this._inputType;
        }

        @Override // com.fasterxml.jackson.databind.util.Converter
        public JavaType getOutputType(TypeFactory typeFactory) {
            return this._inputType;
        }
    }

    private static String _findSingletonTypeName(String str) {
        if (str.startsWith("Singleton")) {
            return str.substring(9);
        }
        return null;
    }

    private static String _findSyncTypeName(String str) {
        if (str.startsWith("Synchronized")) {
            return str.substring(12);
        }
        return null;
    }

    private static String _findUnmodifiableTypeName(String str) {
        if (str.startsWith("Unmodifiable")) {
            return str.substring(12);
        }
        return null;
    }

    private static String _findUtilArrayTypeName(String str) {
        if (str.startsWith("java.util.Arrays$")) {
            return str.substring(17);
        }
        return null;
    }

    private static String _findUtilCollectionsImmutableTypeName(String str) {
        if (str.startsWith("java.util.ImmutableCollections$")) {
            return str.substring(31);
        }
        return null;
    }

    private static String _findUtilCollectionsTypeName(String str) {
        if (str.startsWith("java.util.Collections$")) {
            return str.substring(22);
        }
        return null;
    }

    static JavaUtilCollectionsConverter converter(int i10, JavaType javaType, Class<?> cls) {
        return new JavaUtilCollectionsConverter(i10, javaType.findSuperType(cls));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fasterxml.jackson.databind.JsonDeserializer<?> findForCollection(com.fasterxml.jackson.databind.DeserializationContext r5, com.fasterxml.jackson.databind.JavaType r6) {
        /*
            java.lang.Class r5 = r6.getRawClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = "java.util."
            boolean r0 = r5.startsWith(r0)
            r1 = 0
            if (r0 != 0) goto L12
            return r1
        L12:
            java.lang.String r0 = _findUtilCollectionsTypeName(r5)
            r2 = 5
            java.lang.String r3 = "List"
            if (r0 == 0) goto L84
            java.lang.String r5 = _findUnmodifiableTypeName(r0)
            java.lang.String r4 = "Set"
            if (r5 == 0) goto L3e
            boolean r0 = r5.endsWith(r4)
            if (r0 == 0) goto L31
            r5 = 4
        L2a:
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
        L2c:
            com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter r5 = converter(r5, r6, r0)
            goto L7b
        L31:
            boolean r5 = r5.endsWith(r3)
            if (r5 == 0) goto L7a
            java.lang.Class<java.util.List> r5 = java.util.List.class
            com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter r5 = converter(r2, r6, r5)
            goto L7b
        L3e:
            java.lang.String r5 = _findSingletonTypeName(r0)
            if (r5 == 0) goto L56
            boolean r0 = r5.endsWith(r4)
            if (r0 == 0) goto L4c
            r5 = 1
            goto L2a
        L4c:
            boolean r5 = r5.endsWith(r3)
            if (r5 == 0) goto L7a
            r5 = 2
        L53:
            java.lang.Class<java.util.List> r0 = java.util.List.class
            goto L2c
        L56:
            java.lang.String r5 = _findSyncTypeName(r0)
            if (r5 == 0) goto L7a
            boolean r0 = r5.endsWith(r4)
            if (r0 == 0) goto L64
            r5 = 7
            goto L2a
        L64:
            boolean r0 = r5.endsWith(r3)
            if (r0 == 0) goto L6d
            r5 = 9
            goto L53
        L6d:
            java.lang.String r0 = "Collection"
            boolean r5 = r5.endsWith(r0)
            if (r5 == 0) goto L7a
            r5 = 8
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            goto L2c
        L7a:
            r5 = r1
        L7b:
            if (r5 != 0) goto L7e
            goto L83
        L7e:
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer r1 = new com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer
            r1.<init>(r5)
        L83:
            return r1
        L84:
            java.lang.String r0 = _findUtilArrayTypeName(r5)
            if (r0 == 0) goto L9d
            boolean r5 = r0.contains(r3)
            if (r5 == 0) goto L9c
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer r5 = new com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer
            java.lang.Class<java.util.List> r0 = java.util.List.class
            com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter r6 = converter(r2, r6, r0)
            r5.<init>(r6)
            return r5
        L9c:
            return r1
        L9d:
            java.lang.String r5 = _findUtilCollectionsImmutableTypeName(r5)
            if (r5 == 0) goto Lb7
            boolean r5 = r5.contains(r3)
            if (r5 == 0) goto Lb7
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer r5 = new com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer
            r0 = 11
            java.lang.Class<java.util.List> r1 = java.util.List.class
            com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter r6 = converter(r0, r6, r1)
            r5.<init>(r6)
            return r5
        Lb7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers.findForCollection(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r4.contains("Map") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        r4 = converter(6, r5, java.util.Map.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r4.contains("Map") != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fasterxml.jackson.databind.JsonDeserializer<?> findForMap(com.fasterxml.jackson.databind.DeserializationContext r4, com.fasterxml.jackson.databind.JavaType r5) {
        /*
            java.lang.Class r4 = r5.getRawClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = _findUtilCollectionsTypeName(r4)
            r1 = 6
            r2 = 0
            java.lang.String r3 = "Map"
            if (r0 == 0) goto L42
            java.lang.String r4 = _findUnmodifiableTypeName(r0)
            if (r4 == 0) goto L1f
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L55
            goto L4e
        L1f:
            java.lang.String r4 = _findSingletonTypeName(r0)
            if (r4 == 0) goto L33
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L55
            r4 = 3
        L2c:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter r4 = converter(r4, r5, r0)
            goto L56
        L33:
            java.lang.String r4 = _findSyncTypeName(r0)
            if (r4 == 0) goto L55
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L55
            r4 = 10
            goto L2c
        L42:
            java.lang.String r4 = _findUtilCollectionsImmutableTypeName(r4)
            if (r4 == 0) goto L55
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L55
        L4e:
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter r4 = converter(r1, r5, r4)
            goto L56
        L55:
            r4 = r2
        L56:
            if (r4 != 0) goto L59
            goto L5e
        L59:
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer r2 = new com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer
            r2.<init>(r4)
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers.findForMap(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.JsonDeserializer");
    }
}
