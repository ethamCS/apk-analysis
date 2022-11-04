package f;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    static final Logger f4456a = Logger.getLogger(l.class.getName());

    /* loaded from: classes.dex */
    public final class a implements s {

        /* renamed from: b */
        final /* synthetic */ u f4457b;

        /* renamed from: c */
        final /* synthetic */ OutputStream f4458c;

        a(u uVar, OutputStream outputStream) {
            this.f4457b = uVar;
            this.f4458c = outputStream;
        }

        @Override // f.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f4458c.close();
        }

        @Override // f.s
        public u d() {
            return this.f4457b;
        }

        @Override // f.s, java.io.Flushable
        public void flush() {
            this.f4458c.flush();
        }

        @Override // f.s
        public void i(f.c cVar, long j) {
            v.b(cVar.f4436c, 0L, j);
            while (j > 0) {
                this.f4457b.f();
                p pVar = cVar.f4435b;
                int min = (int) Math.min(j, pVar.f4472c - pVar.f4471b);
                this.f4458c.write(pVar.f4470a, pVar.f4471b, min);
                int i = pVar.f4471b + min;
                pVar.f4471b = i;
                long j2 = min;
                j -= j2;
                cVar.f4436c -= j2;
                if (i == pVar.f4472c) {
                    cVar.f4435b = pVar.b();
                    q.a(pVar);
                }
            }
        }

        public String toString() {
            return "sink(" + this.f4458c + ")";
        }
    }

    /* loaded from: classes.dex */
    public final class b implements t {

        /* renamed from: b */
        final /* synthetic */ u f4459b;

        /* renamed from: c */
        final /* synthetic */ InputStream f4460c;

        b(u uVar, InputStream inputStream) {
            this.f4459b = uVar;
            this.f4460c = inputStream;
        }

        @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f4460c.close();
        }

        @Override // f.t
        public u d() {
            return this.f4459b;
        }

        @Override // f.t
        public long q(f.c cVar, long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (i == 0) {
                return 0L;
            } else {
                try {
                    this.f4459b.f();
                    p y0 = cVar.y0(1);
                    int read = this.f4460c.read(y0.f4470a, y0.f4472c, (int) Math.min(j, 8192 - y0.f4472c));
                    if (read == -1) {
                        return -1L;
                    }
                    y0.f4472c += read;
                    long j2 = read;
                    cVar.f4436c += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (!l.c(e2)) {
                        throw e2;
                    }
                    throw new IOException(e2);
                }
            }
        }

        public String toString() {
            return "source(" + this.f4460c + ")";
        }
    }

    /* loaded from: classes.dex */
    public final class c extends f.a {
        final /* synthetic */ Socket k;

        c(Socket socket) {
            this.k = socket;
        }

        @Override // f.a
        protected IOException o(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a
        protected void t() {
            StringBuilder sb;
            Level level;
            Logger logger;
            Exception exc;
            try {
                this.k.close();
            } catch (AssertionError e2) {
                if (!l.c(e2)) {
                    throw e2;
                }
                Logger logger2 = l.f4456a;
                level = Level.WARNING;
                sb = new StringBuilder();
                exc = e2;
                logger = logger2;
                sb.append("Failed to close timed out socket ");
                sb.append(this.k);
                logger.log(level, sb.toString(), (Throwable) exc);
            } catch (Exception e3) {
                Logger logger3 = l.f4456a;
                level = Level.WARNING;
                sb = new StringBuilder();
                exc = e3;
                logger = logger3;
                sb.append("Failed to close timed out socket ");
                sb.append(this.k);
                logger.log(level, sb.toString(), (Throwable) exc);
            }
        }
    }

    private l() {
    }

    public static d a(s sVar) {
        return new n(sVar);
    }

    public static e b(t tVar) {
        return new o(tVar);
    }

    static boolean c(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    private static s d(OutputStream outputStream, u uVar) {
        if (outputStream != null) {
            if (uVar == null) {
                throw new IllegalArgumentException("timeout == null");
            }
            return new a(uVar, outputStream);
        }
        throw new IllegalArgumentException("out == null");
    }

    public static s e(Socket socket) {
        if (socket != null) {
            if (socket.getOutputStream() == null) {
                throw new IOException("socket's output stream == null");
            }
            f.a i = i(socket);
            return i.r(d(socket.getOutputStream(), i));
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static t f(InputStream inputStream) {
        return g(inputStream, new u());
    }

    private static t g(InputStream inputStream, u uVar) {
        if (inputStream != null) {
            if (uVar == null) {
                throw new IllegalArgumentException("timeout == null");
            }
            return new b(uVar, inputStream);
        }
        throw new IllegalArgumentException("in == null");
    }

    public static t h(Socket socket) {
        if (socket != null) {
            if (socket.getInputStream() == null) {
                throw new IOException("socket's input stream == null");
            }
            f.a i = i(socket);
            return i.s(g(socket.getInputStream(), i));
        }
        throw new IllegalArgumentException("socket == null");
    }

    private static f.a i(Socket socket) {
        return new c(socket);
    }
}
