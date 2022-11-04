package org.javarosa.core.services;

import java.util.Enumeration;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.javarosa.core.services.properties.IPropertyRules;
import org.javarosa.core.services.properties.Property;
import org.javarosa.core.services.storage.IStorageUtilityIndexed;
import org.javarosa.core.services.storage.StorageFullException;
import org.javarosa.core.services.storage.StorageManager;
/* loaded from: classes.dex */
public class PropertyManager implements IPropertyManager {
    public static final String STORAGE_KEY = "PROPERTY";
    private static IPropertyManager instance;
    private IStorageUtilityIndexed properties = (IStorageUtilityIndexed) StorageManager.getStorage(STORAGE_KEY);
    private Vector rulesList = new Vector();

    public static void setPropertyManager(IPropertyManager iPropertyManager) {
        instance = iPropertyManager;
    }

    public static void initDefaultPropertyManager() {
        StorageManager.registerStorage(STORAGE_KEY, Property.class);
        setPropertyManager(new PropertyManager());
    }

    public static IPropertyManager _() {
        if (instance == null) {
            initDefaultPropertyManager();
        }
        return instance;
    }

    @Override // org.javarosa.core.services.IPropertyManager
    public String getSingularProperty(String str) {
        Vector value;
        String str2 = null;
        if ((this.rulesList.size() == 0 || checkPropertyAllowed(str)) && (value = getValue(str)) != null && value.size() == 1) {
            str2 = (String) value.elementAt(0);
        }
        if (str2 == null) {
            System.out.println("Warning: Singular property request failed for property " + str);
        }
        return str2;
    }

    @Override // org.javarosa.core.services.IPropertyManager
    public Vector getProperty(String str) {
        if (this.rulesList.size() == 0) {
            return getValue(str);
        }
        if (checkPropertyAllowed(str)) {
            return getValue(str);
        }
        return null;
    }

    @Override // org.javarosa.core.services.IPropertyManager
    public void setProperty(String str, String str2) {
        Vector vector = new Vector();
        vector.addElement(str2);
        setProperty(str, vector);
    }

    @Override // org.javarosa.core.services.IPropertyManager
    public void setProperty(String str, Vector vector) {
        Vector property = getProperty(str);
        if (property == null || !vectorEquals(property, vector)) {
            if (this.rulesList.size() == 0) {
                writeValue(str, vector);
                return;
            }
            Enumeration elements = vector.elements();
            boolean z = true;
            while (elements.hasMoreElements()) {
                if (!checkValueAllowed(str, (String) elements.nextElement())) {
                    z = false;
                }
            }
            if (z) {
                writeValue(str, vector);
                notifyChanges(str);
                return;
            }
            System.out.println("Property Manager: Unable to write value (" + vector + ") to " + str);
        }
    }

    private boolean vectorEquals(Vector vector, Vector vector2) {
        if (vector.size() != vector2.size()) {
            return false;
        }
        for (int i = 0; i < vector.size(); i++) {
            if (!vector.elementAt(i).equals(vector2.elementAt(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // org.javarosa.core.services.IPropertyManager
    public Vector getRules() {
        return this.rulesList;
    }

    public void setRules(IPropertyRules iPropertyRules) {
        this.rulesList.removeAllElements();
        this.rulesList.addElement(iPropertyRules);
    }

    @Override // org.javarosa.core.services.IPropertyManager
    public void addRules(IPropertyRules iPropertyRules) {
        if (iPropertyRules != null) {
            this.rulesList.addElement(iPropertyRules);
        }
    }

    public boolean checkPropertyAllowed(String str) {
        boolean z;
        if (this.rulesList.size() == 0) {
            return true;
        }
        boolean z2 = false;
        Enumeration elements = this.rulesList.elements();
        while (true) {
            z = z2;
            if (!elements.hasMoreElements() || z) {
                break;
            }
            z2 = ((IPropertyRules) elements.nextElement()).checkPropertyAllowed(str) ? true : z;
        }
        return z;
    }

    public boolean checkValueAllowed(String str, String str2) {
        boolean z;
        if (this.rulesList.size() == 0) {
            return true;
        }
        boolean z2 = false;
        Enumeration elements = this.rulesList.elements();
        while (true) {
            z = z2;
            if (!elements.hasMoreElements() || z) {
                break;
            }
            IPropertyRules iPropertyRules = (IPropertyRules) elements.nextElement();
            z2 = (!iPropertyRules.checkPropertyAllowed(str) || !iPropertyRules.checkValueAllowed(str, str2)) ? z : true;
        }
        return z;
    }

    private void notifyChanges(String str) {
        if (this.rulesList.size() != 0) {
            Enumeration elements = this.rulesList.elements();
            while (elements.hasMoreElements()) {
                IPropertyRules iPropertyRules = (IPropertyRules) elements.nextElement();
                if (iPropertyRules.checkPropertyAllowed(str)) {
                    iPropertyRules.handlePropertyChanges(str);
                }
            }
        }
    }

    public Vector getValue(String str) {
        try {
            return ((Property) this.properties.getRecordForValue("NAME", str)).value;
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public void writeValue(String str, Vector vector) {
        Property property = new Property();
        property.name = str;
        property.value = vector;
        Vector iDsForValue = this.properties.getIDsForValue("NAME", str);
        if (iDsForValue.size() == 1) {
            property.setID(((Integer) iDsForValue.elementAt(0)).intValue());
        }
        try {
            this.properties.write(property);
        } catch (StorageFullException e) {
            throw new RuntimeException("uh-oh, storage full [properties]");
        }
    }
}
