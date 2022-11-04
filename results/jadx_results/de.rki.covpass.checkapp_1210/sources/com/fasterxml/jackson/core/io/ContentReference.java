package com.fasterxml.jackson.core.io;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes.dex */
public class ContentReference implements Serializable {
    protected static final ContentReference UNKNOWN_CONTENT = new ContentReference(false, null);
    protected final boolean _isContentTextual;
    protected final int _length;
    protected final int _offset;
    protected final transient Object _rawContent;

    protected ContentReference(boolean z10, Object obj) {
        this(z10, obj, -1, -1);
    }

    protected ContentReference(boolean z10, Object obj, int i10, int i11) {
        this._isContentTextual = z10;
        this._rawContent = obj;
        this._offset = i10;
        this._length = i11;
    }

    public static ContentReference construct(boolean z10, Object obj) {
        return new ContentReference(z10, obj);
    }

    public static ContentReference rawReference(Object obj) {
        return rawReference(false, obj);
    }

    public static ContentReference rawReference(boolean z10, Object obj) {
        return obj instanceof ContentReference ? (ContentReference) obj : new ContentReference(z10, obj);
    }

    public static ContentReference unknown() {
        return UNKNOWN_CONTENT;
    }

    protected int _append(StringBuilder sb2, String str) {
        sb2.append('\"');
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (!Character.isISOControl(charAt) || !_appendEscaped(sb2, charAt)) {
                sb2.append(charAt);
            }
        }
        sb2.append('\"');
        return str.length();
    }

    protected boolean _appendEscaped(StringBuilder sb2, int i10) {
        if (i10 == 13 || i10 == 10) {
            return false;
        }
        sb2.append('\\');
        sb2.append('u');
        sb2.append(CharTypes.hexToChar((i10 >> 12) & 15));
        sb2.append(CharTypes.hexToChar((i10 >> 8) & 15));
        sb2.append(CharTypes.hexToChar((i10 >> 4) & 15));
        sb2.append(CharTypes.hexToChar(i10 & 15));
        return true;
    }

    protected String _truncate(CharSequence charSequence, int[] iArr, int i10) {
        _truncateOffsets(iArr, charSequence.length());
        int i11 = iArr[0];
        return charSequence.subSequence(i11, Math.min(iArr[1], i10) + i11).toString();
    }

    protected String _truncate(byte[] bArr, int[] iArr, int i10) {
        _truncateOffsets(iArr, bArr.length);
        return new String(bArr, iArr[0], Math.min(iArr[1], i10), Charset.forName("UTF-8"));
    }

    protected String _truncate(char[] cArr, int[] iArr, int i10) {
        _truncateOffsets(iArr, cArr.length);
        return new String(cArr, iArr[0], Math.min(iArr[1], i10));
    }

    protected void _truncateOffsets(int[] iArr, int i10) {
        int i11 = iArr[0];
        if (i11 < 0) {
            i11 = 0;
        } else if (i11 >= i10) {
            i11 = i10;
        }
        iArr[0] = i11;
        int i12 = iArr[1];
        int i13 = i10 - i11;
        if (i12 < 0 || i12 > i13) {
            iArr[1] = i13;
        }
    }

    public StringBuilder appendSourceDescription(StringBuilder sb2) {
        String str;
        Object rawContent = getRawContent();
        if (rawContent == null) {
            sb2.append("UNKNOWN");
            return sb2;
        }
        Class<?> cls = rawContent instanceof Class ? (Class) rawContent : rawContent.getClass();
        String name = cls.getName();
        if (name.startsWith("java.")) {
            name = cls.getSimpleName();
        } else if (rawContent instanceof byte[]) {
            name = "byte[]";
        } else if (rawContent instanceof char[]) {
            name = "char[]";
        }
        sb2.append('(');
        sb2.append(name);
        sb2.append(')');
        if (hasTextualContent()) {
            int maxContentSnippetLength = maxContentSnippetLength();
            int[] iArr = {contentOffset(), contentLength()};
            String str2 = " chars";
            if (rawContent instanceof CharSequence) {
                str = _truncate((CharSequence) rawContent, iArr, maxContentSnippetLength);
            } else if (rawContent instanceof char[]) {
                str = _truncate((char[]) rawContent, iArr, maxContentSnippetLength);
            } else if (rawContent instanceof byte[]) {
                str = _truncate((byte[]) rawContent, iArr, maxContentSnippetLength);
                str2 = " bytes";
            } else {
                str = null;
            }
            if (str != null) {
                _append(sb2, str);
                if (iArr[1] > maxContentSnippetLength) {
                    sb2.append("[truncated ");
                    sb2.append(iArr[1] - maxContentSnippetLength);
                    sb2.append(str2);
                    sb2.append(']');
                }
            }
        } else if (rawContent instanceof byte[]) {
            int contentLength = contentLength();
            if (contentLength < 0) {
                contentLength = ((byte[]) rawContent).length;
            }
            sb2.append('[');
            sb2.append(contentLength);
            sb2.append(" bytes]");
        }
        return sb2;
    }

    public String buildSourceDescription() {
        return appendSourceDescription(new StringBuilder(200)).toString();
    }

    public int contentLength() {
        return this._length;
    }

    public int contentOffset() {
        return this._offset;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof ContentReference) && this._rawContent == ((ContentReference) obj)._rawContent;
    }

    public Object getRawContent() {
        return this._rawContent;
    }

    public boolean hasTextualContent() {
        return this._isContentTextual;
    }

    public int hashCode() {
        return Objects.hashCode(this._rawContent);
    }

    protected int maxContentSnippetLength() {
        return 500;
    }
}
