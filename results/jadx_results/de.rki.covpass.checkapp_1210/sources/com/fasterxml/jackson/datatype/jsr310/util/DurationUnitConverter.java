package com.fasterxml.jackson.datatype.jsr310.util;

import com.fasterxml.jackson.datatype.jsr310.util.DurationUnitConverter;
import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.util.Collection$EL;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import z4.a;
import z4.b;
import z4.c;
import z4.d;
import z4.e;
import z4.f;
import z4.g;
import z4.h;
/* loaded from: classes.dex */
public class DurationUnitConverter {
    private static final Map<String, DurationSerialization> UNITS;
    final DurationSerialization serialization;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class DurationSerialization {
        final Function<Long, Duration> deserializer;
        final Function<Duration, Long> serializer;

        DurationSerialization(Function<Duration, Long> function, Function<Long, Duration> function2) {
            this.serializer = function;
            this.deserializer = function2;
        }

        static Function<Long, Duration> deserializer(final TemporalUnit temporalUnit) {
            return new Function() { // from class: z4.i
                @Override // j$.util.function.Function
                public /* synthetic */ Function andThen(Function function) {
                    return Objects.requireNonNull(function);
                }

                @Override // j$.util.function.Function
                public final Object apply(Object obj) {
                    Duration lambda$deserializer$0;
                    lambda$deserializer$0 = DurationUnitConverter.DurationSerialization.lambda$deserializer$0(TemporalUnit.this, (Long) obj);
                    return lambda$deserializer$0;
                }

                @Override // j$.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return Objects.requireNonNull(function);
                }
            };
        }

        public static /* synthetic */ Duration lambda$deserializer$0(TemporalUnit temporalUnit, Long l10) {
            return Duration.of(l10.longValue(), temporalUnit);
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ChronoUnit.NANOS.name(), new DurationSerialization(h.f26462a, DurationSerialization.deserializer(ChronoUnit.NANOS)));
        linkedHashMap.put(ChronoUnit.MICROS.name(), new DurationSerialization(b.f26456a, DurationSerialization.deserializer(ChronoUnit.MICROS)));
        linkedHashMap.put(ChronoUnit.MILLIS.name(), new DurationSerialization(f.f26460a, DurationSerialization.deserializer(ChronoUnit.MILLIS)));
        linkedHashMap.put(ChronoUnit.SECONDS.name(), new DurationSerialization(c.f26457a, DurationSerialization.deserializer(ChronoUnit.SECONDS)));
        linkedHashMap.put(ChronoUnit.MINUTES.name(), new DurationSerialization(g.f26461a, DurationSerialization.deserializer(ChronoUnit.MINUTES)));
        linkedHashMap.put(ChronoUnit.HOURS.name(), new DurationSerialization(e.f26459a, DurationSerialization.deserializer(ChronoUnit.HOURS)));
        linkedHashMap.put(ChronoUnit.HALF_DAYS.name(), new DurationSerialization(a.f26455a, DurationSerialization.deserializer(ChronoUnit.HALF_DAYS)));
        linkedHashMap.put(ChronoUnit.DAYS.name(), new DurationSerialization(d.f26458a, DurationSerialization.deserializer(ChronoUnit.DAYS)));
        UNITS = linkedHashMap;
    }

    DurationUnitConverter(DurationSerialization durationSerialization) {
        this.serialization = durationSerialization;
    }

    public static String descForAllowed() {
        return "\"" + ((String) Collection$EL.stream(UNITS.keySet()).collect(Collectors.joining("\", \""))) + "\"";
    }

    public static DurationUnitConverter from(String str) {
        DurationSerialization durationSerialization = UNITS.get(str);
        if (durationSerialization == null) {
            return null;
        }
        return new DurationUnitConverter(durationSerialization);
    }

    public static /* synthetic */ Long lambda$static$0(Duration duration) {
        return Long.valueOf(duration.toNanos() / 1000);
    }

    public static /* synthetic */ Long lambda$static$1(Duration duration) {
        return Long.valueOf(duration.toHours() / 12);
    }

    public long convert(Duration duration) {
        return this.serialization.serializer.apply(duration).longValue();
    }

    public Duration convert(long j10) {
        return this.serialization.deserializer.apply(Long.valueOf(j10));
    }
}
