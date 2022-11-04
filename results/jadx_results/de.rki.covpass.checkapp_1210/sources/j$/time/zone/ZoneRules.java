package j$.time.zone;

import j$.time.AbstractC0484a;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.util.AbstractC0516o;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
/* loaded from: classes2.dex */
public final class ZoneRules implements Serializable {

    /* renamed from: i */
    private static final long[] f13209i = new long[0];

    /* renamed from: j */
    private static final b[] f13210j = new b[0];

    /* renamed from: k */
    private static final LocalDateTime[] f13211k = new LocalDateTime[0];

    /* renamed from: l */
    private static final a[] f13212l = new a[0];

    /* renamed from: a */
    private final long[] f13213a;

    /* renamed from: b */
    private final ZoneOffset[] f13214b;

    /* renamed from: c */
    private final long[] f13215c;

    /* renamed from: d */
    private final LocalDateTime[] f13216d;

    /* renamed from: e */
    private final ZoneOffset[] f13217e;

    /* renamed from: f */
    private final b[] f13218f;

    /* renamed from: g */
    private final TimeZone f13219g;

    /* renamed from: h */
    private final transient ConcurrentHashMap f13220h;

    private ZoneRules(ZoneOffset zoneOffset) {
        this.f13220h = new ConcurrentHashMap();
        this.f13214b = r0;
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        long[] jArr = f13209i;
        this.f13213a = jArr;
        this.f13215c = jArr;
        this.f13216d = f13211k;
        this.f13217e = zoneOffsetArr;
        this.f13218f = f13210j;
        this.f13219g = null;
    }

    public ZoneRules(TimeZone timeZone) {
        this.f13220h = new ConcurrentHashMap();
        this.f13214b = r0;
        ZoneOffset[] zoneOffsetArr = {k(timeZone.getRawOffset())};
        long[] jArr = f13209i;
        this.f13213a = jArr;
        this.f13215c = jArr;
        this.f13216d = f13211k;
        this.f13217e = zoneOffsetArr;
        this.f13218f = f13210j;
        this.f13219g = timeZone;
    }

    private Object a(LocalDateTime localDateTime, a aVar) {
        LocalDateTime d10 = aVar.d();
        boolean o10 = aVar.o();
        boolean s10 = localDateTime.s(d10);
        return o10 ? s10 ? aVar.k() : localDateTime.s(aVar.b()) ? aVar : aVar.i() : !s10 ? aVar.i() : localDateTime.s(aVar.b()) ? aVar.k() : aVar;
    }

    private a[] b(int i10) {
        long j10;
        Integer valueOf = Integer.valueOf(i10);
        a[] aVarArr = (a[]) this.f13220h.get(valueOf);
        if (aVarArr != null) {
            return aVarArr;
        }
        if (this.f13219g == null) {
            b[] bVarArr = this.f13218f;
            a[] aVarArr2 = new a[bVarArr.length];
            if (bVarArr.length > 0) {
                b bVar = bVarArr[0];
                throw null;
            }
            if (i10 < 2100) {
                this.f13220h.putIfAbsent(valueOf, aVarArr2);
            }
            return aVarArr2;
        } else if (i10 < 1800) {
            return f13212l;
        } else {
            long D = LocalDateTime.of(i10 - 1, 12, 31, 0, 0).D(this.f13214b[0]);
            int offset = this.f13219g.getOffset(D * 1000);
            long j11 = 31968000 + D;
            a[] aVarArr3 = f13212l;
            while (D < j11) {
                long j12 = 7776000 + D;
                long j13 = D;
                if (offset != this.f13219g.getOffset(j12 * 1000)) {
                    D = j13;
                    while (j12 - D > 1) {
                        int i11 = offset;
                        long d10 = j$.time.c.d(j12 + D, 2L);
                        long j14 = j11;
                        if (this.f13219g.getOffset(d10 * 1000) == i11) {
                            D = d10;
                        } else {
                            j12 = d10;
                        }
                        offset = i11;
                        j11 = j14;
                    }
                    j10 = j11;
                    int i12 = offset;
                    if (this.f13219g.getOffset(D * 1000) == i12) {
                        D = j12;
                    }
                    ZoneOffset k10 = k(i12);
                    offset = this.f13219g.getOffset(D * 1000);
                    ZoneOffset k11 = k(offset);
                    if (c(D, k11) == i10) {
                        a[] aVarArr4 = (a[]) Arrays.copyOf(aVarArr3, aVarArr3.length + 1);
                        aVarArr4[aVarArr4.length - 1] = new a(D, k10, k11);
                        aVarArr3 = aVarArr4;
                    }
                } else {
                    j10 = j11;
                    D = j12;
                }
                j11 = j10;
            }
            if (1916 <= i10 && i10 < 2100) {
                this.f13220h.putIfAbsent(valueOf, aVarArr3);
            }
            return aVarArr3;
        }
    }

    private int c(long j10, ZoneOffset zoneOffset) {
        return LocalDate.ofEpochDay(j$.time.c.d(j10 + zoneOffset.s(), 86400L)).getYear();
    }

    private Object e(LocalDateTime localDateTime) {
        LocalDateTime[] localDateTimeArr;
        Object obj = null;
        int i10 = 0;
        if (this.f13219g != null) {
            a[] b10 = b(localDateTime.getYear());
            if (b10.length == 0) {
                return k(this.f13219g.getOffset(localDateTime.D(this.f13214b[0]) * 1000));
            }
            int length = b10.length;
            while (i10 < length) {
                a aVar = b10[i10];
                Object a10 = a(localDateTime, aVar);
                if ((a10 instanceof a) || a10.equals(aVar.k())) {
                    return a10;
                }
                i10++;
                obj = a10;
            }
            return obj;
        } else if (this.f13215c.length == 0) {
            return this.f13214b[0];
        } else {
            if (this.f13218f.length > 0) {
                if (localDateTime.r(this.f13216d[localDateTimeArr.length - 1])) {
                    a[] b11 = b(localDateTime.getYear());
                    int length2 = b11.length;
                    while (i10 < length2) {
                        a aVar2 = b11[i10];
                        Object a11 = a(localDateTime, aVar2);
                        if ((a11 instanceof a) || a11.equals(aVar2.k())) {
                            return a11;
                        }
                        i10++;
                        obj = a11;
                    }
                    return obj;
                }
            }
            int binarySearch = Arrays.binarySearch(this.f13216d, localDateTime);
            if (binarySearch == -1) {
                return this.f13217e[0];
            }
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            } else {
                LocalDateTime[] localDateTimeArr2 = this.f13216d;
                if (binarySearch < localDateTimeArr2.length - 1) {
                    int i11 = binarySearch + 1;
                    if (localDateTimeArr2[binarySearch].equals(localDateTimeArr2[i11])) {
                        binarySearch = i11;
                    }
                }
            }
            if ((binarySearch & 1) != 0) {
                return this.f13217e[(binarySearch / 2) + 1];
            }
            LocalDateTime[] localDateTimeArr3 = this.f13216d;
            LocalDateTime localDateTime2 = localDateTimeArr3[binarySearch];
            LocalDateTime localDateTime3 = localDateTimeArr3[binarySearch + 1];
            ZoneOffset[] zoneOffsetArr = this.f13217e;
            int i12 = binarySearch / 2;
            ZoneOffset zoneOffset = zoneOffsetArr[i12];
            ZoneOffset zoneOffset2 = zoneOffsetArr[i12 + 1];
            return zoneOffset2.s() > zoneOffset.s() ? new a(localDateTime2, zoneOffset, zoneOffset2) : new a(localDateTime3, zoneOffset, zoneOffset2);
        }
    }

    public static ZoneRules j(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return new ZoneRules(zoneOffset);
    }

    private static ZoneOffset k(int i10) {
        return ZoneOffset.u(i10 / 1000);
    }

    public final ZoneOffset d(Instant instant) {
        long[] jArr;
        ZoneOffset[] zoneOffsetArr;
        TimeZone timeZone = this.f13219g;
        if (timeZone != null) {
            return k(timeZone.getOffset(instant.toEpochMilli()));
        }
        if (this.f13215c.length == 0) {
            return this.f13214b[0];
        }
        long epochSecond = instant.getEpochSecond();
        if (this.f13218f.length > 0) {
            if (epochSecond > this.f13215c[jArr.length - 1]) {
                a[] b10 = b(c(epochSecond, this.f13217e[zoneOffsetArr.length - 1]));
                a aVar = null;
                for (int i10 = 0; i10 < b10.length; i10++) {
                    aVar = b10[i10];
                    if (epochSecond < aVar.toEpochSecond()) {
                        return aVar.k();
                    }
                }
                return aVar.i();
            }
        }
        int binarySearch = Arrays.binarySearch(this.f13215c, epochSecond);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f13217e[binarySearch + 1];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneRules)) {
            return false;
        }
        ZoneRules zoneRules = (ZoneRules) obj;
        return AbstractC0516o.p(this.f13219g, zoneRules.f13219g) && Arrays.equals(this.f13213a, zoneRules.f13213a) && Arrays.equals(this.f13214b, zoneRules.f13214b) && Arrays.equals(this.f13215c, zoneRules.f13215c) && Arrays.equals(this.f13217e, zoneRules.f13217e) && Arrays.equals(this.f13218f, zoneRules.f13218f);
    }

    public final a f(LocalDateTime localDateTime) {
        Object e10 = e(localDateTime);
        if (e10 instanceof a) {
            return (a) e10;
        }
        return null;
    }

    public final List g(LocalDateTime localDateTime) {
        Object e10 = e(localDateTime);
        return e10 instanceof a ? ((a) e10).l() : Collections.singletonList((ZoneOffset) e10);
    }

    public ZoneOffset getOffset(LocalDateTime localDateTime) {
        Object e10 = e(localDateTime);
        return e10 instanceof a ? ((a) e10).k() : (ZoneOffset) e10;
    }

    public final boolean h(Instant instant) {
        ZoneOffset zoneOffset;
        TimeZone timeZone = this.f13219g;
        if (timeZone != null) {
            zoneOffset = k(timeZone.getRawOffset());
        } else if (this.f13215c.length == 0) {
            zoneOffset = this.f13214b[0];
        } else {
            int binarySearch = Arrays.binarySearch(this.f13213a, instant.getEpochSecond());
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            zoneOffset = this.f13214b[binarySearch + 1];
        }
        return !zoneOffset.equals(d(instant));
    }

    public final int hashCode() {
        TimeZone timeZone = this.f13219g;
        return (((((timeZone != null ? timeZone.hashCode() : 0) ^ Arrays.hashCode(this.f13213a)) ^ Arrays.hashCode(this.f13214b)) ^ Arrays.hashCode(this.f13215c)) ^ Arrays.hashCode(this.f13217e)) ^ Arrays.hashCode(this.f13218f);
    }

    public final boolean i() {
        TimeZone timeZone = this.f13219g;
        if (timeZone == null) {
            return this.f13215c.length == 0;
        }
        if (!timeZone.useDaylightTime() && this.f13219g.getDSTSavings() == 0) {
            Instant now = Instant.now();
            a aVar = null;
            if (this.f13219g != null) {
                long epochSecond = now.getEpochSecond();
                if (now.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
                    epochSecond++;
                }
                int c10 = c(epochSecond, d(now));
                a[] b10 = b(c10);
                int length = b10.length - 1;
                while (true) {
                    if (length >= 0) {
                        if (epochSecond > b10[length].toEpochSecond()) {
                            aVar = b10[length];
                            break;
                        }
                        length--;
                    } else if (c10 > 1800) {
                        a[] b11 = b(c10 - 1);
                        int length2 = b11.length - 1;
                        while (true) {
                            if (length2 < 0) {
                                long min = Math.min(epochSecond - 31104000, (j$.time.c.h().g() / 1000) + 31968000);
                                int offset = this.f13219g.getOffset((epochSecond - 1) * 1000);
                                long epochDay = LocalDate.of(1800, 1, 1).toEpochDay() * 86400;
                                while (true) {
                                    if (epochDay > min) {
                                        break;
                                    }
                                    int offset2 = this.f13219g.getOffset(min * 1000);
                                    if (offset != offset2) {
                                        int c11 = c(min, k(offset2));
                                        a[] b12 = b(c11 + 1);
                                        int length3 = b12.length - 1;
                                        while (true) {
                                            if (length3 < 0) {
                                                a[] b13 = b(c11);
                                                aVar = b13[b13.length - 1];
                                                break;
                                            } else if (epochSecond > b12[length3].toEpochSecond()) {
                                                aVar = b12[length3];
                                                break;
                                            } else {
                                                length3--;
                                            }
                                        }
                                    } else {
                                        min -= 7776000;
                                    }
                                }
                            } else if (epochSecond > b11[length2].toEpochSecond()) {
                                aVar = b11[length2];
                                break;
                            } else {
                                length2--;
                            }
                        }
                    }
                }
            } else if (this.f13215c.length != 0) {
                long epochSecond2 = now.getEpochSecond();
                if (now.getNano() > 0 && epochSecond2 < Long.MAX_VALUE) {
                    epochSecond2++;
                }
                long[] jArr = this.f13215c;
                long j10 = jArr[jArr.length - 1];
                if (this.f13218f.length > 0 && epochSecond2 > j10) {
                    ZoneOffset[] zoneOffsetArr = this.f13217e;
                    ZoneOffset zoneOffset = zoneOffsetArr[zoneOffsetArr.length - 1];
                    int c12 = c(epochSecond2, zoneOffset);
                    a[] b14 = b(c12);
                    int length4 = b14.length - 1;
                    while (true) {
                        if (length4 < 0) {
                            int i10 = c12 - 1;
                            if (i10 > c(j10, zoneOffset)) {
                                a[] b15 = b(i10);
                                aVar = b15[b15.length - 1];
                            }
                        } else if (epochSecond2 > b14[length4].toEpochSecond()) {
                            aVar = b14[length4];
                            break;
                        } else {
                            length4--;
                        }
                    }
                }
                int binarySearch = Arrays.binarySearch(this.f13215c, epochSecond2);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                if (binarySearch > 0) {
                    int i11 = binarySearch - 1;
                    long j11 = this.f13215c[i11];
                    ZoneOffset[] zoneOffsetArr2 = this.f13217e;
                    aVar = new a(j11, zoneOffsetArr2[i11], zoneOffsetArr2[binarySearch]);
                }
            }
            if (aVar == null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2;
        if (this.f13219g != null) {
            sb2 = AbstractC0484a.b("ZoneRules[timeZone=");
            sb2.append(this.f13219g.getID());
        } else {
            sb2 = AbstractC0484a.b("ZoneRules[currentStandardOffset=");
            ZoneOffset[] zoneOffsetArr = this.f13214b;
            sb2.append(zoneOffsetArr[zoneOffsetArr.length - 1]);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
