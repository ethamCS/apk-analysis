package rb;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\"&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lrb/f;", BuildConfig.FLAVOR, "ByteArrayPool", "Lrb/f;", "a", "()Lrb/f;", "getByteArrayPool$annotations", "()V", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private static final f<byte[]> f20579a = new C0330a();

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, d2 = {"rb/a$a", "Lrb/c;", BuildConfig.FLAVOR, "u", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* renamed from: rb.a$a */
    /* loaded from: classes.dex */
    public static final class C0330a extends c<byte[]> {
        C0330a() {
            super(128);
        }

        /* renamed from: u */
        public byte[] j() {
            return new byte[4096];
        }
    }

    public static final f<byte[]> a() {
        return f20579a;
    }
}
