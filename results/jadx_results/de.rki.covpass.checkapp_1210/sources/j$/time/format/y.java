package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class y implements TemporalAccessor {

    /* renamed from: a */
    final /* synthetic */ ChronoLocalDate f13128a;

    /* renamed from: b */
    final /* synthetic */ TemporalAccessor f13129b;

    /* renamed from: c */
    final /* synthetic */ j$.time.chrono.e f13130c;

    /* renamed from: d */
    final /* synthetic */ ZoneId f13131d;

    public y(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, j$.time.chrono.e eVar, ZoneId zoneId) {
        this.f13128a = chronoLocalDate;
        this.f13129b = temporalAccessor;
        this.f13130c = eVar;
        this.f13131d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(TemporalField temporalField) {
        return (this.f13128a == null || !temporalField.d()) ? this.f13129b.c(temporalField) : this.f13128a.c(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u f(TemporalField temporalField) {
        return ((this.f13128a == null || !temporalField.d()) ? this.f13129b : this.f13128a).f(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.time.temporal.k.b(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(TemporalField temporalField) {
        return ((this.f13128a == null || !temporalField.d()) ? this.f13129b : this.f13128a).h(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object k(TemporalQuery temporalQuery) {
        int i10 = j$.time.temporal.k.f13171a;
        return temporalQuery == j$.time.temporal.n.f13173a ? this.f13130c : temporalQuery == j$.time.temporal.m.f13172a ? this.f13131d : temporalQuery == j$.time.temporal.o.f13174a ? this.f13129b.k(temporalQuery) : temporalQuery.queryFrom(this);
    }
}
