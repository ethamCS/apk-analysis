package i9;

import hc.t;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Li9/c;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "kid", "[B", "d", "()[B", BuildConfig.FLAVOR, "hashVariant", "B", "c", "()B", "byteOne", "a", BuildConfig.FLAVOR, "chunks", "Ljava/util/List;", "b", "()Ljava/util/List;", BuildConfig.FLAVOR, "timestamp", "J", "e", "()J", "<init>", "([BBBLjava/util/List;J)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private final byte[] f12376a;

    /* renamed from: b */
    private final byte f12377b;

    /* renamed from: c */
    private final byte f12378c;

    /* renamed from: d */
    private final List<byte[]> f12379d;

    /* renamed from: e */
    private final long f12380e;

    public c(byte[] bArr, byte b10, byte b11, List<byte[]> list, long j10) {
        t.e(bArr, "kid");
        t.e(list, "chunks");
        this.f12376a = bArr;
        this.f12377b = b10;
        this.f12378c = b11;
        this.f12379d = list;
        this.f12380e = j10;
    }

    public final byte a() {
        return this.f12378c;
    }

    public final List<byte[]> b() {
        return this.f12379d;
    }

    public final byte c() {
        return this.f12377b;
    }

    public final byte[] d() {
        return this.f12376a;
    }

    public final long e() {
        return this.f12380e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.a(c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.c(obj, "null cannot be cast to non-null type de.rki.covpass.sdk.revocation.database.RevocationByteOneLocal");
        c cVar = (c) obj;
        return Arrays.equals(this.f12376a, cVar.f12376a) && this.f12377b == cVar.f12377b && this.f12378c == cVar.f12378c && t.a(this.f12379d, cVar.f12379d) && this.f12380e == cVar.f12380e;
    }

    public int hashCode() {
        return (((((((Arrays.hashCode(this.f12376a) * 31) + this.f12377b) * 31) + this.f12378c) * 31) + this.f12379d.hashCode()) * 31) + de.rki.covpass.sdk.cert.models.d.a(this.f12380e);
    }

    public String toString() {
        String arrays = Arrays.toString(this.f12376a);
        byte b10 = this.f12377b;
        byte b11 = this.f12378c;
        List<byte[]> list = this.f12379d;
        long j10 = this.f12380e;
        return "RevocationByteOneLocal(kid=" + arrays + ", hashVariant=" + ((int) b10) + ", byteOne=" + ((int) b11) + ", chunks=" + list + ", timestamp=" + j10 + ")";
    }
}
