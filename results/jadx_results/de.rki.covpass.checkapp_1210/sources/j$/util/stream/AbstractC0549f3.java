package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.Spliterator;
import java.util.Comparator;
/* renamed from: j$.util.stream.f3 */
/* loaded from: classes2.dex */
public abstract class AbstractC0549f3 implements Spliterator {

    /* renamed from: a */
    final boolean f13692a;

    /* renamed from: b */
    final D0 f13693b;

    /* renamed from: c */
    private j$.util.function.I f13694c;

    /* renamed from: d */
    Spliterator f13695d;

    /* renamed from: e */
    AbstractC0603q2 f13696e;

    /* renamed from: f */
    C0525b f13697f;

    /* renamed from: g */
    long f13698g;

    /* renamed from: h */
    AbstractC0540e f13699h;

    /* renamed from: i */
    boolean f13700i;

    public AbstractC0549f3(D0 d02, Spliterator spliterator, boolean z10) {
        this.f13693b = d02;
        this.f13694c = null;
        this.f13695d = spliterator;
        this.f13692a = z10;
    }

    public AbstractC0549f3(D0 d02, j$.util.function.I i10, boolean z10) {
        this.f13693b = d02;
        this.f13694c = i10;
        this.f13695d = null;
        this.f13692a = z10;
    }

    private boolean c() {
        boolean z10;
        while (this.f13699h.count() == 0) {
            if (!this.f13696e.x()) {
                C0525b c0525b = this.f13697f;
                switch (c0525b.f13622a) {
                    case 4:
                        C0594o3 c0594o3 = (C0594o3) c0525b.f13623b;
                        z10 = c0594o3.f13695d.b(c0594o3.f13696e);
                        break;
                    case 5:
                        q3 q3Var = (q3) c0525b.f13623b;
                        z10 = q3Var.f13695d.b(q3Var.f13696e);
                        break;
                    case 6:
                        s3 s3Var = (s3) c0525b.f13623b;
                        z10 = s3Var.f13695d.b(s3Var.f13696e);
                        break;
                    default:
                        J3 j32 = (J3) c0525b.f13623b;
                        z10 = j32.f13695d.b(j32.f13696e);
                        break;
                }
                if (z10) {
                    continue;
                }
            }
            if (this.f13700i) {
                return false;
            }
            this.f13696e.t();
            this.f13700i = true;
        }
        return true;
    }

    public final boolean a() {
        AbstractC0540e abstractC0540e = this.f13699h;
        boolean z10 = false;
        if (abstractC0540e == null) {
            if (this.f13700i) {
                return false;
            }
            d();
            h();
            this.f13698g = 0L;
            this.f13696e.u(this.f13695d.getExactSizeIfKnown());
            return c();
        }
        long j10 = this.f13698g + 1;
        this.f13698g = j10;
        if (j10 < abstractC0540e.count()) {
            z10 = true;
        }
        if (z10) {
            return z10;
        }
        this.f13698g = 0L;
        this.f13699h.clear();
        return c();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        d();
        int l10 = EnumC0539d3.l(this.f13693b.E0()) & EnumC0539d3.f13653f;
        return (l10 & 64) != 0 ? (l10 & (-16449)) | (this.f13695d.characteristics() & 16448) : l10;
    }

    public final void d() {
        if (this.f13695d == null) {
            this.f13695d = (Spliterator) this.f13694c.get();
            this.f13694c = null;
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        d();
        return this.f13695d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC0516o.l(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        d();
        if (EnumC0539d3.SIZED.h(this.f13693b.E0())) {
            return this.f13695d.getExactSizeIfKnown();
        }
        return -1L;
    }

    abstract void h();

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC0516o.l(this, i10);
    }

    abstract AbstractC0549f3 l(Spliterator spliterator);

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f13695d);
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f13692a || this.f13700i) {
            return null;
        }
        d();
        Spliterator trySplit = this.f13695d.trySplit();
        if (trySplit != null) {
            return l(trySplit);
        }
        return null;
    }
}
