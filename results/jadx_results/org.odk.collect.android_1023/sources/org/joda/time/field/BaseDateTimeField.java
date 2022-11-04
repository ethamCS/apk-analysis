package org.joda.time.field;

import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.ReadablePartial;
/* loaded from: classes.dex */
public abstract class BaseDateTimeField extends DateTimeField {
    private final DateTimeFieldType iType;

    @Override // org.joda.time.DateTimeField
    public abstract int get(long j);

    @Override // org.joda.time.DateTimeField
    public abstract DurationField getDurationField();

    @Override // org.joda.time.DateTimeField
    public abstract int getMaximumValue();

    @Override // org.joda.time.DateTimeField
    public abstract int getMinimumValue();

    @Override // org.joda.time.DateTimeField
    public abstract DurationField getRangeDurationField();

    @Override // org.joda.time.DateTimeField
    public abstract long roundFloor(long j);

    @Override // org.joda.time.DateTimeField
    public abstract long set(long j, int i);

    public BaseDateTimeField(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.iType = dateTimeFieldType;
    }

    @Override // org.joda.time.DateTimeField
    public final DateTimeFieldType getType() {
        return this.iType;
    }

    @Override // org.joda.time.DateTimeField
    public final String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DateTimeField
    public final boolean isSupported() {
        return true;
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(long j, Locale locale) {
        return getAsText(get(j), locale);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsText(long j) {
        return getAsText(j, (Locale) null);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(ReadablePartial readablePartial, int i, Locale locale) {
        return getAsText(i, locale);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsText(ReadablePartial readablePartial, Locale locale) {
        return getAsText(readablePartial, readablePartial.get(getType()), locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(int i, Locale locale) {
        return Integer.toString(i);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(long j, Locale locale) {
        return getAsShortText(get(j), locale);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsShortText(long j) {
        return getAsShortText(j, (Locale) null);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(ReadablePartial readablePartial, int i, Locale locale) {
        return getAsShortText(i, locale);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsShortText(ReadablePartial readablePartial, Locale locale) {
        return getAsShortText(readablePartial, readablePartial.get(getType()), locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(int i, Locale locale) {
        return getAsText(i, locale);
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j, int i) {
        return getDurationField().add(j, i);
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j, long j2) {
        return getDurationField().add(j, j2);
    }

    @Override // org.joda.time.DateTimeField
    public int[] add(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        if (i2 != 0) {
            DateTimeField dateTimeField = null;
            int i3 = i2;
            int[] iArr2 = iArr;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                int maximumValue = getMaximumValue(readablePartial, iArr2);
                long j = iArr2[i] + i3;
                if (j <= maximumValue) {
                    iArr2[i] = (int) j;
                    break;
                }
                if (dateTimeField == null) {
                    if (i == 0) {
                        throw new IllegalArgumentException("Maximum value exceeded for add");
                    }
                    dateTimeField = readablePartial.getField(i - 1);
                    if (getRangeDurationField().getType() != dateTimeField.getDurationField().getType()) {
                        throw new IllegalArgumentException("Fields invalid for add");
                    }
                }
                i3 -= (maximumValue + 1) - iArr2[i];
                iArr2 = dateTimeField.add(readablePartial, i - 1, iArr2, 1);
                iArr2[i] = getMinimumValue(readablePartial, iArr2);
            }
            while (true) {
                if (i3 >= 0) {
                    break;
                }
                int minimumValue = getMinimumValue(readablePartial, iArr2);
                long j2 = iArr2[i] + i3;
                if (j2 >= minimumValue) {
                    iArr2[i] = (int) j2;
                    break;
                }
                if (dateTimeField == null) {
                    if (i == 0) {
                        throw new IllegalArgumentException("Maximum value exceeded for add");
                    }
                    dateTimeField = readablePartial.getField(i - 1);
                    if (getRangeDurationField().getType() != dateTimeField.getDurationField().getType()) {
                        throw new IllegalArgumentException("Fields invalid for add");
                    }
                }
                i3 -= (minimumValue - 1) - iArr2[i];
                iArr2 = dateTimeField.add(readablePartial, i - 1, iArr2, -1);
                iArr2[i] = getMaximumValue(readablePartial, iArr2);
            }
            return set(readablePartial, i, iArr2, iArr2[i]);
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
        r3 = getMinimumValue(r9, r2);
        r4 = r2[r10] + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r4 < r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        r2[r10] = (int) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
        if (r0 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (r10 != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
        r1 = r1 - ((r3 - 1) - r2[r10]);
        r2[r10] = getMaximumValue(r9, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
        r0 = r9.getField(r10 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
        if (getRangeDurationField().getType() == r0.getDurationField().getType()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
        throw new java.lang.IllegalArgumentException("Fields invalid for add");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
        r1 = r1 - ((r3 - 1) - r2[r10]);
        r2 = r0.addWrapPartial(r9, r10 - 1, r2, -1);
        r2[r10] = getMaximumValue(r9, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
        return set(r9, r10, r2, r2[r10]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r1 >= 0) goto L41;
     */
    @Override // org.joda.time.DateTimeField
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int[] addWrapPartial(org.joda.time.ReadablePartial r9, int r10, int[] r11, int r12) {
        /*
            r8 = this;
            if (r12 != 0) goto L3
        L2:
            return r11
        L3:
            r0 = 0
            r1 = r12
            r2 = r11
        L6:
            if (r1 <= 0) goto L18
            int r3 = r8.getMaximumValue(r9, r2)
            r4 = r2[r10]
            int r4 = r4 + r1
            long r4 = (long) r4
            long r6 = (long) r3
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L31
            int r3 = (int) r4
            r2[r10] = r3
        L18:
            if (r1 >= 0) goto L2a
            int r3 = r8.getMinimumValue(r9, r2)
            r4 = r2[r10]
            int r4 = r4 + r1
            long r4 = (long) r4
            long r6 = (long) r3
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L76
            int r0 = (int) r4
            r2[r10] = r0
        L2a:
            r0 = r2[r10]
            int[] r11 = r8.set(r9, r10, r2, r0)
            goto L2
        L31:
            if (r0 != 0) goto L62
            if (r10 != 0) goto L42
            int r3 = r3 + 1
            r4 = r2[r10]
            int r3 = r3 - r4
            int r1 = r1 - r3
            int r3 = r8.getMinimumValue(r9, r2)
            r2[r10] = r3
            goto L6
        L42:
            int r0 = r10 + (-1)
            org.joda.time.DateTimeField r0 = r9.getField(r0)
            org.joda.time.DurationField r4 = r8.getRangeDurationField()
            org.joda.time.DurationFieldType r4 = r4.getType()
            org.joda.time.DurationField r5 = r0.getDurationField()
            org.joda.time.DurationFieldType r5 = r5.getType()
            if (r4 == r5) goto L62
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Fields invalid for add"
            r0.<init>(r1)
            throw r0
        L62:
            int r3 = r3 + 1
            r4 = r2[r10]
            int r3 = r3 - r4
            int r1 = r1 - r3
            int r3 = r10 + (-1)
            r4 = 1
            int[] r2 = r0.addWrapPartial(r9, r3, r2, r4)
            int r3 = r8.getMinimumValue(r9, r2)
            r2[r10] = r3
            goto L6
        L76:
            if (r0 != 0) goto La7
            if (r10 != 0) goto L87
            int r3 = r3 + (-1)
            r4 = r2[r10]
            int r3 = r3 - r4
            int r1 = r1 - r3
            int r3 = r8.getMaximumValue(r9, r2)
            r2[r10] = r3
            goto L18
        L87:
            int r0 = r10 + (-1)
            org.joda.time.DateTimeField r0 = r9.getField(r0)
            org.joda.time.DurationField r4 = r8.getRangeDurationField()
            org.joda.time.DurationFieldType r4 = r4.getType()
            org.joda.time.DurationField r5 = r0.getDurationField()
            org.joda.time.DurationFieldType r5 = r5.getType()
            if (r4 == r5) goto La7
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Fields invalid for add"
            r0.<init>(r1)
            throw r0
        La7:
            int r3 = r3 + (-1)
            r4 = r2[r10]
            int r3 = r3 - r4
            int r1 = r1 - r3
            int r3 = r10 + (-1)
            r4 = -1
            int[] r2 = r0.addWrapPartial(r9, r3, r2, r4)
            int r3 = r8.getMaximumValue(r9, r2)
            r2[r10] = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.field.BaseDateTimeField.addWrapPartial(org.joda.time.ReadablePartial, int, int[], int):int[]");
    }

    @Override // org.joda.time.DateTimeField
    public long addWrapField(long j, int i) {
        return set(j, FieldUtils.getWrappedValue(get(j), i, getMinimumValue(j), getMaximumValue(j)));
    }

    @Override // org.joda.time.DateTimeField
    public int[] addWrapField(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        return set(readablePartial, i, iArr, FieldUtils.getWrappedValue(iArr[i], i2, getMinimumValue(readablePartial), getMaximumValue(readablePartial)));
    }

    @Override // org.joda.time.DateTimeField
    public int getDifference(long j, long j2) {
        return getDurationField().getDifference(j, j2);
    }

    @Override // org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j, long j2) {
        return getDurationField().getDifferenceAsLong(j, j2);
    }

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        FieldUtils.verifyValueBounds(this, i2, getMinimumValue(readablePartial, iArr), getMaximumValue(readablePartial, iArr));
        iArr[i] = i2;
        for (int i3 = i + 1; i3 < readablePartial.size(); i3++) {
            DateTimeField field = readablePartial.getField(i3);
            if (iArr[i3] > field.getMaximumValue(readablePartial, iArr)) {
                iArr[i3] = field.getMaximumValue(readablePartial, iArr);
            }
            if (iArr[i3] < field.getMinimumValue(readablePartial, iArr)) {
                iArr[i3] = field.getMinimumValue(readablePartial, iArr);
            }
        }
        return iArr;
    }

    @Override // org.joda.time.DateTimeField
    public long set(long j, String str, Locale locale) {
        return set(j, convertText(str, locale));
    }

    @Override // org.joda.time.DateTimeField
    public final long set(long j, String str) {
        return set(j, str, null);
    }

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i, int[] iArr, String str, Locale locale) {
        return set(readablePartial, i, iArr, convertText(str, locale));
    }

    protected int convertText(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalFieldValueException(getType(), str);
        }
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLeap(long j) {
        return false;
    }

    @Override // org.joda.time.DateTimeField
    public int getLeapAmount(long j) {
        return 0;
    }

    @Override // org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return null;
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(long j) {
        return getMinimumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial) {
        return getMinimumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
        return getMinimumValue(readablePartial);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(long j) {
        return getMaximumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial) {
        return getMaximumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        return getMaximumValue(readablePartial);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumTextLength(Locale locale) {
        int maximumValue = getMaximumValue();
        if (maximumValue >= 0) {
            if (maximumValue < 10) {
                return 1;
            }
            if (maximumValue < 100) {
                return 2;
            }
            if (maximumValue < 1000) {
                return 3;
            }
        }
        return Integer.toString(maximumValue).length();
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumShortTextLength(Locale locale) {
        return getMaximumTextLength(locale);
    }

    @Override // org.joda.time.DateTimeField
    public long roundCeiling(long j) {
        long roundFloor = roundFloor(j);
        if (roundFloor != j) {
            return add(roundFloor, 1);
        }
        return j;
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfFloor(long j) {
        long roundFloor = roundFloor(j);
        long roundCeiling = roundCeiling(j);
        return j - roundFloor <= roundCeiling - j ? roundFloor : roundCeiling;
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfCeiling(long j) {
        long roundFloor = roundFloor(j);
        long roundCeiling = roundCeiling(j);
        return roundCeiling - j <= j - roundFloor ? roundCeiling : roundFloor;
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfEven(long j) {
        long roundFloor = roundFloor(j);
        long roundCeiling = roundCeiling(j);
        long j2 = j - roundFloor;
        long j3 = roundCeiling - j;
        if (j2 < j3) {
            return roundFloor;
        }
        return (j3 >= j2 && (get(roundCeiling) & 1) != 0) ? roundFloor : roundCeiling;
    }

    @Override // org.joda.time.DateTimeField
    public long remainder(long j) {
        return j - roundFloor(j);
    }

    @Override // org.joda.time.DateTimeField
    public String toString() {
        return "DateTimeField[" + getName() + ']';
    }
}
