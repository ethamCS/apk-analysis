package org.javarosa.core.services.locale;

import java.util.Hashtable;
import org.javarosa.core.reference.ReferenceDataSource;
/* loaded from: classes.dex */
public class Localization {
    private static Localizer globalLocalizer;

    public static String get(String str) {
        return get(str, new String[0]);
    }

    public static String get(String str, String[] strArr) {
        checkRep();
        return globalLocalizer.getText(str, strArr);
    }

    public static String get(String str, Hashtable hashtable) {
        checkRep();
        return globalLocalizer.getText(str, hashtable);
    }

    public static void registerLanguageFile(String str, String str2) {
        init();
        if (!globalLocalizer.hasLocale(str)) {
            globalLocalizer.addAvailableLocale(str);
        }
        globalLocalizer.registerLocaleResource(str, new ResourceFileDataSource(str2));
        if (globalLocalizer.getDefaultLocale() == null) {
            globalLocalizer.setDefaultLocale(str);
        }
    }

    public static void registerLanguageReference(String str, String str2) {
        init();
        if (!globalLocalizer.hasLocale(str)) {
            globalLocalizer.addAvailableLocale(str);
        }
        globalLocalizer.registerLocaleResource(str, new ReferenceDataSource(str2));
        if (globalLocalizer.getDefaultLocale() == null) {
            globalLocalizer.setDefaultLocale(str);
        }
    }

    public static Localizer getGlobalLocalizerAdvanced() {
        init();
        return globalLocalizer;
    }

    public static void setLocale(String str) {
        checkRep();
        globalLocalizer.setLocale(str);
    }

    public static void setDefaultLocale(String str) {
        checkRep();
        globalLocalizer.setDefaultLocale(str);
    }

    private static void init() {
        if (globalLocalizer == null) {
            globalLocalizer = new Localizer(true, true);
        }
    }

    private static void checkRep() {
        init();
        if (globalLocalizer.getAvailableLocales().length == 0) {
            throw new LocaleTextException("There are no locales defined for the application. Please make sure to register locale text using the Locale.register() method");
        }
    }
}
