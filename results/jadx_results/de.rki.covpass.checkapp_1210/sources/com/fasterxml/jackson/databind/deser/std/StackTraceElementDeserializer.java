package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public class StackTraceElementDeserializer extends StdScalarDeserializer<StackTraceElement> {
    public StackTraceElementDeserializer() {
        super(StackTraceElement.class);
    }

    protected StackTraceElement constructValue(DeserializationContext deserializationContext, String str, String str2, String str3, int i10, String str4, String str5, String str6) {
        return new StackTraceElement(str, str2, str3, i10);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public StackTraceElement deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.currentToken();
        if (currentToken != JsonToken.START_OBJECT) {
            if (currentToken != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                return (StackTraceElement) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            jsonParser.nextToken();
            StackTraceElement deserialize = deserialize(jsonParser, deserializationContext);
            if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                handleMissingEndArrayForSingle(jsonParser, deserializationContext);
            }
            return deserialize;
        }
        int i10 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = BuildConfig.FLAVOR;
        String str5 = str4;
        String str6 = str5;
        while (true) {
            JsonToken nextValue = jsonParser.nextValue();
            if (nextValue == JsonToken.END_OBJECT) {
                return constructValue(deserializationContext, str4, str5, str6, i10, str, str2, str3);
            }
            String currentName = jsonParser.currentName();
            if ("className".equals(currentName)) {
                str4 = jsonParser.getText();
            } else if ("classLoaderName".equals(currentName)) {
                str3 = jsonParser.getText();
            } else if ("fileName".equals(currentName)) {
                str6 = jsonParser.getText();
            } else if ("lineNumber".equals(currentName)) {
                i10 = nextValue.isNumeric() ? jsonParser.getIntValue() : _parseIntPrimitive(jsonParser, deserializationContext);
            } else if ("methodName".equals(currentName)) {
                str5 = jsonParser.getText();
            } else if (!"nativeMethod".equals(currentName)) {
                if ("moduleName".equals(currentName)) {
                    str = jsonParser.getText();
                } else if ("moduleVersion".equals(currentName)) {
                    str2 = jsonParser.getText();
                } else if (!"declaringClass".equals(currentName) && !"format".equals(currentName)) {
                    handleUnknownProperty(jsonParser, deserializationContext, this._valueClass, currentName);
                }
            }
            jsonParser.skipChildren();
        }
    }
}
