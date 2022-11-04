package yd;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import yd.q;
/* loaded from: classes3.dex */
public abstract class a implements q {

    /* renamed from: c */
    protected int f26088c = 0;

    /* renamed from: yd.a$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0456a<BuilderType extends AbstractC0456a> implements q.a {

        /* renamed from: yd.a$a$a */
        /* loaded from: classes3.dex */
        static final class C0457a extends FilterInputStream {

            /* renamed from: c */
            private int f26089c;

            public C0457a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f26089c = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f26089c);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() {
                if (this.f26089c <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f26089c--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) {
                int i12 = this.f26089c;
                if (i12 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i10, Math.min(i11, i12));
                if (read >= 0) {
                    this.f26089c -= read;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) {
                long skip = super.skip(Math.min(j10, this.f26089c));
                if (skip >= 0) {
                    this.f26089c = (int) (this.f26089c - skip);
                }
                return skip;
            }
        }

        public static w d(q qVar) {
            return new w(qVar);
        }

        /* renamed from: a */
        public abstract BuilderType s(e eVar, g gVar);
    }

    public w k() {
        return new w(this);
    }

    public void n(OutputStream outputStream) {
        int e10 = e();
        f J = f.J(outputStream, f.u(f.v(e10) + e10));
        J.o0(e10);
        j(J);
        J.I();
    }
}
