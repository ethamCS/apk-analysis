package h9;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lh9/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "byte", "B", "g", "()B", "<init>", "(Ljava/lang/String;IB)V", "SIGNATURE", "UCI", "COUNTRY_UCI", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public enum a {
    SIGNATURE((byte) 10),
    UCI((byte) 11),
    COUNTRY_UCI((byte) 12);
    

    /* renamed from: c */
    private final byte f11594c;

    a(byte b10) {
        this.f11594c = b10;
    }

    public final byte g() {
        return this.f11594c;
    }
}
