package le;

import hc.t;
import java.io.InputStream;
import ke.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ne.n;
import rd.m;
import tb.r;
import xc.h0;
/* loaded from: classes3.dex */
public final class c extends q implements uc.b {
    public static final a Companion = new a(null);

    /* renamed from: c4 */
    private final boolean f15960c4;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(wd.c cVar, n nVar, h0 h0Var, InputStream inputStream, boolean z10) {
            t.e(cVar, "fqName");
            t.e(nVar, "storageManager");
            t.e(h0Var, "module");
            t.e(inputStream, "inputStream");
            r<m, sd.a> a10 = sd.c.a(inputStream);
            m b10 = a10.b();
            sd.a c10 = a10.c();
            if (b10 != null) {
                return new c(cVar, nVar, h0Var, b10, c10, z10, null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + sd.a.f21656f + ", actual " + c10 + ". Please update Kotlin");
        }
    }

    private c(wd.c cVar, n nVar, h0 h0Var, m mVar, sd.a aVar, boolean z10) {
        super(cVar, nVar, h0Var, mVar, aVar, null);
        this.f15960c4 = z10;
    }

    public /* synthetic */ c(wd.c cVar, n nVar, h0 h0Var, m mVar, sd.a aVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, nVar, h0Var, mVar, aVar, z10);
    }

    @Override // ad.z, ad.j
    public String toString() {
        return "builtins package fragment for " + d() + " from " + ee.a.l(this);
    }
}
