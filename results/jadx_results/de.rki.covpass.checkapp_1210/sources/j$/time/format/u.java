package j$.time.format;

import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class u implements g {

    /* renamed from: a */
    private char f13112a;

    /* renamed from: b */
    private int f13113b;

    public u(char c10, int i10) {
        this.f13112a = c10;
        this.f13113b = i10;
    }

    private g a(Locale locale) {
        TemporalField temporalField;
        TemporalUnit temporalUnit = j$.time.temporal.w.f13193h;
        Objects.requireNonNull(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        j$.time.temporal.w g10 = j$.time.temporal.w.g(j$.time.d.SUNDAY.q(calendar.getFirstDayOfWeek() - 1), calendar.getMinimalDaysInFirstWeek());
        char c10 = this.f13112a;
        if (c10 == 'W') {
            temporalField = g10.i();
        } else if (c10 == 'Y') {
            TemporalField h10 = g10.h();
            int i10 = this.f13113b;
            if (i10 == 2) {
                return new r(h10, 2, 2, 0, r.f13104i, 0, null);
            }
            return new l(h10, i10, 19, i10 < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD, -1);
        } else if (c10 == 'c' || c10 == 'e') {
            temporalField = g10.d();
        } else if (c10 != 'w') {
            throw new IllegalStateException("unreachable");
        } else {
            temporalField = g10.j();
        }
        return new l(temporalField, this.f13113b == 2 ? 2 : 1, 2, SignStyle.NOT_NEGATIVE);
    }

    @Override // j$.time.format.g
    public final boolean b(z zVar, StringBuilder sb2) {
        return ((l) a(zVar.c())).b(zVar, sb2);
    }

    @Override // j$.time.format.g
    public final int d(x xVar, CharSequence charSequence, int i10) {
        return ((l) a(xVar.i())).d(xVar, charSequence, i10);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("Localized(");
        char c10 = this.f13112a;
        if (c10 == 'Y') {
            int i10 = this.f13113b;
            if (i10 == 1) {
                str2 = "WeekBasedYear";
            } else if (i10 == 2) {
                str2 = "ReducedValue(WeekBasedYear,2,2,2000-01-01)";
            } else {
                sb2.append("WeekBasedYear,");
                sb2.append(this.f13113b);
                sb2.append(",");
                sb2.append(19);
                sb2.append(",");
                sb2.append(this.f13113b < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD);
            }
            sb2.append(str2);
        } else {
            if (c10 == 'W') {
                str = "WeekOfMonth";
            } else if (c10 == 'c' || c10 == 'e') {
                str = "DayOfWeek";
            } else {
                if (c10 == 'w') {
                    str = "WeekOfWeekBasedYear";
                }
                sb2.append(",");
                sb2.append(this.f13113b);
            }
            sb2.append(str);
            sb2.append(",");
            sb2.append(this.f13113b);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
