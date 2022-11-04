package coil.transition;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CrossfadeTransition.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J!\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcoil/transition/CrossfadeTransition;", "Lcoil/transition/Transition;", "durationMillis", "", "(I)V", "getDurationMillis", "()I", "equals", "", "other", "", "hashCode", "toString", "", "transition", "", TypedValues.AttributesType.S_TARGET, "Lcoil/transition/TransitionTarget;", "result", "Lcoil/request/ImageResult;", "(Lcoil/transition/TransitionTarget;Lcoil/request/ImageResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class CrossfadeTransition implements Transition {
    private final int durationMillis;

    public CrossfadeTransition() {
        this(0, 1, null);
    }

    public CrossfadeTransition(int i) {
        this.durationMillis = i;
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.".toString());
    }

    public /* synthetic */ CrossfadeTransition(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 100 : i);
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110 A[Catch: all -> 0x0134, TryCatch #0 {all -> 0x0134, blocks: (B:35:0x00a4, B:39:0x00d1, B:41:0x00d5, B:44:0x00dc, B:45:0x00de, B:47:0x00e7, B:52:0x00fa, B:54:0x0110, B:55:0x0117, B:57:0x011b, B:58:0x0121, B:60:0x012b), top: B:71:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117 A[Catch: all -> 0x0134, TryCatch #0 {all -> 0x0134, blocks: (B:35:0x00a4, B:39:0x00d1, B:41:0x00d5, B:44:0x00dc, B:45:0x00de, B:47:0x00e7, B:52:0x00fa, B:54:0x0110, B:55:0x0117, B:57:0x011b, B:58:0x0121, B:60:0x012b), top: B:71:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b A[Catch: all -> 0x0134, TRY_LEAVE, TryCatch #0 {all -> 0x0134, blocks: (B:35:0x00a4, B:39:0x00d1, B:41:0x00d5, B:44:0x00dc, B:45:0x00de, B:47:0x00e7, B:52:0x00fa, B:54:0x0110, B:55:0x0117, B:57:0x011b, B:58:0x0121, B:60:0x012b), top: B:71:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013c  */
    /* JADX WARN: Type inference failed for: r15v0, types: [T, coil.drawable.CrossfadeDrawable] */
    @Override // coil.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object transition(coil.transition.TransitionTarget r18, coil.request.ImageResult r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.transition.CrossfadeTransition.transition(coil.transition.TransitionTarget, coil.request.ImageResult, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CrossfadeTransition) && this.durationMillis == ((CrossfadeTransition) obj).durationMillis);
    }

    public int hashCode() {
        return this.durationMillis;
    }

    public String toString() {
        return "CrossfadeTransition(durationMillis=" + this.durationMillis + ')';
    }
}
