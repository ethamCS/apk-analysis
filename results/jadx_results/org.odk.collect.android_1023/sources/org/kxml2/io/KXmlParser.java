package org.kxml2.io;

import java.io.IOException;
import java.io.Reader;
import java.util.Hashtable;
import org.apache.james.mime4j.field.address.parser.AddressListParserConstants;
import org.apache.james.mime4j.field.datetime.parser.DateTimeParserConstants;
import org.kxml2.wap.Wbxml;
import org.opendatakit.httpclientandroidlib.impl.client.cache.CacheConfig;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class KXmlParser implements XmlPullParser {
    private static final String ILLEGAL_TYPE = "Wrong event type";
    private static final int LEGACY = 999;
    private static final String UNEXPECTED_EOF = "Unexpected EOF";
    private static final int XML_DECL = 998;
    private int attributeCount;
    private int column;
    private boolean degenerated;
    private int depth;
    private String encoding;
    private Hashtable entityMap;
    private String error;
    private boolean isWhitespace;
    private int line;
    private Object location;
    private String name;
    private String namespace;
    private int peekCount;
    private String prefix;
    private boolean processNsp;
    private Reader reader;
    private boolean relaxed;
    private char[] srcBuf;
    private int srcCount;
    private int srcPos;
    private Boolean standalone;
    private boolean token;
    private int txtPos;
    private int type;
    private boolean unresolved;
    private String version;
    private boolean wasCR;
    private String[] elementStack = new String[16];
    private String[] nspStack = new String[8];
    private int[] nspCounts = new int[4];
    private char[] txtBuf = new char[Wbxml.EXT_T_0];
    private String[] attributes = new String[16];
    private int stackMismatch = 0;
    private int[] peek = new int[2];

    public KXmlParser() {
        int i = Wbxml.EXT_T_0;
        this.srcBuf = new char[Runtime.getRuntime().freeMemory() >= 1048576 ? CacheConfig.DEFAULT_MAX_OBJECT_SIZE_BYTES : i];
    }

    private final boolean adjustNsp() throws XmlPullParserException {
        String str;
        String str2;
        int i = 0;
        boolean z = false;
        while (i < (this.attributeCount << 2)) {
            String str3 = this.attributes[i + 2];
            int indexOf = str3.indexOf(58);
            if (indexOf != -1) {
                str2 = str3.substring(0, indexOf);
                str = str3.substring(indexOf + 1);
            } else if (str3.equals("xmlns")) {
                str = null;
                str2 = str3;
            } else {
                i += 4;
            }
            if (!str2.equals("xmlns")) {
                z = true;
            } else {
                int[] iArr = this.nspCounts;
                int i2 = this.depth;
                int i3 = iArr[i2];
                iArr[i2] = i3 + 1;
                int i4 = i3 << 1;
                this.nspStack = ensureCapacity(this.nspStack, i4 + 2);
                this.nspStack[i4] = str;
                this.nspStack[i4 + 1] = this.attributes[i + 3];
                if (str != null && this.attributes[i + 3].equals("")) {
                    error("illegal empty namespace");
                }
                String[] strArr = this.attributes;
                int i5 = this.attributeCount - 1;
                this.attributeCount = i5;
                System.arraycopy(this.attributes, i + 4, strArr, i, (i5 << 2) - i);
                i -= 4;
            }
            i += 4;
        }
        if (z) {
            for (int i6 = (this.attributeCount << 2) - 4; i6 >= 0; i6 -= 4) {
                String str4 = this.attributes[i6 + 2];
                int indexOf2 = str4.indexOf(58);
                if (indexOf2 == 0 && !this.relaxed) {
                    throw new RuntimeException(new StringBuffer().append("illegal attribute name: ").append(str4).append(" at ").append(this).toString());
                }
                if (indexOf2 != -1) {
                    String substring = str4.substring(0, indexOf2);
                    String substring2 = str4.substring(indexOf2 + 1);
                    String namespace = getNamespace(substring);
                    if (namespace == null && !this.relaxed) {
                        throw new RuntimeException(new StringBuffer().append("Undefined Prefix: ").append(substring).append(" in ").append(this).toString());
                    }
                    this.attributes[i6] = namespace;
                    this.attributes[i6 + 1] = substring;
                    this.attributes[i6 + 2] = substring2;
                }
            }
        }
        int indexOf3 = this.name.indexOf(58);
        if (indexOf3 == 0) {
            error(new StringBuffer().append("illegal tag name: ").append(this.name).toString());
        }
        if (indexOf3 != -1) {
            this.prefix = this.name.substring(0, indexOf3);
            this.name = this.name.substring(indexOf3 + 1);
        }
        this.namespace = getNamespace(this.prefix);
        if (this.namespace == null) {
            if (this.prefix != null) {
                error(new StringBuffer().append("undefined prefix: ").append(this.prefix).toString());
            }
            this.namespace = "";
        }
        return z;
    }

    private final String[] ensureCapacity(String[] strArr, int i) {
        if (strArr.length >= i) {
            return strArr;
        }
        String[] strArr2 = new String[i + 16];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        return strArr2;
    }

    private final void error(String str) throws XmlPullParserException {
        if (!this.relaxed) {
            exception(str);
        } else if (this.error != null) {
        } else {
            this.error = new StringBuffer().append("ERR: ").append(str).toString();
        }
    }

    private final void exception(String str) throws XmlPullParserException {
        if (str.length() >= 100) {
            str = new StringBuffer().append(str.substring(0, 100)).append("\n").toString();
        }
        throw new XmlPullParserException(str, this, null);
    }

    private final String get(int i) {
        return new String(this.txtBuf, i, this.txtPos - i);
    }

    private final boolean isProp(String str, boolean z, String str2) {
        if (!str.startsWith("http://xmlpull.org/v1/doc/")) {
            return false;
        }
        return z ? str.substring(42).equals(str2) : str.substring(40).equals(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r0 >= r7.error.length()) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        push(r7.error.charAt(r0));
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        r7.error = null;
        r7.type = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void nextImpl() throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.kxml2.io.KXmlParser.nextImpl():void");
    }

    private final void parseDoctype(boolean z) throws IOException, XmlPullParserException {
        boolean z2 = false;
        int i = 1;
        while (true) {
            int read = read();
            switch (read) {
                case -1:
                    error(UNEXPECTED_EOF);
                    return;
                case 39:
                    if (z2) {
                        z2 = false;
                        break;
                    } else {
                        z2 = true;
                        break;
                    }
                case 60:
                    if (!z2) {
                        i++;
                        break;
                    }
                    break;
                case 62:
                    if (!z2 && i - 1 == 0) {
                        return;
                    }
                    break;
            }
            if (z) {
                push(read);
            }
        }
    }

    private final void parseEndTag() throws IOException, XmlPullParserException {
        read();
        read();
        this.name = readName();
        skip();
        read('>');
        int i = (this.depth - 1) << 2;
        if (this.depth == 0) {
            error("element stack empty");
            this.type = 9;
            return;
        }
        if (!this.name.equals(this.elementStack[i + 3])) {
            error(new StringBuffer().append("expected: /").append(this.elementStack[i + 3]).append(" read: ").append(this.name).toString());
            int i2 = i;
            while (i2 >= 0 && !this.name.toLowerCase().equals(this.elementStack[i2 + 3].toLowerCase())) {
                this.stackMismatch++;
                i2 -= 4;
            }
            if (i2 < 0) {
                this.stackMismatch = 0;
                this.type = 9;
                return;
            }
        }
        this.namespace = this.elementStack[i];
        this.prefix = this.elementStack[i + 1];
        this.name = this.elementStack[i + 2];
    }

    private final int parseLegacy(boolean z) throws IOException, XmlPullParserException {
        int i;
        String str;
        int i2;
        int i3;
        read();
        int read = read();
        if (read == 63) {
            if ((peek(0) == 120 || peek(0) == 88) && (peek(1) == 109 || peek(1) == 77)) {
                if (z) {
                    push(peek(0));
                    push(peek(1));
                }
                read();
                read();
                if ((peek(0) == 108 || peek(0) == 76) && peek(1) <= 32) {
                    if (this.line != 1 || this.column > 4) {
                        error("PI must not start with xml");
                    }
                    parseStartTag(true);
                    if (this.attributeCount < 1 || !"version".equals(this.attributes[2])) {
                        error("version expected");
                    }
                    this.version = this.attributes[3];
                    if (1 >= this.attributeCount || !"encoding".equals(this.attributes[6])) {
                        i3 = 1;
                    } else {
                        this.encoding = this.attributes[7];
                        i3 = 2;
                    }
                    if (i3 < this.attributeCount && "standalone".equals(this.attributes[(i3 * 4) + 2])) {
                        String str2 = this.attributes[(i3 * 4) + 3];
                        if ("yes".equals(str2)) {
                            this.standalone = new Boolean(true);
                        } else if ("no".equals(str2)) {
                            this.standalone = new Boolean(false);
                        } else {
                            error(new StringBuffer().append("illegal standalone value: ").append(str2).toString());
                        }
                        i3++;
                    }
                    if (i3 != this.attributeCount) {
                        error("illegal xmldecl");
                    }
                    this.isWhitespace = true;
                    this.txtPos = 0;
                    return XML_DECL;
                }
            }
            i = 8;
            str = "";
            i2 = 63;
        } else if (read != 33) {
            error(new StringBuffer().append("illegal: <").append(read).toString());
            return 9;
        } else if (peek(0) == 45) {
            i2 = 45;
            str = "--";
            i = 9;
        } else if (peek(0) == 91) {
            i = 5;
            str = "[CDATA[";
            i2 = 93;
            z = true;
        } else {
            i = 10;
            str = "DOCTYPE";
            i2 = -1;
        }
        for (int i4 = 0; i4 < str.length(); i4++) {
            read(str.charAt(i4));
        }
        if (i == 10) {
            parseDoctype(z);
        } else {
            int i5 = 0;
            while (true) {
                int read2 = read();
                if (read2 == -1) {
                    error(UNEXPECTED_EOF);
                    return 9;
                }
                if (z) {
                    push(read2);
                }
                if ((i2 == 63 || read2 == i2) && peek(0) == i2 && peek(1) == 62) {
                    if (i2 == 45 && i5 == 45) {
                        error("illegal comment delimiter: --->");
                    }
                    read();
                    read();
                    if (z && i2 != 63) {
                        this.txtPos--;
                    }
                } else {
                    i5 = read2;
                }
            }
        }
        return i;
    }

    private final void parseStartTag(boolean z) throws IOException, XmlPullParserException {
        if (!z) {
            read();
        }
        this.name = readName();
        this.attributeCount = 0;
        while (true) {
            skip();
            int peek = peek(0);
            if (!z) {
                if (peek != 47) {
                    if (peek == 62 && !z) {
                        read();
                        break;
                    }
                } else {
                    this.degenerated = true;
                    read();
                    skip();
                    read('>');
                    break;
                }
            } else if (peek == 63) {
                read();
                read('>');
                return;
            }
            if (peek == -1) {
                error(UNEXPECTED_EOF);
                return;
            }
            String readName = readName();
            if (readName.length() == 0) {
                error("attr name expected");
                break;
            }
            int i = this.attributeCount;
            this.attributeCount = i + 1;
            int i2 = i << 2;
            this.attributes = ensureCapacity(this.attributes, i2 + 4);
            int i3 = i2 + 1;
            this.attributes[i2] = "";
            int i4 = i3 + 1;
            this.attributes[i3] = null;
            int i5 = i4 + 1;
            this.attributes[i4] = readName;
            skip();
            if (peek(0) != 61) {
                error(new StringBuffer().append("Attr.value missing f. ").append(readName).toString());
                this.attributes[i5] = "1";
            } else {
                read('=');
                skip();
                int peek2 = peek(0);
                if (peek2 == 39 || peek2 == 34) {
                    read();
                } else {
                    error("attr value delimiter missing!");
                    peek2 = 32;
                }
                int i6 = this.txtPos;
                pushText(peek2, true);
                this.attributes[i5] = get(i6);
                this.txtPos = i6;
                if (peek2 != 32) {
                    read();
                }
            }
        }
        int i7 = this.depth;
        this.depth = i7 + 1;
        int i8 = i7 << 2;
        this.elementStack = ensureCapacity(this.elementStack, i8 + 4);
        this.elementStack[i8 + 3] = this.name;
        if (this.depth >= this.nspCounts.length) {
            int[] iArr = new int[this.depth + 4];
            System.arraycopy(this.nspCounts, 0, iArr, 0, this.nspCounts.length);
            this.nspCounts = iArr;
        }
        this.nspCounts[this.depth] = this.nspCounts[this.depth - 1];
        if (this.processNsp) {
            adjustNsp();
        } else {
            this.namespace = "";
        }
        this.elementStack[i8] = this.namespace;
        this.elementStack[i8 + 1] = this.prefix;
        this.elementStack[i8 + 2] = this.name;
    }

    private final int peek(int i) throws IOException {
        char c;
        while (i >= this.peekCount) {
            if (this.srcBuf.length <= 1) {
                c = this.reader.read();
            } else if (this.srcPos < this.srcCount) {
                char[] cArr = this.srcBuf;
                int i2 = this.srcPos;
                this.srcPos = i2 + 1;
                c = cArr[i2];
            } else {
                this.srcCount = this.reader.read(this.srcBuf, 0, this.srcBuf.length);
                char c2 = this.srcCount <= 0 ? (char) 65535 : this.srcBuf[0];
                this.srcPos = 1;
                c = c2;
            }
            if (c == '\r') {
                this.wasCR = true;
                int[] iArr = this.peek;
                int i3 = this.peekCount;
                this.peekCount = i3 + 1;
                iArr[i3] = 10;
            } else {
                if (c != '\n') {
                    int[] iArr2 = this.peek;
                    int i4 = this.peekCount;
                    this.peekCount = i4 + 1;
                    iArr2[i4] = c;
                } else if (!this.wasCR) {
                    int[] iArr3 = this.peek;
                    int i5 = this.peekCount;
                    this.peekCount = i5 + 1;
                    iArr3[i5] = 10;
                }
                this.wasCR = false;
            }
        }
        return this.peek[i];
    }

    private final int peekType() throws IOException {
        switch (peek(0)) {
            case -1:
                return 1;
            case DateTimeParserConstants.COMMENT /* 38 */:
                return 6;
            case 60:
                switch (peek(1)) {
                    case AddressListParserConstants.ANY /* 33 */:
                    case 63:
                        return LEGACY;
                    case DateTimeParserConstants.QUOTEDPAIR /* 47 */:
                        return 3;
                    default:
                        return 2;
                }
            default:
                return 4;
        }
    }

    private final void push(int i) {
        this.isWhitespace = (i <= 32) & this.isWhitespace;
        if (this.txtPos == this.txtBuf.length) {
            char[] cArr = new char[((this.txtPos * 4) / 3) + 4];
            System.arraycopy(this.txtBuf, 0, cArr, 0, this.txtPos);
            this.txtBuf = cArr;
        }
        char[] cArr2 = this.txtBuf;
        int i2 = this.txtPos;
        this.txtPos = i2 + 1;
        cArr2[i2] = (char) i;
    }

    private final void pushEntity() throws IOException, XmlPullParserException {
        boolean z = true;
        push(read());
        int i = this.txtPos;
        while (true) {
            int read = read();
            if (read == 59) {
                String str = get(i);
                this.txtPos = i - 1;
                if (this.token && this.type == 6) {
                    this.name = str;
                }
                if (str.charAt(0) == '#') {
                    push(str.charAt(1) == 'x' ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str.substring(1)));
                    return;
                }
                String str2 = (String) this.entityMap.get(str);
                if (str2 != null) {
                    z = false;
                }
                this.unresolved = z;
                if (this.unresolved) {
                    if (this.token) {
                        return;
                    }
                    error(new StringBuffer().append("unresolved: &").append(str).append(";").toString());
                    return;
                }
                for (int i2 = 0; i2 < str2.length(); i2++) {
                    push(str2.charAt(i2));
                }
                return;
            } else if (read < 128 && ((read < 48 || read > 57) && ((read < 97 || read > 122) && !((read >= 65 && read <= 90) || read == 95 || read == 45 || read == 35)))) {
                if (!this.relaxed) {
                    error("unterminated entity ref");
                }
                if (read == -1) {
                    return;
                }
                push(read);
                return;
            } else {
                push(read);
            }
        }
    }

    private final void pushText(int i, boolean z) throws IOException, XmlPullParserException {
        int peek = peek(0);
        int i2 = 0;
        while (peek != -1 && peek != i) {
            if (i == 32 && (peek <= 32 || peek == 62)) {
                return;
            }
            if (peek == 38) {
                if (!z) {
                    return;
                }
                pushEntity();
            } else if (peek == 10 && this.type == 2) {
                read();
                push(32);
            } else {
                push(read());
            }
            if (peek == 62 && i2 >= 2 && i != 93) {
                error("Illegal: ]]>");
            }
            i2 = peek == 93 ? i2 + 1 : 0;
            peek = peek(0);
        }
    }

    private final int read() throws IOException {
        int i;
        if (this.peekCount == 0) {
            i = peek(0);
        } else {
            i = this.peek[0];
            this.peek[0] = this.peek[1];
        }
        this.peekCount--;
        this.column++;
        if (i == 10) {
            this.line++;
            this.column = 1;
        }
        return i;
    }

    private final void read(char c) throws IOException, XmlPullParserException {
        int read = read();
        if (read != c) {
            error(new StringBuffer().append("expected: '").append(c).append("' actual: '").append((char) read).append("'").toString());
        }
    }

    private final String readName() throws IOException, XmlPullParserException {
        int i = this.txtPos;
        int peek = peek(0);
        if ((peek < 97 || peek > 122) && ((peek < 65 || peek > 90) && peek != 95 && peek != 58 && peek < 192 && !this.relaxed)) {
            error("name expected");
        }
        while (true) {
            push(read());
            int peek2 = peek(0);
            if (peek2 < 97 || peek2 > 122) {
                if (peek2 < 65 || peek2 > 90) {
                    if (peek2 < 48 || peek2 > 57) {
                        if (peek2 != 95 && peek2 != 45 && peek2 != 58 && peek2 != 46 && peek2 < 183) {
                            String str = get(i);
                            this.txtPos = i;
                            return str;
                        }
                    }
                }
            }
        }
    }

    private final void skip() throws IOException {
        while (true) {
            int peek = peek(0);
            if (peek > 32 || peek == -1) {
                return;
            }
            read();
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void defineEntityReplacementText(String str, String str2) throws XmlPullParserException {
        if (this.entityMap == null) {
            throw new RuntimeException("entity replacement text must be defined after setInput!");
        }
        this.entityMap.put(str, str2);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getAttributeCount() {
        return this.attributeCount;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributeName(int i) {
        if (i >= this.attributeCount) {
            throw new IndexOutOfBoundsException();
        }
        return this.attributes[(i << 2) + 2];
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributeNamespace(int i) {
        if (i >= this.attributeCount) {
            throw new IndexOutOfBoundsException();
        }
        return this.attributes[i << 2];
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributePrefix(int i) {
        if (i >= this.attributeCount) {
            throw new IndexOutOfBoundsException();
        }
        return this.attributes[(i << 2) + 1];
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributeType(int i) {
        return "CDATA";
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributeValue(int i) {
        if (i >= this.attributeCount) {
            throw new IndexOutOfBoundsException();
        }
        return this.attributes[(i << 2) + 3];
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributeValue(String str, String str2) {
        for (int i = (this.attributeCount << 2) - 4; i >= 0; i -= 4) {
            if (this.attributes[i + 2].equals(str2) && (str == null || this.attributes[i].equals(str))) {
                return this.attributes[i + 3];
            }
        }
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getColumnNumber() {
        return this.column;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getDepth() {
        return this.depth;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getEventType() throws XmlPullParserException {
        return this.type;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean getFeature(String str) {
        if (XmlPullParser.FEATURE_PROCESS_NAMESPACES.equals(str)) {
            return this.processNsp;
        }
        if (!isProp(str, false, "relaxed")) {
            return false;
        }
        return this.relaxed;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getInputEncoding() {
        return this.encoding;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getLineNumber() {
        return this.line;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getName() {
        return this.name;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespace() {
        return this.namespace;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespace(String str) {
        if ("xml".equals(str)) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        if ("xmlns".equals(str)) {
            return "http://www.w3.org/2000/xmlns/";
        }
        for (int namespaceCount = (getNamespaceCount(this.depth) << 1) - 2; namespaceCount >= 0; namespaceCount -= 2) {
            if (str == null) {
                if (this.nspStack[namespaceCount] == null) {
                    return this.nspStack[namespaceCount + 1];
                }
            } else if (str.equals(this.nspStack[namespaceCount])) {
                return this.nspStack[namespaceCount + 1];
            }
        }
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getNamespaceCount(int i) {
        if (i > this.depth) {
            throw new IndexOutOfBoundsException();
        }
        return this.nspCounts[i];
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespacePrefix(int i) {
        return this.nspStack[i << 1];
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespaceUri(int i) {
        return this.nspStack[(i << 1) + 1];
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getPositionDescription() {
        StringBuffer stringBuffer = new StringBuffer(this.type < XmlPullParser.TYPES.length ? XmlPullParser.TYPES[this.type] : "unknown");
        stringBuffer.append(' ');
        if (this.type == 2 || this.type == 3) {
            if (this.degenerated) {
                stringBuffer.append("(empty) ");
            }
            stringBuffer.append('<');
            if (this.type == 3) {
                stringBuffer.append('/');
            }
            if (this.prefix != null) {
                stringBuffer.append(new StringBuffer().append("{").append(this.namespace).append("}").append(this.prefix).append(":").toString());
            }
            stringBuffer.append(this.name);
            int i = this.attributeCount << 2;
            for (int i2 = 0; i2 < i; i2 += 4) {
                stringBuffer.append(' ');
                if (this.attributes[i2 + 1] != null) {
                    stringBuffer.append(new StringBuffer().append("{").append(this.attributes[i2]).append("}").append(this.attributes[i2 + 1]).append(":").toString());
                }
                stringBuffer.append(new StringBuffer().append(this.attributes[i2 + 2]).append("='").append(this.attributes[i2 + 3]).append("'").toString());
            }
            stringBuffer.append('>');
        } else if (this.type != 7) {
            if (this.type != 4) {
                stringBuffer.append(getText());
            } else if (this.isWhitespace) {
                stringBuffer.append("(whitespace)");
            } else {
                String text = getText();
                if (text.length() > 16) {
                    text = new StringBuffer().append(text.substring(0, 16)).append("...").toString();
                }
                stringBuffer.append(text);
            }
        }
        stringBuffer.append(new StringBuffer().append("@").append(this.line).append(":").append(this.column).toString());
        if (this.location != null) {
            stringBuffer.append(" in ");
            stringBuffer.append(this.location);
        } else if (this.reader != null) {
            stringBuffer.append(" in ");
            stringBuffer.append(this.reader.toString());
        }
        return stringBuffer.toString();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getPrefix() {
        return this.prefix;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public Object getProperty(String str) {
        if (isProp(str, true, "xmldecl-version")) {
            return this.version;
        }
        if (isProp(str, true, "xmldecl-standalone")) {
            return this.standalone;
        }
        if (!isProp(str, true, "location")) {
            return null;
        }
        return this.location != null ? this.location : this.reader.toString();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getText() {
        if (this.type < 4 || (this.type == 6 && this.unresolved)) {
            return null;
        }
        return get(0);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public char[] getTextCharacters(int[] iArr) {
        if (this.type < 4) {
            iArr[0] = -1;
            iArr[1] = -1;
            return null;
        } else if (this.type == 6) {
            iArr[0] = 0;
            iArr[1] = this.name.length();
            return this.name.toCharArray();
        } else {
            iArr[0] = 0;
            iArr[1] = this.txtPos;
            return this.txtBuf;
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean isAttributeDefault(int i) {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean isEmptyElementTag() throws XmlPullParserException {
        if (this.type != 2) {
            exception(ILLEGAL_TYPE);
        }
        return this.degenerated;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean isWhitespace() throws XmlPullParserException {
        if (this.type != 4 && this.type != 7 && this.type != 5) {
            exception(ILLEGAL_TYPE);
        }
        return this.isWhitespace;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int next() throws XmlPullParserException, IOException {
        this.txtPos = 0;
        this.isWhitespace = true;
        int i = 9999;
        this.token = false;
        while (true) {
            nextImpl();
            if (this.type < i) {
                i = this.type;
            }
            if (i > 6 || (i >= 4 && peekType() >= 4)) {
            }
        }
        this.type = i;
        if (this.type > 4) {
            this.type = 4;
        }
        return this.type;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int nextTag() throws XmlPullParserException, IOException {
        next();
        if (this.type == 4 && this.isWhitespace) {
            next();
        }
        if (this.type != 3 && this.type != 2) {
            exception("unexpected type");
        }
        return this.type;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String nextText() throws XmlPullParserException, IOException {
        String str;
        if (this.type != 2) {
            exception("precondition: START_TAG");
        }
        next();
        if (this.type == 4) {
            str = getText();
            next();
        } else {
            str = "";
        }
        if (this.type != 3) {
            exception("END_TAG expected");
        }
        return str;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int nextToken() throws XmlPullParserException, IOException {
        this.isWhitespace = true;
        this.txtPos = 0;
        this.token = true;
        nextImpl();
        return this.type;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void require(int i, String str, String str2) throws XmlPullParserException, IOException {
        if (i != this.type || ((str != null && !str.equals(getNamespace())) || (str2 != null && !str2.equals(getName())))) {
            exception(new StringBuffer().append("expected: ").append(XmlPullParser.TYPES[i]).append(" {").append(str).append("}").append(str2).toString());
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setFeature(String str, boolean z) throws XmlPullParserException {
        if (XmlPullParser.FEATURE_PROCESS_NAMESPACES.equals(str)) {
            this.processNsp = z;
        } else if (isProp(str, false, "relaxed")) {
            this.relaxed = z;
        } else {
            exception(new StringBuffer().append("unsupported feature: ").append(str).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c A[Catch: Exception -> 0x006d, TryCatch #0 {Exception -> 0x006d, blocks: (B:8:0x0011, B:10:0x0016, B:12:0x001c, B:14:0x0021, B:16:0x0025, B:18:0x002c, B:21:0x0048, B:23:0x0057, B:24:0x0067, B:28:0x008b, B:29:0x0091, B:30:0x009e, B:31:0x00ab, B:32:0x00bf, B:33:0x00d4, B:36:0x00dd, B:38:0x00ec, B:40:0x00fe, B:42:0x0106, B:44:0x010e, B:45:0x0111, B:46:0x0121, B:48:0x0128, B:49:0x0142, B:51:0x0149), top: B:53:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0121 A[Catch: Exception -> 0x006d, TryCatch #0 {Exception -> 0x006d, blocks: (B:8:0x0011, B:10:0x0016, B:12:0x001c, B:14:0x0021, B:16:0x0025, B:18:0x002c, B:21:0x0048, B:23:0x0057, B:24:0x0067, B:28:0x008b, B:29:0x0091, B:30:0x009e, B:31:0x00ab, B:32:0x00bf, B:33:0x00d4, B:36:0x00dd, B:38:0x00ec, B:40:0x00fe, B:42:0x0106, B:44:0x010e, B:45:0x0111, B:46:0x0121, B:48:0x0128, B:49:0x0142, B:51:0x0149), top: B:53:0x0011 }] */
    @Override // org.xmlpull.v1.XmlPullParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setInput(java.io.InputStream r7, java.lang.String r8) throws org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.kxml2.io.KXmlParser.setInput(java.io.InputStream, java.lang.String):void");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setInput(Reader reader) throws XmlPullParserException {
        this.reader = reader;
        this.line = 1;
        this.column = 0;
        this.type = 0;
        this.name = null;
        this.namespace = null;
        this.degenerated = false;
        this.attributeCount = -1;
        this.encoding = null;
        this.version = null;
        this.standalone = null;
        if (reader == null) {
            return;
        }
        this.srcPos = 0;
        this.srcCount = 0;
        this.peekCount = 0;
        this.depth = 0;
        this.entityMap = new Hashtable();
        this.entityMap.put("amp", "&");
        this.entityMap.put("apos", "'");
        this.entityMap.put("gt", ">");
        this.entityMap.put("lt", "<");
        this.entityMap.put("quot", "\"");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setProperty(String str, Object obj) throws XmlPullParserException {
        if (isProp(str, true, "location")) {
            this.location = obj;
            return;
        }
        throw new XmlPullParserException(new StringBuffer().append("unsupported property: ").append(str).toString());
    }

    public void skipSubTree() throws XmlPullParserException, IOException {
        require(2, null, null);
        int i = 1;
        while (i > 0) {
            int next = next();
            if (next == 3) {
                i--;
            } else if (next == 2) {
                i++;
            }
        }
    }
}
