package j$.time.format;

import j$.time.AbstractC0484a;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.util.AbstractC0516o;
import java.util.Locale;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a */
    private TemporalAccessor f13132a;

    /* renamed from: b */
    private DateTimeFormatter f13133b;

    /* renamed from: c */
    private int f13134c;

    public z(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        ChronoField[] values;
        j$.time.chrono.e b10 = dateTimeFormatter.b();
        ZoneId zone = dateTimeFormatter.getZone();
        if (b10 != null || zone != null) {
            int i10 = j$.time.temporal.k.f13171a;
            j$.time.chrono.e eVar = (j$.time.chrono.e) temporalAccessor.k(j$.time.temporal.n.f13173a);
            ZoneId zoneId = (ZoneId) temporalAccessor.k(j$.time.temporal.m.f13172a);
            LocalDate localDate = null;
            b10 = AbstractC0516o.p(b10, eVar) ? null : b10;
            zone = AbstractC0516o.p(zone, zoneId) ? null : zone;
            if (b10 != null || zone != null) {
                j$.time.chrono.e eVar2 = b10 != null ? b10 : eVar;
                if (zone != null) {
                    if (temporalAccessor.c(ChronoField.INSTANT_SECONDS)) {
                        if (eVar2 == null) {
                            j$.time.chrono.f fVar = j$.time.chrono.f.f13017a;
                        }
                        temporalAccessor = ZonedDateTime.ofInstant(Instant.from(temporalAccessor), zone);
                    } else if (zone.normalized() instanceof ZoneOffset) {
                        ChronoField chronoField = ChronoField.OFFSET_SECONDS;
                        if (temporalAccessor.c(chronoField) && temporalAccessor.get(chronoField) != zone.getRules().d(Instant.EPOCH).s()) {
                            throw new DateTimeException("Unable to apply override zone '" + zone + "' because the temporal object being formatted has a different offset but does not represent an instant: " + temporalAccessor);
                        }
                    }
                }
                zoneId = zone != null ? zone : zoneId;
                if (b10 != null) {
                    if (temporalAccessor.c(ChronoField.EPOCH_DAY)) {
                        Objects.requireNonNull((j$.time.chrono.f) eVar2);
                        localDate = LocalDate.s(temporalAccessor);
                    } else if (b10 != j$.time.chrono.f.f13017a || eVar != null) {
                        for (ChronoField chronoField2 : ChronoField.values()) {
                            if (chronoField2.d() && temporalAccessor.c(chronoField2)) {
                                throw new DateTimeException("Unable to apply override chronology '" + b10 + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new y(localDate, temporalAccessor, eVar2, zoneId);
            }
        }
        this.f13132a = temporalAccessor;
        this.f13133b = dateTimeFormatter;
    }

    public final void a() {
        this.f13134c--;
    }

    public final C b() {
        return this.f13133b.c();
    }

    public final Locale c() {
        return this.f13133b.d();
    }

    public final TemporalAccessor d() {
        return this.f13132a;
    }

    public final Long e(TemporalField temporalField) {
        try {
            return Long.valueOf(this.f13132a.h(temporalField));
        } catch (DateTimeException e10) {
            if (this.f13134c <= 0) {
                throw e10;
            }
            return null;
        }
    }

    public final Object f(TemporalQuery temporalQuery) {
        Object k10 = this.f13132a.k(temporalQuery);
        if (k10 == null && this.f13134c == 0) {
            StringBuilder b10 = AbstractC0484a.b("Unable to extract value: ");
            b10.append(this.f13132a.getClass());
            throw new DateTimeException(b10.toString());
        }
        return k10;
    }

    public final void g() {
        this.f13134c++;
    }

    public final String toString() {
        return this.f13132a.toString();
    }
}
