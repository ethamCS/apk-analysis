package d.a.b.w.n;

import d.a.b.o;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class f extends d.a.b.y.c {
    private static final Writer p = new a();
    private static final o q = new o("closed");
    private String n;
    private final List<d.a.b.j> m = new ArrayList();
    private d.a.b.j o = d.a.b.l.f3742a;

    /* loaded from: classes.dex */
    static class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public f() {
        super(p);
    }

    private d.a.b.j D0() {
        List<d.a.b.j> list = this.m;
        return list.get(list.size() - 1);
    }

    private void E0(d.a.b.j jVar) {
        if (this.n != null) {
            if (!jVar.e() || h0()) {
                ((d.a.b.m) D0()).h(this.n, jVar);
            }
            this.n = null;
        } else if (this.m.isEmpty()) {
            this.o = jVar;
        } else {
            d.a.b.j D0 = D0();
            if (!(D0 instanceof d.a.b.g)) {
                throw new IllegalStateException();
            }
            ((d.a.b.g) D0).h(jVar);
        }
    }

    @Override // d.a.b.y.c
    public d.a.b.y.c A0(boolean z) {
        E0(new o(Boolean.valueOf(z)));
        return this;
    }

    public d.a.b.j C0() {
        if (this.m.isEmpty()) {
            return this.o;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.m);
    }

    @Override // d.a.b.y.c
    public d.a.b.y.c I() {
        d.a.b.m mVar = new d.a.b.m();
        E0(mVar);
        this.m.add(mVar);
        return this;
    }

    @Override // d.a.b.y.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.m.isEmpty()) {
            this.m.add(q);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // d.a.b.y.c
    public d.a.b.y.c f0() {
        if (this.m.isEmpty() || this.n != null) {
            throw new IllegalStateException();
        }
        if (!(D0() instanceof d.a.b.g)) {
            throw new IllegalStateException();
        }
        List<d.a.b.j> list = this.m;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // d.a.b.y.c, java.io.Flushable
    public void flush() {
    }

    @Override // d.a.b.y.c
    public d.a.b.y.c g0() {
        if (this.m.isEmpty() || this.n != null) {
            throw new IllegalStateException();
        }
        if (!(D0() instanceof d.a.b.m)) {
            throw new IllegalStateException();
        }
        List<d.a.b.j> list = this.m;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // d.a.b.y.c
    public d.a.b.y.c k() {
        d.a.b.g gVar = new d.a.b.g();
        E0(gVar);
        this.m.add(gVar);
        return this;
    }

    @Override // d.a.b.y.c
    public d.a.b.y.c k0(String str) {
        if (this.m.isEmpty() || this.n != null) {
            throw new IllegalStateException();
        }
        if (!(D0() instanceof d.a.b.m)) {
            throw new IllegalStateException();
        }
        this.n = str;
        return this;
    }

    @Override // d.a.b.y.c
    public d.a.b.y.c m0() {
        E0(d.a.b.l.f3742a);
        return this;
    }

    @Override // d.a.b.y.c
    public d.a.b.y.c w0(long j) {
        E0(new o(Long.valueOf(j)));
        return this;
    }

    @Override // d.a.b.y.c
    public d.a.b.y.c x0(Boolean bool) {
        if (bool == null) {
            m0();
            return this;
        }
        E0(new o(bool));
        return this;
    }

    @Override // d.a.b.y.c
    public d.a.b.y.c y0(Number number) {
        if (number == null) {
            m0();
            return this;
        }
        if (!j0()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        E0(new o(number));
        return this;
    }

    @Override // d.a.b.y.c
    public d.a.b.y.c z0(String str) {
        if (str == null) {
            m0();
            return this;
        }
        E0(new o(str));
        return this;
    }
}
