package f;
/* loaded from: classes.dex */
public abstract class h implements t {

    /* renamed from: b */
    private final t f4445b;

    public h(t tVar) {
        if (tVar != null) {
            this.f4445b = tVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final t a() {
        return this.f4445b;
    }

    @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4445b.close();
    }

    @Override // f.t
    public u d() {
        return this.f4445b.d();
    }

    @Override // f.t
    public long q(c cVar, long j) {
        return this.f4445b.q(cVar, j);
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f4445b.toString() + ")";
    }
}
