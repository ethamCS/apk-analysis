package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
@JacksonStdImpl
/* loaded from: classes.dex */
public class MapDeserializer extends ContainerDeserializerBase<Map<Object, Object>> implements ContextualDeserializer, ResolvableDeserializer {
    protected JsonDeserializer<Object> _delegateDeserializer;
    protected final boolean _hasDefaultCreator;
    protected Set<String> _ignorableProperties;
    protected Set<String> _includableProperties;
    protected IgnorePropertiesUtil.Checker _inclusionChecker;
    protected final KeyDeserializer _keyDeserializer;
    protected PropertyBasedCreator _propertyBasedCreator;
    protected boolean _standardStringKey;
    protected final JsonDeserializer<Object> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final TypeDeserializer _valueTypeDeserializer;

    /* loaded from: classes.dex */
    public static class MapReferring extends ReadableObjectId.Referring {
        private final MapReferringAccumulator _parent;
        public final Object key;
        public final Map<Object, Object> next = new LinkedHashMap();

        MapReferring(MapReferringAccumulator mapReferringAccumulator, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj) {
            super(unresolvedForwardReference, cls);
            this._parent = mapReferringAccumulator;
            this.key = obj;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public void handleResolvedForwardReference(Object obj, Object obj2) {
            this._parent.resolveForwardReference(obj, obj2);
        }
    }

    /* loaded from: classes.dex */
    public static final class MapReferringAccumulator {
        private List<MapReferring> _accumulator = new ArrayList();
        private Map<Object, Object> _result;
        private final Class<?> _valueType;

        public MapReferringAccumulator(Class<?> cls, Map<Object, Object> map) {
            this._valueType = cls;
            this._result = map;
        }

        public ReadableObjectId.Referring handleUnresolvedReference(UnresolvedForwardReference unresolvedForwardReference, Object obj) {
            MapReferring mapReferring = new MapReferring(this, unresolvedForwardReference, this._valueType, obj);
            this._accumulator.add(mapReferring);
            return mapReferring;
        }

        public void put(Object obj, Object obj2) {
            Map<Object, Object> map;
            if (this._accumulator.isEmpty()) {
                map = this._result;
            } else {
                List<MapReferring> list = this._accumulator;
                map = list.get(list.size() - 1).next;
            }
            map.put(obj, obj2);
        }

        public void resolveForwardReference(Object obj, Object obj2) {
            Iterator<MapReferring> it = this._accumulator.iterator();
            Map<Object, Object> map = this._result;
            while (it.hasNext()) {
                MapReferring next = it.next();
                if (next.hasId(obj)) {
                    it.remove();
                    map.put(next.key, obj2);
                    map.putAll(next.next);
                    return;
                }
                map = next.next;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    public MapDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(javaType, (NullValueProvider) null, (Boolean) null);
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._valueInstantiator = valueInstantiator;
        this._hasDefaultCreator = valueInstantiator.canCreateUsingDefault();
        this._delegateDeserializer = null;
        this._propertyBasedCreator = null;
        this._standardStringKey = _isStdKeyDeser(javaType, keyDeserializer);
        this._inclusionChecker = null;
    }

    protected MapDeserializer(MapDeserializer mapDeserializer, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider, Set<String> set, Set<String> set2) {
        super(mapDeserializer, nullValueProvider, mapDeserializer._unwrapSingle);
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._valueInstantiator = mapDeserializer._valueInstantiator;
        this._propertyBasedCreator = mapDeserializer._propertyBasedCreator;
        this._delegateDeserializer = mapDeserializer._delegateDeserializer;
        this._hasDefaultCreator = mapDeserializer._hasDefaultCreator;
        this._ignorableProperties = set;
        this._includableProperties = set2;
        this._inclusionChecker = IgnorePropertiesUtil.buildCheckerIfNeeded(set, set2);
        this._standardStringKey = _isStdKeyDeser(this._containerType, keyDeserializer);
    }

    private void handleUnresolvedReference(DeserializationContext deserializationContext, MapReferringAccumulator mapReferringAccumulator, Object obj, UnresolvedForwardReference unresolvedForwardReference) {
        if (mapReferringAccumulator == null) {
            deserializationContext.reportInputMismatch(this, "Unresolved forward reference but no identity info: " + unresolvedForwardReference, new Object[0]);
        }
        unresolvedForwardReference.getRoid().appendReferring(mapReferringAccumulator.handleUnresolvedReference(unresolvedForwardReference, obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093 A[Catch: Exception -> 0x0088, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0088, blocks: (B:27:0x0069, B:29:0x006d, B:32:0x0072, B:34:0x007b, B:35:0x0080, B:40:0x0093), top: B:42:0x0069 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0034 -> B:4:0x0011). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0046 -> B:4:0x0011). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0071 -> B:4:0x0011). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0084 -> B:4:0x0011). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.Object, java.lang.Object> _deserializeUsingCreator(com.fasterxml.jackson.core.JsonParser r10, com.fasterxml.jackson.databind.DeserializationContext r11) {
        /*
            r9 = this;
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator r0 = r9._propertyBasedCreator
            r1 = 0
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer r2 = r0.startBuilding(r10, r11, r1)
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r3 = r9._valueDeserializer
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r4 = r9._valueTypeDeserializer
            boolean r5 = r10.isExpectedStartObjectToken()
            if (r5 == 0) goto L16
        L11:
            java.lang.String r5 = r10.nextFieldName()
            goto L24
        L16:
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            boolean r5 = r10.hasToken(r5)
            if (r5 == 0) goto L23
            java.lang.String r5 = r10.currentName()
            goto L24
        L23:
            r5 = r1
        L24:
            if (r5 == 0) goto L93
            com.fasterxml.jackson.core.JsonToken r6 = r10.nextToken()
            com.fasterxml.jackson.databind.util.IgnorePropertiesUtil$Checker r7 = r9._inclusionChecker
            if (r7 == 0) goto L38
            boolean r7 = r7.shouldIgnore(r5)
            if (r7 == 0) goto L38
            r10.skipChildren()
            goto L11
        L38:
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r7 = r0.findCreatorProperty(r5)
            if (r7 == 0) goto L63
            java.lang.Object r6 = r7.deserialize(r10, r11)
            boolean r6 = r2.assignParameter(r7, r6)
            if (r6 == 0) goto L11
            r10.nextToken()
            java.lang.Object r0 = r0.build(r11, r2)     // Catch: java.lang.Exception -> L55
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> L55
            r9._readAndBind(r10, r11, r0)
            return r0
        L55:
            r10 = move-exception
            com.fasterxml.jackson.databind.JavaType r0 = r9._containerType
            java.lang.Class r0 = r0.getRawClass()
            java.lang.Object r10 = r9.wrapAndThrow(r11, r10, r0, r5)
            java.util.Map r10 = (java.util.Map) r10
            return r10
        L63:
            com.fasterxml.jackson.databind.KeyDeserializer r7 = r9._keyDeserializer
            java.lang.Object r7 = r7.deserializeKey(r5, r11)
            com.fasterxml.jackson.core.JsonToken r8 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch: java.lang.Exception -> L88
            if (r6 != r8) goto L79
            boolean r6 = r9._skipNullValues     // Catch: java.lang.Exception -> L88
            if (r6 == 0) goto L72
            goto L11
        L72:
            com.fasterxml.jackson.databind.deser.NullValueProvider r6 = r9._nullProvider     // Catch: java.lang.Exception -> L88
            java.lang.Object r5 = r6.getNullValue(r11)     // Catch: java.lang.Exception -> L88
            goto L84
        L79:
            if (r4 != 0) goto L80
            java.lang.Object r5 = r3.deserialize(r10, r11)     // Catch: java.lang.Exception -> L88
            goto L84
        L80:
            java.lang.Object r5 = r3.deserializeWithType(r10, r11, r4)     // Catch: java.lang.Exception -> L88
        L84:
            r2.bufferMapProperty(r7, r5)
            goto L11
        L88:
            r10 = move-exception
            com.fasterxml.jackson.databind.JavaType r0 = r9._containerType
            java.lang.Class r0 = r0.getRawClass()
            r9.wrapAndThrow(r11, r10, r0, r5)
            return r1
        L93:
            java.lang.Object r10 = r0.build(r11, r2)     // Catch: java.lang.Exception -> L88
            java.util.Map r10 = (java.util.Map) r10     // Catch: java.lang.Exception -> L88
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):java.util.Map");
    }

    protected final boolean _isStdKeyDeser(JavaType javaType, KeyDeserializer keyDeserializer) {
        JavaType keyType;
        if (keyDeserializer == null || (keyType = javaType.getKeyType()) == null) {
            return true;
        }
        Class<?> rawClass = keyType.getRawClass();
        return (rawClass == String.class || rawClass == Object.class) && isDefaultKeyDeserializer(keyDeserializer);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008c A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0059 -> B:12:0x002a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0065 -> B:12:0x002a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x007a -> B:12:0x002a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x007e -> B:12:0x002a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0083 -> B:12:0x002a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0088 -> B:12:0x002a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void _readAndBind(com.fasterxml.jackson.core.JsonParser r11, com.fasterxml.jackson.databind.DeserializationContext r12, java.util.Map<java.lang.Object, java.lang.Object> r13) {
        /*
            r10 = this;
            com.fasterxml.jackson.databind.KeyDeserializer r0 = r10._keyDeserializer
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r1 = r10._valueDeserializer
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r2 = r10._valueTypeDeserializer
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader r3 = r1.getObjectIdReader()
            r4 = 0
            if (r3 == 0) goto Lf
            r3 = 1
            goto L10
        Lf:
            r3 = r4
        L10:
            r5 = 0
            if (r3 == 0) goto L23
            com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator r6 = new com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator
            com.fasterxml.jackson.databind.JavaType r7 = r10._containerType
            com.fasterxml.jackson.databind.JavaType r7 = r7.getContentType()
            java.lang.Class r7 = r7.getRawClass()
            r6.<init>(r7, r13)
            goto L24
        L23:
            r6 = r5
        L24:
            boolean r7 = r11.isExpectedStartObjectToken()
            if (r7 == 0) goto L2f
        L2a:
            java.lang.String r4 = r11.nextFieldName()
            goto L45
        L2f:
            com.fasterxml.jackson.core.JsonToken r7 = r11.currentToken()
            com.fasterxml.jackson.core.JsonToken r8 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            if (r7 == r8) goto L41
            com.fasterxml.jackson.core.JsonToken r9 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r7 != r9) goto L3c
            return
        L3c:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r12.reportWrongTokenException(r10, r8, r5, r4)
        L41:
            java.lang.String r4 = r11.currentName()
        L45:
            if (r4 == 0) goto L8c
            java.lang.Object r5 = r0.deserializeKey(r4, r12)
            com.fasterxml.jackson.core.JsonToken r7 = r11.nextToken()
            com.fasterxml.jackson.databind.util.IgnorePropertiesUtil$Checker r8 = r10._inclusionChecker
            if (r8 == 0) goto L5d
            boolean r8 = r8.shouldIgnore(r4)
            if (r8 == 0) goto L5d
            r11.skipChildren()
            goto L2a
        L5d:
            com.fasterxml.jackson.core.JsonToken r8 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch: java.lang.Exception -> L82 com.fasterxml.jackson.databind.deser.UnresolvedForwardReference -> L87
            if (r7 != r8) goto L6d
            boolean r7 = r10._skipNullValues     // Catch: java.lang.Exception -> L82 com.fasterxml.jackson.databind.deser.UnresolvedForwardReference -> L87
            if (r7 == 0) goto L66
            goto L2a
        L66:
            com.fasterxml.jackson.databind.deser.NullValueProvider r7 = r10._nullProvider     // Catch: java.lang.Exception -> L82 com.fasterxml.jackson.databind.deser.UnresolvedForwardReference -> L87
            java.lang.Object r7 = r7.getNullValue(r12)     // Catch: java.lang.Exception -> L82 com.fasterxml.jackson.databind.deser.UnresolvedForwardReference -> L87
            goto L78
        L6d:
            if (r2 != 0) goto L74
            java.lang.Object r7 = r1.deserialize(r11, r12)     // Catch: java.lang.Exception -> L82 com.fasterxml.jackson.databind.deser.UnresolvedForwardReference -> L87
            goto L78
        L74:
            java.lang.Object r7 = r1.deserializeWithType(r11, r12, r2)     // Catch: java.lang.Exception -> L82 com.fasterxml.jackson.databind.deser.UnresolvedForwardReference -> L87
        L78:
            if (r3 == 0) goto L7e
            r6.put(r5, r7)     // Catch: java.lang.Exception -> L82 com.fasterxml.jackson.databind.deser.UnresolvedForwardReference -> L87
            goto L2a
        L7e:
            r13.put(r5, r7)     // Catch: java.lang.Exception -> L82 com.fasterxml.jackson.databind.deser.UnresolvedForwardReference -> L87
            goto L2a
        L82:
            r5 = move-exception
            r10.wrapAndThrow(r12, r5, r13, r4)
            goto L2a
        L87:
            r4 = move-exception
            r10.handleUnresolvedReference(r12, r6, r5, r4)
            goto L2a
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0053 -> B:12:0x0028). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x005f -> B:12:0x0028). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0074 -> B:12:0x0028). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0078 -> B:12:0x0028). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x007d -> B:12:0x0028). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0082 -> B:12:0x0028). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void _readAndBindStringKeyMap(com.fasterxml.jackson.core.JsonParser r9, com.fasterxml.jackson.databind.DeserializationContext r10, java.util.Map<java.lang.Object, java.lang.Object> r11) {
        /*
            r8 = this;
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r8._valueDeserializer
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r1 = r8._valueTypeDeserializer
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader r2 = r0.getObjectIdReader()
            r3 = 0
            if (r2 == 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = r3
        Le:
            r4 = 0
            if (r2 == 0) goto L21
            com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator r5 = new com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator
            com.fasterxml.jackson.databind.JavaType r6 = r8._containerType
            com.fasterxml.jackson.databind.JavaType r6 = r6.getContentType()
            java.lang.Class r6 = r6.getRawClass()
            r5.<init>(r6, r11)
            goto L22
        L21:
            r5 = r4
        L22:
            boolean r6 = r9.isExpectedStartObjectToken()
            if (r6 == 0) goto L2d
        L28:
            java.lang.String r3 = r9.nextFieldName()
            goto L43
        L2d:
            com.fasterxml.jackson.core.JsonToken r6 = r9.currentToken()
            com.fasterxml.jackson.core.JsonToken r7 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r6 != r7) goto L36
            return
        L36:
            com.fasterxml.jackson.core.JsonToken r7 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            if (r6 == r7) goto L3f
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r10.reportWrongTokenException(r8, r7, r4, r3)
        L3f:
            java.lang.String r3 = r9.currentName()
        L43:
            if (r3 == 0) goto L86
            com.fasterxml.jackson.core.JsonToken r4 = r9.nextToken()
            com.fasterxml.jackson.databind.util.IgnorePropertiesUtil$Checker r6 = r8._inclusionChecker
            if (r6 == 0) goto L57
            boolean r6 = r6.shouldIgnore(r3)
            if (r6 == 0) goto L57
            r9.skipChildren()
            goto L28
        L57:
            com.fasterxml.jackson.core.JsonToken r6 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch: java.lang.Exception -> L7c com.fasterxml.jackson.databind.deser.UnresolvedForwardReference -> L81
            if (r4 != r6) goto L67
            boolean r4 = r8._skipNullValues     // Catch: java.lang.Exception -> L7c com.fasterxml.jackson.databind.deser.UnresolvedForwardReference -> L81
            if (r4 == 0) goto L60
            goto L28
        L60:
            com.fasterxml.jackson.databind.deser.NullValueProvider r4 = r8._nullProvider     // Catch: java.lang.Exception -> L7c com.fasterxml.jackson.databind.deser.UnresolvedForwardReference -> L81
            java.lang.Object r4 = r4.getNullValue(r10)     // Catch: java.lang.Exception -> L7c com.fasterxml.jackson.databind.deser.UnresolvedForwardReference -> L81
            goto L72
        L67:
            if (r1 != 0) goto L6e
            java.lang.Object r4 = r0.deserialize(r9, r10)     // Catch: java.lang.Exception -> L7c com.fasterxml.jackson.databind.deser.UnresolvedForwardReference -> L81
            goto L72
        L6e:
            java.lang.Object r4 = r0.deserializeWithType(r9, r10, r1)     // Catch: java.lang.Exception -> L7c com.fasterxml.jackson.databind.deser.UnresolvedForwardReference -> L81
        L72:
            if (r2 == 0) goto L78
            r5.put(r3, r4)     // Catch: java.lang.Exception -> L7c com.fasterxml.jackson.databind.deser.UnresolvedForwardReference -> L81
            goto L28
        L78:
            r11.put(r3, r4)     // Catch: java.lang.Exception -> L7c com.fasterxml.jackson.databind.deser.UnresolvedForwardReference -> L81
            goto L28
        L7c:
            r4 = move-exception
            r8.wrapAndThrow(r10, r4, r11, r3)
            goto L28
        L81:
            r4 = move-exception
            r8.handleUnresolvedReference(r10, r5, r3, r4)
            goto L28
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringKeyMap(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003d -> B:4:0x000c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0049 -> B:4:0x000c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x004a -> B:4:0x000c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0071 -> B:4:0x000c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0073 -> B:4:0x000c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0078 -> B:4:0x000c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void _readAndUpdate(com.fasterxml.jackson.core.JsonParser r8, com.fasterxml.jackson.databind.DeserializationContext r9, java.util.Map<java.lang.Object, java.lang.Object> r10) {
        /*
            r7 = this;
            com.fasterxml.jackson.databind.KeyDeserializer r0 = r7._keyDeserializer
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r1 = r7._valueDeserializer
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r2 = r7._valueTypeDeserializer
            boolean r3 = r8.isExpectedStartObjectToken()
            if (r3 == 0) goto L11
        Lc:
            java.lang.String r3 = r8.nextFieldName()
            goto L29
        L11:
            com.fasterxml.jackson.core.JsonToken r3 = r8.currentToken()
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r3 != r4) goto L1a
            return
        L1a:
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            if (r3 == r4) goto L25
            r3 = 0
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r9.reportWrongTokenException(r7, r4, r3, r5)
        L25:
            java.lang.String r3 = r8.currentName()
        L29:
            if (r3 == 0) goto L7c
            java.lang.Object r4 = r0.deserializeKey(r3, r9)
            com.fasterxml.jackson.core.JsonToken r5 = r8.nextToken()
            com.fasterxml.jackson.databind.util.IgnorePropertiesUtil$Checker r6 = r7._inclusionChecker
            if (r6 == 0) goto L41
            boolean r6 = r6.shouldIgnore(r3)
            if (r6 == 0) goto L41
            r8.skipChildren()
            goto Lc
        L41:
            com.fasterxml.jackson.core.JsonToken r6 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch: java.lang.Exception -> L77
            if (r5 != r6) goto L54
            boolean r5 = r7._skipNullValues     // Catch: java.lang.Exception -> L77
            if (r5 == 0) goto L4a
            goto Lc
        L4a:
            com.fasterxml.jackson.databind.deser.NullValueProvider r5 = r7._nullProvider     // Catch: java.lang.Exception -> L77
            java.lang.Object r5 = r5.getNullValue(r9)     // Catch: java.lang.Exception -> L77
            r10.put(r4, r5)     // Catch: java.lang.Exception -> L77
            goto Lc
        L54:
            java.lang.Object r5 = r10.get(r4)     // Catch: java.lang.Exception -> L77
            if (r5 == 0) goto L66
            if (r2 != 0) goto L61
            java.lang.Object r6 = r1.deserialize(r8, r9, r5)     // Catch: java.lang.Exception -> L77
            goto L71
        L61:
            java.lang.Object r6 = r1.deserializeWithType(r8, r9, r2, r5)     // Catch: java.lang.Exception -> L77
            goto L71
        L66:
            if (r2 != 0) goto L6d
            java.lang.Object r6 = r1.deserialize(r8, r9)     // Catch: java.lang.Exception -> L77
            goto L71
        L6d:
            java.lang.Object r6 = r1.deserializeWithType(r8, r9, r2)     // Catch: java.lang.Exception -> L77
        L71:
            if (r6 == r5) goto Lc
            r10.put(r4, r6)     // Catch: java.lang.Exception -> L77
            goto Lc
        L77:
            r4 = move-exception
            r7.wrapAndThrow(r9, r4, r10, r3)
            goto Lc
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndUpdate(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0037 -> B:4:0x000a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0043 -> B:4:0x000a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0044 -> B:4:0x000a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x006b -> B:4:0x000a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x006d -> B:4:0x000a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0072 -> B:4:0x000a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void _readAndUpdateStringKeyMap(com.fasterxml.jackson.core.JsonParser r6, com.fasterxml.jackson.databind.DeserializationContext r7, java.util.Map<java.lang.Object, java.lang.Object> r8) {
        /*
            r5 = this;
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r5._valueDeserializer
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r1 = r5._valueTypeDeserializer
            boolean r2 = r6.isExpectedStartObjectToken()
            if (r2 == 0) goto Lf
        La:
            java.lang.String r2 = r6.nextFieldName()
            goto L27
        Lf:
            com.fasterxml.jackson.core.JsonToken r2 = r6.currentToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r2 != r3) goto L18
            return
        L18:
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            if (r2 == r3) goto L23
            r2 = 0
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r7.reportWrongTokenException(r5, r3, r2, r4)
        L23:
            java.lang.String r2 = r6.currentName()
        L27:
            if (r2 == 0) goto L76
            com.fasterxml.jackson.core.JsonToken r3 = r6.nextToken()
            com.fasterxml.jackson.databind.util.IgnorePropertiesUtil$Checker r4 = r5._inclusionChecker
            if (r4 == 0) goto L3b
            boolean r4 = r4.shouldIgnore(r2)
            if (r4 == 0) goto L3b
            r6.skipChildren()
            goto La
        L3b:
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch: java.lang.Exception -> L71
            if (r3 != r4) goto L4e
            boolean r3 = r5._skipNullValues     // Catch: java.lang.Exception -> L71
            if (r3 == 0) goto L44
            goto La
        L44:
            com.fasterxml.jackson.databind.deser.NullValueProvider r3 = r5._nullProvider     // Catch: java.lang.Exception -> L71
            java.lang.Object r3 = r3.getNullValue(r7)     // Catch: java.lang.Exception -> L71
            r8.put(r2, r3)     // Catch: java.lang.Exception -> L71
            goto La
        L4e:
            java.lang.Object r3 = r8.get(r2)     // Catch: java.lang.Exception -> L71
            if (r3 == 0) goto L60
            if (r1 != 0) goto L5b
            java.lang.Object r4 = r0.deserialize(r6, r7, r3)     // Catch: java.lang.Exception -> L71
            goto L6b
        L5b:
            java.lang.Object r4 = r0.deserializeWithType(r6, r7, r1, r3)     // Catch: java.lang.Exception -> L71
            goto L6b
        L60:
            if (r1 != 0) goto L67
            java.lang.Object r4 = r0.deserialize(r6, r7)     // Catch: java.lang.Exception -> L71
            goto L6b
        L67:
            java.lang.Object r4 = r0.deserializeWithType(r6, r7, r1)     // Catch: java.lang.Exception -> L71
        L6b:
            if (r4 == r3) goto La
            r8.put(r2, r4)     // Catch: java.lang.Exception -> L71
            goto La
        L71:
            r3 = move-exception
            r5.wrapAndThrow(r7, r3, r8, r2)
            goto La
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndUpdateStringKeyMap(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Map):void");
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        HashSet hashSet;
        Set<String> set;
        AnnotatedMember member;
        Set<String> included;
        KeyDeserializer keyDeserializer = this._keyDeserializer;
        if (keyDeserializer == null) {
            keyDeserializer = deserializationContext.findKeyDeserializer(this._containerType.getKeyType(), beanProperty);
        } else if (keyDeserializer instanceof ContextualKeyDeserializer) {
            keyDeserializer = ((ContextualKeyDeserializer) keyDeserializer).createContextual(deserializationContext, beanProperty);
        }
        KeyDeserializer keyDeserializer2 = keyDeserializer;
        JsonDeserializer<?> jsonDeserializer = this._valueDeserializer;
        if (beanProperty != null) {
            jsonDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, jsonDeserializer);
        }
        JavaType contentType = this._containerType.getContentType();
        JsonDeserializer<?> findContextualValueDeserializer = jsonDeserializer == null ? deserializationContext.findContextualValueDeserializer(contentType, beanProperty) : deserializationContext.handleSecondaryContextualization(jsonDeserializer, beanProperty, contentType);
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(beanProperty);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        Set<String> set2 = this._ignorableProperties;
        Set<String> set3 = this._includableProperties;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (StdDeserializer._neitherNull(annotationIntrospector, beanProperty) && (member = beanProperty.getMember()) != null) {
            DeserializationConfig config = deserializationContext.getConfig();
            JsonIgnoreProperties.Value findPropertyIgnoralByName = annotationIntrospector.findPropertyIgnoralByName(config, member);
            if (findPropertyIgnoralByName != null) {
                Set<String> findIgnoredForDeserialization = findPropertyIgnoralByName.findIgnoredForDeserialization();
                if (!findIgnoredForDeserialization.isEmpty()) {
                    set2 = set2 == null ? new HashSet<>() : new HashSet(set2);
                    for (String str : findIgnoredForDeserialization) {
                        set2.add(str);
                    }
                }
            }
            JsonIncludeProperties.Value findPropertyInclusionByName = annotationIntrospector.findPropertyInclusionByName(config, member);
            if (findPropertyInclusionByName != null && (included = findPropertyInclusionByName.getIncluded()) != null) {
                HashSet hashSet2 = new HashSet();
                if (set3 == null) {
                    hashSet2 = new HashSet(included);
                } else {
                    for (String str2 : included) {
                        if (set3.contains(str2)) {
                            hashSet2.add(str2);
                        }
                    }
                }
                hashSet = hashSet2;
                set = set2;
                return withResolved(keyDeserializer2, typeDeserializer2, findContextualValueDeserializer, findContentNullProvider(deserializationContext, beanProperty, findContextualValueDeserializer), set, hashSet);
            }
        }
        set = set2;
        hashSet = set3;
        return withResolved(keyDeserializer2, typeDeserializer2, findContextualValueDeserializer, findContentNullProvider(deserializationContext, beanProperty, findContextualValueDeserializer), set, hashSet);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Map<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object _deserializeFromArray;
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingCreator(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            _deserializeFromArray = this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        } else if (this._hasDefaultCreator) {
            int currentTokenId = jsonParser.currentTokenId();
            if (currentTokenId != 1 && currentTokenId != 2) {
                if (currentTokenId == 3) {
                    _deserializeFromArray = _deserializeFromArray(jsonParser, deserializationContext);
                } else if (currentTokenId != 5) {
                    _deserializeFromArray = currentTokenId != 6 ? deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser) : _deserializeFromString(jsonParser, deserializationContext);
                }
            }
            Map<Object, Object> map = (Map) this._valueInstantiator.createUsingDefault(deserializationContext);
            if (this._standardStringKey) {
                _readAndBindStringKeyMap(jsonParser, deserializationContext, map);
                return map;
            }
            _readAndBind(jsonParser, deserializationContext, map);
            return map;
        } else {
            _deserializeFromArray = deserializationContext.handleMissingInstantiator(getMapClass(), getValueInstantiator(), jsonParser, "no default constructor found", new Object[0]);
        }
        return (Map) _deserializeFromArray;
    }

    public Map<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) {
        jsonParser.setCurrentValue(map);
        JsonToken currentToken = jsonParser.currentToken();
        if (currentToken == JsonToken.START_OBJECT || currentToken == JsonToken.FIELD_NAME) {
            if (this._standardStringKey) {
                _readAndUpdateStringKeyMap(jsonParser, deserializationContext, map);
                return map;
            }
            _readAndUpdate(jsonParser, deserializationContext, map);
            return map;
        }
        return (Map) deserializationContext.handleUnexpectedToken(getMapClass(), jsonParser);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JsonDeserializer<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    public final Class<?> getMapClass() {
        return this._containerType.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._containerType;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return this._valueDeserializer == null && this._keyDeserializer == null && this._valueTypeDeserializer == null && this._ignorableProperties == null && this._includableProperties == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Map;
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public void resolve(DeserializationContext deserializationContext) {
        JavaType arrayDelegateType;
        JavaType javaType;
        String format;
        if (this._valueInstantiator.canCreateUsingDelegate()) {
            arrayDelegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                javaType = this._containerType;
                format = String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, this._valueInstantiator.getClass().getName());
                deserializationContext.reportBadDefinition(javaType, format);
            }
            this._delegateDeserializer = findDeserializer(deserializationContext, arrayDelegateType, null);
        } else if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
            arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                javaType = this._containerType;
                format = String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType, this._valueInstantiator.getClass().getName());
                deserializationContext.reportBadDefinition(javaType, format);
            }
            this._delegateDeserializer = findDeserializer(deserializationContext, arrayDelegateType, null);
        }
        if (this._valueInstantiator.canCreateFromObjectWith()) {
            this._propertyBasedCreator = PropertyBasedCreator.construct(deserializationContext, this._valueInstantiator, this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig()), deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        }
        this._standardStringKey = _isStdKeyDeser(this._containerType, this._keyDeserializer);
    }

    public void setIgnorableProperties(Set<String> set) {
        if (set == null || set.size() == 0) {
            set = null;
        }
        this._ignorableProperties = set;
        this._inclusionChecker = IgnorePropertiesUtil.buildCheckerIfNeeded(set, this._includableProperties);
    }

    public void setIncludableProperties(Set<String> set) {
        this._includableProperties = set;
        this._inclusionChecker = IgnorePropertiesUtil.buildCheckerIfNeeded(this._ignorableProperties, set);
    }

    protected MapDeserializer withResolved(KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider, Set<String> set, Set<String> set2) {
        return (this._keyDeserializer == keyDeserializer && this._valueDeserializer == jsonDeserializer && this._valueTypeDeserializer == typeDeserializer && this._nullProvider == nullValueProvider && this._ignorableProperties == set && this._includableProperties == set2) ? this : new MapDeserializer(this, keyDeserializer, jsonDeserializer, typeDeserializer, nullValueProvider, set, set2);
    }
}
