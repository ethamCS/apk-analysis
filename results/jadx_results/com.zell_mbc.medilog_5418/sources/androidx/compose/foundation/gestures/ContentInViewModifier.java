package androidx.compose.foundation.gestures;

import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.foundation.relocation.BringIntoViewResponderKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;
/* compiled from: ContentInViewModifier.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ!\u0010\"\u001a\u00020#2\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120%H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0012H\u0016J%\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020!H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001d\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020!H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101J%\u00102\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104J!\u00105\u001a\u00020#2\u0006\u00106\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0002\u00108J \u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:2\u0006\u0010=\u001a\u00020:H\u0002R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R/\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewModifier;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/layout/OnRemeasuredModifier;", "Landroidx/compose/ui/layout/OnPlacedModifier;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "reverseDirection", "", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollableState;Z)V", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "focusAnimationJob", "Lkotlinx/coroutines/Job;", "<set-?>", "Landroidx/compose/ui/geometry/Rect;", "focusTargetBounds", "getFocusTargetBounds", "()Landroidx/compose/ui/geometry/Rect;", "setFocusTargetBounds", "(Landroidx/compose/ui/geometry/Rect;)V", "focusTargetBounds$delegate", "Landroidx/compose/runtime/MutableState;", "focusedChild", "focusedChildBeingAnimated", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "oldSize", "Landroidx/compose/ui/unit/IntSize;", "bringChildIntoView", "", "localRect", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateRectForParent", "computeDestination", "childBounds", "containerSize", "computeDestination-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/Rect;", "onPlaced", "onRemeasured", "size", "onRemeasured-ozmzZPI", "(J)V", "onSizeChanged", "onSizeChanged-O0kMr_c", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)V", "performBringIntoView", "source", "destination", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "relocationDistance", "", "leadingEdge", "trailingEdge", "parentSize", "foundation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ContentInViewModifier implements BringIntoViewResponder, OnRemeasuredModifier, OnPlacedModifier {
    private LayoutCoordinates coordinates;
    private Job focusAnimationJob;
    private final MutableState focusTargetBounds$delegate;
    private LayoutCoordinates focusedChild;
    private LayoutCoordinates focusedChildBeingAnimated;
    private final Modifier modifier = BringIntoViewResponderKt.bringIntoViewResponder(FocusedBoundsKt.onFocusedBoundsChanged(this, new ContentInViewModifier$modifier$1(this)), this);
    private IntSize oldSize;
    private final Orientation orientation;
    private final boolean reverseDirection;
    private final CoroutineScope scope;
    private final ScrollableState scrollableState;

    /* compiled from: ContentInViewModifier.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            iArr[Orientation.Vertical.ordinal()] = 1;
            iArr[Orientation.Horizontal.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return Modifier.Element.CC.$default$all(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return Modifier.Element.CC.$default$any(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return Modifier.Element.CC.$default$foldIn(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return Modifier.Element.CC.$default$foldOut(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return Modifier.CC.$default$then(this, modifier);
    }

    public ContentInViewModifier(CoroutineScope scope, Orientation orientation, ScrollableState scrollableState, boolean z) {
        MutableState mutableStateOf$default;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(scrollableState, "scrollableState");
        this.scope = scope;
        this.orientation = orientation;
        this.scrollableState = scrollableState;
        this.reverseDirection = z;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.focusTargetBounds$delegate = mutableStateOf$default;
    }

    private final Rect getFocusTargetBounds() {
        return (Rect) this.focusTargetBounds$delegate.getValue();
    }

    public final void setFocusTargetBounds(Rect rect) {
        this.focusTargetBounds$delegate.setValue(rect);
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.layout.OnRemeasuredModifier
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo255onRemeasuredozmzZPI(long j) {
        LayoutCoordinates layoutCoordinates = this.coordinates;
        IntSize intSize = this.oldSize;
        if (intSize != null && !IntSize.m4264equalsimpl0(intSize.m4270unboximpl(), j)) {
            boolean z = true;
            if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
                z = false;
            }
            if (z) {
                m254onSizeChangedO0kMr_c(layoutCoordinates, intSize.m4270unboximpl());
            }
        }
        this.oldSize = IntSize.m4258boximpl(j);
    }

    @Override // androidx.compose.ui.layout.OnPlacedModifier
    public void onPlaced(LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.coordinates = coordinates;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Rect calculateRectForParent(Rect localRect) {
        Intrinsics.checkNotNullParameter(localRect, "localRect");
        IntSize intSize = this.oldSize;
        if (intSize == null) {
            throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
        }
        return m253computeDestinationO0kMr_c(localRect, intSize.m4270unboximpl());
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Object bringChildIntoView(Function0<Rect> function0, Continuation<? super Unit> continuation) {
        Object performBringIntoView;
        Rect invoke = function0.invoke();
        return (invoke != null && (performBringIntoView = performBringIntoView(invoke, calculateRectForParent(invoke), continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? performBringIntoView : Unit.INSTANCE;
    }

    /* renamed from: onSizeChanged-O0kMr_c */
    private final void m254onSizeChangedO0kMr_c(LayoutCoordinates layoutCoordinates, long j) {
        LayoutCoordinates layoutCoordinates2;
        Rect rect;
        boolean z = true;
        if (this.orientation != Orientation.Horizontal ? IntSize.m4265getHeightimpl(layoutCoordinates.mo3210getSizeYbymL2g()) >= IntSize.m4265getHeightimpl(j) : IntSize.m4266getWidthimpl(layoutCoordinates.mo3210getSizeYbymL2g()) >= IntSize.m4266getWidthimpl(j)) {
            z = false;
        }
        if (z && (layoutCoordinates2 = this.focusedChild) != null) {
            Rect localBoundingBoxOf = layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, false);
            if (layoutCoordinates2 == this.focusedChildBeingAnimated) {
                rect = getFocusTargetBounds();
                if (rect == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } else {
                rect = localBoundingBoxOf;
            }
            if (!RectKt.m1499Recttz77jQw(Offset.Companion.m1475getZeroF1C5BW0(), IntSizeKt.m4276toSizeozmzZPI(j)).overlaps(rect)) {
                return;
            }
            Rect m253computeDestinationO0kMr_c = m253computeDestinationO0kMr_c(rect, layoutCoordinates.mo3210getSizeYbymL2g());
            if (Intrinsics.areEqual(m253computeDestinationO0kMr_c, rect)) {
                return;
            }
            this.focusedChildBeingAnimated = layoutCoordinates2;
            setFocusTargetBounds(m253computeDestinationO0kMr_c);
            BuildersKt__Builders_commonKt.launch$default(this.scope, NonCancellable.INSTANCE, null, new ContentInViewModifier$onSizeChanged$1(this, localBoundingBoxOf, m253computeDestinationO0kMr_c, null), 2, null);
        }
    }

    /* renamed from: computeDestination-O0kMr_c */
    private final Rect m253computeDestinationO0kMr_c(Rect rect, long j) {
        long m4276toSizeozmzZPI = IntSizeKt.m4276toSizeozmzZPI(j);
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return rect.translate(-relocationDistance(rect.getLeft(), rect.getRight(), Size.m1528getWidthimpl(m4276toSizeozmzZPI)), 0.0f);
        }
        return rect.translate(0.0f, -relocationDistance(rect.getTop(), rect.getBottom(), Size.m1525getHeightimpl(m4276toSizeozmzZPI)));
    }

    public final Object performBringIntoView(Rect rect, Rect rect2, Continuation<? super Unit> continuation) {
        float f;
        float f2;
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            f = rect2.getTop();
            f2 = rect.getTop();
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            f = rect2.getLeft();
            f2 = rect.getLeft();
        }
        float f3 = f - f2;
        if (this.reverseDirection) {
            f3 = -f3;
        }
        Object animateScrollBy$default = ScrollExtensionsKt.animateScrollBy$default(this.scrollableState, f3, null, continuation, 2, null);
        return animateScrollBy$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateScrollBy$default : Unit.INSTANCE;
    }

    private final float relocationDistance(float f, float f2, float f3) {
        if ((f < 0.0f || f2 > f3) && (f >= 0.0f || f2 <= f3)) {
            float f4 = f2 - f3;
            return Math.abs(f) < Math.abs(f4) ? f : f4;
        }
        return 0.0f;
    }
}
