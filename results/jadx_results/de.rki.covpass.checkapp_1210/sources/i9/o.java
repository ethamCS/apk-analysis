package i9;

import hc.t;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0005\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Li9/o;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "kid", "[B", "b", "()[B", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "hashVariants", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "<init>", "([BLjava/util/Map;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a */
    private final byte[] f12466a;

    /* renamed from: b */
    private final Map<Byte, Integer> f12467b;

    public o(byte[] bArr, Map<Byte, Integer> map) {
        t.e(bArr, "kid");
        t.e(map, "hashVariants");
        this.f12466a = bArr;
        this.f12467b = map;
    }

    public final Map<Byte, Integer> a() {
        return this.f12467b;
    }

    public final byte[] b() {
        return this.f12466a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.a(o.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.c(obj, "null cannot be cast to non-null type de.rki.covpass.sdk.revocation.database.RevocationKidLocal");
        o oVar = (o) obj;
        return Arrays.equals(this.f12466a, oVar.f12466a) && t.a(this.f12467b, oVar.f12467b);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f12466a) * 31) + this.f12467b.hashCode();
    }

    public String toString() {
        String arrays = Arrays.toString(this.f12466a);
        Map<Byte, Integer> map = this.f12467b;
        return "RevocationKidLocal(kid=" + arrays + ", hashVariants=" + map + ")";
    }
}
