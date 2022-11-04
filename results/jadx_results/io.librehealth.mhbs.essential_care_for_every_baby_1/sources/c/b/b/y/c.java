package c.b.b.y;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
/* loaded from: classes.dex */
public class c implements Closeable, Flushable {
    private static final String[] j = new String[128];
    private static final String[] k;

    /* renamed from: a */
    private final Writer f603a;

    /* renamed from: d */
    private String f606d;
    private boolean f;
    private boolean g;
    private String h;

    /* renamed from: b */
    private int[] f604b = new int[32];

    /* renamed from: c */
    private int f605c = 0;

    /* renamed from: e */
    private String f607e = ":";
    private boolean i = true;

    static {
        for (int i = 0; i <= 31; i++) {
            j[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        p(6);
        if (writer != null) {
            this.f603a = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private void B() {
        if (this.h != null) {
            a();
            v(this.h);
            this.h = null;
        }
    }

    private void a() {
        int o = o();
        if (o == 5) {
            this.f603a.write(44);
        } else if (o != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        l();
        q(4);
    }

    private void b() {
        int o = o();
        if (o == 1) {
            q(2);
        } else if (o != 2) {
            if (o == 4) {
                this.f603a.append((CharSequence) this.f607e);
                q(5);
                return;
            }
            if (o != 6) {
                if (o != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            q(7);
            return;
        } else {
            this.f603a.append(',');
        }
        l();
    }

    private c e(int i, int i2, String str) {
        int o = o();
        if (o == i2 || o == i) {
            if (this.h != null) {
                throw new IllegalStateException("Dangling name: " + this.h);
            }
            this.f605c--;
            if (o == i2) {
                l();
            }
            this.f603a.write(str);
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    private void l() {
        if (this.f606d == null) {
            return;
        }
        this.f603a.write("\n");
        int i = this.f605c;
        for (int i2 = 1; i2 < i; i2++) {
            this.f603a.write(this.f606d);
        }
    }

    private c n(int i, String str) {
        b();
        p(i);
        this.f603a.write(str);
        return this;
    }

    private int o() {
        int i = this.f605c;
        if (i != 0) {
            return this.f604b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void p(int i) {
        int i2 = this.f605c;
        int[] iArr = this.f604b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f604b = iArr2;
        }
        int[] iArr3 = this.f604b;
        int i3 = this.f605c;
        this.f605c = i3 + 1;
        iArr3[i3] = i;
    }

    private void q(int i) {
        this.f604b[this.f605c - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void v(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.g
            if (r0 == 0) goto L7
            java.lang.String[] r0 = c.b.b.y.c.k
            goto L9
        L7:
            java.lang.String[] r0 = c.b.b.y.c.j
        L9:
            java.io.Writer r1 = r8.f603a
            java.lang.String r2 = "\""
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f603a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f603a
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f603a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f603a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.y.c.v(java.lang.String):void");
    }

    public c A(boolean z) {
        B();
        b();
        this.f603a.write(z ? "true" : "false");
        return this;
    }

    public c c() {
        B();
        n(1, "[");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f603a.close();
        int i = this.f605c;
        if (i > 1 || (i == 1 && this.f604b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f605c = 0;
    }

    public c d() {
        B();
        n(3, "{");
        return this;
    }

    public c f() {
        e(1, 2, "]");
        return this;
    }

    public void flush() {
        if (this.f605c != 0) {
            this.f603a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c g() {
        e(3, 5, "}");
        return this;
    }

    public final boolean h() {
        return this.i;
    }

    public final boolean i() {
        return this.g;
    }

    public boolean j() {
        return this.f;
    }

    public c k(String str) {
        if (str != null) {
            if (this.h != null) {
                throw new IllegalStateException();
            }
            if (this.f605c == 0) {
                throw new IllegalStateException("JsonWriter is closed.");
            }
            this.h = str;
            return this;
        }
        throw new NullPointerException("name == null");
    }

    public c m() {
        if (this.h != null) {
            if (!this.i) {
                this.h = null;
                return this;
            }
            B();
        }
        b();
        this.f603a.write("null");
        return this;
    }

    public final void r(boolean z) {
        this.g = z;
    }

    public final void s(String str) {
        String str2;
        if (str.length() == 0) {
            this.f606d = null;
            str2 = ":";
        } else {
            this.f606d = str;
            str2 = ": ";
        }
        this.f607e = str2;
    }

    public final void t(boolean z) {
        this.f = z;
    }

    public final void u(boolean z) {
        this.i = z;
    }

    public c w(long j2) {
        B();
        b();
        this.f603a.write(Long.toString(j2));
        return this;
    }

    public c x(Boolean bool) {
        if (bool == null) {
            return m();
        }
        B();
        b();
        this.f603a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c y(Number number) {
        if (number == null) {
            return m();
        }
        B();
        String obj = number.toString();
        if (this.f || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            b();
            this.f603a.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c z(String str) {
        if (str == null) {
            return m();
        }
        B();
        b();
        v(str);
        return this;
    }
}
