package org.joda.time.tz;

import java.util.Collections;
import java.util.Set;
import org.joda.time.DateTimeZone;
/* loaded from: classes.dex */
public final class UTCProvider implements Provider {
    @Override // org.joda.time.tz.Provider
    public DateTimeZone getZone(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return DateTimeZone.UTC;
        }
        return null;
    }

    @Override // org.joda.time.tz.Provider
    public Set<String> getAvailableIDs() {
        return Collections.singleton("UTC");
    }
}
