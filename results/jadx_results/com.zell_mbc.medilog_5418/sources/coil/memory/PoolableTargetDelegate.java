package coil.memory;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import coil.EventListener;
import coil.bitmap.BitmapReferenceCounter;
import coil.bitmap.EmptyBitmapReferenceCounter;
import coil.target.PoolableViewTarget;
import coil.util.Extensions;
import coil.util.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TargetDelegate.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0019\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\u0012\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J0\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u001b\u0010\u0018\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u000e0\u0019¢\u0006\u0002\b\u001aH\u0082\bJ\u001c\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0011H\u0016J\u0019\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010!R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcoil/memory/PoolableTargetDelegate;", "Lcoil/memory/TargetDelegate;", TypedValues.AttributesType.S_TARGET, "Lcoil/target/PoolableViewTarget;", "referenceCounter", "Lcoil/bitmap/BitmapReferenceCounter;", "eventListener", "Lcoil/EventListener;", "logger", "Lcoil/util/Logger;", "(Lcoil/target/PoolableViewTarget;Lcoil/bitmap/BitmapReferenceCounter;Lcoil/EventListener;Lcoil/util/Logger;)V", "getTarget", "()Lcoil/target/PoolableViewTarget;", "clear", "", "decrement", "bitmap", "Landroid/graphics/Bitmap;", "error", "result", "Lcoil/request/ErrorResult;", "(Lcoil/request/ErrorResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "increment", "replace", "update", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "start", "placeholder", "Landroid/graphics/drawable/Drawable;", "cached", "success", "Lcoil/request/SuccessResult;", "(Lcoil/request/SuccessResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class PoolableTargetDelegate extends TargetDelegate {
    private final EventListener eventListener;
    private final Logger logger;
    private final BitmapReferenceCounter referenceCounter;
    private final PoolableViewTarget<?> target;

    @Override // coil.memory.TargetDelegate
    public PoolableViewTarget<?> getTarget() {
        return this.target;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolableTargetDelegate(PoolableViewTarget<?> target, BitmapReferenceCounter referenceCounter, EventListener eventListener, Logger logger) {
        super(null);
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.target = target;
        this.referenceCounter = referenceCounter;
        this.eventListener = eventListener;
        this.logger = logger;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
    @Override // coil.memory.TargetDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object success(coil.request.SuccessResult r18, kotlin.coroutines.Continuation<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.memory.PoolableTargetDelegate.success(coil.request.SuccessResult, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    @Override // coil.memory.TargetDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object error(coil.request.ErrorResult r17, kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.memory.PoolableTargetDelegate.error(coil.request.ErrorResult, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void replace(Bitmap bitmap, Function1<? super PoolableViewTarget<?>, Unit> function1) {
        if (!(this.referenceCounter instanceof EmptyBitmapReferenceCounter)) {
            increment(bitmap);
            function1.invoke(getTarget());
            decrement(bitmap);
            return;
        }
        function1.invoke(getTarget());
    }

    public final void increment(Bitmap bitmap) {
        if (bitmap != null) {
            this.referenceCounter.increment(bitmap);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    public final void decrement(Bitmap bitmap) {
        Bitmap put = Extensions.getRequestManager(getTarget().getView()).put(this, bitmap);
        if (put != null) {
            this.referenceCounter.decrement(put);
        }
    }

    @Override // coil.memory.TargetDelegate
    public void start(Drawable drawable, Bitmap bitmap) {
        if (!(this.referenceCounter instanceof EmptyBitmapReferenceCounter)) {
            increment(bitmap);
            getTarget().onStart(drawable);
            decrement(bitmap);
            return;
        }
        getTarget().onStart(drawable);
    }

    @Override // coil.memory.TargetDelegate
    public void clear() {
        if (!(this.referenceCounter instanceof EmptyBitmapReferenceCounter)) {
            increment(null);
            getTarget().onClear();
            decrement(null);
            return;
        }
        getTarget().onClear();
    }
}
