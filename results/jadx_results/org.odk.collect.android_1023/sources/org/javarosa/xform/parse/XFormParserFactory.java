package org.javarosa.xform.parse;

import java.io.Reader;
import org.kxml2.kdom.Document;
/* loaded from: classes.dex */
public class XFormParserFactory implements IXFormParserFactory {
    @Override // org.javarosa.xform.parse.IXFormParserFactory
    public XFormParser getXFormParser(Reader reader) {
        return new XFormParser(reader);
    }

    @Override // org.javarosa.xform.parse.IXFormParserFactory
    public XFormParser getXFormParser(Document document) {
        return new XFormParser(document);
    }

    @Override // org.javarosa.xform.parse.IXFormParserFactory
    public XFormParser getXFormParser(Reader reader, Reader reader2) {
        return new XFormParser(reader, reader2);
    }

    @Override // org.javarosa.xform.parse.IXFormParserFactory
    public XFormParser getXFormParser(Document document, Document document2) {
        return new XFormParser(document, document2);
    }
}
