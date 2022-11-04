package z9;

import hc.t;
import java.security.MessageDigest;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0006"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "c", "d", "a", "b", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class h {
    public static final byte[] a(String str) {
        t.e(str, "<this>");
        byte[] bytes = str.getBytes(bf.d.f5986b);
        t.d(bytes, "this as java.lang.String).getBytes(charset)");
        return b(bytes);
    }

    public static final byte[] b(byte[] bArr) {
        t.e(bArr, "<this>");
        byte[] digest = MessageDigest.getInstance("SHA-256").digest(bArr);
        t.d(digest, "getInstance(\"SHA-256\").digest(this)");
        return digest;
    }

    public static final byte[] c(String str) {
        t.e(str, "<this>");
        byte[] bytes = str.getBytes(bf.d.f5986b);
        t.d(bytes, "this as java.lang.String).getBytes(charset)");
        return d(bytes);
    }

    public static final byte[] d(byte[] bArr) {
        t.e(bArr, "<this>");
        byte[] digest = MessageDigest.getInstance("SHA-512").digest(bArr);
        t.d(digest, "getInstance(\"SHA-512\").digest(this)");
        return digest;
    }
}
