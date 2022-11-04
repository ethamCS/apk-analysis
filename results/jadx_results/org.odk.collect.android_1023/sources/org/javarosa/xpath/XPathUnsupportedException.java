package org.javarosa.xpath;
/* loaded from: classes.dex */
public class XPathUnsupportedException extends XPathException {
    public XPathUnsupportedException() {
    }

    public XPathUnsupportedException(String str) {
        super("unsupported construct [" + str + "]");
    }
}
