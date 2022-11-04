package c.b.b.w;

import c.b.b.r;
import c.b.b.w.n.n;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
/* loaded from: classes.dex */
public final class l {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a extends Writer {

        /* renamed from: a */
        private final Appendable f514a;

        /* renamed from: b */
        private final C0029a f515b = new C0029a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c.b.b.w.l$a$a */
        /* loaded from: classes.dex */
        public static class C0029a implements CharSequence {

            /* renamed from: a */
            char[] f516a;

            C0029a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return this.f516a[i];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f516a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
                return new String(this.f516a, i, i2 - i);
            }
        }

        a(Appendable appendable) {
            this.f514a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i) {
            this.f514a.append((char) i);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            C0029a c0029a = this.f515b;
            c0029a.f516a = cArr;
            this.f514a.append(c0029a, i, i2 + i);
        }
    }

    public static c.b.b.j a(c.b.b.y.a aVar) {
        EOFException e2;
        boolean z;
        try {
            try {
                aVar.x();
                z = false;
            } catch (EOFException e3) {
                e2 = e3;
                z = true;
            }
            try {
                return n.X.b(aVar);
            } catch (EOFException e4) {
                e2 = e4;
                if (!z) {
                    throw new r(e2);
                }
                return c.b.b.l.f458a;
            }
        } catch (c.b.b.y.d e5) {
            throw new r(e5);
        } catch (IOException e6) {
            throw new c.b.b.k(e6);
        } catch (NumberFormatException e7) {
            throw new r(e7);
        }
    }

    public static void b(c.b.b.j jVar, c.b.b.y.c cVar) {
        n.X.d(cVar, jVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }
}
