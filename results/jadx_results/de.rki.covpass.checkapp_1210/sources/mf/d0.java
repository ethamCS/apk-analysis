package mf;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u001a\u0010\u0011\u001a\u00020\u000f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lmf/d0;", "Lmf/a;", BuildConfig.FLAVOR, "position", "F", BuildConfig.FLAVOR, "l", BuildConfig.FLAVOR, "K", "f", "H", BuildConfig.FLAVOR, "expected", "Ltb/e0;", "n", BuildConfig.FLAVOR, "k", "source", "Ljava/lang/String;", "O", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class d0 extends a {

    /* renamed from: e */
    private final String f16616e;

    public d0(String str) {
        hc.t.e(str, "source");
        this.f16616e = str;
    }

    @Override // mf.a
    public int F(int i10) {
        if (i10 < B().length()) {
            return i10;
        }
        return -1;
    }

    @Override // mf.a
    public int H() {
        char charAt;
        int i10 = this.f16587a;
        if (i10 == -1) {
            return i10;
        }
        while (i10 < B().length() && ((charAt = B().charAt(i10)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i10++;
        }
        this.f16587a = i10;
        return i10;
    }

    @Override // mf.a
    public boolean K() {
        int H = H();
        if (H == B().length() || H == -1 || B().charAt(H) != ',') {
            return false;
        }
        this.f16587a++;
        return true;
    }

    /* renamed from: O */
    public String B() {
        return this.f16616e;
    }

    @Override // mf.a
    public boolean f() {
        int i10 = this.f16587a;
        if (i10 == -1) {
            return false;
        }
        while (i10 < B().length()) {
            char charAt = B().charAt(i10);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f16587a = i10;
                return C(charAt);
            }
            i10++;
        }
        this.f16587a = i10;
        return false;
    }

    @Override // mf.a
    public String k() {
        int Z;
        n('\"');
        int i10 = this.f16587a;
        Z = bf.y.Z(B(), '\"', i10, false, 4, null);
        if (Z == -1) {
            y((byte) 1);
            throw new tb.i();
        }
        for (int i11 = i10; i11 < Z; i11++) {
            if (B().charAt(i11) == '\\') {
                return q(B(), this.f16587a, i11);
            }
        }
        this.f16587a = Z + 1;
        String substring = B().substring(i10, Z);
        hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @Override // mf.a
    public byte l() {
        byte a10;
        String B = B();
        do {
            int i10 = this.f16587a;
            if (i10 == -1 || i10 >= B.length()) {
                return (byte) 10;
            }
            int i11 = this.f16587a;
            this.f16587a = i11 + 1;
            a10 = b.a(B.charAt(i11));
        } while (a10 == 3);
        return a10;
    }

    @Override // mf.a
    public void n(char c10) {
        if (this.f16587a == -1) {
            M(c10);
        }
        String B = B();
        while (this.f16587a < B.length()) {
            int i10 = this.f16587a;
            this.f16587a = i10 + 1;
            char charAt = B.charAt(i10);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == c10) {
                    return;
                }
                M(c10);
            }
        }
        M(c10);
    }
}
