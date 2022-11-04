package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BaseInterval;
import org.joda.time.field.FieldUtils;
/* loaded from: classes.dex */
public class MutableInterval extends BaseInterval implements ReadWritableInterval, Cloneable, Serializable {
    private static final long serialVersionUID = -5982824024992428470L;

    public static MutableInterval parse(String str) {
        return new MutableInterval(str);
    }

    public MutableInterval() {
        super(0L, 0L, null);
    }

    public MutableInterval(long j, long j2) {
        super(j, j2, null);
    }

    public MutableInterval(long j, long j2, Chronology chronology) {
        super(j, j2, chronology);
    }

    public MutableInterval(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2);
    }

    public MutableInterval(ReadableInstant readableInstant, ReadableDuration readableDuration) {
        super(readableInstant, readableDuration);
    }

    public MutableInterval(ReadableDuration readableDuration, ReadableInstant readableInstant) {
        super(readableDuration, readableInstant);
    }

    public MutableInterval(ReadableInstant readableInstant, ReadablePeriod readablePeriod) {
        super(readableInstant, readablePeriod);
    }

    public MutableInterval(ReadablePeriod readablePeriod, ReadableInstant readableInstant) {
        super(readablePeriod, readableInstant);
    }

    public MutableInterval(Object obj) {
        super(obj, (Chronology) null);
    }

    public MutableInterval(Object obj, Chronology chronology) {
        super(obj, chronology);
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setInterval(long j, long j2) {
        super.setInterval(j, j2, getChronology());
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setInterval(ReadableInterval readableInterval) {
        if (readableInterval == null) {
            throw new IllegalArgumentException("Interval must not be null");
        }
        super.setInterval(readableInterval.getStartMillis(), readableInterval.getEndMillis(), readableInterval.getChronology());
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setInterval(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        if (readableInstant == null && readableInstant2 == null) {
            long currentTimeMillis = DateTimeUtils.currentTimeMillis();
            setInterval(currentTimeMillis, currentTimeMillis);
            return;
        }
        super.setInterval(DateTimeUtils.getInstantMillis(readableInstant), DateTimeUtils.getInstantMillis(readableInstant2), DateTimeUtils.getInstantChronology(readableInstant));
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setChronology(Chronology chronology) {
        super.setInterval(getStartMillis(), getEndMillis(), chronology);
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setStartMillis(long j) {
        super.setInterval(j, getEndMillis(), getChronology());
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setStart(ReadableInstant readableInstant) {
        super.setInterval(DateTimeUtils.getInstantMillis(readableInstant), getEndMillis(), getChronology());
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setEndMillis(long j) {
        super.setInterval(getStartMillis(), j, getChronology());
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setEnd(ReadableInstant readableInstant) {
        super.setInterval(getStartMillis(), DateTimeUtils.getInstantMillis(readableInstant), getChronology());
    }

    public void setDurationAfterStart(long j) {
        setEndMillis(FieldUtils.safeAdd(getStartMillis(), j));
    }

    public void setDurationBeforeEnd(long j) {
        setStartMillis(FieldUtils.safeAdd(getEndMillis(), -j));
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setDurationAfterStart(ReadableDuration readableDuration) {
        setEndMillis(FieldUtils.safeAdd(getStartMillis(), DateTimeUtils.getDurationMillis(readableDuration)));
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setDurationBeforeEnd(ReadableDuration readableDuration) {
        setStartMillis(FieldUtils.safeAdd(getEndMillis(), -DateTimeUtils.getDurationMillis(readableDuration)));
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setPeriodAfterStart(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            setEndMillis(getStartMillis());
        } else {
            setEndMillis(getChronology().add(readablePeriod, getStartMillis(), 1));
        }
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setPeriodBeforeEnd(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            setStartMillis(getEndMillis());
        } else {
            setStartMillis(getChronology().add(readablePeriod, getEndMillis(), -1));
        }
    }

    public MutableInterval copy() {
        return (MutableInterval) clone();
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError("Clone error");
        }
    }
}
