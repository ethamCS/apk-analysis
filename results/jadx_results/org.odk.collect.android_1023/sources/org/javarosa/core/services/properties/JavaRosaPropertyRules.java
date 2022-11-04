package org.javarosa.core.services.properties;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.javarosa.core.services.PropertyManager;
import org.javarosa.core.services.locale.Localization;
import org.javarosa.core.services.locale.Localizer;
/* loaded from: classes.dex */
public class JavaRosaPropertyRules implements IPropertyRules {
    public static final String CURRENT_LOCALE = "cur_locale";
    public static final String DEVICE_ID_PROPERTY = "DeviceID";
    public static final String LOGS_ENABLED = "logenabled";
    public static final String LOGS_ENABLED_NO = "Disabled";
    public static final String LOGS_ENABLED_YES = "Enabled";
    public static final String OPENROSA_API_LEVEL = "jr_openrosa_api";
    Hashtable rules = new Hashtable();
    Vector readOnlyProperties = new Vector();

    public JavaRosaPropertyRules() {
        this.rules.put(DEVICE_ID_PROPERTY, new Vector());
        Vector vector = new Vector();
        vector.addElement(LOGS_ENABLED_NO);
        vector.addElement(LOGS_ENABLED_YES);
        this.rules.put(LOGS_ENABLED, vector);
        this.rules.put(CURRENT_LOCALE, new Vector());
        this.rules.put(OPENROSA_API_LEVEL, new Vector());
        this.readOnlyProperties.addElement(DEVICE_ID_PROPERTY);
        this.readOnlyProperties.addElement(OPENROSA_API_LEVEL);
    }

    @Override // org.javarosa.core.services.properties.IPropertyRules
    public Vector allowableValues(String str) {
        if (CURRENT_LOCALE.equals(str)) {
            Localizer globalLocalizerAdvanced = Localization.getGlobalLocalizerAdvanced();
            Vector vector = new Vector();
            String[] availableLocales = globalLocalizerAdvanced.getAvailableLocales();
            for (String str2 : availableLocales) {
                vector.addElement(str2);
            }
            return vector;
        }
        return (Vector) this.rules.get(str);
    }

    @Override // org.javarosa.core.services.properties.IPropertyRules
    public boolean checkValueAllowed(String str, String str2) {
        if (CURRENT_LOCALE.equals(str)) {
            return Localization.getGlobalLocalizerAdvanced().hasLocale(str2);
        }
        Vector vector = (Vector) this.rules.get(str);
        if (vector.size() == 0) {
            return true;
        }
        if (vector.size() == 1 && checkPropertyAllowed((String) vector.elementAt(0))) {
            return PropertyManager._().getProperty((String) vector.elementAt(0)).contains(str2);
        }
        return ((Vector) this.rules.get(str)).contains(str2);
    }

    @Override // org.javarosa.core.services.properties.IPropertyRules
    public Vector allowableProperties() {
        Vector vector = new Vector();
        Enumeration keys = this.rules.keys();
        while (keys.hasMoreElements()) {
            vector.addElement(keys.nextElement());
        }
        return vector;
    }

    @Override // org.javarosa.core.services.properties.IPropertyRules
    public boolean checkPropertyAllowed(String str) {
        Enumeration keys = this.rules.keys();
        while (keys.hasMoreElements()) {
            if (str.equals(keys.nextElement())) {
                return true;
            }
        }
        return false;
    }

    @Override // org.javarosa.core.services.properties.IPropertyRules
    public boolean checkPropertyUserReadOnly(String str) {
        return this.readOnlyProperties.contains(str);
    }

    @Override // org.javarosa.core.services.properties.IPropertyRules
    public String getHumanReadableDescription(String str) {
        if (DEVICE_ID_PROPERTY.equals(str)) {
            return "Unique Device ID";
        }
        if (LOGS_ENABLED.equals(str)) {
            return "Device Logging";
        }
        if (CURRENT_LOCALE.equals(str)) {
            return Localization.get("settings.language");
        }
        if (OPENROSA_API_LEVEL.equals(str)) {
            return "OpenRosa API Level";
        }
        return str;
    }

    @Override // org.javarosa.core.services.properties.IPropertyRules
    public String getHumanReadableValue(String str, String str2) {
        String text;
        return (!CURRENT_LOCALE.equals(str) || (text = Localization.getGlobalLocalizerAdvanced().getText(str2)) == null) ? str2 : text;
    }

    @Override // org.javarosa.core.services.properties.IPropertyRules
    public void handlePropertyChanges(String str) {
        if (CURRENT_LOCALE.equals(str)) {
            Localization.setLocale(PropertyManager._().getSingularProperty(str));
        }
    }
}
