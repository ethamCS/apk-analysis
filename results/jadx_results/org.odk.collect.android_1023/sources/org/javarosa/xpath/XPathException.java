package org.javarosa.xpath;
/* loaded from: classes.dex */
public class XPathException extends RuntimeException {
    public XPathException() {
    }

    public XPathException(String str) {
        super("XPath evaluation: " + str);
    }
}
