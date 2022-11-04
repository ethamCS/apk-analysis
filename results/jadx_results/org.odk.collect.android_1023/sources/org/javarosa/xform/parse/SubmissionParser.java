package org.javarosa.xform.parse;

import java.util.Hashtable;
import org.javarosa.core.model.IDataReference;
import org.javarosa.core.model.SubmissionProfile;
import org.kxml2.kdom.Element;
/* loaded from: classes.dex */
public class SubmissionParser {
    public SubmissionProfile parseSubmission(String str, String str2, IDataReference iDataReference, Element element) {
        String attributeValue = element.getAttributeValue(null, "mediatype");
        Hashtable hashtable = new Hashtable();
        int attributeCount = element.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = element.getAttributeName(i);
            if (!attributeName.equals("ref") && !attributeName.equals("bind") && !attributeName.equals("method") && !attributeName.equals("action")) {
                hashtable.put(attributeName, element.getAttributeValue(i));
            }
        }
        return new SubmissionProfile(iDataReference, str, str2, attributeValue, hashtable);
    }

    public boolean matchesCustomMethod(String str) {
        return false;
    }
}
