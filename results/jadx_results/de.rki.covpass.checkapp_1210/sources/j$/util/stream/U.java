package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
/* loaded from: classes2.dex */
final class U extends AbstractC0535d {

    /* renamed from: j */
    private final N f13558j;

    public U(N n10, D0 d02, Spliterator spliterator) {
        super(d02, spliterator);
        this.f13558j = n10;
    }

    U(U u10, Spliterator spliterator) {
        super(u10, spliterator);
        this.f13558j = u10.f13558j;
    }

    private void m(Object obj) {
        boolean z10;
        U u10 = this;
        while (true) {
            if (u10 != null) {
                AbstractC0545f c10 = u10.c();
                if (c10 != null && c10.f13688d != u10) {
                    z10 = false;
                    break;
                }
                u10 = c10;
            } else {
                z10 = true;
                break;
            }
        }
        if (z10) {
            l(obj);
        } else {
            j();
        }
    }

    @Override // j$.util.stream.AbstractC0545f
    public final Object a() {
        D0 d02 = this.f13685a;
        N3 n32 = (N3) this.f13558j.f13509e.get();
        d02.U0(n32, this.f13686b);
        Object obj = n32.get();
        if (!this.f13558j.f13506b) {
            if (obj != null) {
                l(obj);
            }
            return null;
        } else if (obj == null) {
            return null;
        } else {
            m(obj);
            return obj;
        }
    }

    @Override // j$.util.stream.AbstractC0545f
    public final AbstractC0545f f(Spliterator spliterator) {
        return new U(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0535d
    protected final Object k() {
        return this.f13558j.f13507c;
    }

    @Override // j$.util.stream.AbstractC0545f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.f13558j.f13506b) {
            U u10 = (U) this.f13688d;
            U u11 = null;
            while (true) {
                if (u10 != u11) {
                    Object b10 = u10.b();
                    if (b10 != null && this.f13558j.f13508d.test(b10)) {
                        g(b10);
                        m(b10);
                        break;
                    }
                    u11 = u10;
                    u10 = (U) this.f13689e;
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
