package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J@\u0010\u0016\u001a\u0002H\u0017\"\u0004\b\u0000\u0010\u00172'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0019¢\u0006\u0002\b\u001dH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001eR\u001d\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u0010X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "extendedTouchPadding", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "()J", "<anonymous parameter 0>", "", "interceptOutOfBoundsChildEvents", "getInterceptOutOfBoundsChildEvents$annotations", "()V", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "awaitPointerEventScope", "R", "block", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public interface PointerInputScope extends Density {
    <R> Object awaitPointerEventScope(Function2<? super AwaitPointerEventScope, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation);

    /* renamed from: getExtendedTouchPadding-NH-jbRc */
    long mo3099getExtendedTouchPaddingNHjbRc();

    boolean getInterceptOutOfBoundsChildEvents();

    /* renamed from: getSize-YbymL2g */
    long m3100getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();

    void setInterceptOutOfBoundsChildEvents(boolean z);

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getInterceptOutOfBoundsChildEvents$annotations() {
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o */
        public static int m3116roundToPxR2X_6o(PointerInputScope pointerInputScope, long j) {
            return Density.CC.m4068$default$roundToPxR2X_6o(pointerInputScope, j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4 */
        public static int m3117roundToPx0680j_4(PointerInputScope pointerInputScope, float f) {
            return Density.CC.m4069$default$roundToPx0680j_4(pointerInputScope, f);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA */
        public static float m3118toDpGaN1DYA(PointerInputScope pointerInputScope, long j) {
            return Density.CC.m4070$default$toDpGaN1DYA(pointerInputScope, j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM */
        public static float m3119toDpu2uoSUM(PointerInputScope pointerInputScope, float f) {
            return Density.CC.m4071$default$toDpu2uoSUM(pointerInputScope, f);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM */
        public static float m3120toDpu2uoSUM(PointerInputScope pointerInputScope, int i) {
            return Density.CC.m4072$default$toDpu2uoSUM((Density) pointerInputScope, i);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM */
        public static long m3121toDpSizekrfVVM(PointerInputScope pointerInputScope, long j) {
            return Density.CC.m4073$default$toDpSizekrfVVM(pointerInputScope, j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o */
        public static float m3122toPxR2X_6o(PointerInputScope pointerInputScope, long j) {
            return Density.CC.m4074$default$toPxR2X_6o(pointerInputScope, j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4 */
        public static float m3123toPx0680j_4(PointerInputScope pointerInputScope, float f) {
            return Density.CC.m4075$default$toPx0680j_4(pointerInputScope, f);
        }

        @Deprecated
        public static Rect toRect(PointerInputScope pointerInputScope, DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return Density.CC.$default$toRect(pointerInputScope, receiver);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ */
        public static long m3124toSizeXkaWNTQ(PointerInputScope pointerInputScope, long j) {
            return Density.CC.m4076$default$toSizeXkaWNTQ(pointerInputScope, j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do */
        public static long m3125toSp0xMU5do(PointerInputScope pointerInputScope, float f) {
            return Density.CC.m4077$default$toSp0xMU5do(pointerInputScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4 */
        public static long m3126toSpkPz2Gy4(PointerInputScope pointerInputScope, float f) {
            return Density.CC.m4078$default$toSpkPz2Gy4(pointerInputScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4 */
        public static long m3127toSpkPz2Gy4(PointerInputScope pointerInputScope, int i) {
            return Density.CC.m4079$default$toSpkPz2Gy4((Density) pointerInputScope, i);
        }

        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc */
        public static long m3115getExtendedTouchPaddingNHjbRc(PointerInputScope pointerInputScope) {
            return CC.m3101$default$getExtendedTouchPaddingNHjbRc(pointerInputScope);
        }

        @Deprecated
        public static boolean getInterceptOutOfBoundsChildEvents(PointerInputScope pointerInputScope) {
            return CC.$default$getInterceptOutOfBoundsChildEvents(pointerInputScope);
        }

        @Deprecated
        public static void setInterceptOutOfBoundsChildEvents(PointerInputScope pointerInputScope, boolean z) {
            CC.$default$setInterceptOutOfBoundsChildEvents(pointerInputScope, z);
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    /* renamed from: androidx.compose.ui.input.pointer.PointerInputScope$-CC */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static boolean $default$getInterceptOutOfBoundsChildEvents(PointerInputScope _this) {
            return false;
        }

        public static void $default$setInterceptOutOfBoundsChildEvents(PointerInputScope _this, boolean z) {
        }

        /* renamed from: $default$getExtendedTouchPadding-NH-jbRc */
        public static long m3101$default$getExtendedTouchPaddingNHjbRc(PointerInputScope _this) {
            return Size.Companion.m1537getZeroNHjbRc();
        }
    }
}
