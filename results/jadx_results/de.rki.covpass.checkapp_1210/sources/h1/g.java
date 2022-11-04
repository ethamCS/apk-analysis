package h1;

import androidx.room.i0;
/* loaded from: classes.dex */
public abstract class g<T> extends m {
    public g(i0 i0Var) {
        super(i0Var);
    }

    protected abstract void g(m1.k kVar, T t10);

    public final void h(T t10) {
        m1.k a10 = a();
        try {
            g(a10, t10);
            a10.X0();
        } finally {
            f(a10);
        }
    }

    public final void i(T[] tArr) {
        m1.k a10 = a();
        try {
            for (T t10 : tArr) {
                g(a10, t10);
                a10.X0();
            }
        } finally {
            f(a10);
        }
    }

    public final long j(T t10) {
        m1.k a10 = a();
        try {
            g(a10, t10);
            return a10.X0();
        } finally {
            f(a10);
        }
    }
}
