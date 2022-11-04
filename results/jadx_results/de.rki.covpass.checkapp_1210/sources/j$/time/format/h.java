package j$.time.format;

import j$.time.AbstractC0484a;
import j$.time.temporal.TemporalField;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import org.conscrypt.BuildConfig;
/* loaded from: classes2.dex */
public final class h implements g {

    /* renamed from: a */
    private final TemporalField f13071a;

    /* renamed from: b */
    private final int f13072b;

    /* renamed from: c */
    private final int f13073c;

    /* renamed from: d */
    private final boolean f13074d;

    public h(TemporalField temporalField, int i10, int i11, boolean z10) {
        Objects.requireNonNull(temporalField, "field");
        if (temporalField.f().f()) {
            if (i10 < 0 || i10 > 9) {
                throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i10);
            } else if (i11 < 1 || i11 > 9) {
                throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i11);
            } else if (i11 >= i10) {
                this.f13071a = temporalField;
                this.f13072b = i10;
                this.f13073c = i11;
                this.f13074d = z10;
                return;
            } else {
                throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
            }
        }
        throw new IllegalArgumentException(AbstractC0484a.a("Field must have a fixed set of values: ", temporalField));
    }

    @Override // j$.time.format.g
    public final boolean b(z zVar, StringBuilder sb2) {
        Long e10 = zVar.e(this.f13071a);
        if (e10 == null) {
            return false;
        }
        C b10 = zVar.b();
        long longValue = e10.longValue();
        j$.time.temporal.u f10 = this.f13071a.f();
        f10.b(longValue, this.f13071a);
        BigDecimal valueOf = BigDecimal.valueOf(f10.e());
        BigDecimal divide = BigDecimal.valueOf(longValue).subtract(valueOf).divide(BigDecimal.valueOf(f10.d()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        BigDecimal stripTrailingZeros = divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        if (stripTrailingZeros.scale() != 0) {
            String substring = stripTrailingZeros.setScale(Math.min(Math.max(stripTrailingZeros.scale(), this.f13072b), this.f13073c), RoundingMode.FLOOR).toPlainString().substring(2);
            Objects.requireNonNull(b10);
            if (this.f13074d) {
                sb2.append('.');
            }
            sb2.append(substring);
            return true;
        } else if (this.f13072b <= 0) {
            return true;
        } else {
            if (this.f13074d) {
                Objects.requireNonNull(b10);
                sb2.append('.');
            }
            for (int i10 = 0; i10 < this.f13072b; i10++) {
                Objects.requireNonNull(b10);
                sb2.append('0');
            }
            return true;
        }
    }

    @Override // j$.time.format.g
    public final int d(x xVar, CharSequence charSequence, int i10) {
        int i11;
        int i12 = xVar.l() ? this.f13072b : 0;
        int i13 = xVar.l() ? this.f13073c : 9;
        int length = charSequence.length();
        if (i10 == length) {
            return i12 > 0 ? ~i10 : i10;
        }
        if (this.f13074d) {
            char charAt = charSequence.charAt(i10);
            Objects.requireNonNull(xVar.g());
            if (charAt != '.') {
                return i12 > 0 ? ~i10 : i10;
            }
            i10++;
        }
        int i14 = i10;
        int i15 = i12 + i14;
        if (i15 > length) {
            return ~i14;
        }
        int min = Math.min(i13 + i14, length);
        int i16 = 0;
        int i17 = i14;
        while (true) {
            if (i17 >= min) {
                i11 = i17;
                break;
            }
            int i18 = i17 + 1;
            int a10 = xVar.g().a(charSequence.charAt(i17));
            if (a10 >= 0) {
                i16 = (i16 * 10) + a10;
                i17 = i18;
            } else if (i18 < i15) {
                return ~i14;
            } else {
                i11 = i18 - 1;
            }
        }
        BigDecimal movePointLeft = new BigDecimal(i16).movePointLeft(i11 - i14);
        j$.time.temporal.u f10 = this.f13071a.f();
        BigDecimal valueOf = BigDecimal.valueOf(f10.e());
        return xVar.o(this.f13071a, movePointLeft.multiply(BigDecimal.valueOf(f10.d()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact(), i14, i11);
    }

    public final String toString() {
        String str = this.f13074d ? ",DecimalPoint" : BuildConfig.FLAVOR;
        StringBuilder b10 = AbstractC0484a.b("Fraction(");
        b10.append(this.f13071a);
        b10.append(",");
        b10.append(this.f13072b);
        b10.append(",");
        b10.append(this.f13073c);
        b10.append(str);
        b10.append(")");
        return b10.toString();
    }
}
