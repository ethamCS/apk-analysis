package kotlinx.coroutines.flow;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/flow/a;", "T", "Lkotlinx/coroutines/flow/d;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/e;", "collector", "Ltb/e0;", "a", "(Lkotlinx/coroutines/flow/e;Lxb/d;)Ljava/lang/Object;", "i", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class a<T> implements d<T> {

    @zb.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.flow.a$a */
    /* loaded from: classes3.dex */
    public static final class C0226a extends zb.d {
        final /* synthetic */ a<T> U3;
        int V3;

        /* renamed from: x */
        Object f15340x;

        /* renamed from: y */
        /* synthetic */ Object f15341y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0226a(a<T> aVar, xb.d<? super C0226a> dVar) {
            super(dVar);
            this.U3 = aVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f15341y = obj;
            this.V3 |= Integer.MIN_VALUE;
            return this.U3.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    @Override // kotlinx.coroutines.flow.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlinx.coroutines.flow.e<? super T> r6, xb.d<? super tb.e0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.a.C0226a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.a$a r0 = (kotlinx.coroutines.flow.a.C0226a) r0
            int r1 = r0.V3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.V3 = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.a$a r0 = new kotlinx.coroutines.flow.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f15341y
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.V3
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f15340x
            ef.m r6 = (ef.m) r6
            tb.t.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            tb.t.b(r7)
            ef.m r7 = new ef.m
            xb.g r2 = r0.b()
            r7.<init>(r6, r2)
            r0.f15340x = r7     // Catch: java.lang.Throwable -> L55
            r0.V3 = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.i(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.G()
            tb.e0 r6 = tb.e0.f22152a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.G()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a.a(kotlinx.coroutines.flow.e, xb.d):java.lang.Object");
    }

    public abstract Object i(e<? super T> eVar, xb.d<? super e0> dVar);
}
