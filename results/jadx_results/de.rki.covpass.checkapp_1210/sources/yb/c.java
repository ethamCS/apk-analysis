package yb;

import gc.p;
import hc.q0;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
import xb.g;
import zb.h;
import zb.j;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aZ\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"R", "T", "Lkotlin/Function2;", "Lxb/d;", BuildConfig.FLAVOR, "receiver", "completion", "Ltb/e0;", "a", "(Lgc/p;Ljava/lang/Object;Lxb/d;)Lxb/d;", "b", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
/* loaded from: classes.dex */
public class c {

    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"yb/c$a", "Lzb/j;", "Ltb/s;", BuildConfig.FLAVOR, "result", "B", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends j {

        /* renamed from: d */
        private int f26019d;

        /* renamed from: q */
        final /* synthetic */ p f26020q;

        /* renamed from: x */
        final /* synthetic */ Object f26021x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xb.d dVar, p pVar, Object obj) {
            super(dVar);
            this.f26020q = pVar;
            this.f26021x = obj;
            t.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // zb.a
        protected Object B(Object obj) {
            int i10 = this.f26019d;
            if (i10 == 0) {
                this.f26019d = 1;
                tb.t.b(obj);
                t.c(this.f26020q, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                return ((p) q0.d(this.f26020q, 2)).u(this.f26021x, this);
            } else if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            } else {
                this.f26019d = 2;
                tb.t.b(obj);
                return obj;
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"yb/c$b", "Lzb/d;", "Ltb/s;", BuildConfig.FLAVOR, "result", "B", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends zb.d {
        final /* synthetic */ Object U3;

        /* renamed from: x */
        private int f26022x;

        /* renamed from: y */
        final /* synthetic */ p f26023y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xb.d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f26023y = pVar;
            this.U3 = obj;
            t.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // zb.a
        protected Object B(Object obj) {
            int i10 = this.f26022x;
            if (i10 == 0) {
                this.f26022x = 1;
                tb.t.b(obj);
                t.c(this.f26023y, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                return ((p) q0.d(this.f26023y, 2)).u(this.U3, this);
            } else if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            } else {
                this.f26022x = 2;
                tb.t.b(obj);
                return obj;
            }
        }
    }

    public static <R, T> xb.d<e0> a(p<? super R, ? super xb.d<? super T>, ? extends Object> pVar, R r10, xb.d<? super T> dVar) {
        t.e(pVar, "<this>");
        t.e(dVar, "completion");
        xb.d<?> a10 = h.a(dVar);
        if (pVar instanceof zb.a) {
            return ((zb.a) pVar).j(r10, a10);
        }
        g b10 = a10.b();
        return b10 == xb.h.f25516c ? new a(a10, pVar, r10) : new b(a10, b10, pVar, r10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> xb.d<T> b(xb.d<? super T> dVar) {
        xb.d<T> dVar2;
        t.e(dVar, "<this>");
        zb.d dVar3 = dVar instanceof zb.d ? (zb.d) dVar : null;
        return (dVar3 == null || (dVar2 = (xb.d<T>) dVar3.W()) == null) ? dVar : dVar2;
    }
}
