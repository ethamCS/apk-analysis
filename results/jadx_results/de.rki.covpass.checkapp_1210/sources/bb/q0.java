package bb;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lbb/q0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "encodeKey", "Z", "g", "()Z", "encodeValue", "h", "<init>", "(Ljava/lang/String;IZZ)V", "DEFAULT", "KEY_ONLY", "VALUE_ONLY", "NO_ENCODING", "ktor-http"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public enum q0 {
    DEFAULT(true, true),
    KEY_ONLY(true, false),
    VALUE_ONLY(false, true),
    NO_ENCODING(false, false);
    

    /* renamed from: c */
    private final boolean f5919c;

    /* renamed from: d */
    private final boolean f5920d;

    q0(boolean z10, boolean z11) {
        this.f5919c = z10;
        this.f5920d = z11;
    }

    public final boolean g() {
        return this.f5919c;
    }

    public final boolean h() {
        return this.f5920d;
    }
}
