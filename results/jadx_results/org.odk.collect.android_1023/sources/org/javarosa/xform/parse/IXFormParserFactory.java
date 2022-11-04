package org.javarosa.xform.parse;

import java.io.Reader;
import org.kxml2.kdom.Document;
/* loaded from: classes.dex */
public interface IXFormParserFactory {
    XFormParser getXFormParser(Reader reader);

    XFormParser getXFormParser(Reader reader, Reader reader2);

    XFormParser getXFormParser(Document document);

    XFormParser getXFormParser(Document document, Document document2);
}
