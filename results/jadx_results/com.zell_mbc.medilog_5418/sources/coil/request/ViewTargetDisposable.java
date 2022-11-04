package coil.request;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import coil.target.ViewTarget;
import coil.util.Extensions;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Disposable.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000bH\u0097@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000bH\u0016R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcoil/request/ViewTargetDisposable;", "Lcoil/request/Disposable;", "requestId", "Ljava/util/UUID;", TypedValues.AttributesType.S_TARGET, "Lcoil/target/ViewTarget;", "(Ljava/util/UUID;Lcoil/target/ViewTarget;)V", "isDisposed", "", "()Z", "await", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispose", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class ViewTargetDisposable implements Disposable {
    private final UUID requestId;
    private final ViewTarget<?> target;

    public ViewTargetDisposable(UUID requestId, ViewTarget<?> target) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(target, "target");
        this.requestId = requestId;
        this.target = target;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    @Override // coil.request.Disposable
    public boolean isDisposed() {
        return !Intrinsics.areEqual(Extensions.getRequestManager(this.target.getView()).getCurrentRequestId(), this.requestId);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View] */
    @Override // coil.request.Disposable
    public void dispose() {
        if (isDisposed()) {
            return;
        }
        Extensions.getRequestManager(this.target.getView()).clearCurrentRequest();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View] */
    @Override // coil.request.Disposable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object await(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof coil.request.ViewTargetDisposable$await$1
            if (r0 == 0) goto L14
            r0 = r5
            coil.request.ViewTargetDisposable$await$1 r0 = (coil.request.ViewTargetDisposable$await$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L19
        L14:
            coil.request.ViewTargetDisposable$await$1 r0 = new coil.request.ViewTargetDisposable$await$1
            r0.<init>(r4, r5)
        L19:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.L$0
            coil.request.ViewTargetDisposable r0 = (coil.request.ViewTargetDisposable) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L5d
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L36:
            kotlin.ResultKt.throwOnFailure(r5)
            boolean r5 = r4.isDisposed()
            if (r5 == 0) goto L42
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L42:
            coil.target.ViewTarget<?> r5 = r4.target
            android.view.View r5 = r5.getView()
            coil.memory.ViewTargetRequestManager r5 = coil.util.Extensions.getRequestManager(r5)
            kotlinx.coroutines.Job r5 = r5.getCurrentRequestJob()
            if (r5 == 0) goto L5d
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.join(r0)
            if (r5 != r1) goto L5d
            return r1
        L5d:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.request.ViewTargetDisposable.await(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
