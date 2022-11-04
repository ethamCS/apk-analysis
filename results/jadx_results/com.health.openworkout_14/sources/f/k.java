package f;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/* loaded from: classes.dex */
public final class k implements t {

    /* renamed from: b */
    private final e f4452b;

    /* renamed from: c */
    private final Inflater f4453c;

    /* renamed from: d */
    private int f4454d;

    /* renamed from: e */
    private boolean f4455e;

    public k(e eVar, Inflater inflater) {
        if (eVar != null) {
            if (inflater == null) {
                throw new IllegalArgumentException("inflater == null");
            }
            this.f4452b = eVar;
            this.f4453c = inflater;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void c() {
        int i = this.f4454d;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f4453c.getRemaining();
        this.f4454d -= remaining;
        this.f4452b.w(remaining);
    }

    public final boolean a() {
        if (!this.f4453c.needsInput()) {
            return false;
        }
        c();
        if (this.f4453c.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f4452b.S()) {
            return true;
        }
        p pVar = this.f4452b.b().f4435b;
        int i = pVar.f4472c;
        int i2 = pVar.f4471b;
        int i3 = i - i2;
        this.f4454d = i3;
        this.f4453c.setInput(pVar.f4470a, i2, i3);
        return false;
    }

    @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f4455e) {
            return;
        }
        this.f4453c.end();
        this.f4455e = true;
        this.f4452b.close();
    }

    @Override // f.t
    public u d() {
        return this.f4452b.d();
    }

    @Override // f.t
    public long q(c cVar, long j) {
        p y0;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f4455e) {
            throw new IllegalStateException("closed");
        } else {
            if (i == 0) {
                return 0L;
            }
            while (true) {
                boolean a2 = a();
                try {
                    y0 = cVar.y0(1);
                    int inflate = this.f4453c.inflate(y0.f4470a, y0.f4472c, (int) Math.min(j, 8192 - y0.f4472c));
                    if (inflate <= 0) {
                        if (this.f4453c.finished() || this.f4453c.needsDictionary()) {
                            break;
                        } else if (a2) {
                            throw new EOFException("source exhausted prematurely");
                        }
                    } else {
                        y0.f4472c += inflate;
                        long j2 = inflate;
                        cVar.f4436c += j2;
                        return j2;
                    }
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            }
            c();
            if (y0.f4471b != y0.f4472c) {
                return -1L;
            }
            cVar.f4435b = y0.b();
            q.a(y0);
            return -1L;
        }
    }
}
