package org.kxml2.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import org.apache.james.mime4j.field.datetime.parser.DateTimeParserConstants;
import org.apache.james.mime4j.util.CharsetUtil;
import org.xmlpull.v1.XmlSerializer;
/* loaded from: classes.dex */
public class KXmlSerializer implements XmlSerializer {
    private int auto;
    private int depth;
    private String encoding;
    private boolean pending;
    private boolean unicode;
    private Writer writer;
    private String[] elementStack = new String[12];
    private int[] nspCounts = new int[4];
    private String[] nspStack = new String[8];
    private boolean[] indent = new boolean[4];

    private final void check(boolean z) throws IOException {
        if (!this.pending) {
            return;
        }
        this.depth++;
        this.pending = false;
        if (this.indent.length <= this.depth) {
            boolean[] zArr = new boolean[this.depth + 4];
            System.arraycopy(this.indent, 0, zArr, 0, this.depth);
            this.indent = zArr;
        }
        this.indent[this.depth] = this.indent[this.depth - 1];
        for (int i = this.nspCounts[this.depth - 1]; i < this.nspCounts[this.depth]; i++) {
            this.writer.write(32);
            this.writer.write("xmlns");
            if (!"".equals(this.nspStack[i * 2])) {
                this.writer.write(58);
                this.writer.write(this.nspStack[i * 2]);
            } else if ("".equals(getNamespace()) && !"".equals(this.nspStack[(i * 2) + 1])) {
                throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
            }
            this.writer.write("=\"");
            writeEscaped(this.nspStack[(i * 2) + 1], 34);
            this.writer.write(34);
        }
        if (this.nspCounts.length <= this.depth + 1) {
            int[] iArr = new int[this.depth + 8];
            System.arraycopy(this.nspCounts, 0, iArr, 0, this.depth + 1);
            this.nspCounts = iArr;
        }
        this.nspCounts[this.depth + 1] = this.nspCounts[this.depth];
        this.writer.write(z ? " />" : ">");
    }

    private final String getPrefix(String str, boolean z, boolean z2) throws IOException {
        String stringBuffer;
        String str2;
        for (int i = (this.nspCounts[this.depth + 1] * 2) - 2; i >= 0; i -= 2) {
            if (this.nspStack[i + 1].equals(str) && (z || !this.nspStack[i].equals(""))) {
                String str3 = this.nspStack[i];
                int i2 = i + 2;
                while (true) {
                    if (i2 >= this.nspCounts[this.depth + 1] * 2) {
                        str2 = str3;
                        break;
                    } else if (this.nspStack[i2].equals(str3)) {
                        str2 = null;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (str2 != null) {
                    return str2;
                }
            }
        }
        if (!z2) {
            return null;
        }
        if ("".equals(str)) {
            stringBuffer = "";
        } else {
            do {
                StringBuffer append = new StringBuffer().append("n");
                int i3 = this.auto;
                this.auto = i3 + 1;
                stringBuffer = append.append(i3).toString();
                int i4 = (this.nspCounts[this.depth + 1] * 2) - 2;
                while (true) {
                    if (i4 < 0) {
                        break;
                    } else if (stringBuffer.equals(this.nspStack[i4])) {
                        stringBuffer = null;
                        continue;
                        break;
                    } else {
                        i4 -= 2;
                    }
                }
            } while (stringBuffer == null);
        }
        boolean z3 = this.pending;
        this.pending = false;
        setPrefix(stringBuffer, str);
        this.pending = z3;
        return stringBuffer;
    }

    private final void writeEscaped(String str, int i) throws IOException {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            switch (charAt) {
                case '\t':
                case '\n':
                case '\r':
                    if (i == -1) {
                        this.writer.write(charAt);
                        continue;
                    } else {
                        this.writer.write(new StringBuffer().append("&#").append((int) charAt).append(';').toString());
                    }
                case '\"':
                case '\'':
                    if (charAt == i) {
                        this.writer.write(charAt == '\"' ? "&quot;" : "&apos;");
                        continue;
                    }
                    break;
                case DateTimeParserConstants.COMMENT /* 38 */:
                    this.writer.write("&amp;");
                    continue;
                case '<':
                    this.writer.write("&lt;");
                    continue;
                case '>':
                    this.writer.write("&gt;");
                    continue;
            }
            if (charAt < ' ' || charAt == '@' || (charAt >= 127 && !this.unicode)) {
                this.writer.write(new StringBuffer().append("&#").append((int) charAt).append(";").toString());
            } else {
                this.writer.write(charAt);
            }
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer attribute(String str, String str2, String str3) throws IOException {
        if (!this.pending) {
            throw new IllegalStateException("illegal position for attribute");
        }
        if (str == null) {
            str = "";
        }
        String prefix = "".equals(str) ? "" : getPrefix(str, false, true);
        this.writer.write(32);
        if (!"".equals(prefix)) {
            this.writer.write(prefix);
            this.writer.write(58);
        }
        this.writer.write(str2);
        this.writer.write(61);
        int i = str3.indexOf(34) == -1 ? 34 : 39;
        this.writer.write(i);
        writeEscaped(str3, i);
        this.writer.write(i);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void cdsect(String str) throws IOException {
        check(false);
        this.writer.write("<![CDATA[");
        this.writer.write(str);
        this.writer.write("]]>");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void comment(String str) throws IOException {
        check(false);
        this.writer.write("<!--");
        this.writer.write(str);
        this.writer.write("-->");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void docdecl(String str) throws IOException {
        this.writer.write("<!DOCTYPE");
        this.writer.write(str);
        this.writer.write(">");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void endDocument() throws IOException {
        while (this.depth > 0) {
            endTag(this.elementStack[(this.depth * 3) - 3], this.elementStack[(this.depth * 3) - 1]);
        }
        flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer endTag(String str, String str2) throws IOException {
        if (!this.pending) {
            this.depth--;
        }
        if ((str != null || this.elementStack[this.depth * 3] == null) && ((str == null || str.equals(this.elementStack[this.depth * 3])) && this.elementStack[(this.depth * 3) + 2].equals(str2))) {
            if (this.pending) {
                check(true);
                this.depth--;
            } else {
                if (this.indent[this.depth + 1]) {
                    this.writer.write(CharsetUtil.CRLF);
                    for (int i = 0; i < this.depth; i++) {
                        this.writer.write("  ");
                    }
                }
                this.writer.write("</");
                String str3 = this.elementStack[(this.depth * 3) + 1];
                if (!"".equals(str3)) {
                    this.writer.write(str3);
                    this.writer.write(58);
                }
                this.writer.write(str2);
                this.writer.write(62);
            }
            this.nspCounts[this.depth + 1] = this.nspCounts[this.depth];
            return this;
        }
        throw new IllegalArgumentException(new StringBuffer().append("</{").append(str).append("}").append(str2).append("> does not match start").toString());
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void entityRef(String str) throws IOException {
        check(false);
        this.writer.write(38);
        this.writer.write(str);
        this.writer.write(59);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void flush() throws IOException {
        check(false);
        this.writer.flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public int getDepth() {
        return this.pending ? this.depth + 1 : this.depth;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public boolean getFeature(String str) {
        if ("http://xmlpull.org/v1/doc/features.html#indent-output".equals(str)) {
            return this.indent[this.depth];
        }
        return false;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getName() {
        if (getDepth() == 0) {
            return null;
        }
        return this.elementStack[(getDepth() * 3) - 1];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getNamespace() {
        if (getDepth() == 0) {
            return null;
        }
        return this.elementStack[(getDepth() * 3) - 3];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getPrefix(String str, boolean z) {
        try {
            return getPrefix(str, false, z);
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public Object getProperty(String str) {
        throw new RuntimeException("Unsupported property");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void ignorableWhitespace(String str) throws IOException {
        text(str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void processingInstruction(String str) throws IOException {
        check(false);
        this.writer.write("<?");
        this.writer.write(str);
        this.writer.write("?>");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setFeature(String str, boolean z) {
        if ("http://xmlpull.org/v1/doc/features.html#indent-output".equals(str)) {
            this.indent[this.depth] = z;
            return;
        }
        throw new RuntimeException("Unsupported Feature");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(OutputStream outputStream, String str) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException();
        }
        setOutput(str == null ? new OutputStreamWriter(outputStream) : new OutputStreamWriter(outputStream, str));
        this.encoding = str;
        if (str == null || !str.toLowerCase().startsWith("utf")) {
            return;
        }
        this.unicode = true;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(Writer writer) {
        this.writer = writer;
        this.nspCounts[0] = 2;
        this.nspCounts[1] = 2;
        this.nspStack[0] = "";
        this.nspStack[1] = "";
        this.nspStack[2] = "xml";
        this.nspStack[3] = "http://www.w3.org/XML/1998/namespace";
        this.pending = false;
        this.auto = 0;
        this.depth = 0;
        this.unicode = false;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setPrefix(String str, String str2) throws IOException {
        check(false);
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str.equals(getPrefix(str2, true, false))) {
            return;
        }
        int[] iArr = this.nspCounts;
        int i = this.depth + 1;
        int i2 = iArr[i];
        iArr[i] = i2 + 1;
        int i3 = i2 << 1;
        if (this.nspStack.length < i3 + 1) {
            String[] strArr = new String[this.nspStack.length + 16];
            System.arraycopy(this.nspStack, 0, strArr, 0, i3);
            this.nspStack = strArr;
        }
        this.nspStack[i3] = str;
        this.nspStack[i3 + 1] = str2;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setProperty(String str, Object obj) {
        throw new RuntimeException(new StringBuffer().append("Unsupported Property:").append(obj).toString());
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void startDocument(String str, Boolean bool) throws IOException {
        this.writer.write("<?xml version='1.0' ");
        if (str != null) {
            this.encoding = str;
            if (str.toLowerCase().startsWith("utf")) {
                this.unicode = true;
            }
        }
        if (this.encoding != null) {
            this.writer.write("encoding='");
            this.writer.write(this.encoding);
            this.writer.write("' ");
        }
        if (bool != null) {
            this.writer.write("standalone='");
            this.writer.write(bool.booleanValue() ? "yes" : "no");
            this.writer.write("' ");
        }
        this.writer.write("?>");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer startTag(String str, String str2) throws IOException {
        check(false);
        if (this.indent[this.depth]) {
            this.writer.write(CharsetUtil.CRLF);
            for (int i = 0; i < this.depth; i++) {
                this.writer.write("  ");
            }
        }
        int i2 = this.depth * 3;
        if (this.elementStack.length < i2 + 3) {
            String[] strArr = new String[this.elementStack.length + 12];
            System.arraycopy(this.elementStack, 0, strArr, 0, i2);
            this.elementStack = strArr;
        }
        String prefix = str == null ? "" : getPrefix(str, true, true);
        if ("".equals(str)) {
            for (int i3 = this.nspCounts[this.depth]; i3 < this.nspCounts[this.depth + 1]; i3++) {
                if ("".equals(this.nspStack[i3 * 2]) && !"".equals(this.nspStack[(i3 * 2) + 1])) {
                    throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                }
            }
        }
        int i4 = i2 + 1;
        this.elementStack[i2] = str;
        this.elementStack[i4] = prefix;
        this.elementStack[i4 + 1] = str2;
        this.writer.write(60);
        if (!"".equals(prefix)) {
            this.writer.write(prefix);
            this.writer.write(58);
        }
        this.writer.write(str2);
        this.pending = true;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(String str) throws IOException {
        check(false);
        this.indent[this.depth] = false;
        writeEscaped(str, -1);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(char[] cArr, int i, int i2) throws IOException {
        text(new String(cArr, i, i2));
        return this;
    }
}
