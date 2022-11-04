package d.a.b;

import java.io.IOException;
/* loaded from: classes.dex */
public abstract class t<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends t<T> {
        a() {
            t.this = r1;
        }

        @Override // d.a.b.t
        public T b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            return (T) t.this.b(aVar);
        }

        @Override // d.a.b.t
        public void d(d.a.b.y.c cVar, T t) {
            if (t == null) {
                cVar.m0();
            } else {
                t.this.d(cVar, t);
            }
        }
    }

    public final t<T> a() {
        return new a();
    }

    public abstract T b(d.a.b.y.a aVar);

    public final j c(T t) {
        try {
            d.a.b.w.n.f fVar = new d.a.b.w.n.f();
            d(fVar, t);
            return fVar.C0();
        } catch (IOException e2) {
            throw new k(e2);
        }
    }

    public abstract void d(d.a.b.y.c cVar, T t);
}
