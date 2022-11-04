package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.format.ResolverStyle;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class f extends Enum implements TemporalField {
    public static final f DAY_OF_QUARTER;
    public static final f QUARTER_OF_YEAR;
    public static final f WEEK_BASED_YEAR;
    public static final f WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: a */
    private static final int[] f13161a = {0, 90, 181, 273, 0, 91, 182, 274};

    /* renamed from: b */
    private static final /* synthetic */ f[] f13162b;

    static {
        f fVar = new f() { // from class: j$.time.temporal.b
            @Override // j$.time.temporal.TemporalField
            public final u f() {
                return u.k(90L, 92L);
            }

            @Override // j$.time.temporal.f, j$.time.temporal.TemporalField
            public final TemporalAccessor h(Map map, TemporalAccessor temporalAccessor, ResolverStyle resolverStyle) {
                LocalDate localDate;
                long j10;
                ChronoField chronoField = ChronoField.YEAR;
                Long l10 = (Long) map.get(chronoField);
                TemporalField temporalField = f.QUARTER_OF_YEAR;
                Long l11 = (Long) map.get(temporalField);
                if (l10 == null || l11 == null) {
                    return null;
                }
                int p10 = chronoField.p(l10.longValue());
                long longValue = ((Long) map.get(f.DAY_OF_QUARTER)).longValue();
                f.r(temporalAccessor);
                if (resolverStyle == ResolverStyle.LENIENT) {
                    localDate = LocalDate.of(p10, 1, 1).C(j$.time.c.e(j$.time.c.f(l11.longValue(), 1L), 3L));
                    j10 = j$.time.c.f(longValue, 1L);
                } else {
                    localDate = LocalDate.of(p10, ((temporalField.f().a(l11.longValue(), temporalField) - 1) * 3) + 1, 1);
                    if (longValue < 1 || longValue > 90) {
                        (resolverStyle == ResolverStyle.STRICT ? o(localDate) : f()).b(longValue, this);
                    }
                    j10 = longValue - 1;
                }
                map.remove(this);
                map.remove(chronoField);
                map.remove(temporalField);
                return localDate.plusDays(j10);
            }

            @Override // j$.time.temporal.TemporalField
            public final long i(TemporalAccessor temporalAccessor) {
                int[] iArr;
                if (k(temporalAccessor)) {
                    int i10 = temporalAccessor.get(ChronoField.DAY_OF_YEAR);
                    int i11 = temporalAccessor.get(ChronoField.MONTH_OF_YEAR);
                    long h10 = temporalAccessor.h(ChronoField.YEAR);
                    iArr = f.f13161a;
                    return i10 - iArr[((i11 - 1) / 3) + (j$.time.chrono.f.f13017a.f(h10) ? 4 : 0)];
                }
                throw new t("Unsupported field: DayOfQuarter");
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean k(TemporalAccessor temporalAccessor) {
                return temporalAccessor.c(ChronoField.DAY_OF_YEAR) && temporalAccessor.c(ChronoField.MONTH_OF_YEAR) && temporalAccessor.c(ChronoField.YEAR) && f.p(temporalAccessor);
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal l(Temporal temporal, long j10) {
                long i10 = i(temporal);
                f().b(j10, this);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return temporal.d(chronoField, (j10 - i10) + temporal.h(chronoField));
            }

            @Override // j$.time.temporal.f, j$.time.temporal.TemporalField
            public final u o(TemporalAccessor temporalAccessor) {
                if (k(temporalAccessor)) {
                    long h10 = temporalAccessor.h(f.QUARTER_OF_YEAR);
                    if (h10 == 1) {
                        return j$.time.chrono.f.f13017a.f(temporalAccessor.h(ChronoField.YEAR)) ? u.i(1L, 91L) : u.i(1L, 90L);
                    }
                    return h10 == 2 ? u.i(1L, 91L) : (h10 == 3 || h10 == 4) ? u.i(1L, 92L) : f();
                }
                throw new t("Unsupported field: DayOfQuarter");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = fVar;
        f fVar2 = new f() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.TemporalField
            public final u f() {
                return u.i(1L, 4L);
            }

            @Override // j$.time.temporal.TemporalField
            public final long i(TemporalAccessor temporalAccessor) {
                if (k(temporalAccessor)) {
                    return (temporalAccessor.h(ChronoField.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new t("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean k(TemporalAccessor temporalAccessor) {
                return temporalAccessor.c(ChronoField.MONTH_OF_YEAR) && f.p(temporalAccessor);
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal l(Temporal temporal, long j10) {
                long i10 = i(temporal);
                f().b(j10, this);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return temporal.d(chronoField, ((j10 - i10) * 3) + temporal.h(chronoField));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = fVar2;
        f fVar3 = new f() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.TemporalField
            public final u f() {
                return u.k(52L, 53L);
            }

            @Override // j$.time.temporal.f, j$.time.temporal.TemporalField
            public final TemporalAccessor h(Map map, TemporalAccessor temporalAccessor, ResolverStyle resolverStyle) {
                LocalDate localDate;
                long j10;
                LocalDate D;
                long j11;
                TemporalField temporalField = f.WEEK_BASED_YEAR;
                Long l10 = (Long) map.get(temporalField);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                Long l11 = (Long) map.get(chronoField);
                if (l10 == null || l11 == null) {
                    return null;
                }
                int a10 = temporalField.f().a(l10.longValue(), temporalField);
                long longValue = ((Long) map.get(f.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                f.r(temporalAccessor);
                LocalDate of2 = LocalDate.of(a10, 1, 4);
                if (resolverStyle == ResolverStyle.LENIENT) {
                    long longValue2 = l11.longValue();
                    if (longValue2 > 7) {
                        j11 = longValue2 - 1;
                        D = of2.D(j11 / 7);
                    } else {
                        j10 = 1;
                        if (longValue2 < 1) {
                            D = of2.D(j$.time.c.f(longValue2, 7L) / 7);
                            j11 = longValue2 + 6;
                        }
                        localDate = of2.D(j$.time.c.f(longValue, j10)).d(chronoField, longValue2);
                    }
                    of2 = D;
                    j10 = 1;
                    longValue2 = (j11 % 7) + 1;
                    localDate = of2.D(j$.time.c.f(longValue, j10)).d(chronoField, longValue2);
                } else {
                    int p10 = chronoField.p(l11.longValue());
                    if (longValue < 1 || longValue > 52) {
                        (resolverStyle == ResolverStyle.STRICT ? f.s(of2) : f()).b(longValue, this);
                    }
                    localDate = of2.D(longValue - 1).d(chronoField, p10);
                }
                map.remove(this);
                map.remove(temporalField);
                map.remove(chronoField);
                return localDate;
            }

            @Override // j$.time.temporal.TemporalField
            public final long i(TemporalAccessor temporalAccessor) {
                if (k(temporalAccessor)) {
                    return f.t(LocalDate.s(temporalAccessor));
                }
                throw new t("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean k(TemporalAccessor temporalAccessor) {
                return temporalAccessor.c(ChronoField.EPOCH_DAY) && f.p(temporalAccessor);
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal l(Temporal temporal, long j10) {
                f().b(j10, this);
                return temporal.i(j$.time.c.f(j10, i(temporal)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.f, j$.time.temporal.TemporalField
            public final u o(TemporalAccessor temporalAccessor) {
                if (k(temporalAccessor)) {
                    return f.s(LocalDate.s(temporalAccessor));
                }
                throw new t("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = fVar3;
        f fVar4 = new f() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.TemporalField
            public final u f() {
                return ChronoField.YEAR.f();
            }

            @Override // j$.time.temporal.TemporalField
            public final long i(TemporalAccessor temporalAccessor) {
                int w9;
                if (k(temporalAccessor)) {
                    w9 = f.w(LocalDate.s(temporalAccessor));
                    return w9;
                }
                throw new t("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean k(TemporalAccessor temporalAccessor) {
                return temporalAccessor.c(ChronoField.EPOCH_DAY) && f.p(temporalAccessor);
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal l(Temporal temporal, long j10) {
                ChronoField chronoField;
                LocalDate of2;
                int x10;
                if (k(temporal)) {
                    int a10 = f().a(j10, f.WEEK_BASED_YEAR);
                    LocalDate s10 = LocalDate.s(temporal);
                    int i10 = s10.get(ChronoField.DAY_OF_WEEK);
                    int t10 = f.t(s10);
                    if (t10 == 53) {
                        x10 = f.x(a10);
                        if (x10 == 52) {
                            t10 = 52;
                        }
                    }
                    return temporal.b(LocalDate.of(a10, 1, 4).plusDays(((t10 - 1) * 7) + (i10 - of2.get(chronoField))));
                }
                throw new t("Unsupported field: WeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = fVar4;
        f13162b = new f[]{fVar, fVar2, fVar3, fVar4};
    }

    public f(String str, int i10) {
        super(str, i10);
    }

    public static boolean p(TemporalAccessor temporalAccessor) {
        return ((j$.time.chrono.a) j$.time.chrono.c.b(temporalAccessor)).equals(j$.time.chrono.f.f13017a);
    }

    public static void r(TemporalAccessor temporalAccessor) {
        if (((j$.time.chrono.a) j$.time.chrono.c.b(temporalAccessor)).equals(j$.time.chrono.f.f13017a)) {
            return;
        }
        throw new DateTimeException("Resolve requires IsoChronology");
    }

    public static u s(LocalDate localDate) {
        return u.i(1L, x(w(localDate)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        if ((r0 == -3 || (r0 == -2 && r5.x())) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int t(j$.time.LocalDate r5) {
        /*
            j$.time.d r0 = r5.u()
            int r0 = r0.ordinal()
            int r1 = r5.v()
            r2 = 1
            int r1 = r1 - r2
            int r0 = 3 - r0
            int r0 = r0 + r1
            int r3 = r0 / 7
            int r3 = r3 * 7
            int r0 = r0 - r3
            r3 = -3
            int r0 = r0 + r3
            if (r0 >= r3) goto L1c
            int r0 = r0 + 7
        L1c:
            if (r1 >= r0) goto L3d
            j$.time.LocalDate r5 = r5.I()
            r0 = -1
            j$.time.LocalDate r5 = r5.E(r0)
            int r5 = w(r5)
            int r5 = x(r5)
            long r0 = (long) r5
            r2 = 1
            j$.time.temporal.u r5 = j$.time.temporal.u.i(r2, r0)
            long r0 = r5.d()
            int r5 = (int) r0
            goto L59
        L3d:
            int r1 = r1 - r0
            int r1 = r1 / 7
            int r1 = r1 + r2
            r4 = 53
            if (r1 != r4) goto L57
            if (r0 == r3) goto L53
            r3 = -2
            if (r0 != r3) goto L51
            boolean r5 = r5.x()
            if (r5 == 0) goto L51
            goto L53
        L51:
            r5 = 0
            goto L54
        L53:
            r5 = r2
        L54:
            if (r5 != 0) goto L57
            goto L58
        L57:
            r2 = r1
        L58:
            r5 = r2
        L59:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.temporal.f.t(j$.time.LocalDate):int");
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f13162b.clone();
    }

    public static int w(LocalDate localDate) {
        int year = localDate.getYear();
        int v10 = localDate.v();
        if (v10 <= 3) {
            return v10 - localDate.u().ordinal() < -2 ? year - 1 : year;
        } else if (v10 < 363) {
            return year;
        } else {
            return ((v10 - 363) - (localDate.x() ? 1 : 0)) - localDate.u().ordinal() >= 0 ? year + 1 : year;
        }
    }

    public static int x(int i10) {
        LocalDate of2 = LocalDate.of(i10, 1, 1);
        if (of2.u() != j$.time.d.THURSDAY) {
            return (of2.u() != j$.time.d.WEDNESDAY || !of2.x()) ? 52 : 53;
        }
        return 53;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean b() {
        return false;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean d() {
        return true;
    }

    public /* synthetic */ TemporalAccessor h(Map map, TemporalAccessor temporalAccessor, ResolverStyle resolverStyle) {
        return null;
    }

    public u o(TemporalAccessor temporalAccessor) {
        return f();
    }
}
