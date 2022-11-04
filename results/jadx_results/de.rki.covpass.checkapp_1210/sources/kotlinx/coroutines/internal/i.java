package kotlinx.coroutines.internal;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.s;
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {BuildConfig.FLAVOR, "a", "Z", "()Z", "ANDROID_DETECTED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a */
    private static final boolean f15431a;

    static {
        Object obj;
        try {
            s.a aVar = tb.s.Companion;
            obj = tb.s.c(Class.forName("android.os.Build"));
        } catch (Throwable th2) {
            s.a aVar2 = tb.s.Companion;
            obj = tb.s.c(tb.t.a(th2));
        }
        f15431a = tb.s.j(obj);
    }

    public static final boolean a() {
        return f15431a;
    }
}
