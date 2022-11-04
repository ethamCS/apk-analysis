package j$.time.temporal;

import j$.time.DateTimeException;
import java.io.Serializable;
/* loaded from: classes2.dex */
public final class u implements Serializable {

    /* renamed from: a */
    private final long f13179a;

    /* renamed from: b */
    private final long f13180b;

    /* renamed from: c */
    private final long f13181c;

    /* renamed from: d */
    private final long f13182d;

    private u(long j10, long j11, long j12, long j13) {
        this.f13179a = j10;
        this.f13180b = j11;
        this.f13181c = j12;
        this.f13182d = j13;
    }

    private String c(TemporalField temporalField, long j10) {
        if (temporalField == null) {
            return "Invalid value (valid values " + this + "): " + j10;
        }
        return "Invalid value for " + temporalField + " (valid values " + this + "): " + j10;
    }

    public static u i(long j10, long j11) {
        if (j10 <= j11) {
            return new u(j10, j10, j11, j11);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static u j(long j10, long j11, long j12) {
        if (j10 <= 1) {
            if (j11 > j12) {
                throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
            }
            if (1 > j12) {
                throw new IllegalArgumentException("Minimum value must be less than maximum value");
            }
            return new u(j10, 1L, j11, j12);
        }
        throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
    }

    public static u k(long j10, long j11) {
        return j(1L, j10, j11);
    }

    public final int a(long j10, TemporalField temporalField) {
        if (g() && h(j10)) {
            return (int) j10;
        }
        throw new DateTimeException(c(temporalField, j10));
    }

    public final long b(long j10, TemporalField temporalField) {
        if (h(j10)) {
            return j10;
        }
        throw new DateTimeException(c(temporalField, j10));
    }

    public final long d() {
        return this.f13182d;
    }

    public final long e() {
        return this.f13179a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f13179a == uVar.f13179a && this.f13180b == uVar.f13180b && this.f13181c == uVar.f13181c && this.f13182d == uVar.f13182d;
    }

    public final boolean f() {
        return this.f13179a == this.f13180b && this.f13181c == this.f13182d;
    }

    public final boolean g() {
        return this.f13179a >= -2147483648L && this.f13182d <= 2147483647L;
    }

    public final boolean h(long j10) {
        return j10 >= this.f13179a && j10 <= this.f13182d;
    }

    public final int hashCode() {
        long j10 = this.f13179a;
        long j11 = this.f13180b;
        long j12 = j10 + (j11 << 16) + (j11 >> 48);
        long j13 = this.f13181c;
        long j14 = j12 + (j13 << 32) + (j13 >> 32);
        long j15 = this.f13182d;
        long j16 = j14 + (j15 << 48) + (j15 >> 16);
        return (int) (j16 ^ (j16 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13179a);
        if (this.f13179a != this.f13180b) {
            sb2.append('/');
            sb2.append(this.f13180b);
        }
        sb2.append(" - ");
        sb2.append(this.f13181c);
        if (this.f13181c != this.f13182d) {
            sb2.append('/');
            sb2.append(this.f13182d);
        }
        return sb2.toString();
    }
}
