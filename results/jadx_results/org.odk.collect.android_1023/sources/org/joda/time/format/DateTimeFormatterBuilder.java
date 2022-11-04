package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDateTimeField;
/* loaded from: classes.dex */
public class DateTimeFormatterBuilder {
    private ArrayList<Object> iElementPairs = new ArrayList<>();
    private Object iFormatter;

    public DateTimeFormatter toFormatter() {
        Object formatter = getFormatter();
        DateTimePrinter dateTimePrinter = isPrinter(formatter) ? (DateTimePrinter) formatter : null;
        DateTimeParser dateTimeParser = isParser(formatter) ? (DateTimeParser) formatter : null;
        if (dateTimePrinter != null || dateTimeParser != null) {
            return new DateTimeFormatter(dateTimePrinter, dateTimeParser);
        }
        throw new UnsupportedOperationException("Both printing and parsing not supported");
    }

    public DateTimePrinter toPrinter() {
        Object formatter = getFormatter();
        if (isPrinter(formatter)) {
            return (DateTimePrinter) formatter;
        }
        throw new UnsupportedOperationException("Printing is not supported");
    }

    public DateTimeParser toParser() {
        Object formatter = getFormatter();
        if (isParser(formatter)) {
            return (DateTimeParser) formatter;
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public boolean canBuildFormatter() {
        return isFormatter(getFormatter());
    }

    public boolean canBuildPrinter() {
        return isPrinter(getFormatter());
    }

    public boolean canBuildParser() {
        return isParser(getFormatter());
    }

    public void clear() {
        this.iFormatter = null;
        this.iElementPairs.clear();
    }

    public DateTimeFormatterBuilder append(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter == null) {
            throw new IllegalArgumentException("No formatter supplied");
        }
        return append0(dateTimeFormatter.getPrinter(), dateTimeFormatter.getParser());
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter) {
        checkPrinter(dateTimePrinter);
        return append0(dateTimePrinter, null);
    }

    public DateTimeFormatterBuilder append(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, dateTimeParser);
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        checkPrinter(dateTimePrinter);
        checkParser(dateTimeParser);
        return append0(dateTimePrinter, dateTimeParser);
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser[] dateTimeParserArr) {
        int i = 0;
        if (dateTimePrinter != null) {
            checkPrinter(dateTimePrinter);
        }
        if (dateTimeParserArr == null) {
            throw new IllegalArgumentException("No parsers supplied");
        }
        int length = dateTimeParserArr.length;
        if (length == 1) {
            if (dateTimeParserArr[0] == null) {
                throw new IllegalArgumentException("No parser supplied");
            }
            return append0(dateTimePrinter, dateTimeParserArr[0]);
        }
        DateTimeParser[] dateTimeParserArr2 = new DateTimeParser[length];
        while (i < length - 1) {
            DateTimeParser dateTimeParser = dateTimeParserArr[i];
            dateTimeParserArr2[i] = dateTimeParser;
            if (dateTimeParser != null) {
                i++;
            } else {
                throw new IllegalArgumentException("Incomplete parser array");
            }
        }
        dateTimeParserArr2[i] = dateTimeParserArr[i];
        return append0(dateTimePrinter, new MatchingParser(dateTimeParserArr2));
    }

    public DateTimeFormatterBuilder appendOptional(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, new MatchingParser(new DateTimeParser[]{dateTimeParser, null}));
    }

    private void checkParser(DateTimeParser dateTimeParser) {
        if (dateTimeParser == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    private void checkPrinter(DateTimePrinter dateTimePrinter) {
        if (dateTimePrinter == null) {
            throw new IllegalArgumentException("No printer supplied");
        }
    }

    private DateTimeFormatterBuilder append0(Object obj) {
        this.iFormatter = null;
        this.iElementPairs.add(obj);
        this.iElementPairs.add(obj);
        return this;
    }

    private DateTimeFormatterBuilder append0(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        this.iFormatter = null;
        this.iElementPairs.add(dateTimePrinter);
        this.iElementPairs.add(dateTimeParser);
        return this;
    }

    public DateTimeFormatterBuilder appendLiteral(char c) {
        return append0(new CharacterLiteral(c));
    }

    public DateTimeFormatterBuilder appendLiteral(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Literal must not be null");
        }
        switch (str.length()) {
            case 0:
                return this;
            case 1:
                return append0(new CharacterLiteral(str.charAt(0)));
            default:
                return append0(new StringLiteral(str));
        }
    }

    public DateTimeFormatterBuilder appendDecimal(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        return i <= 1 ? append0(new UnpaddedNumber(dateTimeFieldType, i2, false)) : append0(new PaddedNumber(dateTimeFieldType, i2, false, i));
    }

    public DateTimeFormatterBuilder appendFixedDecimal(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("Illegal number of digits: " + i);
        }
        return append0(new FixedNumber(dateTimeFieldType, i, false));
    }

    public DateTimeFormatterBuilder appendSignedDecimal(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        return i <= 1 ? append0(new UnpaddedNumber(dateTimeFieldType, i2, true)) : append0(new PaddedNumber(dateTimeFieldType, i2, true, i));
    }

    public DateTimeFormatterBuilder appendFixedSignedDecimal(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("Illegal number of digits: " + i);
        }
        return append0(new FixedNumber(dateTimeFieldType, i, true));
    }

    public DateTimeFormatterBuilder appendText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        return append0(new TextField(dateTimeFieldType, false));
    }

    public DateTimeFormatterBuilder appendShortText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        return append0(new TextField(dateTimeFieldType, true));
    }

    public DateTimeFormatterBuilder appendFraction(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        return append0(new Fraction(dateTimeFieldType, i, i2));
    }

    public DateTimeFormatterBuilder appendFractionOfSecond(int i, int i2) {
        return appendFraction(DateTimeFieldType.secondOfDay(), i, i2);
    }

    public DateTimeFormatterBuilder appendFractionOfMinute(int i, int i2) {
        return appendFraction(DateTimeFieldType.minuteOfDay(), i, i2);
    }

    public DateTimeFormatterBuilder appendFractionOfHour(int i, int i2) {
        return appendFraction(DateTimeFieldType.hourOfDay(), i, i2);
    }

    public DateTimeFormatterBuilder appendFractionOfDay(int i, int i2) {
        return appendFraction(DateTimeFieldType.dayOfYear(), i, i2);
    }

    public DateTimeFormatterBuilder appendMillisOfSecond(int i) {
        return appendDecimal(DateTimeFieldType.millisOfSecond(), i, 3);
    }

    public DateTimeFormatterBuilder appendMillisOfDay(int i) {
        return appendDecimal(DateTimeFieldType.millisOfDay(), i, 8);
    }

    public DateTimeFormatterBuilder appendSecondOfMinute(int i) {
        return appendDecimal(DateTimeFieldType.secondOfMinute(), i, 2);
    }

    public DateTimeFormatterBuilder appendSecondOfDay(int i) {
        return appendDecimal(DateTimeFieldType.secondOfDay(), i, 5);
    }

    public DateTimeFormatterBuilder appendMinuteOfHour(int i) {
        return appendDecimal(DateTimeFieldType.minuteOfHour(), i, 2);
    }

    public DateTimeFormatterBuilder appendMinuteOfDay(int i) {
        return appendDecimal(DateTimeFieldType.minuteOfDay(), i, 4);
    }

    public DateTimeFormatterBuilder appendHourOfDay(int i) {
        return appendDecimal(DateTimeFieldType.hourOfDay(), i, 2);
    }

    public DateTimeFormatterBuilder appendClockhourOfDay(int i) {
        return appendDecimal(DateTimeFieldType.clockhourOfDay(), i, 2);
    }

    public DateTimeFormatterBuilder appendHourOfHalfday(int i) {
        return appendDecimal(DateTimeFieldType.hourOfHalfday(), i, 2);
    }

    public DateTimeFormatterBuilder appendClockhourOfHalfday(int i) {
        return appendDecimal(DateTimeFieldType.clockhourOfHalfday(), i, 2);
    }

    public DateTimeFormatterBuilder appendDayOfWeek(int i) {
        return appendDecimal(DateTimeFieldType.dayOfWeek(), i, 1);
    }

    public DateTimeFormatterBuilder appendDayOfMonth(int i) {
        return appendDecimal(DateTimeFieldType.dayOfMonth(), i, 2);
    }

    public DateTimeFormatterBuilder appendDayOfYear(int i) {
        return appendDecimal(DateTimeFieldType.dayOfYear(), i, 3);
    }

    public DateTimeFormatterBuilder appendWeekOfWeekyear(int i) {
        return appendDecimal(DateTimeFieldType.weekOfWeekyear(), i, 2);
    }

    public DateTimeFormatterBuilder appendWeekyear(int i, int i2) {
        return appendSignedDecimal(DateTimeFieldType.weekyear(), i, i2);
    }

    public DateTimeFormatterBuilder appendMonthOfYear(int i) {
        return appendDecimal(DateTimeFieldType.monthOfYear(), i, 2);
    }

    public DateTimeFormatterBuilder appendYear(int i, int i2) {
        return appendSignedDecimal(DateTimeFieldType.year(), i, i2);
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i) {
        return appendTwoDigitYear(i, false);
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i, boolean z) {
        return append0(new TwoDigitYear(DateTimeFieldType.year(), i, z));
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i) {
        return appendTwoDigitWeekyear(i, false);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i, boolean z) {
        return append0(new TwoDigitYear(DateTimeFieldType.weekyear(), i, z));
    }

    public DateTimeFormatterBuilder appendYearOfEra(int i, int i2) {
        return appendDecimal(DateTimeFieldType.yearOfEra(), i, i2);
    }

    public DateTimeFormatterBuilder appendYearOfCentury(int i, int i2) {
        return appendDecimal(DateTimeFieldType.yearOfCentury(), i, i2);
    }

    public DateTimeFormatterBuilder appendCenturyOfEra(int i, int i2) {
        return appendSignedDecimal(DateTimeFieldType.centuryOfEra(), i, i2);
    }

    public DateTimeFormatterBuilder appendHalfdayOfDayText() {
        return appendText(DateTimeFieldType.halfdayOfDay());
    }

    public DateTimeFormatterBuilder appendDayOfWeekText() {
        return appendText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfWeekShortText() {
        return appendShortText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendMonthOfYearText() {
        return appendText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendMonthOfYearShortText() {
        return appendShortText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendEraText() {
        return appendText(DateTimeFieldType.era());
    }

    public DateTimeFormatterBuilder appendTimeZoneName() {
        return append0(new TimeZoneName(0, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(0, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName() {
        return append0(new TimeZoneName(1, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(1, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTimeZoneId() {
        return append0(TimeZoneId.INSTANCE, TimeZoneId.INSTANCE);
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, boolean z, int i, int i2) {
        return append0(new TimeZoneOffset(str, str, z, i, i2));
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, String str2, boolean z, int i, int i2) {
        return append0(new TimeZoneOffset(str, str2, z, i, i2));
    }

    public DateTimeFormatterBuilder appendPattern(String str) {
        DateTimeFormat.appendPatternTo(this, str);
        return this;
    }

    private Object getFormatter() {
        Object obj = this.iFormatter;
        if (obj == null) {
            if (this.iElementPairs.size() == 2) {
                Object obj2 = this.iElementPairs.get(0);
                Object obj3 = this.iElementPairs.get(1);
                if (obj2 == null) {
                    obj = obj3;
                } else if (obj2 == obj3 || obj3 == null) {
                    obj = obj2;
                }
            }
            if (obj == null) {
                obj = new Composite(this.iElementPairs);
            }
            this.iFormatter = obj;
        }
        return obj;
    }

    private boolean isPrinter(Object obj) {
        if (obj instanceof DateTimePrinter) {
            if (obj instanceof Composite) {
                return ((Composite) obj).isPrinter();
            }
            return true;
        }
        return false;
    }

    private boolean isParser(Object obj) {
        if (obj instanceof DateTimeParser) {
            if (obj instanceof Composite) {
                return ((Composite) obj).isParser();
            }
            return true;
        }
        return false;
    }

    private boolean isFormatter(Object obj) {
        return isPrinter(obj) || isParser(obj);
    }

    static void appendUnknownString(StringBuffer stringBuffer, int i) {
        while (true) {
            i--;
            if (i >= 0) {
                stringBuffer.append((char) 65533);
            } else {
                return;
            }
        }
    }

    static void printUnknownString(Writer writer, int i) throws IOException {
        while (true) {
            i--;
            if (i >= 0) {
                writer.write(65533);
            } else {
                return;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class CharacterLiteral implements DateTimePrinter, DateTimeParser {
        private final char iValue;

        CharacterLiteral(char c) {
            this.iValue = c;
        }

        @Override // org.joda.time.format.DateTimePrinter
        public int estimatePrintedLength() {
            return 1;
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            stringBuffer.append(this.iValue);
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            writer.write(this.iValue);
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial, Locale locale) {
            stringBuffer.append(this.iValue);
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, ReadablePartial readablePartial, Locale locale) throws IOException {
            writer.write(this.iValue);
        }

        @Override // org.joda.time.format.DateTimeParser
        public int estimateParsedLength() {
            return 1;
        }

        @Override // org.joda.time.format.DateTimeParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, String str, int i) {
            char upperCase;
            char upperCase2;
            if (i >= str.length()) {
                return i ^ (-1);
            }
            char charAt = str.charAt(i);
            char c = this.iValue;
            if (charAt != c && (upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(c)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return i ^ (-1);
            }
            return i + 1;
        }
    }

    /* loaded from: classes.dex */
    public static class StringLiteral implements DateTimePrinter, DateTimeParser {
        private final String iValue;

        StringLiteral(String str) {
            this.iValue = str;
        }

        @Override // org.joda.time.format.DateTimePrinter
        public int estimatePrintedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            stringBuffer.append(this.iValue);
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            writer.write(this.iValue);
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial, Locale locale) {
            stringBuffer.append(this.iValue);
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, ReadablePartial readablePartial, Locale locale) throws IOException {
            writer.write(this.iValue);
        }

        @Override // org.joda.time.format.DateTimeParser
        public int estimateParsedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.DateTimeParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, String str, int i) {
            return str.regionMatches(true, i, this.iValue, 0, this.iValue.length()) ? this.iValue.length() + i : i ^ (-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class NumberFormatter implements DateTimePrinter, DateTimeParser {
        protected final DateTimeFieldType iFieldType;
        protected final int iMaxParsedDigits;
        protected final boolean iSigned;

        NumberFormatter(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            this.iFieldType = dateTimeFieldType;
            this.iMaxParsedDigits = i;
            this.iSigned = z;
        }

        @Override // org.joda.time.format.DateTimeParser
        public int estimateParsedLength() {
            return this.iMaxParsedDigits;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
            if (r5 <= '9') goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
            r4 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
            r0 = r0 + 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int parseInto(org.joda.time.format.DateTimeParserBucket r12, java.lang.String r13, int r14) {
            /*
                r11 = this;
                r9 = 57
                r8 = 48
                r7 = 45
                r3 = 0
                int r0 = r11.iMaxParsedDigits
                int r1 = r13.length()
                int r1 = r1 - r14
                int r0 = java.lang.Math.min(r0, r1)
                r2 = r3
                r4 = r0
                r1 = r14
                r0 = r3
            L16:
                if (r0 >= r4) goto La3
                int r5 = r1 + r0
                char r5 = r13.charAt(r5)
                if (r0 != 0) goto L58
                if (r5 == r7) goto L26
                r6 = 43
                if (r5 != r6) goto L58
            L26:
                boolean r6 = r11.iSigned
                if (r6 == 0) goto L58
                if (r5 != r7) goto L43
                r2 = 1
            L2d:
                int r5 = r0 + 1
                if (r5 >= r4) goto La3
                int r5 = r1 + r0
                int r5 = r5 + 1
                char r5 = r13.charAt(r5)
                if (r5 < r8) goto La3
                if (r5 <= r9) goto L45
                r4 = r2
            L3e:
                if (r0 != 0) goto L61
                r1 = r1 ^ (-1)
            L42:
                return r1
            L43:
                r2 = r3
                goto L2d
            L45:
                if (r2 == 0) goto L55
                int r0 = r0 + 1
            L49:
                int r4 = r4 + 1
                int r5 = r13.length()
                int r5 = r5 - r1
                int r4 = java.lang.Math.min(r4, r5)
                goto L16
            L55:
                int r1 = r1 + 1
                goto L49
            L58:
                if (r5 < r8) goto La3
                if (r5 <= r9) goto L5e
                r4 = r2
                goto L3e
            L5e:
                int r0 = r0 + 1
                goto L16
            L61:
                r2 = 9
                if (r0 < r2) goto L76
                int r2 = r1 + r0
                java.lang.String r0 = r13.substring(r1, r2)
                int r0 = java.lang.Integer.parseInt(r0)
                r1 = r2
            L70:
                org.joda.time.DateTimeFieldType r2 = r11.iFieldType
                r12.saveField(r2, r0)
                goto L42
            L76:
                if (r4 == 0) goto La1
                int r2 = r1 + 1
                r3 = r2
            L7b:
                int r2 = r3 + 1
                char r3 = r13.charAt(r3)     // Catch: java.lang.StringIndexOutOfBoundsException -> L99
                int r3 = r3 + (-48)
                int r1 = r1 + r0
                r0 = r3
            L85:
                if (r2 >= r1) goto L9d
                int r3 = r0 << 3
                int r0 = r0 << 1
                int r3 = r3 + r0
                int r0 = r2 + 1
                char r2 = r13.charAt(r2)
                int r2 = r2 + r3
                int r2 = r2 + (-48)
                r10 = r0
                r0 = r2
                r2 = r10
                goto L85
            L99:
                r0 = move-exception
                r1 = r1 ^ (-1)
                goto L42
            L9d:
                if (r4 == 0) goto L70
                int r0 = -r0
                goto L70
            La1:
                r3 = r1
                goto L7b
            La3:
                r4 = r2
                goto L3e
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.NumberFormatter.parseInto(org.joda.time.format.DateTimeParserBucket, java.lang.String, int):int");
        }
    }

    /* loaded from: classes.dex */
    public static class UnpaddedNumber extends NumberFormatter {
        protected UnpaddedNumber(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            super(dateTimeFieldType, i, z);
        }

        @Override // org.joda.time.format.DateTimePrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            try {
                FormatUtils.appendUnpaddedInteger(stringBuffer, this.iFieldType.getField(chronology).get(j));
            } catch (RuntimeException e) {
                stringBuffer.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.writeUnpaddedInteger(writer, this.iFieldType.getField(chronology).get(j));
            } catch (RuntimeException e) {
                writer.write(65533);
            }
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial, Locale locale) {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.appendUnpaddedInteger(stringBuffer, readablePartial.get(this.iFieldType));
                    return;
                } catch (RuntimeException e) {
                    stringBuffer.append((char) 65533);
                    return;
                }
            }
            stringBuffer.append((char) 65533);
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.writeUnpaddedInteger(writer, readablePartial.get(this.iFieldType));
                    return;
                } catch (RuntimeException e) {
                    writer.write(65533);
                    return;
                }
            }
            writer.write(65533);
        }
    }

    /* loaded from: classes.dex */
    public static class PaddedNumber extends NumberFormatter {
        protected final int iMinPrintedDigits;

        protected PaddedNumber(DateTimeFieldType dateTimeFieldType, int i, boolean z, int i2) {
            super(dateTimeFieldType, i, z);
            this.iMinPrintedDigits = i2;
        }

        @Override // org.joda.time.format.DateTimePrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            try {
                FormatUtils.appendPaddedInteger(stringBuffer, this.iFieldType.getField(chronology).get(j), this.iMinPrintedDigits);
            } catch (RuntimeException e) {
                DateTimeFormatterBuilder.appendUnknownString(stringBuffer, this.iMinPrintedDigits);
            }
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.writePaddedInteger(writer, this.iFieldType.getField(chronology).get(j), this.iMinPrintedDigits);
            } catch (RuntimeException e) {
                DateTimeFormatterBuilder.printUnknownString(writer, this.iMinPrintedDigits);
            }
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial, Locale locale) {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.appendPaddedInteger(stringBuffer, readablePartial.get(this.iFieldType), this.iMinPrintedDigits);
                    return;
                } catch (RuntimeException e) {
                    DateTimeFormatterBuilder.appendUnknownString(stringBuffer, this.iMinPrintedDigits);
                    return;
                }
            }
            DateTimeFormatterBuilder.appendUnknownString(stringBuffer, this.iMinPrintedDigits);
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.writePaddedInteger(writer, readablePartial.get(this.iFieldType), this.iMinPrintedDigits);
                    return;
                } catch (RuntimeException e) {
                    DateTimeFormatterBuilder.printUnknownString(writer, this.iMinPrintedDigits);
                    return;
                }
            }
            DateTimeFormatterBuilder.printUnknownString(writer, this.iMinPrintedDigits);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class FixedNumber extends PaddedNumber {
        protected FixedNumber(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            super(dateTimeFieldType, i, z, i);
        }

        @Override // org.joda.time.format.DateTimeFormatterBuilder.NumberFormatter, org.joda.time.format.DateTimeParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, String str, int i) {
            int i2;
            char charAt;
            int parseInto = super.parseInto(dateTimeParserBucket, str, i);
            if (parseInto >= 0 && parseInto != (i2 = this.iMaxParsedDigits + i)) {
                if (this.iSigned && ((charAt = str.charAt(i)) == '-' || charAt == '+')) {
                    i2++;
                }
                if (parseInto > i2) {
                    return (i2 + 1) ^ (-1);
                }
                if (parseInto < i2) {
                    return parseInto ^ (-1);
                }
                return parseInto;
            }
            return parseInto;
        }
    }

    /* loaded from: classes.dex */
    public static class TwoDigitYear implements DateTimePrinter, DateTimeParser {
        private final boolean iLenientParse;
        private final int iPivot;
        private final DateTimeFieldType iType;

        TwoDigitYear(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            this.iType = dateTimeFieldType;
            this.iPivot = i;
            this.iLenientParse = z;
        }

        @Override // org.joda.time.format.DateTimeParser
        public int estimateParsedLength() {
            return this.iLenientParse ? 4 : 2;
        }

        @Override // org.joda.time.format.DateTimeParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, String str, int i) {
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            int length = str.length() - i;
            if (!this.iLenientParse) {
                if (Math.min(2, length) < 2) {
                    return i ^ (-1);
                }
            } else {
                int i6 = 0;
                boolean z = false;
                boolean z2 = false;
                int i7 = length;
                while (i6 < i7) {
                    char charAt = str.charAt(i + i6);
                    if (i6 == 0 && (charAt == '-' || charAt == '+')) {
                        boolean z3 = charAt == '-';
                        if (z3) {
                            i6++;
                            z = z3;
                            z2 = true;
                        } else {
                            i++;
                            z2 = true;
                            i7--;
                            z = z3;
                        }
                    } else if (charAt < '0' || charAt > '9') {
                        break;
                    } else {
                        i6++;
                    }
                }
                if (i6 == 0) {
                    return i ^ (-1);
                }
                if (z2 || i6 != 2) {
                    if (i6 >= 9) {
                        i3 = i + i6;
                        i4 = Integer.parseInt(str.substring(i, i3));
                    } else {
                        int i8 = z ? i + 1 : i;
                        int i9 = i8 + 1;
                        try {
                            int charAt2 = str.charAt(i8) - '0';
                            i3 = i + i6;
                            i4 = charAt2;
                            for (int i10 = i9; i10 < i3; i10++) {
                                i4 = (str.charAt(i10) + ((i4 << 3) + (i4 << 1))) - 48;
                            }
                            if (z) {
                                i4 = -i4;
                            }
                        } catch (StringIndexOutOfBoundsException e) {
                            return i ^ (-1);
                        }
                    }
                    dateTimeParserBucket.saveField(this.iType, i4);
                    return i3;
                }
            }
            char charAt3 = str.charAt(i);
            if (charAt3 < '0' || charAt3 > '9') {
                return i ^ (-1);
            }
            int i11 = charAt3 - '0';
            char charAt4 = str.charAt(i + 1);
            if (charAt4 < '0' || charAt4 > '9') {
                return i ^ (-1);
            }
            int i12 = (((i11 << 1) + (i11 << 3)) + charAt4) - 48;
            int i13 = this.iPivot;
            if (dateTimeParserBucket.getPivotYear() != null) {
                i13 = dateTimeParserBucket.getPivotYear().intValue();
            }
            int i14 = i13 - 50;
            if (i14 >= 0) {
                i2 = i14 % 100;
            } else {
                i2 = ((i14 + 1) % 100) + 99;
            }
            if (i12 < i2) {
                i5 = 100;
            }
            dateTimeParserBucket.saveField(this.iType, ((i5 + i14) - i2) + i12);
            return i + 2;
        }

        @Override // org.joda.time.format.DateTimePrinter
        public int estimatePrintedLength() {
            return 2;
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            int twoDigitYear = getTwoDigitYear(j, chronology);
            if (twoDigitYear < 0) {
                stringBuffer.append((char) 65533);
                stringBuffer.append((char) 65533);
                return;
            }
            FormatUtils.appendPaddedInteger(stringBuffer, twoDigitYear, 2);
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(j, chronology);
            if (twoDigitYear < 0) {
                writer.write(65533);
                writer.write(65533);
                return;
            }
            FormatUtils.writePaddedInteger(writer, twoDigitYear, 2);
        }

        private int getTwoDigitYear(long j, Chronology chronology) {
            try {
                int i = this.iType.getField(chronology).get(j);
                if (i < 0) {
                    i = -i;
                }
                return i % 100;
            } catch (RuntimeException e) {
                return -1;
            }
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial, Locale locale) {
            int twoDigitYear = getTwoDigitYear(readablePartial);
            if (twoDigitYear < 0) {
                stringBuffer.append((char) 65533);
                stringBuffer.append((char) 65533);
                return;
            }
            FormatUtils.appendPaddedInteger(stringBuffer, twoDigitYear, 2);
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, ReadablePartial readablePartial, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(readablePartial);
            if (twoDigitYear < 0) {
                writer.write(65533);
                writer.write(65533);
                return;
            }
            FormatUtils.writePaddedInteger(writer, twoDigitYear, 2);
        }

        private int getTwoDigitYear(ReadablePartial readablePartial) {
            if (readablePartial.isSupported(this.iType)) {
                try {
                    int i = readablePartial.get(this.iType);
                    if (i < 0) {
                        i = -i;
                    }
                    return i % 100;
                } catch (RuntimeException e) {
                }
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static class TextField implements DateTimePrinter, DateTimeParser {
        private static Map<Locale, Map<DateTimeFieldType, Object[]>> cParseCache = new HashMap();
        private final DateTimeFieldType iFieldType;
        private final boolean iShort;

        TextField(DateTimeFieldType dateTimeFieldType, boolean z) {
            this.iFieldType = dateTimeFieldType;
            this.iShort = z;
        }

        @Override // org.joda.time.format.DateTimePrinter
        public int estimatePrintedLength() {
            return this.iShort ? 6 : 20;
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            try {
                stringBuffer.append(print(j, chronology, locale));
            } catch (RuntimeException e) {
                stringBuffer.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                writer.write(print(j, chronology, locale));
            } catch (RuntimeException e) {
                writer.write(65533);
            }
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial, Locale locale) {
            try {
                stringBuffer.append(print(readablePartial, locale));
            } catch (RuntimeException e) {
                stringBuffer.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, ReadablePartial readablePartial, Locale locale) throws IOException {
            try {
                writer.write(print(readablePartial, locale));
            } catch (RuntimeException e) {
                writer.write(65533);
            }
        }

        private String print(long j, Chronology chronology, Locale locale) {
            DateTimeField field = this.iFieldType.getField(chronology);
            return this.iShort ? field.getAsShortText(j, locale) : field.getAsText(j, locale);
        }

        private String print(ReadablePartial readablePartial, Locale locale) {
            if (readablePartial.isSupported(this.iFieldType)) {
                DateTimeField field = this.iFieldType.getField(readablePartial.getChronology());
                if (this.iShort) {
                    return field.getAsShortText(readablePartial, locale);
                }
                return field.getAsText(readablePartial, locale);
            }
            return "�";
        }

        @Override // org.joda.time.format.DateTimeParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.DateTimeParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, String str, int i) {
            HashMap hashMap;
            Set set;
            int intValue;
            Locale locale = dateTimeParserBucket.getLocale();
            synchronized (cParseCache) {
                Map<DateTimeFieldType, Object[]> map = cParseCache.get(locale);
                if (map == null) {
                    HashMap hashMap2 = new HashMap();
                    cParseCache.put(locale, hashMap2);
                    hashMap = hashMap2;
                } else {
                    hashMap = map;
                }
                Object[] objArr = hashMap.get(this.iFieldType);
                if (objArr == null) {
                    set = new HashSet(32);
                    MutableDateTime.Property property = new MutableDateTime(0L, DateTimeZone.UTC).property(this.iFieldType);
                    int minimumValueOverall = property.getMinimumValueOverall();
                    int maximumValueOverall = property.getMaximumValueOverall();
                    if (maximumValueOverall - minimumValueOverall > 32) {
                        return i ^ (-1);
                    }
                    intValue = property.getMaximumTextLength(locale);
                    while (minimumValueOverall <= maximumValueOverall) {
                        property.set(minimumValueOverall);
                        set.add(property.getAsShortText(locale));
                        set.add(property.getAsShortText(locale).toLowerCase(locale));
                        set.add(property.getAsShortText(locale).toUpperCase(locale));
                        set.add(property.getAsText(locale));
                        set.add(property.getAsText(locale).toLowerCase(locale));
                        set.add(property.getAsText(locale).toUpperCase(locale));
                        minimumValueOverall++;
                    }
                    if ("en".equals(locale.getLanguage()) && this.iFieldType == DateTimeFieldType.era()) {
                        set.add("BCE");
                        set.add("bce");
                        set.add("CE");
                        set.add("ce");
                        intValue = 3;
                    }
                    hashMap.put(this.iFieldType, new Object[]{set, Integer.valueOf(intValue)});
                } else {
                    set = (Set) objArr[0];
                    intValue = ((Integer) objArr[1]).intValue();
                }
                for (int min = Math.min(str.length(), intValue + i); min > i; min--) {
                    String substring = str.substring(i, min);
                    if (set.contains(substring)) {
                        dateTimeParserBucket.saveField(this.iFieldType, substring, locale);
                        return min;
                    }
                }
                return i ^ (-1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Fraction implements DateTimePrinter, DateTimeParser {
        private final DateTimeFieldType iFieldType;
        protected int iMaxDigits;
        protected int iMinDigits;

        protected Fraction(DateTimeFieldType dateTimeFieldType, int i, int i2) {
            this.iFieldType = dateTimeFieldType;
            i2 = i2 > 18 ? 18 : i2;
            this.iMinDigits = i;
            this.iMaxDigits = i2;
        }

        @Override // org.joda.time.format.DateTimePrinter
        public int estimatePrintedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            try {
                printTo(stringBuffer, null, j, chronology);
            } catch (IOException e) {
            }
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            printTo(null, writer, j, chronology);
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial, Locale locale) {
            try {
                printTo(stringBuffer, null, readablePartial.getChronology().set(readablePartial, 0L), readablePartial.getChronology());
            } catch (IOException e) {
            }
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, ReadablePartial readablePartial, Locale locale) throws IOException {
            printTo(null, writer, readablePartial.getChronology().set(readablePartial, 0L), readablePartial.getChronology());
        }

        protected void printTo(StringBuffer stringBuffer, Writer writer, long j, Chronology chronology) throws IOException {
            String l;
            DateTimeField field = this.iFieldType.getField(chronology);
            int i = this.iMinDigits;
            try {
                long remainder = field.remainder(j);
                if (remainder == 0) {
                    if (stringBuffer != null) {
                        while (true) {
                            i--;
                            if (i >= 0) {
                                stringBuffer.append('0');
                            } else {
                                return;
                            }
                        }
                    } else {
                        while (true) {
                            i--;
                            if (i >= 0) {
                                writer.write(48);
                            } else {
                                return;
                            }
                        }
                    }
                } else {
                    long[] fractionData = getFractionData(remainder, field);
                    long j2 = fractionData[0];
                    int i2 = (int) fractionData[1];
                    if ((2147483647L & j2) == j2) {
                        l = Integer.toString((int) j2);
                    } else {
                        l = Long.toString(j2);
                    }
                    int length = l.length();
                    while (length < i2) {
                        if (stringBuffer != null) {
                            stringBuffer.append('0');
                        } else {
                            writer.write(48);
                        }
                        i--;
                        i2--;
                    }
                    if (i < i2) {
                        while (i < i2 && length > 1 && l.charAt(length - 1) == '0') {
                            i2--;
                            length--;
                        }
                        if (length < l.length()) {
                            if (stringBuffer != null) {
                                for (int i3 = 0; i3 < length; i3++) {
                                    stringBuffer.append(l.charAt(i3));
                                }
                                return;
                            }
                            for (int i4 = 0; i4 < length; i4++) {
                                writer.write(l.charAt(i4));
                            }
                            return;
                        }
                    }
                    if (stringBuffer != null) {
                        stringBuffer.append(l);
                    } else {
                        writer.write(l);
                    }
                }
            } catch (RuntimeException e) {
                if (stringBuffer != null) {
                    DateTimeFormatterBuilder.appendUnknownString(stringBuffer, i);
                } else {
                    DateTimeFormatterBuilder.printUnknownString(writer, i);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[LOOP:0: B:3:0x000b->B:27:0x007a, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0017 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private long[] getFractionData(long r8, org.joda.time.DateTimeField r10) {
            /*
                r7 = this;
                org.joda.time.DurationField r0 = r10.getDurationField()
                long r3 = r0.getUnitMillis()
                int r0 = r7.iMaxDigits
                r2 = r0
            Lb:
                switch(r2) {
                    case 1: goto L24;
                    case 2: goto L27;
                    case 3: goto L2a;
                    case 4: goto L2d;
                    case 5: goto L30;
                    case 6: goto L34;
                    case 7: goto L38;
                    case 8: goto L3c;
                    case 9: goto L40;
                    case 10: goto L44;
                    case 11: goto L4a;
                    case 12: goto L50;
                    case 13: goto L56;
                    case 14: goto L5c;
                    case 15: goto L62;
                    case 16: goto L68;
                    case 17: goto L6e;
                    case 18: goto L74;
                    default: goto Le;
                }
            Le:
                r0 = 1
            L10:
                long r5 = r3 * r0
                long r5 = r5 / r0
                int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r5 != 0) goto L7a
                r5 = 2
                long[] r5 = new long[r5]
                r6 = 0
                long r0 = r0 * r8
                long r0 = r0 / r3
                r5[r6] = r0
                r0 = 1
                long r1 = (long) r2
                r5[r0] = r1
                return r5
            L24:
                r0 = 10
                goto L10
            L27:
                r0 = 100
                goto L10
            L2a:
                r0 = 1000(0x3e8, double:4.94E-321)
                goto L10
            L2d:
                r0 = 10000(0x2710, double:4.9407E-320)
                goto L10
            L30:
                r0 = 100000(0x186a0, double:4.94066E-319)
                goto L10
            L34:
                r0 = 1000000(0xf4240, double:4.940656E-318)
                goto L10
            L38:
                r0 = 10000000(0x989680, double:4.9406565E-317)
                goto L10
            L3c:
                r0 = 100000000(0x5f5e100, double:4.94065646E-316)
                goto L10
            L40:
                r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
                goto L10
            L44:
                r0 = 10000000000(0x2540be400, double:4.9406564584E-314)
                goto L10
            L4a:
                r0 = 100000000000(0x174876e800, double:4.9406564584E-313)
                goto L10
            L50:
                r0 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
                goto L10
            L56:
                r0 = 10000000000000(0x9184e72a000, double:4.9406564584125E-311)
                goto L10
            L5c:
                r0 = 100000000000000(0x5af3107a4000, double:4.94065645841247E-310)
                goto L10
            L62:
                r0 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
                goto L10
            L68:
                r0 = 10000000000000000(0x2386f26fc10000, double:5.431165199810528E-308)
                goto L10
            L6e:
                r0 = 100000000000000000(0x16345785d8a0000, double:5.620395787888205E-302)
                goto L10
            L74:
                r0 = 1000000000000000000(0xde0b6b3a7640000, double:7.832953389245686E-242)
                goto L10
            L7a:
                int r0 = r2 + (-1)
                r2 = r0
                goto Lb
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.Fraction.getFractionData(long, org.joda.time.DateTimeField):long[]");
        }

        @Override // org.joda.time.format.DateTimeParser
        public int estimateParsedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.DateTimeParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, String str, int i) {
            DateTimeField field = this.iFieldType.getField(dateTimeParserBucket.getChronology());
            int min = Math.min(this.iMaxDigits, str.length() - i);
            long j = 0;
            long unitMillis = field.getDurationField().getUnitMillis() * 10;
            int i2 = 0;
            while (i2 < min) {
                char charAt = str.charAt(i + i2);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                i2++;
                unitMillis /= 10;
                j += (charAt - '0') * unitMillis;
            }
            long j2 = j / 10;
            if (i2 == 0) {
                return i ^ (-1);
            }
            if (j2 > 2147483647L) {
                return i ^ (-1);
            }
            dateTimeParserBucket.saveField(new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), MillisDurationField.INSTANCE, field.getDurationField()), (int) j2);
            return i2 + i;
        }
    }

    /* loaded from: classes.dex */
    public static class TimeZoneOffset implements DateTimePrinter, DateTimeParser {
        private final int iMaxFields;
        private final int iMinFields;
        private final boolean iShowSeparators;
        private final String iZeroOffsetParseText;
        private final String iZeroOffsetPrintText;

        TimeZoneOffset(String str, String str2, boolean z, int i, int i2) {
            int i3 = 4;
            this.iZeroOffsetPrintText = str;
            this.iZeroOffsetParseText = str2;
            this.iShowSeparators = z;
            if (i <= 0 || i2 < i) {
                throw new IllegalArgumentException();
            }
            if (i > 4) {
                i2 = 4;
            } else {
                i3 = i;
            }
            this.iMinFields = i3;
            this.iMaxFields = i2;
        }

        @Override // org.joda.time.format.DateTimePrinter
        public int estimatePrintedLength() {
            int i = (this.iMinFields + 1) << 1;
            if (this.iShowSeparators) {
                i += this.iMinFields - 1;
            }
            if (this.iZeroOffsetPrintText != null && this.iZeroOffsetPrintText.length() > i) {
                return this.iZeroOffsetPrintText.length();
            }
            return i;
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            if (dateTimeZone != null) {
                if (i == 0 && this.iZeroOffsetPrintText != null) {
                    stringBuffer.append(this.iZeroOffsetPrintText);
                    return;
                }
                if (i >= 0) {
                    stringBuffer.append('+');
                } else {
                    stringBuffer.append('-');
                    i = -i;
                }
                int i2 = i / DateTimeConstants.MILLIS_PER_HOUR;
                FormatUtils.appendPaddedInteger(stringBuffer, i2, 2);
                if (this.iMaxFields != 1) {
                    int i3 = i - (i2 * DateTimeConstants.MILLIS_PER_HOUR);
                    if (i3 != 0 || this.iMinFields > 1) {
                        int i4 = i3 / DateTimeConstants.MILLIS_PER_MINUTE;
                        if (this.iShowSeparators) {
                            stringBuffer.append(':');
                        }
                        FormatUtils.appendPaddedInteger(stringBuffer, i4, 2);
                        if (this.iMaxFields != 2) {
                            int i5 = i3 - (i4 * DateTimeConstants.MILLIS_PER_MINUTE);
                            if (i5 != 0 || this.iMinFields > 2) {
                                int i6 = i5 / 1000;
                                if (this.iShowSeparators) {
                                    stringBuffer.append(':');
                                }
                                FormatUtils.appendPaddedInteger(stringBuffer, i6, 2);
                                if (this.iMaxFields != 3) {
                                    int i7 = i5 - (i6 * 1000);
                                    if (i7 != 0 || this.iMinFields > 3) {
                                        if (this.iShowSeparators) {
                                            stringBuffer.append('.');
                                        }
                                        FormatUtils.appendPaddedInteger(stringBuffer, i7, 3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            if (dateTimeZone != null) {
                if (i == 0 && this.iZeroOffsetPrintText != null) {
                    writer.write(this.iZeroOffsetPrintText);
                    return;
                }
                if (i >= 0) {
                    writer.write(43);
                } else {
                    writer.write(45);
                    i = -i;
                }
                int i2 = i / DateTimeConstants.MILLIS_PER_HOUR;
                FormatUtils.writePaddedInteger(writer, i2, 2);
                if (this.iMaxFields != 1) {
                    int i3 = i - (i2 * DateTimeConstants.MILLIS_PER_HOUR);
                    if (i3 != 0 || this.iMinFields != 1) {
                        int i4 = i3 / DateTimeConstants.MILLIS_PER_MINUTE;
                        if (this.iShowSeparators) {
                            writer.write(58);
                        }
                        FormatUtils.writePaddedInteger(writer, i4, 2);
                        if (this.iMaxFields != 2) {
                            int i5 = i3 - (i4 * DateTimeConstants.MILLIS_PER_MINUTE);
                            if (i5 != 0 || this.iMinFields != 2) {
                                int i6 = i5 / 1000;
                                if (this.iShowSeparators) {
                                    writer.write(58);
                                }
                                FormatUtils.writePaddedInteger(writer, i6, 2);
                                if (this.iMaxFields != 3) {
                                    int i7 = i5 - (i6 * 1000);
                                    if (i7 != 0 || this.iMinFields != 3) {
                                        if (this.iShowSeparators) {
                                            writer.write(46);
                                        }
                                        FormatUtils.writePaddedInteger(writer, i7, 3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial, Locale locale) {
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, ReadablePartial readablePartial, Locale locale) throws IOException {
        }

        @Override // org.joda.time.format.DateTimeParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.DateTimeParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, String str, int i) {
            boolean z;
            int i2;
            int i3;
            char charAt;
            boolean z2 = false;
            int length = str.length() - i;
            if (this.iZeroOffsetParseText != null) {
                if (this.iZeroOffsetParseText.length() == 0) {
                    if (length <= 0 || ((charAt = str.charAt(i)) != '-' && charAt != '+')) {
                        dateTimeParserBucket.setOffset((Integer) 0);
                        return i;
                    }
                } else if (str.regionMatches(true, i, this.iZeroOffsetParseText, 0, this.iZeroOffsetParseText.length())) {
                    dateTimeParserBucket.setOffset((Integer) 0);
                    return i + this.iZeroOffsetParseText.length();
                }
            }
            if (length <= 1) {
                return i ^ (-1);
            }
            char charAt2 = str.charAt(i);
            if (charAt2 == '-') {
                z = true;
            } else if (charAt2 != '+') {
                return i ^ (-1);
            } else {
                z = false;
            }
            int i4 = length - 1;
            int i5 = i + 1;
            if (digitCount(str, i5, 2) < 2) {
                return i5 ^ (-1);
            }
            int parseTwoDigits = FormatUtils.parseTwoDigits(str, i5);
            if (parseTwoDigits > 23) {
                return i5 ^ (-1);
            }
            int i6 = parseTwoDigits * DateTimeConstants.MILLIS_PER_HOUR;
            int i7 = i4 - 2;
            int i8 = i5 + 2;
            if (i7 <= 0) {
                i2 = i6;
                i3 = i8;
            } else {
                char charAt3 = str.charAt(i8);
                if (charAt3 == ':') {
                    i7--;
                    i8++;
                    z2 = true;
                } else if (charAt3 < '0' || charAt3 > '9') {
                    i2 = i6;
                    i3 = i8;
                }
                int digitCount = digitCount(str, i8, 2);
                if (digitCount == 0 && !z2) {
                    i2 = i6;
                    i3 = i8;
                } else if (digitCount < 2) {
                    return i8 ^ (-1);
                } else {
                    int parseTwoDigits2 = FormatUtils.parseTwoDigits(str, i8);
                    if (parseTwoDigits2 > 59) {
                        return i8 ^ (-1);
                    }
                    int i9 = i6 + (parseTwoDigits2 * DateTimeConstants.MILLIS_PER_MINUTE);
                    int i10 = i7 - 2;
                    int i11 = i8 + 2;
                    if (i10 <= 0) {
                        i2 = i9;
                        i3 = i11;
                    } else {
                        if (z2) {
                            if (str.charAt(i11) != ':') {
                                i2 = i9;
                                i3 = i11;
                            } else {
                                i10--;
                                i11++;
                            }
                        }
                        int digitCount2 = digitCount(str, i11, 2);
                        if (digitCount2 == 0 && !z2) {
                            i2 = i9;
                            i3 = i11;
                        } else if (digitCount2 < 2) {
                            return i11 ^ (-1);
                        } else {
                            int parseTwoDigits3 = FormatUtils.parseTwoDigits(str, i11);
                            if (parseTwoDigits3 > 59) {
                                return i11 ^ (-1);
                            }
                            int i12 = i9 + (parseTwoDigits3 * 1000);
                            int i13 = i10 - 2;
                            int i14 = i11 + 2;
                            if (i13 <= 0) {
                                i2 = i12;
                                i3 = i14;
                            } else {
                                if (z2) {
                                    if (str.charAt(i14) == '.' || str.charAt(i14) == ',') {
                                        int i15 = i13 - 1;
                                        i14++;
                                    } else {
                                        i2 = i12;
                                        i3 = i14;
                                    }
                                }
                                int digitCount3 = digitCount(str, i14, 3);
                                if (digitCount3 == 0 && !z2) {
                                    i2 = i12;
                                    i3 = i14;
                                } else if (digitCount3 < 1) {
                                    return i14 ^ (-1);
                                } else {
                                    int i16 = i14 + 1;
                                    int charAt4 = ((str.charAt(i14) - '0') * 100) + i12;
                                    if (digitCount3 > 1) {
                                        i3 = i16 + 1;
                                        i2 = ((str.charAt(i16) - '0') * 10) + charAt4;
                                        if (digitCount3 > 2) {
                                            i2 += str.charAt(i3) - '0';
                                            i3++;
                                        }
                                    } else {
                                        i2 = charAt4;
                                        i3 = i16;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            dateTimeParserBucket.setOffset(Integer.valueOf(z ? -i2 : i2));
            return i3;
        }

        private int digitCount(String str, int i, int i2) {
            int i3 = 0;
            for (int min = Math.min(str.length() - i, i2); min > 0; min--) {
                char charAt = str.charAt(i + i3);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                i3++;
            }
            return i3;
        }
    }

    /* loaded from: classes.dex */
    public static class TimeZoneName implements DateTimePrinter, DateTimeParser {
        static final int LONG_NAME = 0;
        static final int SHORT_NAME = 1;
        private final Map<String, DateTimeZone> iParseLookup;
        private final int iType;

        TimeZoneName(int i, Map<String, DateTimeZone> map) {
            this.iType = i;
            this.iParseLookup = map;
        }

        @Override // org.joda.time.format.DateTimePrinter
        public int estimatePrintedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            stringBuffer.append(print(j - i, dateTimeZone, locale));
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            writer.write(print(j - i, dateTimeZone, locale));
        }

        private String print(long j, DateTimeZone dateTimeZone, Locale locale) {
            if (dateTimeZone == null) {
                return "";
            }
            switch (this.iType) {
                case 0:
                    return dateTimeZone.getName(j, locale);
                case 1:
                    return dateTimeZone.getShortName(j, locale);
                default:
                    return "";
            }
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial, Locale locale) {
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, ReadablePartial readablePartial, Locale locale) throws IOException {
        }

        @Override // org.joda.time.format.DateTimeParser
        public int estimateParsedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.DateTimeParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, String str, int i) {
            String substring = str.substring(i);
            for (String str2 : this.iParseLookup.keySet()) {
                if (substring.startsWith(str2)) {
                    dateTimeParserBucket.setZone(this.iParseLookup.get(str2));
                    return str2.length() + i;
                }
            }
            return i ^ (-1);
        }
    }

    /* loaded from: classes.dex */
    public enum TimeZoneId implements DateTimePrinter, DateTimeParser {
        INSTANCE;
        
        static final Set<String> ALL_IDS = DateTimeZone.getAvailableIDs();
        static final int MAX_LENGTH;

        static {
            int i = 0;
            Iterator<String> it = ALL_IDS.iterator();
            while (true) {
                int i2 = i;
                if (it.hasNext()) {
                    i = Math.max(i2, it.next().length());
                } else {
                    MAX_LENGTH = i2;
                    return;
                }
            }
        }

        @Override // org.joda.time.format.DateTimePrinter
        public int estimatePrintedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            stringBuffer.append(dateTimeZone != null ? dateTimeZone.getID() : "");
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            writer.write(dateTimeZone != null ? dateTimeZone.getID() : "");
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial, Locale locale) {
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, ReadablePartial readablePartial, Locale locale) throws IOException {
        }

        @Override // org.joda.time.format.DateTimeParser
        public int estimateParsedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.DateTimeParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, String str, int i) {
            String substring = str.substring(i);
            for (String str2 : ALL_IDS) {
                if (substring.startsWith(str2)) {
                    dateTimeParserBucket.setZone(DateTimeZone.forID(str2));
                    return str2.length() + i;
                }
            }
            return i ^ (-1);
        }
    }

    /* loaded from: classes.dex */
    public static class Composite implements DateTimePrinter, DateTimeParser {
        private final int iParsedLengthEstimate;
        private final DateTimeParser[] iParsers;
        private final int iPrintedLengthEstimate;
        private final DateTimePrinter[] iPrinters;

        Composite(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            decompose(list, arrayList, arrayList2);
            if (arrayList.size() <= 0) {
                this.iPrinters = null;
                this.iPrintedLengthEstimate = 0;
            } else {
                int size = arrayList.size();
                this.iPrinters = new DateTimePrinter[size];
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    DateTimePrinter dateTimePrinter = (DateTimePrinter) arrayList.get(i2);
                    i += dateTimePrinter.estimatePrintedLength();
                    this.iPrinters[i2] = dateTimePrinter;
                }
                this.iPrintedLengthEstimate = i;
            }
            if (arrayList2.size() <= 0) {
                this.iParsers = null;
                this.iParsedLengthEstimate = 0;
                return;
            }
            int size2 = arrayList2.size();
            this.iParsers = new DateTimeParser[size2];
            int i3 = 0;
            for (int i4 = 0; i4 < size2; i4++) {
                DateTimeParser dateTimeParser = (DateTimeParser) arrayList2.get(i4);
                i3 += dateTimeParser.estimateParsedLength();
                this.iParsers[i4] = dateTimeParser;
            }
            this.iParsedLengthEstimate = i3;
        }

        @Override // org.joda.time.format.DateTimePrinter
        public int estimatePrintedLength() {
            return this.iPrintedLengthEstimate;
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            DateTimePrinter[] dateTimePrinterArr = this.iPrinters;
            if (dateTimePrinterArr == null) {
                throw new UnsupportedOperationException();
            }
            Locale locale2 = locale == null ? Locale.getDefault() : locale;
            for (DateTimePrinter dateTimePrinter : dateTimePrinterArr) {
                dateTimePrinter.printTo(stringBuffer, j, chronology, i, dateTimeZone, locale2);
            }
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            DateTimePrinter[] dateTimePrinterArr = this.iPrinters;
            if (dateTimePrinterArr == null) {
                throw new UnsupportedOperationException();
            }
            Locale locale2 = locale == null ? Locale.getDefault() : locale;
            for (DateTimePrinter dateTimePrinter : dateTimePrinterArr) {
                dateTimePrinter.printTo(writer, j, chronology, i, dateTimeZone, locale2);
            }
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial, Locale locale) {
            DateTimePrinter[] dateTimePrinterArr = this.iPrinters;
            if (dateTimePrinterArr == null) {
                throw new UnsupportedOperationException();
            }
            if (locale == null) {
                locale = Locale.getDefault();
            }
            for (DateTimePrinter dateTimePrinter : dateTimePrinterArr) {
                dateTimePrinter.printTo(stringBuffer, readablePartial, locale);
            }
        }

        @Override // org.joda.time.format.DateTimePrinter
        public void printTo(Writer writer, ReadablePartial readablePartial, Locale locale) throws IOException {
            DateTimePrinter[] dateTimePrinterArr = this.iPrinters;
            if (dateTimePrinterArr == null) {
                throw new UnsupportedOperationException();
            }
            if (locale == null) {
                locale = Locale.getDefault();
            }
            for (DateTimePrinter dateTimePrinter : dateTimePrinterArr) {
                dateTimePrinter.printTo(writer, readablePartial, locale);
            }
        }

        @Override // org.joda.time.format.DateTimeParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        @Override // org.joda.time.format.DateTimeParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, String str, int i) {
            DateTimeParser[] dateTimeParserArr = this.iParsers;
            if (dateTimeParserArr == null) {
                throw new UnsupportedOperationException();
            }
            int length = dateTimeParserArr.length;
            for (int i2 = 0; i2 < length && i >= 0; i2++) {
                i = dateTimeParserArr[i2].parseInto(dateTimeParserBucket, str, i);
            }
            return i;
        }

        boolean isPrinter() {
            return this.iPrinters != null;
        }

        boolean isParser() {
            return this.iParsers != null;
        }

        private void decompose(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                Object obj = list.get(i);
                if (obj instanceof DateTimePrinter) {
                    if (obj instanceof Composite) {
                        addArrayToList(list2, ((Composite) obj).iPrinters);
                    } else {
                        list2.add(obj);
                    }
                }
                Object obj2 = list.get(i + 1);
                if (obj2 instanceof DateTimeParser) {
                    if (obj2 instanceof Composite) {
                        addArrayToList(list3, ((Composite) obj2).iParsers);
                    } else {
                        list3.add(obj2);
                    }
                }
            }
        }

        private void addArrayToList(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class MatchingParser implements DateTimeParser {
        private final int iParsedLengthEstimate;
        private final DateTimeParser[] iParsers;

        MatchingParser(DateTimeParser[] dateTimeParserArr) {
            int i;
            this.iParsers = dateTimeParserArr;
            int i2 = 0;
            int length = dateTimeParserArr.length;
            while (true) {
                int i3 = length - 1;
                if (i3 >= 0) {
                    DateTimeParser dateTimeParser = dateTimeParserArr[i3];
                    if (dateTimeParser == null || (i = dateTimeParser.estimateParsedLength()) <= i2) {
                        i = i2;
                    }
                    i2 = i;
                    length = i3;
                } else {
                    this.iParsedLengthEstimate = i2;
                    return;
                }
            }
        }

        @Override // org.joda.time.format.DateTimeParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
            if (r4 != r13) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
            if (r1 == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
            if (r2 == null) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
            r11.restoreState(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
            return r0 ^ (-1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
            if (r4 > r13) goto L12;
         */
        @Override // org.joda.time.format.DateTimeParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int parseInto(org.joda.time.format.DateTimeParserBucket r11, java.lang.String r12, int r13) {
            /*
                r10 = this;
                r5 = 0
                org.joda.time.format.DateTimeParser[] r7 = r10.iParsers
                int r8 = r7.length
                java.lang.Object r9 = r11.saveState()
                r2 = 0
                r6 = r5
                r0 = r13
                r4 = r13
            Lc:
                if (r6 >= r8) goto L5b
                r1 = r7[r6]
                if (r1 != 0) goto L23
                if (r4 > r13) goto L15
            L14:
                return r13
            L15:
                r1 = 1
            L16:
                if (r4 > r13) goto L1c
                if (r4 != r13) goto L55
                if (r1 == 0) goto L55
            L1c:
                if (r2 == 0) goto L21
                r11.restoreState(r2)
            L21:
                r13 = r4
                goto L14
            L23:
                int r3 = r1.parseInto(r11, r12, r13)
                if (r3 < r13) goto L4b
                if (r3 <= r4) goto L58
                int r1 = r12.length()
                if (r3 >= r1) goto L3b
                int r1 = r6 + 1
                if (r1 >= r8) goto L3b
                int r1 = r6 + 1
                r1 = r7[r1]
                if (r1 != 0) goto L3d
            L3b:
                r13 = r3
                goto L14
            L3d:
                java.lang.Object r1 = r11.saveState()
                r2 = r3
            L42:
                r11.restoreState(r9)
                int r3 = r6 + 1
                r6 = r3
                r4 = r2
                r2 = r1
                goto Lc
            L4b:
                if (r3 >= 0) goto L58
                r1 = r3 ^ (-1)
                if (r1 <= r0) goto L58
                r0 = r1
                r1 = r2
                r2 = r4
                goto L42
            L55:
                r13 = r0 ^ (-1)
                goto L14
            L58:
                r1 = r2
                r2 = r4
                goto L42
            L5b:
                r1 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.MatchingParser.parseInto(org.joda.time.format.DateTimeParserBucket, java.lang.String, int):int");
        }
    }
}
