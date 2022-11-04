package j$.time.zone;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;
/* loaded from: classes2.dex */
final class e extends f {

    /* renamed from: c */
    private final Set f13225c;

    public e() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f13225c = Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // j$.time.zone.f
    protected final ZoneRules c(String str) {
        if (this.f13225c.contains(str)) {
            return new ZoneRules(TimeZone.getTimeZone(str));
        }
        throw new c("Not a built-in time zone: " + str);
    }

    @Override // j$.time.zone.f
    protected final Set d() {
        return this.f13225c;
    }
}
