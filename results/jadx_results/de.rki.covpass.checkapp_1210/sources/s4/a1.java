package s4;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.coroutines.sync.b;
import org.conscrypt.BuildConfig;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:82)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:60)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:54)
    */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\r\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B3\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010*\u001a\u00028\u0000\u0012\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013¢\u0006\u0004\b,\u0010-B'\b\u0016\u0012\u0006\u0010*\u001a\u00028\u0000\u0012\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013¢\u0006\u0004\b,\u0010.J#\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0002J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00028\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\"8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$R$\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Ls4/a1;", "T", "Ls4/l0;", "Lkotlinx/coroutines/flow/o;", "S", "Lkotlin/Function0;", "block", "m", "(Lgc/a;)Ljava/lang/Object;", "Ltb/e0;", "l", "newValue", "j", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/e;", "collector", BuildConfig.FLAVOR, "a", "(Lkotlinx/coroutines/flow/e;Lxb/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "h", "(Lgc/l;)Ljava/lang/Object;", "value", "c", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "e", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/sync/b;", "mutex$delegate", "Lkotlin/Lazy;", "k", "()Lkotlinx/coroutines/sync/b;", "mutex", BuildConfig.FLAVOR, "b", "()Ljava/util/List;", "replayCache", "getValue", "()Ljava/lang/Object;", "setValue", "flow", "initial", "setter", "<init>", "(Lkotlinx/coroutines/flow/o;Ljava/lang/Object;Lgc/l;)V", "(Ljava/lang/Object;Lgc/l;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a1<T> implements l0<T>, kotlinx.coroutines.flow.o<T> {

    /* renamed from: c */
    private final kotlinx.coroutines.flow.o<T> f21352c;

    /* renamed from: d */
    private final gc.l<T, tb.e0> f21353d;

    /* renamed from: q */
    private final Lazy f21354q;

    /* renamed from: x */
    private final kotlinx.coroutines.sync.b f21355x;

    /* renamed from: y */
    private List<T> f21356y;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlinx/coroutines/sync/b;", "b", "()Lkotlinx/coroutines/sync/b;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.a<kotlinx.coroutines.sync.b> {

        /* renamed from: c */
        public static final a f21357c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final kotlinx.coroutines.sync.b invoke() {
            return kotlinx.coroutines.sync.d.b(false, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    static final class b extends hc.v implements gc.a<T> {

        /* renamed from: c */
        final /* synthetic */ a1<T> f21358c;

        /* renamed from: d */
        final /* synthetic */ gc.l<T, T> f21359d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(a1<T> a1Var, gc.l<? super T, ? extends T> lVar) {
            super(0);
            this.f21358c = a1Var;
            this.f21359d = lVar;
        }

        @Override // gc.a
        public final T invoke() {
            T value = this.f21358c.getValue();
            T invoke = this.f21359d.invoke(this.f21358c.getValue());
            if (!hc.t.a(value, invoke)) {
                this.f21358c.j(invoke);
            }
            return value;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ltb/e0;", "b", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    static final class c extends hc.v implements gc.a<tb.e0> {

        /* renamed from: c */
        final /* synthetic */ a1<T> f21360c;

        /* renamed from: d */
        final /* synthetic */ T f21361d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a1<T> a1Var, T t10) {
            super(0);
            this.f21360c = a1Var;
            this.f21361d = t10;
        }

        public final void b() {
            if (!hc.t.a(this.f21360c.getValue(), this.f21361d)) {
                this.f21360c.j(this.f21361d);
            }
        }

        @Override // gc.a
        public /* bridge */ /* synthetic */ tb.e0 invoke() {
            b();
            return tb.e0.f22152a;
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "S", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class d extends hc.v implements gc.a<S> {

        /* renamed from: c */
        final /* synthetic */ gc.a<S> f21362c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(gc.a<? extends S> aVar) {
            super(0);
            this.f21362c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [S, java.lang.Object] */
        @Override // gc.a
        public final S invoke() {
            return this.f21362c.invoke();
        }
    }

    public a1(T t10, gc.l<? super T, tb.e0> lVar) {
        this(kotlinx.coroutines.flow.u.b(1, 0, df.h.DROP_OLDEST, 2, null), t10, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a1(kotlinx.coroutines.flow.o<T> oVar, T t10, gc.l<? super T, tb.e0> lVar) {
        Lazy a10;
        hc.t.e(oVar, "flow");
        this.f21352c = oVar;
        this.f21353d = lVar;
        a10 = tb.m.a(a.f21357c);
        this.f21354q = a10;
        this.f21355x = kotlinx.coroutines.sync.d.b(false, 1, null);
        this.f21356y = new ArrayList();
        e(t10);
    }

    public final void j(T t10) {
        this.f21356y.add(t10);
    }

    private final kotlinx.coroutines.sync.b k() {
        return (kotlinx.coroutines.sync.b) this.f21354q.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void l() {
        Object A;
        while ((!this.f21356y.isEmpty()) && b.a.a(this.f21355x, null, 1, null)) {
            if (!this.f21356y.isEmpty()) {
                A = ub.z.A(this.f21356y);
                e(A);
            }
            b.a.b(this.f21355x, null, 1, null);
        }
    }

    private final <S> S m(gc.a<? extends S> aVar) {
        S s10 = (S) y0.b(k(), new d(aVar));
        l();
        return s10;
    }

    @Override // kotlinx.coroutines.flow.s, kotlinx.coroutines.flow.d
    public Object a(kotlinx.coroutines.flow.e<? super T> eVar, xb.d<?> dVar) {
        return this.f21352c.a(eVar, dVar);
    }

    @Override // kotlinx.coroutines.flow.s
    public List<T> b() {
        return this.f21352c.b();
    }

    @Override // kotlinx.coroutines.flow.o, kotlinx.coroutines.flow.e
    public Object c(T t10, xb.d<? super tb.e0> dVar) {
        Object c10;
        gc.l<T, tb.e0> lVar = this.f21353d;
        if (lVar != null) {
            lVar.invoke(t10);
        }
        Object c11 = this.f21352c.c(t10, dVar);
        c10 = yb.d.c();
        return c11 == c10 ? c11 : tb.e0.f22152a;
    }

    @Override // kotlinx.coroutines.flow.o
    public boolean e(T t10) {
        gc.l<T, tb.e0> lVar = this.f21353d;
        if (lVar != null) {
            lVar.invoke(t10);
        }
        return this.f21352c.e(t10);
    }

    @Override // kotlinx.coroutines.flow.w
    public T getValue() {
        Object V;
        V = ub.c0.V(b());
        return (T) V;
    }

    @Override // s4.l0
    public T h(gc.l<? super T, ? extends T> lVar) {
        hc.t.e(lVar, "block");
        return (T) m(new b(this, lVar));
    }

    @Override // kotlinx.coroutines.flow.p
    public void setValue(T t10) {
        m(new c(this, t10));
    }
}
