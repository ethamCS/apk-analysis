package bb;

import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0004\u001a*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u001a$\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u001a,\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002\u001a \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¨\u0006\u0014"}, d2 = {"Lbb/c0;", "parametersBuilder", BuildConfig.FLAVOR, "query", BuildConfig.FLAVOR, "startIndex", "limit", "Ltb/e0;", "c", "b", "nameIndex", "equalIndex", "endIndex", "a", "start", "end", BuildConfig.FLAVOR, "text", "e", "f", "ktor-http"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class e0 {
    private static final void a(c0 c0Var, String str, int i10, int i11, int i12) {
        String str2;
        String str3;
        String str4;
        List h10;
        if (i11 == -1) {
            int f10 = f(i10, i12, str);
            int e10 = e(f10, i12, str);
            if (e10 <= f10) {
                return;
            }
            if (c0Var.r().g()) {
                str4 = b.k(str, f10, e10, false, null, 12, null);
            } else {
                str4 = str.substring(f10, e10);
                hc.t.d(str4, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            h10 = ub.u.h();
            c0Var.c(str4, h10);
            return;
        }
        int f11 = f(i10, i11, str);
        int e11 = e(f11, i11, str);
        if (e11 <= f11) {
            return;
        }
        if (c0Var.r().g()) {
            str2 = b.k(str, f11, e11, false, null, 12, null);
        } else {
            str2 = str.substring(f11, e11);
            hc.t.d(str2, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        int f12 = f(i11 + 1, i12, str);
        int e12 = e(f12, i12, str);
        if (c0Var.r().h()) {
            str3 = b.k(str, f12, e12, true, null, 8, null);
        } else {
            str3 = str.substring(f12, e12);
            hc.t.d(str3, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        c0Var.a(str2, str3);
    }

    private static final void b(c0 c0Var, String str, int i10, int i11) {
        int U;
        U = bf.y.U(str);
        int i12 = -1;
        int i13 = 0;
        if (i10 <= U) {
            int i14 = -1;
            int i15 = 0;
            int i16 = i10;
            while (true) {
                int i17 = i10 + 1;
                if (i15 == i11) {
                    return;
                }
                char charAt = str.charAt(i10);
                if (charAt == '&') {
                    a(c0Var, str, i16, i14, i10);
                    i15++;
                    i14 = -1;
                    i16 = i17;
                } else if (charAt == '=' && i14 == -1) {
                    i14 = i10;
                }
                if (i10 == U) {
                    i10 = i16;
                    i13 = i15;
                    i12 = i14;
                    break;
                }
                i10 = i17;
            }
        }
        if (i13 == i11) {
            return;
        }
        a(c0Var, str, i10, i12, str.length());
    }

    public static final void c(c0 c0Var, String str, int i10, int i11) {
        int U;
        hc.t.e(c0Var, "parametersBuilder");
        hc.t.e(str, "query");
        U = bf.y.U(str);
        if (i10 > U) {
            return;
        }
        b(c0Var, str, i10, i11);
    }

    public static /* synthetic */ void d(c0 c0Var, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = 1000;
        }
        c(c0Var, str, i10, i11);
    }

    private static final int e(int i10, int i11, CharSequence charSequence) {
        boolean c10;
        while (i11 > i10) {
            c10 = bf.b.c(charSequence.charAt(i11 - 1));
            if (!c10) {
                break;
            }
            i11--;
        }
        return i11;
    }

    private static final int f(int i10, int i11, CharSequence charSequence) {
        boolean c10;
        while (i10 < i11) {
            c10 = bf.b.c(charSequence.charAt(i10));
            if (!c10) {
                break;
            }
            i10++;
        }
        return i10;
    }
}
