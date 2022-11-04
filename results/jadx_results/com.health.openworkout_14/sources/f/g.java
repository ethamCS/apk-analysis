package f;
/* loaded from: classes.dex */
public abstract class g implements s {

    /* renamed from: b */
    private final s f4444b;

    public g(s sVar) {
        if (sVar != null) {
            this.f4444b = sVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // f.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4444b.close();
    }

    @Override // f.s
    public u d() {
        return this.f4444b.d();
    }

    @Override // f.s, java.io.Flushable
    public void flush() {
        this.f4444b.flush();
    }

    @Override // f.s
    public void i(c cVar, long j) {
        this.f4444b.i(cVar, j);
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f4444b.toString() + ")";
    }
}
