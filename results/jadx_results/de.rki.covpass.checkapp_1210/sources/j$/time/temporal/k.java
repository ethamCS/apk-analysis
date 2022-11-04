package j$.time.temporal;

import j$.time.AbstractC0484a;
import j$.time.DateTimeException;
import j$.util.function.BiConsumer;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a */
    public static final /* synthetic */ int f13171a = 0;

    public static void a(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.w(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static int b(TemporalAccessor temporalAccessor, TemporalField temporalField) {
        u f10 = temporalAccessor.f(temporalField);
        if (!f10.g()) {
            throw new t("Invalid field " + temporalField + " for get() method, use getLong() instead");
        }
        long h10 = temporalAccessor.h(temporalField);
        if (f10.h(h10)) {
            return (int) h10;
        }
        throw new DateTimeException("Invalid value for " + temporalField + " (valid values " + f10 + "): " + h10);
    }

    public static Object c(TemporalAccessor temporalAccessor, TemporalQuery temporalQuery) {
        int i10 = f13171a;
        if (temporalQuery == m.f13172a || temporalQuery == n.f13173a || temporalQuery == o.f13174a) {
            return null;
        }
        return temporalQuery.queryFrom(temporalAccessor);
    }

    public static u d(TemporalAccessor temporalAccessor, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            Objects.requireNonNull(temporalField, "field");
            return temporalField.o(temporalAccessor);
        } else if (!temporalAccessor.c(temporalField)) {
            throw new t(AbstractC0484a.a("Unsupported field: ", temporalField));
        } else {
            return temporalField.f();
        }
    }

    public static /* synthetic */ int e(int i10) {
        int i11 = i10 % 7;
        if (i11 == 0) {
            return 0;
        }
        return (((i10 ^ 7) >> 31) | 1) > 0 ? i11 : i11 + 7;
    }

    public static i f(j$.time.d dVar) {
        return new j(dVar.o());
    }
}
