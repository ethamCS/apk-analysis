package bb;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0006Be\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010&\u001a\u00020\b\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010.\u001a\u00020\b\u0012\b\b\u0002\u00102\u001a\u000201¢\u0006\u0004\b8\u00109J%\u0010\u0006\u001a\u00028\u0000\"\f\b\u0000\u0010\u0004*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\nR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R$\u0010#\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u0018R\"\u0010&\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0014\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u0010.\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0014\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018R\"\u00102\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006:"}, d2 = {"Lbb/f0;", BuildConfig.FLAVOR, "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "out", "a", "(Ljava/lang/Appendable;)Ljava/lang/Appendable;", BuildConfig.FLAVOR, "c", "Lbb/p0;", "b", "Lbb/l0;", "protocol", "Lbb/l0;", "j", "()Lbb/l0;", "r", "(Lbb/l0;)V", "host", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "o", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "port", "I", "i", "()I", "q", "(I)V", "user", "l", "t", "password", "h", "p", "encodedPath", "d", "m", "Lbb/c0;", "parameters", "Lbb/c0;", "g", "()Lbb/c0;", "fragment", "e", "n", BuildConfig.FLAVOR, "trailingQuery", "Z", "k", "()Z", "s", "(Z)V", "<init>", "(Lbb/l0;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbb/c0;Ljava/lang/String;Z)V", "ktor-http"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class f0 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private l0 f5825a;

    /* renamed from: b */
    private String f5826b;

    /* renamed from: c */
    private int f5827c;

    /* renamed from: d */
    private String f5828d;

    /* renamed from: e */
    private String f5829e;

    /* renamed from: f */
    private String f5830f;

    /* renamed from: g */
    private final c0 f5831g;

    /* renamed from: h */
    private String f5832h;

    /* renamed from: i */
    private boolean f5833i;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbb/f0$a;", BuildConfig.FLAVOR, "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public f0() {
        this(null, null, 0, null, null, null, null, null, false, 511, null);
    }

    public f0(l0 l0Var, String str, int i10, String str2, String str3, String str4, c0 c0Var, String str5, boolean z10) {
        hc.t.e(l0Var, "protocol");
        hc.t.e(str, "host");
        hc.t.e(str4, "encodedPath");
        hc.t.e(c0Var, "parameters");
        hc.t.e(str5, "fragment");
        this.f5825a = l0Var;
        this.f5826b = str;
        this.f5827c = i10;
        this.f5828d = str2;
        this.f5829e = str3;
        this.f5830f = str4;
        this.f5831g = c0Var;
        this.f5832h = str5;
        this.f5833i = z10;
        String a10 = g0.a(Companion);
        if (a10 != null) {
            k0.i(this, a10);
        }
        if (this.f5830f.length() == 0) {
            this.f5830f = "/";
        }
    }

    public /* synthetic */ f0(l0 l0Var, String str, int i10, String str2, String str3, String str4, c0 c0Var, String str5, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? l0.Companion.c() : l0Var, (i11 & 2) != 0 ? "localhost" : str, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? "/" : str4, (i11 & 64) != 0 ? new c0(0, null, 3, null) : c0Var, (i11 & 128) != 0 ? BuildConfig.FLAVOR : str5, (i11 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 ? z10 : false);
    }

    private final <A extends Appendable> A a(A a10) {
        a10.append(this.f5825a.e());
        String e10 = this.f5825a.e();
        if (hc.t.a(e10, "file")) {
            h0.c(a10, this.f5826b, this.f5830f);
            return a10;
        } else if (hc.t.a(e10, "mailto")) {
            h0.d(a10, h0.h(this), this.f5830f);
            return a10;
        } else {
            a10.append("://");
            a10.append(h0.f(this));
            n0.b(a10, this.f5830f, this.f5831g, this.f5833i);
            if (this.f5832h.length() > 0) {
                a10.append('#');
                a10.append(b.q(this.f5832h, false, false, null, 7, null));
            }
            return a10;
        }
    }

    public final p0 b() {
        return new p0(this.f5825a, this.f5826b, this.f5827c, this.f5830f, this.f5831g.q(), this.f5832h, this.f5828d, this.f5829e, this.f5833i);
    }

    public final String c() {
        String sb2 = ((StringBuilder) a(new StringBuilder((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES))).toString();
        hc.t.d(sb2, "appendTo(StringBuilder(256)).toString()");
        return sb2;
    }

    public final String d() {
        return this.f5830f;
    }

    public final String e() {
        return this.f5832h;
    }

    public final String f() {
        return this.f5826b;
    }

    public final c0 g() {
        return this.f5831g;
    }

    public final String h() {
        return this.f5829e;
    }

    public final int i() {
        return this.f5827c;
    }

    public final l0 j() {
        return this.f5825a;
    }

    public final boolean k() {
        return this.f5833i;
    }

    public final String l() {
        return this.f5828d;
    }

    public final void m(String str) {
        hc.t.e(str, "<set-?>");
        this.f5830f = str;
    }

    public final void n(String str) {
        hc.t.e(str, "<set-?>");
        this.f5832h = str;
    }

    public final void o(String str) {
        hc.t.e(str, "<set-?>");
        this.f5826b = str;
    }

    public final void p(String str) {
        this.f5829e = str;
    }

    public final void q(int i10) {
        this.f5827c = i10;
    }

    public final void r(l0 l0Var) {
        hc.t.e(l0Var, "<set-?>");
        this.f5825a = l0Var;
    }

    public final void s(boolean z10) {
        this.f5833i = z10;
    }

    public final void t(String str) {
        this.f5828d = str;
    }
}
