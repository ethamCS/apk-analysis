package mf;

import java.util.Arrays;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB\t\b\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0014J\b\u0010\u0017\u001a\u00020\u0007H\u0016¨\u0006\u001d"}, d2 = {"Lmf/t;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "firstEscapedChar", "currentSize", BuildConfig.FLAVOR, "string", "Ltb/e0;", "e", "expected", "f", BuildConfig.FLAVOR, "value", "b", BuildConfig.FLAVOR, "ch", "a", "c", "d", "toString", "oldSize", "additional", "g", "h", BuildConfig.FLAVOR, "array", "<init>", "([C)V", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class t {

    /* renamed from: a */
    protected char[] f16641a;

    /* renamed from: b */
    private int f16642b;

    public t() {
        this(d.f16612a.b());
    }

    public t(char[] cArr) {
        hc.t.e(cArr, "array");
        this.f16641a = cArr;
    }

    private final void e(int i10, int i11, String str) {
        int i12;
        int length = str.length();
        while (i10 < length) {
            int g10 = g(i11, 2);
            char charAt = str.charAt(i10);
            if (charAt < e0.a().length) {
                byte b10 = e0.a()[charAt];
                if (b10 == 0) {
                    i12 = g10 + 1;
                    this.f16641a[g10] = charAt;
                } else {
                    if (b10 == 1) {
                        String str2 = e0.b()[charAt];
                        hc.t.b(str2);
                        int g11 = g(g10, str2.length());
                        str2.getChars(0, str2.length(), this.f16641a, g11);
                        i11 = g11 + str2.length();
                    } else {
                        char[] cArr = this.f16641a;
                        cArr[g10] = '\\';
                        cArr[g10 + 1] = (char) b10;
                        i11 = g10 + 2;
                    }
                    this.f16642b = i11;
                    i10++;
                }
            } else {
                i12 = g10 + 1;
                this.f16641a[g10] = charAt;
            }
            i11 = i12;
            i10++;
        }
        int g12 = g(i11, 1);
        this.f16641a[g12] = '\"';
        this.f16642b = g12 + 1;
    }

    private final void f(int i10) {
        g(this.f16642b, i10);
    }

    public final void a(char c10) {
        f(1);
        char[] cArr = this.f16641a;
        int i10 = this.f16642b;
        this.f16642b = i10 + 1;
        cArr[i10] = c10;
    }

    public final void b(long j10) {
        c(String.valueOf(j10));
    }

    public final void c(String str) {
        hc.t.e(str, "string");
        int length = str.length();
        f(length);
        str.getChars(0, str.length(), this.f16641a, this.f16642b);
        this.f16642b += length;
    }

    public final void d(String str) {
        hc.t.e(str, "string");
        f(str.length() + 2);
        char[] cArr = this.f16641a;
        int i10 = this.f16642b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        for (int i13 = i11; i13 < i12; i13++) {
            char c10 = cArr[i13];
            if (c10 < e0.a().length && e0.a()[c10] != 0) {
                e(i13 - i11, i13, str);
                return;
            }
        }
        cArr[i12] = '\"';
        this.f16642b = i12 + 1;
    }

    protected int g(int i10, int i11) {
        int b10;
        int i12 = i11 + i10;
        char[] cArr = this.f16641a;
        if (cArr.length <= i12) {
            b10 = nc.m.b(i12, i10 * 2);
            char[] copyOf = Arrays.copyOf(cArr, b10);
            hc.t.d(copyOf, "copyOf(this, newSize)");
            this.f16641a = copyOf;
        }
        return i10;
    }

    public void h() {
        d.f16612a.a(this.f16641a);
    }

    public String toString() {
        return new String(this.f16641a, 0, this.f16642b);
    }
}
