package c4;

import c4.q;
import java.lang.reflect.Array;
/* loaded from: classes.dex */
public class f0<T extends q<T>> extends s<f0<T>> {
    public Class<T> V3;
    public T[] W3;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(Class<T> cls, int i10, int i11, int i12) {
        this.V3 = cls;
        this.f6219d = i10;
        this.f6220q = i10;
        this.f6221x = i11;
        this.W3 = (T[]) ((q[]) Array.newInstance((Class<?>) cls, i12));
        for (int i13 = 0; i13 < i12; i13++) {
            this.W3[i13] = q.I(cls, i10, i11);
        }
        this.U3 = t.k(i12, cls);
    }

    /* renamed from: A */
    public f0<T> e(int i10, int i11) {
        return new f0<>(this.V3, i10, i11, this.W3.length);
    }

    public T B(int i10) {
        T[] tArr = this.W3;
        if (i10 >= tArr.length || i10 < 0) {
            int length = this.W3.length;
            throw new IllegalArgumentException("The specified band is out of range. " + i10 + " / " + length);
        }
        return tArr[i10];
    }

    public Class<T> I() {
        return this.V3;
    }

    public int M() {
        return this.W3.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void N(int i10, int i11, int i12) {
        if (M() == i12) {
            U(i10, i11);
        } else if (v()) {
            throw new RuntimeException("Can't reshape subimage");
        } else {
            T[] tArr = (T[]) ((q[]) Array.newInstance((Class<?>) this.V3, i12));
            int min = Math.min(i12, this.W3.length);
            for (int i13 = 0; i13 < min; i13++) {
                tArr[i13] = this.W3[i13];
                tArr[i13].U(i10, i11);
            }
            while (min < tArr.length) {
                tArr[min] = q.I(this.V3, i10, i11);
                min++;
            }
            this.f6218c = 0;
            this.W3 = tArr;
            this.f6219d = i10;
            this.f6220q = i10;
            this.f6221x = i11;
            this.U3.f6260q = i12;
        }
    }

    @Override // c4.n
    public void U(int i10, int i11) {
        if (this.f6220q == i10 && this.f6221x == i11) {
            return;
        }
        if (v()) {
            throw new IllegalArgumentException("Can't reshape subimage");
        }
        int i12 = 0;
        while (true) {
            T[] tArr = this.W3;
            if (i12 >= tArr.length) {
                this.f6218c = 0;
                this.f6219d = i10;
                this.f6220q = i10;
                this.f6221x = i11;
                return;
            }
            tArr[i12].U(i10, i11);
            i12++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void V(int i10) {
        if (i10 == this.W3.length) {
            return;
        }
        T[] tArr = (T[]) ((q[]) Array.newInstance((Class<?>) this.V3, i10));
        int min = Math.min(i10, this.W3.length);
        for (int i11 = 0; i11 < min; i11++) {
            tArr[i11] = this.W3[i11];
        }
        while (min < tArr.length) {
            tArr[min] = q.I(this.V3, this.f6220q, this.f6221x);
            min++;
        }
        this.W3 = tArr;
        this.U3.f6260q = tArr.length;
    }

    /* renamed from: W */
    public void y(f0<T> f0Var) {
        int i10 = f0Var.f6220q;
        if (i10 != this.f6220q || f0Var.f6221x != this.f6221x) {
            U(i10, f0Var.f6221x);
        }
        if (f0Var.I() == I()) {
            int M = f0Var.M();
            if (M != M()) {
                V(f0Var.M());
            }
            for (int i11 = 0; i11 < M; i11++) {
                this.W3[i11].y(f0Var.B(i11));
            }
            return;
        }
        throw new IllegalArgumentException("The band type must be the same");
    }
}
