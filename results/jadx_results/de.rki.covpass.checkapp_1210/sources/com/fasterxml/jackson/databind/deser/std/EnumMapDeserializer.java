package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.util.EnumMap;
/* loaded from: classes.dex */
public class EnumMapDeserializer extends ContainerDeserializerBase<EnumMap<?, ?>> implements ContextualDeserializer, ResolvableDeserializer {
    protected JsonDeserializer<Object> _delegateDeserializer;
    protected final Class<?> _enumClass;
    protected KeyDeserializer _keyDeserializer;
    protected PropertyBasedCreator _propertyBasedCreator;
    protected JsonDeserializer<Object> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final TypeDeserializer _valueTypeDeserializer;

    public EnumMapDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, KeyDeserializer keyDeserializer, JsonDeserializer<?> jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider) {
        super(javaType, nullValueProvider, (Boolean) null);
        this._enumClass = javaType.getKeyType().getRawClass();
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._valueInstantiator = valueInstantiator;
    }

    protected EnumMapDeserializer(EnumMapDeserializer enumMapDeserializer, KeyDeserializer keyDeserializer, JsonDeserializer<?> jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider) {
        super(enumMapDeserializer, nullValueProvider, enumMapDeserializer._unwrapSingle);
        this._enumClass = enumMapDeserializer._enumClass;
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._valueInstantiator = enumMapDeserializer._valueInstantiator;
        this._delegateDeserializer = enumMapDeserializer._delegateDeserializer;
        this._propertyBasedCreator = enumMapDeserializer._propertyBasedCreator;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1 A[Catch: Exception -> 0x00a6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a6, blocks: (B:28:0x0080, B:30:0x0084, B:33:0x0089, B:34:0x0090, B:36:0x0094, B:37:0x009b, B:42:0x00b1), top: B:44:0x0080 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0034 -> B:4:0x000d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0079 -> B:4:0x000d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0088 -> B:4:0x000d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00a1 -> B:4:0x000d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.EnumMap<?, ?> _deserializeUsingProperties(com.fasterxml.jackson.core.JsonParser r8, com.fasterxml.jackson.databind.DeserializationContext r9) {
        /*
            r7 = this;
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator r0 = r7._propertyBasedCreator
            r1 = 0
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer r2 = r0.startBuilding(r8, r9, r1)
            boolean r3 = r8.isExpectedStartObjectToken()
            if (r3 == 0) goto L12
        Ld:
            java.lang.String r3 = r8.nextFieldName()
            goto L20
        L12:
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            boolean r3 = r8.hasToken(r3)
            if (r3 == 0) goto L1f
            java.lang.String r3 = r8.currentName()
            goto L20
        L1f:
            r3 = r1
        L20:
            if (r3 == 0) goto Lb1
            com.fasterxml.jackson.core.JsonToken r4 = r8.nextToken()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r5 = r0.findCreatorProperty(r3)
            if (r5 == 0) goto L52
            java.lang.Object r4 = r5.deserialize(r8, r9)
            boolean r4 = r2.assignParameter(r5, r4)
            if (r4 == 0) goto Ld
            r8.nextToken()
            java.lang.Object r0 = r0.build(r9, r2)     // Catch: java.lang.Exception -> L44
            java.util.EnumMap r0 = (java.util.EnumMap) r0     // Catch: java.lang.Exception -> L44
            java.util.EnumMap r8 = r7.deserialize(r8, r9, r0)
            return r8
        L44:
            r8 = move-exception
            com.fasterxml.jackson.databind.JavaType r0 = r7._containerType
            java.lang.Class r0 = r0.getRawClass()
            java.lang.Object r8 = r7.wrapAndThrow(r9, r8, r0, r3)
        L4f:
            java.util.EnumMap r8 = (java.util.EnumMap) r8
            return r8
        L52:
            com.fasterxml.jackson.databind.KeyDeserializer r5 = r7._keyDeserializer
            java.lang.Object r5 = r5.deserializeKey(r3, r9)
            java.lang.Enum r5 = (java.lang.Enum) r5
            if (r5 != 0) goto L80
            com.fasterxml.jackson.databind.DeserializationFeature r4 = com.fasterxml.jackson.databind.DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL
            boolean r4 = r9.isEnabled(r4)
            if (r4 != 0) goto L79
            java.lang.Class<?> r8 = r7._enumClass
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            com.fasterxml.jackson.databind.JavaType r2 = r7._containerType
            com.fasterxml.jackson.databind.JavaType r2 = r2.getKeyType()
            r0[r1] = r2
            java.lang.String r1 = "value not one of declared Enum instance names for %s"
            java.lang.Object r8 = r9.handleWeirdStringValue(r8, r3, r1, r0)
            goto L4f
        L79:
            r8.nextToken()
            r8.skipChildren()
            goto Ld
        L80:
            com.fasterxml.jackson.core.JsonToken r6 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch: java.lang.Exception -> La6
            if (r4 != r6) goto L90
            boolean r4 = r7._skipNullValues     // Catch: java.lang.Exception -> La6
            if (r4 == 0) goto L89
            goto Ld
        L89:
            com.fasterxml.jackson.databind.deser.NullValueProvider r4 = r7._nullProvider     // Catch: java.lang.Exception -> La6
            java.lang.Object r3 = r4.getNullValue(r9)     // Catch: java.lang.Exception -> La6
            goto La1
        L90:
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r4 = r7._valueTypeDeserializer     // Catch: java.lang.Exception -> La6
            if (r4 != 0) goto L9b
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r4 = r7._valueDeserializer     // Catch: java.lang.Exception -> La6
            java.lang.Object r3 = r4.deserialize(r8, r9)     // Catch: java.lang.Exception -> La6
            goto La1
        L9b:
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r6 = r7._valueDeserializer     // Catch: java.lang.Exception -> La6
            java.lang.Object r3 = r6.deserializeWithType(r8, r9, r4)     // Catch: java.lang.Exception -> La6
        La1:
            r2.bufferMapProperty(r5, r3)
            goto Ld
        La6:
            r8 = move-exception
            com.fasterxml.jackson.databind.JavaType r0 = r7._containerType
            java.lang.Class r0 = r0.getRawClass()
            r7.wrapAndThrow(r9, r8, r0, r3)
            return r1
        Lb1:
            java.lang.Object r8 = r0.build(r9, r2)     // Catch: java.lang.Exception -> La6
            java.util.EnumMap r8 = (java.util.EnumMap) r8     // Catch: java.lang.Exception -> La6
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer._deserializeUsingProperties(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):java.util.EnumMap");
    }

    protected EnumMap<?, ?> constructMap(DeserializationContext deserializationContext) {
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (valueInstantiator == null) {
            return new EnumMap<>(this._enumClass);
        }
        try {
            return !valueInstantiator.canCreateUsingDefault() ? (EnumMap) deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), null, "no default constructor found", new Object[0]) : (EnumMap) this._valueInstantiator.createUsingDefault(deserializationContext);
        } catch (IOException e10) {
            return (EnumMap) ClassUtil.throwAsMappingException(deserializationContext, e10);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        KeyDeserializer keyDeserializer = this._keyDeserializer;
        if (keyDeserializer == null) {
            keyDeserializer = deserializationContext.findKeyDeserializer(this._containerType.getKeyType(), beanProperty);
        }
        JsonDeserializer<?> jsonDeserializer = this._valueDeserializer;
        JavaType contentType = this._containerType.getContentType();
        JsonDeserializer<?> findContextualValueDeserializer = jsonDeserializer == null ? deserializationContext.findContextualValueDeserializer(contentType, beanProperty) : deserializationContext.handleSecondaryContextualization(jsonDeserializer, beanProperty, contentType);
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(beanProperty);
        }
        return withResolved(keyDeserializer, findContextualValueDeserializer, typeDeserializer, findContentNullProvider(deserializationContext, beanProperty, findContextualValueDeserializer));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public EnumMap<?, ?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingProperties(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return (EnumMap) this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        int currentTokenId = jsonParser.currentTokenId();
        if (currentTokenId != 1 && currentTokenId != 2) {
            if (currentTokenId == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (currentTokenId != 5) {
                return currentTokenId != 6 ? (EnumMap) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser) : _deserializeFromString(jsonParser, deserializationContext);
            }
        }
        return deserialize(jsonParser, deserializationContext, (EnumMap) constructMap(deserializationContext));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:4:0x000e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0064 -> B:4:0x000e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0077 -> B:4:0x000e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.EnumMap<?, ?> deserialize(com.fasterxml.jackson.core.JsonParser r8, com.fasterxml.jackson.databind.DeserializationContext r9, java.util.EnumMap r10) {
        /*
            r7 = this;
            r8.setCurrentValue(r10)
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r7._valueDeserializer
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r1 = r7._valueTypeDeserializer
            boolean r2 = r8.isExpectedStartObjectToken()
            r3 = 0
            if (r2 == 0) goto L13
        Le:
            java.lang.String r2 = r8.nextFieldName()
            goto L2a
        L13:
            com.fasterxml.jackson.core.JsonToken r2 = r8.currentToken()
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            if (r2 == r4) goto L26
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r2 != r5) goto L20
            return r10
        L20:
            r2 = 0
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r9.reportWrongTokenException(r7, r4, r2, r5)
        L26:
            java.lang.String r2 = r8.currentName()
        L2a:
            if (r2 == 0) goto L81
            com.fasterxml.jackson.databind.KeyDeserializer r4 = r7._keyDeserializer
            java.lang.Object r4 = r4.deserializeKey(r2, r9)
            java.lang.Enum r4 = (java.lang.Enum) r4
            com.fasterxml.jackson.core.JsonToken r5 = r8.nextToken()
            if (r4 != 0) goto L5c
            com.fasterxml.jackson.databind.DeserializationFeature r4 = com.fasterxml.jackson.databind.DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL
            boolean r4 = r9.isEnabled(r4)
            if (r4 != 0) goto L58
            java.lang.Class<?> r8 = r7._enumClass
            r10 = 1
            java.lang.Object[] r10 = new java.lang.Object[r10]
            com.fasterxml.jackson.databind.JavaType r0 = r7._containerType
            com.fasterxml.jackson.databind.JavaType r0 = r0.getKeyType()
            r10[r3] = r0
            java.lang.String r0 = "value not one of declared Enum instance names for %s"
            java.lang.Object r8 = r9.handleWeirdStringValue(r8, r2, r0, r10)
        L55:
            java.util.EnumMap r8 = (java.util.EnumMap) r8
            return r8
        L58:
            r8.skipChildren()
            goto Le
        L5c:
            com.fasterxml.jackson.core.JsonToken r6 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch: java.lang.Exception -> L7b
            if (r5 != r6) goto L6c
            boolean r5 = r7._skipNullValues     // Catch: java.lang.Exception -> L7b
            if (r5 == 0) goto L65
            goto Le
        L65:
            com.fasterxml.jackson.databind.deser.NullValueProvider r5 = r7._nullProvider     // Catch: java.lang.Exception -> L7b
            java.lang.Object r2 = r5.getNullValue(r9)     // Catch: java.lang.Exception -> L7b
            goto L77
        L6c:
            if (r1 != 0) goto L73
            java.lang.Object r2 = r0.deserialize(r8, r9)     // Catch: java.lang.Exception -> L7b
            goto L77
        L73:
            java.lang.Object r2 = r0.deserializeWithType(r8, r9, r1)     // Catch: java.lang.Exception -> L7b
        L77:
            r10.put(r4, r2)
            goto Le
        L7b:
            r8 = move-exception
            java.lang.Object r8 = r7.wrapAndThrow(r9, r8, r10, r2)
            goto L55
        L81:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.EnumMap):java.util.EnumMap");
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JsonDeserializer<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) {
        return constructMap(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return this._valueDeserializer == null && this._keyDeserializer == null && this._valueTypeDeserializer == null;
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
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (valueInstantiator != null) {
            if (valueInstantiator.canCreateUsingDelegate()) {
                arrayDelegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
                if (arrayDelegateType == null) {
                    javaType = this._containerType;
                    format = String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, this._valueInstantiator.getClass().getName());
                    deserializationContext.reportBadDefinition(javaType, format);
                }
                this._delegateDeserializer = findDeserializer(deserializationContext, arrayDelegateType, null);
            } else if (!this._valueInstantiator.canCreateUsingArrayDelegate()) {
                if (!this._valueInstantiator.canCreateFromObjectWith()) {
                    return;
                }
                this._propertyBasedCreator = PropertyBasedCreator.construct(deserializationContext, this._valueInstantiator, this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig()), deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
            } else {
                arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
                if (arrayDelegateType == null) {
                    javaType = this._containerType;
                    format = String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType, this._valueInstantiator.getClass().getName());
                    deserializationContext.reportBadDefinition(javaType, format);
                }
                this._delegateDeserializer = findDeserializer(deserializationContext, arrayDelegateType, null);
            }
        }
    }

    public EnumMapDeserializer withResolved(KeyDeserializer keyDeserializer, JsonDeserializer<?> jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider) {
        return (keyDeserializer == this._keyDeserializer && nullValueProvider == this._nullProvider && jsonDeserializer == this._valueDeserializer && typeDeserializer == this._valueTypeDeserializer) ? this : new EnumMapDeserializer(this, keyDeserializer, jsonDeserializer, typeDeserializer, nullValueProvider);
    }
}
