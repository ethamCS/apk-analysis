package org.joda.time.base;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.ReadableDateTime;
import org.joda.time.format.DateTimeFormat;
/* loaded from: classes.dex */
public abstract class AbstractDateTime extends AbstractInstant implements ReadableDateTime {
    @Override // org.joda.time.base.AbstractInstant, org.joda.time.ReadableInstant
    public int get(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        return dateTimeFieldType.getField(getChronology()).get(getMillis());
    }

    @Override // org.joda.time.ReadableDateTime
    public int getEra() {
        return getChronology().era().get(getMillis());
    }

    @Override // org.joda.time.ReadableDateTime
    public int getCenturyOfEra() {
        return getChronology().centuryOfEra().get(getMillis());
    }

    @Override // org.joda.time.ReadableDateTime
    public int getYearOfEra() {
        return getChronology().yearOfEra().get(getMillis());
    }

    @Override // org.joda.time.ReadableDateTime
    public int getYearOfCentury() {
        return getChronology().yearOfCentury().get(getMillis());
    }

    @Override // org.joda.time.ReadableDateTime
    public int getYear() {
        return getChronology().year().get(getMillis());
    }

    @Override // org.joda.time.ReadableDateTime
    public int getWeekyear() {
        return getChronology().weekyear().get(getMillis());
    }

    @Override // org.joda.time.ReadableDateTime
    public int getMonthOfYear() {
        return getChronology().monthOfYear().get(getMillis());
    }

    @Override // org.joda.time.ReadableDateTime
    public int getWeekOfWeekyear() {
        return getChronology().weekOfWeekyear().get(getMillis());
    }

    @Override // org.joda.time.ReadableDateTime
    public int getDayOfYear() {
        return getChronology().dayOfYear().get(getMillis());
    }

    @Override // org.joda.time.ReadableDateTime
    public int getDayOfMonth() {
        return getChronology().dayOfMonth().get(getMillis());
    }

    @Override // org.joda.time.ReadableDateTime
    public int getDayOfWeek() {
        return getChronology().dayOfWeek().get(getMillis());
    }

    @Override // org.joda.time.ReadableDateTime
    public int getHourOfDay() {
        return getChronology().hourOfDay().get(getMillis());
    }

    @Override // org.joda.time.ReadableDateTime
    public int getMinuteOfDay() {
        return getChronology().minuteOfDay().get(getMillis());
    }

    @Override // org.joda.time.ReadableDateTime
    public int getMinuteOfHour() {
        return getChronology().minuteOfHour().get(getMillis());
    }

    @Override // org.joda.time.ReadableDateTime
    public int getSecondOfDay() {
        return getChronology().secondOfDay().get(getMillis());
    }

    @Override // org.joda.time.ReadableDateTime
    public int getSecondOfMinute() {
        return getChronology().secondOfMinute().get(getMillis());
    }

    @Override // org.joda.time.ReadableDateTime
    public int getMillisOfDay() {
        return getChronology().millisOfDay().get(getMillis());
    }

    @Override // org.joda.time.ReadableDateTime
    public int getMillisOfSecond() {
        return getChronology().millisOfSecond().get(getMillis());
    }

    public Calendar toCalendar(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Calendar calendar = Calendar.getInstance(getZone().toTimeZone(), locale);
        calendar.setTime(toDate());
        return calendar;
    }

    public GregorianCalendar toGregorianCalendar() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(getZone().toTimeZone());
        gregorianCalendar.setTime(toDate());
        return gregorianCalendar;
    }

    @Override // org.joda.time.ReadableDateTime
    public String toString(String str) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).print(this);
    }

    @Override // org.joda.time.ReadableDateTime
    public String toString(String str, Locale locale) throws IllegalArgumentException {
        return str == null ? toString() : DateTimeFormat.forPattern(str).withLocale(locale).print(this);
    }
}
