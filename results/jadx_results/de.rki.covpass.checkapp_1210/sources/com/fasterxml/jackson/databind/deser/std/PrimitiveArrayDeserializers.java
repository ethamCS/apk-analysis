package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class PrimitiveArrayDeserializers<T> extends StdDeserializer<T> implements ContextualDeserializer {
    private transient Object _emptyValue;
    protected final NullValueProvider _nuller;
    protected final Boolean _unwrapSingle;

    /* JADX INFO: Access modifiers changed from: package-private */
    @JacksonStdImpl
    /* loaded from: classes.dex */
    public static final class BooleanDeser extends PrimitiveArrayDeserializers<boolean[]> {
        public BooleanDeser() {
            super(boolean[].class);
        }

        protected BooleanDeser(BooleanDeser booleanDeser, NullValueProvider nullValueProvider, Boolean bool) {
            super(booleanDeser, nullValueProvider, bool);
        }

        public boolean[] _concat(boolean[] zArr, boolean[] zArr2) {
            int length = zArr.length;
            int length2 = zArr2.length;
            boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
            System.arraycopy(zArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public boolean[] _constructEmpty() {
            return new boolean[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public boolean[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Exception e10;
            boolean[] completeAndClearBuffer;
            boolean z10;
            int i10;
            if (!jsonParser.isExpectedStartArrayToken()) {
                completeAndClearBuffer = handleNonArray(jsonParser, deserializationContext);
            } else {
                ArrayBuilders.BooleanBuilder booleanBuilder = deserializationContext.getArrayBuilders().getBooleanBuilder();
                boolean[] resetAndStart = booleanBuilder.resetAndStart();
                int i11 = 0;
                while (true) {
                    try {
                        JsonToken nextToken = jsonParser.nextToken();
                        if (nextToken == JsonToken.END_ARRAY) {
                            break;
                        }
                        try {
                            if (nextToken == JsonToken.VALUE_TRUE) {
                                z10 = true;
                            } else {
                                if (nextToken != JsonToken.VALUE_FALSE) {
                                    if (nextToken == JsonToken.VALUE_NULL) {
                                        NullValueProvider nullValueProvider = this._nuller;
                                        if (nullValueProvider != null) {
                                            nullValueProvider.getNullValue(deserializationContext);
                                        } else {
                                            _verifyNullForPrimitive(deserializationContext);
                                        }
                                    } else {
                                        z10 = _parseBooleanPrimitive(jsonParser, deserializationContext);
                                    }
                                }
                                z10 = false;
                            }
                            resetAndStart[i11] = z10;
                            i11 = i10;
                        } catch (Exception e11) {
                            e10 = e11;
                            i11 = i10;
                            throw JsonMappingException.wrapWithPath(e10, resetAndStart, booleanBuilder.bufferedSize() + i11);
                        }
                        if (i11 >= resetAndStart.length) {
                            boolean[] appendCompletedChunk = booleanBuilder.appendCompletedChunk(resetAndStart, i11);
                            i11 = 0;
                            resetAndStart = appendCompletedChunk;
                        }
                        i10 = i11 + 1;
                    } catch (Exception e12) {
                        e10 = e12;
                    }
                }
                completeAndClearBuffer = booleanBuilder.completeAndClearBuffer(resetAndStart, i11);
            }
            return completeAndClearBuffer;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public boolean[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new boolean[]{_parseBooleanPrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new BooleanDeser(this, nullValueProvider, bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @JacksonStdImpl
    /* loaded from: classes.dex */
    public static final class ByteDeser extends PrimitiveArrayDeserializers<byte[]> {
        public ByteDeser() {
            super(byte[].class);
        }

        protected ByteDeser(ByteDeser byteDeser, NullValueProvider nullValueProvider, Boolean bool) {
            super(byteDeser, nullValueProvider, bool);
        }

        public byte[] _concat(byte[] bArr, byte[] bArr2) {
            int length = bArr.length;
            int length2 = bArr2.length;
            byte[] copyOf = Arrays.copyOf(bArr, length + length2);
            System.arraycopy(bArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public byte[] _constructEmpty() {
            return new byte[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public byte[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Object handleWeirdStringValue;
            Exception e10;
            byte byteValue;
            int i10;
            JsonToken currentToken = jsonParser.currentToken();
            if (currentToken == JsonToken.VALUE_STRING) {
                try {
                    return jsonParser.getBinaryValue(deserializationContext.getBase64Variant());
                } catch (StreamReadException e11) {
                    String originalMessage = e11.getOriginalMessage();
                    if (originalMessage.contains("base64")) {
                        handleWeirdStringValue = deserializationContext.handleWeirdStringValue(byte[].class, jsonParser.getText(), originalMessage, new Object[0]);
                    }
                }
            }
            if (currentToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object embeddedObject = jsonParser.getEmbeddedObject();
                if (embeddedObject == null) {
                    return null;
                }
                if (embeddedObject instanceof byte[]) {
                    return (byte[]) embeddedObject;
                }
            }
            if (!jsonParser.isExpectedStartArrayToken()) {
                handleWeirdStringValue = handleNonArray(jsonParser, deserializationContext);
            } else {
                ArrayBuilders.ByteBuilder byteBuilder = deserializationContext.getArrayBuilders().getByteBuilder();
                byte[] resetAndStart = byteBuilder.resetAndStart();
                int i11 = 0;
                while (true) {
                    try {
                        JsonToken nextToken = jsonParser.nextToken();
                        if (nextToken == JsonToken.END_ARRAY) {
                            break;
                        }
                        try {
                            if (nextToken == JsonToken.VALUE_NUMBER_INT) {
                                byteValue = jsonParser.getByteValue();
                            } else if (nextToken == JsonToken.VALUE_NULL) {
                                NullValueProvider nullValueProvider = this._nuller;
                                if (nullValueProvider != null) {
                                    nullValueProvider.getNullValue(deserializationContext);
                                } else {
                                    _verifyNullForPrimitive(deserializationContext);
                                    byteValue = 0;
                                }
                            } else {
                                byteValue = _parseBytePrimitive(jsonParser, deserializationContext);
                            }
                            resetAndStart[i11] = byteValue;
                            i11 = i10;
                        } catch (Exception e12) {
                            e10 = e12;
                            i11 = i10;
                            throw JsonMappingException.wrapWithPath(e10, resetAndStart, byteBuilder.bufferedSize() + i11);
                        }
                        if (i11 >= resetAndStart.length) {
                            byte[] appendCompletedChunk = byteBuilder.appendCompletedChunk(resetAndStart, i11);
                            i11 = 0;
                            resetAndStart = appendCompletedChunk;
                        }
                        i10 = i11 + 1;
                    } catch (Exception e13) {
                        e10 = e13;
                    }
                }
                handleWeirdStringValue = byteBuilder.completeAndClearBuffer(resetAndStart, i11);
            }
            return (byte[]) handleWeirdStringValue;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public byte[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) {
            byte b10;
            JsonToken currentToken = jsonParser.currentToken();
            if (currentToken == JsonToken.VALUE_NUMBER_INT) {
                b10 = jsonParser.getByteValue();
            } else if (currentToken == JsonToken.VALUE_NULL) {
                NullValueProvider nullValueProvider = this._nuller;
                if (nullValueProvider != null) {
                    nullValueProvider.getNullValue(deserializationContext);
                    return (byte[]) getEmptyValue(deserializationContext);
                }
                _verifyNullForPrimitive(deserializationContext);
                return null;
            } else {
                b10 = ((Number) deserializationContext.handleUnexpectedToken(this._valueClass.getComponentType(), jsonParser)).byteValue();
            }
            return new byte[]{b10};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers, com.fasterxml.jackson.databind.JsonDeserializer
        public LogicalType logicalType() {
            return LogicalType.Binary;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new ByteDeser(this, nullValueProvider, bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @JacksonStdImpl
    /* loaded from: classes.dex */
    public static final class CharDeser extends PrimitiveArrayDeserializers<char[]> {
        public CharDeser() {
            super(char[].class);
        }

        public char[] _concat(char[] cArr, char[] cArr2) {
            int length = cArr.length;
            int length2 = cArr2.length;
            char[] copyOf = Arrays.copyOf(cArr, length + length2);
            System.arraycopy(cArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public char[] _constructEmpty() {
            return new char[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public char[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            String text;
            if (jsonParser.hasToken(JsonToken.VALUE_STRING)) {
                char[] textCharacters = jsonParser.getTextCharacters();
                int textOffset = jsonParser.getTextOffset();
                int textLength = jsonParser.getTextLength();
                char[] cArr = new char[textLength];
                System.arraycopy(textCharacters, textOffset, cArr, 0, textLength);
                return cArr;
            } else if (!jsonParser.isExpectedStartArrayToken()) {
                if (jsonParser.hasToken(JsonToken.VALUE_EMBEDDED_OBJECT)) {
                    Object embeddedObject = jsonParser.getEmbeddedObject();
                    if (embeddedObject == null) {
                        return null;
                    }
                    if (embeddedObject instanceof char[]) {
                        return (char[]) embeddedObject;
                    }
                    if (embeddedObject instanceof String) {
                        return ((String) embeddedObject).toCharArray();
                    }
                    if (embeddedObject instanceof byte[]) {
                        return Base64Variants.getDefaultVariant().encode((byte[]) embeddedObject, false).toCharArray();
                    }
                }
                return (char[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            } else {
                StringBuilder sb2 = new StringBuilder(64);
                while (true) {
                    JsonToken nextToken = jsonParser.nextToken();
                    if (nextToken == JsonToken.END_ARRAY) {
                        return sb2.toString().toCharArray();
                    }
                    if (nextToken == JsonToken.VALUE_STRING) {
                        text = jsonParser.getText();
                    } else if (nextToken == JsonToken.VALUE_NULL) {
                        NullValueProvider nullValueProvider = this._nuller;
                        if (nullValueProvider != null) {
                            nullValueProvider.getNullValue(deserializationContext);
                        } else {
                            _verifyNullForPrimitive(deserializationContext);
                            text = "\u0000";
                        }
                    } else {
                        text = ((CharSequence) deserializationContext.handleUnexpectedToken(Character.TYPE, jsonParser)).toString();
                    }
                    if (text.length() != 1) {
                        deserializationContext.reportInputMismatch(this, "Cannot convert a JSON String of length %d into a char element of char array", Integer.valueOf(text.length()));
                    }
                    sb2.append(text.charAt(0));
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public char[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return (char[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @JacksonStdImpl
    /* loaded from: classes.dex */
    public static final class DoubleDeser extends PrimitiveArrayDeserializers<double[]> {
        public DoubleDeser() {
            super(double[].class);
        }

        protected DoubleDeser(DoubleDeser doubleDeser, NullValueProvider nullValueProvider, Boolean bool) {
            super(doubleDeser, nullValueProvider, bool);
        }

        public double[] _concat(double[] dArr, double[] dArr2) {
            int length = dArr.length;
            int length2 = dArr2.length;
            double[] copyOf = Arrays.copyOf(dArr, length + length2);
            System.arraycopy(dArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public double[] _constructEmpty() {
            return new double[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public double[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Exception e10;
            double[] completeAndClearBuffer;
            NullValueProvider nullValueProvider;
            if (!jsonParser.isExpectedStartArrayToken()) {
                completeAndClearBuffer = handleNonArray(jsonParser, deserializationContext);
            } else {
                ArrayBuilders.DoubleBuilder doubleBuilder = deserializationContext.getArrayBuilders().getDoubleBuilder();
                double[] resetAndStart = doubleBuilder.resetAndStart();
                int i10 = 0;
                while (true) {
                    try {
                        JsonToken nextToken = jsonParser.nextToken();
                        if (nextToken == JsonToken.END_ARRAY) {
                            break;
                        } else if (nextToken != JsonToken.VALUE_NULL || (nullValueProvider = this._nuller) == null) {
                            double _parseDoublePrimitive = _parseDoublePrimitive(jsonParser, deserializationContext);
                            if (i10 >= resetAndStart.length) {
                                double[] appendCompletedChunk = doubleBuilder.appendCompletedChunk(resetAndStart, i10);
                                i10 = 0;
                                resetAndStart = appendCompletedChunk;
                            }
                            int i11 = i10 + 1;
                            try {
                                resetAndStart[i10] = _parseDoublePrimitive;
                                i10 = i11;
                            } catch (Exception e11) {
                                e10 = e11;
                                i10 = i11;
                                throw JsonMappingException.wrapWithPath(e10, resetAndStart, doubleBuilder.bufferedSize() + i10);
                            }
                        } else {
                            nullValueProvider.getNullValue(deserializationContext);
                        }
                    } catch (Exception e12) {
                        e10 = e12;
                    }
                }
                completeAndClearBuffer = doubleBuilder.completeAndClearBuffer(resetAndStart, i10);
            }
            return completeAndClearBuffer;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public double[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new double[]{_parseDoublePrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new DoubleDeser(this, nullValueProvider, bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @JacksonStdImpl
    /* loaded from: classes.dex */
    public static final class FloatDeser extends PrimitiveArrayDeserializers<float[]> {
        public FloatDeser() {
            super(float[].class);
        }

        protected FloatDeser(FloatDeser floatDeser, NullValueProvider nullValueProvider, Boolean bool) {
            super(floatDeser, nullValueProvider, bool);
        }

        public float[] _concat(float[] fArr, float[] fArr2) {
            int length = fArr.length;
            int length2 = fArr2.length;
            float[] copyOf = Arrays.copyOf(fArr, length + length2);
            System.arraycopy(fArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public float[] _constructEmpty() {
            return new float[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public float[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Exception e10;
            float[] completeAndClearBuffer;
            NullValueProvider nullValueProvider;
            if (!jsonParser.isExpectedStartArrayToken()) {
                completeAndClearBuffer = handleNonArray(jsonParser, deserializationContext);
            } else {
                ArrayBuilders.FloatBuilder floatBuilder = deserializationContext.getArrayBuilders().getFloatBuilder();
                float[] resetAndStart = floatBuilder.resetAndStart();
                int i10 = 0;
                while (true) {
                    try {
                        JsonToken nextToken = jsonParser.nextToken();
                        if (nextToken == JsonToken.END_ARRAY) {
                            break;
                        } else if (nextToken != JsonToken.VALUE_NULL || (nullValueProvider = this._nuller) == null) {
                            float _parseFloatPrimitive = _parseFloatPrimitive(jsonParser, deserializationContext);
                            if (i10 >= resetAndStart.length) {
                                float[] appendCompletedChunk = floatBuilder.appendCompletedChunk(resetAndStart, i10);
                                i10 = 0;
                                resetAndStart = appendCompletedChunk;
                            }
                            int i11 = i10 + 1;
                            try {
                                resetAndStart[i10] = _parseFloatPrimitive;
                                i10 = i11;
                            } catch (Exception e11) {
                                e10 = e11;
                                i10 = i11;
                                throw JsonMappingException.wrapWithPath(e10, resetAndStart, floatBuilder.bufferedSize() + i10);
                            }
                        } else {
                            nullValueProvider.getNullValue(deserializationContext);
                        }
                    } catch (Exception e12) {
                        e10 = e12;
                    }
                }
                completeAndClearBuffer = floatBuilder.completeAndClearBuffer(resetAndStart, i10);
            }
            return completeAndClearBuffer;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public float[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new float[]{_parseFloatPrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new FloatDeser(this, nullValueProvider, bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @JacksonStdImpl
    /* loaded from: classes.dex */
    public static final class IntDeser extends PrimitiveArrayDeserializers<int[]> {
        public static final IntDeser instance = new IntDeser();

        public IntDeser() {
            super(int[].class);
        }

        protected IntDeser(IntDeser intDeser, NullValueProvider nullValueProvider, Boolean bool) {
            super(intDeser, nullValueProvider, bool);
        }

        public int[] _concat(int[] iArr, int[] iArr2) {
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] copyOf = Arrays.copyOf(iArr, length + length2);
            System.arraycopy(iArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public int[] _constructEmpty() {
            return new int[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public int[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Exception e10;
            int[] completeAndClearBuffer;
            int intValue;
            int i10;
            if (!jsonParser.isExpectedStartArrayToken()) {
                completeAndClearBuffer = handleNonArray(jsonParser, deserializationContext);
            } else {
                ArrayBuilders.IntBuilder intBuilder = deserializationContext.getArrayBuilders().getIntBuilder();
                int[] resetAndStart = intBuilder.resetAndStart();
                int i11 = 0;
                while (true) {
                    try {
                        JsonToken nextToken = jsonParser.nextToken();
                        if (nextToken == JsonToken.END_ARRAY) {
                            break;
                        }
                        try {
                            if (nextToken == JsonToken.VALUE_NUMBER_INT) {
                                intValue = jsonParser.getIntValue();
                            } else if (nextToken == JsonToken.VALUE_NULL) {
                                NullValueProvider nullValueProvider = this._nuller;
                                if (nullValueProvider != null) {
                                    nullValueProvider.getNullValue(deserializationContext);
                                } else {
                                    _verifyNullForPrimitive(deserializationContext);
                                    intValue = 0;
                                }
                            } else {
                                intValue = _parseIntPrimitive(jsonParser, deserializationContext);
                            }
                            resetAndStart[i11] = intValue;
                            i11 = i10;
                        } catch (Exception e11) {
                            e10 = e11;
                            i11 = i10;
                            throw JsonMappingException.wrapWithPath(e10, resetAndStart, intBuilder.bufferedSize() + i11);
                        }
                        if (i11 >= resetAndStart.length) {
                            int[] appendCompletedChunk = intBuilder.appendCompletedChunk(resetAndStart, i11);
                            i11 = 0;
                            resetAndStart = appendCompletedChunk;
                        }
                        i10 = i11 + 1;
                    } catch (Exception e12) {
                        e10 = e12;
                    }
                }
                completeAndClearBuffer = intBuilder.completeAndClearBuffer(resetAndStart, i11);
            }
            return completeAndClearBuffer;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public int[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new int[]{_parseIntPrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new IntDeser(this, nullValueProvider, bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @JacksonStdImpl
    /* loaded from: classes.dex */
    public static final class LongDeser extends PrimitiveArrayDeserializers<long[]> {
        public static final LongDeser instance = new LongDeser();

        public LongDeser() {
            super(long[].class);
        }

        protected LongDeser(LongDeser longDeser, NullValueProvider nullValueProvider, Boolean bool) {
            super(longDeser, nullValueProvider, bool);
        }

        public long[] _concat(long[] jArr, long[] jArr2) {
            int length = jArr.length;
            int length2 = jArr2.length;
            long[] copyOf = Arrays.copyOf(jArr, length + length2);
            System.arraycopy(jArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public long[] _constructEmpty() {
            return new long[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public long[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Exception e10;
            long[] completeAndClearBuffer;
            long longValue;
            int i10;
            if (!jsonParser.isExpectedStartArrayToken()) {
                completeAndClearBuffer = handleNonArray(jsonParser, deserializationContext);
            } else {
                ArrayBuilders.LongBuilder longBuilder = deserializationContext.getArrayBuilders().getLongBuilder();
                long[] resetAndStart = longBuilder.resetAndStart();
                int i11 = 0;
                while (true) {
                    try {
                        JsonToken nextToken = jsonParser.nextToken();
                        if (nextToken == JsonToken.END_ARRAY) {
                            break;
                        }
                        try {
                            if (nextToken == JsonToken.VALUE_NUMBER_INT) {
                                longValue = jsonParser.getLongValue();
                            } else if (nextToken == JsonToken.VALUE_NULL) {
                                NullValueProvider nullValueProvider = this._nuller;
                                if (nullValueProvider != null) {
                                    nullValueProvider.getNullValue(deserializationContext);
                                } else {
                                    _verifyNullForPrimitive(deserializationContext);
                                    longValue = 0;
                                }
                            } else {
                                longValue = _parseLongPrimitive(jsonParser, deserializationContext);
                            }
                            resetAndStart[i11] = longValue;
                            i11 = i10;
                        } catch (Exception e11) {
                            e10 = e11;
                            i11 = i10;
                            throw JsonMappingException.wrapWithPath(e10, resetAndStart, longBuilder.bufferedSize() + i11);
                        }
                        if (i11 >= resetAndStart.length) {
                            long[] appendCompletedChunk = longBuilder.appendCompletedChunk(resetAndStart, i11);
                            i11 = 0;
                            resetAndStart = appendCompletedChunk;
                        }
                        i10 = i11 + 1;
                    } catch (Exception e12) {
                        e10 = e12;
                    }
                }
                completeAndClearBuffer = longBuilder.completeAndClearBuffer(resetAndStart, i11);
            }
            return completeAndClearBuffer;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public long[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new long[]{_parseLongPrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new LongDeser(this, nullValueProvider, bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @JacksonStdImpl
    /* loaded from: classes.dex */
    public static final class ShortDeser extends PrimitiveArrayDeserializers<short[]> {
        public ShortDeser() {
            super(short[].class);
        }

        protected ShortDeser(ShortDeser shortDeser, NullValueProvider nullValueProvider, Boolean bool) {
            super(shortDeser, nullValueProvider, bool);
        }

        public short[] _concat(short[] sArr, short[] sArr2) {
            int length = sArr.length;
            int length2 = sArr2.length;
            short[] copyOf = Arrays.copyOf(sArr, length + length2);
            System.arraycopy(sArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public short[] _constructEmpty() {
            return new short[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public short[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Exception e10;
            short[] completeAndClearBuffer;
            short _parseShortPrimitive;
            int i10;
            if (!jsonParser.isExpectedStartArrayToken()) {
                completeAndClearBuffer = handleNonArray(jsonParser, deserializationContext);
            } else {
                ArrayBuilders.ShortBuilder shortBuilder = deserializationContext.getArrayBuilders().getShortBuilder();
                short[] resetAndStart = shortBuilder.resetAndStart();
                int i11 = 0;
                while (true) {
                    try {
                        JsonToken nextToken = jsonParser.nextToken();
                        if (nextToken == JsonToken.END_ARRAY) {
                            break;
                        }
                        try {
                            if (nextToken == JsonToken.VALUE_NULL) {
                                NullValueProvider nullValueProvider = this._nuller;
                                if (nullValueProvider != null) {
                                    nullValueProvider.getNullValue(deserializationContext);
                                } else {
                                    _verifyNullForPrimitive(deserializationContext);
                                    _parseShortPrimitive = 0;
                                }
                            } else {
                                _parseShortPrimitive = _parseShortPrimitive(jsonParser, deserializationContext);
                            }
                            resetAndStart[i11] = _parseShortPrimitive;
                            i11 = i10;
                        } catch (Exception e11) {
                            e10 = e11;
                            i11 = i10;
                            throw JsonMappingException.wrapWithPath(e10, resetAndStart, shortBuilder.bufferedSize() + i11);
                        }
                        if (i11 >= resetAndStart.length) {
                            short[] appendCompletedChunk = shortBuilder.appendCompletedChunk(resetAndStart, i11);
                            i11 = 0;
                            resetAndStart = appendCompletedChunk;
                        }
                        i10 = i11 + 1;
                    } catch (Exception e12) {
                        e10 = e12;
                    }
                }
                completeAndClearBuffer = shortBuilder.completeAndClearBuffer(resetAndStart, i11);
            }
            return completeAndClearBuffer;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public short[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return new short[]{_parseShortPrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new ShortDeser(this, nullValueProvider, bool);
        }
    }

    protected PrimitiveArrayDeserializers(PrimitiveArrayDeserializers<?> primitiveArrayDeserializers, NullValueProvider nullValueProvider, Boolean bool) {
        super(primitiveArrayDeserializers._valueClass);
        this._unwrapSingle = bool;
        this._nuller = nullValueProvider;
    }

    protected PrimitiveArrayDeserializers(Class<T> cls) {
        super((Class<?>) cls);
        this._unwrapSingle = null;
        this._nuller = null;
    }

    public static JsonDeserializer<?> forType(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return IntDeser.instance;
        }
        if (cls == Long.TYPE) {
            return LongDeser.instance;
        }
        if (cls == Byte.TYPE) {
            return new ByteDeser();
        }
        if (cls == Short.TYPE) {
            return new ShortDeser();
        }
        if (cls == Float.TYPE) {
            return new FloatDeser();
        }
        if (cls == Double.TYPE) {
            return new DoubleDeser();
        }
        if (cls == Boolean.TYPE) {
            return new BooleanDeser();
        }
        if (cls != Character.TYPE) {
            throw new IllegalStateException();
        }
        return new CharDeser();
    }

    protected abstract T _concat(T t10, T t11);

    protected abstract T _constructEmpty();

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        Boolean findFormatFeature = findFormatFeature(deserializationContext, beanProperty, this._valueClass, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        Nulls findContentNullStyle = findContentNullStyle(deserializationContext, beanProperty);
        NullValueProvider skipper = findContentNullStyle == Nulls.SKIP ? NullsConstantProvider.skipper() : findContentNullStyle == Nulls.FAIL ? beanProperty == null ? NullsFailProvider.constructForRootValue(deserializationContext.constructType(this._valueClass.getComponentType())) : NullsFailProvider.constructForProperty(beanProperty, beanProperty.getType().getContentType()) : null;
        return (!Objects.equals(findFormatFeature, this._unwrapSingle) || skipper != this._nuller) ? withResolved(skipper, findFormatFeature) : this;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t10) {
        T deserialize = deserialize(jsonParser, deserializationContext);
        return (t10 == null || Array.getLength(t10) == 0) ? deserialize : _concat(t10, deserialize);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) {
        Object obj = this._emptyValue;
        if (obj == null) {
            T _constructEmpty = _constructEmpty();
            this._emptyValue = _constructEmpty;
            return _constructEmpty;
        }
        return obj;
    }

    protected T handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.hasToken(JsonToken.VALUE_STRING)) {
            return _deserializeFromString(jsonParser, deserializationContext);
        }
        Boolean bool = this._unwrapSingle;
        return bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) ? handleSingleElementUnwrapped(jsonParser, deserializationContext) : (T) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
    }

    protected abstract T handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext);

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Array;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    protected abstract PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool);
}
