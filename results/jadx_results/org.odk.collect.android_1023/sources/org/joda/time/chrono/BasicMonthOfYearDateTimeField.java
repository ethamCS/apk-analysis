package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;
/* loaded from: classes.dex */
public class BasicMonthOfYearDateTimeField extends ImpreciseDateTimeField {
    private static final int MIN = 1;
    private static final long serialVersionUID = -8258715387168736L;
    private final BasicChronology iChronology;
    private final int iLeapMonth;
    private final int iMax;

    public BasicMonthOfYearDateTimeField(BasicChronology basicChronology, int i) {
        super(DateTimeFieldType.monthOfYear(), basicChronology.getAverageMillisPerMonth());
        this.iChronology = basicChronology;
        this.iMax = this.iChronology.getMaxMonth();
        this.iLeapMonth = i;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j) {
        return this.iChronology.getMonthOfYear(j);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j, int i) {
        int i2;
        int i3;
        if (i != 0) {
            long millisOfDay = this.iChronology.getMillisOfDay(j);
            int year = this.iChronology.getYear(j);
            int monthOfYear = this.iChronology.getMonthOfYear(j, year);
            int i4 = (monthOfYear - 1) + i;
            if (i4 >= 0) {
                i2 = (i4 / this.iMax) + year;
                i3 = (i4 % this.iMax) + 1;
            } else {
                i2 = ((i4 / this.iMax) + year) - 1;
                int abs = Math.abs(i4) % this.iMax;
                if (abs == 0) {
                    abs = this.iMax;
                }
                i3 = (this.iMax - abs) + 1;
                if (i3 == 1) {
                    i2++;
                }
            }
            int dayOfMonth = this.iChronology.getDayOfMonth(j, year, monthOfYear);
            int daysInYearMonth = this.iChronology.getDaysInYearMonth(i2, i3);
            if (dayOfMonth <= daysInYearMonth) {
                daysInYearMonth = dayOfMonth;
            }
            return this.iChronology.getYearMonthDayMillis(i2, i3, daysInYearMonth) + millisOfDay;
        }
        return j;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j, long j2) {
        long j3;
        long j4;
        int i = (int) j2;
        if (i == j2) {
            return add(j, i);
        }
        long millisOfDay = this.iChronology.getMillisOfDay(j);
        int year = this.iChronology.getYear(j);
        int monthOfYear = this.iChronology.getMonthOfYear(j, year);
        long j5 = (monthOfYear - 1) + j2;
        if (j5 >= 0) {
            j3 = year + (j5 / this.iMax);
            j4 = (j5 % this.iMax) + 1;
        } else {
            j3 = (year + (j5 / this.iMax)) - 1;
            int abs = (int) (Math.abs(j5) % this.iMax);
            if (abs == 0) {
                abs = this.iMax;
            }
            j4 = (this.iMax - abs) + 1;
            if (j4 == 1) {
                j3++;
            }
        }
        if (j3 < this.iChronology.getMinYear() || j3 > this.iChronology.getMaxYear()) {
            throw new IllegalArgumentException("Magnitude of add amount is too large: " + j2);
        }
        int i2 = (int) j3;
        int i3 = (int) j4;
        int dayOfMonth = this.iChronology.getDayOfMonth(j, year, monthOfYear);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(i2, i3);
        if (dayOfMonth <= daysInYearMonth) {
            daysInYearMonth = dayOfMonth;
        }
        return this.iChronology.getYearMonthDayMillis(i2, i3, daysInYearMonth) + millisOfDay;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int[] add(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        if (i2 != 0) {
            if (DateTimeUtils.isContiguous(readablePartial)) {
                long j = 0;
                int size = readablePartial.size();
                for (int i3 = 0; i3 < size; i3++) {
                    j = readablePartial.getFieldType(i3).getField(this.iChronology).set(j, iArr[i3]);
                }
                return this.iChronology.get(readablePartial, add(j, i2));
            }
            return super.add(readablePartial, i, iArr, i2);
        }
        return iArr;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j, int i) {
        return set(j, FieldUtils.getWrappedValue(get(j), i, 1, this.iMax));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j, long j2) {
        if (j < j2) {
            return -getDifference(j2, j);
        }
        int year = this.iChronology.getYear(j);
        int monthOfYear = this.iChronology.getMonthOfYear(j, year);
        int year2 = this.iChronology.getYear(j2);
        int monthOfYear2 = this.iChronology.getMonthOfYear(j2, year2);
        long j3 = (((year - year2) * this.iMax) + monthOfYear) - monthOfYear2;
        int dayOfMonth = this.iChronology.getDayOfMonth(j, year, monthOfYear);
        if (dayOfMonth == this.iChronology.getDaysInYearMonth(year, monthOfYear) && this.iChronology.getDayOfMonth(j2, year2, monthOfYear2) > dayOfMonth) {
            j2 = this.iChronology.dayOfMonth().set(j2, dayOfMonth);
        }
        if (j - this.iChronology.getYearMonthMillis(year, monthOfYear) < j2 - this.iChronology.getYearMonthMillis(year2, monthOfYear2)) {
            return j3 - 1;
        }
        return j3;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j, int i) {
        FieldUtils.verifyValueBounds(this, i, 1, this.iMax);
        int year = this.iChronology.getYear(j);
        int dayOfMonth = this.iChronology.getDayOfMonth(j, year);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(year, i);
        if (dayOfMonth <= daysInYearMonth) {
            daysInYearMonth = dayOfMonth;
        }
        return this.iChronology.getYearMonthDayMillis(year, i, daysInYearMonth) + this.iChronology.getMillisOfDay(j);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iChronology.years();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j) {
        int year = this.iChronology.getYear(j);
        return this.iChronology.isLeapYear(year) && this.iChronology.getMonthOfYear(j, year) == this.iLeapMonth;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getLeapAmount(long j) {
        return isLeap(j) ? 1 : 0;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return this.iChronology.days();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iMax;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j) {
        int year = this.iChronology.getYear(j);
        return this.iChronology.getYearMonthMillis(year, this.iChronology.getMonthOfYear(j, year));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j) {
        return j - roundFloor(j);
    }

    private Object readResolve() {
        return this.iChronology.monthOfYear();
    }
}
