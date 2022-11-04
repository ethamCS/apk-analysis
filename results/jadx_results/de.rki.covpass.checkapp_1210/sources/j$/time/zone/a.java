package j$.time.zone;

import j$.time.AbstractC0484a;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class a implements Comparable, Serializable {

    /* renamed from: a */
    private final LocalDateTime f13221a;

    /* renamed from: b */
    private final ZoneOffset f13222b;

    /* renamed from: c */
    private final ZoneOffset f13223c;

    public a(long j10, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f13221a = LocalDateTime.u(j10, 0, zoneOffset);
        this.f13222b = zoneOffset;
        this.f13223c = zoneOffset2;
    }

    public a(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f13221a = localDateTime;
        this.f13222b = zoneOffset;
        this.f13223c = zoneOffset2;
    }

    public final LocalDateTime b() {
        return this.f13221a.A(this.f13223c.s() - this.f13222b.s());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return h().compareTo(((a) obj).h());
    }

    public final LocalDateTime d() {
        return this.f13221a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f13221a.equals(aVar.f13221a) && this.f13222b.equals(aVar.f13222b) && this.f13223c.equals(aVar.f13223c);
    }

    public final Duration f() {
        return Duration.ofSeconds(this.f13223c.s() - this.f13222b.s());
    }

    public final Instant h() {
        LocalDateTime localDateTime = this.f13221a;
        return Instant.ofEpochSecond(localDateTime.D(this.f13222b), localDateTime.e().getNano());
    }

    public final int hashCode() {
        return (this.f13221a.hashCode() ^ this.f13222b.hashCode()) ^ Integer.rotateLeft(this.f13223c.hashCode(), 16);
    }

    public final ZoneOffset i() {
        return this.f13223c;
    }

    public final ZoneOffset k() {
        return this.f13222b;
    }

    public final List l() {
        return o() ? Collections.emptyList() : Arrays.asList(this.f13222b, this.f13223c);
    }

    public final boolean o() {
        return this.f13223c.s() > this.f13222b.s();
    }

    public final long toEpochSecond() {
        return this.f13221a.D(this.f13222b);
    }

    public final String toString() {
        StringBuilder b10 = AbstractC0484a.b("Transition[");
        b10.append(o() ? "Gap" : "Overlap");
        b10.append(" at ");
        b10.append(this.f13221a);
        b10.append(this.f13222b);
        b10.append(" to ");
        b10.append(this.f13223c);
        b10.append(']');
        return b10.toString();
    }
}
