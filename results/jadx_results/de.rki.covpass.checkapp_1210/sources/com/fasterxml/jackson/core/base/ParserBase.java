package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.math.BigDecimal;
import java.math.BigInteger;
/* loaded from: classes.dex */
public abstract class ParserBase extends ParserMinimalBase {
    protected static final JacksonFeatureSet<StreamReadCapability> JSON_READ_CAPABILITIES = JsonParser.DEFAULT_READ_CAPABILITIES;
    protected byte[] _binaryValue;
    protected ByteArrayBuilder _byteArrayBuilder;
    protected boolean _closed;
    protected long _currInputProcessed;
    protected int _currInputRowStart;
    protected int _expLength;
    protected int _fractLength;
    protected int _inputEnd;
    protected int _inputPtr;
    protected int _intLength;
    protected final IOContext _ioContext;
    protected boolean _nameCopied;
    protected char[] _nameCopyBuffer;
    protected JsonToken _nextToken;
    protected BigDecimal _numberBigDecimal;
    protected BigInteger _numberBigInt;
    protected double _numberDouble;
    protected int _numberInt;
    protected long _numberLong;
    protected boolean _numberNegative;
    protected JsonReadContext _parsingContext;
    protected final TextBuffer _textBuffer;
    protected int _tokenInputCol;
    protected long _tokenInputTotal;
    protected int _currInputRow = 1;
    protected int _tokenInputRow = 1;
    protected int _numTypesValid = 0;

    public ParserBase(IOContext iOContext, int i10) {
        super(i10);
        this._ioContext = iOContext;
        this._textBuffer = iOContext.constructTextBuffer();
        this._parsingContext = JsonReadContext.createRootContext(JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i10) ? DupDetector.rootDetector(this) : null);
    }

    private void _parseSlowFloat(int i10) {
        try {
            if (i10 == 16) {
                this._numberBigDecimal = this._textBuffer.contentsAsDecimal();
                this._numTypesValid = 16;
            } else {
                this._numberDouble = this._textBuffer.contentsAsDouble();
                this._numTypesValid = 8;
            }
        } catch (NumberFormatException e10) {
            _wrapError("Malformed numeric value (" + _longNumberDesc(this._textBuffer.contentsAsString()) + ")", e10);
        }
    }

    private void _parseSlowInt(int i10) {
        String contentsAsString = this._textBuffer.contentsAsString();
        try {
            int i11 = this._intLength;
            char[] textBuffer = this._textBuffer.getTextBuffer();
            int textOffset = this._textBuffer.getTextOffset();
            boolean z10 = this._numberNegative;
            if (z10) {
                textOffset++;
            }
            if (NumberInput.inLongRange(textBuffer, textOffset, i11, z10)) {
                this._numberLong = Long.parseLong(contentsAsString);
                this._numTypesValid = 2;
                return;
            }
            if (i10 == 1 || i10 == 2) {
                _reportTooLongIntegral(i10, contentsAsString);
            }
            if (i10 != 8 && i10 != 32) {
                this._numberBigInt = new BigInteger(contentsAsString);
                this._numTypesValid = 4;
                return;
            }
            this._numberDouble = NumberInput.parseDouble(contentsAsString);
            this._numTypesValid = 8;
        } catch (NumberFormatException e10) {
            _wrapError("Malformed numeric value (" + _longNumberDesc(contentsAsString) + ")", e10);
        }
    }

    protected void _checkStdFeatureChanges(int i10, int i11) {
        DupDetector dupDetector;
        JsonReadContext jsonReadContext;
        int mask = JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        if ((i11 & mask) == 0 || (i10 & mask) == 0) {
            return;
        }
        if (this._parsingContext.getDupDetector() == null) {
            jsonReadContext = this._parsingContext;
            dupDetector = DupDetector.rootDetector(this);
        } else {
            jsonReadContext = this._parsingContext;
            dupDetector = null;
        }
        this._parsingContext = jsonReadContext.withDupDetector(dupDetector);
    }

    protected abstract void _closeInput();

    public ContentReference _contentReference() {
        return JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.enabledIn(this._features) ? this._ioContext.contentReference() : ContentReference.unknown();
    }

    public final int _decodeBase64Escape(Base64Variant base64Variant, char c10, int i10) {
        if (c10 == '\\') {
            char _decodeEscaped = _decodeEscaped();
            if (_decodeEscaped <= ' ' && i10 == 0) {
                return -1;
            }
            int decodeBase64Char = base64Variant.decodeBase64Char(_decodeEscaped);
            if (decodeBase64Char < 0 && (decodeBase64Char != -2 || i10 < 2)) {
                throw reportInvalidBase64Char(base64Variant, _decodeEscaped, i10);
            }
            return decodeBase64Char;
        }
        throw reportInvalidBase64Char(base64Variant, c10, i10);
    }

    protected abstract char _decodeEscaped();

    public final int _eofAsNextChar() {
        _handleEOF();
        return -1;
    }

    public ByteArrayBuilder _getByteArrayBuilder() {
        ByteArrayBuilder byteArrayBuilder = this._byteArrayBuilder;
        if (byteArrayBuilder == null) {
            this._byteArrayBuilder = new ByteArrayBuilder();
        } else {
            byteArrayBuilder.reset();
        }
        return this._byteArrayBuilder;
    }

    public void _handleBase64MissingPadding(Base64Variant base64Variant) {
        _reportError(base64Variant.missingPaddingMessage());
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    protected void _handleEOF() {
        if (!this._parsingContext.inRoot()) {
            _reportInvalidEOF(String.format(": expected close marker for %s (start marker at %s)", this._parsingContext.inArray() ? "Array" : "Object", this._parsingContext.startLocation(_contentReference())), null);
        }
    }

    public char _handleUnrecognizedCharacterEscape(char c10) {
        if (isEnabled(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c10;
        }
        if (c10 == '\'' && isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return c10;
        }
        _reportError("Unrecognized character escape " + ParserMinimalBase._getCharDesc(c10));
        return c10;
    }

    protected int _parseIntValue() {
        if (this._closed) {
            _reportError("Internal error: _parseNumericValue called when parser instance closed");
        }
        if (this._currToken != JsonToken.VALUE_NUMBER_INT || this._intLength > 9) {
            _parseNumericValue(1);
            if ((this._numTypesValid & 1) == 0) {
                convertNumberToInt();
            }
            return this._numberInt;
        }
        int contentsAsInt = this._textBuffer.contentsAsInt(this._numberNegative);
        this._numberInt = contentsAsInt;
        this._numTypesValid = 1;
        return contentsAsInt;
    }

    protected void _parseNumericValue(int i10) {
        if (this._closed) {
            _reportError("Internal error: _parseNumericValue called when parser instance closed");
        }
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT) {
            if (jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
                _parseSlowFloat(i10);
                return;
            } else {
                _reportError("Current token (%s) not numeric, can not use numeric value accessors", jsonToken);
                return;
            }
        }
        int i11 = this._intLength;
        if (i11 <= 9) {
            this._numberInt = this._textBuffer.contentsAsInt(this._numberNegative);
            this._numTypesValid = 1;
        } else if (i11 > 18) {
            _parseSlowInt(i10);
        } else {
            long contentsAsLong = this._textBuffer.contentsAsLong(this._numberNegative);
            if (i11 == 10) {
                if (this._numberNegative) {
                    if (contentsAsLong >= -2147483648L) {
                        this._numberInt = (int) contentsAsLong;
                        this._numTypesValid = 1;
                        return;
                    }
                } else if (contentsAsLong <= 2147483647L) {
                    this._numberInt = (int) contentsAsLong;
                    this._numTypesValid = 1;
                    return;
                }
            }
            this._numberLong = contentsAsLong;
            this._numTypesValid = 2;
        }
    }

    public void _releaseBuffers() {
        this._textBuffer.releaseBuffers();
        char[] cArr = this._nameCopyBuffer;
        if (cArr != null) {
            this._nameCopyBuffer = null;
            this._ioContext.releaseNameCopyBuffer(cArr);
        }
    }

    public void _reportMismatchedEndMarker(int i10, char c10) {
        JsonReadContext parsingContext = getParsingContext();
        _reportError(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i10), Character.valueOf(c10), parsingContext.typeDesc(), parsingContext.startLocation(_contentReference())));
    }

    protected void _reportTooLongIntegral(int i10, String str) {
        if (i10 == 1) {
            reportOverflowInt(str);
        } else {
            reportOverflowLong(str);
        }
    }

    public void _throwUnquotedSpace(int i10, String str) {
        if (!isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i10 > 32) {
            _reportError("Illegal unquoted character (" + ParserMinimalBase._getCharDesc((char) i10) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    public String _validJsonTokenList() {
        return _validJsonValueList();
    }

    public String _validJsonValueList() {
        return isEnabled(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this._closed) {
            this._inputPtr = Math.max(this._inputPtr, this._inputEnd);
            this._closed = true;
            try {
                _closeInput();
            } finally {
                _releaseBuffers();
            }
        }
    }

    protected void convertNumberToBigDecimal() {
        long j10;
        BigDecimal valueOf;
        int i10 = this._numTypesValid;
        if ((i10 & 8) != 0) {
            valueOf = NumberInput.parseBigDecimal(getText());
        } else if ((i10 & 4) != 0) {
            valueOf = new BigDecimal(this._numberBigInt);
        } else {
            if ((i10 & 2) != 0) {
                j10 = this._numberLong;
            } else if ((i10 & 1) == 0) {
                _throwInternal();
                this._numTypesValid |= 16;
            } else {
                j10 = this._numberInt;
            }
            valueOf = BigDecimal.valueOf(j10);
        }
        this._numberBigDecimal = valueOf;
        this._numTypesValid |= 16;
    }

    protected void convertNumberToBigInteger() {
        BigDecimal valueOf;
        long j10;
        BigInteger valueOf2;
        int i10 = this._numTypesValid;
        if ((i10 & 16) == 0) {
            if ((i10 & 2) != 0) {
                j10 = this._numberLong;
            } else if ((i10 & 1) != 0) {
                j10 = this._numberInt;
            } else if ((i10 & 8) == 0) {
                _throwInternal();
                this._numTypesValid |= 4;
            } else {
                valueOf = BigDecimal.valueOf(this._numberDouble);
            }
            valueOf2 = BigInteger.valueOf(j10);
            this._numberBigInt = valueOf2;
            this._numTypesValid |= 4;
        }
        valueOf = this._numberBigDecimal;
        valueOf2 = valueOf.toBigInteger();
        this._numberBigInt = valueOf2;
        this._numTypesValid |= 4;
    }

    protected void convertNumberToDouble() {
        double d10;
        int i10 = this._numTypesValid;
        if ((i10 & 16) != 0) {
            d10 = this._numberBigDecimal.doubleValue();
        } else if ((i10 & 4) != 0) {
            d10 = this._numberBigInt.doubleValue();
        } else if ((i10 & 2) != 0) {
            d10 = this._numberLong;
        } else if ((i10 & 1) == 0) {
            _throwInternal();
            this._numTypesValid |= 8;
        } else {
            d10 = this._numberInt;
        }
        this._numberDouble = d10;
        this._numTypesValid |= 8;
    }

    protected void convertNumberToInt() {
        int intValue;
        int i10 = this._numTypesValid;
        if ((i10 & 2) != 0) {
            long j10 = this._numberLong;
            int i11 = (int) j10;
            if (i11 != j10) {
                reportOverflowInt(getText(), currentToken());
            }
            this._numberInt = i11;
        } else {
            if ((i10 & 4) != 0) {
                if (ParserMinimalBase.BI_MIN_INT.compareTo(this._numberBigInt) > 0 || ParserMinimalBase.BI_MAX_INT.compareTo(this._numberBigInt) < 0) {
                    reportOverflowInt();
                }
                intValue = this._numberBigInt.intValue();
            } else if ((i10 & 8) != 0) {
                double d10 = this._numberDouble;
                if (d10 < -2.147483648E9d || d10 > 2.147483647E9d) {
                    reportOverflowInt();
                }
                intValue = (int) this._numberDouble;
            } else if ((i10 & 16) != 0) {
                if (ParserMinimalBase.BD_MIN_INT.compareTo(this._numberBigDecimal) > 0 || ParserMinimalBase.BD_MAX_INT.compareTo(this._numberBigDecimal) < 0) {
                    reportOverflowInt();
                }
                intValue = this._numberBigDecimal.intValue();
            } else {
                _throwInternal();
            }
            this._numberInt = intValue;
        }
        this._numTypesValid |= 1;
    }

    protected void convertNumberToLong() {
        long longValue;
        int i10 = this._numTypesValid;
        if ((i10 & 1) != 0) {
            longValue = this._numberInt;
        } else if ((i10 & 4) != 0) {
            if (ParserMinimalBase.BI_MIN_LONG.compareTo(this._numberBigInt) > 0 || ParserMinimalBase.BI_MAX_LONG.compareTo(this._numberBigInt) < 0) {
                reportOverflowLong();
            }
            longValue = this._numberBigInt.longValue();
        } else if ((i10 & 8) != 0) {
            double d10 = this._numberDouble;
            if (d10 < -9.223372036854776E18d || d10 > 9.223372036854776E18d) {
                reportOverflowLong();
            }
            longValue = (long) this._numberDouble;
        } else if ((i10 & 16) == 0) {
            _throwInternal();
            this._numTypesValid |= 2;
        } else {
            if (ParserMinimalBase.BD_MIN_LONG.compareTo(this._numberBigDecimal) > 0 || ParserMinimalBase.BD_MAX_LONG.compareTo(this._numberBigDecimal) < 0) {
                reportOverflowLong();
            }
            longValue = this._numberBigDecimal.longValue();
        }
        this._numberLong = longValue;
        this._numTypesValid |= 2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger getBigIntegerValue() {
        int i10 = this._numTypesValid;
        if ((i10 & 4) == 0) {
            if (i10 == 0) {
                _parseNumericValue(4);
            }
            if ((this._numTypesValid & 4) == 0) {
                convertNumberToBigInteger();
            }
        }
        return this._numberBigInt;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getCurrentName() {
        JsonReadContext parent;
        JsonToken jsonToken = this._currToken;
        return ((jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) && (parent = this._parsingContext.getParent()) != null) ? parent.getCurrentName() : this._parsingContext.getCurrentName();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal getDecimalValue() {
        int i10 = this._numTypesValid;
        if ((i10 & 16) == 0) {
            if (i10 == 0) {
                _parseNumericValue(16);
            }
            if ((this._numTypesValid & 16) == 0) {
                convertNumberToBigDecimal();
            }
        }
        return this._numberBigDecimal;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double getDoubleValue() {
        int i10 = this._numTypesValid;
        if ((i10 & 8) == 0) {
            if (i10 == 0) {
                _parseNumericValue(8);
            }
            if ((this._numTypesValid & 8) == 0) {
                convertNumberToDouble();
            }
        }
        return this._numberDouble;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float getFloatValue() {
        return (float) getDoubleValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getIntValue() {
        int i10 = this._numTypesValid;
        if ((i10 & 1) == 0) {
            if (i10 == 0) {
                return _parseIntValue();
            }
            if ((i10 & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getLongValue() {
        int i10 = this._numTypesValid;
        if ((i10 & 2) == 0) {
            if (i10 == 0) {
                _parseNumericValue(2);
            }
            if ((this._numTypesValid & 2) == 0) {
                convertNumberToLong();
            }
        }
        return this._numberLong;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType getNumberType() {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken != JsonToken.VALUE_NUMBER_INT) {
            return (this._numTypesValid & 16) != 0 ? JsonParser.NumberType.BIG_DECIMAL : JsonParser.NumberType.DOUBLE;
        }
        int i10 = this._numTypesValid;
        return (i10 & 1) != 0 ? JsonParser.NumberType.INT : (i10 & 2) != 0 ? JsonParser.NumberType.LONG : JsonParser.NumberType.BIG_INTEGER;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number getNumberValue() {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            int i10 = this._numTypesValid;
            if ((i10 & 1) != 0) {
                return Integer.valueOf(this._numberInt);
            }
            if ((i10 & 2) != 0) {
                return Long.valueOf(this._numberLong);
            }
            if ((i10 & 4) != 0) {
                return this._numberBigInt;
            }
            _throwInternal();
        }
        int i11 = this._numTypesValid;
        if ((i11 & 16) != 0) {
            return this._numberBigDecimal;
        }
        if ((i11 & 8) == 0) {
            _throwInternal();
        }
        return Double.valueOf(this._numberDouble);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number getNumberValueExact() {
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            if (this._numTypesValid == 0) {
                _parseNumericValue(0);
            }
            int i10 = this._numTypesValid;
            if ((i10 & 1) != 0) {
                return Integer.valueOf(this._numberInt);
            }
            if ((i10 & 2) != 0) {
                return Long.valueOf(this._numberLong);
            }
            if ((i10 & 4) != 0) {
                return this._numberBigInt;
            }
            _throwInternal();
        }
        if (this._numTypesValid == 0) {
            _parseNumericValue(16);
        }
        int i11 = this._numTypesValid;
        if ((i11 & 16) != 0) {
            return this._numberBigDecimal;
        }
        if ((i11 & 8) == 0) {
            _throwInternal();
        }
        return Double.valueOf(this._numberDouble);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonReadContext getParsingContext() {
        return this._parsingContext;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasTextCharacters() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return true;
        }
        if (jsonToken != JsonToken.FIELD_NAME) {
            return false;
        }
        return this._nameCopied;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isNaN() {
        if (this._currToken != JsonToken.VALUE_NUMBER_FLOAT || (this._numTypesValid & 8) == 0) {
            return false;
        }
        double d10 = this._numberDouble;
        return Double.isNaN(d10) || Double.isInfinite(d10);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser overrideStdFeatures(int i10, int i11) {
        int i12 = this._features;
        int i13 = (i10 & i11) | ((~i11) & i12);
        int i14 = i12 ^ i13;
        if (i14 != 0) {
            this._features = i13;
            _checkStdFeatureChanges(i13, i14);
        }
        return this;
    }

    protected IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i10, int i11) {
        return reportInvalidBase64Char(base64Variant, i10, i11, null);
    }

    public IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i10, int i11, String str) {
        String str2;
        StringBuilder sb2;
        String str3;
        if (i10 <= 32) {
            str2 = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", Integer.toHexString(i10), Integer.valueOf(i11 + 1));
        } else if (base64Variant.usesPaddingChar(i10)) {
            str2 = "Unexpected padding character ('" + base64Variant.getPaddingChar() + "') as character #" + (i11 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else {
            if (!Character.isDefined(i10) || Character.isISOControl(i10)) {
                sb2 = new StringBuilder();
                str3 = "Illegal character (code 0x";
            } else {
                sb2 = new StringBuilder();
                sb2.append("Illegal character '");
                sb2.append((char) i10);
                str3 = "' (code 0x";
            }
            sb2.append(str3);
            sb2.append(Integer.toHexString(i10));
            sb2.append(") in base64 content");
            str2 = sb2.toString();
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        return new IllegalArgumentException(str2);
    }

    public final JsonToken reset(boolean z10, int i10, int i11, int i12) {
        return (i11 >= 1 || i12 >= 1) ? resetFloat(z10, i10, i11, i12) : resetInt(z10, i10);
    }

    public final JsonToken resetAsNaN(String str, double d10) {
        this._textBuffer.resetWithString(str);
        this._numberDouble = d10;
        this._numTypesValid = 8;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public final JsonToken resetFloat(boolean z10, int i10, int i11, int i12) {
        this._numberNegative = z10;
        this._intLength = i10;
        this._fractLength = i11;
        this._expLength = i12;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public final JsonToken resetInt(boolean z10, int i10) {
        this._numberNegative = z10;
        this._intLength = i10;
        this._fractLength = 0;
        this._expLength = 0;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCurrentValue(Object obj) {
        this._parsingContext.setCurrentValue(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public JsonParser setFeatureMask(int i10) {
        int i11 = this._features ^ i10;
        if (i11 != 0) {
            this._features = i10;
            _checkStdFeatureChanges(i10, i11);
        }
        return this;
    }
}
