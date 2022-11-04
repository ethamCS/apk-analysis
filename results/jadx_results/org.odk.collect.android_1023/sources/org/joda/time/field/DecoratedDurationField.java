package org.joda.time.field;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
/* loaded from: classes.dex */
public class DecoratedDurationField extends BaseDurationField {
    private static final long serialVersionUID = 8019982251647420015L;
    private final DurationField iField;

    public DecoratedDurationField(DurationField durationField, DurationFieldType durationFieldType) {
        super(durationFieldType);
        if (durationField == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (!durationField.isSupported()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.iField = durationField;
    }

    public final DurationField getWrappedField() {
        return this.iField;
    }

    @Override // org.joda.time.DurationField
    public boolean isPrecise() {
        return this.iField.isPrecise();
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j, long j2) {
        return this.iField.getValueAsLong(j, j2);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i, long j) {
        return this.iField.getMillis(i, j);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j, long j2) {
        return this.iField.getMillis(j, j2);
    }

    @Override // org.joda.time.DurationField
    public long add(long j, int i) {
        return this.iField.add(j, i);
    }

    @Override // org.joda.time.DurationField
    public long add(long j, long j2) {
        return this.iField.add(j, j2);
    }

    @Override // org.joda.time.DurationField
    public long getDifferenceAsLong(long j, long j2) {
        return this.iField.getDifferenceAsLong(j, j2);
    }

    @Override // org.joda.time.DurationField
    public long getUnitMillis() {
        return this.iField.getUnitMillis();
    }
}
