package io.noties.markwon.html.jsoup.parser;

import io.noties.markwon.html.jsoup.UncheckedIOException;
import io.noties.markwon.html.jsoup.helper.Validate;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Locale;
/* loaded from: classes2.dex */
public final class CharacterReader {
    static final char EOF = 65535;
    static final int maxBufferLen = 4096;
    private static final int maxStringCacheLen = 12;
    private static final int readAheadLimit = 3072;
    private int bufLength;
    private int bufMark;
    private int bufPos;
    private int bufSplitPoint;
    private final char[] charBuf;
    private final Reader reader;
    private int readerPos;
    private final String[] stringCache;

    public CharacterReader(Reader reader, int i) {
        this.stringCache = new String[128];
        Validate.notNull(reader);
        Validate.isTrue(reader.markSupported());
        this.reader = reader;
        this.charBuf = new char[4096];
        bufferUp();
    }

    public CharacterReader(Reader reader) {
        this(reader, 4096);
    }

    public CharacterReader(String str) {
        this(new StringReader(str), str.length());
    }

    private void bufferUp() {
        int i = this.bufPos;
        if (i < this.bufSplitPoint) {
            return;
        }
        try {
            this.reader.skip(i);
            this.reader.mark(4096);
            int read = this.reader.read(this.charBuf);
            this.reader.reset();
            if (read == -1) {
                return;
            }
            this.bufLength = read;
            this.readerPos += this.bufPos;
            this.bufPos = 0;
            this.bufMark = 0;
            if (read > readAheadLimit) {
                read = readAheadLimit;
            }
            this.bufSplitPoint = read;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public int pos() {
        return this.readerPos + this.bufPos;
    }

    public boolean isEmpty() {
        bufferUp();
        return this.bufPos >= this.bufLength;
    }

    private boolean isEmptyNoBufferUp() {
        return this.bufPos >= this.bufLength;
    }

    public char current() {
        bufferUp();
        if (isEmptyNoBufferUp()) {
            return (char) 65535;
        }
        return this.charBuf[this.bufPos];
    }

    public char consume() {
        bufferUp();
        char c = isEmptyNoBufferUp() ? (char) 65535 : this.charBuf[this.bufPos];
        this.bufPos++;
        return c;
    }

    public void unconsume() {
        this.bufPos--;
    }

    public void advance() {
        this.bufPos++;
    }

    public void mark() {
        this.bufMark = this.bufPos;
    }

    public void rewindToMark() {
        this.bufPos = this.bufMark;
    }

    int nextIndexOf(char c) {
        bufferUp();
        for (int i = this.bufPos; i < this.bufLength; i++) {
            if (c == this.charBuf[i]) {
                return i - this.bufPos;
            }
        }
        return -1;
    }

    int nextIndexOf(CharSequence charSequence) {
        bufferUp();
        char charAt = charSequence.charAt(0);
        int i = this.bufPos;
        while (i < this.bufLength) {
            if (charAt != this.charBuf[i]) {
                do {
                    i++;
                    if (i >= this.bufLength) {
                        break;
                    }
                } while (charAt != this.charBuf[i]);
            }
            int i2 = i + 1;
            int length = (charSequence.length() + i2) - 1;
            int i3 = this.bufLength;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && charSequence.charAt(i5) == this.charBuf[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.bufPos;
                }
            }
            i = i2;
        }
        return -1;
    }

    public String consumeTo(char c) {
        int nextIndexOf = nextIndexOf(c);
        if (nextIndexOf != -1) {
            String cacheString = cacheString(this.charBuf, this.stringCache, this.bufPos, nextIndexOf);
            this.bufPos += nextIndexOf;
            return cacheString;
        }
        return consumeToEnd();
    }

    public String consumeTo(String str) {
        int nextIndexOf = nextIndexOf(str);
        if (nextIndexOf != -1) {
            String cacheString = cacheString(this.charBuf, this.stringCache, this.bufPos, nextIndexOf);
            this.bufPos += nextIndexOf;
            return cacheString;
        }
        return consumeToEnd();
    }

    public String consumeToAny(char... cArr) {
        bufferUp();
        int i = this.bufPos;
        int i2 = this.bufLength;
        char[] cArr2 = this.charBuf;
        loop0: while (this.bufPos < i2) {
            for (char c : cArr) {
                if (cArr2[this.bufPos] == c) {
                    break loop0;
                }
            }
            this.bufPos++;
        }
        int i3 = this.bufPos;
        return i3 > i ? cacheString(this.charBuf, this.stringCache, i, i3 - i) : "";
    }

    public String consumeToAnySorted(char... cArr) {
        bufferUp();
        int i = this.bufPos;
        int i2 = this.bufLength;
        char[] cArr2 = this.charBuf;
        while (true) {
            int i3 = this.bufPos;
            if (i3 >= i2 || Arrays.binarySearch(cArr, cArr2[i3]) >= 0) {
                break;
            }
            this.bufPos++;
        }
        int i4 = this.bufPos;
        return i4 > i ? cacheString(this.charBuf, this.stringCache, i, i4 - i) : "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return cacheString(r6.charBuf, r6.stringCache, r0, r3 - r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String consumeData() {
        /*
            r6 = this;
            r6.bufferUp()
            int r0 = r6.bufPos
            int r1 = r6.bufLength
            char[] r2 = r6.charBuf
        L9:
            int r3 = r6.bufPos
            if (r3 >= r1) goto L1f
            char r4 = r2[r3]
            r5 = 38
            if (r4 == r5) goto L1f
            r5 = 60
            if (r4 == r5) goto L1f
            if (r4 != 0) goto L1a
            goto L1f
        L1a:
            int r3 = r3 + 1
            r6.bufPos = r3
            goto L9
        L1f:
            if (r3 <= r0) goto L2b
            char[] r1 = r6.charBuf
            java.lang.String[] r2 = r6.stringCache
            int r3 = r3 - r0
            java.lang.String r0 = cacheString(r1, r2, r0, r3)
            goto L2d
        L2b:
            java.lang.String r0 = ""
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.noties.markwon.html.jsoup.parser.CharacterReader.consumeData():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        return cacheString(r6.charBuf, r6.stringCache, r0, r3 - r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String consumeTagName() {
        /*
            r6 = this;
            r6.bufferUp()
            int r0 = r6.bufPos
            int r1 = r6.bufLength
            char[] r2 = r6.charBuf
        L9:
            int r3 = r6.bufPos
            if (r3 >= r1) goto L33
            char r4 = r2[r3]
            r5 = 9
            if (r4 == r5) goto L33
            r5 = 10
            if (r4 == r5) goto L33
            r5 = 13
            if (r4 == r5) goto L33
            r5 = 12
            if (r4 == r5) goto L33
            r5 = 32
            if (r4 == r5) goto L33
            r5 = 47
            if (r4 == r5) goto L33
            r5 = 62
            if (r4 == r5) goto L33
            if (r4 != 0) goto L2e
            goto L33
        L2e:
            int r3 = r3 + 1
            r6.bufPos = r3
            goto L9
        L33:
            if (r3 <= r0) goto L3f
            char[] r1 = r6.charBuf
            java.lang.String[] r2 = r6.stringCache
            int r3 = r3 - r0
            java.lang.String r0 = cacheString(r1, r2, r0, r3)
            goto L41
        L3f:
            java.lang.String r0 = ""
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.noties.markwon.html.jsoup.parser.CharacterReader.consumeTagName():java.lang.String");
    }

    String consumeToEnd() {
        bufferUp();
        char[] cArr = this.charBuf;
        String[] strArr = this.stringCache;
        int i = this.bufPos;
        String cacheString = cacheString(cArr, strArr, i, this.bufLength - i);
        this.bufPos = this.bufLength;
        return cacheString;
    }

    public String consumeLetterSequence() {
        char c;
        bufferUp();
        int i = this.bufPos;
        while (true) {
            int i2 = this.bufPos;
            if (i2 >= this.bufLength || (((c = this.charBuf[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.bufPos++;
        }
        return cacheString(this.charBuf, this.stringCache, i, this.bufPos - i);
    }

    public String consumeLetterThenDigitSequence() {
        char c;
        bufferUp();
        int i = this.bufPos;
        while (true) {
            int i2 = this.bufPos;
            if (i2 >= this.bufLength || (((c = this.charBuf[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.bufPos++;
        }
        while (!isEmptyNoBufferUp()) {
            char[] cArr = this.charBuf;
            int i3 = this.bufPos;
            char c2 = cArr[i3];
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.bufPos = i3 + 1;
        }
        return cacheString(this.charBuf, this.stringCache, i, this.bufPos - i);
    }

    public String consumeHexSequence() {
        int i;
        char c;
        bufferUp();
        int i2 = this.bufPos;
        while (true) {
            i = this.bufPos;
            if (i >= this.bufLength || (((c = this.charBuf[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.bufPos = i + 1;
        }
        return cacheString(this.charBuf, this.stringCache, i2, i - i2);
    }

    public String consumeDigitSequence() {
        int i;
        char c;
        bufferUp();
        int i2 = this.bufPos;
        while (true) {
            i = this.bufPos;
            if (i >= this.bufLength || (c = this.charBuf[i]) < '0' || c > '9') {
                break;
            }
            this.bufPos = i + 1;
        }
        return cacheString(this.charBuf, this.stringCache, i2, i - i2);
    }

    public boolean matches(char c) {
        return !isEmpty() && this.charBuf[this.bufPos] == c;
    }

    boolean matches(String str) {
        bufferUp();
        int length = str.length();
        if (length > this.bufLength - this.bufPos) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != this.charBuf[this.bufPos + i]) {
                return false;
            }
        }
        return true;
    }

    boolean matchesIgnoreCase(String str) {
        bufferUp();
        int length = str.length();
        if (length > this.bufLength - this.bufPos) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.charBuf[this.bufPos + i])) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAny(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        bufferUp();
        char c = this.charBuf[this.bufPos];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesAnySorted(char[] cArr) {
        bufferUp();
        return !isEmpty() && Arrays.binarySearch(cArr, this.charBuf[this.bufPos]) >= 0;
    }

    public boolean matchesLetter() {
        if (isEmpty()) {
            return false;
        }
        char c = this.charBuf[this.bufPos];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    public boolean matchesDigit() {
        char c;
        return !isEmpty() && (c = this.charBuf[this.bufPos]) >= '0' && c <= '9';
    }

    public boolean matchConsume(String str) {
        bufferUp();
        if (matches(str)) {
            this.bufPos += str.length();
            return true;
        }
        return false;
    }

    public boolean matchConsumeIgnoreCase(String str) {
        if (matchesIgnoreCase(str)) {
            this.bufPos += str.length();
            return true;
        }
        return false;
    }

    public boolean containsIgnoreCase(String str) {
        return nextIndexOf(str.toLowerCase(Locale.ENGLISH)) > -1 || nextIndexOf(str.toUpperCase(Locale.ENGLISH)) > -1;
    }

    public String toString() {
        char[] cArr = this.charBuf;
        int i = this.bufPos;
        return new String(cArr, i, this.bufLength - i);
    }

    private static String cacheString(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        int i4 = i;
        int i5 = 0;
        while (i3 < i2) {
            i5 = (i5 * 31) + cArr[i4];
            i3++;
            i4++;
        }
        int length = i5 & (strArr.length - 1);
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[length] = str2;
            return str2;
        } else if (rangeEquals(cArr, i, i2, str)) {
            return str;
        } else {
            String str3 = new String(cArr, i, i2);
            strArr[length] = str3;
            return str3;
        }
    }

    static boolean rangeEquals(char[] cArr, int i, int i2, String str) {
        if (i2 == str.length()) {
            int i3 = 0;
            while (true) {
                int i4 = i2 - 1;
                if (i2 == 0) {
                    return true;
                }
                int i5 = i + 1;
                int i6 = i3 + 1;
                if (cArr[i] != str.charAt(i3)) {
                    return false;
                }
                i = i5;
                i2 = i4;
                i3 = i6;
            }
        } else {
            return false;
        }
    }

    boolean rangeEquals(int i, int i2, String str) {
        return rangeEquals(this.charBuf, i, i2, str);
    }
}
