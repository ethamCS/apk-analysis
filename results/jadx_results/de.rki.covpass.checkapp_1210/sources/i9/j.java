package i9;

import de.rki.covpass.sdk.revocation.RevocationIndexEntry;
import hc.t;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Li9/j;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "kid", "[B", "c", "()[B", BuildConfig.FLAVOR, "hashVariant", "B", "a", "()B", BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/revocation/RevocationIndexEntry;", "index", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "<init>", "([BBLjava/util/Map;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    private final byte[] f12444a;

    /* renamed from: b */
    private final byte f12445b;

    /* renamed from: c */
    private final Map<Byte, RevocationIndexEntry> f12446c;

    public j(byte[] bArr, byte b10, Map<Byte, RevocationIndexEntry> map) {
        t.e(bArr, "kid");
        t.e(map, "index");
        this.f12444a = bArr;
        this.f12445b = b10;
        this.f12446c = map;
    }

    public final byte a() {
        return this.f12445b;
    }

    public final Map<Byte, RevocationIndexEntry> b() {
        return this.f12446c;
    }

    public final byte[] c() {
        return this.f12444a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.a(j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.c(obj, "null cannot be cast to non-null type de.rki.covpass.sdk.revocation.database.RevocationIndexLocal");
        j jVar = (j) obj;
        return Arrays.equals(this.f12444a, jVar.f12444a) && this.f12445b == jVar.f12445b && t.a(this.f12446c, jVar.f12446c);
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.f12444a) * 31) + this.f12445b) * 31) + this.f12446c.hashCode();
    }

    public String toString() {
        String arrays = Arrays.toString(this.f12444a);
        byte b10 = this.f12445b;
        Map<Byte, RevocationIndexEntry> map = this.f12446c;
        return "RevocationIndexLocal(kid=" + arrays + ", hashVariant=" + ((int) b10) + ", index=" + map + ")";
    }
}
