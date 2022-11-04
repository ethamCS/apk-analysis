package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.FormatUtils;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
/* loaded from: classes.dex */
public abstract class DateTimeZone implements Serializable {
    public static final DateTimeZone UTC = new FixedDateTimeZone("UTC", "UTC", 0, 0);
    private static Set<String> cAvailableIDs = null;
    private static volatile DateTimeZone cDefault = null;
    private static NameProvider cNameProvider = null;
    private static DateTimeFormatter cOffsetFormatter = null;
    private static Provider cProvider = null;
    private static Map<String, String> cZoneIdConversion = null;
    private static Map<String, SoftReference<DateTimeZone>> iFixedOffsetCache = null;
    private static final long serialVersionUID = 5546345482340108586L;
    private final String iID;

    public abstract boolean equals(Object obj);

    public abstract String getNameKey(long j);

    public abstract int getOffset(long j);

    public abstract int getStandardOffset(long j);

    public abstract boolean isFixed();

    public abstract long nextTransition(long j);

    public abstract long previousTransition(long j);

    static {
        setProvider0(null);
        setNameProvider0(null);
    }

    public static DateTimeZone getDefault() {
        DateTimeZone dateTimeZone = cDefault;
        if (dateTimeZone == null) {
            synchronized (DateTimeZone.class) {
                dateTimeZone = cDefault;
                if (dateTimeZone == null) {
                    dateTimeZone = null;
                    try {
                        String property = System.getProperty("user.timezone");
                        if (property != null) {
                            dateTimeZone = forID(property);
                        }
                    } catch (RuntimeException e) {
                    }
                    if (dateTimeZone == null) {
                        try {
                            dateTimeZone = forTimeZone(TimeZone.getDefault());
                        } catch (IllegalArgumentException e2) {
                        }
                    }
                    if (dateTimeZone == null) {
                        dateTimeZone = UTC;
                    }
                    cDefault = dateTimeZone;
                }
            }
        }
        return dateTimeZone;
    }

    public static void setDefault(DateTimeZone dateTimeZone) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setDefault"));
        }
        if (dateTimeZone == null) {
            throw new IllegalArgumentException("The datetime zone must not be null");
        }
        synchronized (DateTimeZone.class) {
            cDefault = dateTimeZone;
        }
    }

    @FromString
    public static DateTimeZone forID(String str) {
        if (str == null) {
            return getDefault();
        }
        if (str.equals("UTC")) {
            return UTC;
        }
        DateTimeZone zone = cProvider.getZone(str);
        if (zone == null) {
            if (str.startsWith("+") || str.startsWith("-")) {
                int parseOffset = parseOffset(str);
                if (parseOffset == 0) {
                    return UTC;
                }
                return fixedOffsetZone(printOffset(parseOffset), parseOffset);
            }
            throw new IllegalArgumentException("The datetime zone id '" + str + "' is not recognised");
        }
        return zone;
    }

    public static DateTimeZone forOffsetHours(int i) throws IllegalArgumentException {
        return forOffsetHoursMinutes(i, 0);
    }

    public static DateTimeZone forOffsetHoursMinutes(int i, int i2) throws IllegalArgumentException {
        int safeAdd;
        if (i == 0 && i2 == 0) {
            return UTC;
        }
        if (i2 < 0 || i2 > 59) {
            throw new IllegalArgumentException("Minutes out of range: " + i2);
        }
        try {
            int safeMultiply = FieldUtils.safeMultiply(i, 60);
            if (safeMultiply < 0) {
                safeAdd = FieldUtils.safeAdd(safeMultiply, -i2);
            } else {
                safeAdd = FieldUtils.safeAdd(safeMultiply, i2);
            }
            return forOffsetMillis(FieldUtils.safeMultiply(safeAdd, (int) DateTimeConstants.MILLIS_PER_MINUTE));
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Offset is too large");
        }
    }

    public static DateTimeZone forOffsetMillis(int i) {
        return fixedOffsetZone(printOffset(i), i);
    }

    public static DateTimeZone forTimeZone(TimeZone timeZone) {
        if (timeZone == null) {
            return getDefault();
        }
        String id = timeZone.getID();
        if (id.equals("UTC")) {
            return UTC;
        }
        DateTimeZone dateTimeZone = null;
        String convertedId = getConvertedId(id);
        if (convertedId != null) {
            dateTimeZone = cProvider.getZone(convertedId);
        }
        if (dateTimeZone == null) {
            dateTimeZone = cProvider.getZone(id);
        }
        if (dateTimeZone == null) {
            if (convertedId == null) {
                String displayName = timeZone.getDisplayName();
                if (displayName.startsWith("GMT+") || displayName.startsWith("GMT-")) {
                    int parseOffset = parseOffset(displayName.substring(3));
                    if (parseOffset == 0) {
                        return UTC;
                    }
                    return fixedOffsetZone(printOffset(parseOffset), parseOffset);
                }
            }
            throw new IllegalArgumentException("The datetime zone id '" + id + "' is not recognised");
        }
        return dateTimeZone;
    }

    private static synchronized DateTimeZone fixedOffsetZone(String str, int i) {
        DateTimeZone fixedDateTimeZone;
        synchronized (DateTimeZone.class) {
            if (i == 0) {
                fixedDateTimeZone = UTC;
            } else {
                if (iFixedOffsetCache == null) {
                    iFixedOffsetCache = new HashMap();
                }
                SoftReference<DateTimeZone> softReference = iFixedOffsetCache.get(str);
                if (softReference == null || (fixedDateTimeZone = softReference.get()) == null) {
                    fixedDateTimeZone = new FixedDateTimeZone(str, null, i, i);
                    iFixedOffsetCache.put(str, new SoftReference<>(fixedDateTimeZone));
                }
            }
        }
        return fixedDateTimeZone;
    }

    public static Set<String> getAvailableIDs() {
        return cAvailableIDs;
    }

    public static Provider getProvider() {
        return cProvider;
    }

    public static void setProvider(Provider provider) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setProvider"));
        }
        setProvider0(provider);
    }

    private static void setProvider0(Provider provider) {
        if (provider == null) {
            provider = getDefaultProvider();
        }
        Set<String> availableIDs = provider.getAvailableIDs();
        if (availableIDs == null || availableIDs.size() == 0) {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        }
        if (!availableIDs.contains("UTC")) {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        }
        if (!UTC.equals(provider.getZone("UTC"))) {
            throw new IllegalArgumentException("Invalid UTC zone provided");
        }
        cProvider = provider;
        cAvailableIDs = availableIDs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0016 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [org.joda.time.tz.Provider] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.joda.time.tz.Provider getDefaultProvider() {
        /*
            r1 = 0
            java.lang.String r0 = "org.joda.time.DateTimeZone.Provider"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L41
            if (r0 == 0) goto L31
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L25
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Exception -> L25
            org.joda.time.tz.Provider r0 = (org.joda.time.tz.Provider) r0     // Catch: java.lang.Exception -> L25
        L13:
            r1 = r0
        L14:
            if (r1 != 0) goto L3f
            org.joda.time.tz.ZoneInfoProvider r0 = new org.joda.time.tz.ZoneInfoProvider     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "org/joda/time/tz/data"
            r0.<init>(r2)     // Catch: java.lang.Exception -> L33
        L1d:
            if (r0 != 0) goto L24
            org.joda.time.tz.UTCProvider r0 = new org.joda.time.tz.UTCProvider
            r0.<init>()
        L24:
            return r0
        L25:
            r0 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.SecurityException -> L41
            java.lang.ThreadGroup r3 = r2.getThreadGroup()     // Catch: java.lang.SecurityException -> L41
            r3.uncaughtException(r2, r0)     // Catch: java.lang.SecurityException -> L41
        L31:
            r0 = r1
            goto L13
        L33:
            r0 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.ThreadGroup r3 = r2.getThreadGroup()
            r3.uncaughtException(r2, r0)
        L3f:
            r0 = r1
            goto L1d
        L41:
            r0 = move-exception
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.DateTimeZone.getDefaultProvider():org.joda.time.tz.Provider");
    }

    public static NameProvider getNameProvider() {
        return cNameProvider;
    }

    public static void setNameProvider(NameProvider nameProvider) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setNameProvider"));
        }
        setNameProvider0(nameProvider);
    }

    private static void setNameProvider0(NameProvider nameProvider) {
        if (nameProvider == null) {
            nameProvider = getDefaultNameProvider();
        }
        cNameProvider = nameProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.joda.time.tz.NameProvider getDefaultNameProvider() {
        /*
            r1 = 0
            java.lang.String r0 = "org.joda.time.DateTimeZone.NameProvider"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L29
            if (r0 == 0) goto L27
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1b
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Exception -> L1b
            org.joda.time.tz.NameProvider r0 = (org.joda.time.tz.NameProvider) r0     // Catch: java.lang.Exception -> L1b
        L13:
            if (r0 != 0) goto L1a
            org.joda.time.tz.DefaultNameProvider r0 = new org.joda.time.tz.DefaultNameProvider
            r0.<init>()
        L1a:
            return r0
        L1b:
            r0 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.SecurityException -> L29
            java.lang.ThreadGroup r3 = r2.getThreadGroup()     // Catch: java.lang.SecurityException -> L29
            r3.uncaughtException(r2, r0)     // Catch: java.lang.SecurityException -> L29
        L27:
            r0 = r1
            goto L13
        L29:
            r0 = move-exception
            r0 = r1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.DateTimeZone.getDefaultNameProvider():org.joda.time.tz.NameProvider");
    }

    private static synchronized String getConvertedId(String str) {
        String str2;
        synchronized (DateTimeZone.class) {
            Map map = cZoneIdConversion;
            if (map == null) {
                map = new HashMap();
                map.put("GMT", "UTC");
                map.put("WET", "WET");
                map.put("CET", "CET");
                map.put("MET", "CET");
                map.put("ECT", "CET");
                map.put("EET", "EET");
                map.put("MIT", "Pacific/Apia");
                map.put("HST", "Pacific/Honolulu");
                map.put("AST", "America/Anchorage");
                map.put("PST", "America/Los_Angeles");
                map.put("MST", "America/Denver");
                map.put("PNT", "America/Phoenix");
                map.put("CST", "America/Chicago");
                map.put("EST", "America/New_York");
                map.put("IET", "America/Indiana/Indianapolis");
                map.put("PRT", "America/Puerto_Rico");
                map.put("CNT", "America/St_Johns");
                map.put("AGT", "America/Argentina/Buenos_Aires");
                map.put("BET", "America/Sao_Paulo");
                map.put("ART", "Africa/Cairo");
                map.put("CAT", "Africa/Harare");
                map.put("EAT", "Africa/Addis_Ababa");
                map.put("NET", "Asia/Yerevan");
                map.put("PLT", "Asia/Karachi");
                map.put("IST", "Asia/Kolkata");
                map.put("BST", "Asia/Dhaka");
                map.put("VST", "Asia/Ho_Chi_Minh");
                map.put("CTT", "Asia/Shanghai");
                map.put("JST", "Asia/Tokyo");
                map.put("ACT", "Australia/Darwin");
                map.put("AET", "Australia/Sydney");
                map.put("SST", "Pacific/Guadalcanal");
                map.put("NST", "Pacific/Auckland");
                cZoneIdConversion = map;
            }
            str2 = (String) map.get(str);
        }
        return str2;
    }

    private static int parseOffset(String str) {
        return -((int) offsetFormatter().withChronology(new BaseChronology() { // from class: org.joda.time.DateTimeZone.1
            @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
            public DateTimeZone getZone() {
                return null;
            }

            @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
            public Chronology withUTC() {
                return this;
            }

            @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
            public Chronology withZone(DateTimeZone dateTimeZone) {
                return this;
            }

            @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
            public String toString() {
                return getClass().getName();
            }
        }).parseMillis(str));
    }

    private static String printOffset(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i = -i;
        }
        int i2 = i / DateTimeConstants.MILLIS_PER_HOUR;
        FormatUtils.appendPaddedInteger(stringBuffer, i2, 2);
        int i3 = i - (i2 * DateTimeConstants.MILLIS_PER_HOUR);
        int i4 = i3 / DateTimeConstants.MILLIS_PER_MINUTE;
        stringBuffer.append(':');
        FormatUtils.appendPaddedInteger(stringBuffer, i4, 2);
        int i5 = i3 - (i4 * DateTimeConstants.MILLIS_PER_MINUTE);
        if (i5 == 0) {
            return stringBuffer.toString();
        }
        int i6 = i5 / 1000;
        stringBuffer.append(':');
        FormatUtils.appendPaddedInteger(stringBuffer, i6, 2);
        int i7 = i5 - (i6 * 1000);
        if (i7 == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        FormatUtils.appendPaddedInteger(stringBuffer, i7, 3);
        return stringBuffer.toString();
    }

    private static synchronized DateTimeFormatter offsetFormatter() {
        DateTimeFormatter dateTimeFormatter;
        synchronized (DateTimeZone.class) {
            if (cOffsetFormatter == null) {
                cOffsetFormatter = new DateTimeFormatterBuilder().appendTimeZoneOffset(null, true, 2, 4).toFormatter();
            }
            dateTimeFormatter = cOffsetFormatter;
        }
        return dateTimeFormatter;
    }

    public DateTimeZone(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Id must not be null");
        }
        this.iID = str;
    }

    @ToString
    public final String getID() {
        return this.iID;
    }

    public final String getShortName(long j) {
        return getShortName(j, null);
    }

    public String getShortName(long j, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String nameKey = getNameKey(j);
        if (nameKey == null) {
            return this.iID;
        }
        String shortName = cNameProvider.getShortName(locale, this.iID, nameKey);
        return shortName == null ? printOffset(getOffset(j)) : shortName;
    }

    public final String getName(long j) {
        return getName(j, null);
    }

    public String getName(long j, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String nameKey = getNameKey(j);
        if (nameKey == null) {
            return this.iID;
        }
        String name = cNameProvider.getName(locale, this.iID, nameKey);
        return name == null ? printOffset(getOffset(j)) : name;
    }

    public final int getOffset(ReadableInstant readableInstant) {
        return readableInstant == null ? getOffset(DateTimeUtils.currentTimeMillis()) : getOffset(readableInstant.getMillis());
    }

    public boolean isStandardOffset(long j) {
        return getOffset(j) == getStandardOffset(j);
    }

    public int getOffsetFromLocal(long j) {
        int offset = getOffset(j);
        long j2 = j - offset;
        int offset2 = getOffset(j2);
        if (offset != offset2) {
            if (offset - offset2 < 0 && nextTransition(j2) != nextTransition(j - offset2)) {
                return offset;
            }
        } else if (offset > 0) {
            long previousTransition = previousTransition(j2);
            if (previousTransition < j2) {
                int offset3 = getOffset(previousTransition);
                if (j2 - previousTransition <= offset3 - offset) {
                    return offset3;
                }
            }
        }
        return offset2;
    }

    public long convertUTCToLocal(long j) {
        int offset = getOffset(j);
        long j2 = offset + j;
        if ((j ^ j2) < 0 && (offset ^ j) >= 0) {
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }
        return j2;
    }

    public long convertLocalToUTC(long j, boolean z, long j2) {
        int offset = getOffset(j2);
        long j3 = j - offset;
        return getOffset(j3) == offset ? j3 : convertLocalToUTC(j, z);
    }

    public long convertLocalToUTC(long j, boolean z) {
        int i;
        long j2;
        long j3 = Long.MAX_VALUE;
        int offset = getOffset(j);
        int offset2 = getOffset(j - offset);
        if (offset != offset2 && (z || offset < 0)) {
            long nextTransition = nextTransition(j - offset);
            if (nextTransition == j - offset) {
                nextTransition = Long.MAX_VALUE;
            }
            long nextTransition2 = nextTransition(j - offset2);
            if (nextTransition2 != j - offset2) {
                j3 = nextTransition2;
            }
            if (nextTransition != j3) {
                if (z) {
                    throw new IllegalArgumentException("Illegal instant due to time zone offset transition: " + DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(new Instant(j)) + " (" + getID() + ")");
                }
                i = offset;
                j2 = j - i;
                if ((j ^ j2) >= 0 && (i ^ j) < 0) {
                    throw new ArithmeticException("Subtracting time zone offset caused overflow");
                }
                return j2;
            }
        }
        i = offset2;
        j2 = j - i;
        if ((j ^ j2) >= 0) {
        }
        return j2;
    }

    public long getMillisKeepLocal(DateTimeZone dateTimeZone, long j) {
        DateTimeZone dateTimeZone2 = dateTimeZone == null ? getDefault() : dateTimeZone;
        return dateTimeZone2 == this ? j : dateTimeZone2.convertLocalToUTC(convertUTCToLocal(j), false, j);
    }

    public boolean isLocalDateTimeGap(LocalDateTime localDateTime) {
        if (isFixed()) {
            return false;
        }
        try {
            localDateTime.toDateTime(this);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public long adjustOffset(long j, boolean z) {
        long convertUTCToLocal = convertUTCToLocal(j - 10800000);
        long convertUTCToLocal2 = convertUTCToLocal(j + 10800000);
        if (convertUTCToLocal != convertUTCToLocal2) {
            long convertUTCToLocal3 = convertUTCToLocal(j);
            if (!z) {
                convertUTCToLocal2 = convertUTCToLocal;
            }
            return convertLocalToUTC(convertUTCToLocal3, false, convertUTCToLocal2);
        }
        return j;
    }

    public TimeZone toTimeZone() {
        return TimeZone.getTimeZone(this.iID);
    }

    public int hashCode() {
        return getID().hashCode() + 57;
    }

    public String toString() {
        return getID();
    }

    protected Object writeReplace() throws ObjectStreamException {
        return new Stub(this.iID);
    }

    /* loaded from: classes.dex */
    private static final class Stub implements Serializable {
        private static final long serialVersionUID = -6471952376487863581L;
        private transient String iID;

        Stub(String str) {
            this.iID = str;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeUTF(this.iID);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            this.iID = objectInputStream.readUTF();
        }

        private Object readResolve() throws ObjectStreamException {
            return DateTimeZone.forID(this.iID);
        }
    }
}
