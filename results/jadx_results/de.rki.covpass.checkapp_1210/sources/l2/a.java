package l2;

import c4.f0;
import c4.n;
import c4.q;
import c4.r;
import m3.i;
/* loaded from: classes.dex */
public class a {
    public static void a(n<?> nVar, n<?> nVar2) {
        if (nVar.f6220q != nVar2.f6220q) {
            int i10 = nVar.f6220q;
            int i11 = nVar2.f6220q;
            throw new IllegalArgumentException("Image widths do not match. " + i10 + " " + i11);
        } else if (nVar.f6221x == nVar2.f6221x) {
        } else {
            int i12 = nVar.f6221x;
            int i13 = nVar2.f6221x;
            throw new IllegalArgumentException("Image heights do not match. " + i12 + " " + i13);
        }
    }

    public static <T extends n<T>> T b(T t10, T t11) {
        if (t11 == null) {
            return (T) t10.e(t10.f6220q, t10.f6221x);
        }
        t11.U(t10.f6220q, t10.f6221x);
        return t11;
    }

    public static <T extends q<T>> T c(T t10, int i10, int i11, Class<T> cls) {
        if (t10 == null) {
            return (T) i.e(cls, i10, i11);
        }
        t10.U(i10, i11);
        return t10;
    }

    public static <In extends q, Out extends q> Out d(In in, Out out, Class<Out> cls) {
        if (out == null) {
            return (Out) i.e(cls, in.f6220q, in.f6221x);
        }
        out.U(in.f6220q, in.f6221x);
        return out;
    }

    public static <T extends r<T>> T e(T t10, int i10, int i11, int i12, Class<T> cls) {
        if (t10 == null) {
            return (T) i.c(cls, i10, i11, i12);
        }
        t10.W(i10, i11, i12);
        return t10;
    }

    public static <T extends q<T>> f0<T> f(f0<T> f0Var, int i10, int i11, int i12, Class<T> cls) {
        if (f0Var == null) {
            return new f0<>(cls, i10, i11, i12);
        }
        f0Var.N(i10, i11, i12);
        return f0Var;
    }
}
