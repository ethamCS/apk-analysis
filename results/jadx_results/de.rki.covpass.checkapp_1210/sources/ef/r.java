package ef;

import kotlin.Metadata;
import kotlinx.coroutines.internal.f0;
import tb.e0;
import tb.t;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lef/r;", "T", "Lkotlinx/coroutines/flow/e;", "value", "Ltb/e0;", "c", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;", "downstream", "Lxb/g;", "emitContext", "<init>", "(Lkotlinx/coroutines/flow/e;Lxb/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class r<T> implements kotlinx.coroutines.flow.e<T> {

    /* renamed from: c */
    private final xb.g f9582c;

    /* renamed from: d */
    private final Object f9583d;

    /* renamed from: q */
    private final gc.p<T, xb.d<? super e0>, Object> f9584q;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {212}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends zb.l implements gc.p<T, xb.d<? super e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ kotlinx.coroutines.flow.e<T> V3;

        /* renamed from: y */
        int f9585y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.e<? super T> eVar, xb.d<? super a> dVar) {
            super(2, dVar);
            this.V3 = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f9585y;
            if (i10 == 0) {
                t.b(obj);
                Object obj2 = this.U3;
                this.f9585y = 1;
                if (this.V3.c(obj2, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                t.b(obj);
            }
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(T t10, xb.d<? super e0> dVar) {
            return ((a) j(t10, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            a aVar = new a(this.V3, dVar);
            aVar.U3 = obj;
            return aVar;
        }
    }

    public r(kotlinx.coroutines.flow.e<? super T> eVar, xb.g gVar) {
        this.f9582c = gVar;
        this.f9583d = f0.b(gVar);
        this.f9584q = new a(eVar, null);
    }

    @Override // kotlinx.coroutines.flow.e
    public Object c(T t10, xb.d<? super e0> dVar) {
        Object c10;
        Object b10 = e.b(this.f9582c, t10, this.f9583d, this.f9584q, dVar);
        c10 = yb.d.c();
        return b10 == c10 ? b10 : e0.f22152a;
    }
}
