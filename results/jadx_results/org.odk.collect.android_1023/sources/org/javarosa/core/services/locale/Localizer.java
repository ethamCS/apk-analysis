package org.javarosa.core.services.locale;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.javarosa.core.util.NoLocalizedTextException;
import org.javarosa.core.util.OrderedHashtable;
import org.javarosa.core.util.UnregisteredLocaleException;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapList;
import org.javarosa.core.util.externalizable.ExtWrapListPoly;
import org.javarosa.core.util.externalizable.ExtWrapMap;
import org.javarosa.core.util.externalizable.ExtWrapNullable;
import org.javarosa.core.util.externalizable.Externalizable;
import org.javarosa.core.util.externalizable.ExternalizableWrapper;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class Localizer implements Externalizable {
    private String currentLocale;
    private OrderedHashtable currentLocaleData;
    private String defaultLocale;
    private boolean fallbackDefaultForm;
    private boolean fallbackDefaultLocale;
    private OrderedHashtable localeResources;
    private Vector locales;
    private Vector observers;

    public Localizer() {
        this(false, false);
    }

    public Localizer(boolean z, boolean z2) {
        this.localeResources = new OrderedHashtable();
        this.currentLocaleData = new OrderedHashtable();
        this.locales = new Vector();
        this.defaultLocale = null;
        this.currentLocale = null;
        this.observers = new Vector();
        this.fallbackDefaultLocale = z;
        this.fallbackDefaultForm = z2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Localizer) {
            Localizer localizer = (Localizer) obj;
            return ExtUtil.equals(this.locales, this.locales) && ExtUtil.equals(this.localeResources, localizer.localeResources) && ExtUtil.equals(this.defaultLocale, localizer.defaultLocale) && ExtUtil.equals(this.currentLocale, localizer.currentLocale) && this.fallbackDefaultLocale == localizer.fallbackDefaultLocale && this.fallbackDefaultForm == localizer.fallbackDefaultForm;
        }
        return false;
    }

    public boolean getFallbackLocale() {
        return this.fallbackDefaultLocale;
    }

    public boolean getFallbackForm() {
        return this.fallbackDefaultForm;
    }

    public boolean addAvailableLocale(String str) {
        if (hasLocale(str)) {
            return false;
        }
        this.locales.addElement(str);
        this.localeResources.put(str, new Vector());
        return true;
    }

    public String[] getAvailableLocales() {
        String[] strArr = new String[this.locales.size()];
        this.locales.copyInto(strArr);
        return strArr;
    }

    public boolean hasLocale(String str) {
        if (str == null) {
            return false;
        }
        return this.locales.contains(str);
    }

    public String getNextLocale() {
        return this.currentLocale == null ? this.defaultLocale : (String) this.locales.elementAt((this.locales.indexOf(this.currentLocale) + 1) % this.locales.size());
    }

    public String getLocale() {
        return this.currentLocale;
    }

    public void setLocale(String str) {
        if (!hasLocale(str)) {
            throw new UnregisteredLocaleException("Attempted to set to a locale that is not defined. Attempted Locale: " + str);
        }
        if (!str.equals(this.currentLocale)) {
            this.currentLocale = str;
        }
        loadCurrentLocaleResources();
        alertLocalizables();
    }

    public String getDefaultLocale() {
        return this.defaultLocale;
    }

    public void setDefaultLocale(String str) {
        if (str != null && !hasLocale(str)) {
            throw new UnregisteredLocaleException("Attempted to set default to a locale that is not defined");
        }
        this.defaultLocale = str;
    }

    public void setToDefault() {
        if (this.defaultLocale == null) {
            throw new IllegalStateException("Attempted to set to default locale when default locale not set");
        }
        setLocale(this.defaultLocale);
    }

    private void loadCurrentLocaleResources() {
        this.currentLocaleData = getLocaleData(this.currentLocale);
    }

    private void loadTable(OrderedHashtable orderedHashtable, OrderedHashtable orderedHashtable2) {
        Enumeration keys = orderedHashtable2.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            orderedHashtable.put(str, (String) orderedHashtable2.get(str));
        }
    }

    public void registerLocaleResource(String str, LocaleDataSource localeDataSource) {
        if (str == null) {
            throw new NullPointerException("Attempt to register a data source to a null locale in the localizer");
        }
        if (localeDataSource == null) {
            throw new NullPointerException("Attempt to register a null data source in the localizer");
        }
        Vector vector = new Vector();
        if (this.localeResources.containsKey(str)) {
            vector = (Vector) this.localeResources.get(str);
        }
        vector.addElement(localeDataSource);
        this.localeResources.put(str, vector);
        if (str.equals(this.currentLocale) || str.equals(this.defaultLocale)) {
            loadCurrentLocaleResources();
        }
    }

    public OrderedHashtable getLocaleData(String str) {
        int i;
        if (str == null || !this.locales.contains(str)) {
            return null;
        }
        OrderedHashtable orderedHashtable = new OrderedHashtable();
        OrderedHashtable orderedHashtable2 = new OrderedHashtable();
        if (this.fallbackDefaultLocale && this.defaultLocale != null) {
            Vector vector = (Vector) this.localeResources.get(this.defaultLocale);
            for (int i2 = 0; i2 < vector.size(); i2++) {
                loadTable(orderedHashtable2, ((LocaleDataSource) vector.elementAt(i2)).getLocalizedText());
            }
            Enumeration keys = orderedHashtable2.keys();
            while (keys.hasMoreElements()) {
                orderedHashtable.put(keys.nextElement(), Boolean.TRUE);
            }
        }
        Vector vector2 = (Vector) this.localeResources.get(str);
        for (int i3 = 0; i3 < vector2.size(); i3++) {
            loadTable(orderedHashtable2, ((LocaleDataSource) vector2.elementAt(i3)).getLocalizedText());
        }
        if (this.fallbackDefaultLocale && this.defaultLocale != null) {
            String str2 = "";
            Enumeration keys2 = orderedHashtable2.keys();
            int i4 = 0;
            while (keys2.hasMoreElements()) {
                String str3 = (String) keys2.nextElement();
                if (!orderedHashtable.containsKey(str3)) {
                    str2 = str2 + str3 + ",";
                    i = i4 + 1;
                } else {
                    i = i4;
                }
                str2 = str2;
                i4 = i;
            }
            if (i4 > 0) {
                throw new NoLocalizedTextException("Error loading locale " + str + ". There were " + i4 + " keys which were contained in this locale, but were not properly registered in the default Locale. Any keys which are added to a locale should always be added to the default locale to ensure appropriate functioning.\nThe missing translations were for the keys: " + str2, str2, this.defaultLocale);
            }
        }
        return orderedHashtable2;
    }

    public OrderedHashtable getLocaleMap(String str) {
        OrderedHashtable localeData = getLocaleData(str);
        if (localeData == null) {
            throw new UnregisteredLocaleException("Attempted to access an undefined locale.");
        }
        return localeData;
    }

    public boolean hasMapping(String str, String str2) {
        if (str == null || !this.locales.contains(str)) {
            throw new UnregisteredLocaleException("Attempted to access an undefined locale (" + str + ") while checking for a mapping for  " + str2);
        }
        Enumeration elements = ((Vector) this.localeResources.get(str)).elements();
        while (elements.hasMoreElements()) {
            if (((LocaleDataSource) elements.nextElement()).getLocalizedText().containsKey(str2)) {
                return true;
            }
        }
        return false;
    }

    public boolean destroyLocale(String str) {
        if (str.equals(this.currentLocale)) {
            throw new IllegalArgumentException("Attempted to destroy the current locale");
        }
        boolean hasLocale = hasLocale(str);
        this.locales.removeElement(str);
        this.localeResources.remove(str);
        if (str.equals(this.defaultLocale)) {
            this.defaultLocale = null;
        }
        return hasLocale;
    }

    public String getText(String str) {
        return getText(str, this.currentLocale);
    }

    public String getText(String str, String[] strArr) {
        String text = getText(str, this.currentLocale);
        if (text != null) {
            return processArguments(text, strArr);
        }
        throw new NoLocalizedTextException("The Localizer could not find a definition for ID: " + str + " in the '" + this.currentLocale + "' locale.", str, this.currentLocale);
    }

    public String getText(String str, Hashtable hashtable) {
        String text = getText(str, this.currentLocale);
        if (text != null) {
            return processArguments(text, hashtable);
        }
        throw new NoLocalizedTextException("The Localizer could not find a definition for ID: " + str + " in the '" + this.currentLocale + "' locale.", str, this.currentLocale);
    }

    public String getLocalizedText(String str) {
        String text = getText(str);
        if (text == null) {
            throw new NoLocalizedTextException("Can't find localized text for current locale! text id: [" + str + "] locale: [" + this.currentLocale + "]", str, this.currentLocale);
        }
        return text;
    }

    public String getText(String str, String str2) {
        String rawText = getRawText(str2, str);
        if (rawText == null && this.fallbackDefaultForm && str.indexOf(";") != -1) {
            rawText = getRawText(str2, str.substring(0, str.indexOf(";")));
        }
        if (rawText == null && this.fallbackDefaultLocale && !str2.equals(this.defaultLocale) && this.defaultLocale != null) {
            return getText(str, this.defaultLocale);
        }
        return rawText;
    }

    public String getRawText(String str, String str2) {
        if (str == null) {
            throw new UnregisteredLocaleException("Null locale when attempting to fetch text id: " + str2);
        }
        return str.equals(this.currentLocale) ? (String) this.currentLocaleData.get(str2) : (String) getLocaleMap(str).get(str2);
    }

    public void registerLocalizable(Localizable localizable) {
        if (!this.observers.contains(localizable)) {
            this.observers.addElement(localizable);
            if (this.currentLocale != null) {
                localizable.localeChanged(this.currentLocale, this);
            }
        }
    }

    public void unregisterLocalizable(Localizable localizable) {
        this.observers.removeElement(localizable);
    }

    public void unregisterAll() {
        this.observers.removeAllElements();
    }

    private void alertLocalizables() {
        Enumeration elements = this.observers.elements();
        while (elements.hasMoreElements()) {
            ((Localizable) elements.nextElement()).localeChanged(this.currentLocale, this);
        }
    }

    private static String arg(String str) {
        return "${" + str + "}";
    }

    public static Vector getArgs(String str) {
        Vector vector = new Vector();
        int indexOf = str.indexOf("${");
        while (true) {
            if (indexOf == -1) {
                break;
            }
            int indexOf2 = str.indexOf("}", indexOf);
            if (indexOf2 == -1) {
                System.err.println("Warning: unterminated ${...} arg");
                break;
            }
            String substring = str.substring(indexOf + 2, indexOf2);
            if (!vector.contains(substring)) {
                vector.addElement(substring);
            }
            indexOf = str.indexOf("${", indexOf2 + 1);
        }
        return vector;
    }

    public static String processArguments(String str, Hashtable hashtable) {
        int i;
        String str2;
        int indexOf = str.indexOf("${");
        String str3 = str;
        while (true) {
            if (indexOf == -1) {
                break;
            }
            int indexOf2 = str3.indexOf("}", indexOf);
            if (indexOf2 == -1) {
                System.err.println("Warning: unterminated ${...} arg");
                break;
            }
            String str4 = (String) hashtable.get(str3.substring(indexOf + 2, indexOf2));
            if (str4 != null) {
                str2 = str3.substring(0, indexOf) + str4 + str3.substring(indexOf2 + 1);
                i = (str4.length() + indexOf) - 1;
            } else {
                i = indexOf2;
                str2 = str3;
            }
            indexOf = str2.indexOf("${", i + 1);
            str3 = str2;
        }
        return str3;
    }

    public static String processArguments(String str, String[] strArr) {
        int i = 0;
        String str2 = str;
        while (str2.indexOf("${") != -1 && strArr.length > i) {
            String extractValue = extractValue(str, strArr);
            if (extractValue == null) {
                extractValue = strArr[i];
                i++;
            }
            str2 = replaceFirstValue(str2, extractValue);
        }
        return str2;
    }

    public static String clearArguments(String str) {
        String[] strArr = new String[getArgs(str).size()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = "";
        }
        return processArguments(str, strArr);
    }

    private static String extractValue(String str, String[] strArr) {
        return null;
    }

    private static String replaceFirstValue(String str, String str2) {
        return str.substring(0, str.indexOf("${")) + str2 + str.substring(str.indexOf("}") + 1, str.length());
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.fallbackDefaultLocale = ExtUtil.readBool(dataInputStream);
        this.fallbackDefaultForm = ExtUtil.readBool(dataInputStream);
        this.localeResources = (OrderedHashtable) ExtUtil.read(dataInputStream, new ExtWrapMap(String.class, (ExternalizableWrapper) new ExtWrapListPoly(), true), prototypeFactory);
        this.locales = (Vector) ExtUtil.read(dataInputStream, new ExtWrapList(String.class));
        setDefaultLocale((String) ExtUtil.read(dataInputStream, new ExtWrapNullable(String.class), prototypeFactory));
        String str = (String) ExtUtil.read(dataInputStream, new ExtWrapNullable(String.class), prototypeFactory);
        if (str != null) {
            setLocale(str);
        }
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeBool(dataOutputStream, this.fallbackDefaultLocale);
        ExtUtil.writeBool(dataOutputStream, this.fallbackDefaultForm);
        ExtUtil.write(dataOutputStream, new ExtWrapMap(this.localeResources, new ExtWrapListPoly()));
        ExtUtil.write(dataOutputStream, new ExtWrapList(this.locales));
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(this.defaultLocale));
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(this.currentLocale));
    }
}
