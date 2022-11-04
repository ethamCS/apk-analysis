package c.b.b;

import java.io.IOException;
/* loaded from: classes.dex */
public abstract class t<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends t<T> {
        a() {
            t.this = r1;
        }

        @Override // c.b.b.t
        public T b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            return (T) t.this.b(aVar);
        }

        @Override // c.b.b.t
        public void d(c.b.b.y.c cVar, T t) {
            if (t == null) {
                cVar.m();
            } else {
                t.this.d(cVar, t);
            }
        }
    }

    public final t<T> a() {
        return new a();
    }

    public abstract T b(c.b.b.y.a aVar);

    public final j c(T t) {
        try {
            c.b.b.w.n.f fVar = new c.b.b.w.n.f();
            d(fVar, t);
            return fVar.C();
        } catch (IOException e2) {
            throw new k(e2);
        }
    }

    public abstract void d(c.b.b.y.c cVar, T t);
}
