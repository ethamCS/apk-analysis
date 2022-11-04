package org.javarosa.core.model.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.Vector;
import org.javarosa.core.services.locale.Localization;
import org.javarosa.core.util.MathUtils;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
import org.opendatakit.httpclientandroidlib.HttpStatus;
/* loaded from: classes.dex */
public class DateUtils {
    public static final long DAY_IN_MS = 86400000;
    public static final int FORMAT_HUMAN_READABLE_DAYS_FROM_TODAY = 5;
    public static final int FORMAT_HUMAN_READABLE_SHORT = 2;
    public static final int FORMAT_ISO8601 = 1;
    public static final int FORMAT_TIMESTAMP_HTTP = 9;
    public static final int FORMAT_TIMESTAMP_SUFFIX = 7;
    private static final int MONTH_OFFSET = 1;

    /* loaded from: classes.dex */
    public static class DateFields {
        public int year = 1970;
        public int month = 1;
        public int day = 1;
        public int hour = 0;
        public int minute = 0;
        public int second = 0;
        public int secTicks = 0;
        public int dow = 0;

        public boolean check() {
            return DateUtils.inRange(this.month, 1, 12) && DateUtils.inRange(this.day, 1, DateUtils.daysInMonth(this.month + (-1), this.year)) && DateUtils.inRange(this.hour, 0, 23) && DateUtils.inRange(this.minute, 0, 59) && DateUtils.inRange(this.second, 0, 59) && DateUtils.inRange(this.secTicks, 0, 999);
        }
    }

    public static DateFields getFields(Date date) {
        return getFields(date, null);
    }

    public static DateFields getFields(Date date, String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (str != null) {
            calendar.setTimeZone(TimeZone.getTimeZone(str));
        }
        DateFields dateFields = new DateFields();
        dateFields.year = calendar.get(1);
        dateFields.month = calendar.get(2) + 1;
        dateFields.day = calendar.get(5);
        dateFields.hour = calendar.get(11);
        dateFields.minute = calendar.get(12);
        dateFields.second = calendar.get(13);
        dateFields.secTicks = calendar.get(14);
        dateFields.dow = calendar.get(7);
        return dateFields;
    }

    public static Date getDate(DateFields dateFields) {
        return getDate(dateFields, null);
    }

    public static Date getDate(DateFields dateFields, String str) {
        Calendar calendar = Calendar.getInstance();
        if (str != null) {
            calendar.setTimeZone(TimeZone.getTimeZone(str));
        }
        calendar.set(1, dateFields.year);
        calendar.set(2, dateFields.month - 1);
        calendar.set(5, dateFields.day);
        calendar.set(11, dateFields.hour);
        calendar.set(12, dateFields.minute);
        calendar.set(13, dateFields.second);
        calendar.set(14, dateFields.secTicks);
        return calendar.getTime();
    }

    public static String formatDateTime(Date date, int i) {
        String str;
        if (date == null) {
            return "";
        }
        DateFields fields = getFields(date, i == 9 ? "UTC" : null);
        switch (i) {
            case 1:
                str = "T";
                break;
            case 7:
                str = "";
                break;
            case 9:
                str = XFormAnswerDataSerializer.DELIMITER;
                break;
            default:
                str = XFormAnswerDataSerializer.DELIMITER;
                break;
        }
        return formatDate(fields, i) + str + formatTime(fields, i);
    }

    public static String formatDate(Date date, int i) {
        if (date == null) {
            return "";
        }
        return formatDate(getFields(date, i == 9 ? "UTC" : null), i);
    }

    public static String formatTime(Date date, int i) {
        if (date == null) {
            return "";
        }
        return formatTime(getFields(date, i == 9 ? "UTC" : null), i);
    }

    private static String formatDate(DateFields dateFields, int i) {
        switch (i) {
            case 1:
                return formatDateISO8601(dateFields);
            case 2:
                return formatDateColloquial(dateFields);
            case 3:
            case 4:
            case 6:
            case 8:
            default:
                return null;
            case 5:
                return formatDaysFromToday(dateFields);
            case 7:
                return formatDateSuffix(dateFields);
            case 9:
                return formatDateHttp(dateFields);
        }
    }

    private static String formatTime(DateFields dateFields, int i) {
        switch (i) {
            case 1:
                return formatTimeISO8601(dateFields);
            case 2:
                return formatTimeColloquial(dateFields);
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            default:
                return null;
            case 7:
                return formatTimeSuffix(dateFields);
            case 9:
                return formatTimeHttp(dateFields);
        }
    }

    private static String formatDateHttp(DateFields dateFields) {
        return format(dateFields, "%a, %d %b %Y");
    }

    private static String formatTimeHttp(DateFields dateFields) {
        return format(dateFields, "%H:%M:%S GMT");
    }

    private static String formatDateISO8601(DateFields dateFields) {
        return dateFields.year + "-" + intPad(dateFields.month, 2) + "-" + intPad(dateFields.day, 2);
    }

    private static String formatDateColloquial(DateFields dateFields) {
        String num = new Integer(dateFields.year).toString();
        if (num.length() == 4) {
            num = num.substring(2, 4);
        }
        return intPad(dateFields.day, 2) + "/" + intPad(dateFields.month, 2) + "/" + num;
    }

    private static String formatDateSuffix(DateFields dateFields) {
        return dateFields.year + intPad(dateFields.month, 2) + intPad(dateFields.day, 2);
    }

    private static String formatTimeISO8601(DateFields dateFields) {
        int abs;
        String str = intPad(dateFields.hour, 2) + ":" + intPad(dateFields.minute, 2) + ":" + intPad(dateFields.second, 2) + "." + intPad(dateFields.secTicks, 3);
        int offset = TimeZone.getDefault().getOffset(1, dateFields.year, dateFields.month - 1, dateFields.day, dateFields.dow, 0);
        if (offset == 0) {
            return str + "Z";
        }
        return str + (offset > 0 ? "+" : "-") + intPad(abs / 60, 2) + (((Math.abs(offset) / 1000) / 60) % 60 != 0 ? ":" + intPad(abs % 60, 2) : "");
    }

    private static String formatTimeColloquial(DateFields dateFields) {
        return intPad(dateFields.hour, 2) + ":" + intPad(dateFields.minute, 2);
    }

    private static String formatTimeSuffix(DateFields dateFields) {
        return intPad(dateFields.hour, 2) + intPad(dateFields.minute, 2) + intPad(dateFields.second, 2);
    }

    public static String format(Date date, String str) {
        return format(getFields(date), str);
    }

    public static String format(DateFields dateFields, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '%') {
                i++;
                if (i >= str.length()) {
                    throw new RuntimeException("date format string ends with %");
                }
                char charAt2 = str.charAt(i);
                if (charAt2 == '%') {
                    stringBuffer.append("%");
                } else if (charAt2 == 'Y') {
                    stringBuffer.append(intPad(dateFields.year, 4));
                } else if (charAt2 == 'y') {
                    stringBuffer.append(intPad(dateFields.year, 4).substring(2));
                } else if (charAt2 == 'm') {
                    stringBuffer.append(intPad(dateFields.month, 2));
                } else if (charAt2 == 'n') {
                    stringBuffer.append(dateFields.month);
                } else if (charAt2 == 'b') {
                    stringBuffer.append(new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}[dateFields.month - 1]);
                } else if (charAt2 == 'd') {
                    stringBuffer.append(intPad(dateFields.day, 2));
                } else if (charAt2 == 'e') {
                    stringBuffer.append(dateFields.day);
                } else if (charAt2 == 'H') {
                    stringBuffer.append(intPad(dateFields.hour, 2));
                } else if (charAt2 == 'h') {
                    stringBuffer.append(dateFields.hour);
                } else if (charAt2 == 'M') {
                    stringBuffer.append(intPad(dateFields.minute, 2));
                } else if (charAt2 == 'S') {
                    stringBuffer.append(intPad(dateFields.second, 2));
                } else if (charAt2 == '3') {
                    stringBuffer.append(intPad(dateFields.secTicks, 3));
                } else if (charAt2 == 'a') {
                    stringBuffer.append(new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}[dateFields.dow - 1]);
                } else if (charAt2 == 'Z' || charAt2 == 'A' || charAt2 == 'B') {
                    throw new RuntimeException("unsupported escape in date format string [%" + charAt2 + "]");
                } else {
                    throw new RuntimeException("unrecognized escape in date format string [%" + charAt2 + "]");
                }
            } else {
                stringBuffer.append(charAt);
            }
            i++;
        }
        return stringBuffer.toString();
    }

    public static Date parseDateTime(String str) {
        DateFields dateFields = new DateFields();
        int indexOf = str.indexOf("T");
        if (indexOf != -1) {
            if (!parseDate(str.substring(0, indexOf), dateFields) || !parseTime(str.substring(indexOf + 1), dateFields)) {
                return null;
            }
        } else if (!parseDate(str, dateFields)) {
            return null;
        }
        return getDate(dateFields);
    }

    public static Date parseDate(String str) {
        DateFields dateFields = new DateFields();
        if (!parseDate(str, dateFields)) {
            return null;
        }
        return getDate(dateFields);
    }

    public static Date parseTime(String str) {
        DateFields dateFields = new DateFields();
        if (!parseTime(str, dateFields)) {
            return null;
        }
        return getDate(dateFields);
    }

    private static boolean parseDate(String str, DateFields dateFields) {
        Vector split = split(str, "-", false);
        if (split.size() != 3) {
            return false;
        }
        try {
            dateFields.year = Integer.parseInt((String) split.elementAt(0));
            dateFields.month = Integer.parseInt((String) split.elementAt(1));
            dateFields.day = Integer.parseInt((String) split.elementAt(2));
            return dateFields.check();
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean parseTime(String str, DateFields dateFields) {
        int i;
        Vector split;
        DateFields dateFields2 = null;
        if (str.charAt(str.length() - 1) == 'Z') {
            str = str.substring(0, str.length() - 1);
            dateFields2 = new DateFields();
        } else if (str.indexOf("+") != -1 || str.indexOf("-") != -1) {
            DateFields dateFields3 = new DateFields();
            Vector split2 = split(str, "+", false);
            if (split2.size() > 1) {
                i = -1;
                split = split2;
            } else {
                i = 1;
                split = split(str, "-", false);
            }
            String str2 = (String) split.elementAt(0);
            String str3 = (String) split.elementAt(1);
            if (str3.indexOf(":") != -1) {
                Vector split3 = split(str3, ":", false);
                str3 = (String) split3.elementAt(0);
                dateFields3.minute = Integer.parseInt((String) split3.elementAt(1)) * i;
            }
            dateFields3.hour = Integer.parseInt(str3) * i;
            str = str2;
            dateFields2 = dateFields3;
        }
        if (parseRawTime(str, dateFields) && dateFields.check()) {
            if (dateFields2 == null) {
                return true;
            }
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar.setTime(new Date(getDate(dateFields, "UTC").getTime() + ((dateFields2.minute + (dateFields2.hour * 60)) * 60 * 1000)));
            calendar.setTimeZone(TimeZone.getDefault());
            calendar.get(10);
            DateFields fields = getFields(calendar.getTime());
            dateFields.hour = fields.hour;
            dateFields.minute = fields.minute;
            dateFields.second = fields.second;
            dateFields.secTicks = fields.secTicks;
            return dateFields.check();
        }
        return false;
    }

    private static boolean parseRawTime(String str, DateFields dateFields) {
        Vector split = split(str, ":", false);
        if (split.size() == 2 || split.size() == 3) {
            try {
                dateFields.hour = Integer.parseInt((String) split.elementAt(0));
                dateFields.minute = Integer.parseInt((String) split.elementAt(1));
                if (split.size() == 3) {
                    String str2 = (String) split.elementAt(2);
                    int i = 0;
                    while (i < str2.length()) {
                        char charAt = str2.charAt(i);
                        if (!Character.isDigit(charAt) && charAt != '.') {
                            break;
                        }
                        i++;
                    }
                    double parseDouble = Double.parseDouble(str2.substring(0, i));
                    dateFields.second = (int) parseDouble;
                    dateFields.secTicks = (int) ((parseDouble - dateFields.second) * 1000.0d);
                }
                return dateFields.check();
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;
    }

    public static Date getDate(int i, int i2, int i3) {
        DateFields dateFields = new DateFields();
        dateFields.year = i;
        dateFields.month = i2;
        dateFields.day = i3;
        if (dateFields.check()) {
            return getDate(dateFields);
        }
        return null;
    }

    public static Date roundDate(Date date) {
        DateFields fields = getFields(date);
        return getDate(fields.year, fields.month, fields.day);
    }

    public static Date today() {
        return roundDate(new Date());
    }

    public static int daysInMonth(int i, int i2) {
        int i3 = 1;
        if (i == 3 || i == 5 || i == 8 || i == 10) {
            return 30;
        }
        if (i == 1) {
            if (!isLeap(i2)) {
                i3 = 0;
            }
            return i3 + 28;
        }
        return 31;
    }

    public static boolean isLeap(int i) {
        return i % 4 == 0 && (i % 100 != 0 || i % HttpStatus.SC_BAD_REQUEST == 0);
    }

    private static String formatDaysFromToday(DateFields dateFields) {
        int daysSinceEpoch = daysSinceEpoch(new Date()) - daysSinceEpoch(getDate(dateFields));
        if (daysSinceEpoch == 0) {
            return Localization.get("date.today");
        }
        if (daysSinceEpoch == 1) {
            return Localization.get("date.yesterday");
        }
        if (daysSinceEpoch == 2) {
            return Localization.get("date.twoago", new String[]{String.valueOf(daysSinceEpoch)});
        }
        if (daysSinceEpoch > 2 && daysSinceEpoch <= 6) {
            return Localization.get("date.nago", new String[]{String.valueOf(daysSinceEpoch)});
        }
        if (daysSinceEpoch == -1) {
            return Localization.get("date.tomorrow");
        }
        if (daysSinceEpoch < -1 && daysSinceEpoch >= -6) {
            return Localization.get("date.nfromnow", new String[]{String.valueOf(-daysSinceEpoch)});
        }
        return formatDate(dateFields, 2);
    }

    public static Date getPastPeriodDate(Date date, String str, String str2, boolean z, boolean z2, int i) {
        int i2;
        int i3 = 1;
        int i4 = 0;
        if (str.equals("week")) {
            int i5 = z2 ? 1 : 0;
            if (str2.equals("sun")) {
                i2 = 0;
            } else if (str2.equals("mon")) {
                i2 = 1;
            } else if (str2.equals("tue")) {
                i2 = 2;
            } else if (str2.equals("wed")) {
                i2 = 3;
            } else if (str2.equals("thu")) {
                i2 = 4;
            } else if (str2.equals("fri")) {
                i2 = 5;
            } else {
                i2 = str2.equals("sat") ? 6 : -1;
            }
            if (i2 == -1) {
                throw new RuntimeException();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            switch (calendar.get(7)) {
                case 1:
                    i3 = 0;
                    break;
                case 2:
                    break;
                case 3:
                    i3 = 2;
                    break;
                case 4:
                    i3 = 3;
                    break;
                case 5:
                    i3 = 4;
                    break;
                case 6:
                    i3 = 5;
                    break;
                case 7:
                    i3 = 6;
                    break;
                default:
                    throw new RuntimeException();
            }
            int i6 = ((((i3 - i2) + (i5 + 7)) % 7) - i5) + (i * 7);
            if (!z) {
                i4 = 6;
            }
            return new Date(date.getTime() - ((i6 - i4) * DAY_IN_MS));
        } else if (str.equals("month")) {
            return null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static int getMonthsDifference(Date date, Date date2) {
        Date date3 = new Date(date2.getTime() - date.getTime());
        Date date4 = new Date(0L);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date4);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        calendar.setTime(date3);
        return ((calendar.get(1) - i) * 12) + (calendar.get(2) - i2);
    }

    public static int daysSinceEpoch(Date date) {
        return dateDiff(getDate(1970, 1, 1), date);
    }

    public static Date dateAdd(Date date, int i) {
        return roundDate(new Date(roundDate(date).getTime() + (DAY_IN_MS * i) + 43200000));
    }

    public static int dateDiff(Date date, Date date2) {
        return (int) MathUtils.divLongNotSuck((roundDate(date2).getTime() - roundDate(date).getTime()) + 43200000, DAY_IN_MS);
    }

    public static Vector split(String str, String str2, boolean z) {
        int i = 0;
        Vector vector = new Vector();
        int indexOf = str.indexOf(str2);
        while (indexOf >= 0) {
            vector.addElement(str.substring(0, indexOf));
            str = str.substring(indexOf + str2.length());
            indexOf = str.indexOf(str2);
        }
        vector.addElement(str);
        if (z) {
            while (true) {
                int i2 = i;
                if (i2 >= vector.size()) {
                    break;
                }
                if (((String) vector.elementAt(i2)).length() == 0) {
                    vector.removeElementAt(i2);
                    i2--;
                }
                i = i2 + 1;
            }
        }
        return vector;
    }

    public static String intPad(int i, int i2) {
        String valueOf = String.valueOf(i);
        while (valueOf.length() < i2) {
            valueOf = "0" + valueOf;
        }
        return valueOf;
    }

    public static boolean inRange(int i, int i2, int i3) {
        return i >= i2 && i <= i3;
    }

    public static String formatDateToTimeStamp(Date date) {
        return formatDateTime(date, 1);
    }

    public static String getShortStringValue(Date date) {
        return formatDate(date, 2);
    }

    public static String getXMLStringValue(Date date) {
        return formatDate(date, 1);
    }

    public static String get24HourTimeFromDate(Date date) {
        return formatTime(date, 2);
    }

    public static Date getDateFromString(String str) {
        return parseDate(str);
    }

    public static Date getDateTimeFromString(String str) {
        return parseDateTime(str);
    }

    public static boolean stringContains(String str, String str2) {
        return (str == null || str2 == null || str.indexOf(str2) == -1) ? false : true;
    }
}
