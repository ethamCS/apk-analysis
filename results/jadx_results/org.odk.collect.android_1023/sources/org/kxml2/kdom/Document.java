package org.kxml2.kdom;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
/* loaded from: classes.dex */
public class Document extends Node {
    String encoding;
    protected int rootIndex = -1;
    Boolean standalone;

    @Override // org.kxml2.kdom.Node
    public void addChild(int i, int i2, Object obj) {
        if (i2 == 2) {
            this.rootIndex = i;
        } else if (this.rootIndex >= i) {
            this.rootIndex++;
        }
        super.addChild(i, i2, obj);
    }

    public String getEncoding() {
        return this.encoding;
    }

    public String getName() {
        return "#document";
    }

    public Element getRootElement() {
        if (this.rootIndex == -1) {
            throw new RuntimeException("Document has no root element!");
        }
        return (Element) getChild(this.rootIndex);
    }

    public Boolean getStandalone() {
        return this.standalone;
    }

    @Override // org.kxml2.kdom.Node
    public void parse(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        xmlPullParser.require(0, null, null);
        xmlPullParser.nextToken();
        this.encoding = xmlPullParser.getInputEncoding();
        this.standalone = (Boolean) xmlPullParser.getProperty("http://xmlpull.org/v1/doc/properties.html#xmldecl-standalone");
        super.parse(xmlPullParser);
        if (xmlPullParser.getEventType() != 1) {
            throw new RuntimeException("Document end expected!");
        }
    }

    @Override // org.kxml2.kdom.Node
    public void removeChild(int i) {
        if (i == this.rootIndex) {
            this.rootIndex = -1;
        } else if (i < this.rootIndex) {
            this.rootIndex--;
        }
        super.removeChild(i);
    }

    public void setEncoding(String str) {
        this.encoding = str;
    }

    public void setStandalone(Boolean bool) {
        this.standalone = bool;
    }

    @Override // org.kxml2.kdom.Node
    public void write(XmlSerializer xmlSerializer) throws IOException {
        xmlSerializer.startDocument(this.encoding, this.standalone);
        writeChildren(xmlSerializer);
        xmlSerializer.endDocument();
    }
}
