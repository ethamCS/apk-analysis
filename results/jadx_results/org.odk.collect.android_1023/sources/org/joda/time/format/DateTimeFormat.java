package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;
import org.kxml2.wap.Wbxml;
import org.opendatakit.httpclientandroidlib.HttpStatus;
/* loaded from: classes.dex */
public class DateTimeFormat {
    static final int DATE = 0;
    static final int DATETIME = 2;
    static final int FULL = 0;
    static final int LONG = 1;
    static final int MEDIUM = 2;
    static final int NONE = 4;
    static final int SHORT = 3;
    static final int TIME = 1;
    private static final Map<String, DateTimeFormatter> cPatternedCache = new HashMap(7);
    private static final DateTimeFormatter[] cStyleCache = new DateTimeFormatter[25];

    public static DateTimeFormatter forPattern(String str) {
        return createFormatterForPattern(str);
    }

    public static DateTimeFormatter forStyle(String str) {
        return createFormatterForStyle(str);
    }

    public static String patternForStyle(String str, Locale locale) {
        DateTimeFormatter createFormatterForStyle = createFormatterForStyle(str);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return ((StyleFormatter) createFormatterForStyle.getPrinter()).getPattern(locale);
    }

    public static DateTimeFormatter shortDate() {
        return createFormatterForStyleIndex(3, 4);
    }

    public static DateTimeFormatter shortTime() {
        return createFormatterForStyleIndex(4, 3);
    }

    public static DateTimeFormatter shortDateTime() {
        return createFormatterForStyleIndex(3, 3);
    }

    public static DateTimeFormatter mediumDate() {
        return createFormatterForStyleIndex(2, 4);
    }

    public static DateTimeFormatter mediumTime() {
        return createFormatterForStyleIndex(4, 2);
    }

    public static DateTimeFormatter mediumDateTime() {
        return createFormatterForStyleIndex(2, 2);
    }

    public static DateTimeFormatter longDate() {
        return createFormatterForStyleIndex(1, 4);
    }

    public static DateTimeFormatter longTime() {
        return createFormatterForStyleIndex(4, 1);
    }

    public static DateTimeFormatter longDateTime() {
        return createFormatterForStyleIndex(1, 1);
    }

    public static DateTimeFormatter fullDate() {
        return createFormatterForStyleIndex(0, 4);
    }

    public static DateTimeFormatter fullTime() {
        return createFormatterForStyleIndex(4, 0);
    }

    public static DateTimeFormatter fullDateTime() {
        return createFormatterForStyleIndex(0, 0);
    }

    public static void appendPatternTo(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        parsePatternTo(dateTimeFormatterBuilder, str);
    }

    protected DateTimeFormat() {
    }

    private static void parsePatternTo(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        int length = str.length();
        int[] iArr = new int[1];
        int i = 0;
        while (i < length) {
            iArr[0] = i;
            String parseToken = parseToken(str, iArr);
            int i2 = iArr[0];
            int length2 = parseToken.length();
            if (length2 != 0) {
                char charAt = parseToken.charAt(0);
                switch (charAt) {
                    case '\'':
                        String substring = parseToken.substring(1);
                        if (substring.length() == 1) {
                            dateTimeFormatterBuilder.appendLiteral(substring.charAt(0));
                            break;
                        } else {
                            dateTimeFormatterBuilder.appendLiteral(new String(substring));
                            break;
                        }
                    case Wbxml.PI /* 67 */:
                        dateTimeFormatterBuilder.appendCenturyOfEra(length2, length2);
                        break;
                    case Wbxml.LITERAL_C /* 68 */:
                        dateTimeFormatterBuilder.appendDayOfYear(length2);
                        break;
                    case 'E':
                        if (length2 >= 4) {
                            dateTimeFormatterBuilder.appendDayOfWeekText();
                            break;
                        } else {
                            dateTimeFormatterBuilder.appendDayOfWeekShortText();
                            break;
                        }
                    case 'G':
                        dateTimeFormatterBuilder.appendEraText();
                        break;
                    case 'H':
                        dateTimeFormatterBuilder.appendHourOfDay(length2);
                        break;
                    case 'K':
                        dateTimeFormatterBuilder.appendHourOfHalfday(length2);
                        break;
                    case 'M':
                        if (length2 >= 3) {
                            if (length2 >= 4) {
                                dateTimeFormatterBuilder.appendMonthOfYearText();
                                break;
                            } else {
                                dateTimeFormatterBuilder.appendMonthOfYearShortText();
                                break;
                            }
                        } else {
                            dateTimeFormatterBuilder.appendMonthOfYear(length2);
                            break;
                        }
                    case 'S':
                        dateTimeFormatterBuilder.appendFractionOfSecond(length2, length2);
                        break;
                    case 'Y':
                    case 'x':
                    case 'y':
                        if (length2 == 2) {
                            boolean z = true;
                            if (i2 + 1 < length) {
                                iArr[0] = iArr[0] + 1;
                                if (isNumericToken(parseToken(str, iArr))) {
                                    z = false;
                                }
                                iArr[0] = iArr[0] - 1;
                            }
                            switch (charAt) {
                                case 'x':
                                    dateTimeFormatterBuilder.appendTwoDigitWeekyear(new DateTime().getWeekyear() - 30, z);
                                    continue;
                                default:
                                    dateTimeFormatterBuilder.appendTwoDigitYear(new DateTime().getYear() - 30, z);
                                    continue;
                            }
                        } else {
                            int i3 = 9;
                            if (i2 + 1 < length) {
                                iArr[0] = iArr[0] + 1;
                                if (isNumericToken(parseToken(str, iArr))) {
                                    i3 = length2;
                                }
                                iArr[0] = iArr[0] - 1;
                            }
                            switch (charAt) {
                                case 'Y':
                                    dateTimeFormatterBuilder.appendYearOfEra(length2, i3);
                                    continue;
                                case 'x':
                                    dateTimeFormatterBuilder.appendWeekyear(length2, i3);
                                    continue;
                                case 'y':
                                    dateTimeFormatterBuilder.appendYear(length2, i3);
                                    continue;
                            }
                        }
                    case 'Z':
                        if (length2 == 1) {
                            dateTimeFormatterBuilder.appendTimeZoneOffset(null, "Z", false, 2, 2);
                            break;
                        } else if (length2 == 2) {
                            dateTimeFormatterBuilder.appendTimeZoneOffset(null, "Z", true, 2, 2);
                            break;
                        } else {
                            dateTimeFormatterBuilder.appendTimeZoneId();
                            break;
                        }
                    case 'a':
                        dateTimeFormatterBuilder.appendHalfdayOfDayText();
                        break;
                    case 'd':
                        dateTimeFormatterBuilder.appendDayOfMonth(length2);
                        break;
                    case HttpStatus.SC_SWITCHING_PROTOCOLS /* 101 */:
                        dateTimeFormatterBuilder.appendDayOfWeek(length2);
                        break;
                    case 'h':
                        dateTimeFormatterBuilder.appendClockhourOfHalfday(length2);
                        break;
                    case 'k':
                        dateTimeFormatterBuilder.appendClockhourOfDay(length2);
                        break;
                    case 'm':
                        dateTimeFormatterBuilder.appendMinuteOfHour(length2);
                        break;
                    case 's':
                        dateTimeFormatterBuilder.appendSecondOfMinute(length2);
                        break;
                    case 'w':
                        dateTimeFormatterBuilder.appendWeekOfWeekyear(length2);
                        break;
                    case 'z':
                        if (length2 >= 4) {
                            dateTimeFormatterBuilder.appendTimeZoneName();
                            break;
                        } else {
                            dateTimeFormatterBuilder.appendTimeZoneShortName();
                            break;
                        }
                    default:
                        throw new IllegalArgumentException("Illegal pattern component: " + parseToken);
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    private static String parseToken(String str, int[] iArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            stringBuffer.append(charAt);
            while (i + 1 < length && str.charAt(i + 1) == charAt) {
                stringBuffer.append(charAt);
                i++;
            }
        } else {
            stringBuffer.append('\'');
            boolean z = false;
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 == '\'') {
                    if (i + 1 < length && str.charAt(i + 1) == '\'') {
                        i++;
                        stringBuffer.append(charAt2);
                    } else {
                        z = !z;
                    }
                } else if (!z && ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= 'a' && charAt2 <= 'z'))) {
                    i--;
                    break;
                } else {
                    stringBuffer.append(charAt2);
                }
                i++;
            }
        }
        iArr[0] = i;
        return stringBuffer.toString();
    }

    private static boolean isNumericToken(String str) {
        int length = str.length();
        if (length > 0) {
            switch (str.charAt(0)) {
                case Wbxml.PI /* 67 */:
                case Wbxml.LITERAL_C /* 68 */:
                case 'F':
                case 'H':
                case 'K':
                case 'S':
                case 'W':
                case 'Y':
                case 'c':
                case 'd':
                case HttpStatus.SC_SWITCHING_PROTOCOLS /* 101 */:
                case 'h':
                case 'k':
                case 'm':
                case 's':
                case 'w':
                case 'x':
                case 'y':
                    return true;
                case 'M':
                    if (length <= 2) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    private static DateTimeFormatter createFormatterForPattern(String str) {
        DateTimeFormatter dateTimeFormatter;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Invalid pattern specification");
        }
        synchronized (cPatternedCache) {
            dateTimeFormatter = cPatternedCache.get(str);
            if (dateTimeFormatter == null) {
                DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
                parsePatternTo(dateTimeFormatterBuilder, str);
                dateTimeFormatter = dateTimeFormatterBuilder.toFormatter();
                cPatternedCache.put(str, dateTimeFormatter);
            }
        }
        return dateTimeFormatter;
    }

    private static DateTimeFormatter createFormatterForStyle(String str) {
        if (str == null || str.length() != 2) {
            throw new IllegalArgumentException("Invalid style specification: " + str);
        }
        int selectStyle = selectStyle(str.charAt(0));
        int selectStyle2 = selectStyle(str.charAt(1));
        if (selectStyle == 4 && selectStyle2 == 4) {
            throw new IllegalArgumentException("Style '--' is invalid");
        }
        return createFormatterForStyleIndex(selectStyle, selectStyle2);
    }

    private static DateTimeFormatter createFormatterForStyleIndex(int i, int i2) {
        DateTimeFormatter dateTimeFormatter;
        int i3 = (i << 2) + i + i2;
        synchronized (cStyleCache) {
            dateTimeFormatter = cStyleCache[i3];
            if (dateTimeFormatter == null) {
                int i4 = 2;
                if (i == 4) {
                    i4 = 1;
                } else if (i2 == 4) {
                    i4 = 0;
                }
                StyleFormatter styleFormatter = new StyleFormatter(i, i2, i4);
                dateTimeFormatter = new DateTimeFormatter(styleFormatter, styleFormatter);
                cStyleCache[i3] = dateTimeFormatter;
            }
        }
        return dateTimeFormatter;
    }

    private static int selectStyle(char c) {
        switch (c) {
            case '-':
                return 4;
            case 'F':
                return 0;
            case 'L':
                return 1;
            case 'M':
                return 2;
            case 'S':
                return 3;
            default:
                throw new IllegalArgumentException("Invalid style character: " + c);
        }
    }

    /* loaded from: classes.dex */
    public static class StyleFormatter implements DateTimePrinter, DateTimeParser {
        private static final Map<String, DateTimeFormatter> cCache = new HashMap();
        private final int iDateStyle;
        private final int iTimeStyle;
        private final int iType;

        StyleFormatter(int i, int i2, int i3) {
            this.iDateStyle = i;
            this.iTimeStyle = i2;
            this.iType = i3;
        }

        @Override // org.joda.time.format.DateTimePrinter
        public int estimatePrintedLength() {
            return 40;
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            getFormatter(locale).getPrinter().printTo(stringBuffer, j, chronology, i, dateTimeZone, locale);
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            getFormatter(locale).getPrinter().printTo(writer, j, chronology, i, dateTimeZone, locale);
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial, Locale locale) {
            getFormatter(locale).getPrinter().printTo(stringBuffer, readablePartial, locale);
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, ReadablePartial readablePartial, Locale locale) throws IOException {
            getFormatter(locale).getPrinter().printTo(writer, readablePartial, locale);
        }

        @Override // org.joda.time.format.DateTimeParser
        public int estimateParsedLength() {
            return 40;
        }

        @Override // org.joda.time.format.DateTimeParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, String str, int i) {
            return getFormatter(dateTimeParserBucket.getLocale()).getParser().parseInto(dateTimeParserBucket, str, i);
        }

        private DateTimeFormatter getFormatter(Locale locale) {
            DateTimeFormatter dateTimeFormatter;
            if (locale == null) {
                locale = Locale.getDefault();
            }
            String str = Integer.toString(this.iType + (this.iDateStyle << 4) + (this.iTimeStyle << 8)) + locale.toString();
            synchronized (cCache) {
                dateTimeFormatter = cCache.get(str);
                if (dateTimeFormatter == null) {
                    dateTimeFormatter = DateTimeFormat.forPattern(getPattern(locale));
                    cCache.put(str, dateTimeFormatter);
                }
            }
            return dateTimeFormatter;
        }

        String getPattern(Locale locale) {
            DateFormat dateFormat = null;
            switch (this.iType) {
                case 0:
                    dateFormat = DateFormat.getDateInstance(this.iDateStyle, locale);
                    break;
                case 1:
                    dateFormat = DateFormat.getTimeInstance(this.iTimeStyle, locale);
                    break;
                case 2:
                    dateFormat = DateFormat.getDateTimeInstance(this.iDateStyle, this.iTimeStyle, locale);
                    break;
            }
            if (!(dateFormat instanceof SimpleDateFormat)) {
                throw new IllegalArgumentException("No datetime pattern for locale: " + locale);
            }
            return ((SimpleDateFormat) dateFormat).toPattern();
        }
    }
}
