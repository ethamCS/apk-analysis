package androidx.room;

import androidx.room.i0;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class b0 implements m1.h, k {

    /* renamed from: c */
    private final m1.h f4844c;

    /* renamed from: d */
    private final i0.f f4845d;

    /* renamed from: q */
    private final Executor f4846q;

    public b0(m1.h hVar, i0.f fVar, Executor executor) {
        this.f4844c = hVar;
        this.f4845d = fVar;
        this.f4846q = executor;
    }

    @Override // m1.h
    public m1.g U0() {
        return new a0(this.f4844c.U0(), this.f4845d, this.f4846q);
    }

    @Override // androidx.room.k
    public m1.h b() {
        return this.f4844c;
    }

    @Override // m1.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4844c.close();
    }

    @Override // m1.h
    public String getDatabaseName() {
        return this.f4844c.getDatabaseName();
    }

    @Override // m1.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f4844c.setWriteAheadLoggingEnabled(z10);
    }
}
