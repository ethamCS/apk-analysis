package n8;

import a.f;
import d9.q;
import d9.t;
import de.rki.covpass.logging.Lumber;
import j8.n;
import k7.w;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m8.c;
import m8.d;
import org.conscrypt.BuildConfig;
import t7.h;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H$¨\u0006\u0010"}, d2 = {"Ln8/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "error", "Lm8/c;", "a", BuildConfig.FLAVOR, "b", "c", "Landroidx/fragment/app/w;", "fragmentManager", "Ltb/e0;", "e", "d", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class a {
    public static final C0258a Companion = new C0258a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Ln8/a$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "ERROR_CODE_BASE45DECODING", "I", "ERROR_CODE_CBOR_DECODING", "ERROR_CODE_CONNECTION_ERROR", "ERROR_CODE_COSE_BAD_SIGNATURE", "ERROR_CODE_COSE_DECODING", "ERROR_CODE_EXPIRED_CERTIFICATE", "ERROR_CODE_GENERAL", "ERROR_CODE_ILLEGAL_KEY", "ERROR_CODE_QR_CODE_DUPLICATED", BuildConfig.FLAVOR, "TAG_ERROR_CONNECTION", "Ljava/lang/String;", "TAG_ERROR_GENERAL", "TAG_ERROR_UNREADABLE_CERTIFICATE", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: n8.a$a */
    /* loaded from: classes.dex */
    public static final class C0258a {
        private C0258a() {
        }

        public /* synthetic */ C0258a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final c a(Throwable th2) {
        boolean z10 = true;
        if (!(th2 instanceof w7.b ? true : th2 instanceof f)) {
            z10 = th2 instanceof h;
        }
        if (z10) {
            Integer valueOf = Integer.valueOf(n.f0_res_0x7f100111);
            String f10 = w.f(n.e0_res_0x7f100110, new Object[0]);
            int b10 = b(th2);
            return new c(0, valueOf, null, f10 + " (Error " + b10 + ")", Integer.valueOf(n.f14091d0), null, null, 0, 0, 0, false, 0, "error_unreadable_certificate", 4069, null);
        } else if (b.a(th2)) {
            Integer valueOf2 = Integer.valueOf(n.c0_res_0x7f10010b);
            String f11 = w.f(n.b0_res_0x7f10010a, new Object[0]);
            return new c(0, valueOf2, null, f11 + " (Error 105)", Integer.valueOf(n.a0_res_0x7f100109), null, null, 0, 0, 0, false, 0, "error_connection", 4069, null);
        } else {
            Integer valueOf3 = Integer.valueOf(n.i0_res_0x7f100114);
            String f12 = w.f(n.h0_res_0x7f100113, new Object[0]);
            int c10 = c(th2);
            return new c(0, valueOf3, null, f12 + " (Error " + c10 + ")", Integer.valueOf(n.f14092g0), null, null, 0, 0, 0, false, 0, "error_general", 4069, null);
        }
    }

    private final int b(Throwable th2) {
        if (th2 instanceof w7.b) {
            return 301;
        }
        return th2 instanceof f ? 404 : 414;
    }

    private final int c(Throwable th2) {
        if (th2 instanceof q) {
            return 422;
        }
        if (th2 instanceof d9.a) {
            return 405;
        }
        return th2 instanceof t ? 413 : 902;
    }

    protected abstract c d(Throwable th2);

    public final void e(Throwable th2, androidx.fragment.app.w wVar) {
        hc.t.e(th2, "error");
        hc.t.e(wVar, "fragmentManager");
        if (Lumber.Companion.getEnabled()) {
            timber.log.a.f22457a.e(th2, null, new Object[0]);
        }
        c d10 = d(th2);
        if (d10 == null) {
            d10 = a(th2);
        }
        d.b(d10, wVar);
    }
}
