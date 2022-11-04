package ub;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH$J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\bH\u0004¨\u0006\u0010"}, d2 = {"Lub/b;", "T", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "f", "hasNext", "next", "()Ljava/lang/Object;", "Ltb/e0;", "b", "value", "e", "(Ljava/lang/Object;)V", "d", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class b<T> implements Iterator<T>, ic.a, j$.util.Iterator {

    /* renamed from: c */
    private b1 f23350c = b1.NotReady;

    /* renamed from: d */
    private T f23351d;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23352a;

        static {
            int[] iArr = new int[b1.values().length];
            iArr[b1.Done.ordinal()] = 1;
            iArr[b1.Ready.ordinal()] = 2;
            f23352a = iArr;
        }
    }

    private final boolean f() {
        this.f23350c = b1.Failed;
        b();
        return this.f23350c == b1.Ready;
    }

    protected abstract void b();

    public final void d() {
        this.f23350c = b1.Done;
    }

    public final void e(T t10) {
        this.f23351d = t10;
        this.f23350c = b1.Ready;
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public boolean hasNext() {
        b1 b1Var = this.f23350c;
        if (b1Var != b1.Failed) {
            int i10 = a.f23352a[b1Var.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
            return f();
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public T next() {
        if (hasNext()) {
            this.f23350c = b1.NotReady;
            return this.f23351d;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
