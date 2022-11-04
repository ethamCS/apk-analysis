package c.b.b.w;

import java.math.BigDecimal;
/* loaded from: classes.dex */
public final class g extends Number {

    /* renamed from: a */
    private final String f496a;

    public g(String str) {
        this.f496a = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f496a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        String str = this.f496a;
        String str2 = ((g) obj).f496a;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f496a);
    }

    public int hashCode() {
        return this.f496a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f496a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f496a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f496a).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f496a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f496a).longValue();
        }
    }

    public String toString() {
        return this.f496a;
    }
}
