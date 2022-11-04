package org.kxml2.kdom;

import java.io.IOException;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
/* loaded from: classes.dex */
public class Element extends Node {
    protected Vector attributes;
    protected String name;
    protected String namespace;
    protected Node parent;
    protected Vector prefixes;

    public void clear() {
        this.attributes = null;
        this.children = null;
    }

    @Override // org.kxml2.kdom.Node
    public Element createElement(String str, String str2) {
        return this.parent == null ? super.createElement(str, str2) : this.parent.createElement(str, str2);
    }

    public int getAttributeCount() {
        if (this.attributes == null) {
            return 0;
        }
        return this.attributes.size();
    }

    public String getAttributeName(int i) {
        return ((String[]) this.attributes.elementAt(i))[1];
    }

    public String getAttributeNamespace(int i) {
        return ((String[]) this.attributes.elementAt(i))[0];
    }

    public String getAttributeValue(int i) {
        return ((String[]) this.attributes.elementAt(i))[2];
    }

    public String getAttributeValue(String str, String str2) {
        for (int i = 0; i < getAttributeCount(); i++) {
            if (str2.equals(getAttributeName(i)) && (str == null || str.equals(getAttributeNamespace(i)))) {
                return getAttributeValue(i);
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public int getNamespaceCount() {
        if (this.prefixes == null) {
            return 0;
        }
        return this.prefixes.size();
    }

    public String getNamespacePrefix(int i) {
        return ((String[]) this.prefixes.elementAt(i))[0];
    }

    public String getNamespaceUri(int i) {
        return ((String[]) this.prefixes.elementAt(i))[1];
    }

    public String getNamespaceUri(String str) {
        int namespaceCount = getNamespaceCount();
        for (int i = 0; i < namespaceCount; i++) {
            if (str == getNamespacePrefix(i) || (str != null && str.equals(getNamespacePrefix(i)))) {
                return getNamespaceUri(i);
            }
        }
        if (this.parent instanceof Element) {
            return ((Element) this.parent).getNamespaceUri(str);
        }
        return null;
    }

    public Node getParent() {
        return this.parent;
    }

    public Node getRoot() {
        while (this.parent != null) {
            if (!(this.parent instanceof Element)) {
                return this.parent;
            }
            this = (Element) this.parent;
        }
        return this;
    }

    public void init() {
    }

    @Override // org.kxml2.kdom.Node
    public void parse(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        for (int namespaceCount = xmlPullParser.getNamespaceCount(xmlPullParser.getDepth() - 1); namespaceCount < xmlPullParser.getNamespaceCount(xmlPullParser.getDepth()); namespaceCount++) {
            setPrefix(xmlPullParser.getNamespacePrefix(namespaceCount), xmlPullParser.getNamespaceUri(namespaceCount));
        }
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            setAttribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
        }
        init();
        if (xmlPullParser.isEmptyElementTag()) {
            xmlPullParser.nextToken();
        } else {
            xmlPullParser.nextToken();
            super.parse(xmlPullParser);
            if (getChildCount() == 0) {
                addChild(7, "");
            }
        }
        xmlPullParser.require(3, getNamespace(), getName());
        xmlPullParser.nextToken();
    }

    public void setAttribute(String str, String str2, String str3) {
        if (this.attributes == null) {
            this.attributes = new Vector();
        }
        if (str == null) {
            str = "";
        }
        for (int size = this.attributes.size() - 1; size >= 0; size--) {
            String[] strArr = (String[]) this.attributes.elementAt(size);
            if (strArr[0].equals(str) && strArr[1].equals(str2)) {
                if (str3 == null) {
                    this.attributes.removeElementAt(size);
                    return;
                } else {
                    strArr[2] = str3;
                    return;
                }
            }
        }
        this.attributes.addElement(new String[]{str, str2, str3});
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNamespace(String str) {
        if (str == null) {
            throw new NullPointerException("Use \"\" for empty namespace");
        }
        this.namespace = str;
    }

    public void setParent(Node node) {
        this.parent = node;
    }

    public void setPrefix(String str, String str2) {
        if (this.prefixes == null) {
            this.prefixes = new Vector();
        }
        this.prefixes.addElement(new String[]{str, str2});
    }

    @Override // org.kxml2.kdom.Node
    public void write(XmlSerializer xmlSerializer) throws IOException {
        if (this.prefixes != null) {
            for (int i = 0; i < this.prefixes.size(); i++) {
                xmlSerializer.setPrefix(getNamespacePrefix(i), getNamespaceUri(i));
            }
        }
        xmlSerializer.startTag(getNamespace(), getName());
        int attributeCount = getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            xmlSerializer.attribute(getAttributeNamespace(i2), getAttributeName(i2), getAttributeValue(i2));
        }
        writeChildren(xmlSerializer);
        xmlSerializer.endTag(getNamespace(), getName());
    }
}
