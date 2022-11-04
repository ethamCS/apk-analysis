package org.javarosa.xpath;
/* loaded from: classes.dex */
public class XPathTypeMismatchException extends XPathException {
    public XPathTypeMismatchException() {
    }

    public XPathTypeMismatchException(String str) {
        super("type mismatch " + str);
    }
}
