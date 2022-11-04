package org.javarosa.xform.parse;

import org.kxml2.kdom.Element;
/* loaded from: classes.dex */
public class XFormParseException extends RuntimeException {
    Element element;

    public XFormParseException() {
    }

    public XFormParseException(String str) {
        super(str);
        this.element = null;
    }

    public XFormParseException(String str, Element element) {
        super(str);
        this.element = element;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.element == null ? super.getMessage() : super.getMessage() + XFormParser.getVagueLocation(this.element);
    }
}
