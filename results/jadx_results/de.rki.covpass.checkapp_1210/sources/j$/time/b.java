package j$.time;

import java.io.Serializable;
/* loaded from: classes2.dex */
public final class b extends c implements Serializable {

    /* renamed from: a */
    private final ZoneId f13015a;

    public b(ZoneId zoneId) {
        this.f13015a = zoneId;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f13015a.equals(((b) obj).f13015a);
        }
        return false;
    }

    @Override // j$.time.c
    public final long g() {
        return System.currentTimeMillis();
    }

    public final int hashCode() {
        return this.f13015a.hashCode() + 1;
    }

    public final ZoneId i() {
        return this.f13015a;
    }

    public final Instant j() {
        return Instant.ofEpochMilli(System.currentTimeMillis());
    }

    public final String toString() {
        StringBuilder b10 = AbstractC0484a.b("SystemClock[");
        b10.append(this.f13015a);
        b10.append("]");
        return b10.toString();
    }
}
