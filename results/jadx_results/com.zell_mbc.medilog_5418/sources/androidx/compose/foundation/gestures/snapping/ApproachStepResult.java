package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SnapFlingBehavior.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/ApproachStepResult;", "", "remainingOffset", "", "currentAnimationState", "Landroidx/compose/animation/core/AnimationState;", "Landroidx/compose/animation/core/AnimationVector1D;", "(FLandroidx/compose/animation/core/AnimationState;)V", "getCurrentAnimationState", "()Landroidx/compose/animation/core/AnimationState;", "getRemainingOffset", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class ApproachStepResult {
    private final AnimationState<Float, AnimationVector1D> currentAnimationState;
    private final float remainingOffset;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApproachStepResult copy$default(ApproachStepResult approachStepResult, float f, AnimationState animationState, int i, Object obj) {
        if ((i & 1) != 0) {
            f = approachStepResult.remainingOffset;
        }
        if ((i & 2) != 0) {
            animationState = approachStepResult.currentAnimationState;
        }
        return approachStepResult.copy(f, animationState);
    }

    public final float component1() {
        return this.remainingOffset;
    }

    public final AnimationState<Float, AnimationVector1D> component2() {
        return this.currentAnimationState;
    }

    public final ApproachStepResult copy(float f, AnimationState<Float, AnimationVector1D> currentAnimationState) {
        Intrinsics.checkNotNullParameter(currentAnimationState, "currentAnimationState");
        return new ApproachStepResult(f, currentAnimationState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproachStepResult)) {
            return false;
        }
        ApproachStepResult approachStepResult = (ApproachStepResult) obj;
        return Intrinsics.areEqual((Object) Float.valueOf(this.remainingOffset), (Object) Float.valueOf(approachStepResult.remainingOffset)) && Intrinsics.areEqual(this.currentAnimationState, approachStepResult.currentAnimationState);
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.remainingOffset) * 31) + this.currentAnimationState.hashCode();
    }

    public String toString() {
        return "ApproachStepResult(remainingOffset=" + this.remainingOffset + ", currentAnimationState=" + this.currentAnimationState + ')';
    }

    public ApproachStepResult(float f, AnimationState<Float, AnimationVector1D> currentAnimationState) {
        Intrinsics.checkNotNullParameter(currentAnimationState, "currentAnimationState");
        this.remainingOffset = f;
        this.currentAnimationState = currentAnimationState;
    }

    public final float getRemainingOffset() {
        return this.remainingOffset;
    }

    public final AnimationState<Float, AnimationVector1D> getCurrentAnimationState() {
        return this.currentAnimationState;
    }
}
