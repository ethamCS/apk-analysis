package org.kxml2.wap;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.Vector;
import me.regexp.RECharacter;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class WbxmlParser implements XmlPullParser {
    static final String HEX_DIGITS = "0123456789abcdef";
    private static final String ILLEGAL_TYPE = "Wrong event type";
    private static final String UNEXPECTED_EOF = "Unexpected EOF";
    public static final int WAP_EXTENSION = 64;
    private String[] attrStartTable;
    private String[] attrValueTable;
    private int attributeCount;
    private boolean degenerated;
    private int depth;
    private String encoding;
    private InputStream in;
    private boolean isWhitespace;
    private String name;
    private String namespace;
    private String prefix;
    private boolean processNsp;
    private int publicIdentifierId;
    private byte[] stringTable;
    private String[] tagTable;
    private String text;
    private int type;
    private int version;
    private int wapCode;
    private Object wapExtensionData;
    private int TAG_TABLE = 0;
    private int ATTR_START_TABLE = 1;
    private int ATTR_VALUE_TABLE = 2;
    private Hashtable cacheStringTable = null;
    private String[] elementStack = new String[16];
    private String[] nspStack = new String[8];
    private int[] nspCounts = new int[4];
    private String[] attributes = new String[16];
    private int nextId = -2;
    private Vector tables = new Vector();

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
                    exception("illegal empty namespace");
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
                if (indexOf2 == 0) {
                    throw new RuntimeException(new StringBuffer().append("illegal attribute name: ").append(str4).append(" at ").append(this).toString());
                }
                if (indexOf2 != -1) {
                    String substring = str4.substring(0, indexOf2);
                    String substring2 = str4.substring(indexOf2 + 1);
                    String namespace = getNamespace(substring);
                    if (namespace == null) {
                        throw new RuntimeException(new StringBuffer().append("Undefined Prefix: ").append(substring).append(" in ").append(this).toString());
                    }
                    this.attributes[i6] = namespace;
                    this.attributes[i6 + 1] = substring;
                    this.attributes[i6 + 2] = substring2;
                    for (int i7 = (this.attributeCount << 2) - 4; i7 > i6; i7 -= 4) {
                        if (substring2.equals(this.attributes[i7 + 2]) && namespace.equals(this.attributes[i7])) {
                            exception(new StringBuffer().append("Duplicate Attribute: {").append(namespace).append("}").append(substring2).toString());
                        }
                    }
                }
            }
        }
        int indexOf3 = this.name.indexOf(58);
        if (indexOf3 == 0) {
            exception(new StringBuffer().append("illegal tag name: ").append(this.name).toString());
        } else if (indexOf3 != -1) {
            this.prefix = this.name.substring(0, indexOf3);
            this.name = this.name.substring(indexOf3 + 1);
        }
        this.namespace = getNamespace(this.prefix);
        if (this.namespace == null) {
            if (this.prefix != null) {
                exception(new StringBuffer().append("undefined prefix: ").append(this.prefix).toString());
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

    private final void exception(String str) throws XmlPullParserException {
        throw new XmlPullParserException(str, this, null);
    }

    private final void nextImpl() throws IOException, XmlPullParserException {
        if (this.type == 3) {
            this.depth--;
        }
        if (this.degenerated) {
            this.type = 3;
            this.degenerated = false;
            return;
        }
        this.text = null;
        this.prefix = null;
        this.name = null;
        int peekId = peekId();
        while (peekId == 0) {
            this.nextId = -2;
            selectPage(readByte(), true);
            peekId = peekId();
        }
        this.nextId = -2;
        switch (peekId) {
            case -1:
                this.type = 1;
                return;
            case 1:
                int i = (this.depth - 1) << 2;
                this.type = 3;
                this.namespace = this.elementStack[i];
                this.prefix = this.elementStack[i + 1];
                this.name = this.elementStack[i + 2];
                return;
            case 2:
                this.type = 6;
                char readInt = (char) readInt();
                this.text = new StringBuffer().append("").append(readInt).toString();
                this.name = new StringBuffer().append("#").append((int) readInt).toString();
                return;
            case 3:
                this.type = 4;
                this.text = readStrI();
                return;
            case 64:
            case Wbxml.EXT_I_1 /* 65 */:
            case Wbxml.EXT_I_2 /* 66 */:
            case Wbxml.EXT_T_0 /* 128 */:
            case Wbxml.EXT_T_1 /* 129 */:
            case Wbxml.EXT_T_2 /* 130 */:
            case Wbxml.EXT_0 /* 192 */:
            case Wbxml.EXT_1 /* 193 */:
            case Wbxml.EXT_2 /* 194 */:
            case Wbxml.OPAQUE /* 195 */:
                this.type = 64;
                this.wapCode = peekId;
                this.wapExtensionData = parseWapExtension(peekId);
                return;
            case Wbxml.PI /* 67 */:
                throw new RuntimeException("PI curr. not supp.");
            case Wbxml.STR_T /* 131 */:
                this.type = 4;
                this.text = readStrT();
                return;
            default:
                parseElement(peekId);
                return;
        }
    }

    private int peekId() throws IOException {
        if (this.nextId == -2) {
            this.nextId = this.in.read();
        }
        return this.nextId;
    }

    private void selectPage(int i, boolean z) throws XmlPullParserException {
        if (this.tables.size() == 0 && i == 0) {
            return;
        }
        if (i * 3 > this.tables.size()) {
            exception(new StringBuffer().append("Code Page ").append(i).append(" undefined!").toString());
        }
        if (z) {
            this.tagTable = (String[]) this.tables.elementAt((i * 3) + this.TAG_TABLE);
            return;
        }
        this.attrStartTable = (String[]) this.tables.elementAt((i * 3) + this.ATTR_START_TABLE);
        this.attrValueTable = (String[]) this.tables.elementAt((i * 3) + this.ATTR_VALUE_TABLE);
    }

    private final void setTable(int i, int i2, String[] strArr) {
        if (this.stringTable != null) {
            throw new RuntimeException("setXxxTable must be called before setInput!");
        }
        while (this.tables.size() < (i * 3) + 3) {
            this.tables.addElement(null);
        }
        this.tables.setElementAt(strArr, (i * 3) + i2);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void defineEntityReplacementText(String str, String str2) throws XmlPullParserException {
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
        return -1;
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
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getInputEncoding() {
        return this.encoding;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getLineNumber() {
        return -1;
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
        return stringBuffer.toString();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getPrefix() {
        return this.prefix;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public Object getProperty(String str) {
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getText() {
        return this.text;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public char[] getTextCharacters(int[] iArr) {
        if (this.type < 4) {
            iArr[0] = -1;
            iArr[1] = -1;
            return null;
        }
        iArr[0] = 0;
        iArr[1] = this.text.length();
        char[] cArr = new char[this.text.length()];
        this.text.getChars(0, this.text.length(), cArr, 0);
        return cArr;
    }

    public int getWapCode() {
        return this.wapCode;
    }

    public Object getWapExtensionData() {
        return this.wapExtensionData;
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
        this.isWhitespace = true;
        int i = 9999;
        while (true) {
            String str = this.text;
            nextImpl();
            if (this.type < i) {
                i = this.type;
            }
            if (i <= 5) {
                if (i >= 4) {
                    if (str != null) {
                        if (this.text != null) {
                            str = new StringBuffer().append(str).append(this.text).toString();
                        }
                        this.text = str;
                    }
                    switch (peekId()) {
                        case 2:
                        case 3:
                        case 4:
                        case Wbxml.LITERAL_C /* 68 */:
                        case Wbxml.STR_T /* 131 */:
                        case Wbxml.LITERAL_A /* 132 */:
                        case Wbxml.LITERAL_AC /* 196 */:
                            break;
                    }
                }
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
        nextImpl();
        return this.type;
    }

    void parseElement(int i) throws IOException, XmlPullParserException {
        this.type = 2;
        this.name = resolveId(this.tagTable, i & 63);
        this.attributeCount = 0;
        if ((i & Wbxml.EXT_T_0) != 0) {
            readAttr();
        }
        this.degenerated = (i & 64) == 0;
        int i2 = this.depth;
        this.depth = i2 + 1;
        int i3 = i2 << 2;
        this.elementStack = ensureCapacity(this.elementStack, i3 + 4);
        this.elementStack[i3 + 3] = this.name;
        if (this.depth >= this.nspCounts.length) {
            int[] iArr = new int[this.depth + 4];
            System.arraycopy(this.nspCounts, 0, iArr, 0, this.nspCounts.length);
            this.nspCounts = iArr;
        }
        this.nspCounts[this.depth] = this.nspCounts[this.depth - 1];
        for (int i4 = this.attributeCount - 1; i4 > 0; i4--) {
            for (int i5 = 0; i5 < i4; i5++) {
                if (getAttributeName(i4).equals(getAttributeName(i5))) {
                    exception(new StringBuffer().append("Duplicate Attribute: ").append(getAttributeName(i4)).toString());
                }
            }
        }
        if (this.processNsp) {
            adjustNsp();
        } else {
            this.namespace = "";
        }
        this.elementStack[i3] = this.namespace;
        this.elementStack[i3 + 1] = this.prefix;
        this.elementStack[i3 + 2] = this.name;
    }

    public Object parseWapExtension(int i) throws IOException, XmlPullParserException {
        switch (i) {
            case 64:
            case Wbxml.EXT_I_1 /* 65 */:
            case Wbxml.EXT_I_2 /* 66 */:
                return readStrI();
            case Wbxml.EXT_T_0 /* 128 */:
            case Wbxml.EXT_T_1 /* 129 */:
            case Wbxml.EXT_T_2 /* 130 */:
                return new Integer(readInt());
            case Wbxml.EXT_0 /* 192 */:
            case Wbxml.EXT_1 /* 193 */:
            case Wbxml.EXT_2 /* 194 */:
                return null;
            case Wbxml.OPAQUE /* 195 */:
                int readInt = readInt();
                byte[] bArr = new byte[readInt];
                while (readInt > 0) {
                    readInt -= this.in.read(bArr, bArr.length - readInt, readInt);
                }
                return bArr;
            default:
                exception(new StringBuffer().append("illegal id: ").append(i).toString());
                return null;
        }
    }

    public void readAttr() throws IOException, XmlPullParserException {
        StringBuffer stringBuffer;
        int readByte = readByte();
        int i = 0;
        while (readByte != 1) {
            while (readByte == 0) {
                selectPage(readByte(), false);
                readByte = readByte();
            }
            String resolveId = resolveId(this.attrStartTable, readByte);
            int indexOf = resolveId.indexOf(61);
            if (indexOf == -1) {
                stringBuffer = new StringBuffer();
            } else {
                stringBuffer = new StringBuffer(resolveId.substring(indexOf + 1));
                resolveId = resolveId.substring(0, indexOf);
            }
            int readByte2 = readByte();
            while (true) {
                if (readByte2 > 128 || readByte2 == 0 || readByte2 == 2 || readByte2 == 3 || readByte2 == 131 || ((readByte2 >= 64 && readByte2 <= 66) || (readByte2 >= 128 && readByte2 <= 130))) {
                    switch (readByte2) {
                        case 0:
                            selectPage(readByte(), false);
                            break;
                        case 2:
                            stringBuffer.append((char) readInt());
                            break;
                        case 3:
                            stringBuffer.append(readStrI());
                            break;
                        case 64:
                        case Wbxml.EXT_I_1 /* 65 */:
                        case Wbxml.EXT_I_2 /* 66 */:
                        case Wbxml.EXT_T_0 /* 128 */:
                        case Wbxml.EXT_T_1 /* 129 */:
                        case Wbxml.EXT_T_2 /* 130 */:
                        case Wbxml.EXT_0 /* 192 */:
                        case Wbxml.EXT_1 /* 193 */:
                        case Wbxml.EXT_2 /* 194 */:
                        case Wbxml.OPAQUE /* 195 */:
                            stringBuffer.append(resolveWapExtension(readByte2, parseWapExtension(readByte2)));
                            break;
                        case Wbxml.STR_T /* 131 */:
                            stringBuffer.append(readStrT());
                            break;
                        default:
                            stringBuffer.append(resolveId(this.attrValueTable, readByte2));
                            break;
                    }
                    readByte2 = readByte();
                }
            }
            this.attributes = ensureCapacity(this.attributes, i + 4);
            int i2 = i + 1;
            this.attributes[i] = "";
            int i3 = i2 + 1;
            this.attributes[i2] = null;
            int i4 = i3 + 1;
            this.attributes[i3] = resolveId;
            this.attributes[i4] = stringBuffer.toString();
            this.attributeCount++;
            i = i4 + 1;
            readByte = readByte2;
        }
    }

    int readByte() throws IOException {
        int read = this.in.read();
        if (read == -1) {
            throw new IOException(UNEXPECTED_EOF);
        }
        return read;
    }

    int readInt() throws IOException {
        int readByte;
        int i = 0;
        do {
            readByte = readByte();
            i = (i << 7) | (readByte & 127);
        } while ((readByte & Wbxml.EXT_T_0) != 0);
        return i;
    }

    String readStrI() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z = true;
        while (true) {
            int read = this.in.read();
            if (read == 0) {
                this.isWhitespace = z;
                String str = new String(byteArrayOutputStream.toByteArray(), this.encoding);
                byteArrayOutputStream.close();
                return str;
            } else if (read == -1) {
                throw new IOException(UNEXPECTED_EOF);
            } else {
                if (read > 32) {
                    z = false;
                }
                byteArrayOutputStream.write(read);
            }
        }
    }

    String readStrT() throws IOException {
        int readInt = readInt();
        if (this.cacheStringTable == null) {
            this.cacheStringTable = new Hashtable();
        }
        String str = (String) this.cacheStringTable.get(new Integer(readInt));
        if (str == null) {
            int i = readInt;
            while (i < this.stringTable.length && this.stringTable[i] != 0) {
                i++;
            }
            String str2 = new String(this.stringTable, readInt, i - readInt, this.encoding);
            this.cacheStringTable.put(new Integer(readInt), str2);
            return str2;
        }
        return str;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void require(int i, String str, String str2) throws XmlPullParserException, IOException {
        if (i != this.type || ((str != null && !str.equals(getNamespace())) || (str2 != null && !str2.equals(getName())))) {
            exception(new StringBuffer().append("expected: ").append(i == 64 ? "WAP Ext." : new StringBuffer().append(XmlPullParser.TYPES[i]).append(" {").append(str).append("}").append(str2).toString()).toString());
        }
    }

    String resolveId(String[] strArr, int i) throws IOException {
        int i2 = (i & 127) - 5;
        if (i2 == -1) {
            this.wapCode = -1;
            return readStrT();
        } else if (i2 < 0 || strArr == null || i2 >= strArr.length || strArr[i2] == null) {
            throw new IOException(new StringBuffer().append("id ").append(i).append(" undef.").toString());
        } else {
            this.wapCode = i2 + 5;
            return strArr[i2];
        }
    }

    protected String resolveWapExtension(int i, Object obj) {
        if (obj instanceof byte[]) {
            StringBuffer stringBuffer = new StringBuffer();
            byte[] bArr = (byte[]) obj;
            for (int i2 = 0; i2 < bArr.length; i2++) {
                stringBuffer.append(HEX_DIGITS.charAt((bArr[i2] >> 4) & 15));
                stringBuffer.append(HEX_DIGITS.charAt(bArr[i2] & RECharacter.CONTROL));
            }
            return stringBuffer.toString();
        }
        return new StringBuffer().append("$(").append(obj).append(")").toString();
    }

    public void setAttrStartTable(int i, String[] strArr) {
        setTable(i, this.ATTR_START_TABLE, strArr);
    }

    public void setAttrValueTable(int i, String[] strArr) {
        setTable(i, this.ATTR_VALUE_TABLE, strArr);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setFeature(String str, boolean z) throws XmlPullParserException {
        if (XmlPullParser.FEATURE_PROCESS_NAMESPACES.equals(str)) {
            this.processNsp = z;
        } else {
            exception(new StringBuffer().append("unsupported feature: ").append(str).toString());
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setInput(InputStream inputStream, String str) throws XmlPullParserException {
        int i = 0;
        this.in = inputStream;
        try {
            this.version = readByte();
            this.publicIdentifierId = readInt();
            if (this.publicIdentifierId == 0) {
                readInt();
            }
            int readInt = readInt();
            if (str == null) {
                switch (readInt) {
                    case 4:
                        this.encoding = "ISO-8859-1";
                        break;
                    case 106:
                        this.encoding = "UTF-8";
                        break;
                    default:
                        throw new UnsupportedEncodingException(new StringBuffer().append("").append(readInt).toString());
                }
            } else {
                this.encoding = str;
            }
            int readInt2 = readInt();
            this.stringTable = new byte[readInt2];
            while (i < readInt2) {
                int read = inputStream.read(this.stringTable, i, readInt2 - i);
                if (read <= 0) {
                    selectPage(0, true);
                    selectPage(0, false);
                }
                i += read;
            }
            selectPage(0, true);
            selectPage(0, false);
        } catch (IOException e) {
            exception("Illegal input format");
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setInput(Reader reader) throws XmlPullParserException {
        exception("InputStream required");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setProperty(String str, Object obj) throws XmlPullParserException {
        throw new XmlPullParserException(new StringBuffer().append("unsupported property: ").append(str).toString());
    }

    public void setTagTable(int i, String[] strArr) {
        setTable(i, this.TAG_TABLE, strArr);
    }
}
