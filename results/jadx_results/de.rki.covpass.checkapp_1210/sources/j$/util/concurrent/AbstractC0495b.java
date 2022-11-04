package j$.util.concurrent;
/* renamed from: j$.util.concurrent.b */
/* loaded from: classes2.dex */
public abstract class AbstractC0495b extends q {

    /* renamed from: i */
    final ConcurrentHashMap f13302i;

    /* renamed from: j */
    m f13303j;

    public AbstractC0495b(m[] mVarArr, int i10, int i11, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i10, 0, i11);
        this.f13302i = concurrentHashMap;
        a();
    }

    public final boolean hasMoreElements() {
        return this.f13323b != null;
    }

    public final boolean hasNext() {
        return this.f13323b != null;
    }

    public final void remove() {
        m mVar = this.f13303j;
        if (mVar != null) {
            this.f13303j = null;
            this.f13302i.replaceNode(mVar.f13315b, null, null);
            return;
        }
        throw new IllegalStateException();
    }
}
