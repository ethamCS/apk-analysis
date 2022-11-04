package org.javarosa.core.services;

import java.util.Vector;
import org.javarosa.core.services.properties.IPropertyRules;
/* loaded from: classes.dex */
public interface IPropertyManager {
    void addRules(IPropertyRules iPropertyRules);

    Vector getProperty(String str);

    Vector getRules();

    String getSingularProperty(String str);

    void setProperty(String str, String str2);

    void setProperty(String str, Vector vector);
}
