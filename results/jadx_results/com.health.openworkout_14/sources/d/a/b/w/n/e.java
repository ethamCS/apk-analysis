package d.a.b.w.n;

import d.a.b.o;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class e extends d.a.b.y.a {
    private static final Object v = new Object();
    private Object[] r;
    private int s;
    private String[] t;
    private int[] u;

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

    private void I0(d.a.b.y.b bVar) {
        if (w0() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + w0() + l0());
    }

    private Object J0() {
        return this.r[this.s - 1];
    }

    private Object K0() {
        Object[] objArr = this.r;
        int i = this.s - 1;
        this.s = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    private void M0(Object obj) {
        int i = this.s;
        Object[] objArr = this.r;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[i * 2];
            int[] iArr = new int[i * 2];
            String[] strArr = new String[i * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.u, 0, iArr, 0, this.s);
            System.arraycopy(this.t, 0, strArr, 0, this.s);
            this.r = objArr2;
            this.u = iArr;
            this.t = strArr;
        }
        Object[] objArr3 = this.r;
        int i2 = this.s;
        this.s = i2 + 1;
        objArr3[i2] = obj;
    }

    private String l0() {
        return " at path " + X();
    }

    @Override // d.a.b.y.a
    public void G0() {
        if (w0() == d.a.b.y.b.NAME) {
            q0();
            this.t[this.s - 2] = "null";
        } else {
            K0();
            int i = this.s;
            if (i > 0) {
                this.t[i - 1] = "null";
            }
        }
        int i2 = this.s;
        if (i2 > 0) {
            int[] iArr = this.u;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public void L0() {
        I0(d.a.b.y.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) J0()).next();
        M0(entry.getValue());
        M0(new o((String) entry.getKey()));
    }

    @Override // d.a.b.y.a
    public String X() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.s) {
            Object[] objArr = this.r;
            if (objArr[i] instanceof d.a.b.g) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.u[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof d.a.b.m) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.t;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    @Override // d.a.b.y.a
    public void a() {
        I0(d.a.b.y.b.BEGIN_ARRAY);
        M0(((d.a.b.g) J0()).iterator());
        this.u[this.s - 1] = 0;
    }

    @Override // d.a.b.y.a
    public void c() {
        I0(d.a.b.y.b.BEGIN_OBJECT);
        M0(((d.a.b.m) J0()).i().iterator());
    }

    @Override // d.a.b.y.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.r = new Object[]{v};
        this.s = 1;
    }

    @Override // d.a.b.y.a
    public void f0() {
        I0(d.a.b.y.b.END_ARRAY);
        K0();
        K0();
        int i = this.s;
        if (i > 0) {
            int[] iArr = this.u;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // d.a.b.y.a
    public void g0() {
        I0(d.a.b.y.b.END_OBJECT);
        K0();
        K0();
        int i = this.s;
        if (i > 0) {
            int[] iArr = this.u;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // d.a.b.y.a
    public boolean i0() {
        d.a.b.y.b w0 = w0();
        return (w0 == d.a.b.y.b.END_OBJECT || w0 == d.a.b.y.b.END_ARRAY) ? false : true;
    }

    @Override // d.a.b.y.a
    public boolean m0() {
        I0(d.a.b.y.b.BOOLEAN);
        boolean h2 = ((o) K0()).h();
        int i = this.s;
        if (i > 0) {
            int[] iArr = this.u;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return h2;
    }

    @Override // d.a.b.y.a
    public double n0() {
        d.a.b.y.b w0 = w0();
        d.a.b.y.b bVar = d.a.b.y.b.NUMBER;
        if (w0 != bVar && w0 != d.a.b.y.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + w0 + l0());
        }
        double j = ((o) J0()).j();
        if (!j0() && (Double.isNaN(j) || Double.isInfinite(j))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + j);
        }
        K0();
        int i = this.s;
        if (i > 0) {
            int[] iArr = this.u;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return j;
    }

    @Override // d.a.b.y.a
    public int o0() {
        d.a.b.y.b w0 = w0();
        d.a.b.y.b bVar = d.a.b.y.b.NUMBER;
        if (w0 != bVar && w0 != d.a.b.y.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + w0 + l0());
        }
        int k = ((o) J0()).k();
        K0();
        int i = this.s;
        if (i > 0) {
            int[] iArr = this.u;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return k;
    }

    @Override // d.a.b.y.a
    public long p0() {
        d.a.b.y.b w0 = w0();
        d.a.b.y.b bVar = d.a.b.y.b.NUMBER;
        if (w0 != bVar && w0 != d.a.b.y.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + w0 + l0());
        }
        long l = ((o) J0()).l();
        K0();
        int i = this.s;
        if (i > 0) {
            int[] iArr = this.u;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return l;
    }

    @Override // d.a.b.y.a
    public String q0() {
        I0(d.a.b.y.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) J0()).next();
        String str = (String) entry.getKey();
        this.t[this.s - 1] = str;
        M0(entry.getValue());
        return str;
    }

    @Override // d.a.b.y.a
    public void s0() {
        I0(d.a.b.y.b.NULL);
        K0();
        int i = this.s;
        if (i > 0) {
            int[] iArr = this.u;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // d.a.b.y.a
    public String toString() {
        return e.class.getSimpleName();
    }

    @Override // d.a.b.y.a
    public String u0() {
        d.a.b.y.b w0 = w0();
        d.a.b.y.b bVar = d.a.b.y.b.STRING;
        if (w0 == bVar || w0 == d.a.b.y.b.NUMBER) {
            String n = ((o) K0()).n();
            int i = this.s;
            if (i > 0) {
                int[] iArr = this.u;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return n;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + w0 + l0());
    }

    @Override // d.a.b.y.a
    public d.a.b.y.b w0() {
        if (this.s == 0) {
            return d.a.b.y.b.END_DOCUMENT;
        }
        Object J0 = J0();
        if (J0 instanceof Iterator) {
            boolean z = this.r[this.s - 2] instanceof d.a.b.m;
            Iterator it = (Iterator) J0;
            if (!it.hasNext()) {
                return z ? d.a.b.y.b.END_OBJECT : d.a.b.y.b.END_ARRAY;
            } else if (z) {
                return d.a.b.y.b.NAME;
            } else {
                M0(it.next());
                return w0();
            }
        } else if (J0 instanceof d.a.b.m) {
            return d.a.b.y.b.BEGIN_OBJECT;
        } else {
            if (J0 instanceof d.a.b.g) {
                return d.a.b.y.b.BEGIN_ARRAY;
            }
            if (!(J0 instanceof o)) {
                if (J0 instanceof d.a.b.l) {
                    return d.a.b.y.b.NULL;
                }
                if (J0 != v) {
                    throw new AssertionError();
                }
                throw new IllegalStateException("JsonReader is closed");
            }
            o oVar = (o) J0;
            if (oVar.s()) {
                return d.a.b.y.b.STRING;
            }
            if (oVar.o()) {
                return d.a.b.y.b.BOOLEAN;
            }
            if (!oVar.q()) {
                throw new AssertionError();
            }
            return d.a.b.y.b.NUMBER;
        }
    }
}
