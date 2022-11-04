package j$.time.temporal;

import j$.time.AbstractC0484a;
import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import j$.time.format.ResolverStyle;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class v implements TemporalField {

    /* renamed from: f */
    private static final u f13183f = u.i(1, 7);

    /* renamed from: g */
    private static final u f13184g = u.j(0, 4, 6);

    /* renamed from: h */
    private static final u f13185h = u.j(0, 52, 54);

    /* renamed from: i */
    private static final u f13186i = u.k(52, 53);

    /* renamed from: a */
    private final String f13187a;

    /* renamed from: b */
    private final w f13188b;

    /* renamed from: c */
    private final TemporalUnit f13189c;

    /* renamed from: d */
    private final TemporalUnit f13190d;

    /* renamed from: e */
    private final u f13191e;

    private v(String str, w wVar, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, u uVar) {
        this.f13187a = str;
        this.f13188b = wVar;
        this.f13189c = temporalUnit;
        this.f13190d = temporalUnit2;
        this.f13191e = uVar;
    }

    private int a(int i10, int i11) {
        return ((i11 - 1) + (i10 + 7)) / 7;
    }

    private int c(TemporalAccessor temporalAccessor) {
        return k.e(temporalAccessor.get(ChronoField.DAY_OF_WEEK) - this.f13188b.e().o()) + 1;
    }

    private int e(TemporalAccessor temporalAccessor) {
        int c10 = c(temporalAccessor);
        int i10 = temporalAccessor.get(ChronoField.YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int i11 = temporalAccessor.get(chronoField);
        int w9 = w(i11, c10);
        int a10 = a(w9, i11);
        if (a10 == 0) {
            return i10 - 1;
        }
        return a10 >= a(w9, this.f13188b.f() + ((int) temporalAccessor.f(chronoField).d())) ? i10 + 1 : i10;
    }

    private long g(TemporalAccessor temporalAccessor) {
        int c10 = c(temporalAccessor);
        int i10 = temporalAccessor.get(ChronoField.DAY_OF_MONTH);
        return a(w(i10, c10), i10);
    }

    private int j(TemporalAccessor temporalAccessor) {
        int c10 = c(temporalAccessor);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int i10 = temporalAccessor.get(chronoField);
        int w9 = w(i10, c10);
        int a10 = a(w9, i10);
        if (a10 == 0) {
            j$.time.chrono.c.b(temporalAccessor);
            return j(LocalDate.s(temporalAccessor).y(i10, ChronoUnit.DAYS));
        } else if (a10 <= 50) {
            return a10;
        } else {
            int a11 = a(w9, this.f13188b.f() + ((int) temporalAccessor.f(chronoField).d()));
            return a10 >= a11 ? (a10 - a11) + 1 : a10;
        }
    }

    private long m(TemporalAccessor temporalAccessor) {
        int c10 = c(temporalAccessor);
        int i10 = temporalAccessor.get(ChronoField.DAY_OF_YEAR);
        return a(w(i10, c10), i10);
    }

    public static v n(w wVar) {
        return new v("DayOfWeek", wVar, ChronoUnit.DAYS, ChronoUnit.WEEKS, f13183f);
    }

    private ChronoLocalDate p(j$.time.chrono.e eVar, int i10, int i11, int i12) {
        Objects.requireNonNull((j$.time.chrono.f) eVar);
        LocalDate of2 = LocalDate.of(i10, 1, 1);
        int w9 = w(1, c(of2));
        return of2.i(((Math.min(i11, a(w9, this.f13188b.f() + (of2.x() ? 366 : 365)) - 1) - 1) * 7) + (i12 - 1) + (-w9), ChronoUnit.DAYS);
    }

    public static v q(w wVar) {
        return new v("WeekBasedYear", wVar, h.f13169d, ChronoUnit.FOREVER, ChronoField.YEAR.f());
    }

    public static v r(w wVar) {
        return new v("WeekOfMonth", wVar, ChronoUnit.WEEKS, ChronoUnit.MONTHS, f13184g);
    }

    public static v s(w wVar) {
        return new v("WeekOfWeekBasedYear", wVar, ChronoUnit.WEEKS, h.f13169d, f13186i);
    }

    public static v t(w wVar) {
        return new v("WeekOfYear", wVar, ChronoUnit.WEEKS, ChronoUnit.YEARS, f13185h);
    }

    private u u(TemporalAccessor temporalAccessor, TemporalField temporalField) {
        int w9 = w(temporalAccessor.get(temporalField), c(temporalAccessor));
        u f10 = temporalAccessor.f(temporalField);
        return u.i(a(w9, (int) f10.e()), a(w9, (int) f10.d()));
    }

    private u v(TemporalAccessor temporalAccessor) {
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        if (!temporalAccessor.c(chronoField)) {
            return f13185h;
        }
        int c10 = c(temporalAccessor);
        int i10 = temporalAccessor.get(chronoField);
        int w9 = w(i10, c10);
        int a10 = a(w9, i10);
        if (a10 == 0) {
            j$.time.chrono.c.b(temporalAccessor);
            return v(LocalDate.s(temporalAccessor).y(i10 + 7, ChronoUnit.DAYS));
        }
        int d10 = (int) temporalAccessor.f(chronoField).d();
        int a11 = a(w9, this.f13188b.f() + d10);
        if (a10 < a11) {
            return u.i(1L, a11 - 1);
        }
        j$.time.chrono.c.b(temporalAccessor);
        return v(LocalDate.s(temporalAccessor).i((d10 - i10) + 1 + 7, ChronoUnit.DAYS));
    }

    private int w(int i10, int i11) {
        int e10 = k.e(i10 - i11);
        return e10 + 1 > this.f13188b.f() ? 7 - e10 : -e10;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean b() {
        return false;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean d() {
        return true;
    }

    @Override // j$.time.temporal.TemporalField
    public final u f() {
        return this.f13191e;
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor h(Map map, TemporalAccessor temporalAccessor, ResolverStyle resolverStyle) {
        long longValue;
        Object obj;
        Object obj2;
        TemporalField temporalField;
        Object obj3;
        TemporalField temporalField2;
        ChronoLocalDate chronoLocalDate;
        Object obj4;
        Object obj5;
        TemporalField temporalField3;
        Object obj6;
        TemporalField temporalField4;
        Object obj7;
        LocalDate localDate;
        LocalDate localDate2;
        LocalDate of2;
        int a10 = j$.time.c.a(((Long) map.get(this)).longValue());
        TemporalUnit temporalUnit = this.f13190d;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        if (temporalUnit == chronoUnit) {
            map.remove(this);
            map.put(ChronoField.DAY_OF_WEEK, Long.valueOf(k.e((this.f13191e.a(longValue, this) - 1) + (this.f13188b.e().o() - 1)) + 1));
        } else {
            ChronoField chronoField = ChronoField.DAY_OF_WEEK;
            if (map.containsKey(chronoField)) {
                int e10 = k.e(chronoField.p(((Long) map.get(chronoField)).longValue()) - this.f13188b.e().o()) + 1;
                j$.time.chrono.e b10 = j$.time.chrono.c.b(temporalAccessor);
                ChronoField chronoField2 = ChronoField.YEAR;
                if (map.containsKey(chronoField2)) {
                    int p10 = chronoField2.p(((Long) map.get(chronoField2)).longValue());
                    TemporalUnit temporalUnit2 = this.f13190d;
                    ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
                    if (temporalUnit2 == chronoUnit2) {
                        ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
                        if (map.containsKey(chronoField3)) {
                            long longValue2 = ((Long) map.get(chronoField3)).longValue();
                            long j10 = a10;
                            if (resolverStyle == ResolverStyle.LENIENT) {
                                LocalDate i10 = LocalDate.of(p10, 1, 1).i(j$.time.c.f(longValue2, 1L), chronoUnit2);
                                localDate2 = i10.i(j$.time.c.b(j$.time.c.e(j$.time.c.f(j10, g(i10)), 7L), e10 - c(i10)), ChronoUnit.DAYS);
                            } else {
                                LocalDate i11 = LocalDate.of(p10, chronoField3.p(longValue2), 1).i((((int) (this.f13191e.a(j10, this) - g(of2))) * 7) + (e10 - c(of2)), ChronoUnit.DAYS);
                                if (resolverStyle == ResolverStyle.STRICT && i11.h(chronoField3) != longValue2) {
                                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                                }
                                localDate2 = i11;
                            }
                            map.remove(this);
                            map.remove(chronoField2);
                            map.remove(chronoField3);
                            map.remove(chronoField);
                            return localDate2;
                        }
                    }
                    if (this.f13190d == ChronoUnit.YEARS) {
                        long j11 = a10;
                        LocalDate of3 = LocalDate.of(p10, 1, 1);
                        if (resolverStyle == ResolverStyle.LENIENT) {
                            localDate = of3.i(j$.time.c.b(j$.time.c.e(j$.time.c.f(j11, m(of3)), 7L), e10 - c(of3)), ChronoUnit.DAYS);
                        } else {
                            LocalDate i12 = of3.i((((int) (this.f13191e.a(j11, this) - m(of3))) * 7) + (e10 - c(of3)), ChronoUnit.DAYS);
                            if (resolverStyle == ResolverStyle.STRICT && i12.h(chronoField2) != p10) {
                                throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
                            }
                            localDate = i12;
                        }
                        map.remove(this);
                        map.remove(chronoField2);
                        map.remove(chronoField);
                        return localDate;
                    }
                } else {
                    TemporalUnit temporalUnit3 = this.f13190d;
                    if (temporalUnit3 == w.f13193h || temporalUnit3 == ChronoUnit.FOREVER) {
                        obj = this.f13188b.f13199f;
                        if (map.containsKey(obj)) {
                            obj2 = this.f13188b.f13198e;
                            if (map.containsKey(obj2)) {
                                temporalField = this.f13188b.f13199f;
                                u uVar = ((v) temporalField).f13191e;
                                obj3 = this.f13188b.f13199f;
                                long longValue3 = ((Long) map.get(obj3)).longValue();
                                temporalField2 = this.f13188b.f13199f;
                                int a11 = uVar.a(longValue3, temporalField2);
                                if (resolverStyle == ResolverStyle.LENIENT) {
                                    ChronoLocalDate p11 = p(b10, a11, 1, e10);
                                    obj7 = this.f13188b.f13198e;
                                    chronoLocalDate = ((LocalDate) p11).i(j$.time.c.f(((Long) map.get(obj7)).longValue(), 1L), chronoUnit);
                                } else {
                                    temporalField3 = this.f13188b.f13198e;
                                    u uVar2 = ((v) temporalField3).f13191e;
                                    obj6 = this.f13188b.f13198e;
                                    long longValue4 = ((Long) map.get(obj6)).longValue();
                                    temporalField4 = this.f13188b.f13198e;
                                    ChronoLocalDate p12 = p(b10, a11, uVar2.a(longValue4, temporalField4), e10);
                                    if (resolverStyle == ResolverStyle.STRICT && e(p12) != a11) {
                                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different week-based-year");
                                    }
                                    chronoLocalDate = p12;
                                }
                                map.remove(this);
                                obj4 = this.f13188b.f13199f;
                                map.remove(obj4);
                                obj5 = this.f13188b.f13198e;
                                map.remove(obj5);
                                map.remove(chronoField);
                                return chronoLocalDate;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // j$.time.temporal.TemporalField
    public final long i(TemporalAccessor temporalAccessor) {
        int i10;
        TemporalUnit temporalUnit = this.f13190d;
        if (temporalUnit == ChronoUnit.WEEKS) {
            i10 = c(temporalAccessor);
        } else if (temporalUnit == ChronoUnit.MONTHS) {
            return g(temporalAccessor);
        } else {
            if (temporalUnit == ChronoUnit.YEARS) {
                return m(temporalAccessor);
            }
            if (temporalUnit == w.f13193h) {
                i10 = j(temporalAccessor);
            } else if (temporalUnit != ChronoUnit.FOREVER) {
                StringBuilder b10 = AbstractC0484a.b("unreachable, rangeUnit: ");
                b10.append(this.f13190d);
                b10.append(", this: ");
                b10.append(this);
                throw new IllegalStateException(b10.toString());
            } else {
                i10 = e(temporalAccessor);
            }
        }
        return i10;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean k(TemporalAccessor temporalAccessor) {
        ChronoField chronoField;
        if (temporalAccessor.c(ChronoField.DAY_OF_WEEK)) {
            TemporalUnit temporalUnit = this.f13190d;
            if (temporalUnit == ChronoUnit.WEEKS) {
                return true;
            }
            if (temporalUnit == ChronoUnit.MONTHS) {
                chronoField = ChronoField.DAY_OF_MONTH;
            } else if (temporalUnit == ChronoUnit.YEARS || temporalUnit == w.f13193h) {
                chronoField = ChronoField.DAY_OF_YEAR;
            } else if (temporalUnit != ChronoUnit.FOREVER) {
                return false;
            } else {
                chronoField = ChronoField.YEAR;
            }
            return temporalAccessor.c(chronoField);
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalField
    public final Temporal l(Temporal temporal, long j10) {
        TemporalField temporalField;
        TemporalField temporalField2;
        int a10 = this.f13191e.a(j10, this);
        int i10 = temporal.get(this);
        if (a10 == i10) {
            return temporal;
        }
        if (this.f13190d != ChronoUnit.FOREVER) {
            return temporal.i(a10 - i10, this.f13189c);
        }
        temporalField = this.f13188b.f13196c;
        int i11 = temporal.get(temporalField);
        temporalField2 = this.f13188b.f13198e;
        return p(j$.time.chrono.c.b(temporal), (int) j10, temporal.get(temporalField2), i11);
    }

    @Override // j$.time.temporal.TemporalField
    public final u o(TemporalAccessor temporalAccessor) {
        TemporalUnit temporalUnit = this.f13190d;
        if (temporalUnit == ChronoUnit.WEEKS) {
            return this.f13191e;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return u(temporalAccessor, ChronoField.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return u(temporalAccessor, ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == w.f13193h) {
            return v(temporalAccessor);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return ChronoField.YEAR.f();
        }
        StringBuilder b10 = AbstractC0484a.b("unreachable, rangeUnit: ");
        b10.append(this.f13190d);
        b10.append(", this: ");
        b10.append(this);
        throw new IllegalStateException(b10.toString());
    }

    public final String toString() {
        return this.f13187a + "[" + this.f13188b.toString() + "]";
    }
}
