package xb;

import hc.t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import tb.s;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\nB!\b\u0000\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0016\u0010\u0017B\u0017\b\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0016\u0010\u0018J \u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0001J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lxb/i;", "T", "Lxb/d;", "Lzb/e;", "Ltb/s;", "result", "Ltb/e0;", "y", "(Ljava/lang/Object;)V", BuildConfig.FLAVOR, "a", BuildConfig.FLAVOR, "toString", "Lxb/g;", "b", "()Lxb/g;", "context", "x", "()Lzb/e;", "callerFrame", "delegate", "initialResult", "<init>", "(Lxb/d;Ljava/lang/Object;)V", "(Lxb/d;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class i<T> implements d<T>, zb.e {
    private static final a Companion = new a(null);
    @Deprecated

    /* renamed from: d */
    private static final AtomicReferenceFieldUpdater<i<?>, Object> f25517d = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "result");

    /* renamed from: c */
    private final d<T> f25518c;
    private volatile Object result;

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bRj\u0010\u0005\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lxb/i$a;", BuildConfig.FLAVOR, "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lxb/i;", "kotlin.jvm.PlatformType", "RESULT", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "getRESULT$annotations", "()V", "<init>", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(d<? super T> dVar) {
        this(dVar, yb.a.UNDECIDED);
        t.e(dVar, "delegate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(d<? super T> dVar, Object obj) {
        t.e(dVar, "delegate");
        this.f25518c = dVar;
        this.result = obj;
    }

    public final Object a() {
        Object c10;
        Object c11;
        Object c12;
        Object obj = this.result;
        yb.a aVar = yb.a.UNDECIDED;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater<i<?>, Object> atomicReferenceFieldUpdater = f25517d;
            c11 = yb.d.c();
            if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, aVar, c11)) {
                c12 = yb.d.c();
                return c12;
            }
            obj = this.result;
        }
        if (obj == yb.a.RESUMED) {
            c10 = yb.d.c();
            return c10;
        } else if (obj instanceof s.b) {
            throw ((s.b) obj).f22170c;
        } else {
            return obj;
        }
    }

    @Override // xb.d
    public g b() {
        return this.f25518c.b();
    }

    public String toString() {
        return "SafeContinuation for " + this.f25518c;
    }

    @Override // zb.e
    public zb.e x() {
        d<T> dVar = this.f25518c;
        if (dVar instanceof zb.e) {
            return (zb.e) dVar;
        }
        return null;
    }

    @Override // xb.d
    public void y(Object obj) {
        Object c10;
        Object c11;
        while (true) {
            Object obj2 = this.result;
            yb.a aVar = yb.a.UNDECIDED;
            if (obj2 != aVar) {
                c10 = yb.d.c();
                if (obj2 != c10) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater<i<?>, Object> atomicReferenceFieldUpdater = f25517d;
                c11 = yb.d.c();
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, c11, yb.a.RESUMED)) {
                    this.f25518c.y(obj);
                    return;
                }
            } else if (androidx.concurrent.futures.b.a(f25517d, this, aVar, obj)) {
                return;
            }
        }
    }
}
