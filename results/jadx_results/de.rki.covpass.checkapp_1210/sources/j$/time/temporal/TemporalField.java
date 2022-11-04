package j$.time.temporal;

import j$.time.format.ResolverStyle;
import java.util.Map;
/* loaded from: classes2.dex */
public interface TemporalField {
    boolean b();

    boolean d();

    u f();

    TemporalAccessor h(Map map, TemporalAccessor temporalAccessor, ResolverStyle resolverStyle);

    long i(TemporalAccessor temporalAccessor);

    boolean k(TemporalAccessor temporalAccessor);

    Temporal l(Temporal temporal, long j10);

    u o(TemporalAccessor temporalAccessor);
}
