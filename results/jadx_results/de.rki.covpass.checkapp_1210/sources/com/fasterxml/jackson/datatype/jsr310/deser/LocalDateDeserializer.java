package com.fasterxml.jackson.datatype.jsr310.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
/* loaded from: classes.dex */
public class LocalDateDeserializer extends JSR310DateTimeDeserializerBase<LocalDate> {
    private static final DateTimeFormatter DEFAULT_FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE;
    public static final LocalDateDeserializer INSTANCE = new LocalDateDeserializer();

    protected LocalDateDeserializer() {
        this(DEFAULT_FORMATTER);
    }

    protected LocalDateDeserializer(LocalDateDeserializer localDateDeserializer, JsonFormat.Shape shape) {
        super(localDateDeserializer, shape);
    }

    public LocalDateDeserializer(LocalDateDeserializer localDateDeserializer, DateTimeFormatter dateTimeFormatter) {
        super(localDateDeserializer, dateTimeFormatter);
    }

    protected LocalDateDeserializer(LocalDateDeserializer localDateDeserializer, Boolean bool) {
        super(localDateDeserializer, bool);
    }

    public LocalDateDeserializer(DateTimeFormatter dateTimeFormatter) {
        super(LocalDate.class, dateTimeFormatter);
    }

    protected LocalDate _fromString(JsonParser jsonParser, DeserializationContext deserializationContext, String str) {
        Object _handleDateTimeException;
        String trim = str.trim();
        if (trim.length() == 0) {
            _handleDateTimeException = _fromEmptyString(jsonParser, deserializationContext, trim);
        } else {
            try {
                DateTimeFormatter dateTimeFormatter = this._formatter;
                return (dateTimeFormatter == DEFAULT_FORMATTER && trim.length() > 10 && trim.charAt(10) == 'T') ? isLenient() ? trim.endsWith("Z") ? LocalDate.parse(trim.substring(0, trim.length() - 1), DateTimeFormatter.ISO_LOCAL_DATE_TIME) : LocalDate.parse(trim, DateTimeFormatter.ISO_LOCAL_DATE_TIME) : (LocalDate) deserializationContext.handleWeirdStringValue(getValueType(deserializationContext).getRawClass(), trim, "Should not contain time component when 'strict' mode set for property or type (enable 'lenient' handling to allow)", new Object[0]) : LocalDate.parse(trim, dateTimeFormatter);
            } catch (DateTimeException e10) {
                _handleDateTimeException = _handleDateTimeException(deserializationContext, e10, trim);
            }
        }
        return (LocalDate) _handleDateTimeException;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LocalDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken jsonToken = JsonToken.VALUE_STRING;
        if (jsonParser.hasToken(jsonToken)) {
            return _fromString(jsonParser, deserializationContext, jsonParser.getText());
        }
        if (jsonParser.isExpectedStartObjectToken()) {
            return _fromString(jsonParser, deserializationContext, deserializationContext.extractScalarFromObject(jsonParser, this, handledType()));
        }
        if (jsonParser.isExpectedStartArrayToken()) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken2 = JsonToken.END_ARRAY;
            if (nextToken == jsonToken2) {
                return null;
            }
            if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS) && (nextToken == jsonToken || nextToken == JsonToken.VALUE_EMBEDDED_OBJECT)) {
                LocalDate deserialize = deserialize(jsonParser, deserializationContext);
                if (jsonParser.nextToken() != jsonToken2) {
                    handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                }
                return deserialize;
            } else if (nextToken == JsonToken.VALUE_NUMBER_INT) {
                int intValue = jsonParser.getIntValue();
                int nextIntValue = jsonParser.nextIntValue(-1);
                int nextIntValue2 = jsonParser.nextIntValue(-1);
                if (jsonParser.nextToken() != jsonToken2) {
                    throw deserializationContext.wrongTokenException(jsonParser, handledType(), jsonToken2, "Expected array to end");
                }
                return LocalDate.of(intValue, nextIntValue, nextIntValue2);
            } else {
                deserializationContext.reportInputMismatch(handledType(), "Unexpected token (%s) within Array, expected VALUE_NUMBER_INT", nextToken);
            }
        }
        return jsonParser.hasToken(JsonToken.VALUE_EMBEDDED_OBJECT) ? (LocalDate) jsonParser.getEmbeddedObject() : jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT) ? (this._shape == JsonFormat.Shape.NUMBER_INT || isLenient()) ? LocalDate.ofEpochDay(jsonParser.getLongValue()) : _failForNotLenient(jsonParser, deserializationContext, jsonToken) : (LocalDate) _handleUnexpectedToken(deserializationContext, jsonParser, "Expected array or string.", new Object[0]);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public JSR310DateTimeDeserializerBase<LocalDate> withDateFormat(DateTimeFormatter dateTimeFormatter) {
        return new LocalDateDeserializer(this, dateTimeFormatter);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public JSR310DateTimeDeserializerBase<LocalDate> withLeniency(Boolean bool) {
        return new LocalDateDeserializer(this, bool);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase
    public JSR310DateTimeDeserializerBase<LocalDate> withShape(JsonFormat.Shape shape) {
        return new LocalDateDeserializer(this, shape);
    }
}
