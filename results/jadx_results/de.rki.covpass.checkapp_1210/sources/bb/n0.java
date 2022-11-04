package bb;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0012\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0012\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0003\u001a(\u0010\u000e\u001a\u00020\r*\u00060\u0005j\u0002`\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001a(\u0010\u0010\u001a\u00020\r*\u00060\u0005j\u0002`\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0000\"\u0015\u0010\u0013\u001a\u00020\u0007*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0015\u0010\u0015\u001a\u00020\u0007*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, d2 = {"Lbb/f0;", "url", "e", "Lbb/p0;", "f", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", BuildConfig.FLAVOR, "encodedPath", "Lbb/b0;", "queryParameters", BuildConfig.FLAVOR, "trailingQuery", "Ltb/e0;", "a", "Lbb/c0;", "b", "c", "(Lbb/p0;)Ljava/lang/String;", "fullPath", "d", "hostWithPort", "ktor-http"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class n0 {
    public static final void a(Appendable appendable, String str, b0 b0Var, boolean z10) {
        boolean x10;
        boolean I;
        hc.t.e(appendable, "<this>");
        hc.t.e(str, "encodedPath");
        hc.t.e(b0Var, "queryParameters");
        x10 = bf.x.x(str);
        if (!x10) {
            I = bf.x.I(str, "/", false, 2, null);
            if (!I) {
                appendable.append('/');
            }
        }
        appendable.append(str);
        if (!b0Var.isEmpty() || z10) {
            appendable.append("?");
        }
        y.a(b0Var, appendable);
    }

    public static final void b(Appendable appendable, String str, c0 c0Var, boolean z10) {
        boolean x10;
        boolean I;
        hc.t.e(appendable, "<this>");
        hc.t.e(str, "encodedPath");
        hc.t.e(c0Var, "queryParameters");
        x10 = bf.x.x(str);
        if (!x10) {
            I = bf.x.I(str, "/", false, 2, null);
            if (!I) {
                appendable.append('/');
            }
        }
        appendable.append(str);
        if (!c0Var.k() || z10) {
            appendable.append("?");
        }
        y.b(c0Var, appendable);
    }

    public static final String c(p0 p0Var) {
        hc.t.e(p0Var, "<this>");
        StringBuilder sb2 = new StringBuilder();
        a(sb2, p0Var.a(), p0Var.d(), p0Var.i());
        String sb3 = sb2.toString();
        hc.t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final String d(p0 p0Var) {
        hc.t.e(p0Var, "<this>");
        return p0Var.c() + ':' + p0Var.f();
    }

    public static final f0 e(f0 f0Var, f0 f0Var2) {
        hc.t.e(f0Var, "<this>");
        hc.t.e(f0Var2, "url");
        f0Var.r(f0Var2.j());
        f0Var.o(f0Var2.f());
        f0Var.q(f0Var2.i());
        f0Var.m(f0Var2.d());
        f0Var.t(f0Var2.l());
        f0Var.p(f0Var2.h());
        fb.z.c(f0Var.g(), f0Var2.g());
        f0Var.g().s(f0Var2.g().r());
        f0Var.n(f0Var2.e());
        f0Var.s(f0Var2.k());
        return f0Var;
    }

    public static final f0 f(f0 f0Var, p0 p0Var) {
        hc.t.e(f0Var, "<this>");
        hc.t.e(p0Var, "url");
        f0Var.r(p0Var.g());
        f0Var.o(p0Var.c());
        f0Var.q(p0Var.h());
        f0Var.m(p0Var.a());
        f0Var.t(p0Var.j());
        f0Var.p(p0Var.e());
        f0Var.g().b(p0Var.d());
        f0Var.g().s(p0Var.d().f());
        f0Var.n(p0Var.b());
        f0Var.s(p0Var.i());
        return f0Var;
    }
}
