package c.b.b.w.n;

import c.b.b.o;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class f extends c.b.b.y.c {
    private static final Writer o = new a();
    private static final o p = new o("closed");
    private String m;
    private final List<c.b.b.j> l = new ArrayList();
    private c.b.b.j n = c.b.b.l.f458a;

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
        super(o);
    }

    private c.b.b.j D() {
        List<c.b.b.j> list = this.l;
        return list.get(list.size() - 1);
    }

    private void E(c.b.b.j jVar) {
        if (this.m != null) {
            if (!jVar.e() || h()) {
                ((c.b.b.m) D()).h(this.m, jVar);
            }
            this.m = null;
        } else if (this.l.isEmpty()) {
            this.n = jVar;
        } else {
            c.b.b.j D = D();
            if (!(D instanceof c.b.b.g)) {
                throw new IllegalStateException();
            }
            ((c.b.b.g) D).h(jVar);
        }
    }

    @Override // c.b.b.y.c
    public c.b.b.y.c A(boolean z) {
        E(new o(Boolean.valueOf(z)));
        return this;
    }

    public c.b.b.j C() {
        if (this.l.isEmpty()) {
            return this.n;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.l);
    }

    @Override // c.b.b.y.c
    public c.b.b.y.c c() {
        c.b.b.g gVar = new c.b.b.g();
        E(gVar);
        this.l.add(gVar);
        return this;
    }

    @Override // c.b.b.y.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.l.isEmpty()) {
            this.l.add(p);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // c.b.b.y.c
    public c.b.b.y.c d() {
        c.b.b.m mVar = new c.b.b.m();
        E(mVar);
        this.l.add(mVar);
        return this;
    }

    @Override // c.b.b.y.c
    public c.b.b.y.c f() {
        if (this.l.isEmpty() || this.m != null) {
            throw new IllegalStateException();
        }
        if (!(D() instanceof c.b.b.g)) {
            throw new IllegalStateException();
        }
        List<c.b.b.j> list = this.l;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // c.b.b.y.c, java.io.Flushable
    public void flush() {
    }

    @Override // c.b.b.y.c
    public c.b.b.y.c g() {
        if (this.l.isEmpty() || this.m != null) {
            throw new IllegalStateException();
        }
        if (!(D() instanceof c.b.b.m)) {
            throw new IllegalStateException();
        }
        List<c.b.b.j> list = this.l;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // c.b.b.y.c
    public c.b.b.y.c k(String str) {
        if (this.l.isEmpty() || this.m != null) {
            throw new IllegalStateException();
        }
        if (!(D() instanceof c.b.b.m)) {
            throw new IllegalStateException();
        }
        this.m = str;
        return this;
    }

    @Override // c.b.b.y.c
    public c.b.b.y.c m() {
        E(c.b.b.l.f458a);
        return this;
    }

    @Override // c.b.b.y.c
    public c.b.b.y.c w(long j) {
        E(new o(Long.valueOf(j)));
        return this;
    }

    @Override // c.b.b.y.c
    public c.b.b.y.c x(Boolean bool) {
        if (bool == null) {
            m();
            return this;
        }
        E(new o(bool));
        return this;
    }

    @Override // c.b.b.y.c
    public c.b.b.y.c y(Number number) {
        if (number == null) {
            m();
            return this;
        }
        if (!j()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        E(new o(number));
        return this;
    }

    @Override // c.b.b.y.c
    public c.b.b.y.c z(String str) {
        if (str == null) {
            m();
            return this;
        }
        E(new o(str));
        return this;
    }
}
