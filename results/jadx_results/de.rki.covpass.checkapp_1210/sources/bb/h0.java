package bb;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a \u0010\u0006\u001a\u00020\u0005*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002\u001a \u0010\b\u001a\u00020\u0005*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002\u001a$\u0010\f\u001a\u00020\u0005*\u00060\tj\u0002`\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002\"\u0018\u0010\u0010\u001a\u00020\u0002*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0010\u001a\u00020\u0002*\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0015\u0010\u0015\u001a\u00020\u0002*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000f\"\u0015\u0010\u0015\u001a\u00020\u0002*\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", BuildConfig.FLAVOR, "user", "host", "Ltb/e0;", "d", "encodedPath", "c", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "password", "e", "Lbb/p0;", "i", "(Lbb/p0;)Ljava/lang/String;", "userAndPassword", "Lbb/f0;", "h", "(Lbb/f0;)Ljava/lang/String;", "g", "authority", "f", "ktor-http"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class h0 {
    public static final void c(Appendable appendable, String str, String str2) {
        appendable.append("://");
        appendable.append(str);
        appendable.append(str2);
    }

    public static final void d(Appendable appendable, String str, String str2) {
        appendable.append(":");
        appendable.append(b.m(str, false, 1, null));
        appendable.append('@');
        appendable.append(str2);
    }

    private static final void e(StringBuilder sb2, String str, String str2) {
        if (str == null) {
            return;
        }
        sb2.append(b.m(str, false, 1, null));
        if (str2 != null) {
            sb2.append(':');
            sb2.append(b.m(str2, false, 1, null));
        }
        sb2.append("@");
    }

    public static final String f(f0 f0Var) {
        hc.t.e(f0Var, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h(f0Var));
        sb2.append(f0Var.f());
        if (f0Var.i() != 0 && f0Var.i() != f0Var.j().d()) {
            sb2.append(":");
            sb2.append(String.valueOf(f0Var.i()));
        }
        String sb3 = sb2.toString();
        hc.t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final String g(p0 p0Var) {
        hc.t.e(p0Var, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i(p0Var));
        sb2.append(p0Var.h() == 0 ? p0Var.c() : n0.d(p0Var));
        String sb3 = sb2.toString();
        hc.t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final String h(f0 f0Var) {
        hc.t.e(f0Var, "<this>");
        StringBuilder sb2 = new StringBuilder();
        e(sb2, f0Var.l(), f0Var.h());
        String sb3 = sb2.toString();
        hc.t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final String i(p0 p0Var) {
        hc.t.e(p0Var, "<this>");
        StringBuilder sb2 = new StringBuilder();
        e(sb2, p0Var.j(), p0Var.e());
        String sb3 = sb2.toString();
        hc.t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
