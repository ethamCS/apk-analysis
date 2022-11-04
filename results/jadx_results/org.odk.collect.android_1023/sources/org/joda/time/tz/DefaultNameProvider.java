package org.joda.time.tz;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.joda.time.DateTimeUtils;
/* loaded from: classes.dex */
public class DefaultNameProvider implements NameProvider {
    private HashMap<Locale, Map<String, Map<String, Object>>> iByLocaleCache = createCache();

    @Override // org.joda.time.tz.NameProvider
    public String getShortName(Locale locale, String str, String str2) {
        String[] nameSet = getNameSet(locale, str, str2);
        if (nameSet == null) {
            return null;
        }
        return nameSet[0];
    }

    @Override // org.joda.time.tz.NameProvider
    public String getName(Locale locale, String str, String str2) {
        String[] nameSet = getNameSet(locale, str, str2);
        if (nameSet == null) {
            return null;
        }
        return nameSet[1];
    }

    private synchronized String[] getNameSet(Locale locale, String str, String str2) {
        String[] strArr;
        HashMap hashMap;
        int i = 0;
        synchronized (this) {
            if (locale == null || str == null || str2 == null) {
                strArr = null;
            } else {
                Map<String, Map<String, Object>> map = this.iByLocaleCache.get(locale);
                if (map == null) {
                    HashMap<Locale, Map<String, Map<String, Object>>> hashMap2 = this.iByLocaleCache;
                    HashMap createCache = createCache();
                    hashMap2.put(locale, createCache);
                    hashMap = createCache;
                } else {
                    hashMap = map;
                }
                Map map2 = (Map) hashMap.get(str);
                if (map2 == null) {
                    map2 = createCache();
                    hashMap.put(str, map2);
                    Object[][] zoneStrings = DateTimeUtils.getDateFormatSymbols(locale).getZoneStrings();
                    while (true) {
                        if (i >= zoneStrings.length) {
                            break;
                        }
                        Object[] objArr = zoneStrings[i];
                        if (objArr == null || objArr.length != 5 || !str.equals(objArr[0])) {
                            i++;
                        } else {
                            map2.put(objArr[2], new String[]{objArr[2], objArr[1]});
                            if (objArr[2].equals(objArr[4])) {
                                map2.put(objArr[4] + "-Summer", new String[]{objArr[4], objArr[3]});
                            } else {
                                map2.put(objArr[4], new String[]{objArr[4], objArr[3]});
                            }
                        }
                    }
                }
                strArr = (String[]) map2.get(str2);
            }
        }
        return strArr;
    }

    private HashMap createCache() {
        return new HashMap(7);
    }
}
