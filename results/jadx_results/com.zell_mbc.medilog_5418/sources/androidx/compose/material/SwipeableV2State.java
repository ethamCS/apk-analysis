package androidx.compose.material;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
/* compiled from: SwipeableV2.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0001\u0018\u0000 f*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001fBB\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012#\b\u0002\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0002\u0010\rJ#\u0010S\u001a\u00020T2\u0006\u0010I\u001a\u00028\u00002\b\b\u0002\u0010U\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010VJe\u0010W\u001a\u00028\u00002\u0006\u00109\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00028\u000026\u0010X\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(>\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020\u00060=2\u0006\u0010U\u001a\u00020\u00062\u0006\u0010O\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010YJ\u000e\u0010Z\u001a\u00020\u00062\u0006\u0010[\u001a\u00020\u0006J\u0013\u0010\\\u001a\u00020\f2\u0006\u0010]\u001a\u00028\u0000¢\u0006\u0002\u0010^J\u0019\u0010_\u001a\u00020T2\u0006\u0010U\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010`J\u0019\u0010a\u001a\u00020T2\u0006\u0010I\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010bJ!\u0010c\u001a\u00020T2\u0012\u0010d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u000fH\u0000¢\u0006\u0002\beRC\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u000f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R,\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR+\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0016\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R+\u0010'\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u0016\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R+\u0010,\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0016\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001b\u00102\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b3\u0010.R\u001b\u00106\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b7\u0010.R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\u00060:¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u008b\u0001\u0010@\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(>\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020\u00060=26\u0010\u000e\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(>\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020\u00060=8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010\u0016\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001b\u0010F\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bH\u00105\u001a\u0004\bG\u0010.R\u001b\u0010I\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u00105\u001a\u0004\bJ\u0010\u001dR\u001b\u0010L\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u00105\u001a\u0004\bM\u0010.R+\u0010O\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010\u0016\u001a\u0004\bP\u0010.\"\u0004\bQ\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006g"}, d2 = {"Landroidx/compose/material/SwipeableV2State;", ExifInterface.GPS_DIRECTION_TRUE, "", "initialState", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "newValue", "", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "<set-?>", "", "anchors", "getAnchors$material_release", "()Ljava/util/Map;", "setAnchors$material_release", "(Ljava/util/Map;)V", "anchors$delegate", "Landroidx/compose/runtime/MutableState;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "getConfirmStateChange", "()Lkotlin/jvm/functions/Function1;", "currentState", "getCurrentState", "()Ljava/lang/Object;", "setCurrentState", "(Ljava/lang/Object;)V", "currentState$delegate", "dragPosition", "Landroidx/compose/runtime/MutableState;", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "isAnimationRunning", "()Z", "setAnimationRunning", "(Z)V", "isAnimationRunning$delegate", "lastVelocity", "getLastVelocity", "()F", "setLastVelocity", "(F)V", "lastVelocity$delegate", "maxBound", "getMaxBound", "maxBound$delegate", "Landroidx/compose/runtime/State;", "minBound", "getMinBound", "minBound$delegate", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", "Lkotlin/Function2;", "lower", "upper", "positionalThresholds", "getPositionalThresholds", "()Lkotlin/jvm/functions/Function2;", "setPositionalThresholds", "(Lkotlin/jvm/functions/Function2;)V", "positionalThresholds$delegate", "progress", "getProgress", "progress$delegate", "targetState", "getTargetState", "targetState$delegate", "unsafeOffset", "getUnsafeOffset", "unsafeOffset$delegate", "velocityThreshold", "getVelocityThreshold", "setVelocityThreshold", "velocityThreshold$delegate", "animateTo", "", "velocity", "(Ljava/lang/Object;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computeTarget", "thresholds", "(FLjava/lang/Object;Lkotlin/jvm/functions/Function2;FF)Ljava/lang/Object;", "dispatchRawDelta", "delta", "hasAnchorForState", "state", "(Ljava/lang/Object;)Z", "settle", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAnchors", "newAnchors", "updateAnchors$material_release", "Companion", "material_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class SwipeableV2State<T> {
    public static final Companion Companion = new Companion(null);
    private final MutableState anchors$delegate;
    private final AnimationSpec<Float> animationSpec;
    private final Function1<T, Boolean> confirmStateChange;
    private final MutableState currentState$delegate;
    private final MutableState<Float> dragPosition;
    private final DraggableState draggableState;
    private final MutableState isAnimationRunning$delegate;
    private final MutableState lastVelocity$delegate;
    private final State maxBound$delegate;
    private final State minBound$delegate;
    private final State<Float> offset;
    private final MutableState positionalThresholds$delegate;
    private final State progress$delegate;
    private final State targetState$delegate;
    private final State unsafeOffset$delegate;
    private final MutableState velocityThreshold$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableV2State(T t, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> confirmStateChange) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState<Float> mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        MutableState mutableStateOf$default6;
        MutableState mutableStateOf$default7;
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.animationSpec = animationSpec;
        this.confirmStateChange = confirmStateChange;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.currentState$delegate = mutableStateOf$default;
        this.targetState$delegate = SnapshotStateKt.derivedStateOf(new SwipeableV2State$targetState$2(this));
        this.offset = SnapshotStateKt.derivedStateOf(new SwipeableV2State$offset$1(this));
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isAnimationRunning$delegate = mutableStateOf$default2;
        this.progress$delegate = SnapshotStateKt.derivedStateOf(new SwipeableV2State$progress$2(this));
        Float valueOf = Float.valueOf(0.0f);
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.lastVelocity$delegate = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(Float.NaN), null, 2, null);
        this.dragPosition = mutableStateOf$default4;
        this.unsafeOffset$delegate = SnapshotStateKt.derivedStateOf(new SwipeableV2State$unsafeOffset$2(this));
        this.minBound$delegate = SnapshotStateKt.derivedStateOf(new SwipeableV2State$minBound$2(this));
        this.maxBound$delegate = SnapshotStateKt.derivedStateOf(new SwipeableV2State$maxBound$2(this));
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SwipeableV2State$positionalThresholds$2.INSTANCE, null, 2, null);
        this.positionalThresholds$delegate = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.velocityThreshold$delegate = mutableStateOf$default6;
        this.draggableState = DraggableKt.DraggableState(new SwipeableV2State$draggableState$1(this));
        mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
        this.anchors$delegate = mutableStateOf$default7;
    }

    /* compiled from: SwipeableV2.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: androidx.compose.material.SwipeableV2State$1 */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends Lambda implements Function1<T, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(T t) {
            return true;
        }
    }

    public /* synthetic */ SwipeableV2State(Object obj, SpringSpec<Float> springSpec, AnonymousClass1 anonymousClass1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : springSpec, (i & 4) != 0 ? AnonymousClass1.INSTANCE : anonymousClass1);
    }

    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final Function1<T, Boolean> getConfirmStateChange() {
        return this.confirmStateChange;
    }

    private final void setCurrentState(T t) {
        this.currentState$delegate.setValue(t);
    }

    public final T getCurrentState() {
        return this.currentState$delegate.getValue();
    }

    public final T getTargetState() {
        return (T) this.targetState$delegate.getValue();
    }

    public final State<Float> getOffset() {
        return this.offset;
    }

    public final void setAnimationRunning(boolean z) {
        this.isAnimationRunning$delegate.setValue(Boolean.valueOf(z));
    }

    public final boolean isAnimationRunning() {
        return ((Boolean) this.isAnimationRunning$delegate.getValue()).booleanValue();
    }

    public final float getProgress() {
        return ((Number) this.progress$delegate.getValue()).floatValue();
    }

    public final void setLastVelocity(float f) {
        this.lastVelocity$delegate.setValue(Float.valueOf(f));
    }

    public final float getLastVelocity() {
        return ((Number) this.lastVelocity$delegate.getValue()).floatValue();
    }

    public final float getUnsafeOffset() {
        return ((Number) this.unsafeOffset$delegate.getValue()).floatValue();
    }

    public final float getMinBound() {
        return ((Number) this.minBound$delegate.getValue()).floatValue();
    }

    public final float getMaxBound() {
        return ((Number) this.maxBound$delegate.getValue()).floatValue();
    }

    private final Function2<T, T, Float> getPositionalThresholds() {
        return (Function2) this.positionalThresholds$delegate.getValue();
    }

    private final void setPositionalThresholds(Function2<? super T, ? super T, Float> function2) {
        this.positionalThresholds$delegate.setValue(function2);
    }

    private final float getVelocityThreshold() {
        return ((Number) this.velocityThreshold$delegate.getValue()).floatValue();
    }

    private final void setVelocityThreshold(float f) {
        this.velocityThreshold$delegate.setValue(Float.valueOf(f));
    }

    public final DraggableState getDraggableState$material_release() {
        return this.draggableState;
    }

    public final Map<T, Float> getAnchors$material_release() {
        return (Map) this.anchors$delegate.getValue();
    }

    public final void setAnchors$material_release(Map<T, Float> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.anchors$delegate.setValue(map);
    }

    public final void updateAnchors$material_release(Map<T, Float> newAnchors) {
        float requireAnchor;
        Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
        boolean isEmpty = getAnchors$material_release().isEmpty();
        setAnchors$material_release(newAnchors);
        if (isEmpty) {
            MutableState<Float> mutableState = this.dragPosition;
            requireAnchor = SwipeableV2Kt.requireAnchor(getAnchors$material_release(), getCurrentState());
            mutableState.setValue(Float.valueOf(requireAnchor));
        }
    }

    public final boolean hasAnchorForState(T t) {
        return getAnchors$material_release().containsKey(t);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object snapTo(T r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.material.SwipeableV2State$snapTo$1
            if (r0 == 0) goto L14
            r0 = r9
            androidx.compose.material.SwipeableV2State$snapTo$1 r0 = (androidx.compose.material.SwipeableV2State$snapTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            androidx.compose.material.SwipeableV2State$snapTo$1 r0 = new androidx.compose.material.SwipeableV2State$snapTo$1
            r0.<init>(r7, r9)
        L19:
            r4 = r0
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r8 = r4.L$1
            java.lang.Object r0 = r4.L$0
            androidx.compose.material.SwipeableV2State r0 = (androidx.compose.material.SwipeableV2State) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L61
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.ResultKt.throwOnFailure(r9)
            java.util.Map r9 = r7.getAnchors$material_release()
            float r9 = androidx.compose.material.SwipeableV2Kt.access$requireAnchor(r9, r8)
            androidx.compose.foundation.gestures.DraggableState r1 = r7.draggableState
            r3 = 0
            androidx.compose.material.SwipeableV2State$snapTo$2 r5 = new androidx.compose.material.SwipeableV2State$snapTo$2
            r6 = 0
            r5.<init>(r9, r7, r6)
            r9 = r5
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r5 = 1
            r4.L$0 = r7
            r4.L$1 = r8
            r4.label = r2
            r2 = r3
            r3 = r9
            java.lang.Object r9 = androidx.compose.foundation.gestures.DraggableState.CC.drag$default(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L60
            return r0
        L60:
            r0 = r7
        L61:
            r0.setCurrentState(r8)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableV2State.snapTo(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateTo(T r12, float r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableV2State.animateTo(java.lang.Object, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object animateTo$default(SwipeableV2State swipeableV2State, Object obj, float f, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            f = swipeableV2State.getLastVelocity();
        }
        return swipeableV2State.animateTo(obj, f, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object settle(float f, Continuation<? super Unit> continuation) {
        Object currentState = getCurrentState();
        T computeTarget = computeTarget(this.offset.getValue().floatValue(), currentState, getPositionalThresholds(), f, getVelocityThreshold());
        if (this.confirmStateChange.invoke(computeTarget).booleanValue()) {
            Object animateTo = animateTo(computeTarget, f, continuation);
            return animateTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo : Unit.INSTANCE;
        }
        Object animateTo2 = animateTo(currentState, f, continuation);
        return animateTo2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo2 : Unit.INSTANCE;
    }

    public final float dispatchRawDelta(float f) {
        float coerceIn = RangesKt.coerceIn(this.dragPosition.getValue().floatValue() + f, getMinBound(), getMaxBound()) - this.dragPosition.getValue().floatValue();
        if (Math.abs(coerceIn) > 0.0f) {
            this.draggableState.dispatchRawDelta(coerceIn);
        }
        return coerceIn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final T computeTarget(float f, T t, Function2<? super T, ? super T, Float> function2, float f2, float f3) {
        float requireAnchor;
        T t2;
        Object closestState;
        Object closestState2;
        Object closestState3;
        Object closestState4;
        Map<T, Float> anchors$material_release = getAnchors$material_release();
        requireAnchor = SwipeableV2Kt.requireAnchor(anchors$material_release, t);
        if (requireAnchor <= f) {
            if (f2 >= f3) {
                closestState4 = SwipeableV2Kt.closestState(anchors$material_release, f, true);
                return (T) closestState4;
            }
            closestState3 = SwipeableV2Kt.closestState(anchors$material_release, f, true);
            Object obj = (Object) closestState3;
            int i = (f > function2.invoke(t, obj).floatValue() ? 1 : (f == function2.invoke(t, obj).floatValue() ? 0 : -1));
            t2 = obj;
            if (i < 0) {
                return t;
            }
        } else if (f2 <= (-f3)) {
            closestState2 = SwipeableV2Kt.closestState(anchors$material_release, f, false);
            return (T) closestState2;
        } else {
            closestState = SwipeableV2Kt.closestState(anchors$material_release, f, false);
            Object obj2 = (Object) closestState;
            int i2 = (f > function2.invoke(t, obj2).floatValue() ? 1 : (f == function2.invoke(t, obj2).floatValue() ? 0 : -1));
            t2 = obj2;
            if (i2 > 0) {
                return t;
            }
        }
        return t2;
    }

    /* compiled from: SwipeableV2.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/material/SwipeableV2State$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/SwipeableV2State;", ExifInterface.GPS_DIRECTION_TRUE, "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "material_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> Saver<SwipeableV2State<T>, T> Saver(AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(SwipeableV2State$Companion$Saver$1.INSTANCE, new SwipeableV2State$Companion$Saver$2(animationSpec, confirmStateChange));
        }
    }
}
