package org.javarosa.core.services.properties;

import java.util.Vector;
/* loaded from: classes.dex */
public interface IPropertyRules {
    Vector allowableProperties();

    Vector allowableValues(String str);

    boolean checkPropertyAllowed(String str);

    boolean checkPropertyUserReadOnly(String str);

    boolean checkValueAllowed(String str, String str2);

    String getHumanReadableDescription(String str);

    String getHumanReadableValue(String str, String str2);

    void handlePropertyChanges(String str);
}
