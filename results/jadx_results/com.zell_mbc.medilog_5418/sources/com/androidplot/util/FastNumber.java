package com.androidplot.util;
/* loaded from: classes2.dex */
public class FastNumber extends Number {
    private double doublePrimitive;
    private float floatPrimitive;
    private boolean hasDoublePrimitive;
    private boolean hasFloatPrimitive;
    private boolean hasIntPrimitive;
    private int intPrimitive;
    private final Number number;

    public static FastNumber orNull(Number number) {
        if (number == null) {
            return null;
        }
        return new FastNumber(number);
    }

    private FastNumber(Number number) {
        if (number == null) {
            throw new IllegalArgumentException("number parameter cannot be null");
        }
        if (number instanceof FastNumber) {
            FastNumber fastNumber = (FastNumber) number;
            this.number = fastNumber.number;
            this.hasDoublePrimitive = fastNumber.hasDoublePrimitive;
            this.hasFloatPrimitive = fastNumber.hasFloatPrimitive;
            this.hasIntPrimitive = fastNumber.hasIntPrimitive;
            this.doublePrimitive = fastNumber.doublePrimitive;
            this.floatPrimitive = fastNumber.floatPrimitive;
            this.intPrimitive = fastNumber.intPrimitive;
            return;
        }
        this.number = number;
    }

    @Override // java.lang.Number
    public int intValue() {
        if (!this.hasIntPrimitive) {
            this.intPrimitive = this.number.intValue();
            this.hasIntPrimitive = true;
        }
        return this.intPrimitive;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.number.longValue();
    }

    @Override // java.lang.Number
    public float floatValue() {
        if (!this.hasFloatPrimitive) {
            this.floatPrimitive = this.number.floatValue();
            this.hasFloatPrimitive = true;
        }
        return this.floatPrimitive;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        if (!this.hasDoublePrimitive) {
            this.doublePrimitive = this.number.doubleValue();
            this.hasDoublePrimitive = true;
        }
        return this.doublePrimitive;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.number.equals(((FastNumber) obj).number);
        }
        return false;
    }

    public int hashCode() {
        return this.number.hashCode();
    }

    public String toString() {
        return String.valueOf(doubleValue());
    }
}
