package j$.time.temporal;

import j$.time.AbstractC0484a;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class w implements Serializable {

    /* renamed from: g */
    private static final ConcurrentHashMap f13192g = new ConcurrentHashMap(4, 0.75f, 2);

    /* renamed from: h */
    public static final TemporalUnit f13193h = h.f13169d;

    /* renamed from: a */
    private final j$.time.d f13194a;

    /* renamed from: b */
    private final int f13195b;

    /* renamed from: c */
    private final transient TemporalField f13196c = v.n(this);

    /* renamed from: d */
    private final transient TemporalField f13197d = v.r(this);

    /* renamed from: e */
    private final transient TemporalField f13198e = v.s(this);

    /* renamed from: f */
    private final transient TemporalField f13199f = v.q(this);

    static {
        new w(j$.time.d.MONDAY, 4);
        g(j$.time.d.SUNDAY, 1);
    }

    private w(j$.time.d dVar, int i10) {
        v.t(this);
        Objects.requireNonNull(dVar, "firstDayOfWeek");
        if (i10 < 1 || i10 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f13194a = dVar;
        this.f13195b = i10;
    }

    public static w g(j$.time.d dVar, int i10) {
        String str = dVar.toString() + i10;
        ConcurrentHashMap concurrentHashMap = f13192g;
        w wVar = (w) concurrentHashMap.get(str);
        if (wVar == null) {
            concurrentHashMap.putIfAbsent(str, new w(dVar, i10));
            return (w) concurrentHashMap.get(str);
        }
        return wVar;
    }

    public final TemporalField d() {
        return this.f13196c;
    }

    public final j$.time.d e() {
        return this.f13194a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && hashCode() == obj.hashCode();
    }

    public final int f() {
        return this.f13195b;
    }

    public final TemporalField h() {
        return this.f13199f;
    }

    public final int hashCode() {
        return (this.f13194a.ordinal() * 7) + this.f13195b;
    }

    public final TemporalField i() {
        return this.f13197d;
    }

    public final TemporalField j() {
        return this.f13198e;
    }

    public final String toString() {
        StringBuilder b10 = AbstractC0484a.b("WeekFields[");
        b10.append(this.f13194a);
        b10.append(',');
        b10.append(this.f13195b);
        b10.append(']');
        return b10.toString();
    }
}
