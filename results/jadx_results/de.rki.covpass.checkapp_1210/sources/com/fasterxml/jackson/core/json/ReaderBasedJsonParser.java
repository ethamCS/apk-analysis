package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
/* loaded from: classes.dex */
public class ReaderBasedJsonParser extends ParserBase {
    protected boolean _bufferRecyclable;
    protected final int _hashSeed;
    protected char[] _inputBuffer;
    protected int _nameStartCol;
    protected long _nameStartOffset;
    protected int _nameStartRow;
    protected ObjectCodec _objectCodec;
    protected Reader _reader;
    protected final CharsToNameCanonicalizer _symbols;
    protected boolean _tokenIncomplete;
    private static final int FEAT_MASK_TRAILING_COMMA = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    private static final int FEAT_MASK_LEADING_ZEROS = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    private static final int FEAT_MASK_NON_NUM_NUMBERS = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
    private static final int FEAT_MASK_ALLOW_MISSING = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    private static final int FEAT_MASK_ALLOW_SINGLE_QUOTES = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    private static final int FEAT_MASK_ALLOW_UNQUOTED_NAMES = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    private static final int FEAT_MASK_ALLOW_JAVA_COMMENTS = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    private static final int FEAT_MASK_ALLOW_YAML_COMMENTS = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();

    public ReaderBasedJsonParser(IOContext iOContext, int i10, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer) {
        super(iOContext, i10);
        this._reader = reader;
        this._inputBuffer = iOContext.allocTokenBuffer();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._objectCodec = objectCodec;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = true;
    }

    public ReaderBasedJsonParser(IOContext iOContext, int i10, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer, char[] cArr, int i11, int i12, boolean z10) {
        super(iOContext, i10);
        this._reader = reader;
        this._objectCodec = objectCodec;
        this._inputBuffer = cArr;
        this._inputPtr = i11;
        this._inputEnd = i12;
        this._currInputRowStart = i11;
        this._currInputProcessed = -i11;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = z10;
    }

    private final void _checkMatchEnd(String str, int i10, int i11) {
        if (Character.isJavaIdentifierPart((char) i11)) {
            _reportInvalidToken(str.substring(0, i10));
        }
    }

    private void _closeScope(int i10) {
        if (i10 == 93) {
            _updateLocation();
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(i10, '}');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_ARRAY;
        }
        if (i10 == 125) {
            _updateLocation();
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(i10, ']');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_OBJECT;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String _handleOddName2(int r5, int r6, int[] r7) {
        /*
            r4 = this;
            com.fasterxml.jackson.core.util.TextBuffer r0 = r4._textBuffer
            char[] r1 = r4._inputBuffer
            int r2 = r4._inputPtr
            int r2 = r2 - r5
            r0.resetWithShared(r1, r5, r2)
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            char[] r5 = r5.getCurrentSegment()
            com.fasterxml.jackson.core.util.TextBuffer r0 = r4._textBuffer
            int r0 = r0.getCurrentSegmentSize()
            int r1 = r7.length
        L17:
            int r2 = r4._inputPtr
            int r3 = r4._inputEnd
            if (r2 < r3) goto L24
            boolean r2 = r4._loadMore()
            if (r2 != 0) goto L24
            goto L37
        L24:
            char[] r2 = r4._inputBuffer
            int r3 = r4._inputPtr
            char r2 = r2[r3]
            if (r2 >= r1) goto L31
            r3 = r7[r2]
            if (r3 == 0) goto L51
            goto L37
        L31:
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r2)
            if (r3 != 0) goto L51
        L37:
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            r5.setCurrentLength(r0)
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            char[] r7 = r5.getTextBuffer()
            int r0 = r5.getTextOffset()
            int r5 = r5.size()
            com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer r1 = r4._symbols
            java.lang.String r5 = r1.findSymbol(r7, r0, r5, r6)
            return r5
        L51:
            int r3 = r4._inputPtr
            int r3 = r3 + 1
            r4._inputPtr = r3
            int r6 = r6 * 33
            int r6 = r6 + r2
            int r3 = r0 + 1
            r5[r0] = r2
            int r0 = r5.length
            if (r3 < r0) goto L69
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            char[] r5 = r5.finishCurrentSegment()
            r0 = 0
            goto L17
        L69:
            r0 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._handleOddName2(int, int, int[]):java.lang.String");
    }

    private final void _matchFalse() {
        int i10;
        char c10;
        int i11 = this._inputPtr;
        if (i11 + 4 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i11] == 'a') {
                int i12 = i11 + 1;
                if (cArr[i12] == 'l') {
                    int i13 = i12 + 1;
                    if (cArr[i13] == 's') {
                        int i14 = i13 + 1;
                        if (cArr[i14] == 'e' && ((c10 = cArr[(i10 = i14 + 1)]) < '0' || c10 == ']' || c10 == '}')) {
                            this._inputPtr = i10;
                            return;
                        }
                    }
                }
            }
        }
        _matchToken("false", 1);
    }

    private final void _matchNull() {
        int i10;
        char c10;
        int i11 = this._inputPtr;
        if (i11 + 3 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i11] == 'u') {
                int i12 = i11 + 1;
                if (cArr[i12] == 'l') {
                    int i13 = i12 + 1;
                    if (cArr[i13] == 'l' && ((c10 = cArr[(i10 = i13 + 1)]) < '0' || c10 == ']' || c10 == '}')) {
                        this._inputPtr = i10;
                        return;
                    }
                }
            }
        }
        _matchToken("null", 1);
    }

    private final void _matchToken2(String str, int i10) {
        int i11;
        char c10;
        int length = str.length();
        do {
            if ((this._inputPtr >= this._inputEnd && !_loadMore()) || this._inputBuffer[this._inputPtr] != str.charAt(i10)) {
                _reportInvalidToken(str.substring(0, i10));
            }
            i11 = this._inputPtr + 1;
            this._inputPtr = i11;
            i10++;
        } while (i10 < length);
        if ((i11 < this._inputEnd || _loadMore()) && (c10 = this._inputBuffer[this._inputPtr]) >= '0' && c10 != ']' && c10 != '}') {
            _checkMatchEnd(str, i10, c10);
        }
    }

    private final void _matchTrue() {
        int i10;
        char c10;
        int i11 = this._inputPtr;
        if (i11 + 3 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i11] == 'r') {
                int i12 = i11 + 1;
                if (cArr[i12] == 'u') {
                    int i13 = i12 + 1;
                    if (cArr[i13] == 'e' && ((c10 = cArr[(i10 = i13 + 1)]) < '0' || c10 == ']' || c10 == '}')) {
                        this._inputPtr = i10;
                        return;
                    }
                }
            }
        }
        _matchToken("true", 1);
    }

    private final JsonToken _nextAfterName() {
        JsonReadContext createChildObjectContext;
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        if (jsonToken != JsonToken.START_ARRAY) {
            if (jsonToken == JsonToken.START_OBJECT) {
                createChildObjectContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            this._currToken = jsonToken;
            return jsonToken;
        }
        createChildObjectContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        this._parsingContext = createChildObjectContext;
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken _nextTokenNotInObject(int i10) {
        JsonToken jsonToken;
        if (i10 == 34) {
            this._tokenIncomplete = true;
            jsonToken = JsonToken.VALUE_STRING;
        } else if (i10 == 91) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            jsonToken = JsonToken.START_ARRAY;
        } else if (i10 != 102) {
            if (i10 == 110) {
                _matchToken("null", 1);
            } else if (i10 == 116) {
                _matchToken("true", 1);
                jsonToken = JsonToken.VALUE_TRUE;
            } else if (i10 != 123) {
                switch (i10) {
                    case 44:
                        if (!this._parsingContext.inRoot() && (this._features & FEAT_MASK_ALLOW_MISSING) != 0) {
                            this._inputPtr--;
                            break;
                        }
                        jsonToken = _handleOddValue(i10);
                        break;
                    case 45:
                        jsonToken = _parseNegNumber();
                        break;
                    case 46:
                        jsonToken = _parseFloatThatStartsWithPeriod();
                        break;
                    default:
                        switch (i10) {
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                                jsonToken = _parsePosNumber(i10);
                                break;
                            default:
                                jsonToken = _handleOddValue(i10);
                                break;
                        }
                }
            } else {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                jsonToken = JsonToken.START_OBJECT;
            }
            jsonToken = JsonToken.VALUE_NULL;
        } else {
            _matchToken("false", 1);
            jsonToken = JsonToken.VALUE_FALSE;
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v18 ??, r9v2 ??, r9v6 ??, r9v10 ??, r9v12 ??, r9v8 ??, r9v13 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x006e -> B:28:0x0050). Please submit an issue!!! */
    private final com.fasterxml.jackson.core.JsonToken _parseFloat(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v18 ??, r9v2 ??, r9v6 ??, r9v10 ??, r9v12 ??, r9v8 ??, r9v13 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:227)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:212)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:165)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:364)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    private String _parseName2(int i10, int i11, int i12) {
        this._textBuffer.resetWithShared(this._inputBuffer, i10, this._inputPtr - i10);
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            char[] cArr = this._inputBuffer;
            int i13 = this._inputPtr;
            this._inputPtr = i13 + 1;
            char c10 = cArr[i13];
            if (c10 <= '\\') {
                if (c10 == '\\') {
                    c10 = _decodeEscaped();
                } else if (c10 <= i12) {
                    if (c10 == i12) {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        TextBuffer textBuffer = this._textBuffer;
                        return this._symbols.findSymbol(textBuffer.getTextBuffer(), textBuffer.getTextOffset(), textBuffer.size(), i11);
                    } else if (c10 < ' ') {
                        _throwUnquotedSpace(c10, "name");
                    }
                }
            }
            i11 = (i11 * 33) + c10;
            int i14 = currentSegmentSize + 1;
            currentSegment[currentSegmentSize] = c10;
            if (i14 >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            } else {
                currentSegmentSize = i14;
            }
        }
    }

    private final JsonToken _parseNumber2(boolean z10, int i10) {
        int i11;
        char c10;
        boolean z11;
        int i12;
        char c11;
        if (z10) {
            i10++;
        }
        this._inputPtr = i10;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i13 = 0;
        if (z10) {
            emptyAndGetCurrentSegment[0] = '-';
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i14 = this._inputPtr;
        if (i14 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            this._inputPtr = i14 + 1;
            c10 = cArr[i14];
        } else {
            c10 = getNextChar("No digit following minus sign", JsonToken.VALUE_NUMBER_INT);
        }
        if (c10 == '0') {
            c10 = _verifyNoLeadingZeroes();
        }
        int i15 = 0;
        while (c10 >= '0' && c10 <= '9') {
            i15++;
            if (i11 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i11 = 0;
            }
            int i16 = i11 + 1;
            emptyAndGetCurrentSegment[i11] = c10;
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                c10 = 0;
                i11 = i16;
                z11 = true;
                break;
            }
            char[] cArr2 = this._inputBuffer;
            int i17 = this._inputPtr;
            this._inputPtr = i17 + 1;
            c10 = cArr2[i17];
            i11 = i16;
        }
        z11 = false;
        if (i15 == 0) {
            return _handleInvalidNumberStart(c10, z10);
        }
        if (c10 == '.') {
            if (i11 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i11 = 0;
            }
            emptyAndGetCurrentSegment[i11] = c10;
            i11++;
            i12 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z11 = true;
                    break;
                }
                char[] cArr3 = this._inputBuffer;
                int i18 = this._inputPtr;
                this._inputPtr = i18 + 1;
                c10 = cArr3[i18];
                if (c10 < '0' || c10 > '9') {
                    break;
                }
                i12++;
                if (i11 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i11 = 0;
                }
                emptyAndGetCurrentSegment[i11] = c10;
                i11++;
            }
            if (i12 == 0) {
                reportUnexpectedNumberChar(c10, "Decimal point not followed by a digit");
            }
        } else {
            i12 = 0;
        }
        if (c10 == 'e' || c10 == 'E') {
            if (i11 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i11 = 0;
            }
            int i19 = i11 + 1;
            emptyAndGetCurrentSegment[i11] = c10;
            int i20 = this._inputPtr;
            if (i20 < this._inputEnd) {
                char[] cArr4 = this._inputBuffer;
                this._inputPtr = i20 + 1;
                c11 = cArr4[i20];
            } else {
                c11 = getNextChar("expected a digit for number exponent");
            }
            if (c11 == '-' || c11 == '+') {
                if (i19 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i19 = 0;
                }
                int i21 = i19 + 1;
                emptyAndGetCurrentSegment[i19] = c11;
                int i22 = this._inputPtr;
                if (i22 < this._inputEnd) {
                    char[] cArr5 = this._inputBuffer;
                    this._inputPtr = i22 + 1;
                    c11 = cArr5[i22];
                } else {
                    c11 = getNextChar("expected a digit for number exponent");
                }
                i19 = i21;
            }
            int i23 = 0;
            c10 = c11;
            while (c10 <= '9' && c10 >= '0') {
                i23++;
                if (i19 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i19 = 0;
                }
                i11 = i19 + 1;
                emptyAndGetCurrentSegment[i19] = c10;
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    i13 = i23;
                    z11 = true;
                    break;
                }
                char[] cArr6 = this._inputBuffer;
                int i24 = this._inputPtr;
                this._inputPtr = i24 + 1;
                c10 = cArr6[i24];
                i19 = i11;
            }
            i13 = i23;
            i11 = i19;
            if (i13 == 0) {
                reportUnexpectedNumberChar(c10, "Exponent indicator not followed by a digit");
            }
        }
        if (!z11) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(c10);
            }
        }
        this._textBuffer.setCurrentLength(i11);
        return reset(z10, i15, i12, i13);
    }

    private final int _skipAfterComma2() {
        char c10;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                throw _constructError("Unexpected end-of-input within/between " + this._parsingContext.typeDesc() + " entries");
            }
            char[] cArr = this._inputBuffer;
            int i10 = this._inputPtr;
            int i11 = i10 + 1;
            this._inputPtr = i11;
            c10 = cArr[i10];
            if (c10 > ' ') {
                if (c10 == '/') {
                    _skipComment();
                } else if (c10 != '#' || !_skipYAMLComment()) {
                    break;
                }
            } else if (c10 < ' ') {
                if (c10 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i11;
                } else if (c10 == '\r') {
                    _skipCR();
                } else if (c10 != '\t') {
                    _throwInvalidSpace(c10);
                }
            }
        }
        return c10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        _reportInvalidEOF(" in a comment", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void _skipCComment() {
        /*
            r3 = this;
        L0:
            int r0 = r3._inputPtr
            int r1 = r3._inputEnd
            if (r0 < r1) goto Lc
            boolean r0 = r3._loadMore()
            if (r0 == 0) goto L26
        Lc:
            char[] r0 = r3._inputBuffer
            int r1 = r3._inputPtr
            int r2 = r1 + 1
            r3._inputPtr = r2
            char r0 = r0[r1]
            r1 = 42
            if (r0 > r1) goto L0
            if (r0 != r1) goto L3c
            int r0 = r3._inputEnd
            if (r2 < r0) goto L2d
            boolean r0 = r3._loadMore()
            if (r0 != 0) goto L2d
        L26:
            r0 = 0
            java.lang.String r1 = " in a comment"
            r3._reportInvalidEOF(r1, r0)
            return
        L2d:
            char[] r0 = r3._inputBuffer
            int r1 = r3._inputPtr
            char r0 = r0[r1]
            r2 = 47
            if (r0 != r2) goto L0
            int r1 = r1 + 1
            r3._inputPtr = r1
            return
        L3c:
            r1 = 32
            if (r0 >= r1) goto L0
            r1 = 10
            if (r0 != r1) goto L4d
            int r0 = r3._currInputRow
            int r0 = r0 + 1
            r3._currInputRow = r0
            r3._currInputRowStart = r2
            goto L0
        L4d:
            r1 = 13
            if (r0 != r1) goto L55
            r3._skipCR()
            goto L0
        L55:
            r1 = 9
            if (r0 == r1) goto L0
            r3._throwInvalidSpace(r0)
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipCComment():void");
    }

    private final int _skipColon() {
        int i10;
        char c10;
        int i11;
        char c11;
        int i12 = this._inputPtr;
        if (i12 + 4 >= this._inputEnd) {
            return _skipColon2(false);
        }
        char[] cArr = this._inputBuffer;
        char c12 = cArr[i12];
        if (c12 == ':') {
            i10 = i12 + 1;
            this._inputPtr = i10;
            c10 = cArr[i10];
            if (c10 > ' ') {
                if (c10 == '/' || c10 == '#') {
                    return _skipColon2(true);
                }
                this._inputPtr = i10 + 1;
                return c10;
            }
            if (c10 == ' ' || c10 == '\t') {
                i11 = i10 + 1;
                this._inputPtr = i11;
                c11 = cArr[i11];
                if (c11 > ' ') {
                    if (c11 == '/' || c11 == '#') {
                        return _skipColon2(true);
                    }
                    this._inputPtr = i11 + 1;
                    return c11;
                }
            }
            return _skipColon2(true);
        }
        if (c12 == ' ' || c12 == '\t') {
            int i13 = i12 + 1;
            this._inputPtr = i13;
            c12 = cArr[i13];
        }
        if (c12 != ':') {
            return _skipColon2(false);
        }
        i10 = this._inputPtr + 1;
        this._inputPtr = i10;
        c10 = cArr[i10];
        if (c10 > ' ') {
            if (c10 == '/' || c10 == '#') {
                return _skipColon2(true);
            }
            this._inputPtr = i10 + 1;
            return c10;
        }
        if (c10 == ' ' || c10 == '\t') {
            i11 = i10 + 1;
            this._inputPtr = i11;
            c11 = cArr[i11];
            if (c11 > ' ') {
                if (c11 == '/' || c11 == '#') {
                    return _skipColon2(true);
                }
                this._inputPtr = i11 + 1;
                return c11;
            }
        }
        return _skipColon2(true);
    }

    private final int _skipColon2(boolean z10) {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" within/between " + this._parsingContext.typeDesc() + " entries", null);
                return -1;
            }
            char[] cArr = this._inputBuffer;
            int i10 = this._inputPtr;
            int i11 = i10 + 1;
            this._inputPtr = i11;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                if (c10 == '/') {
                    _skipComment();
                } else if (c10 != '#' || !_skipYAMLComment()) {
                    if (z10) {
                        return c10;
                    }
                    if (c10 != ':') {
                        _reportUnexpectedChar(c10, "was expecting a colon to separate field name and value");
                    }
                    z10 = true;
                }
            } else if (c10 < ' ') {
                if (c10 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i11;
                } else if (c10 == '\r') {
                    _skipCR();
                } else if (c10 != '\t') {
                    _throwInvalidSpace(c10);
                }
            }
        }
    }

    private final int _skipComma(int i10) {
        if (i10 != 44) {
            _reportUnexpectedChar(i10, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
        }
        while (true) {
            int i11 = this._inputPtr;
            if (i11 < this._inputEnd) {
                char[] cArr = this._inputBuffer;
                int i12 = i11 + 1;
                this._inputPtr = i12;
                char c10 = cArr[i11];
                if (c10 > ' ') {
                    if (c10 != '/' && c10 != '#') {
                        return c10;
                    }
                    this._inputPtr = i12 - 1;
                    return _skipAfterComma2();
                } else if (c10 < ' ') {
                    if (c10 == '\n') {
                        this._currInputRow++;
                        this._currInputRowStart = i12;
                    } else if (c10 == '\r') {
                        _skipCR();
                    } else if (c10 != '\t') {
                        _throwInvalidSpace(c10);
                    }
                }
            } else {
                return _skipAfterComma2();
            }
        }
    }

    private void _skipComment() {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in a comment", null);
        }
        char[] cArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        char c10 = cArr[i10];
        if (c10 == '/') {
            _skipLine();
        } else if (c10 == '*') {
            _skipCComment();
        } else {
            _reportUnexpectedChar(c10, "was expecting either '*' or '/' for a comment");
        }
    }

    private void _skipLine() {
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i10 = this._inputPtr;
                int i11 = i10 + 1;
                this._inputPtr = i11;
                char c10 = cArr[i10];
                if (c10 < ' ') {
                    if (c10 == '\n') {
                        this._currInputRow++;
                        this._currInputRowStart = i11;
                        return;
                    } else if (c10 == '\r') {
                        _skipCR();
                        return;
                    } else if (c10 != '\t') {
                        _throwInvalidSpace(c10);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r0 != '\t') goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        _throwInvalidSpace(r0);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0047 -> B:24:0x0050). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x004d -> B:24:0x0050). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int _skipWSOrEnd() {
        /*
            r9 = this;
            int r0 = r9._inputPtr
            int r1 = r9._inputEnd
            if (r0 < r1) goto L11
            boolean r0 = r9._loadMore()
            if (r0 != 0) goto L11
            int r0 = r9._eofAsNextChar()
            return r0
        L11:
            char[] r0 = r9._inputBuffer
            int r1 = r9._inputPtr
            int r2 = r1 + 1
            r9._inputPtr = r2
            char r0 = r0[r1]
            r1 = 35
            r3 = 47
            r4 = 32
            if (r0 <= r4) goto L32
            if (r0 == r3) goto L29
            if (r0 != r1) goto L28
            goto L29
        L28:
            return r0
        L29:
            int r2 = r2 + (-1)
            r9._inputPtr = r2
        L2d:
            int r0 = r9._skipWSOrEnd2()
            return r0
        L32:
            r5 = 9
            r6 = 13
            r7 = 10
            if (r0 == r4) goto L50
            if (r0 != r7) goto L45
            int r0 = r9._currInputRow
            int r0 = r0 + 1
            r9._currInputRow = r0
            r9._currInputRowStart = r2
            goto L50
        L45:
            if (r0 != r6) goto L4b
        L47:
            r9._skipCR()
            goto L50
        L4b:
            if (r0 == r5) goto L50
        L4d:
            r9._throwInvalidSpace(r0)
        L50:
            int r0 = r9._inputPtr
            int r2 = r9._inputEnd
            if (r0 >= r2) goto L7e
            char[] r2 = r9._inputBuffer
            int r8 = r0 + 1
            r9._inputPtr = r8
            char r0 = r2[r0]
            if (r0 <= r4) goto L6b
            if (r0 == r3) goto L66
            if (r0 != r1) goto L65
            goto L66
        L65:
            return r0
        L66:
            int r8 = r8 + (-1)
            r9._inputPtr = r8
            goto L2d
        L6b:
            if (r0 == r4) goto L50
            if (r0 != r7) goto L78
            int r0 = r9._currInputRow
            int r0 = r0 + 1
            r9._currInputRow = r0
            r9._currInputRowStart = r8
            goto L50
        L78:
            if (r0 != r6) goto L7b
            goto L47
        L7b:
            if (r0 == r5) goto L50
            goto L4d
        L7e:
            int r0 = r9._skipWSOrEnd2()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd():int");
    }

    private int _skipWSOrEnd2() {
        char c10;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            char[] cArr = this._inputBuffer;
            int i10 = this._inputPtr;
            int i11 = i10 + 1;
            this._inputPtr = i11;
            c10 = cArr[i10];
            if (c10 > ' ') {
                if (c10 == '/') {
                    _skipComment();
                } else if (c10 != '#' || !_skipYAMLComment()) {
                    break;
                }
            } else if (c10 != ' ') {
                if (c10 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i11;
                } else if (c10 == '\r') {
                    _skipCR();
                } else if (c10 != '\t') {
                    _throwInvalidSpace(c10);
                }
            }
        }
        return c10;
    }

    private boolean _skipYAMLComment() {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _updateLocation() {
        int i10 = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + i10;
        this._tokenInputRow = this._currInputRow;
        this._tokenInputCol = i10 - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        int i10 = this._inputPtr;
        this._nameStartOffset = i10;
        this._nameStartRow = this._currInputRow;
        this._nameStartCol = i10 - this._currInputRowStart;
    }

    private char _verifyNLZ2() {
        char c10;
        if ((this._inputPtr < this._inputEnd || _loadMore()) && (c10 = this._inputBuffer[this._inputPtr]) >= '0' && c10 <= '9') {
            if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
                reportInvalidNumber("Leading zeroes not allowed");
            }
            this._inputPtr++;
            if (c10 == '0') {
                do {
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        break;
                    }
                    char[] cArr = this._inputBuffer;
                    int i10 = this._inputPtr;
                    c10 = cArr[i10];
                    if (c10 < '0' || c10 > '9') {
                        return '0';
                    }
                    this._inputPtr = i10 + 1;
                } while (c10 == '0');
            }
            return c10;
        }
        return '0';
    }

    private final char _verifyNoLeadingZeroes() {
        char c10;
        int i10 = this._inputPtr;
        if (i10 >= this._inputEnd || ((c10 = this._inputBuffer[i10]) >= '0' && c10 <= '9')) {
            return _verifyNLZ2();
        }
        return '0';
    }

    private final void _verifyRootSpace(int i10) {
        int i11 = this._inputPtr + 1;
        this._inputPtr = i11;
        if (i10 != 9) {
            if (i10 == 10) {
                this._currInputRow++;
                this._currInputRowStart = i11;
            } else if (i10 == 13) {
                _skipCR();
            } else if (i10 == 32) {
            } else {
                _reportMissingRootWS(i10);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected void _closeInput() {
        if (this._reader != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._reader.close();
            }
            this._reader = null;
        }
    }

    protected byte[] _decodeBase64(Base64Variant base64Variant) {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            char[] cArr = this._inputBuffer;
            int i10 = this._inputPtr;
            this._inputPtr = i10 + 1;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                int decodeBase64Char = base64Variant.decodeBase64Char(c10);
                if (decodeBase64Char < 0) {
                    if (c10 == '\"') {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, c10, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr2 = this._inputBuffer;
                int i11 = this._inputPtr;
                this._inputPtr = i11 + 1;
                char c11 = cArr2[i11];
                int decodeBase64Char2 = base64Variant.decodeBase64Char(c11);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, c11, 1);
                }
                int i12 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr3 = this._inputBuffer;
                int i13 = this._inputPtr;
                this._inputPtr = i13 + 1;
                char c12 = cArr3[i13];
                int decodeBase64Char3 = base64Variant.decodeBase64Char(c12);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (c12 == '\"') {
                            _getByteArrayBuilder.append(i12 >> 4);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, c12, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr4 = this._inputBuffer;
                        int i14 = this._inputPtr;
                        this._inputPtr = i14 + 1;
                        char c13 = cArr4[i14];
                        if (!base64Variant.usesPaddingChar(c13) && _decodeBase64Escape(base64Variant, c13, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, c13, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        _getByteArrayBuilder.append(i12 >> 4);
                    }
                }
                int i15 = (i12 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr5 = this._inputBuffer;
                int i16 = this._inputPtr;
                this._inputPtr = i16 + 1;
                char c14 = cArr5[i16];
                int decodeBase64Char4 = base64Variant.decodeBase64Char(c14);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (c14 == '\"') {
                            _getByteArrayBuilder.appendTwoBytes(i15 >> 2);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, c14, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        _getByteArrayBuilder.appendTwoBytes(i15 >> 2);
                    }
                }
                _getByteArrayBuilder.appendThreeBytes((i15 << 6) | decodeBase64Char4);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected char _decodeEscaped() {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        char[] cArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        char c10 = cArr[i10];
        if (c10 == '\"' || c10 == '/' || c10 == '\\') {
            return c10;
        }
        if (c10 == 'b') {
            return '\b';
        }
        if (c10 == 'f') {
            return '\f';
        }
        if (c10 == 'n') {
            return '\n';
        }
        if (c10 == 'r') {
            return '\r';
        }
        if (c10 == 't') {
            return '\t';
        }
        if (c10 != 'u') {
            return _handleUnrecognizedCharacterEscape(c10);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            char[] cArr2 = this._inputBuffer;
            int i13 = this._inputPtr;
            this._inputPtr = i13 + 1;
            char c11 = cArr2[i13];
            int charToHex = CharTypes.charToHex(c11);
            if (charToHex < 0) {
                _reportUnexpectedChar(c11, "expected a hex-digit for character escape sequence");
            }
            i11 = (i11 << 4) | charToHex;
        }
        return (char) i11;
    }

    protected final void _finishString() {
        int i10 = this._inputPtr;
        int i11 = this._inputEnd;
        if (i10 < i11) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            while (true) {
                char[] cArr = this._inputBuffer;
                char c10 = cArr[i10];
                if (c10 >= length || iArr[c10] == 0) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                } else if (c10 == '\"') {
                    TextBuffer textBuffer = this._textBuffer;
                    int i12 = this._inputPtr;
                    textBuffer.resetWithShared(cArr, i12, i10 - i12);
                    this._inputPtr = i10 + 1;
                    return;
                }
            }
        }
        TextBuffer textBuffer2 = this._textBuffer;
        char[] cArr2 = this._inputBuffer;
        int i13 = this._inputPtr;
        textBuffer2.resetWithCopy(cArr2, i13, i10 - i13);
        this._inputPtr = i10;
        _finishString2();
    }

    protected void _finishString2() {
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int[] iArr = _icLatin1;
        int length = iArr.length;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this._inputBuffer;
            int i10 = this._inputPtr;
            this._inputPtr = i10 + 1;
            char c10 = cArr[i10];
            if (c10 < length && iArr[c10] != 0) {
                if (c10 == '\"') {
                    this._textBuffer.setCurrentLength(currentSegmentSize);
                    return;
                } else if (c10 == '\\') {
                    c10 = _decodeEscaped();
                } else if (c10 < ' ') {
                    _throwUnquotedSpace(c10, "string value");
                }
            }
            if (currentSegmentSize >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            currentSegment[currentSegmentSize] = c10;
            currentSegmentSize++;
        }
    }

    protected final String _getText2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int id2 = jsonToken.id();
        return id2 != 5 ? (id2 == 6 || id2 == 7 || id2 == 8) ? this._textBuffer.contentsAsString() : jsonToken.asString() : this._parsingContext.getCurrentName();
    }

    protected JsonToken _handleApos() {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this._inputBuffer;
            int i10 = this._inputPtr;
            this._inputPtr = i10 + 1;
            char c10 = cArr[i10];
            if (c10 <= '\\') {
                if (c10 == '\\') {
                    c10 = _decodeEscaped();
                } else if (c10 <= '\'') {
                    if (c10 == '\'') {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        return JsonToken.VALUE_STRING;
                    } else if (c10 < ' ') {
                        _throwUnquotedSpace(c10, "string value");
                    }
                }
            }
            if (currentSegmentSize >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            emptyAndGetCurrentSegment[currentSegmentSize] = c10;
            currentSegmentSize++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    protected com.fasterxml.jackson.core.JsonToken _handleInvalidNumberStart(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:227)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:212)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:165)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:364)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    protected String _handleOddName(int i10) {
        if (i10 != 39 || (this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) == 0) {
            if ((this._features & FEAT_MASK_ALLOW_UNQUOTED_NAMES) == 0) {
                _reportUnexpectedChar(i10, "was expecting double-quote to start field name");
            }
            int[] inputCodeLatin1JsNames = CharTypes.getInputCodeLatin1JsNames();
            int length = inputCodeLatin1JsNames.length;
            if (!(i10 < length ? inputCodeLatin1JsNames[i10] == 0 : Character.isJavaIdentifierPart((char) i10))) {
                _reportUnexpectedChar(i10, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
            }
            int i11 = this._inputPtr;
            int i12 = this._hashSeed;
            int i13 = this._inputEnd;
            if (i11 >= i13) {
                this._inputPtr = i11;
                return _handleOddName2(this._inputPtr - 1, i12, inputCodeLatin1JsNames);
            }
            do {
                char[] cArr = this._inputBuffer;
                char c10 = cArr[i11];
                if (c10 < length) {
                    if (inputCodeLatin1JsNames[c10] != 0) {
                        int i14 = this._inputPtr - 1;
                        this._inputPtr = i11;
                        return this._symbols.findSymbol(cArr, i14, i11 - i14, i12);
                    }
                } else if (!Character.isJavaIdentifierPart(c10)) {
                    int i15 = this._inputPtr - 1;
                    this._inputPtr = i11;
                    return this._symbols.findSymbol(this._inputBuffer, i15, i11 - i15, i12);
                }
                i12 = (i12 * 33) + c10;
                i11++;
            } while (i11 < i13);
            this._inputPtr = i11;
            return _handleOddName2(this._inputPtr - 1, i12, inputCodeLatin1JsNames);
        }
        return _parseAposName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
        if (r4 != 44) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (r3._parsingContext.inArray() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
        if (r3._parsingContext.inRoot() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
        if ((r3._features & com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_ALLOW_MISSING) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
        r3._inputPtr--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.core.JsonToken _handleOddValue(int r4) {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L8b
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L72
            r0 = 78
            if (r4 == r0) goto L5c
            r0 = 93
            if (r4 == r0) goto L3c
            r0 = 43
            if (r4 == r0) goto L1b
            r0 = 44
            if (r4 == r0) goto L45
            goto L97
        L1b:
            int r4 = r3._inputPtr
            int r0 = r3._inputEnd
            if (r4 < r0) goto L2c
            boolean r4 = r3._loadMore()
            if (r4 != 0) goto L2c
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r3._reportInvalidEOFInValue(r4)
        L2c:
            char[] r4 = r3._inputBuffer
            int r0 = r3._inputPtr
            int r1 = r0 + 1
            r3._inputPtr = r1
            char r4 = r4[r0]
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleInvalidNumberStart(r4, r0)
            return r4
        L3c:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inArray()
            if (r0 != 0) goto L45
            goto L97
        L45:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inRoot()
            if (r0 != 0) goto L97
            int r0 = r3._features
            int r2 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_ALLOW_MISSING
            r0 = r0 & r2
            if (r0 == 0) goto L97
            int r4 = r3._inputPtr
            int r4 = r4 - r1
            r3._inputPtr = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L5c:
            java.lang.String r0 = "NaN"
            r3._matchToken(r0, r1)
            int r1 = r3._features
            int r2 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_NON_NUM_NUMBERS
            r1 = r1 & r2
            if (r1 == 0) goto L6f
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L6f:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            goto L87
        L72:
            java.lang.String r0 = "Infinity"
            r3._matchToken(r0, r1)
            int r1 = r3._features
            int r2 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_NON_NUM_NUMBERS
            r1 = r1 & r2
            if (r1 == 0) goto L85
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L85:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
        L87:
            r3._reportError(r0)
            goto L97
        L8b:
            int r0 = r3._features
            int r1 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_ALLOW_SINGLE_QUOTES
            r0 = r0 & r1
            if (r0 == 0) goto L97
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleApos()
            return r4
        L97:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto Lb6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r3._validJsonTokenList()
            r3._reportInvalidToken(r0, r1)
        Lb6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "expected a valid value "
            r0.append(r1)
            java.lang.String r1 = r3._validJsonValueList()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3._reportUnexpectedChar(r4, r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._handleOddValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    protected boolean _loadMore() {
        Reader reader = this._reader;
        if (reader != null) {
            char[] cArr = this._inputBuffer;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                int i10 = this._inputEnd;
                long j10 = i10;
                this._currInputProcessed += j10;
                this._currInputRowStart -= i10;
                this._nameStartOffset -= j10;
                this._inputPtr = 0;
                this._inputEnd = read;
                return true;
            }
            _closeInput();
            if (read == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this._inputEnd);
            }
        }
        return false;
    }

    protected void _loadMoreGuaranteed() {
        if (!_loadMore()) {
            _reportInvalidEOF();
        }
    }

    protected final void _matchToken(String str, int i10) {
        int i11;
        int length = str.length();
        if (this._inputPtr + length >= this._inputEnd) {
            _matchToken2(str, i10);
            return;
        }
        do {
            if (this._inputBuffer[this._inputPtr] != str.charAt(i10)) {
                _reportInvalidToken(str.substring(0, i10));
            }
            i11 = this._inputPtr + 1;
            this._inputPtr = i11;
            i10++;
        } while (i10 < length);
        char c10 = this._inputBuffer[i11];
        if (c10 < '0' || c10 == ']' || c10 == '}') {
            return;
        }
        _checkMatchEnd(str, i10, c10);
    }

    protected String _parseAposName() {
        int i10 = this._inputPtr;
        int i11 = this._hashSeed;
        int i12 = this._inputEnd;
        if (i10 < i12) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            do {
                char[] cArr = this._inputBuffer;
                char c10 = cArr[i10];
                if (c10 != '\'') {
                    if (c10 < length && iArr[c10] != 0) {
                        break;
                    }
                    i11 = (i11 * 33) + c10;
                    i10++;
                } else {
                    int i13 = this._inputPtr;
                    this._inputPtr = i10 + 1;
                    return this._symbols.findSymbol(cArr, i13, i10 - i13, i11);
                }
            } while (i10 < i12);
        }
        int i14 = this._inputPtr;
        this._inputPtr = i10;
        return _parseName2(i14, i11, 39);
    }

    protected final JsonToken _parseFloatThatStartsWithPeriod() {
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return _handleOddValue(46);
        }
        int i10 = this._inputPtr;
        return _parseFloat(46, i10 - 1, i10, false, 0);
    }

    protected final String _parseName() {
        int i10 = this._inputPtr;
        int i11 = this._hashSeed;
        int[] iArr = _icLatin1;
        while (true) {
            if (i10 >= this._inputEnd) {
                break;
            }
            char[] cArr = this._inputBuffer;
            char c10 = cArr[i10];
            if (c10 >= iArr.length || iArr[c10] == 0) {
                i11 = (i11 * 33) + c10;
                i10++;
            } else if (c10 == '\"') {
                int i12 = this._inputPtr;
                this._inputPtr = i10 + 1;
                return this._symbols.findSymbol(cArr, i12, i10 - i12, i11);
            }
        }
        int i13 = this._inputPtr;
        this._inputPtr = i10;
        return _parseName2(i13, i11, 34);
    }

    protected final JsonToken _parseNegNumber() {
        int i10 = this._inputPtr;
        int i11 = i10 - 1;
        int i12 = this._inputEnd;
        if (i10 >= i12) {
            return _parseNumber2(true, i11);
        }
        int i13 = i10 + 1;
        char c10 = this._inputBuffer[i10];
        if (c10 > '9' || c10 < '0') {
            this._inputPtr = i13;
            return _handleInvalidNumberStart(c10, true);
        } else if (c10 == '0') {
            return _parseNumber2(true, i11);
        } else {
            int i14 = 1;
            while (i13 < i12) {
                int i15 = i13 + 1;
                char c11 = this._inputBuffer[i13];
                if (c11 < '0' || c11 > '9') {
                    if (c11 == '.' || c11 == 'e' || c11 == 'E') {
                        this._inputPtr = i15;
                        return _parseFloat(c11, i11, i15, true, i14);
                    }
                    int i16 = i15 - 1;
                    this._inputPtr = i16;
                    if (this._parsingContext.inRoot()) {
                        _verifyRootSpace(c11);
                    }
                    this._textBuffer.resetWithShared(this._inputBuffer, i11, i16 - i11);
                    return resetInt(true, i14);
                }
                i14++;
                i13 = i15;
            }
            return _parseNumber2(true, i11);
        }
    }

    protected final JsonToken _parsePosNumber(int i10) {
        int i11 = this._inputPtr;
        int i12 = i11 - 1;
        int i13 = this._inputEnd;
        if (i10 == 48) {
            return _parseNumber2(false, i12);
        }
        int i14 = 1;
        while (i11 < i13) {
            int i15 = i11 + 1;
            char c10 = this._inputBuffer[i11];
            if (c10 < '0' || c10 > '9') {
                if (c10 == '.' || c10 == 'e' || c10 == 'E') {
                    this._inputPtr = i15;
                    return _parseFloat(c10, i12, i15, false, i14);
                }
                int i16 = i15 - 1;
                this._inputPtr = i16;
                if (this._parsingContext.inRoot()) {
                    _verifyRootSpace(c10);
                }
                this._textBuffer.resetWithShared(this._inputBuffer, i12, i16 - i12);
                return resetInt(false, i14);
            }
            i14++;
            i11 = i15;
        }
        this._inputPtr = i12;
        return _parseNumber2(false, i12);
    }

    protected int _readBinary(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) {
        int i10;
        int i11 = 3;
        int length = bArr.length - 3;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            char[] cArr = this._inputBuffer;
            int i14 = this._inputPtr;
            this._inputPtr = i14 + 1;
            char c10 = cArr[i14];
            if (c10 > ' ') {
                int decodeBase64Char = base64Variant.decodeBase64Char(c10);
                if (decodeBase64Char < 0) {
                    if (c10 == '\"') {
                        break;
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, c10, 0);
                    if (decodeBase64Char < 0) {
                    }
                }
                if (i12 > length) {
                    i13 += i12;
                    outputStream.write(bArr, 0, i12);
                    i12 = 0;
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr2 = this._inputBuffer;
                int i15 = this._inputPtr;
                this._inputPtr = i15 + 1;
                char c11 = cArr2[i15];
                int decodeBase64Char2 = base64Variant.decodeBase64Char(c11);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, c11, 1);
                }
                int i16 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr3 = this._inputBuffer;
                int i17 = this._inputPtr;
                this._inputPtr = i17 + 1;
                char c12 = cArr3[i17];
                int decodeBase64Char3 = base64Variant.decodeBase64Char(c12);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (c12 == '\"') {
                            int i18 = i12 + 1;
                            bArr[i12] = (byte) (i16 >> 4);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            i12 = i18;
                        } else {
                            decodeBase64Char3 = _decodeBase64Escape(base64Variant, c12, 2);
                        }
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr4 = this._inputBuffer;
                        int i19 = this._inputPtr;
                        this._inputPtr = i19 + 1;
                        char c13 = cArr4[i19];
                        if (!base64Variant.usesPaddingChar(c13) && _decodeBase64Escape(base64Variant, c13, i11) != -2) {
                            throw reportInvalidBase64Char(base64Variant, c13, i11, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        bArr[i12] = (byte) (i16 >> 4);
                        i12++;
                    }
                }
                int i20 = (i16 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr5 = this._inputBuffer;
                int i21 = this._inputPtr;
                this._inputPtr = i21 + 1;
                char c14 = cArr5[i21];
                int decodeBase64Char4 = base64Variant.decodeBase64Char(c14);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 == -2) {
                        i10 = 3;
                    } else if (c14 == '\"') {
                        int i22 = i20 >> 2;
                        int i23 = i12 + 1;
                        bArr[i12] = (byte) (i22 >> 8);
                        i12 = i23 + 1;
                        bArr[i23] = (byte) i22;
                        if (base64Variant.usesPadding()) {
                            this._inputPtr--;
                            _handleBase64MissingPadding(base64Variant);
                        }
                    } else {
                        i10 = 3;
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, c14, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        int i24 = i20 >> 2;
                        int i25 = i12 + 1;
                        bArr[i12] = (byte) (i24 >> 8);
                        i12 = i25 + 1;
                        bArr[i25] = (byte) i24;
                        i11 = i10;
                    }
                } else {
                    i10 = 3;
                }
                int i26 = (i20 << 6) | decodeBase64Char4;
                int i27 = i12 + 1;
                bArr[i12] = (byte) (i26 >> 16);
                int i28 = i27 + 1;
                bArr[i27] = (byte) (i26 >> 8);
                bArr[i28] = (byte) i26;
                i12 = i28 + 1;
                i11 = i10;
            }
            i10 = i11;
            i11 = i10;
        }
        this._tokenIncomplete = false;
        if (i12 > 0) {
            int i29 = i13 + i12;
            outputStream.write(bArr, 0, i12);
            return i29;
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _releaseBuffers() {
        char[] cArr;
        super._releaseBuffers();
        this._symbols.release();
        if (!this._bufferRecyclable || (cArr = this._inputBuffer) == null) {
            return;
        }
        this._inputBuffer = null;
        this._ioContext.releaseTokenBuffer(cArr);
    }

    protected void _reportInvalidToken(String str) {
        _reportInvalidToken(str, _validJsonTokenList());
    }

    protected void _reportInvalidToken(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            char c10 = this._inputBuffer[this._inputPtr];
            if (Character.isJavaIdentifierPart(c10)) {
                this._inputPtr++;
                sb2.append(c10);
                if (sb2.length() >= 256) {
                    sb2.append("...");
                    break;
                }
            } else {
                break;
            }
        }
        _reportError("Unrecognized token '%s': was expecting %s", sb2, str2);
    }

    protected final void _skipCR() {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            char[] cArr = this._inputBuffer;
            int i10 = this._inputPtr;
            if (cArr[i10] == '\n') {
                this._inputPtr = i10 + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    protected final void _skipString() {
        this._tokenIncomplete = false;
        int i10 = this._inputPtr;
        int i11 = this._inputEnd;
        char[] cArr = this._inputBuffer;
        while (true) {
            if (i10 >= i11) {
                this._inputPtr = i10;
                if (!_loadMore()) {
                    _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                }
                i10 = this._inputPtr;
                i11 = this._inputEnd;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 <= '\\') {
                if (c10 == '\\') {
                    this._inputPtr = i12;
                    _decodeEscaped();
                    i10 = this._inputPtr;
                    i11 = this._inputEnd;
                } else if (c10 <= '\"') {
                    if (c10 == '\"') {
                        this._inputPtr = i12;
                        return;
                    } else if (c10 < ' ') {
                        this._inputPtr = i12;
                        _throwUnquotedSpace(c10, "string value");
                    }
                }
            }
            i10 = i12;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) {
        byte[] bArr;
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || (bArr = this._binaryValue) == null) {
            if (jsonToken != JsonToken.VALUE_STRING) {
                _reportError("Current token (" + this._currToken + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
            }
            if (this._tokenIncomplete) {
                try {
                    this._binaryValue = _decodeBase64(base64Variant);
                    this._tokenIncomplete = false;
                } catch (IllegalArgumentException e10) {
                    throw _constructError("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e10.getMessage());
                }
            } else if (this._binaryValue == null) {
                ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
                _decodeBase64(getText(), _getByteArrayBuilder, base64Variant);
                this._binaryValue = _getByteArrayBuilder.toByteArray();
            }
            return this._binaryValue;
        }
        return bArr;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        return new JsonLocation(_contentReference(), -1L, this._inputPtr + this._currInputProcessed, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    @Deprecated
    protected char getNextChar(String str) {
        return getNextChar(str, null);
    }

    protected char getNextChar(String str, JsonToken jsonToken) {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(str, jsonToken);
        }
        char[] cArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        return cArr[i10];
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JacksonFeatureSet<StreamReadCapability> getReadCapabilities() {
        return ParserBase.JSON_READ_CAPABILITIES;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getText() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
        }
        return _getText2(jsonToken);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final char[] getTextCharacters() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            int id2 = jsonToken.id();
            if (id2 != 5) {
                if (id2 != 6) {
                    if (id2 != 7 && id2 != 8) {
                        return this._currToken.asCharArray();
                    }
                } else if (this._tokenIncomplete) {
                    this._tokenIncomplete = false;
                    _finishString();
                }
                return this._textBuffer.getTextBuffer();
            }
            if (!this._nameCopied) {
                String currentName = this._parsingContext.getCurrentName();
                int length = currentName.length();
                char[] cArr = this._nameCopyBuffer;
                if (cArr == null) {
                    this._nameCopyBuffer = this._ioContext.allocNameCopyBuffer(length);
                } else if (cArr.length < length) {
                    this._nameCopyBuffer = new char[length];
                }
                currentName.getChars(0, length, this._nameCopyBuffer, 0);
                this._nameCopied = true;
            }
            return this._nameCopyBuffer;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int getTextLength() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            int id2 = jsonToken.id();
            if (id2 == 5) {
                return this._parsingContext.getCurrentName().length();
            }
            if (id2 != 6) {
                if (id2 != 7 && id2 != 8) {
                    return this._currToken.asCharArray().length;
                }
            } else if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.size();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r0 != 8) goto L15;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getTextOffset() {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3._currToken
            r1 = 0
            if (r0 == 0) goto L24
            int r0 = r0.id()
            r2 = 6
            if (r0 == r2) goto L14
            r2 = 7
            if (r0 == r2) goto L1d
            r2 = 8
            if (r0 == r2) goto L1d
            goto L24
        L14:
            boolean r0 = r3._tokenIncomplete
            if (r0 == 0) goto L1d
            r3._tokenIncomplete = r1
            r3._finishString()
        L1d:
            com.fasterxml.jackson.core.util.TextBuffer r0 = r3._textBuffer
            int r0 = r0.getTextOffset()
            return r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getTextOffset():int");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            return new JsonLocation(_contentReference(), -1L, this._currInputProcessed + (this._nameStartOffset - 1), this._nameStartRow, this._nameStartCol);
        }
        return new JsonLocation(_contentReference(), -1L, this._tokenInputTotal - 1, this._tokenInputRow, this._tokenInputCol);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getValueAsString() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? getCurrentName() : super.getValueAsString(null);
        }
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.contentsAsString();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getValueAsString(String str) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? getCurrentName() : super.getValueAsString(str);
        }
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.contentsAsString();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextFieldName() {
        JsonToken jsonToken;
        this._numTypesValid = 0;
        JsonToken jsonToken2 = this._currToken;
        JsonToken jsonToken3 = JsonToken.FIELD_NAME;
        if (jsonToken2 == jsonToken3) {
            _nextAfterName();
            return null;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93 || _skipWSOrEnd == 125) {
            _closeScope(_skipWSOrEnd);
            return null;
        }
        if (this._parsingContext.expectComma()) {
            _skipWSOrEnd = _skipComma(_skipWSOrEnd);
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                _closeScope(_skipWSOrEnd);
                return null;
            }
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            _nextTokenNotInObject(_skipWSOrEnd);
            return null;
        }
        _updateNameLocation();
        String _parseName = _skipWSOrEnd == 34 ? _parseName() : _handleOddName(_skipWSOrEnd);
        this._parsingContext.setCurrentName(_parseName);
        this._currToken = jsonToken3;
        int _skipColon = _skipColon();
        _updateLocation();
        if (_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return _parseName;
        }
        if (_skipColon == 45) {
            jsonToken = _parseNegNumber();
        } else if (_skipColon == 46) {
            jsonToken = _parseFloatThatStartsWithPeriod();
        } else if (_skipColon == 91) {
            jsonToken = JsonToken.START_ARRAY;
        } else if (_skipColon == 102) {
            _matchFalse();
            jsonToken = JsonToken.VALUE_FALSE;
        } else if (_skipColon == 110) {
            _matchNull();
            jsonToken = JsonToken.VALUE_NULL;
        } else if (_skipColon == 116) {
            _matchTrue();
            jsonToken = JsonToken.VALUE_TRUE;
        } else if (_skipColon != 123) {
            switch (_skipColon) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonToken = _parsePosNumber(_skipColon);
                    break;
                default:
                    jsonToken = _handleOddValue(_skipColon);
                    break;
            }
        } else {
            jsonToken = JsonToken.START_OBJECT;
        }
        this._nextToken = jsonToken;
        return _parseName;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int nextIntValue(int i10) {
        JsonReadContext createChildObjectContext;
        if (this._currToken != JsonToken.FIELD_NAME) {
            return nextToken() == JsonToken.VALUE_NUMBER_INT ? getIntValue() : i10;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
            return getIntValue();
        }
        if (jsonToken != JsonToken.START_ARRAY) {
            if (jsonToken == JsonToken.START_OBJECT) {
                createChildObjectContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            return i10;
        }
        createChildObjectContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        this._parsingContext = createChildObjectContext;
        return i10;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String nextTextValue() {
        JsonReadContext createChildObjectContext;
        if (this._currToken != JsonToken.FIELD_NAME) {
            if (nextToken() != JsonToken.VALUE_STRING) {
                return null;
            }
            return getText();
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken != JsonToken.START_ARRAY) {
            if (jsonToken == JsonToken.START_OBJECT) {
                createChildObjectContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            return null;
        }
        createChildObjectContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        this._parsingContext = createChildObjectContext;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (r0 == 125) goto L23;
     */
    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.core.JsonToken nextToken() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken():com.fasterxml.jackson.core.JsonToken");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
        if (!this._tokenIncomplete || this._currToken != JsonToken.VALUE_STRING) {
            byte[] binaryValue = getBinaryValue(base64Variant);
            outputStream.write(binaryValue);
            return binaryValue.length;
        }
        byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            return _readBinary(base64Variant, outputStream, allocBase64Buffer);
        } finally {
            this._ioContext.releaseBase64Buffer(allocBase64Buffer);
        }
    }
}
