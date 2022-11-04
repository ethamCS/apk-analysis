package ub;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r\u0012\u0006\u0010!\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010#B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010%J\u0018\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\n\u001a\u00020\tJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002J)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0001\u0010\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0012J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0013\u001a\u00020\u0005J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0005R$\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006&"}, d2 = {"Lub/v0;", "T", "Lub/c;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", BuildConfig.FLAVOR, "index", "get", "(I)Ljava/lang/Object;", BuildConfig.FLAVOR, "k", BuildConfig.FLAVOR, "iterator", BuildConfig.FLAVOR, "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", BuildConfig.FLAVOR, "()[Ljava/lang/Object;", "maxCapacity", "i", "element", "Ltb/e0;", "f", "(Ljava/lang/Object;)V", "n", "l", "<set-?>", "size", "I", "a", "()I", "buffer", "filledSize", "<init>", "([Ljava/lang/Object;I)V", "capacity", "(I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class v0<T> extends c<T> implements RandomAccess {

    /* renamed from: c */
    private final Object[] f23390c;

    /* renamed from: d */
    private final int f23391d;

    /* renamed from: q */
    private int f23392q;

    /* renamed from: x */
    private int f23393x;

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, d2 = {"ub/v0$a", "Lub/b;", "Ltb/e0;", "b", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends b<T> {

        /* renamed from: q */
        private int f23394q;

        /* renamed from: x */
        private int f23395x;

        /* renamed from: y */
        final /* synthetic */ v0<T> f23396y;

        a(v0<T> v0Var) {
            this.f23396y = v0Var;
            this.f23394q = v0Var.size();
            this.f23395x = ((v0) v0Var).f23392q;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ub.b
        protected void b() {
            if (this.f23394q == 0) {
                d();
                return;
            }
            e(((v0) this.f23396y).f23390c[this.f23395x]);
            this.f23395x = (this.f23395x + 1) % ((v0) this.f23396y).f23391d;
            this.f23394q--;
        }
    }

    public v0(int i10) {
        this(new Object[i10], 0);
    }

    public v0(Object[] objArr, int i10) {
        hc.t.e(objArr, "buffer");
        this.f23390c = objArr;
        boolean z10 = true;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
        }
        if (i10 > objArr.length ? false : z10) {
            this.f23391d = objArr.length;
            this.f23393x = i10;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + objArr.length).toString());
    }

    @Override // ub.a
    public int a() {
        return this.f23393x;
    }

    public final void f(T t10) {
        if (!k()) {
            this.f23390c[(this.f23392q + size()) % this.f23391d] = t10;
            this.f23393x = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    @Override // ub.c, java.util.List
    public T get(int i10) {
        c.Companion.b(i10, size());
        return (T) this.f23390c[(this.f23392q + i10) % this.f23391d];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final v0<T> i(int i10) {
        int d10;
        Object[] objArr;
        int i11 = this.f23391d;
        d10 = nc.m.d(i11 + (i11 >> 1) + 1, i10);
        if (this.f23392q == 0) {
            objArr = Arrays.copyOf(this.f23390c, d10);
            hc.t.d(objArr, "copyOf(this, newSize)");
        } else {
            objArr = toArray(new Object[d10]);
        }
        return new v0<>(objArr, size());
    }

    @Override // ub.c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return new a(this);
    }

    public final boolean k() {
        return size() == this.f23391d;
    }

    public final void l(int i10) {
        boolean z10 = true;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i10).toString());
        }
        if (i10 > size()) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i10 + ", size = " + size()).toString());
        } else if (i10 <= 0) {
        } else {
            int i11 = this.f23392q;
            int i12 = (i11 + i10) % this.f23391d;
            if (i11 > i12) {
                l.l(this.f23390c, null, i11, this.f23391d);
                l.l(this.f23390c, null, 0, i12);
            } else {
                l.l(this.f23390c, null, i11, i12);
            }
            this.f23392q = i12;
            this.f23393x = size() - i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ub.a, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ub.a, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        hc.t.e(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) Arrays.copyOf(tArr, size());
            hc.t.d(tArr, "copyOf(this, newSize)");
        }
        int size = size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.f23392q; i11 < size && i12 < this.f23391d; i12++) {
            tArr[i11] = this.f23390c[i12];
            i11++;
        }
        while (i11 < size) {
            tArr[i11] = this.f23390c[i10];
            i11++;
            i10++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        hc.t.c(tArr, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.RingBuffer.toArray>");
        return tArr;
    }
}
