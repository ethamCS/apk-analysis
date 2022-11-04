package i9;

import hc.t;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Li9/f;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "kid", "[B", "e", "()[B", BuildConfig.FLAVOR, "hashVariant", "B", "d", "()B", "byteOne", "a", "byteTwo", "b", BuildConfig.FLAVOR, "chunks", "Ljava/util/List;", "c", "()Ljava/util/List;", BuildConfig.FLAVOR, "timestamp", "J", "f", "()J", "<init>", "([BBBBLjava/util/List;J)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private final byte[] f12416a;

    /* renamed from: b */
    private final byte f12417b;

    /* renamed from: c */
    private final byte f12418c;

    /* renamed from: d */
    private final byte f12419d;

    /* renamed from: e */
    private final List<byte[]> f12420e;

    /* renamed from: f */
    private final long f12421f;

    public f(byte[] bArr, byte b10, byte b11, byte b12, List<byte[]> list, long j10) {
        t.e(bArr, "kid");
        t.e(list, "chunks");
        this.f12416a = bArr;
        this.f12417b = b10;
        this.f12418c = b11;
        this.f12419d = b12;
        this.f12420e = list;
        this.f12421f = j10;
    }

    public final byte a() {
        return this.f12418c;
    }

    public final byte b() {
        return this.f12419d;
    }

    public final List<byte[]> c() {
        return this.f12420e;
    }

    public final byte d() {
        return this.f12417b;
    }

    public final byte[] e() {
        return this.f12416a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.a(f.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.c(obj, "null cannot be cast to non-null type de.rki.covpass.sdk.revocation.database.RevocationByteTwoLocal");
        f fVar = (f) obj;
        return Arrays.equals(this.f12416a, fVar.f12416a) && this.f12417b == fVar.f12417b && this.f12418c == fVar.f12418c && this.f12419d == fVar.f12419d && t.a(this.f12420e, fVar.f12420e);
    }

    public final long f() {
        return this.f12421f;
    }

    public int hashCode() {
        return (((((((Arrays.hashCode(this.f12416a) * 31) + this.f12417b) * 31) + this.f12418c) * 31) + this.f12419d) * 31) + this.f12420e.hashCode();
    }

    public String toString() {
        String arrays = Arrays.toString(this.f12416a);
        byte b10 = this.f12417b;
        byte b11 = this.f12418c;
        byte b12 = this.f12419d;
        List<byte[]> list = this.f12420e;
        long j10 = this.f12421f;
        return "RevocationByteTwoLocal(kid=" + arrays + ", hashVariant=" + ((int) b10) + ", byteOne=" + ((int) b11) + ", byteTwo=" + ((int) b12) + ", chunks=" + list + ", timestamp=" + j10 + ")";
    }
}
