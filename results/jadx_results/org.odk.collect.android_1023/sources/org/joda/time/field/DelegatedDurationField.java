package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
/* loaded from: classes.dex */
public class DelegatedDurationField extends DurationField implements Serializable {
    private static final long serialVersionUID = -5576443481242007829L;
    private final DurationField iField;
    private final DurationFieldType iType;

    protected DelegatedDurationField(DurationField durationField) {
        this(durationField, null);
    }

    protected DelegatedDurationField(DurationField durationField, DurationFieldType durationFieldType) {
        if (durationField == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        this.iField = durationField;
        this.iType = durationFieldType == null ? durationField.getType() : durationFieldType;
    }

    public final DurationField getWrappedField() {
        return this.iField;
    }

    @Override // org.joda.time.DurationField
    public DurationFieldType getType() {
        return this.iType;
    }

    @Override // org.joda.time.DurationField
    public String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DurationField
    public boolean isSupported() {
        return this.iField.isSupported();
    }

    @Override // org.joda.time.DurationField
    public boolean isPrecise() {
        return this.iField.isPrecise();
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j) {
        return this.iField.getValue(j);
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j) {
        return this.iField.getValueAsLong(j);
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j, long j2) {
        return this.iField.getValue(j, j2);
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j, long j2) {
        return this.iField.getValueAsLong(j, j2);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i) {
        return this.iField.getMillis(i);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j) {
        return this.iField.getMillis(j);
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
    public int getDifference(long j, long j2) {
        return this.iField.getDifference(j, j2);
    }

    @Override // org.joda.time.DurationField
    public long getDifferenceAsLong(long j, long j2) {
        return this.iField.getDifferenceAsLong(j, j2);
    }

    @Override // org.joda.time.DurationField
    public long getUnitMillis() {
        return this.iField.getUnitMillis();
    }

    public int compareTo(DurationField durationField) {
        return this.iField.compareTo(durationField);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DelegatedDurationField) {
            return this.iField.equals(((DelegatedDurationField) obj).iField);
        }
        return false;
    }

    public int hashCode() {
        return this.iField.hashCode() ^ this.iType.hashCode();
    }

    @Override // org.joda.time.DurationField
    public String toString() {
        return this.iType == null ? this.iField.toString() : "DurationField[" + this.iType + ']';
    }
}
