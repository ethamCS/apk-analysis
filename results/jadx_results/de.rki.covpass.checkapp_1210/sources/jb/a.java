package jb;

import gc.q;
import hc.t;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B^\u0012\u0006\u0010\u0010\u001a\u00028\u0001\u0012:\u0010\u001e\u001a6\u00122\u00120\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c0\u001b\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\u0006\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016J\u001b\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0007J\u001b\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\n\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u00008\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Ljb/a;", BuildConfig.FLAVOR, "TSubject", "TContext", "Ljb/e;", "Ljb/g;", "g", "(Lxb/d;)Ljava/lang/Object;", "Ltb/e0;", "d", "subject", "O0", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;", "f0", "initial", "a", "context", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Lxb/g;", "coroutineContext", "Lxb/g;", "h", "()Lxb/g;", "<set-?>", "f", BuildConfig.FLAVOR, "Lkotlin/Function3;", "Lxb/d;", "interceptors", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Lxb/g;)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a<TSubject, TContext> implements e<TSubject, TContext>, g<TSubject> {

    /* renamed from: c */
    private final TContext f14242c;

    /* renamed from: d */
    private final List<q<e<TSubject, TContext>, TSubject, xb.d<? super e0>, Object>> f14243d;

    /* renamed from: q */
    private final xb.g f14244q;

    /* renamed from: x */
    private TSubject f14245x;

    /* renamed from: y */
    private int f14246y;

    @zb.f(c = "io.ktor.util.pipeline.DebugPipelineContext", f = "DebugPipelineContext.kt", l = {82}, m = "proceedLoop")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: jb.a$a */
    /* loaded from: classes.dex */
    public static final class C0206a extends zb.d {
        final /* synthetic */ a<TSubject, TContext> U3;
        int V3;

        /* renamed from: x */
        Object f14247x;

        /* renamed from: y */
        /* synthetic */ Object f14248y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0206a(a<TSubject, TContext> aVar, xb.d<? super C0206a> dVar) {
            super(dVar);
            this.U3 = aVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f14248y = obj;
            this.V3 |= Integer.MIN_VALUE;
            return this.U3.g(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(TContext tcontext, List<? extends q<? super e<TSubject, TContext>, ? super TSubject, ? super xb.d<? super e0>, ? extends Object>> list, TSubject tsubject, xb.g gVar) {
        t.e(tcontext, "context");
        t.e(list, "interceptors");
        t.e(tsubject, "subject");
        t.e(gVar, "coroutineContext");
        this.f14242c = tcontext;
        this.f14243d = list;
        this.f14244q = gVar;
        this.f14245x = tsubject;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(xb.d<? super TSubject> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof jb.a.C0206a
            if (r0 == 0) goto L13
            r0 = r7
            jb.a$a r0 = (jb.a.C0206a) r0
            int r1 = r0.V3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.V3 = r1
            goto L18
        L13:
            jb.a$a r0 = new jb.a$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f14248y
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.V3
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.f14247x
            jb.a r2 = (jb.a) r2
            tb.t.b(r7)
            goto L39
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            tb.t.b(r7)
            r2 = r6
        L39:
            int r7 = r2.f14246y
            r4 = -1
            if (r7 != r4) goto L3f
            goto L4a
        L3f:
            java.util.List<gc.q<jb.e<TSubject, TContext>, TSubject, xb.d<? super tb.e0>, java.lang.Object>> r4 = r2.f14243d
            int r5 = r4.size()
            if (r7 < r5) goto L4f
            r2.d()
        L4a:
            java.lang.Object r7 = r2.f()
            return r7
        L4f:
            java.lang.Object r4 = r4.get(r7)
            gc.q r4 = (gc.q) r4
            int r7 = r7 + 1
            r2.f14246y = r7
            java.lang.Object r7 = r2.f()
            r0.f14247x = r2
            r0.V3 = r3
            java.lang.Object r7 = r4.s(r2, r7, r0)
            if (r7 != r1) goto L39
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.a.g(xb.d):java.lang.Object");
    }

    @Override // jb.e
    public Object O0(TSubject tsubject, xb.d<? super TSubject> dVar) {
        this.f14245x = tsubject;
        return f0(dVar);
    }

    @Override // jb.g
    public Object a(TSubject tsubject, xb.d<? super TSubject> dVar) {
        this.f14246y = 0;
        this.f14245x = tsubject;
        return f0(dVar);
    }

    @Override // jb.e
    public TContext b() {
        return this.f14242c;
    }

    public void d() {
        this.f14246y = -1;
    }

    public TSubject f() {
        return this.f14245x;
    }

    @Override // jb.e
    public Object f0(xb.d<? super TSubject> dVar) {
        int i10 = this.f14246y;
        if (i10 < 0) {
            return f();
        }
        if (i10 < this.f14243d.size()) {
            return g(dVar);
        }
        d();
        return f();
    }

    @Override // kotlinx.coroutines.q0
    public xb.g h() {
        return this.f14244q;
    }
}
