package coil.memory;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import coil.EventListener;
import coil.bitmap.BitmapReferenceCounter;
import coil.target.Target;
import coil.util.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TargetDelegate.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0019\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0018H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcoil/memory/InvalidatableTargetDelegate;", "Lcoil/memory/TargetDelegate;", TypedValues.AttributesType.S_TARGET, "Lcoil/target/Target;", "referenceCounter", "Lcoil/bitmap/BitmapReferenceCounter;", "eventListener", "Lcoil/EventListener;", "logger", "Lcoil/util/Logger;", "(Lcoil/target/Target;Lcoil/bitmap/BitmapReferenceCounter;Lcoil/EventListener;Lcoil/util/Logger;)V", "getTarget", "()Lcoil/target/Target;", "error", "", "result", "Lcoil/request/ErrorResult;", "(Lcoil/request/ErrorResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "placeholder", "Landroid/graphics/drawable/Drawable;", "cached", "Landroid/graphics/Bitmap;", "success", "Lcoil/request/SuccessResult;", "(Lcoil/request/SuccessResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class InvalidatableTargetDelegate extends TargetDelegate {
    private final EventListener eventListener;
    private final Logger logger;
    private final BitmapReferenceCounter referenceCounter;
    private final Target target;

    @Override // coil.memory.TargetDelegate
    public Target getTarget() {
        return this.target;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidatableTargetDelegate(Target target, BitmapReferenceCounter referenceCounter, EventListener eventListener, Logger logger) {
        super(null);
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.target = target;
        this.referenceCounter = referenceCounter;
        this.eventListener = eventListener;
        this.logger = logger;
    }

    @Override // coil.memory.TargetDelegate
    public void start(Drawable drawable, Bitmap bitmap) {
        BitmapReferenceCounter bitmapReferenceCounter = this.referenceCounter;
        if (bitmap != null) {
            bitmapReferenceCounter.setValid(bitmap, false);
        }
        getTarget().onStart(drawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    @Override // coil.memory.TargetDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object success(coil.request.SuccessResult r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.memory.InvalidatableTargetDelegate.success(coil.request.SuccessResult, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    @Override // coil.memory.TargetDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object error(coil.request.ErrorResult r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof coil.memory.InvalidatableTargetDelegate$error$1
            if (r0 == 0) goto L14
            r0 = r10
            coil.memory.InvalidatableTargetDelegate$error$1 r0 = (coil.memory.InvalidatableTargetDelegate$error$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            coil.memory.InvalidatableTargetDelegate$error$1 r0 = new coil.memory.InvalidatableTargetDelegate$error$1
            r0.<init>(r8, r10)
        L19:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L4b
            if (r2 != r3) goto L43
            java.lang.Object r9 = r0.L$5
            coil.transition.Transition r9 = (coil.transition.Transition) r9
            java.lang.Object r9 = r0.L$4
            coil.util.Logger r9 = (coil.util.Logger) r9
            java.lang.Object r9 = r0.L$3
            coil.EventListener r9 = (coil.EventListener) r9
            java.lang.Object r1 = r0.L$2
            coil.target.Target r1 = (coil.target.Target) r1
            java.lang.Object r1 = r0.L$1
            coil.request.ErrorResult r1 = (coil.request.ErrorResult) r1
            java.lang.Object r0 = r0.L$0
            coil.memory.InvalidatableTargetDelegate r0 = (coil.memory.InvalidatableTargetDelegate) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto Ld6
        L43:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L4b:
            kotlin.ResultKt.throwOnFailure(r10)
            coil.target.Target r10 = r8.getTarget()
            coil.EventListener r2 = r8.eventListener
            coil.util.Logger r4 = r8.logger
            coil.request.ImageRequest r5 = r9.getRequest()
            coil.transition.Transition r5 = r5.getTransition()
            coil.transition.Transition r6 = coil.transition.Transition.NONE
            if (r5 != r6) goto L6b
            android.graphics.drawable.Drawable r9 = r9.getDrawable()
            r10.onError(r9)
            goto Ldd
        L6b:
            boolean r6 = r10 instanceof coil.transition.TransitionTarget
            if (r6 != 0) goto Lb2
            coil.request.ImageRequest r0 = r9.getRequest()
            coil.request.DefinedRequestOptions r0 = r0.getDefined()
            coil.transition.Transition r0 = r0.getTransition()
            if (r0 == 0) goto Laa
            if (r4 == 0) goto Laa
            r0 = 3
            int r1 = r4.getLevel()
            if (r1 > r0) goto Laa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Ignoring '"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = "' as '"
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = "' does not implement coil.transition.TransitionTarget."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.String r3 = "TargetDelegate"
            r4.log(r3, r0, r1, r2)
        Laa:
            android.graphics.drawable.Drawable r9 = r9.getDrawable()
            r10.onError(r9)
            goto Ldd
        Lb2:
            coil.request.ImageRequest r6 = r9.getRequest()
            r2.transitionStart(r6)
            r6 = r10
            coil.transition.TransitionTarget r6 = (coil.transition.TransitionTarget) r6
            r7 = r9
            coil.request.ImageResult r7 = (coil.request.ImageResult) r7
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r2
            r0.L$4 = r4
            r0.L$5 = r5
            r0.label = r3
            java.lang.Object r10 = r5.transition(r6, r7, r0)
            if (r10 != r1) goto Ld4
            return r1
        Ld4:
            r1 = r9
            r9 = r2
        Ld6:
            coil.request.ImageRequest r10 = r1.getRequest()
            r9.transitionEnd(r10)
        Ldd:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.memory.InvalidatableTargetDelegate.error(coil.request.ErrorResult, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
