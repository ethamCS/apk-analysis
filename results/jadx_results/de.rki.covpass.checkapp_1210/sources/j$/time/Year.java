package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class Year implements Temporal, j$.time.temporal.i, Comparable<Year>, Serializable {

    /* renamed from: b */
    private static final DateTimeFormatter f12999b = new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).toFormatter();

    /* renamed from: c */
    public static final /* synthetic */ int f13000c = 0;

    /* renamed from: a */
    private final int f13001a;

    private Year(int i10) {
        this.f13001a = i10;
    }

    public static Year o(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Year) {
            return (Year) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            if (!j$.time.chrono.f.f13017a.equals(j$.time.chrono.c.b(temporalAccessor))) {
                temporalAccessor = LocalDate.s(temporalAccessor);
            }
            return of(temporalAccessor.get(ChronoField.YEAR));
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain Year from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
        }
    }

    public static Year of(int i10) {
        ChronoField.YEAR.q(i10);
        return new Year(i10);
    }

    public static Year parse(CharSequence charSequence) {
        return parse(charSequence, f12999b);
    }

    public static Year parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (Year) dateTimeFormatter.parse(charSequence, u.f13200a);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal b(j$.time.temporal.i iVar) {
        return (Year) ((LocalDate) iVar).o(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.k(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Year year) {
        return this.f13001a - year.f13001a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Year) && this.f13001a == ((Year) obj).f13001a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u f(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return j$.time.temporal.u.i(1L, this.f13001a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.k.d(this, temporalField);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return f(temporalField).a(h(temporalField), temporalField);
    }

    public int getValue() {
        return this.f13001a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = v.f13201a[((ChronoField) temporalField).ordinal()];
            int i11 = 1;
            if (i10 == 1) {
                int i12 = this.f13001a;
                if (i12 < 1) {
                    i12 = 1 - i12;
                }
                return i12;
            } else if (i10 == 2) {
                return this.f13001a;
            } else {
                if (i10 != 3) {
                    throw new j$.time.temporal.t(AbstractC0484a.a("Unsupported field: ", temporalField));
                }
                if (this.f13001a < 1) {
                    i11 = 0;
                }
                return i11;
            }
        }
        return temporalField.i(this);
    }

    public final int hashCode() {
        return this.f13001a;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal i(long j10, TemporalUnit temporalUnit) {
        long j11;
        if (temporalUnit instanceof ChronoUnit) {
            int i10 = v.f13202b[((ChronoUnit) temporalUnit).ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    j11 = 10;
                } else if (i10 == 3) {
                    j11 = 100;
                } else if (i10 != 4) {
                    if (i10 == 5) {
                        ChronoField chronoField = ChronoField.ERA;
                        return d(chronoField, c.b(h(chronoField), j10));
                    }
                    throw new j$.time.temporal.t("Unsupported unit: " + temporalUnit);
                } else {
                    j11 = 1000;
                }
                j10 = c.e(j10, j11);
            }
            return p(j10);
        }
        return (Year) temporalUnit.h(this, j10);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object k(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.n.f13173a ? j$.time.chrono.f.f13017a : temporalQuery == j$.time.temporal.o.f13174a ? ChronoUnit.YEARS : j$.time.temporal.k.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.Temporal
    public final long l(Temporal temporal, TemporalUnit temporalUnit) {
        Year o10 = o(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long j10 = o10.f13001a - this.f13001a;
            int i10 = v.f13202b[((ChronoUnit) temporalUnit).ordinal()];
            if (i10 == 1) {
                return j10;
            }
            if (i10 == 2) {
                return j10 / 10;
            }
            if (i10 == 3) {
                return j10 / 100;
            }
            if (i10 == 4) {
                return j10 / 1000;
            }
            if (i10 == 5) {
                ChronoField chronoField = ChronoField.ERA;
                return o10.h(chronoField) - h(chronoField);
            }
            throw new j$.time.temporal.t("Unsupported unit: " + temporalUnit);
        }
        return temporalUnit.f(this, o10);
    }

    public final Year p(long j10) {
        return j10 == 0 ? this : of(ChronoField.YEAR.p(this.f13001a + j10));
    }

    /* renamed from: q */
    public final Year d(TemporalField temporalField, long j10) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.q(j10);
            int i10 = v.f13201a[chronoField.ordinal()];
            if (i10 == 1) {
                if (this.f13001a < 1) {
                    j10 = 1 - j10;
                }
                return of((int) j10);
            } else if (i10 == 2) {
                return of((int) j10);
            } else {
                if (i10 != 3) {
                    throw new j$.time.temporal.t(AbstractC0484a.a("Unsupported field: ", temporalField));
                }
                return h(ChronoField.ERA) == j10 ? this : of(1 - this.f13001a);
            }
        }
        return (Year) temporalField.l(this, j10);
    }

    public String toString() {
        return Integer.toString(this.f13001a);
    }
}
