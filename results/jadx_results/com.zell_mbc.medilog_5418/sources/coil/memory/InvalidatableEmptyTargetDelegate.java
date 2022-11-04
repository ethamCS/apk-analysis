package coil.memory;

import android.graphics.Bitmap;
import coil.bitmap.BitmapReferenceCounter;
import coil.request.SuccessResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TargetDelegate.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcoil/memory/InvalidatableEmptyTargetDelegate;", "Lcoil/memory/TargetDelegate;", "referenceCounter", "Lcoil/bitmap/BitmapReferenceCounter;", "(Lcoil/bitmap/BitmapReferenceCounter;)V", "success", "", "result", "Lcoil/request/SuccessResult;", "(Lcoil/request/SuccessResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class InvalidatableEmptyTargetDelegate extends TargetDelegate {
    private final BitmapReferenceCounter referenceCounter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidatableEmptyTargetDelegate(BitmapReferenceCounter referenceCounter) {
        super(null);
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        this.referenceCounter = referenceCounter;
    }

    @Override // coil.memory.TargetDelegate
    public Object success(SuccessResult successResult, Continuation<? super Unit> continuation) {
        Bitmap bitmap;
        BitmapReferenceCounter bitmapReferenceCounter = this.referenceCounter;
        bitmap = TargetDelegateKt.getBitmap(successResult);
        if (bitmap != null) {
            bitmapReferenceCounter.setValid(bitmap, false);
        }
        return Unit.INSTANCE;
    }
}
