package h9;

import hc.t;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0005\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lh9/b;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "kid", "[B", "b", "()[B", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "hashVariants", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "<init>", "([BLjava/util/Map;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private final byte[] f11595a;

    /* renamed from: b */
    private final Map<Byte, Integer> f11596b;

    public b(byte[] bArr, Map<Byte, Integer> map) {
        t.e(bArr, "kid");
        t.e(map, "hashVariants");
        this.f11595a = bArr;
        this.f11596b = map;
    }

    public final Map<Byte, Integer> a() {
        return this.f11596b;
    }

    public final byte[] b() {
        return this.f11595a;
    }

    public boolean equals(Object obj) {
        if (!t.a(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.c(obj, "null cannot be cast to non-null type de.rki.covpass.sdk.revocation.RevocationKidEntry");
        b bVar = (b) obj;
        return Arrays.equals(this.f11595a, bVar.f11595a) && t.a(this.f11596b, bVar.f11596b);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f11595a) * 31) + this.f11596b.hashCode();
    }

    public String toString() {
        String arrays = Arrays.toString(this.f11595a);
        Map<Byte, Integer> map = this.f11596b;
        return "RevocationKidEntry(kid=" + arrays + ", hashVariants=" + map + ")";
    }
}
