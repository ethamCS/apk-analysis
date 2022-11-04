package s4;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\b\u0002\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0017J!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H¤@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00028\u00008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Ls4/j;", "T", BuildConfig.FLAVOR, "Ls4/v0;", "Lkotlinx/coroutines/flow/e;", "collector", BuildConfig.FLAVOR, "a", "(Lkotlinx/coroutines/flow/e;Lxb/d;)Ljava/lang/Object;", "value", "Ltb/e0;", "i", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "force", "d", "(Ljava/lang/Object;ZLxb/d;)Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "Ls4/l0;", "flow", "<init>", "(Ls4/l0;)V", "(Ljava/lang/Object;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class j<T> implements kotlinx.coroutines.flow.w, v0<T> {

    /* renamed from: c */
    private final l0<T> f21411c;

    @zb.f(c = "com.ensody.reactivestate.BaseSuspendMutableValueFlow", f = "SuspendMutableValueFlow.kt", l = {68, 69}, m = "set$suspendImpl")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends zb.d {
        /* synthetic */ Object U3;
        final /* synthetic */ j<T> V3;
        int W3;

        /* renamed from: x */
        Object f21412x;

        /* renamed from: y */
        Object f21413y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j<T> jVar, xb.d<? super a> dVar) {
            super(dVar);
            this.V3 = jVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return j.j(this.V3, null, false, this);
        }
    }

    public j(T t10) {
        this(b1.b(t10, null, 2, null));
    }

    private j(l0<T> l0Var) {
        this.f21411c = l0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object j(s4.j r5, java.lang.Object r6, boolean r7, xb.d r8) {
        /*
            boolean r0 = r8 instanceof s4.j.a
            if (r0 == 0) goto L13
            r0 = r8
            s4.j$a r0 = (s4.j.a) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            s4.j$a r0 = new s4.j$a
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.W3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tb.t.b(r8)
            goto L6d
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r6 = r0.f21413y
            java.lang.Object r5 = r0.f21412x
            s4.j r5 = (s4.j) r5
            tb.t.b(r8)
            goto L5d
        L3e:
            tb.t.b(r8)
            if (r7 != 0) goto L50
            java.lang.Object r7 = r5.getValue()
            boolean r7 = hc.t.a(r7, r6)
            if (r7 == 0) goto L50
            tb.e0 r5 = tb.e0.f22152a
            return r5
        L50:
            r0.f21412x = r5
            r0.f21413y = r6
            r0.W3 = r4
            java.lang.Object r7 = r5.i(r6, r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            s4.l0<T> r5 = r5.f21411c
            r7 = 0
            r0.f21412x = r7
            r0.f21413y = r7
            r0.W3 = r3
            java.lang.Object r5 = r5.c(r6, r0)
            if (r5 != r1) goto L6d
            return r1
        L6d:
            tb.e0 r5 = tb.e0.f22152a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.j.j(s4.j, java.lang.Object, boolean, xb.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.s, kotlinx.coroutines.flow.d
    public Object a(kotlinx.coroutines.flow.e<? super T> eVar, xb.d<?> dVar) {
        return this.f21411c.a(eVar, dVar);
    }

    @Override // s4.v0
    public Object d(T t10, boolean z10, xb.d<? super tb.e0> dVar) {
        return j(this, t10, z10, dVar);
    }

    @Override // kotlinx.coroutines.flow.w
    public T getValue() {
        return this.f21411c.getValue();
    }

    protected abstract Object i(T t10, xb.d<? super tb.e0> dVar);
}
