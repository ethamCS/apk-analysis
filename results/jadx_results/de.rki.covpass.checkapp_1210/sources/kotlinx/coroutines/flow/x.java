package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u00103\u001a\u00020\u0005¢\u0006\u0004\b4\u0010,J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R*\u0010\f\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b-\u0010.\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lkotlinx/coroutines/flow/x;", "T", "Lef/a;", "Lkotlinx/coroutines/flow/z;", "Lkotlinx/coroutines/flow/p;", BuildConfig.FLAVOR, "Lef/i;", "expectedState", "newState", BuildConfig.FLAVOR, "s", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "value", "e", "(Ljava/lang/Object;)Z", "Ltb/e0;", "c", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/e;", "collector", BuildConfig.FLAVOR, "a", "(Lkotlinx/coroutines/flow/e;Lxb/d;)Ljava/lang/Object;", "q", "()Lkotlinx/coroutines/flow/z;", BuildConfig.FLAVOR, "size", BuildConfig.FLAVOR, "r", "(I)[Lkotlinx/coroutines/flow/z;", "Lxb/g;", "context", "capacity", "Ldf/h;", "onBufferOverflow", "Lkotlinx/coroutines/flow/d;", "g", "(Lxb/g;ILdf/h;)Lkotlinx/coroutines/flow/d;", "x", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "()V", BuildConfig.FLAVOR, "b", "()Ljava/util/List;", "replayCache", "initialState", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class x<T> extends ef.a<z> implements p<T>, d, ef.i<T> {
    private volatile /* synthetic */ Object _state;

    /* renamed from: x */
    private int f15384x;

    @zb.f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {386, 398, 403}, m = "collect")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends zb.d {
        Object U3;
        Object V3;
        Object W3;
        /* synthetic */ Object X3;
        final /* synthetic */ x<T> Y3;
        int Z3;

        /* renamed from: x */
        Object f15385x;

        /* renamed from: y */
        Object f15386y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(x<T> xVar, xb.d<? super a> dVar) {
            super(dVar);
            this.Y3 = xVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.X3 = obj;
            this.Z3 |= Integer.MIN_VALUE;
            return this.Y3.a(null, this);
        }
    }

    public x(Object obj) {
        this._state = obj;
    }

    private final boolean s(Object obj, Object obj2) {
        int i10;
        z[] p10;
        p();
        synchronized (this) {
            Object obj3 = this._state;
            if (obj == null || hc.t.a(obj3, obj)) {
                if (hc.t.a(obj3, obj2)) {
                    return true;
                }
                this._state = obj2;
                int i11 = this.f15384x;
                if ((i11 & 1) != 0) {
                    this.f15384x = i11 + 2;
                    return true;
                }
                int i12 = i11 + 1;
                this.f15384x = i12;
                z[] p11 = p();
                e0 e0Var = e0.f22152a;
                while (true) {
                    z[] zVarArr = p11;
                    if (zVarArr != null) {
                        for (z zVar : zVarArr) {
                            if (zVar != null) {
                                zVar.f();
                            }
                        }
                    }
                    synchronized (this) {
                        i10 = this.f15384x;
                        if (i10 == i12) {
                            this.f15384x = i12 + 1;
                            return true;
                        }
                        p10 = p();
                        e0 e0Var2 = e0.f22152a;
                    }
                    p11 = p10;
                    i12 = i10;
                }
            } else {
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
        if (hc.t.a(r11, r12) == false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:18:0x005c, B:20:0x006f, B:29:0x0097, B:30:0x00a6, B:32:0x00aa, B:34:0x00af, B:36:0x00b5, B:40:0x00bc, B:44:0x00d0, B:46:0x00d6), top: B:53:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:18:0x005c, B:20:0x006f, B:29:0x0097, B:30:0x00a6, B:32:0x00aa, B:34:0x00af, B:36:0x00b5, B:40:0x00bc, B:44:0x00d0, B:46:0x00d6), top: B:53:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:18:0x005c, B:20:0x006f, B:29:0x0097, B:30:0x00a6, B:32:0x00aa, B:34:0x00af, B:36:0x00b5, B:40:0x00bc, B:44:0x00d0, B:46:0x00d6), top: B:53:0x0024 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [ef.c] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00d4 -> B:30:0x00a6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00e6 -> B:30:0x00a6). Please submit an issue!!! */
    @Override // kotlinx.coroutines.flow.s, kotlinx.coroutines.flow.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlinx.coroutines.flow.e<? super T> r11, xb.d<?> r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x.a(kotlinx.coroutines.flow.e, xb.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.s
    public List<T> b() {
        List<T> d10;
        d10 = ub.t.d(getValue());
        return d10;
    }

    @Override // kotlinx.coroutines.flow.o, kotlinx.coroutines.flow.e
    public Object c(T t10, xb.d<? super e0> dVar) {
        setValue(t10);
        return e0.f22152a;
    }

    @Override // kotlinx.coroutines.flow.o
    public boolean e(T t10) {
        setValue(t10);
        return true;
    }

    @Override // ef.i
    public d<T> g(xb.g gVar, int i10, df.h hVar) {
        return y.d(this, gVar, i10, hVar);
    }

    @Override // kotlinx.coroutines.flow.p, kotlinx.coroutines.flow.w
    public T getValue() {
        kotlinx.coroutines.internal.b0 b0Var = ef.l.f9571a;
        T t10 = (T) this._state;
        if (t10 == b0Var) {
            return null;
        }
        return t10;
    }

    /* renamed from: q */
    public z l() {
        return new z();
    }

    /* renamed from: r */
    public z[] m(int i10) {
        return new z[i10];
    }

    @Override // kotlinx.coroutines.flow.p
    public void setValue(T t10) {
        if (t10 == null) {
            t10 = (T) ef.l.f9571a;
        }
        s(null, t10);
    }
}
