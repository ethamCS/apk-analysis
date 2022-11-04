package j$.time;

import j$.time.zone.ZoneRules;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class y extends ZoneId {

    /* renamed from: b */
    private final String f13206b;

    /* renamed from: c */
    private final transient ZoneRules f13207c;

    public y(String str, ZoneRules zoneRules) {
        this.f13206b = str;
        this.f13207c = zoneRules;
    }

    public static y r(String str) {
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i10 == 0) && ((charAt < '0' || charAt > '9' || i10 == 0) && ((charAt != '~' || i10 == 0) && ((charAt != '.' || i10 == 0) && ((charAt != '_' || i10 == 0) && ((charAt != '+' || i10 == 0) && (charAt != '-' || i10 == 0))))))))) {
                    throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
                }
            }
            try {
                return new y(str, j$.time.zone.f.b(str, true));
            } catch (j$.time.zone.c e10) {
                throw e10;
            }
        }
        throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
    }

    @Override // j$.time.ZoneId
    public final ZoneRules getRules() {
        ZoneRules zoneRules = this.f13207c;
        return zoneRules != null ? zoneRules : j$.time.zone.f.b(this.f13206b, false);
    }

    @Override // j$.time.ZoneId
    public final String p() {
        return this.f13206b;
    }
}
