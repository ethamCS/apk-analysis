package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.s;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\b\u0004B\u001d\u0012\u0014\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/e;", "T", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "(Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/x0;", "a", "[Lkotlinx/coroutines/x0;", "deferreds", "<init>", "([Lkotlinx/coroutines/x0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e<T> {

    /* renamed from: b */
    static final /* synthetic */ AtomicIntegerFieldUpdater f15329b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount");

    /* renamed from: a */
    private final x0<T>[] f15330a;
    volatile /* synthetic */ int notCompletedCount;

    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R<\u0010\u001b\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0016\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/e$a;", "Lkotlinx/coroutines/h2;", BuildConfig.FLAVOR, "cause", "Ltb/e0;", "G", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/p;", BuildConfig.FLAVOR, "y", "Lkotlinx/coroutines/p;", "continuation", "Lkotlinx/coroutines/h1;", "U3", "Lkotlinx/coroutines/h1;", "K", "()Lkotlinx/coroutines/h1;", "N", "(Lkotlinx/coroutines/h1;)V", "handle", "Lkotlinx/coroutines/e$b;", "Lkotlinx/coroutines/e;", "value", "J", "()Lkotlinx/coroutines/e$b;", "L", "(Lkotlinx/coroutines/e$b;)V", "disposer", "<init>", "(Lkotlinx/coroutines/e;Lkotlinx/coroutines/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class a extends h2 {
        public h1 U3;
        private volatile /* synthetic */ Object _disposer = null;

        /* renamed from: y */
        private final p<List<? extends T>> f15331y;

        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super List<? extends T>> pVar) {
            e.this = r1;
            this.f15331y = pVar;
        }

        @Override // kotlinx.coroutines.f0
        public void G(Throwable th2) {
            if (th2 != null) {
                Object b02 = this.f15331y.b0(th2);
                if (b02 == null) {
                    return;
                }
                this.f15331y.c0(b02);
                e<T>.b J = J();
                if (J == null) {
                    return;
                }
                J.b();
                return;
            }
            if (e.f15329b.decrementAndGet(e.this) != 0) {
                return;
            }
            p<List<? extends T>> pVar = this.f15331y;
            x0[] x0VarArr = ((e) e.this).f15330a;
            ArrayList arrayList = new ArrayList(x0VarArr.length);
            for (x0 x0Var : x0VarArr) {
                arrayList.add(x0Var.z());
            }
            s.a aVar = tb.s.Companion;
            pVar.y(tb.s.c(arrayList));
        }

        public final e<T>.b J() {
            return (b) this._disposer;
        }

        public final h1 K() {
            h1 h1Var = this.U3;
            if (h1Var != null) {
                return h1Var;
            }
            hc.t.s("handle");
            return null;
        }

        public final void L(e<T>.b bVar) {
            this._disposer = bVar;
        }

        public final void N(h1 h1Var) {
            this.U3 = h1Var;
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(Throwable th2) {
            G(th2);
            return tb.e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R$\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/e$b;", "Lkotlinx/coroutines/n;", "Ltb/e0;", "b", BuildConfig.FLAVOR, "cause", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "Lkotlinx/coroutines/e$a;", "Lkotlinx/coroutines/e;", "c", "[Lkotlinx/coroutines/e$a;", "nodes", "<init>", "(Lkotlinx/coroutines/e;[Lkotlinx/coroutines/e$a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class b extends n {

        /* renamed from: c */
        private final e<T>.a[] f15332c;

        public b(e<T>.a[] aVarArr) {
            e.this = r1;
            this.f15332c = aVarArr;
        }

        @Override // kotlinx.coroutines.o
        public void a(Throwable th2) {
            b();
        }

        public final void b() {
            for (e<T>.a aVar : this.f15332c) {
                aVar.K().g();
            }
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(Throwable th2) {
            a(th2);
            return tb.e0.f22152a;
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f15332c + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(x0<? extends T>[] x0VarArr) {
        this.f15330a = x0VarArr;
        this.notCompletedCount = x0VarArr.length;
    }

    public final Object b(xb.d<? super List<? extends T>> dVar) {
        xb.d b10;
        Object c10;
        b10 = yb.c.b(dVar);
        q qVar = new q(b10, 1);
        qVar.z();
        int length = this.f15330a.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            x0 x0Var = this.f15330a[i10];
            x0Var.start();
            a aVar = new a(qVar);
            aVar.N(x0Var.D0(aVar));
            tb.e0 e0Var = tb.e0.f22152a;
            aVarArr[i10] = aVar;
        }
        e<T>.b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].L(bVar);
        }
        if (qVar.p()) {
            bVar.b();
        } else {
            qVar.N(bVar);
        }
        Object s10 = qVar.s();
        c10 = yb.d.c();
        if (s10 == c10) {
            zb.h.c(dVar);
        }
        return s10;
    }
}
