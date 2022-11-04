package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
/* loaded from: classes2.dex */
public enum n implements TemporalAccessor, j$.time.temporal.i {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    

    /* renamed from: a */
    private static final n[] f13144a = values();

    public static n s(int i10) {
        if (i10 < 1 || i10 > 12) {
            throw new DateTimeException("Invalid value for MonthOfYear: " + i10);
        }
        return f13144a[i10 - 1];
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.MONTH_OF_YEAR : temporalField != null && temporalField.k(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u f(TemporalField temporalField) {
        return temporalField == ChronoField.MONTH_OF_YEAR ? temporalField.f() : j$.time.temporal.k.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return temporalField == ChronoField.MONTH_OF_YEAR ? p() : j$.time.temporal.k.b(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return p();
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.t(AbstractC0484a.a("Unsupported field: ", temporalField));
        }
        return temporalField.i(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object k(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.n.f13173a ? j$.time.chrono.f.f13017a : temporalQuery == j$.time.temporal.o.f13174a ? ChronoUnit.MONTHS : j$.time.temporal.k.c(this, temporalQuery);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int o(boolean z10) {
        switch (m.f13143a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z10 ? 1 : 0) + 91;
            case 3:
                return z10 + 152;
            case 4:
                return z10 + 244;
            case 5:
                return z10 + 305;
            case 6:
                return 1;
            case 7:
                return z10 + 60;
            case 8:
                return z10 + 121;
            case 9:
                return z10 + 182;
            case 10:
                return z10 + 213;
            case 11:
                return z10 + 274;
            default:
                return z10 + 335;
        }
    }

    public final int p() {
        return ordinal() + 1;
    }

    public final int q(boolean z10) {
        int i10 = m.f13143a[ordinal()];
        return i10 != 1 ? (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31 : z10 ? 29 : 28;
    }

    public final int r() {
        int i10 = m.f13143a[ordinal()];
        if (i10 != 1) {
            return (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final n t() {
        return f13144a[((((int) 1) + 12) + ordinal()) % 12];
    }
}
