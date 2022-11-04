package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
/* renamed from: j$.time.format.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0485a implements TemporalQuery {

    /* renamed from: a */
    public static final /* synthetic */ C0485a f13065a = new C0485a();

    private /* synthetic */ C0485a() {
    }

    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        int i10 = DateTimeFormatterBuilder.f13045i;
        int i11 = j$.time.temporal.k.f13171a;
        ZoneId zoneId = (ZoneId) temporalAccessor.k(j$.time.temporal.m.f13172a);
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }
}
