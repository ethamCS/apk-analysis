package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
/* loaded from: classes.dex */
public class AsArrayTypeDeserializer extends TypeDeserializerBase {
    public AsArrayTypeDeserializer(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z10, JavaType javaType2) {
        super(javaType, typeIdResolver, str, z10, javaType2);
    }

    public AsArrayTypeDeserializer(AsArrayTypeDeserializer asArrayTypeDeserializer, BeanProperty beanProperty) {
        super(asArrayTypeDeserializer, beanProperty);
    }

    protected Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object typeId;
        if (!jsonParser.canReadTypeId() || (typeId = jsonParser.getTypeId()) == null) {
            boolean isExpectedStartArrayToken = jsonParser.isExpectedStartArrayToken();
            String _locateTypeId = _locateTypeId(jsonParser, deserializationContext);
            JsonDeserializer<Object> _findDeserializer = _findDeserializer(deserializationContext, _locateTypeId);
            if (this._typeIdVisible && !_usesExternalId() && jsonParser.hasToken(JsonToken.START_OBJECT)) {
                TokenBuffer bufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
                bufferForInputBuffering.writeStartObject();
                bufferForInputBuffering.writeFieldName(this._typePropertyName);
                bufferForInputBuffering.writeString(_locateTypeId);
                jsonParser.clearCurrentToken();
                jsonParser = JsonParserSequence.createFlattened(false, bufferForInputBuffering.asParser(jsonParser), jsonParser);
                jsonParser.nextToken();
            }
            if (isExpectedStartArrayToken && jsonParser.currentToken() == JsonToken.END_ARRAY) {
                return _findDeserializer.getNullValue(deserializationContext);
            }
            Object deserialize = _findDeserializer.deserialize(jsonParser, deserializationContext);
            if (isExpectedStartArrayToken) {
                JsonToken nextToken = jsonParser.nextToken();
                JsonToken jsonToken = JsonToken.END_ARRAY;
                if (nextToken != jsonToken) {
                    deserializationContext.reportWrongTokenException(baseType(), jsonToken, "expected closing END_ARRAY after type information and deserialized value", new Object[0]);
                }
            }
            return deserialize;
        }
        return _deserializeWithNativeTypeId(jsonParser, deserializationContext, typeId);
    }

    protected String _locateTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.isExpectedStartArrayToken()) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            if (nextToken != jsonToken) {
                deserializationContext.reportWrongTokenException(baseType(), jsonToken, "need JSON String that contains type id (for subtype of %s)", baseTypeName());
                return null;
            }
            String text = jsonParser.getText();
            jsonParser.nextToken();
            return text;
        } else if (this._defaultImpl != null) {
            return this._idResolver.idFromBaseType();
        } else {
            JavaType baseType = baseType();
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            deserializationContext.reportWrongTokenException(baseType, jsonToken2, "need JSON Array to contain As.WRAPPER_ARRAY type information for class " + baseTypeName(), new Object[0]);
            return null;
        }
    }

    protected boolean _usesExternalId() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromScalar(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public TypeDeserializer forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsArrayTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.WRAPPER_ARRAY;
    }
}
