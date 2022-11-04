package jb;

import gc.q;
import hc.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.s;
import ub.c0;
import ub.u;
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00020\u0006BV\u0012\u0006\u0010\u001b\u001a\u00028\u0000\u0012\u0006\u0010\u001d\u001a\u00028\u0001\u0012:\u0010)\u001a6\u00122\u00120\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010(0'ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J \u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\fH\u0002J\u0016\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0002J\u0013\u0010\u0016\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001d\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R$\u0010\u0018\u001a\u00028\u00002\u0006\u0010%\u001a\u00028\u00008\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b&\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Ljb/n;", BuildConfig.FLAVOR, "TSubject", "TContext", "Ljb/e;", "Ljb/g;", "Lkotlinx/coroutines/q0;", BuildConfig.FLAVOR, "direct", "n", "Ltb/s;", "result", "Ltb/e0;", "o", "(Ljava/lang/Object;)V", "l", "Lxb/d;", "continuation", "j", "rootContinuation", BuildConfig.FLAVOR, "p", "f0", "(Lxb/d;)Ljava/lang/Object;", "subject", "O0", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;", "initial", "a", "context", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Lxb/g;", "h", "()Lxb/g;", "coroutineContext", "<set-?>", "m", BuildConfig.FLAVOR, "Lkotlin/Function3;", "blocks", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class n<TSubject, TContext> implements e<TSubject, TContext>, g<TSubject>, q0 {
    private Object U3;
    private int V3;

    /* renamed from: c */
    private final TContext f14278c;

    /* renamed from: d */
    private final List<q<e<TSubject, TContext>, TSubject, xb.d<? super e0>, Object>> f14279d;

    /* renamed from: q */
    private int f14280q = -1;

    /* renamed from: x */
    private final xb.d<e0> f14281x = new a(this);

    /* renamed from: y */
    private TSubject f14282y;

    @Metadata(bv = {}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\u0002J \u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0006H\u0002J \u0010\u000b\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"jb/n$a", "Lxb/d;", "Ltb/e0;", "Lzb/e;", "Lio/ktor/util/CoroutineStackFrame;", "a", BuildConfig.FLAVOR, "list", "c", "Ltb/s;", "result", "y", "(Ljava/lang/Object;)V", "x", "()Lzb/e;", "callerFrame", "Lxb/g;", "b", "()Lxb/g;", "getContext$annotations", "()V", "context", "ktor-utils"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a implements xb.d<e0>, zb.e {

        /* renamed from: c */
        final /* synthetic */ n<TSubject, TContext> f14283c;

        a(n<TSubject, TContext> nVar) {
            this.f14283c = nVar;
        }

        private final xb.d<?> a() {
            Object obj;
            n<TSubject, TContext> nVar;
            if (((n) this.f14283c).f14280q >= 0 && (obj = ((n) this.f14283c).U3) != null) {
                if (!(obj instanceof xb.d)) {
                    if (!(obj instanceof ArrayList)) {
                        return null;
                    }
                    return ((ArrayList) obj).isEmpty() ? m.f14277c : c((List) obj);
                }
                ((n) nVar).f14280q--;
                int unused = ((n) this.f14283c).f14280q;
                return (xb.d) obj;
            }
            return null;
        }

        private final xb.d<?> c(List<? extends xb.d<?>> list) {
            Object Y;
            try {
                int i10 = ((n) this.f14283c).f14280q;
                Y = c0.Y(list, i10);
                xb.d<?> dVar = (xb.d) Y;
                if (dVar == null) {
                    return m.f14277c;
                }
                ((n) this.f14283c).f14280q = i10 - 1;
                return dVar;
            } catch (Throwable unused) {
                return m.f14277c;
            }
        }

        @Override // xb.d
        public xb.g b() {
            Object obj = ((n) this.f14283c).U3;
            if (obj != null) {
                if (!(obj instanceof xb.d)) {
                    if (!(obj instanceof List)) {
                        throw new IllegalStateException("Unexpected rootContinuation value");
                    }
                    obj = c0.g0((List) obj);
                }
                return ((xb.d) obj).b();
            }
            throw new IllegalStateException("Not started");
        }

        @Override // zb.e
        public zb.e x() {
            xb.d<?> a10 = a();
            if (a10 instanceof zb.e) {
                return (zb.e) a10;
            }
            return null;
        }

        @Override // xb.d
        public void y(Object obj) {
            if (!s.i(obj)) {
                this.f14283c.n(false);
                return;
            }
            n<TSubject, TContext> nVar = this.f14283c;
            s.a aVar = s.Companion;
            Throwable g10 = s.g(obj);
            t.b(g10);
            nVar.o(s.c(tb.t.a(g10)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(TSubject tsubject, TContext tcontext, List<? extends q<? super e<TSubject, TContext>, ? super TSubject, ? super xb.d<? super e0>, ? extends Object>> list) {
        t.e(tsubject, "initial");
        t.e(tcontext, "context");
        t.e(list, "blocks");
        this.f14278c = tcontext;
        this.f14279d = list;
        this.f14282y = tsubject;
        io.ktor.utils.io.s.b(this);
    }

    private final void j(xb.d<? super TSubject> dVar) {
        int j10;
        Object obj = this.U3;
        if (obj == null) {
            this.f14280q = 0;
            this.U3 = dVar;
        } else if (obj instanceof xb.d) {
            ArrayList arrayList = new ArrayList(this.f14279d.size());
            arrayList.add(obj);
            arrayList.add(dVar);
            this.f14280q = 1;
            this.U3 = arrayList;
        } else if (!(obj instanceof ArrayList)) {
            p(obj);
            throw new tb.i();
        } else {
            ((ArrayList) obj).add(dVar);
            j10 = u.j((List) obj);
            this.f14280q = j10;
        }
    }

    private final void l() {
        int j10;
        int j11;
        Object obj = this.U3;
        if (obj != null) {
            if (obj instanceof xb.d) {
                this.f14280q = -1;
                this.U3 = null;
                return;
            } else if (!(obj instanceof ArrayList)) {
                p(obj);
                throw new tb.i();
            } else {
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException("No more continuations to resume");
                }
                List list = (List) obj;
                j10 = u.j(list);
                arrayList.remove(j10);
                j11 = u.j(list);
                this.f14280q = j11;
                return;
            }
        }
        throw new IllegalStateException("No more continuations to resume");
    }

    public final boolean n(boolean z10) {
        Object m10;
        Object s10;
        Object c10;
        do {
            int i10 = this.V3;
            if (i10 != this.f14279d.size()) {
                this.V3 = i10 + 1;
                q<e<TSubject, TContext>, TSubject, xb.d<? super e0>, Object> qVar = this.f14279d.get(i10);
                try {
                    s10 = ((q) hc.q0.d(qVar, 3)).s(this, m(), this.f14281x);
                    c10 = yb.d.c();
                } catch (Throwable th2) {
                    s.a aVar = s.Companion;
                    m10 = tb.t.a(th2);
                }
            } else if (z10) {
                return true;
            } else {
                s.a aVar2 = s.Companion;
                m10 = m();
            }
            o(s.c(m10));
            return false;
        } while (s10 != c10);
        return false;
    }

    public final void o(Object obj) {
        int j10;
        int j11;
        Object obj2 = this.U3;
        if (obj2 != null) {
            if (obj2 instanceof xb.d) {
                this.U3 = null;
                this.f14280q = -1;
            } else if (!(obj2 instanceof ArrayList)) {
                p(obj2);
                throw new tb.i();
            } else {
                ArrayList arrayList = (ArrayList) obj2;
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException("No more continuations to resume");
                }
                List list = (List) obj2;
                j10 = u.j(list);
                this.f14280q = j10 - 1;
                j11 = u.j(list);
                obj2 = arrayList.remove(j11);
            }
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.Continuation<TSubject of io.ktor.util.pipeline.SuspendFunctionGun>");
            xb.d dVar = (xb.d) obj2;
            if (s.i(obj)) {
                Throwable g10 = s.g(obj);
                t.b(g10);
                Throwable a10 = k.a(g10, dVar);
                s.a aVar = s.Companion;
                obj = s.c(tb.t.a(a10));
            }
            dVar.y(obj);
            return;
        }
        throw new IllegalStateException("No more continuations to resume");
    }

    private final Void p(Object obj) {
        throw new IllegalStateException(t.l("Unexpected rootContinuation content: ", obj));
    }

    @Override // jb.e
    public Object O0(TSubject tsubject, xb.d<? super TSubject> dVar) {
        this.f14282y = tsubject;
        return f0(dVar);
    }

    @Override // jb.g
    public Object a(TSubject tsubject, xb.d<? super TSubject> dVar) {
        this.V3 = 0;
        if (this.f14279d.size() == 0) {
            return tsubject;
        }
        this.f14282y = tsubject;
        if (this.U3 != null) {
            throw new IllegalStateException("Already started");
        }
        return f0(dVar);
    }

    @Override // jb.e
    public TContext b() {
        return this.f14278c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    @Override // jb.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f0(xb.d<? super TSubject> r3) {
        /*
            r2 = this;
            int r0 = r2.V3
            java.util.List<gc.q<jb.e<TSubject, TContext>, TSubject, xb.d<? super tb.e0>, java.lang.Object>> r1 = r2.f14279d
            int r1 = r1.size()
            if (r0 != r1) goto Lf
        La:
            java.lang.Object r0 = r2.m()
            goto L21
        Lf:
            r2.j(r3)
            r0 = 1
            boolean r0 = r2.n(r0)
            if (r0 == 0) goto L1d
            r2.l()
            goto La
        L1d:
            java.lang.Object r0 = yb.b.c()
        L21:
            java.lang.Object r1 = yb.b.c()
            if (r0 != r1) goto L2a
            zb.h.c(r3)
        L2a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.n.f0(xb.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.q0
    public xb.g h() {
        return this.f14281x.b();
    }

    public TSubject m() {
        return this.f14282y;
    }
}
