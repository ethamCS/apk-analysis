package ib;

import hc.t;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0006\u001a\u00020\u0002*\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {BuildConfig.FLAVOR, "timestamp", "Lib/b;", "a", "(Ljava/lang/Long;)Lib/b;", "Ljava/util/Calendar;", "c", "(Ljava/util/Calendar;Ljava/lang/Long;)Lib/b;", "ktor-utils"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private static final TimeZone f12468a = DesugarTimeZone.getTimeZone("GMT");

    public static final b a(Long l10) {
        Calendar calendar = Calendar.getInstance(f12468a, Locale.ROOT);
        t.b(calendar);
        return c(calendar, l10);
    }

    public static /* synthetic */ b b(Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        return a(l10);
    }

    public static final b c(Calendar calendar, Long l10) {
        t.e(calendar, "<this>");
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return new b(calendar.get(13), calendar.get(12), calendar.get(11), d.Companion.a(((calendar.get(7) + 7) - 2) % 7), calendar.get(5), calendar.get(6), c.Companion.a(calendar.get(2)), calendar.get(1), calendar.getTimeInMillis());
    }
}
