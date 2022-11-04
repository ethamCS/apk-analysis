package org.javarosa.xform.parse;

import org.kxml2.kdom.Element;
/* loaded from: classes.dex */
public interface IElementHandler {
    void handle(XFormParser xFormParser, Element element, Object obj);
}
