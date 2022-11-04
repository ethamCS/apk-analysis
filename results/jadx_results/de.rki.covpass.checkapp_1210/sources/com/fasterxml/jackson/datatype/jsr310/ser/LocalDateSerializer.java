package com.fasterxml.jackson.datatype.jsr310.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
/* loaded from: classes.dex */
public class LocalDateSerializer extends JSR310FormattedSerializerBase<LocalDate> {
    public static final LocalDateSerializer INSTANCE = new LocalDateSerializer();

    /* renamed from: com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$fasterxml$jackson$core$JsonToken = iArr;
            try {
                iArr[JsonToken.START_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    protected LocalDateSerializer() {
        super(LocalDate.class);
    }

    protected LocalDateSerializer(LocalDateSerializer localDateSerializer, Boolean bool, DateTimeFormatter dateTimeFormatter, JsonFormat.Shape shape) {
        super(localDateSerializer, bool, dateTimeFormatter, shape);
    }

    protected void _serializeAsArrayContents(LocalDate localDate, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(localDate.getYear());
        jsonGenerator.writeNumber(localDate.getMonthValue());
        jsonGenerator.writeNumber(localDate.getDayOfMonth());
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase, com.fasterxml.jackson.databind.ser.ContextualSerializer
    public /* bridge */ /* synthetic */ JsonSerializer createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        return super.createContextual(serializerProvider, beanProperty);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310SerializerBase
    protected JsonToken serializationShape(SerializerProvider serializerProvider) {
        return useTimestamp(serializerProvider) ? this._shape == JsonFormat.Shape.NUMBER_INT ? JsonToken.VALUE_NUMBER_INT : JsonToken.START_ARRAY : JsonToken.VALUE_STRING;
    }

    public void serialize(LocalDate localDate, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (!useTimestamp(serializerProvider)) {
            DateTimeFormatter dateTimeFormatter = this._formatter;
            jsonGenerator.writeString(dateTimeFormatter == null ? localDate.toString() : localDate.format(dateTimeFormatter));
        } else if (this._shape == JsonFormat.Shape.NUMBER_INT) {
            jsonGenerator.writeNumber(localDate.toEpochDay());
        } else {
            jsonGenerator.writeStartArray();
            _serializeAsArrayContents(localDate, jsonGenerator, serializerProvider);
            jsonGenerator.writeEndArray();
        }
    }

    public void serializeWithType(LocalDate localDate, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(localDate, serializationShape(serializerProvider)));
        int i10 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[writeTypePrefix.valueShape.ordinal()];
        if (i10 == 1) {
            _serializeAsArrayContents(localDate, jsonGenerator, serializerProvider);
        } else if (i10 != 2) {
            DateTimeFormatter dateTimeFormatter = this._formatter;
            jsonGenerator.writeString(dateTimeFormatter == null ? localDate.toString() : localDate.format(dateTimeFormatter));
        } else {
            jsonGenerator.writeNumber(localDate.toEpochDay());
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase
    public LocalDateSerializer withFormat(Boolean bool, DateTimeFormatter dateTimeFormatter, JsonFormat.Shape shape) {
        return new LocalDateSerializer(this, bool, dateTimeFormatter, shape);
    }
}
