package org.joda.time.tz;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
/* loaded from: classes.dex */
public class ZoneInfoCompiler {
    static Chronology cLenientISO;
    static DateTimeOfYear cStartOfYear;
    static ThreadLocal<Boolean> cVerbose = new ThreadLocal<>();
    private Map<String, RuleSet> iRuleSets = new HashMap();
    private List<Zone> iZones = new ArrayList();
    private List<String> iLinks = new ArrayList();

    static {
        cVerbose.set(Boolean.FALSE);
    }

    public static boolean verbose() {
        return cVerbose.get().booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        if ("-?".equals(r8[r0]) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
        printUsage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void main(java.lang.String[] r8) throws java.lang.Exception {
        /*
            r2 = 0
            r4 = 0
            int r0 = r8.length
            if (r0 != 0) goto L9
            printUsage()
        L8:
            return
        L9:
            r0 = r4
            r1 = r4
            r3 = r2
        Lc:
            int r5 = r8.length
            if (r0 >= r5) goto L58
            java.lang.String r5 = "-src"
            r6 = r8[r0]     // Catch: java.lang.IndexOutOfBoundsException -> L39
            boolean r5 = r5.equals(r6)     // Catch: java.lang.IndexOutOfBoundsException -> L39
            if (r5 == 0) goto L25
            java.io.File r3 = new java.io.File     // Catch: java.lang.IndexOutOfBoundsException -> L39
            int r0 = r0 + 1
            r5 = r8[r0]     // Catch: java.lang.IndexOutOfBoundsException -> L39
            r3.<init>(r5)     // Catch: java.lang.IndexOutOfBoundsException -> L39
        L22:
            int r0 = r0 + 1
            goto Lc
        L25:
            java.lang.String r5 = "-dst"
            r6 = r8[r0]     // Catch: java.lang.IndexOutOfBoundsException -> L39
            boolean r5 = r5.equals(r6)     // Catch: java.lang.IndexOutOfBoundsException -> L39
            if (r5 == 0) goto L3e
            java.io.File r2 = new java.io.File     // Catch: java.lang.IndexOutOfBoundsException -> L39
            int r0 = r0 + 1
            r5 = r8[r0]     // Catch: java.lang.IndexOutOfBoundsException -> L39
            r2.<init>(r5)     // Catch: java.lang.IndexOutOfBoundsException -> L39
            goto L22
        L39:
            r0 = move-exception
            printUsage()
            goto L8
        L3e:
            java.lang.String r5 = "-verbose"
            r6 = r8[r0]     // Catch: java.lang.IndexOutOfBoundsException -> L39
            boolean r5 = r5.equals(r6)     // Catch: java.lang.IndexOutOfBoundsException -> L39
            if (r5 == 0) goto L4a
            r1 = 1
            goto L22
        L4a:
            java.lang.String r5 = "-?"
            r6 = r8[r0]     // Catch: java.lang.IndexOutOfBoundsException -> L39
            boolean r5 = r5.equals(r6)     // Catch: java.lang.IndexOutOfBoundsException -> L39
            if (r5 == 0) goto L58
            printUsage()     // Catch: java.lang.IndexOutOfBoundsException -> L39
            goto L8
        L58:
            int r5 = r8.length
            if (r0 < r5) goto L5f
            printUsage()
            goto L8
        L5f:
            int r5 = r8.length
            int r5 = r5 - r0
            java.io.File[] r6 = new java.io.File[r5]
        L63:
            int r5 = r8.length
            if (r0 >= r5) goto L7e
            if (r3 != 0) goto L76
            java.io.File r5 = new java.io.File
            r7 = r8[r0]
            r5.<init>(r7)
        L6f:
            r6[r4] = r5
            int r0 = r0 + 1
            int r4 = r4 + 1
            goto L63
        L76:
            java.io.File r5 = new java.io.File
            r7 = r8[r0]
            r5.<init>(r3, r7)
            goto L6f
        L7e:
            java.lang.ThreadLocal<java.lang.Boolean> r0 = org.joda.time.tz.ZoneInfoCompiler.cVerbose
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.set(r1)
            org.joda.time.tz.ZoneInfoCompiler r0 = new org.joda.time.tz.ZoneInfoCompiler
            r0.<init>()
            r0.compile(r2, r6)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.ZoneInfoCompiler.main(java.lang.String[]):void");
    }

    private static void printUsage() {
        System.out.println("Usage: java org.joda.time.tz.ZoneInfoCompiler <options> <source files>");
        System.out.println("where possible options include:");
        System.out.println("  -src <directory>    Specify where to read source files");
        System.out.println("  -dst <directory>    Specify where to write generated files");
        System.out.println("  -verbose            Output verbosely (default false)");
    }

    static DateTimeOfYear getStartOfYear() {
        if (cStartOfYear == null) {
            cStartOfYear = new DateTimeOfYear();
        }
        return cStartOfYear;
    }

    static Chronology getLenientISOChronology() {
        if (cLenientISO == null) {
            cLenientISO = LenientChronology.getInstance(ISOChronology.getInstanceUTC());
        }
        return cLenientISO;
    }

    static void writeZoneInfoMap(DataOutputStream dataOutputStream, Map<String, DateTimeZone> map) throws IOException {
        HashMap hashMap = new HashMap(map.size());
        TreeMap treeMap = new TreeMap();
        short s = 0;
        Iterator<Map.Entry<String, DateTimeZone>> it = map.entrySet().iterator();
        while (true) {
            short s2 = s;
            if (it.hasNext()) {
                Map.Entry<String, DateTimeZone> next = it.next();
                String key = next.getKey();
                if (!hashMap.containsKey(key)) {
                    Short valueOf = Short.valueOf(s2);
                    hashMap.put(key, valueOf);
                    treeMap.put(valueOf, key);
                    s2 = (short) (s2 + 1);
                    if (s2 == 0) {
                        throw new InternalError("Too many time zone ids");
                    }
                }
                String id = next.getValue().getID();
                if (!hashMap.containsKey(id)) {
                    Short valueOf2 = Short.valueOf(s2);
                    hashMap.put(id, valueOf2);
                    treeMap.put(valueOf2, id);
                    s = (short) (s2 + 1);
                    if (s == 0) {
                        throw new InternalError("Too many time zone ids");
                    }
                } else {
                    s = s2;
                }
            } else {
                dataOutputStream.writeShort(treeMap.size());
                for (String str : treeMap.values()) {
                    dataOutputStream.writeUTF(str);
                }
                dataOutputStream.writeShort(map.size());
                for (Map.Entry<String, DateTimeZone> entry : map.entrySet()) {
                    dataOutputStream.writeShort(((Short) hashMap.get(entry.getKey())).shortValue());
                    dataOutputStream.writeShort(((Short) hashMap.get(entry.getValue().getID())).shortValue());
                }
                return;
            }
        }
    }

    static int parseYear(String str, int i) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.equals("minimum") || lowerCase.equals("min")) {
            return Integer.MIN_VALUE;
        }
        if (lowerCase.equals("maximum") || lowerCase.equals("max")) {
            return Integer.MAX_VALUE;
        }
        return !lowerCase.equals("only") ? Integer.parseInt(lowerCase) : i;
    }

    static int parseMonth(String str) {
        DateTimeField monthOfYear = ISOChronology.getInstanceUTC().monthOfYear();
        return monthOfYear.get(monthOfYear.set(0L, str, Locale.ENGLISH));
    }

    static int parseDayOfWeek(String str) {
        DateTimeField dayOfWeek = ISOChronology.getInstanceUTC().dayOfWeek();
        return dayOfWeek.get(dayOfWeek.set(0L, str, Locale.ENGLISH));
    }

    static String parseOptional(String str) {
        if (str.equals("-")) {
            return null;
        }
        return str;
    }

    static int parseTime(String str) {
        DateTimeFormatter hourMinuteSecondFraction = ISODateTimeFormat.hourMinuteSecondFraction();
        MutableDateTime mutableDateTime = new MutableDateTime(0L, getLenientISOChronology());
        int i = 0;
        if (str.startsWith("-")) {
            i = 1;
        }
        if (hourMinuteSecondFraction.parseInto(mutableDateTime, str, i) == (i ^ (-1))) {
            throw new IllegalArgumentException(str);
        }
        int millis = (int) mutableDateTime.getMillis();
        return i == 1 ? -millis : millis;
    }

    static char parseZoneChar(char c) {
        switch (c) {
            case 'G':
            case 'U':
            case 'Z':
            case 'g':
            case 'u':
            case 'z':
                return 'u';
            case 'S':
            case 's':
                return 's';
            default:
                return 'w';
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
        r1 = org.joda.time.chrono.ISOChronology.getInstanceUTC().year().set(0, 2050);
        r6 = org.joda.time.chrono.ISOChronology.getInstanceUTC().year().set(0, 1850);
        r0 = r9.size();
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006d, code lost:
        r1 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
        if (r1 < 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
        r4 = r15.previousTransition(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
        if (r4 == r2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
        if (r4 >= r6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012a, code lost:
        if ((((java.lang.Long) r9.get(r1)).longValue() - 1) == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012c, code lost:
        java.lang.System.out.println("*r* Error in " + r15.getID() + org.javarosa.xform.util.XFormAnswerDataSerializer.DELIMITER + new org.joda.time.DateTime(r4, org.joda.time.chrono.ISOChronology.getInstanceUTC()) + " != " + new org.joda.time.DateTime(r2 - 1, org.joda.time.chrono.ISOChronology.getInstanceUTC()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0174, code lost:
        r0 = r1;
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean test(java.lang.String r14, org.joda.time.DateTimeZone r15) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.ZoneInfoCompiler.test(java.lang.String, org.joda.time.DateTimeZone):boolean");
    }

    public Map<String, DateTimeZone> compile(File file, File[] fileArr) throws IOException {
        if (fileArr != null) {
            for (File file2 : fileArr) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file2));
                parseDataFile(bufferedReader);
                bufferedReader.close();
            }
        }
        if (file != null) {
            if (!file.exists()) {
                throw new IOException("Destination directory doesn't exist: " + file);
            }
            if (!file.isDirectory()) {
                throw new IOException("Destination is not a directory: " + file);
            }
        }
        TreeMap treeMap = new TreeMap();
        System.out.println("Writing zoneinfo files");
        for (int i = 0; i < this.iZones.size(); i++) {
            Zone zone = this.iZones.get(i);
            DateTimeZoneBuilder dateTimeZoneBuilder = new DateTimeZoneBuilder();
            zone.addToBuilder(dateTimeZoneBuilder, this.iRuleSets);
            DateTimeZone dateTimeZone = dateTimeZoneBuilder.toDateTimeZone(zone.iName, true);
            if (test(dateTimeZone.getID(), dateTimeZone)) {
                treeMap.put(dateTimeZone.getID(), dateTimeZone);
                if (file == null) {
                    continue;
                } else {
                    if (verbose()) {
                        System.out.println("Writing " + dateTimeZone.getID());
                    }
                    File file3 = new File(file, dateTimeZone.getID());
                    if (!file3.getParentFile().exists()) {
                        file3.getParentFile().mkdirs();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        dateTimeZoneBuilder.writeTo(zone.iName, fileOutputStream);
                        fileOutputStream.close();
                        FileInputStream fileInputStream = new FileInputStream(file3);
                        DateTimeZone readFrom = DateTimeZoneBuilder.readFrom(fileInputStream, dateTimeZone.getID());
                        fileInputStream.close();
                        if (!dateTimeZone.equals(readFrom)) {
                            System.out.println("*e* Error in " + dateTimeZone.getID() + ": Didn't read properly from file");
                        }
                    } catch (Throwable th) {
                        fileOutputStream.close();
                        throw th;
                    }
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            for (int i3 = 0; i3 < this.iLinks.size(); i3 += 2) {
                String str = this.iLinks.get(i3);
                String str2 = this.iLinks.get(i3 + 1);
                DateTimeZone dateTimeZone2 = (DateTimeZone) treeMap.get(str);
                if (dateTimeZone2 == null) {
                    if (i2 > 0) {
                        System.out.println("Cannot find time zone '" + str + "' to link alias '" + str2 + "' to");
                    }
                } else {
                    treeMap.put(str2, dateTimeZone2);
                }
            }
        }
        if (file != null) {
            System.out.println("Writing ZoneInfoMap");
            File file4 = new File(file, "ZoneInfoMap");
            if (!file4.getParentFile().exists()) {
                file4.getParentFile().mkdirs();
            }
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file4));
            try {
                TreeMap treeMap2 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                treeMap2.putAll(treeMap);
                writeZoneInfoMap(dataOutputStream, treeMap2);
            } finally {
                dataOutputStream.close();
            }
        }
        return treeMap;
    }

    public void parseDataFile(BufferedReader bufferedReader) throws IOException {
        Zone zone = null;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            String trim = readLine.trim();
            if (trim.length() != 0 && trim.charAt(0) != '#') {
                int indexOf = readLine.indexOf(35);
                if (indexOf >= 0) {
                    readLine = readLine.substring(0, indexOf);
                }
                StringTokenizer stringTokenizer = new StringTokenizer(readLine, " \t");
                if (Character.isWhitespace(readLine.charAt(0)) && stringTokenizer.hasMoreTokens()) {
                    if (zone != null) {
                        zone.chain(stringTokenizer);
                    }
                } else {
                    if (zone != null) {
                        this.iZones.add(zone);
                    }
                    if (stringTokenizer.hasMoreTokens()) {
                        String nextToken = stringTokenizer.nextToken();
                        if (nextToken.equalsIgnoreCase("Rule")) {
                            Rule rule = new Rule(stringTokenizer);
                            RuleSet ruleSet = this.iRuleSets.get(rule.iName);
                            if (ruleSet == null) {
                                this.iRuleSets.put(rule.iName, new RuleSet(rule));
                            } else {
                                ruleSet.addRule(rule);
                            }
                            zone = null;
                        } else if (nextToken.equalsIgnoreCase("Zone")) {
                            zone = new Zone(stringTokenizer);
                        } else if (nextToken.equalsIgnoreCase("Link")) {
                            this.iLinks.add(stringTokenizer.nextToken());
                            this.iLinks.add(stringTokenizer.nextToken());
                            zone = null;
                        } else {
                            System.out.println("Unknown line: " + readLine);
                        }
                    }
                    zone = null;
                }
            }
        }
        if (zone != null) {
            this.iZones.add(zone);
        }
    }

    /* loaded from: classes.dex */
    public static class DateTimeOfYear {
        public final boolean iAdvanceDayOfWeek;
        public final int iDayOfMonth;
        public final int iDayOfWeek;
        public final int iMillisOfDay;
        public final int iMonthOfYear;
        public final char iZoneChar;

        DateTimeOfYear() {
            this.iMonthOfYear = 1;
            this.iDayOfMonth = 1;
            this.iDayOfWeek = 0;
            this.iAdvanceDayOfWeek = false;
            this.iMillisOfDay = 0;
            this.iZoneChar = 'w';
        }

        DateTimeOfYear(StringTokenizer stringTokenizer) {
            char c;
            int i;
            int i2;
            int i3;
            int i4;
            boolean z;
            boolean z2 = true;
            boolean z3 = false;
            if (!stringTokenizer.hasMoreTokens()) {
                c = 'w';
                i = 0;
                i2 = 1;
                i3 = 1;
                i4 = 0;
            } else {
                int parseMonth = ZoneInfoCompiler.parseMonth(stringTokenizer.nextToken());
                if (!stringTokenizer.hasMoreTokens()) {
                    c = 'w';
                    i = 0;
                    i2 = 1;
                    i3 = parseMonth;
                    i4 = 0;
                } else {
                    String nextToken = stringTokenizer.nextToken();
                    if (nextToken.startsWith("last")) {
                        i = ZoneInfoCompiler.parseDayOfWeek(nextToken.substring(4));
                        i2 = -1;
                        z = false;
                    } else {
                        try {
                            i = 0;
                            i2 = Integer.parseInt(nextToken);
                            z = false;
                        } catch (NumberFormatException e) {
                            int indexOf = nextToken.indexOf(">=");
                            if (indexOf > 0) {
                                i2 = Integer.parseInt(nextToken.substring(indexOf + 2));
                                i = ZoneInfoCompiler.parseDayOfWeek(nextToken.substring(0, indexOf));
                                z = true;
                            } else {
                                int indexOf2 = nextToken.indexOf("<=");
                                if (indexOf2 > 0) {
                                    i2 = Integer.parseInt(nextToken.substring(indexOf2 + 2));
                                    i = ZoneInfoCompiler.parseDayOfWeek(nextToken.substring(0, indexOf2));
                                    z = false;
                                } else {
                                    throw new IllegalArgumentException(nextToken);
                                }
                            }
                        }
                    }
                    if (!stringTokenizer.hasMoreTokens()) {
                        i4 = 0;
                        i3 = parseMonth;
                        z3 = z;
                        c = 'w';
                    } else {
                        String nextToken2 = stringTokenizer.nextToken();
                        char parseZoneChar = ZoneInfoCompiler.parseZoneChar(nextToken2.charAt(nextToken2.length() - 1));
                        if (nextToken2.equals("24:00")) {
                            LocalDate plusMonths = i2 == -1 ? new LocalDate(2001, parseMonth, 1).plusMonths(1) : new LocalDate(2001, parseMonth, i2).plusDays(1);
                            z2 = i2 == -1 ? false : z2;
                            int monthOfYear = plusMonths.getMonthOfYear();
                            i2 = plusMonths.getDayOfMonth();
                            i = (((i - 1) + 1) % 7) + 1;
                            i3 = monthOfYear;
                            c = parseZoneChar;
                            z3 = z2;
                            i4 = 0;
                        } else {
                            i4 = ZoneInfoCompiler.parseTime(nextToken2);
                            i3 = parseMonth;
                            z3 = z;
                            c = parseZoneChar;
                        }
                    }
                }
            }
            this.iMonthOfYear = i3;
            this.iDayOfMonth = i2;
            this.iDayOfWeek = i;
            this.iAdvanceDayOfWeek = z3;
            this.iMillisOfDay = i4;
            this.iZoneChar = c;
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, String str, int i, int i2, int i3) {
            dateTimeZoneBuilder.addRecurringSavings(str, i, i2, i3, this.iZoneChar, this.iMonthOfYear, this.iDayOfMonth, this.iDayOfWeek, this.iAdvanceDayOfWeek, this.iMillisOfDay);
        }

        public void addCutover(DateTimeZoneBuilder dateTimeZoneBuilder, int i) {
            dateTimeZoneBuilder.addCutover(i, this.iZoneChar, this.iMonthOfYear, this.iDayOfMonth, this.iDayOfWeek, this.iAdvanceDayOfWeek, this.iMillisOfDay);
        }

        public String toString() {
            return "MonthOfYear: " + this.iMonthOfYear + "\nDayOfMonth: " + this.iDayOfMonth + "\nDayOfWeek: " + this.iDayOfWeek + "\nAdvanceDayOfWeek: " + this.iAdvanceDayOfWeek + "\nMillisOfDay: " + this.iMillisOfDay + "\nZoneChar: " + this.iZoneChar + "\n";
        }
    }

    /* loaded from: classes.dex */
    public static class Rule {
        public final DateTimeOfYear iDateTimeOfYear;
        public final int iFromYear;
        public final String iLetterS;
        public final String iName;
        public final int iSaveMillis;
        public final int iToYear;
        public final String iType;

        Rule(StringTokenizer stringTokenizer) {
            this.iName = stringTokenizer.nextToken().intern();
            this.iFromYear = ZoneInfoCompiler.parseYear(stringTokenizer.nextToken(), 0);
            this.iToYear = ZoneInfoCompiler.parseYear(stringTokenizer.nextToken(), this.iFromYear);
            if (this.iToYear < this.iFromYear) {
                throw new IllegalArgumentException();
            }
            this.iType = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
            this.iDateTimeOfYear = new DateTimeOfYear(stringTokenizer);
            this.iSaveMillis = ZoneInfoCompiler.parseTime(stringTokenizer.nextToken());
            this.iLetterS = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, String str) {
            this.iDateTimeOfYear.addRecurring(dateTimeZoneBuilder, formatName(str), this.iSaveMillis, this.iFromYear, this.iToYear);
        }

        private String formatName(String str) {
            String str2;
            int indexOf = str.indexOf(47);
            if (indexOf > 0) {
                if (this.iSaveMillis == 0) {
                    return str.substring(0, indexOf).intern();
                }
                return str.substring(indexOf + 1).intern();
            }
            int indexOf2 = str.indexOf("%s");
            if (indexOf2 >= 0) {
                String substring = str.substring(0, indexOf2);
                String substring2 = str.substring(indexOf2 + 2);
                if (this.iLetterS == null) {
                    str2 = substring.concat(substring2);
                } else {
                    str2 = substring + this.iLetterS + substring2;
                }
                return str2.intern();
            }
            return str;
        }

        public String toString() {
            return "[Rule]\nName: " + this.iName + "\nFromYear: " + this.iFromYear + "\nToYear: " + this.iToYear + "\nType: " + this.iType + "\n" + this.iDateTimeOfYear + "SaveMillis: " + this.iSaveMillis + "\nLetterS: " + this.iLetterS + "\n";
        }
    }

    /* loaded from: classes.dex */
    public static class RuleSet {
        private List<Rule> iRules = new ArrayList();

        RuleSet(Rule rule) {
            this.iRules.add(rule);
        }

        void addRule(Rule rule) {
            if (!rule.iName.equals(this.iRules.get(0).iName)) {
                throw new IllegalArgumentException("Rule name mismatch");
            }
            this.iRules.add(rule);
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, String str) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.iRules.size()) {
                    this.iRules.get(i2).addRecurring(dateTimeZoneBuilder, str);
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Zone {
        public final String iFormat;
        public final String iName;
        private Zone iNext;
        public final int iOffsetMillis;
        public final String iRules;
        public final DateTimeOfYear iUntilDateTimeOfYear;
        public final int iUntilYear;

        Zone(StringTokenizer stringTokenizer) {
            this(stringTokenizer.nextToken(), stringTokenizer);
        }

        private Zone(String str, StringTokenizer stringTokenizer) {
            this.iName = str.intern();
            this.iOffsetMillis = ZoneInfoCompiler.parseTime(stringTokenizer.nextToken());
            this.iRules = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
            this.iFormat = stringTokenizer.nextToken().intern();
            int i = Integer.MAX_VALUE;
            DateTimeOfYear startOfYear = ZoneInfoCompiler.getStartOfYear();
            if (stringTokenizer.hasMoreTokens()) {
                i = Integer.parseInt(stringTokenizer.nextToken());
                if (stringTokenizer.hasMoreTokens()) {
                    startOfYear = new DateTimeOfYear(stringTokenizer);
                }
            }
            this.iUntilYear = i;
            this.iUntilDateTimeOfYear = startOfYear;
        }

        void chain(StringTokenizer stringTokenizer) {
            if (this.iNext != null) {
                this.iNext.chain(stringTokenizer);
            } else {
                this.iNext = new Zone(this.iName, stringTokenizer);
            }
        }

        public void addToBuilder(DateTimeZoneBuilder dateTimeZoneBuilder, Map<String, RuleSet> map) {
            addToBuilder(this, dateTimeZoneBuilder, map);
        }

        private static void addToBuilder(Zone zone, DateTimeZoneBuilder dateTimeZoneBuilder, Map<String, RuleSet> map) {
            while (zone != null) {
                dateTimeZoneBuilder.setStandardOffset(zone.iOffsetMillis);
                if (zone.iRules == null) {
                    dateTimeZoneBuilder.setFixedSavings(zone.iFormat, 0);
                } else {
                    try {
                        dateTimeZoneBuilder.setFixedSavings(zone.iFormat, ZoneInfoCompiler.parseTime(zone.iRules));
                    } catch (Exception e) {
                        RuleSet ruleSet = map.get(zone.iRules);
                        if (ruleSet == null) {
                            throw new IllegalArgumentException("Rules not found: " + zone.iRules);
                        }
                        ruleSet.addRecurring(dateTimeZoneBuilder, zone.iFormat);
                    }
                }
                if (zone.iUntilYear != Integer.MAX_VALUE) {
                    zone.iUntilDateTimeOfYear.addCutover(dateTimeZoneBuilder, zone.iUntilYear);
                    zone = zone.iNext;
                } else {
                    return;
                }
            }
        }

        public String toString() {
            String str = "[Zone]\nName: " + this.iName + "\nOffsetMillis: " + this.iOffsetMillis + "\nRules: " + this.iRules + "\nFormat: " + this.iFormat + "\nUntilYear: " + this.iUntilYear + "\n" + this.iUntilDateTimeOfYear;
            return this.iNext == null ? str : str + "...\n" + this.iNext.toString();
        }
    }
}
