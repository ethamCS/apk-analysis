package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
/* loaded from: classes2.dex */
public final class i implements g {
    @Override // j$.time.format.g
    public final boolean b(z zVar, StringBuilder sb2) {
        Long e10 = zVar.e(ChronoField.INSTANT_SECONDS);
        TemporalAccessor d10 = zVar.d();
        ChronoField chronoField = ChronoField.NANO_OF_SECOND;
        Long valueOf = d10.c(chronoField) ? Long.valueOf(zVar.d().h(chronoField)) : null;
        int i10 = 0;
        if (e10 == null) {
            return false;
        }
        long longValue = e10.longValue();
        int p10 = chronoField.p(valueOf != null ? valueOf.longValue() : 0L);
        if (longValue >= -62167219200L) {
            long j10 = (longValue - 315569520000L) + 62167219200L;
            long d11 = j$.time.c.d(j10, 315569520000L) + 1;
            LocalDateTime u10 = LocalDateTime.u(j$.time.c.c(j10, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (d11 > 0) {
                sb2.append('+');
                sb2.append(d11);
            }
            sb2.append(u10);
            if (u10.getSecond() == 0) {
                sb2.append(":00");
            }
        } else {
            long j11 = longValue + 62167219200L;
            long j12 = j11 / 315569520000L;
            long j13 = j11 % 315569520000L;
            LocalDateTime u11 = LocalDateTime.u(j13 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb2.length();
            sb2.append(u11);
            if (u11.getSecond() == 0) {
                sb2.append(":00");
            }
            if (j12 < 0) {
                if (u11.getYear() == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j12 - 1));
                } else if (j13 == 0) {
                    sb2.insert(length, j12);
                } else {
                    sb2.insert(length + 1, Math.abs(j12));
                }
            }
        }
        if (p10 > 0) {
            sb2.append('.');
            int i11 = 100000000;
            while (true) {
                if (p10 <= 0 && i10 % 3 == 0 && i10 >= -2) {
                    break;
                }
                int i12 = p10 / i11;
                sb2.append((char) (i12 + 48));
                p10 -= i12 * i11;
                i11 /= 10;
                i10++;
            }
        }
        sb2.append('Z');
        return true;
    }

    @Override // j$.time.format.g
    public final int d(x xVar, CharSequence charSequence, int i10) {
        int i11;
        int i12;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.a(DateTimeFormatter.ISO_LOCAL_DATE);
        DateTimeFormatterBuilder appendLiteral = dateTimeFormatterBuilder.appendLiteral('T');
        ChronoField chronoField = ChronoField.HOUR_OF_DAY;
        DateTimeFormatterBuilder appendLiteral2 = appendLiteral.appendValue(chronoField, 2).appendLiteral(':');
        ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
        DateTimeFormatterBuilder appendLiteral3 = appendLiteral2.appendValue(chronoField2, 2).appendLiteral(':');
        ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
        DateTimeFormatterBuilder appendValue = appendLiteral3.appendValue(chronoField3, 2);
        ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
        int i13 = 0;
        appendValue.b(chronoField4, 0, 9, true);
        C0490f f10 = appendValue.appendLiteral('Z').toFormatter().f();
        x d10 = xVar.d();
        int d11 = f10.d(d10, charSequence, i10);
        if (d11 < 0) {
            return d11;
        }
        long longValue = d10.j(ChronoField.YEAR).longValue();
        int intValue = d10.j(ChronoField.MONTH_OF_YEAR).intValue();
        int intValue2 = d10.j(ChronoField.DAY_OF_MONTH).intValue();
        int intValue3 = d10.j(chronoField).intValue();
        int intValue4 = d10.j(chronoField2).intValue();
        Long j10 = d10.j(chronoField3);
        Long j11 = d10.j(chronoField4);
        int intValue5 = j10 != null ? j10.intValue() : 0;
        int intValue6 = j11 != null ? j11.intValue() : 0;
        if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
            i12 = 0;
            i11 = intValue5;
            i13 = 1;
        } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
            xVar.p();
            i12 = intValue3;
            i11 = 59;
        } else {
            i12 = intValue3;
            i11 = intValue5;
        }
        try {
            return xVar.o(chronoField4, intValue6, i10, xVar.o(ChronoField.INSTANT_SECONDS, j$.time.c.e(longValue / 10000, 315569520000L) + LocalDateTime.of(((int) longValue) % 10000, intValue, intValue2, i12, intValue4, i11, 0).w(i13).D(ZoneOffset.UTC), i10, d11));
        } catch (RuntimeException unused) {
            return ~i10;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
