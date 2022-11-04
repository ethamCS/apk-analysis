package org.javarosa.xpath;
/* loaded from: classes.dex */
public class XPathUnhandledException extends XPathException {
    public XPathUnhandledException() {
    }

    public XPathUnhandledException(String str) {
        super("cannot handle " + str);
    }
}
