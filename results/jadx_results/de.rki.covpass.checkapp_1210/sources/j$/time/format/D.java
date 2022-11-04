package j$.time.format;

import j$.time.AbstractC0484a;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.Period;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class D implements TemporalAccessor {

    /* renamed from: b */
    ZoneId f13030b;

    /* renamed from: c */
    j$.time.chrono.e f13031c;

    /* renamed from: d */
    boolean f13032d;

    /* renamed from: e */
    private ResolverStyle f13033e;

    /* renamed from: f */
    private ChronoLocalDate f13034f;

    /* renamed from: g */
    private LocalTime f13035g;

    /* renamed from: a */
    final HashMap f13029a = new HashMap();

    /* renamed from: h */
    Period f13036h = Period.f12994d;

    private void o(TemporalAccessor temporalAccessor) {
        Iterator it = this.f13029a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            TemporalField temporalField = (TemporalField) entry.getKey();
            if (temporalAccessor.c(temporalField)) {
                try {
                    long h10 = temporalAccessor.h(temporalField);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (h10 != longValue) {
                        throw new DateTimeException("Conflict found: Field " + temporalField + " " + h10 + " differs from " + temporalField + " " + longValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    private void q() {
        if (this.f13029a.containsKey(ChronoField.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f13030b;
            if (zoneId == null) {
                Long l10 = (Long) this.f13029a.get(ChronoField.OFFSET_SECONDS);
                if (l10 == null) {
                    return;
                }
                zoneId = ZoneOffset.u(l10.intValue());
            }
            r(zoneId);
        }
    }

    private void r(ZoneId zoneId) {
        HashMap hashMap = this.f13029a;
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        Instant ofEpochSecond = Instant.ofEpochSecond(((Long) hashMap.remove(chronoField)).longValue());
        Objects.requireNonNull((j$.time.chrono.f) this.f13031c);
        ZonedDateTime ofInstant = ZonedDateTime.ofInstant(ofEpochSecond, zoneId);
        v(ofInstant.t());
        w(chronoField, ChronoField.SECOND_OF_DAY, Long.valueOf(ofInstant.e().z()));
    }

    private void s(long j10, long j11, long j12, long j13) {
        LocalTime of2;
        Period period;
        if (this.f13033e == ResolverStyle.LENIENT) {
            long b10 = j$.time.c.b(j$.time.c.b(j$.time.c.b(j$.time.c.e(j10, 3600000000000L), j$.time.c.e(j11, 60000000000L)), j$.time.c.e(j12, 1000000000L)), j13);
            of2 = LocalTime.s(j$.time.c.c(b10, 86400000000000L));
            period = Period.d((int) j$.time.c.d(b10, 86400000000000L));
        } else {
            int p10 = ChronoField.MINUTE_OF_HOUR.p(j11);
            int p11 = ChronoField.NANO_OF_SECOND.p(j13);
            if (this.f13033e == ResolverStyle.SMART && j10 == 24 && p10 == 0 && j12 == 0 && p11 == 0) {
                of2 = LocalTime.f12980g;
                period = Period.d(1);
            } else {
                of2 = LocalTime.of(ChronoField.HOUR_OF_DAY.p(j10), p10, ChronoField.SECOND_OF_MINUTE.p(j12), p11);
                period = Period.f12994d;
            }
        }
        u(of2, period);
    }

    private void t() {
        Long l10;
        TemporalField temporalField;
        HashMap hashMap = this.f13029a;
        ChronoField chronoField = ChronoField.CLOCK_HOUR_OF_DAY;
        long j10 = 0;
        if (hashMap.containsKey(chronoField)) {
            long longValue = ((Long) this.f13029a.remove(chronoField)).longValue();
            ResolverStyle resolverStyle = this.f13033e;
            if (resolverStyle == ResolverStyle.STRICT || (resolverStyle == ResolverStyle.SMART && longValue != 0)) {
                chronoField.q(longValue);
            }
            TemporalField temporalField2 = ChronoField.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            w(chronoField, temporalField2, Long.valueOf(longValue));
        }
        HashMap hashMap2 = this.f13029a;
        ChronoField chronoField2 = ChronoField.CLOCK_HOUR_OF_AMPM;
        if (hashMap2.containsKey(chronoField2)) {
            long longValue2 = ((Long) this.f13029a.remove(chronoField2)).longValue();
            ResolverStyle resolverStyle2 = this.f13033e;
            if (resolverStyle2 == ResolverStyle.STRICT || (resolverStyle2 == ResolverStyle.SMART && longValue2 != 0)) {
                chronoField2.q(longValue2);
            }
            TemporalField temporalField3 = ChronoField.HOUR_OF_AMPM;
            if (longValue2 != 12) {
                j10 = longValue2;
            }
            w(chronoField2, temporalField3, Long.valueOf(j10));
        }
        HashMap hashMap3 = this.f13029a;
        ChronoField chronoField3 = ChronoField.AMPM_OF_DAY;
        if (hashMap3.containsKey(chronoField3)) {
            HashMap hashMap4 = this.f13029a;
            ChronoField chronoField4 = ChronoField.HOUR_OF_AMPM;
            if (hashMap4.containsKey(chronoField4)) {
                long longValue3 = ((Long) this.f13029a.remove(chronoField3)).longValue();
                long longValue4 = ((Long) this.f13029a.remove(chronoField4)).longValue();
                if (this.f13033e == ResolverStyle.LENIENT) {
                    temporalField = ChronoField.HOUR_OF_DAY;
                    l10 = Long.valueOf(j$.time.c.b(j$.time.c.e(longValue3, 12L), longValue4));
                } else {
                    chronoField3.q(longValue3);
                    chronoField4.q(longValue3);
                    temporalField = ChronoField.HOUR_OF_DAY;
                    l10 = Long.valueOf((longValue3 * 12) + longValue4);
                }
                w(chronoField3, temporalField, l10);
            }
        }
        HashMap hashMap5 = this.f13029a;
        ChronoField chronoField5 = ChronoField.NANO_OF_DAY;
        if (hashMap5.containsKey(chronoField5)) {
            long longValue5 = ((Long) this.f13029a.remove(chronoField5)).longValue();
            if (this.f13033e != ResolverStyle.LENIENT) {
                chronoField5.q(longValue5);
            }
            w(chronoField5, ChronoField.HOUR_OF_DAY, Long.valueOf(longValue5 / 3600000000000L));
            w(chronoField5, ChronoField.MINUTE_OF_HOUR, Long.valueOf((longValue5 / 60000000000L) % 60));
            w(chronoField5, ChronoField.SECOND_OF_MINUTE, Long.valueOf((longValue5 / 1000000000) % 60));
            w(chronoField5, ChronoField.NANO_OF_SECOND, Long.valueOf(longValue5 % 1000000000));
        }
        HashMap hashMap6 = this.f13029a;
        ChronoField chronoField6 = ChronoField.MICRO_OF_DAY;
        if (hashMap6.containsKey(chronoField6)) {
            long longValue6 = ((Long) this.f13029a.remove(chronoField6)).longValue();
            if (this.f13033e != ResolverStyle.LENIENT) {
                chronoField6.q(longValue6);
            }
            w(chronoField6, ChronoField.SECOND_OF_DAY, Long.valueOf(longValue6 / 1000000));
            w(chronoField6, ChronoField.MICRO_OF_SECOND, Long.valueOf(longValue6 % 1000000));
        }
        HashMap hashMap7 = this.f13029a;
        ChronoField chronoField7 = ChronoField.MILLI_OF_DAY;
        if (hashMap7.containsKey(chronoField7)) {
            long longValue7 = ((Long) this.f13029a.remove(chronoField7)).longValue();
            if (this.f13033e != ResolverStyle.LENIENT) {
                chronoField7.q(longValue7);
            }
            w(chronoField7, ChronoField.SECOND_OF_DAY, Long.valueOf(longValue7 / 1000));
            w(chronoField7, ChronoField.MILLI_OF_SECOND, Long.valueOf(longValue7 % 1000));
        }
        HashMap hashMap8 = this.f13029a;
        ChronoField chronoField8 = ChronoField.SECOND_OF_DAY;
        if (hashMap8.containsKey(chronoField8)) {
            long longValue8 = ((Long) this.f13029a.remove(chronoField8)).longValue();
            if (this.f13033e != ResolverStyle.LENIENT) {
                chronoField8.q(longValue8);
            }
            w(chronoField8, ChronoField.HOUR_OF_DAY, Long.valueOf(longValue8 / 3600));
            w(chronoField8, ChronoField.MINUTE_OF_HOUR, Long.valueOf((longValue8 / 60) % 60));
            w(chronoField8, ChronoField.SECOND_OF_MINUTE, Long.valueOf(longValue8 % 60));
        }
        HashMap hashMap9 = this.f13029a;
        ChronoField chronoField9 = ChronoField.MINUTE_OF_DAY;
        if (hashMap9.containsKey(chronoField9)) {
            long longValue9 = ((Long) this.f13029a.remove(chronoField9)).longValue();
            if (this.f13033e != ResolverStyle.LENIENT) {
                chronoField9.q(longValue9);
            }
            w(chronoField9, ChronoField.HOUR_OF_DAY, Long.valueOf(longValue9 / 60));
            w(chronoField9, ChronoField.MINUTE_OF_HOUR, Long.valueOf(longValue9 % 60));
        }
        HashMap hashMap10 = this.f13029a;
        ChronoField chronoField10 = ChronoField.NANO_OF_SECOND;
        if (hashMap10.containsKey(chronoField10)) {
            long longValue10 = ((Long) this.f13029a.get(chronoField10)).longValue();
            ResolverStyle resolverStyle3 = this.f13033e;
            ResolverStyle resolverStyle4 = ResolverStyle.LENIENT;
            if (resolverStyle3 != resolverStyle4) {
                chronoField10.q(longValue10);
            }
            HashMap hashMap11 = this.f13029a;
            ChronoField chronoField11 = ChronoField.MICRO_OF_SECOND;
            if (hashMap11.containsKey(chronoField11)) {
                long longValue11 = ((Long) this.f13029a.remove(chronoField11)).longValue();
                if (this.f13033e != resolverStyle4) {
                    chronoField11.q(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                w(chronoField11, chronoField10, Long.valueOf(longValue10));
            }
            HashMap hashMap12 = this.f13029a;
            ChronoField chronoField12 = ChronoField.MILLI_OF_SECOND;
            if (hashMap12.containsKey(chronoField12)) {
                long longValue12 = ((Long) this.f13029a.remove(chronoField12)).longValue();
                if (this.f13033e != resolverStyle4) {
                    chronoField12.q(longValue12);
                }
                w(chronoField12, chronoField10, Long.valueOf((longValue10 % 1000000) + (longValue12 * 1000000)));
            }
        }
        HashMap hashMap13 = this.f13029a;
        ChronoField chronoField13 = ChronoField.HOUR_OF_DAY;
        if (hashMap13.containsKey(chronoField13)) {
            HashMap hashMap14 = this.f13029a;
            ChronoField chronoField14 = ChronoField.MINUTE_OF_HOUR;
            if (!hashMap14.containsKey(chronoField14)) {
                return;
            }
            HashMap hashMap15 = this.f13029a;
            ChronoField chronoField15 = ChronoField.SECOND_OF_MINUTE;
            if (!hashMap15.containsKey(chronoField15) || !this.f13029a.containsKey(chronoField10)) {
                return;
            }
            s(((Long) this.f13029a.remove(chronoField13)).longValue(), ((Long) this.f13029a.remove(chronoField14)).longValue(), ((Long) this.f13029a.remove(chronoField15)).longValue(), ((Long) this.f13029a.remove(chronoField10)).longValue());
        }
    }

    private void u(LocalTime localTime, Period period) {
        LocalTime localTime2 = this.f13035g;
        if (localTime2 == null) {
            this.f13035g = localTime;
        } else if (!localTime2.equals(localTime)) {
            StringBuilder b10 = AbstractC0484a.b("Conflict found: Fields resolved to different times: ");
            b10.append(this.f13035g);
            b10.append(" ");
            b10.append(localTime);
            throw new DateTimeException(b10.toString());
        } else if (!this.f13036h.c() && !period.c() && !this.f13036h.equals(period)) {
            StringBuilder b11 = AbstractC0484a.b("Conflict found: Fields resolved to different excess periods: ");
            b11.append(this.f13036h);
            b11.append(" ");
            b11.append(period);
            throw new DateTimeException(b11.toString());
        }
        this.f13036h = period;
    }

    private void v(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.f13034f;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate == null || chronoLocalDate2.equals(chronoLocalDate)) {
                return;
            }
            StringBuilder b10 = AbstractC0484a.b("Conflict found: Fields resolved to two different dates: ");
            b10.append(this.f13034f);
            b10.append(" ");
            b10.append(chronoLocalDate);
            throw new DateTimeException(b10.toString());
        } else if (chronoLocalDate == null) {
        } else {
            j$.time.chrono.e eVar = this.f13031c;
            chronoLocalDate.a();
            if (((j$.time.chrono.a) eVar).equals(j$.time.chrono.f.f13017a)) {
                this.f13034f = chronoLocalDate;
                return;
            }
            StringBuilder b11 = AbstractC0484a.b("ChronoLocalDate must use the effective parsed chronology: ");
            b11.append(this.f13031c);
            throw new DateTimeException(b11.toString());
        }
    }

    private void w(TemporalField temporalField, TemporalField temporalField2, Long l10) {
        Long l11 = (Long) this.f13029a.put(temporalField2, l10);
        if (l11 == null || l11.longValue() == l10.longValue()) {
            return;
        }
        throw new DateTimeException("Conflict found: " + temporalField2 + " " + l11 + " differs from " + temporalField2 + " " + l10 + " while resolving  " + temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate;
        LocalTime localTime;
        return this.f13029a.containsKey(temporalField) || ((chronoLocalDate = this.f13034f) != null && chronoLocalDate.c(temporalField)) || (((localTime = this.f13035g) != null && localTime.c(temporalField)) || (temporalField != null && !(temporalField instanceof ChronoField) && temporalField.k(this)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ j$.time.temporal.u f(TemporalField temporalField) {
        return j$.time.temporal.k.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.time.temporal.k.b(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(TemporalField temporalField) {
        Objects.requireNonNull(temporalField, "field");
        Long l10 = (Long) this.f13029a.get(temporalField);
        if (l10 != null) {
            return l10.longValue();
        }
        ChronoLocalDate chronoLocalDate = this.f13034f;
        if (chronoLocalDate != null && chronoLocalDate.c(temporalField)) {
            return this.f13034f.h(temporalField);
        }
        LocalTime localTime = this.f13035g;
        if (localTime != null && localTime.c(temporalField)) {
            return this.f13035g.h(temporalField);
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.t(AbstractC0484a.a("Unsupported field: ", temporalField));
        }
        return temporalField.i(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object k(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.m.f13172a) {
            return this.f13030b;
        }
        if (temporalQuery == j$.time.temporal.n.f13173a) {
            return this.f13031c;
        }
        if (temporalQuery == j$.time.temporal.r.f13177a) {
            ChronoLocalDate chronoLocalDate = this.f13034f;
            if (chronoLocalDate == null) {
                return null;
            }
            return LocalDate.s(chronoLocalDate);
        } else if (temporalQuery == j$.time.temporal.s.f13178a) {
            return this.f13035g;
        } else {
            if (temporalQuery == j$.time.temporal.q.f13176a || temporalQuery == j$.time.temporal.p.f13175a) {
                return temporalQuery.queryFrom(this);
            }
            if (temporalQuery != j$.time.temporal.o.f13174a) {
                return temporalQuery.queryFrom(this);
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.temporal.TemporalAccessor p(j$.time.format.ResolverStyle r19, java.util.Set r20) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.D.p(j$.time.format.ResolverStyle, java.util.Set):j$.time.temporal.TemporalAccessor");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(this.f13029a);
        sb2.append(',');
        sb2.append(this.f13031c);
        if (this.f13030b != null) {
            sb2.append(',');
            sb2.append(this.f13030b);
        }
        if (this.f13034f != null || this.f13035g != null) {
            sb2.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.f13034f;
            if (chronoLocalDate != null) {
                sb2.append(chronoLocalDate);
                if (this.f13035g != null) {
                    sb2.append('T');
                }
            }
            sb2.append(this.f13035g);
        }
        return sb2.toString();
    }
}
