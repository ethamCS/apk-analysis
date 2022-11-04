package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.u0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u0001:\u000212B\u0007¢\u0006\u0004\b0\u0010\"J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\u00060\u0000j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0000j\u0002`\u0005H\u0082\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u0015\u0010\fJ'\u0010\u0016\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0001¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0001¢\u0006\u0004\b#\u0010\"J\u0015\u0010$\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b$\u0010 J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001eR\u0011\u0010\t\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0015\u0010-\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\b,\u0010 R\u0015\u0010/\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\b.\u0010 ¨\u00063"}, d2 = {"Lkotlinx/coroutines/internal/o;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/internal/x;", "E", "()Lkotlinx/coroutines/internal/x;", "Lkotlinx/coroutines/internal/Node;", "current", "q", "(Lkotlinx/coroutines/internal/o;)Lkotlinx/coroutines/internal/o;", "next", "Ltb/e0;", "t", "(Lkotlinx/coroutines/internal/o;)V", "Lkotlinx/coroutines/internal/w;", "op", "p", "(Lkotlinx/coroutines/internal/w;)Lkotlinx/coroutines/internal/o;", "node", BuildConfig.FLAVOR, "o", "(Lkotlinx/coroutines/internal/o;)Z", "l", "m", "(Lkotlinx/coroutines/internal/o;Lkotlinx/coroutines/internal/o;)Z", "Lkotlinx/coroutines/internal/o$a;", "condAdd", BuildConfig.FLAVOR, "F", "(Lkotlinx/coroutines/internal/o;Lkotlinx/coroutines/internal/o;Lkotlinx/coroutines/internal/o$a;)I", "B", "()Z", "D", "()Lkotlinx/coroutines/internal/o;", "y", "()V", "z", "C", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "A", "isRemoved", "v", "()Ljava/lang/Object;", "w", "nextNode", "x", "prevNode", "<init>", "a", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class o {

    /* renamed from: c */
    static final /* synthetic */ AtomicReferenceFieldUpdater f15442c = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_next");

    /* renamed from: d */
    static final /* synthetic */ AtomicReferenceFieldUpdater f15443d = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_prev");

    /* renamed from: q */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f15444q = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u0018\u0010\u000b\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/internal/o$a;", "Lkotlinx/coroutines/internal/c;", "Lkotlinx/coroutines/internal/o;", "Lkotlinx/coroutines/internal/Node;", "affected", BuildConfig.FLAVOR, "failure", "Ltb/e0;", "h", "b", "Lkotlinx/coroutines/internal/o;", "newNode", "c", "oldNext", "<init>", "(Lkotlinx/coroutines/internal/o;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static abstract class a extends kotlinx.coroutines.internal.c<o> {

        /* renamed from: b */
        public final o f15445b;

        /* renamed from: c */
        public o f15446c;

        public a(o oVar) {
            this.f15445b = oVar;
        }

        /* renamed from: h */
        public void d(o oVar, Object obj) {
            boolean z10 = obj == null;
            o oVar2 = z10 ? this.f15445b : this.f15446c;
            if (oVar2 == null || !androidx.concurrent.futures.b.a(o.f15442c, oVar, this, oVar2) || !z10) {
                return;
            }
            o oVar3 = this.f15445b;
            o oVar4 = this.f15446c;
            hc.t.b(oVar4);
            oVar3.t(oVar4);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/internal/o$b;", "Lkotlinx/coroutines/internal/w;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b extends w {
    }

    private final x E() {
        x xVar = (x) this._removedRef;
        if (xVar == null) {
            x xVar2 = new x(this);
            f15444q.lazySet(this, xVar2);
            return xVar2;
        }
        return xVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
        if (androidx.concurrent.futures.b.a(kotlinx.coroutines.internal.o.f15442c, r3, r2, ((kotlinx.coroutines.internal.x) r4).f15465a) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlinx.coroutines.internal.o p(kotlinx.coroutines.internal.w r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.o r0 = (kotlinx.coroutines.internal.o) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.o.f15443d
            boolean r0 = androidx.concurrent.futures.b.a(r1, r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.A()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.w
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            kotlinx.coroutines.internal.w r0 = (kotlinx.coroutines.internal.w) r0
            boolean r0 = r8.b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            kotlinx.coroutines.internal.w r4 = (kotlinx.coroutines.internal.w) r4
            r4.c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.x
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.o.f15442c
            kotlinx.coroutines.internal.x r4 = (kotlinx.coroutines.internal.x) r4
            kotlinx.coroutines.internal.o r4 = r4.f15465a
            boolean r2 = androidx.concurrent.futures.b.a(r5, r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.o r2 = (kotlinx.coroutines.internal.o) r2
            goto L7
        L52:
            r3 = r4
            kotlinx.coroutines.internal.o r3 = (kotlinx.coroutines.internal.o) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.o.p(kotlinx.coroutines.internal.w):kotlinx.coroutines.internal.o");
    }

    private final o q(o oVar) {
        while (oVar.A()) {
            oVar = (o) oVar._prev;
        }
        return oVar;
    }

    public final void t(o oVar) {
        o oVar2;
        do {
            oVar2 = (o) oVar._prev;
            if (v() != oVar) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f15443d, oVar, oVar2, this));
        if (A()) {
            oVar.p(null);
        }
    }

    public boolean A() {
        return v() instanceof x;
    }

    public boolean B() {
        return D() == null;
    }

    public final o C() {
        while (true) {
            o oVar = (o) v();
            if (oVar == this) {
                return null;
            }
            if (oVar.B()) {
                return oVar;
            }
            oVar.y();
        }
    }

    public final o D() {
        Object v10;
        o oVar;
        do {
            v10 = v();
            if (v10 instanceof x) {
                return ((x) v10).f15465a;
            }
            if (v10 == this) {
                return (o) v10;
            }
            oVar = (o) v10;
        } while (!androidx.concurrent.futures.b.a(f15442c, this, v10, oVar.E()));
        oVar.p(null);
        return null;
    }

    public final int F(o oVar, o oVar2, a aVar) {
        f15443d.lazySet(oVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15442c;
        atomicReferenceFieldUpdater.lazySet(oVar, oVar2);
        aVar.f15446c = oVar2;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, oVar2, aVar)) {
            return 0;
        }
        return aVar.c(this) == null ? 1 : 2;
    }

    public final void l(o oVar) {
        do {
        } while (!x().m(oVar, this));
    }

    public final boolean m(o oVar, o oVar2) {
        f15443d.lazySet(oVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15442c;
        atomicReferenceFieldUpdater.lazySet(oVar, oVar2);
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, oVar2, oVar)) {
            return false;
        }
        oVar.t(oVar2);
        return true;
    }

    public final boolean o(o oVar) {
        f15443d.lazySet(oVar, this);
        f15442c.lazySet(oVar, this);
        while (v() == this) {
            if (androidx.concurrent.futures.b.a(f15442c, this, this, oVar)) {
                oVar.t(this);
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return new hc.c0(this) { // from class: kotlinx.coroutines.internal.o.c
            @Override // oc.l
            public Object get() {
                return u0.a(this.f11756d);
            }
        } + '@' + u0.b(this);
    }

    public final Object v() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof w)) {
                return obj;
            }
            ((w) obj).c(this);
        }
    }

    public final o w() {
        return n.b(v());
    }

    public final o x() {
        o p10 = p(null);
        return p10 == null ? q((o) this._prev) : p10;
    }

    public final void y() {
        ((x) v()).f15465a.z();
    }

    public final void z() {
        o oVar = this;
        while (true) {
            Object v10 = oVar.v();
            if (!(v10 instanceof x)) {
                oVar.p(null);
                return;
            }
            oVar = ((x) v10).f15465a;
        }
    }
}
