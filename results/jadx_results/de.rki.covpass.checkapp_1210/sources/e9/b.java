package e9;

import hc.t;
import java.util.Arrays;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001¨\u0006\r"}, d2 = {"Le9/b;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "data", "<init>", "([B)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private final byte[] f9535a;

    public b(byte[] bArr) {
        t.e(bArr, "data");
        this.f9535a = bArr;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof b) && Arrays.equals(this.f9535a, ((b) obj).f9535a));
    }

    public int hashCode() {
        return Arrays.hashCode(this.f9535a);
    }

    public String toString() {
        String arrays = Arrays.toString(this.f9535a);
        return "KeyIdentifier(data=" + arrays + ")";
    }
}
