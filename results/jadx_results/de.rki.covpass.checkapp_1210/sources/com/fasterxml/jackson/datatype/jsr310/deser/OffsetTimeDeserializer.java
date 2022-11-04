package com.fasterxml.jackson.datatype.jsr310.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import j$.time.DateTimeException;
import j$.time.OffsetTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
/* loaded from: classes.dex */
public class OffsetTimeDeserializer extends JSR310DateTimeDeserializerBase<OffsetTime> {
    public static final OffsetTimeDeserializer INSTANCE = new OffsetTimeDeserializer();

    protected OffsetTimeDeserializer() {
        this(DateTimeFormatter.ISO_OFFSET_TIME);
    }

    protected OffsetTimeDeserializer(OffsetTimeDeserializer offsetTimeDeserializer, Boolean bool) {
        super(offsetTimeDeserializer, bool);
    }

    protected OffsetTimeDeserializer(DateTimeFormatter dateTimeFormatter) {
        super(OffsetTime.class, dateTimeFormatter);
    }

    protected OffsetTime _fromString(JsonParser jsonParser, DeserializationContext deserializationContext, String str) {
        Object _handleDateTimeException;
        String trim = str.trim();
        if (trim.length() == 0) {
            _handleDateTimeException = _fromEmptyString(jsonParser, deserializationContext, trim);
        } else {
            try {
                return OffsetTime.parse(trim, this._formatter);
            } catch (DateTimeException e10) {
                _handleDateTimeException = _handleDateTimeException(deserializationContext, e10, trim);
            }
        }
        return (OffsetTime) _handleDateTimeException;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public OffsetTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        int i10;
        JsonToken jsonToken = JsonToken.VALUE_STRING;
        if (jsonParser.hasToken(jsonToken)) {
            return _fromString(jsonParser, deserializationContext, jsonParser.getText());
        }
        if (jsonParser.isExpectedStartObjectToken()) {
            return _fromString(jsonParser, deserializationContext, deserializationContext.extractScalarFromObject(jsonParser, this, handledType()));
        }
        if (!jsonParser.isExpectedStartArrayToken()) {
            if (jsonParser.hasToken(JsonToken.VALUE_EMBEDDED_OBJECT)) {
                return (OffsetTime) jsonParser.getEmbeddedObject();
            }
            if (jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT)) {
                _throwNoNumericTimestampNeedTimeZone(jsonParser, deserializationContext);
            }
            throw deserializationContext.wrongTokenException(jsonParser, handledType(), JsonToken.START_ARRAY, "Expected array or string.");
        }
        JsonToken nextToken = jsonParser.nextToken();
        JsonToken jsonToken2 = JsonToken.VALUE_NUMBER_INT;
        int i11 = 0;
        if (nextToken != jsonToken2) {
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            if (nextToken == jsonToken3) {
                return null;
            }
            if ((nextToken == jsonToken || nextToken == JsonToken.VALUE_EMBEDDED_OBJECT) && deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                OffsetTime deserialize = deserialize(jsonParser, deserializationContext);
                if (jsonParser.nextToken() != jsonToken3) {
                    handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                }
                return deserialize;
            }
            deserializationContext.reportInputMismatch(handledType(), "Unexpected token (%s) within Array, expected VALUE_NUMBER_INT", nextToken);
        }
        int intValue = jsonParser.getIntValue();
        int nextIntValue = jsonParser.nextIntValue(-1);
        if (nextIntValue == -1) {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.END_ARRAY) {
                return null;
            }
            if (currentToken != jsonToken2) {
                _reportWrongToken(deserializationContext, jsonToken2, "minutes");
            }
            nextIntValue = jsonParser.getIntValue();
        }
        if (jsonParser.nextToken() == jsonToken2) {
            int intValue2 = jsonParser.getIntValue();
            if (jsonParser.nextToken() == jsonToken2) {
                int intValue3 = jsonParser.getIntValue();
                if (intValue3 < 1000 && !deserializationContext.isEnabled(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS)) {
                    intValue3 *= 1000000;
                }
                i11 = intValue3;
                jsonParser.nextToken();
            }
            i10 = i11;
            i11 = intValue2;
        } else {
            i10 = 0;
        }
        if (jsonParser.getCurrentToken() != jsonToken) {
            throw deserializationContext.wrongTokenException(jsonParser, handledType(), jsonToken, "Expected string for TimeZone after numeric values");
        }
        OffsetTime of2 = OffsetTime.of(intValue, nextIntValue, i11, i10, ZoneOffset.of(jsonParser.getText()));
        JsonToken nextToken2 = jsonParser.nextToken();
        JsonToken jsonToken4 = JsonToken.END_ARRAY;
        if (nextToken2 != jsonToken4) {
            _reportWrongToken(deserializationContext, jsonToken4, "timezone");
        }
        return of2;
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public JSR310DateTimeDeserializerBase<OffsetTime> withDateFormat(DateTimeFormatter dateTimeFormatter) {
        return new OffsetTimeDeserializer(dateTimeFormatter);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public JSR310DateTimeDeserializerBase<OffsetTime> withLeniency(Boolean bool) {
        return new OffsetTimeDeserializer(this, bool);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public JSR310DateTimeDeserializerBase<OffsetTime> withShape(JsonFormat.Shape shape) {
        return this;
    }
}
