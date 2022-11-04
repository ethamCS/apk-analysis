package g;

import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
@JvmName(name = "KotlinExtensions")
/* loaded from: classes.dex */
public final class m {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: a */
        final /* synthetic */ g.d f4521a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g.d dVar) {
            super(1);
            this.f4521a = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: a */
        final /* synthetic */ g.d f4522a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g.d dVar) {
            super(1);
            this.f4522a = dVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements g.f<T> {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f4523a;

        c(CancellableContinuation cancellableContinuation) {
            this.f4523a = cancellableContinuation;
        }

        @Override // g.f
        public void a(g.d<T> dVar, Throwable th) {
            Intrinsics.checkParameterIsNotNull(dVar, "call");
            Intrinsics.checkParameterIsNotNull(th, "t");
            Result.Companion companion = Result.Companion;
            this.f4523a.resumeWith(Result.constructor-impl(ResultKt.createFailure(th)));
        }

        @Override // g.f
        public void b(g.d<T> dVar, t<T> tVar) {
            Object obj;
            Continuation continuation;
            Intrinsics.checkParameterIsNotNull(dVar, "call");
            Intrinsics.checkParameterIsNotNull(tVar, "response");
            if (tVar.d()) {
                obj = tVar.a();
                if (obj == null) {
                    Object h2 = dVar.a().h(l.class);
                    if (h2 == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(h2, "call.request().tag(Invocation::class.java)!!");
                    Method a2 = ((l) h2).a();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Response from ");
                    Intrinsics.checkExpressionValueIsNotNull(a2, "method");
                    Class<?> declaringClass = a2.getDeclaringClass();
                    Intrinsics.checkExpressionValueIsNotNull(declaringClass, "method.declaringClass");
                    sb.append(declaringClass.getName());
                    sb.append('.');
                    sb.append(a2.getName());
                    sb.append(" was null but response body type was declared as non-null");
                    Throwable kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
                    continuation = (Continuation) this.f4523a;
                    Result.Companion companion = Result.Companion;
                    obj = ResultKt.createFailure(kotlinNullPointerException);
                } else {
                    continuation = (Continuation) this.f4523a;
                    Result.Companion companion2 = Result.Companion;
                }
            } else {
                continuation = (Continuation) this.f4523a;
                j jVar = new j(tVar);
                Result.Companion companion3 = Result.Companion;
                obj = ResultKt.createFailure(jVar);
            }
            continuation.resumeWith(Result.constructor-impl(obj));
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements g.f<T> {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f4524a;

        d(CancellableContinuation cancellableContinuation) {
            this.f4524a = cancellableContinuation;
        }

        @Override // g.f
        public void a(g.d<T> dVar, Throwable th) {
            Intrinsics.checkParameterIsNotNull(dVar, "call");
            Intrinsics.checkParameterIsNotNull(th, "t");
            Result.Companion companion = Result.Companion;
            this.f4524a.resumeWith(Result.constructor-impl(ResultKt.createFailure(th)));
        }

        @Override // g.f
        public void b(g.d<T> dVar, t<T> tVar) {
            Object obj;
            Continuation continuation;
            Intrinsics.checkParameterIsNotNull(dVar, "call");
            Intrinsics.checkParameterIsNotNull(tVar, "response");
            if (tVar.d()) {
                continuation = (Continuation) this.f4524a;
                obj = tVar.a();
                Result.Companion companion = Result.Companion;
            } else {
                continuation = (Continuation) this.f4524a;
                j jVar = new j(tVar);
                Result.Companion companion2 = Result.Companion;
                obj = ResultKt.createFailure(jVar);
            }
            continuation.resumeWith(Result.constructor-impl(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: a */
        final /* synthetic */ g.d f4525a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(g.d dVar) {
            super(1);
            this.f4525a = dVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements g.f<T> {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f4526a;

        f(CancellableContinuation cancellableContinuation) {
            this.f4526a = cancellableContinuation;
        }

        @Override // g.f
        public void a(g.d<T> dVar, Throwable th) {
            Intrinsics.checkParameterIsNotNull(dVar, "call");
            Intrinsics.checkParameterIsNotNull(th, "t");
            Result.Companion companion = Result.Companion;
            this.f4526a.resumeWith(Result.constructor-impl(ResultKt.createFailure(th)));
        }

        @Override // g.f
        public void b(g.d<T> dVar, t<T> tVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "call");
            Intrinsics.checkParameterIsNotNull(tVar, "response");
            Result.Companion companion = Result.Companion;
            this.f4526a.resumeWith(Result.constructor-impl(tVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class g implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Continuation f4527b;

        /* renamed from: c */
        final /* synthetic */ Exception f4528c;

        g(Continuation continuation, Exception exc) {
            this.f4527b = continuation;
            this.f4528c = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Continuation intercepted = IntrinsicsKt.intercepted(this.f4527b);
            Exception exc = this.f4528c;
            Result.Companion companion = Result.Companion;
            intercepted.resumeWith(Result.constructor-impl(ResultKt.createFailure(exc)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @DebugMetadata(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", i = {0}, l = {113}, m = "suspendAndThrow", n = {"$this$suspendAndThrow"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class h extends ContinuationImpl {

        /* renamed from: a */
        /* synthetic */ Object f4529a;

        /* renamed from: b */
        int f4530b;

        /* renamed from: c */
        Object f4531c;

        h(Continuation continuation) {
            super(continuation);
        }
    }

    public static final <T> Object a(g.d<T> dVar, Continuation<? super T> continuation) {
        CancellableContinuation cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
        cancellableContinuation.invokeOnCancellation(new a(dVar));
        dVar.N(new c(cancellableContinuation));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @JvmName(name = "awaitNullable")
    public static final <T> Object b(g.d<T> dVar, Continuation<? super T> continuation) {
        CancellableContinuation cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
        cancellableContinuation.invokeOnCancellation(new b(dVar));
        dVar.N(new d(cancellableContinuation));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final <T> Object c(g.d<T> dVar, Continuation<? super t<T>> continuation) {
        CancellableContinuation cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
        cancellableContinuation.invokeOnCancellation(new e(dVar));
        dVar.N(new f(cancellableContinuation));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(java.lang.Exception r4, kotlin.coroutines.Continuation<?> r5) {
        /*
            boolean r0 = r5 instanceof g.m.h
            if (r0 == 0) goto L13
            r0 = r5
            g.m$h r0 = (g.m.h) r0
            int r1 = r0.f4530b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4530b = r1
            goto L18
        L13:
            g.m$h r0 = new g.m$h
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f4529a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f4530b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f4531c
            java.lang.Exception r4 = (java.lang.Exception) r4
            kotlin.ResultKt.throwOnFailure(r5)
            goto L5e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.f4531c = r4
            r0.f4530b = r3
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getDefault()
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            g.m$g r3 = new g.m$g
            r3.<init>(r0, r4)
            r5.dispatch(r2, r3)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L5b
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L5b:
            if (r4 != r1) goto L5e
            return r1
        L5e:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g.m.d(java.lang.Exception, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
