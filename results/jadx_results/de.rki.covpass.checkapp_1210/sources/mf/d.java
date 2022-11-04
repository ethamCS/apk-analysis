package mf;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.s;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lmf/d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "array", "Ltb/e0;", "a", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a */
    public static final d f16612a = new d();

    /* renamed from: b */
    private static final ub.h<char[]> f16613b = new ub.h<>();

    /* renamed from: c */
    private static int f16614c;

    /* renamed from: d */
    private static final int f16615d;

    static {
        Object obj;
        Integer l10;
        try {
            s.a aVar = tb.s.Companion;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            hc.t.d(property, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            l10 = bf.w.l(property);
            obj = tb.s.c(l10);
        } catch (Throwable th2) {
            s.a aVar2 = tb.s.Companion;
            obj = tb.s.c(tb.t.a(th2));
        }
        if (tb.s.i(obj)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        f16615d = num != null ? num.intValue() : 1048576;
    }

    private d() {
    }

    public final void a(char[] cArr) {
        hc.t.e(cArr, "array");
        synchronized (this) {
            int i10 = f16614c;
            if (cArr.length + i10 < f16615d) {
                f16614c = i10 + cArr.length;
                f16613b.i(cArr);
            }
            tb.e0 e0Var = tb.e0.f22152a;
        }
    }

    public final char[] b() {
        char[] V;
        synchronized (this) {
            V = f16613b.V();
            if (V != null) {
                f16614c -= V.length;
            } else {
                V = null;
            }
        }
        return V == null ? new char[128] : V;
    }
}
