package j$.util.stream;

import j$.lang.Iterable;
import j$.util.Spliterator;
import java.util.Arrays;
/* loaded from: classes2.dex */
abstract class Z2 extends AbstractC0540e implements Iterable, Iterable {

    /* renamed from: e */
    Object f13588e = e(16);

    /* renamed from: f */
    Object[] f13589f;

    public Z2() {
    }

    public Z2(int i10) {
        super(i10);
    }

    private void D() {
        if (this.f13589f == null) {
            Object[] E = E();
            this.f13589f = E;
            this.f13678d = new long[8];
            E[0] = this.f13588e;
        }
    }

    protected final long A() {
        int i10 = this.f13677c;
        if (i10 == 0) {
            return z(this.f13588e);
        }
        return z(this.f13589f[i10]) + this.f13678d[i10];
    }

    public final int B(long j10) {
        if (this.f13677c == 0) {
            if (j10 >= this.f13676b) {
                throw new IndexOutOfBoundsException(Long.toString(j10));
            }
            return 0;
        } else if (j10 >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j10));
        } else {
            for (int i10 = 0; i10 <= this.f13677c; i10++) {
                if (j10 < this.f13678d[i10] + z(this.f13589f[i10])) {
                    return i10;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j10));
        }
    }

    public final void C(long j10) {
        int i10;
        long A = A();
        if (j10 > A) {
            D();
            int i11 = this.f13677c;
            while (true) {
                i11++;
                if (j10 <= A) {
                    return;
                }
                Object[] objArr = this.f13589f;
                if (i11 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f13589f = Arrays.copyOf(objArr, length);
                    this.f13678d = Arrays.copyOf(this.f13678d, length);
                }
                int s10 = s(i11);
                this.f13589f[i11] = e(s10);
                long[] jArr = this.f13678d;
                jArr[i11] = jArr[i11 - 1] + z(this.f13589f[i10]);
                A += s10;
            }
        }
    }

    protected abstract Object[] E();

    public final void F() {
        if (this.f13676b == z(this.f13588e)) {
            D();
            int i10 = this.f13677c + 1;
            Object[] objArr = this.f13589f;
            if (i10 >= objArr.length || objArr[i10] == null) {
                C(A() + 1);
            }
            this.f13676b = 0;
            int i11 = this.f13677c + 1;
            this.f13677c = i11;
            this.f13588e = this.f13589f[i11];
        }
    }

    @Override // j$.util.stream.AbstractC0540e
    public final void clear() {
        Object[] objArr = this.f13589f;
        if (objArr != null) {
            this.f13588e = objArr[0];
            this.f13589f = null;
            this.f13678d = null;
        }
        this.f13676b = 0;
        this.f13677c = 0;
    }

    public abstract Object e(int i10);

    public void g(Object obj, int i10) {
        long j10 = i10;
        long count = count() + j10;
        if (count > z(obj) || count < j10) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f13677c == 0) {
            System.arraycopy(this.f13588e, 0, obj, i10, this.f13676b);
            return;
        }
        for (int i11 = 0; i11 < this.f13677c; i11++) {
            Object[] objArr = this.f13589f;
            System.arraycopy(objArr[i11], 0, obj, i10, z(objArr[i11]));
            i10 += z(this.f13589f[i11]);
        }
        int i12 = this.f13676b;
        if (i12 <= 0) {
            return;
        }
        System.arraycopy(this.f13588e, 0, obj, i10, i12);
    }

    public Object i() {
        long count = count();
        if (count < 2147483639) {
            Object e10 = e((int) count);
            g(e10, 0);
            return e10;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public void j(Object obj) {
        for (int i10 = 0; i10 < this.f13677c; i10++) {
            Object[] objArr = this.f13589f;
            w(objArr[i10], 0, z(objArr[i10]), obj);
        }
        w(this.f13588e, 0, this.f13676b, obj);
    }

    /* renamed from: spliterator */
    public abstract Spliterator mo23spliterator();

    public abstract void w(Object obj, int i10, int i11, Object obj2);

    public abstract int z(Object obj);
}
