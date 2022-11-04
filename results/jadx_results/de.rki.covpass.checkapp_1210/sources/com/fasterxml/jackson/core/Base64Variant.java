package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.Serializable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class Base64Variant implements Serializable {
    private final transient int[] _asciiToBase64;
    private final transient byte[] _base64ToAsciiB;
    private final transient char[] _base64ToAsciiC;
    private final int _maxLineLength;
    final String _name;
    private final char _paddingChar;
    private final PaddingReadBehaviour _paddingReadBehaviour;
    private final boolean _writePadding;

    /* loaded from: classes.dex */
    public enum PaddingReadBehaviour {
        PADDING_FORBIDDEN,
        PADDING_REQUIRED,
        PADDING_ALLOWED
    }

    public Base64Variant(Base64Variant base64Variant, String str, int i10) {
        this(base64Variant, str, base64Variant._writePadding, base64Variant._paddingChar, i10);
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z10, char c10, int i10) {
        this(base64Variant, str, z10, c10, base64Variant._paddingReadBehaviour, i10);
    }

    private Base64Variant(Base64Variant base64Variant, String str, boolean z10, char c10, PaddingReadBehaviour paddingReadBehaviour, int i10) {
        int[] iArr = new int[128];
        this._asciiToBase64 = iArr;
        char[] cArr = new char[64];
        this._base64ToAsciiC = cArr;
        byte[] bArr = new byte[64];
        this._base64ToAsciiB = bArr;
        this._name = str;
        byte[] bArr2 = base64Variant._base64ToAsciiB;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = base64Variant._base64ToAsciiC;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = base64Variant._asciiToBase64;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this._writePadding = z10;
        this._paddingChar = c10;
        this._maxLineLength = i10;
        this._paddingReadBehaviour = paddingReadBehaviour;
    }

    public Base64Variant(String str, String str2, boolean z10, char c10, int i10) {
        int[] iArr = new int[128];
        this._asciiToBase64 = iArr;
        char[] cArr = new char[64];
        this._base64ToAsciiC = cArr;
        this._base64ToAsciiB = new byte[64];
        this._name = str;
        this._writePadding = z10;
        this._paddingChar = c10;
        this._maxLineLength = i10;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + length + ")");
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < length; i11++) {
            char c11 = this._base64ToAsciiC[i11];
            this._base64ToAsciiB[i11] = (byte) c11;
            this._asciiToBase64[c11] = i11;
        }
        if (z10) {
            this._asciiToBase64[c10] = -2;
        }
        this._paddingReadBehaviour = z10 ? PaddingReadBehaviour.PADDING_REQUIRED : PaddingReadBehaviour.PADDING_FORBIDDEN;
    }

    protected void _reportBase64EOF() {
        throw new IllegalArgumentException(missingPaddingMessage());
    }

    protected void _reportBase64UnexpectedPadding() {
        throw new IllegalArgumentException(unexpectedPaddingMessage());
    }

    protected void _reportInvalidBase64(char c10, int i10, String str) {
        String str2;
        StringBuilder sb2;
        String str3;
        if (c10 <= ' ') {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(c10) + ") as character #" + (i10 + 1) + " of 4-char base64 unit: can only used between units";
        } else if (usesPaddingChar(c10)) {
            str2 = "Unexpected padding character ('" + getPaddingChar() + "') as character #" + (i10 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else {
            if (!Character.isDefined(c10) || Character.isISOControl(c10)) {
                sb2 = new StringBuilder();
                str3 = "Illegal character (code 0x";
            } else {
                sb2 = new StringBuilder();
                sb2.append("Illegal character '");
                sb2.append(c10);
                str3 = "' (code 0x";
            }
            sb2.append(str3);
            sb2.append(Integer.toHexString(c10));
            sb2.append(") in base64 content");
            str2 = sb2.toString();
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw new IllegalArgumentException(str2);
    }

    public boolean acceptsPaddingOnRead() {
        return this._paddingReadBehaviour != PaddingReadBehaviour.PADDING_FORBIDDEN;
    }

    public void decode(String str, ByteArrayBuilder byteArrayBuilder) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char charAt = str.charAt(i10);
            if (charAt > ' ') {
                int decodeBase64Char = decodeBase64Char(charAt);
                if (decodeBase64Char < 0) {
                    _reportInvalidBase64(charAt, 0, null);
                }
                if (i11 >= length) {
                    _reportBase64EOF();
                }
                int i12 = i11 + 1;
                char charAt2 = str.charAt(i11);
                int decodeBase64Char2 = decodeBase64Char(charAt2);
                if (decodeBase64Char2 < 0) {
                    _reportInvalidBase64(charAt2, 1, null);
                }
                int i13 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (i12 >= length) {
                    if (!requiresPaddingOnRead()) {
                        byteArrayBuilder.append(i13 >> 4);
                        return;
                    }
                    _reportBase64EOF();
                }
                int i14 = i12 + 1;
                char charAt3 = str.charAt(i12);
                int decodeBase64Char3 = decodeBase64Char(charAt3);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        _reportInvalidBase64(charAt3, 2, null);
                    }
                    if (!acceptsPaddingOnRead()) {
                        _reportBase64UnexpectedPadding();
                    }
                    if (i14 >= length) {
                        _reportBase64EOF();
                    }
                    i10 = i14 + 1;
                    char charAt4 = str.charAt(i14);
                    if (!usesPaddingChar(charAt4)) {
                        _reportInvalidBase64(charAt4, 3, "expected padding character '" + getPaddingChar() + "'");
                    }
                    byteArrayBuilder.append(i13 >> 4);
                } else {
                    int i15 = (i13 << 6) | decodeBase64Char3;
                    if (i14 >= length) {
                        if (!requiresPaddingOnRead()) {
                            byteArrayBuilder.appendTwoBytes(i15 >> 2);
                            return;
                        }
                        _reportBase64EOF();
                    }
                    i11 = i14 + 1;
                    char charAt5 = str.charAt(i14);
                    int decodeBase64Char4 = decodeBase64Char(charAt5);
                    if (decodeBase64Char4 < 0) {
                        if (decodeBase64Char4 != -2) {
                            _reportInvalidBase64(charAt5, 3, null);
                        }
                        if (!acceptsPaddingOnRead()) {
                            _reportBase64UnexpectedPadding();
                        }
                        byteArrayBuilder.appendTwoBytes(i15 >> 2);
                    } else {
                        byteArrayBuilder.appendThreeBytes((i15 << 6) | decodeBase64Char4);
                    }
                }
            }
            i10 = i11;
        }
    }

    public byte[] decode(String str) {
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder();
        decode(str, byteArrayBuilder);
        return byteArrayBuilder.toByteArray();
    }

    public int decodeBase64Char(char c10) {
        if (c10 <= 127) {
            return this._asciiToBase64[c10];
        }
        return -1;
    }

    public String encode(byte[] bArr) {
        return encode(bArr, false);
    }

    public String encode(byte[] bArr, boolean z10) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z10) {
            sb2.append('\"');
        }
        int maxLineLength = getMaxLineLength() >> 2;
        int i10 = 0;
        int i11 = length - 3;
        while (i10 <= i11) {
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = i13 + 1;
            encodeBase64Chunk(sb2, (((bArr[i10] << 8) | (bArr[i12] & 255)) << 8) | (bArr[i13] & 255));
            maxLineLength--;
            if (maxLineLength <= 0) {
                sb2.append('\\');
                sb2.append('n');
                maxLineLength = getMaxLineLength() >> 2;
            }
            i10 = i14;
        }
        int i15 = length - i10;
        if (i15 > 0) {
            int i16 = i10 + 1;
            int i17 = bArr[i10] << 16;
            if (i15 == 2) {
                i17 |= (bArr[i16] & 255) << 8;
            }
            encodeBase64Partial(sb2, i17, i15);
        }
        if (z10) {
            sb2.append('\"');
        }
        return sb2.toString();
    }

    public int encodeBase64Chunk(int i10, char[] cArr, int i11) {
        int i12 = i11 + 1;
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i11] = cArr2[(i10 >> 18) & 63];
        int i13 = i12 + 1;
        cArr[i12] = cArr2[(i10 >> 12) & 63];
        int i14 = i13 + 1;
        cArr[i13] = cArr2[(i10 >> 6) & 63];
        int i15 = i14 + 1;
        cArr[i14] = cArr2[i10 & 63];
        return i15;
    }

    public void encodeBase64Chunk(StringBuilder sb2, int i10) {
        sb2.append(this._base64ToAsciiC[(i10 >> 18) & 63]);
        sb2.append(this._base64ToAsciiC[(i10 >> 12) & 63]);
        sb2.append(this._base64ToAsciiC[(i10 >> 6) & 63]);
        sb2.append(this._base64ToAsciiC[i10 & 63]);
    }

    public int encodeBase64Partial(int i10, int i11, char[] cArr, int i12) {
        int i13 = i12 + 1;
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i12] = cArr2[(i10 >> 18) & 63];
        int i14 = i13 + 1;
        cArr[i13] = cArr2[(i10 >> 12) & 63];
        if (usesPadding()) {
            int i15 = i14 + 1;
            cArr[i14] = i11 == 2 ? this._base64ToAsciiC[(i10 >> 6) & 63] : this._paddingChar;
            int i16 = i15 + 1;
            cArr[i15] = this._paddingChar;
            return i16;
        } else if (i11 != 2) {
            return i14;
        } else {
            int i17 = i14 + 1;
            cArr[i14] = this._base64ToAsciiC[(i10 >> 6) & 63];
            return i17;
        }
    }

    public void encodeBase64Partial(StringBuilder sb2, int i10, int i11) {
        char c10;
        sb2.append(this._base64ToAsciiC[(i10 >> 18) & 63]);
        sb2.append(this._base64ToAsciiC[(i10 >> 12) & 63]);
        if (usesPadding()) {
            sb2.append(i11 == 2 ? this._base64ToAsciiC[(i10 >> 6) & 63] : this._paddingChar);
            c10 = this._paddingChar;
        } else if (i11 != 2) {
            return;
        } else {
            c10 = this._base64ToAsciiC[(i10 >> 6) & 63];
        }
        sb2.append(c10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != Base64Variant.class) {
            return false;
        }
        Base64Variant base64Variant = (Base64Variant) obj;
        return base64Variant._paddingChar == this._paddingChar && base64Variant._maxLineLength == this._maxLineLength && base64Variant._writePadding == this._writePadding && base64Variant._paddingReadBehaviour == this._paddingReadBehaviour && this._name.equals(base64Variant._name);
    }

    public int getMaxLineLength() {
        return this._maxLineLength;
    }

    public String getName() {
        return this._name;
    }

    public char getPaddingChar() {
        return this._paddingChar;
    }

    public int hashCode() {
        return this._name.hashCode();
    }

    public String missingPaddingMessage() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", getName(), Character.valueOf(getPaddingChar()));
    }

    public boolean requiresPaddingOnRead() {
        return this._paddingReadBehaviour == PaddingReadBehaviour.PADDING_REQUIRED;
    }

    public String toString() {
        return this._name;
    }

    protected String unexpectedPaddingMessage() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured", getName());
    }

    public boolean usesPadding() {
        return this._writePadding;
    }

    public boolean usesPaddingChar(char c10) {
        return c10 == this._paddingChar;
    }

    public boolean usesPaddingChar(int i10) {
        return i10 == this._paddingChar;
    }
}
