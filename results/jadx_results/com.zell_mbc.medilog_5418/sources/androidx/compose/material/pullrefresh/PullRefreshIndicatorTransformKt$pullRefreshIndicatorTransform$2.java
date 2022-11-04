package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
/* compiled from: PullRefreshIndicatorTransform.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $scale;
    final /* synthetic */ PullRefreshState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2(PullRefreshState pullRefreshState, boolean z) {
        super(3);
        this.$state = pullRefreshState;
        this.$scale = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    /* renamed from: invoke$lambda-1 */
    public static final int m1301invoke$lambda1(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* renamed from: invoke$lambda-2 */
    public static final void m1302invoke$lambda2(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(1223983161);
        ComposerKt.sourceInformation(composer, "C49@1983L30,52@2051L22:PullRefreshIndicatorTransform.kt#t44y28");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1223983161, i, -1, "androidx.compose.material.pullrefresh.pullRefreshIndicatorTransform.<anonymous> (PullRefreshIndicatorTransform.kt:48)");
        }
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        Modifier.Companion companion = Modifier.Companion;
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(mutableState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = (Function1) new PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1$1(mutableState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(OnRemeasuredModifierKt.onSizeChanged(companion, (Function1) rememberedValue2), new AnonymousClass2(this.$state, this.$scale, mutableState));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return graphicsLayer;
    }

    /* compiled from: PullRefreshIndicatorTransform.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$2 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
        final /* synthetic */ MutableState<Integer> $height$delegate;
        final /* synthetic */ boolean $scale;
        final /* synthetic */ PullRefreshState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PullRefreshState pullRefreshState, boolean z, MutableState<Integer> mutableState) {
            super(1);
            this.$state = pullRefreshState;
            this.$scale = z;
            this.$height$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
            invoke2(graphicsLayerScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setTranslationY(this.$state.getPosition$material_release() - PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2.m1301invoke$lambda1(this.$height$delegate));
            if (!this.$scale || this.$state.getRefreshing$material_release()) {
                return;
            }
            float coerceIn = RangesKt.coerceIn(EasingKt.getLinearOutSlowInEasing().transform(this.$state.getPosition$material_release() / this.$state.getThreshold$material_release()), 0.0f, 1.0f);
            graphicsLayer.setScaleX(coerceIn);
            graphicsLayer.setScaleY(coerceIn);
        }
    }
}
