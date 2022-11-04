package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BackdropScaffold.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0011\u0010\u0016\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/material/BackdropScaffoldState;", "Landroidx/compose/material/SwipeableState;", "Landroidx/compose/material/BackdropValue;", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "snackbarHostState", "Landroidx/compose/material/SnackbarHostState;", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;)V", "isConcealed", "()Z", "isRevealed", "nestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection$material_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getSnackbarHostState", "()Landroidx/compose/material/SnackbarHostState;", "conceal", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reveal", "Companion", "material_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class BackdropScaffoldState extends SwipeableState<BackdropValue> {
    public static final Companion Companion = new Companion(null);
    private final NestedScrollConnection nestedScrollConnection;
    private final SnackbarHostState snackbarHostState;

    /* compiled from: BackdropScaffold.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/BackdropValue;", "invoke", "(Landroidx/compose/material/BackdropValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: androidx.compose.material.BackdropScaffoldState$1 */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends Lambda implements Function1<BackdropValue, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        public final Boolean invoke(BackdropValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return true;
        }
    }

    public /* synthetic */ BackdropScaffoldState(BackdropValue backdropValue, SpringSpec<Float> springSpec, AnonymousClass1 anonymousClass1, SnackbarHostState snackbarHostState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(backdropValue, (i & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : springSpec, (i & 4) != 0 ? AnonymousClass1.INSTANCE : anonymousClass1, (i & 8) != 0 ? new SnackbarHostState() : snackbarHostState);
    }

    public final SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldState(BackdropValue initialValue, AnimationSpec<Float> animationSpec, Function1<? super BackdropValue, Boolean> confirmStateChange, SnackbarHostState snackbarHostState) {
        super(initialValue, animationSpec, confirmStateChange);
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
        this.snackbarHostState = snackbarHostState;
        this.nestedScrollConnection = SwipeableKt.getPreUpPostDownNestedScrollConnection(this);
    }

    public final boolean isRevealed() {
        return getCurrentValue() == BackdropValue.Revealed;
    }

    public final boolean isConcealed() {
        return getCurrentValue() == BackdropValue.Concealed;
    }

    public final Object reveal(Continuation<? super Unit> continuation) {
        Object animateTo$default = SwipeableState.animateTo$default(this, BackdropValue.Revealed, null, continuation, 2, null);
        return animateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : Unit.INSTANCE;
    }

    public final Object conceal(Continuation<? super Unit> continuation) {
        Object animateTo$default = SwipeableState.animateTo$default(this, BackdropValue.Concealed, null, continuation, 2, null);
        return animateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : Unit.INSTANCE;
    }

    public final NestedScrollConnection getNestedScrollConnection$material_release() {
        return this.nestedScrollConnection;
    }

    /* compiled from: BackdropScaffold.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/material/BackdropScaffoldState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/BackdropScaffoldState;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "Landroidx/compose/material/BackdropValue;", "", "snackbarHostState", "Landroidx/compose/material/SnackbarHostState;", "material_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<BackdropScaffoldState, ?> Saver(AnimationSpec<Float> animationSpec, Function1<? super BackdropValue, Boolean> confirmStateChange, SnackbarHostState snackbarHostState) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
            return SaverKt.Saver(BackdropScaffoldState$Companion$Saver$1.INSTANCE, new BackdropScaffoldState$Companion$Saver$2(animationSpec, confirmStateChange, snackbarHostState));
        }
    }
}
