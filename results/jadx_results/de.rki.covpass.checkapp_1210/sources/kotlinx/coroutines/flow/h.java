package kotlinx.coroutines.flow;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"T", "Lkotlinx/coroutines/flow/e;", "Ldf/a0;", "channel", "Ltb/e0;", "b", "(Lkotlinx/coroutines/flow/e;Ldf/a0;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "consume", "c", "(Lkotlinx/coroutines/flow/e;Ldf/a0;ZLxb/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/d;", "d", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class h {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @zb.f(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {51, 62}, m = "emitAllImpl$FlowKt__ChannelsKt")
    /* loaded from: classes3.dex */
    public static final class a<T> extends zb.d {
        boolean U3;
        /* synthetic */ Object V3;
        int W3;

        /* renamed from: x */
        Object f15357x;

        /* renamed from: y */
        Object f15358y;

        a(xb.d<? super a> dVar) {
            super(dVar);
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.V3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return h.c(null, null, false, this);
        }
    }

    public static final <T> Object b(e<? super T> eVar, df.a0<? extends T> a0Var, xb.d<? super e0> dVar) {
        Object c10;
        Object c11 = c(eVar, a0Var, true, dVar);
        c10 = yb.d.c();
        return c11 == c10 ? c11 : e0.f22152a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:18:0x004b, B:26:0x0070, B:28:0x0076, B:34:0x0084, B:35:0x0085), top: B:45:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:18:0x004b, B:26:0x0070, B:28:0x0076, B:34:0x0084, B:35:0x0085), top: B:45:0x0022 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0095 -> B:14:0x0035). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(kotlinx.coroutines.flow.e<? super T> r7, df.a0<? extends T> r8, boolean r9, xb.d<? super tb.e0> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.h.a
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.h$a r0 = (kotlinx.coroutines.flow.h.a) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.h$a r0 = new kotlinx.coroutines.flow.h$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.V3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.W3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            boolean r7 = r0.U3
            java.lang.Object r8 = r0.f15358y
            df.a0 r8 = (df.a0) r8
            java.lang.Object r9 = r0.f15357x
            kotlinx.coroutines.flow.e r9 = (kotlinx.coroutines.flow.e) r9
            tb.t.b(r10)     // Catch: java.lang.Throwable -> L55
        L35:
            r6 = r9
            r9 = r7
            r7 = r6
            goto L5d
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            boolean r7 = r0.U3
            java.lang.Object r8 = r0.f15358y
            df.a0 r8 = (df.a0) r8
            java.lang.Object r9 = r0.f15357x
            kotlinx.coroutines.flow.e r9 = (kotlinx.coroutines.flow.e) r9
            tb.t.b(r10)     // Catch: java.lang.Throwable -> L55
            df.m r10 = (df.m) r10     // Catch: java.lang.Throwable -> L55
            java.lang.Object r10 = r10.k()     // Catch: java.lang.Throwable -> L55
            goto L6f
        L55:
            r9 = move-exception
            goto L9c
        L57:
            tb.t.b(r10)
            kotlinx.coroutines.flow.f.h(r7)
        L5d:
            r0.f15357x = r7     // Catch: java.lang.Throwable -> L98
            r0.f15358y = r8     // Catch: java.lang.Throwable -> L98
            r0.U3 = r9     // Catch: java.lang.Throwable -> L98
            r0.W3 = r4     // Catch: java.lang.Throwable -> L98
            java.lang.Object r10 = r8.w(r0)     // Catch: java.lang.Throwable -> L98
            if (r10 != r1) goto L6c
            return r1
        L6c:
            r6 = r9
            r9 = r7
            r7 = r6
        L6f:
            r2 = 0
            boolean r5 = df.m.h(r10)     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L85
            java.lang.Throwable r9 = df.m.e(r10)     // Catch: java.lang.Throwable -> L55
            if (r9 != 0) goto L84
            if (r7 == 0) goto L81
            df.n.a(r8, r2)
        L81:
            tb.e0 r7 = tb.e0.f22152a
            return r7
        L84:
            throw r9     // Catch: java.lang.Throwable -> L55
        L85:
            java.lang.Object r10 = df.m.f(r10)     // Catch: java.lang.Throwable -> L55
            r0.f15357x = r9     // Catch: java.lang.Throwable -> L55
            r0.f15358y = r8     // Catch: java.lang.Throwable -> L55
            r0.U3 = r7     // Catch: java.lang.Throwable -> L55
            r0.W3 = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r10 = r9.c(r10, r0)     // Catch: java.lang.Throwable -> L55
            if (r10 != r1) goto L35
            return r1
        L98:
            r7 = move-exception
            r6 = r9
            r9 = r7
            r7 = r6
        L9c:
            throw r9     // Catch: java.lang.Throwable -> L9d
        L9d:
            r10 = move-exception
            if (r7 == 0) goto La3
            df.n.a(r8, r9)
        La3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.h.c(kotlinx.coroutines.flow.e, df.a0, boolean, xb.d):java.lang.Object");
    }

    public static final <T> d<T> d(df.a0<? extends T> a0Var) {
        return new b(a0Var, false, null, 0, null, 28, null);
    }
}
