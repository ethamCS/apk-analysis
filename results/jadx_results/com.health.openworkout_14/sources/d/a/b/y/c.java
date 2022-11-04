package d.a.b.y;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;
/* loaded from: classes.dex */
public class c implements Closeable, Flushable {
    private static final String[] k = new String[128];
    private static final String[] l;

    /* renamed from: b */
    private final Writer f3906b;

    /* renamed from: e */
    private String f3909e;

    /* renamed from: g */
    private boolean f3911g;

    /* renamed from: h */
    private boolean f3912h;
    private String i;

    /* renamed from: c */
    private int[] f3907c = new int[32];

    /* renamed from: d */
    private int f3908d = 0;

    /* renamed from: f */
    private String f3910f = ":";
    private boolean j = true;

    static {
        for (int i = 0; i <= 31; i++) {
            k[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        l = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        p0(6);
        Objects.requireNonNull(writer, "out == null");
        this.f3906b = writer;
    }

    private void B0() {
        if (this.i != null) {
            a();
            v0(this.i);
            this.i = null;
        }
    }

    private c N(int i, int i2, String str) {
        int o0 = o0();
        if (o0 == i2 || o0 == i) {
            if (this.i != null) {
                throw new IllegalStateException("Dangling name: " + this.i);
            }
            this.f3908d--;
            if (o0 == i2) {
                l0();
            }
            this.f3906b.write(str);
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    private void a() {
        int o0 = o0();
        if (o0 == 5) {
            this.f3906b.write(44);
        } else if (o0 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        l0();
        q0(4);
    }

    private void c() {
        int o0 = o0();
        if (o0 == 1) {
            q0(2);
        } else if (o0 != 2) {
            if (o0 == 4) {
                this.f3906b.append((CharSequence) this.f3910f);
                q0(5);
                return;
            }
            if (o0 != 6) {
                if (o0 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f3911g) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            q0(7);
            return;
        } else {
            this.f3906b.append(',');
        }
        l0();
    }

    private void l0() {
        if (this.f3909e == null) {
            return;
        }
        this.f3906b.write("\n");
        int i = this.f3908d;
        for (int i2 = 1; i2 < i; i2++) {
            this.f3906b.write(this.f3909e);
        }
    }

    private c n0(int i, String str) {
        c();
        p0(i);
        this.f3906b.write(str);
        return this;
    }

    private int o0() {
        int i = this.f3908d;
        if (i != 0) {
            return this.f3907c[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void p0(int i) {
        int i2 = this.f3908d;
        int[] iArr = this.f3907c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f3907c = iArr2;
        }
        int[] iArr3 = this.f3907c;
        int i3 = this.f3908d;
        this.f3908d = i3 + 1;
        iArr3[i3] = i;
    }

    private void q0(int i) {
        this.f3907c[this.f3908d - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void v0(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f3912h
            if (r0 == 0) goto L7
            java.lang.String[] r0 = d.a.b.y.c.l
            goto L9
        L7:
            java.lang.String[] r0 = d.a.b.y.c.k
        L9:
            java.io.Writer r1 = r8.f3906b
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
            java.io.Writer r6 = r8.f3906b
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f3906b
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f3906b
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f3906b
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.b.y.c.v0(java.lang.String):void");
    }

    public c A0(boolean z) {
        B0();
        c();
        this.f3906b.write(z ? "true" : "false");
        return this;
    }

    public c I() {
        B0();
        n0(3, "{");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3906b.close();
        int i = this.f3908d;
        if (i > 1 || (i == 1 && this.f3907c[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f3908d = 0;
    }

    public c f0() {
        N(1, 2, "]");
        return this;
    }

    public void flush() {
        if (this.f3908d != 0) {
            this.f3906b.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c g0() {
        N(3, 5, "}");
        return this;
    }

    public final boolean h0() {
        return this.j;
    }

    public final boolean i0() {
        return this.f3912h;
    }

    public boolean j0() {
        return this.f3911g;
    }

    public c k() {
        B0();
        n0(1, "[");
        return this;
    }

    public c k0(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.i == null) {
            if (this.f3908d == 0) {
                throw new IllegalStateException("JsonWriter is closed.");
            }
            this.i = str;
            return this;
        }
        throw new IllegalStateException();
    }

    public c m0() {
        if (this.i != null) {
            if (!this.j) {
                this.i = null;
                return this;
            }
            B0();
        }
        c();
        this.f3906b.write("null");
        return this;
    }

    public final void r0(boolean z) {
        this.f3912h = z;
    }

    public final void s0(String str) {
        String str2;
        if (str.length() == 0) {
            this.f3909e = null;
            str2 = ":";
        } else {
            this.f3909e = str;
            str2 = ": ";
        }
        this.f3910f = str2;
    }

    public final void t0(boolean z) {
        this.f3911g = z;
    }

    public final void u0(boolean z) {
        this.j = z;
    }

    public c w0(long j) {
        B0();
        c();
        this.f3906b.write(Long.toString(j));
        return this;
    }

    public c x0(Boolean bool) {
        if (bool == null) {
            return m0();
        }
        B0();
        c();
        this.f3906b.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c y0(Number number) {
        if (number == null) {
            return m0();
        }
        B0();
        String obj = number.toString();
        if (this.f3911g || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            c();
            this.f3906b.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c z0(String str) {
        if (str == null) {
            return m0();
        }
        B0();
        c();
        v0(str);
        return this;
    }
}
