package ya;

import bb.f0;
import bb.l0;
import gc.l;
import hc.t;
import hc.v;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aH\u0010\u000b\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u001a\f\u0010\u000e\u001a\u00020\r*\u00020\fH\u0007¨\u0006\u000f"}, d2 = {"Lya/c;", BuildConfig.FLAVOR, "scheme", "host", BuildConfig.FLAVOR, "port", "path", "Lkotlin/Function1;", "Lbb/f0;", "Ltb/e0;", "block", "b", "Lya/d;", BuildConfig.FLAVOR, "a", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class e {

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbb/f0;", "Ltb/e0;", "b", "(Lbb/f0;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends v implements l<f0, e0> {

        /* renamed from: c */
        public static final a f25993c = new a();

        a() {
            super(1);
        }

        public final void b(f0 f0Var) {
            t.e(f0Var, "$this$null");
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(f0 f0Var) {
            b(f0Var);
            return e0.f22152a;
        }
    }

    public static final boolean a(d dVar) {
        t.e(dVar, "<this>");
        dVar.b();
        return false;
    }

    public static final void b(c cVar, String str, String str2, int i10, String str3, l<? super f0, e0> lVar) {
        t.e(cVar, "<this>");
        t.e(str, "scheme");
        t.e(str2, "host");
        t.e(str3, "path");
        t.e(lVar, "block");
        f0 g10 = cVar.g();
        g10.r(l0.Companion.a(str));
        g10.o(str2);
        g10.q(i10);
        g10.m(str3);
        lVar.invoke(cVar.g());
    }

    public static /* synthetic */ void c(c cVar, String str, String str2, int i10, String str3, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "http";
        }
        if ((i11 & 2) != 0) {
            str2 = "localhost";
        }
        String str4 = str2;
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            str3 = "/";
        }
        String str5 = str3;
        if ((i11 & 16) != 0) {
            lVar = a.f25993c;
        }
        b(cVar, str, str4, i12, str5, lVar);
    }
}
