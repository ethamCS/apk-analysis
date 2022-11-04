package mf;

import java.util.ArrayList;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0019\n\u0002\u0010\t\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bG\u0010HJ\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0002H\u0003J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H&J\b\u0010\u001b\u001a\u00020\nH&J\b\u0010\u001c\u001a\u00020\nH&J\b\u0010\u001e\u001a\u00020\u001dH&J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u001fH\u0004J\u0006\u0010!\u001a\u00020\u0016J\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dJ\u0010\u0010$\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001fH\u0016J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001fH\u0004J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u001dH\u0000¢\u0006\u0004\b(\u0010)J\u0006\u0010*\u001a\u00020\u001dJ\u0006\u0010+\u001a\u00020\nJ\b\u0010,\u001a\u00020\u0002H\u0016J\u0010\u0010.\u001a\u0004\u0018\u00010\u00072\u0006\u0010-\u001a\u00020\nJ\u0018\u00100\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0002H\u0016J\b\u00101\u001a\u00020\u0007H&J\u0006\u00102\u001a\u00020\u0007J \u00103\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0005J\u0006\u00104\u001a\u00020\u0007J\u0006\u00105\u001a\u00020\u0007J\u0018\u00108\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u0002H\u0014J\u000e\u0010:\u001a\u00020\u00162\u0006\u00109\u001a\u00020\nJ\b\u0010;\u001a\u00020\u0007H\u0016J\u000e\u0010=\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u0007J\"\u0010@\u001a\u00020'2\u0006\u0010>\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010?\u001a\u00020\u0007J\u0006\u0010B\u001a\u00020AJ\u0006\u0010C\u001a\u00020\nJ\u0006\u0010D\u001a\u00020\nR\u0014\u0010\u000f\u001a\u00020\u000e8$X¤\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lmf/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "lastPosition", "current", "c", "currentPosition", BuildConfig.FLAVOR, "t", "J", BuildConfig.FLAVOR, "N", "startPosition", "b", BuildConfig.FLAVOR, "source", "startPos", "d", "A", "start", "h", "literalSuffix", "Ltb/e0;", "j", "u", "position", "F", "K", "f", BuildConfig.FLAVOR, "l", BuildConfig.FLAVOR, "C", "v", "expected", "m", "n", "M", "expectedToken", BuildConfig.FLAVOR, "y", "(B)Ljava/lang/Void;", "D", "L", "H", "isLenient", "E", "endPos", "I", "k", "p", "q", "s", "r", "fromIndex", "toIndex", "e", "allowLenientStrings", "G", "toString", "key", "z", "message", "hint", "w", BuildConfig.FLAVOR, "o", "g", "i", "B", "()Ljava/lang/CharSequence;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a */
    protected int f16587a;

    /* renamed from: c */
    private String f16589c;

    /* renamed from: b */
    public final s f16588b = new s();

    /* renamed from: d */
    private StringBuilder f16590d = new StringBuilder();

    private final int A(CharSequence charSequence, int i10) {
        char charAt = charSequence.charAt(i10);
        boolean z10 = true;
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        char c10 = 'a';
        if (!('a' <= charAt && charAt < 'g')) {
            c10 = 'A';
            if ('A' > charAt || charAt >= 'G') {
                z10 = false;
            }
            if (!z10) {
                x(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6, null);
                throw new tb.i();
            }
        }
        return (charAt - c10) + 10;
    }

    private final String J() {
        String str = this.f16589c;
        hc.t.b(str);
        this.f16589c = null;
        return str;
    }

    private final boolean N() {
        return B().charAt(this.f16587a - 1) != '\"';
    }

    private final int b(int i10) {
        int F = F(i10);
        if (F == -1) {
            x(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new tb.i();
        }
        int i11 = F + 1;
        char charAt = B().charAt(F);
        if (charAt == 'u') {
            return d(B(), i11);
        }
        char b10 = b.b(charAt);
        if (b10 != 0) {
            this.f16590d.append(b10);
            return i11;
        }
        x(this, "Invalid escaped char '" + charAt + '\'', 0, null, 6, null);
        throw new tb.i();
    }

    private final int c(int i10, int i11) {
        e(i10, i11);
        return b(i11 + 1);
    }

    private final int d(CharSequence charSequence, int i10) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            this.f16590d.append((char) ((A(charSequence, i10) << 12) + (A(charSequence, i10 + 1) << 8) + (A(charSequence, i10 + 2) << 4) + A(charSequence, i10 + 3)));
            return i11;
        }
        this.f16587a = i10;
        u();
        if (this.f16587a + 4 < charSequence.length()) {
            return d(charSequence, this.f16587a);
        }
        x(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new tb.i();
    }

    private final boolean h(int i10) {
        int F = F(i10);
        if (F >= B().length() || F == -1) {
            x(this, "EOF", 0, null, 6, null);
            throw new tb.i();
        }
        int i11 = F + 1;
        int charAt = B().charAt(F) | ' ';
        if (charAt == 116) {
            j("rue", i11);
            return true;
        } else if (charAt == 102) {
            j("alse", i11);
            return false;
        } else {
            x(this, "Expected valid boolean literal prefix, but had '" + r() + '\'', 0, null, 6, null);
            throw new tb.i();
        }
    }

    private final void j(String str, int i10) {
        if (B().length() - i10 < str.length()) {
            x(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new tb.i();
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != (B().charAt(i10 + i11) | ' ')) {
                x(this, "Expected valid boolean literal prefix, but had '" + r() + '\'', 0, null, 6, null);
                throw new tb.i();
            }
        }
        this.f16587a = i10 + str.length();
    }

    private final String t(int i10, int i11) {
        e(i10, i11);
        String sb2 = this.f16590d.toString();
        hc.t.d(sb2, "escapedString.toString()");
        this.f16590d.setLength(0);
        return sb2;
    }

    public static /* synthetic */ Void x(a aVar, String str, int i10, String str2, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = aVar.f16587a;
            }
            if ((i11 & 4) != 0) {
                str2 = BuildConfig.FLAVOR;
            }
            return aVar.w(str, i10, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    protected abstract CharSequence B();

    public final boolean C(char c10) {
        boolean z10 = false;
        if (((c10 == '}' || c10 == ']') || c10 == ':') || c10 == ',') {
            z10 = true;
        }
        return !z10;
    }

    public final byte D() {
        CharSequence B = B();
        int i10 = this.f16587a;
        while (true) {
            int F = F(i10);
            if (F == -1) {
                this.f16587a = F;
                return (byte) 10;
            }
            char charAt = B.charAt(F);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f16587a = F;
                return b.a(charAt);
            }
            i10 = F + 1;
        }
    }

    public final String E(boolean z10) {
        String str;
        byte D = D();
        if (z10) {
            if (D != 1 && D != 0) {
                return null;
            }
            str = r();
        } else if (D != 1) {
            return null;
        } else {
            str = p();
        }
        this.f16589c = str;
        return str;
    }

    public abstract int F(int i10);

    public final void G(boolean z10) {
        Object g02;
        Object g03;
        ArrayList arrayList = new ArrayList();
        byte D = D();
        if (D != 8 && D != 6) {
            r();
            return;
        }
        while (true) {
            byte D2 = D();
            boolean z11 = true;
            if (D2 != 1) {
                if (D2 != 8 && D2 != 6) {
                    z11 = false;
                }
                if (z11) {
                    arrayList.add(Byte.valueOf(D2));
                } else {
                    if (D2 == 9) {
                        g03 = ub.c0.g0(arrayList);
                        if (((Number) g03).byteValue() != 8) {
                            int i10 = this.f16587a;
                            throw q.e(i10, "found ] instead of } at path: " + this.f16588b, B());
                        }
                    } else if (D2 == 7) {
                        g02 = ub.c0.g0(arrayList);
                        if (((Number) g02).byteValue() != 6) {
                            int i11 = this.f16587a;
                            throw q.e(i11, "found } instead of ] at path: " + this.f16588b, B());
                        }
                    } else if (D2 == 10) {
                        x(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                        throw new tb.i();
                    }
                    ub.z.B(arrayList);
                }
                l();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z10) {
                r();
            } else {
                k();
            }
        }
    }

    public abstract int H();

    public String I(int i10, int i11) {
        return B().subSequence(i10, i11).toString();
    }

    public abstract boolean K();

    public final boolean L() {
        int F = F(H());
        int length = B().length() - F;
        if (length < 4 || F == -1) {
            return true;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if ("null".charAt(i10) != B().charAt(F + i10)) {
                return true;
            }
        }
        if (length > 4 && b.a(B().charAt(F + 4)) == 0) {
            return true;
        }
        this.f16587a = F + 4;
        return false;
    }

    public final void M(char c10) {
        int i10 = this.f16587a - 1;
        this.f16587a = i10;
        if (i10 < 0 || c10 != '\"' || !hc.t.a(r(), "null")) {
            y(b.a(c10));
            throw new tb.i();
        } else {
            w("Expected string literal but 'null' literal was found", this.f16587a - 4, "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.");
            throw new tb.i();
        }
    }

    protected void e(int i10, int i11) {
        this.f16590d.append(B(), i10, i11);
    }

    public abstract boolean f();

    public final boolean g() {
        return h(H());
    }

    public final boolean i() {
        boolean z10;
        int H = H();
        if (H == B().length()) {
            x(this, "EOF", 0, null, 6, null);
            throw new tb.i();
        }
        if (B().charAt(H) == '\"') {
            H++;
            z10 = true;
        } else {
            z10 = false;
        }
        boolean h10 = h(H);
        if (z10) {
            if (this.f16587a == B().length()) {
                x(this, "EOF", 0, null, 6, null);
                throw new tb.i();
            } else if (B().charAt(this.f16587a) != '\"') {
                x(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new tb.i();
            } else {
                this.f16587a++;
            }
        }
        return h10;
    }

    public abstract String k();

    public abstract byte l();

    public final byte m(byte b10) {
        byte l10 = l();
        if (l10 == b10) {
            return l10;
        }
        y(b10);
        throw new tb.i();
    }

    public abstract void n(char c10);

    public final long o() {
        boolean z10;
        int F = F(H());
        if (F >= B().length() || F == -1) {
            x(this, "EOF", 0, null, 6, null);
            throw new tb.i();
        }
        if (B().charAt(F) == '\"') {
            F++;
            if (F == B().length()) {
                x(this, "EOF", 0, null, 6, null);
                throw new tb.i();
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = F;
        long j10 = 0;
        boolean z11 = true;
        boolean z12 = false;
        while (z11) {
            char charAt = B().charAt(i10);
            if (charAt != '-') {
                if (b.a(charAt) != 0) {
                    break;
                }
                i10++;
                z11 = i10 != B().length();
                int i11 = charAt - '0';
                if (!(i11 >= 0 && i11 < 10)) {
                    x(this, "Unexpected symbol '" + charAt + "' in numeric literal", 0, null, 6, null);
                    throw new tb.i();
                }
                j10 = (j10 * 10) - i11;
                if (j10 > 0) {
                    x(this, "Numeric value overflow", 0, null, 6, null);
                    throw new tb.i();
                }
            } else if (i10 != F) {
                x(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                throw new tb.i();
            } else {
                i10++;
                z12 = true;
            }
        }
        if (F == i10 || (z12 && F == i10 - 1)) {
            x(this, "Expected numeric literal", 0, null, 6, null);
            throw new tb.i();
        }
        if (z10) {
            if (!z11) {
                x(this, "EOF", 0, null, 6, null);
                throw new tb.i();
            } else if (B().charAt(i10) != '\"') {
                x(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new tb.i();
            } else {
                i10++;
            }
        }
        this.f16587a = i10;
        if (z12) {
            return j10;
        }
        if (j10 != Long.MIN_VALUE) {
            return -j10;
        }
        x(this, "Numeric value overflow", 0, null, 6, null);
        throw new tb.i();
    }

    public final String p() {
        return this.f16589c != null ? J() : k();
    }

    public final String q(CharSequence charSequence, int i10, int i11) {
        int F;
        hc.t.e(charSequence, "source");
        char charAt = charSequence.charAt(i11);
        boolean z10 = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                F = F(c(i10, i11));
                if (F == -1) {
                    x(this, "EOF", F, null, 4, null);
                    throw new tb.i();
                }
            } else {
                i11++;
                if (i11 >= charSequence.length()) {
                    e(i10, i11);
                    F = F(i11);
                    if (F == -1) {
                        x(this, "EOF", F, null, 4, null);
                        throw new tb.i();
                    }
                } else {
                    continue;
                    charAt = charSequence.charAt(i11);
                }
            }
            z10 = true;
            i10 = F;
            i11 = i10;
            charAt = charSequence.charAt(i11);
        }
        String I = !z10 ? I(i10, i11) : t(i10, i11);
        this.f16587a = i11 + 1;
        return I;
    }

    public final String r() {
        if (this.f16589c != null) {
            return J();
        }
        int H = H();
        if (H >= B().length() || H == -1) {
            x(this, "EOF", H, null, 4, null);
            throw new tb.i();
        }
        byte a10 = b.a(B().charAt(H));
        if (a10 == 1) {
            return p();
        }
        if (a10 != 0) {
            x(this, "Expected beginning of the string, but got " + B().charAt(H), 0, null, 6, null);
            throw new tb.i();
        }
        boolean z10 = false;
        while (b.a(B().charAt(H)) == 0) {
            H++;
            if (H >= B().length()) {
                e(this.f16587a, H);
                int F = F(H);
                if (F == -1) {
                    this.f16587a = H;
                    return t(0, 0);
                }
                H = F;
                z10 = true;
            }
        }
        int i10 = this.f16587a;
        String I = !z10 ? I(i10, H) : t(i10, H);
        this.f16587a = H;
        return I;
    }

    public final String s() {
        String r10 = r();
        if (!hc.t.a(r10, "null") || !N()) {
            return r10;
        }
        x(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new tb.i();
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) B()) + "', currentPosition=" + this.f16587a + ')';
    }

    public void u() {
    }

    public final void v() {
        if (l() == 10) {
            return;
        }
        x(this, "Expected EOF after parsing, but had " + B().charAt(this.f16587a - 1) + " instead", 0, null, 6, null);
        throw new tb.i();
    }

    public final Void w(String str, int i10, String str2) {
        String str3;
        hc.t.e(str, "message");
        hc.t.e(str2, "hint");
        if (str2.length() == 0) {
            str3 = BuildConfig.FLAVOR;
        } else {
            str3 = '\n' + str2;
        }
        throw q.e(i10, str + " at path: " + this.f16588b.a() + str3, B());
    }

    public final Void y(byte b10) {
        String str = b10 == 1 ? "quotation mark '\"'" : b10 == 4 ? "comma ','" : b10 == 5 ? "semicolon ':'" : b10 == 6 ? "start of the object '{'" : b10 == 7 ? "end of the object '}'" : b10 == 8 ? "start of the array '['" : b10 == 9 ? "end of the array ']'" : "valid token";
        String valueOf = (this.f16587a == B().length() || this.f16587a <= 0) ? "EOF" : String.valueOf(B().charAt(this.f16587a - 1));
        x(this, "Expected " + str + ", but had '" + valueOf + "' instead", this.f16587a - 1, null, 4, null);
        throw new tb.i();
    }

    public final void z(String str) {
        int g02;
        hc.t.e(str, "key");
        g02 = bf.y.g0(I(0, this.f16587a), str, 0, false, 6, null);
        w("Encountered an unknown key '" + str + '\'', g02, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new tb.i();
    }
}
