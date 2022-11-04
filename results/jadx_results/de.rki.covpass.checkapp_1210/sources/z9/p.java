package z9;

import hc.t;
import java.io.ByteArrayInputStream;
import java.util.zip.InflaterInputStream;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"Lz9/p;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "input", "a", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a */
    public static final p f26559a = new p();

    private p() {
    }

    public final byte[] a(byte[] bArr) {
        t.e(bArr, "input");
        return dc.a.c(new InflaterInputStream(new ByteArrayInputStream(bArr)));
    }
}
