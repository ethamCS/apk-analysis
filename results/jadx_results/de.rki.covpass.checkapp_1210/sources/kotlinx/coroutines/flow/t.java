package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.h1;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.s;
@Metadata(bv = {}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010 \n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u00012B\u001f\u0012\u0006\u0010H\u001a\u00020\u0014\u0012\u0006\u0010J\u001a\u00020\u0014\u0012\u0006\u0010C\u001a\u00020B¢\u0006\u0004\be\u0010fJ\u0017\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\tJ\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\tJ\b\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0002J9\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00122\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J(\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH\u0002J\b\u0010#\u001a\u00020\u000bH\u0002J\u0012\u0010%\u001a\u0004\u0018\u00010\u00052\u0006\u0010$\u001a\u00020\u0003H\u0002J\u0010\u0010&\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0003H\u0002J\u0012\u0010(\u001a\u0004\u0018\u00010\u00052\u0006\u0010'\u001a\u00020\rH\u0002J\u001b\u0010)\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J3\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010+0\u00122\u0014\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010+0\u0012H\u0002¢\u0006\u0004\b-\u0010.J!\u00102\u001a\u0002012\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0096@ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b4\u0010\tJ\u001b\u00105\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b5\u0010\u001aJ\u000f\u00106\u001a\u00020\rH\u0000¢\u0006\u0004\b6\u00107J%\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010+0\u00122\u0006\u00108\u001a\u00020\rH\u0000¢\u0006\u0004\b9\u0010:J\b\u0010;\u001a\u00020\u0003H\u0014J\u001f\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00122\u0006\u0010<\u001a\u00020\u0014H\u0014¢\u0006\u0004\b=\u0010>J&\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000D2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u00142\u0006\u0010C\u001a\u00020BH\u0016R\u0014\u0010H\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010GR \u0010M\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010\u0019R\u0016\u0010Q\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010\u0019R\u0016\u0010S\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010GR\u0016\u0010U\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010GR\u0014\u0010W\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u00107R\u0014\u0010Z\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010YR\u0014\u0010^\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u00107R\u0014\u0010`\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u00107R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00028\u00000a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006g"}, d2 = {"Lkotlinx/coroutines/flow/t;", "T", "Lef/a;", "Lkotlinx/coroutines/flow/v;", "Lkotlinx/coroutines/flow/o;", BuildConfig.FLAVOR, "Lef/i;", "value", BuildConfig.FLAVOR, "(Ljava/lang/Object;)Z", "U", "Ltb/e0;", "H", BuildConfig.FLAVOR, "newHead", "E", "item", "K", BuildConfig.FLAVOR, "curBuffer", BuildConfig.FLAVOR, "curSize", "newSize", "S", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "J", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/t$a;", "emitter", "B", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "X", "C", "slot", "W", "V", "index", "O", "A", "(Lkotlinx/coroutines/flow/v;Lxb/d;)Ljava/lang/Object;", "Lxb/d;", "resumesIn", "L", "([Lxb/d;)[Lxb/d;", "Lkotlinx/coroutines/flow/e;", "collector", BuildConfig.FLAVOR, "a", "(Lkotlinx/coroutines/flow/e;Lxb/d;)Ljava/lang/Object;", "e", "c", "Z", "()J", "oldIndex", "Y", "(J)[Lxb/d;", "F", "size", "G", "(I)[Lkotlinx/coroutines/flow/v;", "Lxb/g;", "context", "capacity", "Ldf/h;", "onBufferOverflow", "Lkotlinx/coroutines/flow/d;", "g", "x", "I", "replay", "y", "bufferCapacity", "V3", "[Ljava/lang/Object;", "buffer", "W3", "replayIndex", "X3", "minCollectorIndex", "Y3", "bufferSize", "Z3", "queueSize", "N", "head", "Q", "()I", "replaySize", "R", "totalSize", "M", "bufferEndIndex", "P", "queueEndIndex", BuildConfig.FLAVOR, "b", "()Ljava/util/List;", "replayCache", "<init>", "(IILdf/h;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class t<T> extends ef.a<v> implements o<T>, d, ef.i<T> {
    private final df.h U3;
    private Object[] V3;
    private long W3;
    private long X3;
    private int Y3;
    private int Z3;

    /* renamed from: x */
    private final int f15372x;

    /* renamed from: y */
    private final int f15373y;

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/flow/t$a;", "Lkotlinx/coroutines/h1;", "Ltb/e0;", "g", "Lkotlinx/coroutines/flow/t;", "c", "Lkotlinx/coroutines/flow/t;", "flow", BuildConfig.FLAVOR, "d", "J", "index", BuildConfig.FLAVOR, "q", "Ljava/lang/Object;", "value", "Lxb/d;", "cont", "<init>", "(Lkotlinx/coroutines/flow/t;JLjava/lang/Object;Lxb/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a implements h1 {

        /* renamed from: c */
        public final t<?> f15374c;

        /* renamed from: d */
        public long f15375d;

        /* renamed from: q */
        public final Object f15376q;

        /* renamed from: x */
        public final xb.d<e0> f15377x;

        /* JADX WARN: Multi-variable type inference failed */
        public a(t<?> tVar, long j10, Object obj, xb.d<? super e0> dVar) {
            this.f15374c = tVar;
            this.f15375d = j10;
            this.f15376q = obj;
            this.f15377x = dVar;
        }

        @Override // kotlinx.coroutines.h1
        public void g() {
            this.f15374c.B(this);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15378a;

        static {
            int[] iArr = new int[df.h.values().length];
            iArr[df.h.SUSPEND.ordinal()] = 1;
            iArr[df.h.DROP_LATEST.ordinal()] = 2;
            iArr[df.h.DROP_OLDEST.ordinal()] = 3;
            f15378a = iArr;
        }
    }

    @zb.f(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {373, 380, 383}, m = "collect$suspendImpl")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends zb.d {
        Object U3;
        Object V3;
        /* synthetic */ Object W3;
        final /* synthetic */ t<T> X3;
        int Y3;

        /* renamed from: x */
        Object f15379x;

        /* renamed from: y */
        Object f15380y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(t<T> tVar, xb.d<? super c> dVar) {
            super(dVar);
            this.X3 = tVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.W3 = obj;
            this.Y3 |= Integer.MIN_VALUE;
            return t.D(this.X3, null, this);
        }
    }

    public t(int i10, int i11, df.h hVar) {
        this.f15372x = i10;
        this.f15373y = i11;
        this.U3 = hVar;
    }

    private final Object A(v vVar, xb.d<? super e0> dVar) {
        xb.d b10;
        e0 e0Var;
        Object c10;
        Object c11;
        b10 = yb.c.b(dVar);
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(b10, 1);
        qVar.z();
        synchronized (this) {
            if (V(vVar) < 0) {
                vVar.f15383b = qVar;
            } else {
                s.a aVar = tb.s.Companion;
                qVar.y(tb.s.c(e0.f22152a));
            }
            e0Var = e0.f22152a;
        }
        Object s10 = qVar.s();
        c10 = yb.d.c();
        if (s10 == c10) {
            zb.h.c(dVar);
        }
        c11 = yb.d.c();
        return s10 == c11 ? s10 : e0Var;
    }

    public final void B(a aVar) {
        Object f10;
        synchronized (this) {
            if (aVar.f15375d < N()) {
                return;
            }
            Object[] objArr = this.V3;
            hc.t.b(objArr);
            f10 = u.f(objArr, aVar.f15375d);
            if (f10 != aVar) {
                return;
            }
            u.g(objArr, aVar.f15375d, u.f15381a);
            C();
            e0 e0Var = e0.f22152a;
        }
    }

    private final void C() {
        Object f10;
        if (this.f15373y != 0 || this.Z3 > 1) {
            Object[] objArr = this.V3;
            hc.t.b(objArr);
            while (this.Z3 > 0) {
                f10 = u.f(objArr, (N() + R()) - 1);
                if (f10 != u.f15381a) {
                    return;
                }
                this.Z3--;
                u.g(objArr, N() + R(), null);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:2|(2:4|(7:6|8|(3:(6:(1:(1:13)(2:14|15))(1:16)|55|17|18|64|(3:33|(3:59|35|(2:57|37)(1:62))(4:58|(1:39)|40|(2:60|42)(1:63))|61))(4:20|49|21|22)|47|48)(5:25|53|26|(2:28|(1:30))|31)|51|32|64|(3:33|(0)(0)|61)))|7|8|(0)(0)|51|32|64|(3:33|(0)(0)|61)) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d3, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object D(kotlinx.coroutines.flow.t r8, kotlinx.coroutines.flow.e r9, xb.d r10) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.D(kotlinx.coroutines.flow.t, kotlinx.coroutines.flow.e, xb.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = ((ef.a) r8).f9555c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void E(long r9) {
        /*
            r8 = this;
            int r0 = ef.a.i(r8)
            if (r0 == 0) goto L27
            ef.c[] r0 = ef.a.j(r8)
            if (r0 == 0) goto L27
            r1 = 0
            int r2 = r0.length
        Le:
            if (r1 >= r2) goto L27
            r3 = r0[r1]
            if (r3 == 0) goto L24
            kotlinx.coroutines.flow.v r3 = (kotlinx.coroutines.flow.v) r3
            long r4 = r3.f15382a
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L24
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 >= 0) goto L24
            r3.f15382a = r9
        L24:
            int r1 = r1 + 1
            goto Le
        L27:
            r8.X3 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.E(long):void");
    }

    private final void H() {
        Object[] objArr = this.V3;
        hc.t.b(objArr);
        u.g(objArr, N(), null);
        this.Y3--;
        long N = N() + 1;
        if (this.W3 < N) {
            this.W3 = N;
        }
        if (this.X3 < N) {
            E(N);
        }
    }

    static /* synthetic */ Object I(t tVar, Object obj, xb.d dVar) {
        Object c10;
        if (tVar.e(obj)) {
            return e0.f22152a;
        }
        Object J = tVar.J(obj, dVar);
        c10 = yb.d.c();
        return J == c10 ? J : e0.f22152a;
    }

    private final Object J(T t10, xb.d<? super e0> dVar) {
        xb.d b10;
        xb.d<e0>[] dVarArr;
        a aVar;
        Object c10;
        Object c11;
        b10 = yb.c.b(dVar);
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(b10, 1);
        qVar.z();
        xb.d<e0>[] dVarArr2 = ef.b.f9558a;
        synchronized (this) {
            if (T(t10)) {
                s.a aVar2 = tb.s.Companion;
                qVar.y(tb.s.c(e0.f22152a));
                dVarArr = L(dVarArr2);
                aVar = null;
            } else {
                a aVar3 = new a(this, R() + N(), t10, qVar);
                K(aVar3);
                this.Z3++;
                if (this.f15373y == 0) {
                    dVarArr2 = L(dVarArr2);
                }
                dVarArr = dVarArr2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            kotlinx.coroutines.s.a(qVar, aVar);
        }
        for (xb.d<e0> dVar2 : dVarArr) {
            if (dVar2 != null) {
                s.a aVar4 = tb.s.Companion;
                dVar2.y(tb.s.c(e0.f22152a));
            }
        }
        Object s10 = qVar.s();
        c10 = yb.d.c();
        if (s10 == c10) {
            zb.h.c(dVar);
        }
        c11 = yb.d.c();
        return s10 == c11 ? s10 : e0.f22152a;
    }

    public final void K(Object obj) {
        int R = R();
        Object[] objArr = this.V3;
        if (objArr == null) {
            objArr = S(null, 0, 2);
        } else if (R >= objArr.length) {
            objArr = S(objArr, R, objArr.length * 2);
        }
        u.g(objArr, N() + R, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        r1 = ((ef.a) r10).f9555c;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final xb.d<tb.e0>[] L(xb.d<tb.e0>[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = ef.a.i(r10)
            if (r1 == 0) goto L47
            ef.c[] r1 = ef.a.j(r10)
            if (r1 == 0) goto L47
            r2 = 0
            int r3 = r1.length
        Lf:
            if (r2 >= r3) goto L47
            r4 = r1[r2]
            if (r4 == 0) goto L44
            kotlinx.coroutines.flow.v r4 = (kotlinx.coroutines.flow.v) r4
            xb.d<? super tb.e0> r5 = r4.f15383b
            if (r5 != 0) goto L1c
            goto L44
        L1c:
            long r6 = r10.V(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L44
            int r6 = r11.length
            if (r0 < r6) goto L39
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            hc.t.d(r11, r6)
        L39:
            r6 = r11
            xb.d[] r6 = (xb.d[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f15383b = r0
            r0 = r7
        L44:
            int r2 = r2 + 1
            goto Lf
        L47:
            xb.d[] r11 = (xb.d[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.L(xb.d[]):xb.d[]");
    }

    private final long M() {
        return N() + this.Y3;
    }

    public final long N() {
        return Math.min(this.X3, this.W3);
    }

    private final Object O(long j10) {
        Object f10;
        Object[] objArr = this.V3;
        hc.t.b(objArr);
        f10 = u.f(objArr, j10);
        return f10 instanceof a ? ((a) f10).f15376q : f10;
    }

    private final long P() {
        return N() + this.Y3 + this.Z3;
    }

    private final int Q() {
        return (int) ((N() + this.Y3) - this.W3);
    }

    public final int R() {
        return this.Y3 + this.Z3;
    }

    private final Object[] S(Object[] objArr, int i10, int i11) {
        Object f10;
        if (i11 > 0) {
            Object[] objArr2 = new Object[i11];
            this.V3 = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long N = N();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = i12 + N;
                f10 = u.f(objArr, j10);
                u.g(objArr2, j10, f10);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean T(T t10) {
        if (o() == 0) {
            return U(t10);
        }
        if (this.Y3 >= this.f15373y && this.X3 <= this.W3) {
            int i10 = b.f15378a[this.U3.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
        }
        K(t10);
        int i11 = this.Y3 + 1;
        this.Y3 = i11;
        if (i11 > this.f15373y) {
            H();
        }
        if (Q() > this.f15372x) {
            X(this.W3 + 1, this.X3, M(), P());
        }
        return true;
    }

    private final boolean U(T t10) {
        if (this.f15372x == 0) {
            return true;
        }
        K(t10);
        int i10 = this.Y3 + 1;
        this.Y3 = i10;
        if (i10 > this.f15372x) {
            H();
        }
        this.X3 = N() + this.Y3;
        return true;
    }

    public final long V(v vVar) {
        long j10 = vVar.f15382a;
        if (j10 < M()) {
            return j10;
        }
        if (this.f15373y > 0 || j10 > N() || this.Z3 == 0) {
            return -1L;
        }
        return j10;
    }

    private final Object W(v vVar) {
        Object obj;
        xb.d<e0>[] dVarArr = ef.b.f9558a;
        synchronized (this) {
            long V = V(vVar);
            if (V < 0) {
                obj = u.f15381a;
            } else {
                long j10 = vVar.f15382a;
                Object O = O(V);
                vVar.f15382a = V + 1;
                dVarArr = Y(j10);
                obj = O;
            }
        }
        for (xb.d<e0> dVar : dVarArr) {
            if (dVar != null) {
                s.a aVar = tb.s.Companion;
                dVar.y(tb.s.c(e0.f22152a));
            }
        }
        return obj;
    }

    private final void X(long j10, long j11, long j12, long j13) {
        long min = Math.min(j11, j10);
        for (long N = N(); N < min; N++) {
            Object[] objArr = this.V3;
            hc.t.b(objArr);
            u.g(objArr, N, null);
        }
        this.W3 = j10;
        this.X3 = j11;
        this.Y3 = (int) (j12 - min);
        this.Z3 = (int) (j13 - j12);
    }

    /* renamed from: F */
    public v l() {
        return new v();
    }

    /* renamed from: G */
    public v[] m(int i10) {
        return new v[i10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        r4 = ((ef.a) r21).f9555c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final xb.d<tb.e0>[] Y(long r22) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.Y(long):xb.d[]");
    }

    public final long Z() {
        long j10 = this.W3;
        if (j10 < this.X3) {
            this.X3 = j10;
        }
        return j10;
    }

    @Override // kotlinx.coroutines.flow.s, kotlinx.coroutines.flow.d
    public Object a(e<? super T> eVar, xb.d<?> dVar) {
        return D(this, eVar, dVar);
    }

    @Override // kotlinx.coroutines.flow.s
    public List<T> b() {
        Object f10;
        List<T> h10;
        synchronized (this) {
            int Q = Q();
            if (Q == 0) {
                h10 = ub.u.h();
                return h10;
            }
            ArrayList arrayList = new ArrayList(Q);
            Object[] objArr = this.V3;
            hc.t.b(objArr);
            for (int i10 = 0; i10 < Q; i10++) {
                f10 = u.f(objArr, this.W3 + i10);
                arrayList.add(f10);
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.o, kotlinx.coroutines.flow.e
    public Object c(T t10, xb.d<? super e0> dVar) {
        return I(this, t10, dVar);
    }

    @Override // kotlinx.coroutines.flow.o
    public boolean e(T t10) {
        int i10;
        boolean z10;
        xb.d<e0>[] dVarArr = ef.b.f9558a;
        synchronized (this) {
            if (T(t10)) {
                dVarArr = L(dVarArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (xb.d<e0> dVar : dVarArr) {
            if (dVar != null) {
                s.a aVar = tb.s.Companion;
                dVar.y(tb.s.c(e0.f22152a));
            }
        }
        return z10;
    }

    @Override // ef.i
    public d<T> g(xb.g gVar, int i10, df.h hVar) {
        return u.e(this, gVar, i10, hVar);
    }
}
