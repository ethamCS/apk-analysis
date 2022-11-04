package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a */
    private DateTimeFormatter f13123a;

    /* renamed from: d */
    private final ArrayList f13126d;

    /* renamed from: b */
    private boolean f13124b = true;

    /* renamed from: c */
    private boolean f13125c = true;

    /* renamed from: e */
    private ArrayList f13127e = null;

    public x(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f13126d = arrayList;
        this.f13123a = dateTimeFormatter;
        arrayList.add(new D());
    }

    public static boolean c(char c10, char c11) {
        return c10 == c11 || Character.toUpperCase(c10) == Character.toUpperCase(c11) || Character.toLowerCase(c10) == Character.toLowerCase(c11);
    }

    private D e() {
        ArrayList arrayList = this.f13126d;
        return (D) arrayList.get(arrayList.size() - 1);
    }

    public final void a(Consumer consumer) {
        if (this.f13127e == null) {
            this.f13127e = new ArrayList();
        }
        this.f13127e.add(consumer);
    }

    public final boolean b(char c10, char c11) {
        if (this.f13124b) {
            return c10 == c11;
        }
        return c(c10, c11);
    }

    public final x d() {
        x xVar = new x(this.f13123a);
        xVar.f13124b = this.f13124b;
        xVar.f13125c = this.f13125c;
        return xVar;
    }

    public final void f(boolean z10) {
        ArrayList arrayList;
        int i10;
        if (z10) {
            arrayList = this.f13126d;
            i10 = arrayList.size() - 2;
        } else {
            arrayList = this.f13126d;
            i10 = arrayList.size() - 1;
        }
        arrayList.remove(i10);
    }

    public final C g() {
        return this.f13123a.c();
    }

    public final j$.time.chrono.e h() {
        j$.time.chrono.e eVar = e().f13031c;
        if (eVar == null) {
            j$.time.chrono.e b10 = this.f13123a.b();
            return b10 == null ? j$.time.chrono.f.f13017a : b10;
        }
        return eVar;
    }

    public final Locale i() {
        return this.f13123a.d();
    }

    public final Long j(TemporalField temporalField) {
        return (Long) e().f13029a.get(temporalField);
    }

    public final boolean k() {
        return this.f13124b;
    }

    public final boolean l() {
        return this.f13125c;
    }

    public final void m(boolean z10) {
        this.f13124b = z10;
    }

    public final void n(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        e().f13030b = zoneId;
    }

    public final int o(TemporalField temporalField, long j10, int i10, int i11) {
        Objects.requireNonNull(temporalField, "field");
        Long l10 = (Long) e().f13029a.put(temporalField, Long.valueOf(j10));
        return (l10 == null || l10.longValue() == j10) ? i11 : ~i10;
    }

    public final void p() {
        e().f13032d = true;
    }

    public final void q(boolean z10) {
        this.f13125c = z10;
    }

    public final void r() {
        ArrayList arrayList = this.f13126d;
        D e10 = e();
        Objects.requireNonNull(e10);
        D d10 = new D();
        d10.f13029a.putAll(e10.f13029a);
        d10.f13030b = e10.f13030b;
        d10.f13031c = e10.f13031c;
        d10.f13032d = e10.f13032d;
        arrayList.add(d10);
    }

    public final boolean s(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        if (i10 + i12 > charSequence.length() || i11 + i12 > charSequence2.length()) {
            return false;
        }
        if (this.f13124b) {
            for (int i13 = 0; i13 < i12; i13++) {
                if (charSequence.charAt(i10 + i13) != charSequence2.charAt(i11 + i13)) {
                    return false;
                }
            }
            return true;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            char charAt = charSequence.charAt(i10 + i14);
            char charAt2 = charSequence2.charAt(i11 + i14);
            if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    public final TemporalAccessor t(ResolverStyle resolverStyle, Set set) {
        D e10 = e();
        e10.f13031c = h();
        ZoneId zoneId = e10.f13030b;
        if (zoneId == null) {
            zoneId = this.f13123a.getZone();
        }
        e10.f13030b = zoneId;
        e10.p(resolverStyle, set);
        return e10;
    }

    public final String toString() {
        return e().toString();
    }
}
