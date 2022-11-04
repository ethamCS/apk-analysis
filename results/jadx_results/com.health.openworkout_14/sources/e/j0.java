package e;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public abstract class j0 implements Closeable {
    @Nullable

    /* renamed from: b */
    private Reader f4023b;

    /* loaded from: classes.dex */
    public class a extends j0 {

        /* renamed from: c */
        final /* synthetic */ b0 f4024c;

        /* renamed from: d */
        final /* synthetic */ long f4025d;

        /* renamed from: e */
        final /* synthetic */ f.e f4026e;

        a(b0 b0Var, long j, f.e eVar) {
            this.f4024c = b0Var;
            this.f4025d = j;
            this.f4026e = eVar;
        }

        @Override // e.j0
        public long I() {
            return this.f4025d;
        }

        @Override // e.j0
        @Nullable
        public b0 N() {
            return this.f4024c;
        }

        @Override // e.j0
        public f.e h0() {
            return this.f4026e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends Reader {

        /* renamed from: b */
        private final f.e f4027b;

        /* renamed from: c */
        private final Charset f4028c;

        /* renamed from: d */
        private boolean f4029d;
        @Nullable

        /* renamed from: e */
        private Reader f4030e;

        b(f.e eVar, Charset charset) {
            this.f4027b = eVar;
            this.f4028c = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f4029d = true;
            Reader reader = this.f4030e;
            if (reader != null) {
                reader.close();
            } else {
                this.f4027b.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            if (!this.f4029d) {
                Reader reader = this.f4030e;
                if (reader == null) {
                    InputStreamReader inputStreamReader = new InputStreamReader(this.f4027b.c0(), e.m0.e.b(this.f4027b, this.f4028c));
                    this.f4030e = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    public static j0 f0(@Nullable b0 b0Var, long j, f.e eVar) {
        Objects.requireNonNull(eVar, "source == null");
        return new a(b0Var, j, eVar);
    }

    public static j0 g0(@Nullable b0 b0Var, byte[] bArr) {
        f.c cVar = new f.c();
        cVar.A0(bArr);
        return f0(b0Var, bArr.length, cVar);
    }

    private Charset k() {
        b0 N = N();
        return N != null ? N.a(StandardCharsets.UTF_8) : StandardCharsets.UTF_8;
    }

    public abstract long I();

    @Nullable
    public abstract b0 N();

    public final InputStream a() {
        return h0().c0();
    }

    public final Reader c() {
        Reader reader = this.f4023b;
        if (reader != null) {
            return reader;
        }
        b bVar = new b(h0(), k());
        this.f4023b = bVar;
        return bVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e.m0.e.e(h0());
    }

    public abstract f.e h0();
}
