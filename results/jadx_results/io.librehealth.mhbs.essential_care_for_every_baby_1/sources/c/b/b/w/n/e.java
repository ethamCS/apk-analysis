package c.b.b.w.n;

import c.b.b.o;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class e extends c.b.b.y.a {
    private static final Object u = new Object();
    private Object[] q;
    private int r;
    private String[] s;
    private int[] t;

    /* loaded from: classes.dex */
    static class a extends Reader {
        a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    static {
        new a();
    }

    private void J(c.b.b.y.b bVar) {
        if (x() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + x() + m());
    }

    private Object K() {
        return this.q[this.r - 1];
    }

    private Object L() {
        Object[] objArr = this.q;
        int i = this.r - 1;
        this.r = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    private void N(Object obj) {
        int i = this.r;
        Object[] objArr = this.q;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[i * 2];
            int[] iArr = new int[i * 2];
            String[] strArr = new String[i * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.t, 0, iArr, 0, this.r);
            System.arraycopy(this.s, 0, strArr, 0, this.r);
            this.q = objArr2;
            this.t = iArr;
            this.s = strArr;
        }
        Object[] objArr3 = this.q;
        int i2 = this.r;
        this.r = i2 + 1;
        objArr3[i2] = obj;
    }

    private String m() {
        return " at path " + i();
    }

    @Override // c.b.b.y.a
    public void H() {
        if (x() == c.b.b.y.b.NAME) {
            r();
            this.s[this.r - 2] = "null";
        } else {
            L();
            int i = this.r;
            if (i > 0) {
                this.s[i - 1] = "null";
            }
        }
        int i2 = this.r;
        if (i2 > 0) {
            int[] iArr = this.t;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public void M() {
        J(c.b.b.y.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) K()).next();
        N(entry.getValue());
        N(new o((String) entry.getKey()));
    }

    @Override // c.b.b.y.a
    public void a() {
        J(c.b.b.y.b.BEGIN_ARRAY);
        N(((c.b.b.g) K()).iterator());
        this.t[this.r - 1] = 0;
    }

    @Override // c.b.b.y.a
    public void b() {
        J(c.b.b.y.b.BEGIN_OBJECT);
        N(((c.b.b.m) K()).i().iterator());
    }

    @Override // c.b.b.y.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.q = new Object[]{u};
        this.r = 1;
    }

    @Override // c.b.b.y.a
    public void f() {
        J(c.b.b.y.b.END_ARRAY);
        L();
        L();
        int i = this.r;
        if (i > 0) {
            int[] iArr = this.t;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // c.b.b.y.a
    public void g() {
        J(c.b.b.y.b.END_OBJECT);
        L();
        L();
        int i = this.r;
        if (i > 0) {
            int[] iArr = this.t;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // c.b.b.y.a
    public String i() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.r) {
            Object[] objArr = this.q;
            if (objArr[i] instanceof c.b.b.g) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.t[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof c.b.b.m) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.s;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    @Override // c.b.b.y.a
    public boolean j() {
        c.b.b.y.b x = x();
        return (x == c.b.b.y.b.END_OBJECT || x == c.b.b.y.b.END_ARRAY) ? false : true;
    }

    @Override // c.b.b.y.a
    public boolean n() {
        J(c.b.b.y.b.BOOLEAN);
        boolean h = ((o) L()).h();
        int i = this.r;
        if (i > 0) {
            int[] iArr = this.t;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return h;
    }

    @Override // c.b.b.y.a
    public double o() {
        c.b.b.y.b x = x();
        c.b.b.y.b bVar = c.b.b.y.b.NUMBER;
        if (x != bVar && x != c.b.b.y.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + x + m());
        }
        double j = ((o) K()).j();
        if (!k() && (Double.isNaN(j) || Double.isInfinite(j))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + j);
        }
        L();
        int i = this.r;
        if (i > 0) {
            int[] iArr = this.t;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return j;
    }

    @Override // c.b.b.y.a
    public int p() {
        c.b.b.y.b x = x();
        c.b.b.y.b bVar = c.b.b.y.b.NUMBER;
        if (x != bVar && x != c.b.b.y.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + x + m());
        }
        int k = ((o) K()).k();
        L();
        int i = this.r;
        if (i > 0) {
            int[] iArr = this.t;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return k;
    }

    @Override // c.b.b.y.a
    public long q() {
        c.b.b.y.b x = x();
        c.b.b.y.b bVar = c.b.b.y.b.NUMBER;
        if (x != bVar && x != c.b.b.y.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + x + m());
        }
        long l = ((o) K()).l();
        L();
        int i = this.r;
        if (i > 0) {
            int[] iArr = this.t;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return l;
    }

    @Override // c.b.b.y.a
    public String r() {
        J(c.b.b.y.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) K()).next();
        String str = (String) entry.getKey();
        this.s[this.r - 1] = str;
        N(entry.getValue());
        return str;
    }

    @Override // c.b.b.y.a
    public void t() {
        J(c.b.b.y.b.NULL);
        L();
        int i = this.r;
        if (i > 0) {
            int[] iArr = this.t;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // c.b.b.y.a
    public String toString() {
        return e.class.getSimpleName();
    }

    @Override // c.b.b.y.a
    public String v() {
        c.b.b.y.b x = x();
        c.b.b.y.b bVar = c.b.b.y.b.STRING;
        if (x == bVar || x == c.b.b.y.b.NUMBER) {
            String n = ((o) L()).n();
            int i = this.r;
            if (i > 0) {
                int[] iArr = this.t;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return n;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + x + m());
    }

    @Override // c.b.b.y.a
    public c.b.b.y.b x() {
        if (this.r == 0) {
            return c.b.b.y.b.END_DOCUMENT;
        }
        Object K = K();
        if (K instanceof Iterator) {
            boolean z = this.q[this.r - 2] instanceof c.b.b.m;
            Iterator it = (Iterator) K;
            if (!it.hasNext()) {
                return z ? c.b.b.y.b.END_OBJECT : c.b.b.y.b.END_ARRAY;
            } else if (z) {
                return c.b.b.y.b.NAME;
            } else {
                N(it.next());
                return x();
            }
        } else if (K instanceof c.b.b.m) {
            return c.b.b.y.b.BEGIN_OBJECT;
        } else {
            if (K instanceof c.b.b.g) {
                return c.b.b.y.b.BEGIN_ARRAY;
            }
            if (!(K instanceof o)) {
                if (K instanceof c.b.b.l) {
                    return c.b.b.y.b.NULL;
                }
                if (K != u) {
                    throw new AssertionError();
                }
                throw new IllegalStateException("JsonReader is closed");
            }
            o oVar = (o) K;
            if (oVar.s()) {
                return c.b.b.y.b.STRING;
            }
            if (oVar.o()) {
                return c.b.b.y.b.BOOLEAN;
            }
            if (!oVar.q()) {
                throw new AssertionError();
            }
            return c.b.b.y.b.NUMBER;
        }
    }
}
