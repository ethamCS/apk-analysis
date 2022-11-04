package androidx.compose.ui.graphics;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: InspectableValue.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.GraphicsLayerModifierKt$graphicsLayer-pANQ8Wg$$inlined$debugInspectorInfo$1 */
/* loaded from: classes.dex */
public final class GraphicsLayerModifierKt$graphicsLayerpANQ8Wg$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ float $alpha$inlined;
    final /* synthetic */ long $ambientShadowColor$inlined;
    final /* synthetic */ float $cameraDistance$inlined;
    final /* synthetic */ boolean $clip$inlined;
    final /* synthetic */ RenderEffect $renderEffect$inlined;
    final /* synthetic */ float $rotationX$inlined;
    final /* synthetic */ float $rotationY$inlined;
    final /* synthetic */ float $rotationZ$inlined;
    final /* synthetic */ float $scaleX$inlined;
    final /* synthetic */ float $scaleY$inlined;
    final /* synthetic */ float $shadowElevation$inlined;
    final /* synthetic */ Shape $shape$inlined;
    final /* synthetic */ long $spotShadowColor$inlined;
    final /* synthetic */ long $transformOrigin$inlined;
    final /* synthetic */ float $translationX$inlined;
    final /* synthetic */ float $translationY$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphicsLayerModifierKt$graphicsLayerpANQ8Wg$$inlined$debugInspectorInfo$1(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3) {
        super(1);
        this.$scaleX$inlined = f;
        this.$scaleY$inlined = f2;
        this.$alpha$inlined = f3;
        this.$translationX$inlined = f4;
        this.$translationY$inlined = f5;
        this.$shadowElevation$inlined = f6;
        this.$rotationX$inlined = f7;
        this.$rotationY$inlined = f8;
        this.$rotationZ$inlined = f9;
        this.$cameraDistance$inlined = f10;
        this.$transformOrigin$inlined = j;
        this.$shape$inlined = shape;
        this.$clip$inlined = z;
        this.$renderEffect$inlined = renderEffect;
        this.$ambientShadowColor$inlined = j2;
        this.$spotShadowColor$inlined = j3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("scaleX", Float.valueOf(this.$scaleX$inlined));
        inspectorInfo.getProperties().set("scaleY", Float.valueOf(this.$scaleY$inlined));
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.$alpha$inlined));
        inspectorInfo.getProperties().set("translationX", Float.valueOf(this.$translationX$inlined));
        inspectorInfo.getProperties().set("translationY", Float.valueOf(this.$translationY$inlined));
        inspectorInfo.getProperties().set("shadowElevation", Float.valueOf(this.$shadowElevation$inlined));
        inspectorInfo.getProperties().set("rotationX", Float.valueOf(this.$rotationX$inlined));
        inspectorInfo.getProperties().set("rotationY", Float.valueOf(this.$rotationY$inlined));
        inspectorInfo.getProperties().set("rotationZ", Float.valueOf(this.$rotationZ$inlined));
        inspectorInfo.getProperties().set("cameraDistance", Float.valueOf(this.$cameraDistance$inlined));
        inspectorInfo.getProperties().set("transformOrigin", TransformOrigin.m2029boximpl(this.$transformOrigin$inlined));
        inspectorInfo.getProperties().set("shape", this.$shape$inlined);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.$clip$inlined));
        inspectorInfo.getProperties().set("renderEffect", this.$renderEffect$inlined);
        inspectorInfo.getProperties().set("ambientShadowColor", Color.m1686boximpl(this.$ambientShadowColor$inlined));
        inspectorInfo.getProperties().set("spotShadowColor", Color.m1686boximpl(this.$spotShadowColor$inlined));
    }
}
