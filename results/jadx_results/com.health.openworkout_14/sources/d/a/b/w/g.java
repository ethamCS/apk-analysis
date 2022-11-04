package d.a.b.w;

import java.math.BigDecimal;
/* loaded from: classes.dex */
public final class g extends Number {

    /* renamed from: b */
    private final String f3783b;

    public g(String str) {
        this.f3783b = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f3783b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        String str = this.f3783b;
        String str2 = ((g) obj).f3783b;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f3783b);
    }

    public int hashCode() {
        return this.f3783b.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f3783b);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f3783b);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f3783b).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f3783b);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f3783b).longValue();
        }
    }

    public String toString() {
        return this.f3783b;
    }
}
