package d.a.b.w;

import d.a.b.r;
import d.a.b.w.n.n;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
/* loaded from: classes.dex */
public final class l {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a extends Writer {

        /* renamed from: b */
        private final Appendable f3805b;

        /* renamed from: c */
        private final C0109a f3806c = new C0109a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d.a.b.w.l$a$a */
        /* loaded from: classes.dex */
        public static class C0109a implements CharSequence {

            /* renamed from: b */
            char[] f3807b;

            C0109a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return this.f3807b[i];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f3807b.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
                return new String(this.f3807b, i, i2 - i);
            }
        }

        a(Appendable appendable) {
            this.f3805b = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i) {
            this.f3805b.append((char) i);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            C0109a c0109a = this.f3806c;
            c0109a.f3807b = cArr;
            this.f3805b.append(c0109a, i, i2 + i);
        }
    }

    public static d.a.b.j a(d.a.b.y.a aVar) {
        EOFException e2;
        boolean z;
        try {
            try {
                aVar.w0();
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
                return d.a.b.l.f3742a;
            }
        } catch (d.a.b.y.d e5) {
            throw new r(e5);
        } catch (IOException e6) {
            throw new d.a.b.k(e6);
        } catch (NumberFormatException e7) {
            throw new r(e7);
        }
    }

    public static void b(d.a.b.j jVar, d.a.b.y.c cVar) {
        n.X.d(cVar, jVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }
}
